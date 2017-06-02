package rgse.ttc17.emoflon.tgg.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.moflon.tgg.language.algorithm.TempOutputContainer;
import org.moflon.tgg.runtime.DeltaSpecification;
import org.moflon.tgg.runtime.RuntimeFactory;
import Changes.ModelChange;
import Changes.ModelChangeSet;
import Changes.converter.Changes2DeltaSpecification;
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

public class GlueModelCreator {

	public static void main(String[] args) throws IOException {
		String seq1 = "../rgse.ttc17.metamodels.changes/changes/changeSequence1/";

		String cimDeltaString = "CIM_DCIM-delta";
		String cimOutString = "CIM_DCIM-out";
		String substandardOutString = "Substandard-out";
		String cosemOutString = "COSEM-out";

		Task2Sync tgg = new Task2Sync();
		ResourceSet rs = tgg.getResourceSet();

		System.out.println("Initialization done");

		Resource cimResource = rs.createResource(URI.createURI("CIM_DCIM-out000.xmi"));
		try {
			cimResource.load(new FileInputStream(new File(seq1 + cimOutString + "068.xmi").getAbsolutePath()),
					Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		CIMRoot cim = (CIMRoot) cimResource.getContents().get(0);

		Resource substandardResource = rs.createResource(URI.createURI("Substandard-out000.xmi"));
		try {
			substandardResource.load(
					new FileInputStream(new File(seq1 + substandardOutString + "068.xmi").getAbsolutePath()),
					Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Substandard substandard = (Substandard) substandardResource.getContents().get(0);

		Resource cosemResource = rs
				.createResource(URI.createURI(new File(seq1 + cosemOutString + "068.xmi").getAbsolutePath()));
		try {
			cosemResource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		COSEMRoot cosem = (COSEMRoot) cosemResource.getContents().get(0);

		System.out.println("Models loaded");

		Root root = createGlueModel(cim, substandard, cosem);

		tgg.setSrc(root);
		tgg.integrateForward();

		EObject trg = tgg.getTrg();

		Set<EObject> keep = new HashSet<EObject>();
		if (trg instanceof TempOutputContainer) {
			TempOutputContainer container = (TempOutputContainer) trg;
			keep.addAll(container.getPotentialRoots());
		}

		Resource targetResource = rs.createResource(URI.createURI(new File(seq1 + "outage.xmi").getAbsolutePath()));
		targetResource.getContents().addAll(keep);

		try {
			targetResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 69; i <= 100; i++) {
			DeltaSpecification emoflonDelta = RuntimeFactory.eINSTANCE.createDeltaSpecification();
			emoflonDelta.setTargetModel(root);

			File deltaFile = new File(seq1 + cimDeltaString + String.format("%03d", i) + ".xmi").getAbsoluteFile();
			File temp = File.createTempFile("delta", "temp");
			List<String> out = new ArrayList<>();
			for (String line : Files.readAllLines(deltaFile.toPath())) {
				out.add(line
						.replaceAll("http://iec.ch/TC57/2009/CIM-schema-cim14#//",
								"platform:/plugin/rgse.ttc17.metamodels.src/model/Gluemodel.ecore#//CIM/")
						.replaceAll("CIM_DCIM-out000.xmi#//", "CIM_DCIM-out000.xmi#/"));
			}
			Files.write(temp.toPath(), out);

			Resource cimDeltaResource = rs.createResource(URI.createURI(temp.toString()));
			try {
				cimDeltaResource.load(Collections.EMPTY_MAP);
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			ModelChangeSet modelChangeSet = (ModelChangeSet) cimDeltaResource.getContents().get(0);
			for (ModelChange change : modelChangeSet.getChanges()) {
				Changes2DeltaSpecification.convert(change, emoflonDelta);
			}

			tgg.setChangeSrc(tgg.sync(emoflonDelta));
			tgg.integrateForward();

			keep.clear();
			trg = tgg.getTrg();
			if (trg instanceof TempOutputContainer) {
				TempOutputContainer container = (TempOutputContainer) trg;
				keep.addAll(container.getPotentialRoots());
			}
			Resource changeTargetResource = new ResourceSetImpl()
					.createResource(URI.createURI(seq1 + cimOutString + String.format("%03d", i) + ".xmi"));
			changeTargetResource.getContents().addAll(keep);

			try {
				changeTargetResource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static Root createGlueModel(CIMRoot cim, Substandard substandard, COSEMRoot cosem) {
		Resource cimResource = cim.eResource();
		Resource cosemResource = cosem.eResource();

		ResourceSet rs = cimResource.getResourceSet();
		if (rs != cosemResource.getResourceSet()) {
			throw new RuntimeException("Different ResourceSets");
		}

		Resource fwdResource = rs.createResource(URI.createURI("fwd.src.xmi"));

		Root root = GluemodelFactory.eINSTANCE.createRoot();
		root.setCim(cim);
		root.setSubstandard(substandard);
		root.setCosem(cosem);

		Hashtable<String, MeterAsset> allMeterAssets = getAllMeterAssets(cimResource);
		root.getAssets().addAll(allMeterAssets.values());

		if (substandard != null) {
			Resource substandardResource = substandard.eResource();
			if (rs != substandardResource.getResourceSet()) {
				throw new RuntimeException("Different ResourceSets");
			}
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
						MeterAssetPhysicalDevicePair pair = GluemodelFactory.eINSTANCE
								.createMeterAssetPhysicalDevicePair();
						pair.setB(device);
						pair.setA(allMeterAssets.get(idNs));
						devicePairs.add(pair);
					}
				}
			}

			root.getMeterAssetToPhysicalDevice().addAll(devicePairs);
		}

		fwdResource.getContents().add(root);
		return root;
	}

	private static HashSet<MMXU> getAllMMXU(Resource resource) {
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

	private static Hashtable<String, MeterAsset> getAllMeterAssets(Resource resource) {
		Hashtable<String, MeterAsset> assets = new Hashtable<>();
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
}
