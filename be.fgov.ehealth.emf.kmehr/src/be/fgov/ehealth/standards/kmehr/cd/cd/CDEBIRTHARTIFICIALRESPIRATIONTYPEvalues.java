/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDEBIRTHARTIFICIALRESPIRATIONTYP Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDEBIRTHARTIFICIALRESPIRATIONTYPEvalues()
 * @model extendedMetaData="name='CD-EBIRTH-ARTIFICIALRESPIRATIONTYPEvalues'"
 * @generated
 */
public enum CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues implements Enumerator {
	/**
	 * The '<em><b>Intubation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTUBATION_VALUE
	 * @generated
	 * @ordered
	 */
	INTUBATION(0, "intubation", "intubation"),

	/**
	 * The '<em><b>Balloon Mask</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALLOON_MASK_VALUE
	 * @generated
	 * @ordered
	 */
	BALLOON_MASK(1, "balloonMask", "balloon-mask");

	/**
	 * The '<em><b>Intubation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTUBATION
	 * @model name="intubation"
	 * @generated
	 * @ordered
	 */
	public static final int INTUBATION_VALUE = 0;

	/**
	 * The '<em><b>Balloon Mask</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALLOON_MASK
	 * @model name="balloonMask" literal="balloon-mask"
	 * @generated
	 * @ordered
	 */
	public static final int BALLOON_MASK_VALUE = 1;

	/**
	 * An array of all the '<em><b>CDEBIRTHARTIFICIALRESPIRATIONTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues[] VALUES_ARRAY =
		new CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues[] {
			INTUBATION,
			BALLOON_MASK,
		};

	/**
	 * A public read-only list of all the '<em><b>CDEBIRTHARTIFICIALRESPIRATIONTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDEBIRTHARTIFICIALRESPIRATIONTYP Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEBIRTHARTIFICIALRESPIRATIONTYP Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEBIRTHARTIFICIALRESPIRATIONTYP Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues get(int value) {
		switch (value) {
			case INTUBATION_VALUE: return INTUBATION;
			case BALLOON_MASK_VALUE: return BALLOON_MASK;
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
	private CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues(int value, String name, String literal) {
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
	
} //CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues
