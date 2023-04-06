/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDCONTEN Tschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDCONTENTschemes()
 * @model extendedMetaData="name='CD-CONTENTschemes'"
 * @generated
 */
public enum CDCONTENTschemes implements Enumerator {
	/**
	 * The '<em><b>CDLAB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDLAB_VALUE
	 * @generated
	 * @ordered
	 */
	CDLAB(0, "CDLAB", "CD-LAB"),

	/**
	 * The '<em><b>CDTECHNICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTECHNICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CDTECHNICAL(1, "CDTECHNICAL", "CD-TECHNICAL"),

	/**
	 * The '<em><b>CDHCPARTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDHCPARTY_VALUE
	 * @generated
	 * @ordered
	 */
	CDHCPARTY(2, "CDHCPARTY", "CD-HCPARTY"),

	/**
	 * The '<em><b>CDDRUGCNK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDRUGCNK_VALUE
	 * @generated
	 * @ordered
	 */
	CDDRUGCNK(3, "CDDRUGCNK", "CD-DRUG-CNK"),

	/**
	 * The '<em><b>CDENCOUNTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDENCOUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	CDENCOUNTER(4, "CDENCOUNTER", "CD-ENCOUNTER"),

	/**
	 * The '<em><b>CDMKGADMISSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMKGADMISSION_VALUE
	 * @generated
	 * @ordered
	 */
	CDMKGADMISSION(5, "CDMKGADMISSION", "CD-MKG-ADMISSION"),

	/**
	 * The '<em><b>CDMKGDISCHARGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMKGDISCHARGE_VALUE
	 * @generated
	 * @ordered
	 */
	CDMKGDISCHARGE(6, "CDMKGDISCHARGE", "CD-MKG-DISCHARGE"),

	/**
	 * The '<em><b>CDMKGORIGIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMKGORIGIN_VALUE
	 * @generated
	 * @ordered
	 */
	CDMKGORIGIN(7, "CDMKGORIGIN", "CD-MKG-ORIGIN"),

	/**
	 * The '<em><b>CDMKGREFERRER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMKGREFERRER_VALUE
	 * @generated
	 * @ordered
	 */
	CDMKGREFERRER(8, "CDMKGREFERRER", "CD-MKG-REFERRER"),

	/**
	 * The '<em><b>CDMKGDESTINATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMKGDESTINATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDMKGDESTINATION(9, "CDMKGDESTINATION", "CD-MKG-DESTINATION"),

	/**
	 * The '<em><b>CDLEGALSERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDLEGALSERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CDLEGALSERVICE(10, "CDLEGALSERVICE", "CD-LEGAL-SERVICE"),

	/**
	 * The '<em><b>CDCONTACTPERSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCONTACTPERSON_VALUE
	 * @generated
	 * @ordered
	 */
	CDCONTACTPERSON(11, "CDCONTACTPERSON", "CD-CONTACT-PERSON"),

	/**
	 * The '<em><b>CDENCOUNTERTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDENCOUNTERTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDENCOUNTERTYPE(12, "CDENCOUNTERTYPE", "CD-ENCOUNTER-TYPE"),

	/**
	 * The '<em><b>CDCARENETACCIDENTTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETACCIDENTTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDCARENETACCIDENTTYPE(13, "CDCARENETACCIDENTTYPE", "CD-CARENET-ACCIDENT-TYPE"),

	/**
	 * The '<em><b>CDCARENETAGREEMENTTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETAGREEMENTTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDCARENETAGREEMENTTYPE(14, "CDCARENETAGREEMENTTYPE", "CD-CARENET-AGREEMENT-TYPE"),

	/**
	 * The '<em><b>CDCARENETSISCARDERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETSISCARDERROR_VALUE
	 * @generated
	 * @ordered
	 */
	CDCARENETSISCARDERROR(15, "CDCARENETSISCARDERROR", "CD-CARENET-SISCARD-ERROR"),

	/**
	 * The '<em><b>CDCARENETSOCIALCODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETSOCIALCODE_VALUE
	 * @generated
	 * @ordered
	 */
	CDCARENETSOCIALCODE(16, "CDCARENETSOCIALCODE", "CD-CARENET-SOCIAL-CODE"),

	/**
	 * The '<em><b>CDCARENETREFUSALREASON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETREFUSALREASON_VALUE
	 * @generated
	 * @ordered
	 */
	CDCARENETREFUSALREASON(17, "CDCARENETREFUSALREASON", "CD-CARENET-REFUSAL-REASON"),

	/**
	 * The '<em><b>CDCARENETNATIONALINSURANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETNATIONALINSURANCE_VALUE
	 * @generated
	 * @ordered
	 */
	CDCARENETNATIONALINSURANCE(18, "CDCARENETNATIONALINSURANCE", "CD-CARENET-NATIONAL-INSURANCE"),

	/**
	 * The '<em><b>CDCARENETMESSAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETMESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	CDCARENETMESSAGE(19, "CDCARENETMESSAGE", "CD-CARENET-MESSAGE"),

	/**
	 * The '<em><b>CDCARENETMUTATIONINDICATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETMUTATIONINDICATOR_VALUE
	 * @generated
	 * @ordered
	 */
	CDCARENETMUTATIONINDICATOR(20, "CDCARENETMUTATIONINDICATOR", "CD-CARENET-MUTATION-INDICATOR"),

	/**
	 * The '<em><b>CDCARENETDOCUMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETDOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CDCARENETDOCUMENT(21, "CDCARENETDOCUMENT", "CD-CARENET-DOCUMENT"),

	/**
	 * The '<em><b>CDCARENETINSURANCYSTATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETINSURANCYSTATUS_VALUE
	 * @generated
	 * @ordered
	 */
	CDCARENETINSURANCYSTATUS(22, "CDCARENETINSURANCYSTATUS", "CD-CARENET-INSURANCY-STATUS"),

	/**
	 * The '<em><b>CDCARENETTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDCARENETTYPE(23, "CDCARENETTYPE", "CD-CARENET-TYPE"),

	/**
	 * The '<em><b>CDMAATYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMAATYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDMAATYPE(24, "CDMAATYPE", "CD-MAA-TYPE"),

	/**
	 * The '<em><b>CDMAAREQUESTTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMAAREQUESTTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDMAAREQUESTTYPE(25, "CDMAAREQUESTTYPE", "CD-MAA-REQUESTTYPE"),

	/**
	 * The '<em><b>CDMAARESPONSETYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMAARESPONSETYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDMAARESPONSETYPE(26, "CDMAARESPONSETYPE", "CD-MAA-RESPONSETYPE"),

	/**
	 * The '<em><b>CDMAAREFUSALJUSTIFICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMAAREFUSALJUSTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDMAAREFUSALJUSTIFICATION(27, "CDMAAREFUSALJUSTIFICATION", "CD-MAA-REFUSALJUSTIFICATION"),

	/**
	 * The '<em><b>CDMAACOVERAGETYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMAACOVERAGETYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDMAACOVERAGETYPE(28, "CDMAACOVERAGETYPE", "CD-MAA-COVERAGE-TYPE"),

	/**
	 * The '<em><b>CDSITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSITE_VALUE
	 * @generated
	 * @ordered
	 */
	CDSITE(29, "CDSITE", "CD-SITE"),

	/**
	 * The '<em><b>CDINCAPACITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDINCAPACITY_VALUE
	 * @generated
	 * @ordered
	 */
	CDINCAPACITY(30, "CDINCAPACITY", "CD-INCAPACITY"),

	/**
	 * The '<em><b>CDENCOUNTERSAFETYISSUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDENCOUNTERSAFETYISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	CDENCOUNTERSAFETYISSUE(31, "CDENCOUNTERSAFETYISSUE", "CD-ENCOUNTERSAFETYISSUE"),

	/**
	 * The '<em><b>CDEMERGENCYEVALUATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEMERGENCYEVALUATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDEMERGENCYEVALUATION(32, "CDEMERGENCYEVALUATION", "CD-EMERGENCYEVALUATION"),

	/**
	 * The '<em><b>ICD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICD_VALUE
	 * @generated
	 * @ordered
	 */
	ICD(33, "ICD", "ICD"),

	/**
	 * The '<em><b>ICPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICPC_VALUE
	 * @generated
	 * @ordered
	 */
	ICPC(34, "ICPC", "ICPC"),

	/**
	 * The '<em><b>CDCLINICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCLINICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CDCLINICAL(35, "CDCLINICAL", "CD-CLINICAL"),

	/**
	 * The '<em><b>LOCAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(36, "LOCAL", "LOCAL"),

	/**
	 * The '<em><b>CDECAREHAQVALUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDECAREHAQVALUE_VALUE
	 * @generated
	 * @ordered
	 */
	CDECAREHAQVALUE(37, "CDECAREHAQVALUE", "CD-ECARE-HAQVALUE"),

	/**
	 * The '<em><b>CDEBIRTHPREGNANCYORIGIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHPREGNANCYORIGIN_VALUE
	 * @generated
	 * @ordered
	 */
	CDEBIRTHPREGNANCYORIGIN(38, "CDEBIRTHPREGNANCYORIGIN", "CD-EBIRTH-PREGNANCYORIGIN"),

	/**
	 * The '<em><b>CDEBIRTHSPECIALVALUES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHSPECIALVALUES_VALUE
	 * @generated
	 * @ordered
	 */
	CDEBIRTHSPECIALVALUES(39, "CDEBIRTHSPECIALVALUES", "CD-EBIRTH-SPECIALVALUES"),

	/**
	 * The '<em><b>CDEBIRTHCHILDPOSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHCHILDPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	CDEBIRTHCHILDPOSITION(40, "CDEBIRTHCHILDPOSITION", "CD-EBIRTH-CHILDPOSITION"),

	/**
	 * The '<em><b>CDEBIRTHFOETALMONITORING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHFOETALMONITORING_VALUE
	 * @generated
	 * @ordered
	 */
	CDEBIRTHFOETALMONITORING(41, "CDEBIRTHFOETALMONITORING", "CD-EBIRTH-FOETALMONITORING"),

	/**
	 * The '<em><b>CDEBIRTHDELIVERYWAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHDELIVERYWAY_VALUE
	 * @generated
	 * @ordered
	 */
	CDEBIRTHDELIVERYWAY(42, "CDEBIRTHDELIVERYWAY", "CD-EBIRTH-DELIVERYWAY"),

	/**
	 * The '<em><b>CDEBIRTHCAESEREANINDICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHCAESEREANINDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDEBIRTHCAESEREANINDICATION(43, "CDEBIRTHCAESEREANINDICATION", "CD-EBIRTH-CAESEREANINDICATION"),

	/**
	 * The '<em><b>CDEBIRTHARTIFICIALRESPIRATIONTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHARTIFICIALRESPIRATIONTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDEBIRTHARTIFICIALRESPIRATIONTYPE(44, "CDEBIRTHARTIFICIALRESPIRATIONTYPE", "CD-EBIRTH-ARTIFICIALRESPIRATIONTYPE"),

	/**
	 * The '<em><b>CDEBIRTHNEONATALDEPTTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHNEONATALDEPTTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDEBIRTHNEONATALDEPTTYPE(45, "CDEBIRTHNEONATALDEPTTYPE", "CD-EBIRTH-NEONATALDEPTTYPE"),

	/**
	 * The '<em><b>CDEBIRTHCONGENITALMALFORMATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHCONGENITALMALFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDEBIRTHCONGENITALMALFORMATION(46, "CDEBIRTHCONGENITALMALFORMATION", "CD-EBIRTH-CONGENITALMALFORMATION"),

	/**
	 * The '<em><b>CDVACCINEINDICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDVACCINEINDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDVACCINEINDICATION(47, "CDVACCINEINDICATION", "CD-VACCINEINDICATION"),

	/**
	 * The '<em><b>CDATC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDATC_VALUE
	 * @generated
	 * @ordered
	 */
	CDATC(48, "CDATC", "CD-ATC"),

	/**
	 * The '<em><b>CDCAREPATH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCAREPATH_VALUE
	 * @generated
	 * @ordered
	 */
	CDCAREPATH(49, "CDCAREPATH", "CD-CAREPATH"),

	/**
	 * The '<em><b>CDCLINICALPLAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCLINICALPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	CDCLINICALPLAN(50, "CDCLINICALPLAN", "CD-CLINICALPLAN"),

	/**
	 * The '<em><b>CDPATIENTWILL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPATIENTWILL_VALUE
	 * @generated
	 * @ordered
	 */
	CDPATIENTWILL(51, "CDPATIENTWILL", "CD-PATIENTWILL"),

	/**
	 * The '<em><b>CDCONSENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCONSENT_VALUE
	 * @generated
	 * @ordered
	 */
	CDCONSENT(52, "CDCONSENT", "CD-CONSENT"),

