/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDCARENETTYP Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDCARENETTYPEvalues()
 * @model extendedMetaData="name='CD-CARENET-TYPEvalues'"
 * @generated
 */
public enum CDCARENETTYPEvalues implements Enumerator {
	/**
	 * The '<em><b>11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_11_VALUE
	 * @generated
	 * @ordered
	 */
	_11(0, "_11", "11"),

	/**
	 * The '<em><b>12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_12_VALUE
	 * @generated
	 * @ordered
	 */
	_12(1, "_12", "12"),

	/**
	 * The '<em><b>21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_21_VALUE
	 * @generated
	 * @ordered
	 */
	_21(2, "_21", "21"),

	/**
	 * The '<em><b>22</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_22_VALUE
	 * @generated
	 * @ordered
	 */
	_22(3, "_22", "22"),

	/**
	 * The '<em><b>91</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_91_VALUE
	 * @generated
	 * @ordered
	 */
	_91(4, "_91", "91"),

	/**
	 * The '<em><b>92</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_92_VALUE
	 * @generated
	 * @ordered
	 */
	_92(5, "_92", "92"),

	/**
	 * The '<em><b>93</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_93_VALUE
	 * @generated
	 * @ordered
	 */
	_93(6, "_93", "93"),

	/**
	 * The '<em><b>94</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_94_VALUE
	 * @generated
	 * @ordered
	 */
	_94(7, "_94", "94");

	/**
	 * The '<em><b>11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_11
	 * @model literal="11"
	 * @generated
	 * @ordered
	 */
	public static final int _11_VALUE = 0;

	/**
	 * The '<em><b>12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_12
	 * @model literal="12"
	 * @generated
	 * @ordered
	 */
	public static final int _12_VALUE = 1;

	/**
	 * The '<em><b>21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_21
	 * @model literal="21"
	 * @generated
	 * @ordered
	 */
	public static final int _21_VALUE = 2;

	/**
	 * The '<em><b>22</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_22
	 * @model literal="22"
	 * @generated
	 * @ordered
	 */
	public static final int _22_VALUE = 3;

	/**
	 * The '<em><b>91</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_91
	 * @model literal="91"
	 * @generated
	 * @ordered
	 */
	public static final int _91_VALUE = 4;

	/**
	 * The '<em><b>92</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_92
	 * @model literal="92"
	 * @generated
	 * @ordered
	 */
	public static final int _92_VALUE = 5;

	/**
	 * The '<em><b>93</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_93
	 * @model literal="93"
	 * @generated
	 * @ordered
	 */
	public static final int _93_VALUE = 6;

	/**
	 * The '<em><b>94</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_94
	 * @model literal="94"
	 * @generated
	 * @ordered
	 */
	public static final int _94_VALUE = 7;

	/**
	 * An array of all the '<em><b>CDCARENETTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDCARENETTYPEvalues[] VALUES_ARRAY =
		new CDCARENETTYPEvalues[] {
			_11,
			_12,
			_21,
			_22,
			_91,
			_92,
			_93,
			_94,
		};

	/**
	 * A public read-only list of all the '<em><b>CDCARENETTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDCARENETTYPEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDCARENETTYP Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETTYPEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCARENETTYPEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCARENETTYP Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETTYPEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCARENETTYPEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCARENETTYP Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETTYPEvalues get(int value) {
		switch (value) {
			case _11_VALUE: return _11;
			case _12_VALUE: return _12;
			case _21_VALUE: return _21;
			case _22_VALUE: return _22;
			case _91_VALUE: return _91;
			case _92_VALUE: return _92;
			case _93_VALUE: return _93;
			case _94_VALUE: return _94;
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
	private CDCARENETTYPEvalues(int value, String name, String literal) {
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
	
} //CDCARENETTYPEvalues
