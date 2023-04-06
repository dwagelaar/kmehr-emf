/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDEBIRTHDELIVERYWA Yvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDEBIRTHDELIVERYWAYvalues()
 * @model extendedMetaData="name='CD-EBIRTH-DELIVERYWAYvalues'"
 * @generated
 */
public enum CDEBIRTHDELIVERYWAYvalues implements Enumerator {
	/**
	 * The '<em><b>Spontaneous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPONTANEOUS_VALUE
	 * @generated
	 * @ordered
	 */
	SPONTANEOUS(0, "spontaneous", "spontaneous"),

	/**
	 * The '<em><b>Vacuum Extraction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VACUUM_EXTRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	VACUUM_EXTRACTION(1, "vacuumExtraction", "vacuum-extraction"),

	/**
	 * The '<em><b>Forceps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORCEPS_VALUE
	 * @generated
	 * @ordered
	 */
	FORCEPS(2, "forceps", "forceps"),

	/**
	 * The '<em><b>Primary Caesarean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_CAESAREAN_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARY_CAESAREAN(3, "primaryCaesarean", "primary-caesarean"),

	/**
	 * The '<em><b>Secondary Caesarean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDARY_CAESAREAN_VALUE
	 * @generated
	 * @ordered
	 */
	SECONDARY_CAESAREAN(4, "secondaryCaesarean", "secondary-caesarean"),

	/**
	 * The '<em><b>Vaginal Breech</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAGINAL_BREECH_VALUE
	 * @generated
	 * @ordered
	 */
	VAGINAL_BREECH(5, "vaginalBreech", "vaginal breech");

	/**
	 * The '<em><b>Spontaneous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPONTANEOUS
	 * @model name="spontaneous"
	 * @generated
	 * @ordered
	 */
	public static final int SPONTANEOUS_VALUE = 0;

	/**
	 * The '<em><b>Vacuum Extraction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VACUUM_EXTRACTION
	 * @model name="vacuumExtraction" literal="vacuum-extraction"
	 * @generated
	 * @ordered
	 */
	public static final int VACUUM_EXTRACTION_VALUE = 1;

	/**
	 * The '<em><b>Forceps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORCEPS
	 * @model name="forceps"
	 * @generated
	 * @ordered
	 */
	public static final int FORCEPS_VALUE = 2;

	/**
	 * The '<em><b>Primary Caesarean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_CAESAREAN
	 * @model name="primaryCaesarean" literal="primary-caesarean"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARY_CAESAREAN_VALUE = 3;

	/**
	 * The '<em><b>Secondary Caesarean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDARY_CAESAREAN
	 * @model name="secondaryCaesarean" literal="secondary-caesarean"
	 * @generated
	 * @ordered
	 */
	public static final int SECONDARY_CAESAREAN_VALUE = 4;

	/**
	 * The '<em><b>Vaginal Breech</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAGINAL_BREECH
	 * @model name="vaginalBreech" literal="vaginal breech"
	 * @generated
	 * @ordered
	 */
	public static final int VAGINAL_BREECH_VALUE = 5;

	/**
	 * An array of all the '<em><b>CDEBIRTHDELIVERYWA Yvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDEBIRTHDELIVERYWAYvalues[] VALUES_ARRAY =
		new CDEBIRTHDELIVERYWAYvalues[] {
			SPONTANEOUS,
			VACUUM_EXTRACTION,
			FORCEPS,
			PRIMARY_CAESAREAN,
			SECONDARY_CAESAREAN,
			VAGINAL_BREECH,
		};

	/**
	 * A public read-only list of all the '<em><b>CDEBIRTHDELIVERYWA Yvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDEBIRTHDELIVERYWAYvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDEBIRTHDELIVERYWA Yvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHDELIVERYWAYvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEBIRTHDELIVERYWAYvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEBIRTHDELIVERYWA Yvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHDELIVERYWAYvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEBIRTHDELIVERYWAYvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEBIRTHDELIVERYWA Yvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHDELIVERYWAYvalues get(int value) {
		switch (value) {
			case SPONTANEOUS_VALUE: return SPONTANEOUS;
			case VACUUM_EXTRACTION_VALUE: return VACUUM_EXTRACTION;
			case FORCEPS_VALUE: return FORCEPS;
			case PRIMARY_CAESAREAN_VALUE: return PRIMARY_CAESAREAN;
			case SECONDARY_CAESAREAN_VALUE: return SECONDARY_CAESAREAN;
			case VAGINAL_BREECH_VALUE: return VAGINAL_BREECH;
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
	private CDEBIRTHDELIVERYWAYvalues(int value, String name, String literal) {
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
	
} //CDEBIRTHDELIVERYWAYvalues
