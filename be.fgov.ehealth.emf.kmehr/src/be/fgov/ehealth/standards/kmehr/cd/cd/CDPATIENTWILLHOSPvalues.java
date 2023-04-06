/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDPATIENTWILLHOS Pvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDPATIENTWILLHOSPvalues()
 * @model extendedMetaData="name='CD-PATIENTWILL-HOSPvalues'"
 * @generated
 */
public enum CDPATIENTWILLHOSPvalues implements Enumerator {
	/**
	 * The '<em><b>Hos1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOS1_VALUE
	 * @generated
	 * @ordered
	 */
	HOS1(0, "hos1", "hos1"),

	/**
	 * The '<em><b>Hos2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOS2_VALUE
	 * @generated
	 * @ordered
	 */
	HOS2(1, "hos2", "hos2");

	/**
	 * The '<em><b>Hos1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOS1
	 * @model name="hos1"
	 * @generated
	 * @ordered
	 */
	public static final int HOS1_VALUE = 0;

	/**
	 * The '<em><b>Hos2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOS2
	 * @model name="hos2"
	 * @generated
	 * @ordered
	 */
	public static final int HOS2_VALUE = 1;

	/**
	 * An array of all the '<em><b>CDPATIENTWILLHOS Pvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDPATIENTWILLHOSPvalues[] VALUES_ARRAY =
		new CDPATIENTWILLHOSPvalues[] {
			HOS1,
			HOS2,
		};

	/**
	 * A public read-only list of all the '<em><b>CDPATIENTWILLHOS Pvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDPATIENTWILLHOSPvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDPATIENTWILLHOS Pvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDPATIENTWILLHOSPvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDPATIENTWILLHOSPvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDPATIENTWILLHOS Pvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDPATIENTWILLHOSPvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDPATIENTWILLHOSPvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDPATIENTWILLHOS Pvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDPATIENTWILLHOSPvalues get(int value) {
		switch (value) {
			case HOS1_VALUE: return HOS1;
			case HOS2_VALUE: return HOS2;
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
	private CDPATIENTWILLHOSPvalues(int value, String name, String literal) {
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
	
} //CDPATIENTWILLHOSPvalues
