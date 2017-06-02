/**
 */
package rgse.ttc17.emoflon.tgg.task2.impl;

import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;

import rgse.ttc17.emoflon.tgg.task2.ServiceDeliveryPointToServiceDeliveryPoint;
import rgse.ttc17.emoflon.tgg.task2.Task2Package;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Delivery Point To Service Delivery Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.impl.ServiceDeliveryPointToServiceDeliveryPointImpl#getSource <em>Source</em>}</li>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.impl.ServiceDeliveryPointToServiceDeliveryPointImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDeliveryPointToServiceDeliveryPointImpl extends AbstractCorrespondenceImpl
		implements ServiceDeliveryPointToServiceDeliveryPoint {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ServiceDeliveryPoint source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected outagePreventionJointarget.ServiceDeliveryPoint target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDeliveryPointToServiceDeliveryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Task2Package.Literals.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ServiceDeliveryPoint) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ServiceDeliveryPoint newSource) {
		ServiceDeliveryPoint oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.ServiceDeliveryPoint getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (outagePreventionJointarget.ServiceDeliveryPoint) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.ServiceDeliveryPoint basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(outagePreventionJointarget.ServiceDeliveryPoint newTarget) {
		outagePreventionJointarget.ServiceDeliveryPoint oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__SOURCE:
			setSource((ServiceDeliveryPoint) newValue);
			return;
		case Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__TARGET:
			setTarget((outagePreventionJointarget.ServiceDeliveryPoint) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__SOURCE:
			setSource((ServiceDeliveryPoint) null);
			return;
		case Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__TARGET:
			setTarget((outagePreventionJointarget.ServiceDeliveryPoint) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__SOURCE:
			return source != null;
		case Task2Package.SERVICE_DELIVERY_POINT_TO_SERVICE_DELIVERY_POINT__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ServiceDeliveryPointToServiceDeliveryPointImpl
