/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDUNI Tschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDUNITschemes()
 * @model extendedMetaData="name='CD-UNITschemes'"
 * @generated
 */
public enum CDUNITschemes implements Enumerator {
	/**
	 * The '<em><b>CDUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	CDUNIT(0, "CDUNIT", "CD-UNIT"),

	/**
	 * The '<em><b>CDCURRENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCURRENCY_VALUE
	 * @generated
	 * @ordered
	 */
	CDCURRENCY(1, "CDCURRENCY", "CD-CURRENCY"),

	/**
	 * The '<em><b>UCUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UCUM_VALUE
	 * @generated
	 * @ordered
	 */
	UCUM(2, "UCUM", "UCUM"),

	/**
	 * The '<em><b>CDTIMEUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTIMEUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	CDTIMEUNIT(3, "CDTIMEUNIT", "CD-TIMEUNIT");

	/**
	 * The '<em><b>CDUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDUNIT
	 * @model literal="CD-UNIT"
	 * @generated
	 * @ordered
	 */
	public static final int CDUNIT_VALUE = 0;

	/**
	 * The '<em><b>CDCURRENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCURRENCY
	 * @model literal="CD-CURRENCY"
	 * @generated
	 * @ordered
	 */
	public static final int CDCURRENCY_VALUE = 1;

	/**
	 * The '<em><b>UCUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UCUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UCUM_VALUE = 2;

	/**
	 * The '<em><b>CDTIMEUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTIMEUNIT
	 * @model literal="CD-TIMEUNIT"
	 * @generated
	 * @ordered
	 */
	public static final int CDTIMEUNIT_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDUNI Tschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDUNITschemes[] VALUES_ARRAY =
		new CDUNITschemes[] {
			CDUNIT,
			CDCURRENCY,
			UCUM,
			CDTIMEUNIT,
		};

	/**
	 * A public read-only list of all the '<em><b>CDUNI Tschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDUNITschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDUNI Tschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDUNITschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDUNITschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDUNI Tschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDUNITschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDUNITschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDUNI Tschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDUNITschemes get(int value) {
		switch (value) {
			case CDUNIT_VALUE: return CDUNIT;
			case CDCURRENCY_VALUE: return CDCURRENCY;
			case UCUM_VALUE: return UCUM;
			case CDTIMEUNIT_VALUE: return CDTIMEUNIT;
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
	private CDUNITschemes(int value, String name, String literal) {
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
	
} //CDUNITschemes
