/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDITEMM Svalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDITEMMSvalues()
 * @model extendedMetaData="name='CD-ITEM-MSvalues'"
 * @generated
 */
public enum CDITEMMSvalues implements Enumerator {
	/**
	 * The '<em><b>Origin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORIGIN_VALUE
	 * @generated
	 * @ordered
	 */
	ORIGIN(0, "origin", "origin"),

	/**
	 * The '<em><b>Adaptationflag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADAPTATIONFLAG_VALUE
	 * @generated
	 * @ordered
	 */
	ADAPTATIONFLAG(1, "adaptationflag", "adaptationflag"),

	/**
	 * The '<em><b>Medicationuse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATIONUSE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATIONUSE(2, "medicationuse", "medicationuse"),

	/**
	 * The '<em><b>Medicationtype</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATIONTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATIONTYPE(3, "medicationtype", "medicationtype"),

	/**
	 * The '<em><b>Begincondition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEGINCONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	BEGINCONDITION(4, "begincondition", "begincondition"),

	/**
	 * The '<em><b>Endcondition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDCONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	ENDCONDITION(5, "endcondition", "endcondition");

	/**
	 * The '<em><b>Origin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORIGIN
	 * @model name="origin"
	 * @generated
	 * @ordered
	 */
	public static final int ORIGIN_VALUE = 0;

	/**
	 * The '<em><b>Adaptationflag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADAPTATIONFLAG
	 * @model name="adaptationflag"
	 * @generated
	 * @ordered
	 */
	public static final int ADAPTATIONFLAG_VALUE = 1;

	/**
	 * The '<em><b>Medicationuse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATIONUSE
	 * @model name="medicationuse"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATIONUSE_VALUE = 2;

	/**
	 * The '<em><b>Medicationtype</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATIONTYPE
	 * @model name="medicationtype"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATIONTYPE_VALUE = 3;

	/**
	 * The '<em><b>Begincondition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEGINCONDITION
	 * @model name="begincondition"
	 * @generated
	 * @ordered
	 */
	public static final int BEGINCONDITION_VALUE = 4;

	/**
	 * The '<em><b>Endcondition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDCONDITION
	 * @model name="endcondition"
	 * @generated
	 * @ordered
	 */
	public static final int ENDCONDITION_VALUE = 5;

	/**
	 * An array of all the '<em><b>CDITEMM Svalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDITEMMSvalues[] VALUES_ARRAY =
		new CDITEMMSvalues[] {
			ORIGIN,
			ADAPTATIONFLAG,
			MEDICATIONUSE,
			MEDICATIONTYPE,
			BEGINCONDITION,
			ENDCONDITION,
		};

	/**
	 * A public read-only list of all the '<em><b>CDITEMM Svalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDITEMMSvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDITEMM Svalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMMSvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMMSvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITEMM Svalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMMSvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMMSvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITEMM Svalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMMSvalues get(int value) {
		switch (value) {
			case ORIGIN_VALUE: return ORIGIN;
			case ADAPTATIONFLAG_VALUE: return ADAPTATIONFLAG;
			case MEDICATIONUSE_VALUE: return MEDICATIONUSE;
			case MEDICATIONTYPE_VALUE: return MEDICATIONTYPE;
			case BEGINCONDITION_VALUE: return BEGINCONDITION;
			case ENDCONDITION_VALUE: return ENDCONDITION;
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
	private CDITEMMSvalues(int value, String name, String literal) {
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
	
} //CDITEMMSvalues
