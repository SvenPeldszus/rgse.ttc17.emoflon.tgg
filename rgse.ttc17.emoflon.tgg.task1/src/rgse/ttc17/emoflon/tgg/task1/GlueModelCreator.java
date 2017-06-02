package rgse.ttc17.emoflon.tgg.task1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
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
import gluemodel.MeterAssetPhysicalDevicePair;
import gluemodel.Root;
import gluemodel.CIM.CIMRoot;
import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.COSEM.COSEMRoot;
import gluemodel.COSEM.PhysicalDevice;
import outageDetectionJointarget.PositionPoint;
import rgse.ttc17.emoflon.tgg.task1.Rules.EnergyConsumer;
import rgse.ttc17.emoflon.tgg.task1.Rules.Location;
import rgse.ttc17.emoflon.tgg.task1.org.moflon.tie.Task1Trafo;

public class GlueModelCreator {
	
	@Test
	public void test() {
		String cimString = "CIM_DCIM-out000.xmi";
		String cosemString = "COSEM-out000.xmi";
		
		Task1Trafo tgg = new Task1Trafo();				
		ResourceSet rs = tgg.getResourceSet();
		
		Bundle plugin = Platform.getBundle("rgse.ttc17.metamodels.src");
		
		Resource cimResource = rs.createResource(URI.createURI(cimString));
		try {
			URL cimUrl = plugin.getEntry("changes/changeSequence1"+ cimString);
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
		
		Root root = GluemodelFactory.eINSTANCE.createRoot();
		root.setCim(cim);
		root.setCosem(cosem);
		root.getAssets().addAll(getAllMeterAssets(cimResource));
		createMeterAssetsAndPhysicalDevicesPairs(root);
		
		fwdResource.getContents().add(root);
		
		tgg.setSrc(root);
		tgg.integrateForward();
		
		EObject trg = tgg.getTrg();
		
		Set<EObject> keep = new HashSet<EObject>();
		if (trg instanceof TempOutputContainer) {
			TempOutputContainer container = (TempOutputContainer) trg;
			keep.addAll(container.getPotentialRoots());
		}
		
		Resource targetResource = new ResourceSetImpl().createResource(URI.createURI("instances/target.xmi"));
		targetResource.getContents().addAll(keep);
		
		try {
			targetResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		assertEquals(51, targetResource.getContents().size());
	}

	private void createMeterAssetsAndPhysicalDevicesPairs(Root root) {
		Map<String,MeterAsset> name2asset = new HashMap<String, MeterAsset>();
		for (MeterAsset asset : root.getAssets()) {
			name2asset.put(asset.getMRID(), asset);
		}
		for (PhysicalDevice device : root.getCosem().getPhysicalDevice()) {
			MeterAsset asset = name2asset.get(device.getID());
			if (asset != null)  {
				MeterAssetPhysicalDevicePair pair = GluemodelFactory.eINSTANCE.createMeterAssetPhysicalDevicePair();
				pair.setA(asset);
				pair.setB(device);
				pair.setName(device.getID());
				root.getMeterAssetToPhysicalDevice().add(pair);
			}
		}
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
