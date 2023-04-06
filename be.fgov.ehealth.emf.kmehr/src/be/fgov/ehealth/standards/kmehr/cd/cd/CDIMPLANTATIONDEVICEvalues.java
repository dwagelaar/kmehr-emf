/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDIMPLANTATIONDEVIC Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDIMPLANTATIONDEVICEvalues()
 * @model extendedMetaData="name='CD-IMPLANTATION-DEVICEvalues'"
 * @generated
 */
public enum CDIMPLANTATIONDEVICEvalues implements Enumerator {
	/**
	 * The '<em><b>Spacer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPACER_VALUE
	 * @generated
	 * @ordered
	 */
	SPACER(0, "spacer", "spacer"),

	/**
	 * The '<em><b>Hipprosthesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIPPROSTHESIS_VALUE
	 * @generated
	 * @ordered
	 */
	HIPPROSTHESIS(1, "hipprosthesis", "hipprosthesis"),

	/**
	 * The '<em><b>Kneeprosthesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNEEPROSTHESIS_VALUE
	 * @generated
	 * @ordered
	 */
	KNEEPROSTHESIS(2, "kneeprosthesis", "kneeprosthesis");

	/**
	 * The '<em><b>Spacer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPACER
	 * @model name="spacer"
	 * @generated
	 * @ordered
	 */
	public static final int SPACER_VALUE = 0;

	/**
	 * The '<em><b>Hipprosthesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIPPROSTHESIS
	 * @model name="hipprosthesis"
	 * @generated
	 * @ordered
	 */
	public static final int HIPPROSTHESIS_VALUE = 1;

	/**
	 * The '<em><b>Kneeprosthesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNEEPROSTHESIS
	 * @model name="kneeprosthesis"
	 * @generated
	 * @ordered
	 */
	public static final int KNEEPROSTHESIS_VALUE = 2;

	/**
	 * An array of all the '<em><b>CDIMPLANTATIONDEVIC Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDIMPLANTATIONDEVICEvalues[] VALUES_ARRAY =
		new CDIMPLANTATIONDEVICEvalues[] {
			SPACER,
			HIPPROSTHESIS,
			KNEEPROSTHESIS,
		};

	/**
	 * A public read-only list of all the '<em><b>CDIMPLANTATIONDEVIC Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDIMPLANTATIONDEVICEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDIMPLANTATIONDEVIC Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDIMPLANTATIONDEVICEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDIMPLANTATIONDEVICEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDIMPLANTATIONDEVIC Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDIMPLANTATIONDEVICEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDIMPLANTATIONDEVICEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDIMPLANTATIONDEVIC Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDIMPLANTATIONDEVICEvalues get(int value) {
		switch (value) {
			case SPACER_VALUE: return SPACER;
			case HIPPROSTHESIS_VALUE: return HIPPROSTHESIS;
			case KNEEPROSTHESIS_VALUE: return KNEEPROSTHESIS;
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
	private CDIMPLANTATIONDEVICEvalues(int value, String name, String literal) {
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
	
} //CDIMPLANTATIONDEVICEvalues
