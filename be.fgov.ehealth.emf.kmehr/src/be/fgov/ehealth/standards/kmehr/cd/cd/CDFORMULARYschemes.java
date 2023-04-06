/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDFORMULAR Yschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDFORMULARYschemes()
 * @model extendedMetaData="name='CD-FORMULARYschemes'"
 * @generated
 */
public enum CDFORMULARYschemes implements Enumerator {
	/**
	 * The '<em><b>CDFORMULARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDFORMULARY_VALUE
	 * @generated
	 * @ordered
	 */
	CDFORMULARY(0, "CDFORMULARY", "CD-FORMULARY"),

	/**
	 * The '<em><b>CDFORMULARYREFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDFORMULARYREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	CDFORMULARYREFERENCE(1, "CDFORMULARYREFERENCE", "CD-FORMULARYREFERENCE");

	/**
	 * The '<em><b>CDFORMULARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDFORMULARY
	 * @model literal="CD-FORMULARY"
	 * @generated
	 * @ordered
	 */
	public static final int CDFORMULARY_VALUE = 0;

	/**
	 * The '<em><b>CDFORMULARYREFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDFORMULARYREFERENCE
	 * @model literal="CD-FORMULARYREFERENCE"
	 * @generated
	 * @ordered
	 */
	public static final int CDFORMULARYREFERENCE_VALUE = 1;

	/**
	 * An array of all the '<em><b>CDFORMULAR Yschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDFORMULARYschemes[] VALUES_ARRAY =
		new CDFORMULARYschemes[] {
			CDFORMULARY,
			CDFORMULARYREFERENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDFORMULAR Yschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDFORMULARYschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDFORMULAR Yschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDFORMULARYschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDFORMULARYschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDFORMULAR Yschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDFORMULARYschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDFORMULARYschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDFORMULAR Yschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDFORMULARYschemes get(int value) {
		switch (value) {
			case CDFORMULARY_VALUE: return CDFORMULARY;
			case CDFORMULARYREFERENCE_VALUE: return CDFORMULARYREFERENCE;
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
	private CDFORMULARYschemes(int value, String name, String literal) {
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
	
} //CDFORMULARYschemes
