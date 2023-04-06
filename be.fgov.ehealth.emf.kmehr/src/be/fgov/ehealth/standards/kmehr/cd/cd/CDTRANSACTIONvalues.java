/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDTRANSACTIO Nvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDTRANSACTIONvalues()
 * @model extendedMetaData="name='CD-TRANSACTIONvalues'"
 * @generated
 */
public enum CDTRANSACTIONvalues implements Enumerator {
	/**
	 * The '<em><b>Admission</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMISSION_VALUE
	 * @generated
	 * @ordered
	 */
	ADMISSION(0, "admission", "admission"),

	/**
	 * The '<em><b>Alert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALERT_VALUE
	 * @generated
	 * @ordered
	 */
	ALERT(1, "alert", "alert"),

	/**
	 * The '<em><b>Contactreport</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACTREPORT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACTREPORT(2, "contactreport", "contactreport"),

	/**
	 * The '<em><b>Death</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEATH_VALUE
	 * @generated
	 * @ordered
	 */
	DEATH(3, "death", "death"),

	/**
	 * The '<em><b>Discharge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCHARGE_VALUE
	 * @generated
	 * @ordered
	 */
	DISCHARGE(4, "discharge", "discharge"),

	/**
	 * The '<em><b>Dischargereport</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCHARGEREPORT_VALUE
	 * @generated
	 * @ordered
	 */
	DISCHARGEREPORT(5, "dischargereport", "dischargereport"),

	/**
	 * The '<em><b>Epidemiology</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPIDEMIOLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	EPIDEMIOLOGY(6, "epidemiology", "epidemiology"),

	/**
	 * The '<em><b>Labrequest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABREQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	LABREQUEST(7, "labrequest", "labrequest"),

	/**
	 * The '<em><b>Labresult</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABRESULT_VALUE
	 * @generated
	 * @ordered
	 */
	LABRESULT(8, "labresult", "labresult"),

	/**
	 * The '<em><b>Note</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTE(9, "note", "note"),

	/**
	 * The '<em><b>Hospitalpharmaceuticalprescription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSPITALPHARMACEUTICALPRESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	HOSPITALPHARMACEUTICALPRESCRIPTION(10, "hospitalpharmaceuticalprescription", "hospitalpharmaceuticalprescription"),

	/**
	 * The '<em><b>Pharmaceuticalprescription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACEUTICALPRESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACEUTICALPRESCRIPTION(11, "pharmaceuticalprescription", "pharmaceuticalprescription"),

	/**
	 * The '<em><b>Productdelivery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCTDELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCTDELIVERY(12, "productdelivery", "productdelivery"),

	/**
	 * The '<em><b>Quickdischargereport</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUICKDISCHARGEREPORT_VALUE
	 * @generated
	 * @ordered
	 */
	QUICKDISCHARGEREPORT(13, "quickdischargereport", "quickdischargereport"),

	/**
	 * The '<em><b>Referral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERRAL_VALUE
	 * @generated
	 * @ordered
	 */
	REFERRAL(14, "referral", "referral"),

	/**
	 * The '<em><b>Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST(15, "request", "request"),

	/**
	 * The '<em><b>Result</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESULT_VALUE
	 * @generated
	 * @ordered
	 */
	RESULT(16, "result", "result"),

	/**
	 * The '<em><b>Vaccination</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VACCINATION_VALUE
	 * @generated
	 * @ordered
	 */
	VACCINATION(17, "vaccination", "vaccination"),

	/**
	 * The '<em><b>Sumehr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUMEHR_VALUE
	 * @generated
	 * @ordered
	 */
	SUMEHR(18, "sumehr", "sumehr"),

