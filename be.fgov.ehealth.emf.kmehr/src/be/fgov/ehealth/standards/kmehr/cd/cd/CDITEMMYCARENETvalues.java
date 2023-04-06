/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDITEMMYCARENE Tvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDITEMMYCARENETvalues()
 * @model extendedMetaData="name='CD-ITEM-MYCARENETvalues'"
 * @generated
 */
public enum CDITEMMYCARENETvalues implements Enumerator {
	/**
	 * The '<em><b>Fee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEE_VALUE
	 * @generated
	 * @ordered
	 */
	FEE(0, "fee", "fee"),

	/**
	 * The '<em><b>Financialcontract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINANCIALCONTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	FINANCIALCONTRACT(1, "financialcontract", "financialcontract"),

	/**
	 * The '<em><b>Patientfee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENTFEE_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENTFEE(2, "patientfee", "patientfee"),

	/**
	 * The '<em><b>Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT(3, "payment", "payment"),

	/**
	 * The '<em><b>Reimbursement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REIMBURSEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	REIMBURSEMENT(4, "reimbursement", "reimbursement"),

	/**
	 * The '<em><b>Refusal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSAL_VALUE
	 * @generated
	 * @ordered
	 */
	REFUSAL(5, "refusal", "refusal"),

	/**
	 * The '<em><b>Patientpaid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENTPAID_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENTPAID(6, "patientpaid", "patientpaid"),

	/**
	 * The '<em><b>Supplement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLEMENT(7, "supplement", "supplement"),

	/**
	 * The '<em><b>Paymentreceivingparty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENTRECEIVINGPARTY_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENTRECEIVINGPARTY(8, "paymentreceivingparty", "paymentreceivingparty"),

	/**
	 * The '<em><b>Internship</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNSHIP(9, "internship", "internship"),

	/**
	 * The '<em><b>Documentidentity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTIDENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTIDENTITY(10, "documentidentity", "documentidentity"),

	/**
	 * The '<em><b>Invoicingnumber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVOICINGNUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	INVOICINGNUMBER(11, "invoicingnumber", "invoicingnumber"),

	/**
	 * The '<em><b>Reimbursement Fpssi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REIMBURSEMENT_FPSSI_VALUE
	 * @generated
	 * @ordered
	 */
	REIMBURSEMENT_FPSSI(12, "reimbursementFpssi", "reimbursement-fpssi"),

	/**
	 * The '<em><b>Reimbursement Pswc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REIMBURSEMENT_PSWC_VALUE
	 * @generated
	 * @ordered
	 */
	REIMBURSEMENT_PSWC(13, "reimbursementPswc", "reimbursement-pswc"),

	/**
	 * The '<em><b>Umc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UMC_VALUE
	 * @generated
	 * @ordered
	 */
	UMC(14, "umc", "umc"),

	/**
	 * The '<em><b>Mediprimanumber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIPRIMANUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIPRIMANUMBER(15, "mediprimanumber", "mediprimanumber"),

	/**
	 * The '<em><b>Pswc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PSWC_VALUE
	 * @generated
	 * @ordered
	 */
	PSWC(16, "pswc", "pswc"),

	/**
	 * The '<em><b>Treatmentreason</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENTREASON_VALUE
	 * @generated
	 * @ordered
	 */
	TREATMENTREASON(17, "treatmentreason", "treatmentreason"),

	/**
	 * The '<em><b>Agreementenddate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTENDDATE_VALUE
	 * @generated
	 * @ordered
	 */
	AGREEMENTENDDATE(18, "agreementenddate", "agreementenddate"),

	/**
	 * The '<em><b>Agreementstartdate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTSTARTDATE_VALUE
	 * @generated
	 * @ordered
	 */
	AGREEMENTSTARTDATE(19, "agreementstartdate", "agreementstartdate"),

	/**
	 * The '<em><b>Agreementtype</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	AGREEMENTTYPE(20, "agreementtype", "agreementtype"),

	/**
	 * The '<em><b>Consultationenddate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTATIONENDDATE_VALUE
	 * @generated
	 * @ordered
	 */
	CONSULTATIONENDDATE(21, "consultationenddate", "consultationenddate"),

	/**
	 * The '<em><b>Consultationstartdate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTATIONSTARTDATE_VALUE
	 * @generated
	 * @ordered
	 */
	CONSULTATIONSTARTDATE(22, "consultationstartdate", "consultationstartdate"),

