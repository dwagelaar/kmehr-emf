/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDSTENTLESIONTYP Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDSTENTLESIONTYPEvalues()
 * @model extendedMetaData="name='CD-STENT-LESIONTYPEvalues'"
 * @generated
 */
public enum CDSTENTLESIONTYPEvalues implements Enumerator {
	/**
	 * The '<em><b>Simple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE(0, "simple", "simple"),

	/**
	 * The '<em><b>Multi Segment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_SEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_SEGMENT(1, "multiSegment", "multi-segment"),

	/**
	 * The '<em><b>Aorto Ostiale</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AORTO_OSTIALE_VALUE
	 * @generated
	 * @ordered
	 */
	AORTO_OSTIALE(2, "aortoOstiale", "aorto-ostiale"),

	/**
	 * The '<em><b>Bifurcation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIFURCATION_VALUE
	 * @generated
	 * @ordered
	 */
	BIFURCATION(3, "bifurcation", "bifurcation"),

	/**
	 * The '<em><b>Occlusionchroniquetotplus3m</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCLUSIONCHRONIQUETOTPLUS3M_VALUE
	 * @generated
	 * @ordered
	 */
	OCCLUSIONCHRONIQUETOTPLUS3M(4, "occlusionchroniquetotplus3m", "occlusionchroniquetotplus3m");

	/**
	 * The '<em><b>Simple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE
	 * @model name="simple"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_VALUE = 0;

	/**
	 * The '<em><b>Multi Segment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_SEGMENT
	 * @model name="multiSegment" literal="multi-segment"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_SEGMENT_VALUE = 1;

	/**
	 * The '<em><b>Aorto Ostiale</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AORTO_OSTIALE
	 * @model name="aortoOstiale" literal="aorto-ostiale"
	 * @generated
	 * @ordered
	 */
	public static final int AORTO_OSTIALE_VALUE = 2;

	/**
	 * The '<em><b>Bifurcation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIFURCATION
	 * @model name="bifurcation"
	 * @generated
	 * @ordered
	 */
	public static final int BIFURCATION_VALUE = 3;

	/**
	 * The '<em><b>Occlusionchroniquetotplus3m</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCLUSIONCHRONIQUETOTPLUS3M
	 * @model name="occlusionchroniquetotplus3m"
	 * @generated
	 * @ordered
	 */
	public static final int OCCLUSIONCHRONIQUETOTPLUS3M_VALUE = 4;

	/**
	 * An array of all the '<em><b>CDSTENTLESIONTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDSTENTLESIONTYPEvalues[] VALUES_ARRAY =
		new CDSTENTLESIONTYPEvalues[] {
			SIMPLE,
			MULTI_SEGMENT,
			AORTO_OSTIALE,
			BIFURCATION,
			OCCLUSIONCHRONIQUETOTPLUS3M,
		};

	/**
	 * A public read-only list of all the '<em><b>CDSTENTLESIONTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDSTENTLESIONTYPEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDSTENTLESIONTYP Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDSTENTLESIONTYPEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDSTENTLESIONTYPEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDSTENTLESIONTYP Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDSTENTLESIONTYPEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDSTENTLESIONTYPEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDSTENTLESIONTYP Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDSTENTLESIONTYPEvalues get(int value) {
		switch (value) {
			case SIMPLE_VALUE: return SIMPLE;
			case MULTI_SEGMENT_VALUE: return MULTI_SEGMENT;
			case AORTO_OSTIALE_VALUE: return AORTO_OSTIALE;
			case BIFURCATION_VALUE: return BIFURCATION;
			case OCCLUSIONCHRONIQUETOTPLUS3M_VALUE: return OCCLUSIONCHRONIQUETOTPLUS3M;
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
	private CDSTENTLESIONTYPEvalues(int value, String name, String literal) {
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
	
} //CDSTENTLESIONTYPEvalues
