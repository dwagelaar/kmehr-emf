/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDCOUNTR Yschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDCOUNTRYschemes()
 * @model extendedMetaData="name='CD-COUNTRYschemes'"
 * @generated
 */
public enum CDCOUNTRYschemes implements Enumerator {
	/**
	 * The '<em><b>CDCOUNTRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCOUNTRY_VALUE
	 * @generated
	 * @ordered
	 */
	CDCOUNTRY(0, "CDCOUNTRY", "CD-COUNTRY"),

	/**
	 * The '<em><b>CDFEDCOUNTRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDFEDCOUNTRY_VALUE
	 * @generated
	 * @ordered
	 */
	CDFEDCOUNTRY(1, "CDFEDCOUNTRY", "CD-FED-COUNTRY");

	/**
	 * The '<em><b>CDCOUNTRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCOUNTRY
	 * @model literal="CD-COUNTRY"
	 * @generated
	 * @ordered
	 */
	public static final int CDCOUNTRY_VALUE = 0;

	/**
	 * The '<em><b>CDFEDCOUNTRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDFEDCOUNTRY
	 * @model literal="CD-FED-COUNTRY"
	 * @generated
	 * @ordered
	 */
	public static final int CDFEDCOUNTRY_VALUE = 1;

	/**
	 * An array of all the '<em><b>CDCOUNTR Yschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDCOUNTRYschemes[] VALUES_ARRAY =
		new CDCOUNTRYschemes[] {
			CDCOUNTRY,
			CDFEDCOUNTRY,
		};

	/**
	 * A public read-only list of all the '<em><b>CDCOUNTR Yschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDCOUNTRYschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDCOUNTR Yschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCOUNTRYschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCOUNTRYschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCOUNTR Yschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCOUNTRYschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCOUNTRYschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCOUNTR Yschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCOUNTRYschemes get(int value) {
		switch (value) {
			case CDCOUNTRY_VALUE: return CDCOUNTRY;
			case CDFEDCOUNTRY_VALUE: return CDFEDCOUNTRY;
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
	private CDCOUNTRYschemes(int value, String name, String literal) {
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
	
} //CDCOUNTRYschemes
