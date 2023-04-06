/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDORTHONAVCO Mvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDORTHONAVCOMvalues()
 * @model extendedMetaData="name='CD-ORTHO-NAVCOMvalues'"
 * @generated
 */
public enum CDORTHONAVCOMvalues implements Enumerator {
	/**
	 * The '<em><b>Navigationcomputerglobal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONCOMPUTERGLOBAL_VALUE
	 * @generated
	 * @ordered
	 */
	NAVIGATIONCOMPUTERGLOBAL(0, "navigationcomputerglobal", "navigationcomputerglobal"),

	/**
	 * The '<em><b>Navigationcomputerstem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONCOMPUTERSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	NAVIGATIONCOMPUTERSTEM(1, "navigationcomputerstem", "navigationcomputerstem"),

	/**
	 * The '<em><b>Navigationcomputercup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONCOMPUTERCUP_VALUE
	 * @generated
	 * @ordered
	 */
	NAVIGATIONCOMPUTERCUP(2, "navigationcomputercup", "navigationcomputercup"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(3, "none", "none");

	/**
	 * The '<em><b>Navigationcomputerglobal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONCOMPUTERGLOBAL
	 * @model name="navigationcomputerglobal"
	 * @generated
	 * @ordered
	 */
	public static final int NAVIGATIONCOMPUTERGLOBAL_VALUE = 0;

	/**
	 * The '<em><b>Navigationcomputerstem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONCOMPUTERSTEM
	 * @model name="navigationcomputerstem"
	 * @generated
	 * @ordered
	 */
	public static final int NAVIGATIONCOMPUTERSTEM_VALUE = 1;

	/**
	 * The '<em><b>Navigationcomputercup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONCOMPUTERCUP
	 * @model name="navigationcomputercup"
	 * @generated
	 * @ordered
	 */
	public static final int NAVIGATIONCOMPUTERCUP_VALUE = 2;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDORTHONAVCO Mvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDORTHONAVCOMvalues[] VALUES_ARRAY =
		new CDORTHONAVCOMvalues[] {
			NAVIGATIONCOMPUTERGLOBAL,
			NAVIGATIONCOMPUTERSTEM,
			NAVIGATIONCOMPUTERCUP,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDORTHONAVCO Mvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDORTHONAVCOMvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDORTHONAVCO Mvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDORTHONAVCOMvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDORTHONAVCOMvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDORTHONAVCO Mvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDORTHONAVCOMvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDORTHONAVCOMvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDORTHONAVCO Mvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDORTHONAVCOMvalues get(int value) {
		switch (value) {
			case NAVIGATIONCOMPUTERGLOBAL_VALUE: return NAVIGATIONCOMPUTERGLOBAL;
			case NAVIGATIONCOMPUTERSTEM_VALUE: return NAVIGATIONCOMPUTERSTEM;
			case NAVIGATIONCOMPUTERCUP_VALUE: return NAVIGATIONCOMPUTERCUP;
			case NONE_VALUE: return NONE;
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
	private CDORTHONAVCOMvalues(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //CDORTHONAVCOMvalues
