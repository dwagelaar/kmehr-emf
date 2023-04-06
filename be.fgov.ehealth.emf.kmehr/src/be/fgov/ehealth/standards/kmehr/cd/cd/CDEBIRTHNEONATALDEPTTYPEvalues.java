/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDEBIRTHNEONATALDEPTTYP Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDEBIRTHNEONATALDEPTTYPEvalues()
 * @model extendedMetaData="name='CD-EBIRTH-NEONATALDEPTTYPEvalues'"
 * @generated
 */
public enum CDEBIRTHNEONATALDEPTTYPEvalues implements Enumerator {
	/**
	 * The '<em><b>Nstar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NSTAR_VALUE
	 * @generated
	 * @ordered
	 */
	NSTAR(0, "nstar", "nstar"),

	/**
	 * The '<em><b>Nic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIC_VALUE
	 * @generated
	 * @ordered
	 */
	NIC(1, "nic", "nic");

	/**
	 * The '<em><b>Nstar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NSTAR
	 * @model name="nstar"
	 * @generated
	 * @ordered
	 */
	public static final int NSTAR_VALUE = 0;

	/**
	 * The '<em><b>Nic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIC
	 * @model name="nic"
	 * @generated
	 * @ordered
	 */
	public static final int NIC_VALUE = 1;

	/**
	 * An array of all the '<em><b>CDEBIRTHNEONATALDEPTTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDEBIRTHNEONATALDEPTTYPEvalues[] VALUES_ARRAY =
		new CDEBIRTHNEONATALDEPTTYPEvalues[] {
			NSTAR,
			NIC,
		};

	/**
	 * A public read-only list of all the '<em><b>CDEBIRTHNEONATALDEPTTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDEBIRTHNEONATALDEPTTYPEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDEBIRTHNEONATALDEPTTYP Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHNEONATALDEPTTYPEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEBIRTHNEONATALDEPTTYPEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEBIRTHNEONATALDEPTTYP Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHNEONATALDEPTTYPEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEBIRTHNEONATALDEPTTYPEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEBIRTHNEONATALDEPTTYP Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHNEONATALDEPTTYPEvalues get(int value) {
		switch (value) {
			case NSTAR_VALUE: return NSTAR;
			case NIC_VALUE: return NIC;
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
	private CDEBIRTHNEONATALDEPTTYPEvalues(int value, String name, String literal) {
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
	
} //CDEBIRTHNEONATALDEPTTYPEvalues