	/**
	 * The '<em><b>Ecare Safe Consultation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECARE_SAFE_CONSULTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ECARE_SAFE_CONSULTATION(19, "ecareSafeConsultation", "ecare-safe-consultation"),

	/**
	 * The '<em><b>Ebirth Mother Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBIRTH_MOTHER_NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	EBIRTH_MOTHER_NOTIFICATION(20, "ebirthMotherNotification", "ebirth-mother-notification"),

	/**
	 * The '<em><b>Ebirth Baby Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBIRTH_BABY_NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	EBIRTH_BABY_NOTIFICATION(21, "ebirthBabyNotification", "ebirth-baby-notification"),

	/**
	 * The '<em><b>Ebirth Baby Medicalform</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBIRTH_BABY_MEDICALFORM_VALUE
	 * @generated
	 * @ordered
	 */
	EBIRTH_BABY_MEDICALFORM(22, "ebirthBabyMedicalform", "ebirth-baby-medicalform"),

	/**
	 * The '<em><b>Ebirth Mother Medicalform</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBIRTH_MOTHER_MEDICALFORM_VALUE
	 * @generated
	 * @ordered
	 */
	EBIRTH_MOTHER_MEDICALFORM(23, "ebirthMotherMedicalform", "ebirth-mother-medicalform"),

	/**
	 * The '<em><b>Clinicalsummary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICALSUMMARY_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICALSUMMARY(24, "clinicalsummary", "clinicalsummary"),

	/**
	 * The '<em><b>Medicaladvisoragreement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICALADVISORAGREEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICALADVISORAGREEMENT(25, "medicaladvisoragreement", "medicaladvisoragreement"),

	/**
	 * The '<em><b>Bvt Sample</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BVT_SAMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	BVT_SAMPLE(26, "bvtSample", "bvt-sample"),

	/**
	 * The '<em><b>Clinicalpath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICALPATH_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICALPATH(27, "clinicalpath", "clinicalpath"),

	/**
	 * The '<em><b>Telemonitoring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELEMONITORING_VALUE
	 * @generated
	 * @ordered
	 */
	TELEMONITORING(28, "telemonitoring", "telemonitoring"),

	/**
	 * The '<em><b>Radiationexposuremonitoring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIATIONEXPOSUREMONITORING_VALUE
	 * @generated
	 * @ordered
	 */
	RADIATIONEXPOSUREMONITORING(29, "radiationexposuremonitoring", "radiationexposuremonitoring"),

	/**
	 * The '<em><b>Intervention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVENTION(30, "intervention", "intervention"),

	/**
	 * The '<em><b>Medicationschemeelement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATIONSCHEMEELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATIONSCHEMEELEMENT(31, "medicationschemeelement", "medicationschemeelement"),

	/**
	 * The '<em><b>Treatmentsuspension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENTSUSPENSION_VALUE
	 * @generated
	 * @ordered
	 */
	TREATMENTSUSPENSION(32, "treatmentsuspension", "treatmentsuspension"),

	/**
	 * The '<em><b>Prescription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION(33, "prescription", "prescription"),

	/**
	 * The '<em><b>Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	NOTIFICATION(34, "notification", "notification"),

	/**
	 * The '<em><b>Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	REPORT(35, "report", "report"),

	/**
	 * The '<em><b>Medicationscheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATIONSCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATIONSCHEME(36, "medicationscheme", "medicationscheme"),

	/**
	 * The '<em><b>Vaccinationscheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VACCINATIONSCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	VACCINATIONSCHEME(37, "vaccinationscheme", "vaccinationscheme"),

	/**
	 * The '<em><b>Vaccinationschemeelement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VACCINATIONSCHEMEELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	VACCINATIONSCHEMEELEMENT(38, "vaccinationschemeelement", "vaccinationschemeelement"),

	/**
	 * The '<em><b>Ecare Tardis Consultation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECARE_TARDIS_CONSULTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ECARE_TARDIS_CONSULTATION(39, "ecareTardisConsultation", "ecare-tardis-consultation"),

	/**
	 * The '<em><b>Genericregistryentry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERICREGISTRYENTRY_VALUE
	 * @generated
	 * @ordered
	 */
	GENERICREGISTRYENTRY(40, "genericregistryentry", "genericregistryentry"),