	/**
	 * The '<em><b>Authorisationtype</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHORISATIONTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHORISATIONTYPE(23, "authorisationtype", "authorisationtype"),

	/**
	 * The '<em><b>Decisionreference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISIONREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DECISIONREFERENCE(24, "decisionreference", "decisionreference"),

	/**
	 * The '<em><b>Orphandrugdeliveryplace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORPHANDRUGDELIVERYPLACE_VALUE
	 * @generated
	 * @ordered
	 */
	ORPHANDRUGDELIVERYPLACE(25, "orphandrugdeliveryplace", "orphandrugdeliveryplace"),

	/**
	 * The '<em><b>Refusaljustification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSALJUSTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	REFUSALJUSTIFICATION(26, "refusaljustification", "refusaljustification"),

	/**
	 * The '<em><b>Reststrength</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTSTRENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	RESTSTRENGTH(27, "reststrength", "reststrength"),

	/**
	 * The '<em><b>Restunitnumber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTUNITNUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	RESTUNITNUMBER(28, "restunitnumber", "restunitnumber"),

	/**
	 * The '<em><b>Legalbasis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGALBASIS_VALUE
	 * @generated
	 * @ordered
	 */
	LEGALBASIS(29, "legalbasis", "legalbasis"),

	/**
	 * The '<em><b>Legalunitnumber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGALUNITNUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	LEGALUNITNUMBER(30, "legalunitnumber", "legalunitnumber"),

	/**
	 * The '<em><b>Legalstrength</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGALSTRENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	LEGALSTRENGTH(31, "legalstrength", "legalstrength"),

	/**
	 * The '<em><b>Istrialperiod</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRIALPERIOD_VALUE
	 * @generated
	 * @ordered
	 */
	ISTRIALPERIOD(32, "istrialperiod", "istrialperiod"),

	/**
	 * The '<em><b>Closurejustification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSUREJUSTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSUREJUSTIFICATION(33, "closurejustification", "closurejustification");

	/**
	 * The '<em><b>Fee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEE
	 * @model name="fee"
	 * @generated
	 * @ordered
	 */
	public static final int FEE_VALUE = 0;

	/**
	 * The '<em><b>Financialcontract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINANCIALCONTRACT
	 * @model name="financialcontract"
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIALCONTRACT_VALUE = 1;

	/**
	 * The '<em><b>Patientfee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENTFEE
	 * @model name="patientfee"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENTFEE_VALUE = 2;

	/**
	 * The '<em><b>Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENT
	 * @model name="payment"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_VALUE = 3;

	/**
	 * The '<em><b>Reimbursement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REIMBURSEMENT
	 * @model name="reimbursement"
	 * @generated
	 * @ordered
	 */
	public static final int REIMBURSEMENT_VALUE = 4;

	/**
	 * The '<em><b>Refusal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSAL
	 * @model name="refusal"
	 * @generated
	 * @ordered
	 */
	public static final int REFUSAL_VALUE = 5;

	/**
	 * The '<em><b>Patientpaid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENTPAID
	 * @model name="patientpaid"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENTPAID_VALUE = 6;

	/**
	 * The '<em><b>Supplement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLEMENT
	 * @model name="supplement"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLEMENT_VALUE = 7;

	/**
	 * The '<em><b>Paymentreceivingparty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENTRECEIVINGPARTY
	 * @model name="paymentreceivingparty"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENTRECEIVINGPARTY_VALUE = 8;

	/**
	 * The '<em><b>Internship</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNSHIP
	 * @model name="internship"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNSHIP_VALUE = 9;

	/**
	 * The '<em><b>Documentidentity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTIDENTITY
	 * @model name="documentidentity"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTIDENTITY_VALUE = 10;

	/**
	 * The '<em><b>Invoicingnumber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVOICINGNUMBER
	 * @model name="invoicingnumber"
	 * @generated
	 * @ordered
	 */
	public static final int INVOICINGNUMBER_VALUE = 11;

	/**
	 * The '<em><b>Reimbursement Fpssi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REIMBURSEMENT_FPSSI
	 * @model name="reimbursementFpssi" literal="reimbursement-fpssi"
	 * @generated
	 * @ordered
	 */
	public static final int REIMBURSEMENT_FPSSI_VALUE = 12;

	/**
	 * The '<em><b>Reimbursement Pswc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REIMBURSEMENT_PSWC
	 * @model name="reimbursementPswc" literal="reimbursement-pswc"
	 * @generated
	 * @ordered
	 */
	public static final int REIMBURSEMENT_PSWC_VALUE = 13;

