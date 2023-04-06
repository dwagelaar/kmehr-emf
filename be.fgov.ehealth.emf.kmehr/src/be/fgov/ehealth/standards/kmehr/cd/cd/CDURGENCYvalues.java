/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDURGENC Yvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDURGENCYvalues()
 * @model extendedMetaData="name='CD-URGENCYvalues'"
 * @generated
 */
public enum CDURGENCYvalues implements Enumerator {
	/**
	 * The '<em><b>Asap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASAP_VALUE
	 * @generated
	 * @ordered
	 */
	ASAP(0, "asap", "asap"),

	/**
	 * The '<em><b>Hour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	HOUR(1, "hour", "hour"),

	/**
	 * The '<em><b>4hours</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4HOURS_VALUE
	 * @generated
	 * @ordered
	 */
	_4HOURS(2, "_4hours", "4hours"),

	/**
	 * The '<em><b>12hours</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_12HOURS_VALUE
	 * @generated
	 * @ordered
	 */
	_12HOURS(3, "_12hours", "12hours"),

	/**
	 * The '<em><b>Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_VALUE
	 * @generated
	 * @ordered
	 */
	DAY(4, "day", "day"),

	/**
	 * The '<em><b>Week</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEK_VALUE
	 * @generated
	 * @ordered
	 */
	WEEK(5, "week", "week"),

	/**
	 * The '<em><b>Month</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	MONTH(6, "month", "month");

	/**
	 * The '<em><b>Asap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASAP
	 * @model name="asap"
	 * @generated
	 * @ordered
	 */
	public static final int ASAP_VALUE = 0;

	/**
	 * The '<em><b>Hour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUR
	 * @model name="hour"
	 * @generated
	 * @ordered
	 */
	public static final int HOUR_VALUE = 1;

	/**
	 * The '<em><b>4hours</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4HOURS
	 * @model name="_4hours" literal="4hours"
	 * @generated
	 * @ordered
	 */
	public static final int _4HOURS_VALUE = 2;

	/**
	 * The '<em><b>12hours</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_12HOURS
	 * @model name="_12hours" literal="12hours"
	 * @generated
	 * @ordered
	 */
	public static final int _12HOURS_VALUE = 3;

	/**
	 * The '<em><b>Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY
	 * @model name="day"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_VALUE = 4;

	/**
	 * The '<em><b>Week</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEK
	 * @model name="week"
	 * @generated
	 * @ordered
	 */
	public static final int WEEK_VALUE = 5;

	/**
	 * The '<em><b>Month</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH
	 * @model name="month"
	 * @generated
	 * @ordered
	 */
	public static final int MONTH_VALUE = 6;

	/**
	 * An array of all the '<em><b>CDURGENC Yvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDURGENCYvalues[] VALUES_ARRAY =
		new CDURGENCYvalues[] {
			ASAP,
			HOUR,
			_4HOURS,
			_12HOURS,
			DAY,
			WEEK,
			MONTH,
		};

	/**
	 * A public read-only list of all the '<em><b>CDURGENC Yvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDURGENCYvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDURGENC Yvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDURGENCYvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDURGENCYvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDURGENC Yvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDURGENCYvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDURGENCYvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDURGENC Yvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDURGENCYvalues get(int value) {
		switch (value) {
			case ASAP_VALUE: return ASAP;
			case HOUR_VALUE: return HOUR;
			case _4HOURS_VALUE: return _4HOURS;
			case _12HOURS_VALUE: return _12HOURS;
			case DAY_VALUE: return DAY;
			case WEEK_VALUE: return WEEK;
			case MONTH_VALUE: return MONTH;
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
	private CDURGENCYvalues(int value, String name, String literal) {
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
	
} //CDURGENCYvalues
