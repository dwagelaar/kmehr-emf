/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDCLINICALPLA Nvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDCLINICALPLANvalues()
 * @model extendedMetaData="name='CD-CLINICALPLANvalues'"
 * @generated
 */
public enum CDCLINICALPLANvalues implements Enumerator {
	/**
	 * The '<em><b>Breastcancerprevention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREASTCANCERPREVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	BREASTCANCERPREVENTION(0, "breastcancerprevention", "breastcancerprevention"),

	/**
	 * The '<em><b>Cervixutericancer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERVIXUTERICANCER_VALUE
	 * @generated
	 * @ordered
	 */
	CERVIXUTERICANCER(1, "cervixutericancer", "cervixutericancer"),

	/**
	 * The '<em><b>Colrectalcancerprevention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLRECTALCANCERPREVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	COLRECTALCANCERPREVENTION(2, "colrectalcancerprevention", "colrectalcancerprevention"),

	/**
	 * The '<em><b>Primaryprevention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARYPREVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARYPREVENTION(3, "primaryprevention", "primaryprevention"),

	/**
	 * The '<em><b>Prostatecancerprevention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROSTATECANCERPREVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	PROSTATECANCERPREVENTION(4, "prostatecancerprevention", "prostatecancerprevention"),

	/**
	 * The '<em><b>Gmdplus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GMDPLUS_VALUE
	 * @generated
	 * @ordered
	 */
	GMDPLUS(5, "gmdplus", "gmdplus");

	/**
	 * The '<em><b>Breastcancerprevention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREASTCANCERPREVENTION
	 * @model name="breastcancerprevention"
	 * @generated
	 * @ordered
	 */
	public static final int BREASTCANCERPREVENTION_VALUE = 0;

	/**
	 * The '<em><b>Cervixutericancer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERVIXUTERICANCER
	 * @model name="cervixutericancer"
	 * @generated
	 * @ordered
	 */
	public static final int CERVIXUTERICANCER_VALUE = 1;

	/**
	 * The '<em><b>Colrectalcancerprevention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLRECTALCANCERPREVENTION
	 * @model name="colrectalcancerprevention"
	 * @generated
	 * @ordered
	 */
	public static final int COLRECTALCANCERPREVENTION_VALUE = 2;

	/**
	 * The '<em><b>Primaryprevention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARYPREVENTION
	 * @model name="primaryprevention"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARYPREVENTION_VALUE = 3;

	/**
	 * The '<em><b>Prostatecancerprevention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROSTATECANCERPREVENTION
	 * @model name="prostatecancerprevention"
	 * @generated
	 * @ordered
	 */
	public static final int PROSTATECANCERPREVENTION_VALUE = 4;

	/**
	 * The '<em><b>Gmdplus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GMDPLUS
	 * @model name="gmdplus"
	 * @generated
	 * @ordered
	 */
	public static final int GMDPLUS_VALUE = 5;

	/**
	 * An array of all the '<em><b>CDCLINICALPLA Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDCLINICALPLANvalues[] VALUES_ARRAY =
		new CDCLINICALPLANvalues[] {
			BREASTCANCERPREVENTION,
			CERVIXUTERICANCER,
			COLRECTALCANCERPREVENTION,
			PRIMARYPREVENTION,
			PROSTATECANCERPREVENTION,
			GMDPLUS,
		};

	/**
	 * A public read-only list of all the '<em><b>CDCLINICALPLA Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDCLINICALPLANvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDCLINICALPLA Nvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCLINICALPLANvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCLINICALPLANvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCLINICALPLA Nvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCLINICALPLANvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCLINICALPLANvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCLINICALPLA Nvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCLINICALPLANvalues get(int value) {
		switch (value) {
			case BREASTCANCERPREVENTION_VALUE: return BREASTCANCERPREVENTION;
			case CERVIXUTERICANCER_VALUE: return CERVIXUTERICANCER;
			case COLRECTALCANCERPREVENTION_VALUE: return COLRECTALCANCERPREVENTION;
			case PRIMARYPREVENTION_VALUE: return PRIMARYPREVENTION;
			case PROSTATECANCERPREVENTION_VALUE: return PROSTATECANCERPREVENTION;
			case GMDPLUS_VALUE: return GMDPLUS;
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
	private CDCLINICALPLANvalues(int value, String name, String literal) {
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
	
} //CDCLINICALPLANvalues
