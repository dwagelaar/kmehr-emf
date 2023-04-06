/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDEBIRTHCHILDPOSITIO Nvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDEBIRTHCHILDPOSITIONvalues()
 * @model extendedMetaData="name='CD-EBIRTH-CHILDPOSITIONvalues'"
 * @generated
 */
public enum CDEBIRTHCHILDPOSITIONvalues implements Enumerator {
	/**
	 * The '<em><b>Head Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_DOWN(0, "headDown", "head-down"),

	/**
	 * The '<em><b>Other Head</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_HEAD_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_HEAD(1, "otherHead", "other-head"),

	/**
	 * The '<em><b>Breech</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREECH_VALUE
	 * @generated
	 * @ordered
	 */
	BREECH(2, "breech", "breech"),

	/**
	 * The '<em><b>Transverse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSVERSE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSVERSE(3, "transverse", "transverse");

	/**
	 * The '<em><b>Head Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_DOWN
	 * @model name="headDown" literal="head-down"
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_DOWN_VALUE = 0;

	/**
	 * The '<em><b>Other Head</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_HEAD
	 * @model name="otherHead" literal="other-head"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_HEAD_VALUE = 1;

	/**
	 * The '<em><b>Breech</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREECH
	 * @model name="breech"
	 * @generated
	 * @ordered
	 */
	public static final int BREECH_VALUE = 2;

	/**
	 * The '<em><b>Transverse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSVERSE
	 * @model name="transverse"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSVERSE_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDEBIRTHCHILDPOSITIO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDEBIRTHCHILDPOSITIONvalues[] VALUES_ARRAY =
		new CDEBIRTHCHILDPOSITIONvalues[] {
			HEAD_DOWN,
			OTHER_HEAD,
			BREECH,
			TRANSVERSE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDEBIRTHCHILDPOSITIO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDEBIRTHCHILDPOSITIONvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDEBIRTHCHILDPOSITIO Nvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHCHILDPOSITIONvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEBIRTHCHILDPOSITIONvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEBIRTHCHILDPOSITIO Nvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHCHILDPOSITIONvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEBIRTHCHILDPOSITIONvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEBIRTHCHILDPOSITIO Nvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHCHILDPOSITIONvalues get(int value) {
		switch (value) {
			case HEAD_DOWN_VALUE: return HEAD_DOWN;
			case OTHER_HEAD_VALUE: return OTHER_HEAD;
			case BREECH_VALUE: return BREECH;
			case TRANSVERSE_VALUE: return TRANSVERSE;
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
	private CDEBIRTHCHILDPOSITIONvalues(int value, String name, String literal) {
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
	
} //CDEBIRTHCHILDPOSITIONvalues
