/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDTRANSACTIONTYP Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDTRANSACTIONTYPEvalues()
 * @model extendedMetaData="name='CD-TRANSACTION-TYPEvalues'"
 * @generated
 */
public enum CDTRANSACTIONTYPEvalues implements Enumerator {
	/**
	 * The '<em><b>Incapacity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCAPACITY_VALUE
	 * @generated
	 * @ordered
	 */
	INCAPACITY(0, "incapacity", "incapacity"),

	/**
	 * The '<em><b>Incapacityextension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCAPACITYEXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	INCAPACITYEXTENSION(1, "incapacityextension", "incapacityextension"),

	/**
	 * The '<em><b>Incapacityrelapse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCAPACITYRELAPSE_VALUE
	 * @generated
	 * @ordered
	 */
	INCAPACITYRELAPSE(2, "incapacityrelapse", "incapacityrelapse"),

	/**
	 * The '<em><b>Nursing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NURSING_VALUE
	 * @generated
	 * @ordered
	 */
	NURSING(3, "nursing", "nursing"),

	/**
	 * The '<em><b>Physiotherapy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSIOTHERAPY_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSIOTHERAPY(4, "physiotherapy", "physiotherapy"),

	/**
	 * The '<em><b>Intermediarynursing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIARYNURSING_VALUE
	 * @generated
	 * @ordered
	 */
	INTERMEDIARYNURSING(5, "intermediarynursing", "intermediarynursing"),

	/**
	 * The '<em><b>Intermediaryphysiotherapy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIARYPHYSIOTHERAPY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERMEDIARYPHYSIOTHERAPY(6, "intermediaryphysiotherapy", "intermediaryphysiotherapy"),

	/**
	 * The '<em><b>Transferdocument</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFERDOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFERDOCUMENT(7, "transferdocument", "transferdocument"),

	/**
	 * The '<em><b>Childrecord</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILDRECORD_VALUE
	 * @generated
	 * @ordered
	 */
	CHILDRECORD(8, "childrecord", "childrecord");

	/**
	 * The '<em><b>Incapacity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCAPACITY
	 * @model name="incapacity"
	 * @generated
	 * @ordered
	 */
	public static final int INCAPACITY_VALUE = 0;

	/**
	 * The '<em><b>Incapacityextension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCAPACITYEXTENSION
	 * @model name="incapacityextension"
	 * @generated
	 * @ordered
	 */
	public static final int INCAPACITYEXTENSION_VALUE = 1;

	/**
	 * The '<em><b>Incapacityrelapse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCAPACITYRELAPSE
	 * @model name="incapacityrelapse"
	 * @generated
	 * @ordered
	 */
	public static final int INCAPACITYRELAPSE_VALUE = 2;

	/**
	 * The '<em><b>Nursing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NURSING
	 * @model name="nursing"
	 * @generated
	 * @ordered
	 */
	public static final int NURSING_VALUE = 3;

	/**
	 * The '<em><b>Physiotherapy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSIOTHERAPY
	 * @model name="physiotherapy"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSIOTHERAPY_VALUE = 4;

	/**
	 * The '<em><b>Intermediarynursing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIARYNURSING
	 * @model name="intermediarynursing"
	 * @generated
	 * @ordered
	 */
	public static final int INTERMEDIARYNURSING_VALUE = 5;

	/**
	 * The '<em><b>Intermediaryphysiotherapy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIARYPHYSIOTHERAPY
	 * @model name="intermediaryphysiotherapy"
	 * @generated
	 * @ordered
	 */
	public static final int INTERMEDIARYPHYSIOTHERAPY_VALUE = 6;

	/**
	 * The '<em><b>Transferdocument</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFERDOCUMENT
	 * @model name="transferdocument"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFERDOCUMENT_VALUE = 7;

	/**
	 * The '<em><b>Childrecord</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILDRECORD
	 * @model name="childrecord"
	 * @generated
	 * @ordered
	 */
	public static final int CHILDRECORD_VALUE = 8;

	/**
	 * An array of all the '<em><b>CDTRANSACTIONTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDTRANSACTIONTYPEvalues[] VALUES_ARRAY =
		new CDTRANSACTIONTYPEvalues[] {
			INCAPACITY,
			INCAPACITYEXTENSION,
			INCAPACITYRELAPSE,
			NURSING,
			PHYSIOTHERAPY,
			INTERMEDIARYNURSING,
			INTERMEDIARYPHYSIOTHERAPY,
			TRANSFERDOCUMENT,
			CHILDRECORD,
		};

	/**
	 * A public read-only list of all the '<em><b>CDTRANSACTIONTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDTRANSACTIONTYPEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDTRANSACTIONTYP Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONTYPEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDTRANSACTIONTYPEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDTRANSACTIONTYP Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONTYPEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDTRANSACTIONTYPEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDTRANSACTIONTYP Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONTYPEvalues get(int value) {
		switch (value) {
			case INCAPACITY_VALUE: return INCAPACITY;
			case INCAPACITYEXTENSION_VALUE: return INCAPACITYEXTENSION;
			case INCAPACITYRELAPSE_VALUE: return INCAPACITYRELAPSE;
			case NURSING_VALUE: return NURSING;
			case PHYSIOTHERAPY_VALUE: return PHYSIOTHERAPY;
			case INTERMEDIARYNURSING_VALUE: return INTERMEDIARYNURSING;
			case INTERMEDIARYPHYSIOTHERAPY_VALUE: return INTERMEDIARYPHYSIOTHERAPY;
			case TRANSFERDOCUMENT_VALUE: return TRANSFERDOCUMENT;
			case CHILDRECORD_VALUE: return CHILDRECORD;
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
	private CDTRANSACTIONTYPEvalues(int value, String name, String literal) {
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
	
} //CDTRANSACTIONTYPEvalues
