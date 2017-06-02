package rgse.ttc17.emoflon.tgg.task2.org.moflon.tie;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.runtime.AttributeDelta;
import org.moflon.tgg.runtime.CorrespondenceModel;
import org.moflon.tgg.runtime.DeltaSpecification;
import org.moflon.tgg.runtime.EMoflonEdge;

import Changes.ChangesPackage;
import gluemodel.GluemodelPackage;
import outagePreventionJointarget.OutagePreventionJointargetPackage;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import rgse.ttc17.emoflon.tgg.task2.Task2Package;

public class Task2Sync extends SynchronizationHelper {

	public Task2Sync() throws IOException {
		super(Task2Package.eINSTANCE, ".");

		recursiveLoad(GluemodelPackage.eINSTANCE, getResourceSet());
		recursiveLoad(ChangesPackage.eINSTANCE, getResourceSet());
		recursiveLoad(OutagePreventionJointargetPackage.eINSTANCE, getResourceSet());
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
		.put(Resource.Factory.Registry.DEFAULT_EXTENSION,new XMIResourceFactoryImpl());
		
		Resource gluemodel = getResourceSet().createResource(URI.createFileURI("../rgse.ttc17.metamodels.src/model/Gluemodel.ecore"));
		gluemodel.load(null);

		Resource changes = getResourceSet().createResource(URI.createFileURI("../rgse.ttc17.metamodels.changes/model/Changes.ecore"));
		changes.load(null);
		
		Resource detection = getResourceSet().createResource(URI.createFileURI("../rgse.ttc17.metamodels.trg.outage.detection/model/outageDetection-target.ecore"));
		detection.load(null);
		
		EcoreUtil.resolveAll(getResourceSet());
	}

	private static void recursiveLoad(EPackage pack, ResourceSet resSet) {
		pack.eClass();
        resSet.getPackageRegistry().put(pack.getNsURI(), pack);
        for (EPackage sub : pack.getESubpackages()) {
            recursiveLoad(sub, resSet);
        }
    } 
	
	public void syncForward(String corr, String delta) {
		setChangeSrc(executeDeltaSpec(delta));
		loadTriple(corr);
		loadSynchronizationProtocol("instances/fwd.protocol.xmi");
		integrateForward();
		saveResult("fwd");

		System.out.println("Completed forward synchronization");
	}

	private void loadTriple(String corr) {
		try {
			loadCorr(corr);
			CorrespondenceModel corrModel = (CorrespondenceModel) getCorr();
			setSrc(corrModel.getSource());
			setTrg(corrModel.getTarget());
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load input triple for " + corr + ", " + iae.getMessage());
		}
	}

	private void saveResult(String direction) {
		saveSrc("instances/" + direction + ".src.xmi");
		saveTrg("instances/" + direction + ".trg.xmi");
		saveCorr("instances/" + direction + ".corr.xmi");
		saveSynchronizationProtocol("instances/" + direction + ".protocol.xmi");
	}

	public Consumer<EObject> sync(DeltaSpecification localDeltaSpec) {
		EcoreUtil.resolveAll(localDeltaSpec);
		deltaSpec = EcoreUtil.copy(localDeltaSpec);

		return (Consumer) -> {
			// Added edges (nodes are indirectly added)
			for (EMoflonEdge ae : localDeltaSpec.getAddedEdges())
				performActionOnFeature(ae, (f, o) -> ((EList) ae.getSrc().eGet(f)).add(o), ae.getSrc()::eSet);

			// Edge deletion
			for (EMoflonEdge de : localDeltaSpec.getDeletedEdges())
				performActionOnFeature(de, (f, o) -> ((EList) de.getSrc().eGet(f)).remove(o),
						(f, o) -> de.getSrc().eUnset(f));

			// Node deletion
			for (EObject delObj : localDeltaSpec.getDeletedNodes())
				EcoreUtil.delete(delObj);

			// Attribute deltas
			for (AttributeDelta ac : localDeltaSpec.getAttributeChanges())
				ac.getAffectedNode().eSet(ac.getAffectedAttribute(),
						EcoreUtil.createFromString(ac.getAffectedAttribute().getEAttributeType(), ac.getNewValue()));
		};
	}

	private void performActionOnFeature(EMoflonEdge e, BiConsumer<EStructuralFeature, EObject> actionMany,
			BiConsumer<EStructuralFeature, EObject> actionOne) {
		EStructuralFeature feature = e.getSrc().eClass().getEStructuralFeature(e.getName());
		if (!feature.isDerived()) {
			if (feature.isMany()) {
				actionMany.accept(feature, e.getTrg());
			} else
				actionOne.accept(feature, e.getTrg());
		}

	}
}