	/**
	 * The '<em><b>CDCHAPTER4PARAGRAPH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4PARAGRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	CDCHAPTER4PARAGRAPH(53, "CDCHAPTER4PARAGRAPH", "CD-CHAPTER4PARAGRAPH"),

	/**
	 * The '<em><b>CDCHAPTER4CATEGORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4CATEGORY_VALUE
	 * @generated
	 * @ordered
	 */
	CDCHAPTER4CATEGORY(54, "CDCHAPTER4CATEGORY", "CD-CHAPTER4CATEGORY"),

	/**
	 * The '<em><b>CDCHAPTER4CRITERIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4CRITERIA_VALUE
	 * @generated
	 * @ordered
	 */
	CDCHAPTER4CRITERIA(55, "CDCHAPTER4CRITERIA", "CD-CHAPTER4CRITERIA"),

	/**
	 * The '<em><b>CDCHAPTER4VERSESEQAPPENDIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4VERSESEQAPPENDIX_VALUE
	 * @generated
	 * @ordered
	 */
	CDCHAPTER4VERSESEQAPPENDIX(56, "CDCHAPTER4VERSESEQAPPENDIX", "CD-CHAPTER4VERSESEQAPPENDIX"),

	/**
	 * The '<em><b>CDCHAPTER4DOCUMENTSEQAPPENDIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4DOCUMENTSEQAPPENDIX_VALUE
	 * @generated
	 * @ordered
	 */
	CDCHAPTER4DOCUMENTSEQAPPENDIX(57, "CDCHAPTER4DOCUMENTSEQAPPENDIX", "CD-CHAPTER4DOCUMENTSEQAPPENDIX"),

	/**
	 * The '<em><b>CDCHAPTER4VERSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4VERSE_VALUE
	 * @generated
	 * @ordered
	 */
	CDCHAPTER4VERSE(58, "CDCHAPTER4VERSE", "CD-CHAPTER4VERSE"),

	/**
	 * The '<em><b>CDBVTCONSERVATIONMODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTCONSERVATIONMODE_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTCONSERVATIONMODE(59, "CDBVTCONSERVATIONMODE", "CD-BVT-CONSERVATIONMODE"),

	/**
	 * The '<em><b>CDBVTCONSERVATIONDELAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTCONSERVATIONDELAY_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTCONSERVATIONDELAY(60, "CDBVTCONSERVATIONDELAY", "CD-BVT-CONSERVATIONDELAY"),

	/**
	 * The '<em><b>CDBVTAVAILABLEMATERIALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTAVAILABLEMATERIALS_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTAVAILABLEMATERIALS(61, "CDBVTAVAILABLEMATERIALS", "CD-BVT-AVAILABLEMATERIALS"),

	/**
	 * The '<em><b>CDBCRDIFFERENTATIONDEGREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBCRDIFFERENTATIONDEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	CDBCRDIFFERENTATIONDEGREE(62, "CDBCRDIFFERENTATIONDEGREE", "CD-BCR-DIFFERENTATIONDEGREE"),

	/**
	 * The '<em><b>CDBVTSAMPLETYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTSAMPLETYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTSAMPLETYPE(63, "CDBVTSAMPLETYPE", "CD-BVT-SAMPLETYPE"),

	/**
	 * The '<em><b>CDBVTLATERALITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTLATERALITY_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTLATERALITY(64, "CDBVTLATERALITY", "CD-BVT-LATERALITY"),

	/**
	 * The '<em><b>CDBVTPATIENTOPPOSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTPATIENTOPPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTPATIENTOPPOSITION(65, "CDBVTPATIENTOPPOSITION", "CD-BVT-PATIENTOPPOSITION"),

	/**
	 * The '<em><b>CDBVTSTATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTSTATUS_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTSTATUS(66, "CDBVTSTATUS", "CD-BVT-STATUS"),

	/**
	 * The '<em><b>CDITEMREG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMREG_VALUE
	 * @generated
	 * @ordered
	 */
	CDITEMREG(67, "CDITEMREG", "CD-ITEM-REG"),

	/**
	 * The '<em><b>CDSTENTDOMINANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSTENTDOMINANCE_VALUE
	 * @generated
	 * @ordered
	 */
	CDSTENTDOMINANCE(68, "CDSTENTDOMINANCE", "CD-STENT-DOMINANCE"),

	/**
	 * The '<em><b>CDSTENTBRIDGETYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSTENTBRIDGETYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDSTENTBRIDGETYPE(69, "CDSTENTBRIDGETYPE", "CD-STENT-BRIDGETYPE"),

	/**
	 * The '<em><b>CDSTENTLESIONTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSTENTLESIONTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDSTENTLESIONTYPE(70, "CDSTENTLESIONTYPE", "CD-STENT-LESIONTYPE"),

	/**
	 * The '<em><b>CDSTENTSEGMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSTENTSEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CDSTENTSEGMENT(71, "CDSTENTSEGMENT", "CD-STENT-SEGMENT"),

	/**
	 * The '<em><b>CDSTENTDEVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSTENTDEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CDSTENTDEVICE(72, "CDSTENTDEVICE", "CD-STENT-DEVICE"),

	/**
	 * The '<em><b>CDTUCOPATHOLOGYTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTUCOPATHOLOGYTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDTUCOPATHOLOGYTYPE(73, "CDTUCOPATHOLOGYTYPE", "CD-TUCO-PATHOLOGYTYPE"),

	/**
	 * The '<em><b>CDTUCOSTEMITYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTUCOSTEMITYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDTUCOSTEMITYPE(74, "CDTUCOSTEMITYPE", "CD-TUCO-STEMITYPE"),

	/**
	 * The '<em><b>CDBALLONDEVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBALLONDEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CDBALLONDEVICE(75, "CDBALLONDEVICE", "CD-BALLON-DEVICE"),

	/**
	 * The '<em><b>CDDISCHARGETYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDISCHARGETYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDDISCHARGETYPE(76, "CDDISCHARGETYPE", "CD-DISCHARGETYPE"),

	/**
	 * The '<em><b>CDREIMBURSEMENTNOMENCLATURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDREIMBURSEMENTNOMENCLATURE_VALUE
	 * @generated
	 * @ordered
	 */
	CDREIMBURSEMENTNOMENCLATURE(77, "CDREIMBURSEMENTNOMENCLATURE", "CD-REIMBURSEMENT-NOMENCLATURE"),

	/**
	 * The '<em><b>IDSTENTDEVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDSTENTDEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	IDSTENTDEVICE(78, "IDSTENTDEVICE", "ID-STENT-DEVICE"),

	/**
	 * The '<em><b>CDORTHOTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHOTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDORTHOTYPE(79, "CDORTHOTYPE", "CD-ORTHO-TYPE"),

	/**
	 * The '<em><b>CDORTHODIAGNOSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHODIAGNOSIS_VALUE
	 * @generated
	 * @ordered
	 */
	CDORTHODIAGNOSIS(80, "CDORTHODIAGNOSIS", "CD-ORTHO-DIAGNOSIS"),

	/**
	 * The '<em><b>CDORTHOAPPROACH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHOAPPROACH_VALUE
	 * @generated
	 * @ordered
	 */
	CDORTHOAPPROACH(81, "CDORTHOAPPROACH", "CD-ORTHO-APPROACH"),

	/**
	 * The '<em><b>CDORTHONAVCOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHONAVCOM_VALUE
	 * @generated
	 * @ordered
	 */
	CDORTHONAVCOM(82, "CDORTHONAVCOM", "CD-ORTHO-NAVCOM"),

	/**
	 * The '<em><b>CDIMPLANTATIONDEVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDIMPLANTATIONDEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CDIMPLANTATIONDEVICE(83, "CDIMPLANTATIONDEVICE", "CD-IMPLANTATION-DEVICE"),

	/**
	 * The '<em><b>CDBEARINGSURFACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBEARINGSURFACE_VALUE
	 * @generated
	 * @ordered
	 */
	CDBEARINGSURFACE(84, "CDBEARINGSURFACE", "CD-BEARING-SURFACE"),

	/**
	 * The '<em><b>CDORTHOGRAFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHOGRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	CDORTHOGRAFT(85, "CDORTHOGRAFT", "CD-ORTHO-GRAFT"),

	/**
	 * The '<em><b>CDORTHOINTERFACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHOINTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	CDORTHOINTERFACE(86, "CDORTHOINTERFACE", "CD-ORTHO-INTERFACE"),

	/**
	 * The '<em><b>CDORTHOTECHREVISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHOTECHREVISION_VALUE
	 * @generated
	 * @ordered
	 */
	CDORTHOTECHREVISION(87, "CDORTHOTECHREVISION", "CD-ORTHO-TECHREVISION"),

	/**
	 * The '<em><b>CDIMPLANTATIONTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDIMPLANTATIONTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDIMPLANTATIONTYPE(88, "CDIMPLANTATIONTYPE", "CD-IMPLANTATION-TYPE"),

	/**
	 * The '<em><b>CDORTHOKNEEINSERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHOKNEEINSERT_VALUE
	 * @generated
	 * @ordered
	 */
	CDORTHOKNEEINSERT(89, "CDORTHOKNEEINSERT", "CD-ORTHO-KNEE-INSERT"),

	/**
	 * The '<em><b>CDREVCOMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDREVCOMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	CDREVCOMPONENT(90, "CDREVCOMPONENT", "CD-REV-COMPONENT"),

	/**
	 * The '<em><b>CDITEMMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMMS_VALUE
	 * @generated
	 * @ordered
	 */
	CDITEMMS(91, "CDITEMMS", "CD-ITEM-MS"),

	/**
	 * The '<em><b>CDEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEAN_VALUE
	 * @generated
	 * @ordered
	 */
	CDEAN(92, "CDEAN", "CD-EAN"),

	/**
	 * The '<em><b>CDMSORIGIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMSORIGIN_VALUE
	 * @generated
	 * @ordered
	 */
	CDMSORIGIN(93, "CDMSORIGIN", "CD-MS-ORIGIN"),

	/**
	 * The '<em><b>CDMSADAPTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMSADAPTATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDMSADAPTATION(94, "CDMSADAPTATION", "CD-MS-ADAPTATION"),

	/**
	 * The '<em><b>CDMSMEDICATIONTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMSMEDICATIONTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDMSMEDICATIONTYPE(95, "CDMSMEDICATIONTYPE", "CD-MS-MEDICATIONTYPE"),

	/**
	 * The '<em><b>CDNIHDI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDNIHDI_VALUE
	 * @generated
	 * @ordered
	 */
	CDNIHDI(96, "CDNIHDI", "CD-NIHDI"),

	/**
	 * The '<em><b>CDSNOMED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSNOMED_VALUE
	 * @generated
	 * @ordered
	 */
	CDSNOMED(97, "CDSNOMED", "CD-SNOMED"),

