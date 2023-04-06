/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDITEMMA Avalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDITEMMAAvalues()
 * @model extendedMetaData="name='CD-ITEM-MAAvalues'"
 * @generated
 */
public enum CDITEMMAAvalues implements Enumerator {
	/**
	 * The '<em><b>Agreementtype</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	AGREEMENTTYPE(0, "agreementtype", "agreementtype"),

	/**
	 * The '<em><b>Requesttype</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTTYPE(1, "requesttype", "requesttype"),

	/**
	 * The '<em><b>Responsetype</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSETYPE_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSETYPE(2, "responsetype", "responsetype"),

	/**
	 * The '<em><b>Agreementstartdate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTSTARTDATE_VALUE
	 * @generated
	 * @ordered
	 */
	AGREEMENTSTARTDATE(3, "agreementstartdate", "agreementstartdate"),

	/**
	 * The '<em><b>Agreementenddate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTENDDATE_VALUE
	 * @generated
	 * @ordered
	 */
	AGREEMENTENDDATE(4, "agreementenddate", "agreementenddate"),

	/**
	 * The '<em><b>Consultationstartdate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTATIONSTARTDATE_VALUE
	 * @generated
	 * @ordered
	 */
	CONSULTATIONSTARTDATE(5, "consultationstartdate", "consultationstartdate"),

	/**
	 * The '<em><b>Consultationenddate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTATIONENDDATE_VALUE
	 * @generated
	 * @ordered
	 */
	CONSULTATIONENDDATE(6, "consultationenddate", "consultationenddate"),

	/**
	 * The '<em><b>Careproviderreference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAREPROVIDERREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	CAREPROVIDERREFERENCE(7, "careproviderreference", "careproviderreference"),

	/**
	 * The '<em><b>Iorequestreference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IOREQUESTREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	IOREQUESTREFERENCE(8, "iorequestreference", "iorequestreference"),

	/**
	 * The '<em><b>Decisionreference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISIONREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DECISIONREFERENCE(9, "decisionreference", "decisionreference"),

	/**
	 * The '<em><b>Refusaljustification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSALJUSTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	REFUSALJUSTIFICATION(10, "refusaljustification", "refusaljustification"),

	/**
	 * The '<em><b>Chapter4reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAPTER4REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	CHAPTER4REFERENCE(11, "chapter4reference", "chapter4reference"),

	/**
	 * The '<em><b>Chapter4annexreference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAPTER4ANNEXREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	CHAPTER4ANNEXREFERENCE(12, "chapter4annexreference", "chapter4annexreference"),

	/**
	 * The '<em><b>Unitnumber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNITNUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	UNITNUMBER(13, "unitnumber", "unitnumber"),

	/**
	 * The '<em><b>Strength</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	STRENGTH(14, "strength", "strength"),

	/**
	 * The '<em><b>Restunitnumber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTUNITNUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	RESTUNITNUMBER(15, "restunitnumber", "restunitnumber"),

	/**
	 * The '<em><b>Reststrength</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTSTRENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	RESTSTRENGTH(16, "reststrength", "reststrength"),

	/**
	 * The '<em><b>Orphandrugdeliveryplace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORPHANDRUGDELIVERYPLACE_VALUE
	 * @generated
	 * @ordered
	 */
	ORPHANDRUGDELIVERYPLACE(17, "orphandrugdeliveryplace", "orphandrugdeliveryplace"),

	/**
	 * The '<em><b>Orphandrugdeliveryid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORPHANDRUGDELIVERYID_VALUE
	 * @generated
	 * @ordered
	 */
	ORPHANDRUGDELIVERYID(18, "orphandrugdeliveryid", "orphandrugdeliveryid"),

	/**
	 * The '<em><b>Coveragetype</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVERAGETYPE_VALUE
	 * @generated
	 * @ordered
	 */
	COVERAGETYPE(19, "coveragetype", "coveragetype");

	/**
	 * The '<em><b>Agreementtype</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTTYPE
	 * @model name="agreementtype"
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENTTYPE_VALUE = 0;

	/**
	 * The '<em><b>Requesttype</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTTYPE
	 * @model name="requesttype"
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTTYPE_VALUE = 1;

	/**
	 * The '<em><b>Responsetype</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSETYPE
	 * @model name="responsetype"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSETYPE_VALUE = 2;

	/**
	 * The '<em><b>Agreementstartdate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTSTARTDATE
	 * @model name="agreementstartdate"
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENTSTARTDATE_VALUE = 3;

	/**
	 * The '<em><b>Agreementenddate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTENDDATE
	 * @model name="agreementenddate"
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENTENDDATE_VALUE = 4;

	/**
	 * The '<em><b>Consultationstartdate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTATIONSTARTDATE
	 * @model name="consultationstartdate"
	 * @generated
	 * @ordered
	 */
	public static final int CONSULTATIONSTARTDATE_VALUE = 5;

	/**
	 * The '<em><b>Consultationenddate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTATIONENDDATE
	 * @model name="consultationenddate"
	 * @generated
	 * @ordered
	 */
	public static final int CONSULTATIONENDDATE_VALUE = 6;

	/**
	 * The '<em><b>Careproviderreference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAREPROVIDERREFERENCE
	 * @model name="careproviderreference"
	 * @generated
	 * @ordered
	 */
	public static final int CAREPROVIDERREFERENCE_VALUE = 7;

	/**
	 * The '<em><b>Iorequestreference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IOREQUESTREFERENCE
	 * @model name="iorequestreference"
	 * @generated
	 * @ordered
	 */
	public static final int IOREQUESTREFERENCE_VALUE = 8;

