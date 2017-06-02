/**
 */
package gluemodel.substationStandard.LNNodes.LNGroupT.util;

import gluemodel.substationStandard.LNNodes.DomainLNs.DomainLN;

import gluemodel.substationStandard.LNNodes.LNGroupT.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.substationStandard.LNNodes.LNGroupT.LNGroupTPackage
 * @generated
 */
public class LNGroupTAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LNGroupTPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNGroupTAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LNGroupTPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LNGroupTSwitch<Adapter> modelSwitch =
		new LNGroupTSwitch<Adapter>() {
			@Override
			public Adapter caseGroupT(GroupT object) {
				return createGroupTAdapter();
			}
			@Override
			public Adapter caseTCTR(TCTR object) {
				return createTCTRAdapter();
			}
			@Override
			public Adapter caseTVTR(TVTR object) {
				return createTVTRAdapter();
			}
			@Override
			public Adapter caseDomainLN(DomainLN object) {
				return createDomainLNAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupT.GroupT <em>Group T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.GroupT
	 * @generated
	 */
	public Adapter createGroupTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupT.TCTR <em>TCTR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.TCTR
	 * @generated
	 */
	public Adapter createTCTRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.LNGroupT.TVTR <em>TVTR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.LNGroupT.TVTR
	 * @generated
	 */
	public Adapter createTVTRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.substationStandard.LNNodes.DomainLNs.DomainLN <em>Domain LN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.substationStandard.LNNodes.DomainLNs.DomainLN
	 * @generated
	 */
	public Adapter createDomainLNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LNGroupTAdapterFactory
