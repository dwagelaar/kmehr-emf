/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDDRUGCN Kschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDDRUGCNKschemes()
 * @model extendedMetaData="name='CD-DRUG-CNKschemes'"
 * @generated
 */
public enum CDDRUGCNKschemes implements Enumerator {
	/**
	 * The '<em><b>CDDRUGCNK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDRUGCNK_VALUE
	 * @generated
	 * @ordered
	 */
	CDDRUGCNK(0, "CDDRUGCNK", "CD-DRUG-CNK"),

	/**
	 * The '<em><b>CDCNKCLUSTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCNKCLUSTER_VALUE
	 * @generated
	 * @ordered
	 */
	CDCNKCLUSTER(1, "CDCNKCLUSTER", "CD-CNK-CLUSTER"),

	/**
	 * The '<em><b>CDAMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDAMP_VALUE
	 * @generated
	 * @ordered
	 */
	CDAMP(2, "CDAMP", "CD-AMP");

	/**
	 * The '<em><b>CDDRUGCNK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDRUGCNK
	 * @model literal="CD-DRUG-CNK"
	 * @generated
	 * @ordered
	 */
	public static final int CDDRUGCNK_VALUE = 0;

	/**
	 * The '<em><b>CDCNKCLUSTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCNKCLUSTER
	 * @model literal="CD-CNK-CLUSTER"
	 * @generated
	 * @ordered
	 */
	public static final int CDCNKCLUSTER_VALUE = 1;

	/**
	 * The '<em><b>CDAMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDAMP
	 * @model literal="CD-AMP"
	 * @generated
	 * @ordered
	 */
	public static final int CDAMP_VALUE = 2;

	/**
	 * An array of all the '<em><b>CDDRUGCN Kschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDDRUGCNKschemes[] VALUES_ARRAY =
		new CDDRUGCNKschemes[] {
			CDDRUGCNK,
			CDCNKCLUSTER,
			CDAMP,
		};

	/**
	 * A public read-only list of all the '<em><b>CDDRUGCN Kschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDDRUGCNKschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDDRUGCN Kschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDDRUGCNKschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDDRUGCNKschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDDRUGCN Kschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDDRUGCNKschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDDRUGCNKschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDDRUGCN Kschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDDRUGCNKschemes get(int value) {
		switch (value) {
			case CDDRUGCNK_VALUE: return CDDRUGCNK;
			case CDCNKCLUSTER_VALUE: return CDCNKCLUSTER;
			case CDAMP_VALUE: return CDAMP;
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
	private CDDRUGCNKschemes(int value, String name, String literal) {
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
	
} //CDDRUGCNKschemes
