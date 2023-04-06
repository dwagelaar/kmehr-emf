/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDENCRYPTIONACTO Rvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDENCRYPTIONACTORvalues()
 * @model extendedMetaData="name='CD-ENCRYPTION-ACTORvalues'"
 * @generated
 */
public enum CDENCRYPTIONACTORvalues implements Enumerator {
	/**
	 * The '<em><b>NIHII</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIHII_VALUE
	 * @generated
	 * @ordered
	 */
	NIHII(0, "NIHII", "NIHII"),

	/**
	 * The '<em><b>NIHIIHOSPITAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIHIIHOSPITAL_VALUE
	 * @generated
	 * @ordered
	 */
	NIHIIHOSPITAL(1, "NIHIIHOSPITAL", "NIHII-HOSPITAL"),

	/**
	 * The '<em><b>NIHIIPHARMACY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIHIIPHARMACY_VALUE
	 * @generated
	 * @ordered
	 */
	NIHIIPHARMACY(2, "NIHIIPHARMACY", "NIHII-PHARMACY"),

	/**
	 * The '<em><b>CBE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CBE_VALUE
	 * @generated
	 * @ordered
	 */
	CBE(3, "CBE", "CBE"),

	/**
	 * The '<em><b>INSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSS_VALUE
	 * @generated
	 * @ordered
	 */
	INSS(4, "INSS", "INSS"),

	/**
	 * The '<em><b>EHP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EHP_VALUE
	 * @generated
	 * @ordered
	 */
	EHP(5, "EHP", "EHP"),

	/**
	 * The '<em><b>SSIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SSIN_VALUE
	 * @generated
	 * @ordered
	 */
	SSIN(6, "SSIN", "SSIN");

	/**
	 * The '<em><b>NIHII</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIHII
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NIHII_VALUE = 0;

	/**
	 * The '<em><b>NIHIIHOSPITAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIHIIHOSPITAL
	 * @model literal="NIHII-HOSPITAL"
	 * @generated
	 * @ordered
	 */
	public static final int NIHIIHOSPITAL_VALUE = 1;

	/**
	 * The '<em><b>NIHIIPHARMACY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIHIIPHARMACY
	 * @model literal="NIHII-PHARMACY"
	 * @generated
	 * @ordered
	 */
	public static final int NIHIIPHARMACY_VALUE = 2;

	/**
	 * The '<em><b>CBE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CBE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CBE_VALUE = 3;

	/**
	 * The '<em><b>INSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSS_VALUE = 4;

	/**
	 * The '<em><b>EHP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EHP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EHP_VALUE = 5;

	/**
	 * The '<em><b>SSIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SSIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SSIN_VALUE = 6;

	/**
	 * An array of all the '<em><b>CDENCRYPTIONACTO Rvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDENCRYPTIONACTORvalues[] VALUES_ARRAY =
		new CDENCRYPTIONACTORvalues[] {
			NIHII,
			NIHIIHOSPITAL,
			NIHIIPHARMACY,
			CBE,
			INSS,
			EHP,
			SSIN,
		};

	/**
	 * A public read-only list of all the '<em><b>CDENCRYPTIONACTO Rvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDENCRYPTIONACTORvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDENCRYPTIONACTO Rvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDENCRYPTIONACTORvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDENCRYPTIONACTORvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDENCRYPTIONACTO Rvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDENCRYPTIONACTORvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDENCRYPTIONACTORvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDENCRYPTIONACTO Rvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDENCRYPTIONACTORvalues get(int value) {
		switch (value) {
			case NIHII_VALUE: return NIHII;
			case NIHIIHOSPITAL_VALUE: return NIHIIHOSPITAL;
			case NIHIIPHARMACY_VALUE: return NIHIIPHARMACY;
			case CBE_VALUE: return CBE;
			case INSS_VALUE: return INSS;
			case EHP_VALUE: return EHP;
			case SSIN_VALUE: return SSIN;
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
	private CDENCRYPTIONACTORvalues(int value, String name, String literal) {
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
	
} //CDENCRYPTIONACTORvalues
