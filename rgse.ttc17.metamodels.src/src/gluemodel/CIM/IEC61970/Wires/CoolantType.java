/**
 */
package gluemodel.CIM.IEC61970.Wires;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Coolant Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Wires.WiresPackage#getCoolantType()
 * @model
 * @generated
 */
public enum CoolantType implements Enumerator {
	/**
	 * The '<em><b>Water</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER_VALUE
	 * @generated
	 * @ordered
	 */
	WATER(0, "water", "water"),

	/**
	 * The '<em><b>Air</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_VALUE
	 * @generated
	 * @ordered
	 */
	AIR(1, "air", "air"),

	/**
	 * The '<em><b>Hydrogen Gas</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYDROGEN_GAS_VALUE
	 * @generated
	 * @ordered
	 */
	HYDROGEN_GAS(2, "hydrogenGas", "hydrogenGas");

	/**
	 * The '<em><b>Water</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Water</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WATER
	 * @model name="water"
	 * @generated
	 * @ordered
	 */
	public static final int WATER_VALUE = 0;

	/**
	 * The '<em><b>Air</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Air</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AIR
	 * @model name="air"
	 * @generated
	 * @ordered
	 */
	public static final int AIR_VALUE = 1;

	/**
	 * The '<em><b>Hydrogen Gas</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hydrogen Gas</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYDROGEN_GAS
	 * @model name="hydrogenGas"
	 * @generated
	 * @ordered
	 */
	public static final int HYDROGEN_GAS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Coolant Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CoolantType[] VALUES_ARRAY =
		new CoolantType[] {
			WATER,
			AIR,
			HYDROGEN_GAS,
		};

	/**
	 * A public read-only list of all the '<em><b>Coolant Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CoolantType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Coolant Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoolantType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoolantType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coolant Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoolantType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoolantType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coolant Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoolantType get(int value) {
		switch (value) {
			case WATER_VALUE: return WATER;
			case AIR_VALUE: return AIR;
			case HYDROGEN_GAS_VALUE: return HYDROGEN_GAS;
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
	private CoolantType(int value, String name, String literal) {
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
	
} //CoolantType