	/**
	 * The '<em><b>CDDEFIBTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBTYPE(98, "CDDEFIBTYPE", "CD-DEFIB-TYPE"),

	/**
	 * The '<em><b>CDDEFIBARRHYTHMIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBARRHYTHMIA_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBARRHYTHMIA(99, "CDDEFIBARRHYTHMIA", "CD-DEFIB-ARRHYTHMIA"),

	/**
	 * The '<em><b>CDDEFIBSYMPTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBSYMPTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBSYMPTOM(100, "CDDEFIBSYMPTOM", "CD-DEFIB-SYMPTOM"),

	/**
	 * The '<em><b>CDDEFIBAETIOLOGY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBAETIOLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBAETIOLOGY(101, "CDDEFIBAETIOLOGY", "CD-DEFIB-AETIOLOGY"),

	/**
	 * The '<em><b>CDDEFIBANTECEDENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBANTECEDENT_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBANTECEDENT(102, "CDDEFIBANTECEDENT", "CD-DEFIB-ANTECEDENT"),

	/**
	 * The '<em><b>CDDEFIBPARAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBPARAM_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBPARAM(103, "CDDEFIBPARAM", "CD-DEFIB-PARAM"),

	/**
	 * The '<em><b>CDDEFIBMEDICALCARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBMEDICALCARE_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBMEDICALCARE(104, "CDDEFIBMEDICALCARE", "CD-DEFIB-MEDICALCARE"),

	/**
	 * The '<em><b>CDDEFIBAFFECTIONTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBAFFECTIONTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBAFFECTIONTYPE(105, "CDDEFIBAFFECTIONTYPE", "CD-DEFIB-AFFECTIONTYPE"),

	/**
	 * The '<em><b>CDDEFIBRISK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBRISK_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBRISK(106, "CDDEFIBRISK", "CD-DEFIB-RISK"),

	/**
	 * The '<em><b>CDDEFIBINFARCTMOMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBINFARCTMOMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBINFARCTMOMENT(107, "CDDEFIBINFARCTMOMENT", "CD-DEFIB-INFARCTMOMENT"),

	/**
	 * The '<em><b>CDDEFIBREVASCULARISATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBREVASCULARISATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBREVASCULARISATION(108, "CDDEFIBREVASCULARISATION", "CD-DEFIB-REVASCULARISATION"),

	/**
	 * The '<em><b>CDDEFIBDRUGCARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBDRUGCARE_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBDRUGCARE(109, "CDDEFIBDRUGCARE", "CD-DEFIB-DRUGCARE"),

	/**
	 * The '<em><b>CDDEFIBSYNCOPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBSYNCOPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBSYNCOPE(110, "CDDEFIBSYNCOPE", "CD-DEFIB-SYNCOPE"),

	/**
	 * The '<em><b>CDDEFIBCOMPLICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBCOMPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBCOMPLICATION(111, "CDDEFIBCOMPLICATION", "CD-DEFIB-COMPLICATION"),

	/**
	 * The '<em><b>CDDEFIBDIAGNOSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBDIAGNOSIS_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBDIAGNOSIS(112, "CDDEFIBDIAGNOSIS", "CD-DEFIB-DIAGNOSIS"),

	/**
	 * The '<em><b>CDDEFIBCONFIG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBCONFIG_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBCONFIG(113, "CDDEFIBCONFIG", "CD-DEFIB-CONFIG"),

	/**
	 * The '<em><b>CDDEFIBINDICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBINDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBINDICATION(114, "CDDEFIBINDICATION", "CD-DEFIB-INDICATION"),

	/**
	 * The '<em><b>CDDEFIBSURGERY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBSURGERY_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBSURGERY(115, "CDDEFIBSURGERY", "CD-DEFIB-SURGERY"),

	/**
	 * The '<em><b>CDDEFIBREASON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBREASON_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBREASON(116, "CDDEFIBREASON", "CD-DEFIB-REASON"),

	/**
	 * The '<em><b>CDDEFIBFIRM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBFIRM_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBFIRM(117, "CDDEFIBFIRM", "CD-DEFIB-FIRM"),

	/**
	 * The '<em><b>CDDEFIBELECREASON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBELECREASON_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBELECREASON(118, "CDDEFIBELECREASON", "CD-DEFIB-ELEC-REASON"),

	/**
	 * The '<em><b>CDDEFIBMODEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBMODEL_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBMODEL(119, "CDDEFIBMODEL", "CD-DEFIB-MODEL"),

	/**
	 * The '<em><b>CDDEFIBELECTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBELECTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBELECTYPE(120, "CDDEFIBELECTYPE", "CD-DEFIB-ELEC-TYPE"),

	/**
	 * The '<em><b>CDDEFIBRESULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBRESULT_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBRESULT(121, "CDDEFIBRESULT", "CD-DEFIB-RESULT"),

	/**
	 * The '<em><b>CDASASCORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDASASCORE_VALUE
	 * @generated
	 * @ordered
	 */
	CDASASCORE(122, "CDASASCORE", "CD-ASA-SCORE"),

	/**
	 * The '<em><b>CDQERMIDOPERATIONTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDOPERATIONTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDQERMIDOPERATIONTYPE(123, "CDQERMIDOPERATIONTYPE", "CD-QERMID-OPERATIONTYPE"),

	/**
	 * The '<em><b>CDQERMIDALIGNMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDALIGNMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CDQERMIDALIGNMENT(124, "CDQERMIDALIGNMENT", "CD-QERMID-ALIGNMENT"),

	/**
	 * The '<em><b>CDQERMIDCUSTOMINSTRUMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDCUSTOMINSTRUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CDQERMIDCUSTOMINSTRUMENT(125, "CDQERMIDCUSTOMINSTRUMENT", "CD-QERMID-CUSTOMINSTRUMENT"),

	/**
	 * The '<em><b>CDQERMIDORTHOPART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDORTHOPART_VALUE
	 * @generated
	 * @ordered
	 */
	CDQERMIDORTHOPART(126, "CDQERMIDORTHOPART", "CD-QERMID-ORTHOPART"),

	/**
	 * The '<em><b>CDQERMIDSUBSTITUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDSUBSTITUTE_VALUE
	 * @generated
	 * @ordered
	 */
	CDQERMIDSUBSTITUTE(127, "CDQERMIDSUBSTITUTE", "CD-QERMID-SUBSTITUTE"),

	/**
	 * The '<em><b>CDQERMIDMODNECKFRONTALVIEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDMODNECKFRONTALVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	CDQERMIDMODNECKFRONTALVIEW(128, "CDQERMIDMODNECKFRONTALVIEW", "CD-QERMID-MODNECK-FRONTALVIEW"),

	/**
	 * The '<em><b>CDQERMIDMODNECKLATERALVIEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDMODNECKLATERALVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	CDQERMIDMODNECKLATERALVIEW(129, "CDQERMIDMODNECKLATERALVIEW", "CD-QERMID-MODNECK-LATERALVIEW"),

	/**
	 * The '<em><b>CDQERMIDMODNECKOFFSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDMODNECKOFFSET_VALUE
	 * @generated
	 * @ordered
	 */
	CDQERMIDMODNECKOFFSET(130, "CDQERMIDMODNECKOFFSET", "CD-QERMID-MODNECK-OFFSET"),

	/**
	 * The '<em><b>CDQERMIDMATCATEGORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDMATCATEGORY_VALUE
	 * @generated
	 * @ordered
	 */
	CDQERMIDMATCATEGORY(131, "CDQERMIDMATCATEGORY", "CD-QERMID-MAT-CATEGORY"),

	/**
	 * The '<em><b>CDQERMIDMATTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDMATTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDQERMIDMATTYPE(132, "CDQERMIDMATTYPE", "CD-QERMID-MAT-TYPE"),

	/**
	 * The '<em><b>CDQERMIDCEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDCEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CDQERMIDCEMENT(133, "CDQERMIDCEMENT", "CD-QERMID-CEMENT"),

	/**
	 * The '<em><b>CDQERMIDINTERVENTIONSUBTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDINTERVENTIONSUBTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDQERMIDINTERVENTIONSUBTYPE(134, "CDQERMIDINTERVENTIONSUBTYPE", "CD-QERMID-INTERVENTION-SUBTYPE"),

	/**
	 * The '<em><b>CDMYCARENETJUSTIFICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMYCARENETJUSTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDMYCARENETJUSTIFICATION(135, "CDMYCARENETJUSTIFICATION", "CD-MYCARENET-JUSTIFICATION"),

	/**
	 * The '<em><b>CDPMSYMPTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMSYMPTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CDPMSYMPTOM(136, "CDPMSYMPTOM", "CD-PM-SYMPTOM"),

	/**
	 * The '<em><b>CDPMECG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMECG_VALUE
	 * @generated
	 * @ordered
	 */
	CDPMECG(137, "CDPMECG", "CD-PM-ECG"),

	/**
	 * The '<em><b>CDPMAETIOLOGY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMAETIOLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	CDPMAETIOLOGY(138, "CDPMAETIOLOGY", "CD-PM-AETIOLOGY"),

	/**
	 * The '<em><b>CDPMINFOPRIMO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMINFOPRIMO_VALUE
	 * @generated
	 * @ordered
	 */
	CDPMINFOPRIMO(139, "CDPMINFOPRIMO", "CD-PM-INFOPRIMO"),

	/**
	 * The '<em><b>CDPMSTIMULATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMSTIMULATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDPMSTIMULATION(140, "CDPMSTIMULATION", "CD-PM-STIMULATION"),

	/**
	 * The '<em><b>CDPMREASON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMREASON_VALUE
	 * @generated
	 * @ordered
	 */
	CDPMREASON(141, "CDPMREASON", "CD-PM-REASON"),

	/**
	 * The '<em><b>CDPMABROADINDICATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMABROADINDICATOR_VALUE
	 * @generated
	 * @ordered
	 */
	CDPMABROADINDICATOR(142, "CDPMABROADINDICATOR", "CD-PM-ABROAD-INDICATOR"),

	/**
	 * The '<em><b>CDPMELECTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMELECTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDPMELECTYPE(143, "CDPMELECTYPE", "CD-PM-ELEC-TYPE"),

	/**
	 * The '<em><b>CDPMELECREASON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMELECREASON_VALUE
	 * @generated
	 * @ordered
	 */
	CDPMELECREASON(144, "CDPMELECREASON", "CD-PM-ELEC-REASON"),

	/**
	 * The '<em><b>CDPMCARDIOMYOPATHY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMCARDIOMYOPATHY_VALUE
	 * @generated
	 * @ordered
	 */
	CDPMCARDIOMYOPATHY(145, "CDPMCARDIOMYOPATHY", "CD-PM-CARDIOMYOPATHY"),

	/**
	 * The '<em><b>CDPMDISTURBANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMDISTURBANCE_VALUE
	 * @generated
	 * @ordered
	 */
	CDPMDISTURBANCE(146, "CDPMDISTURBANCE", "CD-PM-DISTURBANCE"),

	/**
	 * The '<em><b>CDACTSNURSING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDACTSNURSING_VALUE
	 * @generated
	 * @ordered
	 */
	CDACTSNURSING(147, "CDACTSNURSING", "CD-ACTS-NURSING"),

	/**
	 * The '<em><b>CDPMINDICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMINDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDPMINDICATION(148, "CDPMINDICATION", "CD-PM-INDICATION"),

	/**
	 * The '<em><b>CDTARDISREGISTRATIONTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTARDISREGISTRATIONTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDTARDISREGISTRATIONTYPE(149, "CDTARDISREGISTRATIONTYPE", "CD-TARDIS-REGISTRATIONTYPE"),

	/**
	 * The '<em><b>CDTARDISDIAGNOSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTARDISDIAGNOSIS_VALUE
	 * @generated
	 * @ordered
	 */
	CDTARDISDIAGNOSIS(150, "CDTARDISDIAGNOSIS", "CD-TARDIS-DIAGNOSIS"),

	/**
	 * The '<em><b>CDTARDISDRUG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTARDISDRUG_VALUE
	 * @generated
	 * @ordered
	 */
	CDTARDISDRUG(151, "CDTARDISDRUG", "CD-TARDIS-DRUG"),

	/**
	 * The '<em><b>CDTARDISDRUGENDREASON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTARDISDRUGENDREASON_VALUE
	 * @generated
	 * @ordered
	 */
	CDTARDISDRUGENDREASON(152, "CDTARDISDRUGENDREASON", "CD-TARDIS-DRUG-ENDREASON"),

	/**
	 * The '<em><b>CDTARDISDRUGROUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTARDISDRUGROUTE_VALUE
	 * @generated
	 * @ordered
	 */
	CDTARDISDRUGROUTE(153, "CDTARDISDRUGROUTE", "CD-TARDIS-DRUG-ROUTE"),

	/**
	 * The '<em><b>CDEBIRTHCAESAREANINDICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHCAESAREANINDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDEBIRTHCAESAREANINDICATION(154, "CDEBIRTHCAESAREANINDICATION", "CD-EBIRTH-CAESAREANINDICATION"),

	/**
	 * The '<em><b>CDNIHDIRELATEDSERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDNIHDIRELATEDSERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CDNIHDIRELATEDSERVICE(155, "CDNIHDIRELATEDSERVICE", "CD-NIHDI-RELATEDSERVICE"),

	/**
	 * The '<em><b>CDMYCARENETREFUSAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMYCARENETREFUSAL_VALUE
	 * @generated
	 * @ordered
	 */
	CDMYCARENETREFUSAL(156, "CDMYCARENETREFUSAL", "CD-MYCARENET-REFUSAL"),

	/**
	 * The '<em><b>CDISO3950</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDISO3950_VALUE
	 * @generated
	 * @ordered
	 */
	CDISO3950(157, "CDISO3950", "CD-ISO-3950"),

	/**
	 * The '<em><b>CDTARDISPRODUCTTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTARDISPRODUCTTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDTARDISPRODUCTTYPE(158, "CDTARDISPRODUCTTYPE", "CD-TARDIS-PRODUCT-TYPE"),

	/**
	 * The '<em><b>CDAUTONOMY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDAUTONOMY_VALUE
	 * @generated
	 * @ordered
	 */
	CDAUTONOMY(159, "CDAUTONOMY", "CD-AUTONOMY"),

	/**
	 * The '<em><b>CDCHAPTER4FORMALINTERPRETATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4FORMALINTERPRETATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDCHAPTER4FORMALINTERPRETATION(160, "CDCHAPTER4FORMALINTERPRETATION", "CD-CHAPTER4FORMALINTERPRETATION"),

	/**
	 * The '<em><b>CDPATIENTWILLRES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPATIENTWILLRES_VALUE
	 * @generated
	 * @ordered
	 */
	CDPATIENTWILLRES(161, "CDPATIENTWILLRES", "CD-PATIENTWILL-RES"),

	/**
	 * The '<em><b>CDPATIENTWILLHOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPATIENTWILLHOS_VALUE
	 * @generated
	 * @ordered
	 */
	CDPATIENTWILLHOS(162, "CDPATIENTWILLHOS", "CD-PATIENTWILL-HOS"),

