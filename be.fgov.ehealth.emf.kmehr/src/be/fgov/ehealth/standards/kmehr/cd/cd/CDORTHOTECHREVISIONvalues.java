/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDORTHOTECHREVISIO Nvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDORTHOTECHREVISIONvalues()
 * @model extendedMetaData="name='CD-ORTHO-TECHREVISIONvalues'"
 * @generated
 */
public enum CDORTHOTECHREVISIONvalues implements Enumerator {
	/**
	 * The '<em><b>Femoralheadneck</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMORALHEADNECK_VALUE
	 * @generated
	 * @ordered
	 */
	FEMORALHEADNECK(0, "femoralheadneck", "femoralheadneck"),

	/**
	 * The '<em><b>Femoralcomplete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMORALCOMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	FEMORALCOMPLETE(1, "femoralcomplete", "femoralcomplete"),

	/**
	 * The '<em><b>Acetabularinsert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACETABULARINSERT_VALUE
	 * @generated
	 * @ordered
	 */
	ACETABULARINSERT(2, "acetabularinsert", "acetabularinsert"),

	/**
	 * The '<em><b>Acetabularcomplete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACETABULARCOMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	ACETABULARCOMPLETE(3, "acetabularcomplete", "acetabularcomplete");

	/**
	 * The '<em><b>Femoralheadneck</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMORALHEADNECK
	 * @model name="femoralheadneck"
	 * @generated
	 * @ordered
	 */
	public static final int FEMORALHEADNECK_VALUE = 0;

	/**
	 * The '<em><b>Femoralcomplete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMORALCOMPLETE
	 * @model name="femoralcomplete"
	 * @generated
	 * @ordered
	 */
	public static final int FEMORALCOMPLETE_VALUE = 1;

	/**
	 * The '<em><b>Acetabularinsert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACETABULARINSERT
	 * @model name="acetabularinsert"
	 * @generated
	 * @ordered
	 */
	public static final int ACETABULARINSERT_VALUE = 2;

	/**
	 * The '<em><b>Acetabularcomplete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACETABULARCOMPLETE
	 * @model name="acetabularcomplete"
	 * @generated
	 * @ordered
	 */
	public static final int ACETABULARCOMPLETE_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDORTHOTECHREVISIO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDORTHOTECHREVISIONvalues[] VALUES_ARRAY =
		new CDORTHOTECHREVISIONvalues[] {
			FEMORALHEADNECK,
			FEMORALCOMPLETE,
			ACETABULARINSERT,
			ACETABULARCOMPLETE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDORTHOTECHREVISIO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDORTHOTECHREVISIONvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDORTHOTECHREVISIO Nvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDORTHOTECHREVISIONvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDORTHOTECHREVISIONvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDORTHOTECHREVISIO Nvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDORTHOTECHREVISIONvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDORTHOTECHREVISIONvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDORTHOTECHREVISIO Nvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDORTHOTECHREVISIONvalues get(int value) {
		switch (value) {
			case FEMORALHEADNECK_VALUE: return FEMORALHEADNECK;
			case FEMORALCOMPLETE_VALUE: return FEMORALCOMPLETE;
			case ACETABULARINSERT_VALUE: return ACETABULARINSERT;
			case ACETABULARCOMPLETE_VALUE: return ACETABULARCOMPLETE;
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
	private CDORTHOTECHREVISIONvalues(int value, String name, String literal) {
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
	
} //CDORTHOTECHREVISIONvalues
