/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDORTHOGRAF Tvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDORTHOGRAFTvalues()
 * @model extendedMetaData="name='CD-ORTHO-GRAFTvalues'"
 * @generated
 */
public enum CDORTHOGRAFTvalues implements Enumerator {
	/**
	 * The '<em><b>Allograft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOGRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOGRAFT(0, "allograft", "allograft"),

	/**
	 * The '<em><b>Homograft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOMOGRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	HOMOGRAFT(1, "homograft", "homograft"),

	/**
	 * The '<em><b>Autograft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOGRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOGRAFT(2, "autograft", "autograft"),

	/**
	 * The '<em><b>Alloandautograft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOANDAUTOGRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOANDAUTOGRAFT(3, "alloandautograft", "alloandautograft"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(4, "none", "none");

	/**
	 * The '<em><b>Allograft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOGRAFT
	 * @model name="allograft"
	 * @generated
	 * @ordered
	 */
	public static final int ALLOGRAFT_VALUE = 0;

	/**
	 * The '<em><b>Homograft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOMOGRAFT
	 * @model name="homograft"
	 * @generated
	 * @ordered
	 */
	public static final int HOMOGRAFT_VALUE = 1;

	/**
	 * The '<em><b>Autograft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOGRAFT
	 * @model name="autograft"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOGRAFT_VALUE = 2;

	/**
	 * The '<em><b>Alloandautograft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOANDAUTOGRAFT
	 * @model name="alloandautograft"
	 * @generated
	 * @ordered
	 */
	public static final int ALLOANDAUTOGRAFT_VALUE = 3;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 4;

	/**
	 * An array of all the '<em><b>CDORTHOGRAF Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDORTHOGRAFTvalues[] VALUES_ARRAY =
		new CDORTHOGRAFTvalues[] {
			ALLOGRAFT,
			HOMOGRAFT,
			AUTOGRAFT,
			ALLOANDAUTOGRAFT,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDORTHOGRAF Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDORTHOGRAFTvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDORTHOGRAF Tvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDORTHOGRAFTvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDORTHOGRAFTvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDORTHOGRAF Tvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDORTHOGRAFTvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDORTHOGRAFTvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDORTHOGRAF Tvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDORTHOGRAFTvalues get(int value) {
		switch (value) {
			case ALLOGRAFT_VALUE: return ALLOGRAFT;
			case HOMOGRAFT_VALUE: return HOMOGRAFT;
			case AUTOGRAFT_VALUE: return AUTOGRAFT;
			case ALLOANDAUTOGRAFT_VALUE: return ALLOANDAUTOGRAFT;
			case NONE_VALUE: return NONE;
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
	private CDORTHOGRAFTvalues(int value, String name, String literal) {
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
	
} //CDORTHOGRAFTvalues
