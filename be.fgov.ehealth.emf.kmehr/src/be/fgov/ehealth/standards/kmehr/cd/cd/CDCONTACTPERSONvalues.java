/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDCONTACTPERSO Nvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDCONTACTPERSONvalues()
 * @model extendedMetaData="name='CD-CONTACT-PERSONvalues'"
 * @generated
 */
public enum CDCONTACTPERSONvalues implements Enumerator {
	/**
	 * The '<em><b>Mother</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTHER_VALUE
	 * @generated
	 * @ordered
	 */
	MOTHER(0, "mother", "mother"),

	/**
	 * The '<em><b>Father</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FATHER_VALUE
	 * @generated
	 * @ordered
	 */
	FATHER(1, "father", "father"),

	/**
	 * The '<em><b>Child</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD(2, "child", "child"),

	/**
	 * The '<em><b>Familymember</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILYMEMBER_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILYMEMBER(3, "familymember", "familymember"),

	/**
	 * The '<em><b>Spouse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOUSE_VALUE
	 * @generated
	 * @ordered
	 */
	SPOUSE(4, "spouse", "spouse"),

	/**
	 * The '<em><b>Husband</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUSBAND_VALUE
	 * @generated
	 * @ordered
	 */
	HUSBAND(5, "husband", "husband"),

