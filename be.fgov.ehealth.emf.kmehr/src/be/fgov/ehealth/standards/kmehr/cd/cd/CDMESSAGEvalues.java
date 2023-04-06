/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDMESSAG Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDMESSAGEvalues()
 * @model extendedMetaData="name='CD-MESSAGEvalues'"
 * @generated
 */
public enum CDMESSAGEvalues implements Enumerator {
	/**
	 * The '<em><b>Gpsoftwaremigration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPSOFTWAREMIGRATION_VALUE
	 * @generated
	 * @ordered
	 */
	GPSOFTWAREMIGRATION(0, "gpsoftwaremigration", "gpsoftwaremigration"),

	/**
	 * The '<em><b>Gppatientmigration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPPATIENTMIGRATION_VALUE
	 * @generated
	 * @ordered
	 */
	GPPATIENTMIGRATION(1, "gppatientmigration", "gppatientmigration"),

	/**
	 * The '<em><b>Ptsoftwaremigration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTSOFTWAREMIGRATION_VALUE
	 * @generated
	 * @ordered
	 */
	PTSOFTWAREMIGRATION(2, "ptsoftwaremigration", "ptsoftwaremigration"),

	/**
	 * The '<em><b>Ptpatientmigration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTPATIENTMIGRATION_VALUE
	 * @generated
	 * @ordered
	 */
	PTPATIENTMIGRATION(3, "ptpatientmigration", "ptpatientmigration"),

	/**
	 * The '<em><b>Nursingsoftwaremigration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NURSINGSOFTWAREMIGRATION_VALUE
	 * @generated
	 * @ordered
	 */
	NURSINGSOFTWAREMIGRATION(4, "nursingsoftwaremigration", "nursingsoftwaremigration"),

	/**
	 * The '<em><b>Nursingpatientmigration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NURSINGPATIENTMIGRATION_VALUE
	 * @generated
	 * @ordered
	 */
	NURSINGPATIENTMIGRATION(5, "nursingpatientmigration", "nursingpatientmigration");

	/**
	 * The '<em><b>Gpsoftwaremigration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPSOFTWAREMIGRATION
	 * @model name="gpsoftwaremigration"
	 * @generated
	 * @ordered
	 */
	public static final int GPSOFTWAREMIGRATION_VALUE = 0;

	/**
	 * The '<em><b>Gppatientmigration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPPATIENTMIGRATION
	 * @model name="gppatientmigration"
	 * @generated
	 * @ordered
	 */
	public static final int GPPATIENTMIGRATION_VALUE = 1;

	/**
	 * The '<em><b>Ptsoftwaremigration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTSOFTWAREMIGRATION
	 * @model name="ptsoftwaremigration"
	 * @generated
	 * @ordered
	 */
	public static final int PTSOFTWAREMIGRATION_VALUE = 2;

	/**
	 * The '<em><b>Ptpatientmigration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTPATIENTMIGRATION
	 * @model name="ptpatientmigration"
	 * @generated
	 * @ordered
	 */
	public static final int PTPATIENTMIGRATION_VALUE = 3;

	/**
	 * The '<em><b>Nursingsoftwaremigration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NURSINGSOFTWAREMIGRATION
	 * @model name="nursingsoftwaremigration"
	 * @generated
	 * @ordered
	 */
	public static final int NURSINGSOFTWAREMIGRATION_VALUE = 4;

	/**
	 * The '<em><b>Nursingpatientmigration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NURSINGPATIENTMIGRATION
	 * @model name="nursingpatientmigration"
	 * @generated
	 * @ordered
	 */
	public static final int NURSINGPATIENTMIGRATION_VALUE = 5;

	/**
	 * An array of all the '<em><b>CDMESSAG Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDMESSAGEvalues[] VALUES_ARRAY =
		new CDMESSAGEvalues[] {
			GPSOFTWAREMIGRATION,
			GPPATIENTMIGRATION,
			PTSOFTWAREMIGRATION,
			PTPATIENTMIGRATION,
			NURSINGSOFTWAREMIGRATION,
			NURSINGPATIENTMIGRATION,
		};

	/**
	 * A public read-only list of all the '<em><b>CDMESSAG Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDMESSAGEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDMESSAG Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMESSAGEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDMESSAGEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDMESSAG Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMESSAGEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDMESSAGEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDMESSAG Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMESSAGEvalues get(int value) {
		switch (value) {
			case GPSOFTWAREMIGRATION_VALUE: return GPSOFTWAREMIGRATION;
			case GPPATIENTMIGRATION_VALUE: return GPPATIENTMIGRATION;
			case PTSOFTWAREMIGRATION_VALUE: return PTSOFTWAREMIGRATION;
			case PTPATIENTMIGRATION_VALUE: return PTPATIENTMIGRATION;
			case NURSINGSOFTWAREMIGRATION_VALUE: return NURSINGSOFTWAREMIGRATION;
			case NURSINGPATIENTMIGRATION_VALUE: return NURSINGPATIENTMIGRATION;
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
	private CDMESSAGEvalues(int value, String name, String literal) {
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
	
} //CDMESSAGEvalues
