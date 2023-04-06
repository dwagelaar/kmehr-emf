/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CdFactory;
import be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage;

import be.fgov.ehealth.standards.kmehr.dt.dt.DtPackage;

import be.fgov.ehealth.standards.kmehr.dt.dt.impl.DtPackageImpl;

import be.fgov.ehealth.standards.kmehr.id.id.IdPackage;

import be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2000._09.xmldsig.XmldsigPackage;

import org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl;

import org.w3._2001._04.xmlenc.XmlencPackage;

import org.w3._2001._04.xmlenc.impl.XmlencPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CdPackageImpl extends EPackageImpl implements CdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "cd.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdaccessrightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdacknowledgmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdactsnursingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdaddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdadministrationunitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdatcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdautonomyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdballondeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdbcrdifferentationdegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdbearingsurfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdbvtavailablematerialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdbvtconservationdelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdbvtconservationmodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdbvtlateralityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdbvtpatientoppositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdbvtsampletypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdbvtstatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcarenetaccidenttypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcarenetagreementtypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcarenetdocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcarenetinsurancystatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcarenetmessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcarenetmutationindicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcarenetnationalinsuranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcarenetpersonalpartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcarenetrefusalreasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcarenetsiscarderrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcarenetthirdpayercontractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcarenettypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcarepathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcertaintyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdchapter4CATEGORYEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdchapter4CRITERIAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdchapter4DOCUMENTSEQAPPENDIXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdchapter4FORMALINTERPRETATIONEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdchapter4PARAGRAPHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdchapter4VERSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdchapter4VERSESEQAPPENDIXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcivilstateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdclinicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdclinicalplanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdconsentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcontactpersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcontentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcountryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdcurrencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cddayperiodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cddischargetypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cddrugcnkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cddrugpresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cddrugrouteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdebirthartificialrespirationtypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdebirthcaesareanindicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdebirthchildpositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdebirthcongenitalmalformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdebirthdeliverywayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdebirthfoetalmonitoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdebirthneonataldepttypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdebirthplaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdebirthpregnancyoriginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdebirthspecialvaluesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdecgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdemergencyevaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdemploymentsituationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdencounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdencountersafetyissueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdencryptionactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdencryptionmethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cderrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cderrormycarenetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdexternalsourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdformularyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdgalenicformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdhcpartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdheadingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdheadingregEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdimplantationdeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdimplantationtypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdincapacityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdincapacityreasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdinnclusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cditemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cditembvtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cditemcarenetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cditemebirthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cditemmaaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cditemmsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cditemmycarenetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cditemregEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdlabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdlegalserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdlifecycleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmaacoveragetypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmaarefusaljustificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmaarequesttypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmaaresponsetypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmaatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmedicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmicroorganismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmkgadmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmkgdestinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmkgdischargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmkgoriginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmkgreferrerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmsadaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmsmedicationtypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmsoriginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdmycarenetjustificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdorthoapproachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdorthodiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdorthograftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdorthointerfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdorthokneeinsertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdorthonavcomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdorthotechrevisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdorthotypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdparameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdpatientwillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdpatientwillhospEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdpatientwillresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdperiodicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdproofEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdquantityprefixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdrefscopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdreimbursementnomenclatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdrevcomponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdseverityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdsexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdsiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdsnomedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdstandardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdstentbridgetypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdstentdeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdstentdominanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdstentlesiontypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdstentsegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdsubstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdtechnicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdtelecomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdtemporalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdtherapeuticlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdtimeunitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdtransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdtransactioncarenetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdtransactionmaaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdtransactionmycarenetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdtransactionregEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdtransactiontypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdtucopathologytypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdtucostemitypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdunitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdurgencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdvaccineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdvaccineindicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdweekdayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass icdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass icpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lnkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdaccessrighTschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdaccessrighTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdacknowledgmenTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdactsnursinGvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdaddresSschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdaddresSvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdadministrationuniTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdautonomYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdballondevicEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdbcrdifferentationdegreEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdbearingsurfacEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdbvtavailablematerialSvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdbvtconservationdelaYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdbvtconservationmodEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdbvtlateralitYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdbvtpatientoppositioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdbvtsampletypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdbvtstatuSvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcarenetaccidenttypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcarenetagreementtypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcarenetdocumenTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcarenetinsurancystatuSvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcarenetmessagEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcarenetmutationindicatoRvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcarenetnationalinsurancEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcarenetpersonalparTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcarenetrefusalreasoNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcarenetsiscarderroRvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcarenetthirdpayercontracTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcarenettypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcarepatHvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcertaintYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdclinicalplaNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcompressioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdconsenTschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdconsenTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcontactpersoNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcontenTschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcountrYschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcountrYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdcurrencYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cddayperioDvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cddischargetypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cddrugcnKschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdebirthartificialrespirationtypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdebirthcaesareanindicatioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdebirthchildpositioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdebirthcongenitalmalformatioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdebirthdeliverywaYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdebirthfoetalmonitorinGvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdebirthneonataldepttypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdebirthplacEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdebirthpregnancyorigiNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdebirthspecialvalueSvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdecGvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdemergencyevaluatioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdemploymentsituatioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdencodinGvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdencountersafetyissuEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdencounteRvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdencryptionactoRvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdencryptionmethoDschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdencryptionmethoDvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cderrormycareneTschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cderroRschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdexternalsourcEschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdfedcountrYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdformularYschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdgalenicforMschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdhcpartYschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdhcpartYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdheadingreGvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdheadinGschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdheadinGvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdimplantationdevicEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdimplantationtypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdincapacityreasoNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdincapacitYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdinnclusteRschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cditembvTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cditemcareneTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cditemebirtHvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cditemmaAvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cditemmSvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cditemmycareneTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cditemreGvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cditeMschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cditeMvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdlegalservicEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdlifecyclEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdlnKvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmaacoveragetypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmaarefusaljustificatioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmaarequesttypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmaaresponsetypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmaatypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmediatypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmedicatioNschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmessagEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmicroorganisMvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmkgadmissioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmkgdestinatioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmkgdischargEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmkgorigiNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmkgreferreRvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmsadaptatioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmsmedicationtypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdmsorigiNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdorthoapproacHvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdorthodiagnosiSvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdorthografTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdorthointerfacEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdorthokneeinserTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdorthonavcoMvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdorthotechrevisioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdorthotypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdparameteRvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdpatientwillhosPvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdpatientwillreSvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdpatientwilLvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdprooFschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdquantityprefiXvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdrefscopEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdrevcomponenTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdseveritYschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdseveritYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdseXvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdsitEschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdsitEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdstandarDvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdstentbridgetypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdstentdevicEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdstentdominancEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdstentlesiontypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdstentsegmenTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdsubstancEschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtelecoMschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtelecoMvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtemporalitYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtherapeuticlinKschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtimeuniTschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtimeuniTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtransactioncareneTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtransactionmaAvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtransactionmycareneTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtransactionreGvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtransactioNschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtransactiontypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtransactioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtucopathologytypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdtucostemitypEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cduniTschemesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cduniTvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdurgencYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdvaccineindicatioNvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdvaccinEvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cdweekdaYvaluesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdaccessrighTschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdaccessrighTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdacknowledgmenTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdactsnursinGvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdaddresSschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdaddresSvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdadministrationuniTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdatCvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdautonomYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdballondevicEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdbcrdifferentationdegreEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdbearingsurfacEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdbvtavailablematerialSvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdbvtconservationdelaYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdbvtconservationmodEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdbvtlateralitYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdbvtpatientoppositioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdbvtsampletypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdbvtstatuSvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcarenetaccidenttypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcarenetagreementtypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcarenetdocumenTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcarenetinsurancystatuSvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcarenetmessagEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcarenetmutationindicatoRvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcarenetnationalinsurancEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcarenetpersonalparTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcarenetrefusalreasoNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcarenetsiscarderroRvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcarenetthirdpayercontracTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcarenettypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcarepatHvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcertaintYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdchapter4CATEGORYvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdchapter4CRITERIAvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdchapter4DOCUMENTSEQAPPENDIXvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdchapter4FORMALINTERPRETATIONvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdchapter4PARAGRAPHvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdchapter4VERSESEQAPPENDIXvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdchapter4VERSEvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcivilstatEvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdclinicalplaNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdclinicaLvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcompressioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdconsenTschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdconsenTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcontactpersoNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcontenTschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcountrYschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcountrYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdcurrencYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cddayperioDvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cddischargetypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cddrugcnKschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cddrugcnKvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cddrugpresentatioNvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cddrugroutEvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdebirthartificialrespirationtypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdebirthcaesareanindicatioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdebirthchildpositioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdebirthcongenitalmalformatioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdebirthdeliverywaYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdebirthfoetalmonitorinGvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdebirthneonataldepttypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdebirthplacEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdebirthpregnancyorigiNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdebirthspecialvalueSvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdecGvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdemergencyevaluatioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdemploymentsituatioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdencodinGvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdencountersafetyissuEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdencounteRvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdencryptionactoRvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdencryptionmethoDschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdencryptionmethoDvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cderrormycareneTschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cderroRschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cderroRvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdexternalsourcEschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdexternalsourcEvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdfedcountrYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdformularYschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdgalenicforMschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdhcpartYschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdhcpartYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdheadinglaBvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdheadingreGvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdheadinGschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdheadinGvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdimplantationdevicEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdimplantationtypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdincapacityreasoNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdincapacitYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdinnclusteRschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdinnclusteRvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cditembvTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cditemcareneTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cditemebirtHvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cditemmaAvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cditemmSvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cditemmycareneTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cditemreGvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cditeMschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cditeMvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdlaBvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdlegalservicEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdlifecyclEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdlnKvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmaacoveragetypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmaarefusaljustificatioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmaarequesttypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmaaresponsetypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmaatypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmediatypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmedicatioNschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmessagEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmicroorganisMvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmkgadmissioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmkgdestinatioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmkgdischargEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmkgorigiNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmkgreferreRvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmsadaptatioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmsmedicationtypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmsorigiNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdmycarenetjustificatioNvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdorthoapproacHvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdorthodiagnosiSvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdorthografTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdorthointerfacEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdorthokneeinserTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdorthonavcoMvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdorthotechrevisioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdorthotypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdparameteRvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdpatientwillhosPvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdpatientwillreSvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdpatientwilLvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdperiodicitYvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdprooFschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdprooFvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdquantityprefiXvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdrefscopEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdrefusalmycareneTvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdreimbursementnomenclaturEvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdrevcomponenTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdseveritYschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdseveritYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdseXvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdsitEschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdsitEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdsnomeDvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdstandarDvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdstentbridgetypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdstentdevicEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdstentdominancEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdstentlesiontypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdstentsegmenTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdsubstancEschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtechnicaLvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtelecoMschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtelecoMvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtemporalitYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtherapeuticlinKschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtherapeuticlinKvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtimeuniTschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtimeuniTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtransactioncareneTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtransactionmaAvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtransactionmycareneTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtransactionreGvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtransactioNschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtransactiontypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtransactioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtucopathologytypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdtucostemitypEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cduniTschemesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cduniTvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdurgencYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdvaccineindicatioNvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdvaccinEvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdweekdaYvaluesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType icDvaluesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType icpCvaluesEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CdPackageImpl() {
		super(eNS_URI, CdFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static CdPackage init() {
		if (isInited) return (CdPackage)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CdPackageImpl theCdPackage = registeredCdPackage instanceof CdPackageImpl ? (CdPackageImpl)registeredCdPackage : new CdPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XmlencPackage.eNS_URI);
		XmlencPackageImpl theXmlencPackage = (XmlencPackageImpl)(registeredPackage instanceof XmlencPackageImpl ? registeredPackage : XmlencPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI);
		XmldsigPackageImpl theXmldsigPackage = (XmldsigPackageImpl)(registeredPackage instanceof XmldsigPackageImpl ? registeredPackage : XmldsigPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KmehrPackage.eNS_URI);
		KmehrPackageImpl theKmehrPackage = (KmehrPackageImpl)(registeredPackage instanceof KmehrPackageImpl ? registeredPackage : KmehrPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IdPackage.eNS_URI);
		IdPackageImpl theIdPackage = (IdPackageImpl)(registeredPackage instanceof IdPackageImpl ? registeredPackage : IdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DtPackage.eNS_URI);
		DtPackageImpl theDtPackage = (DtPackageImpl)(registeredPackage instanceof DtPackageImpl ? registeredPackage : DtPackage.eINSTANCE);

		// Load packages
		theCdPackage.loadPackage();

		// Create package meta-data objects
		theXmlencPackage.createPackageContents();
		theXmldsigPackage.createPackageContents();
		theKmehrPackage.createPackageContents();
		theIdPackage.createPackageContents();
		theDtPackage.createPackageContents();

		// Initialize created meta-data
		theXmlencPackage.initializePackageContents();
		theXmldsigPackage.initializePackageContents();
		theKmehrPackage.initializePackageContents();
		theIdPackage.initializePackageContents();
		theDtPackage.initializePackageContents();

		// Fix loaded packages
		theCdPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theCdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CdPackage.eNS_URI, theCdPackage);
		return theCdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDACCESSRIGHT() {
		if (cdaccessrightEClass == null) {
			cdaccessrightEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(0);
		}
		return cdaccessrightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACCESSRIGHT_Value() {
        return (EAttribute)getCDACCESSRIGHT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACCESSRIGHT_DN() {
        return (EAttribute)getCDACCESSRIGHT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACCESSRIGHT_L() {
        return (EAttribute)getCDACCESSRIGHT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACCESSRIGHT_S() {
        return (EAttribute)getCDACCESSRIGHT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACCESSRIGHT_SL() {
        return (EAttribute)getCDACCESSRIGHT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACCESSRIGHT_SV() {
        return (EAttribute)getCDACCESSRIGHT().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDACKNOWLEDGMENT() {
		if (cdacknowledgmentEClass == null) {
			cdacknowledgmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(5);
		}
		return cdacknowledgmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACKNOWLEDGMENT_Value() {
        return (EAttribute)getCDACKNOWLEDGMENT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACKNOWLEDGMENT_DN() {
        return (EAttribute)getCDACKNOWLEDGMENT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACKNOWLEDGMENT_L() {
        return (EAttribute)getCDACKNOWLEDGMENT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACKNOWLEDGMENT_S() {
        return (EAttribute)getCDACKNOWLEDGMENT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACKNOWLEDGMENT_SV() {
        return (EAttribute)getCDACKNOWLEDGMENT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDACTSNURSING() {
		if (cdactsnursingEClass == null) {
			cdactsnursingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(8);
		}
		return cdactsnursingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACTSNURSING_Value() {
        return (EAttribute)getCDACTSNURSING().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACTSNURSING_DN() {
        return (EAttribute)getCDACTSNURSING().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACTSNURSING_L() {
        return (EAttribute)getCDACTSNURSING().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACTSNURSING_S() {
        return (EAttribute)getCDACTSNURSING().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACTSNURSING_SL() {
        return (EAttribute)getCDACTSNURSING().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDACTSNURSING_SV() {
        return (EAttribute)getCDACTSNURSING().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDADDRESS() {
		if (cdaddressEClass == null) {
			cdaddressEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(11);
		}
		return cdaddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDADDRESS_Value() {
        return (EAttribute)getCDADDRESS().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDADDRESS_DN() {
        return (EAttribute)getCDADDRESS().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDADDRESS_L() {
        return (EAttribute)getCDADDRESS().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDADDRESS_S() {
        return (EAttribute)getCDADDRESS().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDADDRESS_SL() {
        return (EAttribute)getCDADDRESS().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDADDRESS_SV() {
        return (EAttribute)getCDADDRESS().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDADMINISTRATIONUNIT() {
		if (cdadministrationunitEClass == null) {
			cdadministrationunitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(16);
		}
		return cdadministrationunitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDADMINISTRATIONUNIT_Value() {
        return (EAttribute)getCDADMINISTRATIONUNIT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDADMINISTRATIONUNIT_DN() {
        return (EAttribute)getCDADMINISTRATIONUNIT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDADMINISTRATIONUNIT_L() {
        return (EAttribute)getCDADMINISTRATIONUNIT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDADMINISTRATIONUNIT_S() {
        return (EAttribute)getCDADMINISTRATIONUNIT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDADMINISTRATIONUNIT_SV() {
        return (EAttribute)getCDADMINISTRATIONUNIT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDATC() {
		if (cdatcEClass == null) {
			cdatcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(19);
		}
		return cdatcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDATC_Value() {
        return (EAttribute)getCDATC().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDATC_DN() {
        return (EAttribute)getCDATC().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDATC_L() {
        return (EAttribute)getCDATC().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDATC_S() {
        return (EAttribute)getCDATC().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDATC_SV() {
        return (EAttribute)getCDATC().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDAUTONOMY() {
		if (cdautonomyEClass == null) {
			cdautonomyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(21);
		}
		return cdautonomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDAUTONOMY_Value() {
        return (EAttribute)getCDAUTONOMY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDAUTONOMY_DN() {
        return (EAttribute)getCDAUTONOMY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDAUTONOMY_L() {
        return (EAttribute)getCDAUTONOMY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDAUTONOMY_S() {
        return (EAttribute)getCDAUTONOMY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDAUTONOMY_SL() {
        return (EAttribute)getCDAUTONOMY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDAUTONOMY_SV() {
        return (EAttribute)getCDAUTONOMY().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDBALLONDEVICE() {
		if (cdballondeviceEClass == null) {
			cdballondeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(24);
		}
		return cdballondeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBALLONDEVICE_Value() {
        return (EAttribute)getCDBALLONDEVICE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBALLONDEVICE_DN() {
        return (EAttribute)getCDBALLONDEVICE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBALLONDEVICE_L() {
        return (EAttribute)getCDBALLONDEVICE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBALLONDEVICE_S() {
        return (EAttribute)getCDBALLONDEVICE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBALLONDEVICE_SL() {
        return (EAttribute)getCDBALLONDEVICE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBALLONDEVICE_SV() {
        return (EAttribute)getCDBALLONDEVICE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDBCRDIFFERENTATIONDEGREE() {
		if (cdbcrdifferentationdegreeEClass == null) {
			cdbcrdifferentationdegreeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(27);
		}
		return cdbcrdifferentationdegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBCRDIFFERENTATIONDEGREE_Value() {
        return (EAttribute)getCDBCRDIFFERENTATIONDEGREE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBCRDIFFERENTATIONDEGREE_DN() {
        return (EAttribute)getCDBCRDIFFERENTATIONDEGREE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBCRDIFFERENTATIONDEGREE_L() {
        return (EAttribute)getCDBCRDIFFERENTATIONDEGREE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBCRDIFFERENTATIONDEGREE_S() {
        return (EAttribute)getCDBCRDIFFERENTATIONDEGREE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBCRDIFFERENTATIONDEGREE_SL() {
        return (EAttribute)getCDBCRDIFFERENTATIONDEGREE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBCRDIFFERENTATIONDEGREE_SV() {
        return (EAttribute)getCDBCRDIFFERENTATIONDEGREE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDBEARINGSURFACE() {
		if (cdbearingsurfaceEClass == null) {
			cdbearingsurfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(30);
		}
		return cdbearingsurfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBEARINGSURFACE_Value() {
        return (EAttribute)getCDBEARINGSURFACE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBEARINGSURFACE_DN() {
        return (EAttribute)getCDBEARINGSURFACE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBEARINGSURFACE_L() {
        return (EAttribute)getCDBEARINGSURFACE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBEARINGSURFACE_S() {
        return (EAttribute)getCDBEARINGSURFACE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBEARINGSURFACE_SL() {
        return (EAttribute)getCDBEARINGSURFACE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBEARINGSURFACE_SV() {
        return (EAttribute)getCDBEARINGSURFACE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDBVTAVAILABLEMATERIALS() {
		if (cdbvtavailablematerialsEClass == null) {
			cdbvtavailablematerialsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(33);
		}
		return cdbvtavailablematerialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTAVAILABLEMATERIALS_Value() {
        return (EAttribute)getCDBVTAVAILABLEMATERIALS().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTAVAILABLEMATERIALS_DN() {
        return (EAttribute)getCDBVTAVAILABLEMATERIALS().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTAVAILABLEMATERIALS_L() {
        return (EAttribute)getCDBVTAVAILABLEMATERIALS().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTAVAILABLEMATERIALS_S() {
        return (EAttribute)getCDBVTAVAILABLEMATERIALS().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTAVAILABLEMATERIALS_SL() {
        return (EAttribute)getCDBVTAVAILABLEMATERIALS().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTAVAILABLEMATERIALS_SV() {
        return (EAttribute)getCDBVTAVAILABLEMATERIALS().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDBVTCONSERVATIONDELAY() {
		if (cdbvtconservationdelayEClass == null) {
			cdbvtconservationdelayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(36);
		}
		return cdbvtconservationdelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTCONSERVATIONDELAY_Value() {
        return (EAttribute)getCDBVTCONSERVATIONDELAY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTCONSERVATIONDELAY_DN() {
        return (EAttribute)getCDBVTCONSERVATIONDELAY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTCONSERVATIONDELAY_L() {
        return (EAttribute)getCDBVTCONSERVATIONDELAY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTCONSERVATIONDELAY_S() {
        return (EAttribute)getCDBVTCONSERVATIONDELAY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTCONSERVATIONDELAY_SL() {
        return (EAttribute)getCDBVTCONSERVATIONDELAY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTCONSERVATIONDELAY_SV() {
        return (EAttribute)getCDBVTCONSERVATIONDELAY().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDBVTCONSERVATIONMODE() {
		if (cdbvtconservationmodeEClass == null) {
			cdbvtconservationmodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(39);
		}
		return cdbvtconservationmodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTCONSERVATIONMODE_Value() {
        return (EAttribute)getCDBVTCONSERVATIONMODE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTCONSERVATIONMODE_DN() {
        return (EAttribute)getCDBVTCONSERVATIONMODE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTCONSERVATIONMODE_L() {
        return (EAttribute)getCDBVTCONSERVATIONMODE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTCONSERVATIONMODE_S() {
        return (EAttribute)getCDBVTCONSERVATIONMODE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTCONSERVATIONMODE_SL() {
        return (EAttribute)getCDBVTCONSERVATIONMODE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTCONSERVATIONMODE_SV() {
        return (EAttribute)getCDBVTCONSERVATIONMODE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDBVTLATERALITY() {
		if (cdbvtlateralityEClass == null) {
			cdbvtlateralityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(42);
		}
		return cdbvtlateralityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTLATERALITY_Value() {
        return (EAttribute)getCDBVTLATERALITY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTLATERALITY_DN() {
        return (EAttribute)getCDBVTLATERALITY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTLATERALITY_L() {
        return (EAttribute)getCDBVTLATERALITY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTLATERALITY_S() {
        return (EAttribute)getCDBVTLATERALITY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTLATERALITY_SL() {
        return (EAttribute)getCDBVTLATERALITY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTLATERALITY_SV() {
        return (EAttribute)getCDBVTLATERALITY().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDBVTPATIENTOPPOSITION() {
		if (cdbvtpatientoppositionEClass == null) {
			cdbvtpatientoppositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(45);
		}
		return cdbvtpatientoppositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTPATIENTOPPOSITION_Value() {
        return (EAttribute)getCDBVTPATIENTOPPOSITION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTPATIENTOPPOSITION_DN() {
        return (EAttribute)getCDBVTPATIENTOPPOSITION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTPATIENTOPPOSITION_L() {
        return (EAttribute)getCDBVTPATIENTOPPOSITION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTPATIENTOPPOSITION_S() {
        return (EAttribute)getCDBVTPATIENTOPPOSITION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTPATIENTOPPOSITION_SL() {
        return (EAttribute)getCDBVTPATIENTOPPOSITION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTPATIENTOPPOSITION_SV() {
        return (EAttribute)getCDBVTPATIENTOPPOSITION().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDBVTSAMPLETYPE() {
		if (cdbvtsampletypeEClass == null) {
			cdbvtsampletypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(48);
		}
		return cdbvtsampletypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTSAMPLETYPE_Value() {
        return (EAttribute)getCDBVTSAMPLETYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTSAMPLETYPE_DN() {
        return (EAttribute)getCDBVTSAMPLETYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTSAMPLETYPE_L() {
        return (EAttribute)getCDBVTSAMPLETYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTSAMPLETYPE_S() {
        return (EAttribute)getCDBVTSAMPLETYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTSAMPLETYPE_SL() {
        return (EAttribute)getCDBVTSAMPLETYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTSAMPLETYPE_SV() {
        return (EAttribute)getCDBVTSAMPLETYPE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDBVTSTATUS() {
		if (cdbvtstatusEClass == null) {
			cdbvtstatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(51);
		}
		return cdbvtstatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTSTATUS_Value() {
        return (EAttribute)getCDBVTSTATUS().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTSTATUS_DN() {
        return (EAttribute)getCDBVTSTATUS().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTSTATUS_L() {
        return (EAttribute)getCDBVTSTATUS().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTSTATUS_S() {
        return (EAttribute)getCDBVTSTATUS().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTSTATUS_SL() {
        return (EAttribute)getCDBVTSTATUS().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDBVTSTATUS_SV() {
        return (EAttribute)getCDBVTSTATUS().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCARENETACCIDENTTYPE() {
		if (cdcarenetaccidenttypeEClass == null) {
			cdcarenetaccidenttypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(54);
		}
		return cdcarenetaccidenttypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETACCIDENTTYPE_Value() {
        return (EAttribute)getCDCARENETACCIDENTTYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETACCIDENTTYPE_DN() {
        return (EAttribute)getCDCARENETACCIDENTTYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETACCIDENTTYPE_L() {
        return (EAttribute)getCDCARENETACCIDENTTYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETACCIDENTTYPE_S() {
        return (EAttribute)getCDCARENETACCIDENTTYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETACCIDENTTYPE_SV() {
        return (EAttribute)getCDCARENETACCIDENTTYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCARENETAGREEMENTTYPE() {
		if (cdcarenetagreementtypeEClass == null) {
			cdcarenetagreementtypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(57);
		}
		return cdcarenetagreementtypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETAGREEMENTTYPE_Value() {
        return (EAttribute)getCDCARENETAGREEMENTTYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETAGREEMENTTYPE_DN() {
        return (EAttribute)getCDCARENETAGREEMENTTYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETAGREEMENTTYPE_L() {
        return (EAttribute)getCDCARENETAGREEMENTTYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETAGREEMENTTYPE_S() {
        return (EAttribute)getCDCARENETAGREEMENTTYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETAGREEMENTTYPE_SV() {
        return (EAttribute)getCDCARENETAGREEMENTTYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCARENETDOCUMENT() {
		if (cdcarenetdocumentEClass == null) {
			cdcarenetdocumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(60);
		}
		return cdcarenetdocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETDOCUMENT_Value() {
        return (EAttribute)getCDCARENETDOCUMENT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETDOCUMENT_DN() {
        return (EAttribute)getCDCARENETDOCUMENT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETDOCUMENT_L() {
        return (EAttribute)getCDCARENETDOCUMENT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETDOCUMENT_S() {
        return (EAttribute)getCDCARENETDOCUMENT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETDOCUMENT_SV() {
        return (EAttribute)getCDCARENETDOCUMENT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCARENETINSURANCYSTATUS() {
		if (cdcarenetinsurancystatusEClass == null) {
			cdcarenetinsurancystatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(63);
		}
		return cdcarenetinsurancystatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETINSURANCYSTATUS_Value() {
        return (EAttribute)getCDCARENETINSURANCYSTATUS().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETINSURANCYSTATUS_DN() {
        return (EAttribute)getCDCARENETINSURANCYSTATUS().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETINSURANCYSTATUS_L() {
        return (EAttribute)getCDCARENETINSURANCYSTATUS().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETINSURANCYSTATUS_S() {
        return (EAttribute)getCDCARENETINSURANCYSTATUS().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETINSURANCYSTATUS_SV() {
        return (EAttribute)getCDCARENETINSURANCYSTATUS().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCARENETMESSAGE() {
		if (cdcarenetmessageEClass == null) {
			cdcarenetmessageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(66);
		}
		return cdcarenetmessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETMESSAGE_Value() {
        return (EAttribute)getCDCARENETMESSAGE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETMESSAGE_DN() {
        return (EAttribute)getCDCARENETMESSAGE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETMESSAGE_L() {
        return (EAttribute)getCDCARENETMESSAGE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETMESSAGE_S() {
        return (EAttribute)getCDCARENETMESSAGE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETMESSAGE_SV() {
        return (EAttribute)getCDCARENETMESSAGE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCARENETMUTATIONINDICATOR() {
		if (cdcarenetmutationindicatorEClass == null) {
			cdcarenetmutationindicatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(69);
		}
		return cdcarenetmutationindicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETMUTATIONINDICATOR_Value() {
        return (EAttribute)getCDCARENETMUTATIONINDICATOR().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETMUTATIONINDICATOR_DN() {
        return (EAttribute)getCDCARENETMUTATIONINDICATOR().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETMUTATIONINDICATOR_L() {
        return (EAttribute)getCDCARENETMUTATIONINDICATOR().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETMUTATIONINDICATOR_S() {
        return (EAttribute)getCDCARENETMUTATIONINDICATOR().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETMUTATIONINDICATOR_SV() {
        return (EAttribute)getCDCARENETMUTATIONINDICATOR().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCARENETNATIONALINSURANCE() {
		if (cdcarenetnationalinsuranceEClass == null) {
			cdcarenetnationalinsuranceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(72);
		}
		return cdcarenetnationalinsuranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETNATIONALINSURANCE_Value() {
        return (EAttribute)getCDCARENETNATIONALINSURANCE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETNATIONALINSURANCE_DN() {
        return (EAttribute)getCDCARENETNATIONALINSURANCE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETNATIONALINSURANCE_L() {
        return (EAttribute)getCDCARENETNATIONALINSURANCE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETNATIONALINSURANCE_S() {
        return (EAttribute)getCDCARENETNATIONALINSURANCE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETNATIONALINSURANCE_SV() {
        return (EAttribute)getCDCARENETNATIONALINSURANCE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCARENETPERSONALPART() {
		if (cdcarenetpersonalpartEClass == null) {
			cdcarenetpersonalpartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(75);
		}
		return cdcarenetpersonalpartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETPERSONALPART_Value() {
        return (EAttribute)getCDCARENETPERSONALPART().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETPERSONALPART_DN() {
        return (EAttribute)getCDCARENETPERSONALPART().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETPERSONALPART_L() {
        return (EAttribute)getCDCARENETPERSONALPART().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETPERSONALPART_S() {
        return (EAttribute)getCDCARENETPERSONALPART().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETPERSONALPART_SV() {
        return (EAttribute)getCDCARENETPERSONALPART().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCARENETREFUSALREASON() {
		if (cdcarenetrefusalreasonEClass == null) {
			cdcarenetrefusalreasonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(78);
		}
		return cdcarenetrefusalreasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETREFUSALREASON_Value() {
        return (EAttribute)getCDCARENETREFUSALREASON().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETREFUSALREASON_DN() {
        return (EAttribute)getCDCARENETREFUSALREASON().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETREFUSALREASON_L() {
        return (EAttribute)getCDCARENETREFUSALREASON().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETREFUSALREASON_S() {
        return (EAttribute)getCDCARENETREFUSALREASON().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETREFUSALREASON_SV() {
        return (EAttribute)getCDCARENETREFUSALREASON().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCARENETSISCARDERROR() {
		if (cdcarenetsiscarderrorEClass == null) {
			cdcarenetsiscarderrorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(81);
		}
		return cdcarenetsiscarderrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETSISCARDERROR_Value() {
        return (EAttribute)getCDCARENETSISCARDERROR().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETSISCARDERROR_DN() {
        return (EAttribute)getCDCARENETSISCARDERROR().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETSISCARDERROR_L() {
        return (EAttribute)getCDCARENETSISCARDERROR().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETSISCARDERROR_S() {
        return (EAttribute)getCDCARENETSISCARDERROR().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETSISCARDERROR_SV() {
        return (EAttribute)getCDCARENETSISCARDERROR().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCARENETTHIRDPAYERCONTRACT() {
		if (cdcarenetthirdpayercontractEClass == null) {
			cdcarenetthirdpayercontractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(84);
		}
		return cdcarenetthirdpayercontractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETTHIRDPAYERCONTRACT_Value() {
        return (EAttribute)getCDCARENETTHIRDPAYERCONTRACT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETTHIRDPAYERCONTRACT_DN() {
        return (EAttribute)getCDCARENETTHIRDPAYERCONTRACT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETTHIRDPAYERCONTRACT_L() {
        return (EAttribute)getCDCARENETTHIRDPAYERCONTRACT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETTHIRDPAYERCONTRACT_S() {
        return (EAttribute)getCDCARENETTHIRDPAYERCONTRACT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETTHIRDPAYERCONTRACT_SV() {
        return (EAttribute)getCDCARENETTHIRDPAYERCONTRACT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCARENETTYPE() {
		if (cdcarenettypeEClass == null) {
			cdcarenettypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(87);
		}
		return cdcarenettypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETTYPE_Value() {
        return (EAttribute)getCDCARENETTYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETTYPE_DN() {
        return (EAttribute)getCDCARENETTYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETTYPE_L() {
        return (EAttribute)getCDCARENETTYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETTYPE_S() {
        return (EAttribute)getCDCARENETTYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCARENETTYPE_SV() {
        return (EAttribute)getCDCARENETTYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCAREPATH() {
		if (cdcarepathEClass == null) {
			cdcarepathEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(90);
		}
		return cdcarepathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCAREPATH_Value() {
        return (EAttribute)getCDCAREPATH().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCAREPATH_DN() {
        return (EAttribute)getCDCAREPATH().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCAREPATH_L() {
        return (EAttribute)getCDCAREPATH().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCAREPATH_S() {
        return (EAttribute)getCDCAREPATH().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCAREPATH_SV() {
        return (EAttribute)getCDCAREPATH().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCERTAINTY() {
		if (cdcertaintyEClass == null) {
			cdcertaintyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(93);
		}
		return cdcertaintyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCERTAINTY_Value() {
        return (EAttribute)getCDCERTAINTY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCERTAINTY_DN() {
        return (EAttribute)getCDCERTAINTY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCERTAINTY_L() {
        return (EAttribute)getCDCERTAINTY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCERTAINTY_S() {
        return (EAttribute)getCDCERTAINTY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCERTAINTY_SV() {
        return (EAttribute)getCDCERTAINTY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCHAPTER4CATEGORY() {
		if (cdchapter4CATEGORYEClass == null) {
			cdchapter4CATEGORYEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(96);
		}
		return cdchapter4CATEGORYEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4CATEGORY_Value() {
        return (EAttribute)getCDCHAPTER4CATEGORY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4CATEGORY_DN() {
        return (EAttribute)getCDCHAPTER4CATEGORY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4CATEGORY_L() {
        return (EAttribute)getCDCHAPTER4CATEGORY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4CATEGORY_S() {
        return (EAttribute)getCDCHAPTER4CATEGORY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4CATEGORY_SV() {
        return (EAttribute)getCDCHAPTER4CATEGORY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCHAPTER4CRITERIA() {
		if (cdchapter4CRITERIAEClass == null) {
			cdchapter4CRITERIAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(98);
		}
		return cdchapter4CRITERIAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4CRITERIA_Value() {
        return (EAttribute)getCDCHAPTER4CRITERIA().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4CRITERIA_DN() {
        return (EAttribute)getCDCHAPTER4CRITERIA().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4CRITERIA_L() {
        return (EAttribute)getCDCHAPTER4CRITERIA().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4CRITERIA_S() {
        return (EAttribute)getCDCHAPTER4CRITERIA().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4CRITERIA_SV() {
        return (EAttribute)getCDCHAPTER4CRITERIA().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCHAPTER4DOCUMENTSEQAPPENDIX() {
		if (cdchapter4DOCUMENTSEQAPPENDIXEClass == null) {
			cdchapter4DOCUMENTSEQAPPENDIXEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(100);
		}
		return cdchapter4DOCUMENTSEQAPPENDIXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4DOCUMENTSEQAPPENDIX_Value() {
        return (EAttribute)getCDCHAPTER4DOCUMENTSEQAPPENDIX().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4DOCUMENTSEQAPPENDIX_DN() {
        return (EAttribute)getCDCHAPTER4DOCUMENTSEQAPPENDIX().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4DOCUMENTSEQAPPENDIX_L() {
        return (EAttribute)getCDCHAPTER4DOCUMENTSEQAPPENDIX().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4DOCUMENTSEQAPPENDIX_S() {
        return (EAttribute)getCDCHAPTER4DOCUMENTSEQAPPENDIX().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4DOCUMENTSEQAPPENDIX_SV() {
        return (EAttribute)getCDCHAPTER4DOCUMENTSEQAPPENDIX().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCHAPTER4FORMALINTERPRETATION() {
		if (cdchapter4FORMALINTERPRETATIONEClass == null) {
			cdchapter4FORMALINTERPRETATIONEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(102);
		}
		return cdchapter4FORMALINTERPRETATIONEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4FORMALINTERPRETATION_Value() {
        return (EAttribute)getCDCHAPTER4FORMALINTERPRETATION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4FORMALINTERPRETATION_DN() {
        return (EAttribute)getCDCHAPTER4FORMALINTERPRETATION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4FORMALINTERPRETATION_L() {
        return (EAttribute)getCDCHAPTER4FORMALINTERPRETATION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4FORMALINTERPRETATION_S() {
        return (EAttribute)getCDCHAPTER4FORMALINTERPRETATION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4FORMALINTERPRETATION_SV() {
        return (EAttribute)getCDCHAPTER4FORMALINTERPRETATION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCHAPTER4PARAGRAPH() {
		if (cdchapter4PARAGRAPHEClass == null) {
			cdchapter4PARAGRAPHEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(104);
		}
		return cdchapter4PARAGRAPHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4PARAGRAPH_Value() {
        return (EAttribute)getCDCHAPTER4PARAGRAPH().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4PARAGRAPH_DN() {
        return (EAttribute)getCDCHAPTER4PARAGRAPH().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4PARAGRAPH_L() {
        return (EAttribute)getCDCHAPTER4PARAGRAPH().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4PARAGRAPH_S() {
        return (EAttribute)getCDCHAPTER4PARAGRAPH().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4PARAGRAPH_SV() {
        return (EAttribute)getCDCHAPTER4PARAGRAPH().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCHAPTER4VERSE() {
		if (cdchapter4VERSEEClass == null) {
			cdchapter4VERSEEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(106);
		}
		return cdchapter4VERSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4VERSE_Value() {
        return (EAttribute)getCDCHAPTER4VERSE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4VERSE_DN() {
        return (EAttribute)getCDCHAPTER4VERSE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4VERSE_L() {
        return (EAttribute)getCDCHAPTER4VERSE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4VERSE_S() {
        return (EAttribute)getCDCHAPTER4VERSE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4VERSE_SV() {
        return (EAttribute)getCDCHAPTER4VERSE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCHAPTER4VERSESEQAPPENDIX() {
		if (cdchapter4VERSESEQAPPENDIXEClass == null) {
			cdchapter4VERSESEQAPPENDIXEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(107);
		}
		return cdchapter4VERSESEQAPPENDIXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4VERSESEQAPPENDIX_Value() {
        return (EAttribute)getCDCHAPTER4VERSESEQAPPENDIX().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4VERSESEQAPPENDIX_DN() {
        return (EAttribute)getCDCHAPTER4VERSESEQAPPENDIX().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4VERSESEQAPPENDIX_L() {
        return (EAttribute)getCDCHAPTER4VERSESEQAPPENDIX().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4VERSESEQAPPENDIX_S() {
        return (EAttribute)getCDCHAPTER4VERSESEQAPPENDIX().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCHAPTER4VERSESEQAPPENDIX_SV() {
        return (EAttribute)getCDCHAPTER4VERSESEQAPPENDIX().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCIVILSTATE() {
		if (cdcivilstateEClass == null) {
			cdcivilstateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(110);
		}
		return cdcivilstateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCIVILSTATE_Value() {
        return (EAttribute)getCDCIVILSTATE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCIVILSTATE_DN() {
        return (EAttribute)getCDCIVILSTATE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCIVILSTATE_L() {
        return (EAttribute)getCDCIVILSTATE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCIVILSTATE_S() {
        return (EAttribute)getCDCIVILSTATE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCIVILSTATE_SL() {
        return (EAttribute)getCDCIVILSTATE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCIVILSTATE_SV() {
        return (EAttribute)getCDCIVILSTATE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCLINICAL() {
		if (cdclinicalEClass == null) {
			cdclinicalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(112);
		}
		return cdclinicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCLINICAL_Value() {
        return (EAttribute)getCDCLINICAL().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCLINICAL_DN() {
        return (EAttribute)getCDCLINICAL().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCLINICAL_L() {
        return (EAttribute)getCDCLINICAL().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCLINICAL_S() {
        return (EAttribute)getCDCLINICAL().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCLINICAL_SV() {
        return (EAttribute)getCDCLINICAL().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCLINICALPLAN() {
		if (cdclinicalplanEClass == null) {
			cdclinicalplanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(113);
		}
		return cdclinicalplanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCLINICALPLAN_Value() {
        return (EAttribute)getCDCLINICALPLAN().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCLINICALPLAN_DN() {
        return (EAttribute)getCDCLINICALPLAN().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCLINICALPLAN_L() {
        return (EAttribute)getCDCLINICALPLAN().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCLINICALPLAN_S() {
        return (EAttribute)getCDCLINICALPLAN().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCLINICALPLAN_SV() {
        return (EAttribute)getCDCLINICALPLAN().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCONSENT() {
		if (cdconsentEClass == null) {
			cdconsentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(119);
		}
		return cdconsentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONSENT_Value() {
        return (EAttribute)getCDCONSENT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONSENT_DN() {
        return (EAttribute)getCDCONSENT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONSENT_L() {
        return (EAttribute)getCDCONSENT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONSENT_S() {
        return (EAttribute)getCDCONSENT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONSENT_SL() {
        return (EAttribute)getCDCONSENT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONSENT_SV() {
        return (EAttribute)getCDCONSENT().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCONTACTPERSON() {
		if (cdcontactpersonEClass == null) {
			cdcontactpersonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(124);
		}
		return cdcontactpersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONTACTPERSON_Value() {
        return (EAttribute)getCDCONTACTPERSON().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONTACTPERSON_DN() {
        return (EAttribute)getCDCONTACTPERSON().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONTACTPERSON_L() {
        return (EAttribute)getCDCONTACTPERSON().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONTACTPERSON_S() {
        return (EAttribute)getCDCONTACTPERSON().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONTACTPERSON_SV() {
        return (EAttribute)getCDCONTACTPERSON().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCONTENT() {
		if (cdcontentEClass == null) {
			cdcontentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(127);
		}
		return cdcontentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONTENT_Value() {
        return (EAttribute)getCDCONTENT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONTENT_DN() {
        return (EAttribute)getCDCONTENT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONTENT_L() {
        return (EAttribute)getCDCONTENT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONTENT_NullFlavor() {
        return (EAttribute)getCDCONTENT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONTENT_S() {
        return (EAttribute)getCDCONTENT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONTENT_SL() {
        return (EAttribute)getCDCONTENT().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCONTENT_SV() {
        return (EAttribute)getCDCONTENT().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCOUNTRY() {
		if (cdcountryEClass == null) {
			cdcountryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(130);
		}
		return cdcountryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCOUNTRY_Value() {
        return (EAttribute)getCDCOUNTRY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCOUNTRY_DN() {
        return (EAttribute)getCDCOUNTRY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCOUNTRY_L() {
        return (EAttribute)getCDCOUNTRY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCOUNTRY_S() {
        return (EAttribute)getCDCOUNTRY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCOUNTRY_SL() {
        return (EAttribute)getCDCOUNTRY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCOUNTRY_SV() {
        return (EAttribute)getCDCOUNTRY().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDCURRENCY() {
		if (cdcurrencyEClass == null) {
			cdcurrencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(135);
		}
		return cdcurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCURRENCY_Value() {
        return (EAttribute)getCDCURRENCY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCURRENCY_DN() {
        return (EAttribute)getCDCURRENCY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCURRENCY_L() {
        return (EAttribute)getCDCURRENCY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCURRENCY_S() {
        return (EAttribute)getCDCURRENCY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCURRENCY_SL() {
        return (EAttribute)getCDCURRENCY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDCURRENCY_SV() {
        return (EAttribute)getCDCURRENCY().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDDAYPERIOD() {
		if (cddayperiodEClass == null) {
			cddayperiodEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(138);
		}
		return cddayperiodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDAYPERIOD_Value() {
        return (EAttribute)getCDDAYPERIOD().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDAYPERIOD_DN() {
        return (EAttribute)getCDDAYPERIOD().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDAYPERIOD_L() {
        return (EAttribute)getCDDAYPERIOD().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDAYPERIOD_S() {
        return (EAttribute)getCDDAYPERIOD().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDAYPERIOD_SV() {
        return (EAttribute)getCDDAYPERIOD().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDDISCHARGETYPE() {
		if (cddischargetypeEClass == null) {
			cddischargetypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(141);
		}
		return cddischargetypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDISCHARGETYPE_Value() {
        return (EAttribute)getCDDISCHARGETYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDISCHARGETYPE_DN() {
        return (EAttribute)getCDDISCHARGETYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDISCHARGETYPE_L() {
        return (EAttribute)getCDDISCHARGETYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDISCHARGETYPE_S() {
        return (EAttribute)getCDDISCHARGETYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDISCHARGETYPE_SL() {
        return (EAttribute)getCDDISCHARGETYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDISCHARGETYPE_SV() {
        return (EAttribute)getCDDISCHARGETYPE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDDRUGCNK() {
		if (cddrugcnkEClass == null) {
			cddrugcnkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(144);
		}
		return cddrugcnkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGCNK_Value() {
        return (EAttribute)getCDDRUGCNK().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGCNK_DN() {
        return (EAttribute)getCDDRUGCNK().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGCNK_L() {
        return (EAttribute)getCDDRUGCNK().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGCNK_S() {
        return (EAttribute)getCDDRUGCNK().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGCNK_SV() {
        return (EAttribute)getCDDRUGCNK().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDDRUGPRESENTATION() {
		if (cddrugpresentationEClass == null) {
			cddrugpresentationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(148);
		}
		return cddrugpresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGPRESENTATION_Value() {
        return (EAttribute)getCDDRUGPRESENTATION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGPRESENTATION_DN() {
        return (EAttribute)getCDDRUGPRESENTATION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGPRESENTATION_L() {
        return (EAttribute)getCDDRUGPRESENTATION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGPRESENTATION_S() {
        return (EAttribute)getCDDRUGPRESENTATION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGPRESENTATION_SV() {
        return (EAttribute)getCDDRUGPRESENTATION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDDRUGROUTE() {
		if (cddrugrouteEClass == null) {
			cddrugrouteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(150);
		}
		return cddrugrouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGROUTE_Value() {
        return (EAttribute)getCDDRUGROUTE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGROUTE_DN() {
        return (EAttribute)getCDDRUGROUTE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGROUTE_L() {
        return (EAttribute)getCDDRUGROUTE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGROUTE_S() {
        return (EAttribute)getCDDRUGROUTE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDDRUGROUTE_SV() {
        return (EAttribute)getCDDRUGROUTE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDEBIRTHARTIFICIALRESPIRATIONTYPE() {
		if (cdebirthartificialrespirationtypeEClass == null) {
			cdebirthartificialrespirationtypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(152);
		}
		return cdebirthartificialrespirationtypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHARTIFICIALRESPIRATIONTYPE_Value() {
        return (EAttribute)getCDEBIRTHARTIFICIALRESPIRATIONTYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHARTIFICIALRESPIRATIONTYPE_DN() {
        return (EAttribute)getCDEBIRTHARTIFICIALRESPIRATIONTYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHARTIFICIALRESPIRATIONTYPE_L() {
        return (EAttribute)getCDEBIRTHARTIFICIALRESPIRATIONTYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHARTIFICIALRESPIRATIONTYPE_S() {
        return (EAttribute)getCDEBIRTHARTIFICIALRESPIRATIONTYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHARTIFICIALRESPIRATIONTYPE_SV() {
        return (EAttribute)getCDEBIRTHARTIFICIALRESPIRATIONTYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDEBIRTHCAESAREANINDICATION() {
		if (cdebirthcaesareanindicationEClass == null) {
			cdebirthcaesareanindicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(155);
		}
		return cdebirthcaesareanindicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCAESAREANINDICATION_Value() {
        return (EAttribute)getCDEBIRTHCAESAREANINDICATION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCAESAREANINDICATION_DN() {
        return (EAttribute)getCDEBIRTHCAESAREANINDICATION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCAESAREANINDICATION_L() {
        return (EAttribute)getCDEBIRTHCAESAREANINDICATION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCAESAREANINDICATION_S() {
        return (EAttribute)getCDEBIRTHCAESAREANINDICATION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCAESAREANINDICATION_SV() {
        return (EAttribute)getCDEBIRTHCAESAREANINDICATION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDEBIRTHCHILDPOSITION() {
		if (cdebirthchildpositionEClass == null) {
			cdebirthchildpositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(158);
		}
		return cdebirthchildpositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCHILDPOSITION_Value() {
        return (EAttribute)getCDEBIRTHCHILDPOSITION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCHILDPOSITION_DN() {
        return (EAttribute)getCDEBIRTHCHILDPOSITION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCHILDPOSITION_L() {
        return (EAttribute)getCDEBIRTHCHILDPOSITION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCHILDPOSITION_S() {
        return (EAttribute)getCDEBIRTHCHILDPOSITION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCHILDPOSITION_SV() {
        return (EAttribute)getCDEBIRTHCHILDPOSITION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDEBIRTHCONGENITALMALFORMATION() {
		if (cdebirthcongenitalmalformationEClass == null) {
			cdebirthcongenitalmalformationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(161);
		}
		return cdebirthcongenitalmalformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCONGENITALMALFORMATION_Value() {
        return (EAttribute)getCDEBIRTHCONGENITALMALFORMATION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCONGENITALMALFORMATION_DN() {
        return (EAttribute)getCDEBIRTHCONGENITALMALFORMATION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCONGENITALMALFORMATION_L() {
        return (EAttribute)getCDEBIRTHCONGENITALMALFORMATION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCONGENITALMALFORMATION_S() {
        return (EAttribute)getCDEBIRTHCONGENITALMALFORMATION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHCONGENITALMALFORMATION_SV() {
        return (EAttribute)getCDEBIRTHCONGENITALMALFORMATION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDEBIRTHDELIVERYWAY() {
		if (cdebirthdeliverywayEClass == null) {
			cdebirthdeliverywayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(164);
		}
		return cdebirthdeliverywayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHDELIVERYWAY_Value() {
        return (EAttribute)getCDEBIRTHDELIVERYWAY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHDELIVERYWAY_DN() {
        return (EAttribute)getCDEBIRTHDELIVERYWAY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHDELIVERYWAY_L() {
        return (EAttribute)getCDEBIRTHDELIVERYWAY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHDELIVERYWAY_S() {
        return (EAttribute)getCDEBIRTHDELIVERYWAY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHDELIVERYWAY_SV() {
        return (EAttribute)getCDEBIRTHDELIVERYWAY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDEBIRTHFOETALMONITORING() {
		if (cdebirthfoetalmonitoringEClass == null) {
			cdebirthfoetalmonitoringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(167);
		}
		return cdebirthfoetalmonitoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHFOETALMONITORING_Value() {
        return (EAttribute)getCDEBIRTHFOETALMONITORING().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHFOETALMONITORING_DN() {
        return (EAttribute)getCDEBIRTHFOETALMONITORING().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHFOETALMONITORING_L() {
        return (EAttribute)getCDEBIRTHFOETALMONITORING().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHFOETALMONITORING_S() {
        return (EAttribute)getCDEBIRTHFOETALMONITORING().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHFOETALMONITORING_SV() {
        return (EAttribute)getCDEBIRTHFOETALMONITORING().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDEBIRTHNEONATALDEPTTYPE() {
		if (cdebirthneonataldepttypeEClass == null) {
			cdebirthneonataldepttypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(170);
		}
		return cdebirthneonataldepttypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHNEONATALDEPTTYPE_Value() {
        return (EAttribute)getCDEBIRTHNEONATALDEPTTYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHNEONATALDEPTTYPE_DN() {
        return (EAttribute)getCDEBIRTHNEONATALDEPTTYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHNEONATALDEPTTYPE_L() {
        return (EAttribute)getCDEBIRTHNEONATALDEPTTYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHNEONATALDEPTTYPE_S() {
        return (EAttribute)getCDEBIRTHNEONATALDEPTTYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHNEONATALDEPTTYPE_SV() {
        return (EAttribute)getCDEBIRTHNEONATALDEPTTYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDEBIRTHPLACE() {
		if (cdebirthplaceEClass == null) {
			cdebirthplaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(173);
		}
		return cdebirthplaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHPLACE_Value() {
        return (EAttribute)getCDEBIRTHPLACE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHPLACE_DN() {
        return (EAttribute)getCDEBIRTHPLACE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHPLACE_L() {
        return (EAttribute)getCDEBIRTHPLACE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHPLACE_S() {
        return (EAttribute)getCDEBIRTHPLACE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHPLACE_SV() {
        return (EAttribute)getCDEBIRTHPLACE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDEBIRTHPREGNANCYORIGIN() {
		if (cdebirthpregnancyoriginEClass == null) {
			cdebirthpregnancyoriginEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(176);
		}
		return cdebirthpregnancyoriginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHPREGNANCYORIGIN_Value() {
        return (EAttribute)getCDEBIRTHPREGNANCYORIGIN().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHPREGNANCYORIGIN_DN() {
        return (EAttribute)getCDEBIRTHPREGNANCYORIGIN().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHPREGNANCYORIGIN_L() {
        return (EAttribute)getCDEBIRTHPREGNANCYORIGIN().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHPREGNANCYORIGIN_S() {
        return (EAttribute)getCDEBIRTHPREGNANCYORIGIN().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHPREGNANCYORIGIN_SV() {
        return (EAttribute)getCDEBIRTHPREGNANCYORIGIN().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDEBIRTHSPECIALVALUES() {
		if (cdebirthspecialvaluesEClass == null) {
			cdebirthspecialvaluesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(179);
		}
		return cdebirthspecialvaluesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHSPECIALVALUES_Value() {
        return (EAttribute)getCDEBIRTHSPECIALVALUES().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHSPECIALVALUES_DN() {
        return (EAttribute)getCDEBIRTHSPECIALVALUES().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHSPECIALVALUES_L() {
        return (EAttribute)getCDEBIRTHSPECIALVALUES().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHSPECIALVALUES_S() {
        return (EAttribute)getCDEBIRTHSPECIALVALUES().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEBIRTHSPECIALVALUES_SV() {
        return (EAttribute)getCDEBIRTHSPECIALVALUES().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDECG() {
		if (cdecgEClass == null) {
			cdecgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(182);
		}
		return cdecgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDECG_Value() {
        return (EAttribute)getCDECG().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDECG_DN() {
        return (EAttribute)getCDECG().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDECG_L() {
        return (EAttribute)getCDECG().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDECG_S() {
        return (EAttribute)getCDECG().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDECG_SV() {
        return (EAttribute)getCDECG().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDEMERGENCYEVALUATION() {
		if (cdemergencyevaluationEClass == null) {
			cdemergencyevaluationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(185);
		}
		return cdemergencyevaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEMERGENCYEVALUATION_Value() {
        return (EAttribute)getCDEMERGENCYEVALUATION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEMERGENCYEVALUATION_DN() {
        return (EAttribute)getCDEMERGENCYEVALUATION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEMERGENCYEVALUATION_L() {
        return (EAttribute)getCDEMERGENCYEVALUATION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEMERGENCYEVALUATION_S() {
        return (EAttribute)getCDEMERGENCYEVALUATION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEMERGENCYEVALUATION_SV() {
        return (EAttribute)getCDEMERGENCYEVALUATION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDEMPLOYMENTSITUATION() {
		if (cdemploymentsituationEClass == null) {
			cdemploymentsituationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(188);
		}
		return cdemploymentsituationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEMPLOYMENTSITUATION_Value() {
        return (EAttribute)getCDEMPLOYMENTSITUATION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEMPLOYMENTSITUATION_DN() {
        return (EAttribute)getCDEMPLOYMENTSITUATION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEMPLOYMENTSITUATION_L() {
        return (EAttribute)getCDEMPLOYMENTSITUATION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEMPLOYMENTSITUATION_S() {
        return (EAttribute)getCDEMPLOYMENTSITUATION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEMPLOYMENTSITUATION_SL() {
        return (EAttribute)getCDEMPLOYMENTSITUATION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEMPLOYMENTSITUATION_SV() {
        return (EAttribute)getCDEMPLOYMENTSITUATION().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDENCOUNTER() {
		if (cdencounterEClass == null) {
			cdencounterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(193);
		}
		return cdencounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCOUNTER_Value() {
        return (EAttribute)getCDENCOUNTER().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCOUNTER_DN() {
        return (EAttribute)getCDENCOUNTER().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCOUNTER_L() {
        return (EAttribute)getCDENCOUNTER().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCOUNTER_S() {
        return (EAttribute)getCDENCOUNTER().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCOUNTER_SV() {
        return (EAttribute)getCDENCOUNTER().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDENCOUNTERSAFETYISSUE() {
		if (cdencountersafetyissueEClass == null) {
			cdencountersafetyissueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(194);
		}
		return cdencountersafetyissueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCOUNTERSAFETYISSUE_Value() {
        return (EAttribute)getCDENCOUNTERSAFETYISSUE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCOUNTERSAFETYISSUE_DN() {
        return (EAttribute)getCDENCOUNTERSAFETYISSUE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCOUNTERSAFETYISSUE_L() {
        return (EAttribute)getCDENCOUNTERSAFETYISSUE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCOUNTERSAFETYISSUE_S() {
        return (EAttribute)getCDENCOUNTERSAFETYISSUE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCOUNTERSAFETYISSUE_SV() {
        return (EAttribute)getCDENCOUNTERSAFETYISSUE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDENCRYPTIONACTOR() {
		if (cdencryptionactorEClass == null) {
			cdencryptionactorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(199);
		}
		return cdencryptionactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCRYPTIONACTOR_Value() {
        return (EAttribute)getCDENCRYPTIONACTOR().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCRYPTIONACTOR_DN() {
        return (EAttribute)getCDENCRYPTIONACTOR().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCRYPTIONACTOR_L() {
        return (EAttribute)getCDENCRYPTIONACTOR().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCRYPTIONACTOR_S() {
        return (EAttribute)getCDENCRYPTIONACTOR().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCRYPTIONACTOR_SV() {
        return (EAttribute)getCDENCRYPTIONACTOR().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDENCRYPTIONMETHOD() {
		if (cdencryptionmethodEClass == null) {
			cdencryptionmethodEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(202);
		}
		return cdencryptionmethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCRYPTIONMETHOD_Value() {
        return (EAttribute)getCDENCRYPTIONMETHOD().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCRYPTIONMETHOD_DN() {
        return (EAttribute)getCDENCRYPTIONMETHOD().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCRYPTIONMETHOD_L() {
        return (EAttribute)getCDENCRYPTIONMETHOD().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCRYPTIONMETHOD_S() {
        return (EAttribute)getCDENCRYPTIONMETHOD().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDENCRYPTIONMETHOD_SV() {
        return (EAttribute)getCDENCRYPTIONMETHOD().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDERROR() {
		if (cderrorEClass == null) {
			cderrorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(207);
		}
		return cderrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDERROR_Value() {
        return (EAttribute)getCDERROR().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDERROR_DN() {
        return (EAttribute)getCDERROR().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDERROR_L() {
        return (EAttribute)getCDERROR().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDERROR_S() {
        return (EAttribute)getCDERROR().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDERROR_SL() {
        return (EAttribute)getCDERROR().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDERROR_SV() {
        return (EAttribute)getCDERROR().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDERRORMYCARENET() {
		if (cderrormycarenetEClass == null) {
			cderrormycarenetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(208);
		}
		return cderrormycarenetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDERRORMYCARENET_Value() {
        return (EAttribute)getCDERRORMYCARENET().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDERRORMYCARENET_DN() {
        return (EAttribute)getCDERRORMYCARENET().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDERRORMYCARENET_L() {
        return (EAttribute)getCDERRORMYCARENET().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDERRORMYCARENET_S() {
        return (EAttribute)getCDERRORMYCARENET().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDERRORMYCARENET_SL() {
        return (EAttribute)getCDERRORMYCARENET().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDERRORMYCARENET_SV() {
        return (EAttribute)getCDERRORMYCARENET().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDEXTERNALSOURCE() {
		if (cdexternalsourceEClass == null) {
			cdexternalsourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(214);
		}
		return cdexternalsourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEXTERNALSOURCE_Value() {
        return (EAttribute)getCDEXTERNALSOURCE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEXTERNALSOURCE_DN() {
        return (EAttribute)getCDEXTERNALSOURCE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEXTERNALSOURCE_L() {
        return (EAttribute)getCDEXTERNALSOURCE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEXTERNALSOURCE_S() {
        return (EAttribute)getCDEXTERNALSOURCE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEXTERNALSOURCE_SL() {
        return (EAttribute)getCDEXTERNALSOURCE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDEXTERNALSOURCE_SV() {
        return (EAttribute)getCDEXTERNALSOURCE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDFORMULARY() {
		if (cdformularyEClass == null) {
			cdformularyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(220);
		}
		return cdformularyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDFORMULARY_Value() {
        return (EAttribute)getCDFORMULARY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDFORMULARY_DN() {
        return (EAttribute)getCDFORMULARY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDFORMULARY_L() {
        return (EAttribute)getCDFORMULARY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDFORMULARY_S() {
        return (EAttribute)getCDFORMULARY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDFORMULARY_SV() {
        return (EAttribute)getCDFORMULARY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDGALENICFORM() {
		if (cdgalenicformEClass == null) {
			cdgalenicformEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(223);
		}
		return cdgalenicformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDGALENICFORM_Value() {
        return (EAttribute)getCDGALENICFORM().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDGALENICFORM_DN() {
        return (EAttribute)getCDGALENICFORM().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDGALENICFORM_L() {
        return (EAttribute)getCDGALENICFORM().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDGALENICFORM_S() {
        return (EAttribute)getCDGALENICFORM().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDGALENICFORM_SV() {
        return (EAttribute)getCDGALENICFORM().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDHCPARTY() {
		if (cdhcpartyEClass == null) {
			cdhcpartyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(226);
		}
		return cdhcpartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHCPARTY_Value() {
        return (EAttribute)getCDHCPARTY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHCPARTY_DN() {
        return (EAttribute)getCDHCPARTY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHCPARTY_L() {
        return (EAttribute)getCDHCPARTY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHCPARTY_S() {
        return (EAttribute)getCDHCPARTY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHCPARTY_SL() {
        return (EAttribute)getCDHCPARTY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHCPARTY_SV() {
        return (EAttribute)getCDHCPARTY().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDHEADING() {
		if (cdheadingEClass == null) {
			cdheadingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(231);
		}
		return cdheadingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHEADING_Value() {
        return (EAttribute)getCDHEADING().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHEADING_DN() {
        return (EAttribute)getCDHEADING().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHEADING_L() {
        return (EAttribute)getCDHEADING().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHEADING_S() {
        return (EAttribute)getCDHEADING().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHEADING_SL() {
        return (EAttribute)getCDHEADING().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHEADING_SV() {
        return (EAttribute)getCDHEADING().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDHEADINGREG() {
		if (cdheadingregEClass == null) {
			cdheadingregEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(233);
		}
		return cdheadingregEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHEADINGREG_Value() {
        return (EAttribute)getCDHEADINGREG().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHEADINGREG_DN() {
        return (EAttribute)getCDHEADINGREG().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHEADINGREG_L() {
        return (EAttribute)getCDHEADINGREG().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHEADINGREG_S() {
        return (EAttribute)getCDHEADINGREG().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHEADINGREG_SL() {
        return (EAttribute)getCDHEADINGREG().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDHEADINGREG_SV() {
        return (EAttribute)getCDHEADINGREG().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDIMPLANTATIONDEVICE() {
		if (cdimplantationdeviceEClass == null) {
			cdimplantationdeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(240);
		}
		return cdimplantationdeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDIMPLANTATIONDEVICE_Value() {
        return (EAttribute)getCDIMPLANTATIONDEVICE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDIMPLANTATIONDEVICE_DN() {
        return (EAttribute)getCDIMPLANTATIONDEVICE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDIMPLANTATIONDEVICE_L() {
        return (EAttribute)getCDIMPLANTATIONDEVICE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDIMPLANTATIONDEVICE_S() {
        return (EAttribute)getCDIMPLANTATIONDEVICE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDIMPLANTATIONDEVICE_SL() {
        return (EAttribute)getCDIMPLANTATIONDEVICE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDIMPLANTATIONDEVICE_SV() {
        return (EAttribute)getCDIMPLANTATIONDEVICE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDIMPLANTATIONTYPE() {
		if (cdimplantationtypeEClass == null) {
			cdimplantationtypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(243);
		}
		return cdimplantationtypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDIMPLANTATIONTYPE_Value() {
        return (EAttribute)getCDIMPLANTATIONTYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDIMPLANTATIONTYPE_DN() {
        return (EAttribute)getCDIMPLANTATIONTYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDIMPLANTATIONTYPE_L() {
        return (EAttribute)getCDIMPLANTATIONTYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDIMPLANTATIONTYPE_S() {
        return (EAttribute)getCDIMPLANTATIONTYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDIMPLANTATIONTYPE_SL() {
        return (EAttribute)getCDIMPLANTATIONTYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDIMPLANTATIONTYPE_SV() {
        return (EAttribute)getCDIMPLANTATIONTYPE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDINCAPACITY() {
		if (cdincapacityEClass == null) {
			cdincapacityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(246);
		}
		return cdincapacityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINCAPACITY_Value() {
        return (EAttribute)getCDINCAPACITY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINCAPACITY_DN() {
        return (EAttribute)getCDINCAPACITY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINCAPACITY_L() {
        return (EAttribute)getCDINCAPACITY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINCAPACITY_S() {
        return (EAttribute)getCDINCAPACITY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINCAPACITY_SV() {
        return (EAttribute)getCDINCAPACITY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDINCAPACITYREASON() {
		if (cdincapacityreasonEClass == null) {
			cdincapacityreasonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(247);
		}
		return cdincapacityreasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINCAPACITYREASON_Value() {
        return (EAttribute)getCDINCAPACITYREASON().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINCAPACITYREASON_DN() {
        return (EAttribute)getCDINCAPACITYREASON().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINCAPACITYREASON_L() {
        return (EAttribute)getCDINCAPACITYREASON().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINCAPACITYREASON_S() {
        return (EAttribute)getCDINCAPACITYREASON().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINCAPACITYREASON_SV() {
        return (EAttribute)getCDINCAPACITYREASON().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDINNCLUSTER() {
		if (cdinnclusterEClass == null) {
			cdinnclusterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(252);
		}
		return cdinnclusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINNCLUSTER_Value() {
        return (EAttribute)getCDINNCLUSTER().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINNCLUSTER_DN() {
        return (EAttribute)getCDINNCLUSTER().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINNCLUSTER_L() {
        return (EAttribute)getCDINNCLUSTER().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINNCLUSTER_S() {
        return (EAttribute)getCDINNCLUSTER().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDINNCLUSTER_SV() {
        return (EAttribute)getCDINNCLUSTER().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDITEM() {
		if (cditemEClass == null) {
			cditemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(256);
		}
		return cditemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEM_Value() {
        return (EAttribute)getCDITEM().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEM_DN() {
        return (EAttribute)getCDITEM().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEM_L() {
        return (EAttribute)getCDITEM().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEM_NullFlavor() {
        return (EAttribute)getCDITEM().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEM_S() {
        return (EAttribute)getCDITEM().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEM_SL() {
        return (EAttribute)getCDITEM().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEM_SV() {
        return (EAttribute)getCDITEM().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDITEMBVT() {
		if (cditembvtEClass == null) {
			cditembvtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(257);
		}
		return cditembvtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMBVT_Value() {
        return (EAttribute)getCDITEMBVT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMBVT_DN() {
        return (EAttribute)getCDITEMBVT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMBVT_L() {
        return (EAttribute)getCDITEMBVT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMBVT_S() {
        return (EAttribute)getCDITEMBVT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMBVT_SL() {
        return (EAttribute)getCDITEMBVT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMBVT_SV() {
        return (EAttribute)getCDITEMBVT().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDITEMCARENET() {
		if (cditemcarenetEClass == null) {
			cditemcarenetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(260);
		}
		return cditemcarenetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMCARENET_Value() {
        return (EAttribute)getCDITEMCARENET().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMCARENET_DN() {
        return (EAttribute)getCDITEMCARENET().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMCARENET_L() {
        return (EAttribute)getCDITEMCARENET().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMCARENET_S() {
        return (EAttribute)getCDITEMCARENET().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMCARENET_SL() {
        return (EAttribute)getCDITEMCARENET().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMCARENET_SV() {
        return (EAttribute)getCDITEMCARENET().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDITEMEBIRTH() {
		if (cditemebirthEClass == null) {
			cditemebirthEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(263);
		}
		return cditemebirthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMEBIRTH_Value() {
        return (EAttribute)getCDITEMEBIRTH().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMEBIRTH_DN() {
        return (EAttribute)getCDITEMEBIRTH().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMEBIRTH_L() {
        return (EAttribute)getCDITEMEBIRTH().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMEBIRTH_S() {
        return (EAttribute)getCDITEMEBIRTH().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMEBIRTH_SL() {
        return (EAttribute)getCDITEMEBIRTH().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMEBIRTH_SV() {
        return (EAttribute)getCDITEMEBIRTH().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDITEMMAA() {
		if (cditemmaaEClass == null) {
			cditemmaaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(266);
		}
		return cditemmaaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMAA_Value() {
        return (EAttribute)getCDITEMMAA().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMAA_DN() {
        return (EAttribute)getCDITEMMAA().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMAA_L() {
        return (EAttribute)getCDITEMMAA().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMAA_S() {
        return (EAttribute)getCDITEMMAA().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMAA_SL() {
        return (EAttribute)getCDITEMMAA().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMAA_SV() {
        return (EAttribute)getCDITEMMAA().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDITEMMS() {
		if (cditemmsEClass == null) {
			cditemmsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(269);
		}
		return cditemmsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMS_Value() {
        return (EAttribute)getCDITEMMS().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMS_DN() {
        return (EAttribute)getCDITEMMS().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMS_L() {
        return (EAttribute)getCDITEMMS().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMS_S() {
        return (EAttribute)getCDITEMMS().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMS_SL() {
        return (EAttribute)getCDITEMMS().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMS_SV() {
        return (EAttribute)getCDITEMMS().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDITEMMYCARENET() {
		if (cditemmycarenetEClass == null) {
			cditemmycarenetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(272);
		}
		return cditemmycarenetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMYCARENET_Value() {
        return (EAttribute)getCDITEMMYCARENET().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMYCARENET_DN() {
        return (EAttribute)getCDITEMMYCARENET().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMYCARENET_L() {
        return (EAttribute)getCDITEMMYCARENET().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMYCARENET_S() {
        return (EAttribute)getCDITEMMYCARENET().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMYCARENET_SL() {
        return (EAttribute)getCDITEMMYCARENET().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMMYCARENET_SV() {
        return (EAttribute)getCDITEMMYCARENET().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDITEMREG() {
		if (cditemregEClass == null) {
			cditemregEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(275);
		}
		return cditemregEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMREG_Value() {
        return (EAttribute)getCDITEMREG().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMREG_DN() {
        return (EAttribute)getCDITEMREG().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMREG_L() {
        return (EAttribute)getCDITEMREG().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMREG_S() {
        return (EAttribute)getCDITEMREG().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMREG_SL() {
        return (EAttribute)getCDITEMREG().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDITEMREG_SV() {
        return (EAttribute)getCDITEMREG().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDLAB() {
		if (cdlabEClass == null) {
			cdlabEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(282);
		}
		return cdlabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLAB_Value() {
        return (EAttribute)getCDLAB().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLAB_DN() {
        return (EAttribute)getCDLAB().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLAB_L() {
        return (EAttribute)getCDLAB().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLAB_S() {
        return (EAttribute)getCDLAB().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLAB_SV() {
        return (EAttribute)getCDLAB().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDLEGALSERVICE() {
		if (cdlegalserviceEClass == null) {
			cdlegalserviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(284);
		}
		return cdlegalserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLEGALSERVICE_Value() {
        return (EAttribute)getCDLEGALSERVICE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLEGALSERVICE_DN() {
        return (EAttribute)getCDLEGALSERVICE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLEGALSERVICE_L() {
        return (EAttribute)getCDLEGALSERVICE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLEGALSERVICE_S() {
        return (EAttribute)getCDLEGALSERVICE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLEGALSERVICE_SV() {
        return (EAttribute)getCDLEGALSERVICE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDLIFECYCLE() {
		if (cdlifecycleEClass == null) {
			cdlifecycleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(287);
		}
		return cdlifecycleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLIFECYCLE_Value() {
        return (EAttribute)getCDLIFECYCLE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLIFECYCLE_DN() {
        return (EAttribute)getCDLIFECYCLE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLIFECYCLE_L() {
        return (EAttribute)getCDLIFECYCLE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLIFECYCLE_S() {
        return (EAttribute)getCDLIFECYCLE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDLIFECYCLE_SV() {
        return (EAttribute)getCDLIFECYCLE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMAACOVERAGETYPE() {
		if (cdmaacoveragetypeEClass == null) {
			cdmaacoveragetypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(292);
		}
		return cdmaacoveragetypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAACOVERAGETYPE_Value() {
        return (EAttribute)getCDMAACOVERAGETYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAACOVERAGETYPE_DN() {
        return (EAttribute)getCDMAACOVERAGETYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAACOVERAGETYPE_L() {
        return (EAttribute)getCDMAACOVERAGETYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAACOVERAGETYPE_S() {
        return (EAttribute)getCDMAACOVERAGETYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAACOVERAGETYPE_SV() {
        return (EAttribute)getCDMAACOVERAGETYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMAAREFUSALJUSTIFICATION() {
		if (cdmaarefusaljustificationEClass == null) {
			cdmaarefusaljustificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(295);
		}
		return cdmaarefusaljustificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAAREFUSALJUSTIFICATION_Value() {
        return (EAttribute)getCDMAAREFUSALJUSTIFICATION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAAREFUSALJUSTIFICATION_DN() {
        return (EAttribute)getCDMAAREFUSALJUSTIFICATION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAAREFUSALJUSTIFICATION_L() {
        return (EAttribute)getCDMAAREFUSALJUSTIFICATION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAAREFUSALJUSTIFICATION_S() {
        return (EAttribute)getCDMAAREFUSALJUSTIFICATION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAAREFUSALJUSTIFICATION_SV() {
        return (EAttribute)getCDMAAREFUSALJUSTIFICATION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMAAREQUESTTYPE() {
		if (cdmaarequesttypeEClass == null) {
			cdmaarequesttypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(298);
		}
		return cdmaarequesttypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAAREQUESTTYPE_Value() {
        return (EAttribute)getCDMAAREQUESTTYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAAREQUESTTYPE_DN() {
        return (EAttribute)getCDMAAREQUESTTYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAAREQUESTTYPE_L() {
        return (EAttribute)getCDMAAREQUESTTYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAAREQUESTTYPE_S() {
        return (EAttribute)getCDMAAREQUESTTYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAAREQUESTTYPE_SV() {
        return (EAttribute)getCDMAAREQUESTTYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMAARESPONSETYPE() {
		if (cdmaaresponsetypeEClass == null) {
			cdmaaresponsetypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(301);
		}
		return cdmaaresponsetypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAARESPONSETYPE_Value() {
        return (EAttribute)getCDMAARESPONSETYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAARESPONSETYPE_DN() {
        return (EAttribute)getCDMAARESPONSETYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAARESPONSETYPE_L() {
        return (EAttribute)getCDMAARESPONSETYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAARESPONSETYPE_S() {
        return (EAttribute)getCDMAARESPONSETYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAARESPONSETYPE_SV() {
        return (EAttribute)getCDMAARESPONSETYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMAATYPE() {
		if (cdmaatypeEClass == null) {
			cdmaatypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(304);
		}
		return cdmaatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAATYPE_Value() {
        return (EAttribute)getCDMAATYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAATYPE_DN() {
        return (EAttribute)getCDMAATYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAATYPE_L() {
        return (EAttribute)getCDMAATYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAATYPE_S() {
        return (EAttribute)getCDMAATYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMAATYPE_SV() {
        return (EAttribute)getCDMAATYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMEDICATION() {
		if (cdmedicationEClass == null) {
			cdmedicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(309);
		}
		return cdmedicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMEDICATION_Value() {
        return (EAttribute)getCDMEDICATION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMEDICATION_DN() {
        return (EAttribute)getCDMEDICATION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMEDICATION_L() {
        return (EAttribute)getCDMEDICATION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMEDICATION_S() {
        return (EAttribute)getCDMEDICATION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMEDICATION_SL() {
        return (EAttribute)getCDMEDICATION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMEDICATION_SV() {
        return (EAttribute)getCDMEDICATION().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMESSAGE() {
		if (cdmessageEClass == null) {
			cdmessageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(312);
		}
		return cdmessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMESSAGE_Value() {
        return (EAttribute)getCDMESSAGE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMESSAGE_DN() {
        return (EAttribute)getCDMESSAGE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMESSAGE_L() {
        return (EAttribute)getCDMESSAGE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMESSAGE_S() {
        return (EAttribute)getCDMESSAGE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMESSAGE_SV() {
        return (EAttribute)getCDMESSAGE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMICROORGANISM() {
		if (cdmicroorganismEClass == null) {
			cdmicroorganismEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(315);
		}
		return cdmicroorganismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMICROORGANISM_Value() {
        return (EAttribute)getCDMICROORGANISM().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMICROORGANISM_DN() {
        return (EAttribute)getCDMICROORGANISM().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMICROORGANISM_L() {
        return (EAttribute)getCDMICROORGANISM().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMICROORGANISM_S() {
        return (EAttribute)getCDMICROORGANISM().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMICROORGANISM_SV() {
        return (EAttribute)getCDMICROORGANISM().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMKGADMISSION() {
		if (cdmkgadmissionEClass == null) {
			cdmkgadmissionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(318);
		}
		return cdmkgadmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGADMISSION_Value() {
        return (EAttribute)getCDMKGADMISSION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGADMISSION_DN() {
        return (EAttribute)getCDMKGADMISSION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGADMISSION_L() {
        return (EAttribute)getCDMKGADMISSION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGADMISSION_S() {
        return (EAttribute)getCDMKGADMISSION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGADMISSION_SV() {
        return (EAttribute)getCDMKGADMISSION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMKGDESTINATION() {
		if (cdmkgdestinationEClass == null) {
			cdmkgdestinationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(321);
		}
		return cdmkgdestinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGDESTINATION_Value() {
        return (EAttribute)getCDMKGDESTINATION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGDESTINATION_DN() {
        return (EAttribute)getCDMKGDESTINATION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGDESTINATION_L() {
        return (EAttribute)getCDMKGDESTINATION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGDESTINATION_S() {
        return (EAttribute)getCDMKGDESTINATION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGDESTINATION_SV() {
        return (EAttribute)getCDMKGDESTINATION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMKGDISCHARGE() {
		if (cdmkgdischargeEClass == null) {
			cdmkgdischargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(324);
		}
		return cdmkgdischargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGDISCHARGE_Value() {
        return (EAttribute)getCDMKGDISCHARGE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGDISCHARGE_DN() {
        return (EAttribute)getCDMKGDISCHARGE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGDISCHARGE_L() {
        return (EAttribute)getCDMKGDISCHARGE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGDISCHARGE_S() {
        return (EAttribute)getCDMKGDISCHARGE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGDISCHARGE_SV() {
        return (EAttribute)getCDMKGDISCHARGE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMKGORIGIN() {
		if (cdmkgoriginEClass == null) {
			cdmkgoriginEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(327);
		}
		return cdmkgoriginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGORIGIN_Value() {
        return (EAttribute)getCDMKGORIGIN().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGORIGIN_DN() {
        return (EAttribute)getCDMKGORIGIN().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGORIGIN_L() {
        return (EAttribute)getCDMKGORIGIN().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGORIGIN_S() {
        return (EAttribute)getCDMKGORIGIN().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGORIGIN_SV() {
        return (EAttribute)getCDMKGORIGIN().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMKGREFERRER() {
		if (cdmkgreferrerEClass == null) {
			cdmkgreferrerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(330);
		}
		return cdmkgreferrerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGREFERRER_Value() {
        return (EAttribute)getCDMKGREFERRER().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGREFERRER_DN() {
        return (EAttribute)getCDMKGREFERRER().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGREFERRER_L() {
        return (EAttribute)getCDMKGREFERRER().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGREFERRER_S() {
        return (EAttribute)getCDMKGREFERRER().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMKGREFERRER_SV() {
        return (EAttribute)getCDMKGREFERRER().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMSADAPTATION() {
		if (cdmsadaptationEClass == null) {
			cdmsadaptationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(333);
		}
		return cdmsadaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSADAPTATION_Value() {
        return (EAttribute)getCDMSADAPTATION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSADAPTATION_DN() {
        return (EAttribute)getCDMSADAPTATION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSADAPTATION_L() {
        return (EAttribute)getCDMSADAPTATION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSADAPTATION_S() {
        return (EAttribute)getCDMSADAPTATION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSADAPTATION_SL() {
        return (EAttribute)getCDMSADAPTATION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSADAPTATION_SV() {
        return (EAttribute)getCDMSADAPTATION().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMSMEDICATIONTYPE() {
		if (cdmsmedicationtypeEClass == null) {
			cdmsmedicationtypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(336);
		}
		return cdmsmedicationtypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSMEDICATIONTYPE_Value() {
        return (EAttribute)getCDMSMEDICATIONTYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSMEDICATIONTYPE_DN() {
        return (EAttribute)getCDMSMEDICATIONTYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSMEDICATIONTYPE_L() {
        return (EAttribute)getCDMSMEDICATIONTYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSMEDICATIONTYPE_S() {
        return (EAttribute)getCDMSMEDICATIONTYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSMEDICATIONTYPE_SL() {
        return (EAttribute)getCDMSMEDICATIONTYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSMEDICATIONTYPE_SV() {
        return (EAttribute)getCDMSMEDICATIONTYPE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMSORIGIN() {
		if (cdmsoriginEClass == null) {
			cdmsoriginEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(339);
		}
		return cdmsoriginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSORIGIN_Value() {
        return (EAttribute)getCDMSORIGIN().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSORIGIN_DN() {
        return (EAttribute)getCDMSORIGIN().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSORIGIN_L() {
        return (EAttribute)getCDMSORIGIN().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSORIGIN_S() {
        return (EAttribute)getCDMSORIGIN().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSORIGIN_SL() {
        return (EAttribute)getCDMSORIGIN().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMSORIGIN_SV() {
        return (EAttribute)getCDMSORIGIN().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDMYCARENETJUSTIFICATION() {
		if (cdmycarenetjustificationEClass == null) {
			cdmycarenetjustificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(342);
		}
		return cdmycarenetjustificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMYCARENETJUSTIFICATION_Value() {
        return (EAttribute)getCDMYCARENETJUSTIFICATION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMYCARENETJUSTIFICATION_DN() {
        return (EAttribute)getCDMYCARENETJUSTIFICATION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMYCARENETJUSTIFICATION_L() {
        return (EAttribute)getCDMYCARENETJUSTIFICATION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMYCARENETJUSTIFICATION_S() {
        return (EAttribute)getCDMYCARENETJUSTIFICATION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMYCARENETJUSTIFICATION_SL() {
        return (EAttribute)getCDMYCARENETJUSTIFICATION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDMYCARENETJUSTIFICATION_SV() {
        return (EAttribute)getCDMYCARENETJUSTIFICATION().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDORTHOAPPROACH() {
		if (cdorthoapproachEClass == null) {
			cdorthoapproachEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(344);
		}
		return cdorthoapproachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOAPPROACH_Value() {
        return (EAttribute)getCDORTHOAPPROACH().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOAPPROACH_DN() {
        return (EAttribute)getCDORTHOAPPROACH().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOAPPROACH_L() {
        return (EAttribute)getCDORTHOAPPROACH().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOAPPROACH_S() {
        return (EAttribute)getCDORTHOAPPROACH().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOAPPROACH_SL() {
        return (EAttribute)getCDORTHOAPPROACH().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOAPPROACH_SV() {
        return (EAttribute)getCDORTHOAPPROACH().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDORTHODIAGNOSIS() {
		if (cdorthodiagnosisEClass == null) {
			cdorthodiagnosisEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(347);
		}
		return cdorthodiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHODIAGNOSIS_Value() {
        return (EAttribute)getCDORTHODIAGNOSIS().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHODIAGNOSIS_DN() {
        return (EAttribute)getCDORTHODIAGNOSIS().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHODIAGNOSIS_L() {
        return (EAttribute)getCDORTHODIAGNOSIS().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHODIAGNOSIS_S() {
        return (EAttribute)getCDORTHODIAGNOSIS().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHODIAGNOSIS_SL() {
        return (EAttribute)getCDORTHODIAGNOSIS().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHODIAGNOSIS_SV() {
        return (EAttribute)getCDORTHODIAGNOSIS().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDORTHOGRAFT() {
		if (cdorthograftEClass == null) {
			cdorthograftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(350);
		}
		return cdorthograftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOGRAFT_Value() {
        return (EAttribute)getCDORTHOGRAFT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOGRAFT_DN() {
        return (EAttribute)getCDORTHOGRAFT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOGRAFT_L() {
        return (EAttribute)getCDORTHOGRAFT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOGRAFT_S() {
        return (EAttribute)getCDORTHOGRAFT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOGRAFT_SL() {
        return (EAttribute)getCDORTHOGRAFT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOGRAFT_SV() {
        return (EAttribute)getCDORTHOGRAFT().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDORTHOINTERFACE() {
		if (cdorthointerfaceEClass == null) {
			cdorthointerfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(353);
		}
		return cdorthointerfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOINTERFACE_Value() {
        return (EAttribute)getCDORTHOINTERFACE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOINTERFACE_DN() {
        return (EAttribute)getCDORTHOINTERFACE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOINTERFACE_L() {
        return (EAttribute)getCDORTHOINTERFACE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOINTERFACE_S() {
        return (EAttribute)getCDORTHOINTERFACE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOINTERFACE_SL() {
        return (EAttribute)getCDORTHOINTERFACE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOINTERFACE_SV() {
        return (EAttribute)getCDORTHOINTERFACE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDORTHOKNEEINSERT() {
		if (cdorthokneeinsertEClass == null) {
			cdorthokneeinsertEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(356);
		}
		return cdorthokneeinsertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOKNEEINSERT_Value() {
        return (EAttribute)getCDORTHOKNEEINSERT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOKNEEINSERT_DN() {
        return (EAttribute)getCDORTHOKNEEINSERT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOKNEEINSERT_L() {
        return (EAttribute)getCDORTHOKNEEINSERT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOKNEEINSERT_S() {
        return (EAttribute)getCDORTHOKNEEINSERT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOKNEEINSERT_SL() {
        return (EAttribute)getCDORTHOKNEEINSERT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOKNEEINSERT_SV() {
        return (EAttribute)getCDORTHOKNEEINSERT().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDORTHONAVCOM() {
		if (cdorthonavcomEClass == null) {
			cdorthonavcomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(359);
		}
		return cdorthonavcomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHONAVCOM_Value() {
        return (EAttribute)getCDORTHONAVCOM().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHONAVCOM_DN() {
        return (EAttribute)getCDORTHONAVCOM().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHONAVCOM_L() {
        return (EAttribute)getCDORTHONAVCOM().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHONAVCOM_S() {
        return (EAttribute)getCDORTHONAVCOM().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHONAVCOM_SL() {
        return (EAttribute)getCDORTHONAVCOM().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHONAVCOM_SV() {
        return (EAttribute)getCDORTHONAVCOM().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDORTHOTECHREVISION() {
		if (cdorthotechrevisionEClass == null) {
			cdorthotechrevisionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(362);
		}
		return cdorthotechrevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOTECHREVISION_Value() {
        return (EAttribute)getCDORTHOTECHREVISION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOTECHREVISION_DN() {
        return (EAttribute)getCDORTHOTECHREVISION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOTECHREVISION_L() {
        return (EAttribute)getCDORTHOTECHREVISION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOTECHREVISION_S() {
        return (EAttribute)getCDORTHOTECHREVISION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOTECHREVISION_SL() {
        return (EAttribute)getCDORTHOTECHREVISION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOTECHREVISION_SV() {
        return (EAttribute)getCDORTHOTECHREVISION().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDORTHOTYPE() {
		if (cdorthotypeEClass == null) {
			cdorthotypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(365);
		}
		return cdorthotypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOTYPE_Value() {
        return (EAttribute)getCDORTHOTYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOTYPE_DN() {
        return (EAttribute)getCDORTHOTYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOTYPE_L() {
        return (EAttribute)getCDORTHOTYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOTYPE_S() {
        return (EAttribute)getCDORTHOTYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOTYPE_SL() {
        return (EAttribute)getCDORTHOTYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDORTHOTYPE_SV() {
        return (EAttribute)getCDORTHOTYPE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDPARAMETER() {
		if (cdparameterEClass == null) {
			cdparameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(368);
		}
		return cdparameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPARAMETER_Value() {
        return (EAttribute)getCDPARAMETER().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPARAMETER_DN() {
        return (EAttribute)getCDPARAMETER().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPARAMETER_L() {
        return (EAttribute)getCDPARAMETER().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPARAMETER_S() {
        return (EAttribute)getCDPARAMETER().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPARAMETER_SV() {
        return (EAttribute)getCDPARAMETER().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDPATIENTWILL() {
		if (cdpatientwillEClass == null) {
			cdpatientwillEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(371);
		}
		return cdpatientwillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILL_Value() {
        return (EAttribute)getCDPATIENTWILL().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILL_DN() {
        return (EAttribute)getCDPATIENTWILL().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILL_L() {
        return (EAttribute)getCDPATIENTWILL().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILL_S() {
        return (EAttribute)getCDPATIENTWILL().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILL_SV() {
        return (EAttribute)getCDPATIENTWILL().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDPATIENTWILLHOSP() {
		if (cdpatientwillhospEClass == null) {
			cdpatientwillhospEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(372);
		}
		return cdpatientwillhospEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILLHOSP_Value() {
        return (EAttribute)getCDPATIENTWILLHOSP().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILLHOSP_DN() {
        return (EAttribute)getCDPATIENTWILLHOSP().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILLHOSP_L() {
        return (EAttribute)getCDPATIENTWILLHOSP().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILLHOSP_S() {
        return (EAttribute)getCDPATIENTWILLHOSP().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILLHOSP_SV() {
        return (EAttribute)getCDPATIENTWILLHOSP().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDPATIENTWILLRES() {
		if (cdpatientwillresEClass == null) {
			cdpatientwillresEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(375);
		}
		return cdpatientwillresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILLRES_Value() {
        return (EAttribute)getCDPATIENTWILLRES().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILLRES_DN() {
        return (EAttribute)getCDPATIENTWILLRES().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILLRES_L() {
        return (EAttribute)getCDPATIENTWILLRES().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILLRES_S() {
        return (EAttribute)getCDPATIENTWILLRES().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPATIENTWILLRES_SV() {
        return (EAttribute)getCDPATIENTWILLRES().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDPERIODICITY() {
		if (cdperiodicityEClass == null) {
			cdperiodicityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(380);
		}
		return cdperiodicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPERIODICITY_Value() {
        return (EAttribute)getCDPERIODICITY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPERIODICITY_DN() {
        return (EAttribute)getCDPERIODICITY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPERIODICITY_L() {
        return (EAttribute)getCDPERIODICITY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPERIODICITY_S() {
        return (EAttribute)getCDPERIODICITY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPERIODICITY_SV() {
        return (EAttribute)getCDPERIODICITY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDPROOF() {
		if (cdproofEClass == null) {
			cdproofEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(382);
		}
		return cdproofEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPROOF_Value() {
        return (EAttribute)getCDPROOF().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPROOF_DN() {
        return (EAttribute)getCDPROOF().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPROOF_L() {
        return (EAttribute)getCDPROOF().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPROOF_S() {
        return (EAttribute)getCDPROOF().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPROOF_SL() {
        return (EAttribute)getCDPROOF().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDPROOF_SV() {
        return (EAttribute)getCDPROOF().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDQUANTITYPREFIX() {
		if (cdquantityprefixEClass == null) {
			cdquantityprefixEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(386);
		}
		return cdquantityprefixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDQUANTITYPREFIX_Value() {
        return (EAttribute)getCDQUANTITYPREFIX().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDQUANTITYPREFIX_DN() {
        return (EAttribute)getCDQUANTITYPREFIX().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDQUANTITYPREFIX_L() {
        return (EAttribute)getCDQUANTITYPREFIX().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDQUANTITYPREFIX_S() {
        return (EAttribute)getCDQUANTITYPREFIX().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDQUANTITYPREFIX_SV() {
        return (EAttribute)getCDQUANTITYPREFIX().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDREFSCOPE() {
		if (cdrefscopeEClass == null) {
			cdrefscopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(389);
		}
		return cdrefscopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREFSCOPE_Value() {
        return (EAttribute)getCDREFSCOPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREFSCOPE_DN() {
        return (EAttribute)getCDREFSCOPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREFSCOPE_L() {
        return (EAttribute)getCDREFSCOPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREFSCOPE_S() {
        return (EAttribute)getCDREFSCOPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREFSCOPE_SV() {
        return (EAttribute)getCDREFSCOPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDREIMBURSEMENTNOMENCLATURE() {
		if (cdreimbursementnomenclatureEClass == null) {
			cdreimbursementnomenclatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(393);
		}
		return cdreimbursementnomenclatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREIMBURSEMENTNOMENCLATURE_Value() {
        return (EAttribute)getCDREIMBURSEMENTNOMENCLATURE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREIMBURSEMENTNOMENCLATURE_DN() {
        return (EAttribute)getCDREIMBURSEMENTNOMENCLATURE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREIMBURSEMENTNOMENCLATURE_L() {
        return (EAttribute)getCDREIMBURSEMENTNOMENCLATURE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREIMBURSEMENTNOMENCLATURE_S() {
        return (EAttribute)getCDREIMBURSEMENTNOMENCLATURE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREIMBURSEMENTNOMENCLATURE_SL() {
        return (EAttribute)getCDREIMBURSEMENTNOMENCLATURE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREIMBURSEMENTNOMENCLATURE_SV() {
        return (EAttribute)getCDREIMBURSEMENTNOMENCLATURE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDREVCOMPONENT() {
		if (cdrevcomponentEClass == null) {
			cdrevcomponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(395);
		}
		return cdrevcomponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREVCOMPONENT_Value() {
        return (EAttribute)getCDREVCOMPONENT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREVCOMPONENT_DN() {
        return (EAttribute)getCDREVCOMPONENT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREVCOMPONENT_L() {
        return (EAttribute)getCDREVCOMPONENT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREVCOMPONENT_S() {
        return (EAttribute)getCDREVCOMPONENT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREVCOMPONENT_SL() {
        return (EAttribute)getCDREVCOMPONENT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDREVCOMPONENT_SV() {
        return (EAttribute)getCDREVCOMPONENT().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDSEVERITY() {
		if (cdseverityEClass == null) {
			cdseverityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(398);
		}
		return cdseverityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSEVERITY_Value() {
        return (EAttribute)getCDSEVERITY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSEVERITY_DN() {
        return (EAttribute)getCDSEVERITY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSEVERITY_L() {
        return (EAttribute)getCDSEVERITY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSEVERITY_S() {
        return (EAttribute)getCDSEVERITY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSEVERITY_SV() {
        return (EAttribute)getCDSEVERITY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDSEX() {
		if (cdsexEClass == null) {
			cdsexEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(403);
		}
		return cdsexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSEX_Value() {
        return (EAttribute)getCDSEX().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSEX_DN() {
        return (EAttribute)getCDSEX().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSEX_L() {
        return (EAttribute)getCDSEX().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSEX_S() {
        return (EAttribute)getCDSEX().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSEX_SV() {
        return (EAttribute)getCDSEX().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDSITE() {
		if (cdsiteEClass == null) {
			cdsiteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(406);
		}
		return cdsiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSITE_Value() {
        return (EAttribute)getCDSITE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSITE_DN() {
        return (EAttribute)getCDSITE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSITE_L() {
        return (EAttribute)getCDSITE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSITE_S() {
        return (EAttribute)getCDSITE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSITE_SV() {
        return (EAttribute)getCDSITE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDSNOMED() {
		if (cdsnomedEClass == null) {
			cdsnomedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(411);
		}
		return cdsnomedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSNOMED_Value() {
        return (EAttribute)getCDSNOMED().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSNOMED_DN() {
        return (EAttribute)getCDSNOMED().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSNOMED_L() {
        return (EAttribute)getCDSNOMED().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSNOMED_S() {
        return (EAttribute)getCDSNOMED().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSNOMED_SV() {
        return (EAttribute)getCDSNOMED().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDSTANDARD() {
		if (cdstandardEClass == null) {
			cdstandardEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(413);
		}
		return cdstandardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTANDARD_Value() {
        return (EAttribute)getCDSTANDARD().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTANDARD_DN() {
        return (EAttribute)getCDSTANDARD().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTANDARD_L() {
        return (EAttribute)getCDSTANDARD().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTANDARD_S() {
        return (EAttribute)getCDSTANDARD().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTANDARD_SV() {
        return (EAttribute)getCDSTANDARD().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDSTENTBRIDGETYPE() {
		if (cdstentbridgetypeEClass == null) {
			cdstentbridgetypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(416);
		}
		return cdstentbridgetypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTBRIDGETYPE_Value() {
        return (EAttribute)getCDSTENTBRIDGETYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTBRIDGETYPE_DN() {
        return (EAttribute)getCDSTENTBRIDGETYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTBRIDGETYPE_L() {
        return (EAttribute)getCDSTENTBRIDGETYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTBRIDGETYPE_S() {
        return (EAttribute)getCDSTENTBRIDGETYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTBRIDGETYPE_SL() {
        return (EAttribute)getCDSTENTBRIDGETYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTBRIDGETYPE_SV() {
        return (EAttribute)getCDSTENTBRIDGETYPE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDSTENTDEVICE() {
		if (cdstentdeviceEClass == null) {
			cdstentdeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(419);
		}
		return cdstentdeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTDEVICE_Value() {
        return (EAttribute)getCDSTENTDEVICE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTDEVICE_DN() {
        return (EAttribute)getCDSTENTDEVICE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTDEVICE_L() {
        return (EAttribute)getCDSTENTDEVICE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTDEVICE_S() {
        return (EAttribute)getCDSTENTDEVICE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTDEVICE_SL() {
        return (EAttribute)getCDSTENTDEVICE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTDEVICE_SV() {
        return (EAttribute)getCDSTENTDEVICE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDSTENTDOMINANCE() {
		if (cdstentdominanceEClass == null) {
			cdstentdominanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(422);
		}
		return cdstentdominanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTDOMINANCE_Value() {
        return (EAttribute)getCDSTENTDOMINANCE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTDOMINANCE_DN() {
        return (EAttribute)getCDSTENTDOMINANCE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTDOMINANCE_L() {
        return (EAttribute)getCDSTENTDOMINANCE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTDOMINANCE_S() {
        return (EAttribute)getCDSTENTDOMINANCE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTDOMINANCE_SL() {
        return (EAttribute)getCDSTENTDOMINANCE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTDOMINANCE_SV() {
        return (EAttribute)getCDSTENTDOMINANCE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDSTENTLESIONTYPE() {
		if (cdstentlesiontypeEClass == null) {
			cdstentlesiontypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(425);
		}
		return cdstentlesiontypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTLESIONTYPE_Value() {
        return (EAttribute)getCDSTENTLESIONTYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTLESIONTYPE_DN() {
        return (EAttribute)getCDSTENTLESIONTYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTLESIONTYPE_L() {
        return (EAttribute)getCDSTENTLESIONTYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTLESIONTYPE_S() {
        return (EAttribute)getCDSTENTLESIONTYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTLESIONTYPE_SL() {
        return (EAttribute)getCDSTENTLESIONTYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTLESIONTYPE_SV() {
        return (EAttribute)getCDSTENTLESIONTYPE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDSTENTSEGMENT() {
		if (cdstentsegmentEClass == null) {
			cdstentsegmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(428);
		}
		return cdstentsegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTSEGMENT_Value() {
        return (EAttribute)getCDSTENTSEGMENT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTSEGMENT_DN() {
        return (EAttribute)getCDSTENTSEGMENT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTSEGMENT_L() {
        return (EAttribute)getCDSTENTSEGMENT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTSEGMENT_S() {
        return (EAttribute)getCDSTENTSEGMENT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTSEGMENT_SL() {
        return (EAttribute)getCDSTENTSEGMENT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSTENTSEGMENT_SV() {
        return (EAttribute)getCDSTENTSEGMENT().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDSUBSTANCE() {
		if (cdsubstanceEClass == null) {
			cdsubstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(431);
		}
		return cdsubstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSUBSTANCE_Value() {
        return (EAttribute)getCDSUBSTANCE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSUBSTANCE_DN() {
        return (EAttribute)getCDSUBSTANCE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSUBSTANCE_L() {
        return (EAttribute)getCDSUBSTANCE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSUBSTANCE_S() {
        return (EAttribute)getCDSUBSTANCE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDSUBSTANCE_SV() {
        return (EAttribute)getCDSUBSTANCE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDTECHNICAL() {
		if (cdtechnicalEClass == null) {
			cdtechnicalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(434);
		}
		return cdtechnicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTECHNICAL_Value() {
        return (EAttribute)getCDTECHNICAL().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTECHNICAL_DN() {
        return (EAttribute)getCDTECHNICAL().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTECHNICAL_L() {
        return (EAttribute)getCDTECHNICAL().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTECHNICAL_S() {
        return (EAttribute)getCDTECHNICAL().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTECHNICAL_SV() {
        return (EAttribute)getCDTECHNICAL().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDTELECOM() {
		if (cdtelecomEClass == null) {
			cdtelecomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(436);
		}
		return cdtelecomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTELECOM_Value() {
        return (EAttribute)getCDTELECOM().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTELECOM_DN() {
        return (EAttribute)getCDTELECOM().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTELECOM_L() {
        return (EAttribute)getCDTELECOM().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTELECOM_S() {
        return (EAttribute)getCDTELECOM().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTELECOM_SV() {
        return (EAttribute)getCDTELECOM().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDTEMPORALITY() {
		if (cdtemporalityEClass == null) {
			cdtemporalityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(441);
		}
		return cdtemporalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTEMPORALITY_Value() {
        return (EAttribute)getCDTEMPORALITY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTEMPORALITY_DN() {
        return (EAttribute)getCDTEMPORALITY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTEMPORALITY_L() {
        return (EAttribute)getCDTEMPORALITY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTEMPORALITY_S() {
        return (EAttribute)getCDTEMPORALITY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTEMPORALITY_SV() {
        return (EAttribute)getCDTEMPORALITY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDTHERAPEUTICLINK() {
		if (cdtherapeuticlinkEClass == null) {
			cdtherapeuticlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(444);
		}
		return cdtherapeuticlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTHERAPEUTICLINK_Value() {
        return (EAttribute)getCDTHERAPEUTICLINK().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTHERAPEUTICLINK_DN() {
        return (EAttribute)getCDTHERAPEUTICLINK().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTHERAPEUTICLINK_L() {
        return (EAttribute)getCDTHERAPEUTICLINK().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTHERAPEUTICLINK_S() {
        return (EAttribute)getCDTHERAPEUTICLINK().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTHERAPEUTICLINK_SL() {
        return (EAttribute)getCDTHERAPEUTICLINK().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTHERAPEUTICLINK_SV() {
        return (EAttribute)getCDTHERAPEUTICLINK().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDTIMEUNIT() {
		if (cdtimeunitEClass == null) {
			cdtimeunitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(448);
		}
		return cdtimeunitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTIMEUNIT_Value() {
        return (EAttribute)getCDTIMEUNIT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTIMEUNIT_DN() {
        return (EAttribute)getCDTIMEUNIT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTIMEUNIT_L() {
        return (EAttribute)getCDTIMEUNIT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTIMEUNIT_S() {
        return (EAttribute)getCDTIMEUNIT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTIMEUNIT_SL() {
        return (EAttribute)getCDTIMEUNIT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTIMEUNIT_SV() {
        return (EAttribute)getCDTIMEUNIT().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDTRANSACTION() {
		if (cdtransactionEClass == null) {
			cdtransactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(453);
		}
		return cdtransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTION_Value() {
        return (EAttribute)getCDTRANSACTION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTION_DN() {
        return (EAttribute)getCDTRANSACTION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTION_L() {
        return (EAttribute)getCDTRANSACTION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTION_S() {
        return (EAttribute)getCDTRANSACTION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTION_SL() {
        return (EAttribute)getCDTRANSACTION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTION_SV() {
        return (EAttribute)getCDTRANSACTION().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDTRANSACTIONCARENET() {
		if (cdtransactioncarenetEClass == null) {
			cdtransactioncarenetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(454);
		}
		return cdtransactioncarenetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONCARENET_Value() {
        return (EAttribute)getCDTRANSACTIONCARENET().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONCARENET_DN() {
        return (EAttribute)getCDTRANSACTIONCARENET().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONCARENET_L() {
        return (EAttribute)getCDTRANSACTIONCARENET().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONCARENET_S() {
        return (EAttribute)getCDTRANSACTIONCARENET().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONCARENET_SL() {
        return (EAttribute)getCDTRANSACTIONCARENET().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONCARENET_SV() {
        return (EAttribute)getCDTRANSACTIONCARENET().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDTRANSACTIONMAA() {
		if (cdtransactionmaaEClass == null) {
			cdtransactionmaaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(457);
		}
		return cdtransactionmaaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONMAA_Value() {
        return (EAttribute)getCDTRANSACTIONMAA().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONMAA_DN() {
        return (EAttribute)getCDTRANSACTIONMAA().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONMAA_L() {
        return (EAttribute)getCDTRANSACTIONMAA().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONMAA_S() {
        return (EAttribute)getCDTRANSACTIONMAA().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONMAA_SL() {
        return (EAttribute)getCDTRANSACTIONMAA().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONMAA_SV() {
        return (EAttribute)getCDTRANSACTIONMAA().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDTRANSACTIONMYCARENET() {
		if (cdtransactionmycarenetEClass == null) {
			cdtransactionmycarenetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(460);
		}
		return cdtransactionmycarenetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONMYCARENET_Value() {
        return (EAttribute)getCDTRANSACTIONMYCARENET().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONMYCARENET_DN() {
        return (EAttribute)getCDTRANSACTIONMYCARENET().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONMYCARENET_L() {
        return (EAttribute)getCDTRANSACTIONMYCARENET().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONMYCARENET_S() {
        return (EAttribute)getCDTRANSACTIONMYCARENET().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONMYCARENET_SL() {
        return (EAttribute)getCDTRANSACTIONMYCARENET().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONMYCARENET_SV() {
        return (EAttribute)getCDTRANSACTIONMYCARENET().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDTRANSACTIONREG() {
		if (cdtransactionregEClass == null) {
			cdtransactionregEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(463);
		}
		return cdtransactionregEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONREG_Value() {
        return (EAttribute)getCDTRANSACTIONREG().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONREG_DN() {
        return (EAttribute)getCDTRANSACTIONREG().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONREG_L() {
        return (EAttribute)getCDTRANSACTIONREG().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONREG_S() {
        return (EAttribute)getCDTRANSACTIONREG().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONREG_SL() {
        return (EAttribute)getCDTRANSACTIONREG().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONREG_SV() {
        return (EAttribute)getCDTRANSACTIONREG().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDTRANSACTIONTYPE() {
		if (cdtransactiontypeEClass == null) {
			cdtransactiontypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(468);
		}
		return cdtransactiontypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONTYPE_Value() {
        return (EAttribute)getCDTRANSACTIONTYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONTYPE_DN() {
        return (EAttribute)getCDTRANSACTIONTYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONTYPE_L() {
        return (EAttribute)getCDTRANSACTIONTYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONTYPE_S() {
        return (EAttribute)getCDTRANSACTIONTYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONTYPE_SL() {
        return (EAttribute)getCDTRANSACTIONTYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTRANSACTIONTYPE_SV() {
        return (EAttribute)getCDTRANSACTIONTYPE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDTUCOPATHOLOGYTYPE() {
		if (cdtucopathologytypeEClass == null) {
			cdtucopathologytypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(473);
		}
		return cdtucopathologytypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTUCOPATHOLOGYTYPE_Value() {
        return (EAttribute)getCDTUCOPATHOLOGYTYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTUCOPATHOLOGYTYPE_DN() {
        return (EAttribute)getCDTUCOPATHOLOGYTYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTUCOPATHOLOGYTYPE_L() {
        return (EAttribute)getCDTUCOPATHOLOGYTYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTUCOPATHOLOGYTYPE_S() {
        return (EAttribute)getCDTUCOPATHOLOGYTYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTUCOPATHOLOGYTYPE_SL() {
        return (EAttribute)getCDTUCOPATHOLOGYTYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTUCOPATHOLOGYTYPE_SV() {
        return (EAttribute)getCDTUCOPATHOLOGYTYPE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDTUCOSTEMITYPE() {
		if (cdtucostemitypeEClass == null) {
			cdtucostemitypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(476);
		}
		return cdtucostemitypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTUCOSTEMITYPE_Value() {
        return (EAttribute)getCDTUCOSTEMITYPE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTUCOSTEMITYPE_DN() {
        return (EAttribute)getCDTUCOSTEMITYPE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTUCOSTEMITYPE_L() {
        return (EAttribute)getCDTUCOSTEMITYPE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTUCOSTEMITYPE_S() {
        return (EAttribute)getCDTUCOSTEMITYPE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTUCOSTEMITYPE_SL() {
        return (EAttribute)getCDTUCOSTEMITYPE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDTUCOSTEMITYPE_SV() {
        return (EAttribute)getCDTUCOSTEMITYPE().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDUNIT() {
		if (cdunitEClass == null) {
			cdunitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(479);
		}
		return cdunitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDUNIT_Value() {
        return (EAttribute)getCDUNIT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDUNIT_DN() {
        return (EAttribute)getCDUNIT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDUNIT_L() {
        return (EAttribute)getCDUNIT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDUNIT_S() {
        return (EAttribute)getCDUNIT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDUNIT_SV() {
        return (EAttribute)getCDUNIT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDURGENCY() {
		if (cdurgencyEClass == null) {
			cdurgencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(484);
		}
		return cdurgencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDURGENCY_Value() {
        return (EAttribute)getCDURGENCY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDURGENCY_DN() {
        return (EAttribute)getCDURGENCY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDURGENCY_L() {
        return (EAttribute)getCDURGENCY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDURGENCY_S() {
        return (EAttribute)getCDURGENCY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDURGENCY_SV() {
        return (EAttribute)getCDURGENCY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDVACCINE() {
		if (cdvaccineEClass == null) {
			cdvaccineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(487);
		}
		return cdvaccineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDVACCINE_Value() {
        return (EAttribute)getCDVACCINE().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDVACCINE_DN() {
        return (EAttribute)getCDVACCINE().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDVACCINE_L() {
        return (EAttribute)getCDVACCINE().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDVACCINE_S() {
        return (EAttribute)getCDVACCINE().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDVACCINE_SV() {
        return (EAttribute)getCDVACCINE().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDVACCINEINDICATION() {
		if (cdvaccineindicationEClass == null) {
			cdvaccineindicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(488);
		}
		return cdvaccineindicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDVACCINEINDICATION_Value() {
        return (EAttribute)getCDVACCINEINDICATION().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDVACCINEINDICATION_DN() {
        return (EAttribute)getCDVACCINEINDICATION().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDVACCINEINDICATION_L() {
        return (EAttribute)getCDVACCINEINDICATION().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDVACCINEINDICATION_S() {
        return (EAttribute)getCDVACCINEINDICATION().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDVACCINEINDICATION_SV() {
        return (EAttribute)getCDVACCINEINDICATION().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCDWEEKDAY() {
		if (cdweekdayEClass == null) {
			cdweekdayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(493);
		}
		return cdweekdayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDWEEKDAY_Value() {
        return (EAttribute)getCDWEEKDAY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDWEEKDAY_S() {
        return (EAttribute)getCDWEEKDAY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCDWEEKDAY_SV() {
        return (EAttribute)getCDWEEKDAY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEMPTY() {
		if (emptyEClass == null) {
			emptyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(496);
		}
		return emptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEMPTY_Value() {
        return (EAttribute)getEMPTY().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEMPTY_DN() {
        return (EAttribute)getEMPTY().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEMPTY_L() {
        return (EAttribute)getEMPTY().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEMPTY_S() {
        return (EAttribute)getEMPTY().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEMPTY_SL() {
        return (EAttribute)getEMPTY().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEMPTY_SV() {
        return (EAttribute)getEMPTY().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getICD() {
		if (icdEClass == null) {
			icdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(497);
		}
		return icdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getICD_Value() {
        return (EAttribute)getICD().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getICD_DN() {
        return (EAttribute)getICD().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getICD_L() {
        return (EAttribute)getICD().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getICD_S() {
        return (EAttribute)getICD().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getICD_SV() {
        return (EAttribute)getICD().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getICPC() {
		if (icpcEClass == null) {
			icpcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(499);
		}
		return icpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getICPC_Value() {
        return (EAttribute)getICPC().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getICPC_DN() {
        return (EAttribute)getICPC().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getICPC_L() {
        return (EAttribute)getICPC().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getICPC_S() {
        return (EAttribute)getICPC().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getICPC_SV() {
        return (EAttribute)getICPC().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLnkType() {
		if (lnkTypeEClass == null) {
			lnkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(501);
		}
		return lnkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLnkType_Value() {
        return (EAttribute)getLnkType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLnkType_MEDIATYPE() {
        return (EAttribute)getLnkType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLnkType_SIZE() {
        return (EAttribute)getLnkType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLnkType_TYPE() {
        return (EAttribute)getLnkType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLnkType_URL() {
        return (EAttribute)getLnkType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLOCAL() {
		if (localEClass == null) {
			localEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(502);
		}
		return localEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLOCAL_Value() {
        return (EAttribute)getLOCAL().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLOCAL_DN() {
        return (EAttribute)getLOCAL().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLOCAL_L() {
        return (EAttribute)getLOCAL().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLOCAL_S() {
        return (EAttribute)getLOCAL().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLOCAL_SL() {
        return (EAttribute)getLOCAL().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLOCAL_SV() {
        return (EAttribute)getLOCAL().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDACCESSRIGHTschemes() {
		if (cdaccessrighTschemesEEnum == null) {
			cdaccessrighTschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(1);
		}
		return cdaccessrighTschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDACCESSRIGHTvalues() {
		if (cdaccessrighTvaluesEEnum == null) {
			cdaccessrighTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(3);
		}
		return cdaccessrighTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDACKNOWLEDGMENTvalues() {
		if (cdacknowledgmenTvaluesEEnum == null) {
			cdacknowledgmenTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(6);
		}
		return cdacknowledgmenTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDACTSNURSINGvalues() {
		if (cdactsnursinGvaluesEEnum == null) {
			cdactsnursinGvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(9);
		}
		return cdactsnursinGvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDADDRESSschemes() {
		if (cdaddresSschemesEEnum == null) {
			cdaddresSschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(12);
		}
		return cdaddresSschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDADDRESSvalues() {
		if (cdaddresSvaluesEEnum == null) {
			cdaddresSvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(14);
		}
		return cdaddresSvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDADMINISTRATIONUNITvalues() {
		if (cdadministrationuniTvaluesEEnum == null) {
			cdadministrationuniTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(17);
		}
		return cdadministrationuniTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDAUTONOMYvalues() {
		if (cdautonomYvaluesEEnum == null) {
			cdautonomYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(22);
		}
		return cdautonomYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDBALLONDEVICEvalues() {
		if (cdballondevicEvaluesEEnum == null) {
			cdballondevicEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(25);
		}
		return cdballondevicEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDBCRDIFFERENTATIONDEGREEvalues() {
		if (cdbcrdifferentationdegreEvaluesEEnum == null) {
			cdbcrdifferentationdegreEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(28);
		}
		return cdbcrdifferentationdegreEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDBEARINGSURFACEvalues() {
		if (cdbearingsurfacEvaluesEEnum == null) {
			cdbearingsurfacEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(31);
		}
		return cdbearingsurfacEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDBVTAVAILABLEMATERIALSvalues() {
		if (cdbvtavailablematerialSvaluesEEnum == null) {
			cdbvtavailablematerialSvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(34);
		}
		return cdbvtavailablematerialSvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDBVTCONSERVATIONDELAYvalues() {
		if (cdbvtconservationdelaYvaluesEEnum == null) {
			cdbvtconservationdelaYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(37);
		}
		return cdbvtconservationdelaYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDBVTCONSERVATIONMODEvalues() {
		if (cdbvtconservationmodEvaluesEEnum == null) {
			cdbvtconservationmodEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(40);
		}
		return cdbvtconservationmodEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDBVTLATERALITYvalues() {
		if (cdbvtlateralitYvaluesEEnum == null) {
			cdbvtlateralitYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(43);
		}
		return cdbvtlateralitYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDBVTPATIENTOPPOSITIONvalues() {
		if (cdbvtpatientoppositioNvaluesEEnum == null) {
			cdbvtpatientoppositioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(46);
		}
		return cdbvtpatientoppositioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDBVTSAMPLETYPEvalues() {
		if (cdbvtsampletypEvaluesEEnum == null) {
			cdbvtsampletypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(49);
		}
		return cdbvtsampletypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDBVTSTATUSvalues() {
		if (cdbvtstatuSvaluesEEnum == null) {
			cdbvtstatuSvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(52);
		}
		return cdbvtstatuSvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCARENETACCIDENTTYPEvalues() {
		if (cdcarenetaccidenttypEvaluesEEnum == null) {
			cdcarenetaccidenttypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(55);
		}
		return cdcarenetaccidenttypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCARENETAGREEMENTTYPEvalues() {
		if (cdcarenetagreementtypEvaluesEEnum == null) {
			cdcarenetagreementtypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(58);
		}
		return cdcarenetagreementtypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCARENETDOCUMENTvalues() {
		if (cdcarenetdocumenTvaluesEEnum == null) {
			cdcarenetdocumenTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(61);
		}
		return cdcarenetdocumenTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCARENETINSURANCYSTATUSvalues() {
		if (cdcarenetinsurancystatuSvaluesEEnum == null) {
			cdcarenetinsurancystatuSvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(64);
		}
		return cdcarenetinsurancystatuSvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCARENETMESSAGEvalues() {
		if (cdcarenetmessagEvaluesEEnum == null) {
			cdcarenetmessagEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(67);
		}
		return cdcarenetmessagEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCARENETMUTATIONINDICATORvalues() {
		if (cdcarenetmutationindicatoRvaluesEEnum == null) {
			cdcarenetmutationindicatoRvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(70);
		}
		return cdcarenetmutationindicatoRvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCARENETNATIONALINSURANCEvalues() {
		if (cdcarenetnationalinsurancEvaluesEEnum == null) {
			cdcarenetnationalinsurancEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(73);
		}
		return cdcarenetnationalinsurancEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCARENETPERSONALPARTvalues() {
		if (cdcarenetpersonalparTvaluesEEnum == null) {
			cdcarenetpersonalparTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(76);
		}
		return cdcarenetpersonalparTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCARENETREFUSALREASONvalues() {
		if (cdcarenetrefusalreasoNvaluesEEnum == null) {
			cdcarenetrefusalreasoNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(79);
		}
		return cdcarenetrefusalreasoNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCARENETSISCARDERRORvalues() {
		if (cdcarenetsiscarderroRvaluesEEnum == null) {
			cdcarenetsiscarderroRvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(82);
		}
		return cdcarenetsiscarderroRvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCARENETTHIRDPAYERCONTRACTvalues() {
		if (cdcarenetthirdpayercontracTvaluesEEnum == null) {
			cdcarenetthirdpayercontracTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(85);
		}
		return cdcarenetthirdpayercontracTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCARENETTYPEvalues() {
		if (cdcarenettypEvaluesEEnum == null) {
			cdcarenettypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(88);
		}
		return cdcarenettypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCAREPATHvalues() {
		if (cdcarepatHvaluesEEnum == null) {
			cdcarepatHvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(91);
		}
		return cdcarepatHvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCERTAINTYvalues() {
		if (cdcertaintYvaluesEEnum == null) {
			cdcertaintYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(94);
		}
		return cdcertaintYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCLINICALPLANvalues() {
		if (cdclinicalplaNvaluesEEnum == null) {
			cdclinicalplaNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(114);
		}
		return cdclinicalplaNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCOMPRESSIONvalues() {
		if (cdcompressioNvaluesEEnum == null) {
			cdcompressioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(117);
		}
		return cdcompressioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCONSENTschemes() {
		if (cdconsenTschemesEEnum == null) {
			cdconsenTschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(120);
		}
		return cdconsenTschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCONSENTvalues() {
		if (cdconsenTvaluesEEnum == null) {
			cdconsenTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(122);
		}
		return cdconsenTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCONTACTPERSONvalues() {
		if (cdcontactpersoNvaluesEEnum == null) {
			cdcontactpersoNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(125);
		}
		return cdcontactpersoNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCONTENTschemes() {
		if (cdcontenTschemesEEnum == null) {
			cdcontenTschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(128);
		}
		return cdcontenTschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCOUNTRYschemes() {
		if (cdcountrYschemesEEnum == null) {
			cdcountrYschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(131);
		}
		return cdcountrYschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCOUNTRYvalues() {
		if (cdcountrYvaluesEEnum == null) {
			cdcountrYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(133);
		}
		return cdcountrYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDCURRENCYvalues() {
		if (cdcurrencYvaluesEEnum == null) {
			cdcurrencYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(136);
		}
		return cdcurrencYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDDAYPERIODvalues() {
		if (cddayperioDvaluesEEnum == null) {
			cddayperioDvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(139);
		}
		return cddayperioDvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDDISCHARGETYPEvalues() {
		if (cddischargetypEvaluesEEnum == null) {
			cddischargetypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(142);
		}
		return cddischargetypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDDRUGCNKschemes() {
		if (cddrugcnKschemesEEnum == null) {
			cddrugcnKschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(145);
		}
		return cddrugcnKschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDEBIRTHARTIFICIALRESPIRATIONTYPEvalues() {
		if (cdebirthartificialrespirationtypEvaluesEEnum == null) {
			cdebirthartificialrespirationtypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(153);
		}
		return cdebirthartificialrespirationtypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDEBIRTHCAESAREANINDICATIONvalues() {
		if (cdebirthcaesareanindicatioNvaluesEEnum == null) {
			cdebirthcaesareanindicatioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(156);
		}
		return cdebirthcaesareanindicatioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDEBIRTHCHILDPOSITIONvalues() {
		if (cdebirthchildpositioNvaluesEEnum == null) {
			cdebirthchildpositioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(159);
		}
		return cdebirthchildpositioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDEBIRTHCONGENITALMALFORMATIONvalues() {
		if (cdebirthcongenitalmalformatioNvaluesEEnum == null) {
			cdebirthcongenitalmalformatioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(162);
		}
		return cdebirthcongenitalmalformatioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDEBIRTHDELIVERYWAYvalues() {
		if (cdebirthdeliverywaYvaluesEEnum == null) {
			cdebirthdeliverywaYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(165);
		}
		return cdebirthdeliverywaYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDEBIRTHFOETALMONITORINGvalues() {
		if (cdebirthfoetalmonitorinGvaluesEEnum == null) {
			cdebirthfoetalmonitorinGvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(168);
		}
		return cdebirthfoetalmonitorinGvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDEBIRTHNEONATALDEPTTYPEvalues() {
		if (cdebirthneonataldepttypEvaluesEEnum == null) {
			cdebirthneonataldepttypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(171);
		}
		return cdebirthneonataldepttypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDEBIRTHPLACEvalues() {
		if (cdebirthplacEvaluesEEnum == null) {
			cdebirthplacEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(174);
		}
		return cdebirthplacEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDEBIRTHPREGNANCYORIGINvalues() {
		if (cdebirthpregnancyorigiNvaluesEEnum == null) {
			cdebirthpregnancyorigiNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(177);
		}
		return cdebirthpregnancyorigiNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDEBIRTHSPECIALVALUESvalues() {
		if (cdebirthspecialvalueSvaluesEEnum == null) {
			cdebirthspecialvalueSvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(180);
		}
		return cdebirthspecialvalueSvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDECGvalues() {
		if (cdecGvaluesEEnum == null) {
			cdecGvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(183);
		}
		return cdecGvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDEMERGENCYEVALUATIONvalues() {
		if (cdemergencyevaluatioNvaluesEEnum == null) {
			cdemergencyevaluatioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(186);
		}
		return cdemergencyevaluatioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDEMPLOYMENTSITUATIONvalues() {
		if (cdemploymentsituatioNvaluesEEnum == null) {
			cdemploymentsituatioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(189);
		}
		return cdemploymentsituatioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDENCODINGvalues() {
		if (cdencodinGvaluesEEnum == null) {
			cdencodinGvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(191);
		}
		return cdencodinGvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDENCOUNTERSAFETYISSUEvalues() {
		if (cdencountersafetyissuEvaluesEEnum == null) {
			cdencountersafetyissuEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(195);
		}
		return cdencountersafetyissuEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDENCOUNTERvalues() {
		if (cdencounteRvaluesEEnum == null) {
			cdencounteRvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(197);
		}
		return cdencounteRvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDENCRYPTIONACTORvalues() {
		if (cdencryptionactoRvaluesEEnum == null) {
			cdencryptionactoRvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(200);
		}
		return cdencryptionactoRvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDENCRYPTIONMETHODschemes() {
		if (cdencryptionmethoDschemesEEnum == null) {
			cdencryptionmethoDschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(203);
		}
		return cdencryptionmethoDschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDENCRYPTIONMETHODvalues() {
		if (cdencryptionmethoDvaluesEEnum == null) {
			cdencryptionmethoDvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(205);
		}
		return cdencryptionmethoDvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDERRORMYCARENETschemes() {
		if (cderrormycareneTschemesEEnum == null) {
			cderrormycareneTschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(209);
		}
		return cderrormycareneTschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDERRORschemes() {
		if (cderroRschemesEEnum == null) {
			cderroRschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(211);
		}
		return cderroRschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDEXTERNALSOURCEschemes() {
		if (cdexternalsourcEschemesEEnum == null) {
			cdexternalsourcEschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(215);
		}
		return cdexternalsourcEschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDFEDCOUNTRYvalues() {
		if (cdfedcountrYvaluesEEnum == null) {
			cdfedcountrYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(218);
		}
		return cdfedcountrYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDFORMULARYschemes() {
		if (cdformularYschemesEEnum == null) {
			cdformularYschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(221);
		}
		return cdformularYschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDGALENICFORMschemes() {
		if (cdgalenicforMschemesEEnum == null) {
			cdgalenicforMschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(224);
		}
		return cdgalenicforMschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDHCPARTYschemes() {
		if (cdhcpartYschemesEEnum == null) {
			cdhcpartYschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(227);
		}
		return cdhcpartYschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDHCPARTYvalues() {
		if (cdhcpartYvaluesEEnum == null) {
			cdhcpartYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(229);
		}
		return cdhcpartYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDHEADINGREGvalues() {
		if (cdheadingreGvaluesEEnum == null) {
			cdheadingreGvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(234);
		}
		return cdheadingreGvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDHEADINGschemes() {
		if (cdheadinGschemesEEnum == null) {
			cdheadinGschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(236);
		}
		return cdheadinGschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDHEADINGvalues() {
		if (cdheadinGvaluesEEnum == null) {
			cdheadinGvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(238);
		}
		return cdheadinGvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDIMPLANTATIONDEVICEvalues() {
		if (cdimplantationdevicEvaluesEEnum == null) {
			cdimplantationdevicEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(241);
		}
		return cdimplantationdevicEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDIMPLANTATIONTYPEvalues() {
		if (cdimplantationtypEvaluesEEnum == null) {
			cdimplantationtypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(244);
		}
		return cdimplantationtypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDINCAPACITYREASONvalues() {
		if (cdincapacityreasoNvaluesEEnum == null) {
			cdincapacityreasoNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(248);
		}
		return cdincapacityreasoNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDINCAPACITYvalues() {
		if (cdincapacitYvaluesEEnum == null) {
			cdincapacitYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(250);
		}
		return cdincapacitYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDINNCLUSTERschemes() {
		if (cdinnclusteRschemesEEnum == null) {
			cdinnclusteRschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(253);
		}
		return cdinnclusteRschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDITEMBVTvalues() {
		if (cditembvTvaluesEEnum == null) {
			cditembvTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(258);
		}
		return cditembvTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDITEMCARENETvalues() {
		if (cditemcareneTvaluesEEnum == null) {
			cditemcareneTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(261);
		}
		return cditemcareneTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDITEMEBIRTHvalues() {
		if (cditemebirtHvaluesEEnum == null) {
			cditemebirtHvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(264);
		}
		return cditemebirtHvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDITEMMAAvalues() {
		if (cditemmaAvaluesEEnum == null) {
			cditemmaAvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(267);
		}
		return cditemmaAvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDITEMMSvalues() {
		if (cditemmSvaluesEEnum == null) {
			cditemmSvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(270);
		}
		return cditemmSvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDITEMMYCARENETvalues() {
		if (cditemmycareneTvaluesEEnum == null) {
			cditemmycareneTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(273);
		}
		return cditemmycareneTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDITEMREGvalues() {
		if (cditemreGvaluesEEnum == null) {
			cditemreGvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(276);
		}
		return cditemreGvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDITEMschemes() {
		if (cditeMschemesEEnum == null) {
			cditeMschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(278);
		}
		return cditeMschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDITEMvalues() {
		if (cditeMvaluesEEnum == null) {
			cditeMvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(280);
		}
		return cditeMvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDLEGALSERVICEvalues() {
		if (cdlegalservicEvaluesEEnum == null) {
			cdlegalservicEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(285);
		}
		return cdlegalservicEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDLIFECYCLEvalues() {
		if (cdlifecyclEvaluesEEnum == null) {
			cdlifecyclEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(288);
		}
		return cdlifecyclEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDLNKvalues() {
		if (cdlnKvaluesEEnum == null) {
			cdlnKvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(290);
		}
		return cdlnKvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMAACOVERAGETYPEvalues() {
		if (cdmaacoveragetypEvaluesEEnum == null) {
			cdmaacoveragetypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(293);
		}
		return cdmaacoveragetypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMAAREFUSALJUSTIFICATIONvalues() {
		if (cdmaarefusaljustificatioNvaluesEEnum == null) {
			cdmaarefusaljustificatioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(296);
		}
		return cdmaarefusaljustificatioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMAAREQUESTTYPEvalues() {
		if (cdmaarequesttypEvaluesEEnum == null) {
			cdmaarequesttypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(299);
		}
		return cdmaarequesttypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMAARESPONSETYPEvalues() {
		if (cdmaaresponsetypEvaluesEEnum == null) {
			cdmaaresponsetypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(302);
		}
		return cdmaaresponsetypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMAATYPEvalues() {
		if (cdmaatypEvaluesEEnum == null) {
			cdmaatypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(305);
		}
		return cdmaatypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMEDIATYPEvalues() {
		if (cdmediatypEvaluesEEnum == null) {
			cdmediatypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(307);
		}
		return cdmediatypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMEDICATIONschemes() {
		if (cdmedicatioNschemesEEnum == null) {
			cdmedicatioNschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(310);
		}
		return cdmedicatioNschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMESSAGEvalues() {
		if (cdmessagEvaluesEEnum == null) {
			cdmessagEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(313);
		}
		return cdmessagEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMICROORGANISMvalues() {
		if (cdmicroorganisMvaluesEEnum == null) {
			cdmicroorganisMvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(316);
		}
		return cdmicroorganisMvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMKGADMISSIONvalues() {
		if (cdmkgadmissioNvaluesEEnum == null) {
			cdmkgadmissioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(319);
		}
		return cdmkgadmissioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMKGDESTINATIONvalues() {
		if (cdmkgdestinatioNvaluesEEnum == null) {
			cdmkgdestinatioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(322);
		}
		return cdmkgdestinatioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMKGDISCHARGEvalues() {
		if (cdmkgdischargEvaluesEEnum == null) {
			cdmkgdischargEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(325);
		}
		return cdmkgdischargEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMKGORIGINvalues() {
		if (cdmkgorigiNvaluesEEnum == null) {
			cdmkgorigiNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(328);
		}
		return cdmkgorigiNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMKGREFERRERvalues() {
		if (cdmkgreferreRvaluesEEnum == null) {
			cdmkgreferreRvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(331);
		}
		return cdmkgreferreRvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMSADAPTATIONvalues() {
		if (cdmsadaptatioNvaluesEEnum == null) {
			cdmsadaptatioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(334);
		}
		return cdmsadaptatioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMSMEDICATIONTYPEvalues() {
		if (cdmsmedicationtypEvaluesEEnum == null) {
			cdmsmedicationtypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(337);
		}
		return cdmsmedicationtypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDMSORIGINvalues() {
		if (cdmsorigiNvaluesEEnum == null) {
			cdmsorigiNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(340);
		}
		return cdmsorigiNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDORTHOAPPROACHvalues() {
		if (cdorthoapproacHvaluesEEnum == null) {
			cdorthoapproacHvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(345);
		}
		return cdorthoapproacHvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDORTHODIAGNOSISvalues() {
		if (cdorthodiagnosiSvaluesEEnum == null) {
			cdorthodiagnosiSvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(348);
		}
		return cdorthodiagnosiSvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDORTHOGRAFTvalues() {
		if (cdorthografTvaluesEEnum == null) {
			cdorthografTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(351);
		}
		return cdorthografTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDORTHOINTERFACEvalues() {
		if (cdorthointerfacEvaluesEEnum == null) {
			cdorthointerfacEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(354);
		}
		return cdorthointerfacEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDORTHOKNEEINSERTvalues() {
		if (cdorthokneeinserTvaluesEEnum == null) {
			cdorthokneeinserTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(357);
		}
		return cdorthokneeinserTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDORTHONAVCOMvalues() {
		if (cdorthonavcoMvaluesEEnum == null) {
			cdorthonavcoMvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(360);
		}
		return cdorthonavcoMvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDORTHOTECHREVISIONvalues() {
		if (cdorthotechrevisioNvaluesEEnum == null) {
			cdorthotechrevisioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(363);
		}
		return cdorthotechrevisioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDORTHOTYPEvalues() {
		if (cdorthotypEvaluesEEnum == null) {
			cdorthotypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(366);
		}
		return cdorthotypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDPARAMETERvalues() {
		if (cdparameteRvaluesEEnum == null) {
			cdparameteRvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(369);
		}
		return cdparameteRvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDPATIENTWILLHOSPvalues() {
		if (cdpatientwillhosPvaluesEEnum == null) {
			cdpatientwillhosPvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(373);
		}
		return cdpatientwillhosPvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDPATIENTWILLRESvalues() {
		if (cdpatientwillreSvaluesEEnum == null) {
			cdpatientwillreSvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(376);
		}
		return cdpatientwillreSvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDPATIENTWILLvalues() {
		if (cdpatientwilLvaluesEEnum == null) {
			cdpatientwilLvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(378);
		}
		return cdpatientwilLvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDPROOFschemes() {
		if (cdprooFschemesEEnum == null) {
			cdprooFschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(383);
		}
		return cdprooFschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDQUANTITYPREFIXvalues() {
		if (cdquantityprefiXvaluesEEnum == null) {
			cdquantityprefiXvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(387);
		}
		return cdquantityprefiXvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDREFSCOPEvalues() {
		if (cdrefscopEvaluesEEnum == null) {
			cdrefscopEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(390);
		}
		return cdrefscopEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDREVCOMPONENTvalues() {
		if (cdrevcomponenTvaluesEEnum == null) {
			cdrevcomponenTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(396);
		}
		return cdrevcomponenTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDSEVERITYschemes() {
		if (cdseveritYschemesEEnum == null) {
			cdseveritYschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(399);
		}
		return cdseveritYschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDSEVERITYvalues() {
		if (cdseveritYvaluesEEnum == null) {
			cdseveritYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(401);
		}
		return cdseveritYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDSEXvalues() {
		if (cdseXvaluesEEnum == null) {
			cdseXvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(404);
		}
		return cdseXvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDSITEschemes() {
		if (cdsitEschemesEEnum == null) {
			cdsitEschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(407);
		}
		return cdsitEschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDSITEvalues() {
		if (cdsitEvaluesEEnum == null) {
			cdsitEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(409);
		}
		return cdsitEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDSTANDARDvalues() {
		if (cdstandarDvaluesEEnum == null) {
			cdstandarDvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(414);
		}
		return cdstandarDvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDSTENTBRIDGETYPEvalues() {
		if (cdstentbridgetypEvaluesEEnum == null) {
			cdstentbridgetypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(417);
		}
		return cdstentbridgetypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDSTENTDEVICEvalues() {
		if (cdstentdevicEvaluesEEnum == null) {
			cdstentdevicEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(420);
		}
		return cdstentdevicEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDSTENTDOMINANCEvalues() {
		if (cdstentdominancEvaluesEEnum == null) {
			cdstentdominancEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(423);
		}
		return cdstentdominancEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDSTENTLESIONTYPEvalues() {
		if (cdstentlesiontypEvaluesEEnum == null) {
			cdstentlesiontypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(426);
		}
		return cdstentlesiontypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDSTENTSEGMENTvalues() {
		if (cdstentsegmenTvaluesEEnum == null) {
			cdstentsegmenTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(429);
		}
		return cdstentsegmenTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDSUBSTANCEschemes() {
		if (cdsubstancEschemesEEnum == null) {
			cdsubstancEschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(432);
		}
		return cdsubstancEschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTELECOMschemes() {
		if (cdtelecoMschemesEEnum == null) {
			cdtelecoMschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(437);
		}
		return cdtelecoMschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTELECOMvalues() {
		if (cdtelecoMvaluesEEnum == null) {
			cdtelecoMvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(439);
		}
		return cdtelecoMvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTEMPORALITYvalues() {
		if (cdtemporalitYvaluesEEnum == null) {
			cdtemporalitYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(442);
		}
		return cdtemporalitYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTHERAPEUTICLINKschemes() {
		if (cdtherapeuticlinKschemesEEnum == null) {
			cdtherapeuticlinKschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(445);
		}
		return cdtherapeuticlinKschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTIMEUNITschemes() {
		if (cdtimeuniTschemesEEnum == null) {
			cdtimeuniTschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(449);
		}
		return cdtimeuniTschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTIMEUNITvalues() {
		if (cdtimeuniTvaluesEEnum == null) {
			cdtimeuniTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(451);
		}
		return cdtimeuniTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTRANSACTIONCARENETvalues() {
		if (cdtransactioncareneTvaluesEEnum == null) {
			cdtransactioncareneTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(455);
		}
		return cdtransactioncareneTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTRANSACTIONMAAvalues() {
		if (cdtransactionmaAvaluesEEnum == null) {
			cdtransactionmaAvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(458);
		}
		return cdtransactionmaAvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTRANSACTIONMYCARENETvalues() {
		if (cdtransactionmycareneTvaluesEEnum == null) {
			cdtransactionmycareneTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(461);
		}
		return cdtransactionmycareneTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTRANSACTIONREGvalues() {
		if (cdtransactionreGvaluesEEnum == null) {
			cdtransactionreGvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(464);
		}
		return cdtransactionreGvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTRANSACTIONschemes() {
		if (cdtransactioNschemesEEnum == null) {
			cdtransactioNschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(466);
		}
		return cdtransactioNschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTRANSACTIONTYPEvalues() {
		if (cdtransactiontypEvaluesEEnum == null) {
			cdtransactiontypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(469);
		}
		return cdtransactiontypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTRANSACTIONvalues() {
		if (cdtransactioNvaluesEEnum == null) {
			cdtransactioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(471);
		}
		return cdtransactioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTUCOPATHOLOGYTYPEvalues() {
		if (cdtucopathologytypEvaluesEEnum == null) {
			cdtucopathologytypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(474);
		}
		return cdtucopathologytypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDTUCOSTEMITYPEvalues() {
		if (cdtucostemitypEvaluesEEnum == null) {
			cdtucostemitypEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(477);
		}
		return cdtucostemitypEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDUNITschemes() {
		if (cduniTschemesEEnum == null) {
			cduniTschemesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(480);
		}
		return cduniTschemesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDUNITvalues() {
		if (cduniTvaluesEEnum == null) {
			cduniTvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(482);
		}
		return cduniTvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDURGENCYvalues() {
		if (cdurgencYvaluesEEnum == null) {
			cdurgencYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(485);
		}
		return cdurgencYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDVACCINEINDICATIONvalues() {
		if (cdvaccineindicatioNvaluesEEnum == null) {
			cdvaccineindicatioNvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(489);
		}
		return cdvaccineindicatioNvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDVACCINEvalues() {
		if (cdvaccinEvaluesEEnum == null) {
			cdvaccinEvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(491);
		}
		return cdvaccinEvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCDWEEKDAYvalues() {
		if (cdweekdaYvaluesEEnum == null) {
			cdweekdaYvaluesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(494);
		}
		return cdweekdaYvaluesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDACCESSRIGHTschemesObject() {
		if (cdaccessrighTschemesObjectEDataType == null) {
			cdaccessrighTschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(2);
		}
		return cdaccessrighTschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDACCESSRIGHTvaluesObject() {
		if (cdaccessrighTvaluesObjectEDataType == null) {
			cdaccessrighTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(4);
		}
		return cdaccessrighTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDACKNOWLEDGMENTvaluesObject() {
		if (cdacknowledgmenTvaluesObjectEDataType == null) {
			cdacknowledgmenTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(7);
		}
		return cdacknowledgmenTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDACTSNURSINGvaluesObject() {
		if (cdactsnursinGvaluesObjectEDataType == null) {
			cdactsnursinGvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(10);
		}
		return cdactsnursinGvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDADDRESSschemesObject() {
		if (cdaddresSschemesObjectEDataType == null) {
			cdaddresSschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(13);
		}
		return cdaddresSschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDADDRESSvaluesObject() {
		if (cdaddresSvaluesObjectEDataType == null) {
			cdaddresSvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(15);
		}
		return cdaddresSvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDADMINISTRATIONUNITvaluesObject() {
		if (cdadministrationuniTvaluesObjectEDataType == null) {
			cdadministrationuniTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(18);
		}
		return cdadministrationuniTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDATCvalues() {
		if (cdatCvaluesEDataType == null) {
			cdatCvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(20);
		}
		return cdatCvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDAUTONOMYvaluesObject() {
		if (cdautonomYvaluesObjectEDataType == null) {
			cdautonomYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(23);
		}
		return cdautonomYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDBALLONDEVICEvaluesObject() {
		if (cdballondevicEvaluesObjectEDataType == null) {
			cdballondevicEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(26);
		}
		return cdballondevicEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDBCRDIFFERENTATIONDEGREEvaluesObject() {
		if (cdbcrdifferentationdegreEvaluesObjectEDataType == null) {
			cdbcrdifferentationdegreEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(29);
		}
		return cdbcrdifferentationdegreEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDBEARINGSURFACEvaluesObject() {
		if (cdbearingsurfacEvaluesObjectEDataType == null) {
			cdbearingsurfacEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(32);
		}
		return cdbearingsurfacEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDBVTAVAILABLEMATERIALSvaluesObject() {
		if (cdbvtavailablematerialSvaluesObjectEDataType == null) {
			cdbvtavailablematerialSvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(35);
		}
		return cdbvtavailablematerialSvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDBVTCONSERVATIONDELAYvaluesObject() {
		if (cdbvtconservationdelaYvaluesObjectEDataType == null) {
			cdbvtconservationdelaYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(38);
		}
		return cdbvtconservationdelaYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDBVTCONSERVATIONMODEvaluesObject() {
		if (cdbvtconservationmodEvaluesObjectEDataType == null) {
			cdbvtconservationmodEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(41);
		}
		return cdbvtconservationmodEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDBVTLATERALITYvaluesObject() {
		if (cdbvtlateralitYvaluesObjectEDataType == null) {
			cdbvtlateralitYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(44);
		}
		return cdbvtlateralitYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDBVTPATIENTOPPOSITIONvaluesObject() {
		if (cdbvtpatientoppositioNvaluesObjectEDataType == null) {
			cdbvtpatientoppositioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(47);
		}
		return cdbvtpatientoppositioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDBVTSAMPLETYPEvaluesObject() {
		if (cdbvtsampletypEvaluesObjectEDataType == null) {
			cdbvtsampletypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(50);
		}
		return cdbvtsampletypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDBVTSTATUSvaluesObject() {
		if (cdbvtstatuSvaluesObjectEDataType == null) {
			cdbvtstatuSvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(53);
		}
		return cdbvtstatuSvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCARENETACCIDENTTYPEvaluesObject() {
		if (cdcarenetaccidenttypEvaluesObjectEDataType == null) {
			cdcarenetaccidenttypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(56);
		}
		return cdcarenetaccidenttypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCARENETAGREEMENTTYPEvaluesObject() {
		if (cdcarenetagreementtypEvaluesObjectEDataType == null) {
			cdcarenetagreementtypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(59);
		}
		return cdcarenetagreementtypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCARENETDOCUMENTvaluesObject() {
		if (cdcarenetdocumenTvaluesObjectEDataType == null) {
			cdcarenetdocumenTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(62);
		}
		return cdcarenetdocumenTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCARENETINSURANCYSTATUSvaluesObject() {
		if (cdcarenetinsurancystatuSvaluesObjectEDataType == null) {
			cdcarenetinsurancystatuSvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(65);
		}
		return cdcarenetinsurancystatuSvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCARENETMESSAGEvaluesObject() {
		if (cdcarenetmessagEvaluesObjectEDataType == null) {
			cdcarenetmessagEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(68);
		}
		return cdcarenetmessagEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCARENETMUTATIONINDICATORvaluesObject() {
		if (cdcarenetmutationindicatoRvaluesObjectEDataType == null) {
			cdcarenetmutationindicatoRvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(71);
		}
		return cdcarenetmutationindicatoRvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCARENETNATIONALINSURANCEvaluesObject() {
		if (cdcarenetnationalinsurancEvaluesObjectEDataType == null) {
			cdcarenetnationalinsurancEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(74);
		}
		return cdcarenetnationalinsurancEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCARENETPERSONALPARTvaluesObject() {
		if (cdcarenetpersonalparTvaluesObjectEDataType == null) {
			cdcarenetpersonalparTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(77);
		}
		return cdcarenetpersonalparTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCARENETREFUSALREASONvaluesObject() {
		if (cdcarenetrefusalreasoNvaluesObjectEDataType == null) {
			cdcarenetrefusalreasoNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(80);
		}
		return cdcarenetrefusalreasoNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCARENETSISCARDERRORvaluesObject() {
		if (cdcarenetsiscarderroRvaluesObjectEDataType == null) {
			cdcarenetsiscarderroRvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(83);
		}
		return cdcarenetsiscarderroRvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCARENETTHIRDPAYERCONTRACTvaluesObject() {
		if (cdcarenetthirdpayercontracTvaluesObjectEDataType == null) {
			cdcarenetthirdpayercontracTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(86);
		}
		return cdcarenetthirdpayercontracTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCARENETTYPEvaluesObject() {
		if (cdcarenettypEvaluesObjectEDataType == null) {
			cdcarenettypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(89);
		}
		return cdcarenettypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCAREPATHvaluesObject() {
		if (cdcarepatHvaluesObjectEDataType == null) {
			cdcarepatHvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(92);
		}
		return cdcarepatHvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCERTAINTYvaluesObject() {
		if (cdcertaintYvaluesObjectEDataType == null) {
			cdcertaintYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(95);
		}
		return cdcertaintYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCHAPTER4CATEGORYvalues() {
		if (cdchapter4CATEGORYvaluesEDataType == null) {
			cdchapter4CATEGORYvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(97);
		}
		return cdchapter4CATEGORYvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCHAPTER4CRITERIAvalues() {
		if (cdchapter4CRITERIAvaluesEDataType == null) {
			cdchapter4CRITERIAvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(99);
		}
		return cdchapter4CRITERIAvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCHAPTER4DOCUMENTSEQAPPENDIXvalues() {
		if (cdchapter4DOCUMENTSEQAPPENDIXvaluesEDataType == null) {
			cdchapter4DOCUMENTSEQAPPENDIXvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(101);
		}
		return cdchapter4DOCUMENTSEQAPPENDIXvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCHAPTER4FORMALINTERPRETATIONvalues() {
		if (cdchapter4FORMALINTERPRETATIONvaluesEDataType == null) {
			cdchapter4FORMALINTERPRETATIONvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(103);
		}
		return cdchapter4FORMALINTERPRETATIONvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCHAPTER4PARAGRAPHvalues() {
		if (cdchapter4PARAGRAPHvaluesEDataType == null) {
			cdchapter4PARAGRAPHvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(105);
		}
		return cdchapter4PARAGRAPHvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCHAPTER4VERSESEQAPPENDIXvalues() {
		if (cdchapter4VERSESEQAPPENDIXvaluesEDataType == null) {
			cdchapter4VERSESEQAPPENDIXvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(108);
		}
		return cdchapter4VERSESEQAPPENDIXvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCHAPTER4VERSEvalues() {
		if (cdchapter4VERSEvaluesEDataType == null) {
			cdchapter4VERSEvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(109);
		}
		return cdchapter4VERSEvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCIVILSTATEvalues() {
		if (cdcivilstatEvaluesEDataType == null) {
			cdcivilstatEvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(111);
		}
		return cdcivilstatEvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCLINICALPLANvaluesObject() {
		if (cdclinicalplaNvaluesObjectEDataType == null) {
			cdclinicalplaNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(115);
		}
		return cdclinicalplaNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCLINICALvalues() {
		if (cdclinicaLvaluesEDataType == null) {
			cdclinicaLvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(116);
		}
		return cdclinicaLvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCOMPRESSIONvaluesObject() {
		if (cdcompressioNvaluesObjectEDataType == null) {
			cdcompressioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(118);
		}
		return cdcompressioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCONSENTschemesObject() {
		if (cdconsenTschemesObjectEDataType == null) {
			cdconsenTschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(121);
		}
		return cdconsenTschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCONSENTvaluesObject() {
		if (cdconsenTvaluesObjectEDataType == null) {
			cdconsenTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(123);
		}
		return cdconsenTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCONTACTPERSONvaluesObject() {
		if (cdcontactpersoNvaluesObjectEDataType == null) {
			cdcontactpersoNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(126);
		}
		return cdcontactpersoNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCONTENTschemesObject() {
		if (cdcontenTschemesObjectEDataType == null) {
			cdcontenTschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(129);
		}
		return cdcontenTschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCOUNTRYschemesObject() {
		if (cdcountrYschemesObjectEDataType == null) {
			cdcountrYschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(132);
		}
		return cdcountrYschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCOUNTRYvaluesObject() {
		if (cdcountrYvaluesObjectEDataType == null) {
			cdcountrYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(134);
		}
		return cdcountrYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDCURRENCYvaluesObject() {
		if (cdcurrencYvaluesObjectEDataType == null) {
			cdcurrencYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(137);
		}
		return cdcurrencYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDDAYPERIODvaluesObject() {
		if (cddayperioDvaluesObjectEDataType == null) {
			cddayperioDvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(140);
		}
		return cddayperioDvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDDISCHARGETYPEvaluesObject() {
		if (cddischargetypEvaluesObjectEDataType == null) {
			cddischargetypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(143);
		}
		return cddischargetypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDDRUGCNKschemesObject() {
		if (cddrugcnKschemesObjectEDataType == null) {
			cddrugcnKschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(146);
		}
		return cddrugcnKschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDDRUGCNKvalues() {
		if (cddrugcnKvaluesEDataType == null) {
			cddrugcnKvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(147);
		}
		return cddrugcnKvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDDRUGPRESENTATIONvalues() {
		if (cddrugpresentatioNvaluesEDataType == null) {
			cddrugpresentatioNvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(149);
		}
		return cddrugpresentatioNvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDDRUGROUTEvalues() {
		if (cddrugroutEvaluesEDataType == null) {
			cddrugroutEvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(151);
		}
		return cddrugroutEvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEBIRTHARTIFICIALRESPIRATIONTYPEvaluesObject() {
		if (cdebirthartificialrespirationtypEvaluesObjectEDataType == null) {
			cdebirthartificialrespirationtypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(154);
		}
		return cdebirthartificialrespirationtypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEBIRTHCAESAREANINDICATIONvaluesObject() {
		if (cdebirthcaesareanindicatioNvaluesObjectEDataType == null) {
			cdebirthcaesareanindicatioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(157);
		}
		return cdebirthcaesareanindicatioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEBIRTHCHILDPOSITIONvaluesObject() {
		if (cdebirthchildpositioNvaluesObjectEDataType == null) {
			cdebirthchildpositioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(160);
		}
		return cdebirthchildpositioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEBIRTHCONGENITALMALFORMATIONvaluesObject() {
		if (cdebirthcongenitalmalformatioNvaluesObjectEDataType == null) {
			cdebirthcongenitalmalformatioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(163);
		}
		return cdebirthcongenitalmalformatioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEBIRTHDELIVERYWAYvaluesObject() {
		if (cdebirthdeliverywaYvaluesObjectEDataType == null) {
			cdebirthdeliverywaYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(166);
		}
		return cdebirthdeliverywaYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEBIRTHFOETALMONITORINGvaluesObject() {
		if (cdebirthfoetalmonitorinGvaluesObjectEDataType == null) {
			cdebirthfoetalmonitorinGvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(169);
		}
		return cdebirthfoetalmonitorinGvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEBIRTHNEONATALDEPTTYPEvaluesObject() {
		if (cdebirthneonataldepttypEvaluesObjectEDataType == null) {
			cdebirthneonataldepttypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(172);
		}
		return cdebirthneonataldepttypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEBIRTHPLACEvaluesObject() {
		if (cdebirthplacEvaluesObjectEDataType == null) {
			cdebirthplacEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(175);
		}
		return cdebirthplacEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEBIRTHPREGNANCYORIGINvaluesObject() {
		if (cdebirthpregnancyorigiNvaluesObjectEDataType == null) {
			cdebirthpregnancyorigiNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(178);
		}
		return cdebirthpregnancyorigiNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEBIRTHSPECIALVALUESvaluesObject() {
		if (cdebirthspecialvalueSvaluesObjectEDataType == null) {
			cdebirthspecialvalueSvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(181);
		}
		return cdebirthspecialvalueSvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDECGvaluesObject() {
		if (cdecGvaluesObjectEDataType == null) {
			cdecGvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(184);
		}
		return cdecGvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEMERGENCYEVALUATIONvaluesObject() {
		if (cdemergencyevaluatioNvaluesObjectEDataType == null) {
			cdemergencyevaluatioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(187);
		}
		return cdemergencyevaluatioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEMPLOYMENTSITUATIONvaluesObject() {
		if (cdemploymentsituatioNvaluesObjectEDataType == null) {
			cdemploymentsituatioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(190);
		}
		return cdemploymentsituatioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDENCODINGvaluesObject() {
		if (cdencodinGvaluesObjectEDataType == null) {
			cdencodinGvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(192);
		}
		return cdencodinGvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDENCOUNTERSAFETYISSUEvaluesObject() {
		if (cdencountersafetyissuEvaluesObjectEDataType == null) {
			cdencountersafetyissuEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(196);
		}
		return cdencountersafetyissuEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDENCOUNTERvaluesObject() {
		if (cdencounteRvaluesObjectEDataType == null) {
			cdencounteRvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(198);
		}
		return cdencounteRvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDENCRYPTIONACTORvaluesObject() {
		if (cdencryptionactoRvaluesObjectEDataType == null) {
			cdencryptionactoRvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(201);
		}
		return cdencryptionactoRvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDENCRYPTIONMETHODschemesObject() {
		if (cdencryptionmethoDschemesObjectEDataType == null) {
			cdencryptionmethoDschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(204);
		}
		return cdencryptionmethoDschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDENCRYPTIONMETHODvaluesObject() {
		if (cdencryptionmethoDvaluesObjectEDataType == null) {
			cdencryptionmethoDvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(206);
		}
		return cdencryptionmethoDvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDERRORMYCARENETschemesObject() {
		if (cderrormycareneTschemesObjectEDataType == null) {
			cderrormycareneTschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(210);
		}
		return cderrormycareneTschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDERRORschemesObject() {
		if (cderroRschemesObjectEDataType == null) {
			cderroRschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(212);
		}
		return cderroRschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDERRORvalues() {
		if (cderroRvaluesEDataType == null) {
			cderroRvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(213);
		}
		return cderroRvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEXTERNALSOURCEschemesObject() {
		if (cdexternalsourcEschemesObjectEDataType == null) {
			cdexternalsourcEschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(216);
		}
		return cdexternalsourcEschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDEXTERNALSOURCEvalues() {
		if (cdexternalsourcEvaluesEDataType == null) {
			cdexternalsourcEvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(217);
		}
		return cdexternalsourcEvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDFEDCOUNTRYvaluesObject() {
		if (cdfedcountrYvaluesObjectEDataType == null) {
			cdfedcountrYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(219);
		}
		return cdfedcountrYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDFORMULARYschemesObject() {
		if (cdformularYschemesObjectEDataType == null) {
			cdformularYschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(222);
		}
		return cdformularYschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDGALENICFORMschemesObject() {
		if (cdgalenicforMschemesObjectEDataType == null) {
			cdgalenicforMschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(225);
		}
		return cdgalenicforMschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDHCPARTYschemesObject() {
		if (cdhcpartYschemesObjectEDataType == null) {
			cdhcpartYschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(228);
		}
		return cdhcpartYschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDHCPARTYvaluesObject() {
		if (cdhcpartYvaluesObjectEDataType == null) {
			cdhcpartYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(230);
		}
		return cdhcpartYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDHEADINGLABvalues() {
		if (cdheadinglaBvaluesEDataType == null) {
			cdheadinglaBvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(232);
		}
		return cdheadinglaBvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDHEADINGREGvaluesObject() {
		if (cdheadingreGvaluesObjectEDataType == null) {
			cdheadingreGvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(235);
		}
		return cdheadingreGvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDHEADINGschemesObject() {
		if (cdheadinGschemesObjectEDataType == null) {
			cdheadinGschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(237);
		}
		return cdheadinGschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDHEADINGvaluesObject() {
		if (cdheadinGvaluesObjectEDataType == null) {
			cdheadinGvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(239);
		}
		return cdheadinGvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDIMPLANTATIONDEVICEvaluesObject() {
		if (cdimplantationdevicEvaluesObjectEDataType == null) {
			cdimplantationdevicEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(242);
		}
		return cdimplantationdevicEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDIMPLANTATIONTYPEvaluesObject() {
		if (cdimplantationtypEvaluesObjectEDataType == null) {
			cdimplantationtypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(245);
		}
		return cdimplantationtypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDINCAPACITYREASONvaluesObject() {
		if (cdincapacityreasoNvaluesObjectEDataType == null) {
			cdincapacityreasoNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(249);
		}
		return cdincapacityreasoNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDINCAPACITYvaluesObject() {
		if (cdincapacitYvaluesObjectEDataType == null) {
			cdincapacitYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(251);
		}
		return cdincapacitYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDINNCLUSTERschemesObject() {
		if (cdinnclusteRschemesObjectEDataType == null) {
			cdinnclusteRschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(254);
		}
		return cdinnclusteRschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDINNCLUSTERvalues() {
		if (cdinnclusteRvaluesEDataType == null) {
			cdinnclusteRvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(255);
		}
		return cdinnclusteRvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDITEMBVTvaluesObject() {
		if (cditembvTvaluesObjectEDataType == null) {
			cditembvTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(259);
		}
		return cditembvTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDITEMCARENETvaluesObject() {
		if (cditemcareneTvaluesObjectEDataType == null) {
			cditemcareneTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(262);
		}
		return cditemcareneTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDITEMEBIRTHvaluesObject() {
		if (cditemebirtHvaluesObjectEDataType == null) {
			cditemebirtHvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(265);
		}
		return cditemebirtHvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDITEMMAAvaluesObject() {
		if (cditemmaAvaluesObjectEDataType == null) {
			cditemmaAvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(268);
		}
		return cditemmaAvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDITEMMSvaluesObject() {
		if (cditemmSvaluesObjectEDataType == null) {
			cditemmSvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(271);
		}
		return cditemmSvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDITEMMYCARENETvaluesObject() {
		if (cditemmycareneTvaluesObjectEDataType == null) {
			cditemmycareneTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(274);
		}
		return cditemmycareneTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDITEMREGvaluesObject() {
		if (cditemreGvaluesObjectEDataType == null) {
			cditemreGvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(277);
		}
		return cditemreGvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDITEMschemesObject() {
		if (cditeMschemesObjectEDataType == null) {
			cditeMschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(279);
		}
		return cditeMschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDITEMvaluesObject() {
		if (cditeMvaluesObjectEDataType == null) {
			cditeMvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(281);
		}
		return cditeMvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDLABvalues() {
		if (cdlaBvaluesEDataType == null) {
			cdlaBvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(283);
		}
		return cdlaBvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDLEGALSERVICEvaluesObject() {
		if (cdlegalservicEvaluesObjectEDataType == null) {
			cdlegalservicEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(286);
		}
		return cdlegalservicEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDLIFECYCLEvaluesObject() {
		if (cdlifecyclEvaluesObjectEDataType == null) {
			cdlifecyclEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(289);
		}
		return cdlifecyclEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDLNKvaluesObject() {
		if (cdlnKvaluesObjectEDataType == null) {
			cdlnKvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(291);
		}
		return cdlnKvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMAACOVERAGETYPEvaluesObject() {
		if (cdmaacoveragetypEvaluesObjectEDataType == null) {
			cdmaacoveragetypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(294);
		}
		return cdmaacoveragetypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMAAREFUSALJUSTIFICATIONvaluesObject() {
		if (cdmaarefusaljustificatioNvaluesObjectEDataType == null) {
			cdmaarefusaljustificatioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(297);
		}
		return cdmaarefusaljustificatioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMAAREQUESTTYPEvaluesObject() {
		if (cdmaarequesttypEvaluesObjectEDataType == null) {
			cdmaarequesttypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(300);
		}
		return cdmaarequesttypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMAARESPONSETYPEvaluesObject() {
		if (cdmaaresponsetypEvaluesObjectEDataType == null) {
			cdmaaresponsetypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(303);
		}
		return cdmaaresponsetypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMAATYPEvaluesObject() {
		if (cdmaatypEvaluesObjectEDataType == null) {
			cdmaatypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(306);
		}
		return cdmaatypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMEDIATYPEvaluesObject() {
		if (cdmediatypEvaluesObjectEDataType == null) {
			cdmediatypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(308);
		}
		return cdmediatypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMEDICATIONschemesObject() {
		if (cdmedicatioNschemesObjectEDataType == null) {
			cdmedicatioNschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(311);
		}
		return cdmedicatioNschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMESSAGEvaluesObject() {
		if (cdmessagEvaluesObjectEDataType == null) {
			cdmessagEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(314);
		}
		return cdmessagEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMICROORGANISMvaluesObject() {
		if (cdmicroorganisMvaluesObjectEDataType == null) {
			cdmicroorganisMvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(317);
		}
		return cdmicroorganisMvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMKGADMISSIONvaluesObject() {
		if (cdmkgadmissioNvaluesObjectEDataType == null) {
			cdmkgadmissioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(320);
		}
		return cdmkgadmissioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMKGDESTINATIONvaluesObject() {
		if (cdmkgdestinatioNvaluesObjectEDataType == null) {
			cdmkgdestinatioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(323);
		}
		return cdmkgdestinatioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMKGDISCHARGEvaluesObject() {
		if (cdmkgdischargEvaluesObjectEDataType == null) {
			cdmkgdischargEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(326);
		}
		return cdmkgdischargEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMKGORIGINvaluesObject() {
		if (cdmkgorigiNvaluesObjectEDataType == null) {
			cdmkgorigiNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(329);
		}
		return cdmkgorigiNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMKGREFERRERvaluesObject() {
		if (cdmkgreferreRvaluesObjectEDataType == null) {
			cdmkgreferreRvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(332);
		}
		return cdmkgreferreRvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMSADAPTATIONvaluesObject() {
		if (cdmsadaptatioNvaluesObjectEDataType == null) {
			cdmsadaptatioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(335);
		}
		return cdmsadaptatioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMSMEDICATIONTYPEvaluesObject() {
		if (cdmsmedicationtypEvaluesObjectEDataType == null) {
			cdmsmedicationtypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(338);
		}
		return cdmsmedicationtypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMSORIGINvaluesObject() {
		if (cdmsorigiNvaluesObjectEDataType == null) {
			cdmsorigiNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(341);
		}
		return cdmsorigiNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDMYCARENETJUSTIFICATIONvalues() {
		if (cdmycarenetjustificatioNvaluesEDataType == null) {
			cdmycarenetjustificatioNvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(343);
		}
		return cdmycarenetjustificatioNvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDORTHOAPPROACHvaluesObject() {
		if (cdorthoapproacHvaluesObjectEDataType == null) {
			cdorthoapproacHvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(346);
		}
		return cdorthoapproacHvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDORTHODIAGNOSISvaluesObject() {
		if (cdorthodiagnosiSvaluesObjectEDataType == null) {
			cdorthodiagnosiSvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(349);
		}
		return cdorthodiagnosiSvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDORTHOGRAFTvaluesObject() {
		if (cdorthografTvaluesObjectEDataType == null) {
			cdorthografTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(352);
		}
		return cdorthografTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDORTHOINTERFACEvaluesObject() {
		if (cdorthointerfacEvaluesObjectEDataType == null) {
			cdorthointerfacEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(355);
		}
		return cdorthointerfacEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDORTHOKNEEINSERTvaluesObject() {
		if (cdorthokneeinserTvaluesObjectEDataType == null) {
			cdorthokneeinserTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(358);
		}
		return cdorthokneeinserTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDORTHONAVCOMvaluesObject() {
		if (cdorthonavcoMvaluesObjectEDataType == null) {
			cdorthonavcoMvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(361);
		}
		return cdorthonavcoMvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDORTHOTECHREVISIONvaluesObject() {
		if (cdorthotechrevisioNvaluesObjectEDataType == null) {
			cdorthotechrevisioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(364);
		}
		return cdorthotechrevisioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDORTHOTYPEvaluesObject() {
		if (cdorthotypEvaluesObjectEDataType == null) {
			cdorthotypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(367);
		}
		return cdorthotypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDPARAMETERvaluesObject() {
		if (cdparameteRvaluesObjectEDataType == null) {
			cdparameteRvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(370);
		}
		return cdparameteRvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDPATIENTWILLHOSPvaluesObject() {
		if (cdpatientwillhosPvaluesObjectEDataType == null) {
			cdpatientwillhosPvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(374);
		}
		return cdpatientwillhosPvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDPATIENTWILLRESvaluesObject() {
		if (cdpatientwillreSvaluesObjectEDataType == null) {
			cdpatientwillreSvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(377);
		}
		return cdpatientwillreSvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDPATIENTWILLvaluesObject() {
		if (cdpatientwilLvaluesObjectEDataType == null) {
			cdpatientwilLvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(379);
		}
		return cdpatientwilLvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDPERIODICITYvalues() {
		if (cdperiodicitYvaluesEDataType == null) {
			cdperiodicitYvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(381);
		}
		return cdperiodicitYvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDPROOFschemesObject() {
		if (cdprooFschemesObjectEDataType == null) {
			cdprooFschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(384);
		}
		return cdprooFschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDPROOFvalues() {
		if (cdprooFvaluesEDataType == null) {
			cdprooFvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(385);
		}
		return cdprooFvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDQUANTITYPREFIXvaluesObject() {
		if (cdquantityprefiXvaluesObjectEDataType == null) {
			cdquantityprefiXvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(388);
		}
		return cdquantityprefiXvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDREFSCOPEvaluesObject() {
		if (cdrefscopEvaluesObjectEDataType == null) {
			cdrefscopEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(391);
		}
		return cdrefscopEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDREFUSALMYCARENETvalues() {
		if (cdrefusalmycareneTvaluesEDataType == null) {
			cdrefusalmycareneTvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(392);
		}
		return cdrefusalmycareneTvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDREIMBURSEMENTNOMENCLATUREvalues() {
		if (cdreimbursementnomenclaturEvaluesEDataType == null) {
			cdreimbursementnomenclaturEvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(394);
		}
		return cdreimbursementnomenclaturEvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDREVCOMPONENTvaluesObject() {
		if (cdrevcomponenTvaluesObjectEDataType == null) {
			cdrevcomponenTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(397);
		}
		return cdrevcomponenTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDSEVERITYschemesObject() {
		if (cdseveritYschemesObjectEDataType == null) {
			cdseveritYschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(400);
		}
		return cdseveritYschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDSEVERITYvaluesObject() {
		if (cdseveritYvaluesObjectEDataType == null) {
			cdseveritYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(402);
		}
		return cdseveritYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDSEXvaluesObject() {
		if (cdseXvaluesObjectEDataType == null) {
			cdseXvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(405);
		}
		return cdseXvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDSITEschemesObject() {
		if (cdsitEschemesObjectEDataType == null) {
			cdsitEschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(408);
		}
		return cdsitEschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDSITEvaluesObject() {
		if (cdsitEvaluesObjectEDataType == null) {
			cdsitEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(410);
		}
		return cdsitEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDSNOMEDvalues() {
		if (cdsnomeDvaluesEDataType == null) {
			cdsnomeDvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(412);
		}
		return cdsnomeDvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDSTANDARDvaluesObject() {
		if (cdstandarDvaluesObjectEDataType == null) {
			cdstandarDvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(415);
		}
		return cdstandarDvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDSTENTBRIDGETYPEvaluesObject() {
		if (cdstentbridgetypEvaluesObjectEDataType == null) {
			cdstentbridgetypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(418);
		}
		return cdstentbridgetypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDSTENTDEVICEvaluesObject() {
		if (cdstentdevicEvaluesObjectEDataType == null) {
			cdstentdevicEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(421);
		}
		return cdstentdevicEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDSTENTDOMINANCEvaluesObject() {
		if (cdstentdominancEvaluesObjectEDataType == null) {
			cdstentdominancEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(424);
		}
		return cdstentdominancEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDSTENTLESIONTYPEvaluesObject() {
		if (cdstentlesiontypEvaluesObjectEDataType == null) {
			cdstentlesiontypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(427);
		}
		return cdstentlesiontypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDSTENTSEGMENTvaluesObject() {
		if (cdstentsegmenTvaluesObjectEDataType == null) {
			cdstentsegmenTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(430);
		}
		return cdstentsegmenTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDSUBSTANCEschemesObject() {
		if (cdsubstancEschemesObjectEDataType == null) {
			cdsubstancEschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(433);
		}
		return cdsubstancEschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTECHNICALvalues() {
		if (cdtechnicaLvaluesEDataType == null) {
			cdtechnicaLvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(435);
		}
		return cdtechnicaLvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTELECOMschemesObject() {
		if (cdtelecoMschemesObjectEDataType == null) {
			cdtelecoMschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(438);
		}
		return cdtelecoMschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTELECOMvaluesObject() {
		if (cdtelecoMvaluesObjectEDataType == null) {
			cdtelecoMvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(440);
		}
		return cdtelecoMvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTEMPORALITYvaluesObject() {
		if (cdtemporalitYvaluesObjectEDataType == null) {
			cdtemporalitYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(443);
		}
		return cdtemporalitYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTHERAPEUTICLINKschemesObject() {
		if (cdtherapeuticlinKschemesObjectEDataType == null) {
			cdtherapeuticlinKschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(446);
		}
		return cdtherapeuticlinKschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTHERAPEUTICLINKvalues() {
		if (cdtherapeuticlinKvaluesEDataType == null) {
			cdtherapeuticlinKvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(447);
		}
		return cdtherapeuticlinKvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTIMEUNITschemesObject() {
		if (cdtimeuniTschemesObjectEDataType == null) {
			cdtimeuniTschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(450);
		}
		return cdtimeuniTschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTIMEUNITvaluesObject() {
		if (cdtimeuniTvaluesObjectEDataType == null) {
			cdtimeuniTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(452);
		}
		return cdtimeuniTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTRANSACTIONCARENETvaluesObject() {
		if (cdtransactioncareneTvaluesObjectEDataType == null) {
			cdtransactioncareneTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(456);
		}
		return cdtransactioncareneTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTRANSACTIONMAAvaluesObject() {
		if (cdtransactionmaAvaluesObjectEDataType == null) {
			cdtransactionmaAvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(459);
		}
		return cdtransactionmaAvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTRANSACTIONMYCARENETvaluesObject() {
		if (cdtransactionmycareneTvaluesObjectEDataType == null) {
			cdtransactionmycareneTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(462);
		}
		return cdtransactionmycareneTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTRANSACTIONREGvaluesObject() {
		if (cdtransactionreGvaluesObjectEDataType == null) {
			cdtransactionreGvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(465);
		}
		return cdtransactionreGvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTRANSACTIONschemesObject() {
		if (cdtransactioNschemesObjectEDataType == null) {
			cdtransactioNschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(467);
		}
		return cdtransactioNschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTRANSACTIONTYPEvaluesObject() {
		if (cdtransactiontypEvaluesObjectEDataType == null) {
			cdtransactiontypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(470);
		}
		return cdtransactiontypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTRANSACTIONvaluesObject() {
		if (cdtransactioNvaluesObjectEDataType == null) {
			cdtransactioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(472);
		}
		return cdtransactioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTUCOPATHOLOGYTYPEvaluesObject() {
		if (cdtucopathologytypEvaluesObjectEDataType == null) {
			cdtucopathologytypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(475);
		}
		return cdtucopathologytypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDTUCOSTEMITYPEvaluesObject() {
		if (cdtucostemitypEvaluesObjectEDataType == null) {
			cdtucostemitypEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(478);
		}
		return cdtucostemitypEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDUNITschemesObject() {
		if (cduniTschemesObjectEDataType == null) {
			cduniTschemesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(481);
		}
		return cduniTschemesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDUNITvaluesObject() {
		if (cduniTvaluesObjectEDataType == null) {
			cduniTvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(483);
		}
		return cduniTvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDURGENCYvaluesObject() {
		if (cdurgencYvaluesObjectEDataType == null) {
			cdurgencYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(486);
		}
		return cdurgencYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDVACCINEINDICATIONvaluesObject() {
		if (cdvaccineindicatioNvaluesObjectEDataType == null) {
			cdvaccineindicatioNvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(490);
		}
		return cdvaccineindicatioNvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDVACCINEvaluesObject() {
		if (cdvaccinEvaluesObjectEDataType == null) {
			cdvaccinEvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(492);
		}
		return cdvaccinEvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCDWEEKDAYvaluesObject() {
		if (cdweekdaYvaluesObjectEDataType == null) {
			cdweekdaYvaluesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(495);
		}
		return cdweekdaYvaluesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getICDvalues() {
		if (icDvaluesEDataType == null) {
			icDvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(498);
		}
		return icDvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getICPCvalues() {
		if (icpCvaluesEDataType == null) {
			icpCvaluesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI).getEClassifiers().get(500);
		}
		return icpCvaluesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CdFactory getCdFactory() {
		return (CdFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("be.fgov.ehealth.standards.kmehr.cd.cd." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //CdPackageImpl
