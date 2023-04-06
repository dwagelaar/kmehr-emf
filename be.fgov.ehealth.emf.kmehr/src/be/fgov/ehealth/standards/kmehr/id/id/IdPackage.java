/**
 */
package be.fgov.ehealth.standards.kmehr.id.id;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.id.id.IdFactory
 * @model kind="package"
 * @generated
 */
public interface IdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "id";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ehealth.fgov.be/standards/kmehr/id/v1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "id";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdPackage eINSTANCE = be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl.init();

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.id.id.impl.IDHCPARTYImpl <em>IDHCPARTY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IDHCPARTYImpl
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDHCPARTY()
	 * @generated
	 */
	int IDHCPARTY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDHCPARTY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDHCPARTY__S = 1;

	/**
	 * The feature id for the '<em><b>SL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDHCPARTY__SL = 2;

	/**
	 * The feature id for the '<em><b>SV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDHCPARTY__SV = 3;

	/**
	 * The number of structural features of the '<em>IDHCPARTY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDHCPARTY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IDHCPARTY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDHCPARTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.id.id.impl.IDINSURANCEImpl <em>IDINSURANCE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IDINSURANCEImpl
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDINSURANCE()
	 * @generated
	 */
	int IDINSURANCE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDINSURANCE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDINSURANCE__S = 1;

	/**
	 * The feature id for the '<em><b>SL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDINSURANCE__SL = 2;

	/**
	 * The feature id for the '<em><b>SV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDINSURANCE__SV = 3;

	/**
	 * The number of structural features of the '<em>IDINSURANCE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDINSURANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IDINSURANCE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDINSURANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.id.id.impl.IDKMEHRImpl <em>IDKMEHR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IDKMEHRImpl
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDKMEHR()
	 * @generated
	 */
	int IDKMEHR = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDKMEHR__VALUE = 0;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDKMEHR__S = 1;

	/**
	 * The feature id for the '<em><b>SL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDKMEHR__SL = 2;

	/**
	 * The feature id for the '<em><b>SV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDKMEHR__SV = 3;

	/**
	 * The number of structural features of the '<em>IDKMEHR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDKMEHR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IDKMEHR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDKMEHR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.id.id.impl.IDPATIENTImpl <em>IDPATIENT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IDPATIENTImpl
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDPATIENT()
	 * @generated
	 */
	int IDPATIENT = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDPATIENT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDPATIENT__S = 1;

	/**
	 * The feature id for the '<em><b>SL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDPATIENT__SL = 2;

	/**
	 * The feature id for the '<em><b>SV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDPATIENT__SV = 3;

	/**
	 * The number of structural features of the '<em>IDPATIENT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDPATIENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IDPATIENT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDPATIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.id.id.impl.IDPROFESSIONImpl <em>IDPROFESSION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IDPROFESSIONImpl
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDPROFESSION()
	 * @generated
	 */
	int IDPROFESSION = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDPROFESSION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDPROFESSION__S = 1;

	/**
	 * The feature id for the '<em><b>SL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDPROFESSION__SL = 2;

	/**
	 * The feature id for the '<em><b>SV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDPROFESSION__SV = 3;

	/**
	 * The number of structural features of the '<em>IDPROFESSION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDPROFESSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IDPROFESSION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDPROFESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.id.id.impl.INSSImpl <em>INSS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.INSSImpl
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getINSS()
	 * @generated
	 */
	int INSS = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSS__VALUE = 0;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSS__S = 1;

	/**
	 * The feature id for the '<em><b>SL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSS__SL = 2;

	/**
	 * The feature id for the '<em><b>SV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSS__SV = 3;

	/**
	 * The number of structural features of the '<em>INSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>INSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTYschemes <em>IDHCPART Yschemes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTYschemes
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDHCPARTYschemes()
	 * @generated
	 */
	int IDHCPART_YSCHEMES = 6;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCEschemes <em>IDINSURANC Eschemes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCEschemes
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDINSURANCEschemes()
	 * @generated
	 */
	int IDINSURANC_ESCHEMES = 7;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHRschemes <em>IDKMEH Rschemes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDKMEHRschemes
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDKMEHRschemes()
	 * @generated
	 */
	int IDKMEH_RSCHEMES = 8;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPATIENTschemes <em>IDPATIEN Tschemes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPATIENTschemes
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDPATIENTschemes()
	 * @generated
	 */
	int IDPATIEN_TSCHEMES = 9;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes <em>IDPROFESSIO Nschemes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDPROFESSIONschemes()
	 * @generated
	 */
	int IDPROFESSIO_NSCHEMES = 10;

	/**
	 * The meta object id for the '<em>IDHCPART Yschemes Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTYschemes
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDHCPARTYschemesObject()
	 * @generated
	 */
	int IDHCPART_YSCHEMES_OBJECT = 11;

	/**
	 * The meta object id for the '<em>IDINSURANC Eschemes Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCEschemes
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDINSURANCEschemesObject()
	 * @generated
	 */
	int IDINSURANC_ESCHEMES_OBJECT = 12;

	/**
	 * The meta object id for the '<em>IDKMEH Rschemes Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDKMEHRschemes
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDKMEHRschemesObject()
	 * @generated
	 */
	int IDKMEH_RSCHEMES_OBJECT = 13;

	/**
	 * The meta object id for the '<em>IDPATIEN Tschemes Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPATIENTschemes
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDPATIENTschemesObject()
	 * @generated
	 */
	int IDPATIEN_TSCHEMES_OBJECT = 14;

	/**
	 * The meta object id for the '<em>IDPROFESSIO Nschemes Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes
	 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDPROFESSIONschemesObject()
	 * @generated
	 */
	int IDPROFESSIO_NSCHEMES_OBJECT = 15;


	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY <em>IDHCPARTY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDHCPARTY</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY
	 * @generated
	 */
	EClass getIDHCPARTY();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY#getValue()
	 * @see #getIDHCPARTY()
	 * @generated
	 */
	EAttribute getIDHCPARTY_Value();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY#getS()
	 * @see #getIDHCPARTY()
	 * @generated
	 */
	EAttribute getIDHCPARTY_S();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY#getSL <em>SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SL</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY#getSL()
	 * @see #getIDHCPARTY()
	 * @generated
	 */
	EAttribute getIDHCPARTY_SL();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY#getSV <em>SV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTY#getSV()
	 * @see #getIDHCPARTY()
	 * @generated
	 */
	EAttribute getIDHCPARTY_SV();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE <em>IDINSURANCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDINSURANCE</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE
	 * @generated
	 */
	EClass getIDINSURANCE();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE#getValue()
	 * @see #getIDINSURANCE()
	 * @generated
	 */
	EAttribute getIDINSURANCE_Value();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE#getS()
	 * @see #getIDINSURANCE()
	 * @generated
	 */
	EAttribute getIDINSURANCE_S();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE#getSL <em>SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SL</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE#getSL()
	 * @see #getIDINSURANCE()
	 * @generated
	 */
	EAttribute getIDINSURANCE_SL();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE#getSV <em>SV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCE#getSV()
	 * @see #getIDINSURANCE()
	 * @generated
	 */
	EAttribute getIDINSURANCE_SV();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR <em>IDKMEHR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDKMEHR</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR
	 * @generated
	 */
	EClass getIDKMEHR();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR#getValue()
	 * @see #getIDKMEHR()
	 * @generated
	 */
	EAttribute getIDKMEHR_Value();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR#getS()
	 * @see #getIDKMEHR()
	 * @generated
	 */
	EAttribute getIDKMEHR_S();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR#getSL <em>SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SL</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR#getSL()
	 * @see #getIDKMEHR()
	 * @generated
	 */
	EAttribute getIDKMEHR_SL();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR#getSV <em>SV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR#getSV()
	 * @see #getIDKMEHR()
	 * @generated
	 */
	EAttribute getIDKMEHR_SV();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT <em>IDPATIENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDPATIENT</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT
	 * @generated
	 */
	EClass getIDPATIENT();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT#getValue()
	 * @see #getIDPATIENT()
	 * @generated
	 */
	EAttribute getIDPATIENT_Value();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT#getS()
	 * @see #getIDPATIENT()
	 * @generated
	 */
	EAttribute getIDPATIENT_S();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT#getSL <em>SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SL</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT#getSL()
	 * @see #getIDPATIENT()
	 * @generated
	 */
	EAttribute getIDPATIENT_SL();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT#getSV <em>SV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPATIENT#getSV()
	 * @see #getIDPATIENT()
	 * @generated
	 */
	EAttribute getIDPATIENT_SV();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION <em>IDPROFESSION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDPROFESSION</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION
	 * @generated
	 */
	EClass getIDPROFESSION();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getValue()
	 * @see #getIDPROFESSION()
	 * @generated
	 */
	EAttribute getIDPROFESSION_Value();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getS()
	 * @see #getIDPROFESSION()
	 * @generated
	 */
	EAttribute getIDPROFESSION_S();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getSL <em>SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SL</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getSL()
	 * @see #getIDPROFESSION()
	 * @generated
	 */
	EAttribute getIDPROFESSION_SL();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getSV <em>SV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSION#getSV()
	 * @see #getIDPROFESSION()
	 * @generated
	 */
	EAttribute getIDPROFESSION_SV();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.id.id.INSS <em>INSS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INSS</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.INSS
	 * @generated
	 */
	EClass getINSS();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.INSS#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.INSS#getValue()
	 * @see #getINSS()
	 * @generated
	 */
	EAttribute getINSS_Value();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.INSS#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.INSS#getS()
	 * @see #getINSS()
	 * @generated
	 */
	EAttribute getINSS_S();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.INSS#getSL <em>SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SL</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.INSS#getSL()
	 * @see #getINSS()
	 * @generated
	 */
	EAttribute getINSS_SL();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.id.id.INSS#getSV <em>SV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.INSS#getSV()
	 * @see #getINSS()
	 * @generated
	 */
	EAttribute getINSS_SV();

	/**
	 * Returns the meta object for enum '{@link be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTYschemes <em>IDHCPART Yschemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IDHCPART Yschemes</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTYschemes
	 * @generated
	 */
	EEnum getIDHCPARTYschemes();

	/**
	 * Returns the meta object for enum '{@link be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCEschemes <em>IDINSURANC Eschemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IDINSURANC Eschemes</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCEschemes
	 * @generated
	 */
	EEnum getIDINSURANCEschemes();

	/**
	 * Returns the meta object for enum '{@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHRschemes <em>IDKMEH Rschemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IDKMEH Rschemes</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDKMEHRschemes
	 * @generated
	 */
	EEnum getIDKMEHRschemes();

	/**
	 * Returns the meta object for enum '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPATIENTschemes <em>IDPATIEN Tschemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IDPATIEN Tschemes</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPATIENTschemes
	 * @generated
	 */
	EEnum getIDPATIENTschemes();

	/**
	 * Returns the meta object for enum '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes <em>IDPROFESSIO Nschemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IDPROFESSIO Nschemes</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes
	 * @generated
	 */
	EEnum getIDPROFESSIONschemes();

	/**
	 * Returns the meta object for data type '{@link be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTYschemes <em>IDHCPART Yschemes Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IDHCPART Yschemes Object</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTYschemes
	 * @model instanceClass="be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTYschemes"
	 *        extendedMetaData="name='ID-HCPARTYschemes:Object' baseType='ID-HCPARTYschemes'"
	 * @generated
	 */
	EDataType getIDHCPARTYschemesObject();

	/**
	 * Returns the meta object for data type '{@link be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCEschemes <em>IDINSURANC Eschemes Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IDINSURANC Eschemes Object</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCEschemes
	 * @model instanceClass="be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCEschemes"
	 *        extendedMetaData="name='ID-INSURANCEschemes:Object' baseType='ID-INSURANCEschemes'"
	 * @generated
	 */
	EDataType getIDINSURANCEschemesObject();

	/**
	 * Returns the meta object for data type '{@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHRschemes <em>IDKMEH Rschemes Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IDKMEH Rschemes Object</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDKMEHRschemes
	 * @model instanceClass="be.fgov.ehealth.standards.kmehr.id.id.IDKMEHRschemes"
	 *        extendedMetaData="name='ID-KMEHRschemes:Object' baseType='ID-KMEHRschemes'"
	 * @generated
	 */
	EDataType getIDKMEHRschemesObject();

	/**
	 * Returns the meta object for data type '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPATIENTschemes <em>IDPATIEN Tschemes Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IDPATIEN Tschemes Object</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPATIENTschemes
	 * @model instanceClass="be.fgov.ehealth.standards.kmehr.id.id.IDPATIENTschemes"
	 *        extendedMetaData="name='ID-PATIENTschemes:Object' baseType='ID-PATIENTschemes'"
	 * @generated
	 */
	EDataType getIDPATIENTschemesObject();

	/**
	 * Returns the meta object for data type '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes <em>IDPROFESSIO Nschemes Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IDPROFESSIO Nschemes Object</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes
	 * @model instanceClass="be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes"
	 *        extendedMetaData="name='ID-PROFESSIONschemes:Object' baseType='ID-PROFESSIONschemes'"
	 * @generated
	 */
	EDataType getIDPROFESSIONschemesObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdFactory getIdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.id.id.impl.IDHCPARTYImpl <em>IDHCPARTY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IDHCPARTYImpl
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDHCPARTY()
		 * @generated
		 */
		EClass IDHCPARTY = eINSTANCE.getIDHCPARTY();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDHCPARTY__VALUE = eINSTANCE.getIDHCPARTY_Value();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDHCPARTY__S = eINSTANCE.getIDHCPARTY_S();

		/**
		 * The meta object literal for the '<em><b>SL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDHCPARTY__SL = eINSTANCE.getIDHCPARTY_SL();

		/**
		 * The meta object literal for the '<em><b>SV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDHCPARTY__SV = eINSTANCE.getIDHCPARTY_SV();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.id.id.impl.IDINSURANCEImpl <em>IDINSURANCE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IDINSURANCEImpl
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDINSURANCE()
		 * @generated
		 */
		EClass IDINSURANCE = eINSTANCE.getIDINSURANCE();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDINSURANCE__VALUE = eINSTANCE.getIDINSURANCE_Value();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDINSURANCE__S = eINSTANCE.getIDINSURANCE_S();

		/**
		 * The meta object literal for the '<em><b>SL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDINSURANCE__SL = eINSTANCE.getIDINSURANCE_SL();

		/**
		 * The meta object literal for the '<em><b>SV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDINSURANCE__SV = eINSTANCE.getIDINSURANCE_SV();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.id.id.impl.IDKMEHRImpl <em>IDKMEHR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IDKMEHRImpl
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDKMEHR()
		 * @generated
		 */
		EClass IDKMEHR = eINSTANCE.getIDKMEHR();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDKMEHR__VALUE = eINSTANCE.getIDKMEHR_Value();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDKMEHR__S = eINSTANCE.getIDKMEHR_S();

		/**
		 * The meta object literal for the '<em><b>SL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDKMEHR__SL = eINSTANCE.getIDKMEHR_SL();

		/**
		 * The meta object literal for the '<em><b>SV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDKMEHR__SV = eINSTANCE.getIDKMEHR_SV();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.id.id.impl.IDPATIENTImpl <em>IDPATIENT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IDPATIENTImpl
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDPATIENT()
		 * @generated
		 */
		EClass IDPATIENT = eINSTANCE.getIDPATIENT();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDPATIENT__VALUE = eINSTANCE.getIDPATIENT_Value();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDPATIENT__S = eINSTANCE.getIDPATIENT_S();

		/**
		 * The meta object literal for the '<em><b>SL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDPATIENT__SL = eINSTANCE.getIDPATIENT_SL();

		/**
		 * The meta object literal for the '<em><b>SV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDPATIENT__SV = eINSTANCE.getIDPATIENT_SV();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.id.id.impl.IDPROFESSIONImpl <em>IDPROFESSION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IDPROFESSIONImpl
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDPROFESSION()
		 * @generated
		 */
		EClass IDPROFESSION = eINSTANCE.getIDPROFESSION();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDPROFESSION__VALUE = eINSTANCE.getIDPROFESSION_Value();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDPROFESSION__S = eINSTANCE.getIDPROFESSION_S();

		/**
		 * The meta object literal for the '<em><b>SL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDPROFESSION__SL = eINSTANCE.getIDPROFESSION_SL();

		/**
		 * The meta object literal for the '<em><b>SV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDPROFESSION__SV = eINSTANCE.getIDPROFESSION_SV();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.id.id.impl.INSSImpl <em>INSS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.INSSImpl
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getINSS()
		 * @generated
		 */
		EClass INSS = eINSTANCE.getINSS();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSS__VALUE = eINSTANCE.getINSS_Value();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSS__S = eINSTANCE.getINSS_S();

		/**
		 * The meta object literal for the '<em><b>SL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSS__SL = eINSTANCE.getINSS_SL();

		/**
		 * The meta object literal for the '<em><b>SV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSS__SV = eINSTANCE.getINSS_SV();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTYschemes <em>IDHCPART Yschemes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTYschemes
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDHCPARTYschemes()
		 * @generated
		 */
		EEnum IDHCPART_YSCHEMES = eINSTANCE.getIDHCPARTYschemes();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCEschemes <em>IDINSURANC Eschemes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCEschemes
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDINSURANCEschemes()
		 * @generated
		 */
		EEnum IDINSURANC_ESCHEMES = eINSTANCE.getIDINSURANCEschemes();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDKMEHRschemes <em>IDKMEH Rschemes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.IDKMEHRschemes
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDKMEHRschemes()
		 * @generated
		 */
		EEnum IDKMEH_RSCHEMES = eINSTANCE.getIDKMEHRschemes();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPATIENTschemes <em>IDPATIEN Tschemes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPATIENTschemes
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDPATIENTschemes()
		 * @generated
		 */
		EEnum IDPATIEN_TSCHEMES = eINSTANCE.getIDPATIENTschemes();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes <em>IDPROFESSIO Nschemes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDPROFESSIONschemes()
		 * @generated
		 */
		EEnum IDPROFESSIO_NSCHEMES = eINSTANCE.getIDPROFESSIONschemes();

		/**
		 * The meta object literal for the '<em>IDHCPART Yschemes Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.IDHCPARTYschemes
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDHCPARTYschemesObject()
		 * @generated
		 */
		EDataType IDHCPART_YSCHEMES_OBJECT = eINSTANCE.getIDHCPARTYschemesObject();

		/**
		 * The meta object literal for the '<em>IDINSURANC Eschemes Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.IDINSURANCEschemes
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDINSURANCEschemesObject()
		 * @generated
		 */
		EDataType IDINSURANC_ESCHEMES_OBJECT = eINSTANCE.getIDINSURANCEschemesObject();

		/**
		 * The meta object literal for the '<em>IDKMEH Rschemes Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.IDKMEHRschemes
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDKMEHRschemesObject()
		 * @generated
		 */
		EDataType IDKMEH_RSCHEMES_OBJECT = eINSTANCE.getIDKMEHRschemesObject();

		/**
		 * The meta object literal for the '<em>IDPATIEN Tschemes Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPATIENTschemes
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDPATIENTschemesObject()
		 * @generated
		 */
		EDataType IDPATIEN_TSCHEMES_OBJECT = eINSTANCE.getIDPATIENTschemesObject();

		/**
		 * The meta object literal for the '<em>IDPROFESSIO Nschemes Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.id.id.IDPROFESSIONschemes
		 * @see be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl#getIDPROFESSIONschemesObject()
		 * @generated
		 */
		EDataType IDPROFESSIO_NSCHEMES_OBJECT = eINSTANCE.getIDPROFESSIONschemesObject();

	}

} //IdPackage
