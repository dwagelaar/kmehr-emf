/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDBEARINGSURFAC Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDBEARINGSURFACEvalues()
 * @model extendedMetaData="name='CD-BEARING-SURFACEvalues'"
 * @generated
 */
public enum CDBEARINGSURFACEvalues implements Enumerator {
	/**
	 * The '<em><b>Metalpoly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METALPOLY_VALUE
	 * @generated
	 * @ordered
	 */
	METALPOLY(0, "metalpoly", "metalpoly"),

	/**
	 * The '<em><b>Cerampoly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERAMPOLY_VALUE
	 * @generated
	 * @ordered
	 */
	CERAMPOLY(1, "cerampoly", "cerampoly"),

	/**
	 * The '<em><b>Metalmetal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METALMETAL_VALUE
	 * @generated
	 * @ordered
	 */
	METALMETAL(2, "metalmetal", "metalmetal"),

	/**
	 * The '<em><b>Ceramceram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERAMCERAM_VALUE
	 * @generated
	 * @ordered
	 */
	CERAMCERAM(3, "ceramceram", "ceramceram"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "other", "other");

	/**
	 * The '<em><b>Metalpoly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METALPOLY
	 * @model name="metalpoly"
	 * @generated
	 * @ordered
	 */
	public static final int METALPOLY_VALUE = 0;

	/**
	 * The '<em><b>Cerampoly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERAMPOLY
	 * @model name="cerampoly"
	 * @generated
	 * @ordered
	 */
	public static final int CERAMPOLY_VALUE = 1;

	/**
	 * The '<em><b>Metalmetal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METALMETAL
	 * @model name="metalmetal"
	 * @generated
	 * @ordered
	 */
	public static final int METALMETAL_VALUE = 2;

	/**
	 * The '<em><b>Ceramceram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERAMCERAM
	 * @model name="ceramceram"
	 * @generated
	 * @ordered
	 */
	public static final int CERAMCERAM_VALUE = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>CDBEARINGSURFAC Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDBEARINGSURFACEvalues[] VALUES_ARRAY =
		new CDBEARINGSURFACEvalues[] {
			METALPOLY,
			CERAMPOLY,
			METALMETAL,
			CERAMCERAM,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>CDBEARINGSURFAC Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDBEARINGSURFACEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDBEARINGSURFAC Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDBEARINGSURFACEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDBEARINGSURFACEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDBEARINGSURFAC Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDBEARINGSURFACEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDBEARINGSURFACEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDBEARINGSURFAC Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDBEARINGSURFACEvalues get(int value) {
		switch (value) {
			case METALPOLY_VALUE: return METALPOLY;
			case CERAMPOLY_VALUE: return CERAMPOLY;
			case METALMETAL_VALUE: return METALMETAL;
			case CERAMCERAM_VALUE: return CERAMCERAM;
			case OTHER_VALUE: return OTHER;
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
	private CDBEARINGSURFACEvalues(int value, String name, String literal) {
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
	
} //CDBEARINGSURFACEvalues
