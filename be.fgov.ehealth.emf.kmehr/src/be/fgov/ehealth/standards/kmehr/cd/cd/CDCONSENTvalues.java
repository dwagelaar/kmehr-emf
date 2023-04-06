/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDCONSEN Tvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDCONSENTvalues()
 * @model extendedMetaData="name='CD-CONSENTvalues'"
 * @generated
 */
public enum CDCONSENTvalues implements Enumerator {
	/**
	 * The '<em><b>Local</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(0, "local", "local"),

	/**
	 * The '<em><b>Prospective</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROSPECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PROSPECTIVE(1, "prospective", "prospective"),

	/**
	 * The '<em><b>Retrospective</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETROSPECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	RETROSPECTIVE(2, "retrospective", "retrospective");

	/**
	 * The '<em><b>Local</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model name="local"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 0;

	/**
	 * The '<em><b>Prospective</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROSPECTIVE
	 * @model name="prospective"
	 * @generated
	 * @ordered
	 */
	public static final int PROSPECTIVE_VALUE = 1;

	/**
	 * The '<em><b>Retrospective</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETROSPECTIVE
	 * @model name="retrospective"
	 * @generated
	 * @ordered
	 */
	public static final int RETROSPECTIVE_VALUE = 2;

	/**
	 * An array of all the '<em><b>CDCONSEN Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDCONSENTvalues[] VALUES_ARRAY =
		new CDCONSENTvalues[] {
			LOCAL,
			PROSPECTIVE,
			RETROSPECTIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDCONSEN Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDCONSENTvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDCONSEN Tvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCONSENTvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCONSENTvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCONSEN Tvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCONSENTvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCONSENTvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCONSEN Tvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCONSENTvalues get(int value) {
		switch (value) {
			case LOCAL_VALUE: return LOCAL;
			case PROSPECTIVE_VALUE: return PROSPECTIVE;
			case RETROSPECTIVE_VALUE: return RETROSPECTIVE;
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
	private CDCONSENTvalues(int value, String name, String literal) {
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
	
} //CDCONSENTvalues
