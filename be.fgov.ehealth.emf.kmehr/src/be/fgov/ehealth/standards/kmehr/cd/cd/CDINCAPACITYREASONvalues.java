/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDINCAPACITYREASO Nvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDINCAPACITYREASONvalues()
 * @model extendedMetaData="name='CD-INCAPACITYREASONvalues'"
 * @generated
 */
public enum CDINCAPACITYREASONvalues implements Enumerator {
	/**
	 * The '<em><b>Sickness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SICKNESS_VALUE
	 * @generated
	 * @ordered
	 */
	SICKNESS(0, "sickness", "sickness"),

	/**
	 * The '<em><b>Accident</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCIDENT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCIDENT(1, "accident", "accident"),

	/**
	 * The '<em><b>Family</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILY_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY(2, "family", "family"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "other", "other"),

	/**
	 * The '<em><b>Careencounter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAREENCOUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	CAREENCOUNTER(4, "careencounter", "careencounter"),

	/**
	 * The '<em><b>Illness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ILLNESS_VALUE
	 * @generated
	 * @ordered
	 */
	ILLNESS(5, "illness", "illness"),

	/**
	 * The '<em><b>Hospitalisation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSPITALISATION_VALUE
	 * @generated
	 * @ordered
	 */
	HOSPITALISATION(6, "hospitalisation", "hospitalisation"),

	/**
	 * The '<em><b>Pregnancy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREGNANCY_VALUE
	 * @generated
	 * @ordered
	 */
	PREGNANCY(7, "pregnancy", "pregnancy"),

	/**
	 * The '<em><b>Workaccident</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKACCIDENT_VALUE
	 * @generated
	 * @ordered
	 */
	WORKACCIDENT(8, "workaccident", "workaccident"),

	/**
	 * The '<em><b>Occupationaldisease</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCUPATIONALDISEASE_VALUE
	 * @generated
	 * @ordered
	 */
	OCCUPATIONALDISEASE(9, "occupationaldisease", "occupationaldisease"),

	/**
	 * The '<em><b>Traveltofromworkaccident</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVELTOFROMWORKACCIDENT_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVELTOFROMWORKACCIDENT(10, "traveltofromworkaccident", "traveltofromworkaccident");

	/**
	 * The '<em><b>Sickness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SICKNESS
	 * @model name="sickness"
	 * @generated
	 * @ordered
	 */
	public static final int SICKNESS_VALUE = 0;

	/**
	 * The '<em><b>Accident</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCIDENT
	 * @model name="accident"
	 * @generated
	 * @ordered
	 */
	public static final int ACCIDENT_VALUE = 1;

	/**
	 * The '<em><b>Family</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILY
	 * @model name="family"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_VALUE = 2;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * The '<em><b>Careencounter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAREENCOUNTER
	 * @model name="careencounter"
	 * @generated
	 * @ordered
	 */
	public static final int CAREENCOUNTER_VALUE = 4;

	/**
	 * The '<em><b>Illness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ILLNESS
	 * @model name="illness"
	 * @generated
	 * @ordered
	 */
	public static final int ILLNESS_VALUE = 5;

	/**
	 * The '<em><b>Hospitalisation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSPITALISATION
	 * @model name="hospitalisation"
	 * @generated
	 * @ordered
	 */
	public static final int HOSPITALISATION_VALUE = 6;

	/**
	 * The '<em><b>Pregnancy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREGNANCY
	 * @model name="pregnancy"
	 * @generated
	 * @ordered
	 */
	public static final int PREGNANCY_VALUE = 7;

	/**
	 * The '<em><b>Workaccident</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKACCIDENT
	 * @model name="workaccident"
	 * @generated
	 * @ordered
	 */
	public static final int WORKACCIDENT_VALUE = 8;

	/**
	 * The '<em><b>Occupationaldisease</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCUPATIONALDISEASE
	 * @model name="occupationaldisease"
	 * @generated
	 * @ordered
	 */
	public static final int OCCUPATIONALDISEASE_VALUE = 9;

	/**
	 * The '<em><b>Traveltofromworkaccident</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVELTOFROMWORKACCIDENT
	 * @model name="traveltofromworkaccident"
	 * @generated
	 * @ordered
	 */
	public static final int TRAVELTOFROMWORKACCIDENT_VALUE = 10;

	/**
	 * An array of all the '<em><b>CDINCAPACITYREASO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDINCAPACITYREASONvalues[] VALUES_ARRAY =
		new CDINCAPACITYREASONvalues[] {
			SICKNESS,
			ACCIDENT,
			FAMILY,
			OTHER,
			CAREENCOUNTER,
			ILLNESS,
			HOSPITALISATION,
			PREGNANCY,
			WORKACCIDENT,
			OCCUPATIONALDISEASE,
			TRAVELTOFROMWORKACCIDENT,
		};

	/**
	 * A public read-only list of all the '<em><b>CDINCAPACITYREASO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDINCAPACITYREASONvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDINCAPACITYREASO Nvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDINCAPACITYREASONvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDINCAPACITYREASONvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDINCAPACITYREASO Nvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDINCAPACITYREASONvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDINCAPACITYREASONvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDINCAPACITYREASO Nvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDINCAPACITYREASONvalues get(int value) {
		switch (value) {
			case SICKNESS_VALUE: return SICKNESS;
			case ACCIDENT_VALUE: return ACCIDENT;
			case FAMILY_VALUE: return FAMILY;
			case OTHER_VALUE: return OTHER;
			case CAREENCOUNTER_VALUE: return CAREENCOUNTER;
			case ILLNESS_VALUE: return ILLNESS;
			case HOSPITALISATION_VALUE: return HOSPITALISATION;
			case PREGNANCY_VALUE: return PREGNANCY;
			case WORKACCIDENT_VALUE: return WORKACCIDENT;
			case OCCUPATIONALDISEASE_VALUE: return OCCUPATIONALDISEASE;
			case TRAVELTOFROMWORKACCIDENT_VALUE: return TRAVELTOFROMWORKACCIDENT;
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
	private CDINCAPACITYREASONvalues(int value, String name, String literal) {
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
	
} //CDINCAPACITYREASONvalues
