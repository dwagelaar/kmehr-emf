/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDITEMBV Tvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDITEMBVTvalues()
 * @model extendedMetaData="name='CD-ITEM-BVTvalues'"
 * @generated
 */
public enum CDITEMBVTvalues implements Enumerator {
	/**
	 * The '<em><b>Referenceid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCEID_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCEID(0, "referenceid", "referenceid"),

	/**
	 * The '<em><b>Patientopposition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENTOPPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENTOPPOSITION(1, "patientopposition", "patientopposition"),

	/**
	 * The '<em><b>Sample</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLE(2, "sample", "sample"),

	/**
	 * The '<em><b>Biopsynumber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOPSYNUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	BIOPSYNUMBER(3, "biopsynumber", "biopsynumber"),

	/**
	 * The '<em><b>Technicalremarks</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICALREMARKS_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNICALREMARKS(4, "technicalremarks", "technicalremarks"),

	/**
	 * The '<em><b>Lab</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAB_VALUE
	 * @generated
	 * @ordered
	 */
	LAB(5, "lab", "lab"),

	/**
	 * The '<em><b>Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(6, "error", "error"),

	/**
	 * The '<em><b>Status</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS(7, "status", "status");

	/**
	 * The '<em><b>Referenceid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCEID
	 * @model name="referenceid"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCEID_VALUE = 0;

	/**
	 * The '<em><b>Patientopposition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENTOPPOSITION
	 * @model name="patientopposition"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENTOPPOSITION_VALUE = 1;

	/**
	 * The '<em><b>Sample</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLE
	 * @model name="sample"
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLE_VALUE = 2;

	/**
	 * The '<em><b>Biopsynumber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOPSYNUMBER
	 * @model name="biopsynumber"
	 * @generated
	 * @ordered
	 */
	public static final int BIOPSYNUMBER_VALUE = 3;

	/**
	 * The '<em><b>Technicalremarks</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICALREMARKS
	 * @model name="technicalremarks"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNICALREMARKS_VALUE = 4;

	/**
	 * The '<em><b>Lab</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAB
	 * @model name="lab"
	 * @generated
	 * @ordered
	 */
	public static final int LAB_VALUE = 5;

	/**
	 * The '<em><b>Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @model name="error"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 6;

	/**
	 * The '<em><b>Status</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS
	 * @model name="status"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_VALUE = 7;

	/**
	 * An array of all the '<em><b>CDITEMBV Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDITEMBVTvalues[] VALUES_ARRAY =
		new CDITEMBVTvalues[] {
			REFERENCEID,
			PATIENTOPPOSITION,
			SAMPLE,
			BIOPSYNUMBER,
			TECHNICALREMARKS,
			LAB,
			ERROR,
			STATUS,
		};

	/**
	 * A public read-only list of all the '<em><b>CDITEMBV Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDITEMBVTvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDITEMBV Tvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMBVTvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMBVTvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITEMBV Tvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMBVTvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMBVTvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITEMBV Tvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMBVTvalues get(int value) {
		switch (value) {
			case REFERENCEID_VALUE: return REFERENCEID;
			case PATIENTOPPOSITION_VALUE: return PATIENTOPPOSITION;
			case SAMPLE_VALUE: return SAMPLE;
			case BIOPSYNUMBER_VALUE: return BIOPSYNUMBER;
			case TECHNICALREMARKS_VALUE: return TECHNICALREMARKS;
			case LAB_VALUE: return LAB;
			case ERROR_VALUE: return ERROR;
			case STATUS_VALUE: return STATUS;
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
	private CDITEMBVTvalues(int value, String name, String literal) {
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
	
} //CDITEMBVTvalues
