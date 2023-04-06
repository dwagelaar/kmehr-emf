/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDENCRYPTIONMETHO Dschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDENCRYPTIONMETHODschemes()
 * @model extendedMetaData="name='CD-ENCRYPTION-METHODschemes'"
 * @generated
 */
public enum CDENCRYPTIONMETHODschemes implements Enumerator {
	/**
	 * The '<em><b>CDENCRYPTIONMETHOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDENCRYPTIONMETHOD_VALUE
	 * @generated
	 * @ordered
	 */
	CDENCRYPTIONMETHOD(0, "CDENCRYPTIONMETHOD", "CD-ENCRYPTION-METHOD");

	/**
	 * The '<em><b>CDENCRYPTIONMETHOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDENCRYPTIONMETHOD
	 * @model literal="CD-ENCRYPTION-METHOD"
	 * @generated
	 * @ordered
	 */
	public static final int CDENCRYPTIONMETHOD_VALUE = 0;

	/**
	 * An array of all the '<em><b>CDENCRYPTIONMETHO Dschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDENCRYPTIONMETHODschemes[] VALUES_ARRAY =
		new CDENCRYPTIONMETHODschemes[] {
			CDENCRYPTIONMETHOD,
		};

	/**
	 * A public read-only list of all the '<em><b>CDENCRYPTIONMETHO Dschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDENCRYPTIONMETHODschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDENCRYPTIONMETHO Dschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDENCRYPTIONMETHODschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDENCRYPTIONMETHODschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDENCRYPTIONMETHO Dschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDENCRYPTIONMETHODschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDENCRYPTIONMETHODschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDENCRYPTIONMETHO Dschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDENCRYPTIONMETHODschemes get(int value) {
		switch (value) {
			case CDENCRYPTIONMETHOD_VALUE: return CDENCRYPTIONMETHOD;
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
	private CDENCRYPTIONMETHODschemes(int value, String name, String literal) {
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
	
} //CDENCRYPTIONMETHODschemes
