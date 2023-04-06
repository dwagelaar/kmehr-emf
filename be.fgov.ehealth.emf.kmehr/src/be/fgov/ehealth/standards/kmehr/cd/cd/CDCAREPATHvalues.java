/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDCAREPAT Hvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDCAREPATHvalues()
 * @model extendedMetaData="name='CD-CAREPATHvalues'"
 * @generated
 */
public enum CDCAREPATHvalues implements Enumerator {
	/**
	 * The '<em><b>001</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_001_VALUE
	 * @generated
	 * @ordered
	 */
	_001(0, "_001", "001"),

	/**
	 * The '<em><b>002</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_002_VALUE
	 * @generated
	 * @ordered
	 */
	_002(1, "_002", "002"),

	/**
	 * The '<em><b>003</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_003_VALUE
	 * @generated
	 * @ordered
	 */
	_003(2, "_003", "003"),

	/**
	 * The '<em><b>101</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_101_VALUE
	 * @generated
	 * @ordered
	 */
	_101(3, "_101", "101"),

	/**
	 * The '<em><b>102</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_102_VALUE
	 * @generated
	 * @ordered
	 */
	_102(4, "_102", "102"),

	/**
	 * The '<em><b>103</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_103_VALUE
	 * @generated
	 * @ordered
	 */
	_103(5, "_103", "103"),

	/**
	 * The '<em><b>010</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_010_VALUE
	 * @generated
	 * @ordered
	 */
	_010(6, "_010", "010");

	/**
	 * The '<em><b>001</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_001
	 * @model literal="001"
	 * @generated
	 * @ordered
	 */
	public static final int _001_VALUE = 0;

	/**
	 * The '<em><b>002</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_002
	 * @model literal="002"
	 * @generated
	 * @ordered
	 */
	public static final int _002_VALUE = 1;

	/**
	 * The '<em><b>003</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_003
	 * @model literal="003"
	 * @generated
	 * @ordered
	 */
	public static final int _003_VALUE = 2;

	/**
	 * The '<em><b>101</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_101
	 * @model literal="101"
	 * @generated
	 * @ordered
	 */
	public static final int _101_VALUE = 3;

	/**
	 * The '<em><b>102</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_102
	 * @model literal="102"
	 * @generated
	 * @ordered
	 */
	public static final int _102_VALUE = 4;

	/**
	 * The '<em><b>103</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_103
	 * @model literal="103"
	 * @generated
	 * @ordered
	 */
	public static final int _103_VALUE = 5;

	/**
	 * The '<em><b>010</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_010
	 * @model literal="010"
	 * @generated
	 * @ordered
	 */
	public static final int _010_VALUE = 6;

	/**
	 * An array of all the '<em><b>CDCAREPAT Hvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDCAREPATHvalues[] VALUES_ARRAY =
		new CDCAREPATHvalues[] {
			_001,
			_002,
			_003,
			_101,
			_102,
			_103,
			_010,
		};

	/**
	 * A public read-only list of all the '<em><b>CDCAREPAT Hvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDCAREPATHvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDCAREPAT Hvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCAREPATHvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCAREPATHvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCAREPAT Hvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCAREPATHvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCAREPATHvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCAREPAT Hvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCAREPATHvalues get(int value) {
		switch (value) {
			case _001_VALUE: return _001;
			case _002_VALUE: return _002;
			case _003_VALUE: return _003;
			case _101_VALUE: return _101;
			case _102_VALUE: return _102;
			case _103_VALUE: return _103;
			case _010_VALUE: return _010;
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
	private CDCAREPATHvalues(int value, String name, String literal) {
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
	
} //CDCAREPATHvalues
