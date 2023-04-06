/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDBVTSAMPLETYP Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDBVTSAMPLETYPEvalues()
 * @model extendedMetaData="name='CD-BVT-SAMPLETYPEvalues'"
 * @generated
 */
public enum CDBVTSAMPLETYPEvalues implements Enumerator {
	/**
	 * The '<em><b>Primarytumor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARYTUMOR_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARYTUMOR(0, "primarytumor", "primarytumor"),

	/**
	 * The '<em><b>Metastasis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METASTASIS_VALUE
	 * @generated
	 * @ordered
	 */
	METASTASIS(1, "metastasis", "metastasis"),

	/**
	 * The '<em><b>Normaltissue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMALTISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	NORMALTISSUE(2, "normaltissue", "normaltissue"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "other", "other");

	/**
	 * The '<em><b>Primarytumor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARYTUMOR
	 * @model name="primarytumor"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARYTUMOR_VALUE = 0;

	/**
	 * The '<em><b>Metastasis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METASTASIS
	 * @model name="metastasis"
	 * @generated
	 * @ordered
	 */
	public static final int METASTASIS_VALUE = 1;

	/**
	 * The '<em><b>Normaltissue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMALTISSUE
	 * @model name="normaltissue"
	 * @generated
	 * @ordered
	 */
	public static final int NORMALTISSUE_VALUE = 2;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDBVTSAMPLETYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDBVTSAMPLETYPEvalues[] VALUES_ARRAY =
		new CDBVTSAMPLETYPEvalues[] {
			PRIMARYTUMOR,
			METASTASIS,
			NORMALTISSUE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>CDBVTSAMPLETYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDBVTSAMPLETYPEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDBVTSAMPLETYP Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDBVTSAMPLETYPEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDBVTSAMPLETYPEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDBVTSAMPLETYP Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDBVTSAMPLETYPEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDBVTSAMPLETYPEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDBVTSAMPLETYP Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDBVTSAMPLETYPEvalues get(int value) {
		switch (value) {
			case PRIMARYTUMOR_VALUE: return PRIMARYTUMOR;
			case METASTASIS_VALUE: return METASTASIS;
			case NORMALTISSUE_VALUE: return NORMALTISSUE;
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
	private CDBVTSAMPLETYPEvalues(int value, String name, String literal) {
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
	
} //CDBVTSAMPLETYPEvalues
