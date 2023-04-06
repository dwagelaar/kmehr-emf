/**
 */
package be.fgov.ehealth.standards.kmehr.id.id;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IDPATIEN Tschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.id.id.IdPackage#getIDPATIENTschemes()
 * @model extendedMetaData="name='ID-PATIENTschemes'"
 * @generated
 */
public enum IDPATIENTschemes implements Enumerator {
	/**
	 * The '<em><b>IDPATIENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDPATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	IDPATIENT(0, "IDPATIENT", "ID-PATIENT"),

	/**
	 * The '<em><b>INSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSS_VALUE
	 * @generated
	 * @ordered
	 */
	INSS(1, "INSS", "INSS"),

	/**
	 * The '<em><b>EIDCARDNO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIDCARDNO_VALUE
	 * @generated
	 * @ordered
	 */
	EIDCARDNO(2, "EIDCARDNO", "EID-CARDNO"),

	/**
	 * The '<em><b>SISCARDNO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SISCARDNO_VALUE
	 * @generated
	 * @ordered
	 */
	SISCARDNO(3, "SISCARDNO", "SIS-CARDNO"),

	/**
	 * The '<em><b>ISICARDNO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISICARDNO_VALUE
	 * @generated
	 * @ordered
	 */
	ISICARDNO(4, "ISICARDNO", "ISI-CARDNO"),

	/**
	 * The '<em><b>LOCAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(5, "LOCAL", "LOCAL");

	/**
	 * The '<em><b>IDPATIENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDPATIENT
	 * @model literal="ID-PATIENT"
	 * @generated
	 * @ordered
	 */
	public static final int IDPATIENT_VALUE = 0;

	/**
	 * The '<em><b>INSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSS_VALUE = 1;

	/**
	 * The '<em><b>EIDCARDNO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIDCARDNO
	 * @model literal="EID-CARDNO"
	 * @generated
	 * @ordered
	 */
	public static final int EIDCARDNO_VALUE = 2;

	/**
	 * The '<em><b>SISCARDNO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SISCARDNO
	 * @model literal="SIS-CARDNO"
	 * @generated
	 * @ordered
	 */
	public static final int SISCARDNO_VALUE = 3;

	/**
	 * The '<em><b>ISICARDNO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISICARDNO
	 * @model literal="ISI-CARDNO"
	 * @generated
	 * @ordered
	 */
	public static final int ISICARDNO_VALUE = 4;

	/**
	 * The '<em><b>LOCAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 5;

	/**
	 * An array of all the '<em><b>IDPATIEN Tschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IDPATIENTschemes[] VALUES_ARRAY =
		new IDPATIENTschemes[] {
			IDPATIENT,
			INSS,
			EIDCARDNO,
			SISCARDNO,
			ISICARDNO,
			LOCAL,
		};

	/**
	 * A public read-only list of all the '<em><b>IDPATIEN Tschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IDPATIENTschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IDPATIEN Tschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IDPATIENTschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IDPATIENTschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IDPATIEN Tschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IDPATIENTschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IDPATIENTschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IDPATIEN Tschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IDPATIENTschemes get(int value) {
		switch (value) {
			case IDPATIENT_VALUE: return IDPATIENT;
			case INSS_VALUE: return INSS;
			case EIDCARDNO_VALUE: return EIDCARDNO;
			case SISCARDNO_VALUE: return SISCARDNO;
			case ISICARDNO_VALUE: return ISICARDNO;
			case LOCAL_VALUE: return LOCAL;
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
	private IDPATIENTschemes(int value, String name, String literal) {
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
	
} //IDPATIENTschemes
