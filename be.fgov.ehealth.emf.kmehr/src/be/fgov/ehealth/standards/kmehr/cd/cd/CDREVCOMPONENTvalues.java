/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDREVCOMPONEN Tvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDREVCOMPONENTvalues()
 * @model extendedMetaData="name='CD-REV-COMPONENTvalues'"
 * @generated
 */
public enum CDREVCOMPONENTvalues implements Enumerator {
	/**
	 * The '<em><b>Patella</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATELLA_VALUE
	 * @generated
	 * @ordered
	 */
	PATELLA(0, "patella", "patella"),

	/**
	 * The '<em><b>Femur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMUR_VALUE
	 * @generated
	 * @ordered
	 */
	FEMUR(1, "femur", "femur"),

	/**
	 * The '<em><b>Tibia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIBIA_VALUE
	 * @generated
	 * @ordered
	 */
	TIBIA(2, "tibia", "tibia"),

	/**
	 * The '<em><b>Insert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT(3, "insert", "insert");

	/**
	 * The '<em><b>Patella</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATELLA
	 * @model name="patella"
	 * @generated
	 * @ordered
	 */
	public static final int PATELLA_VALUE = 0;

	/**
	 * The '<em><b>Femur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMUR
	 * @model name="femur"
	 * @generated
	 * @ordered
	 */
	public static final int FEMUR_VALUE = 1;

	/**
	 * The '<em><b>Tibia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIBIA
	 * @model name="tibia"
	 * @generated
	 * @ordered
	 */
	public static final int TIBIA_VALUE = 2;

	/**
	 * The '<em><b>Insert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT
	 * @model name="insert"
	 * @generated
	 * @ordered
	 */
	public static final int INSERT_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDREVCOMPONEN Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDREVCOMPONENTvalues[] VALUES_ARRAY =
		new CDREVCOMPONENTvalues[] {
			PATELLA,
			FEMUR,
			TIBIA,
			INSERT,
		};

	/**
	 * A public read-only list of all the '<em><b>CDREVCOMPONEN Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDREVCOMPONENTvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDREVCOMPONEN Tvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDREVCOMPONENTvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDREVCOMPONENTvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDREVCOMPONEN Tvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDREVCOMPONENTvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDREVCOMPONENTvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDREVCOMPONEN Tvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDREVCOMPONENTvalues get(int value) {
		switch (value) {
			case PATELLA_VALUE: return PATELLA;
			case FEMUR_VALUE: return FEMUR;
			case TIBIA_VALUE: return TIBIA;
			case INSERT_VALUE: return INSERT;
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
	private CDREVCOMPONENTvalues(int value, String name, String literal) {
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
	
} //CDREVCOMPONENTvalues
