/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDTRANSACTIONRE Gvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDTRANSACTIONREGvalues()
 * @model extendedMetaData="name='CD-TRANSACTION-REGvalues'"
 * @generated
 */
public enum CDTRANSACTIONREGvalues implements Enumerator {
	/**
	 * The '<em><b>Qermid Stent Intervention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QERMID_STENT_INTERVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	QERMID_STENT_INTERVENTION(0, "qermidStentIntervention", "qermid-stent-intervention"),

	/**
	 * The '<em><b>Orthopride Intervention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORTHOPRIDE_INTERVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	ORTHOPRIDE_INTERVENTION(1, "orthoprideIntervention", "orthopride-intervention"),

	/**
	 * The '<em><b>Defib Intervention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFIB_INTERVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	DEFIB_INTERVENTION(2, "defibIntervention", "defib-intervention"),

	/**
	 * The '<em><b>Pacemaker Intervention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACEMAKER_INTERVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	PACEMAKER_INTERVENTION(3, "pacemakerIntervention", "pacemaker-intervention"),

	/**
	 * The '<em><b>Arthritis Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTHRITIS_NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	ARTHRITIS_NOTIFICATION(4, "arthritisNotification", "arthritis-notification");

	/**
	 * The '<em><b>Qermid Stent Intervention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QERMID_STENT_INTERVENTION
	 * @model name="qermidStentIntervention" literal="qermid-stent-intervention"
	 * @generated
	 * @ordered
	 */
	public static final int QERMID_STENT_INTERVENTION_VALUE = 0;

	/**
	 * The '<em><b>Orthopride Intervention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORTHOPRIDE_INTERVENTION
	 * @model name="orthoprideIntervention" literal="orthopride-intervention"
	 * @generated
	 * @ordered
	 */
	public static final int ORTHOPRIDE_INTERVENTION_VALUE = 1;

	/**
	 * The '<em><b>Defib Intervention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFIB_INTERVENTION
	 * @model name="defibIntervention" literal="defib-intervention"
	 * @generated
	 * @ordered
	 */
	public static final int DEFIB_INTERVENTION_VALUE = 2;

	/**
	 * The '<em><b>Pacemaker Intervention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACEMAKER_INTERVENTION
	 * @model name="pacemakerIntervention" literal="pacemaker-intervention"
	 * @generated
	 * @ordered
	 */
	public static final int PACEMAKER_INTERVENTION_VALUE = 3;

	/**
	 * The '<em><b>Arthritis Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTHRITIS_NOTIFICATION
	 * @model name="arthritisNotification" literal="arthritis-notification"
	 * @generated
	 * @ordered
	 */
	public static final int ARTHRITIS_NOTIFICATION_VALUE = 4;

	/**
	 * An array of all the '<em><b>CDTRANSACTIONRE Gvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDTRANSACTIONREGvalues[] VALUES_ARRAY =
		new CDTRANSACTIONREGvalues[] {
			QERMID_STENT_INTERVENTION,
			ORTHOPRIDE_INTERVENTION,
			DEFIB_INTERVENTION,
			PACEMAKER_INTERVENTION,
			ARTHRITIS_NOTIFICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>CDTRANSACTIONRE Gvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDTRANSACTIONREGvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDTRANSACTIONRE Gvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONREGvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDTRANSACTIONREGvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDTRANSACTIONRE Gvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONREGvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDTRANSACTIONREGvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDTRANSACTIONRE Gvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONREGvalues get(int value) {
		switch (value) {
			case QERMID_STENT_INTERVENTION_VALUE: return QERMID_STENT_INTERVENTION;
			case ORTHOPRIDE_INTERVENTION_VALUE: return ORTHOPRIDE_INTERVENTION;
			case DEFIB_INTERVENTION_VALUE: return DEFIB_INTERVENTION;
			case PACEMAKER_INTERVENTION_VALUE: return PACEMAKER_INTERVENTION;
			case ARTHRITIS_NOTIFICATION_VALUE: return ARTHRITIS_NOTIFICATION;
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
	private CDTRANSACTIONREGvalues(int value, String name, String literal) {
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
	
} //CDTRANSACTIONREGvalues
