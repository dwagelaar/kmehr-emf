/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDHEADIN Gschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDHEADINGschemes()
 * @model extendedMetaData="name='CD-HEADINGschemes'"
 * @generated
 */
public enum CDHEADINGschemes implements Enumerator {
	/**
	 * The '<em><b>CDHEADING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDHEADING_VALUE
	 * @generated
	 * @ordered
	 */
	CDHEADING(0, "CDHEADING", "CD-HEADING"),

	/**
	 * The '<em><b>CDHEADINGLAB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDHEADINGLAB_VALUE
	 * @generated
	 * @ordered
	 */
	CDHEADINGLAB(1, "CDHEADINGLAB", "CD-HEADING-LAB"),

	/**
	 * The '<em><b>CDSITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSITE_VALUE
	 * @generated
	 * @ordered
	 */
	CDSITE(2, "CDSITE", "CD-SITE"),

	/**
	 * The '<em><b>LOCAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(3, "LOCAL", "LOCAL"),

	/**
	 * The '<em><b>CDHEADINGREG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDHEADINGREG_VALUE
	 * @generated
	 * @ordered
	 */
	CDHEADINGREG(4, "CDHEADINGREG", "CD-HEADING-REG");

	/**
	 * The '<em><b>CDHEADING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDHEADING
	 * @model literal="CD-HEADING"
	 * @generated
	 * @ordered
	 */
	public static final int CDHEADING_VALUE = 0;

	/**
	 * The '<em><b>CDHEADINGLAB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDHEADINGLAB
	 * @model literal="CD-HEADING-LAB"
	 * @generated
	 * @ordered
	 */
	public static final int CDHEADINGLAB_VALUE = 1;

	/**
	 * The '<em><b>CDSITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSITE
	 * @model literal="CD-SITE"
	 * @generated
	 * @ordered
	 */
	public static final int CDSITE_VALUE = 2;

	/**
	 * The '<em><b>LOCAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 3;

	/**
	 * The '<em><b>CDHEADINGREG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDHEADINGREG
	 * @model literal="CD-HEADING-REG"
	 * @generated
	 * @ordered
	 */
	public static final int CDHEADINGREG_VALUE = 4;

	/**
	 * An array of all the '<em><b>CDHEADIN Gschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDHEADINGschemes[] VALUES_ARRAY =
		new CDHEADINGschemes[] {
			CDHEADING,
			CDHEADINGLAB,
			CDSITE,
			LOCAL,
			CDHEADINGREG,
		};

	/**
	 * A public read-only list of all the '<em><b>CDHEADIN Gschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDHEADINGschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDHEADIN Gschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDHEADINGschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDHEADINGschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDHEADIN Gschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDHEADINGschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDHEADINGschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDHEADIN Gschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDHEADINGschemes get(int value) {
		switch (value) {
			case CDHEADING_VALUE: return CDHEADING;
			case CDHEADINGLAB_VALUE: return CDHEADINGLAB;
			case CDSITE_VALUE: return CDSITE;
			case LOCAL_VALUE: return LOCAL;
			case CDHEADINGREG_VALUE: return CDHEADINGREG;
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
	private CDHEADINGschemes(int value, String name, String literal) {
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
	
} //CDHEADINGschemes
