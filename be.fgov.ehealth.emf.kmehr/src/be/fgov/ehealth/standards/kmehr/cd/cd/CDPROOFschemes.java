/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDPROO Fschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDPROOFschemes()
 * @model extendedMetaData="name='CD-PROOFschemes'"
 * @generated
 */
public enum CDPROOFschemes implements Enumerator {
	/**
	 * The '<em><b>CDPROOFTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPROOFTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDPROOFTYPE(0, "CDPROOFTYPE", "CD-PROOFTYPE"),

	/**
	 * The '<em><b>LOCAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(1, "LOCAL", "LOCAL");

	/**
	 * The '<em><b>CDPROOFTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPROOFTYPE
	 * @model literal="CD-PROOFTYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDPROOFTYPE_VALUE = 0;

	/**
	 * The '<em><b>LOCAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>CDPROO Fschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDPROOFschemes[] VALUES_ARRAY =
		new CDPROOFschemes[] {
			CDPROOFTYPE,
			LOCAL,
		};

	/**
	 * A public read-only list of all the '<em><b>CDPROO Fschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDPROOFschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDPROO Fschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDPROOFschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDPROOFschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDPROO Fschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDPROOFschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDPROOFschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDPROO Fschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDPROOFschemes get(int value) {
		switch (value) {
			case CDPROOFTYPE_VALUE: return CDPROOFTYPE;
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
	private CDPROOFschemes(int value, String name, String literal) {
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
	
} //CDPROOFschemes
