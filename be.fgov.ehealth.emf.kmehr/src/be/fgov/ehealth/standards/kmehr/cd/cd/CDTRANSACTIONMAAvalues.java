/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDTRANSACTIONMA Avalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDTRANSACTIONMAAvalues()
 * @model extendedMetaData="name='CD-TRANSACTION-MAAvalues'"
 * @generated
 */
public enum CDTRANSACTIONMAAvalues implements Enumerator {
	/**
	 * The '<em><b>Agreementrequest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTREQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	AGREEMENTREQUEST(0, "agreementrequest", "agreementrequest"),

	/**
	 * The '<em><b>Agreementresponse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTRESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	AGREEMENTRESPONSE(1, "agreementresponse", "agreementresponse"),

	/**
	 * The '<em><b>Freeappendix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREEAPPENDIX_VALUE
	 * @generated
	 * @ordered
	 */
	FREEAPPENDIX(2, "freeappendix", "freeappendix"),

	/**
	 * The '<em><b>Reglementaryappendix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGLEMENTARYAPPENDIX_VALUE
	 * @generated
	 * @ordered
	 */
	REGLEMENTARYAPPENDIX(3, "reglementaryappendix", "reglementaryappendix"),

	/**
	 * The '<em><b>Consultationrequest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTATIONREQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	CONSULTATIONREQUEST(4, "consultationrequest", "consultationrequest"),

	/**
	 * The '<em><b>Consultationresponse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTATIONRESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	CONSULTATIONRESPONSE(5, "consultationresponse", "consultationresponse");

	/**
	 * The '<em><b>Agreementrequest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTREQUEST
	 * @model name="agreementrequest"
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENTREQUEST_VALUE = 0;

	/**
	 * The '<em><b>Agreementresponse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTRESPONSE
	 * @model name="agreementresponse"
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENTRESPONSE_VALUE = 1;

	/**
	 * The '<em><b>Freeappendix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREEAPPENDIX
	 * @model name="freeappendix"
	 * @generated
	 * @ordered
	 */
	public static final int FREEAPPENDIX_VALUE = 2;

	/**
	 * The '<em><b>Reglementaryappendix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGLEMENTARYAPPENDIX
	 * @model name="reglementaryappendix"
	 * @generated
	 * @ordered
	 */
	public static final int REGLEMENTARYAPPENDIX_VALUE = 3;

	/**
	 * The '<em><b>Consultationrequest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTATIONREQUEST
	 * @model name="consultationrequest"
	 * @generated
	 * @ordered
	 */
	public static final int CONSULTATIONREQUEST_VALUE = 4;

	/**
	 * The '<em><b>Consultationresponse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTATIONRESPONSE
	 * @model name="consultationresponse"
	 * @generated
	 * @ordered
	 */
	public static final int CONSULTATIONRESPONSE_VALUE = 5;

	/**
	 * An array of all the '<em><b>CDTRANSACTIONMA Avalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDTRANSACTIONMAAvalues[] VALUES_ARRAY =
		new CDTRANSACTIONMAAvalues[] {
			AGREEMENTREQUEST,
			AGREEMENTRESPONSE,
			FREEAPPENDIX,
			REGLEMENTARYAPPENDIX,
			CONSULTATIONREQUEST,
			CONSULTATIONRESPONSE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDTRANSACTIONMA Avalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDTRANSACTIONMAAvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDTRANSACTIONMA Avalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONMAAvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDTRANSACTIONMAAvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDTRANSACTIONMA Avalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONMAAvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDTRANSACTIONMAAvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDTRANSACTIONMA Avalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONMAAvalues get(int value) {
		switch (value) {
			case AGREEMENTREQUEST_VALUE: return AGREEMENTREQUEST;
			case AGREEMENTRESPONSE_VALUE: return AGREEMENTRESPONSE;
			case FREEAPPENDIX_VALUE: return FREEAPPENDIX;
			case REGLEMENTARYAPPENDIX_VALUE: return REGLEMENTARYAPPENDIX;
			case CONSULTATIONREQUEST_VALUE: return CONSULTATIONREQUEST;
			case CONSULTATIONRESPONSE_VALUE: return CONSULTATIONRESPONSE;
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
	private CDTRANSACTIONMAAvalues(int value, String name, String literal) {
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
	
} //CDTRANSACTIONMAAvalues
