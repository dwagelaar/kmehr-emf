/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDMSADAPTATIO Nvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDMSADAPTATIONvalues()
 * @model extendedMetaData="name='CD-MS-ADAPTATIONvalues'"
 * @generated
 */
public enum CDMSADAPTATIONvalues implements Enumerator {
	/**
	 * The '<em><b>Nochanges</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOCHANGES_VALUE
	 * @generated
	 * @ordered
	 */
	NOCHANGES(0, "nochanges", "nochanges"),

	/**
	 * The '<em><b>Medication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION(1, "medication", "medication"),

	/**
	 * The '<em><b>Posology</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSOLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	POSOLOGY(2, "posology", "posology"),

	/**
	 * The '<em><b>Treatmentsuspension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENTSUSPENSION_VALUE
	 * @generated
	 * @ordered
	 */
	TREATMENTSUSPENSION(3, "treatmentsuspension", "treatmentsuspension");

	/**
	 * The '<em><b>Nochanges</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOCHANGES
	 * @model name="nochanges"
	 * @generated
	 * @ordered
	 */
	public static final int NOCHANGES_VALUE = 0;

	/**
	 * The '<em><b>Medication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION
	 * @model name="medication"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_VALUE = 1;

	/**
	 * The '<em><b>Posology</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSOLOGY
	 * @model name="posology"
	 * @generated
	 * @ordered
	 */
	public static final int POSOLOGY_VALUE = 2;

	/**
	 * The '<em><b>Treatmentsuspension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENTSUSPENSION
	 * @model name="treatmentsuspension"
	 * @generated
	 * @ordered
	 */
	public static final int TREATMENTSUSPENSION_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDMSADAPTATIO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDMSADAPTATIONvalues[] VALUES_ARRAY =
		new CDMSADAPTATIONvalues[] {
			NOCHANGES,
			MEDICATION,
			POSOLOGY,
			TREATMENTSUSPENSION,
		};

	/**
	 * A public read-only list of all the '<em><b>CDMSADAPTATIO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDMSADAPTATIONvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDMSADAPTATIO Nvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMSADAPTATIONvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDMSADAPTATIONvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDMSADAPTATIO Nvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMSADAPTATIONvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDMSADAPTATIONvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDMSADAPTATIO Nvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMSADAPTATIONvalues get(int value) {
		switch (value) {
			case NOCHANGES_VALUE: return NOCHANGES;
			case MEDICATION_VALUE: return MEDICATION;
			case POSOLOGY_VALUE: return POSOLOGY;
			case TREATMENTSUSPENSION_VALUE: return TREATMENTSUSPENSION;
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
	private CDMSADAPTATIONvalues(int value, String name, String literal) {
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
	
} //CDMSADAPTATIONvalues
