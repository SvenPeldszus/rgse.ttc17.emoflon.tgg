/**
 */
package gluemodel.CIM.IEC61970.Informative.Reservation.util;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.Reservation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationPackage
 * @generated
 */
public class ReservationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReservationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReservationPackage.eINSTANCE;
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
	protected ReservationSwitch<Adapter> modelSwitch =
		new ReservationSwitch<Adapter>() {
			@Override
			public Adapter caseTransmissionPath(TransmissionPath object) {
				return createTransmissionPathAdapter();
			}
			@Override
			public Adapter caseTiePoint(TiePoint object) {
				return createTiePointAdapter();
			}
			@Override
			public Adapter caseServiceReservation(ServiceReservation object) {
				return createServiceReservationAdapter();
			}
			@Override
			public Adapter caseServicePoint(ServicePoint object) {
				return createServicePointAdapter();
			}
			@Override
			public Adapter caseAncillaryService(AncillaryService object) {
				return createAncillaryServiceAdapter();
			}
			@Override
			public Adapter caseReservationVersion(ReservationVersion object) {
				return createReservationVersionAdapter();
			}
			@Override
			public Adapter caseTransmissionService(TransmissionService object) {
				return createTransmissionServiceAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseIdentifiedObject(IdentifiedObject object) {
				return createIdentifiedObjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath <em>Transmission Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionPath
	 * @generated
	 */
	public Adapter createTransmissionPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint <em>Tie Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TiePoint
	 * @generated
	 */
	public Adapter createTiePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation <em>Service Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServiceReservation
	 * @generated
	 */
	public Adapter createServiceReservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint <em>Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ServicePoint
	 * @generated
	 */
	public Adapter createServicePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService <em>Ancillary Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.AncillaryService
	 * @generated
	 */
	public Adapter createAncillaryServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.ReservationVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.ReservationVersion
	 * @generated
	 */
	public Adapter createReservationVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService <em>Transmission Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Informative.Reservation.TransmissionService
	 * @generated
	 */
	public Adapter createTransmissionServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gluemodel.CIM.IEC61970.Core.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gluemodel.CIM.IEC61970.Core.IdentifiedObject
	 * @generated
	 */
	public Adapter createIdentifiedObjectAdapter() {
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

} //ReservationAdapterFactory
