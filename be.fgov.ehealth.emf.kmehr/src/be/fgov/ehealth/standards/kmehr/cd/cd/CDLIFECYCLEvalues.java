/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDLIFECYCL Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDLIFECYCLEvalues()
 * @model extendedMetaData="name='CD-LIFECYCLEvalues'"
 * @generated
 */
public enum CDLIFECYCLEvalues implements Enumerator {
	/**
	 * The '<em><b>Aborted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORTED_VALUE
	 * @generated
	 * @ordered
	 */
	ABORTED(0, "aborted", "aborted"),

	/**
	 * The '<em><b>Active</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE(1, "active", "active"),

	/**
	 * The '<em><b>Added</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDED_VALUE
	 * @generated
	 * @ordered
	 */
	ADDED(2, "added", "added"),

	/**
	 * The '<em><b>Administrated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATED_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINISTRATED(3, "administrated", "administrated"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(4, "cancelled", "cancelled"),

	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(5, "completed", "completed"),

	/**
	 * The '<em><b>Corrected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRECTED_VALUE
	 * @generated
	 * @ordered
	 */
	CORRECTED(6, "corrected", "corrected"),

	/**
	 * The '<em><b>Delivered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVERED_VALUE
	 * @generated
	 * @ordered
	 */
	DELIVERED(7, "delivered", "delivered"),

	/**
	 * The '<em><b>Substituted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTED_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTITUTED(8, "substituted", "substituted"),

	/**
	 * The '<em><b>Inactive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	INACTIVE(9, "inactive", "inactive"),

	/**
	 * The '<em><b>Planned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNED_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNED(10, "planned", "planned"),

	/**
	 * The '<em><b>Prescribed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIBED_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIBED(11, "prescribed", "prescribed"),

	/**
	 * The '<em><b>Reported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	REPORTED(12, "reported", "reported"),

	/**
	 * The '<em><b>Refused</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSED_VALUE
	 * @generated
	 * @ordered
	 */
	REFUSED(13, "refused", "refused"),

	/**
	 * The '<em><b>Switched</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWITCHED_VALUE
	 * @generated
	 * @ordered
	 */
	SWITCHED(14, "switched", "switched"),

	/**
	 * The '<em><b>Suspended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPENDED(15, "suspended", "suspended"),

	/**
	 * The '<em><b>Stopped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOPPED_VALUE
	 * @generated
	 * @ordered
	 */
	STOPPED(16, "stopped", "stopped"),

	/**
	 * The '<em><b>Excluded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUDED_VALUE
	 * @generated
	 * @ordered
	 */
	EXCLUDED(17, "excluded", "excluded"),

	/**
	 * The '<em><b>Notpresent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTPRESENT_VALUE
	 * @generated
	 * @ordered
	 */
	NOTPRESENT(18, "notpresent", "notpresent"),

	/**
	 * The '<em><b>Ordered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED_VALUE
	 * @generated
	 * @ordered
	 */
	ORDERED(19, "ordered", "ordered"),

	/**
	 * The '<em><b>Scheduled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULED_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULED(20, "scheduled", "scheduled"),

	/**
	 * The '<em><b>Todo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TODO_VALUE
	 * @generated
	 * @ordered
	 */
	TODO(21, "todo", "todo"),

	/**
	 * The '<em><b>Postponed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTPONED_VALUE
	 * @generated
	 * @ordered
	 */
	POSTPONED(22, "postponed", "postponed"),

	/**
	 * The '<em><b>Pending</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING(23, "pending", "pending"),

	/**
	 * The '<em><b>Expected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPECTED_VALUE
	 * @generated
	 * @ordered
	 */
	EXPECTED(24, "expected", "expected"),

	/**
	 * The '<em><b>Obtained</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBTAINED_VALUE
	 * @generated
	 * @ordered
	 */
	OBTAINED(25, "obtained", "obtained"),

	/**
	 * The '<em><b>Proposed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	PROPOSED(26, "proposed", "proposed"),

	/**
	 * The '<em><b>Retracted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRACTED_VALUE
	 * @generated
	 * @ordered
	 */
	RETRACTED(27, "retracted", "retracted");

	/**
	 * The '<em><b>Aborted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORTED
	 * @model name="aborted"
	 * @generated
	 * @ordered
	 */
	public static final int ABORTED_VALUE = 0;

	/**
	 * The '<em><b>Active</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE
	 * @model name="active"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_VALUE = 1;

	/**
	 * The '<em><b>Added</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDED
	 * @model name="added"
	 * @generated
	 * @ordered
	 */
	public static final int ADDED_VALUE = 2;

	/**
	 * The '<em><b>Administrated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATED
	 * @model name="administrated"
	 * @generated
	 * @ordered
	 */
	public static final int ADMINISTRATED_VALUE = 3;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED
	 * @model name="cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 4;

	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED
	 * @model name="completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 5;

	/**
	 * The '<em><b>Corrected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRECTED
	 * @model name="corrected"
	 * @generated
	 * @ordered
	 */
	public static final int CORRECTED_VALUE = 6;

	/**
	 * The '<em><b>Delivered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVERED
	 * @model name="delivered"
	 * @generated
	 * @ordered
	 */
	public static final int DELIVERED_VALUE = 7;

	/**
	 * The '<em><b>Substituted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTED
	 * @model name="substituted"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTITUTED_VALUE = 8;

	/**
	 * The '<em><b>Inactive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INACTIVE
	 * @model name="inactive"
	 * @generated
	 * @ordered
	 */
	public static final int INACTIVE_VALUE = 9;

