/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDPATIENTWILLRE Svalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDPATIENTWILLRESvalues()
 * @model extendedMetaData="name='CD-PATIENTWILL-RESvalues'"
 * @generated
 */
public enum CDPATIENTWILLRESvalues implements Enumerator {
	/**
	 * The '<em><b>Dnr0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNR0_VALUE
	 * @generated
	 * @ordered
	 */
	DNR0(0, "dnr0", "dnr0"),

	/**
	 * The '<em><b>Dnr1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNR1_VALUE
	 * @generated
	 * @ordered
	 */
	DNR1(1, "dnr1", "dnr1"),

	/**
	 * The '<em><b>Dnr2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNR2_VALUE
	 * @generated
	 * @ordered
	 */
	DNR2(2, "dnr2", "dnr2"),

	/**
	 * The '<em><b>Dnr3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNR3_VALUE
	 * @generated
	 * @ordered
	 */
	DNR3(3, "dnr3", "dnr3");

	/**
	 * The '<em><b>Dnr0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNR0
	 * @model name="dnr0"
	 * @generated
	 * @ordered
	 */
	public static final int DNR0_VALUE = 0;

	/**
	 * The '<em><b>Dnr1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNR1
	 * @model name="dnr1"
	 * @generated
	 * @ordered
	 */
	public static final int DNR1_VALUE = 1;

	/**
	 * The '<em><b>Dnr2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNR2
	 * @model name="dnr2"
	 * @generated
	 * @ordered
	 */
	public static final int DNR2_VALUE = 2;

	/**
	 * The '<em><b>Dnr3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNR3
	 * @model name="dnr3"
	 * @generated
	 * @ordered
	 */
	public static final int DNR3_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDPATIENTWILLRE Svalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDPATIENTWILLRESvalues[] VALUES_ARRAY =
		new CDPATIENTWILLRESvalues[] {
			DNR0,
			DNR1,
			DNR2,
			DNR3,
		};

	/**
	 * A public read-only list of all the '<em><b>CDPATIENTWILLRE Svalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDPATIENTWILLRESvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDPATIENTWILLRE Svalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDPATIENTWILLRESvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDPATIENTWILLRESvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDPATIENTWILLRE Svalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDPATIENTWILLRESvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDPATIENTWILLRESvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDPATIENTWILLRE Svalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDPATIENTWILLRESvalues get(int value) {
		switch (value) {
			case DNR0_VALUE: return DNR0;
			case DNR1_VALUE: return DNR1;
			case DNR2_VALUE: return DNR2;
			case DNR3_VALUE: return DNR3;
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
	private CDPATIENTWILLRESvalues(int value, String name, String literal) {
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
	
} //CDPATIENTWILLRESvalues