	/**
	 * The '<em><b>Partner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTNER_VALUE
	 * @generated
	 * @ordered
	 */
	PARTNER(6, "partner", "partner"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(7, "other", "other"),

	/**
	 * The '<em><b>Brother</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROTHER_VALUE
	 * @generated
	 * @ordered
	 */
	BROTHER(8, "brother", "brother"),

	/**
	 * The '<em><b>Sister</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SISTER_VALUE
	 * @generated
	 * @ordered
	 */
	SISTER(9, "sister", "sister"),

	/**
	 * The '<em><b>Brotherinlaw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROTHERINLAW_VALUE
	 * @generated
	 * @ordered
	 */
	BROTHERINLAW(10, "brotherinlaw", "brotherinlaw"),

	/**
	 * The '<em><b>Tutor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUTOR_VALUE
	 * @generated
	 * @ordered
	 */
	TUTOR(11, "tutor", "tutor"),

	/**
	 * The '<em><b>Notary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTARY_VALUE
	 * @generated
	 * @ordered
	 */
	NOTARY(12, "notary", "notary"),

	/**
	 * The '<em><b>Lawyer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAWYER_VALUE
	 * @generated
	 * @ordered
	 */
	LAWYER(13, "lawyer", "lawyer"),

	/**
	 * The '<em><b>Employer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPLOYER_VALUE
	 * @generated
	 * @ordered
	 */
	EMPLOYER(14, "employer", "employer"),

	/**
	 * The '<em><b>Grandparent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRANDPARENT_VALUE
	 * @generated
	 * @ordered
	 */
	GRANDPARENT(15, "grandparent", "grandparent"),

	/**
	 * The '<em><b>Son</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SON_VALUE
	 * @generated
	 * @ordered
	 */
	SON(16, "son", "son"),

	/**
	 * The '<em><b>Daughter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAUGHTER_VALUE
	 * @generated
	 * @ordered
	 */
	DAUGHTER(17, "daughter", "daughter"),

	/**
	 * The '<em><b>Grandchild</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRANDCHILD_VALUE
	 * @generated
	 * @ordered
	 */
	GRANDCHILD(18, "grandchild", "grandchild"),

	/**
	 * The '<em><b>Neighbour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEIGHBOUR_VALUE
	 * @generated
	 * @ordered
	 */
	NEIGHBOUR(19, "neighbour", "neighbour"),

	/**
	 * The '<em><b>Stepson</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEPSON_VALUE
	 * @generated
	 * @ordered
	 */
	STEPSON(20, "stepson", "stepson"),

	/**
	 * The '<em><b>Stepdaughter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEPDAUGHTER_VALUE
	 * @generated
	 * @ordered
	 */
	STEPDAUGHTER(21, "stepdaughter", "stepdaughter"),

	/**
	 * The '<em><b>Stepfather</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEPFATHER_VALUE
	 * @generated
	 * @ordered
	 */
	STEPFATHER(22, "stepfather", "stepfather"),

	/**
	 * The '<em><b>Stepmother</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEPMOTHER_VALUE
	 * @generated
	 * @ordered
	 */
	STEPMOTHER(23, "stepmother", "stepmother"),

	/**
	 * The '<em><b>Sisterinlaw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SISTERINLAW_VALUE
	 * @generated
	 * @ordered
	 */
	SISTERINLAW(24, "sisterinlaw", "sisterinlaw");

	/**
	 * The '<em><b>Mother</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTHER
	 * @model name="mother"
	 * @generated
	 * @ordered
	 */
	public static final int MOTHER_VALUE = 0;

	/**
	 * The '<em><b>Father</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FATHER
	 * @model name="father"
	 * @generated
	 * @ordered
	 */
	public static final int FATHER_VALUE = 1;

	/**
	 * The '<em><b>Child</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD
	 * @model name="child"
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_VALUE = 2;

	/**
	 * The '<em><b>Familymember</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILYMEMBER
	 * @model name="familymember"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILYMEMBER_VALUE = 3;

	/**
	 * The '<em><b>Spouse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOUSE
	 * @model name="spouse"
	 * @generated
	 * @ordered
	 */
	public static final int SPOUSE_VALUE = 4;

	/**
	 * The '<em><b>Husband</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUSBAND
	 * @model name="husband"
	 * @generated
	 * @ordered
	 */
	public static final int HUSBAND_VALUE = 5;

	/**
	 * The '<em><b>Partner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTNER
	 * @model name="partner"
	 * @generated
	 * @ordered
	 */
	public static final int PARTNER_VALUE = 6;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 7;

	/**
	 * The '<em><b>Brother</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROTHER
	 * @model name="brother"
	 * @generated
	 * @ordered
	 */
	public static final int BROTHER_VALUE = 8;

	/**
	 * The '<em><b>Sister</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SISTER
	 * @model name="sister"
	 * @generated
	 * @ordered
	 */
	public static final int SISTER_VALUE = 9;

	/**
	 * The '<em><b>Brotherinlaw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROTHERINLAW
	 * @model name="brotherinlaw"
	 * @generated
	 * @ordered
	 */
	public static final int BROTHERINLAW_VALUE = 10;

	/**
	 * The '<em><b>Tutor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUTOR
	 * @model name="tutor"
	 * @generated
	 * @ordered
	 */
	public static final int TUTOR_VALUE = 11;

	/**
	 * The '<em><b>Notary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTARY
	 * @model name="notary"
	 * @generated
	 * @ordered
	 */
	public static final int NOTARY_VALUE = 12;

	/**
	 * The '<em><b>Lawyer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAWYER
	 * @model name="lawyer"
	 * @generated
	 * @ordered
	 */
	public static final int LAWYER_VALUE = 13;

	/**
	 * The '<em><b>Employer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPLOYER
	 * @model name="employer"
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYER_VALUE = 14;

	/**
	 * The '<em><b>Grandparent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRANDPARENT
	 * @model name="grandparent"
	 * @generated
	 * @ordered
	 */
	public static final int GRANDPARENT_VALUE = 15;

	/**
	 * The '<em><b>Son</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SON
	 * @model name="son"
	 * @generated
	 * @ordered
	 */
	public static final int SON_VALUE = 16;

	/**
	 * The '<em><b>Daughter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAUGHTER
	 * @model name="daughter"
	 * @generated
	 * @ordered
	 */
	public static final int DAUGHTER_VALUE = 17;

	/**
	 * The '<em><b>Grandchild</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRANDCHILD
	 * @model name="grandchild"
	 * @generated
	 * @ordered
	 */
	public static final int GRANDCHILD_VALUE = 18;

	/**
	 * The '<em><b>Neighbour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEIGHBOUR
	 * @model name="neighbour"
	 * @generated
	 * @ordered
	 */
	public static final int NEIGHBOUR_VALUE = 19;

	/**
	 * The '<em><b>Stepson</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEPSON
	 * @model name="stepson"
	 * @generated
	 * @ordered
	 */
	public static final int STEPSON_VALUE = 20;

	/**
	 * The '<em><b>Stepdaughter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEPDAUGHTER
	 * @model name="stepdaughter"
	 * @generated
	 * @ordered
	 */
	public static final int STEPDAUGHTER_VALUE = 21;

	/**
	 * The '<em><b>Stepfather</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEPFATHER
	 * @model name="stepfather"
	 * @generated
	 * @ordered
	 */
	public static final int STEPFATHER_VALUE = 22;

	/**
	 * The '<em><b>Stepmother</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEPMOTHER
	 * @model name="stepmother"
	 * @generated
	 * @ordered
	 */
	public static final int STEPMOTHER_VALUE = 23;

	/**
	 * The '<em><b>Sisterinlaw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SISTERINLAW
	 * @model name="sisterinlaw"
	 * @generated
	 * @ordered
	 */
	public static final int SISTERINLAW_VALUE = 24;

	/**
	 * An array of all the '<em><b>CDCONTACTPERSO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDCONTACTPERSONvalues[] VALUES_ARRAY =
		new CDCONTACTPERSONvalues[] {
			MOTHER,
			FATHER,
			CHILD,
			FAMILYMEMBER,
			SPOUSE,
			HUSBAND,
			PARTNER,
			OTHER,
			BROTHER,
			SISTER,
			BROTHERINLAW,
			TUTOR,
			NOTARY,
			LAWYER,
			EMPLOYER,
			GRANDPARENT,
			SON,
			DAUGHTER,
			GRANDCHILD,
			NEIGHBOUR,
			STEPSON,
			STEPDAUGHTER,
			STEPFATHER,
			STEPMOTHER,
			SISTERINLAW,
		};

	/**
	 * A public read-only list of all the '<em><b>CDCONTACTPERSO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDCONTACTPERSONvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDCONTACTPERSO Nvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCONTACTPERSONvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCONTACTPERSONvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCONTACTPERSO Nvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCONTACTPERSONvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCONTACTPERSONvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCONTACTPERSO Nvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCONTACTPERSONvalues get(int value) {
		switch (value) {
			case MOTHER_VALUE: return MOTHER;
			case FATHER_VALUE: return FATHER;
			case CHILD_VALUE: return CHILD;
			case FAMILYMEMBER_VALUE: return FAMILYMEMBER;
			case SPOUSE_VALUE: return SPOUSE;
			case HUSBAND_VALUE: return HUSBAND;
			case PARTNER_VALUE: return PARTNER;
			case OTHER_VALUE: return OTHER;
			case BROTHER_VALUE: return BROTHER;
			case SISTER_VALUE: return SISTER;
			case BROTHERINLAW_VALUE: return BROTHERINLAW;
			case TUTOR_VALUE: return TUTOR;
			case NOTARY_VALUE: return NOTARY;
			case LAWYER_VALUE: return LAWYER;
			case EMPLOYER_VALUE: return EMPLOYER;
			case GRANDPARENT_VALUE: return GRANDPARENT;
			case SON_VALUE: return SON;
			case DAUGHTER_VALUE: return DAUGHTER;
			case GRANDCHILD_VALUE: return GRANDCHILD;
			case NEIGHBOUR_VALUE: return NEIGHBOUR;
			case STEPSON_VALUE: return STEPSON;
			case STEPDAUGHTER_VALUE: return STEPDAUGHTER;
			case STEPFATHER_VALUE: return STEPFATHER;
			case STEPMOTHER_VALUE: return STEPMOTHER;
			case SISTERINLAW_VALUE: return SISTERINLAW;
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
	private CDCONTACTPERSONvalues(int value, String name, String literal) {
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
	
} //CDCONTACTPERSONvalues
