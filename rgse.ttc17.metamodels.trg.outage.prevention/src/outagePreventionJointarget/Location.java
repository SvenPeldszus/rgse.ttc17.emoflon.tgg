/**
 */
package outagePreventionJointarget;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.Location#getPosition <em>Position</em>}</li>
 *   <li>{@link outagePreventionJointarget.Location#getPowerSystemResources <em>Power System Resources</em>}</li>
 * </ul>
 *
 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(PositionPoint)
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getLocation_Position()
	 * @model
	 * @generated
	 */
	PositionPoint getPosition();

	/**
	 * Sets the value of the '{@link outagePreventionJointarget.Location#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionPoint value);

	/**
	 * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
	 * The list contents are of type {@link outagePreventionJointarget.PowerSystemResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resources</em>' reference list.
	 * @see outagePreventionJointarget.OutagePreventionJointargetPackage#getLocation_PowerSystemResources()
	 * @model
	 * @generated
	 */
	EList<PowerSystemResource> getPowerSystemResources();

} // Location
