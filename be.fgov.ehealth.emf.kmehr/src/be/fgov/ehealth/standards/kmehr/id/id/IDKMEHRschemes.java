/**
 */
package be.fgov.ehealth.standards.kmehr.id.id;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IDKMEH Rschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.id.id.IdPackage#getIDKMEHRschemes()
 * @model extendedMetaData="name='ID-KMEHRschemes'"
 * @generated
 */
public enum IDKMEHRschemes implements Enumerator {
	/**
	 * The '<em><b>IDKMEHR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDKMEHR_VALUE
	 * @generated
	 * @ordered
	 */
	IDKMEHR(0, "IDKMEHR", "ID-KMEHR"),

	/**
	 * The '<em><b>IDIBAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDIBAN_VALUE
	 * @generated
	 * @ordered
	 */
	IDIBAN(1, "IDIBAN", "ID-IBAN"),

	/**
	 * The '<em><b>IDSERIALNO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDSERIALNO_VALUE
	 * @generated
	 * @ordered
	 */
	IDSERIALNO(2, "IDSERIALNO", "ID-SERIALNO"),

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
	 * The '<em><b>IDCBE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDCBE_VALUE
	 * @generated
	 * @ordered
	 */
	IDCBE(4, "IDCBE", "ID-CBE");

	/**
	 * The '<em><b>IDKMEHR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDKMEHR
	 * @model literal="ID-KMEHR"
	 * @generated
	 * @ordered
	 */
	public static final int IDKMEHR_VALUE = 0;

	/**
	 * The '<em><b>IDIBAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDIBAN
	 * @model literal="ID-IBAN"
	 * @generated
	 * @ordered
	 */
	public static final int IDIBAN_VALUE = 1;

	/**
	 * The '<em><b>IDSERIALNO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDSERIALNO
	 * @model literal="ID-SERIALNO"
	 * @generated
	 * @ordered
	 */
	public static final int IDSERIALNO_VALUE = 2;

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
	 * The '<em><b>IDCBE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDCBE
	 * @model literal="ID-CBE"
	 * @generated
	 * @ordered
	 */
	public static final int IDCBE_VALUE = 4;

	/**
	 * An array of all the '<em><b>IDKMEH Rschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IDKMEHRschemes[] VALUES_ARRAY =
		new IDKMEHRschemes[] {
			IDKMEHR,
			IDIBAN,
			IDSERIALNO,
			LOCAL,
			IDCBE,
		};

	/**
	 * A public read-only list of all the '<em><b>IDKMEH Rschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IDKMEHRschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IDKMEH Rschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IDKMEHRschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IDKMEHRschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IDKMEH Rschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IDKMEHRschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IDKMEHRschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IDKMEH Rschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IDKMEHRschemes get(int value) {
		switch (value) {
			case IDKMEHR_VALUE: return IDKMEHR;
			case IDIBAN_VALUE: return IDIBAN;
			case IDSERIALNO_VALUE: return IDSERIALNO;
			case LOCAL_VALUE: return LOCAL;
			case IDCBE_VALUE: return IDCBE;
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
	private IDKMEHRschemes(int value, String name, String literal) {
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
	
} //IDKMEHRschemes
