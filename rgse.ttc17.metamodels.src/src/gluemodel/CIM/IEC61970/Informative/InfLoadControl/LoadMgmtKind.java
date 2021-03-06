/**
 */
package gluemodel.CIM.IEC61970.Informative.InfLoadControl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Load Mgmt Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtKind()
 * @model
 * @generated
 */
public enum LoadMgmtKind implements Enumerator {
	/**
	 * The '<em><b>Time Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_BASED(0, "timeBased", "timeBased"),

	/**
	 * The '<em><b>Remote Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_CONTROL(1, "remoteControl", "remoteControl"),

	/**
	 * The '<em><b>Manual Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL_CONTROL(2, "manualControl", "manualControl"),

	/**
	 * The '<em><b>Tariff Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARIFF_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	TARIFF_BASED(3, "tariffBased", "tariffBased");

	/**
	 * The '<em><b>Time Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Based</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_BASED
	 * @model name="timeBased"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_BASED_VALUE = 0;

	/**
	 * The '<em><b>Remote Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remote Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTE_CONTROL
	 * @model name="remoteControl"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONTROL_VALUE = 1;

	/**
	 * The '<em><b>Manual Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manual Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL_CONTROL
	 * @model name="manualControl"
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_CONTROL_VALUE = 2;

	/**
	 * The '<em><b>Tariff Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tariff Based</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TARIFF_BASED
	 * @model name="tariffBased"
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_BASED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Load Mgmt Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LoadMgmtKind[] VALUES_ARRAY =
		new LoadMgmtKind[] {
			TIME_BASED,
			REMOTE_CONTROL,
			MANUAL_CONTROL,
			TARIFF_BASED,
		};

	/**
	 * A public read-only list of all the '<em><b>Load Mgmt Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LoadMgmtKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Load Mgmt Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LoadMgmtKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LoadMgmtKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Load Mgmt Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LoadMgmtKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LoadMgmtKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Load Mgmt Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LoadMgmtKind get(int value) {
		switch (value) {
			case TIME_BASED_VALUE: return TIME_BASED;
			case REMOTE_CONTROL_VALUE: return REMOTE_CONTROL;
			case MANUAL_CONTROL_VALUE: return MANUAL_CONTROL;
			case TARIFF_BASED_VALUE: return TARIFF_BASED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LoadMgmtKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LoadMgmtKind
