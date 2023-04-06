/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDCARENETPERSONALPAR Tvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDCARENETPERSONALPARTvalues()
 * @model extendedMetaData="name='CD-CARENET-PERSONAL-PARTvalues'"
 * @generated
 */
public enum CDCARENETPERSONALPARTvalues implements Enumerator {
	/**
	 * The '<em><b>Code1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE1_VALUE
	 * @generated
	 * @ordered
	 */
	CODE1(0, "code1", "code1"),

	/**
	 * The '<em><b>Code2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE2_VALUE
	 * @generated
	 * @ordered
	 */
	CODE2(1, "code2", "code2"),

	/**
	 * The '<em><b>Future</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUTURE_VALUE
	 * @generated
	 * @ordered
	 */
	FUTURE(2, "future", "future");

	/**
	 * The '<em><b>Code1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE1
	 * @model name="code1"
	 * @generated
	 * @ordered
	 */
	public static final int CODE1_VALUE = 0;

	/**
	 * The '<em><b>Code2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE2
	 * @model name="code2"
	 * @generated
	 * @ordered
	 */
	public static final int CODE2_VALUE = 1;

	/**
	 * The '<em><b>Future</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUTURE
	 * @model name="future"
	 * @generated
	 * @ordered
	 */
	public static final int FUTURE_VALUE = 2;

	/**
	 * An array of all the '<em><b>CDCARENETPERSONALPAR Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDCARENETPERSONALPARTvalues[] VALUES_ARRAY =
		new CDCARENETPERSONALPARTvalues[] {
			CODE1,
			CODE2,
			FUTURE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDCARENETPERSONALPAR Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDCARENETPERSONALPARTvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDCARENETPERSONALPAR Tvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETPERSONALPARTvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCARENETPERSONALPARTvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCARENETPERSONALPAR Tvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETPERSONALPARTvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCARENETPERSONALPARTvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCARENETPERSONALPAR Tvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCARENETPERSONALPARTvalues get(int value) {
		switch (value) {
			case CODE1_VALUE: return CODE1;
			case CODE2_VALUE: return CODE2;
			case FUTURE_VALUE: return FUTURE;
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
	private CDCARENETPERSONALPARTvalues(int value, String name, String literal) {
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
	
} //CDCARENETPERSONALPARTvalues
