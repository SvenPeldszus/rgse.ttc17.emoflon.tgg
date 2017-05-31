package rgse.ttc17.emoflon.tgg.task1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.junit.Test;
import org.moflon.tgg.algorithm.configuration.Configurator;
import org.moflon.tgg.algorithm.configuration.RuleResult;
import org.moflon.tgg.language.algorithm.TempOutputContainer;
import org.osgi.framework.Bundle;

import gluemodel.GluemodelFactory;
import gluemodel.Root;
import gluemodel.CIM.CIMRoot;
import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.COSEM.COSEMRoot;
import outageDetectionJointarget.PositionPoint;
import rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer;
import rgse.ttc17.emoflon.tgg.task1.Rules.Location;
import rgse.ttc17.emoflon.tgg.task1.org.moflon.tie.Task1Trafo;

public class GlueModelCreator {
	
	@Test
	public void test() {
		String cimString = "CIM_DCIM.xmi";
		String cosemString = "COSEM.xmi";
		
		Task1Trafo tgg = new Task1Trafo();
		tgg.setConfigurator(new Configurator(){
			
			@Override
			public RuleResult chooseOne(Collection<RuleResult> alternatives) {
				System.err.println("chooseOne");
				for(RuleResult rule : alternatives){
					if(rule.isRule(EnergyConsumer.class.getSimpleName())){
						return rule;
					}
				}
				for(RuleResult rule : alternatives){
					if(rule.isRule(Location.class.getSimpleName())){
						return rule;
					}
				}
				return alternatives.stream().findAny().get();
			}
		});
				
		ResourceSet rs = tgg.getResourceSet();
		
		Bundle plugin = Platform.getBundle("rgse.ttc17.emoflon.tgg.task1");
		
		Resource cimResource = rs.createResource(URI.createURI(cimString));
		try {
			URL cimUrl = plugin.getEntry("instances/"+ cimString);
			cimResource.load(cimUrl.openConnection().getInputStream(), Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		CIMRoot cim = (CIMRoot) cimResource.getContents().get(0);
		
		Resource cosemResource = rs.createResource(URI.createURI(cosemString));
		try {
			URL cosemUrl = plugin.getEntry("instances/"
					+ cosemString);
			cosemResource.load(cosemUrl.openConnection().getInputStream(), Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		COSEMRoot cosem = (COSEMRoot) cosemResource.getContents().get(0);
		
		Resource fwdResource = rs.createResource(URI.createURI("fwd.src.xmi"));
//		fwdResource.getContents().addAll(cimResource.getContents());
//		cimResource.unload();
//		fwdResource.getContents().addAll(cosemResource.getContents());
//		cosemResource.unload();
		
		Root root = GluemodelFactory.eINSTANCE.createRoot();
		root.setCim(cim);
		root.setCosem(cosem);
		root.getAssets().addAll(getAllMeterAssets(cimResource));
		
		fwdResource.getContents().add(root);
		
		File folder = new File("instances");
		folder.mkdirs();
		File file = new File(folder, "fwd.src.xmi");
		try {
			file.createNewFile();
			fwdResource.save(new java.io.FileOutputStream(file), Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		tgg.setSrc(root);
		tgg.performForward();
		
		EObject trg = tgg.getTrg();
		
		Set<EObject> keep = new HashSet<EObject>();
		if (trg instanceof TempOutputContainer) {
			TempOutputContainer container = (TempOutputContainer) trg;
			for(EObject eObject : container.getPotentialRoots()){
				if (eObject instanceof outageDetectionJointarget.EnergyConsumer) {
					outageDetectionJointarget.EnergyConsumer consumer = (outageDetectionJointarget.EnergyConsumer) eObject;
					if(consumer.getID() == null || !"#DeleteMe".contentEquals(consumer.getID())){
						keep.add(consumer);
						outageDetectionJointarget.Location location = consumer.getLocation();
						if(location != null){
							keep.add(location);
							PositionPoint position = location.getPosition();
							if(position != null){
								keep.add(position);
							}
						}
					}
				}
			}
			
		}
		
		Resource targetResource = new ResourceSetImpl().createResource(URI.createURI("instances/target.xmi"));
		targetResource.getContents().addAll(keep);
		
		try {
			targetResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		assertTrue(targetResource.getContents().size()==51);
	}

	private HashSet<MeterAsset> getAllMeterAssets(Resource resource) {
		HashSet<MeterAsset> assets = new HashSet<MeterAsset>();
		TreeIterator<EObject> iterator = resource.getAllContents();
		while(iterator.hasNext()){
			EObject eOb = iterator.next();
			if (eOb instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) eOb;
				assets.add(asset);
			}
		}
		return assets;
	}
	
	private static void deleteAll(Collection<EObject> eObjects, Resource resource) {
		Map<EObject, Collection<Setting>> usages = UsageCrossReferencer.findAll(eObjects, resource);
		for (Entry<EObject, Collection<Setting>> entry : usages.entrySet()) {
			EObject eObject = entry.getKey();
			for (EStructuralFeature.Setting setting : entry.getValue()) {
				if (setting.getEStructuralFeature().isChangeable()) {
					EcoreUtil.remove(setting, eObject);
				}
			}
			EcoreUtil.remove(eObject);
		}
	}
}