	/**
	 * The '<em><b>Population Based Screening</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POPULATION_BASED_SCREENING_VALUE
	 * @generated
	 * @ordered
	 */
	POPULATION_BASED_SCREENING(41, "populationBasedScreening", "population-based-screening"),

	/**
	 * The '<em><b>Child Prevention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_PREVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD_PREVENTION(42, "childPrevention", "child-prevention"),

	/**
	 * The '<em><b>Careplan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAREPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	CAREPLAN(43, "careplan", "careplan"),

	/**
	 * The '<em><b>Applicationlink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATIONLINK_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATIONLINK(44, "applicationlink", "applicationlink"),

	/**
	 * The '<em><b>Diarynote</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIARYNOTE_VALUE
	 * @generated
	 * @ordered
	 */
	DIARYNOTE(45, "diarynote", "diarynote"),

	/**
	 * The '<em><b>Mea</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEA_VALUE
	 * @generated
	 * @ordered
	 */
	MEA(46, "mea", "mea"),

	/**
	 * The '<em><b>Perinatal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERINATAL_VALUE
	 * @generated
	 * @ordered
	 */
	PERINATAL(47, "perinatal", "perinatal"),

	/**
	 * The '<em><b>Belrai Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELRAI_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	BELRAI_REPORT(48, "belraiReport", "belrai-report"),

	/**
	 * The '<em><b>Nursingsummaryreport</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NURSINGSUMMARYREPORT_VALUE
	 * @generated
	 * @ordered
	 */
	NURSINGSUMMARYREPORT(49, "nursingsummaryreport", "nursingsummaryreport"),

	/**
	 * The '<em><b>Pharmaceuticalmedicationscheme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACEUTICALMEDICATIONSCHEME_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACEUTICALMEDICATIONSCHEME(50, "pharmaceuticalmedicationscheme", "pharmaceuticalmedicationscheme");

	/**
	 * The '<em><b>Admission</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMISSION
	 * @model name="admission"
	 * @generated
	 * @ordered
	 */
	public static final int ADMISSION_VALUE = 0;

	/**
	 * The '<em><b>Alert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALERT
	 * @model name="alert"
	 * @generated
	 * @ordered
	 */
	public static final int ALERT_VALUE = 1;

	/**
	 * The '<em><b>Contactreport</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACTREPORT
	 * @model name="contactreport"
	 * @generated
	 * @ordered
	 */
	public static final int CONTACTREPORT_VALUE = 2;

	/**
	 * The '<em><b>Death</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEATH
	 * @model name="death"
	 * @generated
	 * @ordered
	 */
	public static final int DEATH_VALUE = 3;

	/**
	 * The '<em><b>Discharge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCHARGE
	 * @model name="discharge"
	 * @generated
	 * @ordered
	 */
	public static final int DISCHARGE_VALUE = 4;

	/**
	 * The '<em><b>Dischargereport</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCHARGEREPORT
	 * @model name="dischargereport"
	 * @generated
	 * @ordered
	 */
	public static final int DISCHARGEREPORT_VALUE = 5;

	/**
	 * The '<em><b>Epidemiology</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPIDEMIOLOGY
	 * @model name="epidemiology"
	 * @generated
	 * @ordered
	 */
	public static final int EPIDEMIOLOGY_VALUE = 6;

	/**
	 * The '<em><b>Labrequest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABREQUEST
	 * @model name="labrequest"
	 * @generated
	 * @ordered
	 */
	public static final int LABREQUEST_VALUE = 7;

	/**
	 * The '<em><b>Labresult</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABRESULT
	 * @model name="labresult"
	 * @generated
	 * @ordered
	 */
	public static final int LABRESULT_VALUE = 8;

	/**
	 * The '<em><b>Note</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTE
	 * @model name="note"
	 * @generated
	 * @ordered
	 */
	public static final int NOTE_VALUE = 9;