	/**
	 * The '<em><b>CDLEGALREFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDLEGALREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	CDLEGALREFERENCE(163, "CDLEGALREFERENCE", "CD-LEGALREFERENCE"),

	/**
	 * The '<em><b>CDLEGALTEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDLEGALTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	CDLEGALTEXT(164, "CDLEGALTEXT", "CD-LEGALTEXT"),

	/**
	 * The '<em><b>CDFORMALINTERPRETATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDFORMALINTERPRETATION_VALUE
	 * @generated
	 * @ordered
	 */
	CDFORMALINTERPRETATION(165, "CDFORMALINTERPRETATION", "CD-FORMALINTERPRETATION"),

	/**
	 * The '<em><b>CDREIMBURSEMENTTERMPARAMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDREIMBURSEMENTTERMPARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	CDREIMBURSEMENTTERMPARAMETER(166, "CDREIMBURSEMENTTERMPARAMETER", "CD-REIMBURSEMENT-TERM-PARAMETER"),

	/**
	 * The '<em><b>CDREIMBURSEMENTCONTEXTENVIRONMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDREIMBURSEMENTCONTEXTENVIRONMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CDREIMBURSEMENTCONTEXTENVIRONMENT(167, "CDREIMBURSEMENTCONTEXTENVIRONMENT", "CD-REIMBURSEMENT-CONTEXT-ENVIRONMENT");

	/**
	 * The '<em><b>CDLAB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDLAB
	 * @model literal="CD-LAB"
	 * @generated
	 * @ordered
	 */
	public static final int CDLAB_VALUE = 0;

	/**
	 * The '<em><b>CDTECHNICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTECHNICAL
	 * @model literal="CD-TECHNICAL"
	 * @generated
	 * @ordered
	 */
	public static final int CDTECHNICAL_VALUE = 1;

	/**
	 * The '<em><b>CDHCPARTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDHCPARTY
	 * @model literal="CD-HCPARTY"
	 * @generated
	 * @ordered
	 */
	public static final int CDHCPARTY_VALUE = 2;

	/**
	 * The '<em><b>CDDRUGCNK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDRUGCNK
	 * @model literal="CD-DRUG-CNK"
	 * @generated
	 * @ordered
	 */
	public static final int CDDRUGCNK_VALUE = 3;

	/**
	 * The '<em><b>CDENCOUNTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDENCOUNTER
	 * @model literal="CD-ENCOUNTER"
	 * @generated
	 * @ordered
	 */
	public static final int CDENCOUNTER_VALUE = 4;

	/**
	 * The '<em><b>CDMKGADMISSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMKGADMISSION
	 * @model literal="CD-MKG-ADMISSION"
	 * @generated
	 * @ordered
	 */
	public static final int CDMKGADMISSION_VALUE = 5;

	/**
	 * The '<em><b>CDMKGDISCHARGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMKGDISCHARGE
	 * @model literal="CD-MKG-DISCHARGE"
	 * @generated
	 * @ordered
	 */
	public static final int CDMKGDISCHARGE_VALUE = 6;

	/**
	 * The '<em><b>CDMKGORIGIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMKGORIGIN
	 * @model literal="CD-MKG-ORIGIN"
	 * @generated
	 * @ordered
	 */
	public static final int CDMKGORIGIN_VALUE = 7;

	/**
	 * The '<em><b>CDMKGREFERRER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMKGREFERRER
	 * @model literal="CD-MKG-REFERRER"
	 * @generated
	 * @ordered
	 */
	public static final int CDMKGREFERRER_VALUE = 8;

	/**
	 * The '<em><b>CDMKGDESTINATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMKGDESTINATION
	 * @model literal="CD-MKG-DESTINATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDMKGDESTINATION_VALUE = 9;

	/**
	 * The '<em><b>CDLEGALSERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDLEGALSERVICE
	 * @model literal="CD-LEGAL-SERVICE"
	 * @generated
	 * @ordered
	 */
	public static final int CDLEGALSERVICE_VALUE = 10;

	/**
	 * The '<em><b>CDCONTACTPERSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCONTACTPERSON
	 * @model literal="CD-CONTACT-PERSON"
	 * @generated
	 * @ordered
	 */
	public static final int CDCONTACTPERSON_VALUE = 11;

	/**
	 * The '<em><b>CDENCOUNTERTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDENCOUNTERTYPE
	 * @model literal="CD-ENCOUNTER-TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDENCOUNTERTYPE_VALUE = 12;

	/**
	 * The '<em><b>CDCARENETACCIDENTTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETACCIDENTTYPE
	 * @model literal="CD-CARENET-ACCIDENT-TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDCARENETACCIDENTTYPE_VALUE = 13;

	/**
	 * The '<em><b>CDCARENETAGREEMENTTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETAGREEMENTTYPE
	 * @model literal="CD-CARENET-AGREEMENT-TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDCARENETAGREEMENTTYPE_VALUE = 14;

	/**
	 * The '<em><b>CDCARENETSISCARDERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETSISCARDERROR
	 * @model literal="CD-CARENET-SISCARD-ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int CDCARENETSISCARDERROR_VALUE = 15;

	/**
	 * The '<em><b>CDCARENETSOCIALCODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETSOCIALCODE
	 * @model literal="CD-CARENET-SOCIAL-CODE"
	 * @generated
	 * @ordered
	 */
	public static final int CDCARENETSOCIALCODE_VALUE = 16;

	/**
	 * The '<em><b>CDCARENETREFUSALREASON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETREFUSALREASON
	 * @model literal="CD-CARENET-REFUSAL-REASON"
	 * @generated
	 * @ordered
	 */
	public static final int CDCARENETREFUSALREASON_VALUE = 17;

	/**
	 * The '<em><b>CDCARENETNATIONALINSURANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETNATIONALINSURANCE
	 * @model literal="CD-CARENET-NATIONAL-INSURANCE"
	 * @generated
	 * @ordered
	 */
	public static final int CDCARENETNATIONALINSURANCE_VALUE = 18;

	/**
	 * The '<em><b>CDCARENETMESSAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETMESSAGE
	 * @model literal="CD-CARENET-MESSAGE"
	 * @generated
	 * @ordered
	 */
	public static final int CDCARENETMESSAGE_VALUE = 19;

	/**
	 * The '<em><b>CDCARENETMUTATIONINDICATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETMUTATIONINDICATOR
	 * @model literal="CD-CARENET-MUTATION-INDICATOR"
	 * @generated
	 * @ordered
	 */
	public static final int CDCARENETMUTATIONINDICATOR_VALUE = 20;

	/**
	 * The '<em><b>CDCARENETDOCUMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETDOCUMENT
	 * @model literal="CD-CARENET-DOCUMENT"
	 * @generated
	 * @ordered
	 */
	public static final int CDCARENETDOCUMENT_VALUE = 21;

	/**
	 * The '<em><b>CDCARENETINSURANCYSTATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETINSURANCYSTATUS
	 * @model literal="CD-CARENET-INSURANCY-STATUS"
	 * @generated
	 * @ordered
	 */
	public static final int CDCARENETINSURANCYSTATUS_VALUE = 22;

	/**
	 * The '<em><b>CDCARENETTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCARENETTYPE
	 * @model literal="CD-CARENET-TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDCARENETTYPE_VALUE = 23;

	/**
	 * The '<em><b>CDMAATYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMAATYPE
	 * @model literal="CD-MAA-TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDMAATYPE_VALUE = 24;

	/**
	 * The '<em><b>CDMAAREQUESTTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMAAREQUESTTYPE
	 * @model literal="CD-MAA-REQUESTTYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDMAAREQUESTTYPE_VALUE = 25;

	/**
	 * The '<em><b>CDMAARESPONSETYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMAARESPONSETYPE
	 * @model literal="CD-MAA-RESPONSETYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDMAARESPONSETYPE_VALUE = 26;

	/**
	 * The '<em><b>CDMAAREFUSALJUSTIFICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMAAREFUSALJUSTIFICATION
	 * @model literal="CD-MAA-REFUSALJUSTIFICATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDMAAREFUSALJUSTIFICATION_VALUE = 27;

	/**
	 * The '<em><b>CDMAACOVERAGETYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMAACOVERAGETYPE
	 * @model literal="CD-MAA-COVERAGE-TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDMAACOVERAGETYPE_VALUE = 28;

	/**
	 * The '<em><b>CDSITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSITE
	 * @model literal="CD-SITE"
	 * @generated
	 * @ordered
	 */
	public static final int CDSITE_VALUE = 29;

	/**
	 * The '<em><b>CDINCAPACITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDINCAPACITY
	 * @model literal="CD-INCAPACITY"
	 * @generated
	 * @ordered
	 */
	public static final int CDINCAPACITY_VALUE = 30;

	/**
	 * The '<em><b>CDENCOUNTERSAFETYISSUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDENCOUNTERSAFETYISSUE
	 * @model literal="CD-ENCOUNTERSAFETYISSUE"
	 * @generated
	 * @ordered
	 */
	public static final int CDENCOUNTERSAFETYISSUE_VALUE = 31;

	/**
	 * The '<em><b>CDEMERGENCYEVALUATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEMERGENCYEVALUATION
	 * @model literal="CD-EMERGENCYEVALUATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDEMERGENCYEVALUATION_VALUE = 32;

	/**
	 * The '<em><b>ICD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICD_VALUE = 33;

	/**
	 * The '<em><b>ICPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICPC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICPC_VALUE = 34;

	/**
	 * The '<em><b>CDCLINICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCLINICAL
	 * @model literal="CD-CLINICAL"
	 * @generated
	 * @ordered
	 */
	public static final int CDCLINICAL_VALUE = 35;

	/**
	 * The '<em><b>LOCAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 36;

	/**
	 * The '<em><b>CDECAREHAQVALUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDECAREHAQVALUE
	 * @model literal="CD-ECARE-HAQVALUE"
	 * @generated
	 * @ordered
	 */
	public static final int CDECAREHAQVALUE_VALUE = 37;

	/**
	 * The '<em><b>CDEBIRTHPREGNANCYORIGIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHPREGNANCYORIGIN
	 * @model literal="CD-EBIRTH-PREGNANCYORIGIN"
	 * @generated
	 * @ordered
	 */
	public static final int CDEBIRTHPREGNANCYORIGIN_VALUE = 38;

	/**
	 * The '<em><b>CDEBIRTHSPECIALVALUES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHSPECIALVALUES
	 * @model literal="CD-EBIRTH-SPECIALVALUES"
	 * @generated
	 * @ordered
	 */
	public static final int CDEBIRTHSPECIALVALUES_VALUE = 39;

	/**
	 * The '<em><b>CDEBIRTHCHILDPOSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHCHILDPOSITION
	 * @model literal="CD-EBIRTH-CHILDPOSITION"
	 * @generated
	 * @ordered
	 */
	public static final int CDEBIRTHCHILDPOSITION_VALUE = 40;

	/**
	 * The '<em><b>CDEBIRTHFOETALMONITORING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHFOETALMONITORING
	 * @model literal="CD-EBIRTH-FOETALMONITORING"
	 * @generated
	 * @ordered
	 */
	public static final int CDEBIRTHFOETALMONITORING_VALUE = 41;

	/**
	 * The '<em><b>CDEBIRTHDELIVERYWAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHDELIVERYWAY
	 * @model literal="CD-EBIRTH-DELIVERYWAY"
	 * @generated
	 * @ordered
	 */
	public static final int CDEBIRTHDELIVERYWAY_VALUE = 42;

	/**
	 * The '<em><b>CDEBIRTHCAESEREANINDICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHCAESEREANINDICATION
	 * @model literal="CD-EBIRTH-CAESEREANINDICATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDEBIRTHCAESEREANINDICATION_VALUE = 43;

	/**
	 * The '<em><b>CDEBIRTHARTIFICIALRESPIRATIONTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHARTIFICIALRESPIRATIONTYPE
	 * @model literal="CD-EBIRTH-ARTIFICIALRESPIRATIONTYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDEBIRTHARTIFICIALRESPIRATIONTYPE_VALUE = 44;

	/**
	 * The '<em><b>CDEBIRTHNEONATALDEPTTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHNEONATALDEPTTYPE
	 * @model literal="CD-EBIRTH-NEONATALDEPTTYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDEBIRTHNEONATALDEPTTYPE_VALUE = 45;

	/**
	 * The '<em><b>CDEBIRTHCONGENITALMALFORMATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHCONGENITALMALFORMATION
	 * @model literal="CD-EBIRTH-CONGENITALMALFORMATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDEBIRTHCONGENITALMALFORMATION_VALUE = 46;

	/**
	 * The '<em><b>CDVACCINEINDICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDVACCINEINDICATION
	 * @model literal="CD-VACCINEINDICATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDVACCINEINDICATION_VALUE = 47;

	/**
	 * The '<em><b>CDATC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDATC
	 * @model literal="CD-ATC"
	 * @generated
	 * @ordered
	 */
	public static final int CDATC_VALUE = 48;

