/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Circuit Connection Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getCircuitConnectionKind()
 * @model
 * @generated
 */
public enum CircuitConnectionKind implements Enumerator {
	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "other", "other"),

	/**
	 * The '<em><b>Nominally Connected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOMINALLY_CONNECTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOMINALLY_CONNECTED(1, "nominallyConnected", "nominallyConnected"),

	/**
	 * The '<em><b>As Built</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AS_BUILT_VALUE
	 * @generated
	 * @ordered
	 */
	AS_BUILT(2, "asBuilt", "asBuilt"),

	/**
	 * The '<em><b>Electrically Connected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICALLY_CONNECTED_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICALLY_CONNECTED(3, "electricallyConnected", "electricallyConnected");

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 0;

	/**
	 * The '<em><b>Nominally Connected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nominally Connected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOMINALLY_CONNECTED
	 * @model name="nominallyConnected"
	 * @generated
	 * @ordered
	 */
	public static final int NOMINALLY_CONNECTED_VALUE = 1;

	/**
	 * The '<em><b>As Built</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>As Built</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AS_BUILT
	 * @model name="asBuilt"
	 * @generated
	 * @ordered
	 */
	public static final int AS_BUILT_VALUE = 2;

	/**
	 * The '<em><b>Electrically Connected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Electrically Connected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRICALLY_CONNECTED
	 * @model name="electricallyConnected"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICALLY_CONNECTED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Circuit Connection Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CircuitConnectionKind[] VALUES_ARRAY =
		new CircuitConnectionKind[] {
			OTHER,
			NOMINALLY_CONNECTED,
			AS_BUILT,
			ELECTRICALLY_CONNECTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Circuit Connection Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CircuitConnectionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Circuit Connection Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CircuitConnectionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CircuitConnectionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Circuit Connection Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CircuitConnectionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CircuitConnectionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Circuit Connection Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CircuitConnectionKind get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case NOMINALLY_CONNECTED_VALUE: return NOMINALLY_CONNECTED;
			case AS_BUILT_VALUE: return AS_BUILT;
			case ELECTRICALLY_CONNECTED_VALUE: return ELECTRICALLY_CONNECTED;
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
	private CircuitConnectionKind(int value, String name, String literal) {
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
	
} //CircuitConnectionKind