	/**
	 * The '<em><b>Hospitalpharmaceuticalprescription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSPITALPHARMACEUTICALPRESCRIPTION
	 * @model name="hospitalpharmaceuticalprescription"
	 * @generated
	 * @ordered
	 */
	public static final int HOSPITALPHARMACEUTICALPRESCRIPTION_VALUE = 10;

	/**
	 * The '<em><b>Pharmaceuticalprescription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACEUTICALPRESCRIPTION
	 * @model name="pharmaceuticalprescription"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACEUTICALPRESCRIPTION_VALUE = 11;

	/**
	 * The '<em><b>Productdelivery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCTDELIVERY
	 * @model name="productdelivery"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCTDELIVERY_VALUE = 12;

	/**
	 * The '<em><b>Quickdischargereport</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUICKDISCHARGEREPORT
	 * @model name="quickdischargereport"
	 * @generated
	 * @ordered
	 */
	public static final int QUICKDISCHARGEREPORT_VALUE = 13;

	/**
	 * The '<em><b>Referral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERRAL
	 * @model name="referral"
	 * @generated
	 * @ordered
	 */
	public static final int REFERRAL_VALUE = 14;

	/**
	 * The '<em><b>Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST
	 * @model name="request"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_VALUE = 15;

	/**
	 * The '<em><b>Result</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESULT
	 * @model name="result"
	 * @generated
	 * @ordered
	 */
	public static final int RESULT_VALUE = 16;

	/**
	 * The '<em><b>Vaccination</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VACCINATION
	 * @model name="vaccination"
	 * @generated
	 * @ordered
	 */
	public static final int VACCINATION_VALUE = 17;

	/**
	 * The '<em><b>Sumehr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUMEHR
	 * @model name="sumehr"
	 * @generated
	 * @ordered
	 */
	public static final int SUMEHR_VALUE = 18;

	/**
	 * The '<em><b>Ecare Safe Consultation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECARE_SAFE_CONSULTATION
	 * @model name="ecareSafeConsultation" literal="ecare-safe-consultation"
	 * @generated
	 * @ordered
	 */
	public static final int ECARE_SAFE_CONSULTATION_VALUE = 19;

	/**
	 * The '<em><b>Ebirth Mother Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBIRTH_MOTHER_NOTIFICATION
	 * @model name="ebirthMotherNotification" literal="ebirth-mother-notification"
	 * @generated
	 * @ordered
	 */
	public static final int EBIRTH_MOTHER_NOTIFICATION_VALUE = 20;

	/**
	 * The '<em><b>Ebirth Baby Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBIRTH_BABY_NOTIFICATION
	 * @model name="ebirthBabyNotification" literal="ebirth-baby-notification"
	 * @generated
	 * @ordered
	 */
	public static final int EBIRTH_BABY_NOTIFICATION_VALUE = 21;

	/**
	 * The '<em><b>Ebirth Baby Medicalform</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBIRTH_BABY_MEDICALFORM
	 * @model name="ebirthBabyMedicalform" literal="ebirth-baby-medicalform"
	 * @generated
	 * @ordered
	 */
	public static final int EBIRTH_BABY_MEDICALFORM_VALUE = 22;

	/**
	 * The '<em><b>Ebirth Mother Medicalform</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBIRTH_MOTHER_MEDICALFORM
	 * @model name="ebirthMotherMedicalform" literal="ebirth-mother-medicalform"
	 * @generated
	 * @ordered
	 */
	public static final int EBIRTH_MOTHER_MEDICALFORM_VALUE = 23;

	/**
	 * The '<em><b>Clinicalsummary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICALSUMMARY
	 * @model name="clinicalsummary"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICALSUMMARY_VALUE = 24;

	/**
	 * The '<em><b>Medicaladvisoragreement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICALADVISORAGREEMENT
	 * @model name="medicaladvisoragreement"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICALADVISORAGREEMENT_VALUE = 25;

	/**
	 * The '<em><b>Bvt Sample</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BVT_SAMPLE
	 * @model name="bvtSample" literal="bvt-sample"
	 * @generated
	 * @ordered
	 */
	public static final int BVT_SAMPLE_VALUE = 26;

