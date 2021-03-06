/**
 */
package rgse.ttc17.emoflon.tgg.task2.impl;

import gluemodel.MeterAssetMMXUPair;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;

import outagePreventionJointarget.PMUVoltageMeter;

import rgse.ttc17.emoflon.tgg.task2.MeterAssetToMMXUToVoltageMeter;
import rgse.ttc17.emoflon.tgg.task2.Task2Package;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter Asset To MMXU To Voltage Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToMMXUToVoltageMeterImpl#getSource <em>Source</em>}</li>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.impl.MeterAssetToMMXUToVoltageMeterImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeterAssetToMMXUToVoltageMeterImpl extends AbstractCorrespondenceImpl
		implements MeterAssetToMMXUToVoltageMeter {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MeterAssetMMXUPair source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected PMUVoltageMeter target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterAssetToMMXUToVoltageMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Task2Package.Literals.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAssetMMXUPair getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (MeterAssetMMXUPair) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAssetMMXUPair basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(MeterAssetMMXUPair newSource) {
		MeterAssetMMXUPair oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PMUVoltageMeter getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (PMUVoltageMeter) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PMUVoltageMeter basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(PMUVoltageMeter newTarget) {
		PMUVoltageMeter oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__TARGET:
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
		case Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__SOURCE:
			setSource((MeterAssetMMXUPair) newValue);
			return;
		case Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__TARGET:
			setTarget((PMUVoltageMeter) newValue);
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
		case Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__SOURCE:
			setSource((MeterAssetMMXUPair) null);
			return;
		case Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__TARGET:
			setTarget((PMUVoltageMeter) null);
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
		case Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__SOURCE:
			return source != null;
		case Task2Package.METER_ASSET_TO_MMXU_TO_VOLTAGE_METER__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MeterAssetToMMXUToVoltageMeterImpl
