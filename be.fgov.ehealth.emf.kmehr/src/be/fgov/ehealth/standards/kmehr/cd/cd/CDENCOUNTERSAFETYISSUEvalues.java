/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDENCOUNTERSAFETYISSU Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDENCOUNTERSAFETYISSUEvalues()
 * @model extendedMetaData="name='CD-ENCOUNTERSAFETYISSUEvalues'"
 * @generated
 */
public enum CDENCOUNTERSAFETYISSUEvalues implements Enumerator {
	/**
	 * The '<em><b>Verbal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERBAL_VALUE
	 * @generated
	 * @ordered
	 */
	VERBAL(0, "verbal", "verbal"),

	/**
	 * The '<em><b>Fysical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FYSICAL_VALUE
	 * @generated
	 * @ordered
	 */
	FYSICAL(1, "fysical", "fysical"),

	/**
	 * The '<em><b>Material</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	MATERIAL(2, "material", "material"),

	/**
	 * The '<em><b>Notificationtopolice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATIONTOPOLICE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTIFICATIONTOPOLICE(3, "notificationtopolice", "notificationtopolice");

	/**
	 * The '<em><b>Verbal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERBAL
	 * @model name="verbal"
	 * @generated
	 * @ordered
	 */
	public static final int VERBAL_VALUE = 0;

	/**
	 * The '<em><b>Fysical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FYSICAL
	 * @model name="fysical"
	 * @generated
	 * @ordered
	 */
	public static final int FYSICAL_VALUE = 1;

	/**
	 * The '<em><b>Material</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATERIAL
	 * @model name="material"
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_VALUE = 2;

	/**
	 * The '<em><b>Notificationtopolice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATIONTOPOLICE
	 * @model name="notificationtopolice"
	 * @generated
	 * @ordered
	 */
	public static final int NOTIFICATIONTOPOLICE_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDENCOUNTERSAFETYISSU Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDENCOUNTERSAFETYISSUEvalues[] VALUES_ARRAY =
		new CDENCOUNTERSAFETYISSUEvalues[] {
			VERBAL,
			FYSICAL,
			MATERIAL,
			NOTIFICATIONTOPOLICE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDENCOUNTERSAFETYISSU Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDENCOUNTERSAFETYISSUEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDENCOUNTERSAFETYISSU Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDENCOUNTERSAFETYISSUEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDENCOUNTERSAFETYISSUEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDENCOUNTERSAFETYISSU Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDENCOUNTERSAFETYISSUEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDENCOUNTERSAFETYISSUEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDENCOUNTERSAFETYISSU Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDENCOUNTERSAFETYISSUEvalues get(int value) {
		switch (value) {
			case VERBAL_VALUE: return VERBAL;
			case FYSICAL_VALUE: return FYSICAL;
			case MATERIAL_VALUE: return MATERIAL;
			case NOTIFICATIONTOPOLICE_VALUE: return NOTIFICATIONTOPOLICE;
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
	private CDENCOUNTERSAFETYISSUEvalues(int value, String name, String literal) {
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
	
} //CDENCOUNTERSAFETYISSUEvalues
