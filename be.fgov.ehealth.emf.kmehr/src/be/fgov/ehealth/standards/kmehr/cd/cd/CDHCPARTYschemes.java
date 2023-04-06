/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDHCPART Yschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDHCPARTYschemes()
 * @model extendedMetaData="name='CD-HCPARTYschemes'"
 * @generated
 */
public enum CDHCPARTYschemes implements Enumerator {
	/**
	 * The '<em><b>CDHCPARTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDHCPARTY_VALUE
	 * @generated
	 * @ordered
	 */
	CDHCPARTY(0, "CDHCPARTY", "CD-HCPARTY"),

	/**
	 * The '<em><b>CDAPPLICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDAPPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDAPPLICATION(1, "CDAPPLICATION", "CD-APPLICATION"),

	/**
	 * The '<em><b>CDENCRYPTIONACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDENCRYPTIONACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	CDENCRYPTIONACTOR(2, "CDENCRYPTIONACTOR", "CD-ENCRYPTION-ACTOR"),

	/**
	 * The '<em><b>CDROLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDROLE_VALUE
	 * @generated
	 * @ordered
	 */
	CDROLE(3, "CDROLE", "CD-ROLE"),

	/**
	 * The '<em><b>LOCAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(4, "LOCAL", "LOCAL");

	/**
	 * The '<em><b>CDHCPARTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDHCPARTY
	 * @model literal="CD-HCPARTY"
	 * @generated
	 * @ordered
	 */
	public static final int CDHCPARTY_VALUE = 0;

	/**
	 * The '<em><b>CDAPPLICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDAPPLICATION
	 * @model literal="CD-APPLICATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDAPPLICATION_VALUE = 1;

	/**
	 * The '<em><b>CDENCRYPTIONACTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDENCRYPTIONACTOR
	 * @model literal="CD-ENCRYPTION-ACTOR"
	 * @generated
	 * @ordered
	 */
	public static final int CDENCRYPTIONACTOR_VALUE = 2;

	/**
	 * The '<em><b>CDROLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDROLE
	 * @model literal="CD-ROLE"
	 * @generated
	 * @ordered
	 */
	public static final int CDROLE_VALUE = 3;

	/**
	 * The '<em><b>LOCAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>CDHCPART Yschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDHCPARTYschemes[] VALUES_ARRAY =
		new CDHCPARTYschemes[] {
			CDHCPARTY,
			CDAPPLICATION,
			CDENCRYPTIONACTOR,
			CDROLE,
			LOCAL,
		};

	/**
	 * A public read-only list of all the '<em><b>CDHCPART Yschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDHCPARTYschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDHCPART Yschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDHCPARTYschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDHCPARTYschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDHCPART Yschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDHCPARTYschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDHCPARTYschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDHCPART Yschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDHCPARTYschemes get(int value) {
		switch (value) {
			case CDHCPARTY_VALUE: return CDHCPARTY;
			case CDAPPLICATION_VALUE: return CDAPPLICATION;
			case CDENCRYPTIONACTOR_VALUE: return CDENCRYPTIONACTOR;
			case CDROLE_VALUE: return CDROLE;
			case LOCAL_VALUE: return LOCAL;
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
	private CDHCPARTYschemes(int value, String name, String literal) {
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
	
} //CDHCPARTYschemes
