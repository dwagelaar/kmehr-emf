/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDMAARESPONSETYP Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDMAARESPONSETYPEvalues()
 * @model extendedMetaData="name='CD-MAA-RESPONSETYPEvalues'"
 * @generated
 */
public enum CDMAARESPONSETYPEvalues implements Enumerator {
	/**
	 * The '<em><b>Agreement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	AGREEMENT(0, "agreement", "agreement"),

	/**
	 * The '<em><b>Refusal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSAL_VALUE
	 * @generated
	 * @ordered
	 */
	REFUSAL(1, "refusal", "refusal"),

	/**
	 * The '<em><b>Intreatment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTREATMENT_VALUE
	 * @generated
	 * @ordered
	 */
	INTREATMENT(2, "intreatment", "intreatment");

	/**
	 * The '<em><b>Agreement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENT
	 * @model name="agreement"
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT_VALUE = 0;

	/**
	 * The '<em><b>Refusal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSAL
	 * @model name="refusal"
	 * @generated
	 * @ordered
	 */
	public static final int REFUSAL_VALUE = 1;

	/**
	 * The '<em><b>Intreatment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTREATMENT
	 * @model name="intreatment"
	 * @generated
	 * @ordered
	 */
	public static final int INTREATMENT_VALUE = 2;

	/**
	 * An array of all the '<em><b>CDMAARESPONSETYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDMAARESPONSETYPEvalues[] VALUES_ARRAY =
		new CDMAARESPONSETYPEvalues[] {
			AGREEMENT,
			REFUSAL,
			INTREATMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>CDMAARESPONSETYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDMAARESPONSETYPEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDMAARESPONSETYP Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMAARESPONSETYPEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDMAARESPONSETYPEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDMAARESPONSETYP Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMAARESPONSETYPEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDMAARESPONSETYPEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDMAARESPONSETYP Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMAARESPONSETYPEvalues get(int value) {
		switch (value) {
			case AGREEMENT_VALUE: return AGREEMENT;
			case REFUSAL_VALUE: return REFUSAL;
			case INTREATMENT_VALUE: return INTREATMENT;
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
	private CDMAARESPONSETYPEvalues(int value, String name, String literal) {
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
	
} //CDMAARESPONSETYPEvalues