	/**
	 * The '<em><b>CDCAREPATH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCAREPATH
	 * @model literal="CD-CAREPATH"
	 * @generated
	 * @ordered
	 */
	public static final int CDCAREPATH_VALUE = 49;

	/**
	 * The '<em><b>CDCLINICALPLAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCLINICALPLAN
	 * @model literal="CD-CLINICALPLAN"
	 * @generated
	 * @ordered
	 */
	public static final int CDCLINICALPLAN_VALUE = 50;

	/**
	 * The '<em><b>CDPATIENTWILL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPATIENTWILL
	 * @model literal="CD-PATIENTWILL"
	 * @generated
	 * @ordered
	 */
	public static final int CDPATIENTWILL_VALUE = 51;

	/**
	 * The '<em><b>CDCONSENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCONSENT
	 * @model literal="CD-CONSENT"
	 * @generated
	 * @ordered
	 */
	public static final int CDCONSENT_VALUE = 52;

	/**
	 * The '<em><b>CDCHAPTER4PARAGRAPH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4PARAGRAPH
	 * @model literal="CD-CHAPTER4PARAGRAPH"
	 * @generated
	 * @ordered
	 */
	public static final int CDCHAPTER4PARAGRAPH_VALUE = 53;

	/**
	 * The '<em><b>CDCHAPTER4CATEGORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4CATEGORY
	 * @model literal="CD-CHAPTER4CATEGORY"
	 * @generated
	 * @ordered
	 */
	public static final int CDCHAPTER4CATEGORY_VALUE = 54;

	/**
	 * The '<em><b>CDCHAPTER4CRITERIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4CRITERIA
	 * @model literal="CD-CHAPTER4CRITERIA"
	 * @generated
	 * @ordered
	 */
	public static final int CDCHAPTER4CRITERIA_VALUE = 55;

	/**
	 * The '<em><b>CDCHAPTER4VERSESEQAPPENDIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4VERSESEQAPPENDIX
	 * @model literal="CD-CHAPTER4VERSESEQAPPENDIX"
	 * @generated
	 * @ordered
	 */
	public static final int CDCHAPTER4VERSESEQAPPENDIX_VALUE = 56;

	/**
	 * The '<em><b>CDCHAPTER4DOCUMENTSEQAPPENDIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4DOCUMENTSEQAPPENDIX
	 * @model literal="CD-CHAPTER4DOCUMENTSEQAPPENDIX"
	 * @generated
	 * @ordered
	 */
	public static final int CDCHAPTER4DOCUMENTSEQAPPENDIX_VALUE = 57;

	/**
	 * The '<em><b>CDCHAPTER4VERSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4VERSE
	 * @model literal="CD-CHAPTER4VERSE"
	 * @generated
	 * @ordered
	 */
	public static final int CDCHAPTER4VERSE_VALUE = 58;

	/**
	 * The '<em><b>CDBVTCONSERVATIONMODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTCONSERVATIONMODE
	 * @model literal="CD-BVT-CONSERVATIONMODE"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTCONSERVATIONMODE_VALUE = 59;

	/**
	 * The '<em><b>CDBVTCONSERVATIONDELAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTCONSERVATIONDELAY
	 * @model literal="CD-BVT-CONSERVATIONDELAY"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTCONSERVATIONDELAY_VALUE = 60;

	/**
	 * The '<em><b>CDBVTAVAILABLEMATERIALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTAVAILABLEMATERIALS
	 * @model literal="CD-BVT-AVAILABLEMATERIALS"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTAVAILABLEMATERIALS_VALUE = 61;

	/**
	 * The '<em><b>CDBCRDIFFERENTATIONDEGREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBCRDIFFERENTATIONDEGREE
	 * @model literal="CD-BCR-DIFFERENTATIONDEGREE"
	 * @generated
	 * @ordered
	 */
	public static final int CDBCRDIFFERENTATIONDEGREE_VALUE = 62;

	/**
	 * The '<em><b>CDBVTSAMPLETYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTSAMPLETYPE
	 * @model literal="CD-BVT-SAMPLETYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTSAMPLETYPE_VALUE = 63;

	/**
	 * The '<em><b>CDBVTLATERALITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTLATERALITY
	 * @model literal="CD-BVT-LATERALITY"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTLATERALITY_VALUE = 64;

	/**
	 * The '<em><b>CDBVTPATIENTOPPOSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTPATIENTOPPOSITION
	 * @model literal="CD-BVT-PATIENTOPPOSITION"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTPATIENTOPPOSITION_VALUE = 65;

	/**
	 * The '<em><b>CDBVTSTATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTSTATUS
	 * @model literal="CD-BVT-STATUS"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTSTATUS_VALUE = 66;

	/**
	 * The '<em><b>CDITEMREG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMREG
	 * @model literal="CD-ITEM-REG"
	 * @generated
	 * @ordered
	 */
	public static final int CDITEMREG_VALUE = 67;

	/**
	 * The '<em><b>CDSTENTDOMINANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSTENTDOMINANCE
	 * @model literal="CD-STENT-DOMINANCE"
	 * @generated
	 * @ordered
	 */
	public static final int CDSTENTDOMINANCE_VALUE = 68;

	/**
	 * The '<em><b>CDSTENTBRIDGETYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSTENTBRIDGETYPE
	 * @model literal="CD-STENT-BRIDGETYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDSTENTBRIDGETYPE_VALUE = 69;

	/**
	 * The '<em><b>CDSTENTLESIONTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSTENTLESIONTYPE
	 * @model literal="CD-STENT-LESIONTYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDSTENTLESIONTYPE_VALUE = 70;

	/**
	 * The '<em><b>CDSTENTSEGMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSTENTSEGMENT
	 * @model literal="CD-STENT-SEGMENT"
	 * @generated
	 * @ordered
	 */
	public static final int CDSTENTSEGMENT_VALUE = 71;

	/**
	 * The '<em><b>CDSTENTDEVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSTENTDEVICE
	 * @model literal="CD-STENT-DEVICE"
	 * @generated
	 * @ordered
	 */
	public static final int CDSTENTDEVICE_VALUE = 72;

	/**
	 * The '<em><b>CDTUCOPATHOLOGYTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTUCOPATHOLOGYTYPE
	 * @model literal="CD-TUCO-PATHOLOGYTYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDTUCOPATHOLOGYTYPE_VALUE = 73;

	/**
	 * The '<em><b>CDTUCOSTEMITYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTUCOSTEMITYPE
	 * @model literal="CD-TUCO-STEMITYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDTUCOSTEMITYPE_VALUE = 74;

	/**
	 * The '<em><b>CDBALLONDEVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBALLONDEVICE
	 * @model literal="CD-BALLON-DEVICE"
	 * @generated
	 * @ordered
	 */
	public static final int CDBALLONDEVICE_VALUE = 75;

	/**
	 * The '<em><b>CDDISCHARGETYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDISCHARGETYPE
	 * @model literal="CD-DISCHARGETYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDDISCHARGETYPE_VALUE = 76;

	/**
	 * The '<em><b>CDREIMBURSEMENTNOMENCLATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDREIMBURSEMENTNOMENCLATURE
	 * @model literal="CD-REIMBURSEMENT-NOMENCLATURE"
	 * @generated
	 * @ordered
	 */
	public static final int CDREIMBURSEMENTNOMENCLATURE_VALUE = 77;

	/**
	 * The '<em><b>IDSTENTDEVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDSTENTDEVICE
	 * @model literal="ID-STENT-DEVICE"
	 * @generated
	 * @ordered
	 */
	public static final int IDSTENTDEVICE_VALUE = 78;

	/**
	 * The '<em><b>CDORTHOTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHOTYPE
	 * @model literal="CD-ORTHO-TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDORTHOTYPE_VALUE = 79;

	/**
	 * The '<em><b>CDORTHODIAGNOSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHODIAGNOSIS
	 * @model literal="CD-ORTHO-DIAGNOSIS"
	 * @generated
	 * @ordered
	 */
	public static final int CDORTHODIAGNOSIS_VALUE = 80;

	/**
	 * The '<em><b>CDORTHOAPPROACH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHOAPPROACH
	 * @model literal="CD-ORTHO-APPROACH"
	 * @generated
	 * @ordered
	 */
	public static final int CDORTHOAPPROACH_VALUE = 81;

	/**
	 * The '<em><b>CDORTHONAVCOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHONAVCOM
	 * @model literal="CD-ORTHO-NAVCOM"
	 * @generated
	 * @ordered
	 */
	public static final int CDORTHONAVCOM_VALUE = 82;

	/**
	 * The '<em><b>CDIMPLANTATIONDEVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDIMPLANTATIONDEVICE
	 * @model literal="CD-IMPLANTATION-DEVICE"
	 * @generated
	 * @ordered
	 */
	public static final int CDIMPLANTATIONDEVICE_VALUE = 83;

	/**
	 * The '<em><b>CDBEARINGSURFACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBEARINGSURFACE
	 * @model literal="CD-BEARING-SURFACE"
	 * @generated
	 * @ordered
	 */
	public static final int CDBEARINGSURFACE_VALUE = 84;

	/**
	 * The '<em><b>CDORTHOGRAFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHOGRAFT
	 * @model literal="CD-ORTHO-GRAFT"
	 * @generated
	 * @ordered
	 */
	public static final int CDORTHOGRAFT_VALUE = 85;

	/**
	 * The '<em><b>CDORTHOINTERFACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHOINTERFACE
	 * @model literal="CD-ORTHO-INTERFACE"
	 * @generated
	 * @ordered
	 */
	public static final int CDORTHOINTERFACE_VALUE = 86;

	/**
	 * The '<em><b>CDORTHOTECHREVISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHOTECHREVISION
	 * @model literal="CD-ORTHO-TECHREVISION"
	 * @generated
	 * @ordered
	 */
	public static final int CDORTHOTECHREVISION_VALUE = 87;

	/**
	 * The '<em><b>CDIMPLANTATIONTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDIMPLANTATIONTYPE
	 * @model literal="CD-IMPLANTATION-TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDIMPLANTATIONTYPE_VALUE = 88;

	/**
	 * The '<em><b>CDORTHOKNEEINSERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDORTHOKNEEINSERT
	 * @model literal="CD-ORTHO-KNEE-INSERT"
	 * @generated
	 * @ordered
	 */
	public static final int CDORTHOKNEEINSERT_VALUE = 89;

	/**
	 * The '<em><b>CDREVCOMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDREVCOMPONENT
	 * @model literal="CD-REV-COMPONENT"
	 * @generated
	 * @ordered
	 */
	public static final int CDREVCOMPONENT_VALUE = 90;

	/**
	 * The '<em><b>CDITEMMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMMS
	 * @model literal="CD-ITEM-MS"
	 * @generated
	 * @ordered
	 */
	public static final int CDITEMMS_VALUE = 91;

	/**
	 * The '<em><b>CDEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEAN
	 * @model literal="CD-EAN"
	 * @generated
	 * @ordered
	 */
	public static final int CDEAN_VALUE = 92;

	/**
	 * The '<em><b>CDMSORIGIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMSORIGIN
	 * @model literal="CD-MS-ORIGIN"
	 * @generated
	 * @ordered
	 */
	public static final int CDMSORIGIN_VALUE = 93;

	/**
	 * The '<em><b>CDMSADAPTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMSADAPTATION
	 * @model literal="CD-MS-ADAPTATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDMSADAPTATION_VALUE = 94;

	/**
	 * The '<em><b>CDMSMEDICATIONTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMSMEDICATIONTYPE
	 * @model literal="CD-MS-MEDICATIONTYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDMSMEDICATIONTYPE_VALUE = 95;

	/**
	 * The '<em><b>CDNIHDI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDNIHDI
	 * @model literal="CD-NIHDI"
	 * @generated
	 * @ordered
	 */
	public static final int CDNIHDI_VALUE = 96;

	/**
	 * The '<em><b>CDSNOMED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDSNOMED
	 * @model literal="CD-SNOMED"
	 * @generated
	 * @ordered
	 */
	public static final int CDSNOMED_VALUE = 97;