	/**
	 * The '<em><b>Planned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNED
	 * @model name="planned"
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_VALUE = 10;

	/**
	 * The '<em><b>Prescribed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIBED
	 * @model name="prescribed"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIBED_VALUE = 11;

	/**
	 * The '<em><b>Reported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTED
	 * @model name="reported"
	 * @generated
	 * @ordered
	 */
	public static final int REPORTED_VALUE = 12;

	/**
	 * The '<em><b>Refused</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSED
	 * @model name="refused"
	 * @generated
	 * @ordered
	 */
	public static final int REFUSED_VALUE = 13;

	/**
	 * The '<em><b>Switched</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWITCHED
	 * @model name="switched"
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHED_VALUE = 14;

	/**
	 * The '<em><b>Suspended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED
	 * @model name="suspended"
	 * @generated
	 * @ordered
	 */
	public static final int SUSPENDED_VALUE = 15;

	/**
	 * The '<em><b>Stopped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOPPED
	 * @model name="stopped"
	 * @generated
	 * @ordered
	 */
	public static final int STOPPED_VALUE = 16;

	/**
	 * The '<em><b>Excluded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUDED
	 * @model name="excluded"
	 * @generated
	 * @ordered
	 */
	public static final int EXCLUDED_VALUE = 17;

	/**
	 * The '<em><b>Notpresent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTPRESENT
	 * @model name="notpresent"
	 * @generated
	 * @ordered
	 */
	public static final int NOTPRESENT_VALUE = 18;

	/**
	 * The '<em><b>Ordered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED
	 * @model name="ordered"
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_VALUE = 19;

	/**
	 * The '<em><b>Scheduled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULED
	 * @model name="scheduled"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULED_VALUE = 20;

	/**
	 * The '<em><b>Todo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TODO
	 * @model name="todo"
	 * @generated
	 * @ordered
	 */
	public static final int TODO_VALUE = 21;

	/**
	 * The '<em><b>Postponed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTPONED
	 * @model name="postponed"
	 * @generated
	 * @ordered
	 */
	public static final int POSTPONED_VALUE = 22;

	/**
	 * The '<em><b>Pending</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING
	 * @model name="pending"
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_VALUE = 23;

	/**
	 * The '<em><b>Expected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPECTED
	 * @model name="expected"
	 * @generated
	 * @ordered
	 */
	public static final int EXPECTED_VALUE = 24;

	/**
	 * The '<em><b>Obtained</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBTAINED
	 * @model name="obtained"
	 * @generated
	 * @ordered
	 */
	public static final int OBTAINED_VALUE = 25;

	/**
	 * The '<em><b>Proposed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPOSED
	 * @model name="proposed"
	 * @generated
	 * @ordered
	 */
	public static final int PROPOSED_VALUE = 26;

	/**
	 * The '<em><b>Retracted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRACTED
	 * @model name="retracted"
	 * @generated
	 * @ordered
	 */
	public static final int RETRACTED_VALUE = 27;

	/**
	 * An array of all the '<em><b>CDLIFECYCL Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDLIFECYCLEvalues[] VALUES_ARRAY =
		new CDLIFECYCLEvalues[] {
			ABORTED,
			ACTIVE,
			ADDED,
			ADMINISTRATED,
			CANCELLED,
			COMPLETED,
			CORRECTED,
			DELIVERED,
			SUBSTITUTED,
			INACTIVE,
			PLANNED,
			PRESCRIBED,
			REPORTED,
			REFUSED,
			SWITCHED,
			SUSPENDED,
			STOPPED,
			EXCLUDED,
			NOTPRESENT,
			ORDERED,
			SCHEDULED,
			TODO,
			POSTPONED,
			PENDING,
			EXPECTED,
			OBTAINED,
			PROPOSED,
			RETRACTED,
		};

	/**
	 * A public read-only list of all the '<em><b>CDLIFECYCL Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDLIFECYCLEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDLIFECYCL Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDLIFECYCLEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDLIFECYCLEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDLIFECYCL Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDLIFECYCLEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDLIFECYCLEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDLIFECYCL Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDLIFECYCLEvalues get(int value) {
		switch (value) {
			case ABORTED_VALUE: return ABORTED;
			case ACTIVE_VALUE: return ACTIVE;
			case ADDED_VALUE: return ADDED;
			case ADMINISTRATED_VALUE: return ADMINISTRATED;
			case CANCELLED_VALUE: return CANCELLED;
			case COMPLETED_VALUE: return COMPLETED;
			case CORRECTED_VALUE: return CORRECTED;
			case DELIVERED_VALUE: return DELIVERED;
			case SUBSTITUTED_VALUE: return SUBSTITUTED;
			case INACTIVE_VALUE: return INACTIVE;
			case PLANNED_VALUE: return PLANNED;
			case PRESCRIBED_VALUE: return PRESCRIBED;
			case REPORTED_VALUE: return REPORTED;
			case REFUSED_VALUE: return REFUSED;
			case SWITCHED_VALUE: return SWITCHED;
			case SUSPENDED_VALUE: return SUSPENDED;
			case STOPPED_VALUE: return STOPPED;
			case EXCLUDED_VALUE: return EXCLUDED;
			case NOTPRESENT_VALUE: return NOTPRESENT;
			case ORDERED_VALUE: return ORDERED;
			case SCHEDULED_VALUE: return SCHEDULED;
			case TODO_VALUE: return TODO;
			case POSTPONED_VALUE: return POSTPONED;
			case PENDING_VALUE: return PENDING;
			case EXPECTED_VALUE: return EXPECTED;
			case OBTAINED_VALUE: return OBTAINED;
			case PROPOSED_VALUE: return PROPOSED;
			case RETRACTED_VALUE: return RETRACTED;
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
	private CDLIFECYCLEvalues(int value, String name, String literal) {
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
	
} //CDLIFECYCLEvalues
