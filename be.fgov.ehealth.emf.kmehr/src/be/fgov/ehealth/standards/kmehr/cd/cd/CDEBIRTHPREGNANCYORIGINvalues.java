/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDEBIRTHPREGNANCYORIGI Nvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDEBIRTHPREGNANCYORIGINvalues()
 * @model extendedMetaData="name='CD-EBIRTH-PREGNANCYORIGINvalues'"
 * @generated
 */
public enum CDEBIRTHPREGNANCYORIGINvalues implements Enumerator {
	/**
	 * The '<em><b>Spontaneous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPONTANEOUS_VALUE
	 * @generated
	 * @ordered
	 */
	SPONTANEOUS(0, "spontaneous", "spontaneous"),

	/**
	 * The '<em><b>Hormonal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORMONAL_VALUE
	 * @generated
	 * @ordered
	 */
	HORMONAL(1, "hormonal", "hormonal"),

	/**
	 * The '<em><b>IVF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVF_VALUE
	 * @generated
	 * @ordered
	 */
	IVF(2, "IVF", "IVF"),

	/**
	 * The '<em><b>ICSI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICSI_VALUE
	 * @generated
	 * @ordered
	 */
	ICSI(3, "ICSI", "ICSI");

	/**
	 * The '<em><b>Spontaneous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPONTANEOUS
	 * @model name="spontaneous"
	 * @generated
	 * @ordered
	 */
	public static final int SPONTANEOUS_VALUE = 0;

	/**
	 * The '<em><b>Hormonal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORMONAL
	 * @model name="hormonal"
	 * @generated
	 * @ordered
	 */
	public static final int HORMONAL_VALUE = 1;

	/**
	 * The '<em><b>IVF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IVF_VALUE = 2;

	/**
	 * The '<em><b>ICSI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICSI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICSI_VALUE = 3;

	/**
	 * An array of all the '<em><b>CDEBIRTHPREGNANCYORIGI Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDEBIRTHPREGNANCYORIGINvalues[] VALUES_ARRAY =
		new CDEBIRTHPREGNANCYORIGINvalues[] {
			SPONTANEOUS,
			HORMONAL,
			IVF,
			ICSI,
		};

	/**
	 * A public read-only list of all the '<em><b>CDEBIRTHPREGNANCYORIGI Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDEBIRTHPREGNANCYORIGINvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDEBIRTHPREGNANCYORIGI Nvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHPREGNANCYORIGINvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEBIRTHPREGNANCYORIGINvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEBIRTHPREGNANCYORIGI Nvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHPREGNANCYORIGINvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDEBIRTHPREGNANCYORIGINvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDEBIRTHPREGNANCYORIGI Nvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDEBIRTHPREGNANCYORIGINvalues get(int value) {
		switch (value) {
			case SPONTANEOUS_VALUE: return SPONTANEOUS;
			case HORMONAL_VALUE: return HORMONAL;
			case IVF_VALUE: return IVF;
			case ICSI_VALUE: return ICSI;
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
	private CDEBIRTHPREGNANCYORIGINvalues(int value, String name, String literal) {
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
	
} //CDEBIRTHPREGNANCYORIGINvalues