	/**
	 * The '<em><b>Decisionreference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISIONREFERENCE
	 * @model name="decisionreference"
	 * @generated
	 * @ordered
	 */
	public static final int DECISIONREFERENCE_VALUE = 9;

	/**
	 * The '<em><b>Refusaljustification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSALJUSTIFICATION
	 * @model name="refusaljustification"
	 * @generated
	 * @ordered
	 */
	public static final int REFUSALJUSTIFICATION_VALUE = 10;

	/**
	 * The '<em><b>Chapter4reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAPTER4REFERENCE
	 * @model name="chapter4reference"
	 * @generated
	 * @ordered
	 */
	public static final int CHAPTER4REFERENCE_VALUE = 11;

	/**
	 * The '<em><b>Chapter4annexreference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAPTER4ANNEXREFERENCE
	 * @model name="chapter4annexreference"
	 * @generated
	 * @ordered
	 */
	public static final int CHAPTER4ANNEXREFERENCE_VALUE = 12;

	/**
	 * The '<em><b>Unitnumber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNITNUMBER
	 * @model name="unitnumber"
	 * @generated
	 * @ordered
	 */
	public static final int UNITNUMBER_VALUE = 13;

	/**
	 * The '<em><b>Strength</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRENGTH
	 * @model name="strength"
	 * @generated
	 * @ordered
	 */
	public static final int STRENGTH_VALUE = 14;

	/**
	 * The '<em><b>Restunitnumber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTUNITNUMBER
	 * @model name="restunitnumber"
	 * @generated
	 * @ordered
	 */
	public static final int RESTUNITNUMBER_VALUE = 15;

	/**
	 * The '<em><b>Reststrength</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTSTRENGTH
	 * @model name="reststrength"
	 * @generated
	 * @ordered
	 */
	public static final int RESTSTRENGTH_VALUE = 16;

	/**
	 * The '<em><b>Orphandrugdeliveryplace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORPHANDRUGDELIVERYPLACE
	 * @model name="orphandrugdeliveryplace"
	 * @generated
	 * @ordered
	 */
	public static final int ORPHANDRUGDELIVERYPLACE_VALUE = 17;

	/**
	 * The '<em><b>Orphandrugdeliveryid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORPHANDRUGDELIVERYID
	 * @model name="orphandrugdeliveryid"
	 * @generated
	 * @ordered
	 */
	public static final int ORPHANDRUGDELIVERYID_VALUE = 18;

	/**
	 * The '<em><b>Coveragetype</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVERAGETYPE
	 * @model name="coveragetype"
	 * @generated
	 * @ordered
	 */
	public static final int COVERAGETYPE_VALUE = 19;

	/**
	 * An array of all the '<em><b>CDITEMMA Avalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDITEMMAAvalues[] VALUES_ARRAY =
		new CDITEMMAAvalues[] {
			AGREEMENTTYPE,
			REQUESTTYPE,
			RESPONSETYPE,
			AGREEMENTSTARTDATE,
			AGREEMENTENDDATE,
			CONSULTATIONSTARTDATE,
			CONSULTATIONENDDATE,
			CAREPROVIDERREFERENCE,
			IOREQUESTREFERENCE,
			DECISIONREFERENCE,
			REFUSALJUSTIFICATION,
			CHAPTER4REFERENCE,
			CHAPTER4ANNEXREFERENCE,
			UNITNUMBER,
			STRENGTH,
			RESTUNITNUMBER,
			RESTSTRENGTH,
			ORPHANDRUGDELIVERYPLACE,
			ORPHANDRUGDELIVERYID,
			COVERAGETYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDITEMMA Avalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDITEMMAAvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDITEMMA Avalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMMAAvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMMAAvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITEMMA Avalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMMAAvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMMAAvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITEMMA Avalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMMAAvalues get(int value) {
		switch (value) {
			case AGREEMENTTYPE_VALUE: return AGREEMENTTYPE;
			case REQUESTTYPE_VALUE: return REQUESTTYPE;
			case RESPONSETYPE_VALUE: return RESPONSETYPE;
			case AGREEMENTSTARTDATE_VALUE: return AGREEMENTSTARTDATE;
			case AGREEMENTENDDATE_VALUE: return AGREEMENTENDDATE;
			case CONSULTATIONSTARTDATE_VALUE: return CONSULTATIONSTARTDATE;
			case CONSULTATIONENDDATE_VALUE: return CONSULTATIONENDDATE;
			case CAREPROVIDERREFERENCE_VALUE: return CAREPROVIDERREFERENCE;
			case IOREQUESTREFERENCE_VALUE: return IOREQUESTREFERENCE;
			case DECISIONREFERENCE_VALUE: return DECISIONREFERENCE;
			case REFUSALJUSTIFICATION_VALUE: return REFUSALJUSTIFICATION;
			case CHAPTER4REFERENCE_VALUE: return CHAPTER4REFERENCE;
			case CHAPTER4ANNEXREFERENCE_VALUE: return CHAPTER4ANNEXREFERENCE;
			case UNITNUMBER_VALUE: return UNITNUMBER;
			case STRENGTH_VALUE: return STRENGTH;
			case RESTUNITNUMBER_VALUE: return RESTUNITNUMBER;
			case RESTSTRENGTH_VALUE: return RESTSTRENGTH;
			case ORPHANDRUGDELIVERYPLACE_VALUE: return ORPHANDRUGDELIVERYPLACE;
			case ORPHANDRUGDELIVERYID_VALUE: return ORPHANDRUGDELIVERYID;
			case COVERAGETYPE_VALUE: return COVERAGETYPE;
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
	private CDITEMMAAvalues(int value, String name, String literal) {
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
	
} //CDITEMMAAvalues
