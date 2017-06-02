/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.C_ComposedCDC;
import gluemodel.substationStandard.Dataclasses.DataclassesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CComposed CDC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.C_ComposedCDCImpl#getCdcNs <em>Cdc Ns</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.C_ComposedCDCImpl#getCdcName <em>Cdc Name</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.C_ComposedCDCImpl#getDataNs <em>Data Ns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class C_ComposedCDCImpl extends MinimalEObjectImpl.Container implements C_ComposedCDC {
	/**
	 * The default value of the '{@link #getCdcNs() <em>Cdc Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdcNs()
	 * @generated
	 * @ordered
	 */
	protected static final String CDC_NS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdcNs() <em>Cdc Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdcNs()
	 * @generated
	 * @ordered
	 */
	protected String cdcNs = CDC_NS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCdcName() <em>Cdc Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdcName()
	 * @generated
	 * @ordered
	 */
	protected static final String CDC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdcName() <em>Cdc Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdcName()
	 * @generated
	 * @ordered
	 */
	protected String cdcName = CDC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataNs() <em>Data Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNs()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_NS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataNs() <em>Data Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNs()
	 * @generated
	 * @ordered
	 */
	protected String dataNs = DATA_NS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected C_ComposedCDCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.CCOMPOSED_CDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCdcNs() {
		return cdcNs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCdcNs(String newCdcNs) {
		String oldCdcNs = cdcNs;
		cdcNs = newCdcNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CCOMPOSED_CDC__CDC_NS, oldCdcNs, cdcNs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCdcName() {
		return cdcName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCdcName(String newCdcName) {
		String oldCdcName = cdcName;
		cdcName = newCdcName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CCOMPOSED_CDC__CDC_NAME, oldCdcName, cdcName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataNs() {
		return dataNs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataNs(String newDataNs) {
		String oldDataNs = dataNs;
		dataNs = newDataNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.CCOMPOSED_CDC__DATA_NS, oldDataNs, dataNs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.CCOMPOSED_CDC__CDC_NS:
				return getCdcNs();
			case DataclassesPackage.CCOMPOSED_CDC__CDC_NAME:
				return getCdcName();
			case DataclassesPackage.CCOMPOSED_CDC__DATA_NS:
				return getDataNs();
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
			case DataclassesPackage.CCOMPOSED_CDC__CDC_NS:
				setCdcNs((String)newValue);
				return;
			case DataclassesPackage.CCOMPOSED_CDC__CDC_NAME:
				setCdcName((String)newValue);
				return;
			case DataclassesPackage.CCOMPOSED_CDC__DATA_NS:
				setDataNs((String)newValue);
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
			case DataclassesPackage.CCOMPOSED_CDC__CDC_NS:
				setCdcNs(CDC_NS_EDEFAULT);
				return;
			case DataclassesPackage.CCOMPOSED_CDC__CDC_NAME:
				setCdcName(CDC_NAME_EDEFAULT);
				return;
			case DataclassesPackage.CCOMPOSED_CDC__DATA_NS:
				setDataNs(DATA_NS_EDEFAULT);
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
			case DataclassesPackage.CCOMPOSED_CDC__CDC_NS:
				return CDC_NS_EDEFAULT == null ? cdcNs != null : !CDC_NS_EDEFAULT.equals(cdcNs);
			case DataclassesPackage.CCOMPOSED_CDC__CDC_NAME:
				return CDC_NAME_EDEFAULT == null ? cdcName != null : !CDC_NAME_EDEFAULT.equals(cdcName);
			case DataclassesPackage.CCOMPOSED_CDC__DATA_NS:
				return DATA_NS_EDEFAULT == null ? dataNs != null : !DATA_NS_EDEFAULT.equals(dataNs);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cdcNs: ");
		result.append(cdcNs);
		result.append(", cdcName: ");
		result.append(cdcName);
		result.append(", dataNs: ");
		result.append(dataNs);
		result.append(')');
		return result.toString();
	}

} //C_ComposedCDCImpl
