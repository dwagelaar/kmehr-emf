/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDQUANTITYPREFI Xvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDQUANTITYPREFIXvalues()
 * @model extendedMetaData="name='CD-QUANTITYPREFIXvalues'"
 * @generated
 */
public enum CDQUANTITYPREFIXvalues implements Enumerator {
	/**
	 * The '<em><b>Ana</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANA_VALUE
	 * @generated
	 * @ordered
	 */
	ANA(0, "ana", "ana"),

	/**
	 * The '<em><b>Anaad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANAAD_VALUE
	 * @generated
	 * @ordered
	 */
	ANAAD(1, "anaad", "anaad"),

	/**
	 * The '<em><b>Ad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AD_VALUE
	 * @generated
	 * @ordered
	 */
	AD(2, "ad", "ad"),

	/**
	 * The '<em><b>Qs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QS_VALUE
	 * @generated
	 * @ordered
	 */
	QS(3, "qs", "qs");

	/**
	 * The '<em><b>Ana</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANA
	 * @model name="ana"
	 * @generated
	 * @ordered
	 */
	public static final int ANA_VALUE = 0;

	/**
	 * The '<em><b>Anaad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANAAD
	 * @model name="anaad"
	 * @generated
	 * @ordered
	 */
	public static final int ANAAD_VALUE = 1;

	/**
	 * The '<em><b>Ad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AD
	 * @model name="ad"
	 * @generated
	 * @ordered
	 */
	public static final int AD_VALUE = 2;

	/**
	 * The '<em><b>Qs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QS
	 * @model name="qs"
	 * @generated
	 * @ordered
	 */
	public static final int QS_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDQUANTITYPREFI Xvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDQUANTITYPREFIXvalues[] VALUES_ARRAY =
		new CDQUANTITYPREFIXvalues[] {
			ANA,
			ANAAD,
			AD,
			QS,
		};

	/**
	 * A public read-only list of all the '<em><b>CDQUANTITYPREFI Xvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDQUANTITYPREFIXvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDQUANTITYPREFI Xvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDQUANTITYPREFIXvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDQUANTITYPREFIXvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDQUANTITYPREFI Xvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDQUANTITYPREFIXvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDQUANTITYPREFIXvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDQUANTITYPREFI Xvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDQUANTITYPREFIXvalues get(int value) {
		switch (value) {
			case ANA_VALUE: return ANA;
			case ANAAD_VALUE: return ANAAD;
			case AD_VALUE: return AD;
			case QS_VALUE: return QS;
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
	private CDQUANTITYPREFIXvalues(int value, String name, String literal) {
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
	
} //CDQUANTITYPREFIXvalues
