/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDWEEKDA Yvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDWEEKDAYvalues()
 * @model extendedMetaData="name='CD-WEEKDAYvalues'"
 * @generated
 */
public enum CDWEEKDAYvalues implements Enumerator {
	/**
	 * The '<em><b>Sunday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUNDAY_VALUE
	 * @generated
	 * @ordered
	 */
	SUNDAY(0, "sunday", "sunday"),

	/**
	 * The '<em><b>Monday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONDAY_VALUE
	 * @generated
	 * @ordered
	 */
	MONDAY(1, "monday", "monday"),

	/**
	 * The '<em><b>Tuesday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUESDAY_VALUE
	 * @generated
	 * @ordered
	 */
	TUESDAY(2, "tuesday", "tuesday"),

	/**
	 * The '<em><b>Wednesday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEDNESDAY_VALUE
	 * @generated
	 * @ordered
	 */
	WEDNESDAY(3, "wednesday", "wednesday"),

	/**
	 * The '<em><b>Thursday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THURSDAY_VALUE
	 * @generated
	 * @ordered
	 */
	THURSDAY(4, "thursday", "thursday"),

	/**
	 * The '<em><b>Friday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIDAY_VALUE
	 * @generated
	 * @ordered
	 */
	FRIDAY(5, "friday", "friday"),

	/**
	 * The '<em><b>Saturday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATURDAY_VALUE
	 * @generated
	 * @ordered
	 */
	SATURDAY(6, "saturday", "saturday");

	/**
	 * The '<em><b>Sunday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUNDAY
	 * @model name="sunday"
	 * @generated
	 * @ordered
	 */
	public static final int SUNDAY_VALUE = 0;

	/**
	 * The '<em><b>Monday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONDAY
	 * @model name="monday"
	 * @generated
	 * @ordered
	 */
	public static final int MONDAY_VALUE = 1;

	/**
	 * The '<em><b>Tuesday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUESDAY
	 * @model name="tuesday"
	 * @generated
	 * @ordered
	 */
	public static final int TUESDAY_VALUE = 2;

	/**
	 * The '<em><b>Wednesday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEDNESDAY
	 * @model name="wednesday"
	 * @generated
	 * @ordered
	 */
	public static final int WEDNESDAY_VALUE = 3;

	/**
	 * The '<em><b>Thursday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THURSDAY
	 * @model name="thursday"
	 * @generated
	 * @ordered
	 */
	public static final int THURSDAY_VALUE = 4;

	/**
	 * The '<em><b>Friday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIDAY
	 * @model name="friday"
	 * @generated
	 * @ordered
	 */
	public static final int FRIDAY_VALUE = 5;

	/**
	 * The '<em><b>Saturday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATURDAY
	 * @model name="saturday"
	 * @generated
	 * @ordered
	 */
	public static final int SATURDAY_VALUE = 6;

	/**
	 * An array of all the '<em><b>CDWEEKDA Yvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDWEEKDAYvalues[] VALUES_ARRAY =
		new CDWEEKDAYvalues[] {
			SUNDAY,
			MONDAY,
			TUESDAY,
			WEDNESDAY,
			THURSDAY,
			FRIDAY,
			SATURDAY,
		};

	/**
	 * A public read-only list of all the '<em><b>CDWEEKDA Yvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDWEEKDAYvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDWEEKDA Yvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDWEEKDAYvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDWEEKDAYvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDWEEKDA Yvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDWEEKDAYvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDWEEKDAYvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDWEEKDA Yvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDWEEKDAYvalues get(int value) {
		switch (value) {
			case SUNDAY_VALUE: return SUNDAY;
			case MONDAY_VALUE: return MONDAY;
			case TUESDAY_VALUE: return TUESDAY;
			case WEDNESDAY_VALUE: return WEDNESDAY;
			case THURSDAY_VALUE: return THURSDAY;
			case FRIDAY_VALUE: return FRIDAY;
			case SATURDAY_VALUE: return SATURDAY;
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
	private CDWEEKDAYvalues(int value, String name, String literal) {
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
	
} //CDWEEKDAYvalues
