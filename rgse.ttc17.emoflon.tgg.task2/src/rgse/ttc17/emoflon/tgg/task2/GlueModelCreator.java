package rgse.ttc17.emoflon.tgg.task2;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
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
import org.moflon.tgg.algorithm.configuration.PGSavingConfigurator;
import org.moflon.tgg.algorithm.configuration.RuleResult;
import org.moflon.tgg.language.algorithm.TempOutputContainer;
import org.osgi.framework.Bundle;

import gluemodel.GluemodelFactory;
import gluemodel.MeterAssetMMXUPair;
import gluemodel.MeterAssetPhysicalDevicePair;
import gluemodel.Root;
import gluemodel.CIM.CIMRoot;
import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.COSEM.COSEMRoot;
import gluemodel.COSEM.PhysicalDevice;
import gluemodel.substationStandard.Substandard;
import gluemodel.substationStandard.Dataclasses.AnalogueValue;
import gluemodel.substationStandard.Dataclasses.CMV;
import gluemodel.substationStandard.Dataclasses.Vector;
import gluemodel.substationStandard.Dataclasses.WYE;
import gluemodel.substationStandard.LNNodes.LNGroupM.MMXU;
import rgse.ttc17.emoflon.tgg.task2.org.moflon.tie.Task2Sync;
import rgse.ttc17.emoflon.tgg.task2.org.moflon.tie.Task2Trafo;

public class GlueModelCreator {