	/**
	 * The '<em><b>CDDEFIBTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBTYPE
	 * @model literal="CD-DEFIB-TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBTYPE_VALUE = 98;

	/**
	 * The '<em><b>CDDEFIBARRHYTHMIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBARRHYTHMIA
	 * @model literal="CD-DEFIB-ARRHYTHMIA"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBARRHYTHMIA_VALUE = 99;

	/**
	 * The '<em><b>CDDEFIBSYMPTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBSYMPTOM
	 * @model literal="CD-DEFIB-SYMPTOM"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBSYMPTOM_VALUE = 100;

	/**
	 * The '<em><b>CDDEFIBAETIOLOGY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBAETIOLOGY
	 * @model literal="CD-DEFIB-AETIOLOGY"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBAETIOLOGY_VALUE = 101;

	/**
	 * The '<em><b>CDDEFIBANTECEDENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBANTECEDENT
	 * @model literal="CD-DEFIB-ANTECEDENT"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBANTECEDENT_VALUE = 102;

	/**
	 * The '<em><b>CDDEFIBPARAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBPARAM
	 * @model literal="CD-DEFIB-PARAM"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBPARAM_VALUE = 103;

	/**
	 * The '<em><b>CDDEFIBMEDICALCARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBMEDICALCARE
	 * @model literal="CD-DEFIB-MEDICALCARE"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBMEDICALCARE_VALUE = 104;

	/**
	 * The '<em><b>CDDEFIBAFFECTIONTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBAFFECTIONTYPE
	 * @model literal="CD-DEFIB-AFFECTIONTYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBAFFECTIONTYPE_VALUE = 105;

	/**
	 * The '<em><b>CDDEFIBRISK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBRISK
	 * @model literal="CD-DEFIB-RISK"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBRISK_VALUE = 106;

	/**
	 * The '<em><b>CDDEFIBINFARCTMOMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBINFARCTMOMENT
	 * @model literal="CD-DEFIB-INFARCTMOMENT"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBINFARCTMOMENT_VALUE = 107;

	/**
	 * The '<em><b>CDDEFIBREVASCULARISATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBREVASCULARISATION
	 * @model literal="CD-DEFIB-REVASCULARISATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBREVASCULARISATION_VALUE = 108;

	/**
	 * The '<em><b>CDDEFIBDRUGCARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBDRUGCARE
	 * @model literal="CD-DEFIB-DRUGCARE"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBDRUGCARE_VALUE = 109;

	/**
	 * The '<em><b>CDDEFIBSYNCOPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBSYNCOPE
	 * @model literal="CD-DEFIB-SYNCOPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBSYNCOPE_VALUE = 110;

	/**
	 * The '<em><b>CDDEFIBCOMPLICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBCOMPLICATION
	 * @model literal="CD-DEFIB-COMPLICATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBCOMPLICATION_VALUE = 111;

	/**
	 * The '<em><b>CDDEFIBDIAGNOSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBDIAGNOSIS
	 * @model literal="CD-DEFIB-DIAGNOSIS"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBDIAGNOSIS_VALUE = 112;

	/**
	 * The '<em><b>CDDEFIBCONFIG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBCONFIG
	 * @model literal="CD-DEFIB-CONFIG"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBCONFIG_VALUE = 113;

	/**
	 * The '<em><b>CDDEFIBINDICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBINDICATION
	 * @model literal="CD-DEFIB-INDICATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBINDICATION_VALUE = 114;

	/**
	 * The '<em><b>CDDEFIBSURGERY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBSURGERY
	 * @model literal="CD-DEFIB-SURGERY"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBSURGERY_VALUE = 115;

	/**
	 * The '<em><b>CDDEFIBREASON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBREASON
	 * @model literal="CD-DEFIB-REASON"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBREASON_VALUE = 116;

	/**
	 * The '<em><b>CDDEFIBFIRM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBFIRM
	 * @model literal="CD-DEFIB-FIRM"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBFIRM_VALUE = 117;

	/**
	 * The '<em><b>CDDEFIBELECREASON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBELECREASON
	 * @model literal="CD-DEFIB-ELEC-REASON"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBELECREASON_VALUE = 118;

	/**
	 * The '<em><b>CDDEFIBMODEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBMODEL
	 * @model literal="CD-DEFIB-MODEL"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBMODEL_VALUE = 119;

	/**
	 * The '<em><b>CDDEFIBELECTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBELECTYPE
	 * @model literal="CD-DEFIB-ELEC-TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBELECTYPE_VALUE = 120;

	/**
	 * The '<em><b>CDDEFIBRESULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBRESULT
	 * @model literal="CD-DEFIB-RESULT"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBRESULT_VALUE = 121;

	/**
	 * The '<em><b>CDASASCORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDASASCORE
	 * @model literal="CD-ASA-SCORE"
	 * @generated
	 * @ordered
	 */
	public static final int CDASASCORE_VALUE = 122;

	/**
	 * The '<em><b>CDQERMIDOPERATIONTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDOPERATIONTYPE
	 * @model literal="CD-QERMID-OPERATIONTYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDQERMIDOPERATIONTYPE_VALUE = 123;

	/**
	 * The '<em><b>CDQERMIDALIGNMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDALIGNMENT
	 * @model literal="CD-QERMID-ALIGNMENT"
	 * @generated
	 * @ordered
	 */
	public static final int CDQERMIDALIGNMENT_VALUE = 124;

	/**
	 * The '<em><b>CDQERMIDCUSTOMINSTRUMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDCUSTOMINSTRUMENT
	 * @model literal="CD-QERMID-CUSTOMINSTRUMENT"
	 * @generated
	 * @ordered
	 */
	public static final int CDQERMIDCUSTOMINSTRUMENT_VALUE = 125;

	/**
	 * The '<em><b>CDQERMIDORTHOPART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDORTHOPART
	 * @model literal="CD-QERMID-ORTHOPART"
	 * @generated
	 * @ordered
	 */
	public static final int CDQERMIDORTHOPART_VALUE = 126;

	/**
	 * The '<em><b>CDQERMIDSUBSTITUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDSUBSTITUTE
	 * @model literal="CD-QERMID-SUBSTITUTE"
	 * @generated
	 * @ordered
	 */
	public static final int CDQERMIDSUBSTITUTE_VALUE = 127;

	/**
	 * The '<em><b>CDQERMIDMODNECKFRONTALVIEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDMODNECKFRONTALVIEW
	 * @model literal="CD-QERMID-MODNECK-FRONTALVIEW"
	 * @generated
	 * @ordered
	 */
	public static final int CDQERMIDMODNECKFRONTALVIEW_VALUE = 128;

	/**
	 * The '<em><b>CDQERMIDMODNECKLATERALVIEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDMODNECKLATERALVIEW
	 * @model literal="CD-QERMID-MODNECK-LATERALVIEW"
	 * @generated
	 * @ordered
	 */
	public static final int CDQERMIDMODNECKLATERALVIEW_VALUE = 129;

	/**
	 * The '<em><b>CDQERMIDMODNECKOFFSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDMODNECKOFFSET
	 * @model literal="CD-QERMID-MODNECK-OFFSET"
	 * @generated
	 * @ordered
	 */
	public static final int CDQERMIDMODNECKOFFSET_VALUE = 130;

	/**
	 * The '<em><b>CDQERMIDMATCATEGORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDMATCATEGORY
	 * @model literal="CD-QERMID-MAT-CATEGORY"
	 * @generated
	 * @ordered
	 */
	public static final int CDQERMIDMATCATEGORY_VALUE = 131;

	/**
	 * The '<em><b>CDQERMIDMATTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDMATTYPE
	 * @model literal="CD-QERMID-MAT-TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDQERMIDMATTYPE_VALUE = 132;

	/**
	 * The '<em><b>CDQERMIDCEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDCEMENT
	 * @model literal="CD-QERMID-CEMENT"
	 * @generated
	 * @ordered
	 */
	public static final int CDQERMIDCEMENT_VALUE = 133;

	/**
	 * The '<em><b>CDQERMIDINTERVENTIONSUBTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDINTERVENTIONSUBTYPE
	 * @model literal="CD-QERMID-INTERVENTION-SUBTYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDQERMIDINTERVENTIONSUBTYPE_VALUE = 134;

	/**
	 * The '<em><b>CDMYCARENETJUSTIFICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMYCARENETJUSTIFICATION
	 * @model literal="CD-MYCARENET-JUSTIFICATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDMYCARENETJUSTIFICATION_VALUE = 135;

	/**
	 * The '<em><b>CDPMSYMPTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMSYMPTOM
	 * @model literal="CD-PM-SYMPTOM"
	 * @generated
	 * @ordered
	 */
	public static final int CDPMSYMPTOM_VALUE = 136;

	/**
	 * The '<em><b>CDPMECG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMECG
	 * @model literal="CD-PM-ECG"
	 * @generated
	 * @ordered
	 */
	public static final int CDPMECG_VALUE = 137;

	/**
	 * The '<em><b>CDPMAETIOLOGY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMAETIOLOGY
	 * @model literal="CD-PM-AETIOLOGY"
	 * @generated
	 * @ordered
	 */
	public static final int CDPMAETIOLOGY_VALUE = 138;

	/**
	 * The '<em><b>CDPMINFOPRIMO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMINFOPRIMO
	 * @model literal="CD-PM-INFOPRIMO"
	 * @generated
	 * @ordered
	 */
	public static final int CDPMINFOPRIMO_VALUE = 139;

	/**
	 * The '<em><b>CDPMSTIMULATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMSTIMULATION
	 * @model literal="CD-PM-STIMULATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDPMSTIMULATION_VALUE = 140;

	/**
	 * The '<em><b>CDPMREASON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMREASON
	 * @model literal="CD-PM-REASON"
	 * @generated
	 * @ordered
	 */
	public static final int CDPMREASON_VALUE = 141;

	/**
	 * The '<em><b>CDPMABROADINDICATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMABROADINDICATOR
	 * @model literal="CD-PM-ABROAD-INDICATOR"
	 * @generated
	 * @ordered
	 */
	public static final int CDPMABROADINDICATOR_VALUE = 142;

	/**
	 * The '<em><b>CDPMELECTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMELECTYPE
	 * @model literal="CD-PM-ELEC-TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDPMELECTYPE_VALUE = 143;

	/**
	 * The '<em><b>CDPMELECREASON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMELECREASON
	 * @model literal="CD-PM-ELEC-REASON"
	 * @generated
	 * @ordered
	 */
	public static final int CDPMELECREASON_VALUE = 144;

	/**
	 * The '<em><b>CDPMCARDIOMYOPATHY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMCARDIOMYOPATHY
	 * @model literal="CD-PM-CARDIOMYOPATHY"
	 * @generated
	 * @ordered
	 */
	public static final int CDPMCARDIOMYOPATHY_VALUE = 145;

	/**
	 * The '<em><b>CDPMDISTURBANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMDISTURBANCE
	 * @model literal="CD-PM-DISTURBANCE"
	 * @generated
	 * @ordered
	 */
	public static final int CDPMDISTURBANCE_VALUE = 146;

	/**
	 * The '<em><b>CDACTSNURSING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDACTSNURSING
	 * @model literal="CD-ACTS-NURSING"
	 * @generated
	 * @ordered
	 */
	public static final int CDACTSNURSING_VALUE = 147;

	/**
	 * The '<em><b>CDPMINDICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPMINDICATION
	 * @model literal="CD-PM-INDICATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDPMINDICATION_VALUE = 148;

	/**
	 * The '<em><b>CDTARDISREGISTRATIONTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTARDISREGISTRATIONTYPE
	 * @model literal="CD-TARDIS-REGISTRATIONTYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDTARDISREGISTRATIONTYPE_VALUE = 149;

	/**
	 * The '<em><b>CDTARDISDIAGNOSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTARDISDIAGNOSIS
	 * @model literal="CD-TARDIS-DIAGNOSIS"
	 * @generated
	 * @ordered
	 */
	public static final int CDTARDISDIAGNOSIS_VALUE = 150;

	/**
	 * The '<em><b>CDTARDISDRUG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTARDISDRUG
	 * @model literal="CD-TARDIS-DRUG"
	 * @generated
	 * @ordered
	 */
	public static final int CDTARDISDRUG_VALUE = 151;

	/**
	 * The '<em><b>CDTARDISDRUGENDREASON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTARDISDRUGENDREASON
	 * @model literal="CD-TARDIS-DRUG-ENDREASON"
	 * @generated
	 * @ordered
	 */
	public static final int CDTARDISDRUGENDREASON_VALUE = 152;

	/**
	 * The '<em><b>CDTARDISDRUGROUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTARDISDRUGROUTE
	 * @model literal="CD-TARDIS-DRUG-ROUTE"
	 * @generated
	 * @ordered
	 */
	public static final int CDTARDISDRUGROUTE_VALUE = 153;

	/**
	 * The '<em><b>CDEBIRTHCAESAREANINDICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDEBIRTHCAESAREANINDICATION
	 * @model literal="CD-EBIRTH-CAESAREANINDICATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDEBIRTHCAESAREANINDICATION_VALUE = 154;

	/**
	 * The '<em><b>CDNIHDIRELATEDSERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDNIHDIRELATEDSERVICE
	 * @model literal="CD-NIHDI-RELATEDSERVICE"
	 * @generated
	 * @ordered
	 */
	public static final int CDNIHDIRELATEDSERVICE_VALUE = 155;

	/**
	 * The '<em><b>CDMYCARENETREFUSAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDMYCARENETREFUSAL
	 * @model literal="CD-MYCARENET-REFUSAL"
	 * @generated
	 * @ordered
	 */
	public static final int CDMYCARENETREFUSAL_VALUE = 156;

