/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDCARENETDOCUMEN Tvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDCARENETDOCUMENTvalues()
 * @model extendedMetaData="name='CD-CARENET-DOCUMENTvalues'"
 * @generated
 */
public enum CDCARENETDOCUMENTvalues implements Enumerator {
	/**
	 * The '<em><b>0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_0_VALUE
	 * @generated
	 * @ordered
	 */
	_0(0, "_0", "0"),

	/**
	 * The '<em><b>723000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_723000_VALUE
	 * @generated
	 * @ordered
	 */
	_723000(1, "_723000", "723000"),

	/**
	 * The '<em><b>727100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_727100_VALUE
	 * @generated
	 * @ordered
	 */
	_727100(2, "_727100", "727100"),

	/**
	 * The '<em><b>727200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_727200_VALUE
	 * @generated
	 * @ordered
	 */
	_727200(3, "_727200", "727200");

	/**
	 * The '<em><b>0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_0
	 * @model literal="0"
	 * @generated
	 * @ordered
	 */
	public static final int _0_VALUE = 0;

	/**
	 * The '<em><b>723000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_723000
	 * @model literal="723000"
	 * @generated
	 * @ordered
	 */
	public static final int _723000_VALUE = 1;

	/**
	 * The '<em><b>727100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_727100
	 * @model literal="727100"
	 * @generated
	 * @ordered
	 */
	public static final int _727100_VALUE = 2;

	/**
	 * The '<em><b>727200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_727200
	 * @model literal="727200"
	 * @generated
	 * @ordered
	 */
	public static final int _727200_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDCARENETDOCUMEN Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDCARENETDOCUMENTvalues[] VALUES_ARRAY =
		new CDCARENETDOCUMENTvalues[] {
			_0,
			_723000,
			_727100,
			_727200,
		};

	/**
	 * A public read-only list of all the '<em><b>CDCARENETDOCUMEN Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDCARENETDOCUMENTvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDCARENETDOCUMEN Tvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETDOCUMENTvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCARENETDOCUMENTvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCARENETDOCUMEN Tvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETDOCUMENTvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCARENETDOCUMENTvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCARENETDOCUMEN Tvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETDOCUMENTvalues get(int value) {
		switch (value) {
			case _0_VALUE: return _0;
			case _723000_VALUE: return _723000;
			case _727100_VALUE: return _727100;
			case _727200_VALUE: return _727200;
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
	private CDCARENETDOCUMENTvalues(int value, String name, String literal) {
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
	
} //CDCARENETDOCUMENTvalues
