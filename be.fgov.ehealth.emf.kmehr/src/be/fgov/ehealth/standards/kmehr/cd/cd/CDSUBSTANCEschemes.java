/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDSUBSTANC Eschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDSUBSTANCEschemes()
 * @model extendedMetaData="name='CD-SUBSTANCEschemes'"
 * @generated
 */
public enum CDSUBSTANCEschemes implements Enumerator {
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
	 * The '<em><b>CDATC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDATC_VALUE
	 * @generated
	 * @ordered
	 */
	CDATC(1, "CDATC", "CD-ATC"),

	/**
	 * The '<em><b>CDEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEAN_VALUE
	 * @generated
	 * @ordered
	 */
	CDEAN(2, "CDEAN", "CD-EAN"),

	/**
	 * The '<em><b>CDSUBSTANCECNK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSUBSTANCECNK_VALUE
	 * @generated
	 * @ordered
	 */
	CDSUBSTANCECNK(3, "CDSUBSTANCECNK", "CD-SUBSTANCE-CNK");

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
	 * The '<em><b>CDATC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDATC
	 * @model literal="CD-ATC"
	 * @generated
	 * @ordered
	 */
	public static final int CDATC_VALUE = 1;

	/**
	 * The '<em><b>CDEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEAN
	 * @model literal="CD-EAN"
	 * @generated
	 * @ordered
	 */
	public static final int CDEAN_VALUE = 2;

	/**
	 * The '<em><b>CDSUBSTANCECNK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSUBSTANCECNK
	 * @model literal="CD-SUBSTANCE-CNK"
	 * @generated
	 * @ordered
	 */
	public static final int CDSUBSTANCECNK_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDSUBSTANC Eschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDSUBSTANCEschemes[] VALUES_ARRAY =
		new CDSUBSTANCEschemes[] {
			CDINNCLUSTER,
			CDATC,
			CDEAN,
			CDSUBSTANCECNK,
		};

	/**
	 * A public read-only list of all the '<em><b>CDSUBSTANC Eschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDSUBSTANCEschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDSUBSTANC Eschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDSUBSTANCEschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDSUBSTANCEschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDSUBSTANC Eschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDSUBSTANCEschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDSUBSTANCEschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDSUBSTANC Eschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDSUBSTANCEschemes get(int value) {
		switch (value) {
			case CDINNCLUSTER_VALUE: return CDINNCLUSTER;
			case CDATC_VALUE: return CDATC;
			case CDEAN_VALUE: return CDEAN;
			case CDSUBSTANCECNK_VALUE: return CDSUBSTANCECNK;
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
	private CDSUBSTANCEschemes(int value, String name, String literal) {
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
	
} //CDSUBSTANCEschemes
