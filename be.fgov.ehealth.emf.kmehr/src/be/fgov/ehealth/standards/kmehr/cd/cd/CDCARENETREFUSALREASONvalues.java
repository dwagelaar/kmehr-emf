/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDCARENETREFUSALREASO Nvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDCARENETREFUSALREASONvalues()
 * @model extendedMetaData="name='CD-CARENET-REFUSAL-REASONvalues'"
 * @generated
 */
public enum CDCARENETREFUSALREASONvalues implements Enumerator {
	/**
	 * The '<em><b>100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_100_VALUE
	 * @generated
	 * @ordered
	 */
	_100(0, "_100", "100"),

	/**
	 * The '<em><b>200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_200_VALUE
	 * @generated
	 * @ordered
	 */
	_200(1, "_200", "200"),

	/**
	 * The '<em><b>201</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_201_VALUE
	 * @generated
	 * @ordered
	 */
	_201(2, "_201", "201"),

	/**
	 * The '<em><b>300</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_300_VALUE
	 * @generated
	 * @ordered
	 */
	_300(3, "_300", "300"),

	/**
	 * The '<em><b>410</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_410_VALUE
	 * @generated
	 * @ordered
	 */
	_410(4, "_410", "410"),

	/**
	 * The '<em><b>420</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_420_VALUE
	 * @generated
	 * @ordered
	 */
	_420(5, "_420", "420"),

	/**
	 * The '<em><b>500</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_500_VALUE
	 * @generated
	 * @ordered
	 */
	_500(6, "_500", "500");

	/**
	 * The '<em><b>100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_100
	 * @model literal="100"
	 * @generated
	 * @ordered
	 */
	public static final int _100_VALUE = 0;

	/**
	 * The '<em><b>200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_200
	 * @model literal="200"
	 * @generated
	 * @ordered
	 */
	public static final int _200_VALUE = 1;

	/**
	 * The '<em><b>201</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_201
	 * @model literal="201"
	 * @generated
	 * @ordered
	 */
	public static final int _201_VALUE = 2;

	/**
	 * The '<em><b>300</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_300
	 * @model literal="300"
	 * @generated
	 * @ordered
	 */
	public static final int _300_VALUE = 3;

	/**
	 * The '<em><b>410</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_410
	 * @model literal="410"
	 * @generated
	 * @ordered
	 */
	public static final int _410_VALUE = 4;

	/**
	 * The '<em><b>420</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_420
	 * @model literal="420"
	 * @generated
	 * @ordered
	 */
	public static final int _420_VALUE = 5;

	/**
	 * The '<em><b>500</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_500
	 * @model literal="500"
	 * @generated
	 * @ordered
	 */
	public static final int _500_VALUE = 6;

	/**
	 * An array of all the '<em><b>CDCARENETREFUSALREASO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDCARENETREFUSALREASONvalues[] VALUES_ARRAY =
		new CDCARENETREFUSALREASONvalues[] {
			_100,
			_200,
			_201,
			_300,
			_410,
			_420,
			_500,
		};

	/**
	 * A public read-only list of all the '<em><b>CDCARENETREFUSALREASO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDCARENETREFUSALREASONvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDCARENETREFUSALREASO Nvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETREFUSALREASONvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCARENETREFUSALREASONvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCARENETREFUSALREASO Nvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETREFUSALREASONvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCARENETREFUSALREASONvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCARENETREFUSALREASO Nvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETREFUSALREASONvalues get(int value) {
		switch (value) {
			case _100_VALUE: return _100;
			case _200_VALUE: return _200;
			case _201_VALUE: return _201;
			case _300_VALUE: return _300;
			case _410_VALUE: return _410;
			case _420_VALUE: return _420;
			case _500_VALUE: return _500;
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
	private CDCARENETREFUSALREASONvalues(int value, String name, String literal) {
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
	
} //CDCARENETREFUSALREASONvalues
