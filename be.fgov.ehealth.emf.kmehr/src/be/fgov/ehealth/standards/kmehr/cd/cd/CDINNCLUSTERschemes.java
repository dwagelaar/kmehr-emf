/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDINNCLUSTE Rschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDINNCLUSTERschemes()
 * @model extendedMetaData="name='CD-INNCLUSTERschemes'"
 * @generated
 */
public enum CDINNCLUSTERschemes implements Enumerator {
	/**
	 * The '<em><b>CDINNCLUSTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDINNCLUSTER_VALUE
	 * @generated
	 * @ordered
	 */
	CDINNCLUSTER(0, "CDINNCLUSTER", "CD-INNCLUSTER"),

	/**
	 * The '<em><b>CDVMPGROUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDVMPGROUP_VALUE
	 * @generated
	 * @ordered
	 */
	CDVMPGROUP(1, "CDVMPGROUP", "CD-VMPGROUP");

	/**
	 * The '<em><b>CDINNCLUSTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDINNCLUSTER
	 * @model literal="CD-INNCLUSTER"
	 * @generated
	 * @ordered
	 */
	public static final int CDINNCLUSTER_VALUE = 0;

	/**
	 * The '<em><b>CDVMPGROUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDVMPGROUP
	 * @model literal="CD-VMPGROUP"
	 * @generated
	 * @ordered
	 */
	public static final int CDVMPGROUP_VALUE = 1;

	/**
	 * An array of all the '<em><b>CDINNCLUSTE Rschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDINNCLUSTERschemes[] VALUES_ARRAY =
		new CDINNCLUSTERschemes[] {
			CDINNCLUSTER,
			CDVMPGROUP,
		};

	/**
	 * A public read-only list of all the '<em><b>CDINNCLUSTE Rschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDINNCLUSTERschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDINNCLUSTE Rschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDINNCLUSTERschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDINNCLUSTERschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDINNCLUSTE Rschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDINNCLUSTERschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDINNCLUSTERschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDINNCLUSTE Rschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDINNCLUSTERschemes get(int value) {
		switch (value) {
			case CDINNCLUSTER_VALUE: return CDINNCLUSTER;
			case CDVMPGROUP_VALUE: return CDVMPGROUP;
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
	private CDINNCLUSTERschemes(int value, String name, String literal) {
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
	
} //CDINNCLUSTERschemes