	@Test
	public void test() {
		String cimString = "CIM_DCIM-out068.xmi";
		String substandardString = "Substandard-out068.xmi";
		String cosemString = "COSEM-out068.xmi";

		Task2Sync tgg = new Task2Sync();
		ResourceSet rs = tgg.getResourceSet();

		Bundle plugin = Platform.getBundle("rgse.ttc17.emoflon.tgg.task2");

		Resource cimResource = rs.createResource(URI.createURI(cimString));
		try {
			URL cimUrl = plugin.getEntry("instances/" + cimString);
			cimResource.load(cimUrl.openConnection().getInputStream(), Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		CIMRoot cim = (CIMRoot) cimResource.getContents().get(0);

		Resource substandardResource = rs.createResource(URI.createURI(substandardString));
		try {
			URL cosemUrl = plugin.getEntry("instances/" + substandardString);
			substandardResource.load(cosemUrl.openConnection().getInputStream(), Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Substandard substandard = (Substandard) substandardResource.getContents().get(0);

		Resource cosemResource = rs.createResource(URI.createURI(cosemString));
		try {
			URL cosemUrl = plugin.getEntry("instances/" + cosemString);
			cosemResource.load(cosemUrl.openConnection().getInputStream(), Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		COSEMRoot cosem = (COSEMRoot) cosemResource.getContents().get(0);

		Resource fwdResource = rs.createResource(URI.createURI("fwd.src.xmi"));

		Root root = GluemodelFactory.eINSTANCE.createRoot();
		root.setCim(cim);
		root.setSubstandard(substandard);
		root.setCosem(cosem);

		Hashtable<String, MeterAsset> allMeterAssets = getAllMeterAssets(cimResource);
		root.getAssets().addAll(allMeterAssets.values());

		HashSet<MMXU> mmxus = new HashSet<>();
		HashSet<MeterAssetMMXUPair> mmxuPairs = new HashSet<>();
		Hashtable<EObject, MeterAssetMMXUPair> attributeTable = new Hashtable<>();
		TreeIterator<EObject> substandardIterator = substandardResource.getAllContents();
		while (substandardIterator.hasNext()) {
			EObject eOb = substandardIterator.next();
			if (eOb instanceof MMXU) {
				MMXU mmxu = (MMXU) eOb;
				mmxus.add(mmxu);
				String idNs = mmxu.getNamePlt().getIdNs();
				if (allMeterAssets.containsKey(idNs)) {
					MeterAssetMMXUPair pair = GluemodelFactory.eINSTANCE.createMeterAssetMMXUPair();
					pair.setB(mmxu);
					pair.setA(allMeterAssets.get(idNs));

					WYE phv = mmxu.getPhV();
					if (phv != null) {
						attributeTable.put(phv, pair);
						CMV phsA = phv.getPhsA();
						if (phsA != null) {
							attributeTable.put(phsA, pair);
							Vector cValA = phsA.getCVal();
							if (cValA != null) {
								attributeTable.put(cValA, pair);
								AnalogueValue mag = cValA.getMag();
								if (mag != null) {
									attributeTable.put(mag, pair);
									pair.setAMag(mag.getF());
								}
								AnalogueValue ang = cValA.getAng();
								if (ang != null) {
									attributeTable.put(ang, pair);
									pair.setAAng(ang.getF());
								}
							}
						}
						CMV phsB = phv.getPhsB();
						if (phsB != null) {
							attributeTable.put(phsB, pair);
							Vector cValB = phsB.getCVal();
							if (cValB != null) {
								attributeTable.put(cValB, pair);
								AnalogueValue mag = cValB.getMag();
								if (mag != null) {
									attributeTable.put(mag, pair);
									pair.setBMag(mag.getF());
								}
								AnalogueValue ang = cValB.getAng();
								if (ang != null) {
									attributeTable.put(ang, pair);
									pair.setBAng(ang.getF());
								}
							}
						}
						CMV phsC = phv.getPhsC();
						if (phsC != null) {
							attributeTable.put(phsC, pair);
							Vector cValC = phsC.getCVal();
							if (cValC != null) {
								attributeTable.put(cValC, pair);
								AnalogueValue mag = cValC.getMag();
								if (mag != null) {
									attributeTable.put(mag, pair);
									pair.setCMag(mag.getF());
								}
								AnalogueValue ang = cValC.getAng();
								if (ang != null) {
									attributeTable.put(ang, pair);
									pair.setCAng(ang.getF());
								}
							}
						}
						CMV neut = phv.getNeut();
						if (neut != null) {
							attributeTable.put(neut, pair);
							Vector cValNeut = neut.getCVal();
							if (cValNeut != null) {
								attributeTable.put(cValNeut, pair);
								AnalogueValue mag = cValNeut.getMag();
								if (mag != null) {
									attributeTable.put(mag, pair);
									pair.setNeutMag(mag.getF());
								}
								AnalogueValue ang = cValNeut.getAng();
								if (ang != null) {
									attributeTable.put(ang, pair);
									pair.setNeutAng(ang.getF());
								}
							}
						}
						CMV net = phv.getNet();
						if (net != null) {
							attributeTable.put(net, pair);
							Vector cValNet = net.getCVal();
							if (cValNet != null) {
								attributeTable.put(cValNet, pair);
								AnalogueValue mag = cValNet.getMag();
								if (mag != null) {
									attributeTable.put(mag, pair);
									pair.setNetMag(mag.getF());
								}
								AnalogueValue ang = cValNet.getAng();
								if (ang != null) {
									attributeTable.put(ang, pair);
									pair.setNetAng(ang.getF());
								}
							}
						}
						CMV res = phv.getRes();
						if (res != null) {
							attributeTable.put(res, pair);
							Vector cValRes = res.getCVal();
							if (cValRes != null) {
								attributeTable.put(cValRes, pair);
								AnalogueValue mag = cValRes.getMag();
								if (mag != null) {
									attributeTable.put(mag, pair);
									pair.setResMag(mag.getF());
								}
								AnalogueValue ang = cValRes.getAng();
								if (ang != null) {
									attributeTable.put(ang, pair);
									pair.setResAng(ang.getF());
								}
							}
						}
					}

					mmxuPairs.add(pair);
				}
			}
		}
		root.getMmxus().addAll(getAllMMXU(substandardResource));
		root.getMeterAssetToMXXU().addAll(mmxuPairs);

		HashSet<PhysicalDevice> devices = new HashSet<>();
		HashSet<MeterAssetPhysicalDevicePair> devicePairs = new HashSet<>();
		TreeIterator<EObject> cosemIterator = cosemResource.getAllContents();
		while (cosemIterator.hasNext()) {
			EObject eOb = cosemIterator.next();
			if (eOb instanceof PhysicalDevice) {
				PhysicalDevice device = (PhysicalDevice) eOb;
				devices.add(device);
				String idNs = device.getID();
				if (allMeterAssets.containsKey(idNs)) {
					MeterAssetPhysicalDevicePair pair = GluemodelFactory.eINSTANCE.createMeterAssetPhysicalDevicePair();
					pair.setB(device);
					pair.setA(allMeterAssets.get(idNs));
					devicePairs.add(pair);
				}
			}
		}

		root.getMeterAssetToPhysicalDevice().addAll(devicePairs);

		fwdResource.getContents().add(root);

		// File folder = new File("instances");
		// folder.mkdirs();
		// File file = new File(folder, "fwd.src.xmi");
		// try {
		// file.createNewFile();
		// fwdResource.save(new java.io.FileOutputStream(file),
		// Collections.EMPTY_MAP);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

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

	}

	private HashSet<MMXU> getAllMMXU(Resource resource) {
		HashSet<MMXU> mmxus = new HashSet<MMXU>();
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			EObject eOb = iterator.next();
			if (eOb instanceof MMXU) {
				MMXU asset = (MMXU) eOb;
				mmxus.add(asset);
			}
		}
		return mmxus;
	}

	private Hashtable<String, MeterAsset> getAllMeterAssets(Resource resource) {
		Hashtable<String, MeterAsset> assets = new Hashtable();
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			EObject eOb = iterator.next();
			if (eOb instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) eOb;
				assets.put(asset.getMRID(), asset);
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
