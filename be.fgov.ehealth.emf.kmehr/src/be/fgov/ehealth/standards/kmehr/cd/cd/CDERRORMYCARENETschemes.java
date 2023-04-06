/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDERRORMYCARENE Tschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDERRORMYCARENETschemes()
 * @model extendedMetaData="name='CD-ERROR-MYCARENETschemes'"
 * @generated
 */
public enum CDERRORMYCARENETschemes implements Enumerator {
	/**
	 * The '<em><b>CDERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDERROR_VALUE
	 * @generated
	 * @ordered
	 */
	CDERROR(0, "CDERROR", "CD-ERROR"),

	/**
	 * The '<em><b>CDREFUSALMYCARENET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDREFUSALMYCARENET_VALUE
	 * @generated
	 * @ordered
	 */
	CDREFUSALMYCARENET(1, "CDREFUSALMYCARENET", "CD-REFUSAL-MYCARENET");

	/**
	 * The '<em><b>CDERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDERROR
	 * @model literal="CD-ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int CDERROR_VALUE = 0;

	/**
	 * The '<em><b>CDREFUSALMYCARENET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDREFUSALMYCARENET
	 * @model literal="CD-REFUSAL-MYCARENET"
	 * @generated
	 * @ordered
	 */
	public static final int CDREFUSALMYCARENET_VALUE = 1;

	/**
	 * An array of all the '<em><b>CDERRORMYCARENE Tschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDERRORMYCARENETschemes[] VALUES_ARRAY =
		new CDERRORMYCARENETschemes[] {
			CDERROR,
			CDREFUSALMYCARENET,
		};

	/**
	 * A public read-only list of all the '<em><b>CDERRORMYCARENE Tschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDERRORMYCARENETschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDERRORMYCARENE Tschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDERRORMYCARENETschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDERRORMYCARENETschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDERRORMYCARENE Tschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDERRORMYCARENETschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDERRORMYCARENETschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDERRORMYCARENE Tschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDERRORMYCARENETschemes get(int value) {
		switch (value) {
			case CDERROR_VALUE: return CDERROR;
			case CDREFUSALMYCARENET_VALUE: return CDREFUSALMYCARENET;
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
	private CDERRORMYCARENETschemes(int value, String name, String literal) {
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
	
} //CDERRORMYCARENETschemes