	/**
	 * The '<em><b>Clinicalpath</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICALPATH
	 * @model name="clinicalpath"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICALPATH_VALUE = 27;

	/**
	 * The '<em><b>Telemonitoring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELEMONITORING
	 * @model name="telemonitoring"
	 * @generated
	 * @ordered
	 */
	public static final int TELEMONITORING_VALUE = 28;

	/**
	 * The '<em><b>Radiationexposuremonitoring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIATIONEXPOSUREMONITORING
	 * @model name="radiationexposuremonitoring"
	 * @generated
	 * @ordered
	 */
	public static final int RADIATIONEXPOSUREMONITORING_VALUE = 29;

	/**
	 * The '<em><b>Intervention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVENTION
	 * @model name="intervention"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVENTION_VALUE = 30;

	/**
	 * The '<em><b>Medicationschemeelement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATIONSCHEMEELEMENT
	 * @model name="medicationschemeelement"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATIONSCHEMEELEMENT_VALUE = 31;

	/**
	 * The '<em><b>Treatmentsuspension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENTSUSPENSION
	 * @model name="treatmentsuspension"
	 * @generated
	 * @ordered
	 */
	public static final int TREATMENTSUSPENSION_VALUE = 32;

	/**
	 * The '<em><b>Prescription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION
	 * @model name="prescription"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTION_VALUE = 33;

	/**
	 * The '<em><b>Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATION
	 * @model name="notification"
	 * @generated
	 * @ordered
	 */
	public static final int NOTIFICATION_VALUE = 34;

	/**
	 * The '<em><b>Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT
	 * @model name="report"
	 * @generated
	 * @ordered
	 */
	public static final int REPORT_VALUE = 35;

	/**
	 * The '<em><b>Medicationscheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATIONSCHEME
	 * @model name="medicationscheme"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATIONSCHEME_VALUE = 36;

	/**
	 * The '<em><b>Vaccinationscheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VACCINATIONSCHEME
	 * @model name="vaccinationscheme"
	 * @generated
	 * @ordered
	 */
	public static final int VACCINATIONSCHEME_VALUE = 37;

	/**
	 * The '<em><b>Vaccinationschemeelement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VACCINATIONSCHEMEELEMENT
	 * @model name="vaccinationschemeelement"
	 * @generated
	 * @ordered
	 */
	public static final int VACCINATIONSCHEMEELEMENT_VALUE = 38;

	/**
	 * The '<em><b>Ecare Tardis Consultation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECARE_TARDIS_CONSULTATION
	 * @model name="ecareTardisConsultation" literal="ecare-tardis-consultation"
	 * @generated
	 * @ordered
	 */
	public static final int ECARE_TARDIS_CONSULTATION_VALUE = 39;

	/**
	 * The '<em><b>Genericregistryentry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERICREGISTRYENTRY
	 * @model name="genericregistryentry"
	 * @generated
	 * @ordered
	 */
	public static final int GENERICREGISTRYENTRY_VALUE = 40;

	/**
	 * The '<em><b>Population Based Screening</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POPULATION_BASED_SCREENING
	 * @model name="populationBasedScreening" literal="population-based-screening"
	 * @generated
	 * @ordered
	 */
	public static final int POPULATION_BASED_SCREENING_VALUE = 41;

	/**
	 * The '<em><b>Child Prevention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_PREVENTION
	 * @model name="childPrevention" literal="child-prevention"
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_PREVENTION_VALUE = 42;

	/**
	 * The '<em><b>Careplan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAREPLAN
	 * @model name="careplan"
	 * @generated
	 * @ordered
	 */
	public static final int CAREPLAN_VALUE = 43;

	/**
	 * The '<em><b>Applicationlink</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATIONLINK
	 * @model name="applicationlink"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATIONLINK_VALUE = 44;

	/**
	 * The '<em><b>Diarynote</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIARYNOTE
	 * @model name="diarynote"
	 * @generated
	 * @ordered
	 */
	public static final int DIARYNOTE_VALUE = 45;

