/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDGALENICFOR Mschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDGALENICFORMschemes()
 * @model extendedMetaData="name='CD-GALENICFORMschemes'"
 * @generated
 */
public enum CDGALENICFORMschemes implements Enumerator {
	/**
	 * The '<em><b>CDDRUGPRESENTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDRUGPRESENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDDRUGPRESENTATION(0, "CDDRUGPRESENTATION", "CD-DRUG-PRESENTATION"),

	/**
	 * The '<em><b>CDMAGISTRALFORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMAGISTRALFORM_VALUE
	 * @generated
	 * @ordered
	 */
	CDMAGISTRALFORM(1, "CDMAGISTRALFORM", "CD-MAGISTRALFORM");

	/**
	 * The '<em><b>CDDRUGPRESENTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDRUGPRESENTATION
	 * @model literal="CD-DRUG-PRESENTATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDDRUGPRESENTATION_VALUE = 0;

	/**
	 * The '<em><b>CDMAGISTRALFORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMAGISTRALFORM
	 * @model literal="CD-MAGISTRALFORM"
	 * @generated
	 * @ordered
	 */
	public static final int CDMAGISTRALFORM_VALUE = 1;

	/**
	 * An array of all the '<em><b>CDGALENICFOR Mschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDGALENICFORMschemes[] VALUES_ARRAY =
		new CDGALENICFORMschemes[] {
			CDDRUGPRESENTATION,
			CDMAGISTRALFORM,
		};

	/**
	 * A public read-only list of all the '<em><b>CDGALENICFOR Mschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDGALENICFORMschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDGALENICFOR Mschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDGALENICFORMschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDGALENICFORMschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDGALENICFOR Mschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDGALENICFORMschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDGALENICFORMschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDGALENICFOR Mschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDGALENICFORMschemes get(int value) {
		switch (value) {
			case CDDRUGPRESENTATION_VALUE: return CDDRUGPRESENTATION;
			case CDMAGISTRALFORM_VALUE: return CDMAGISTRALFORM;
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
	private CDGALENICFORMschemes(int value, String name, String literal) {
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
	
} //CDGALENICFORMschemes
