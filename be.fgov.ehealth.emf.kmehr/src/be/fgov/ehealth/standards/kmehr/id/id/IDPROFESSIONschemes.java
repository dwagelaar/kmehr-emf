/**
 */
package be.fgov.ehealth.standards.kmehr.id.id;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IDPROFESSIO Nschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.id.id.IdPackage#getIDPROFESSIONschemes()
 * @model extendedMetaData="name='ID-PROFESSIONschemes'"
 * @generated
 */
public enum IDPROFESSIONschemes implements Enumerator {
	/**
	 * The '<em><b>IDMEDEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDMEDEX_VALUE
	 * @generated
	 * @ordered
	 */
	IDMEDEX(0, "IDMEDEX", "ID-MEDEX"),

	/**
	 * The '<em><b>IDCBE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDCBE_VALUE
	 * @generated
	 * @ordered
	 */
	IDCBE(1, "IDCBE", "ID-CBE");

	/**
	 * The '<em><b>IDMEDEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDMEDEX
	 * @model literal="ID-MEDEX"
	 * @generated
	 * @ordered
	 */
	public static final int IDMEDEX_VALUE = 0;

	/**
	 * The '<em><b>IDCBE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDCBE
	 * @model literal="ID-CBE"
	 * @generated
	 * @ordered
	 */
	public static final int IDCBE_VALUE = 1;

	/**
	 * An array of all the '<em><b>IDPROFESSIO Nschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IDPROFESSIONschemes[] VALUES_ARRAY =
		new IDPROFESSIONschemes[] {
			IDMEDEX,
			IDCBE,
		};

	/**
	 * A public read-only list of all the '<em><b>IDPROFESSIO Nschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IDPROFESSIONschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IDPROFESSIO Nschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IDPROFESSIONschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IDPROFESSIONschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IDPROFESSIO Nschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IDPROFESSIONschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IDPROFESSIONschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IDPROFESSIO Nschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IDPROFESSIONschemes get(int value) {
		switch (value) {
			case IDMEDEX_VALUE: return IDMEDEX;
			case IDCBE_VALUE: return IDCBE;
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
	private IDPROFESSIONschemes(int value, String name, String literal) {
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
	
} //IDPROFESSIONschemes
