/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDHEADIN Gvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDHEADINGvalues()
 * @model extendedMetaData="name='CD-HEADINGvalues'"
 * @generated
 */
public enum CDHEADINGvalues implements Enumerator {
	/**
	 * The '<em><b>Assessment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSESSMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ASSESSMENT(0, "assessment", "assessment"),

	/**
	 * The '<em><b>Clinical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICAL(1, "clinical", "clinical"),

	/**
	 * The '<em><b>Clinicalplan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICALPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICALPLAN(2, "clinicalplan", "clinicalplan"),

	/**
	 * The '<em><b>Subjective</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBJECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBJECTIVE(3, "subjective", "subjective"),

	/**
	 * The '<em><b>Technical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNICAL(4, "technical", "technical"),

	/**
	 * The '<em><b>Technicalplan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICALPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNICALPLAN(5, "technicalplan", "technicalplan"),

	/**
	 * The '<em><b>Treatment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TREATMENT(6, "treatment", "treatment"),

	/**
	 * The '<em><b>Userdefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(7, "userdefined", "userdefined"),

	/**
	 * The '<em><b>History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORY(8, "history", "history"),

	/**
	 * The '<em><b>Familyhistory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILYHISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILYHISTORY(9, "familyhistory", "familyhistory"),

	/**
	 * The '<em><b>Prescription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION(10, "prescription", "prescription"),

	/**
	 * The '<em><b>Medication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION(11, "medication", "medication"),

	/**
	 * The '<em><b>Anamnesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANAMNESIS_VALUE
	 * @generated
	 * @ordered
	 */
	ANAMNESIS(12, "anamnesis", "anamnesis"),

	/**
	 * The '<em><b>Examination</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXAMINATION_VALUE
	 * @generated
	 * @ordered
	 */
	EXAMINATION(13, "examination", "examination"),

	/**
	 * The '<em><b>Plan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN(14, "plan", "plan"),

	/**
	 * The '<em><b>Outcomeevaluation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTCOMEEVALUATION_VALUE
	 * @generated
	 * @ordered
	 */
	OUTCOMEEVALUATION(15, "outcomeevaluation", "outcomeevaluation");

	/**
	 * The '<em><b>Assessment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSESSMENT
	 * @model name="assessment"
	 * @generated
	 * @ordered
	 */
	public static final int ASSESSMENT_VALUE = 0;

	/**
	 * The '<em><b>Clinical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICAL
	 * @model name="clinical"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICAL_VALUE = 1;

	/**
	 * The '<em><b>Clinicalplan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICALPLAN
	 * @model name="clinicalplan"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICALPLAN_VALUE = 2;

	/**
	 * The '<em><b>Subjective</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBJECTIVE
	 * @model name="subjective"
	 * @generated
	 * @ordered
	 */
	public static final int SUBJECTIVE_VALUE = 3;

	/**
	 * The '<em><b>Technical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL
	 * @model name="technical"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNICAL_VALUE = 4;

	/**
	 * The '<em><b>Technicalplan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICALPLAN
	 * @model name="technicalplan"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNICALPLAN_VALUE = 5;

	/**
	 * The '<em><b>Treatment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENT
	 * @model name="treatment"
	 * @generated
	 * @ordered
	 */
	public static final int TREATMENT_VALUE = 6;

	/**
	 * The '<em><b>Userdefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED
	 * @model name="userdefined"
	 * @generated
	 * @ordered
	 */
	public static final int USERDEFINED_VALUE = 7;

	/**
	 * The '<em><b>History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORY
	 * @model name="history"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORY_VALUE = 8;

	/**
	 * The '<em><b>Familyhistory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILYHISTORY
	 * @model name="familyhistory"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILYHISTORY_VALUE = 9;

	/**
	 * The '<em><b>Prescription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION
	 * @model name="prescription"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTION_VALUE = 10;

	/**
	 * The '<em><b>Medication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION
	 * @model name="medication"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_VALUE = 11;

	/**
	 * The '<em><b>Anamnesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANAMNESIS
	 * @model name="anamnesis"
	 * @generated
	 * @ordered
	 */
	public static final int ANAMNESIS_VALUE = 12;

	/**
	 * The '<em><b>Examination</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXAMINATION
	 * @model name="examination"
	 * @generated
	 * @ordered
	 */
	public static final int EXAMINATION_VALUE = 13;

	/**
	 * The '<em><b>Plan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN
	 * @model name="plan"
	 * @generated
	 * @ordered
	 */
	public static final int PLAN_VALUE = 14;

	/**
	 * The '<em><b>Outcomeevaluation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTCOMEEVALUATION
	 * @model name="outcomeevaluation"
	 * @generated
	 * @ordered
	 */
	public static final int OUTCOMEEVALUATION_VALUE = 15;

	/**
	 * An array of all the '<em><b>CDHEADIN Gvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDHEADINGvalues[] VALUES_ARRAY =
		new CDHEADINGvalues[] {
			ASSESSMENT,
			CLINICAL,
			CLINICALPLAN,
			SUBJECTIVE,
			TECHNICAL,
			TECHNICALPLAN,
			TREATMENT,
			USERDEFINED,
			HISTORY,
			FAMILYHISTORY,
			PRESCRIPTION,
			MEDICATION,
			ANAMNESIS,
			EXAMINATION,
			PLAN,
			OUTCOMEEVALUATION,
		};

	/**
	 * A public read-only list of all the '<em><b>CDHEADIN Gvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDHEADINGvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDHEADIN Gvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDHEADINGvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDHEADINGvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDHEADIN Gvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDHEADINGvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDHEADINGvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDHEADIN Gvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDHEADINGvalues get(int value) {
		switch (value) {
			case ASSESSMENT_VALUE: return ASSESSMENT;
			case CLINICAL_VALUE: return CLINICAL;
			case CLINICALPLAN_VALUE: return CLINICALPLAN;
			case SUBJECTIVE_VALUE: return SUBJECTIVE;
			case TECHNICAL_VALUE: return TECHNICAL;
			case TECHNICALPLAN_VALUE: return TECHNICALPLAN;
			case TREATMENT_VALUE: return TREATMENT;
			case USERDEFINED_VALUE: return USERDEFINED;
			case HISTORY_VALUE: return HISTORY;
			case FAMILYHISTORY_VALUE: return FAMILYHISTORY;
			case PRESCRIPTION_VALUE: return PRESCRIPTION;
			case MEDICATION_VALUE: return MEDICATION;
			case ANAMNESIS_VALUE: return ANAMNESIS;
			case EXAMINATION_VALUE: return EXAMINATION;
			case PLAN_VALUE: return PLAN;
			case OUTCOMEEVALUATION_VALUE: return OUTCOMEEVALUATION;
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
	private CDHEADINGvalues(int value, String name, String literal) {
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
	
} //CDHEADINGvalues
