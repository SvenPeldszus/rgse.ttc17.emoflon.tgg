/**
 */
package gluemodel.COSEM.COSEMObjects;

import gluemodel.COSEM.InterfaceClasses.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UNIX Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.COSEM.COSEMObjects.UNIXClock#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getUNIXClock()
 * @model
 * @generated
 */
public interface UNIXClock extends Data {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see gluemodel.COSEM.COSEMObjects.COSEMObjectsPackage#getUNIXClock_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link gluemodel.COSEM.COSEMObjects.UNIXClock#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // UNIXClock
