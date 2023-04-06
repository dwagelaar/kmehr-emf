/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CdFactoryImpl extends EFactoryImpl implements CdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CdFactory init() {
		try {
			CdFactory theCdFactory = (CdFactory)EPackage.Registry.INSTANCE.getEFactory(CdPackage.eNS_URI);
			if (theCdFactory != null) {
				return theCdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CdPackage.CDACCESSRIGHT: return createCDACCESSRIGHT();
			case CdPackage.CDACKNOWLEDGMENT: return createCDACKNOWLEDGMENT();
			case CdPackage.CDACTSNURSING: return createCDACTSNURSING();
			case CdPackage.CDADDRESS: return createCDADDRESS();
			case CdPackage.CDADMINISTRATIONUNIT: return createCDADMINISTRATIONUNIT();
			case CdPackage.CDATC: return createCDATC();
			case CdPackage.CDAUTONOMY: return createCDAUTONOMY();
			case CdPackage.CDBALLONDEVICE: return createCDBALLONDEVICE();
			case CdPackage.CDBCRDIFFERENTATIONDEGREE: return createCDBCRDIFFERENTATIONDEGREE();
			case CdPackage.CDBEARINGSURFACE: return createCDBEARINGSURFACE();
			case CdPackage.CDBVTAVAILABLEMATERIALS: return createCDBVTAVAILABLEMATERIALS();
			case CdPackage.CDBVTCONSERVATIONDELAY: return createCDBVTCONSERVATIONDELAY();
			case CdPackage.CDBVTCONSERVATIONMODE: return createCDBVTCONSERVATIONMODE();
			case CdPackage.CDBVTLATERALITY: return createCDBVTLATERALITY();
			case CdPackage.CDBVTPATIENTOPPOSITION: return createCDBVTPATIENTOPPOSITION();
			case CdPackage.CDBVTSAMPLETYPE: return createCDBVTSAMPLETYPE();
			case CdPackage.CDBVTSTATUS: return createCDBVTSTATUS();
			case CdPackage.CDCARENETACCIDENTTYPE: return createCDCARENETACCIDENTTYPE();
			case CdPackage.CDCARENETAGREEMENTTYPE: return createCDCARENETAGREEMENTTYPE();
			case CdPackage.CDCARENETDOCUMENT: return createCDCARENETDOCUMENT();
			case CdPackage.CDCARENETINSURANCYSTATUS: return createCDCARENETINSURANCYSTATUS();
			case CdPackage.CDCARENETMESSAGE: return createCDCARENETMESSAGE();
			case CdPackage.CDCARENETMUTATIONINDICATOR: return createCDCARENETMUTATIONINDICATOR();
			case CdPackage.CDCARENETNATIONALINSURANCE: return createCDCARENETNATIONALINSURANCE();
			case CdPackage.CDCARENETPERSONALPART: return createCDCARENETPERSONALPART();
			case CdPackage.CDCARENETREFUSALREASON: return createCDCARENETREFUSALREASON();
			case CdPackage.CDCARENETSISCARDERROR: return createCDCARENETSISCARDERROR();
			case CdPackage.CDCARENETTHIRDPAYERCONTRACT: return createCDCARENETTHIRDPAYERCONTRACT();
			case CdPackage.CDCARENETTYPE: return createCDCARENETTYPE();
			case CdPackage.CDCAREPATH: return createCDCAREPATH();
			case CdPackage.CDCERTAINTY: return createCDCERTAINTY();
			case CdPackage.CDCHAPTER4CATEGORY: return createCDCHAPTER4CATEGORY();
			case CdPackage.CDCHAPTER4CRITERIA: return createCDCHAPTER4CRITERIA();
			case CdPackage.CDCHAPTER4DOCUMENTSEQAPPENDIX: return createCDCHAPTER4DOCUMENTSEQAPPENDIX();
			case CdPackage.CDCHAPTER4FORMALINTERPRETATION: return createCDCHAPTER4FORMALINTERPRETATION();
			case CdPackage.CDCHAPTER4PARAGRAPH: return createCDCHAPTER4PARAGRAPH();
			case CdPackage.CDCHAPTER4VERSE: return createCDCHAPTER4VERSE();
			case CdPackage.CDCHAPTER4VERSESEQAPPENDIX: return createCDCHAPTER4VERSESEQAPPENDIX();
			case CdPackage.CDCIVILSTATE: return createCDCIVILSTATE();
			case CdPackage.CDCLINICAL: return createCDCLINICAL();
			case CdPackage.CDCLINICALPLAN: return createCDCLINICALPLAN();
			case CdPackage.CDCONSENT: return createCDCONSENT();
			case CdPackage.CDCONTACTPERSON: return createCDCONTACTPERSON();
			case CdPackage.CDCONTENT: return createCDCONTENT();
			case CdPackage.CDCOUNTRY: return createCDCOUNTRY();
			case CdPackage.CDCURRENCY: return createCDCURRENCY();
			case CdPackage.CDDAYPERIOD: return createCDDAYPERIOD();
			case CdPackage.CDDISCHARGETYPE: return createCDDISCHARGETYPE();
			case CdPackage.CDDRUGCNK: return createCDDRUGCNK();
			case CdPackage.CDDRUGPRESENTATION: return createCDDRUGPRESENTATION();
			case CdPackage.CDDRUGROUTE: return createCDDRUGROUTE();
			case CdPackage.CDEBIRTHARTIFICIALRESPIRATIONTYPE: return createCDEBIRTHARTIFICIALRESPIRATIONTYPE();
			case CdPackage.CDEBIRTHCAESAREANINDICATION: return createCDEBIRTHCAESAREANINDICATION();
			case CdPackage.CDEBIRTHCHILDPOSITION: return createCDEBIRTHCHILDPOSITION();
			case CdPackage.CDEBIRTHCONGENITALMALFORMATION: return createCDEBIRTHCONGENITALMALFORMATION();
			case CdPackage.CDEBIRTHDELIVERYWAY: return createCDEBIRTHDELIVERYWAY();
			case CdPackage.CDEBIRTHFOETALMONITORING: return createCDEBIRTHFOETALMONITORING();
			case CdPackage.CDEBIRTHNEONATALDEPTTYPE: return createCDEBIRTHNEONATALDEPTTYPE();
			case CdPackage.CDEBIRTHPLACE: return createCDEBIRTHPLACE();
			case CdPackage.CDEBIRTHPREGNANCYORIGIN: return createCDEBIRTHPREGNANCYORIGIN();
			case CdPackage.CDEBIRTHSPECIALVALUES: return createCDEBIRTHSPECIALVALUES();
			case CdPackage.CDECG: return createCDECG();
			case CdPackage.CDEMERGENCYEVALUATION: return createCDEMERGENCYEVALUATION();
			case CdPackage.CDEMPLOYMENTSITUATION: return createCDEMPLOYMENTSITUATION();
			case CdPackage.CDENCOUNTER: return createCDENCOUNTER();
			case CdPackage.CDENCOUNTERSAFETYISSUE: return createCDENCOUNTERSAFETYISSUE();
			case CdPackage.CDENCRYPTIONACTOR: return createCDENCRYPTIONACTOR();
			case CdPackage.CDENCRYPTIONMETHOD: return createCDENCRYPTIONMETHOD();
			case CdPackage.CDERROR: return createCDERROR();
			case CdPackage.CDERRORMYCARENET: return createCDERRORMYCARENET();
			case CdPackage.CDEXTERNALSOURCE: return createCDEXTERNALSOURCE();
			case CdPackage.CDFORMULARY: return createCDFORMULARY();
			case CdPackage.CDGALENICFORM: return createCDGALENICFORM();
			case CdPackage.CDHCPARTY: return createCDHCPARTY();
			case CdPackage.CDHEADING: return createCDHEADING();
			case CdPackage.CDHEADINGREG: return createCDHEADINGREG();
			case CdPackage.CDIMPLANTATIONDEVICE: return createCDIMPLANTATIONDEVICE();
			case CdPackage.CDIMPLANTATIONTYPE: return createCDIMPLANTATIONTYPE();
			case CdPackage.CDINCAPACITY: return createCDINCAPACITY();
			case CdPackage.CDINCAPACITYREASON: return createCDINCAPACITYREASON();
			case CdPackage.CDINNCLUSTER: return createCDINNCLUSTER();
			case CdPackage.CDITEM: return createCDITEM();
			case CdPackage.CDITEMBVT: return createCDITEMBVT();
			case CdPackage.CDITEMCARENET: return createCDITEMCARENET();
			case CdPackage.CDITEMEBIRTH: return createCDITEMEBIRTH();
			case CdPackage.CDITEMMAA: return createCDITEMMAA();
			case CdPackage.CDITEMMS: return createCDITEMMS();
			case CdPackage.CDITEMMYCARENET: return createCDITEMMYCARENET();
			case CdPackage.CDITEMREG: return createCDITEMREG();
			case CdPackage.CDLAB: return createCDLAB();
			case CdPackage.CDLEGALSERVICE: return createCDLEGALSERVICE();
			case CdPackage.CDLIFECYCLE: return createCDLIFECYCLE();
			case CdPackage.CDMAACOVERAGETYPE: return createCDMAACOVERAGETYPE();
			case CdPackage.CDMAAREFUSALJUSTIFICATION: return createCDMAAREFUSALJUSTIFICATION();
			case CdPackage.CDMAAREQUESTTYPE: return createCDMAAREQUESTTYPE();
			case CdPackage.CDMAARESPONSETYPE: return createCDMAARESPONSETYPE();
			case CdPackage.CDMAATYPE: return createCDMAATYPE();
			case CdPackage.CDMEDICATION: return createCDMEDICATION();
			case CdPackage.CDMESSAGE: return createCDMESSAGE();
			case CdPackage.CDMICROORGANISM: return createCDMICROORGANISM();
			case CdPackage.CDMKGADMISSION: return createCDMKGADMISSION();
			case CdPackage.CDMKGDESTINATION: return createCDMKGDESTINATION();
			case CdPackage.CDMKGDISCHARGE: return createCDMKGDISCHARGE();
			case CdPackage.CDMKGORIGIN: return createCDMKGORIGIN();
			case CdPackage.CDMKGREFERRER: return createCDMKGREFERRER();
			case CdPackage.CDMSADAPTATION: return createCDMSADAPTATION();
			case CdPackage.CDMSMEDICATIONTYPE: return createCDMSMEDICATIONTYPE();
			case CdPackage.CDMSORIGIN: return createCDMSORIGIN();
			case CdPackage.CDMYCARENETJUSTIFICATION: return createCDMYCARENETJUSTIFICATION();
			case CdPackage.CDORTHOAPPROACH: return createCDORTHOAPPROACH();
			case CdPackage.CDORTHODIAGNOSIS: return createCDORTHODIAGNOSIS();
			case CdPackage.CDORTHOGRAFT: return createCDORTHOGRAFT();
			case CdPackage.CDORTHOINTERFACE: return createCDORTHOINTERFACE();
			case CdPackage.CDORTHOKNEEINSERT: return createCDORTHOKNEEINSERT();
			case CdPackage.CDORTHONAVCOM: return createCDORTHONAVCOM();
			case CdPackage.CDORTHOTECHREVISION: return createCDORTHOTECHREVISION();
			case CdPackage.CDORTHOTYPE: return createCDORTHOTYPE();
			case CdPackage.CDPARAMETER: return createCDPARAMETER();
			case CdPackage.CDPATIENTWILL: return createCDPATIENTWILL();
			case CdPackage.CDPATIENTWILLHOSP: return createCDPATIENTWILLHOSP();
			case CdPackage.CDPATIENTWILLRES: return createCDPATIENTWILLRES();
			case CdPackage.CDPERIODICITY: return createCDPERIODICITY();
			case CdPackage.CDPROOF: return createCDPROOF();
			case CdPackage.CDQUANTITYPREFIX: return createCDQUANTITYPREFIX();
			case CdPackage.CDREFSCOPE: return createCDREFSCOPE();
			case CdPackage.CDREIMBURSEMENTNOMENCLATURE: return createCDREIMBURSEMENTNOMENCLATURE();
			case CdPackage.CDREVCOMPONENT: return createCDREVCOMPONENT();
			case CdPackage.CDSEVERITY: return createCDSEVERITY();
			case CdPackage.CDSEX: return createCDSEX();
			case CdPackage.CDSITE: return createCDSITE();
			case CdPackage.CDSNOMED: return createCDSNOMED();
			case CdPackage.CDSTANDARD: return createCDSTANDARD();
			case CdPackage.CDSTENTBRIDGETYPE: return createCDSTENTBRIDGETYPE();
			case CdPackage.CDSTENTDEVICE: return createCDSTENTDEVICE();
			case CdPackage.CDSTENTDOMINANCE: return createCDSTENTDOMINANCE();
			case CdPackage.CDSTENTLESIONTYPE: return createCDSTENTLESIONTYPE();
			case CdPackage.CDSTENTSEGMENT: return createCDSTENTSEGMENT();
			case CdPackage.CDSUBSTANCE: return createCDSUBSTANCE();
			case CdPackage.CDTECHNICAL: return createCDTECHNICAL();
			case CdPackage.CDTELECOM: return createCDTELECOM();
			case CdPackage.CDTEMPORALITY: return createCDTEMPORALITY();
			case CdPackage.CDTHERAPEUTICLINK: return createCDTHERAPEUTICLINK();
			case CdPackage.CDTIMEUNIT: return createCDTIMEUNIT();
			case CdPackage.CDTRANSACTION: return createCDTRANSACTION();
			case CdPackage.CDTRANSACTIONCARENET: return createCDTRANSACTIONCARENET();
			case CdPackage.CDTRANSACTIONMAA: return createCDTRANSACTIONMAA();
			case CdPackage.CDTRANSACTIONMYCARENET: return createCDTRANSACTIONMYCARENET();
			case CdPackage.CDTRANSACTIONREG: return createCDTRANSACTIONREG();
			case CdPackage.CDTRANSACTIONTYPE: return createCDTRANSACTIONTYPE();
			case CdPackage.CDTUCOPATHOLOGYTYPE: return createCDTUCOPATHOLOGYTYPE();
			case CdPackage.CDTUCOSTEMITYPE: return createCDTUCOSTEMITYPE();
			case CdPackage.CDUNIT: return createCDUNIT();
			case CdPackage.CDURGENCY: return createCDURGENCY();
			case CdPackage.CDVACCINE: return createCDVACCINE();
			case CdPackage.CDVACCINEINDICATION: return createCDVACCINEINDICATION();
			case CdPackage.CDWEEKDAY: return createCDWEEKDAY();
			case CdPackage.ICD: return createICD();
			case CdPackage.ICPC: return createICPC();
			case CdPackage.LNK_TYPE: return createLnkType();
			case CdPackage.LOCAL: return createLOCAL();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CdPackage.CDACCESSRIGH_TSCHEMES:
				return createCDACCESSRIGHTschemesFromString(eDataType, initialValue);
			case CdPackage.CDACCESSRIGH_TVALUES:
				return createCDACCESSRIGHTvaluesFromString(eDataType, initialValue);
			case CdPackage.CDACKNOWLEDGMEN_TVALUES:
				return createCDACKNOWLEDGMENTvaluesFromString(eDataType, initialValue);
			case CdPackage.CDACTSNURSIN_GVALUES:
				return createCDACTSNURSINGvaluesFromString(eDataType, initialValue);
			case CdPackage.CDADDRES_SSCHEMES:
				return createCDADDRESSschemesFromString(eDataType, initialValue);
			case CdPackage.CDADDRES_SVALUES:
				return createCDADDRESSvaluesFromString(eDataType, initialValue);
			case CdPackage.CDADMINISTRATIONUNI_TVALUES:
				return createCDADMINISTRATIONUNITvaluesFromString(eDataType, initialValue);
			case CdPackage.CDAUTONOM_YVALUES:
				return createCDAUTONOMYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDBALLONDEVIC_EVALUES:
				return createCDBALLONDEVICEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDBCRDIFFERENTATIONDEGRE_EVALUES:
				return createCDBCRDIFFERENTATIONDEGREEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDBEARINGSURFAC_EVALUES:
				return createCDBEARINGSURFACEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDBVTAVAILABLEMATERIAL_SVALUES:
				return createCDBVTAVAILABLEMATERIALSvaluesFromString(eDataType, initialValue);
			case CdPackage.CDBVTCONSERVATIONDELA_YVALUES:
				return createCDBVTCONSERVATIONDELAYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDBVTCONSERVATIONMOD_EVALUES:
				return createCDBVTCONSERVATIONMODEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDBVTLATERALIT_YVALUES:
				return createCDBVTLATERALITYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDBVTPATIENTOPPOSITIO_NVALUES:
				return createCDBVTPATIENTOPPOSITIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDBVTSAMPLETYP_EVALUES:
				return createCDBVTSAMPLETYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDBVTSTATU_SVALUES:
				return createCDBVTSTATUSvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCARENETACCIDENTTYP_EVALUES:
				return createCDCARENETACCIDENTTYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCARENETAGREEMENTTYP_EVALUES:
				return createCDCARENETAGREEMENTTYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCARENETDOCUMEN_TVALUES:
				return createCDCARENETDOCUMENTvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCARENETINSURANCYSTATU_SVALUES:
				return createCDCARENETINSURANCYSTATUSvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCARENETMESSAG_EVALUES:
				return createCDCARENETMESSAGEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCARENETMUTATIONINDICATO_RVALUES:
				return createCDCARENETMUTATIONINDICATORvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCARENETNATIONALINSURANC_EVALUES:
				return createCDCARENETNATIONALINSURANCEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCARENETPERSONALPAR_TVALUES:
				return createCDCARENETPERSONALPARTvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCARENETREFUSALREASO_NVALUES:
				return createCDCARENETREFUSALREASONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCARENETSISCARDERRO_RVALUES:
				return createCDCARENETSISCARDERRORvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCARENETTHIRDPAYERCONTRAC_TVALUES:
				return createCDCARENETTHIRDPAYERCONTRACTvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCARENETTYP_EVALUES:
				return createCDCARENETTYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCAREPAT_HVALUES:
				return createCDCAREPATHvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCERTAINT_YVALUES:
				return createCDCERTAINTYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCLINICALPLA_NVALUES:
				return createCDCLINICALPLANvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCOMPRESSIO_NVALUES:
				return createCDCOMPRESSIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCONSEN_TSCHEMES:
				return createCDCONSENTschemesFromString(eDataType, initialValue);
			case CdPackage.CDCONSEN_TVALUES:
				return createCDCONSENTvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCONTACTPERSO_NVALUES:
				return createCDCONTACTPERSONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCONTEN_TSCHEMES:
				return createCDCONTENTschemesFromString(eDataType, initialValue);
			case CdPackage.CDCOUNTR_YSCHEMES:
				return createCDCOUNTRYschemesFromString(eDataType, initialValue);
			case CdPackage.CDCOUNTR_YVALUES:
				return createCDCOUNTRYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCURRENC_YVALUES:
				return createCDCURRENCYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDDAYPERIO_DVALUES:
				return createCDDAYPERIODvaluesFromString(eDataType, initialValue);
			case CdPackage.CDDISCHARGETYP_EVALUES:
				return createCDDISCHARGETYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDDRUGCN_KSCHEMES:
				return createCDDRUGCNKschemesFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHARTIFICIALRESPIRATIONTYP_EVALUES:
				return createCDEBIRTHARTIFICIALRESPIRATIONTYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHCAESAREANINDICATIO_NVALUES:
				return createCDEBIRTHCAESAREANINDICATIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHCHILDPOSITIO_NVALUES:
				return createCDEBIRTHCHILDPOSITIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHCONGENITALMALFORMATIO_NVALUES:
				return createCDEBIRTHCONGENITALMALFORMATIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHDELIVERYWA_YVALUES:
				return createCDEBIRTHDELIVERYWAYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHFOETALMONITORIN_GVALUES:
				return createCDEBIRTHFOETALMONITORINGvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHNEONATALDEPTTYP_EVALUES:
				return createCDEBIRTHNEONATALDEPTTYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHPLAC_EVALUES:
				return createCDEBIRTHPLACEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHPREGNANCYORIGI_NVALUES:
				return createCDEBIRTHPREGNANCYORIGINvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHSPECIALVALUE_SVALUES:
				return createCDEBIRTHSPECIALVALUESvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEC_GVALUES:
				return createCDECGvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEMERGENCYEVALUATIO_NVALUES:
				return createCDEMERGENCYEVALUATIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEMPLOYMENTSITUATIO_NVALUES:
				return createCDEMPLOYMENTSITUATIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDENCODIN_GVALUES:
				return createCDENCODINGvaluesFromString(eDataType, initialValue);
			case CdPackage.CDENCOUNTERSAFETYISSU_EVALUES:
				return createCDENCOUNTERSAFETYISSUEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDENCOUNTE_RVALUES:
				return createCDENCOUNTERvaluesFromString(eDataType, initialValue);
			case CdPackage.CDENCRYPTIONACTO_RVALUES:
				return createCDENCRYPTIONACTORvaluesFromString(eDataType, initialValue);
			case CdPackage.CDENCRYPTIONMETHO_DSCHEMES:
				return createCDENCRYPTIONMETHODschemesFromString(eDataType, initialValue);
			case CdPackage.CDENCRYPTIONMETHO_DVALUES:
				return createCDENCRYPTIONMETHODvaluesFromString(eDataType, initialValue);
			case CdPackage.CDERRORMYCARENE_TSCHEMES:
				return createCDERRORMYCARENETschemesFromString(eDataType, initialValue);
			case CdPackage.CDERRO_RSCHEMES:
				return createCDERRORschemesFromString(eDataType, initialValue);
			case CdPackage.CDEXTERNALSOURC_ESCHEMES:
				return createCDEXTERNALSOURCEschemesFromString(eDataType, initialValue);
			case CdPackage.CDFEDCOUNTR_YVALUES:
				return createCDFEDCOUNTRYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDFORMULAR_YSCHEMES:
				return createCDFORMULARYschemesFromString(eDataType, initialValue);
			case CdPackage.CDGALENICFOR_MSCHEMES:
				return createCDGALENICFORMschemesFromString(eDataType, initialValue);
			case CdPackage.CDHCPART_YSCHEMES:
				return createCDHCPARTYschemesFromString(eDataType, initialValue);
			case CdPackage.CDHCPART_YVALUES:
				return createCDHCPARTYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDHEADINGRE_GVALUES:
				return createCDHEADINGREGvaluesFromString(eDataType, initialValue);
			case CdPackage.CDHEADIN_GSCHEMES:
				return createCDHEADINGschemesFromString(eDataType, initialValue);
			case CdPackage.CDHEADIN_GVALUES:
				return createCDHEADINGvaluesFromString(eDataType, initialValue);
			case CdPackage.CDIMPLANTATIONDEVIC_EVALUES:
				return createCDIMPLANTATIONDEVICEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDIMPLANTATIONTYP_EVALUES:
				return createCDIMPLANTATIONTYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDINCAPACITYREASO_NVALUES:
				return createCDINCAPACITYREASONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDINCAPACIT_YVALUES:
				return createCDINCAPACITYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDINNCLUSTE_RSCHEMES:
				return createCDINNCLUSTERschemesFromString(eDataType, initialValue);
			case CdPackage.CDITEMBV_TVALUES:
				return createCDITEMBVTvaluesFromString(eDataType, initialValue);
			case CdPackage.CDITEMCARENE_TVALUES:
				return createCDITEMCARENETvaluesFromString(eDataType, initialValue);
			case CdPackage.CDITEMEBIRT_HVALUES:
				return createCDITEMEBIRTHvaluesFromString(eDataType, initialValue);
			case CdPackage.CDITEMMA_AVALUES:
				return createCDITEMMAAvaluesFromString(eDataType, initialValue);
			case CdPackage.CDITEMM_SVALUES:
				return createCDITEMMSvaluesFromString(eDataType, initialValue);
			case CdPackage.CDITEMMYCARENE_TVALUES:
				return createCDITEMMYCARENETvaluesFromString(eDataType, initialValue);
			case CdPackage.CDITEMRE_GVALUES:
				return createCDITEMREGvaluesFromString(eDataType, initialValue);
			case CdPackage.CDITE_MSCHEMES:
				return createCDITEMschemesFromString(eDataType, initialValue);
			case CdPackage.CDITE_MVALUES:
				return createCDITEMvaluesFromString(eDataType, initialValue);
			case CdPackage.CDLEGALSERVIC_EVALUES:
				return createCDLEGALSERVICEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDLIFECYCL_EVALUES:
				return createCDLIFECYCLEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDLN_KVALUES:
				return createCDLNKvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMAACOVERAGETYP_EVALUES:
				return createCDMAACOVERAGETYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMAAREFUSALJUSTIFICATIO_NVALUES:
				return createCDMAAREFUSALJUSTIFICATIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMAAREQUESTTYP_EVALUES:
				return createCDMAAREQUESTTYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMAARESPONSETYP_EVALUES:
				return createCDMAARESPONSETYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMAATYP_EVALUES:
				return createCDMAATYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMEDIATYP_EVALUES:
				return createCDMEDIATYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMEDICATIO_NSCHEMES:
				return createCDMEDICATIONschemesFromString(eDataType, initialValue);
			case CdPackage.CDMESSAG_EVALUES:
				return createCDMESSAGEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMICROORGANIS_MVALUES:
				return createCDMICROORGANISMvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMKGADMISSIO_NVALUES:
				return createCDMKGADMISSIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMKGDESTINATIO_NVALUES:
				return createCDMKGDESTINATIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMKGDISCHARG_EVALUES:
				return createCDMKGDISCHARGEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMKGORIGI_NVALUES:
				return createCDMKGORIGINvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMKGREFERRE_RVALUES:
				return createCDMKGREFERRERvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMSADAPTATIO_NVALUES:
				return createCDMSADAPTATIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMSMEDICATIONTYP_EVALUES:
				return createCDMSMEDICATIONTYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDMSORIGI_NVALUES:
				return createCDMSORIGINvaluesFromString(eDataType, initialValue);
			case CdPackage.CDORTHOAPPROAC_HVALUES:
				return createCDORTHOAPPROACHvaluesFromString(eDataType, initialValue);
			case CdPackage.CDORTHODIAGNOSI_SVALUES:
				return createCDORTHODIAGNOSISvaluesFromString(eDataType, initialValue);
			case CdPackage.CDORTHOGRAF_TVALUES:
				return createCDORTHOGRAFTvaluesFromString(eDataType, initialValue);
			case CdPackage.CDORTHOINTERFAC_EVALUES:
				return createCDORTHOINTERFACEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDORTHOKNEEINSER_TVALUES:
				return createCDORTHOKNEEINSERTvaluesFromString(eDataType, initialValue);
			case CdPackage.CDORTHONAVCO_MVALUES:
				return createCDORTHONAVCOMvaluesFromString(eDataType, initialValue);
			case CdPackage.CDORTHOTECHREVISIO_NVALUES:
				return createCDORTHOTECHREVISIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDORTHOTYP_EVALUES:
				return createCDORTHOTYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDPARAMETE_RVALUES:
				return createCDPARAMETERvaluesFromString(eDataType, initialValue);
			case CdPackage.CDPATIENTWILLHOS_PVALUES:
				return createCDPATIENTWILLHOSPvaluesFromString(eDataType, initialValue);
			case CdPackage.CDPATIENTWILLRE_SVALUES:
				return createCDPATIENTWILLRESvaluesFromString(eDataType, initialValue);
			case CdPackage.CDPATIENTWIL_LVALUES:
				return createCDPATIENTWILLvaluesFromString(eDataType, initialValue);
			case CdPackage.CDPROO_FSCHEMES:
				return createCDPROOFschemesFromString(eDataType, initialValue);
			case CdPackage.CDQUANTITYPREFI_XVALUES:
				return createCDQUANTITYPREFIXvaluesFromString(eDataType, initialValue);
			case CdPackage.CDREFSCOP_EVALUES:
				return createCDREFSCOPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDREVCOMPONEN_TVALUES:
				return createCDREVCOMPONENTvaluesFromString(eDataType, initialValue);
			case CdPackage.CDSEVERIT_YSCHEMES:
				return createCDSEVERITYschemesFromString(eDataType, initialValue);
			case CdPackage.CDSEVERIT_YVALUES:
				return createCDSEVERITYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDSE_XVALUES:
				return createCDSEXvaluesFromString(eDataType, initialValue);
			case CdPackage.CDSIT_ESCHEMES:
				return createCDSITEschemesFromString(eDataType, initialValue);
			case CdPackage.CDSIT_EVALUES:
				return createCDSITEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDSTANDAR_DVALUES:
				return createCDSTANDARDvaluesFromString(eDataType, initialValue);
			case CdPackage.CDSTENTBRIDGETYP_EVALUES:
				return createCDSTENTBRIDGETYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDSTENTDEVIC_EVALUES:
				return createCDSTENTDEVICEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDSTENTDOMINANC_EVALUES:
				return createCDSTENTDOMINANCEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDSTENTLESIONTYP_EVALUES:
				return createCDSTENTLESIONTYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDSTENTSEGMEN_TVALUES:
				return createCDSTENTSEGMENTvaluesFromString(eDataType, initialValue);
			case CdPackage.CDSUBSTANC_ESCHEMES:
				return createCDSUBSTANCEschemesFromString(eDataType, initialValue);
			case CdPackage.CDTELECO_MSCHEMES:
				return createCDTELECOMschemesFromString(eDataType, initialValue);
			case CdPackage.CDTELECO_MVALUES:
				return createCDTELECOMvaluesFromString(eDataType, initialValue);
			case CdPackage.CDTEMPORALIT_YVALUES:
				return createCDTEMPORALITYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDTHERAPEUTICLIN_KSCHEMES:
				return createCDTHERAPEUTICLINKschemesFromString(eDataType, initialValue);
			case CdPackage.CDTIMEUNI_TSCHEMES:
				return createCDTIMEUNITschemesFromString(eDataType, initialValue);
			case CdPackage.CDTIMEUNI_TVALUES:
				return createCDTIMEUNITvaluesFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIONCARENE_TVALUES:
				return createCDTRANSACTIONCARENETvaluesFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIONMA_AVALUES:
				return createCDTRANSACTIONMAAvaluesFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIONMYCARENE_TVALUES:
				return createCDTRANSACTIONMYCARENETvaluesFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIONRE_GVALUES:
				return createCDTRANSACTIONREGvaluesFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIO_NSCHEMES:
				return createCDTRANSACTIONschemesFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIONTYP_EVALUES:
				return createCDTRANSACTIONTYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIO_NVALUES:
				return createCDTRANSACTIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDTUCOPATHOLOGYTYP_EVALUES:
				return createCDTUCOPATHOLOGYTYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDTUCOSTEMITYP_EVALUES:
				return createCDTUCOSTEMITYPEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDUNI_TSCHEMES:
				return createCDUNITschemesFromString(eDataType, initialValue);
			case CdPackage.CDUNI_TVALUES:
				return createCDUNITvaluesFromString(eDataType, initialValue);
			case CdPackage.CDURGENC_YVALUES:
				return createCDURGENCYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDVACCINEINDICATIO_NVALUES:
				return createCDVACCINEINDICATIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDVACCIN_EVALUES:
				return createCDVACCINEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDWEEKDA_YVALUES:
				return createCDWEEKDAYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDACCESSRIGH_TSCHEMES_OBJECT:
				return createCDACCESSRIGHTschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDACCESSRIGH_TVALUES_OBJECT:
				return createCDACCESSRIGHTvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDACKNOWLEDGMEN_TVALUES_OBJECT:
				return createCDACKNOWLEDGMENTvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDACTSNURSIN_GVALUES_OBJECT:
				return createCDACTSNURSINGvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDADDRES_SSCHEMES_OBJECT:
				return createCDADDRESSschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDADDRES_SVALUES_OBJECT:
				return createCDADDRESSvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDADMINISTRATIONUNI_TVALUES_OBJECT:
				return createCDADMINISTRATIONUNITvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDAT_CVALUES:
				return createCDATCvaluesFromString(eDataType, initialValue);
			case CdPackage.CDAUTONOM_YVALUES_OBJECT:
				return createCDAUTONOMYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDBALLONDEVIC_EVALUES_OBJECT:
				return createCDBALLONDEVICEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDBCRDIFFERENTATIONDEGRE_EVALUES_OBJECT:
				return createCDBCRDIFFERENTATIONDEGREEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDBEARINGSURFAC_EVALUES_OBJECT:
				return createCDBEARINGSURFACEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDBVTAVAILABLEMATERIAL_SVALUES_OBJECT:
				return createCDBVTAVAILABLEMATERIALSvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDBVTCONSERVATIONDELA_YVALUES_OBJECT:
				return createCDBVTCONSERVATIONDELAYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDBVTCONSERVATIONMOD_EVALUES_OBJECT:
				return createCDBVTCONSERVATIONMODEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDBVTLATERALIT_YVALUES_OBJECT:
				return createCDBVTLATERALITYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDBVTPATIENTOPPOSITIO_NVALUES_OBJECT:
				return createCDBVTPATIENTOPPOSITIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDBVTSAMPLETYP_EVALUES_OBJECT:
				return createCDBVTSAMPLETYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDBVTSTATU_SVALUES_OBJECT:
				return createCDBVTSTATUSvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCARENETACCIDENTTYP_EVALUES_OBJECT:
				return createCDCARENETACCIDENTTYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCARENETAGREEMENTTYP_EVALUES_OBJECT:
				return createCDCARENETAGREEMENTTYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCARENETDOCUMEN_TVALUES_OBJECT:
				return createCDCARENETDOCUMENTvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCARENETINSURANCYSTATU_SVALUES_OBJECT:
				return createCDCARENETINSURANCYSTATUSvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCARENETMESSAG_EVALUES_OBJECT:
				return createCDCARENETMESSAGEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCARENETMUTATIONINDICATO_RVALUES_OBJECT:
				return createCDCARENETMUTATIONINDICATORvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCARENETNATIONALINSURANC_EVALUES_OBJECT:
				return createCDCARENETNATIONALINSURANCEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCARENETPERSONALPAR_TVALUES_OBJECT:
				return createCDCARENETPERSONALPARTvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCARENETREFUSALREASO_NVALUES_OBJECT:
				return createCDCARENETREFUSALREASONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCARENETSISCARDERRO_RVALUES_OBJECT:
				return createCDCARENETSISCARDERRORvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCARENETTHIRDPAYERCONTRAC_TVALUES_OBJECT:
				return createCDCARENETTHIRDPAYERCONTRACTvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCARENETTYP_EVALUES_OBJECT:
				return createCDCARENETTYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCAREPAT_HVALUES_OBJECT:
				return createCDCAREPATHvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCERTAINT_YVALUES_OBJECT:
				return createCDCERTAINTYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCHAPTER4CATEGOR_YVALUES:
				return createCDCHAPTER4CATEGORYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCHAPTER4CRITERI_AVALUES:
				return createCDCHAPTER4CRITERIAvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCHAPTER4DOCUMENTSEQAPPENDI_XVALUES:
				return createCDCHAPTER4DOCUMENTSEQAPPENDIXvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCHAPTER4FORMALINTERPRETATIO_NVALUES:
				return createCDCHAPTER4FORMALINTERPRETATIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCHAPTER4PARAGRAP_HVALUES:
				return createCDCHAPTER4PARAGRAPHvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCHAPTER4VERSESEQAPPENDI_XVALUES:
				return createCDCHAPTER4VERSESEQAPPENDIXvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCHAPTER4VERS_EVALUES:
				return createCDCHAPTER4VERSEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCIVILSTAT_EVALUES:
				return createCDCIVILSTATEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCLINICALPLA_NVALUES_OBJECT:
				return createCDCLINICALPLANvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCLINICA_LVALUES:
				return createCDCLINICALvaluesFromString(eDataType, initialValue);
			case CdPackage.CDCOMPRESSIO_NVALUES_OBJECT:
				return createCDCOMPRESSIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCONSEN_TSCHEMES_OBJECT:
				return createCDCONSENTschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCONSEN_TVALUES_OBJECT:
				return createCDCONSENTvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCONTACTPERSO_NVALUES_OBJECT:
				return createCDCONTACTPERSONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCONTEN_TSCHEMES_OBJECT:
				return createCDCONTENTschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCOUNTR_YSCHEMES_OBJECT:
				return createCDCOUNTRYschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCOUNTR_YVALUES_OBJECT:
				return createCDCOUNTRYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDCURRENC_YVALUES_OBJECT:
				return createCDCURRENCYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDDAYPERIO_DVALUES_OBJECT:
				return createCDDAYPERIODvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDDISCHARGETYP_EVALUES_OBJECT:
				return createCDDISCHARGETYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDDRUGCN_KSCHEMES_OBJECT:
				return createCDDRUGCNKschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDDRUGCN_KVALUES:
				return createCDDRUGCNKvaluesFromString(eDataType, initialValue);
			case CdPackage.CDDRUGPRESENTATIO_NVALUES:
				return createCDDRUGPRESENTATIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDDRUGROUT_EVALUES:
				return createCDDRUGROUTEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHARTIFICIALRESPIRATIONTYP_EVALUES_OBJECT:
				return createCDEBIRTHARTIFICIALRESPIRATIONTYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHCAESAREANINDICATIO_NVALUES_OBJECT:
				return createCDEBIRTHCAESAREANINDICATIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHCHILDPOSITIO_NVALUES_OBJECT:
				return createCDEBIRTHCHILDPOSITIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHCONGENITALMALFORMATIO_NVALUES_OBJECT:
				return createCDEBIRTHCONGENITALMALFORMATIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHDELIVERYWA_YVALUES_OBJECT:
				return createCDEBIRTHDELIVERYWAYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHFOETALMONITORIN_GVALUES_OBJECT:
				return createCDEBIRTHFOETALMONITORINGvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHNEONATALDEPTTYP_EVALUES_OBJECT:
				return createCDEBIRTHNEONATALDEPTTYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHPLAC_EVALUES_OBJECT:
				return createCDEBIRTHPLACEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHPREGNANCYORIGI_NVALUES_OBJECT:
				return createCDEBIRTHPREGNANCYORIGINvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDEBIRTHSPECIALVALUE_SVALUES_OBJECT:
				return createCDEBIRTHSPECIALVALUESvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDEC_GVALUES_OBJECT:
				return createCDECGvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDEMERGENCYEVALUATIO_NVALUES_OBJECT:
				return createCDEMERGENCYEVALUATIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDEMPLOYMENTSITUATIO_NVALUES_OBJECT:
				return createCDEMPLOYMENTSITUATIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDENCODIN_GVALUES_OBJECT:
				return createCDENCODINGvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDENCOUNTERSAFETYISSU_EVALUES_OBJECT:
				return createCDENCOUNTERSAFETYISSUEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDENCOUNTE_RVALUES_OBJECT:
				return createCDENCOUNTERvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDENCRYPTIONACTO_RVALUES_OBJECT:
				return createCDENCRYPTIONACTORvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDENCRYPTIONMETHO_DSCHEMES_OBJECT:
				return createCDENCRYPTIONMETHODschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDENCRYPTIONMETHO_DVALUES_OBJECT:
				return createCDENCRYPTIONMETHODvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDERRORMYCARENE_TSCHEMES_OBJECT:
				return createCDERRORMYCARENETschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDERRO_RSCHEMES_OBJECT:
				return createCDERRORschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDERRO_RVALUES:
				return createCDERRORvaluesFromString(eDataType, initialValue);
			case CdPackage.CDEXTERNALSOURC_ESCHEMES_OBJECT:
				return createCDEXTERNALSOURCEschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDEXTERNALSOURC_EVALUES:
				return createCDEXTERNALSOURCEvaluesFromString(eDataType, initialValue);
			case CdPackage.CDFEDCOUNTR_YVALUES_OBJECT:
				return createCDFEDCOUNTRYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDFORMULAR_YSCHEMES_OBJECT:
				return createCDFORMULARYschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDGALENICFOR_MSCHEMES_OBJECT:
				return createCDGALENICFORMschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDHCPART_YSCHEMES_OBJECT:
				return createCDHCPARTYschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDHCPART_YVALUES_OBJECT:
				return createCDHCPARTYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDHEADINGLA_BVALUES:
				return createCDHEADINGLABvaluesFromString(eDataType, initialValue);
			case CdPackage.CDHEADINGRE_GVALUES_OBJECT:
				return createCDHEADINGREGvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDHEADIN_GSCHEMES_OBJECT:
				return createCDHEADINGschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDHEADIN_GVALUES_OBJECT:
				return createCDHEADINGvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDIMPLANTATIONDEVIC_EVALUES_OBJECT:
				return createCDIMPLANTATIONDEVICEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDIMPLANTATIONTYP_EVALUES_OBJECT:
				return createCDIMPLANTATIONTYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDINCAPACITYREASO_NVALUES_OBJECT:
				return createCDINCAPACITYREASONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDINCAPACIT_YVALUES_OBJECT:
				return createCDINCAPACITYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDINNCLUSTE_RSCHEMES_OBJECT:
				return createCDINNCLUSTERschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDINNCLUSTE_RVALUES:
				return createCDINNCLUSTERvaluesFromString(eDataType, initialValue);
			case CdPackage.CDITEMBV_TVALUES_OBJECT:
				return createCDITEMBVTvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDITEMCARENE_TVALUES_OBJECT:
				return createCDITEMCARENETvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDITEMEBIRT_HVALUES_OBJECT:
				return createCDITEMEBIRTHvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDITEMMA_AVALUES_OBJECT:
				return createCDITEMMAAvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDITEMM_SVALUES_OBJECT:
				return createCDITEMMSvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDITEMMYCARENE_TVALUES_OBJECT:
				return createCDITEMMYCARENETvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDITEMRE_GVALUES_OBJECT:
				return createCDITEMREGvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDITE_MSCHEMES_OBJECT:
				return createCDITEMschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDITE_MVALUES_OBJECT:
				return createCDITEMvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDLA_BVALUES:
				return createCDLABvaluesFromString(eDataType, initialValue);
			case CdPackage.CDLEGALSERVIC_EVALUES_OBJECT:
				return createCDLEGALSERVICEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDLIFECYCL_EVALUES_OBJECT:
				return createCDLIFECYCLEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDLN_KVALUES_OBJECT:
				return createCDLNKvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMAACOVERAGETYP_EVALUES_OBJECT:
				return createCDMAACOVERAGETYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMAAREFUSALJUSTIFICATIO_NVALUES_OBJECT:
				return createCDMAAREFUSALJUSTIFICATIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMAAREQUESTTYP_EVALUES_OBJECT:
				return createCDMAAREQUESTTYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMAARESPONSETYP_EVALUES_OBJECT:
				return createCDMAARESPONSETYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMAATYP_EVALUES_OBJECT:
				return createCDMAATYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMEDIATYP_EVALUES_OBJECT:
				return createCDMEDIATYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMEDICATIO_NSCHEMES_OBJECT:
				return createCDMEDICATIONschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMESSAG_EVALUES_OBJECT:
				return createCDMESSAGEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMICROORGANIS_MVALUES_OBJECT:
				return createCDMICROORGANISMvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMKGADMISSIO_NVALUES_OBJECT:
				return createCDMKGADMISSIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMKGDESTINATIO_NVALUES_OBJECT:
				return createCDMKGDESTINATIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMKGDISCHARG_EVALUES_OBJECT:
				return createCDMKGDISCHARGEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMKGORIGI_NVALUES_OBJECT:
				return createCDMKGORIGINvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMKGREFERRE_RVALUES_OBJECT:
				return createCDMKGREFERRERvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMSADAPTATIO_NVALUES_OBJECT:
				return createCDMSADAPTATIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMSMEDICATIONTYP_EVALUES_OBJECT:
				return createCDMSMEDICATIONTYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMSORIGI_NVALUES_OBJECT:
				return createCDMSORIGINvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDMYCARENETJUSTIFICATIO_NVALUES:
				return createCDMYCARENETJUSTIFICATIONvaluesFromString(eDataType, initialValue);
			case CdPackage.CDORTHOAPPROAC_HVALUES_OBJECT:
				return createCDORTHOAPPROACHvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDORTHODIAGNOSI_SVALUES_OBJECT:
				return createCDORTHODIAGNOSISvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDORTHOGRAF_TVALUES_OBJECT:
				return createCDORTHOGRAFTvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDORTHOINTERFAC_EVALUES_OBJECT:
				return createCDORTHOINTERFACEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDORTHOKNEEINSER_TVALUES_OBJECT:
				return createCDORTHOKNEEINSERTvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDORTHONAVCO_MVALUES_OBJECT:
				return createCDORTHONAVCOMvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDORTHOTECHREVISIO_NVALUES_OBJECT:
				return createCDORTHOTECHREVISIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDORTHOTYP_EVALUES_OBJECT:
				return createCDORTHOTYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDPARAMETE_RVALUES_OBJECT:
				return createCDPARAMETERvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDPATIENTWILLHOS_PVALUES_OBJECT:
				return createCDPATIENTWILLHOSPvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDPATIENTWILLRE_SVALUES_OBJECT:
				return createCDPATIENTWILLRESvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDPATIENTWIL_LVALUES_OBJECT:
				return createCDPATIENTWILLvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDPERIODICIT_YVALUES:
				return createCDPERIODICITYvaluesFromString(eDataType, initialValue);
			case CdPackage.CDPROO_FSCHEMES_OBJECT:
				return createCDPROOFschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDPROO_FVALUES:
				return createCDPROOFvaluesFromString(eDataType, initialValue);
			case CdPackage.CDQUANTITYPREFI_XVALUES_OBJECT:
				return createCDQUANTITYPREFIXvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDREFSCOP_EVALUES_OBJECT:
				return createCDREFSCOPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDREFUSALMYCARENE_TVALUES:
				return createCDREFUSALMYCARENETvaluesFromString(eDataType, initialValue);
			case CdPackage.CDREIMBURSEMENTNOMENCLATUR_EVALUES:
				return createCDREIMBURSEMENTNOMENCLATUREvaluesFromString(eDataType, initialValue);
			case CdPackage.CDREVCOMPONEN_TVALUES_OBJECT:
				return createCDREVCOMPONENTvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDSEVERIT_YSCHEMES_OBJECT:
				return createCDSEVERITYschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDSEVERIT_YVALUES_OBJECT:
				return createCDSEVERITYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDSE_XVALUES_OBJECT:
				return createCDSEXvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDSIT_ESCHEMES_OBJECT:
				return createCDSITEschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDSIT_EVALUES_OBJECT:
				return createCDSITEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDSNOME_DVALUES:
				return createCDSNOMEDvaluesFromString(eDataType, initialValue);
			case CdPackage.CDSTANDAR_DVALUES_OBJECT:
				return createCDSTANDARDvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDSTENTBRIDGETYP_EVALUES_OBJECT:
				return createCDSTENTBRIDGETYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDSTENTDEVIC_EVALUES_OBJECT:
				return createCDSTENTDEVICEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDSTENTDOMINANC_EVALUES_OBJECT:
				return createCDSTENTDOMINANCEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDSTENTLESIONTYP_EVALUES_OBJECT:
				return createCDSTENTLESIONTYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDSTENTSEGMEN_TVALUES_OBJECT:
				return createCDSTENTSEGMENTvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDSUBSTANC_ESCHEMES_OBJECT:
				return createCDSUBSTANCEschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTECHNICA_LVALUES:
				return createCDTECHNICALvaluesFromString(eDataType, initialValue);
			case CdPackage.CDTELECO_MSCHEMES_OBJECT:
				return createCDTELECOMschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTELECO_MVALUES_OBJECT:
				return createCDTELECOMvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTEMPORALIT_YVALUES_OBJECT:
				return createCDTEMPORALITYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTHERAPEUTICLIN_KSCHEMES_OBJECT:
				return createCDTHERAPEUTICLINKschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTHERAPEUTICLIN_KVALUES:
				return createCDTHERAPEUTICLINKvaluesFromString(eDataType, initialValue);
			case CdPackage.CDTIMEUNI_TSCHEMES_OBJECT:
				return createCDTIMEUNITschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTIMEUNI_TVALUES_OBJECT:
				return createCDTIMEUNITvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIONCARENE_TVALUES_OBJECT:
				return createCDTRANSACTIONCARENETvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIONMA_AVALUES_OBJECT:
				return createCDTRANSACTIONMAAvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIONMYCARENE_TVALUES_OBJECT:
				return createCDTRANSACTIONMYCARENETvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIONRE_GVALUES_OBJECT:
				return createCDTRANSACTIONREGvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIO_NSCHEMES_OBJECT:
				return createCDTRANSACTIONschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIONTYP_EVALUES_OBJECT:
				return createCDTRANSACTIONTYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTRANSACTIO_NVALUES_OBJECT:
				return createCDTRANSACTIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTUCOPATHOLOGYTYP_EVALUES_OBJECT:
				return createCDTUCOPATHOLOGYTYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDTUCOSTEMITYP_EVALUES_OBJECT:
				return createCDTUCOSTEMITYPEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDUNI_TSCHEMES_OBJECT:
				return createCDUNITschemesObjectFromString(eDataType, initialValue);
			case CdPackage.CDUNI_TVALUES_OBJECT:
				return createCDUNITvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDURGENC_YVALUES_OBJECT:
				return createCDURGENCYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDVACCINEINDICATIO_NVALUES_OBJECT:
				return createCDVACCINEINDICATIONvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDVACCIN_EVALUES_OBJECT:
				return createCDVACCINEvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.CDWEEKDA_YVALUES_OBJECT:
				return createCDWEEKDAYvaluesObjectFromString(eDataType, initialValue);
			case CdPackage.IC_DVALUES:
				return createICDvaluesFromString(eDataType, initialValue);
			case CdPackage.ICP_CVALUES:
				return createICPCvaluesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CdPackage.CDACCESSRIGH_TSCHEMES:
				return convertCDACCESSRIGHTschemesToString(eDataType, instanceValue);
			case CdPackage.CDACCESSRIGH_TVALUES:
				return convertCDACCESSRIGHTvaluesToString(eDataType, instanceValue);
			case CdPackage.CDACKNOWLEDGMEN_TVALUES:
				return convertCDACKNOWLEDGMENTvaluesToString(eDataType, instanceValue);
			case CdPackage.CDACTSNURSIN_GVALUES:
				return convertCDACTSNURSINGvaluesToString(eDataType, instanceValue);
			case CdPackage.CDADDRES_SSCHEMES:
				return convertCDADDRESSschemesToString(eDataType, instanceValue);
			case CdPackage.CDADDRES_SVALUES:
				return convertCDADDRESSvaluesToString(eDataType, instanceValue);
			case CdPackage.CDADMINISTRATIONUNI_TVALUES:
				return convertCDADMINISTRATIONUNITvaluesToString(eDataType, instanceValue);
			case CdPackage.CDAUTONOM_YVALUES:
				return convertCDAUTONOMYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDBALLONDEVIC_EVALUES:
				return convertCDBALLONDEVICEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDBCRDIFFERENTATIONDEGRE_EVALUES:
				return convertCDBCRDIFFERENTATIONDEGREEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDBEARINGSURFAC_EVALUES:
				return convertCDBEARINGSURFACEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDBVTAVAILABLEMATERIAL_SVALUES:
				return convertCDBVTAVAILABLEMATERIALSvaluesToString(eDataType, instanceValue);
			case CdPackage.CDBVTCONSERVATIONDELA_YVALUES:
				return convertCDBVTCONSERVATIONDELAYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDBVTCONSERVATIONMOD_EVALUES:
				return convertCDBVTCONSERVATIONMODEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDBVTLATERALIT_YVALUES:
				return convertCDBVTLATERALITYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDBVTPATIENTOPPOSITIO_NVALUES:
				return convertCDBVTPATIENTOPPOSITIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDBVTSAMPLETYP_EVALUES:
				return convertCDBVTSAMPLETYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDBVTSTATU_SVALUES:
				return convertCDBVTSTATUSvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCARENETACCIDENTTYP_EVALUES:
				return convertCDCARENETACCIDENTTYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCARENETAGREEMENTTYP_EVALUES:
				return convertCDCARENETAGREEMENTTYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCARENETDOCUMEN_TVALUES:
				return convertCDCARENETDOCUMENTvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCARENETINSURANCYSTATU_SVALUES:
				return convertCDCARENETINSURANCYSTATUSvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCARENETMESSAG_EVALUES:
				return convertCDCARENETMESSAGEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCARENETMUTATIONINDICATO_RVALUES:
				return convertCDCARENETMUTATIONINDICATORvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCARENETNATIONALINSURANC_EVALUES:
				return convertCDCARENETNATIONALINSURANCEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCARENETPERSONALPAR_TVALUES:
				return convertCDCARENETPERSONALPARTvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCARENETREFUSALREASO_NVALUES:
				return convertCDCARENETREFUSALREASONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCARENETSISCARDERRO_RVALUES:
				return convertCDCARENETSISCARDERRORvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCARENETTHIRDPAYERCONTRAC_TVALUES:
				return convertCDCARENETTHIRDPAYERCONTRACTvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCARENETTYP_EVALUES:
				return convertCDCARENETTYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCAREPAT_HVALUES:
				return convertCDCAREPATHvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCERTAINT_YVALUES:
				return convertCDCERTAINTYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCLINICALPLA_NVALUES:
				return convertCDCLINICALPLANvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCOMPRESSIO_NVALUES:
				return convertCDCOMPRESSIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCONSEN_TSCHEMES:
				return convertCDCONSENTschemesToString(eDataType, instanceValue);
			case CdPackage.CDCONSEN_TVALUES:
				return convertCDCONSENTvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCONTACTPERSO_NVALUES:
				return convertCDCONTACTPERSONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCONTEN_TSCHEMES:
				return convertCDCONTENTschemesToString(eDataType, instanceValue);
			case CdPackage.CDCOUNTR_YSCHEMES:
				return convertCDCOUNTRYschemesToString(eDataType, instanceValue);
			case CdPackage.CDCOUNTR_YVALUES:
				return convertCDCOUNTRYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCURRENC_YVALUES:
				return convertCDCURRENCYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDDAYPERIO_DVALUES:
				return convertCDDAYPERIODvaluesToString(eDataType, instanceValue);
			case CdPackage.CDDISCHARGETYP_EVALUES:
				return convertCDDISCHARGETYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDDRUGCN_KSCHEMES:
				return convertCDDRUGCNKschemesToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHARTIFICIALRESPIRATIONTYP_EVALUES:
				return convertCDEBIRTHARTIFICIALRESPIRATIONTYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHCAESAREANINDICATIO_NVALUES:
				return convertCDEBIRTHCAESAREANINDICATIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHCHILDPOSITIO_NVALUES:
				return convertCDEBIRTHCHILDPOSITIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHCONGENITALMALFORMATIO_NVALUES:
				return convertCDEBIRTHCONGENITALMALFORMATIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHDELIVERYWA_YVALUES:
				return convertCDEBIRTHDELIVERYWAYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHFOETALMONITORIN_GVALUES:
				return convertCDEBIRTHFOETALMONITORINGvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHNEONATALDEPTTYP_EVALUES:
				return convertCDEBIRTHNEONATALDEPTTYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHPLAC_EVALUES:
				return convertCDEBIRTHPLACEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHPREGNANCYORIGI_NVALUES:
				return convertCDEBIRTHPREGNANCYORIGINvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHSPECIALVALUE_SVALUES:
				return convertCDEBIRTHSPECIALVALUESvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEC_GVALUES:
				return convertCDECGvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEMERGENCYEVALUATIO_NVALUES:
				return convertCDEMERGENCYEVALUATIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEMPLOYMENTSITUATIO_NVALUES:
				return convertCDEMPLOYMENTSITUATIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDENCODIN_GVALUES:
				return convertCDENCODINGvaluesToString(eDataType, instanceValue);
			case CdPackage.CDENCOUNTERSAFETYISSU_EVALUES:
				return convertCDENCOUNTERSAFETYISSUEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDENCOUNTE_RVALUES:
				return convertCDENCOUNTERvaluesToString(eDataType, instanceValue);
			case CdPackage.CDENCRYPTIONACTO_RVALUES:
				return convertCDENCRYPTIONACTORvaluesToString(eDataType, instanceValue);
			case CdPackage.CDENCRYPTIONMETHO_DSCHEMES:
				return convertCDENCRYPTIONMETHODschemesToString(eDataType, instanceValue);
			case CdPackage.CDENCRYPTIONMETHO_DVALUES:
				return convertCDENCRYPTIONMETHODvaluesToString(eDataType, instanceValue);
			case CdPackage.CDERRORMYCARENE_TSCHEMES:
				return convertCDERRORMYCARENETschemesToString(eDataType, instanceValue);
			case CdPackage.CDERRO_RSCHEMES:
				return convertCDERRORschemesToString(eDataType, instanceValue);
			case CdPackage.CDEXTERNALSOURC_ESCHEMES:
				return convertCDEXTERNALSOURCEschemesToString(eDataType, instanceValue);
			case CdPackage.CDFEDCOUNTR_YVALUES:
				return convertCDFEDCOUNTRYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDFORMULAR_YSCHEMES:
				return convertCDFORMULARYschemesToString(eDataType, instanceValue);
			case CdPackage.CDGALENICFOR_MSCHEMES:
				return convertCDGALENICFORMschemesToString(eDataType, instanceValue);
			case CdPackage.CDHCPART_YSCHEMES:
				return convertCDHCPARTYschemesToString(eDataType, instanceValue);
			case CdPackage.CDHCPART_YVALUES:
				return convertCDHCPARTYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDHEADINGRE_GVALUES:
				return convertCDHEADINGREGvaluesToString(eDataType, instanceValue);
			case CdPackage.CDHEADIN_GSCHEMES:
				return convertCDHEADINGschemesToString(eDataType, instanceValue);
			case CdPackage.CDHEADIN_GVALUES:
				return convertCDHEADINGvaluesToString(eDataType, instanceValue);
			case CdPackage.CDIMPLANTATIONDEVIC_EVALUES:
				return convertCDIMPLANTATIONDEVICEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDIMPLANTATIONTYP_EVALUES:
				return convertCDIMPLANTATIONTYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDINCAPACITYREASO_NVALUES:
				return convertCDINCAPACITYREASONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDINCAPACIT_YVALUES:
				return convertCDINCAPACITYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDINNCLUSTE_RSCHEMES:
				return convertCDINNCLUSTERschemesToString(eDataType, instanceValue);
			case CdPackage.CDITEMBV_TVALUES:
				return convertCDITEMBVTvaluesToString(eDataType, instanceValue);
			case CdPackage.CDITEMCARENE_TVALUES:
				return convertCDITEMCARENETvaluesToString(eDataType, instanceValue);
			case CdPackage.CDITEMEBIRT_HVALUES:
				return convertCDITEMEBIRTHvaluesToString(eDataType, instanceValue);
			case CdPackage.CDITEMMA_AVALUES:
				return convertCDITEMMAAvaluesToString(eDataType, instanceValue);
			case CdPackage.CDITEMM_SVALUES:
				return convertCDITEMMSvaluesToString(eDataType, instanceValue);
			case CdPackage.CDITEMMYCARENE_TVALUES:
				return convertCDITEMMYCARENETvaluesToString(eDataType, instanceValue);
			case CdPackage.CDITEMRE_GVALUES:
				return convertCDITEMREGvaluesToString(eDataType, instanceValue);
			case CdPackage.CDITE_MSCHEMES:
				return convertCDITEMschemesToString(eDataType, instanceValue);
			case CdPackage.CDITE_MVALUES:
				return convertCDITEMvaluesToString(eDataType, instanceValue);
			case CdPackage.CDLEGALSERVIC_EVALUES:
				return convertCDLEGALSERVICEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDLIFECYCL_EVALUES:
				return convertCDLIFECYCLEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDLN_KVALUES:
				return convertCDLNKvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMAACOVERAGETYP_EVALUES:
				return convertCDMAACOVERAGETYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMAAREFUSALJUSTIFICATIO_NVALUES:
				return convertCDMAAREFUSALJUSTIFICATIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMAAREQUESTTYP_EVALUES:
				return convertCDMAAREQUESTTYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMAARESPONSETYP_EVALUES:
				return convertCDMAARESPONSETYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMAATYP_EVALUES:
				return convertCDMAATYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMEDIATYP_EVALUES:
				return convertCDMEDIATYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMEDICATIO_NSCHEMES:
				return convertCDMEDICATIONschemesToString(eDataType, instanceValue);
			case CdPackage.CDMESSAG_EVALUES:
				return convertCDMESSAGEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMICROORGANIS_MVALUES:
				return convertCDMICROORGANISMvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMKGADMISSIO_NVALUES:
				return convertCDMKGADMISSIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMKGDESTINATIO_NVALUES:
				return convertCDMKGDESTINATIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMKGDISCHARG_EVALUES:
				return convertCDMKGDISCHARGEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMKGORIGI_NVALUES:
				return convertCDMKGORIGINvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMKGREFERRE_RVALUES:
				return convertCDMKGREFERRERvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMSADAPTATIO_NVALUES:
				return convertCDMSADAPTATIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMSMEDICATIONTYP_EVALUES:
				return convertCDMSMEDICATIONTYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDMSORIGI_NVALUES:
				return convertCDMSORIGINvaluesToString(eDataType, instanceValue);
			case CdPackage.CDORTHOAPPROAC_HVALUES:
				return convertCDORTHOAPPROACHvaluesToString(eDataType, instanceValue);
			case CdPackage.CDORTHODIAGNOSI_SVALUES:
				return convertCDORTHODIAGNOSISvaluesToString(eDataType, instanceValue);
			case CdPackage.CDORTHOGRAF_TVALUES:
				return convertCDORTHOGRAFTvaluesToString(eDataType, instanceValue);
			case CdPackage.CDORTHOINTERFAC_EVALUES:
				return convertCDORTHOINTERFACEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDORTHOKNEEINSER_TVALUES:
				return convertCDORTHOKNEEINSERTvaluesToString(eDataType, instanceValue);
			case CdPackage.CDORTHONAVCO_MVALUES:
				return convertCDORTHONAVCOMvaluesToString(eDataType, instanceValue);
			case CdPackage.CDORTHOTECHREVISIO_NVALUES:
				return convertCDORTHOTECHREVISIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDORTHOTYP_EVALUES:
				return convertCDORTHOTYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDPARAMETE_RVALUES:
				return convertCDPARAMETERvaluesToString(eDataType, instanceValue);
			case CdPackage.CDPATIENTWILLHOS_PVALUES:
				return convertCDPATIENTWILLHOSPvaluesToString(eDataType, instanceValue);
			case CdPackage.CDPATIENTWILLRE_SVALUES:
				return convertCDPATIENTWILLRESvaluesToString(eDataType, instanceValue);
			case CdPackage.CDPATIENTWIL_LVALUES:
				return convertCDPATIENTWILLvaluesToString(eDataType, instanceValue);
			case CdPackage.CDPROO_FSCHEMES:
				return convertCDPROOFschemesToString(eDataType, instanceValue);
			case CdPackage.CDQUANTITYPREFI_XVALUES:
				return convertCDQUANTITYPREFIXvaluesToString(eDataType, instanceValue);
			case CdPackage.CDREFSCOP_EVALUES:
				return convertCDREFSCOPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDREVCOMPONEN_TVALUES:
				return convertCDREVCOMPONENTvaluesToString(eDataType, instanceValue);
			case CdPackage.CDSEVERIT_YSCHEMES:
				return convertCDSEVERITYschemesToString(eDataType, instanceValue);
			case CdPackage.CDSEVERIT_YVALUES:
				return convertCDSEVERITYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDSE_XVALUES:
				return convertCDSEXvaluesToString(eDataType, instanceValue);
			case CdPackage.CDSIT_ESCHEMES:
				return convertCDSITEschemesToString(eDataType, instanceValue);
			case CdPackage.CDSIT_EVALUES:
				return convertCDSITEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDSTANDAR_DVALUES:
				return convertCDSTANDARDvaluesToString(eDataType, instanceValue);
			case CdPackage.CDSTENTBRIDGETYP_EVALUES:
				return convertCDSTENTBRIDGETYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDSTENTDEVIC_EVALUES:
				return convertCDSTENTDEVICEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDSTENTDOMINANC_EVALUES:
				return convertCDSTENTDOMINANCEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDSTENTLESIONTYP_EVALUES:
				return convertCDSTENTLESIONTYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDSTENTSEGMEN_TVALUES:
				return convertCDSTENTSEGMENTvaluesToString(eDataType, instanceValue);
			case CdPackage.CDSUBSTANC_ESCHEMES:
				return convertCDSUBSTANCEschemesToString(eDataType, instanceValue);
			case CdPackage.CDTELECO_MSCHEMES:
				return convertCDTELECOMschemesToString(eDataType, instanceValue);
			case CdPackage.CDTELECO_MVALUES:
				return convertCDTELECOMvaluesToString(eDataType, instanceValue);
			case CdPackage.CDTEMPORALIT_YVALUES:
				return convertCDTEMPORALITYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDTHERAPEUTICLIN_KSCHEMES:
				return convertCDTHERAPEUTICLINKschemesToString(eDataType, instanceValue);
			case CdPackage.CDTIMEUNI_TSCHEMES:
				return convertCDTIMEUNITschemesToString(eDataType, instanceValue);
			case CdPackage.CDTIMEUNI_TVALUES:
				return convertCDTIMEUNITvaluesToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIONCARENE_TVALUES:
				return convertCDTRANSACTIONCARENETvaluesToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIONMA_AVALUES:
				return convertCDTRANSACTIONMAAvaluesToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIONMYCARENE_TVALUES:
				return convertCDTRANSACTIONMYCARENETvaluesToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIONRE_GVALUES:
				return convertCDTRANSACTIONREGvaluesToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIO_NSCHEMES:
				return convertCDTRANSACTIONschemesToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIONTYP_EVALUES:
				return convertCDTRANSACTIONTYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIO_NVALUES:
				return convertCDTRANSACTIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDTUCOPATHOLOGYTYP_EVALUES:
				return convertCDTUCOPATHOLOGYTYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDTUCOSTEMITYP_EVALUES:
				return convertCDTUCOSTEMITYPEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDUNI_TSCHEMES:
				return convertCDUNITschemesToString(eDataType, instanceValue);
			case CdPackage.CDUNI_TVALUES:
				return convertCDUNITvaluesToString(eDataType, instanceValue);
			case CdPackage.CDURGENC_YVALUES:
				return convertCDURGENCYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDVACCINEINDICATIO_NVALUES:
				return convertCDVACCINEINDICATIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDVACCIN_EVALUES:
				return convertCDVACCINEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDWEEKDA_YVALUES:
				return convertCDWEEKDAYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDACCESSRIGH_TSCHEMES_OBJECT:
				return convertCDACCESSRIGHTschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDACCESSRIGH_TVALUES_OBJECT:
				return convertCDACCESSRIGHTvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDACKNOWLEDGMEN_TVALUES_OBJECT:
				return convertCDACKNOWLEDGMENTvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDACTSNURSIN_GVALUES_OBJECT:
				return convertCDACTSNURSINGvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDADDRES_SSCHEMES_OBJECT:
				return convertCDADDRESSschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDADDRES_SVALUES_OBJECT:
				return convertCDADDRESSvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDADMINISTRATIONUNI_TVALUES_OBJECT:
				return convertCDADMINISTRATIONUNITvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDAT_CVALUES:
				return convertCDATCvaluesToString(eDataType, instanceValue);
			case CdPackage.CDAUTONOM_YVALUES_OBJECT:
				return convertCDAUTONOMYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDBALLONDEVIC_EVALUES_OBJECT:
				return convertCDBALLONDEVICEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDBCRDIFFERENTATIONDEGRE_EVALUES_OBJECT:
				return convertCDBCRDIFFERENTATIONDEGREEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDBEARINGSURFAC_EVALUES_OBJECT:
				return convertCDBEARINGSURFACEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDBVTAVAILABLEMATERIAL_SVALUES_OBJECT:
				return convertCDBVTAVAILABLEMATERIALSvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDBVTCONSERVATIONDELA_YVALUES_OBJECT:
				return convertCDBVTCONSERVATIONDELAYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDBVTCONSERVATIONMOD_EVALUES_OBJECT:
				return convertCDBVTCONSERVATIONMODEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDBVTLATERALIT_YVALUES_OBJECT:
				return convertCDBVTLATERALITYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDBVTPATIENTOPPOSITIO_NVALUES_OBJECT:
				return convertCDBVTPATIENTOPPOSITIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDBVTSAMPLETYP_EVALUES_OBJECT:
				return convertCDBVTSAMPLETYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDBVTSTATU_SVALUES_OBJECT:
				return convertCDBVTSTATUSvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCARENETACCIDENTTYP_EVALUES_OBJECT:
				return convertCDCARENETACCIDENTTYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCARENETAGREEMENTTYP_EVALUES_OBJECT:
				return convertCDCARENETAGREEMENTTYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCARENETDOCUMEN_TVALUES_OBJECT:
				return convertCDCARENETDOCUMENTvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCARENETINSURANCYSTATU_SVALUES_OBJECT:
				return convertCDCARENETINSURANCYSTATUSvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCARENETMESSAG_EVALUES_OBJECT:
				return convertCDCARENETMESSAGEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCARENETMUTATIONINDICATO_RVALUES_OBJECT:
				return convertCDCARENETMUTATIONINDICATORvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCARENETNATIONALINSURANC_EVALUES_OBJECT:
				return convertCDCARENETNATIONALINSURANCEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCARENETPERSONALPAR_TVALUES_OBJECT:
				return convertCDCARENETPERSONALPARTvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCARENETREFUSALREASO_NVALUES_OBJECT:
				return convertCDCARENETREFUSALREASONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCARENETSISCARDERRO_RVALUES_OBJECT:
				return convertCDCARENETSISCARDERRORvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCARENETTHIRDPAYERCONTRAC_TVALUES_OBJECT:
				return convertCDCARENETTHIRDPAYERCONTRACTvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCARENETTYP_EVALUES_OBJECT:
				return convertCDCARENETTYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCAREPAT_HVALUES_OBJECT:
				return convertCDCAREPATHvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCERTAINT_YVALUES_OBJECT:
				return convertCDCERTAINTYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCHAPTER4CATEGOR_YVALUES:
				return convertCDCHAPTER4CATEGORYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCHAPTER4CRITERI_AVALUES:
				return convertCDCHAPTER4CRITERIAvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCHAPTER4DOCUMENTSEQAPPENDI_XVALUES:
				return convertCDCHAPTER4DOCUMENTSEQAPPENDIXvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCHAPTER4FORMALINTERPRETATIO_NVALUES:
				return convertCDCHAPTER4FORMALINTERPRETATIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCHAPTER4PARAGRAP_HVALUES:
				return convertCDCHAPTER4PARAGRAPHvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCHAPTER4VERSESEQAPPENDI_XVALUES:
				return convertCDCHAPTER4VERSESEQAPPENDIXvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCHAPTER4VERS_EVALUES:
				return convertCDCHAPTER4VERSEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCIVILSTAT_EVALUES:
				return convertCDCIVILSTATEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCLINICALPLA_NVALUES_OBJECT:
				return convertCDCLINICALPLANvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCLINICA_LVALUES:
				return convertCDCLINICALvaluesToString(eDataType, instanceValue);
			case CdPackage.CDCOMPRESSIO_NVALUES_OBJECT:
				return convertCDCOMPRESSIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCONSEN_TSCHEMES_OBJECT:
				return convertCDCONSENTschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCONSEN_TVALUES_OBJECT:
				return convertCDCONSENTvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCONTACTPERSO_NVALUES_OBJECT:
				return convertCDCONTACTPERSONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCONTEN_TSCHEMES_OBJECT:
				return convertCDCONTENTschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCOUNTR_YSCHEMES_OBJECT:
				return convertCDCOUNTRYschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCOUNTR_YVALUES_OBJECT:
				return convertCDCOUNTRYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDCURRENC_YVALUES_OBJECT:
				return convertCDCURRENCYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDDAYPERIO_DVALUES_OBJECT:
				return convertCDDAYPERIODvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDDISCHARGETYP_EVALUES_OBJECT:
				return convertCDDISCHARGETYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDDRUGCN_KSCHEMES_OBJECT:
				return convertCDDRUGCNKschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDDRUGCN_KVALUES:
				return convertCDDRUGCNKvaluesToString(eDataType, instanceValue);
			case CdPackage.CDDRUGPRESENTATIO_NVALUES:
				return convertCDDRUGPRESENTATIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDDRUGROUT_EVALUES:
				return convertCDDRUGROUTEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHARTIFICIALRESPIRATIONTYP_EVALUES_OBJECT:
				return convertCDEBIRTHARTIFICIALRESPIRATIONTYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHCAESAREANINDICATIO_NVALUES_OBJECT:
				return convertCDEBIRTHCAESAREANINDICATIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHCHILDPOSITIO_NVALUES_OBJECT:
				return convertCDEBIRTHCHILDPOSITIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHCONGENITALMALFORMATIO_NVALUES_OBJECT:
				return convertCDEBIRTHCONGENITALMALFORMATIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHDELIVERYWA_YVALUES_OBJECT:
				return convertCDEBIRTHDELIVERYWAYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHFOETALMONITORIN_GVALUES_OBJECT:
				return convertCDEBIRTHFOETALMONITORINGvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHNEONATALDEPTTYP_EVALUES_OBJECT:
				return convertCDEBIRTHNEONATALDEPTTYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHPLAC_EVALUES_OBJECT:
				return convertCDEBIRTHPLACEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHPREGNANCYORIGI_NVALUES_OBJECT:
				return convertCDEBIRTHPREGNANCYORIGINvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDEBIRTHSPECIALVALUE_SVALUES_OBJECT:
				return convertCDEBIRTHSPECIALVALUESvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDEC_GVALUES_OBJECT:
				return convertCDECGvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDEMERGENCYEVALUATIO_NVALUES_OBJECT:
				return convertCDEMERGENCYEVALUATIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDEMPLOYMENTSITUATIO_NVALUES_OBJECT:
				return convertCDEMPLOYMENTSITUATIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDENCODIN_GVALUES_OBJECT:
				return convertCDENCODINGvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDENCOUNTERSAFETYISSU_EVALUES_OBJECT:
				return convertCDENCOUNTERSAFETYISSUEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDENCOUNTE_RVALUES_OBJECT:
				return convertCDENCOUNTERvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDENCRYPTIONACTO_RVALUES_OBJECT:
				return convertCDENCRYPTIONACTORvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDENCRYPTIONMETHO_DSCHEMES_OBJECT:
				return convertCDENCRYPTIONMETHODschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDENCRYPTIONMETHO_DVALUES_OBJECT:
				return convertCDENCRYPTIONMETHODvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDERRORMYCARENE_TSCHEMES_OBJECT:
				return convertCDERRORMYCARENETschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDERRO_RSCHEMES_OBJECT:
				return convertCDERRORschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDERRO_RVALUES:
				return convertCDERRORvaluesToString(eDataType, instanceValue);
			case CdPackage.CDEXTERNALSOURC_ESCHEMES_OBJECT:
				return convertCDEXTERNALSOURCEschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDEXTERNALSOURC_EVALUES:
				return convertCDEXTERNALSOURCEvaluesToString(eDataType, instanceValue);
			case CdPackage.CDFEDCOUNTR_YVALUES_OBJECT:
				return convertCDFEDCOUNTRYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDFORMULAR_YSCHEMES_OBJECT:
				return convertCDFORMULARYschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDGALENICFOR_MSCHEMES_OBJECT:
				return convertCDGALENICFORMschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDHCPART_YSCHEMES_OBJECT:
				return convertCDHCPARTYschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDHCPART_YVALUES_OBJECT:
				return convertCDHCPARTYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDHEADINGLA_BVALUES:
				return convertCDHEADINGLABvaluesToString(eDataType, instanceValue);
			case CdPackage.CDHEADINGRE_GVALUES_OBJECT:
				return convertCDHEADINGREGvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDHEADIN_GSCHEMES_OBJECT:
				return convertCDHEADINGschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDHEADIN_GVALUES_OBJECT:
				return convertCDHEADINGvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDIMPLANTATIONDEVIC_EVALUES_OBJECT:
				return convertCDIMPLANTATIONDEVICEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDIMPLANTATIONTYP_EVALUES_OBJECT:
				return convertCDIMPLANTATIONTYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDINCAPACITYREASO_NVALUES_OBJECT:
				return convertCDINCAPACITYREASONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDINCAPACIT_YVALUES_OBJECT:
				return convertCDINCAPACITYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDINNCLUSTE_RSCHEMES_OBJECT:
				return convertCDINNCLUSTERschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDINNCLUSTE_RVALUES:
				return convertCDINNCLUSTERvaluesToString(eDataType, instanceValue);
			case CdPackage.CDITEMBV_TVALUES_OBJECT:
				return convertCDITEMBVTvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDITEMCARENE_TVALUES_OBJECT:
				return convertCDITEMCARENETvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDITEMEBIRT_HVALUES_OBJECT:
				return convertCDITEMEBIRTHvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDITEMMA_AVALUES_OBJECT:
				return convertCDITEMMAAvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDITEMM_SVALUES_OBJECT:
				return convertCDITEMMSvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDITEMMYCARENE_TVALUES_OBJECT:
				return convertCDITEMMYCARENETvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDITEMRE_GVALUES_OBJECT:
				return convertCDITEMREGvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDITE_MSCHEMES_OBJECT:
				return convertCDITEMschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDITE_MVALUES_OBJECT:
				return convertCDITEMvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDLA_BVALUES:
				return convertCDLABvaluesToString(eDataType, instanceValue);
			case CdPackage.CDLEGALSERVIC_EVALUES_OBJECT:
				return convertCDLEGALSERVICEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDLIFECYCL_EVALUES_OBJECT:
				return convertCDLIFECYCLEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDLN_KVALUES_OBJECT:
				return convertCDLNKvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMAACOVERAGETYP_EVALUES_OBJECT:
				return convertCDMAACOVERAGETYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMAAREFUSALJUSTIFICATIO_NVALUES_OBJECT:
				return convertCDMAAREFUSALJUSTIFICATIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMAAREQUESTTYP_EVALUES_OBJECT:
				return convertCDMAAREQUESTTYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMAARESPONSETYP_EVALUES_OBJECT:
				return convertCDMAARESPONSETYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMAATYP_EVALUES_OBJECT:
				return convertCDMAATYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMEDIATYP_EVALUES_OBJECT:
				return convertCDMEDIATYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMEDICATIO_NSCHEMES_OBJECT:
				return convertCDMEDICATIONschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMESSAG_EVALUES_OBJECT:
				return convertCDMESSAGEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMICROORGANIS_MVALUES_OBJECT:
				return convertCDMICROORGANISMvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMKGADMISSIO_NVALUES_OBJECT:
				return convertCDMKGADMISSIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMKGDESTINATIO_NVALUES_OBJECT:
				return convertCDMKGDESTINATIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMKGDISCHARG_EVALUES_OBJECT:
				return convertCDMKGDISCHARGEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMKGORIGI_NVALUES_OBJECT:
				return convertCDMKGORIGINvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMKGREFERRE_RVALUES_OBJECT:
				return convertCDMKGREFERRERvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMSADAPTATIO_NVALUES_OBJECT:
				return convertCDMSADAPTATIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMSMEDICATIONTYP_EVALUES_OBJECT:
				return convertCDMSMEDICATIONTYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMSORIGI_NVALUES_OBJECT:
				return convertCDMSORIGINvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDMYCARENETJUSTIFICATIO_NVALUES:
				return convertCDMYCARENETJUSTIFICATIONvaluesToString(eDataType, instanceValue);
			case CdPackage.CDORTHOAPPROAC_HVALUES_OBJECT:
				return convertCDORTHOAPPROACHvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDORTHODIAGNOSI_SVALUES_OBJECT:
				return convertCDORTHODIAGNOSISvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDORTHOGRAF_TVALUES_OBJECT:
				return convertCDORTHOGRAFTvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDORTHOINTERFAC_EVALUES_OBJECT:
				return convertCDORTHOINTERFACEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDORTHOKNEEINSER_TVALUES_OBJECT:
				return convertCDORTHOKNEEINSERTvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDORTHONAVCO_MVALUES_OBJECT:
				return convertCDORTHONAVCOMvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDORTHOTECHREVISIO_NVALUES_OBJECT:
				return convertCDORTHOTECHREVISIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDORTHOTYP_EVALUES_OBJECT:
				return convertCDORTHOTYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDPARAMETE_RVALUES_OBJECT:
				return convertCDPARAMETERvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDPATIENTWILLHOS_PVALUES_OBJECT:
				return convertCDPATIENTWILLHOSPvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDPATIENTWILLRE_SVALUES_OBJECT:
				return convertCDPATIENTWILLRESvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDPATIENTWIL_LVALUES_OBJECT:
				return convertCDPATIENTWILLvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDPERIODICIT_YVALUES:
				return convertCDPERIODICITYvaluesToString(eDataType, instanceValue);
			case CdPackage.CDPROO_FSCHEMES_OBJECT:
				return convertCDPROOFschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDPROO_FVALUES:
				return convertCDPROOFvaluesToString(eDataType, instanceValue);
			case CdPackage.CDQUANTITYPREFI_XVALUES_OBJECT:
				return convertCDQUANTITYPREFIXvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDREFSCOP_EVALUES_OBJECT:
				return convertCDREFSCOPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDREFUSALMYCARENE_TVALUES:
				return convertCDREFUSALMYCARENETvaluesToString(eDataType, instanceValue);
			case CdPackage.CDREIMBURSEMENTNOMENCLATUR_EVALUES:
				return convertCDREIMBURSEMENTNOMENCLATUREvaluesToString(eDataType, instanceValue);
			case CdPackage.CDREVCOMPONEN_TVALUES_OBJECT:
				return convertCDREVCOMPONENTvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDSEVERIT_YSCHEMES_OBJECT:
				return convertCDSEVERITYschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDSEVERIT_YVALUES_OBJECT:
				return convertCDSEVERITYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDSE_XVALUES_OBJECT:
				return convertCDSEXvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDSIT_ESCHEMES_OBJECT:
				return convertCDSITEschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDSIT_EVALUES_OBJECT:
				return convertCDSITEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDSNOME_DVALUES:
				return convertCDSNOMEDvaluesToString(eDataType, instanceValue);
			case CdPackage.CDSTANDAR_DVALUES_OBJECT:
				return convertCDSTANDARDvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDSTENTBRIDGETYP_EVALUES_OBJECT:
				return convertCDSTENTBRIDGETYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDSTENTDEVIC_EVALUES_OBJECT:
				return convertCDSTENTDEVICEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDSTENTDOMINANC_EVALUES_OBJECT:
				return convertCDSTENTDOMINANCEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDSTENTLESIONTYP_EVALUES_OBJECT:
				return convertCDSTENTLESIONTYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDSTENTSEGMEN_TVALUES_OBJECT:
				return convertCDSTENTSEGMENTvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDSUBSTANC_ESCHEMES_OBJECT:
				return convertCDSUBSTANCEschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTECHNICA_LVALUES:
				return convertCDTECHNICALvaluesToString(eDataType, instanceValue);
			case CdPackage.CDTELECO_MSCHEMES_OBJECT:
				return convertCDTELECOMschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTELECO_MVALUES_OBJECT:
				return convertCDTELECOMvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTEMPORALIT_YVALUES_OBJECT:
				return convertCDTEMPORALITYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTHERAPEUTICLIN_KSCHEMES_OBJECT:
				return convertCDTHERAPEUTICLINKschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTHERAPEUTICLIN_KVALUES:
				return convertCDTHERAPEUTICLINKvaluesToString(eDataType, instanceValue);
			case CdPackage.CDTIMEUNI_TSCHEMES_OBJECT:
				return convertCDTIMEUNITschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTIMEUNI_TVALUES_OBJECT:
				return convertCDTIMEUNITvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIONCARENE_TVALUES_OBJECT:
				return convertCDTRANSACTIONCARENETvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIONMA_AVALUES_OBJECT:
				return convertCDTRANSACTIONMAAvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIONMYCARENE_TVALUES_OBJECT:
				return convertCDTRANSACTIONMYCARENETvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIONRE_GVALUES_OBJECT:
				return convertCDTRANSACTIONREGvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIO_NSCHEMES_OBJECT:
				return convertCDTRANSACTIONschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIONTYP_EVALUES_OBJECT:
				return convertCDTRANSACTIONTYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTRANSACTIO_NVALUES_OBJECT:
				return convertCDTRANSACTIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTUCOPATHOLOGYTYP_EVALUES_OBJECT:
				return convertCDTUCOPATHOLOGYTYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDTUCOSTEMITYP_EVALUES_OBJECT:
				return convertCDTUCOSTEMITYPEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDUNI_TSCHEMES_OBJECT:
				return convertCDUNITschemesObjectToString(eDataType, instanceValue);
			case CdPackage.CDUNI_TVALUES_OBJECT:
				return convertCDUNITvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDURGENC_YVALUES_OBJECT:
				return convertCDURGENCYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDVACCINEINDICATIO_NVALUES_OBJECT:
				return convertCDVACCINEINDICATIONvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDVACCIN_EVALUES_OBJECT:
				return convertCDVACCINEvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.CDWEEKDA_YVALUES_OBJECT:
				return convertCDWEEKDAYvaluesObjectToString(eDataType, instanceValue);
			case CdPackage.IC_DVALUES:
				return convertICDvaluesToString(eDataType, instanceValue);
			case CdPackage.ICP_CVALUES:
				return convertICPCvaluesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDACCESSRIGHT createCDACCESSRIGHT() {
		CDACCESSRIGHTImpl cdaccessright = new CDACCESSRIGHTImpl();
		return cdaccessright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDACKNOWLEDGMENT createCDACKNOWLEDGMENT() {
		CDACKNOWLEDGMENTImpl cdacknowledgment = new CDACKNOWLEDGMENTImpl();
		return cdacknowledgment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDACTSNURSING createCDACTSNURSING() {
		CDACTSNURSINGImpl cdactsnursing = new CDACTSNURSINGImpl();
		return cdactsnursing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDADDRESS createCDADDRESS() {
		CDADDRESSImpl cdaddress = new CDADDRESSImpl();
		return cdaddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDADMINISTRATIONUNIT createCDADMINISTRATIONUNIT() {
		CDADMINISTRATIONUNITImpl cdadministrationunit = new CDADMINISTRATIONUNITImpl();
		return cdadministrationunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDATC createCDATC() {
		CDATCImpl cdatc = new CDATCImpl();
		return cdatc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDAUTONOMY createCDAUTONOMY() {
		CDAUTONOMYImpl cdautonomy = new CDAUTONOMYImpl();
		return cdautonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDBALLONDEVICE createCDBALLONDEVICE() {
		CDBALLONDEVICEImpl cdballondevice = new CDBALLONDEVICEImpl();
		return cdballondevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDBCRDIFFERENTATIONDEGREE createCDBCRDIFFERENTATIONDEGREE() {
		CDBCRDIFFERENTATIONDEGREEImpl cdbcrdifferentationdegree = new CDBCRDIFFERENTATIONDEGREEImpl();
		return cdbcrdifferentationdegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDBEARINGSURFACE createCDBEARINGSURFACE() {
		CDBEARINGSURFACEImpl cdbearingsurface = new CDBEARINGSURFACEImpl();
		return cdbearingsurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDBVTAVAILABLEMATERIALS createCDBVTAVAILABLEMATERIALS() {
		CDBVTAVAILABLEMATERIALSImpl cdbvtavailablematerials = new CDBVTAVAILABLEMATERIALSImpl();
		return cdbvtavailablematerials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDBVTCONSERVATIONDELAY createCDBVTCONSERVATIONDELAY() {
		CDBVTCONSERVATIONDELAYImpl cdbvtconservationdelay = new CDBVTCONSERVATIONDELAYImpl();
		return cdbvtconservationdelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDBVTCONSERVATIONMODE createCDBVTCONSERVATIONMODE() {
		CDBVTCONSERVATIONMODEImpl cdbvtconservationmode = new CDBVTCONSERVATIONMODEImpl();
		return cdbvtconservationmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDBVTLATERALITY createCDBVTLATERALITY() {
		CDBVTLATERALITYImpl cdbvtlaterality = new CDBVTLATERALITYImpl();
		return cdbvtlaterality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDBVTPATIENTOPPOSITION createCDBVTPATIENTOPPOSITION() {
		CDBVTPATIENTOPPOSITIONImpl cdbvtpatientopposition = new CDBVTPATIENTOPPOSITIONImpl();
		return cdbvtpatientopposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDBVTSAMPLETYPE createCDBVTSAMPLETYPE() {
		CDBVTSAMPLETYPEImpl cdbvtsampletype = new CDBVTSAMPLETYPEImpl();
		return cdbvtsampletype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDBVTSTATUS createCDBVTSTATUS() {
		CDBVTSTATUSImpl cdbvtstatus = new CDBVTSTATUSImpl();
		return cdbvtstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCARENETACCIDENTTYPE createCDCARENETACCIDENTTYPE() {
		CDCARENETACCIDENTTYPEImpl cdcarenetaccidenttype = new CDCARENETACCIDENTTYPEImpl();
		return cdcarenetaccidenttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCARENETAGREEMENTTYPE createCDCARENETAGREEMENTTYPE() {
		CDCARENETAGREEMENTTYPEImpl cdcarenetagreementtype = new CDCARENETAGREEMENTTYPEImpl();
		return cdcarenetagreementtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCARENETDOCUMENT createCDCARENETDOCUMENT() {
		CDCARENETDOCUMENTImpl cdcarenetdocument = new CDCARENETDOCUMENTImpl();
		return cdcarenetdocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCARENETINSURANCYSTATUS createCDCARENETINSURANCYSTATUS() {
		CDCARENETINSURANCYSTATUSImpl cdcarenetinsurancystatus = new CDCARENETINSURANCYSTATUSImpl();
		return cdcarenetinsurancystatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCARENETMESSAGE createCDCARENETMESSAGE() {
		CDCARENETMESSAGEImpl cdcarenetmessage = new CDCARENETMESSAGEImpl();
		return cdcarenetmessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCARENETMUTATIONINDICATOR createCDCARENETMUTATIONINDICATOR() {
		CDCARENETMUTATIONINDICATORImpl cdcarenetmutationindicator = new CDCARENETMUTATIONINDICATORImpl();
		return cdcarenetmutationindicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCARENETNATIONALINSURANCE createCDCARENETNATIONALINSURANCE() {
		CDCARENETNATIONALINSURANCEImpl cdcarenetnationalinsurance = new CDCARENETNATIONALINSURANCEImpl();
		return cdcarenetnationalinsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCARENETPERSONALPART createCDCARENETPERSONALPART() {
		CDCARENETPERSONALPARTImpl cdcarenetpersonalpart = new CDCARENETPERSONALPARTImpl();
		return cdcarenetpersonalpart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCARENETREFUSALREASON createCDCARENETREFUSALREASON() {
		CDCARENETREFUSALREASONImpl cdcarenetrefusalreason = new CDCARENETREFUSALREASONImpl();
		return cdcarenetrefusalreason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCARENETSISCARDERROR createCDCARENETSISCARDERROR() {
		CDCARENETSISCARDERRORImpl cdcarenetsiscarderror = new CDCARENETSISCARDERRORImpl();
		return cdcarenetsiscarderror;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCARENETTHIRDPAYERCONTRACT createCDCARENETTHIRDPAYERCONTRACT() {
		CDCARENETTHIRDPAYERCONTRACTImpl cdcarenetthirdpayercontract = new CDCARENETTHIRDPAYERCONTRACTImpl();
		return cdcarenetthirdpayercontract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCARENETTYPE createCDCARENETTYPE() {
		CDCARENETTYPEImpl cdcarenettype = new CDCARENETTYPEImpl();
		return cdcarenettype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCAREPATH createCDCAREPATH() {
		CDCAREPATHImpl cdcarepath = new CDCAREPATHImpl();
		return cdcarepath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCERTAINTY createCDCERTAINTY() {
		CDCERTAINTYImpl cdcertainty = new CDCERTAINTYImpl();
		return cdcertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCHAPTER4CATEGORY createCDCHAPTER4CATEGORY() {
		CDCHAPTER4CATEGORYImpl cdchapter4CATEGORY = new CDCHAPTER4CATEGORYImpl();
		return cdchapter4CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCHAPTER4CRITERIA createCDCHAPTER4CRITERIA() {
		CDCHAPTER4CRITERIAImpl cdchapter4CRITERIA = new CDCHAPTER4CRITERIAImpl();
		return cdchapter4CRITERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCHAPTER4DOCUMENTSEQAPPENDIX createCDCHAPTER4DOCUMENTSEQAPPENDIX() {
		CDCHAPTER4DOCUMENTSEQAPPENDIXImpl cdchapter4DOCUMENTSEQAPPENDIX = new CDCHAPTER4DOCUMENTSEQAPPENDIXImpl();
		return cdchapter4DOCUMENTSEQAPPENDIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCHAPTER4FORMALINTERPRETATION createCDCHAPTER4FORMALINTERPRETATION() {
		CDCHAPTER4FORMALINTERPRETATIONImpl cdchapter4FORMALINTERPRETATION = new CDCHAPTER4FORMALINTERPRETATIONImpl();
		return cdchapter4FORMALINTERPRETATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCHAPTER4PARAGRAPH createCDCHAPTER4PARAGRAPH() {
		CDCHAPTER4PARAGRAPHImpl cdchapter4PARAGRAPH = new CDCHAPTER4PARAGRAPHImpl();
		return cdchapter4PARAGRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCHAPTER4VERSE createCDCHAPTER4VERSE() {
		CDCHAPTER4VERSEImpl cdchapter4VERSE = new CDCHAPTER4VERSEImpl();
		return cdchapter4VERSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCHAPTER4VERSESEQAPPENDIX createCDCHAPTER4VERSESEQAPPENDIX() {
		CDCHAPTER4VERSESEQAPPENDIXImpl cdchapter4VERSESEQAPPENDIX = new CDCHAPTER4VERSESEQAPPENDIXImpl();
		return cdchapter4VERSESEQAPPENDIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCIVILSTATE createCDCIVILSTATE() {
		CDCIVILSTATEImpl cdcivilstate = new CDCIVILSTATEImpl();
		return cdcivilstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCLINICAL createCDCLINICAL() {
		CDCLINICALImpl cdclinical = new CDCLINICALImpl();
		return cdclinical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCLINICALPLAN createCDCLINICALPLAN() {
		CDCLINICALPLANImpl cdclinicalplan = new CDCLINICALPLANImpl();
		return cdclinicalplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCONSENT createCDCONSENT() {
		CDCONSENTImpl cdconsent = new CDCONSENTImpl();
		return cdconsent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCONTACTPERSON createCDCONTACTPERSON() {
		CDCONTACTPERSONImpl cdcontactperson = new CDCONTACTPERSONImpl();
		return cdcontactperson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCONTENT createCDCONTENT() {
		CDCONTENTImpl cdcontent = new CDCONTENTImpl();
		return cdcontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCOUNTRY createCDCOUNTRY() {
		CDCOUNTRYImpl cdcountry = new CDCOUNTRYImpl();
		return cdcountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDCURRENCY createCDCURRENCY() {
		CDCURRENCYImpl cdcurrency = new CDCURRENCYImpl();
		return cdcurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDDAYPERIOD createCDDAYPERIOD() {
		CDDAYPERIODImpl cddayperiod = new CDDAYPERIODImpl();
		return cddayperiod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDDISCHARGETYPE createCDDISCHARGETYPE() {
		CDDISCHARGETYPEImpl cddischargetype = new CDDISCHARGETYPEImpl();
		return cddischargetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDDRUGCNK createCDDRUGCNK() {
		CDDRUGCNKImpl cddrugcnk = new CDDRUGCNKImpl();
		return cddrugcnk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDDRUGPRESENTATION createCDDRUGPRESENTATION() {
		CDDRUGPRESENTATIONImpl cddrugpresentation = new CDDRUGPRESENTATIONImpl();
		return cddrugpresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDDRUGROUTE createCDDRUGROUTE() {
		CDDRUGROUTEImpl cddrugroute = new CDDRUGROUTEImpl();
		return cddrugroute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDEBIRTHARTIFICIALRESPIRATIONTYPE createCDEBIRTHARTIFICIALRESPIRATIONTYPE() {
		CDEBIRTHARTIFICIALRESPIRATIONTYPEImpl cdebirthartificialrespirationtype = new CDEBIRTHARTIFICIALRESPIRATIONTYPEImpl();
		return cdebirthartificialrespirationtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDEBIRTHCAESAREANINDICATION createCDEBIRTHCAESAREANINDICATION() {
		CDEBIRTHCAESAREANINDICATIONImpl cdebirthcaesareanindication = new CDEBIRTHCAESAREANINDICATIONImpl();
		return cdebirthcaesareanindication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDEBIRTHCHILDPOSITION createCDEBIRTHCHILDPOSITION() {
		CDEBIRTHCHILDPOSITIONImpl cdebirthchildposition = new CDEBIRTHCHILDPOSITIONImpl();
		return cdebirthchildposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDEBIRTHCONGENITALMALFORMATION createCDEBIRTHCONGENITALMALFORMATION() {
		CDEBIRTHCONGENITALMALFORMATIONImpl cdebirthcongenitalmalformation = new CDEBIRTHCONGENITALMALFORMATIONImpl();
		return cdebirthcongenitalmalformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDEBIRTHDELIVERYWAY createCDEBIRTHDELIVERYWAY() {
		CDEBIRTHDELIVERYWAYImpl cdebirthdeliveryway = new CDEBIRTHDELIVERYWAYImpl();
		return cdebirthdeliveryway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDEBIRTHFOETALMONITORING createCDEBIRTHFOETALMONITORING() {
		CDEBIRTHFOETALMONITORINGImpl cdebirthfoetalmonitoring = new CDEBIRTHFOETALMONITORINGImpl();
		return cdebirthfoetalmonitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDEBIRTHNEONATALDEPTTYPE createCDEBIRTHNEONATALDEPTTYPE() {
		CDEBIRTHNEONATALDEPTTYPEImpl cdebirthneonataldepttype = new CDEBIRTHNEONATALDEPTTYPEImpl();
		return cdebirthneonataldepttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDEBIRTHPLACE createCDEBIRTHPLACE() {
		CDEBIRTHPLACEImpl cdebirthplace = new CDEBIRTHPLACEImpl();
		return cdebirthplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDEBIRTHPREGNANCYORIGIN createCDEBIRTHPREGNANCYORIGIN() {
		CDEBIRTHPREGNANCYORIGINImpl cdebirthpregnancyorigin = new CDEBIRTHPREGNANCYORIGINImpl();
		return cdebirthpregnancyorigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDEBIRTHSPECIALVALUES createCDEBIRTHSPECIALVALUES() {
		CDEBIRTHSPECIALVALUESImpl cdebirthspecialvalues = new CDEBIRTHSPECIALVALUESImpl();
		return cdebirthspecialvalues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDECG createCDECG() {
		CDECGImpl cdecg = new CDECGImpl();
		return cdecg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDEMERGENCYEVALUATION createCDEMERGENCYEVALUATION() {
		CDEMERGENCYEVALUATIONImpl cdemergencyevaluation = new CDEMERGENCYEVALUATIONImpl();
		return cdemergencyevaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDEMPLOYMENTSITUATION createCDEMPLOYMENTSITUATION() {
		CDEMPLOYMENTSITUATIONImpl cdemploymentsituation = new CDEMPLOYMENTSITUATIONImpl();
		return cdemploymentsituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDENCOUNTER createCDENCOUNTER() {
		CDENCOUNTERImpl cdencounter = new CDENCOUNTERImpl();
		return cdencounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDENCOUNTERSAFETYISSUE createCDENCOUNTERSAFETYISSUE() {
		CDENCOUNTERSAFETYISSUEImpl cdencountersafetyissue = new CDENCOUNTERSAFETYISSUEImpl();
		return cdencountersafetyissue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDENCRYPTIONACTOR createCDENCRYPTIONACTOR() {
		CDENCRYPTIONACTORImpl cdencryptionactor = new CDENCRYPTIONACTORImpl();
		return cdencryptionactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDENCRYPTIONMETHOD createCDENCRYPTIONMETHOD() {
		CDENCRYPTIONMETHODImpl cdencryptionmethod = new CDENCRYPTIONMETHODImpl();
		return cdencryptionmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDERROR createCDERROR() {
		CDERRORImpl cderror = new CDERRORImpl();
		return cderror;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDERRORMYCARENET createCDERRORMYCARENET() {
		CDERRORMYCARENETImpl cderrormycarenet = new CDERRORMYCARENETImpl();
		return cderrormycarenet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDEXTERNALSOURCE createCDEXTERNALSOURCE() {
		CDEXTERNALSOURCEImpl cdexternalsource = new CDEXTERNALSOURCEImpl();
		return cdexternalsource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDFORMULARY createCDFORMULARY() {
		CDFORMULARYImpl cdformulary = new CDFORMULARYImpl();
		return cdformulary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDGALENICFORM createCDGALENICFORM() {
		CDGALENICFORMImpl cdgalenicform = new CDGALENICFORMImpl();
		return cdgalenicform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDHCPARTY createCDHCPARTY() {
		CDHCPARTYImpl cdhcparty = new CDHCPARTYImpl();
		return cdhcparty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDHEADING createCDHEADING() {
		CDHEADINGImpl cdheading = new CDHEADINGImpl();
		return cdheading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDHEADINGREG createCDHEADINGREG() {
		CDHEADINGREGImpl cdheadingreg = new CDHEADINGREGImpl();
		return cdheadingreg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDIMPLANTATIONDEVICE createCDIMPLANTATIONDEVICE() {
		CDIMPLANTATIONDEVICEImpl cdimplantationdevice = new CDIMPLANTATIONDEVICEImpl();
		return cdimplantationdevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDIMPLANTATIONTYPE createCDIMPLANTATIONTYPE() {
		CDIMPLANTATIONTYPEImpl cdimplantationtype = new CDIMPLANTATIONTYPEImpl();
		return cdimplantationtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDINCAPACITY createCDINCAPACITY() {
		CDINCAPACITYImpl cdincapacity = new CDINCAPACITYImpl();
		return cdincapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDINCAPACITYREASON createCDINCAPACITYREASON() {
		CDINCAPACITYREASONImpl cdincapacityreason = new CDINCAPACITYREASONImpl();
		return cdincapacityreason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDINNCLUSTER createCDINNCLUSTER() {
		CDINNCLUSTERImpl cdinncluster = new CDINNCLUSTERImpl();
		return cdinncluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDITEM createCDITEM() {
		CDITEMImpl cditem = new CDITEMImpl();
		return cditem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDITEMBVT createCDITEMBVT() {
		CDITEMBVTImpl cditembvt = new CDITEMBVTImpl();
		return cditembvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDITEMCARENET createCDITEMCARENET() {
		CDITEMCARENETImpl cditemcarenet = new CDITEMCARENETImpl();
		return cditemcarenet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDITEMEBIRTH createCDITEMEBIRTH() {
		CDITEMEBIRTHImpl cditemebirth = new CDITEMEBIRTHImpl();
		return cditemebirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDITEMMAA createCDITEMMAA() {
		CDITEMMAAImpl cditemmaa = new CDITEMMAAImpl();
		return cditemmaa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDITEMMS createCDITEMMS() {
		CDITEMMSImpl cditemms = new CDITEMMSImpl();
		return cditemms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDITEMMYCARENET createCDITEMMYCARENET() {
		CDITEMMYCARENETImpl cditemmycarenet = new CDITEMMYCARENETImpl();
		return cditemmycarenet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDITEMREG createCDITEMREG() {
		CDITEMREGImpl cditemreg = new CDITEMREGImpl();
		return cditemreg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDLAB createCDLAB() {
		CDLABImpl cdlab = new CDLABImpl();
		return cdlab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDLEGALSERVICE createCDLEGALSERVICE() {
		CDLEGALSERVICEImpl cdlegalservice = new CDLEGALSERVICEImpl();
		return cdlegalservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDLIFECYCLE createCDLIFECYCLE() {
		CDLIFECYCLEImpl cdlifecycle = new CDLIFECYCLEImpl();
		return cdlifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMAACOVERAGETYPE createCDMAACOVERAGETYPE() {
		CDMAACOVERAGETYPEImpl cdmaacoveragetype = new CDMAACOVERAGETYPEImpl();
		return cdmaacoveragetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMAAREFUSALJUSTIFICATION createCDMAAREFUSALJUSTIFICATION() {
		CDMAAREFUSALJUSTIFICATIONImpl cdmaarefusaljustification = new CDMAAREFUSALJUSTIFICATIONImpl();
		return cdmaarefusaljustification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMAAREQUESTTYPE createCDMAAREQUESTTYPE() {
		CDMAAREQUESTTYPEImpl cdmaarequesttype = new CDMAAREQUESTTYPEImpl();
		return cdmaarequesttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMAARESPONSETYPE createCDMAARESPONSETYPE() {
		CDMAARESPONSETYPEImpl cdmaaresponsetype = new CDMAARESPONSETYPEImpl();
		return cdmaaresponsetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMAATYPE createCDMAATYPE() {
		CDMAATYPEImpl cdmaatype = new CDMAATYPEImpl();
		return cdmaatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMEDICATION createCDMEDICATION() {
		CDMEDICATIONImpl cdmedication = new CDMEDICATIONImpl();
		return cdmedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMESSAGE createCDMESSAGE() {
		CDMESSAGEImpl cdmessage = new CDMESSAGEImpl();
		return cdmessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMICROORGANISM createCDMICROORGANISM() {
		CDMICROORGANISMImpl cdmicroorganism = new CDMICROORGANISMImpl();
		return cdmicroorganism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMKGADMISSION createCDMKGADMISSION() {
		CDMKGADMISSIONImpl cdmkgadmission = new CDMKGADMISSIONImpl();
		return cdmkgadmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMKGDESTINATION createCDMKGDESTINATION() {
		CDMKGDESTINATIONImpl cdmkgdestination = new CDMKGDESTINATIONImpl();
		return cdmkgdestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMKGDISCHARGE createCDMKGDISCHARGE() {
		CDMKGDISCHARGEImpl cdmkgdischarge = new CDMKGDISCHARGEImpl();
		return cdmkgdischarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMKGORIGIN createCDMKGORIGIN() {
		CDMKGORIGINImpl cdmkgorigin = new CDMKGORIGINImpl();
		return cdmkgorigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMKGREFERRER createCDMKGREFERRER() {
		CDMKGREFERRERImpl cdmkgreferrer = new CDMKGREFERRERImpl();
		return cdmkgreferrer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMSADAPTATION createCDMSADAPTATION() {
		CDMSADAPTATIONImpl cdmsadaptation = new CDMSADAPTATIONImpl();
		return cdmsadaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMSMEDICATIONTYPE createCDMSMEDICATIONTYPE() {
		CDMSMEDICATIONTYPEImpl cdmsmedicationtype = new CDMSMEDICATIONTYPEImpl();
		return cdmsmedicationtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMSORIGIN createCDMSORIGIN() {
		CDMSORIGINImpl cdmsorigin = new CDMSORIGINImpl();
		return cdmsorigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMYCARENETJUSTIFICATION createCDMYCARENETJUSTIFICATION() {
		CDMYCARENETJUSTIFICATIONImpl cdmycarenetjustification = new CDMYCARENETJUSTIFICATIONImpl();
		return cdmycarenetjustification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDORTHOAPPROACH createCDORTHOAPPROACH() {
		CDORTHOAPPROACHImpl cdorthoapproach = new CDORTHOAPPROACHImpl();
		return cdorthoapproach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDORTHODIAGNOSIS createCDORTHODIAGNOSIS() {
		CDORTHODIAGNOSISImpl cdorthodiagnosis = new CDORTHODIAGNOSISImpl();
		return cdorthodiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDORTHOGRAFT createCDORTHOGRAFT() {
		CDORTHOGRAFTImpl cdorthograft = new CDORTHOGRAFTImpl();
		return cdorthograft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDORTHOINTERFACE createCDORTHOINTERFACE() {
		CDORTHOINTERFACEImpl cdorthointerface = new CDORTHOINTERFACEImpl();
		return cdorthointerface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDORTHOKNEEINSERT createCDORTHOKNEEINSERT() {
		CDORTHOKNEEINSERTImpl cdorthokneeinsert = new CDORTHOKNEEINSERTImpl();
		return cdorthokneeinsert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDORTHONAVCOM createCDORTHONAVCOM() {
		CDORTHONAVCOMImpl cdorthonavcom = new CDORTHONAVCOMImpl();
		return cdorthonavcom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDORTHOTECHREVISION createCDORTHOTECHREVISION() {
		CDORTHOTECHREVISIONImpl cdorthotechrevision = new CDORTHOTECHREVISIONImpl();
		return cdorthotechrevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDORTHOTYPE createCDORTHOTYPE() {
		CDORTHOTYPEImpl cdorthotype = new CDORTHOTYPEImpl();
		return cdorthotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDPARAMETER createCDPARAMETER() {
		CDPARAMETERImpl cdparameter = new CDPARAMETERImpl();
		return cdparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDPATIENTWILL createCDPATIENTWILL() {
		CDPATIENTWILLImpl cdpatientwill = new CDPATIENTWILLImpl();
		return cdpatientwill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDPATIENTWILLHOSP createCDPATIENTWILLHOSP() {
		CDPATIENTWILLHOSPImpl cdpatientwillhosp = new CDPATIENTWILLHOSPImpl();
		return cdpatientwillhosp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDPATIENTWILLRES createCDPATIENTWILLRES() {
		CDPATIENTWILLRESImpl cdpatientwillres = new CDPATIENTWILLRESImpl();
		return cdpatientwillres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDPERIODICITY createCDPERIODICITY() {
		CDPERIODICITYImpl cdperiodicity = new CDPERIODICITYImpl();
		return cdperiodicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDPROOF createCDPROOF() {
		CDPROOFImpl cdproof = new CDPROOFImpl();
		return cdproof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDQUANTITYPREFIX createCDQUANTITYPREFIX() {
		CDQUANTITYPREFIXImpl cdquantityprefix = new CDQUANTITYPREFIXImpl();
		return cdquantityprefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDREFSCOPE createCDREFSCOPE() {
		CDREFSCOPEImpl cdrefscope = new CDREFSCOPEImpl();
		return cdrefscope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDREIMBURSEMENTNOMENCLATURE createCDREIMBURSEMENTNOMENCLATURE() {
		CDREIMBURSEMENTNOMENCLATUREImpl cdreimbursementnomenclature = new CDREIMBURSEMENTNOMENCLATUREImpl();
		return cdreimbursementnomenclature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDREVCOMPONENT createCDREVCOMPONENT() {
		CDREVCOMPONENTImpl cdrevcomponent = new CDREVCOMPONENTImpl();
		return cdrevcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDSEVERITY createCDSEVERITY() {
		CDSEVERITYImpl cdseverity = new CDSEVERITYImpl();
		return cdseverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDSEX createCDSEX() {
		CDSEXImpl cdsex = new CDSEXImpl();
		return cdsex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDSITE createCDSITE() {
		CDSITEImpl cdsite = new CDSITEImpl();
		return cdsite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDSNOMED createCDSNOMED() {
		CDSNOMEDImpl cdsnomed = new CDSNOMEDImpl();
		return cdsnomed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDSTANDARD createCDSTANDARD() {
		CDSTANDARDImpl cdstandard = new CDSTANDARDImpl();
		return cdstandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDSTENTBRIDGETYPE createCDSTENTBRIDGETYPE() {
		CDSTENTBRIDGETYPEImpl cdstentbridgetype = new CDSTENTBRIDGETYPEImpl();
		return cdstentbridgetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDSTENTDEVICE createCDSTENTDEVICE() {
		CDSTENTDEVICEImpl cdstentdevice = new CDSTENTDEVICEImpl();
		return cdstentdevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDSTENTDOMINANCE createCDSTENTDOMINANCE() {
		CDSTENTDOMINANCEImpl cdstentdominance = new CDSTENTDOMINANCEImpl();
		return cdstentdominance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDSTENTLESIONTYPE createCDSTENTLESIONTYPE() {
		CDSTENTLESIONTYPEImpl cdstentlesiontype = new CDSTENTLESIONTYPEImpl();
		return cdstentlesiontype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDSTENTSEGMENT createCDSTENTSEGMENT() {
		CDSTENTSEGMENTImpl cdstentsegment = new CDSTENTSEGMENTImpl();
		return cdstentsegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDSUBSTANCE createCDSUBSTANCE() {
		CDSUBSTANCEImpl cdsubstance = new CDSUBSTANCEImpl();
		return cdsubstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDTECHNICAL createCDTECHNICAL() {
		CDTECHNICALImpl cdtechnical = new CDTECHNICALImpl();
		return cdtechnical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDTELECOM createCDTELECOM() {
		CDTELECOMImpl cdtelecom = new CDTELECOMImpl();
		return cdtelecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDTEMPORALITY createCDTEMPORALITY() {
		CDTEMPORALITYImpl cdtemporality = new CDTEMPORALITYImpl();
		return cdtemporality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDTHERAPEUTICLINK createCDTHERAPEUTICLINK() {
		CDTHERAPEUTICLINKImpl cdtherapeuticlink = new CDTHERAPEUTICLINKImpl();
		return cdtherapeuticlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDTIMEUNIT createCDTIMEUNIT() {
		CDTIMEUNITImpl cdtimeunit = new CDTIMEUNITImpl();
		return cdtimeunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDTRANSACTION createCDTRANSACTION() {
		CDTRANSACTIONImpl cdtransaction = new CDTRANSACTIONImpl();
		return cdtransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDTRANSACTIONCARENET createCDTRANSACTIONCARENET() {
		CDTRANSACTIONCARENETImpl cdtransactioncarenet = new CDTRANSACTIONCARENETImpl();
		return cdtransactioncarenet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDTRANSACTIONMAA createCDTRANSACTIONMAA() {
		CDTRANSACTIONMAAImpl cdtransactionmaa = new CDTRANSACTIONMAAImpl();
		return cdtransactionmaa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDTRANSACTIONMYCARENET createCDTRANSACTIONMYCARENET() {
		CDTRANSACTIONMYCARENETImpl cdtransactionmycarenet = new CDTRANSACTIONMYCARENETImpl();
		return cdtransactionmycarenet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDTRANSACTIONREG createCDTRANSACTIONREG() {
		CDTRANSACTIONREGImpl cdtransactionreg = new CDTRANSACTIONREGImpl();
		return cdtransactionreg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDTRANSACTIONTYPE createCDTRANSACTIONTYPE() {
		CDTRANSACTIONTYPEImpl cdtransactiontype = new CDTRANSACTIONTYPEImpl();
		return cdtransactiontype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDTUCOPATHOLOGYTYPE createCDTUCOPATHOLOGYTYPE() {
		CDTUCOPATHOLOGYTYPEImpl cdtucopathologytype = new CDTUCOPATHOLOGYTYPEImpl();
		return cdtucopathologytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDTUCOSTEMITYPE createCDTUCOSTEMITYPE() {
		CDTUCOSTEMITYPEImpl cdtucostemitype = new CDTUCOSTEMITYPEImpl();
		return cdtucostemitype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDUNIT createCDUNIT() {
		CDUNITImpl cdunit = new CDUNITImpl();
		return cdunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDURGENCY createCDURGENCY() {
		CDURGENCYImpl cdurgency = new CDURGENCYImpl();
		return cdurgency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDVACCINE createCDVACCINE() {
		CDVACCINEImpl cdvaccine = new CDVACCINEImpl();
		return cdvaccine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDVACCINEINDICATION createCDVACCINEINDICATION() {
		CDVACCINEINDICATIONImpl cdvaccineindication = new CDVACCINEINDICATIONImpl();
		return cdvaccineindication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDWEEKDAY createCDWEEKDAY() {
		CDWEEKDAYImpl cdweekday = new CDWEEKDAYImpl();
		return cdweekday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ICD createICD() {
		ICDImpl icd = new ICDImpl();
		return icd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ICPC createICPC() {
		ICPCImpl icpc = new ICPCImpl();
		return icpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LnkType createLnkType() {
		LnkTypeImpl lnkType = new LnkTypeImpl();
		return lnkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LOCAL createLOCAL() {
		LOCALImpl local = new LOCALImpl();
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDACCESSRIGHTschemes createCDACCESSRIGHTschemesFromString(EDataType eDataType, String initialValue) {
		CDACCESSRIGHTschemes result = CDACCESSRIGHTschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDACCESSRIGHTschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDACCESSRIGHTvalues createCDACCESSRIGHTvaluesFromString(EDataType eDataType, String initialValue) {
		CDACCESSRIGHTvalues result = CDACCESSRIGHTvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDACCESSRIGHTvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDACKNOWLEDGMENTvalues createCDACKNOWLEDGMENTvaluesFromString(EDataType eDataType, String initialValue) {
		CDACKNOWLEDGMENTvalues result = CDACKNOWLEDGMENTvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDACKNOWLEDGMENTvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDACTSNURSINGvalues createCDACTSNURSINGvaluesFromString(EDataType eDataType, String initialValue) {
		CDACTSNURSINGvalues result = CDACTSNURSINGvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDACTSNURSINGvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDADDRESSschemes createCDADDRESSschemesFromString(EDataType eDataType, String initialValue) {
		CDADDRESSschemes result = CDADDRESSschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDADDRESSschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDADDRESSvalues createCDADDRESSvaluesFromString(EDataType eDataType, String initialValue) {
		CDADDRESSvalues result = CDADDRESSvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDADDRESSvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDADMINISTRATIONUNITvalues createCDADMINISTRATIONUNITvaluesFromString(EDataType eDataType, String initialValue) {
		CDADMINISTRATIONUNITvalues result = CDADMINISTRATIONUNITvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDADMINISTRATIONUNITvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDAUTONOMYvalues createCDAUTONOMYvaluesFromString(EDataType eDataType, String initialValue) {
		CDAUTONOMYvalues result = CDAUTONOMYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDAUTONOMYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBALLONDEVICEvalues createCDBALLONDEVICEvaluesFromString(EDataType eDataType, String initialValue) {
		CDBALLONDEVICEvalues result = CDBALLONDEVICEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBALLONDEVICEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBCRDIFFERENTATIONDEGREEvalues createCDBCRDIFFERENTATIONDEGREEvaluesFromString(EDataType eDataType, String initialValue) {
		CDBCRDIFFERENTATIONDEGREEvalues result = CDBCRDIFFERENTATIONDEGREEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBCRDIFFERENTATIONDEGREEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBEARINGSURFACEvalues createCDBEARINGSURFACEvaluesFromString(EDataType eDataType, String initialValue) {
		CDBEARINGSURFACEvalues result = CDBEARINGSURFACEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBEARINGSURFACEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTAVAILABLEMATERIALSvalues createCDBVTAVAILABLEMATERIALSvaluesFromString(EDataType eDataType, String initialValue) {
		CDBVTAVAILABLEMATERIALSvalues result = CDBVTAVAILABLEMATERIALSvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTAVAILABLEMATERIALSvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTCONSERVATIONDELAYvalues createCDBVTCONSERVATIONDELAYvaluesFromString(EDataType eDataType, String initialValue) {
		CDBVTCONSERVATIONDELAYvalues result = CDBVTCONSERVATIONDELAYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTCONSERVATIONDELAYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTCONSERVATIONMODEvalues createCDBVTCONSERVATIONMODEvaluesFromString(EDataType eDataType, String initialValue) {
		CDBVTCONSERVATIONMODEvalues result = CDBVTCONSERVATIONMODEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTCONSERVATIONMODEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTLATERALITYvalues createCDBVTLATERALITYvaluesFromString(EDataType eDataType, String initialValue) {
		CDBVTLATERALITYvalues result = CDBVTLATERALITYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTLATERALITYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTPATIENTOPPOSITIONvalues createCDBVTPATIENTOPPOSITIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDBVTPATIENTOPPOSITIONvalues result = CDBVTPATIENTOPPOSITIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTPATIENTOPPOSITIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTSAMPLETYPEvalues createCDBVTSAMPLETYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDBVTSAMPLETYPEvalues result = CDBVTSAMPLETYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTSAMPLETYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTSTATUSvalues createCDBVTSTATUSvaluesFromString(EDataType eDataType, String initialValue) {
		CDBVTSTATUSvalues result = CDBVTSTATUSvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTSTATUSvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETACCIDENTTYPEvalues createCDCARENETACCIDENTTYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDCARENETACCIDENTTYPEvalues result = CDCARENETACCIDENTTYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETACCIDENTTYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETAGREEMENTTYPEvalues createCDCARENETAGREEMENTTYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDCARENETAGREEMENTTYPEvalues result = CDCARENETAGREEMENTTYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETAGREEMENTTYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETDOCUMENTvalues createCDCARENETDOCUMENTvaluesFromString(EDataType eDataType, String initialValue) {
		CDCARENETDOCUMENTvalues result = CDCARENETDOCUMENTvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETDOCUMENTvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETINSURANCYSTATUSvalues createCDCARENETINSURANCYSTATUSvaluesFromString(EDataType eDataType, String initialValue) {
		CDCARENETINSURANCYSTATUSvalues result = CDCARENETINSURANCYSTATUSvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETINSURANCYSTATUSvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETMESSAGEvalues createCDCARENETMESSAGEvaluesFromString(EDataType eDataType, String initialValue) {
		CDCARENETMESSAGEvalues result = CDCARENETMESSAGEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETMESSAGEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETMUTATIONINDICATORvalues createCDCARENETMUTATIONINDICATORvaluesFromString(EDataType eDataType, String initialValue) {
		CDCARENETMUTATIONINDICATORvalues result = CDCARENETMUTATIONINDICATORvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETMUTATIONINDICATORvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETNATIONALINSURANCEvalues createCDCARENETNATIONALINSURANCEvaluesFromString(EDataType eDataType, String initialValue) {
		CDCARENETNATIONALINSURANCEvalues result = CDCARENETNATIONALINSURANCEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETNATIONALINSURANCEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETPERSONALPARTvalues createCDCARENETPERSONALPARTvaluesFromString(EDataType eDataType, String initialValue) {
		CDCARENETPERSONALPARTvalues result = CDCARENETPERSONALPARTvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETPERSONALPARTvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETREFUSALREASONvalues createCDCARENETREFUSALREASONvaluesFromString(EDataType eDataType, String initialValue) {
		CDCARENETREFUSALREASONvalues result = CDCARENETREFUSALREASONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETREFUSALREASONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETSISCARDERRORvalues createCDCARENETSISCARDERRORvaluesFromString(EDataType eDataType, String initialValue) {
		CDCARENETSISCARDERRORvalues result = CDCARENETSISCARDERRORvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETSISCARDERRORvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETTHIRDPAYERCONTRACTvalues createCDCARENETTHIRDPAYERCONTRACTvaluesFromString(EDataType eDataType, String initialValue) {
		CDCARENETTHIRDPAYERCONTRACTvalues result = CDCARENETTHIRDPAYERCONTRACTvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETTHIRDPAYERCONTRACTvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETTYPEvalues createCDCARENETTYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDCARENETTYPEvalues result = CDCARENETTYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETTYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCAREPATHvalues createCDCAREPATHvaluesFromString(EDataType eDataType, String initialValue) {
		CDCAREPATHvalues result = CDCAREPATHvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCAREPATHvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCERTAINTYvalues createCDCERTAINTYvaluesFromString(EDataType eDataType, String initialValue) {
		CDCERTAINTYvalues result = CDCERTAINTYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCERTAINTYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCLINICALPLANvalues createCDCLINICALPLANvaluesFromString(EDataType eDataType, String initialValue) {
		CDCLINICALPLANvalues result = CDCLINICALPLANvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCLINICALPLANvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCOMPRESSIONvalues createCDCOMPRESSIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDCOMPRESSIONvalues result = CDCOMPRESSIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCOMPRESSIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCONSENTschemes createCDCONSENTschemesFromString(EDataType eDataType, String initialValue) {
		CDCONSENTschemes result = CDCONSENTschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCONSENTschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCONSENTvalues createCDCONSENTvaluesFromString(EDataType eDataType, String initialValue) {
		CDCONSENTvalues result = CDCONSENTvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCONSENTvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCONTACTPERSONvalues createCDCONTACTPERSONvaluesFromString(EDataType eDataType, String initialValue) {
		CDCONTACTPERSONvalues result = CDCONTACTPERSONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCONTACTPERSONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCONTENTschemes createCDCONTENTschemesFromString(EDataType eDataType, String initialValue) {
		CDCONTENTschemes result = CDCONTENTschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCONTENTschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCOUNTRYschemes createCDCOUNTRYschemesFromString(EDataType eDataType, String initialValue) {
		CDCOUNTRYschemes result = CDCOUNTRYschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCOUNTRYschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCOUNTRYvalues createCDCOUNTRYvaluesFromString(EDataType eDataType, String initialValue) {
		CDCOUNTRYvalues result = CDCOUNTRYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCOUNTRYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCURRENCYvalues createCDCURRENCYvaluesFromString(EDataType eDataType, String initialValue) {
		CDCURRENCYvalues result = CDCURRENCYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCURRENCYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDDAYPERIODvalues createCDDAYPERIODvaluesFromString(EDataType eDataType, String initialValue) {
		CDDAYPERIODvalues result = CDDAYPERIODvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDDAYPERIODvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDDISCHARGETYPEvalues createCDDISCHARGETYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDDISCHARGETYPEvalues result = CDDISCHARGETYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDDISCHARGETYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDDRUGCNKschemes createCDDRUGCNKschemesFromString(EDataType eDataType, String initialValue) {
		CDDRUGCNKschemes result = CDDRUGCNKschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDDRUGCNKschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues createCDEBIRTHARTIFICIALRESPIRATIONTYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues result = CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHARTIFICIALRESPIRATIONTYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHCAESAREANINDICATIONvalues createCDEBIRTHCAESAREANINDICATIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDEBIRTHCAESAREANINDICATIONvalues result = CDEBIRTHCAESAREANINDICATIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHCAESAREANINDICATIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHCHILDPOSITIONvalues createCDEBIRTHCHILDPOSITIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDEBIRTHCHILDPOSITIONvalues result = CDEBIRTHCHILDPOSITIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHCHILDPOSITIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHCONGENITALMALFORMATIONvalues createCDEBIRTHCONGENITALMALFORMATIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDEBIRTHCONGENITALMALFORMATIONvalues result = CDEBIRTHCONGENITALMALFORMATIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHCONGENITALMALFORMATIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHDELIVERYWAYvalues createCDEBIRTHDELIVERYWAYvaluesFromString(EDataType eDataType, String initialValue) {
		CDEBIRTHDELIVERYWAYvalues result = CDEBIRTHDELIVERYWAYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHDELIVERYWAYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHFOETALMONITORINGvalues createCDEBIRTHFOETALMONITORINGvaluesFromString(EDataType eDataType, String initialValue) {
		CDEBIRTHFOETALMONITORINGvalues result = CDEBIRTHFOETALMONITORINGvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHFOETALMONITORINGvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHNEONATALDEPTTYPEvalues createCDEBIRTHNEONATALDEPTTYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDEBIRTHNEONATALDEPTTYPEvalues result = CDEBIRTHNEONATALDEPTTYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHNEONATALDEPTTYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHPLACEvalues createCDEBIRTHPLACEvaluesFromString(EDataType eDataType, String initialValue) {
		CDEBIRTHPLACEvalues result = CDEBIRTHPLACEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHPLACEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHPREGNANCYORIGINvalues createCDEBIRTHPREGNANCYORIGINvaluesFromString(EDataType eDataType, String initialValue) {
		CDEBIRTHPREGNANCYORIGINvalues result = CDEBIRTHPREGNANCYORIGINvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHPREGNANCYORIGINvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHSPECIALVALUESvalues createCDEBIRTHSPECIALVALUESvaluesFromString(EDataType eDataType, String initialValue) {
		CDEBIRTHSPECIALVALUESvalues result = CDEBIRTHSPECIALVALUESvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHSPECIALVALUESvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDECGvalues createCDECGvaluesFromString(EDataType eDataType, String initialValue) {
		CDECGvalues result = CDECGvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDECGvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEMERGENCYEVALUATIONvalues createCDEMERGENCYEVALUATIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDEMERGENCYEVALUATIONvalues result = CDEMERGENCYEVALUATIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEMERGENCYEVALUATIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEMPLOYMENTSITUATIONvalues createCDEMPLOYMENTSITUATIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDEMPLOYMENTSITUATIONvalues result = CDEMPLOYMENTSITUATIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEMPLOYMENTSITUATIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDENCODINGvalues createCDENCODINGvaluesFromString(EDataType eDataType, String initialValue) {
		CDENCODINGvalues result = CDENCODINGvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDENCODINGvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDENCOUNTERSAFETYISSUEvalues createCDENCOUNTERSAFETYISSUEvaluesFromString(EDataType eDataType, String initialValue) {
		CDENCOUNTERSAFETYISSUEvalues result = CDENCOUNTERSAFETYISSUEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDENCOUNTERSAFETYISSUEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDENCOUNTERvalues createCDENCOUNTERvaluesFromString(EDataType eDataType, String initialValue) {
		CDENCOUNTERvalues result = CDENCOUNTERvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDENCOUNTERvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDENCRYPTIONACTORvalues createCDENCRYPTIONACTORvaluesFromString(EDataType eDataType, String initialValue) {
		CDENCRYPTIONACTORvalues result = CDENCRYPTIONACTORvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDENCRYPTIONACTORvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDENCRYPTIONMETHODschemes createCDENCRYPTIONMETHODschemesFromString(EDataType eDataType, String initialValue) {
		CDENCRYPTIONMETHODschemes result = CDENCRYPTIONMETHODschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDENCRYPTIONMETHODschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDENCRYPTIONMETHODvalues createCDENCRYPTIONMETHODvaluesFromString(EDataType eDataType, String initialValue) {
		CDENCRYPTIONMETHODvalues result = CDENCRYPTIONMETHODvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDENCRYPTIONMETHODvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDERRORMYCARENETschemes createCDERRORMYCARENETschemesFromString(EDataType eDataType, String initialValue) {
		CDERRORMYCARENETschemes result = CDERRORMYCARENETschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDERRORMYCARENETschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDERRORschemes createCDERRORschemesFromString(EDataType eDataType, String initialValue) {
		CDERRORschemes result = CDERRORschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDERRORschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEXTERNALSOURCEschemes createCDEXTERNALSOURCEschemesFromString(EDataType eDataType, String initialValue) {
		CDEXTERNALSOURCEschemes result = CDEXTERNALSOURCEschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEXTERNALSOURCEschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDFEDCOUNTRYvalues createCDFEDCOUNTRYvaluesFromString(EDataType eDataType, String initialValue) {
		CDFEDCOUNTRYvalues result = CDFEDCOUNTRYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDFEDCOUNTRYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDFORMULARYschemes createCDFORMULARYschemesFromString(EDataType eDataType, String initialValue) {
		CDFORMULARYschemes result = CDFORMULARYschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDFORMULARYschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDGALENICFORMschemes createCDGALENICFORMschemesFromString(EDataType eDataType, String initialValue) {
		CDGALENICFORMschemes result = CDGALENICFORMschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDGALENICFORMschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDHCPARTYschemes createCDHCPARTYschemesFromString(EDataType eDataType, String initialValue) {
		CDHCPARTYschemes result = CDHCPARTYschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDHCPARTYschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDHCPARTYvalues createCDHCPARTYvaluesFromString(EDataType eDataType, String initialValue) {
		CDHCPARTYvalues result = CDHCPARTYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDHCPARTYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDHEADINGREGvalues createCDHEADINGREGvaluesFromString(EDataType eDataType, String initialValue) {
		CDHEADINGREGvalues result = CDHEADINGREGvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDHEADINGREGvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDHEADINGschemes createCDHEADINGschemesFromString(EDataType eDataType, String initialValue) {
		CDHEADINGschemes result = CDHEADINGschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDHEADINGschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDHEADINGvalues createCDHEADINGvaluesFromString(EDataType eDataType, String initialValue) {
		CDHEADINGvalues result = CDHEADINGvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDHEADINGvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDIMPLANTATIONDEVICEvalues createCDIMPLANTATIONDEVICEvaluesFromString(EDataType eDataType, String initialValue) {
		CDIMPLANTATIONDEVICEvalues result = CDIMPLANTATIONDEVICEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDIMPLANTATIONDEVICEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDIMPLANTATIONTYPEvalues createCDIMPLANTATIONTYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDIMPLANTATIONTYPEvalues result = CDIMPLANTATIONTYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDIMPLANTATIONTYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDINCAPACITYREASONvalues createCDINCAPACITYREASONvaluesFromString(EDataType eDataType, String initialValue) {
		CDINCAPACITYREASONvalues result = CDINCAPACITYREASONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDINCAPACITYREASONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDINCAPACITYvalues createCDINCAPACITYvaluesFromString(EDataType eDataType, String initialValue) {
		CDINCAPACITYvalues result = CDINCAPACITYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDINCAPACITYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDINNCLUSTERschemes createCDINNCLUSTERschemesFromString(EDataType eDataType, String initialValue) {
		CDINNCLUSTERschemes result = CDINNCLUSTERschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDINNCLUSTERschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMBVTvalues createCDITEMBVTvaluesFromString(EDataType eDataType, String initialValue) {
		CDITEMBVTvalues result = CDITEMBVTvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMBVTvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMCARENETvalues createCDITEMCARENETvaluesFromString(EDataType eDataType, String initialValue) {
		CDITEMCARENETvalues result = CDITEMCARENETvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMCARENETvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMEBIRTHvalues createCDITEMEBIRTHvaluesFromString(EDataType eDataType, String initialValue) {
		CDITEMEBIRTHvalues result = CDITEMEBIRTHvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMEBIRTHvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMMAAvalues createCDITEMMAAvaluesFromString(EDataType eDataType, String initialValue) {
		CDITEMMAAvalues result = CDITEMMAAvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMMAAvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMMSvalues createCDITEMMSvaluesFromString(EDataType eDataType, String initialValue) {
		CDITEMMSvalues result = CDITEMMSvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMMSvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMMYCARENETvalues createCDITEMMYCARENETvaluesFromString(EDataType eDataType, String initialValue) {
		CDITEMMYCARENETvalues result = CDITEMMYCARENETvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMMYCARENETvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMREGvalues createCDITEMREGvaluesFromString(EDataType eDataType, String initialValue) {
		CDITEMREGvalues result = CDITEMREGvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMREGvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMschemes createCDITEMschemesFromString(EDataType eDataType, String initialValue) {
		CDITEMschemes result = CDITEMschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMvalues createCDITEMvaluesFromString(EDataType eDataType, String initialValue) {
		CDITEMvalues result = CDITEMvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDLEGALSERVICEvalues createCDLEGALSERVICEvaluesFromString(EDataType eDataType, String initialValue) {
		CDLEGALSERVICEvalues result = CDLEGALSERVICEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDLEGALSERVICEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDLIFECYCLEvalues createCDLIFECYCLEvaluesFromString(EDataType eDataType, String initialValue) {
		CDLIFECYCLEvalues result = CDLIFECYCLEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDLIFECYCLEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDLNKvalues createCDLNKvaluesFromString(EDataType eDataType, String initialValue) {
		CDLNKvalues result = CDLNKvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDLNKvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMAACOVERAGETYPEvalues createCDMAACOVERAGETYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDMAACOVERAGETYPEvalues result = CDMAACOVERAGETYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMAACOVERAGETYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMAAREFUSALJUSTIFICATIONvalues createCDMAAREFUSALJUSTIFICATIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDMAAREFUSALJUSTIFICATIONvalues result = CDMAAREFUSALJUSTIFICATIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMAAREFUSALJUSTIFICATIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMAAREQUESTTYPEvalues createCDMAAREQUESTTYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDMAAREQUESTTYPEvalues result = CDMAAREQUESTTYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMAAREQUESTTYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMAARESPONSETYPEvalues createCDMAARESPONSETYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDMAARESPONSETYPEvalues result = CDMAARESPONSETYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMAARESPONSETYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMAATYPEvalues createCDMAATYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDMAATYPEvalues result = CDMAATYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMAATYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMEDIATYPEvalues createCDMEDIATYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDMEDIATYPEvalues result = CDMEDIATYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMEDIATYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMEDICATIONschemes createCDMEDICATIONschemesFromString(EDataType eDataType, String initialValue) {
		CDMEDICATIONschemes result = CDMEDICATIONschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMEDICATIONschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMESSAGEvalues createCDMESSAGEvaluesFromString(EDataType eDataType, String initialValue) {
		CDMESSAGEvalues result = CDMESSAGEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMESSAGEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMICROORGANISMvalues createCDMICROORGANISMvaluesFromString(EDataType eDataType, String initialValue) {
		CDMICROORGANISMvalues result = CDMICROORGANISMvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMICROORGANISMvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMKGADMISSIONvalues createCDMKGADMISSIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDMKGADMISSIONvalues result = CDMKGADMISSIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMKGADMISSIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMKGDESTINATIONvalues createCDMKGDESTINATIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDMKGDESTINATIONvalues result = CDMKGDESTINATIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMKGDESTINATIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMKGDISCHARGEvalues createCDMKGDISCHARGEvaluesFromString(EDataType eDataType, String initialValue) {
		CDMKGDISCHARGEvalues result = CDMKGDISCHARGEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMKGDISCHARGEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMKGORIGINvalues createCDMKGORIGINvaluesFromString(EDataType eDataType, String initialValue) {
		CDMKGORIGINvalues result = CDMKGORIGINvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMKGORIGINvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMKGREFERRERvalues createCDMKGREFERRERvaluesFromString(EDataType eDataType, String initialValue) {
		CDMKGREFERRERvalues result = CDMKGREFERRERvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMKGREFERRERvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMSADAPTATIONvalues createCDMSADAPTATIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDMSADAPTATIONvalues result = CDMSADAPTATIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMSADAPTATIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMSMEDICATIONTYPEvalues createCDMSMEDICATIONTYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDMSMEDICATIONTYPEvalues result = CDMSMEDICATIONTYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMSMEDICATIONTYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMSORIGINvalues createCDMSORIGINvaluesFromString(EDataType eDataType, String initialValue) {
		CDMSORIGINvalues result = CDMSORIGINvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMSORIGINvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHOAPPROACHvalues createCDORTHOAPPROACHvaluesFromString(EDataType eDataType, String initialValue) {
		CDORTHOAPPROACHvalues result = CDORTHOAPPROACHvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHOAPPROACHvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHODIAGNOSISvalues createCDORTHODIAGNOSISvaluesFromString(EDataType eDataType, String initialValue) {
		CDORTHODIAGNOSISvalues result = CDORTHODIAGNOSISvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHODIAGNOSISvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHOGRAFTvalues createCDORTHOGRAFTvaluesFromString(EDataType eDataType, String initialValue) {
		CDORTHOGRAFTvalues result = CDORTHOGRAFTvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHOGRAFTvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHOINTERFACEvalues createCDORTHOINTERFACEvaluesFromString(EDataType eDataType, String initialValue) {
		CDORTHOINTERFACEvalues result = CDORTHOINTERFACEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHOINTERFACEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHOKNEEINSERTvalues createCDORTHOKNEEINSERTvaluesFromString(EDataType eDataType, String initialValue) {
		CDORTHOKNEEINSERTvalues result = CDORTHOKNEEINSERTvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHOKNEEINSERTvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHONAVCOMvalues createCDORTHONAVCOMvaluesFromString(EDataType eDataType, String initialValue) {
		CDORTHONAVCOMvalues result = CDORTHONAVCOMvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHONAVCOMvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHOTECHREVISIONvalues createCDORTHOTECHREVISIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDORTHOTECHREVISIONvalues result = CDORTHOTECHREVISIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHOTECHREVISIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHOTYPEvalues createCDORTHOTYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDORTHOTYPEvalues result = CDORTHOTYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHOTYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDPARAMETERvalues createCDPARAMETERvaluesFromString(EDataType eDataType, String initialValue) {
		CDPARAMETERvalues result = CDPARAMETERvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDPARAMETERvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDPATIENTWILLHOSPvalues createCDPATIENTWILLHOSPvaluesFromString(EDataType eDataType, String initialValue) {
		CDPATIENTWILLHOSPvalues result = CDPATIENTWILLHOSPvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDPATIENTWILLHOSPvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDPATIENTWILLRESvalues createCDPATIENTWILLRESvaluesFromString(EDataType eDataType, String initialValue) {
		CDPATIENTWILLRESvalues result = CDPATIENTWILLRESvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDPATIENTWILLRESvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDPATIENTWILLvalues createCDPATIENTWILLvaluesFromString(EDataType eDataType, String initialValue) {
		CDPATIENTWILLvalues result = CDPATIENTWILLvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDPATIENTWILLvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDPROOFschemes createCDPROOFschemesFromString(EDataType eDataType, String initialValue) {
		CDPROOFschemes result = CDPROOFschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDPROOFschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDQUANTITYPREFIXvalues createCDQUANTITYPREFIXvaluesFromString(EDataType eDataType, String initialValue) {
		CDQUANTITYPREFIXvalues result = CDQUANTITYPREFIXvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDQUANTITYPREFIXvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDREFSCOPEvalues createCDREFSCOPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDREFSCOPEvalues result = CDREFSCOPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDREFSCOPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDREVCOMPONENTvalues createCDREVCOMPONENTvaluesFromString(EDataType eDataType, String initialValue) {
		CDREVCOMPONENTvalues result = CDREVCOMPONENTvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDREVCOMPONENTvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSEVERITYschemes createCDSEVERITYschemesFromString(EDataType eDataType, String initialValue) {
		CDSEVERITYschemes result = CDSEVERITYschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSEVERITYschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSEVERITYvalues createCDSEVERITYvaluesFromString(EDataType eDataType, String initialValue) {
		CDSEVERITYvalues result = CDSEVERITYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSEVERITYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSEXvalues createCDSEXvaluesFromString(EDataType eDataType, String initialValue) {
		CDSEXvalues result = CDSEXvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSEXvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSITEschemes createCDSITEschemesFromString(EDataType eDataType, String initialValue) {
		CDSITEschemes result = CDSITEschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSITEschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSITEvalues createCDSITEvaluesFromString(EDataType eDataType, String initialValue) {
		CDSITEvalues result = CDSITEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSITEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSTANDARDvalues createCDSTANDARDvaluesFromString(EDataType eDataType, String initialValue) {
		CDSTANDARDvalues result = CDSTANDARDvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSTANDARDvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSTENTBRIDGETYPEvalues createCDSTENTBRIDGETYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDSTENTBRIDGETYPEvalues result = CDSTENTBRIDGETYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSTENTBRIDGETYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSTENTDEVICEvalues createCDSTENTDEVICEvaluesFromString(EDataType eDataType, String initialValue) {
		CDSTENTDEVICEvalues result = CDSTENTDEVICEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSTENTDEVICEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSTENTDOMINANCEvalues createCDSTENTDOMINANCEvaluesFromString(EDataType eDataType, String initialValue) {
		CDSTENTDOMINANCEvalues result = CDSTENTDOMINANCEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSTENTDOMINANCEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSTENTLESIONTYPEvalues createCDSTENTLESIONTYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDSTENTLESIONTYPEvalues result = CDSTENTLESIONTYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSTENTLESIONTYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSTENTSEGMENTvalues createCDSTENTSEGMENTvaluesFromString(EDataType eDataType, String initialValue) {
		CDSTENTSEGMENTvalues result = CDSTENTSEGMENTvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSTENTSEGMENTvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSUBSTANCEschemes createCDSUBSTANCEschemesFromString(EDataType eDataType, String initialValue) {
		CDSUBSTANCEschemes result = CDSUBSTANCEschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSUBSTANCEschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTELECOMschemes createCDTELECOMschemesFromString(EDataType eDataType, String initialValue) {
		CDTELECOMschemes result = CDTELECOMschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTELECOMschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTELECOMvalues createCDTELECOMvaluesFromString(EDataType eDataType, String initialValue) {
		CDTELECOMvalues result = CDTELECOMvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTELECOMvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTEMPORALITYvalues createCDTEMPORALITYvaluesFromString(EDataType eDataType, String initialValue) {
		CDTEMPORALITYvalues result = CDTEMPORALITYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTEMPORALITYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTHERAPEUTICLINKschemes createCDTHERAPEUTICLINKschemesFromString(EDataType eDataType, String initialValue) {
		CDTHERAPEUTICLINKschemes result = CDTHERAPEUTICLINKschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTHERAPEUTICLINKschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTIMEUNITschemes createCDTIMEUNITschemesFromString(EDataType eDataType, String initialValue) {
		CDTIMEUNITschemes result = CDTIMEUNITschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTIMEUNITschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTIMEUNITvalues createCDTIMEUNITvaluesFromString(EDataType eDataType, String initialValue) {
		CDTIMEUNITvalues result = CDTIMEUNITvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTIMEUNITvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONCARENETvalues createCDTRANSACTIONCARENETvaluesFromString(EDataType eDataType, String initialValue) {
		CDTRANSACTIONCARENETvalues result = CDTRANSACTIONCARENETvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONCARENETvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONMAAvalues createCDTRANSACTIONMAAvaluesFromString(EDataType eDataType, String initialValue) {
		CDTRANSACTIONMAAvalues result = CDTRANSACTIONMAAvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONMAAvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONMYCARENETvalues createCDTRANSACTIONMYCARENETvaluesFromString(EDataType eDataType, String initialValue) {
		CDTRANSACTIONMYCARENETvalues result = CDTRANSACTIONMYCARENETvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONMYCARENETvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONREGvalues createCDTRANSACTIONREGvaluesFromString(EDataType eDataType, String initialValue) {
		CDTRANSACTIONREGvalues result = CDTRANSACTIONREGvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONREGvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONschemes createCDTRANSACTIONschemesFromString(EDataType eDataType, String initialValue) {
		CDTRANSACTIONschemes result = CDTRANSACTIONschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONTYPEvalues createCDTRANSACTIONTYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDTRANSACTIONTYPEvalues result = CDTRANSACTIONTYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONTYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONvalues createCDTRANSACTIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDTRANSACTIONvalues result = CDTRANSACTIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTUCOPATHOLOGYTYPEvalues createCDTUCOPATHOLOGYTYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDTUCOPATHOLOGYTYPEvalues result = CDTUCOPATHOLOGYTYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTUCOPATHOLOGYTYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTUCOSTEMITYPEvalues createCDTUCOSTEMITYPEvaluesFromString(EDataType eDataType, String initialValue) {
		CDTUCOSTEMITYPEvalues result = CDTUCOSTEMITYPEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTUCOSTEMITYPEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDUNITschemes createCDUNITschemesFromString(EDataType eDataType, String initialValue) {
		CDUNITschemes result = CDUNITschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDUNITschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDUNITvalues createCDUNITvaluesFromString(EDataType eDataType, String initialValue) {
		CDUNITvalues result = CDUNITvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDUNITvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDURGENCYvalues createCDURGENCYvaluesFromString(EDataType eDataType, String initialValue) {
		CDURGENCYvalues result = CDURGENCYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDURGENCYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDVACCINEINDICATIONvalues createCDVACCINEINDICATIONvaluesFromString(EDataType eDataType, String initialValue) {
		CDVACCINEINDICATIONvalues result = CDVACCINEINDICATIONvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDVACCINEINDICATIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDVACCINEvalues createCDVACCINEvaluesFromString(EDataType eDataType, String initialValue) {
		CDVACCINEvalues result = CDVACCINEvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDVACCINEvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDWEEKDAYvalues createCDWEEKDAYvaluesFromString(EDataType eDataType, String initialValue) {
		CDWEEKDAYvalues result = CDWEEKDAYvalues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDWEEKDAYvaluesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDACCESSRIGHTschemes createCDACCESSRIGHTschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDACCESSRIGHTschemesFromString(CdPackage.eINSTANCE.getCDACCESSRIGHTschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDACCESSRIGHTschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDACCESSRIGHTschemesToString(CdPackage.eINSTANCE.getCDACCESSRIGHTschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDACCESSRIGHTvalues createCDACCESSRIGHTvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDACCESSRIGHTvaluesFromString(CdPackage.eINSTANCE.getCDACCESSRIGHTvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDACCESSRIGHTvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDACCESSRIGHTvaluesToString(CdPackage.eINSTANCE.getCDACCESSRIGHTvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDACKNOWLEDGMENTvalues createCDACKNOWLEDGMENTvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDACKNOWLEDGMENTvaluesFromString(CdPackage.eINSTANCE.getCDACKNOWLEDGMENTvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDACKNOWLEDGMENTvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDACKNOWLEDGMENTvaluesToString(CdPackage.eINSTANCE.getCDACKNOWLEDGMENTvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDACTSNURSINGvalues createCDACTSNURSINGvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDACTSNURSINGvaluesFromString(CdPackage.eINSTANCE.getCDACTSNURSINGvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDACTSNURSINGvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDACTSNURSINGvaluesToString(CdPackage.eINSTANCE.getCDACTSNURSINGvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDADDRESSschemes createCDADDRESSschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDADDRESSschemesFromString(CdPackage.eINSTANCE.getCDADDRESSschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDADDRESSschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDADDRESSschemesToString(CdPackage.eINSTANCE.getCDADDRESSschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDADDRESSvalues createCDADDRESSvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDADDRESSvaluesFromString(CdPackage.eINSTANCE.getCDADDRESSvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDADDRESSvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDADDRESSvaluesToString(CdPackage.eINSTANCE.getCDADDRESSvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDADMINISTRATIONUNITvalues createCDADMINISTRATIONUNITvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDADMINISTRATIONUNITvaluesFromString(CdPackage.eINSTANCE.getCDADMINISTRATIONUNITvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDADMINISTRATIONUNITvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDADMINISTRATIONUNITvaluesToString(CdPackage.eINSTANCE.getCDADMINISTRATIONUNITvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDATCvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDATCvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDAUTONOMYvalues createCDAUTONOMYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDAUTONOMYvaluesFromString(CdPackage.eINSTANCE.getCDAUTONOMYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDAUTONOMYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDAUTONOMYvaluesToString(CdPackage.eINSTANCE.getCDAUTONOMYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBALLONDEVICEvalues createCDBALLONDEVICEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDBALLONDEVICEvaluesFromString(CdPackage.eINSTANCE.getCDBALLONDEVICEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBALLONDEVICEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDBALLONDEVICEvaluesToString(CdPackage.eINSTANCE.getCDBALLONDEVICEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBCRDIFFERENTATIONDEGREEvalues createCDBCRDIFFERENTATIONDEGREEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDBCRDIFFERENTATIONDEGREEvaluesFromString(CdPackage.eINSTANCE.getCDBCRDIFFERENTATIONDEGREEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBCRDIFFERENTATIONDEGREEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDBCRDIFFERENTATIONDEGREEvaluesToString(CdPackage.eINSTANCE.getCDBCRDIFFERENTATIONDEGREEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBEARINGSURFACEvalues createCDBEARINGSURFACEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDBEARINGSURFACEvaluesFromString(CdPackage.eINSTANCE.getCDBEARINGSURFACEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBEARINGSURFACEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDBEARINGSURFACEvaluesToString(CdPackage.eINSTANCE.getCDBEARINGSURFACEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTAVAILABLEMATERIALSvalues createCDBVTAVAILABLEMATERIALSvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDBVTAVAILABLEMATERIALSvaluesFromString(CdPackage.eINSTANCE.getCDBVTAVAILABLEMATERIALSvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTAVAILABLEMATERIALSvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDBVTAVAILABLEMATERIALSvaluesToString(CdPackage.eINSTANCE.getCDBVTAVAILABLEMATERIALSvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTCONSERVATIONDELAYvalues createCDBVTCONSERVATIONDELAYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDBVTCONSERVATIONDELAYvaluesFromString(CdPackage.eINSTANCE.getCDBVTCONSERVATIONDELAYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTCONSERVATIONDELAYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDBVTCONSERVATIONDELAYvaluesToString(CdPackage.eINSTANCE.getCDBVTCONSERVATIONDELAYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTCONSERVATIONMODEvalues createCDBVTCONSERVATIONMODEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDBVTCONSERVATIONMODEvaluesFromString(CdPackage.eINSTANCE.getCDBVTCONSERVATIONMODEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTCONSERVATIONMODEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDBVTCONSERVATIONMODEvaluesToString(CdPackage.eINSTANCE.getCDBVTCONSERVATIONMODEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTLATERALITYvalues createCDBVTLATERALITYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDBVTLATERALITYvaluesFromString(CdPackage.eINSTANCE.getCDBVTLATERALITYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTLATERALITYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDBVTLATERALITYvaluesToString(CdPackage.eINSTANCE.getCDBVTLATERALITYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTPATIENTOPPOSITIONvalues createCDBVTPATIENTOPPOSITIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDBVTPATIENTOPPOSITIONvaluesFromString(CdPackage.eINSTANCE.getCDBVTPATIENTOPPOSITIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTPATIENTOPPOSITIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDBVTPATIENTOPPOSITIONvaluesToString(CdPackage.eINSTANCE.getCDBVTPATIENTOPPOSITIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTSAMPLETYPEvalues createCDBVTSAMPLETYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDBVTSAMPLETYPEvaluesFromString(CdPackage.eINSTANCE.getCDBVTSAMPLETYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTSAMPLETYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDBVTSAMPLETYPEvaluesToString(CdPackage.eINSTANCE.getCDBVTSAMPLETYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDBVTSTATUSvalues createCDBVTSTATUSvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDBVTSTATUSvaluesFromString(CdPackage.eINSTANCE.getCDBVTSTATUSvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDBVTSTATUSvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDBVTSTATUSvaluesToString(CdPackage.eINSTANCE.getCDBVTSTATUSvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETACCIDENTTYPEvalues createCDCARENETACCIDENTTYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCARENETACCIDENTTYPEvaluesFromString(CdPackage.eINSTANCE.getCDCARENETACCIDENTTYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETACCIDENTTYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCARENETACCIDENTTYPEvaluesToString(CdPackage.eINSTANCE.getCDCARENETACCIDENTTYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETAGREEMENTTYPEvalues createCDCARENETAGREEMENTTYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCARENETAGREEMENTTYPEvaluesFromString(CdPackage.eINSTANCE.getCDCARENETAGREEMENTTYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETAGREEMENTTYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCARENETAGREEMENTTYPEvaluesToString(CdPackage.eINSTANCE.getCDCARENETAGREEMENTTYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETDOCUMENTvalues createCDCARENETDOCUMENTvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCARENETDOCUMENTvaluesFromString(CdPackage.eINSTANCE.getCDCARENETDOCUMENTvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETDOCUMENTvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCARENETDOCUMENTvaluesToString(CdPackage.eINSTANCE.getCDCARENETDOCUMENTvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETINSURANCYSTATUSvalues createCDCARENETINSURANCYSTATUSvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCARENETINSURANCYSTATUSvaluesFromString(CdPackage.eINSTANCE.getCDCARENETINSURANCYSTATUSvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETINSURANCYSTATUSvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCARENETINSURANCYSTATUSvaluesToString(CdPackage.eINSTANCE.getCDCARENETINSURANCYSTATUSvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETMESSAGEvalues createCDCARENETMESSAGEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCARENETMESSAGEvaluesFromString(CdPackage.eINSTANCE.getCDCARENETMESSAGEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETMESSAGEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCARENETMESSAGEvaluesToString(CdPackage.eINSTANCE.getCDCARENETMESSAGEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETMUTATIONINDICATORvalues createCDCARENETMUTATIONINDICATORvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCARENETMUTATIONINDICATORvaluesFromString(CdPackage.eINSTANCE.getCDCARENETMUTATIONINDICATORvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETMUTATIONINDICATORvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCARENETMUTATIONINDICATORvaluesToString(CdPackage.eINSTANCE.getCDCARENETMUTATIONINDICATORvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETNATIONALINSURANCEvalues createCDCARENETNATIONALINSURANCEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCARENETNATIONALINSURANCEvaluesFromString(CdPackage.eINSTANCE.getCDCARENETNATIONALINSURANCEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETNATIONALINSURANCEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCARENETNATIONALINSURANCEvaluesToString(CdPackage.eINSTANCE.getCDCARENETNATIONALINSURANCEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETPERSONALPARTvalues createCDCARENETPERSONALPARTvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCARENETPERSONALPARTvaluesFromString(CdPackage.eINSTANCE.getCDCARENETPERSONALPARTvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETPERSONALPARTvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCARENETPERSONALPARTvaluesToString(CdPackage.eINSTANCE.getCDCARENETPERSONALPARTvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETREFUSALREASONvalues createCDCARENETREFUSALREASONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCARENETREFUSALREASONvaluesFromString(CdPackage.eINSTANCE.getCDCARENETREFUSALREASONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETREFUSALREASONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCARENETREFUSALREASONvaluesToString(CdPackage.eINSTANCE.getCDCARENETREFUSALREASONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETSISCARDERRORvalues createCDCARENETSISCARDERRORvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCARENETSISCARDERRORvaluesFromString(CdPackage.eINSTANCE.getCDCARENETSISCARDERRORvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETSISCARDERRORvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCARENETSISCARDERRORvaluesToString(CdPackage.eINSTANCE.getCDCARENETSISCARDERRORvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETTHIRDPAYERCONTRACTvalues createCDCARENETTHIRDPAYERCONTRACTvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCARENETTHIRDPAYERCONTRACTvaluesFromString(CdPackage.eINSTANCE.getCDCARENETTHIRDPAYERCONTRACTvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETTHIRDPAYERCONTRACTvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCARENETTHIRDPAYERCONTRACTvaluesToString(CdPackage.eINSTANCE.getCDCARENETTHIRDPAYERCONTRACTvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCARENETTYPEvalues createCDCARENETTYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCARENETTYPEvaluesFromString(CdPackage.eINSTANCE.getCDCARENETTYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCARENETTYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCARENETTYPEvaluesToString(CdPackage.eINSTANCE.getCDCARENETTYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCAREPATHvalues createCDCAREPATHvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCAREPATHvaluesFromString(CdPackage.eINSTANCE.getCDCAREPATHvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCAREPATHvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCAREPATHvaluesToString(CdPackage.eINSTANCE.getCDCAREPATHvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCERTAINTYvalues createCDCERTAINTYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCERTAINTYvaluesFromString(CdPackage.eINSTANCE.getCDCERTAINTYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCERTAINTYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCERTAINTYvaluesToString(CdPackage.eINSTANCE.getCDCERTAINTYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDCHAPTER4CATEGORYvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCHAPTER4CATEGORYvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDCHAPTER4CRITERIAvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCHAPTER4CRITERIAvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDCHAPTER4DOCUMENTSEQAPPENDIXvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCHAPTER4DOCUMENTSEQAPPENDIXvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDCHAPTER4FORMALINTERPRETATIONvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCHAPTER4FORMALINTERPRETATIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDCHAPTER4PARAGRAPHvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCHAPTER4PARAGRAPHvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDCHAPTER4VERSESEQAPPENDIXvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCHAPTER4VERSESEQAPPENDIXvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDCHAPTER4VERSEvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCHAPTER4VERSEvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDCIVILSTATEvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCIVILSTATEvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCLINICALPLANvalues createCDCLINICALPLANvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCLINICALPLANvaluesFromString(CdPackage.eINSTANCE.getCDCLINICALPLANvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCLINICALPLANvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCLINICALPLANvaluesToString(CdPackage.eINSTANCE.getCDCLINICALPLANvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDCLINICALvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCLINICALvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCOMPRESSIONvalues createCDCOMPRESSIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCOMPRESSIONvaluesFromString(CdPackage.eINSTANCE.getCDCOMPRESSIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCOMPRESSIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCOMPRESSIONvaluesToString(CdPackage.eINSTANCE.getCDCOMPRESSIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCONSENTschemes createCDCONSENTschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCONSENTschemesFromString(CdPackage.eINSTANCE.getCDCONSENTschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCONSENTschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCONSENTschemesToString(CdPackage.eINSTANCE.getCDCONSENTschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCONSENTvalues createCDCONSENTvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCONSENTvaluesFromString(CdPackage.eINSTANCE.getCDCONSENTvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCONSENTvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCONSENTvaluesToString(CdPackage.eINSTANCE.getCDCONSENTvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCONTACTPERSONvalues createCDCONTACTPERSONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCONTACTPERSONvaluesFromString(CdPackage.eINSTANCE.getCDCONTACTPERSONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCONTACTPERSONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCONTACTPERSONvaluesToString(CdPackage.eINSTANCE.getCDCONTACTPERSONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCONTENTschemes createCDCONTENTschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCONTENTschemesFromString(CdPackage.eINSTANCE.getCDCONTENTschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCONTENTschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCONTENTschemesToString(CdPackage.eINSTANCE.getCDCONTENTschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCOUNTRYschemes createCDCOUNTRYschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCOUNTRYschemesFromString(CdPackage.eINSTANCE.getCDCOUNTRYschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCOUNTRYschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCOUNTRYschemesToString(CdPackage.eINSTANCE.getCDCOUNTRYschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCOUNTRYvalues createCDCOUNTRYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCOUNTRYvaluesFromString(CdPackage.eINSTANCE.getCDCOUNTRYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCOUNTRYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCOUNTRYvaluesToString(CdPackage.eINSTANCE.getCDCOUNTRYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDCURRENCYvalues createCDCURRENCYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDCURRENCYvaluesFromString(CdPackage.eINSTANCE.getCDCURRENCYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDCURRENCYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDCURRENCYvaluesToString(CdPackage.eINSTANCE.getCDCURRENCYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDDAYPERIODvalues createCDDAYPERIODvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDDAYPERIODvaluesFromString(CdPackage.eINSTANCE.getCDDAYPERIODvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDDAYPERIODvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDDAYPERIODvaluesToString(CdPackage.eINSTANCE.getCDDAYPERIODvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDDISCHARGETYPEvalues createCDDISCHARGETYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDDISCHARGETYPEvaluesFromString(CdPackage.eINSTANCE.getCDDISCHARGETYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDDISCHARGETYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDDISCHARGETYPEvaluesToString(CdPackage.eINSTANCE.getCDDISCHARGETYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDDRUGCNKschemes createCDDRUGCNKschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDDRUGCNKschemesFromString(CdPackage.eINSTANCE.getCDDRUGCNKschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDDRUGCNKschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDDRUGCNKschemesToString(CdPackage.eINSTANCE.getCDDRUGCNKschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDDRUGCNKvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDDRUGCNKvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDDRUGPRESENTATIONvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDDRUGPRESENTATIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDDRUGROUTEvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDDRUGROUTEvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues createCDEBIRTHARTIFICIALRESPIRATIONTYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDEBIRTHARTIFICIALRESPIRATIONTYPEvaluesFromString(CdPackage.eINSTANCE.getCDEBIRTHARTIFICIALRESPIRATIONTYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHARTIFICIALRESPIRATIONTYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDEBIRTHARTIFICIALRESPIRATIONTYPEvaluesToString(CdPackage.eINSTANCE.getCDEBIRTHARTIFICIALRESPIRATIONTYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHCAESAREANINDICATIONvalues createCDEBIRTHCAESAREANINDICATIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDEBIRTHCAESAREANINDICATIONvaluesFromString(CdPackage.eINSTANCE.getCDEBIRTHCAESAREANINDICATIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHCAESAREANINDICATIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDEBIRTHCAESAREANINDICATIONvaluesToString(CdPackage.eINSTANCE.getCDEBIRTHCAESAREANINDICATIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHCHILDPOSITIONvalues createCDEBIRTHCHILDPOSITIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDEBIRTHCHILDPOSITIONvaluesFromString(CdPackage.eINSTANCE.getCDEBIRTHCHILDPOSITIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHCHILDPOSITIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDEBIRTHCHILDPOSITIONvaluesToString(CdPackage.eINSTANCE.getCDEBIRTHCHILDPOSITIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHCONGENITALMALFORMATIONvalues createCDEBIRTHCONGENITALMALFORMATIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDEBIRTHCONGENITALMALFORMATIONvaluesFromString(CdPackage.eINSTANCE.getCDEBIRTHCONGENITALMALFORMATIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHCONGENITALMALFORMATIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDEBIRTHCONGENITALMALFORMATIONvaluesToString(CdPackage.eINSTANCE.getCDEBIRTHCONGENITALMALFORMATIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHDELIVERYWAYvalues createCDEBIRTHDELIVERYWAYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDEBIRTHDELIVERYWAYvaluesFromString(CdPackage.eINSTANCE.getCDEBIRTHDELIVERYWAYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHDELIVERYWAYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDEBIRTHDELIVERYWAYvaluesToString(CdPackage.eINSTANCE.getCDEBIRTHDELIVERYWAYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHFOETALMONITORINGvalues createCDEBIRTHFOETALMONITORINGvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDEBIRTHFOETALMONITORINGvaluesFromString(CdPackage.eINSTANCE.getCDEBIRTHFOETALMONITORINGvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHFOETALMONITORINGvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDEBIRTHFOETALMONITORINGvaluesToString(CdPackage.eINSTANCE.getCDEBIRTHFOETALMONITORINGvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHNEONATALDEPTTYPEvalues createCDEBIRTHNEONATALDEPTTYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDEBIRTHNEONATALDEPTTYPEvaluesFromString(CdPackage.eINSTANCE.getCDEBIRTHNEONATALDEPTTYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHNEONATALDEPTTYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDEBIRTHNEONATALDEPTTYPEvaluesToString(CdPackage.eINSTANCE.getCDEBIRTHNEONATALDEPTTYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHPLACEvalues createCDEBIRTHPLACEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDEBIRTHPLACEvaluesFromString(CdPackage.eINSTANCE.getCDEBIRTHPLACEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHPLACEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDEBIRTHPLACEvaluesToString(CdPackage.eINSTANCE.getCDEBIRTHPLACEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHPREGNANCYORIGINvalues createCDEBIRTHPREGNANCYORIGINvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDEBIRTHPREGNANCYORIGINvaluesFromString(CdPackage.eINSTANCE.getCDEBIRTHPREGNANCYORIGINvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHPREGNANCYORIGINvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDEBIRTHPREGNANCYORIGINvaluesToString(CdPackage.eINSTANCE.getCDEBIRTHPREGNANCYORIGINvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEBIRTHSPECIALVALUESvalues createCDEBIRTHSPECIALVALUESvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDEBIRTHSPECIALVALUESvaluesFromString(CdPackage.eINSTANCE.getCDEBIRTHSPECIALVALUESvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEBIRTHSPECIALVALUESvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDEBIRTHSPECIALVALUESvaluesToString(CdPackage.eINSTANCE.getCDEBIRTHSPECIALVALUESvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDECGvalues createCDECGvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDECGvaluesFromString(CdPackage.eINSTANCE.getCDECGvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDECGvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDECGvaluesToString(CdPackage.eINSTANCE.getCDECGvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEMERGENCYEVALUATIONvalues createCDEMERGENCYEVALUATIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDEMERGENCYEVALUATIONvaluesFromString(CdPackage.eINSTANCE.getCDEMERGENCYEVALUATIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEMERGENCYEVALUATIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDEMERGENCYEVALUATIONvaluesToString(CdPackage.eINSTANCE.getCDEMERGENCYEVALUATIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEMPLOYMENTSITUATIONvalues createCDEMPLOYMENTSITUATIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDEMPLOYMENTSITUATIONvaluesFromString(CdPackage.eINSTANCE.getCDEMPLOYMENTSITUATIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEMPLOYMENTSITUATIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDEMPLOYMENTSITUATIONvaluesToString(CdPackage.eINSTANCE.getCDEMPLOYMENTSITUATIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDENCODINGvalues createCDENCODINGvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDENCODINGvaluesFromString(CdPackage.eINSTANCE.getCDENCODINGvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDENCODINGvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDENCODINGvaluesToString(CdPackage.eINSTANCE.getCDENCODINGvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDENCOUNTERSAFETYISSUEvalues createCDENCOUNTERSAFETYISSUEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDENCOUNTERSAFETYISSUEvaluesFromString(CdPackage.eINSTANCE.getCDENCOUNTERSAFETYISSUEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDENCOUNTERSAFETYISSUEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDENCOUNTERSAFETYISSUEvaluesToString(CdPackage.eINSTANCE.getCDENCOUNTERSAFETYISSUEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDENCOUNTERvalues createCDENCOUNTERvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDENCOUNTERvaluesFromString(CdPackage.eINSTANCE.getCDENCOUNTERvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDENCOUNTERvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDENCOUNTERvaluesToString(CdPackage.eINSTANCE.getCDENCOUNTERvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDENCRYPTIONACTORvalues createCDENCRYPTIONACTORvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDENCRYPTIONACTORvaluesFromString(CdPackage.eINSTANCE.getCDENCRYPTIONACTORvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDENCRYPTIONACTORvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDENCRYPTIONACTORvaluesToString(CdPackage.eINSTANCE.getCDENCRYPTIONACTORvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDENCRYPTIONMETHODschemes createCDENCRYPTIONMETHODschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDENCRYPTIONMETHODschemesFromString(CdPackage.eINSTANCE.getCDENCRYPTIONMETHODschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDENCRYPTIONMETHODschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDENCRYPTIONMETHODschemesToString(CdPackage.eINSTANCE.getCDENCRYPTIONMETHODschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDENCRYPTIONMETHODvalues createCDENCRYPTIONMETHODvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDENCRYPTIONMETHODvaluesFromString(CdPackage.eINSTANCE.getCDENCRYPTIONMETHODvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDENCRYPTIONMETHODvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDENCRYPTIONMETHODvaluesToString(CdPackage.eINSTANCE.getCDENCRYPTIONMETHODvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDERRORMYCARENETschemes createCDERRORMYCARENETschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDERRORMYCARENETschemesFromString(CdPackage.eINSTANCE.getCDERRORMYCARENETschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDERRORMYCARENETschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDERRORMYCARENETschemesToString(CdPackage.eINSTANCE.getCDERRORMYCARENETschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDERRORschemes createCDERRORschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDERRORschemesFromString(CdPackage.eINSTANCE.getCDERRORschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDERRORschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDERRORschemesToString(CdPackage.eINSTANCE.getCDERRORschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDERRORvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDERRORvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEXTERNALSOURCEschemes createCDEXTERNALSOURCEschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDEXTERNALSOURCEschemesFromString(CdPackage.eINSTANCE.getCDEXTERNALSOURCEschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEXTERNALSOURCEschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDEXTERNALSOURCEschemesToString(CdPackage.eINSTANCE.getCDEXTERNALSOURCEschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDEXTERNALSOURCEvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDEXTERNALSOURCEvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDFEDCOUNTRYvalues createCDFEDCOUNTRYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDFEDCOUNTRYvaluesFromString(CdPackage.eINSTANCE.getCDFEDCOUNTRYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDFEDCOUNTRYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDFEDCOUNTRYvaluesToString(CdPackage.eINSTANCE.getCDFEDCOUNTRYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDFORMULARYschemes createCDFORMULARYschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDFORMULARYschemesFromString(CdPackage.eINSTANCE.getCDFORMULARYschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDFORMULARYschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDFORMULARYschemesToString(CdPackage.eINSTANCE.getCDFORMULARYschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDGALENICFORMschemes createCDGALENICFORMschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDGALENICFORMschemesFromString(CdPackage.eINSTANCE.getCDGALENICFORMschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDGALENICFORMschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDGALENICFORMschemesToString(CdPackage.eINSTANCE.getCDGALENICFORMschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDHCPARTYschemes createCDHCPARTYschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDHCPARTYschemesFromString(CdPackage.eINSTANCE.getCDHCPARTYschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDHCPARTYschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDHCPARTYschemesToString(CdPackage.eINSTANCE.getCDHCPARTYschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDHCPARTYvalues createCDHCPARTYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDHCPARTYvaluesFromString(CdPackage.eINSTANCE.getCDHCPARTYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDHCPARTYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDHCPARTYvaluesToString(CdPackage.eINSTANCE.getCDHCPARTYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDHEADINGLABvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDHEADINGLABvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDHEADINGREGvalues createCDHEADINGREGvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDHEADINGREGvaluesFromString(CdPackage.eINSTANCE.getCDHEADINGREGvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDHEADINGREGvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDHEADINGREGvaluesToString(CdPackage.eINSTANCE.getCDHEADINGREGvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDHEADINGschemes createCDHEADINGschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDHEADINGschemesFromString(CdPackage.eINSTANCE.getCDHEADINGschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDHEADINGschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDHEADINGschemesToString(CdPackage.eINSTANCE.getCDHEADINGschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDHEADINGvalues createCDHEADINGvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDHEADINGvaluesFromString(CdPackage.eINSTANCE.getCDHEADINGvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDHEADINGvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDHEADINGvaluesToString(CdPackage.eINSTANCE.getCDHEADINGvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDIMPLANTATIONDEVICEvalues createCDIMPLANTATIONDEVICEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDIMPLANTATIONDEVICEvaluesFromString(CdPackage.eINSTANCE.getCDIMPLANTATIONDEVICEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDIMPLANTATIONDEVICEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDIMPLANTATIONDEVICEvaluesToString(CdPackage.eINSTANCE.getCDIMPLANTATIONDEVICEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDIMPLANTATIONTYPEvalues createCDIMPLANTATIONTYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDIMPLANTATIONTYPEvaluesFromString(CdPackage.eINSTANCE.getCDIMPLANTATIONTYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDIMPLANTATIONTYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDIMPLANTATIONTYPEvaluesToString(CdPackage.eINSTANCE.getCDIMPLANTATIONTYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDINCAPACITYREASONvalues createCDINCAPACITYREASONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDINCAPACITYREASONvaluesFromString(CdPackage.eINSTANCE.getCDINCAPACITYREASONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDINCAPACITYREASONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDINCAPACITYREASONvaluesToString(CdPackage.eINSTANCE.getCDINCAPACITYREASONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDINCAPACITYvalues createCDINCAPACITYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDINCAPACITYvaluesFromString(CdPackage.eINSTANCE.getCDINCAPACITYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDINCAPACITYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDINCAPACITYvaluesToString(CdPackage.eINSTANCE.getCDINCAPACITYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDINNCLUSTERschemes createCDINNCLUSTERschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDINNCLUSTERschemesFromString(CdPackage.eINSTANCE.getCDINNCLUSTERschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDINNCLUSTERschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDINNCLUSTERschemesToString(CdPackage.eINSTANCE.getCDINNCLUSTERschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDINNCLUSTERvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDINNCLUSTERvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMBVTvalues createCDITEMBVTvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDITEMBVTvaluesFromString(CdPackage.eINSTANCE.getCDITEMBVTvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMBVTvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDITEMBVTvaluesToString(CdPackage.eINSTANCE.getCDITEMBVTvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMCARENETvalues createCDITEMCARENETvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDITEMCARENETvaluesFromString(CdPackage.eINSTANCE.getCDITEMCARENETvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMCARENETvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDITEMCARENETvaluesToString(CdPackage.eINSTANCE.getCDITEMCARENETvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMEBIRTHvalues createCDITEMEBIRTHvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDITEMEBIRTHvaluesFromString(CdPackage.eINSTANCE.getCDITEMEBIRTHvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMEBIRTHvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDITEMEBIRTHvaluesToString(CdPackage.eINSTANCE.getCDITEMEBIRTHvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMMAAvalues createCDITEMMAAvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDITEMMAAvaluesFromString(CdPackage.eINSTANCE.getCDITEMMAAvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMMAAvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDITEMMAAvaluesToString(CdPackage.eINSTANCE.getCDITEMMAAvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMMSvalues createCDITEMMSvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDITEMMSvaluesFromString(CdPackage.eINSTANCE.getCDITEMMSvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMMSvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDITEMMSvaluesToString(CdPackage.eINSTANCE.getCDITEMMSvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMMYCARENETvalues createCDITEMMYCARENETvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDITEMMYCARENETvaluesFromString(CdPackage.eINSTANCE.getCDITEMMYCARENETvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMMYCARENETvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDITEMMYCARENETvaluesToString(CdPackage.eINSTANCE.getCDITEMMYCARENETvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMREGvalues createCDITEMREGvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDITEMREGvaluesFromString(CdPackage.eINSTANCE.getCDITEMREGvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMREGvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDITEMREGvaluesToString(CdPackage.eINSTANCE.getCDITEMREGvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMschemes createCDITEMschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDITEMschemesFromString(CdPackage.eINSTANCE.getCDITEMschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDITEMschemesToString(CdPackage.eINSTANCE.getCDITEMschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDITEMvalues createCDITEMvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDITEMvaluesFromString(CdPackage.eINSTANCE.getCDITEMvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDITEMvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDITEMvaluesToString(CdPackage.eINSTANCE.getCDITEMvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDLABvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDLABvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDLEGALSERVICEvalues createCDLEGALSERVICEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDLEGALSERVICEvaluesFromString(CdPackage.eINSTANCE.getCDLEGALSERVICEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDLEGALSERVICEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDLEGALSERVICEvaluesToString(CdPackage.eINSTANCE.getCDLEGALSERVICEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDLIFECYCLEvalues createCDLIFECYCLEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDLIFECYCLEvaluesFromString(CdPackage.eINSTANCE.getCDLIFECYCLEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDLIFECYCLEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDLIFECYCLEvaluesToString(CdPackage.eINSTANCE.getCDLIFECYCLEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDLNKvalues createCDLNKvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDLNKvaluesFromString(CdPackage.eINSTANCE.getCDLNKvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDLNKvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDLNKvaluesToString(CdPackage.eINSTANCE.getCDLNKvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMAACOVERAGETYPEvalues createCDMAACOVERAGETYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMAACOVERAGETYPEvaluesFromString(CdPackage.eINSTANCE.getCDMAACOVERAGETYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMAACOVERAGETYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMAACOVERAGETYPEvaluesToString(CdPackage.eINSTANCE.getCDMAACOVERAGETYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMAAREFUSALJUSTIFICATIONvalues createCDMAAREFUSALJUSTIFICATIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMAAREFUSALJUSTIFICATIONvaluesFromString(CdPackage.eINSTANCE.getCDMAAREFUSALJUSTIFICATIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMAAREFUSALJUSTIFICATIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMAAREFUSALJUSTIFICATIONvaluesToString(CdPackage.eINSTANCE.getCDMAAREFUSALJUSTIFICATIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMAAREQUESTTYPEvalues createCDMAAREQUESTTYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMAAREQUESTTYPEvaluesFromString(CdPackage.eINSTANCE.getCDMAAREQUESTTYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMAAREQUESTTYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMAAREQUESTTYPEvaluesToString(CdPackage.eINSTANCE.getCDMAAREQUESTTYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMAARESPONSETYPEvalues createCDMAARESPONSETYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMAARESPONSETYPEvaluesFromString(CdPackage.eINSTANCE.getCDMAARESPONSETYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMAARESPONSETYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMAARESPONSETYPEvaluesToString(CdPackage.eINSTANCE.getCDMAARESPONSETYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMAATYPEvalues createCDMAATYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMAATYPEvaluesFromString(CdPackage.eINSTANCE.getCDMAATYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMAATYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMAATYPEvaluesToString(CdPackage.eINSTANCE.getCDMAATYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMEDIATYPEvalues createCDMEDIATYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMEDIATYPEvaluesFromString(CdPackage.eINSTANCE.getCDMEDIATYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMEDIATYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMEDIATYPEvaluesToString(CdPackage.eINSTANCE.getCDMEDIATYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMEDICATIONschemes createCDMEDICATIONschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMEDICATIONschemesFromString(CdPackage.eINSTANCE.getCDMEDICATIONschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMEDICATIONschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMEDICATIONschemesToString(CdPackage.eINSTANCE.getCDMEDICATIONschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMESSAGEvalues createCDMESSAGEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMESSAGEvaluesFromString(CdPackage.eINSTANCE.getCDMESSAGEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMESSAGEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMESSAGEvaluesToString(CdPackage.eINSTANCE.getCDMESSAGEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMICROORGANISMvalues createCDMICROORGANISMvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMICROORGANISMvaluesFromString(CdPackage.eINSTANCE.getCDMICROORGANISMvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMICROORGANISMvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMICROORGANISMvaluesToString(CdPackage.eINSTANCE.getCDMICROORGANISMvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMKGADMISSIONvalues createCDMKGADMISSIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMKGADMISSIONvaluesFromString(CdPackage.eINSTANCE.getCDMKGADMISSIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMKGADMISSIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMKGADMISSIONvaluesToString(CdPackage.eINSTANCE.getCDMKGADMISSIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMKGDESTINATIONvalues createCDMKGDESTINATIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMKGDESTINATIONvaluesFromString(CdPackage.eINSTANCE.getCDMKGDESTINATIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMKGDESTINATIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMKGDESTINATIONvaluesToString(CdPackage.eINSTANCE.getCDMKGDESTINATIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMKGDISCHARGEvalues createCDMKGDISCHARGEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMKGDISCHARGEvaluesFromString(CdPackage.eINSTANCE.getCDMKGDISCHARGEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMKGDISCHARGEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMKGDISCHARGEvaluesToString(CdPackage.eINSTANCE.getCDMKGDISCHARGEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMKGORIGINvalues createCDMKGORIGINvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMKGORIGINvaluesFromString(CdPackage.eINSTANCE.getCDMKGORIGINvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMKGORIGINvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMKGORIGINvaluesToString(CdPackage.eINSTANCE.getCDMKGORIGINvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMKGREFERRERvalues createCDMKGREFERRERvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMKGREFERRERvaluesFromString(CdPackage.eINSTANCE.getCDMKGREFERRERvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMKGREFERRERvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMKGREFERRERvaluesToString(CdPackage.eINSTANCE.getCDMKGREFERRERvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMSADAPTATIONvalues createCDMSADAPTATIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMSADAPTATIONvaluesFromString(CdPackage.eINSTANCE.getCDMSADAPTATIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMSADAPTATIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMSADAPTATIONvaluesToString(CdPackage.eINSTANCE.getCDMSADAPTATIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMSMEDICATIONTYPEvalues createCDMSMEDICATIONTYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMSMEDICATIONTYPEvaluesFromString(CdPackage.eINSTANCE.getCDMSMEDICATIONTYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMSMEDICATIONTYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMSMEDICATIONTYPEvaluesToString(CdPackage.eINSTANCE.getCDMSMEDICATIONTYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDMSORIGINvalues createCDMSORIGINvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDMSORIGINvaluesFromString(CdPackage.eINSTANCE.getCDMSORIGINvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMSORIGINvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDMSORIGINvaluesToString(CdPackage.eINSTANCE.getCDMSORIGINvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDMYCARENETJUSTIFICATIONvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDMYCARENETJUSTIFICATIONvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHOAPPROACHvalues createCDORTHOAPPROACHvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDORTHOAPPROACHvaluesFromString(CdPackage.eINSTANCE.getCDORTHOAPPROACHvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHOAPPROACHvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDORTHOAPPROACHvaluesToString(CdPackage.eINSTANCE.getCDORTHOAPPROACHvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHODIAGNOSISvalues createCDORTHODIAGNOSISvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDORTHODIAGNOSISvaluesFromString(CdPackage.eINSTANCE.getCDORTHODIAGNOSISvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHODIAGNOSISvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDORTHODIAGNOSISvaluesToString(CdPackage.eINSTANCE.getCDORTHODIAGNOSISvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHOGRAFTvalues createCDORTHOGRAFTvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDORTHOGRAFTvaluesFromString(CdPackage.eINSTANCE.getCDORTHOGRAFTvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHOGRAFTvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDORTHOGRAFTvaluesToString(CdPackage.eINSTANCE.getCDORTHOGRAFTvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHOINTERFACEvalues createCDORTHOINTERFACEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDORTHOINTERFACEvaluesFromString(CdPackage.eINSTANCE.getCDORTHOINTERFACEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHOINTERFACEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDORTHOINTERFACEvaluesToString(CdPackage.eINSTANCE.getCDORTHOINTERFACEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHOKNEEINSERTvalues createCDORTHOKNEEINSERTvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDORTHOKNEEINSERTvaluesFromString(CdPackage.eINSTANCE.getCDORTHOKNEEINSERTvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHOKNEEINSERTvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDORTHOKNEEINSERTvaluesToString(CdPackage.eINSTANCE.getCDORTHOKNEEINSERTvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHONAVCOMvalues createCDORTHONAVCOMvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDORTHONAVCOMvaluesFromString(CdPackage.eINSTANCE.getCDORTHONAVCOMvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHONAVCOMvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDORTHONAVCOMvaluesToString(CdPackage.eINSTANCE.getCDORTHONAVCOMvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHOTECHREVISIONvalues createCDORTHOTECHREVISIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDORTHOTECHREVISIONvaluesFromString(CdPackage.eINSTANCE.getCDORTHOTECHREVISIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHOTECHREVISIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDORTHOTECHREVISIONvaluesToString(CdPackage.eINSTANCE.getCDORTHOTECHREVISIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDORTHOTYPEvalues createCDORTHOTYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDORTHOTYPEvaluesFromString(CdPackage.eINSTANCE.getCDORTHOTYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDORTHOTYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDORTHOTYPEvaluesToString(CdPackage.eINSTANCE.getCDORTHOTYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDPARAMETERvalues createCDPARAMETERvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDPARAMETERvaluesFromString(CdPackage.eINSTANCE.getCDPARAMETERvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDPARAMETERvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDPARAMETERvaluesToString(CdPackage.eINSTANCE.getCDPARAMETERvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDPATIENTWILLHOSPvalues createCDPATIENTWILLHOSPvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDPATIENTWILLHOSPvaluesFromString(CdPackage.eINSTANCE.getCDPATIENTWILLHOSPvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDPATIENTWILLHOSPvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDPATIENTWILLHOSPvaluesToString(CdPackage.eINSTANCE.getCDPATIENTWILLHOSPvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDPATIENTWILLRESvalues createCDPATIENTWILLRESvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDPATIENTWILLRESvaluesFromString(CdPackage.eINSTANCE.getCDPATIENTWILLRESvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDPATIENTWILLRESvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDPATIENTWILLRESvaluesToString(CdPackage.eINSTANCE.getCDPATIENTWILLRESvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDPATIENTWILLvalues createCDPATIENTWILLvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDPATIENTWILLvaluesFromString(CdPackage.eINSTANCE.getCDPATIENTWILLvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDPATIENTWILLvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDPATIENTWILLvaluesToString(CdPackage.eINSTANCE.getCDPATIENTWILLvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDPERIODICITYvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDPERIODICITYvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDPROOFschemes createCDPROOFschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDPROOFschemesFromString(CdPackage.eINSTANCE.getCDPROOFschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDPROOFschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDPROOFschemesToString(CdPackage.eINSTANCE.getCDPROOFschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDPROOFvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDPROOFvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDQUANTITYPREFIXvalues createCDQUANTITYPREFIXvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDQUANTITYPREFIXvaluesFromString(CdPackage.eINSTANCE.getCDQUANTITYPREFIXvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDQUANTITYPREFIXvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDQUANTITYPREFIXvaluesToString(CdPackage.eINSTANCE.getCDQUANTITYPREFIXvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDREFSCOPEvalues createCDREFSCOPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDREFSCOPEvaluesFromString(CdPackage.eINSTANCE.getCDREFSCOPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDREFSCOPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDREFSCOPEvaluesToString(CdPackage.eINSTANCE.getCDREFSCOPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDREFUSALMYCARENETvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDREFUSALMYCARENETvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDREIMBURSEMENTNOMENCLATUREvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDREIMBURSEMENTNOMENCLATUREvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDREVCOMPONENTvalues createCDREVCOMPONENTvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDREVCOMPONENTvaluesFromString(CdPackage.eINSTANCE.getCDREVCOMPONENTvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDREVCOMPONENTvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDREVCOMPONENTvaluesToString(CdPackage.eINSTANCE.getCDREVCOMPONENTvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSEVERITYschemes createCDSEVERITYschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDSEVERITYschemesFromString(CdPackage.eINSTANCE.getCDSEVERITYschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSEVERITYschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDSEVERITYschemesToString(CdPackage.eINSTANCE.getCDSEVERITYschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSEVERITYvalues createCDSEVERITYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDSEVERITYvaluesFromString(CdPackage.eINSTANCE.getCDSEVERITYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSEVERITYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDSEVERITYvaluesToString(CdPackage.eINSTANCE.getCDSEVERITYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSEXvalues createCDSEXvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDSEXvaluesFromString(CdPackage.eINSTANCE.getCDSEXvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSEXvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDSEXvaluesToString(CdPackage.eINSTANCE.getCDSEXvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSITEschemes createCDSITEschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDSITEschemesFromString(CdPackage.eINSTANCE.getCDSITEschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSITEschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDSITEschemesToString(CdPackage.eINSTANCE.getCDSITEschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSITEvalues createCDSITEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDSITEvaluesFromString(CdPackage.eINSTANCE.getCDSITEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSITEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDSITEvaluesToString(CdPackage.eINSTANCE.getCDSITEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDSNOMEDvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSNOMEDvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSTANDARDvalues createCDSTANDARDvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDSTANDARDvaluesFromString(CdPackage.eINSTANCE.getCDSTANDARDvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSTANDARDvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDSTANDARDvaluesToString(CdPackage.eINSTANCE.getCDSTANDARDvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSTENTBRIDGETYPEvalues createCDSTENTBRIDGETYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDSTENTBRIDGETYPEvaluesFromString(CdPackage.eINSTANCE.getCDSTENTBRIDGETYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSTENTBRIDGETYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDSTENTBRIDGETYPEvaluesToString(CdPackage.eINSTANCE.getCDSTENTBRIDGETYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSTENTDEVICEvalues createCDSTENTDEVICEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDSTENTDEVICEvaluesFromString(CdPackage.eINSTANCE.getCDSTENTDEVICEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSTENTDEVICEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDSTENTDEVICEvaluesToString(CdPackage.eINSTANCE.getCDSTENTDEVICEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSTENTDOMINANCEvalues createCDSTENTDOMINANCEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDSTENTDOMINANCEvaluesFromString(CdPackage.eINSTANCE.getCDSTENTDOMINANCEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSTENTDOMINANCEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDSTENTDOMINANCEvaluesToString(CdPackage.eINSTANCE.getCDSTENTDOMINANCEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSTENTLESIONTYPEvalues createCDSTENTLESIONTYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDSTENTLESIONTYPEvaluesFromString(CdPackage.eINSTANCE.getCDSTENTLESIONTYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSTENTLESIONTYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDSTENTLESIONTYPEvaluesToString(CdPackage.eINSTANCE.getCDSTENTLESIONTYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSTENTSEGMENTvalues createCDSTENTSEGMENTvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDSTENTSEGMENTvaluesFromString(CdPackage.eINSTANCE.getCDSTENTSEGMENTvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSTENTSEGMENTvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDSTENTSEGMENTvaluesToString(CdPackage.eINSTANCE.getCDSTENTSEGMENTvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDSUBSTANCEschemes createCDSUBSTANCEschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDSUBSTANCEschemesFromString(CdPackage.eINSTANCE.getCDSUBSTANCEschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDSUBSTANCEschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDSUBSTANCEschemesToString(CdPackage.eINSTANCE.getCDSUBSTANCEschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDTECHNICALvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTECHNICALvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTELECOMschemes createCDTELECOMschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTELECOMschemesFromString(CdPackage.eINSTANCE.getCDTELECOMschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTELECOMschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTELECOMschemesToString(CdPackage.eINSTANCE.getCDTELECOMschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTELECOMvalues createCDTELECOMvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTELECOMvaluesFromString(CdPackage.eINSTANCE.getCDTELECOMvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTELECOMvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTELECOMvaluesToString(CdPackage.eINSTANCE.getCDTELECOMvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTEMPORALITYvalues createCDTEMPORALITYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTEMPORALITYvaluesFromString(CdPackage.eINSTANCE.getCDTEMPORALITYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTEMPORALITYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTEMPORALITYvaluesToString(CdPackage.eINSTANCE.getCDTEMPORALITYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTHERAPEUTICLINKschemes createCDTHERAPEUTICLINKschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTHERAPEUTICLINKschemesFromString(CdPackage.eINSTANCE.getCDTHERAPEUTICLINKschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTHERAPEUTICLINKschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTHERAPEUTICLINKschemesToString(CdPackage.eINSTANCE.getCDTHERAPEUTICLINKschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCDTHERAPEUTICLINKvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTHERAPEUTICLINKvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTIMEUNITschemes createCDTIMEUNITschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTIMEUNITschemesFromString(CdPackage.eINSTANCE.getCDTIMEUNITschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTIMEUNITschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTIMEUNITschemesToString(CdPackage.eINSTANCE.getCDTIMEUNITschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTIMEUNITvalues createCDTIMEUNITvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTIMEUNITvaluesFromString(CdPackage.eINSTANCE.getCDTIMEUNITvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTIMEUNITvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTIMEUNITvaluesToString(CdPackage.eINSTANCE.getCDTIMEUNITvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONCARENETvalues createCDTRANSACTIONCARENETvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTRANSACTIONCARENETvaluesFromString(CdPackage.eINSTANCE.getCDTRANSACTIONCARENETvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONCARENETvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTRANSACTIONCARENETvaluesToString(CdPackage.eINSTANCE.getCDTRANSACTIONCARENETvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONMAAvalues createCDTRANSACTIONMAAvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTRANSACTIONMAAvaluesFromString(CdPackage.eINSTANCE.getCDTRANSACTIONMAAvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONMAAvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTRANSACTIONMAAvaluesToString(CdPackage.eINSTANCE.getCDTRANSACTIONMAAvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONMYCARENETvalues createCDTRANSACTIONMYCARENETvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTRANSACTIONMYCARENETvaluesFromString(CdPackage.eINSTANCE.getCDTRANSACTIONMYCARENETvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONMYCARENETvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTRANSACTIONMYCARENETvaluesToString(CdPackage.eINSTANCE.getCDTRANSACTIONMYCARENETvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONREGvalues createCDTRANSACTIONREGvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTRANSACTIONREGvaluesFromString(CdPackage.eINSTANCE.getCDTRANSACTIONREGvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONREGvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTRANSACTIONREGvaluesToString(CdPackage.eINSTANCE.getCDTRANSACTIONREGvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONschemes createCDTRANSACTIONschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTRANSACTIONschemesFromString(CdPackage.eINSTANCE.getCDTRANSACTIONschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTRANSACTIONschemesToString(CdPackage.eINSTANCE.getCDTRANSACTIONschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONTYPEvalues createCDTRANSACTIONTYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTRANSACTIONTYPEvaluesFromString(CdPackage.eINSTANCE.getCDTRANSACTIONTYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONTYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTRANSACTIONTYPEvaluesToString(CdPackage.eINSTANCE.getCDTRANSACTIONTYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTRANSACTIONvalues createCDTRANSACTIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTRANSACTIONvaluesFromString(CdPackage.eINSTANCE.getCDTRANSACTIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTRANSACTIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTRANSACTIONvaluesToString(CdPackage.eINSTANCE.getCDTRANSACTIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTUCOPATHOLOGYTYPEvalues createCDTUCOPATHOLOGYTYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTUCOPATHOLOGYTYPEvaluesFromString(CdPackage.eINSTANCE.getCDTUCOPATHOLOGYTYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTUCOPATHOLOGYTYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTUCOPATHOLOGYTYPEvaluesToString(CdPackage.eINSTANCE.getCDTUCOPATHOLOGYTYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTUCOSTEMITYPEvalues createCDTUCOSTEMITYPEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDTUCOSTEMITYPEvaluesFromString(CdPackage.eINSTANCE.getCDTUCOSTEMITYPEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDTUCOSTEMITYPEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDTUCOSTEMITYPEvaluesToString(CdPackage.eINSTANCE.getCDTUCOSTEMITYPEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDUNITschemes createCDUNITschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDUNITschemesFromString(CdPackage.eINSTANCE.getCDUNITschemes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDUNITschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDUNITschemesToString(CdPackage.eINSTANCE.getCDUNITschemes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDUNITvalues createCDUNITvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDUNITvaluesFromString(CdPackage.eINSTANCE.getCDUNITvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDUNITvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDUNITvaluesToString(CdPackage.eINSTANCE.getCDUNITvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDURGENCYvalues createCDURGENCYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDURGENCYvaluesFromString(CdPackage.eINSTANCE.getCDURGENCYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDURGENCYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDURGENCYvaluesToString(CdPackage.eINSTANCE.getCDURGENCYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDVACCINEINDICATIONvalues createCDVACCINEINDICATIONvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDVACCINEINDICATIONvaluesFromString(CdPackage.eINSTANCE.getCDVACCINEINDICATIONvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDVACCINEINDICATIONvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDVACCINEINDICATIONvaluesToString(CdPackage.eINSTANCE.getCDVACCINEINDICATIONvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDVACCINEvalues createCDVACCINEvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDVACCINEvaluesFromString(CdPackage.eINSTANCE.getCDVACCINEvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDVACCINEvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDVACCINEvaluesToString(CdPackage.eINSTANCE.getCDVACCINEvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDWEEKDAYvalues createCDWEEKDAYvaluesObjectFromString(EDataType eDataType, String initialValue) {
		return createCDWEEKDAYvaluesFromString(CdPackage.eINSTANCE.getCDWEEKDAYvalues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDWEEKDAYvaluesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCDWEEKDAYvaluesToString(CdPackage.eINSTANCE.getCDWEEKDAYvalues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createICDvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertICDvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createICPCvaluesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertICPCvaluesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CdPackage getCdPackage() {
		return (CdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CdPackage getPackage() {
		return CdPackage.eINSTANCE;
	}

} //CdFactoryImpl
