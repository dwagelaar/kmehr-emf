/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDMAAREQUESTTYP Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDMAAREQUESTTYPEvalues()
 * @model extendedMetaData="name='CD-MAA-REQUESTTYPEvalues'"
 * @generated
 */
public enum CDMAAREQUESTTYPEvalues implements Enumerator {
	/**
	 * The '<em><b>Newrequest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEWREQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	NEWREQUEST(0, "newrequest", "newrequest"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(1, "extension", "extension"),

	/**
	 * The '<em><b>Noncontinuousextension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONCONTINUOUSEXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	NONCONTINUOUSEXTENSION(2, "noncontinuousextension", "noncontinuousextension"),

	/**
	 * The '<em><b>Complimentaryannex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLIMENTARYANNEX_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLIMENTARYANNEX(3, "complimentaryannex", "complimentaryannex"),

	/**
	 * The '<em><b>Cancellation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLATION_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLATION(4, "cancellation", "cancellation"),

	/**
	 * The '<em><b>Closure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSURE(5, "closure", "closure");

	/**
	 * The '<em><b>Newrequest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEWREQUEST
	 * @model name="newrequest"
	 * @generated
	 * @ordered
	 */
	public static final int NEWREQUEST_VALUE = 0;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION
	 * @model name="extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 1;

	/**
	 * The '<em><b>Noncontinuousextension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONCONTINUOUSEXTENSION
	 * @model name="noncontinuousextension"
	 * @generated
	 * @ordered
	 */
	public static final int NONCONTINUOUSEXTENSION_VALUE = 2;

	/**
	 * The '<em><b>Complimentaryannex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLIMENTARYANNEX
	 * @model name="complimentaryannex"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLIMENTARYANNEX_VALUE = 3;

	/**
	 * The '<em><b>Cancellation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLATION
	 * @model name="cancellation"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLATION_VALUE = 4;

	/**
	 * The '<em><b>Closure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSURE
	 * @model name="closure"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSURE_VALUE = 5;

	/**
	 * An array of all the '<em><b>CDMAAREQUESTTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDMAAREQUESTTYPEvalues[] VALUES_ARRAY =
		new CDMAAREQUESTTYPEvalues[] {
			NEWREQUEST,
			EXTENSION,
			NONCONTINUOUSEXTENSION,
			COMPLIMENTARYANNEX,
			CANCELLATION,
			CLOSURE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDMAAREQUESTTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDMAAREQUESTTYPEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDMAAREQUESTTYP Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMAAREQUESTTYPEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDMAAREQUESTTYPEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDMAAREQUESTTYP Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMAAREQUESTTYPEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDMAAREQUESTTYPEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDMAAREQUESTTYP Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMAAREQUESTTYPEvalues get(int value) {
		switch (value) {
			case NEWREQUEST_VALUE: return NEWREQUEST;
			case EXTENSION_VALUE: return EXTENSION;
			case NONCONTINUOUSEXTENSION_VALUE: return NONCONTINUOUSEXTENSION;
			case COMPLIMENTARYANNEX_VALUE: return COMPLIMENTARYANNEX;
			case CANCELLATION_VALUE: return CANCELLATION;
			case CLOSURE_VALUE: return CLOSURE;
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
	private CDMAAREQUESTTYPEvalues(int value, String name, String literal) {
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
	
} //CDMAAREQUESTTYPEvalues
