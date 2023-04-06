/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd.util;

import be.fgov.ehealth.standards.kmehr.cd.cd.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage
 * @generated
 */
public class CdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CdPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdSwitch<Adapter> modelSwitch =
		new CdSwitch<Adapter>() {
			@Override
			public Adapter caseCDACCESSRIGHT(CDACCESSRIGHT object) {
				return createCDACCESSRIGHTAdapter();
			}
			@Override
			public Adapter caseCDACKNOWLEDGMENT(CDACKNOWLEDGMENT object) {
				return createCDACKNOWLEDGMENTAdapter();
			}
			@Override
			public Adapter caseCDACTSNURSING(CDACTSNURSING object) {
				return createCDACTSNURSINGAdapter();
			}
			@Override
			public Adapter caseCDADDRESS(CDADDRESS object) {
				return createCDADDRESSAdapter();
			}
			@Override
			public Adapter caseCDADMINISTRATIONUNIT(CDADMINISTRATIONUNIT object) {
				return createCDADMINISTRATIONUNITAdapter();
			}
			@Override
			public Adapter caseCDATC(CDATC object) {
				return createCDATCAdapter();
			}
			@Override
			public Adapter caseCDAUTONOMY(CDAUTONOMY object) {
				return createCDAUTONOMYAdapter();
			}
			@Override
			public Adapter caseCDBALLONDEVICE(CDBALLONDEVICE object) {
				return createCDBALLONDEVICEAdapter();
			}
			@Override
			public Adapter caseCDBCRDIFFERENTATIONDEGREE(CDBCRDIFFERENTATIONDEGREE object) {
				return createCDBCRDIFFERENTATIONDEGREEAdapter();
			}
			@Override
			public Adapter caseCDBEARINGSURFACE(CDBEARINGSURFACE object) {
				return createCDBEARINGSURFACEAdapter();
			}
			@Override
			public Adapter caseCDBVTAVAILABLEMATERIALS(CDBVTAVAILABLEMATERIALS object) {
				return createCDBVTAVAILABLEMATERIALSAdapter();
			}
			@Override
			public Adapter caseCDBVTCONSERVATIONDELAY(CDBVTCONSERVATIONDELAY object) {
				return createCDBVTCONSERVATIONDELAYAdapter();
			}
			@Override
			public Adapter caseCDBVTCONSERVATIONMODE(CDBVTCONSERVATIONMODE object) {
				return createCDBVTCONSERVATIONMODEAdapter();
			}
			@Override
			public Adapter caseCDBVTLATERALITY(CDBVTLATERALITY object) {
				return createCDBVTLATERALITYAdapter();
			}
			@Override
			public Adapter caseCDBVTPATIENTOPPOSITION(CDBVTPATIENTOPPOSITION object) {
				return createCDBVTPATIENTOPPOSITIONAdapter();
			}
			@Override
			public Adapter caseCDBVTSAMPLETYPE(CDBVTSAMPLETYPE object) {
				return createCDBVTSAMPLETYPEAdapter();
			}
			@Override
			public Adapter caseCDBVTSTATUS(CDBVTSTATUS object) {
				return createCDBVTSTATUSAdapter();
			}
			@Override
			public Adapter caseCDCARENETACCIDENTTYPE(CDCARENETACCIDENTTYPE object) {
				return createCDCARENETACCIDENTTYPEAdapter();
			}
			@Override
			public Adapter caseCDCARENETAGREEMENTTYPE(CDCARENETAGREEMENTTYPE object) {
				return createCDCARENETAGREEMENTTYPEAdapter();
			}
			@Override
			public Adapter caseCDCARENETDOCUMENT(CDCARENETDOCUMENT object) {
				return createCDCARENETDOCUMENTAdapter();
			}
			@Override
			public Adapter caseCDCARENETINSURANCYSTATUS(CDCARENETINSURANCYSTATUS object) {
				return createCDCARENETINSURANCYSTATUSAdapter();
			}
			@Override
			public Adapter caseCDCARENETMESSAGE(CDCARENETMESSAGE object) {
				return createCDCARENETMESSAGEAdapter();
			}
			@Override
			public Adapter caseCDCARENETMUTATIONINDICATOR(CDCARENETMUTATIONINDICATOR object) {
				return createCDCARENETMUTATIONINDICATORAdapter();
			}
			@Override
			public Adapter caseCDCARENETNATIONALINSURANCE(CDCARENETNATIONALINSURANCE object) {
				return createCDCARENETNATIONALINSURANCEAdapter();
			}
			@Override
			public Adapter caseCDCARENETPERSONALPART(CDCARENETPERSONALPART object) {
				return createCDCARENETPERSONALPARTAdapter();
			}
			@Override
			public Adapter caseCDCARENETREFUSALREASON(CDCARENETREFUSALREASON object) {
				return createCDCARENETREFUSALREASONAdapter();
			}
			@Override
			public Adapter caseCDCARENETSISCARDERROR(CDCARENETSISCARDERROR object) {
				return createCDCARENETSISCARDERRORAdapter();
			}
			@Override
			public Adapter caseCDCARENETTHIRDPAYERCONTRACT(CDCARENETTHIRDPAYERCONTRACT object) {
				return createCDCARENETTHIRDPAYERCONTRACTAdapter();
			}
			@Override
			public Adapter caseCDCARENETTYPE(CDCARENETTYPE object) {
				return createCDCARENETTYPEAdapter();
			}
			@Override
			public Adapter caseCDCAREPATH(CDCAREPATH object) {
				return createCDCAREPATHAdapter();
			}
			@Override
			public Adapter caseCDCERTAINTY(CDCERTAINTY object) {
				return createCDCERTAINTYAdapter();
			}
			@Override
			public Adapter caseCDCHAPTER4CATEGORY(CDCHAPTER4CATEGORY object) {
				return createCDCHAPTER4CATEGORYAdapter();
			}
			@Override
			public Adapter caseCDCHAPTER4CRITERIA(CDCHAPTER4CRITERIA object) {
				return createCDCHAPTER4CRITERIAAdapter();
			}
			@Override
			public Adapter caseCDCHAPTER4DOCUMENTSEQAPPENDIX(CDCHAPTER4DOCUMENTSEQAPPENDIX object) {
				return createCDCHAPTER4DOCUMENTSEQAPPENDIXAdapter();
			}
			@Override
			public Adapter caseCDCHAPTER4FORMALINTERPRETATION(CDCHAPTER4FORMALINTERPRETATION object) {
				return createCDCHAPTER4FORMALINTERPRETATIONAdapter();
			}
			@Override
			public Adapter caseCDCHAPTER4PARAGRAPH(CDCHAPTER4PARAGRAPH object) {
				return createCDCHAPTER4PARAGRAPHAdapter();
			}
			@Override
			public Adapter caseCDCHAPTER4VERSE(CDCHAPTER4VERSE object) {
				return createCDCHAPTER4VERSEAdapter();
			}
			@Override
			public Adapter caseCDCHAPTER4VERSESEQAPPENDIX(CDCHAPTER4VERSESEQAPPENDIX object) {
				return createCDCHAPTER4VERSESEQAPPENDIXAdapter();
			}
			@Override
			public Adapter caseCDCIVILSTATE(CDCIVILSTATE object) {
				return createCDCIVILSTATEAdapter();
			}
			@Override
			public Adapter caseCDCLINICAL(CDCLINICAL object) {
				return createCDCLINICALAdapter();
			}
			@Override
			public Adapter caseCDCLINICALPLAN(CDCLINICALPLAN object) {
				return createCDCLINICALPLANAdapter();
			}
			@Override
			public Adapter caseCDCONSENT(CDCONSENT object) {
				return createCDCONSENTAdapter();
			}
			@Override
			public Adapter caseCDCONTACTPERSON(CDCONTACTPERSON object) {
				return createCDCONTACTPERSONAdapter();
			}
			@Override
			public Adapter caseCDCONTENT(CDCONTENT object) {
				return createCDCONTENTAdapter();
			}
			@Override
			public Adapter caseCDCOUNTRY(CDCOUNTRY object) {
				return createCDCOUNTRYAdapter();
			}
			@Override
			public Adapter caseCDCURRENCY(CDCURRENCY object) {
				return createCDCURRENCYAdapter();
			}
			@Override
			public Adapter caseCDDAYPERIOD(CDDAYPERIOD object) {
				return createCDDAYPERIODAdapter();
			}
			@Override
			public Adapter caseCDDISCHARGETYPE(CDDISCHARGETYPE object) {
				return createCDDISCHARGETYPEAdapter();
			}
			@Override
			public Adapter caseCDDRUGCNK(CDDRUGCNK object) {
				return createCDDRUGCNKAdapter();
			}
			@Override
			public Adapter caseCDDRUGPRESENTATION(CDDRUGPRESENTATION object) {
				return createCDDRUGPRESENTATIONAdapter();
			}
			@Override
			public Adapter caseCDDRUGROUTE(CDDRUGROUTE object) {
				return createCDDRUGROUTEAdapter();
			}
			@Override
			public Adapter caseCDEBIRTHARTIFICIALRESPIRATIONTYPE(CDEBIRTHARTIFICIALRESPIRATIONTYPE object) {
				return createCDEBIRTHARTIFICIALRESPIRATIONTYPEAdapter();
			}
			@Override
			public Adapter caseCDEBIRTHCAESAREANINDICATION(CDEBIRTHCAESAREANINDICATION object) {
				return createCDEBIRTHCAESAREANINDICATIONAdapter();
			}
			@Override
			public Adapter caseCDEBIRTHCHILDPOSITION(CDEBIRTHCHILDPOSITION object) {
				return createCDEBIRTHCHILDPOSITIONAdapter();
			}
			@Override
			public Adapter caseCDEBIRTHCONGENITALMALFORMATION(CDEBIRTHCONGENITALMALFORMATION object) {
				return createCDEBIRTHCONGENITALMALFORMATIONAdapter();
			}
			@Override
			public Adapter caseCDEBIRTHDELIVERYWAY(CDEBIRTHDELIVERYWAY object) {
				return createCDEBIRTHDELIVERYWAYAdapter();
			}
			@Override
			public Adapter caseCDEBIRTHFOETALMONITORING(CDEBIRTHFOETALMONITORING object) {
				return createCDEBIRTHFOETALMONITORINGAdapter();
			}
			@Override
			public Adapter caseCDEBIRTHNEONATALDEPTTYPE(CDEBIRTHNEONATALDEPTTYPE object) {
				return createCDEBIRTHNEONATALDEPTTYPEAdapter();
			}
			@Override
			public Adapter caseCDEBIRTHPLACE(CDEBIRTHPLACE object) {
				return createCDEBIRTHPLACEAdapter();
			}
			@Override
			public Adapter caseCDEBIRTHPREGNANCYORIGIN(CDEBIRTHPREGNANCYORIGIN object) {
				return createCDEBIRTHPREGNANCYORIGINAdapter();
			}
			@Override
			public Adapter caseCDEBIRTHSPECIALVALUES(CDEBIRTHSPECIALVALUES object) {
				return createCDEBIRTHSPECIALVALUESAdapter();
			}
			@Override
			public Adapter caseCDECG(CDECG object) {
				return createCDECGAdapter();
			}
			@Override
			public Adapter caseCDEMERGENCYEVALUATION(CDEMERGENCYEVALUATION object) {
				return createCDEMERGENCYEVALUATIONAdapter();
			}
			@Override
			public Adapter caseCDEMPLOYMENTSITUATION(CDEMPLOYMENTSITUATION object) {
				return createCDEMPLOYMENTSITUATIONAdapter();
			}
			@Override
			public Adapter caseCDENCOUNTER(CDENCOUNTER object) {
				return createCDENCOUNTERAdapter();
			}
			@Override
			public Adapter caseCDENCOUNTERSAFETYISSUE(CDENCOUNTERSAFETYISSUE object) {
				return createCDENCOUNTERSAFETYISSUEAdapter();
			}
			@Override
			public Adapter caseCDENCRYPTIONACTOR(CDENCRYPTIONACTOR object) {
				return createCDENCRYPTIONACTORAdapter();
			}
			@Override
			public Adapter caseCDENCRYPTIONMETHOD(CDENCRYPTIONMETHOD object) {
				return createCDENCRYPTIONMETHODAdapter();
			}
			@Override
			public Adapter caseCDERROR(CDERROR object) {
				return createCDERRORAdapter();
			}
			@Override
			public Adapter caseCDERRORMYCARENET(CDERRORMYCARENET object) {
				return createCDERRORMYCARENETAdapter();
			}
			@Override
			public Adapter caseCDEXTERNALSOURCE(CDEXTERNALSOURCE object) {
				return createCDEXTERNALSOURCEAdapter();
			}
			@Override
			public Adapter caseCDFORMULARY(CDFORMULARY object) {
				return createCDFORMULARYAdapter();
			}
			@Override
			public Adapter caseCDGALENICFORM(CDGALENICFORM object) {
				return createCDGALENICFORMAdapter();
			}
			@Override
			public Adapter caseCDHCPARTY(CDHCPARTY object) {
				return createCDHCPARTYAdapter();
			}
			@Override
			public Adapter caseCDHEADING(CDHEADING object) {
				return createCDHEADINGAdapter();
			}
			@Override
			public Adapter caseCDHEADINGREG(CDHEADINGREG object) {
				return createCDHEADINGREGAdapter();
			}
			@Override
			public Adapter caseCDIMPLANTATIONDEVICE(CDIMPLANTATIONDEVICE object) {
				return createCDIMPLANTATIONDEVICEAdapter();
			}
			@Override
			public Adapter caseCDIMPLANTATIONTYPE(CDIMPLANTATIONTYPE object) {
				return createCDIMPLANTATIONTYPEAdapter();
			}
			@Override
			public Adapter caseCDINCAPACITY(CDINCAPACITY object) {
				return createCDINCAPACITYAdapter();
			}
			@Override
			public Adapter caseCDINCAPACITYREASON(CDINCAPACITYREASON object) {
				return createCDINCAPACITYREASONAdapter();
			}
			@Override
			public Adapter caseCDINNCLUSTER(CDINNCLUSTER object) {
				return createCDINNCLUSTERAdapter();
			}
			@Override
			public Adapter caseCDITEM(CDITEM object) {
				return createCDITEMAdapter();
			}
			@Override
			public Adapter caseCDITEMBVT(CDITEMBVT object) {
				return createCDITEMBVTAdapter();
			}
			@Override
			public Adapter caseCDITEMCARENET(CDITEMCARENET object) {
				return createCDITEMCARENETAdapter();
			}
			@Override
			public Adapter caseCDITEMEBIRTH(CDITEMEBIRTH object) {
				return createCDITEMEBIRTHAdapter();
			}
			@Override
			public Adapter caseCDITEMMAA(CDITEMMAA object) {
				return createCDITEMMAAAdapter();
			}
			@Override
			public Adapter caseCDITEMMS(CDITEMMS object) {
				return createCDITEMMSAdapter();
			}
			@Override
			public Adapter caseCDITEMMYCARENET(CDITEMMYCARENET object) {
				return createCDITEMMYCARENETAdapter();
			}
			@Override
			public Adapter caseCDITEMREG(CDITEMREG object) {
				return createCDITEMREGAdapter();
			}
			@Override
			public Adapter caseCDLAB(CDLAB object) {
				return createCDLABAdapter();
			}
			@Override
			public Adapter caseCDLEGALSERVICE(CDLEGALSERVICE object) {
				return createCDLEGALSERVICEAdapter();
			}
			@Override
			public Adapter caseCDLIFECYCLE(CDLIFECYCLE object) {
				return createCDLIFECYCLEAdapter();
			}
			@Override
			public Adapter caseCDMAACOVERAGETYPE(CDMAACOVERAGETYPE object) {
				return createCDMAACOVERAGETYPEAdapter();
			}
			@Override
			public Adapter caseCDMAAREFUSALJUSTIFICATION(CDMAAREFUSALJUSTIFICATION object) {
				return createCDMAAREFUSALJUSTIFICATIONAdapter();
			}
			@Override
			public Adapter caseCDMAAREQUESTTYPE(CDMAAREQUESTTYPE object) {
				return createCDMAAREQUESTTYPEAdapter();
			}
			@Override
			public Adapter caseCDMAARESPONSETYPE(CDMAARESPONSETYPE object) {
				return createCDMAARESPONSETYPEAdapter();
			}
			@Override
			public Adapter caseCDMAATYPE(CDMAATYPE object) {
				return createCDMAATYPEAdapter();
			}
			@Override
			public Adapter caseCDMEDICATION(CDMEDICATION object) {
				return createCDMEDICATIONAdapter();
			}
			@Override
			public Adapter caseCDMESSAGE(CDMESSAGE object) {
				return createCDMESSAGEAdapter();
			}
			@Override
			public Adapter caseCDMICROORGANISM(CDMICROORGANISM object) {
				return createCDMICROORGANISMAdapter();
			}
			@Override
			public Adapter caseCDMKGADMISSION(CDMKGADMISSION object) {
				return createCDMKGADMISSIONAdapter();
			}
			@Override
			public Adapter caseCDMKGDESTINATION(CDMKGDESTINATION object) {
				return createCDMKGDESTINATIONAdapter();
			}
			@Override
			public Adapter caseCDMKGDISCHARGE(CDMKGDISCHARGE object) {
				return createCDMKGDISCHARGEAdapter();
			}
			@Override
			public Adapter caseCDMKGORIGIN(CDMKGORIGIN object) {
				return createCDMKGORIGINAdapter();
			}
			@Override
			public Adapter caseCDMKGREFERRER(CDMKGREFERRER object) {
				return createCDMKGREFERRERAdapter();
			}
			@Override
			public Adapter caseCDMSADAPTATION(CDMSADAPTATION object) {
				return createCDMSADAPTATIONAdapter();
			}
			@Override
			public Adapter caseCDMSMEDICATIONTYPE(CDMSMEDICATIONTYPE object) {
				return createCDMSMEDICATIONTYPEAdapter();
			}
			@Override
			public Adapter caseCDMSORIGIN(CDMSORIGIN object) {
				return createCDMSORIGINAdapter();
			}
			@Override
			public Adapter caseCDMYCARENETJUSTIFICATION(CDMYCARENETJUSTIFICATION object) {
				return createCDMYCARENETJUSTIFICATIONAdapter();
			}
			@Override
			public Adapter caseCDORTHOAPPROACH(CDORTHOAPPROACH object) {
				return createCDORTHOAPPROACHAdapter();
			}
			@Override
			public Adapter caseCDORTHODIAGNOSIS(CDORTHODIAGNOSIS object) {
				return createCDORTHODIAGNOSISAdapter();
			}
			@Override
			public Adapter caseCDORTHOGRAFT(CDORTHOGRAFT object) {
				return createCDORTHOGRAFTAdapter();
			}
			@Override
			public Adapter caseCDORTHOINTERFACE(CDORTHOINTERFACE object) {
				return createCDORTHOINTERFACEAdapter();
			}
			@Override
			public Adapter caseCDORTHOKNEEINSERT(CDORTHOKNEEINSERT object) {
				return createCDORTHOKNEEINSERTAdapter();
			}
			@Override
			public Adapter caseCDORTHONAVCOM(CDORTHONAVCOM object) {
				return createCDORTHONAVCOMAdapter();
			}
			@Override
			public Adapter caseCDORTHOTECHREVISION(CDORTHOTECHREVISION object) {
				return createCDORTHOTECHREVISIONAdapter();
			}
			@Override
			public Adapter caseCDORTHOTYPE(CDORTHOTYPE object) {
				return createCDORTHOTYPEAdapter();
			}
			@Override
			public Adapter caseCDPARAMETER(CDPARAMETER object) {
				return createCDPARAMETERAdapter();
			}
			@Override
			public Adapter caseCDPATIENTWILL(CDPATIENTWILL object) {
				return createCDPATIENTWILLAdapter();
			}
			@Override
			public Adapter caseCDPATIENTWILLHOSP(CDPATIENTWILLHOSP object) {
				return createCDPATIENTWILLHOSPAdapter();
			}
			@Override
			public Adapter caseCDPATIENTWILLRES(CDPATIENTWILLRES object) {
				return createCDPATIENTWILLRESAdapter();
			}
			@Override
			public Adapter caseCDPERIODICITY(CDPERIODICITY object) {
				return createCDPERIODICITYAdapter();
			}
			@Override
			public Adapter caseCDPROOF(CDPROOF object) {
				return createCDPROOFAdapter();
			}
			@Override
			public Adapter caseCDQUANTITYPREFIX(CDQUANTITYPREFIX object) {
				return createCDQUANTITYPREFIXAdapter();
			}
			@Override
			public Adapter caseCDREFSCOPE(CDREFSCOPE object) {
				return createCDREFSCOPEAdapter();
			}
			@Override
			public Adapter caseCDREIMBURSEMENTNOMENCLATURE(CDREIMBURSEMENTNOMENCLATURE object) {
				return createCDREIMBURSEMENTNOMENCLATUREAdapter();
			}
			@Override
			public Adapter caseCDREVCOMPONENT(CDREVCOMPONENT object) {
				return createCDREVCOMPONENTAdapter();
			}
			@Override
			public Adapter caseCDSEVERITY(CDSEVERITY object) {
				return createCDSEVERITYAdapter();
			}
			@Override
			public Adapter caseCDSEX(CDSEX object) {
				return createCDSEXAdapter();
			}
			@Override
			public Adapter caseCDSITE(CDSITE object) {
				return createCDSITEAdapter();
			}
			@Override
			public Adapter caseCDSNOMED(CDSNOMED object) {
				return createCDSNOMEDAdapter();
			}
			@Override
			public Adapter caseCDSTANDARD(CDSTANDARD object) {
				return createCDSTANDARDAdapter();
			}
			@Override
			public Adapter caseCDSTENTBRIDGETYPE(CDSTENTBRIDGETYPE object) {
				return createCDSTENTBRIDGETYPEAdapter();
			}
			@Override
			public Adapter caseCDSTENTDEVICE(CDSTENTDEVICE object) {
				return createCDSTENTDEVICEAdapter();
			}
			@Override
			public Adapter caseCDSTENTDOMINANCE(CDSTENTDOMINANCE object) {
				return createCDSTENTDOMINANCEAdapter();
			}
			@Override
			public Adapter caseCDSTENTLESIONTYPE(CDSTENTLESIONTYPE object) {
				return createCDSTENTLESIONTYPEAdapter();
			}
			@Override
			public Adapter caseCDSTENTSEGMENT(CDSTENTSEGMENT object) {
				return createCDSTENTSEGMENTAdapter();
			}
			@Override
			public Adapter caseCDSUBSTANCE(CDSUBSTANCE object) {
				return createCDSUBSTANCEAdapter();
			}
			@Override
			public Adapter caseCDTECHNICAL(CDTECHNICAL object) {
				return createCDTECHNICALAdapter();
			}
			@Override
			public Adapter caseCDTELECOM(CDTELECOM object) {
				return createCDTELECOMAdapter();
			}
			@Override
			public Adapter caseCDTEMPORALITY(CDTEMPORALITY object) {
				return createCDTEMPORALITYAdapter();
			}
			@Override
			public Adapter caseCDTHERAPEUTICLINK(CDTHERAPEUTICLINK object) {
				return createCDTHERAPEUTICLINKAdapter();
			}
			@Override
			public Adapter caseCDTIMEUNIT(CDTIMEUNIT object) {
				return createCDTIMEUNITAdapter();
			}
			@Override
			public Adapter caseCDTRANSACTION(CDTRANSACTION object) {
				return createCDTRANSACTIONAdapter();
			}
			@Override
			public Adapter caseCDTRANSACTIONCARENET(CDTRANSACTIONCARENET object) {
				return createCDTRANSACTIONCARENETAdapter();
			}
			@Override
			public Adapter caseCDTRANSACTIONMAA(CDTRANSACTIONMAA object) {
				return createCDTRANSACTIONMAAAdapter();
			}
			@Override
			public Adapter caseCDTRANSACTIONMYCARENET(CDTRANSACTIONMYCARENET object) {
				return createCDTRANSACTIONMYCARENETAdapter();
			}
			@Override
			public Adapter caseCDTRANSACTIONREG(CDTRANSACTIONREG object) {
				return createCDTRANSACTIONREGAdapter();
			}
			@Override
			public Adapter caseCDTRANSACTIONTYPE(CDTRANSACTIONTYPE object) {
				return createCDTRANSACTIONTYPEAdapter();
			}
			@Override
			public Adapter caseCDTUCOPATHOLOGYTYPE(CDTUCOPATHOLOGYTYPE object) {
				return createCDTUCOPATHOLOGYTYPEAdapter();
			}
			@Override
			public Adapter caseCDTUCOSTEMITYPE(CDTUCOSTEMITYPE object) {
				return createCDTUCOSTEMITYPEAdapter();
			}
			@Override
			public Adapter caseCDUNIT(CDUNIT object) {
				return createCDUNITAdapter();
			}
			@Override
			public Adapter caseCDURGENCY(CDURGENCY object) {
				return createCDURGENCYAdapter();
			}
			@Override
			public Adapter caseCDVACCINE(CDVACCINE object) {
				return createCDVACCINEAdapter();
			}
			@Override
			public Adapter caseCDVACCINEINDICATION(CDVACCINEINDICATION object) {
				return createCDVACCINEINDICATIONAdapter();
			}
			@Override
			public Adapter caseCDWEEKDAY(CDWEEKDAY object) {
				return createCDWEEKDAYAdapter();
			}
			@Override
			public Adapter caseEMPTY(EMPTY object) {
				return createEMPTYAdapter();
			}
			@Override
			public Adapter caseICD(ICD object) {
				return createICDAdapter();
			}
			@Override
			public Adapter caseICPC(ICPC object) {
				return createICPCAdapter();
			}
			@Override
			public Adapter caseLnkType(LnkType object) {
				return createLnkTypeAdapter();
			}
			@Override
			public Adapter caseLOCAL(LOCAL object) {
				return createLOCALAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDACCESSRIGHT <em>CDACCESSRIGHT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDACCESSRIGHT
	 * @generated
	 */
	public Adapter createCDACCESSRIGHTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDACKNOWLEDGMENT <em>CDACKNOWLEDGMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDACKNOWLEDGMENT
	 * @generated
	 */
	public Adapter createCDACKNOWLEDGMENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDACTSNURSING <em>CDACTSNURSING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDACTSNURSING
	 * @generated
	 */
	public Adapter createCDACTSNURSINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDADDRESS <em>CDADDRESS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDADDRESS
	 * @generated
	 */
	public Adapter createCDADDRESSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDADMINISTRATIONUNIT <em>CDADMINISTRATIONUNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDADMINISTRATIONUNIT
	 * @generated
	 */
	public Adapter createCDADMINISTRATIONUNITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDATC <em>CDATC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDATC
	 * @generated
	 */
	public Adapter createCDATCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDAUTONOMY <em>CDAUTONOMY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDAUTONOMY
	 * @generated
	 */
	public Adapter createCDAUTONOMYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDBALLONDEVICE <em>CDBALLONDEVICE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDBALLONDEVICE
	 * @generated
	 */
	public Adapter createCDBALLONDEVICEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDBCRDIFFERENTATIONDEGREE <em>CDBCRDIFFERENTATIONDEGREE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDBCRDIFFERENTATIONDEGREE
	 * @generated
	 */
	public Adapter createCDBCRDIFFERENTATIONDEGREEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDBEARINGSURFACE <em>CDBEARINGSURFACE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDBEARINGSURFACE
	 * @generated
	 */
	public Adapter createCDBEARINGSURFACEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTAVAILABLEMATERIALS <em>CDBVTAVAILABLEMATERIALS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTAVAILABLEMATERIALS
	 * @generated
	 */
	public Adapter createCDBVTAVAILABLEMATERIALSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTCONSERVATIONDELAY <em>CDBVTCONSERVATIONDELAY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTCONSERVATIONDELAY
	 * @generated
	 */
	public Adapter createCDBVTCONSERVATIONDELAYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTCONSERVATIONMODE <em>CDBVTCONSERVATIONMODE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTCONSERVATIONMODE
	 * @generated
	 */
	public Adapter createCDBVTCONSERVATIONMODEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTLATERALITY <em>CDBVTLATERALITY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTLATERALITY
	 * @generated
	 */
	public Adapter createCDBVTLATERALITYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTPATIENTOPPOSITION <em>CDBVTPATIENTOPPOSITION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTPATIENTOPPOSITION
	 * @generated
	 */
	public Adapter createCDBVTPATIENTOPPOSITIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTSAMPLETYPE <em>CDBVTSAMPLETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTSAMPLETYPE
	 * @generated
	 */
	public Adapter createCDBVTSAMPLETYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTSTATUS <em>CDBVTSTATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDBVTSTATUS
	 * @generated
	 */
	public Adapter createCDBVTSTATUSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETACCIDENTTYPE <em>CDCARENETACCIDENTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETACCIDENTTYPE
	 * @generated
	 */
	public Adapter createCDCARENETACCIDENTTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETAGREEMENTTYPE <em>CDCARENETAGREEMENTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETAGREEMENTTYPE
	 * @generated
	 */
	public Adapter createCDCARENETAGREEMENTTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETDOCUMENT <em>CDCARENETDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETDOCUMENT
	 * @generated
	 */
	public Adapter createCDCARENETDOCUMENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETINSURANCYSTATUS <em>CDCARENETINSURANCYSTATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETINSURANCYSTATUS
	 * @generated
	 */
	public Adapter createCDCARENETINSURANCYSTATUSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETMESSAGE <em>CDCARENETMESSAGE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETMESSAGE
	 * @generated
	 */
	public Adapter createCDCARENETMESSAGEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETMUTATIONINDICATOR <em>CDCARENETMUTATIONINDICATOR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETMUTATIONINDICATOR
	 * @generated
	 */
	public Adapter createCDCARENETMUTATIONINDICATORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETNATIONALINSURANCE <em>CDCARENETNATIONALINSURANCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETNATIONALINSURANCE
	 * @generated
	 */
	public Adapter createCDCARENETNATIONALINSURANCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETPERSONALPART <em>CDCARENETPERSONALPART</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETPERSONALPART
	 * @generated
	 */
	public Adapter createCDCARENETPERSONALPARTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETREFUSALREASON <em>CDCARENETREFUSALREASON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETREFUSALREASON
	 * @generated
	 */
	public Adapter createCDCARENETREFUSALREASONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETSISCARDERROR <em>CDCARENETSISCARDERROR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETSISCARDERROR
	 * @generated
	 */
	public Adapter createCDCARENETSISCARDERRORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETTHIRDPAYERCONTRACT <em>CDCARENETTHIRDPAYERCONTRACT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETTHIRDPAYERCONTRACT
	 * @generated
	 */
	public Adapter createCDCARENETTHIRDPAYERCONTRACTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETTYPE <em>CDCARENETTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCARENETTYPE
	 * @generated
	 */
	public Adapter createCDCARENETTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCAREPATH <em>CDCAREPATH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCAREPATH
	 * @generated
	 */
	public Adapter createCDCAREPATHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCERTAINTY <em>CDCERTAINTY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCERTAINTY
	 * @generated
	 */
	public Adapter createCDCERTAINTYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4CATEGORY <em>CDCHAPTER4CATEGORY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4CATEGORY
	 * @generated
	 */
	public Adapter createCDCHAPTER4CATEGORYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4CRITERIA <em>CDCHAPTER4CRITERIA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4CRITERIA
	 * @generated
	 */
	public Adapter createCDCHAPTER4CRITERIAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4DOCUMENTSEQAPPENDIX <em>CDCHAPTER4DOCUMENTSEQAPPENDIX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4DOCUMENTSEQAPPENDIX
	 * @generated
	 */
	public Adapter createCDCHAPTER4DOCUMENTSEQAPPENDIXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4FORMALINTERPRETATION <em>CDCHAPTER4FORMALINTERPRETATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4FORMALINTERPRETATION
	 * @generated
	 */
	public Adapter createCDCHAPTER4FORMALINTERPRETATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4PARAGRAPH <em>CDCHAPTER4PARAGRAPH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4PARAGRAPH
	 * @generated
	 */
	public Adapter createCDCHAPTER4PARAGRAPHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4VERSE <em>CDCHAPTER4VERSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4VERSE
	 * @generated
	 */
	public Adapter createCDCHAPTER4VERSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4VERSESEQAPPENDIX <em>CDCHAPTER4VERSESEQAPPENDIX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCHAPTER4VERSESEQAPPENDIX
	 * @generated
	 */
	public Adapter createCDCHAPTER4VERSESEQAPPENDIXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCIVILSTATE <em>CDCIVILSTATE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCIVILSTATE
	 * @generated
	 */
	public Adapter createCDCIVILSTATEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCLINICAL <em>CDCLINICAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCLINICAL
	 * @generated
	 */
	public Adapter createCDCLINICALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCLINICALPLAN <em>CDCLINICALPLAN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCLINICALPLAN
	 * @generated
	 */
	public Adapter createCDCLINICALPLANAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCONSENT <em>CDCONSENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCONSENT
	 * @generated
	 */
	public Adapter createCDCONSENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCONTACTPERSON <em>CDCONTACTPERSON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCONTACTPERSON
	 * @generated
	 */
	public Adapter createCDCONTACTPERSONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCONTENT <em>CDCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCONTENT
	 * @generated
	 */
	public Adapter createCDCONTENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCOUNTRY <em>CDCOUNTRY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCOUNTRY
	 * @generated
	 */
	public Adapter createCDCOUNTRYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDCURRENCY <em>CDCURRENCY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDCURRENCY
	 * @generated
	 */
	public Adapter createCDCURRENCYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDDAYPERIOD <em>CDDAYPERIOD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDDAYPERIOD
	 * @generated
	 */
	public Adapter createCDDAYPERIODAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDDISCHARGETYPE <em>CDDISCHARGETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDDISCHARGETYPE
	 * @generated
	 */
	public Adapter createCDDISCHARGETYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDDRUGCNK <em>CDDRUGCNK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDDRUGCNK
	 * @generated
	 */
	public Adapter createCDDRUGCNKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDDRUGPRESENTATION <em>CDDRUGPRESENTATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDDRUGPRESENTATION
	 * @generated
	 */
	public Adapter createCDDRUGPRESENTATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDDRUGROUTE <em>CDDRUGROUTE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDDRUGROUTE
	 * @generated
	 */
	public Adapter createCDDRUGROUTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHARTIFICIALRESPIRATIONTYPE <em>CDEBIRTHARTIFICIALRESPIRATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHARTIFICIALRESPIRATIONTYPE
	 * @generated
	 */
	public Adapter createCDEBIRTHARTIFICIALRESPIRATIONTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHCAESAREANINDICATION <em>CDEBIRTHCAESAREANINDICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHCAESAREANINDICATION
	 * @generated
	 */
	public Adapter createCDEBIRTHCAESAREANINDICATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHCHILDPOSITION <em>CDEBIRTHCHILDPOSITION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHCHILDPOSITION
	 * @generated
	 */
	public Adapter createCDEBIRTHCHILDPOSITIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHCONGENITALMALFORMATION <em>CDEBIRTHCONGENITALMALFORMATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHCONGENITALMALFORMATION
	 * @generated
	 */
	public Adapter createCDEBIRTHCONGENITALMALFORMATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHDELIVERYWAY <em>CDEBIRTHDELIVERYWAY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHDELIVERYWAY
	 * @generated
	 */
	public Adapter createCDEBIRTHDELIVERYWAYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHFOETALMONITORING <em>CDEBIRTHFOETALMONITORING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHFOETALMONITORING
	 * @generated
	 */
	public Adapter createCDEBIRTHFOETALMONITORINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHNEONATALDEPTTYPE <em>CDEBIRTHNEONATALDEPTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHNEONATALDEPTTYPE
	 * @generated
	 */
	public Adapter createCDEBIRTHNEONATALDEPTTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHPLACE <em>CDEBIRTHPLACE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHPLACE
	 * @generated
	 */
	public Adapter createCDEBIRTHPLACEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHPREGNANCYORIGIN <em>CDEBIRTHPREGNANCYORIGIN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHPREGNANCYORIGIN
	 * @generated
	 */
	public Adapter createCDEBIRTHPREGNANCYORIGINAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHSPECIALVALUES <em>CDEBIRTHSPECIALVALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDEBIRTHSPECIALVALUES
	 * @generated
	 */
	public Adapter createCDEBIRTHSPECIALVALUESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDECG <em>CDECG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDECG
	 * @generated
	 */
	public Adapter createCDECGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEMERGENCYEVALUATION <em>CDEMERGENCYEVALUATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDEMERGENCYEVALUATION
	 * @generated
	 */
	public Adapter createCDEMERGENCYEVALUATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEMPLOYMENTSITUATION <em>CDEMPLOYMENTSITUATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDEMPLOYMENTSITUATION
	 * @generated
	 */
	public Adapter createCDEMPLOYMENTSITUATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDENCOUNTER <em>CDENCOUNTER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDENCOUNTER
	 * @generated
	 */
	public Adapter createCDENCOUNTERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDENCOUNTERSAFETYISSUE <em>CDENCOUNTERSAFETYISSUE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDENCOUNTERSAFETYISSUE
	 * @generated
	 */
	public Adapter createCDENCOUNTERSAFETYISSUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDENCRYPTIONACTOR <em>CDENCRYPTIONACTOR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDENCRYPTIONACTOR
	 * @generated
	 */
	public Adapter createCDENCRYPTIONACTORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDENCRYPTIONMETHOD <em>CDENCRYPTIONMETHOD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDENCRYPTIONMETHOD
	 * @generated
	 */
	public Adapter createCDENCRYPTIONMETHODAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDERROR <em>CDERROR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDERROR
	 * @generated
	 */
	public Adapter createCDERRORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDERRORMYCARENET <em>CDERRORMYCARENET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDERRORMYCARENET
	 * @generated
	 */
	public Adapter createCDERRORMYCARENETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDEXTERNALSOURCE <em>CDEXTERNALSOURCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDEXTERNALSOURCE
	 * @generated
	 */
	public Adapter createCDEXTERNALSOURCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDFORMULARY <em>CDFORMULARY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDFORMULARY
	 * @generated
	 */
	public Adapter createCDFORMULARYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDGALENICFORM <em>CDGALENICFORM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDGALENICFORM
	 * @generated
	 */
	public Adapter createCDGALENICFORMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDHCPARTY <em>CDHCPARTY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDHCPARTY
	 * @generated
	 */
	public Adapter createCDHCPARTYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDHEADING <em>CDHEADING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDHEADING
	 * @generated
	 */
	public Adapter createCDHEADINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDHEADINGREG <em>CDHEADINGREG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDHEADINGREG
	 * @generated
	 */
	public Adapter createCDHEADINGREGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDIMPLANTATIONDEVICE <em>CDIMPLANTATIONDEVICE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDIMPLANTATIONDEVICE
	 * @generated
	 */
	public Adapter createCDIMPLANTATIONDEVICEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDIMPLANTATIONTYPE <em>CDIMPLANTATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDIMPLANTATIONTYPE
	 * @generated
	 */
	public Adapter createCDIMPLANTATIONTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDINCAPACITY <em>CDINCAPACITY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDINCAPACITY
	 * @generated
	 */
	public Adapter createCDINCAPACITYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDINCAPACITYREASON <em>CDINCAPACITYREASON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDINCAPACITYREASON
	 * @generated
	 */
	public Adapter createCDINCAPACITYREASONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDINNCLUSTER <em>CDINNCLUSTER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDINNCLUSTER
	 * @generated
	 */
	public Adapter createCDINNCLUSTERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDITEM <em>CDITEM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDITEM
	 * @generated
	 */
	public Adapter createCDITEMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMBVT <em>CDITEMBVT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMBVT
	 * @generated
	 */
	public Adapter createCDITEMBVTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMCARENET <em>CDITEMCARENET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMCARENET
	 * @generated
	 */
	public Adapter createCDITEMCARENETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMEBIRTH <em>CDITEMEBIRTH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMEBIRTH
	 * @generated
	 */
	public Adapter createCDITEMEBIRTHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMMAA <em>CDITEMMAA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMMAA
	 * @generated
	 */
	public Adapter createCDITEMMAAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMMS <em>CDITEMMS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMMS
	 * @generated
	 */
	public Adapter createCDITEMMSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMMYCARENET <em>CDITEMMYCARENET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMMYCARENET
	 * @generated
	 */
	public Adapter createCDITEMMYCARENETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMREG <em>CDITEMREG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDITEMREG
	 * @generated
	 */
	public Adapter createCDITEMREGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDLAB <em>CDLAB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDLAB
	 * @generated
	 */
	public Adapter createCDLABAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDLEGALSERVICE <em>CDLEGALSERVICE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDLEGALSERVICE
	 * @generated
	 */
	public Adapter createCDLEGALSERVICEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDLIFECYCLE <em>CDLIFECYCLE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDLIFECYCLE
	 * @generated
	 */
	public Adapter createCDLIFECYCLEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMAACOVERAGETYPE <em>CDMAACOVERAGETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMAACOVERAGETYPE
	 * @generated
	 */
	public Adapter createCDMAACOVERAGETYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMAAREFUSALJUSTIFICATION <em>CDMAAREFUSALJUSTIFICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMAAREFUSALJUSTIFICATION
	 * @generated
	 */
	public Adapter createCDMAAREFUSALJUSTIFICATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMAAREQUESTTYPE <em>CDMAAREQUESTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMAAREQUESTTYPE
	 * @generated
	 */
	public Adapter createCDMAAREQUESTTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMAARESPONSETYPE <em>CDMAARESPONSETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMAARESPONSETYPE
	 * @generated
	 */
	public Adapter createCDMAARESPONSETYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMAATYPE <em>CDMAATYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMAATYPE
	 * @generated
	 */
	public Adapter createCDMAATYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION <em>CDMEDICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION
	 * @generated
	 */
	public Adapter createCDMEDICATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMESSAGE <em>CDMESSAGE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMESSAGE
	 * @generated
	 */
	public Adapter createCDMESSAGEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMICROORGANISM <em>CDMICROORGANISM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMICROORGANISM
	 * @generated
	 */
	public Adapter createCDMICROORGANISMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMKGADMISSION <em>CDMKGADMISSION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMKGADMISSION
	 * @generated
	 */
	public Adapter createCDMKGADMISSIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMKGDESTINATION <em>CDMKGDESTINATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMKGDESTINATION
	 * @generated
	 */
	public Adapter createCDMKGDESTINATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMKGDISCHARGE <em>CDMKGDISCHARGE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMKGDISCHARGE
	 * @generated
	 */
	public Adapter createCDMKGDISCHARGEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMKGORIGIN <em>CDMKGORIGIN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMKGORIGIN
	 * @generated
	 */
	public Adapter createCDMKGORIGINAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMKGREFERRER <em>CDMKGREFERRER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMKGREFERRER
	 * @generated
	 */
	public Adapter createCDMKGREFERRERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMSADAPTATION <em>CDMSADAPTATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMSADAPTATION
	 * @generated
	 */
	public Adapter createCDMSADAPTATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMSMEDICATIONTYPE <em>CDMSMEDICATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMSMEDICATIONTYPE
	 * @generated
	 */
	public Adapter createCDMSMEDICATIONTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMSORIGIN <em>CDMSORIGIN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMSORIGIN
	 * @generated
	 */
	public Adapter createCDMSORIGINAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDMYCARENETJUSTIFICATION <em>CDMYCARENETJUSTIFICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDMYCARENETJUSTIFICATION
	 * @generated
	 */
	public Adapter createCDMYCARENETJUSTIFICATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHOAPPROACH <em>CDORTHOAPPROACH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHOAPPROACH
	 * @generated
	 */
	public Adapter createCDORTHOAPPROACHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHODIAGNOSIS <em>CDORTHODIAGNOSIS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHODIAGNOSIS
	 * @generated
	 */
	public Adapter createCDORTHODIAGNOSISAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHOGRAFT <em>CDORTHOGRAFT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHOGRAFT
	 * @generated
	 */
	public Adapter createCDORTHOGRAFTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHOINTERFACE <em>CDORTHOINTERFACE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHOINTERFACE
	 * @generated
	 */
	public Adapter createCDORTHOINTERFACEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHOKNEEINSERT <em>CDORTHOKNEEINSERT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHOKNEEINSERT
	 * @generated
	 */
	public Adapter createCDORTHOKNEEINSERTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHONAVCOM <em>CDORTHONAVCOM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHONAVCOM
	 * @generated
	 */
	public Adapter createCDORTHONAVCOMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHOTECHREVISION <em>CDORTHOTECHREVISION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHOTECHREVISION
	 * @generated
	 */
	public Adapter createCDORTHOTECHREVISIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHOTYPE <em>CDORTHOTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDORTHOTYPE
	 * @generated
	 */
	public Adapter createCDORTHOTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER <em>CDPARAMETER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDPARAMETER
	 * @generated
	 */
	public Adapter createCDPARAMETERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPATIENTWILL <em>CDPATIENTWILL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDPATIENTWILL
	 * @generated
	 */
	public Adapter createCDPATIENTWILLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPATIENTWILLHOSP <em>CDPATIENTWILLHOSP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDPATIENTWILLHOSP
	 * @generated
	 */
	public Adapter createCDPATIENTWILLHOSPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPATIENTWILLRES <em>CDPATIENTWILLRES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDPATIENTWILLRES
	 * @generated
	 */
	public Adapter createCDPATIENTWILLRESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPERIODICITY <em>CDPERIODICITY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDPERIODICITY
	 * @generated
	 */
	public Adapter createCDPERIODICITYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDPROOF <em>CDPROOF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDPROOF
	 * @generated
	 */
	public Adapter createCDPROOFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDQUANTITYPREFIX <em>CDQUANTITYPREFIX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDQUANTITYPREFIX
	 * @generated
	 */
	public Adapter createCDQUANTITYPREFIXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDREFSCOPE <em>CDREFSCOPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDREFSCOPE
	 * @generated
	 */
	public Adapter createCDREFSCOPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDREIMBURSEMENTNOMENCLATURE <em>CDREIMBURSEMENTNOMENCLATURE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDREIMBURSEMENTNOMENCLATURE
	 * @generated
	 */
	public Adapter createCDREIMBURSEMENTNOMENCLATUREAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDREVCOMPONENT <em>CDREVCOMPONENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDREVCOMPONENT
	 * @generated
	 */
	public Adapter createCDREVCOMPONENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDSEVERITY <em>CDSEVERITY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDSEVERITY
	 * @generated
	 */
	public Adapter createCDSEVERITYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDSEX <em>CDSEX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDSEX
	 * @generated
	 */
	public Adapter createCDSEXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDSITE <em>CDSITE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDSITE
	 * @generated
	 */
	public Adapter createCDSITEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDSNOMED <em>CDSNOMED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDSNOMED
	 * @generated
	 */
	public Adapter createCDSNOMEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDSTANDARD <em>CDSTANDARD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDSTANDARD
	 * @generated
	 */
	public Adapter createCDSTANDARDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDSTENTBRIDGETYPE <em>CDSTENTBRIDGETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDSTENTBRIDGETYPE
	 * @generated
	 */
	public Adapter createCDSTENTBRIDGETYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDSTENTDEVICE <em>CDSTENTDEVICE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDSTENTDEVICE
	 * @generated
	 */
	public Adapter createCDSTENTDEVICEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDSTENTDOMINANCE <em>CDSTENTDOMINANCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDSTENTDOMINANCE
	 * @generated
	 */
	public Adapter createCDSTENTDOMINANCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDSTENTLESIONTYPE <em>CDSTENTLESIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDSTENTLESIONTYPE
	 * @generated
	 */
	public Adapter createCDSTENTLESIONTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDSTENTSEGMENT <em>CDSTENTSEGMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDSTENTSEGMENT
	 * @generated
	 */
	public Adapter createCDSTENTSEGMENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDSUBSTANCE <em>CDSUBSTANCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDSUBSTANCE
	 * @generated
	 */
	public Adapter createCDSUBSTANCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTECHNICAL <em>CDTECHNICAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTECHNICAL
	 * @generated
	 */
	public Adapter createCDTECHNICALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTELECOM <em>CDTELECOM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTELECOM
	 * @generated
	 */
	public Adapter createCDTELECOMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTEMPORALITY <em>CDTEMPORALITY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTEMPORALITY
	 * @generated
	 */
	public Adapter createCDTEMPORALITYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK <em>CDTHERAPEUTICLINK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTHERAPEUTICLINK
	 * @generated
	 */
	public Adapter createCDTHERAPEUTICLINKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTIMEUNIT <em>CDTIMEUNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTIMEUNIT
	 * @generated
	 */
	public Adapter createCDTIMEUNITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTION <em>CDTRANSACTION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTION
	 * @generated
	 */
	public Adapter createCDTRANSACTIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTIONCARENET <em>CDTRANSACTIONCARENET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTIONCARENET
	 * @generated
	 */
	public Adapter createCDTRANSACTIONCARENETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTIONMAA <em>CDTRANSACTIONMAA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTIONMAA
	 * @generated
	 */
	public Adapter createCDTRANSACTIONMAAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTIONMYCARENET <em>CDTRANSACTIONMYCARENET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTIONMYCARENET
	 * @generated
	 */
	public Adapter createCDTRANSACTIONMYCARENETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTIONREG <em>CDTRANSACTIONREG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTIONREG
	 * @generated
	 */
	public Adapter createCDTRANSACTIONREGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTIONTYPE <em>CDTRANSACTIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTRANSACTIONTYPE
	 * @generated
	 */
	public Adapter createCDTRANSACTIONTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTUCOPATHOLOGYTYPE <em>CDTUCOPATHOLOGYTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTUCOPATHOLOGYTYPE
	 * @generated
	 */
	public Adapter createCDTUCOPATHOLOGYTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDTUCOSTEMITYPE <em>CDTUCOSTEMITYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDTUCOSTEMITYPE
	 * @generated
	 */
	public Adapter createCDTUCOSTEMITYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDUNIT <em>CDUNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDUNIT
	 * @generated
	 */
	public Adapter createCDUNITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDURGENCY <em>CDURGENCY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDURGENCY
	 * @generated
	 */
	public Adapter createCDURGENCYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDVACCINE <em>CDVACCINE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDVACCINE
	 * @generated
	 */
	public Adapter createCDVACCINEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDVACCINEINDICATION <em>CDVACCINEINDICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDVACCINEINDICATION
	 * @generated
	 */
	public Adapter createCDVACCINEINDICATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.CDWEEKDAY <em>CDWEEKDAY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CDWEEKDAY
	 * @generated
	 */
	public Adapter createCDWEEKDAYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.EMPTY <em>EMPTY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.EMPTY
	 * @generated
	 */
	public Adapter createEMPTYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.ICD <em>ICD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.ICD
	 * @generated
	 */
	public Adapter createICDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.ICPC <em>ICPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.ICPC
	 * @generated
	 */
	public Adapter createICPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.LnkType <em>Lnk Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.LnkType
	 * @generated
	 */
	public Adapter createLnkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.cd.cd.LOCAL <em>LOCAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.cd.cd.LOCAL
	 * @generated
	 */
	public Adapter createLOCALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CdAdapterFactory
