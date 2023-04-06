/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDBVTCONSERVATIONMOD Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDBVTCONSERVATIONMODEvalues()
 * @model extendedMetaData="name='CD-BVT-CONSERVATIONMODEvalues'"
 * @generated
 */
public enum CDBVTCONSERVATIONMODEvalues implements Enumerator {
	/**
	 * The '<em><b>Minus20degreesc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS20DEGREESC_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS20DEGREESC(0, "minus20degreesc", "minus20degreesc"),

	/**
	 * The '<em><b>Minus80degreesc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS80DEGREESC_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS80DEGREESC(1, "minus80degreesc", "minus80degreesc"),

	/**
	 * The '<em><b>Minus120degreesorcolder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS120DEGREESORCOLDER_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS120DEGREESORCOLDER(2, "minus120degreesorcolder", "minus120degreesorcolder"),

	/**
	 * The '<em><b>Liquidnitrogen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIQUIDNITROGEN_VALUE
	 * @generated
	 * @ordered
	 */
	LIQUIDNITROGEN(3, "liquidnitrogen", "liquidnitrogen"),

	/**
	 * The '<em><b>Inclusioninparaffin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUSIONINPARAFFIN_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUSIONINPARAFFIN(4, "inclusioninparaffin", "inclusioninparaffin"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "other", "other");

	/**
	 * The '<em><b>Minus20degreesc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS20DEGREESC
	 * @model name="minus20degreesc"
	 * @generated
	 * @ordered
	 */
	public static final int MINUS20DEGREESC_VALUE = 0;

	/**
	 * The '<em><b>Minus80degreesc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS80DEGREESC
	 * @model name="minus80degreesc"
	 * @generated
	 * @ordered
	 */
	public static final int MINUS80DEGREESC_VALUE = 1;

	/**
	 * The '<em><b>Minus120degreesorcolder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS120DEGREESORCOLDER
	 * @model name="minus120degreesorcolder"
	 * @generated
	 * @ordered
	 */
	public static final int MINUS120DEGREESORCOLDER_VALUE = 2;

	/**
	 * The '<em><b>Liquidnitrogen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIQUIDNITROGEN
	 * @model name="liquidnitrogen"
	 * @generated
	 * @ordered
	 */
	public static final int LIQUIDNITROGEN_VALUE = 3;

	/**
	 * The '<em><b>Inclusioninparaffin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUSIONINPARAFFIN
	 * @model name="inclusioninparaffin"
	 * @generated
	 * @ordered
	 */
	public static final int INCLUSIONINPARAFFIN_VALUE = 4;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 5;

	/**
	 * An array of all the '<em><b>CDBVTCONSERVATIONMOD Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDBVTCONSERVATIONMODEvalues[] VALUES_ARRAY =
		new CDBVTCONSERVATIONMODEvalues[] {
			MINUS20DEGREESC,
			MINUS80DEGREESC,
			MINUS120DEGREESORCOLDER,
			LIQUIDNITROGEN,
			INCLUSIONINPARAFFIN,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>CDBVTCONSERVATIONMOD Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDBVTCONSERVATIONMODEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDBVTCONSERVATIONMOD Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDBVTCONSERVATIONMODEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDBVTCONSERVATIONMODEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDBVTCONSERVATIONMOD Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDBVTCONSERVATIONMODEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDBVTCONSERVATIONMODEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDBVTCONSERVATIONMOD Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDBVTCONSERVATIONMODEvalues get(int value) {
		switch (value) {
			case MINUS20DEGREESC_VALUE: return MINUS20DEGREESC;
			case MINUS80DEGREESC_VALUE: return MINUS80DEGREESC;
			case MINUS120DEGREESORCOLDER_VALUE: return MINUS120DEGREESORCOLDER;
			case LIQUIDNITROGEN_VALUE: return LIQUIDNITROGEN;
			case INCLUSIONINPARAFFIN_VALUE: return INCLUSIONINPARAFFIN;
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
	private CDBVTCONSERVATIONMODEvalues(int value, String name, String literal) {
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
	
} //CDBVTCONSERVATIONMODEvalues