	/**
	 * The '<em><b>Umc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UMC
	 * @model name="umc"
	 * @generated
	 * @ordered
	 */
	public static final int UMC_VALUE = 14;

	/**
	 * The '<em><b>Mediprimanumber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIPRIMANUMBER
	 * @model name="mediprimanumber"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIPRIMANUMBER_VALUE = 15;

	/**
	 * The '<em><b>Pswc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PSWC
	 * @model name="pswc"
	 * @generated
	 * @ordered
	 */
	public static final int PSWC_VALUE = 16;

	/**
	 * The '<em><b>Treatmentreason</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENTREASON
	 * @model name="treatmentreason"
	 * @generated
	 * @ordered
	 */
	public static final int TREATMENTREASON_VALUE = 17;

	/**
	 * The '<em><b>Agreementenddate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTENDDATE
	 * @model name="agreementenddate"
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENTENDDATE_VALUE = 18;

	/**
	 * The '<em><b>Agreementstartdate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTSTARTDATE
	 * @model name="agreementstartdate"
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENTSTARTDATE_VALUE = 19;

	/**
	 * The '<em><b>Agreementtype</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREEMENTTYPE
	 * @model name="agreementtype"
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENTTYPE_VALUE = 20;

	/**
	 * The '<em><b>Consultationenddate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTATIONENDDATE
	 * @model name="consultationenddate"
	 * @generated
	 * @ordered
	 */
	public static final int CONSULTATIONENDDATE_VALUE = 21;

	/**
	 * The '<em><b>Consultationstartdate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSULTATIONSTARTDATE
	 * @model name="consultationstartdate"
	 * @generated
	 * @ordered
	 */
	public static final int CONSULTATIONSTARTDATE_VALUE = 22;

	/**
	 * The '<em><b>Authorisationtype</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHORISATIONTYPE
	 * @model name="authorisationtype"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHORISATIONTYPE_VALUE = 23;

	/**
	 * The '<em><b>Decisionreference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISIONREFERENCE
	 * @model name="decisionreference"
	 * @generated
	 * @ordered
	 */
	public static final int DECISIONREFERENCE_VALUE = 24;

	/**
	 * The '<em><b>Orphandrugdeliveryplace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORPHANDRUGDELIVERYPLACE
	 * @model name="orphandrugdeliveryplace"
	 * @generated
	 * @ordered
	 */
	public static final int ORPHANDRUGDELIVERYPLACE_VALUE = 25;

	/**
	 * The '<em><b>Refusaljustification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSALJUSTIFICATION
	 * @model name="refusaljustification"
	 * @generated
	 * @ordered
	 */
	public static final int REFUSALJUSTIFICATION_VALUE = 26;

	/**
	 * The '<em><b>Reststrength</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTSTRENGTH
	 * @model name="reststrength"
	 * @generated
	 * @ordered
	 */
	public static final int RESTSTRENGTH_VALUE = 27;

	/**
	 * The '<em><b>Restunitnumber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTUNITNUMBER
	 * @model name="restunitnumber"
	 * @generated
	 * @ordered
	 */
	public static final int RESTUNITNUMBER_VALUE = 28;

	/**
	 * The '<em><b>Legalbasis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGALBASIS
	 * @model name="legalbasis"
	 * @generated
	 * @ordered
	 */
	public static final int LEGALBASIS_VALUE = 29;

	/**
	 * The '<em><b>Legalunitnumber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGALUNITNUMBER
	 * @model name="legalunitnumber"
	 * @generated
	 * @ordered
	 */
	public static final int LEGALUNITNUMBER_VALUE = 30;

	/**
	 * The '<em><b>Legalstrength</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGALSTRENGTH
	 * @model name="legalstrength"
	 * @generated
	 * @ordered
	 */
	public static final int LEGALSTRENGTH_VALUE = 31;

	/**
	 * The '<em><b>Istrialperiod</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRIALPERIOD
	 * @model name="istrialperiod"
	 * @generated
	 * @ordered
	 */
	public static final int ISTRIALPERIOD_VALUE = 32;

