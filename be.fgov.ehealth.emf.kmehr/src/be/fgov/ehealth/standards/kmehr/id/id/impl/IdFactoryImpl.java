/**
 */
package be.fgov.ehealth.standards.kmehr.id.id.impl;

import be.fgov.ehealth.standards.kmehr.id.id.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdFactoryImpl extends EFactoryImpl implements IdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IdFactory init() {
		try {
			IdFactory theIdFactory = (IdFactory)EPackage.Registry.INSTANCE.getEFactory(IdPackage.eNS_URI);
			if (theIdFactory != null) {
				return theIdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdFactoryImpl() {
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
			case IdPackage.IDHCPARTY: return createIDHCPARTY();
			case IdPackage.IDINSURANCE: return createIDINSURANCE();
			case IdPackage.IDKMEHR: return createIDKMEHR();
			case IdPackage.IDPATIENT: return createIDPATIENT();
			case IdPackage.IDPROFESSION: return createIDPROFESSION();
			case IdPackage.INSS: return createINSS();
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
			case IdPackage.IDHCPART_YSCHEMES:
				return createIDHCPARTYschemesFromString(eDataType, initialValue);
			case IdPackage.IDINSURANC_ESCHEMES:
				return createIDINSURANCEschemesFromString(eDataType, initialValue);
			case IdPackage.IDKMEH_RSCHEMES:
				return createIDKMEHRschemesFromString(eDataType, initialValue);
			case IdPackage.IDPATIEN_TSCHEMES:
				return createIDPATIENTschemesFromString(eDataType, initialValue);
			case IdPackage.IDPROFESSIO_NSCHEMES:
				return createIDPROFESSIONschemesFromString(eDataType, initialValue);
			case IdPackage.IDHCPART_YSCHEMES_OBJECT:
				return createIDHCPARTYschemesObjectFromString(eDataType, initialValue);
			case IdPackage.IDINSURANC_ESCHEMES_OBJECT:
				return createIDINSURANCEschemesObjectFromString(eDataType, initialValue);
			case IdPackage.IDKMEH_RSCHEMES_OBJECT:
				return createIDKMEHRschemesObjectFromString(eDataType, initialValue);
			case IdPackage.IDPATIEN_TSCHEMES_OBJECT:
				return createIDPATIENTschemesObjectFromString(eDataType, initialValue);
			case IdPackage.IDPROFESSIO_NSCHEMES_OBJECT:
				return createIDPROFESSIONschemesObjectFromString(eDataType, initialValue);
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
			case IdPackage.IDHCPART_YSCHEMES:
				return convertIDHCPARTYschemesToString(eDataType, instanceValue);
			case IdPackage.IDINSURANC_ESCHEMES:
				return convertIDINSURANCEschemesToString(eDataType, instanceValue);
			case IdPackage.IDKMEH_RSCHEMES:
				return convertIDKMEHRschemesToString(eDataType, instanceValue);
			case IdPackage.IDPATIEN_TSCHEMES:
				return convertIDPATIENTschemesToString(eDataType, instanceValue);
			case IdPackage.IDPROFESSIO_NSCHEMES:
				return convertIDPROFESSIONschemesToString(eDataType, instanceValue);
			case IdPackage.IDHCPART_YSCHEMES_OBJECT:
				return convertIDHCPARTYschemesObjectToString(eDataType, instanceValue);
			case IdPackage.IDINSURANC_ESCHEMES_OBJECT:
				return convertIDINSURANCEschemesObjectToString(eDataType, instanceValue);
			case IdPackage.IDKMEH_RSCHEMES_OBJECT:
				return convertIDKMEHRschemesObjectToString(eDataType, instanceValue);
			case IdPackage.IDPATIEN_TSCHEMES_OBJECT:
				return convertIDPATIENTschemesObjectToString(eDataType, instanceValue);
			case IdPackage.IDPROFESSIO_NSCHEMES_OBJECT:
				return convertIDPROFESSIONschemesObjectToString(eDataType, instanceValue);
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
	public IDHCPARTY createIDHCPARTY() {
		IDHCPARTYImpl idhcparty = new IDHCPARTYImpl();
		return idhcparty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDINSURANCE createIDINSURANCE() {
		IDINSURANCEImpl idinsurance = new IDINSURANCEImpl();
		return idinsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDKMEHR createIDKMEHR() {
		IDKMEHRImpl idkmehr = new IDKMEHRImpl();
		return idkmehr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDPATIENT createIDPATIENT() {
		IDPATIENTImpl idpatient = new IDPATIENTImpl();
		return idpatient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDPROFESSION createIDPROFESSION() {
		IDPROFESSIONImpl idprofession = new IDPROFESSIONImpl();
		return idprofession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public INSS createINSS() {
		INSSImpl inss = new INSSImpl();
		return inss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDHCPARTYschemes createIDHCPARTYschemesFromString(EDataType eDataType, String initialValue) {
		IDHCPARTYschemes result = IDHCPARTYschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDHCPARTYschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDINSURANCEschemes createIDINSURANCEschemesFromString(EDataType eDataType, String initialValue) {
		IDINSURANCEschemes result = IDINSURANCEschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDINSURANCEschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDKMEHRschemes createIDKMEHRschemesFromString(EDataType eDataType, String initialValue) {
		IDKMEHRschemes result = IDKMEHRschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDKMEHRschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDPATIENTschemes createIDPATIENTschemesFromString(EDataType eDataType, String initialValue) {
		IDPATIENTschemes result = IDPATIENTschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDPATIENTschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDPROFESSIONschemes createIDPROFESSIONschemesFromString(EDataType eDataType, String initialValue) {
		IDPROFESSIONschemes result = IDPROFESSIONschemes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDPROFESSIONschemesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDHCPARTYschemes createIDHCPARTYschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createIDHCPARTYschemesFromString(IdPackage.Literals.IDHCPART_YSCHEMES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDHCPARTYschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIDHCPARTYschemesToString(IdPackage.Literals.IDHCPART_YSCHEMES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDINSURANCEschemes createIDINSURANCEschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createIDINSURANCEschemesFromString(IdPackage.Literals.IDINSURANC_ESCHEMES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDINSURANCEschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIDINSURANCEschemesToString(IdPackage.Literals.IDINSURANC_ESCHEMES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDKMEHRschemes createIDKMEHRschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createIDKMEHRschemesFromString(IdPackage.Literals.IDKMEH_RSCHEMES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDKMEHRschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIDKMEHRschemesToString(IdPackage.Literals.IDKMEH_RSCHEMES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDPATIENTschemes createIDPATIENTschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createIDPATIENTschemesFromString(IdPackage.Literals.IDPATIEN_TSCHEMES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDPATIENTschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIDPATIENTschemesToString(IdPackage.Literals.IDPATIEN_TSCHEMES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDPROFESSIONschemes createIDPROFESSIONschemesObjectFromString(EDataType eDataType, String initialValue) {
		return createIDPROFESSIONschemesFromString(IdPackage.Literals.IDPROFESSIO_NSCHEMES, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDPROFESSIONschemesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIDPROFESSIONschemesToString(IdPackage.Literals.IDPROFESSIO_NSCHEMES, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdPackage getIdPackage() {
		return (IdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IdPackage getPackage() {
		return IdPackage.eINSTANCE;
	}

} //IdFactoryImpl
