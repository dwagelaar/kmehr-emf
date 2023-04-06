/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDORTHOTYP Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDORTHOTYPEvalues()
 * @model extendedMetaData="name='CD-ORTHO-TYPEvalues'"
 * @generated
 */
public enum CDORTHOTYPEvalues implements Enumerator {
	/**
	 * The '<em><b>Primaryprocedure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARYPROCEDURE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARYPROCEDURE(0, "primaryprocedure", "primaryprocedure"),

	/**
	 * The '<em><b>Revisionwithprosthesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVISIONWITHPROSTHESIS_VALUE
	 * @generated
	 * @ordered
	 */
	REVISIONWITHPROSTHESIS(1, "revisionwithprosthesis", "revisionwithprosthesis"),

	/**
	 * The '<em><b>Osteosynthesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSTEOSYNTHESIS_VALUE
	 * @generated
	 * @ordered
	 */
	OSTEOSYNTHESIS(2, "osteosynthesis", "osteosynthesis"),

	/**
	 * The '<em><b>Resection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESECTION_VALUE
	 * @generated
	 * @ordered
	 */
	RESECTION(3, "resection", "resection"),

	/**
	 * The '<em><b>Arthrodesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTHRODESIS_VALUE
	 * @generated
	 * @ordered
	 */
	ARTHRODESIS(4, "arthrodesis", "arthrodesis"),

	/**
	 * The '<em><b>Amputation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMPUTATION_VALUE
	 * @generated
	 * @ordered
	 */
	AMPUTATION(5, "amputation", "amputation");

	/**
	 * The '<em><b>Primaryprocedure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARYPROCEDURE
	 * @model name="primaryprocedure"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARYPROCEDURE_VALUE = 0;

	/**
	 * The '<em><b>Revisionwithprosthesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVISIONWITHPROSTHESIS
	 * @model name="revisionwithprosthesis"
	 * @generated
	 * @ordered
	 */
	public static final int REVISIONWITHPROSTHESIS_VALUE = 1;

	/**
	 * The '<em><b>Osteosynthesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSTEOSYNTHESIS
	 * @model name="osteosynthesis"
	 * @generated
	 * @ordered
	 */
	public static final int OSTEOSYNTHESIS_VALUE = 2;

	/**
	 * The '<em><b>Resection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESECTION
	 * @model name="resection"
	 * @generated
	 * @ordered
	 */
	public static final int RESECTION_VALUE = 3;

	/**
	 * The '<em><b>Arthrodesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTHRODESIS
	 * @model name="arthrodesis"
	 * @generated
	 * @ordered
	 */
	public static final int ARTHRODESIS_VALUE = 4;

	/**
	 * The '<em><b>Amputation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMPUTATION
	 * @model name="amputation"
	 * @generated
	 * @ordered
	 */
	public static final int AMPUTATION_VALUE = 5;

	/**
	 * An array of all the '<em><b>CDORTHOTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDORTHOTYPEvalues[] VALUES_ARRAY =
		new CDORTHOTYPEvalues[] {
			PRIMARYPROCEDURE,
			REVISIONWITHPROSTHESIS,
			OSTEOSYNTHESIS,
			RESECTION,
			ARTHRODESIS,
			AMPUTATION,
		};

	/**
	 * A public read-only list of all the '<em><b>CDORTHOTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDORTHOTYPEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDORTHOTYP Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDORTHOTYPEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDORTHOTYPEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDORTHOTYP Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDORTHOTYPEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDORTHOTYPEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDORTHOTYP Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDORTHOTYPEvalues get(int value) {
		switch (value) {
			case PRIMARYPROCEDURE_VALUE: return PRIMARYPROCEDURE;
			case REVISIONWITHPROSTHESIS_VALUE: return REVISIONWITHPROSTHESIS;
			case OSTEOSYNTHESIS_VALUE: return OSTEOSYNTHESIS;
			case RESECTION_VALUE: return RESECTION;
			case ARTHRODESIS_VALUE: return ARTHRODESIS;
			case AMPUTATION_VALUE: return AMPUTATION;
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
	private CDORTHOTYPEvalues(int value, String name, String literal) {
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
	
} //CDORTHOTYPEvalues