	/**
	 * The '<em><b>Closurejustification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSUREJUSTIFICATION
	 * @model name="closurejustification"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSUREJUSTIFICATION_VALUE = 33;

	/**
	 * An array of all the '<em><b>CDITEMMYCARENE Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDITEMMYCARENETvalues[] VALUES_ARRAY =
		new CDITEMMYCARENETvalues[] {
			FEE,
			FINANCIALCONTRACT,
			PATIENTFEE,
			PAYMENT,
			REIMBURSEMENT,
			REFUSAL,
			PATIENTPAID,
			SUPPLEMENT,
			PAYMENTRECEIVINGPARTY,
			INTERNSHIP,
			DOCUMENTIDENTITY,
			INVOICINGNUMBER,
			REIMBURSEMENT_FPSSI,
			REIMBURSEMENT_PSWC,
			UMC,
			MEDIPRIMANUMBER,
			PSWC,
			TREATMENTREASON,
			AGREEMENTENDDATE,
			AGREEMENTSTARTDATE,
			AGREEMENTTYPE,
			CONSULTATIONENDDATE,
			CONSULTATIONSTARTDATE,
			AUTHORISATIONTYPE,
			DECISIONREFERENCE,
			ORPHANDRUGDELIVERYPLACE,
			REFUSALJUSTIFICATION,
			RESTSTRENGTH,
			RESTUNITNUMBER,
			LEGALBASIS,
			LEGALUNITNUMBER,
			LEGALSTRENGTH,
			ISTRIALPERIOD,
			CLOSUREJUSTIFICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>CDITEMMYCARENE Tvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDITEMMYCARENETvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDITEMMYCARENE Tvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMMYCARENETvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMMYCARENETvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITEMMYCARENE Tvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMMYCARENETvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMMYCARENETvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITEMMYCARENE Tvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMMYCARENETvalues get(int value) {
		switch (value) {
			case FEE_VALUE: return FEE;
			case FINANCIALCONTRACT_VALUE: return FINANCIALCONTRACT;
			case PATIENTFEE_VALUE: return PATIENTFEE;
			case PAYMENT_VALUE: return PAYMENT;
			case REIMBURSEMENT_VALUE: return REIMBURSEMENT;
			case REFUSAL_VALUE: return REFUSAL;
			case PATIENTPAID_VALUE: return PATIENTPAID;
			case SUPPLEMENT_VALUE: return SUPPLEMENT;
			case PAYMENTRECEIVINGPARTY_VALUE: return PAYMENTRECEIVINGPARTY;
			case INTERNSHIP_VALUE: return INTERNSHIP;
			case DOCUMENTIDENTITY_VALUE: return DOCUMENTIDENTITY;
			case INVOICINGNUMBER_VALUE: return INVOICINGNUMBER;
			case REIMBURSEMENT_FPSSI_VALUE: return REIMBURSEMENT_FPSSI;
			case REIMBURSEMENT_PSWC_VALUE: return REIMBURSEMENT_PSWC;
			case UMC_VALUE: return UMC;
			case MEDIPRIMANUMBER_VALUE: return MEDIPRIMANUMBER;
			case PSWC_VALUE: return PSWC;
			case TREATMENTREASON_VALUE: return TREATMENTREASON;
			case AGREEMENTENDDATE_VALUE: return AGREEMENTENDDATE;
			case AGREEMENTSTARTDATE_VALUE: return AGREEMENTSTARTDATE;
			case AGREEMENTTYPE_VALUE: return AGREEMENTTYPE;
			case CONSULTATIONENDDATE_VALUE: return CONSULTATIONENDDATE;
			case CONSULTATIONSTARTDATE_VALUE: return CONSULTATIONSTARTDATE;
			case AUTHORISATIONTYPE_VALUE: return AUTHORISATIONTYPE;
			case DECISIONREFERENCE_VALUE: return DECISIONREFERENCE;
			case ORPHANDRUGDELIVERYPLACE_VALUE: return ORPHANDRUGDELIVERYPLACE;
			case REFUSALJUSTIFICATION_VALUE: return REFUSALJUSTIFICATION;
			case RESTSTRENGTH_VALUE: return RESTSTRENGTH;
			case RESTUNITNUMBER_VALUE: return RESTUNITNUMBER;
			case LEGALBASIS_VALUE: return LEGALBASIS;
			case LEGALUNITNUMBER_VALUE: return LEGALUNITNUMBER;
			case LEGALSTRENGTH_VALUE: return LEGALSTRENGTH;
			case ISTRIALPERIOD_VALUE: return ISTRIALPERIOD;
			case CLOSUREJUSTIFICATION_VALUE: return CLOSUREJUSTIFICATION;
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
	private CDITEMMYCARENETvalues(int value, String name, String literal) {
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
	
} //CDITEMMYCARENETvalues
