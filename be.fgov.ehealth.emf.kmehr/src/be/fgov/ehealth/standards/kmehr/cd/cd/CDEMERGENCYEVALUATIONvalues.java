/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDEMERGENCYEVALUATIO Nvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDEMERGENCYEVALUATIONvalues()
 * @model extendedMetaData="name='CD-EMERGENCYEVALUATIONvalues'"
 * @generated
 */
public enum CDEMERGENCYEVALUATIONvalues implements Enumerator {
	/**
	 * The '<em><b>Couldwaitafterwe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULDWAITAFTERWE_VALUE
	 * @generated
	 * @ordered
	 */
	COULDWAITAFTERWE(0, "couldwaitafterwe", "couldwaitafterwe"),

	/**
	 * The '<em><b>Noturgent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTURGENT_VALUE
	 * @generated
	 * @ordered
	 */
	NOTURGENT(1, "noturgent", "noturgent"),

	/**
	 * The '<em><b>Urgent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URGENT_VALUE
	 * @generated
	 * @ordered
	 */
	URGENT(2, "urgent", "urgent"),

	/**
	 * The '<em><b>Lifethreathning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFETHREATHNING_VALUE
	 * @generated
	 * @ordered
	 */
	LIFETHREATHNING(3, "lifethreathning", "lifethreathning");

	/**
	 * The '<em><b>Couldwaitafterwe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULDWAITAFTERWE
	 * @model name="couldwaitafterwe"
	 * @generated
	 * @ordered
	 */
	public static final int COULDWAITAFTERWE_VALUE = 0;

	/**
	 * The '<em><b>Noturgent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTURGENT
	 * @model name="noturgent"
	 * @generated
	 * @ordered
	 */
	public static final int NOTURGENT_VALUE = 1;

	/**
	 * The '<em><b>Urgent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URGENT
	 * @model name="urgent"
	 * @generated
	 * @ordered
	 */
	public static final int URGENT_VALUE = 2;

	/**
	 * The '<em><b>Lifethreathning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFETHREATHNING
	 * @model name="lifethreathning"
	 * @generated
	 * @ordered
	 */
	public static final int LIFETHREATHNING_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDEMERGENCYEVALUATIO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDEMERGENCYEVALUATIONvalues[] VALUES_ARRAY =
		new CDEMERGENCYEVALUATIONvalues[] {
			COULDWAITAFTERWE,
			NOTURGENT,
			URGENT,
			LIFETHREATHNING,
		};

	/**
	 * A public read-only list of all the '<em><b>CDEMERGENCYEVALUATIO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDEMERGENCYEVALUATIONvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDEMERGENCYEVALUATIO Nvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEMERGENCYEVALUATIONvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEMERGENCYEVALUATIONvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEMERGENCYEVALUATIO Nvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEMERGENCYEVALUATIONvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEMERGENCYEVALUATIONvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEMERGENCYEVALUATIO Nvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEMERGENCYEVALUATIONvalues get(int value) {
		switch (value) {
			case COULDWAITAFTERWE_VALUE: return COULDWAITAFTERWE;
			case NOTURGENT_VALUE: return NOTURGENT;
			case URGENT_VALUE: return URGENT;
			case LIFETHREATHNING_VALUE: return LIFETHREATHNING;
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
	private CDEMERGENCYEVALUATIONvalues(int value, String name, String literal) {
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
	
} //CDEMERGENCYEVALUATIONvalues
