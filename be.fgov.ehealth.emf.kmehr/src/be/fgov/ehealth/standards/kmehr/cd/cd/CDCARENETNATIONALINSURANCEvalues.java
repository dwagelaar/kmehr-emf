/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDCARENETNATIONALINSURANC Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDCARENETNATIONALINSURANCEvalues()
 * @model extendedMetaData="name='CD-CARENET-NATIONAL-INSURANCEvalues'"
 * @generated
 */
public enum CDCARENETNATIONALINSURANCEvalues implements Enumerator {
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
	 * The '<em><b>300</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_300_VALUE
	 * @generated
	 * @ordered
	 */
	_300(2, "_300", "300"),

	/**
	 * The '<em><b>400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_400_VALUE
	 * @generated
	 * @ordered
	 */
	_400(3, "_400", "400"),

	/**
	 * The '<em><b>500</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_500_VALUE
	 * @generated
	 * @ordered
	 */
	_500(4, "_500", "500"),

	/**
	 * The '<em><b>600</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_600_VALUE
	 * @generated
	 * @ordered
	 */
	_600(5, "_600", "600"),

	/**
	 * The '<em><b>900</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_900_VALUE
	 * @generated
	 * @ordered
	 */
	_900(6, "_900", "900");

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
	 * The '<em><b>300</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_300
	 * @model literal="300"
	 * @generated
	 * @ordered
	 */
	public static final int _300_VALUE = 2;

	/**
	 * The '<em><b>400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_400
	 * @model literal="400"
	 * @generated
	 * @ordered
	 */
	public static final int _400_VALUE = 3;

	/**
	 * The '<em><b>500</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_500
	 * @model literal="500"
	 * @generated
	 * @ordered
	 */
	public static final int _500_VALUE = 4;

	/**
	 * The '<em><b>600</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_600
	 * @model literal="600"
	 * @generated
	 * @ordered
	 */
	public static final int _600_VALUE = 5;

	/**
	 * The '<em><b>900</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_900
	 * @model literal="900"
	 * @generated
	 * @ordered
	 */
	public static final int _900_VALUE = 6;

	/**
	 * An array of all the '<em><b>CDCARENETNATIONALINSURANC Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDCARENETNATIONALINSURANCEvalues[] VALUES_ARRAY =
		new CDCARENETNATIONALINSURANCEvalues[] {
			_100,
			_200,
			_300,
			_400,
			_500,
			_600,
			_900,
		};

	/**
	 * A public read-only list of all the '<em><b>CDCARENETNATIONALINSURANC Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDCARENETNATIONALINSURANCEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDCARENETNATIONALINSURANC Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETNATIONALINSURANCEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCARENETNATIONALINSURANCEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCARENETNATIONALINSURANC Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETNATIONALINSURANCEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCARENETNATIONALINSURANCEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCARENETNATIONALINSURANC Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETNATIONALINSURANCEvalues get(int value) {
		switch (value) {
			case _100_VALUE: return _100;
			case _200_VALUE: return _200;
			case _300_VALUE: return _300;
			case _400_VALUE: return _400;
			case _500_VALUE: return _500;
			case _600_VALUE: return _600;
			case _900_VALUE: return _900;
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
	private CDCARENETNATIONALINSURANCEvalues(int value, String name, String literal) {
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
	
} //CDCARENETNATIONALINSURANCEvalues