	/**
	 * The '<em><b>Mea</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEA
	 * @model name="mea"
	 * @generated
	 * @ordered
	 */
	public static final int MEA_VALUE = 46;

	/**
	 * The '<em><b>Perinatal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERINATAL
	 * @model name="perinatal"
	 * @generated
	 * @ordered
	 */
	public static final int PERINATAL_VALUE = 47;

	/**
	 * The '<em><b>Belrai Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELRAI_REPORT
	 * @model name="belraiReport" literal="belrai-report"
	 * @generated
	 * @ordered
	 */
	public static final int BELRAI_REPORT_VALUE = 48;

	/**
	 * The '<em><b>Nursingsummaryreport</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NURSINGSUMMARYREPORT
	 * @model name="nursingsummaryreport"
	 * @generated
	 * @ordered
	 */
	public static final int NURSINGSUMMARYREPORT_VALUE = 49;

	/**
	 * The '<em><b>Pharmaceuticalmedicationscheme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACEUTICALMEDICATIONSCHEME
	 * @model name="pharmaceuticalmedicationscheme"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACEUTICALMEDICATIONSCHEME_VALUE = 50;

	/**
	 * An array of all the '<em><b>CDTRANSACTIO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDTRANSACTIONvalues[] VALUES_ARRAY =
		new CDTRANSACTIONvalues[] {
			ADMISSION,
			ALERT,
			CONTACTREPORT,
			DEATH,
			DISCHARGE,
			DISCHARGEREPORT,
			EPIDEMIOLOGY,
			LABREQUEST,
			LABRESULT,
			NOTE,
			HOSPITALPHARMACEUTICALPRESCRIPTION,
			PHARMACEUTICALPRESCRIPTION,
			PRODUCTDELIVERY,
			QUICKDISCHARGEREPORT,
			REFERRAL,
			REQUEST,
			RESULT,
			VACCINATION,
			SUMEHR,
			ECARE_SAFE_CONSULTATION,
			EBIRTH_MOTHER_NOTIFICATION,
			EBIRTH_BABY_NOTIFICATION,
			EBIRTH_BABY_MEDICALFORM,
			EBIRTH_MOTHER_MEDICALFORM,
			CLINICALSUMMARY,
			MEDICALADVISORAGREEMENT,
			BVT_SAMPLE,
			CLINICALPATH,
			TELEMONITORING,
			RADIATIONEXPOSUREMONITORING,
			INTERVENTION,
			MEDICATIONSCHEMEELEMENT,
			TREATMENTSUSPENSION,
			PRESCRIPTION,
			NOTIFICATION,
			REPORT,
			MEDICATIONSCHEME,
			VACCINATIONSCHEME,
			VACCINATIONSCHEMEELEMENT,
			ECARE_TARDIS_CONSULTATION,
			GENERICREGISTRYENTRY,
			POPULATION_BASED_SCREENING,
			CHILD_PREVENTION,
			CAREPLAN,
			APPLICATIONLINK,
			DIARYNOTE,
			MEA,
			PERINATAL,
			BELRAI_REPORT,
			NURSINGSUMMARYREPORT,
			PHARMACEUTICALMEDICATIONSCHEME,
		};

	/**
	 * A public read-only list of all the '<em><b>CDTRANSACTIO Nvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDTRANSACTIONvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDTRANSACTIO Nvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDTRANSACTIONvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDTRANSACTIO Nvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDTRANSACTIONvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDTRANSACTIO Nvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDTRANSACTIONvalues get(int value) {
		switch (value) {
			case ADMISSION_VALUE: return ADMISSION;
			case ALERT_VALUE: return ALERT;
			case CONTACTREPORT_VALUE: return CONTACTREPORT;
			case DEATH_VALUE: return DEATH;
			case DISCHARGE_VALUE: return DISCHARGE;
			case DISCHARGEREPORT_VALUE: return DISCHARGEREPORT;
			case EPIDEMIOLOGY_VALUE: return EPIDEMIOLOGY;
			case LABREQUEST_VALUE: return LABREQUEST;
			case LABRESULT_VALUE: return LABRESULT;
			case NOTE_VALUE: return NOTE;
			case HOSPITALPHARMACEUTICALPRESCRIPTION_VALUE: return HOSPITALPHARMACEUTICALPRESCRIPTION;
			case PHARMACEUTICALPRESCRIPTION_VALUE: return PHARMACEUTICALPRESCRIPTION;
			case PRODUCTDELIVERY_VALUE: return PRODUCTDELIVERY;
			case QUICKDISCHARGEREPORT_VALUE: return QUICKDISCHARGEREPORT;
			case REFERRAL_VALUE: return REFERRAL;
			case REQUEST_VALUE: return REQUEST;
			case RESULT_VALUE: return RESULT;
			case VACCINATION_VALUE: return VACCINATION;
			case SUMEHR_VALUE: return SUMEHR;
			case ECARE_SAFE_CONSULTATION_VALUE: return ECARE_SAFE_CONSULTATION;
			case EBIRTH_MOTHER_NOTIFICATION_VALUE: return EBIRTH_MOTHER_NOTIFICATION;
			case EBIRTH_BABY_NOTIFICATION_VALUE: return EBIRTH_BABY_NOTIFICATION;
			case EBIRTH_BABY_MEDICALFORM_VALUE: return EBIRTH_BABY_MEDICALFORM;
			case EBIRTH_MOTHER_MEDICALFORM_VALUE: return EBIRTH_MOTHER_MEDICALFORM;
			case CLINICALSUMMARY_VALUE: return CLINICALSUMMARY;
			case MEDICALADVISORAGREEMENT_VALUE: return MEDICALADVISORAGREEMENT;
			case BVT_SAMPLE_VALUE: return BVT_SAMPLE;
			case CLINICALPATH_VALUE: return CLINICALPATH;
			case TELEMONITORING_VALUE: return TELEMONITORING;
			case RADIATIONEXPOSUREMONITORING_VALUE: return RADIATIONEXPOSUREMONITORING;
			case INTERVENTION_VALUE: return INTERVENTION;
			case MEDICATIONSCHEMEELEMENT_VALUE: return MEDICATIONSCHEMEELEMENT;
			case TREATMENTSUSPENSION_VALUE: return TREATMENTSUSPENSION;
			case PRESCRIPTION_VALUE: return PRESCRIPTION;
			case NOTIFICATION_VALUE: return NOTIFICATION;
			case REPORT_VALUE: return REPORT;
			case MEDICATIONSCHEME_VALUE: return MEDICATIONSCHEME;
			case VACCINATIONSCHEME_VALUE: return VACCINATIONSCHEME;
			case VACCINATIONSCHEMEELEMENT_VALUE: return VACCINATIONSCHEMEELEMENT;
			case ECARE_TARDIS_CONSULTATION_VALUE: return ECARE_TARDIS_CONSULTATION;
			case GENERICREGISTRYENTRY_VALUE: return GENERICREGISTRYENTRY;
			case POPULATION_BASED_SCREENING_VALUE: return POPULATION_BASED_SCREENING;
			case CHILD_PREVENTION_VALUE: return CHILD_PREVENTION;
			case CAREPLAN_VALUE: return CAREPLAN;
			case APPLICATIONLINK_VALUE: return APPLICATIONLINK;
			case DIARYNOTE_VALUE: return DIARYNOTE;
			case MEA_VALUE: return MEA;
			case PERINATAL_VALUE: return PERINATAL;
			case BELRAI_REPORT_VALUE: return BELRAI_REPORT;
			case NURSINGSUMMARYREPORT_VALUE: return NURSINGSUMMARYREPORT;
			case PHARMACEUTICALMEDICATIONSCHEME_VALUE: return PHARMACEUTICALMEDICATIONSCHEME;
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
	private CDTRANSACTIONvalues(int value, String name, String literal) {
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
	
} //CDTRANSACTIONvalues
