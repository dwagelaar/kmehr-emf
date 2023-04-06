/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDTRANSACTIONCARENE Tvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDTRANSACTIONCARENETvalues()
 * @model extendedMetaData="name='CD-TRANSACTION-CARENETvalues'"
 * @generated
 */
public enum CDTRANSACTIONCARENETvalues implements Enumerator {
	/**
	 * The '<em><b>Admission</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMISSION_VALUE
	 * @generated
	 * @ordered
	 */
	ADMISSION(0, "admission", "admission"),

	/**
	 * The '<em><b>732</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_732_VALUE
	 * @generated
	 * @ordered
	 */
	_732(1, "_732", "732"),

	/**
	 * The '<em><b>Discharge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCHARGE_VALUE
	 * @generated
	 * @ordered
	 */
	DISCHARGE(2, "discharge", "discharge"),

	/**
	 * The '<em><b>725</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_725_VALUE
	 * @generated
	 * @ordered
	 */
	_725(3, "_725", "725"),

	/**
	 * The '<em><b></b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #___VALUE
	 * @generated
	 * @ordered
	 */
	__(4, "__", "...");

	/**
	 * The '<em><b>Admission</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMISSION
	 * @model name="admission"
	 * @generated
	 * @ordered
	 */
	public static final int ADMISSION_VALUE = 0;

	/**
	 * The '<em><b>732</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_732
	 * @model literal="732"
	 * @generated
	 * @ordered
	 */
	public static final int _732_VALUE = 1;

	/**
	 * The '<em><b>Discharge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCHARGE
	 * @model name="discharge"
	 * @generated
	 * @ordered
	 */
	public static final int DISCHARGE_VALUE = 2;

	/**
	 * The '<em><b>725</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_725
	 * @model literal="725"
	 * @generated
	 * @ordered
	 */
	public static final int _725_VALUE = 3;

	/**
	 * The '<em><b></b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #__
	 * @model literal="..."
	 * @generated
	 * @ordered
	 */
	public static final int ___VALUE = 4;

	/**
	 * An array of all the '<em><b>CDTRANSACTIONCARENE Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDTRANSACTIONCARENETvalues[] VALUES_ARRAY =
		new CDTRANSACTIONCARENETvalues[] {
			ADMISSION,
			_732,
			DISCHARGE,
			_725,
			__,
		};

	/**
	 * A public read-only list of all the '<em><b>CDTRANSACTIONCARENE Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDTRANSACTIONCARENETvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDTRANSACTIONCARENE Tvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONCARENETvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDTRANSACTIONCARENETvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDTRANSACTIONCARENE Tvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONCARENETvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDTRANSACTIONCARENETvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDTRANSACTIONCARENE Tvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONCARENETvalues get(int value) {
		switch (value) {
			case ADMISSION_VALUE: return ADMISSION;
			case _732_VALUE: return _732;
			case DISCHARGE_VALUE: return DISCHARGE;
			case _725_VALUE: return _725;
			case ___VALUE: return __;
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
	private CDTRANSACTIONCARENETvalues(int value, String name, String literal) {
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
	
} //CDTRANSACTIONCARENETvalues