	/**
	 * The '<em><b>CDISO3950</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDISO3950
	 * @model literal="CD-ISO-3950"
	 * @generated
	 * @ordered
	 */
	public static final int CDISO3950_VALUE = 157;

	/**
	 * The '<em><b>CDTARDISPRODUCTTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTARDISPRODUCTTYPE
	 * @model literal="CD-TARDIS-PRODUCT-TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDTARDISPRODUCTTYPE_VALUE = 158;

	/**
	 * The '<em><b>CDAUTONOMY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDAUTONOMY
	 * @model literal="CD-AUTONOMY"
	 * @generated
	 * @ordered
	 */
	public static final int CDAUTONOMY_VALUE = 159;

	/**
	 * The '<em><b>CDCHAPTER4FORMALINTERPRETATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCHAPTER4FORMALINTERPRETATION
	 * @model literal="CD-CHAPTER4FORMALINTERPRETATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDCHAPTER4FORMALINTERPRETATION_VALUE = 160;

	/**
	 * The '<em><b>CDPATIENTWILLRES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPATIENTWILLRES
	 * @model literal="CD-PATIENTWILL-RES"
	 * @generated
	 * @ordered
	 */
	public static final int CDPATIENTWILLRES_VALUE = 161;

	/**
	 * The '<em><b>CDPATIENTWILLHOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPATIENTWILLHOS
	 * @model literal="CD-PATIENTWILL-HOS"
	 * @generated
	 * @ordered
	 */
	public static final int CDPATIENTWILLHOS_VALUE = 162;

	/**
	 * The '<em><b>CDLEGALREFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDLEGALREFERENCE
	 * @model literal="CD-LEGALREFERENCE"
	 * @generated
	 * @ordered
	 */
	public static final int CDLEGALREFERENCE_VALUE = 163;

	/**
	 * The '<em><b>CDLEGALTEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDLEGALTEXT
	 * @model literal="CD-LEGALTEXT"
	 * @generated
	 * @ordered
	 */
	public static final int CDLEGALTEXT_VALUE = 164;

	/**
	 * The '<em><b>CDFORMALINTERPRETATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDFORMALINTERPRETATION
	 * @model literal="CD-FORMALINTERPRETATION"
	 * @generated
	 * @ordered
	 */
	public static final int CDFORMALINTERPRETATION_VALUE = 165;

	/**
	 * The '<em><b>CDREIMBURSEMENTTERMPARAMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDREIMBURSEMENTTERMPARAMETER
	 * @model literal="CD-REIMBURSEMENT-TERM-PARAMETER"
	 * @generated
	 * @ordered
	 */
	public static final int CDREIMBURSEMENTTERMPARAMETER_VALUE = 166;

	/**
	 * The '<em><b>CDREIMBURSEMENTCONTEXTENVIRONMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDREIMBURSEMENTCONTEXTENVIRONMENT
	 * @model literal="CD-REIMBURSEMENT-CONTEXT-ENVIRONMENT"
	 * @generated
	 * @ordered
	 */
	public static final int CDREIMBURSEMENTCONTEXTENVIRONMENT_VALUE = 167;

