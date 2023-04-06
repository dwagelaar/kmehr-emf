/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDEBIRTHFOETALMONITORIN Gvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDEBIRTHFOETALMONITORINGvalues()
 * @model extendedMetaData="name='CD-EBIRTH-FOETALMONITORINGvalues'"
 * @generated
 */
public enum CDEBIRTHFOETALMONITORINGvalues implements Enumerator {
	/**
	 * The '<em><b>CTG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTG_VALUE
	 * @generated
	 * @ordered
	 */
	CTG(0, "CTG", "CTG"),

	/**
	 * The '<em><b>STAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAN_VALUE
	 * @generated
	 * @ordered
	 */
	STAN(1, "STAN", "STAN"),

	/**
	 * The '<em><b>MBE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MBE_VALUE
	 * @generated
	 * @ordered
	 */
	MBE(2, "MBE", "MBE"),

	/**
	 * The '<em><b>Intermittent Auscultation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMITTENT_AUSCULTATION_VALUE
	 * @generated
	 * @ordered
	 */
	INTERMITTENT_AUSCULTATION(3, "intermittentAuscultation", "intermittent-auscultation");

	/**
	 * The '<em><b>CTG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CTG_VALUE = 0;

	/**
	 * The '<em><b>STAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STAN_VALUE = 1;

	/**
	 * The '<em><b>MBE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MBE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MBE_VALUE = 2;

	/**
	 * The '<em><b>Intermittent Auscultation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMITTENT_AUSCULTATION
	 * @model name="intermittentAuscultation" literal="intermittent-auscultation"
	 * @generated
	 * @ordered
	 */
	public static final int INTERMITTENT_AUSCULTATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDEBIRTHFOETALMONITORIN Gvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDEBIRTHFOETALMONITORINGvalues[] VALUES_ARRAY =
		new CDEBIRTHFOETALMONITORINGvalues[] {
			CTG,
			STAN,
			MBE,
			INTERMITTENT_AUSCULTATION,
		};

	/**
	 * A public read-only list of all the '<em><b>CDEBIRTHFOETALMONITORIN Gvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDEBIRTHFOETALMONITORINGvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDEBIRTHFOETALMONITORIN Gvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHFOETALMONITORINGvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEBIRTHFOETALMONITORINGvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEBIRTHFOETALMONITORIN Gvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHFOETALMONITORINGvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEBIRTHFOETALMONITORINGvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEBIRTHFOETALMONITORIN Gvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHFOETALMONITORINGvalues get(int value) {
		switch (value) {
			case CTG_VALUE: return CTG;
			case STAN_VALUE: return STAN;
			case MBE_VALUE: return MBE;
			case INTERMITTENT_AUSCULTATION_VALUE: return INTERMITTENT_AUSCULTATION;
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
	private CDEBIRTHFOETALMONITORINGvalues(int value, String name, String literal) {
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
	
} //CDEBIRTHFOETALMONITORINGvalues
