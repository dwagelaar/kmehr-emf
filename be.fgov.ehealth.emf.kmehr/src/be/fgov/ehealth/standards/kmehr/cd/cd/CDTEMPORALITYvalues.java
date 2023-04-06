/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDTEMPORALIT Yvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDTEMPORALITYvalues()
 * @model extendedMetaData="name='CD-TEMPORALITYvalues'"
 * @generated
 */
public enum CDTEMPORALITYvalues implements Enumerator {
	/**
	 * The '<em><b>Oneshot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONESHOT_VALUE
	 * @generated
	 * @ordered
	 */
	ONESHOT(0, "oneshot", "oneshot"),

	/**
	 * The '<em><b>Acute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACUTE_VALUE
	 * @generated
	 * @ordered
	 */
	ACUTE(1, "acute", "acute"),

	/**
	 * The '<em><b>Chronic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHRONIC_VALUE
	 * @generated
	 * @ordered
	 */
	CHRONIC(2, "chronic", "chronic"),

	/**
	 * The '<em><b>Reactivation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REACTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	REACTIVATION(3, "reactivation", "reactivation"),

	/**
	 * The '<em><b>Remission</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMISSION_VALUE
	 * @generated
	 * @ordered
	 */
	REMISSION(4, "remission", "remission"),

	/**
	 * The '<em><b>Subacute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBACUTE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBACUTE(5, "subacute", "subacute");

	/**
	 * The '<em><b>Oneshot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONESHOT
	 * @model name="oneshot"
	 * @generated
	 * @ordered
	 */
	public static final int ONESHOT_VALUE = 0;

	/**
	 * The '<em><b>Acute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACUTE
	 * @model name="acute"
	 * @generated
	 * @ordered
	 */
	public static final int ACUTE_VALUE = 1;

	/**
	 * The '<em><b>Chronic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHRONIC
	 * @model name="chronic"
	 * @generated
	 * @ordered
	 */
	public static final int CHRONIC_VALUE = 2;

	/**
	 * The '<em><b>Reactivation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REACTIVATION
	 * @model name="reactivation"
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVATION_VALUE = 3;

	/**
	 * The '<em><b>Remission</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMISSION
	 * @model name="remission"
	 * @generated
	 * @ordered
	 */
	public static final int REMISSION_VALUE = 4;

	/**
	 * The '<em><b>Subacute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBACUTE
	 * @model name="subacute"
	 * @generated
	 * @ordered
	 */
	public static final int SUBACUTE_VALUE = 5;

	/**
	 * An array of all the '<em><b>CDTEMPORALIT Yvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDTEMPORALITYvalues[] VALUES_ARRAY =
		new CDTEMPORALITYvalues[] {
			ONESHOT,
			ACUTE,
			CHRONIC,
			REACTIVATION,
			REMISSION,
			SUBACUTE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDTEMPORALIT Yvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDTEMPORALITYvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDTEMPORALIT Yvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTEMPORALITYvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDTEMPORALITYvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDTEMPORALIT Yvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTEMPORALITYvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDTEMPORALITYvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDTEMPORALIT Yvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTEMPORALITYvalues get(int value) {
		switch (value) {
			case ONESHOT_VALUE: return ONESHOT;
			case ACUTE_VALUE: return ACUTE;
			case CHRONIC_VALUE: return CHRONIC;
			case REACTIVATION_VALUE: return REACTIVATION;
			case REMISSION_VALUE: return REMISSION;
			case SUBACUTE_VALUE: return SUBACUTE;
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
	private CDTEMPORALITYvalues(int value, String name, String literal) {
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
	
} //CDTEMPORALITYvalues
