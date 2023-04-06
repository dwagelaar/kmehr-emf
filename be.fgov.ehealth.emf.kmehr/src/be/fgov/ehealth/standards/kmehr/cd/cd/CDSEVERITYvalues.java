/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDSEVERIT Yvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDSEVERITYvalues()
 * @model extendedMetaData="name='CD-SEVERITYvalues'"
 * @generated
 */
public enum CDSEVERITYvalues implements Enumerator {
	/**
	 * The '<em><b>Abnormal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABNORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	ABNORMAL(0, "abnormal", "abnormal"),

	/**
	 * The '<em><b>High</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH(1, "high", "high"),

	/**
	 * The '<em><b>Low</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_VALUE
	 * @generated
	 * @ordered
	 */
	LOW(2, "low", "low"),

	/**
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(3, "normal", "normal"),

	/**
	 * The '<em><b>Resistent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESISTENT_VALUE
	 * @generated
	 * @ordered
	 */
	RESISTENT(4, "resistent", "resistent"),

	/**
	 * The '<em><b>Susceptible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSCEPTIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	SUSCEPTIBLE(5, "susceptible", "susceptible"),

	/**
	 * The '<em><b>Susceptibleintermediate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSCEPTIBLEINTERMEDIATE_VALUE
	 * @generated
	 * @ordered
	 */
	SUSCEPTIBLEINTERMEDIATE(6, "susceptibleintermediate", "susceptibleintermediate"),

	/**
	 * The '<em><b>Veryabnormal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERYABNORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	VERYABNORMAL(7, "veryabnormal", "veryabnormal"),

	/**
	 * The '<em><b>Veryhigh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERYHIGH_VALUE
	 * @generated
	 * @ordered
	 */
	VERYHIGH(8, "veryhigh", "veryhigh"),

	/**
	 * The '<em><b>Verylow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERYLOW_VALUE
	 * @generated
	 * @ordered
	 */
	VERYLOW(9, "verylow", "verylow"),

	/**
	 * The '<em><b>Extremelyhigh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTREMELYHIGH_VALUE
	 * @generated
	 * @ordered
	 */
	EXTREMELYHIGH(10, "extremelyhigh", "extremelyhigh"),

	/**
	 * The '<em><b>Extremelylow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTREMELYLOW_VALUE
	 * @generated
	 * @ordered
	 */
	EXTREMELYLOW(11, "extremelylow", "extremelylow"),

	/**
	 * The '<em><b>Verysusceptible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERYSUSCEPTIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	VERYSUSCEPTIBLE(12, "verysusceptible", "verysusceptible");

	/**
	 * The '<em><b>Abnormal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABNORMAL
	 * @model name="abnormal"
	 * @generated
	 * @ordered
	 */
	public static final int ABNORMAL_VALUE = 0;

	/**
	 * The '<em><b>High</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH
	 * @model name="high"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_VALUE = 1;

	/**
	 * The '<em><b>Low</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW
	 * @model name="low"
	 * @generated
	 * @ordered
	 */
	public static final int LOW_VALUE = 2;

	/**
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model name="normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 3;

	/**
	 * The '<em><b>Resistent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESISTENT
	 * @model name="resistent"
	 * @generated
	 * @ordered
	 */
	public static final int RESISTENT_VALUE = 4;

	/**
	 * The '<em><b>Susceptible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSCEPTIBLE
	 * @model name="susceptible"
	 * @generated
	 * @ordered
	 */
	public static final int SUSCEPTIBLE_VALUE = 5;

	/**
	 * The '<em><b>Susceptibleintermediate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSCEPTIBLEINTERMEDIATE
	 * @model name="susceptibleintermediate"
	 * @generated
	 * @ordered
	 */
	public static final int SUSCEPTIBLEINTERMEDIATE_VALUE = 6;

	/**
	 * The '<em><b>Veryabnormal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERYABNORMAL
	 * @model name="veryabnormal"
	 * @generated
	 * @ordered
	 */
	public static final int VERYABNORMAL_VALUE = 7;

	/**
	 * The '<em><b>Veryhigh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERYHIGH
	 * @model name="veryhigh"
	 * @generated
	 * @ordered
	 */
	public static final int VERYHIGH_VALUE = 8;

	/**
	 * The '<em><b>Verylow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERYLOW
	 * @model name="verylow"
	 * @generated
	 * @ordered
	 */
	public static final int VERYLOW_VALUE = 9;

	/**
	 * The '<em><b>Extremelyhigh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTREMELYHIGH
	 * @model name="extremelyhigh"
	 * @generated
	 * @ordered
	 */
	public static final int EXTREMELYHIGH_VALUE = 10;

	/**
	 * The '<em><b>Extremelylow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTREMELYLOW
	 * @model name="extremelylow"
	 * @generated
	 * @ordered
	 */
	public static final int EXTREMELYLOW_VALUE = 11;

	/**
	 * The '<em><b>Verysusceptible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERYSUSCEPTIBLE
	 * @model name="verysusceptible"
	 * @generated
	 * @ordered
	 */
	public static final int VERYSUSCEPTIBLE_VALUE = 12;

	/**
	 * An array of all the '<em><b>CDSEVERIT Yvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDSEVERITYvalues[] VALUES_ARRAY =
		new CDSEVERITYvalues[] {
			ABNORMAL,
			HIGH,
			LOW,
			NORMAL,
			RESISTENT,
			SUSCEPTIBLE,
			SUSCEPTIBLEINTERMEDIATE,
			VERYABNORMAL,
			VERYHIGH,
			VERYLOW,
			EXTREMELYHIGH,
			EXTREMELYLOW,
			VERYSUSCEPTIBLE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDSEVERIT Yvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDSEVERITYvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDSEVERIT Yvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDSEVERITYvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDSEVERITYvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDSEVERIT Yvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDSEVERITYvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDSEVERITYvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDSEVERIT Yvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDSEVERITYvalues get(int value) {
		switch (value) {
			case ABNORMAL_VALUE: return ABNORMAL;
			case HIGH_VALUE: return HIGH;
			case LOW_VALUE: return LOW;
			case NORMAL_VALUE: return NORMAL;
			case RESISTENT_VALUE: return RESISTENT;
			case SUSCEPTIBLE_VALUE: return SUSCEPTIBLE;
			case SUSCEPTIBLEINTERMEDIATE_VALUE: return SUSCEPTIBLEINTERMEDIATE;
			case VERYABNORMAL_VALUE: return VERYABNORMAL;
			case VERYHIGH_VALUE: return VERYHIGH;
			case VERYLOW_VALUE: return VERYLOW;
			case EXTREMELYHIGH_VALUE: return EXTREMELYHIGH;
			case EXTREMELYLOW_VALUE: return EXTREMELYLOW;
			case VERYSUSCEPTIBLE_VALUE: return VERYSUSCEPTIBLE;
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
	private CDSEVERITYvalues(int value, String name, String literal) {
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
	
} //CDSEVERITYvalues
