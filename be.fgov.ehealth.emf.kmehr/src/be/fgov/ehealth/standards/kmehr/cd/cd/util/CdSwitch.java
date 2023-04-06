/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd.util;

import be.fgov.ehealth.standards.kmehr.cd.cd.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage
 * @generated
 */
public class CdSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdSwitch() {
		if (modelPackage == null) {
			modelPackage = CdPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CdPackage.CDACCESSRIGHT: {
				CDACCESSRIGHT cdaccessright = (CDACCESSRIGHT)theEObject;
				T result = caseCDACCESSRIGHT(cdaccessright);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDACKNOWLEDGMENT: {
				CDACKNOWLEDGMENT cdacknowledgment = (CDACKNOWLEDGMENT)theEObject;
				T result = caseCDACKNOWLEDGMENT(cdacknowledgment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDACTSNURSING: {
				CDACTSNURSING cdactsnursing = (CDACTSNURSING)theEObject;
				T result = caseCDACTSNURSING(cdactsnursing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDADDRESS: {
				CDADDRESS cdaddress = (CDADDRESS)theEObject;
				T result = caseCDADDRESS(cdaddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDADMINISTRATIONUNIT: {
				CDADMINISTRATIONUNIT cdadministrationunit = (CDADMINISTRATIONUNIT)theEObject;
				T result = caseCDADMINISTRATIONUNIT(cdadministrationunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDATC: {
				CDATC cdatc = (CDATC)theEObject;
				T result = caseCDATC(cdatc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDAUTONOMY: {
				CDAUTONOMY cdautonomy = (CDAUTONOMY)theEObject;
				T result = caseCDAUTONOMY(cdautonomy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDBALLONDEVICE: {
				CDBALLONDEVICE cdballondevice = (CDBALLONDEVICE)theEObject;
				T result = caseCDBALLONDEVICE(cdballondevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDBCRDIFFERENTATIONDEGREE: {
				CDBCRDIFFERENTATIONDEGREE cdbcrdifferentationdegree = (CDBCRDIFFERENTATIONDEGREE)theEObject;
				T result = caseCDBCRDIFFERENTATIONDEGREE(cdbcrdifferentationdegree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDBEARINGSURFACE: {
				CDBEARINGSURFACE cdbearingsurface = (CDBEARINGSURFACE)theEObject;
				T result = caseCDBEARINGSURFACE(cdbearingsurface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDBVTAVAILABLEMATERIALS: {
				CDBVTAVAILABLEMATERIALS cdbvtavailablematerials = (CDBVTAVAILABLEMATERIALS)theEObject;
				T result = caseCDBVTAVAILABLEMATERIALS(cdbvtavailablematerials);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDBVTCONSERVATIONDELAY: {
				CDBVTCONSERVATIONDELAY cdbvtconservationdelay = (CDBVTCONSERVATIONDELAY)theEObject;
				T result = caseCDBVTCONSERVATIONDELAY(cdbvtconservationdelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDBVTCONSERVATIONMODE: {
				CDBVTCONSERVATIONMODE cdbvtconservationmode = (CDBVTCONSERVATIONMODE)theEObject;
				T result = caseCDBVTCONSERVATIONMODE(cdbvtconservationmode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDBVTLATERALITY: {
				CDBVTLATERALITY cdbvtlaterality = (CDBVTLATERALITY)theEObject;
				T result = caseCDBVTLATERALITY(cdbvtlaterality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDBVTPATIENTOPPOSITION: {
				CDBVTPATIENTOPPOSITION cdbvtpatientopposition = (CDBVTPATIENTOPPOSITION)theEObject;
				T result = caseCDBVTPATIENTOPPOSITION(cdbvtpatientopposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDBVTSAMPLETYPE: {
				CDBVTSAMPLETYPE cdbvtsampletype = (CDBVTSAMPLETYPE)theEObject;
				T result = caseCDBVTSAMPLETYPE(cdbvtsampletype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDBVTSTATUS: {
				CDBVTSTATUS cdbvtstatus = (CDBVTSTATUS)theEObject;
				T result = caseCDBVTSTATUS(cdbvtstatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCARENETACCIDENTTYPE: {
				CDCARENETACCIDENTTYPE cdcarenetaccidenttype = (CDCARENETACCIDENTTYPE)theEObject;
				T result = caseCDCARENETACCIDENTTYPE(cdcarenetaccidenttype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCARENETAGREEMENTTYPE: {
				CDCARENETAGREEMENTTYPE cdcarenetagreementtype = (CDCARENETAGREEMENTTYPE)theEObject;
				T result = caseCDCARENETAGREEMENTTYPE(cdcarenetagreementtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCARENETDOCUMENT: {
				CDCARENETDOCUMENT cdcarenetdocument = (CDCARENETDOCUMENT)theEObject;
				T result = caseCDCARENETDOCUMENT(cdcarenetdocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCARENETINSURANCYSTATUS: {
				CDCARENETINSURANCYSTATUS cdcarenetinsurancystatus = (CDCARENETINSURANCYSTATUS)theEObject;
				T result = caseCDCARENETINSURANCYSTATUS(cdcarenetinsurancystatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCARENETMESSAGE: {
				CDCARENETMESSAGE cdcarenetmessage = (CDCARENETMESSAGE)theEObject;
				T result = caseCDCARENETMESSAGE(cdcarenetmessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCARENETMUTATIONINDICATOR: {
				CDCARENETMUTATIONINDICATOR cdcarenetmutationindicator = (CDCARENETMUTATIONINDICATOR)theEObject;
				T result = caseCDCARENETMUTATIONINDICATOR(cdcarenetmutationindicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCARENETNATIONALINSURANCE: {
				CDCARENETNATIONALINSURANCE cdcarenetnationalinsurance = (CDCARENETNATIONALINSURANCE)theEObject;
				T result = caseCDCARENETNATIONALINSURANCE(cdcarenetnationalinsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCARENETPERSONALPART: {
				CDCARENETPERSONALPART cdcarenetpersonalpart = (CDCARENETPERSONALPART)theEObject;
				T result = caseCDCARENETPERSONALPART(cdcarenetpersonalpart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCARENETREFUSALREASON: {
				CDCARENETREFUSALREASON cdcarenetrefusalreason = (CDCARENETREFUSALREASON)theEObject;
				T result = caseCDCARENETREFUSALREASON(cdcarenetrefusalreason);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCARENETSISCARDERROR: {
				CDCARENETSISCARDERROR cdcarenetsiscarderror = (CDCARENETSISCARDERROR)theEObject;
				T result = caseCDCARENETSISCARDERROR(cdcarenetsiscarderror);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCARENETTHIRDPAYERCONTRACT: {
				CDCARENETTHIRDPAYERCONTRACT cdcarenetthirdpayercontract = (CDCARENETTHIRDPAYERCONTRACT)theEObject;
				T result = caseCDCARENETTHIRDPAYERCONTRACT(cdcarenetthirdpayercontract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCARENETTYPE: {
				CDCARENETTYPE cdcarenettype = (CDCARENETTYPE)theEObject;
				T result = caseCDCARENETTYPE(cdcarenettype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCAREPATH: {
				CDCAREPATH cdcarepath = (CDCAREPATH)theEObject;
				T result = caseCDCAREPATH(cdcarepath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCERTAINTY: {
				CDCERTAINTY cdcertainty = (CDCERTAINTY)theEObject;
				T result = caseCDCERTAINTY(cdcertainty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCHAPTER4CATEGORY: {
				CDCHAPTER4CATEGORY cdchapter4CATEGORY = (CDCHAPTER4CATEGORY)theEObject;
				T result = caseCDCHAPTER4CATEGORY(cdchapter4CATEGORY);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCHAPTER4CRITERIA: {
				CDCHAPTER4CRITERIA cdchapter4CRITERIA = (CDCHAPTER4CRITERIA)theEObject;
				T result = caseCDCHAPTER4CRITERIA(cdchapter4CRITERIA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCHAPTER4DOCUMENTSEQAPPENDIX: {
				CDCHAPTER4DOCUMENTSEQAPPENDIX cdchapter4DOCUMENTSEQAPPENDIX = (CDCHAPTER4DOCUMENTSEQAPPENDIX)theEObject;
				T result = caseCDCHAPTER4DOCUMENTSEQAPPENDIX(cdchapter4DOCUMENTSEQAPPENDIX);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCHAPTER4FORMALINTERPRETATION: {
				CDCHAPTER4FORMALINTERPRETATION cdchapter4FORMALINTERPRETATION = (CDCHAPTER4FORMALINTERPRETATION)theEObject;
				T result = caseCDCHAPTER4FORMALINTERPRETATION(cdchapter4FORMALINTERPRETATION);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCHAPTER4PARAGRAPH: {
				CDCHAPTER4PARAGRAPH cdchapter4PARAGRAPH = (CDCHAPTER4PARAGRAPH)theEObject;
				T result = caseCDCHAPTER4PARAGRAPH(cdchapter4PARAGRAPH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCHAPTER4VERSE: {
				CDCHAPTER4VERSE cdchapter4VERSE = (CDCHAPTER4VERSE)theEObject;
				T result = caseCDCHAPTER4VERSE(cdchapter4VERSE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCHAPTER4VERSESEQAPPENDIX: {
				CDCHAPTER4VERSESEQAPPENDIX cdchapter4VERSESEQAPPENDIX = (CDCHAPTER4VERSESEQAPPENDIX)theEObject;
				T result = caseCDCHAPTER4VERSESEQAPPENDIX(cdchapter4VERSESEQAPPENDIX);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCIVILSTATE: {
				CDCIVILSTATE cdcivilstate = (CDCIVILSTATE)theEObject;
				T result = caseCDCIVILSTATE(cdcivilstate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCLINICAL: {
				CDCLINICAL cdclinical = (CDCLINICAL)theEObject;
				T result = caseCDCLINICAL(cdclinical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCLINICALPLAN: {
				CDCLINICALPLAN cdclinicalplan = (CDCLINICALPLAN)theEObject;
				T result = caseCDCLINICALPLAN(cdclinicalplan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCONSENT: {
				CDCONSENT cdconsent = (CDCONSENT)theEObject;
				T result = caseCDCONSENT(cdconsent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCONTACTPERSON: {
				CDCONTACTPERSON cdcontactperson = (CDCONTACTPERSON)theEObject;
				T result = caseCDCONTACTPERSON(cdcontactperson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCONTENT: {
				CDCONTENT cdcontent = (CDCONTENT)theEObject;
				T result = caseCDCONTENT(cdcontent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCOUNTRY: {
				CDCOUNTRY cdcountry = (CDCOUNTRY)theEObject;
				T result = caseCDCOUNTRY(cdcountry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDCURRENCY: {
				CDCURRENCY cdcurrency = (CDCURRENCY)theEObject;
				T result = caseCDCURRENCY(cdcurrency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDDAYPERIOD: {
				CDDAYPERIOD cddayperiod = (CDDAYPERIOD)theEObject;
				T result = caseCDDAYPERIOD(cddayperiod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDDISCHARGETYPE: {
				CDDISCHARGETYPE cddischargetype = (CDDISCHARGETYPE)theEObject;
				T result = caseCDDISCHARGETYPE(cddischargetype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDDRUGCNK: {
				CDDRUGCNK cddrugcnk = (CDDRUGCNK)theEObject;
				T result = caseCDDRUGCNK(cddrugcnk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDDRUGPRESENTATION: {
				CDDRUGPRESENTATION cddrugpresentation = (CDDRUGPRESENTATION)theEObject;
				T result = caseCDDRUGPRESENTATION(cddrugpresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDDRUGROUTE: {
				CDDRUGROUTE cddrugroute = (CDDRUGROUTE)theEObject;
				T result = caseCDDRUGROUTE(cddrugroute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDEBIRTHARTIFICIALRESPIRATIONTYPE: {
				CDEBIRTHARTIFICIALRESPIRATIONTYPE cdebirthartificialrespirationtype = (CDEBIRTHARTIFICIALRESPIRATIONTYPE)theEObject;
				T result = caseCDEBIRTHARTIFICIALRESPIRATIONTYPE(cdebirthartificialrespirationtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDEBIRTHCAESAREANINDICATION: {
				CDEBIRTHCAESAREANINDICATION cdebirthcaesareanindication = (CDEBIRTHCAESAREANINDICATION)theEObject;
				T result = caseCDEBIRTHCAESAREANINDICATION(cdebirthcaesareanindication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDEBIRTHCHILDPOSITION: {
				CDEBIRTHCHILDPOSITION cdebirthchildposition = (CDEBIRTHCHILDPOSITION)theEObject;
				T result = caseCDEBIRTHCHILDPOSITION(cdebirthchildposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDEBIRTHCONGENITALMALFORMATION: {
				CDEBIRTHCONGENITALMALFORMATION cdebirthcongenitalmalformation = (CDEBIRTHCONGENITALMALFORMATION)theEObject;
				T result = caseCDEBIRTHCONGENITALMALFORMATION(cdebirthcongenitalmalformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDEBIRTHDELIVERYWAY: {
				CDEBIRTHDELIVERYWAY cdebirthdeliveryway = (CDEBIRTHDELIVERYWAY)theEObject;
				T result = caseCDEBIRTHDELIVERYWAY(cdebirthdeliveryway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDEBIRTHFOETALMONITORING: {
				CDEBIRTHFOETALMONITORING cdebirthfoetalmonitoring = (CDEBIRTHFOETALMONITORING)theEObject;
				T result = caseCDEBIRTHFOETALMONITORING(cdebirthfoetalmonitoring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDEBIRTHNEONATALDEPTTYPE: {
				CDEBIRTHNEONATALDEPTTYPE cdebirthneonataldepttype = (CDEBIRTHNEONATALDEPTTYPE)theEObject;
				T result = caseCDEBIRTHNEONATALDEPTTYPE(cdebirthneonataldepttype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDEBIRTHPLACE: {
				CDEBIRTHPLACE cdebirthplace = (CDEBIRTHPLACE)theEObject;
				T result = caseCDEBIRTHPLACE(cdebirthplace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDEBIRTHPREGNANCYORIGIN: {
				CDEBIRTHPREGNANCYORIGIN cdebirthpregnancyorigin = (CDEBIRTHPREGNANCYORIGIN)theEObject;
				T result = caseCDEBIRTHPREGNANCYORIGIN(cdebirthpregnancyorigin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDEBIRTHSPECIALVALUES: {
				CDEBIRTHSPECIALVALUES cdebirthspecialvalues = (CDEBIRTHSPECIALVALUES)theEObject;
				T result = caseCDEBIRTHSPECIALVALUES(cdebirthspecialvalues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDECG: {
				CDECG cdecg = (CDECG)theEObject;
				T result = caseCDECG(cdecg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDEMERGENCYEVALUATION: {
				CDEMERGENCYEVALUATION cdemergencyevaluation = (CDEMERGENCYEVALUATION)theEObject;
				T result = caseCDEMERGENCYEVALUATION(cdemergencyevaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDEMPLOYMENTSITUATION: {
				CDEMPLOYMENTSITUATION cdemploymentsituation = (CDEMPLOYMENTSITUATION)theEObject;
				T result = caseCDEMPLOYMENTSITUATION(cdemploymentsituation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDENCOUNTER: {
				CDENCOUNTER cdencounter = (CDENCOUNTER)theEObject;
				T result = caseCDENCOUNTER(cdencounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDENCOUNTERSAFETYISSUE: {
				CDENCOUNTERSAFETYISSUE cdencountersafetyissue = (CDENCOUNTERSAFETYISSUE)theEObject;
				T result = caseCDENCOUNTERSAFETYISSUE(cdencountersafetyissue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDENCRYPTIONACTOR: {
				CDENCRYPTIONACTOR cdencryptionactor = (CDENCRYPTIONACTOR)theEObject;
				T result = caseCDENCRYPTIONACTOR(cdencryptionactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDENCRYPTIONMETHOD: {
				CDENCRYPTIONMETHOD cdencryptionmethod = (CDENCRYPTIONMETHOD)theEObject;
				T result = caseCDENCRYPTIONMETHOD(cdencryptionmethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDERROR: {
				CDERROR cderror = (CDERROR)theEObject;
				T result = caseCDERROR(cderror);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDERRORMYCARENET: {
				CDERRORMYCARENET cderrormycarenet = (CDERRORMYCARENET)theEObject;
				T result = caseCDERRORMYCARENET(cderrormycarenet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDEXTERNALSOURCE: {
				CDEXTERNALSOURCE cdexternalsource = (CDEXTERNALSOURCE)theEObject;
				T result = caseCDEXTERNALSOURCE(cdexternalsource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDFORMULARY: {
				CDFORMULARY cdformulary = (CDFORMULARY)theEObject;
				T result = caseCDFORMULARY(cdformulary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDGALENICFORM: {
				CDGALENICFORM cdgalenicform = (CDGALENICFORM)theEObject;
				T result = caseCDGALENICFORM(cdgalenicform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDHCPARTY: {
				CDHCPARTY cdhcparty = (CDHCPARTY)theEObject;
				T result = caseCDHCPARTY(cdhcparty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDHEADING: {
				CDHEADING cdheading = (CDHEADING)theEObject;
				T result = caseCDHEADING(cdheading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDHEADINGREG: {
				CDHEADINGREG cdheadingreg = (CDHEADINGREG)theEObject;
				T result = caseCDHEADINGREG(cdheadingreg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDIMPLANTATIONDEVICE: {
				CDIMPLANTATIONDEVICE cdimplantationdevice = (CDIMPLANTATIONDEVICE)theEObject;
				T result = caseCDIMPLANTATIONDEVICE(cdimplantationdevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDIMPLANTATIONTYPE: {
				CDIMPLANTATIONTYPE cdimplantationtype = (CDIMPLANTATIONTYPE)theEObject;
				T result = caseCDIMPLANTATIONTYPE(cdimplantationtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDINCAPACITY: {
				CDINCAPACITY cdincapacity = (CDINCAPACITY)theEObject;
				T result = caseCDINCAPACITY(cdincapacity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDINCAPACITYREASON: {
				CDINCAPACITYREASON cdincapacityreason = (CDINCAPACITYREASON)theEObject;
				T result = caseCDINCAPACITYREASON(cdincapacityreason);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDINNCLUSTER: {
				CDINNCLUSTER cdinncluster = (CDINNCLUSTER)theEObject;
				T result = caseCDINNCLUSTER(cdinncluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDITEM: {
				CDITEM cditem = (CDITEM)theEObject;
				T result = caseCDITEM(cditem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDITEMBVT: {
				CDITEMBVT cditembvt = (CDITEMBVT)theEObject;
				T result = caseCDITEMBVT(cditembvt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDITEMCARENET: {
				CDITEMCARENET cditemcarenet = (CDITEMCARENET)theEObject;
				T result = caseCDITEMCARENET(cditemcarenet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDITEMEBIRTH: {
				CDITEMEBIRTH cditemebirth = (CDITEMEBIRTH)theEObject;
				T result = caseCDITEMEBIRTH(cditemebirth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDITEMMAA: {
				CDITEMMAA cditemmaa = (CDITEMMAA)theEObject;
				T result = caseCDITEMMAA(cditemmaa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDITEMMS: {
				CDITEMMS cditemms = (CDITEMMS)theEObject;
				T result = caseCDITEMMS(cditemms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDITEMMYCARENET: {
				CDITEMMYCARENET cditemmycarenet = (CDITEMMYCARENET)theEObject;
				T result = caseCDITEMMYCARENET(cditemmycarenet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDITEMREG: {
				CDITEMREG cditemreg = (CDITEMREG)theEObject;
				T result = caseCDITEMREG(cditemreg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDLAB: {
				CDLAB cdlab = (CDLAB)theEObject;
				T result = caseCDLAB(cdlab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDLEGALSERVICE: {
				CDLEGALSERVICE cdlegalservice = (CDLEGALSERVICE)theEObject;
				T result = caseCDLEGALSERVICE(cdlegalservice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDLIFECYCLE: {
				CDLIFECYCLE cdlifecycle = (CDLIFECYCLE)theEObject;
				T result = caseCDLIFECYCLE(cdlifecycle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMAACOVERAGETYPE: {
				CDMAACOVERAGETYPE cdmaacoveragetype = (CDMAACOVERAGETYPE)theEObject;
				T result = caseCDMAACOVERAGETYPE(cdmaacoveragetype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMAAREFUSALJUSTIFICATION: {
				CDMAAREFUSALJUSTIFICATION cdmaarefusaljustification = (CDMAAREFUSALJUSTIFICATION)theEObject;
				T result = caseCDMAAREFUSALJUSTIFICATION(cdmaarefusaljustification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMAAREQUESTTYPE: {
				CDMAAREQUESTTYPE cdmaarequesttype = (CDMAAREQUESTTYPE)theEObject;
				T result = caseCDMAAREQUESTTYPE(cdmaarequesttype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMAARESPONSETYPE: {
				CDMAARESPONSETYPE cdmaaresponsetype = (CDMAARESPONSETYPE)theEObject;
				T result = caseCDMAARESPONSETYPE(cdmaaresponsetype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMAATYPE: {
				CDMAATYPE cdmaatype = (CDMAATYPE)theEObject;
				T result = caseCDMAATYPE(cdmaatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMEDICATION: {
				CDMEDICATION cdmedication = (CDMEDICATION)theEObject;
				T result = caseCDMEDICATION(cdmedication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMESSAGE: {
				CDMESSAGE cdmessage = (CDMESSAGE)theEObject;
				T result = caseCDMESSAGE(cdmessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMICROORGANISM: {
				CDMICROORGANISM cdmicroorganism = (CDMICROORGANISM)theEObject;
				T result = caseCDMICROORGANISM(cdmicroorganism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMKGADMISSION: {
				CDMKGADMISSION cdmkgadmission = (CDMKGADMISSION)theEObject;
				T result = caseCDMKGADMISSION(cdmkgadmission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMKGDESTINATION: {
				CDMKGDESTINATION cdmkgdestination = (CDMKGDESTINATION)theEObject;
				T result = caseCDMKGDESTINATION(cdmkgdestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMKGDISCHARGE: {
				CDMKGDISCHARGE cdmkgdischarge = (CDMKGDISCHARGE)theEObject;
				T result = caseCDMKGDISCHARGE(cdmkgdischarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMKGORIGIN: {
				CDMKGORIGIN cdmkgorigin = (CDMKGORIGIN)theEObject;
				T result = caseCDMKGORIGIN(cdmkgorigin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMKGREFERRER: {
				CDMKGREFERRER cdmkgreferrer = (CDMKGREFERRER)theEObject;
				T result = caseCDMKGREFERRER(cdmkgreferrer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMSADAPTATION: {
				CDMSADAPTATION cdmsadaptation = (CDMSADAPTATION)theEObject;
				T result = caseCDMSADAPTATION(cdmsadaptation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMSMEDICATIONTYPE: {
				CDMSMEDICATIONTYPE cdmsmedicationtype = (CDMSMEDICATIONTYPE)theEObject;
				T result = caseCDMSMEDICATIONTYPE(cdmsmedicationtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMSORIGIN: {
				CDMSORIGIN cdmsorigin = (CDMSORIGIN)theEObject;
				T result = caseCDMSORIGIN(cdmsorigin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDMYCARENETJUSTIFICATION: {
				CDMYCARENETJUSTIFICATION cdmycarenetjustification = (CDMYCARENETJUSTIFICATION)theEObject;
				T result = caseCDMYCARENETJUSTIFICATION(cdmycarenetjustification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDORTHOAPPROACH: {
				CDORTHOAPPROACH cdorthoapproach = (CDORTHOAPPROACH)theEObject;
				T result = caseCDORTHOAPPROACH(cdorthoapproach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDORTHODIAGNOSIS: {
				CDORTHODIAGNOSIS cdorthodiagnosis = (CDORTHODIAGNOSIS)theEObject;
				T result = caseCDORTHODIAGNOSIS(cdorthodiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDORTHOGRAFT: {
				CDORTHOGRAFT cdorthograft = (CDORTHOGRAFT)theEObject;
				T result = caseCDORTHOGRAFT(cdorthograft);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDORTHOINTERFACE: {
				CDORTHOINTERFACE cdorthointerface = (CDORTHOINTERFACE)theEObject;
				T result = caseCDORTHOINTERFACE(cdorthointerface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDORTHOKNEEINSERT: {
				CDORTHOKNEEINSERT cdorthokneeinsert = (CDORTHOKNEEINSERT)theEObject;
				T result = caseCDORTHOKNEEINSERT(cdorthokneeinsert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDORTHONAVCOM: {
				CDORTHONAVCOM cdorthonavcom = (CDORTHONAVCOM)theEObject;
				T result = caseCDORTHONAVCOM(cdorthonavcom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDORTHOTECHREVISION: {
				CDORTHOTECHREVISION cdorthotechrevision = (CDORTHOTECHREVISION)theEObject;
				T result = caseCDORTHOTECHREVISION(cdorthotechrevision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDORTHOTYPE: {
				CDORTHOTYPE cdorthotype = (CDORTHOTYPE)theEObject;
				T result = caseCDORTHOTYPE(cdorthotype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDPARAMETER: {
				CDPARAMETER cdparameter = (CDPARAMETER)theEObject;
				T result = caseCDPARAMETER(cdparameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDPATIENTWILL: {
				CDPATIENTWILL cdpatientwill = (CDPATIENTWILL)theEObject;
				T result = caseCDPATIENTWILL(cdpatientwill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDPATIENTWILLHOSP: {
				CDPATIENTWILLHOSP cdpatientwillhosp = (CDPATIENTWILLHOSP)theEObject;
				T result = caseCDPATIENTWILLHOSP(cdpatientwillhosp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDPATIENTWILLRES: {
				CDPATIENTWILLRES cdpatientwillres = (CDPATIENTWILLRES)theEObject;
				T result = caseCDPATIENTWILLRES(cdpatientwillres);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDPERIODICITY: {
				CDPERIODICITY cdperiodicity = (CDPERIODICITY)theEObject;
				T result = caseCDPERIODICITY(cdperiodicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDPROOF: {
				CDPROOF cdproof = (CDPROOF)theEObject;
				T result = caseCDPROOF(cdproof);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDQUANTITYPREFIX: {
				CDQUANTITYPREFIX cdquantityprefix = (CDQUANTITYPREFIX)theEObject;
				T result = caseCDQUANTITYPREFIX(cdquantityprefix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDREFSCOPE: {
				CDREFSCOPE cdrefscope = (CDREFSCOPE)theEObject;
				T result = caseCDREFSCOPE(cdrefscope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDREIMBURSEMENTNOMENCLATURE: {
				CDREIMBURSEMENTNOMENCLATURE cdreimbursementnomenclature = (CDREIMBURSEMENTNOMENCLATURE)theEObject;
				T result = caseCDREIMBURSEMENTNOMENCLATURE(cdreimbursementnomenclature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDREVCOMPONENT: {
				CDREVCOMPONENT cdrevcomponent = (CDREVCOMPONENT)theEObject;
				T result = caseCDREVCOMPONENT(cdrevcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDSEVERITY: {
				CDSEVERITY cdseverity = (CDSEVERITY)theEObject;
				T result = caseCDSEVERITY(cdseverity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDSEX: {
				CDSEX cdsex = (CDSEX)theEObject;
				T result = caseCDSEX(cdsex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDSITE: {
				CDSITE cdsite = (CDSITE)theEObject;
				T result = caseCDSITE(cdsite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDSNOMED: {
				CDSNOMED cdsnomed = (CDSNOMED)theEObject;
				T result = caseCDSNOMED(cdsnomed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDSTANDARD: {
				CDSTANDARD cdstandard = (CDSTANDARD)theEObject;
				T result = caseCDSTANDARD(cdstandard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDSTENTBRIDGETYPE: {
				CDSTENTBRIDGETYPE cdstentbridgetype = (CDSTENTBRIDGETYPE)theEObject;
				T result = caseCDSTENTBRIDGETYPE(cdstentbridgetype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDSTENTDEVICE: {
				CDSTENTDEVICE cdstentdevice = (CDSTENTDEVICE)theEObject;
				T result = caseCDSTENTDEVICE(cdstentdevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDSTENTDOMINANCE: {
				CDSTENTDOMINANCE cdstentdominance = (CDSTENTDOMINANCE)theEObject;
				T result = caseCDSTENTDOMINANCE(cdstentdominance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDSTENTLESIONTYPE: {
				CDSTENTLESIONTYPE cdstentlesiontype = (CDSTENTLESIONTYPE)theEObject;
				T result = caseCDSTENTLESIONTYPE(cdstentlesiontype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDSTENTSEGMENT: {
				CDSTENTSEGMENT cdstentsegment = (CDSTENTSEGMENT)theEObject;
				T result = caseCDSTENTSEGMENT(cdstentsegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDSUBSTANCE: {
				CDSUBSTANCE cdsubstance = (CDSUBSTANCE)theEObject;
				T result = caseCDSUBSTANCE(cdsubstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDTECHNICAL: {
				CDTECHNICAL cdtechnical = (CDTECHNICAL)theEObject;
				T result = caseCDTECHNICAL(cdtechnical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDTELECOM: {
				CDTELECOM cdtelecom = (CDTELECOM)theEObject;
				T result = caseCDTELECOM(cdtelecom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDTEMPORALITY: {
				CDTEMPORALITY cdtemporality = (CDTEMPORALITY)theEObject;
				T result = caseCDTEMPORALITY(cdtemporality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDTHERAPEUTICLINK: {
				CDTHERAPEUTICLINK cdtherapeuticlink = (CDTHERAPEUTICLINK)theEObject;
				T result = caseCDTHERAPEUTICLINK(cdtherapeuticlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDTIMEUNIT: {
				CDTIMEUNIT cdtimeunit = (CDTIMEUNIT)theEObject;
				T result = caseCDTIMEUNIT(cdtimeunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDTRANSACTION: {
				CDTRANSACTION cdtransaction = (CDTRANSACTION)theEObject;
				T result = caseCDTRANSACTION(cdtransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDTRANSACTIONCARENET: {
				CDTRANSACTIONCARENET cdtransactioncarenet = (CDTRANSACTIONCARENET)theEObject;
				T result = caseCDTRANSACTIONCARENET(cdtransactioncarenet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDTRANSACTIONMAA: {
				CDTRANSACTIONMAA cdtransactionmaa = (CDTRANSACTIONMAA)theEObject;
				T result = caseCDTRANSACTIONMAA(cdtransactionmaa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDTRANSACTIONMYCARENET: {
				CDTRANSACTIONMYCARENET cdtransactionmycarenet = (CDTRANSACTIONMYCARENET)theEObject;
				T result = caseCDTRANSACTIONMYCARENET(cdtransactionmycarenet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDTRANSACTIONREG: {
				CDTRANSACTIONREG cdtransactionreg = (CDTRANSACTIONREG)theEObject;
				T result = caseCDTRANSACTIONREG(cdtransactionreg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDTRANSACTIONTYPE: {
				CDTRANSACTIONTYPE cdtransactiontype = (CDTRANSACTIONTYPE)theEObject;
				T result = caseCDTRANSACTIONTYPE(cdtransactiontype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDTUCOPATHOLOGYTYPE: {
				CDTUCOPATHOLOGYTYPE cdtucopathologytype = (CDTUCOPATHOLOGYTYPE)theEObject;
				T result = caseCDTUCOPATHOLOGYTYPE(cdtucopathologytype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDTUCOSTEMITYPE: {
				CDTUCOSTEMITYPE cdtucostemitype = (CDTUCOSTEMITYPE)theEObject;
				T result = caseCDTUCOSTEMITYPE(cdtucostemitype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDUNIT: {
				CDUNIT cdunit = (CDUNIT)theEObject;
				T result = caseCDUNIT(cdunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDURGENCY: {
				CDURGENCY cdurgency = (CDURGENCY)theEObject;
				T result = caseCDURGENCY(cdurgency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDVACCINE: {
				CDVACCINE cdvaccine = (CDVACCINE)theEObject;
				T result = caseCDVACCINE(cdvaccine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDVACCINEINDICATION: {
				CDVACCINEINDICATION cdvaccineindication = (CDVACCINEINDICATION)theEObject;
				T result = caseCDVACCINEINDICATION(cdvaccineindication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.CDWEEKDAY: {
				CDWEEKDAY cdweekday = (CDWEEKDAY)theEObject;
				T result = caseCDWEEKDAY(cdweekday);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.EMPTY: {
				EMPTY empty = (EMPTY)theEObject;
				T result = caseEMPTY(empty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.ICD: {
				ICD icd = (ICD)theEObject;
				T result = caseICD(icd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.ICPC: {
				ICPC icpc = (ICPC)theEObject;
				T result = caseICPC(icpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.LNK_TYPE: {
				LnkType lnkType = (LnkType)theEObject;
				T result = caseLnkType(lnkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdPackage.LOCAL: {
				LOCAL local = (LOCAL)theEObject;
				T result = caseLOCAL(local);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDACCESSRIGHT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDACCESSRIGHT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDACCESSRIGHT(CDACCESSRIGHT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDACKNOWLEDGMENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDACKNOWLEDGMENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDACKNOWLEDGMENT(CDACKNOWLEDGMENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDACTSNURSING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDACTSNURSING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDACTSNURSING(CDACTSNURSING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDADDRESS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDADDRESS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDADDRESS(CDADDRESS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDADMINISTRATIONUNIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDADMINISTRATIONUNIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDADMINISTRATIONUNIT(CDADMINISTRATIONUNIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDATC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDATC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDATC(CDATC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDAUTONOMY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDAUTONOMY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDAUTONOMY(CDAUTONOMY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDBALLONDEVICE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDBALLONDEVICE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDBALLONDEVICE(CDBALLONDEVICE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDBCRDIFFERENTATIONDEGREE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDBCRDIFFERENTATIONDEGREE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDBCRDIFFERENTATIONDEGREE(CDBCRDIFFERENTATIONDEGREE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDBEARINGSURFACE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDBEARINGSURFACE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDBEARINGSURFACE(CDBEARINGSURFACE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDBVTAVAILABLEMATERIALS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDBVTAVAILABLEMATERIALS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDBVTAVAILABLEMATERIALS(CDBVTAVAILABLEMATERIALS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDBVTCONSERVATIONDELAY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDBVTCONSERVATIONDELAY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDBVTCONSERVATIONDELAY(CDBVTCONSERVATIONDELAY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDBVTCONSERVATIONMODE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDBVTCONSERVATIONMODE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDBVTCONSERVATIONMODE(CDBVTCONSERVATIONMODE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDBVTLATERALITY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDBVTLATERALITY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDBVTLATERALITY(CDBVTLATERALITY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDBVTPATIENTOPPOSITION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDBVTPATIENTOPPOSITION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDBVTPATIENTOPPOSITION(CDBVTPATIENTOPPOSITION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDBVTSAMPLETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDBVTSAMPLETYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDBVTSAMPLETYPE(CDBVTSAMPLETYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDBVTSTATUS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDBVTSTATUS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDBVTSTATUS(CDBVTSTATUS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCARENETACCIDENTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCARENETACCIDENTTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCARENETACCIDENTTYPE(CDCARENETACCIDENTTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCARENETAGREEMENTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCARENETAGREEMENTTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCARENETAGREEMENTTYPE(CDCARENETAGREEMENTTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCARENETDOCUMENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCARENETDOCUMENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCARENETDOCUMENT(CDCARENETDOCUMENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCARENETINSURANCYSTATUS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCARENETINSURANCYSTATUS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCARENETINSURANCYSTATUS(CDCARENETINSURANCYSTATUS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCARENETMESSAGE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCARENETMESSAGE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCARENETMESSAGE(CDCARENETMESSAGE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCARENETMUTATIONINDICATOR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCARENETMUTATIONINDICATOR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCARENETMUTATIONINDICATOR(CDCARENETMUTATIONINDICATOR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCARENETNATIONALINSURANCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCARENETNATIONALINSURANCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCARENETNATIONALINSURANCE(CDCARENETNATIONALINSURANCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCARENETPERSONALPART</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCARENETPERSONALPART</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCARENETPERSONALPART(CDCARENETPERSONALPART object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCARENETREFUSALREASON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCARENETREFUSALREASON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCARENETREFUSALREASON(CDCARENETREFUSALREASON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCARENETSISCARDERROR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCARENETSISCARDERROR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCARENETSISCARDERROR(CDCARENETSISCARDERROR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCARENETTHIRDPAYERCONTRACT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCARENETTHIRDPAYERCONTRACT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCARENETTHIRDPAYERCONTRACT(CDCARENETTHIRDPAYERCONTRACT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCARENETTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCARENETTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCARENETTYPE(CDCARENETTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCAREPATH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCAREPATH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCAREPATH(CDCAREPATH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCERTAINTY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCERTAINTY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCERTAINTY(CDCERTAINTY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCHAPTER4CATEGORY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCHAPTER4CATEGORY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCHAPTER4CATEGORY(CDCHAPTER4CATEGORY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCHAPTER4CRITERIA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCHAPTER4CRITERIA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCHAPTER4CRITERIA(CDCHAPTER4CRITERIA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCHAPTER4DOCUMENTSEQAPPENDIX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCHAPTER4DOCUMENTSEQAPPENDIX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCHAPTER4DOCUMENTSEQAPPENDIX(CDCHAPTER4DOCUMENTSEQAPPENDIX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCHAPTER4FORMALINTERPRETATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCHAPTER4FORMALINTERPRETATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCHAPTER4FORMALINTERPRETATION(CDCHAPTER4FORMALINTERPRETATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCHAPTER4PARAGRAPH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCHAPTER4PARAGRAPH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCHAPTER4PARAGRAPH(CDCHAPTER4PARAGRAPH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCHAPTER4VERSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCHAPTER4VERSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCHAPTER4VERSE(CDCHAPTER4VERSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCHAPTER4VERSESEQAPPENDIX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCHAPTER4VERSESEQAPPENDIX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCHAPTER4VERSESEQAPPENDIX(CDCHAPTER4VERSESEQAPPENDIX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCIVILSTATE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCIVILSTATE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCIVILSTATE(CDCIVILSTATE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCLINICAL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCLINICAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCLINICAL(CDCLINICAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCLINICALPLAN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCLINICALPLAN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCLINICALPLAN(CDCLINICALPLAN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCONSENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCONSENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCONSENT(CDCONSENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCONTACTPERSON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCONTACTPERSON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCONTACTPERSON(CDCONTACTPERSON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCONTENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCONTENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCONTENT(CDCONTENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCOUNTRY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCOUNTRY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCOUNTRY(CDCOUNTRY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDCURRENCY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDCURRENCY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDCURRENCY(CDCURRENCY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDDAYPERIOD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDDAYPERIOD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDDAYPERIOD(CDDAYPERIOD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDDISCHARGETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDDISCHARGETYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDDISCHARGETYPE(CDDISCHARGETYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDDRUGCNK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDDRUGCNK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDDRUGCNK(CDDRUGCNK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDDRUGPRESENTATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDDRUGPRESENTATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDDRUGPRESENTATION(CDDRUGPRESENTATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDDRUGROUTE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDDRUGROUTE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDDRUGROUTE(CDDRUGROUTE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEBIRTHARTIFICIALRESPIRATIONTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEBIRTHARTIFICIALRESPIRATIONTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEBIRTHARTIFICIALRESPIRATIONTYPE(CDEBIRTHARTIFICIALRESPIRATIONTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEBIRTHCAESAREANINDICATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEBIRTHCAESAREANINDICATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEBIRTHCAESAREANINDICATION(CDEBIRTHCAESAREANINDICATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEBIRTHCHILDPOSITION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEBIRTHCHILDPOSITION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEBIRTHCHILDPOSITION(CDEBIRTHCHILDPOSITION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEBIRTHCONGENITALMALFORMATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEBIRTHCONGENITALMALFORMATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEBIRTHCONGENITALMALFORMATION(CDEBIRTHCONGENITALMALFORMATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEBIRTHDELIVERYWAY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEBIRTHDELIVERYWAY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEBIRTHDELIVERYWAY(CDEBIRTHDELIVERYWAY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEBIRTHFOETALMONITORING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEBIRTHFOETALMONITORING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEBIRTHFOETALMONITORING(CDEBIRTHFOETALMONITORING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEBIRTHNEONATALDEPTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEBIRTHNEONATALDEPTTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEBIRTHNEONATALDEPTTYPE(CDEBIRTHNEONATALDEPTTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEBIRTHPLACE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEBIRTHPLACE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEBIRTHPLACE(CDEBIRTHPLACE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEBIRTHPREGNANCYORIGIN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEBIRTHPREGNANCYORIGIN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEBIRTHPREGNANCYORIGIN(CDEBIRTHPREGNANCYORIGIN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEBIRTHSPECIALVALUES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEBIRTHSPECIALVALUES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEBIRTHSPECIALVALUES(CDEBIRTHSPECIALVALUES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDECG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDECG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDECG(CDECG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEMERGENCYEVALUATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEMERGENCYEVALUATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEMERGENCYEVALUATION(CDEMERGENCYEVALUATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEMPLOYMENTSITUATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEMPLOYMENTSITUATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEMPLOYMENTSITUATION(CDEMPLOYMENTSITUATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDENCOUNTER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDENCOUNTER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDENCOUNTER(CDENCOUNTER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDENCOUNTERSAFETYISSUE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDENCOUNTERSAFETYISSUE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDENCOUNTERSAFETYISSUE(CDENCOUNTERSAFETYISSUE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDENCRYPTIONACTOR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDENCRYPTIONACTOR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDENCRYPTIONACTOR(CDENCRYPTIONACTOR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDENCRYPTIONMETHOD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDENCRYPTIONMETHOD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDENCRYPTIONMETHOD(CDENCRYPTIONMETHOD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDERROR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDERROR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDERROR(CDERROR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDERRORMYCARENET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDERRORMYCARENET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDERRORMYCARENET(CDERRORMYCARENET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEXTERNALSOURCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEXTERNALSOURCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEXTERNALSOURCE(CDEXTERNALSOURCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDFORMULARY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDFORMULARY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDFORMULARY(CDFORMULARY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDGALENICFORM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDGALENICFORM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDGALENICFORM(CDGALENICFORM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDHCPARTY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDHCPARTY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDHCPARTY(CDHCPARTY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDHEADING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDHEADING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDHEADING(CDHEADING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDHEADINGREG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDHEADINGREG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDHEADINGREG(CDHEADINGREG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDIMPLANTATIONDEVICE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDIMPLANTATIONDEVICE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDIMPLANTATIONDEVICE(CDIMPLANTATIONDEVICE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDIMPLANTATIONTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDIMPLANTATIONTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDIMPLANTATIONTYPE(CDIMPLANTATIONTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDINCAPACITY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDINCAPACITY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDINCAPACITY(CDINCAPACITY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDINCAPACITYREASON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDINCAPACITYREASON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDINCAPACITYREASON(CDINCAPACITYREASON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDINNCLUSTER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDINNCLUSTER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDINNCLUSTER(CDINNCLUSTER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDITEM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDITEM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDITEM(CDITEM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDITEMBVT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDITEMBVT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDITEMBVT(CDITEMBVT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDITEMCARENET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDITEMCARENET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDITEMCARENET(CDITEMCARENET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDITEMEBIRTH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDITEMEBIRTH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDITEMEBIRTH(CDITEMEBIRTH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDITEMMAA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDITEMMAA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDITEMMAA(CDITEMMAA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDITEMMS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDITEMMS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDITEMMS(CDITEMMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDITEMMYCARENET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDITEMMYCARENET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDITEMMYCARENET(CDITEMMYCARENET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDITEMREG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDITEMREG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDITEMREG(CDITEMREG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDLAB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDLAB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDLAB(CDLAB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDLEGALSERVICE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDLEGALSERVICE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDLEGALSERVICE(CDLEGALSERVICE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDLIFECYCLE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDLIFECYCLE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDLIFECYCLE(CDLIFECYCLE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMAACOVERAGETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMAACOVERAGETYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMAACOVERAGETYPE(CDMAACOVERAGETYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMAAREFUSALJUSTIFICATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMAAREFUSALJUSTIFICATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMAAREFUSALJUSTIFICATION(CDMAAREFUSALJUSTIFICATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMAAREQUESTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMAAREQUESTTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMAAREQUESTTYPE(CDMAAREQUESTTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMAARESPONSETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMAARESPONSETYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMAARESPONSETYPE(CDMAARESPONSETYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMAATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMAATYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMAATYPE(CDMAATYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMEDICATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMEDICATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMEDICATION(CDMEDICATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMESSAGE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMESSAGE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMESSAGE(CDMESSAGE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMICROORGANISM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMICROORGANISM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMICROORGANISM(CDMICROORGANISM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMKGADMISSION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMKGADMISSION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMKGADMISSION(CDMKGADMISSION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMKGDESTINATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMKGDESTINATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMKGDESTINATION(CDMKGDESTINATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMKGDISCHARGE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMKGDISCHARGE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMKGDISCHARGE(CDMKGDISCHARGE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMKGORIGIN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMKGORIGIN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMKGORIGIN(CDMKGORIGIN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMKGREFERRER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMKGREFERRER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMKGREFERRER(CDMKGREFERRER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMSADAPTATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMSADAPTATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMSADAPTATION(CDMSADAPTATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMSMEDICATIONTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMSMEDICATIONTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMSMEDICATIONTYPE(CDMSMEDICATIONTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMSORIGIN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMSORIGIN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMSORIGIN(CDMSORIGIN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDMYCARENETJUSTIFICATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDMYCARENETJUSTIFICATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDMYCARENETJUSTIFICATION(CDMYCARENETJUSTIFICATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDORTHOAPPROACH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDORTHOAPPROACH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDORTHOAPPROACH(CDORTHOAPPROACH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDORTHODIAGNOSIS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDORTHODIAGNOSIS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDORTHODIAGNOSIS(CDORTHODIAGNOSIS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDORTHOGRAFT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDORTHOGRAFT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDORTHOGRAFT(CDORTHOGRAFT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDORTHOINTERFACE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDORTHOINTERFACE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDORTHOINTERFACE(CDORTHOINTERFACE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDORTHOKNEEINSERT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDORTHOKNEEINSERT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDORTHOKNEEINSERT(CDORTHOKNEEINSERT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDORTHONAVCOM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDORTHONAVCOM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDORTHONAVCOM(CDORTHONAVCOM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDORTHOTECHREVISION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDORTHOTECHREVISION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDORTHOTECHREVISION(CDORTHOTECHREVISION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDORTHOTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDORTHOTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDORTHOTYPE(CDORTHOTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDPARAMETER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDPARAMETER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDPARAMETER(CDPARAMETER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDPATIENTWILL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDPATIENTWILL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDPATIENTWILL(CDPATIENTWILL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDPATIENTWILLHOSP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDPATIENTWILLHOSP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDPATIENTWILLHOSP(CDPATIENTWILLHOSP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDPATIENTWILLRES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDPATIENTWILLRES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDPATIENTWILLRES(CDPATIENTWILLRES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDPERIODICITY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDPERIODICITY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDPERIODICITY(CDPERIODICITY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDPROOF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDPROOF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDPROOF(CDPROOF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDQUANTITYPREFIX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDQUANTITYPREFIX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDQUANTITYPREFIX(CDQUANTITYPREFIX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDREFSCOPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDREFSCOPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDREFSCOPE(CDREFSCOPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDREIMBURSEMENTNOMENCLATURE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDREIMBURSEMENTNOMENCLATURE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDREIMBURSEMENTNOMENCLATURE(CDREIMBURSEMENTNOMENCLATURE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDREVCOMPONENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDREVCOMPONENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDREVCOMPONENT(CDREVCOMPONENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDSEVERITY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDSEVERITY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDSEVERITY(CDSEVERITY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDSEX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDSEX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDSEX(CDSEX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDSITE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDSITE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDSITE(CDSITE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDSNOMED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDSNOMED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDSNOMED(CDSNOMED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDSTANDARD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDSTANDARD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDSTANDARD(CDSTANDARD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDSTENTBRIDGETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDSTENTBRIDGETYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDSTENTBRIDGETYPE(CDSTENTBRIDGETYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDSTENTDEVICE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDSTENTDEVICE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDSTENTDEVICE(CDSTENTDEVICE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDSTENTDOMINANCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDSTENTDOMINANCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDSTENTDOMINANCE(CDSTENTDOMINANCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDSTENTLESIONTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDSTENTLESIONTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDSTENTLESIONTYPE(CDSTENTLESIONTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDSTENTSEGMENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDSTENTSEGMENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDSTENTSEGMENT(CDSTENTSEGMENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDSUBSTANCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDSUBSTANCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDSUBSTANCE(CDSUBSTANCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDTECHNICAL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDTECHNICAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTECHNICAL(CDTECHNICAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDTELECOM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDTELECOM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTELECOM(CDTELECOM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDTEMPORALITY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDTEMPORALITY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTEMPORALITY(CDTEMPORALITY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDTHERAPEUTICLINK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDTHERAPEUTICLINK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTHERAPEUTICLINK(CDTHERAPEUTICLINK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDTIMEUNIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDTIMEUNIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTIMEUNIT(CDTIMEUNIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDTRANSACTION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDTRANSACTION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTRANSACTION(CDTRANSACTION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDTRANSACTIONCARENET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDTRANSACTIONCARENET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTRANSACTIONCARENET(CDTRANSACTIONCARENET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDTRANSACTIONMAA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDTRANSACTIONMAA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTRANSACTIONMAA(CDTRANSACTIONMAA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDTRANSACTIONMYCARENET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDTRANSACTIONMYCARENET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTRANSACTIONMYCARENET(CDTRANSACTIONMYCARENET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDTRANSACTIONREG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDTRANSACTIONREG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTRANSACTIONREG(CDTRANSACTIONREG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDTRANSACTIONTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDTRANSACTIONTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTRANSACTIONTYPE(CDTRANSACTIONTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDTUCOPATHOLOGYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDTUCOPATHOLOGYTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTUCOPATHOLOGYTYPE(CDTUCOPATHOLOGYTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDTUCOSTEMITYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDTUCOSTEMITYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTUCOSTEMITYPE(CDTUCOSTEMITYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDUNIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDUNIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDUNIT(CDUNIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDURGENCY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDURGENCY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDURGENCY(CDURGENCY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDVACCINE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDVACCINE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDVACCINE(CDVACCINE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDVACCINEINDICATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDVACCINEINDICATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDVACCINEINDICATION(CDVACCINEINDICATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDWEEKDAY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDWEEKDAY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDWEEKDAY(CDWEEKDAY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMPTY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMPTY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMPTY(EMPTY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICD(ICD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICPC(ICPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lnk Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lnk Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLnkType(LnkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LOCAL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LOCAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLOCAL(LOCAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CdSwitch