	/**
	 * An array of all the '<em><b>CDCONTEN Tschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDCONTENTschemes[] VALUES_ARRAY =
		new CDCONTENTschemes[] {
			CDLAB,
			CDTECHNICAL,
			CDHCPARTY,
			CDDRUGCNK,
			CDENCOUNTER,
			CDMKGADMISSION,
			CDMKGDISCHARGE,
			CDMKGORIGIN,
			CDMKGREFERRER,
			CDMKGDESTINATION,
			CDLEGALSERVICE,
			CDCONTACTPERSON,
			CDENCOUNTERTYPE,
			CDCARENETACCIDENTTYPE,
			CDCARENETAGREEMENTTYPE,
			CDCARENETSISCARDERROR,
			CDCARENETSOCIALCODE,
			CDCARENETREFUSALREASON,
			CDCARENETNATIONALINSURANCE,
			CDCARENETMESSAGE,
			CDCARENETMUTATIONINDICATOR,
			CDCARENETDOCUMENT,
			CDCARENETINSURANCYSTATUS,
			CDCARENETTYPE,
			CDMAATYPE,
			CDMAAREQUESTTYPE,
			CDMAARESPONSETYPE,
			CDMAAREFUSALJUSTIFICATION,
			CDMAACOVERAGETYPE,
			CDSITE,
			CDINCAPACITY,
			CDENCOUNTERSAFETYISSUE,
			CDEMERGENCYEVALUATION,
			ICD,
			ICPC,
			CDCLINICAL,
			LOCAL,
			CDECAREHAQVALUE,
			CDEBIRTHPREGNANCYORIGIN,
			CDEBIRTHSPECIALVALUES,
			CDEBIRTHCHILDPOSITION,
			CDEBIRTHFOETALMONITORING,
			CDEBIRTHDELIVERYWAY,
			CDEBIRTHCAESEREANINDICATION,
			CDEBIRTHARTIFICIALRESPIRATIONTYPE,
			CDEBIRTHNEONATALDEPTTYPE,
			CDEBIRTHCONGENITALMALFORMATION,
			CDVACCINEINDICATION,
			CDATC,
			CDCAREPATH,
			CDCLINICALPLAN,
			CDPATIENTWILL,
			CDCONSENT,
			CDCHAPTER4PARAGRAPH,
			CDCHAPTER4CATEGORY,
			CDCHAPTER4CRITERIA,
			CDCHAPTER4VERSESEQAPPENDIX,
			CDCHAPTER4DOCUMENTSEQAPPENDIX,
			CDCHAPTER4VERSE,
			CDBVTCONSERVATIONMODE,
			CDBVTCONSERVATIONDELAY,
			CDBVTAVAILABLEMATERIALS,
			CDBCRDIFFERENTATIONDEGREE,
			CDBVTSAMPLETYPE,
			CDBVTLATERALITY,
			CDBVTPATIENTOPPOSITION,
			CDBVTSTATUS,
			CDITEMREG,
			CDSTENTDOMINANCE,
			CDSTENTBRIDGETYPE,
			CDSTENTLESIONTYPE,
			CDSTENTSEGMENT,
			CDSTENTDEVICE,
			CDTUCOPATHOLOGYTYPE,
			CDTUCOSTEMITYPE,
			CDBALLONDEVICE,
			CDDISCHARGETYPE,
			CDREIMBURSEMENTNOMENCLATURE,
			IDSTENTDEVICE,
			CDORTHOTYPE,
			CDORTHODIAGNOSIS,
			CDORTHOAPPROACH,
			CDORTHONAVCOM,
			CDIMPLANTATIONDEVICE,
			CDBEARINGSURFACE,
			CDORTHOGRAFT,
			CDORTHOINTERFACE,
			CDORTHOTECHREVISION,
			CDIMPLANTATIONTYPE,
			CDORTHOKNEEINSERT,
			CDREVCOMPONENT,
			CDITEMMS,
			CDEAN,
			CDMSORIGIN,
			CDMSADAPTATION,
			CDMSMEDICATIONTYPE,
			CDNIHDI,
			CDSNOMED,
			CDDEFIBTYPE,
			CDDEFIBARRHYTHMIA,
			CDDEFIBSYMPTOM,
			CDDEFIBAETIOLOGY,
			CDDEFIBANTECEDENT,
			CDDEFIBPARAM,
			CDDEFIBMEDICALCARE,
			CDDEFIBAFFECTIONTYPE,
			CDDEFIBRISK,
			CDDEFIBINFARCTMOMENT,
			CDDEFIBREVASCULARISATION,
			CDDEFIBDRUGCARE,
			CDDEFIBSYNCOPE,
			CDDEFIBCOMPLICATION,
			CDDEFIBDIAGNOSIS,
			CDDEFIBCONFIG,
			CDDEFIBINDICATION,
			CDDEFIBSURGERY,
			CDDEFIBREASON,
			CDDEFIBFIRM,
			CDDEFIBELECREASON,
			CDDEFIBMODEL,
			CDDEFIBELECTYPE,
			CDDEFIBRESULT,
			CDASASCORE,
			CDQERMIDOPERATIONTYPE,
			CDQERMIDALIGNMENT,
			CDQERMIDCUSTOMINSTRUMENT,
			CDQERMIDORTHOPART,
			CDQERMIDSUBSTITUTE,
			CDQERMIDMODNECKFRONTALVIEW,
			CDQERMIDMODNECKLATERALVIEW,
			CDQERMIDMODNECKOFFSET,
			CDQERMIDMATCATEGORY,
			CDQERMIDMATTYPE,
			CDQERMIDCEMENT,
			CDQERMIDINTERVENTIONSUBTYPE,
			CDMYCARENETJUSTIFICATION,
			CDPMSYMPTOM,
			CDPMECG,
			CDPMAETIOLOGY,
			CDPMINFOPRIMO,
			CDPMSTIMULATION,
			CDPMREASON,
			CDPMABROADINDICATOR,
			CDPMELECTYPE,
			CDPMELECREASON,
			CDPMCARDIOMYOPATHY,
			CDPMDISTURBANCE,
			CDACTSNURSING,
			CDPMINDICATION,
			CDTARDISREGISTRATIONTYPE,
			CDTARDISDIAGNOSIS,
			CDTARDISDRUG,
			CDTARDISDRUGENDREASON,
			CDTARDISDRUGROUTE,
			CDEBIRTHCAESAREANINDICATION,
			CDNIHDIRELATEDSERVICE,
			CDMYCARENETREFUSAL,
			CDISO3950,
			CDTARDISPRODUCTTYPE,
			CDAUTONOMY,
			CDCHAPTER4FORMALINTERPRETATION,
			CDPATIENTWILLRES,
			CDPATIENTWILLHOS,
			CDLEGALREFERENCE,
			CDLEGALTEXT,
			CDFORMALINTERPRETATION,
			CDREIMBURSEMENTTERMPARAMETER,
			CDREIMBURSEMENTCONTEXTENVIRONMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>CDCONTEN Tschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDCONTENTschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDCONTEN Tschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCONTENTschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCONTENTschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCONTEN Tschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCONTENTschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDCONTENTschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDCONTEN Tschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDCONTENTschemes get(int value) {
		switch (value) {
			case CDLAB_VALUE: return CDLAB;
			case CDTECHNICAL_VALUE: return CDTECHNICAL;
			case CDHCPARTY_VALUE: return CDHCPARTY;
			case CDDRUGCNK_VALUE: return CDDRUGCNK;
			case CDENCOUNTER_VALUE: return CDENCOUNTER;
			case CDMKGADMISSION_VALUE: return CDMKGADMISSION;
			case CDMKGDISCHARGE_VALUE: return CDMKGDISCHARGE;
			case CDMKGORIGIN_VALUE: return CDMKGORIGIN;
			case CDMKGREFERRER_VALUE: return CDMKGREFERRER;
			case CDMKGDESTINATION_VALUE: return CDMKGDESTINATION;
			case CDLEGALSERVICE_VALUE: return CDLEGALSERVICE;
			case CDCONTACTPERSON_VALUE: return CDCONTACTPERSON;
			case CDENCOUNTERTYPE_VALUE: return CDENCOUNTERTYPE;
			case CDCARENETACCIDENTTYPE_VALUE: return CDCARENETACCIDENTTYPE;
			case CDCARENETAGREEMENTTYPE_VALUE: return CDCARENETAGREEMENTTYPE;
			case CDCARENETSISCARDERROR_VALUE: return CDCARENETSISCARDERROR;
			case CDCARENETSOCIALCODE_VALUE: return CDCARENETSOCIALCODE;
			case CDCARENETREFUSALREASON_VALUE: return CDCARENETREFUSALREASON;
			case CDCARENETNATIONALINSURANCE_VALUE: return CDCARENETNATIONALINSURANCE;
			case CDCARENETMESSAGE_VALUE: return CDCARENETMESSAGE;
			case CDCARENETMUTATIONINDICATOR_VALUE: return CDCARENETMUTATIONINDICATOR;
			case CDCARENETDOCUMENT_VALUE: return CDCARENETDOCUMENT;
			case CDCARENETINSURANCYSTATUS_VALUE: return CDCARENETINSURANCYSTATUS;
			case CDCARENETTYPE_VALUE: return CDCARENETTYPE;
			case CDMAATYPE_VALUE: return CDMAATYPE;
			case CDMAAREQUESTTYPE_VALUE: return CDMAAREQUESTTYPE;
			case CDMAARESPONSETYPE_VALUE: return CDMAARESPONSETYPE;
			case CDMAAREFUSALJUSTIFICATION_VALUE: return CDMAAREFUSALJUSTIFICATION;
			case CDMAACOVERAGETYPE_VALUE: return CDMAACOVERAGETYPE;
			case CDSITE_VALUE: return CDSITE;
			case CDINCAPACITY_VALUE: return CDINCAPACITY;
			case CDENCOUNTERSAFETYISSUE_VALUE: return CDENCOUNTERSAFETYISSUE;
			case CDEMERGENCYEVALUATION_VALUE: return CDEMERGENCYEVALUATION;
			case ICD_VALUE: return ICD;
			case ICPC_VALUE: return ICPC;
			case CDCLINICAL_VALUE: return CDCLINICAL;
			case LOCAL_VALUE: return LOCAL;
			case CDECAREHAQVALUE_VALUE: return CDECAREHAQVALUE;
			case CDEBIRTHPREGNANCYORIGIN_VALUE: return CDEBIRTHPREGNANCYORIGIN;
			case CDEBIRTHSPECIALVALUES_VALUE: return CDEBIRTHSPECIALVALUES;
			case CDEBIRTHCHILDPOSITION_VALUE: return CDEBIRTHCHILDPOSITION;
			case CDEBIRTHFOETALMONITORING_VALUE: return CDEBIRTHFOETALMONITORING;
			case CDEBIRTHDELIVERYWAY_VALUE: return CDEBIRTHDELIVERYWAY;
			case CDEBIRTHCAESEREANINDICATION_VALUE: return CDEBIRTHCAESEREANINDICATION;
			case CDEBIRTHARTIFICIALRESPIRATIONTYPE_VALUE: return CDEBIRTHARTIFICIALRESPIRATIONTYPE;
			case CDEBIRTHNEONATALDEPTTYPE_VALUE: return CDEBIRTHNEONATALDEPTTYPE;
			case CDEBIRTHCONGENITALMALFORMATION_VALUE: return CDEBIRTHCONGENITALMALFORMATION;
			case CDVACCINEINDICATION_VALUE: return CDVACCINEINDICATION;
			case CDATC_VALUE: return CDATC;
			case CDCAREPATH_VALUE: return CDCAREPATH;
			case CDCLINICALPLAN_VALUE: return CDCLINICALPLAN;
			case CDPATIENTWILL_VALUE: return CDPATIENTWILL;
			case CDCONSENT_VALUE: return CDCONSENT;
			case CDCHAPTER4PARAGRAPH_VALUE: return CDCHAPTER4PARAGRAPH;
			case CDCHAPTER4CATEGORY_VALUE: return CDCHAPTER4CATEGORY;
			case CDCHAPTER4CRITERIA_VALUE: return CDCHAPTER4CRITERIA;
			case CDCHAPTER4VERSESEQAPPENDIX_VALUE: return CDCHAPTER4VERSESEQAPPENDIX;
			case CDCHAPTER4DOCUMENTSEQAPPENDIX_VALUE: return CDCHAPTER4DOCUMENTSEQAPPENDIX;
			case CDCHAPTER4VERSE_VALUE: return CDCHAPTER4VERSE;
			case CDBVTCONSERVATIONMODE_VALUE: return CDBVTCONSERVATIONMODE;
			case CDBVTCONSERVATIONDELAY_VALUE: return CDBVTCONSERVATIONDELAY;
			case CDBVTAVAILABLEMATERIALS_VALUE: return CDBVTAVAILABLEMATERIALS;
			case CDBCRDIFFERENTATIONDEGREE_VALUE: return CDBCRDIFFERENTATIONDEGREE;
			case CDBVTSAMPLETYPE_VALUE: return CDBVTSAMPLETYPE;
			case CDBVTLATERALITY_VALUE: return CDBVTLATERALITY;
			case CDBVTPATIENTOPPOSITION_VALUE: return CDBVTPATIENTOPPOSITION;
			case CDBVTSTATUS_VALUE: return CDBVTSTATUS;
			case CDITEMREG_VALUE: return CDITEMREG;
			case CDSTENTDOMINANCE_VALUE: return CDSTENTDOMINANCE;
			case CDSTENTBRIDGETYPE_VALUE: return CDSTENTBRIDGETYPE;
			case CDSTENTLESIONTYPE_VALUE: return CDSTENTLESIONTYPE;
			case CDSTENTSEGMENT_VALUE: return CDSTENTSEGMENT;
			case CDSTENTDEVICE_VALUE: return CDSTENTDEVICE;
			case CDTUCOPATHOLOGYTYPE_VALUE: return CDTUCOPATHOLOGYTYPE;
			case CDTUCOSTEMITYPE_VALUE: return CDTUCOSTEMITYPE;
			case CDBALLONDEVICE_VALUE: return CDBALLONDEVICE;
			case CDDISCHARGETYPE_VALUE: return CDDISCHARGETYPE;
			case CDREIMBURSEMENTNOMENCLATURE_VALUE: return CDREIMBURSEMENTNOMENCLATURE;
			case IDSTENTDEVICE_VALUE: return IDSTENTDEVICE;
			case CDORTHOTYPE_VALUE: return CDORTHOTYPE;
			case CDORTHODIAGNOSIS_VALUE: return CDORTHODIAGNOSIS;
			case CDORTHOAPPROACH_VALUE: return CDORTHOAPPROACH;
			case CDORTHONAVCOM_VALUE: return CDORTHONAVCOM;
			case CDIMPLANTATIONDEVICE_VALUE: return CDIMPLANTATIONDEVICE;
			case CDBEARINGSURFACE_VALUE: return CDBEARINGSURFACE;
			case CDORTHOGRAFT_VALUE: return CDORTHOGRAFT;
			case CDORTHOINTERFACE_VALUE: return CDORTHOINTERFACE;
			case CDORTHOTECHREVISION_VALUE: return CDORTHOTECHREVISION;
			case CDIMPLANTATIONTYPE_VALUE: return CDIMPLANTATIONTYPE;
			case CDORTHOKNEEINSERT_VALUE: return CDORTHOKNEEINSERT;
			case CDREVCOMPONENT_VALUE: return CDREVCOMPONENT;
			case CDITEMMS_VALUE: return CDITEMMS;
			case CDEAN_VALUE: return CDEAN;
			case CDMSORIGIN_VALUE: return CDMSORIGIN;
			case CDMSADAPTATION_VALUE: return CDMSADAPTATION;
			case CDMSMEDICATIONTYPE_VALUE: return CDMSMEDICATIONTYPE;
			case CDNIHDI_VALUE: return CDNIHDI;
			case CDSNOMED_VALUE: return CDSNOMED;
			case CDDEFIBTYPE_VALUE: return CDDEFIBTYPE;
			case CDDEFIBARRHYTHMIA_VALUE: return CDDEFIBARRHYTHMIA;
			case CDDEFIBSYMPTOM_VALUE: return CDDEFIBSYMPTOM;
			case CDDEFIBAETIOLOGY_VALUE: return CDDEFIBAETIOLOGY;
			case CDDEFIBANTECEDENT_VALUE: return CDDEFIBANTECEDENT;
			case CDDEFIBPARAM_VALUE: return CDDEFIBPARAM;
			case CDDEFIBMEDICALCARE_VALUE: return CDDEFIBMEDICALCARE;
			case CDDEFIBAFFECTIONTYPE_VALUE: return CDDEFIBAFFECTIONTYPE;
			case CDDEFIBRISK_VALUE: return CDDEFIBRISK;
			case CDDEFIBINFARCTMOMENT_VALUE: return CDDEFIBINFARCTMOMENT;
			case CDDEFIBREVASCULARISATION_VALUE: return CDDEFIBREVASCULARISATION;
			case CDDEFIBDRUGCARE_VALUE: return CDDEFIBDRUGCARE;
			case CDDEFIBSYNCOPE_VALUE: return CDDEFIBSYNCOPE;
			case CDDEFIBCOMPLICATION_VALUE: return CDDEFIBCOMPLICATION;
			case CDDEFIBDIAGNOSIS_VALUE: return CDDEFIBDIAGNOSIS;
			case CDDEFIBCONFIG_VALUE: return CDDEFIBCONFIG;
			case CDDEFIBINDICATION_VALUE: return CDDEFIBINDICATION;
			case CDDEFIBSURGERY_VALUE: return CDDEFIBSURGERY;
			case CDDEFIBREASON_VALUE: return CDDEFIBREASON;
			case CDDEFIBFIRM_VALUE: return CDDEFIBFIRM;
			case CDDEFIBELECREASON_VALUE: return CDDEFIBELECREASON;
			case CDDEFIBMODEL_VALUE: return CDDEFIBMODEL;
			case CDDEFIBELECTYPE_VALUE: return CDDEFIBELECTYPE;
			case CDDEFIBRESULT_VALUE: return CDDEFIBRESULT;
			case CDASASCORE_VALUE: return CDASASCORE;
			case CDQERMIDOPERATIONTYPE_VALUE: return CDQERMIDOPERATIONTYPE;
			case CDQERMIDALIGNMENT_VALUE: return CDQERMIDALIGNMENT;
			case CDQERMIDCUSTOMINSTRUMENT_VALUE: return CDQERMIDCUSTOMINSTRUMENT;
			case CDQERMIDORTHOPART_VALUE: return CDQERMIDORTHOPART;
			case CDQERMIDSUBSTITUTE_VALUE: return CDQERMIDSUBSTITUTE;
			case CDQERMIDMODNECKFRONTALVIEW_VALUE: return CDQERMIDMODNECKFRONTALVIEW;
			case CDQERMIDMODNECKLATERALVIEW_VALUE: return CDQERMIDMODNECKLATERALVIEW;
			case CDQERMIDMODNECKOFFSET_VALUE: return CDQERMIDMODNECKOFFSET;
			case CDQERMIDMATCATEGORY_VALUE: return CDQERMIDMATCATEGORY;
			case CDQERMIDMATTYPE_VALUE: return CDQERMIDMATTYPE;
			case CDQERMIDCEMENT_VALUE: return CDQERMIDCEMENT;
			case CDQERMIDINTERVENTIONSUBTYPE_VALUE: return CDQERMIDINTERVENTIONSUBTYPE;
			case CDMYCARENETJUSTIFICATION_VALUE: return CDMYCARENETJUSTIFICATION;
			case CDPMSYMPTOM_VALUE: return CDPMSYMPTOM;
			case CDPMECG_VALUE: return CDPMECG;
			case CDPMAETIOLOGY_VALUE: return CDPMAETIOLOGY;
			case CDPMINFOPRIMO_VALUE: return CDPMINFOPRIMO;
			case CDPMSTIMULATION_VALUE: return CDPMSTIMULATION;
			case CDPMREASON_VALUE: return CDPMREASON;
			case CDPMABROADINDICATOR_VALUE: return CDPMABROADINDICATOR;
			case CDPMELECTYPE_VALUE: return CDPMELECTYPE;
			case CDPMELECREASON_VALUE: return CDPMELECREASON;
			case CDPMCARDIOMYOPATHY_VALUE: return CDPMCARDIOMYOPATHY;
			case CDPMDISTURBANCE_VALUE: return CDPMDISTURBANCE;
			case CDACTSNURSING_VALUE: return CDACTSNURSING;
			case CDPMINDICATION_VALUE: return CDPMINDICATION;
			case CDTARDISREGISTRATIONTYPE_VALUE: return CDTARDISREGISTRATIONTYPE;
			case CDTARDISDIAGNOSIS_VALUE: return CDTARDISDIAGNOSIS;
			case CDTARDISDRUG_VALUE: return CDTARDISDRUG;
			case CDTARDISDRUGENDREASON_VALUE: return CDTARDISDRUGENDREASON;
			case CDTARDISDRUGROUTE_VALUE: return CDTARDISDRUGROUTE;
			case CDEBIRTHCAESAREANINDICATION_VALUE: return CDEBIRTHCAESAREANINDICATION;
			case CDNIHDIRELATEDSERVICE_VALUE: return CDNIHDIRELATEDSERVICE;
			case CDMYCARENETREFUSAL_VALUE: return CDMYCARENETREFUSAL;
			case CDISO3950_VALUE: return CDISO3950;
			case CDTARDISPRODUCTTYPE_VALUE: return CDTARDISPRODUCTTYPE;
			case CDAUTONOMY_VALUE: return CDAUTONOMY;
			case CDCHAPTER4FORMALINTERPRETATION_VALUE: return CDCHAPTER4FORMALINTERPRETATION;
			case CDPATIENTWILLRES_VALUE: return CDPATIENTWILLRES;
			case CDPATIENTWILLHOS_VALUE: return CDPATIENTWILLHOS;
			case CDLEGALREFERENCE_VALUE: return CDLEGALREFERENCE;
			case CDLEGALTEXT_VALUE: return CDLEGALTEXT;
			case CDFORMALINTERPRETATION_VALUE: return CDFORMALINTERPRETATION;
			case CDREIMBURSEMENTTERMPARAMETER_VALUE: return CDREIMBURSEMENTTERMPARAMETER;
			case CDREIMBURSEMENTCONTEXTENVIRONMENT_VALUE: return CDREIMBURSEMENTCONTEXTENVIRONMENT;
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
	private CDCONTENTschemes(int value, String name, String literal) {
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
	
} //CDCONTENTschemes
