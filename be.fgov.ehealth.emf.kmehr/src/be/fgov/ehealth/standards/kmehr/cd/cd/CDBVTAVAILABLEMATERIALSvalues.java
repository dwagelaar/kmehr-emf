/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDBVTAVAILABLEMATERIAL Svalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDBVTAVAILABLEMATERIALSvalues()
 * @model extendedMetaData="name='CD-BVT-AVAILABLEMATERIALSvalues'"
 * @generated
 */
public enum CDBVTAVAILABLEMATERIALSvalues implements Enumerator {
	/**
	 * The '<em><b>Cytology</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYTOLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	CYTOLOGY(0, "cytology", "cytology"),

	/**
	 * The '<em><b>Dna</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNA_VALUE
	 * @generated
	 * @ordered
	 */
	DNA(1, "dna", "dna"),

	/**
	 * The '<em><b>Rna</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RNA_VALUE
	 * @generated
	 * @ordered
	 */
	RNA(2, "rna", "rna"),

	/**
	 * The '<em><b>Proteins</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTEINS_VALUE
	 * @generated
	 * @ordered
	 */
	PROTEINS(3, "proteins", "proteins"),

	/**
	 * The '<em><b>Correspondingnormaltissue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRESPONDINGNORMALTISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	CORRESPONDINGNORMALTISSUE(4, "correspondingnormaltissue", "correspondingnormaltissue"),

	/**
	 * The '<em><b>Tissue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	TISSUE(5, "tissue", "tissue"),

	/**
	 * The '<em><b>Serum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERUM_VALUE
	 * @generated
	 * @ordered
	 */
	SERUM(6, "serum", "serum"),

	/**
	 * The '<em><b>Plasma</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLASMA_VALUE
	 * @generated
	 * @ordered
	 */
	PLASMA(7, "plasma", "plasma"),

	/**
	 * The '<em><b>Blood</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOOD_VALUE
	 * @generated
	 * @ordered
	 */
	BLOOD(8, "blood", "blood"),

	/**
	 * The '<em><b>Urine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URINE_VALUE
	 * @generated
	 * @ordered
	 */
	URINE(9, "urine", "urine"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(10, "other", "other");

	/**
	 * The '<em><b>Cytology</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYTOLOGY
	 * @model name="cytology"
	 * @generated
	 * @ordered
	 */
	public static final int CYTOLOGY_VALUE = 0;

	/**
	 * The '<em><b>Dna</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNA
	 * @model name="dna"
	 * @generated
	 * @ordered
	 */
	public static final int DNA_VALUE = 1;

	/**
	 * The '<em><b>Rna</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RNA
	 * @model name="rna"
	 * @generated
	 * @ordered
	 */
	public static final int RNA_VALUE = 2;

	/**
	 * The '<em><b>Proteins</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTEINS
	 * @model name="proteins"
	 * @generated
	 * @ordered
	 */
	public static final int PROTEINS_VALUE = 3;

	/**
	 * The '<em><b>Correspondingnormaltissue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRESPONDINGNORMALTISSUE
	 * @model name="correspondingnormaltissue"
	 * @generated
	 * @ordered
	 */
	public static final int CORRESPONDINGNORMALTISSUE_VALUE = 4;

	/**
	 * The '<em><b>Tissue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TISSUE
	 * @model name="tissue"
	 * @generated
	 * @ordered
	 */
	public static final int TISSUE_VALUE = 5;

	/**
	 * The '<em><b>Serum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERUM
	 * @model name="serum"
	 * @generated
	 * @ordered
	 */
	public static final int SERUM_VALUE = 6;

	/**
	 * The '<em><b>Plasma</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLASMA
	 * @model name="plasma"
	 * @generated
	 * @ordered
	 */
	public static final int PLASMA_VALUE = 7;

	/**
	 * The '<em><b>Blood</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOOD
	 * @model name="blood"
	 * @generated
	 * @ordered
	 */
	public static final int BLOOD_VALUE = 8;

	/**
	 * The '<em><b>Urine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URINE
	 * @model name="urine"
	 * @generated
	 * @ordered
	 */
	public static final int URINE_VALUE = 9;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 10;

	/**
	 * An array of all the '<em><b>CDBVTAVAILABLEMATERIAL Svalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDBVTAVAILABLEMATERIALSvalues[] VALUES_ARRAY =
		new CDBVTAVAILABLEMATERIALSvalues[] {
			CYTOLOGY,
			DNA,
			RNA,
			PROTEINS,
			CORRESPONDINGNORMALTISSUE,
			TISSUE,
			SERUM,
			PLASMA,
			BLOOD,
			URINE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>CDBVTAVAILABLEMATERIAL Svalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDBVTAVAILABLEMATERIALSvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDBVTAVAILABLEMATERIAL Svalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDBVTAVAILABLEMATERIALSvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDBVTAVAILABLEMATERIALSvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDBVTAVAILABLEMATERIAL Svalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDBVTAVAILABLEMATERIALSvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDBVTAVAILABLEMATERIALSvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDBVTAVAILABLEMATERIAL Svalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDBVTAVAILABLEMATERIALSvalues get(int value) {
		switch (value) {
			case CYTOLOGY_VALUE: return CYTOLOGY;
			case DNA_VALUE: return DNA;
			case RNA_VALUE: return RNA;
			case PROTEINS_VALUE: return PROTEINS;
			case CORRESPONDINGNORMALTISSUE_VALUE: return CORRESPONDINGNORMALTISSUE;
			case TISSUE_VALUE: return TISSUE;
			case SERUM_VALUE: return SERUM;
			case PLASMA_VALUE: return PLASMA;
			case BLOOD_VALUE: return BLOOD;
			case URINE_VALUE: return URINE;
			case OTHER_VALUE: return OTHER;
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
	private CDBVTAVAILABLEMATERIALSvalues(int value, String name, String literal) {
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
	
} //CDBVTAVAILABLEMATERIALSvalues
