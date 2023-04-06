/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDEMPLOYMENTSITUATIO Nvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDEMPLOYMENTSITUATIONvalues()
 * @model extendedMetaData="name='CD-EMPLOYMENTSITUATIONvalues'"
 * @generated
 */
public enum CDEMPLOYMENTSITUATIONvalues implements Enumerator {
	/**
	 * The '<em><b>Selfemployed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELFEMPLOYED_VALUE
	 * @generated
	 * @ordered
	 */
	SELFEMPLOYED(0, "selfemployed", "selfemployed"),

	/**
	 * The '<em><b>Employed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPLOYED_VALUE
	 * @generated
	 * @ordered
	 */
	EMPLOYED(1, "employed", "employed"),

	/**
	 * The '<em><b>Civilservant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIVILSERVANT_VALUE
	 * @generated
	 * @ordered
	 */
	CIVILSERVANT(2, "civilservant", "civilservant");

	/**
	 * The '<em><b>Selfemployed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELFEMPLOYED
	 * @model name="selfemployed"
	 * @generated
	 * @ordered
	 */
	public static final int SELFEMPLOYED_VALUE = 0;

	/**
	 * The '<em><b>Employed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPLOYED
	 * @model name="employed"
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYED_VALUE = 1;

	/**
	 * The '<em><b>Civilservant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIVILSERVANT
	 * @model name="civilservant"
	 * @generated
	 * @ordered
	 */
	public static final int CIVILSERVANT_VALUE = 2;

	/**
	 * An array of all the '<em><b>CDEMPLOYMENTSITUATIO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDEMPLOYMENTSITUATIONvalues[] VALUES_ARRAY =
		new CDEMPLOYMENTSITUATIONvalues[] {
			SELFEMPLOYED,
			EMPLOYED,
			CIVILSERVANT,
		};

	/**
	 * A public read-only list of all the '<em><b>CDEMPLOYMENTSITUATIO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDEMPLOYMENTSITUATIONvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDEMPLOYMENTSITUATIO Nvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEMPLOYMENTSITUATIONvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEMPLOYMENTSITUATIONvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEMPLOYMENTSITUATIO Nvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEMPLOYMENTSITUATIONvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEMPLOYMENTSITUATIONvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEMPLOYMENTSITUATIO Nvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEMPLOYMENTSITUATIONvalues get(int value) {
		switch (value) {
			case SELFEMPLOYED_VALUE: return SELFEMPLOYED;
			case EMPLOYED_VALUE: return EMPLOYED;
			case CIVILSERVANT_VALUE: return CIVILSERVANT;
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
	private CDEMPLOYMENTSITUATIONvalues(int value, String name, String literal) {
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
	
} //CDEMPLOYMENTSITUATIONvalues
