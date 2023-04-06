/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage;

import be.fgov.ehealth.standards.kmehr.cd.cd.impl.CdPackageImpl;

import be.fgov.ehealth.standards.kmehr.dt.dt.DtPackage;

import be.fgov.ehealth.standards.kmehr.dt.dt.impl.DtPackageImpl;

import be.fgov.ehealth.standards.kmehr.id.id.IdPackage;

import be.fgov.ehealth.standards.kmehr.id.id.impl.IdPackageImpl;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.AcknowledgmentType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationquantityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationunitType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.AuthorType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedValueType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.CertaintyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.CivilstateType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ConfidentialityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.CostType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.CountryType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.DateType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.DayperiodType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.DenominatorType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.DurationType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorMyCarenetType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ExternalsourceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMINType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.FormularyreferenceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityreasonType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrFactory;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.LifecycleType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.LocalitemattributeType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.LocationBirthPlaceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MaxrefType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MemberinsuranceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MinrefType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.NationalityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.NominatorType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PackageType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PeriodicityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PresentationType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ProfessionType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityprefixType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMAXType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMINType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RefscopeType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RenewalType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RouteType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SenderType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SeverityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SexType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SiteType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SpecialisationType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.StrengthType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TakesType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TemporalityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TextWithLayoutType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ThirdpayercontractType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TimequantityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TimeunitType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.UnitType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.UrgencyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
public class KmehrPackageImpl extends EPackageImpl implements KmehrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acknowledgmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressTypeBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrationquantityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrationunitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base64EncryptedDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base64EncryptedValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certaintyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass civilstateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundprescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confidentialityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentlocalitemattributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayperiodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daytimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass denominatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorMyCarenetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalsourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fcmaxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fcminTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formularyreferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass galenicformTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hcpartyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass holterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incapacityreasonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incapacityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insuranceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kmehrmessageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifecycleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localitemattributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationBirthPlaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxrefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicinalProductTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberinsuranceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minrefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass momentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nationalityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nominatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personalpartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personTypeLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass posologyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityprefixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recipientTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refscopeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refvalueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regimenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renewalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rrmaxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rrminTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass severityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialisationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strengthTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceproductTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass takesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telecomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textWithLayoutTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thirdpayercontractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timequantityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeunitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urgencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weekdayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weekdayType1EClass = null;

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
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KmehrPackageImpl() {
		super(eNS_URI, KmehrFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KmehrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KmehrPackage init() {
		if (isInited) return (KmehrPackage)EPackage.Registry.INSTANCE.getEPackage(KmehrPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKmehrPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		KmehrPackageImpl theKmehrPackage = registeredKmehrPackage instanceof KmehrPackageImpl ? (KmehrPackageImpl)registeredKmehrPackage : new KmehrPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XmlencPackage.eNS_URI);
		XmlencPackageImpl theXmlencPackage = (XmlencPackageImpl)(registeredPackage instanceof XmlencPackageImpl ? registeredPackage : XmlencPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI);
		XmldsigPackageImpl theXmldsigPackage = (XmldsigPackageImpl)(registeredPackage instanceof XmldsigPackageImpl ? registeredPackage : XmldsigPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IdPackage.eNS_URI);
		IdPackageImpl theIdPackage = (IdPackageImpl)(registeredPackage instanceof IdPackageImpl ? registeredPackage : IdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI);
		CdPackageImpl theCdPackage = (CdPackageImpl)(registeredPackage instanceof CdPackageImpl ? registeredPackage : CdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DtPackage.eNS_URI);
		DtPackageImpl theDtPackage = (DtPackageImpl)(registeredPackage instanceof DtPackageImpl ? registeredPackage : DtPackage.eINSTANCE);

		// Load packages
		theCdPackage.loadPackage();

		// Create package meta-data objects
		theKmehrPackage.createPackageContents();
		theXmlencPackage.createPackageContents();
		theXmldsigPackage.createPackageContents();
		theIdPackage.createPackageContents();
		theDtPackage.createPackageContents();

		// Initialize created meta-data
		theKmehrPackage.initializePackageContents();
		theXmlencPackage.initializePackageContents();
		theXmldsigPackage.initializePackageContents();
		theIdPackage.initializePackageContents();
		theDtPackage.initializePackageContents();

		// Fix loaded packages
		theCdPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theKmehrPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KmehrPackage.eNS_URI, theKmehrPackage);
		return theKmehrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcknowledgmentType() {
		return acknowledgmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcknowledgmentType_Cd() {
		return (EReference)acknowledgmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressType() {
		return addressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressTypeBase() {
		return addressTypeBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddressTypeBase_Id() {
		return (EReference)addressTypeBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddressTypeBase_Cd() {
		return (EReference)addressTypeBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddressTypeBase_Country() {
		return (EReference)addressTypeBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressTypeBase_Zip() {
		return (EAttribute)addressTypeBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressTypeBase_Nis() {
		return (EAttribute)addressTypeBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressTypeBase_City() {
		return (EAttribute)addressTypeBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressTypeBase_District() {
		return (EAttribute)addressTypeBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressTypeBase_Street() {
		return (EAttribute)addressTypeBaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressTypeBase_Housenumber() {
		return (EAttribute)addressTypeBaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressTypeBase_Postboxnumber() {
		return (EAttribute)addressTypeBaseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddressTypeBase_Text() {
		return (EReference)addressTypeBaseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdministrationquantityType() {
		return administrationquantityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdministrationquantityType_Decimal() {
		return (EAttribute)administrationquantityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdministrationquantityType_Unit() {
		return (EReference)administrationquantityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdministrationunitType() {
		return administrationunitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdministrationunitType_Cd() {
		return (EReference)administrationunitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorType() {
		return authorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorType_Hcparty() {
		return (EReference)authorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBase64EncryptedDataType() {
		return base64EncryptedDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBase64EncryptedDataType_Cd() {
		return (EReference)base64EncryptedDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBase64EncryptedDataType_Base64EncryptedValue() {
		return (EReference)base64EncryptedDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBase64EncryptedValueType() {
		return base64EncryptedValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBase64EncryptedValueType_Value() {
		return (EAttribute)base64EncryptedValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBase64EncryptedValueType_Encoding() {
		return (EAttribute)base64EncryptedValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCertaintyType() {
		return certaintyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCertaintyType_Cd() {
		return (EReference)certaintyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCivilstateType() {
		return civilstateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCivilstateType_Cd() {
		return (EReference)civilstateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompoundprescriptionType() {
		return compoundprescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundprescriptionType_Mixed() {
		return (EAttribute)compoundprescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundprescriptionType_Compound() {
		return (EReference)compoundprescriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundprescriptionType_Formularyreference() {
		return (EReference)compoundprescriptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundprescriptionType_Magistraltext() {
		return (EReference)compoundprescriptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundprescriptionType_Galenicform() {
		return (EReference)compoundprescriptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundprescriptionType_Quantity() {
		return (EReference)compoundprescriptionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundprescriptionType_L() {
		return (EAttribute)compoundprescriptionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompoundType() {
		return compoundTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundType_Id() {
		return (EReference)compoundTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundType_Medicinalproduct() {
		return (EReference)compoundTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundType_Substance() {
		return (EReference)compoundTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundType_Quantityprefix() {
		return (EReference)compoundTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundType_Quantity() {
		return (EReference)compoundTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfidentialityType() {
		return confidentialityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfidentialityType_Hcparty() {
		return (EReference)confidentialityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentlocalitemattributeType() {
		return contentlocalitemattributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentlocalitemattributeType_Id() {
		return (EReference)contentlocalitemattributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentlocalitemattributeType_Cd() {
		return (EReference)contentlocalitemattributeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentlocalitemattributeType_Decimal() {
		return (EAttribute)contentlocalitemattributeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentlocalitemattributeType_Boolean() {
		return (EAttribute)contentlocalitemattributeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentlocalitemattributeType_Text() {
		return (EReference)contentlocalitemattributeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentlocalitemattributeType_Date() {
		return (EAttribute)contentlocalitemattributeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentlocalitemattributeType_Time() {
		return (EAttribute)contentlocalitemattributeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentlocalitemattributeType_Hcparty() {
		return (EReference)contentlocalitemattributeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentlocalitemattributeType_Person() {
		return (EReference)contentlocalitemattributeTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentlocalitemattributeType_Lnk() {
		return (EReference)contentlocalitemattributeTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentlocalitemattributeType_Unit() {
		return (EReference)contentlocalitemattributeTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentType() {
		return contentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Id() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Cd() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentType_Decimal() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentType_UnsignedInt() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentType_Boolean() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Text() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentType_Year() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentType_Yearmonth() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentType_Date() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentType_Time() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Hcparty() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Person() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Insurance() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Incapacity() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Error() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Medicinalproduct() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Substanceproduct() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Compoundprescription() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Medication() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Holter() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Ecg() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Bacteriology() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Lnk() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Location() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Unit() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Minref() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Maxref() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentType_Refscope() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCostType() {
		return costTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCostType_Decimal() {
		return (EAttribute)costTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCostType_Unit() {
		return (EReference)costTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountryType() {
		return countryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountryType_Cd() {
		return (EReference)countryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateType() {
		return dateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDayperiodType() {
		return dayperiodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDayperiodType_Cd() {
		return (EReference)dayperiodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDaytimeType() {
		return daytimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDaytimeType_Time() {
		return (EAttribute)daytimeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDaytimeType_Dayperiod() {
		return (EReference)daytimeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDenominatorType() {
		return denominatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDenominatorType_Quantity() {
		return (EReference)denominatorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Kmehrmessage() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDurationType() {
		return durationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDurationType_Decimal() {
		return (EAttribute)durationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDurationType_Unit() {
		return (EReference)durationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErrorMyCarenetType() {
		return errorMyCarenetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErrorMyCarenetType_Cd() {
		return (EReference)errorMyCarenetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErrorMyCarenetType_Description() {
		return (EReference)errorMyCarenetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErrorMyCarenetType_Url() {
		return (EAttribute)errorMyCarenetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErrorType() {
		return errorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErrorType_Id() {
		return (EReference)errorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErrorType_Cd() {
		return (EReference)errorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErrorType_Description() {
		return (EReference)errorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErrorType_Url() {
		return (EAttribute)errorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalsourceType() {
		return externalsourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalsourceType_Source() {
		return (EReference)externalsourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFCMAXType() {
		return fcmaxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFCMAXType_Value() {
		return (EAttribute)fcmaxTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFCMAXType_TIME() {
		return (EAttribute)fcmaxTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFCMINType() {
		return fcminTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFCMINType_Value() {
		return (EAttribute)fcminTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFCMINType_TIME() {
		return (EAttribute)fcminTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeedbackType() {
		return feedbackTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeedbackType_Reportrequested() {
		return (EAttribute)feedbackTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackType_Text() {
		return (EReference)feedbackTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFolderType() {
		return folderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFolderType_Confidentiality() {
		return (EReference)folderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFolderType_Id() {
		return (EReference)folderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFolderType_Patient() {
		return (EReference)folderTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFolderType_Transaction() {
		return (EReference)folderTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFolderType_Text() {
		return (EReference)folderTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFolderType_Lnk() {
		return (EReference)folderTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormularyreferenceType() {
		return formularyreferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormularyreferenceType_Cd() {
		return (EReference)formularyreferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormularyreferenceType_Formularyname() {
		return (EAttribute)formularyreferenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrequencyType() {
		return frequencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrequencyType_Nominator() {
		return (EReference)frequencyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrequencyType_Denominator() {
		return (EReference)frequencyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrequencyType_Decimal() {
		return (EAttribute)frequencyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrequencyType_Unit() {
		return (EReference)frequencyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrequencyType_Text() {
		return (EReference)frequencyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrequencyType_Periodicity() {
		return (EReference)frequencyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGalenicformType() {
		return galenicformTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGalenicformType_Cd() {
		return (EReference)galenicformTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGalenicformType_Galenicformtext() {
		return (EReference)galenicformTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHcpartyType() {
		return hcpartyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHcpartyType_Id() {
		return (EReference)hcpartyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHcpartyType_Cd() {
		return (EReference)hcpartyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHcpartyType_Name() {
		return (EAttribute)hcpartyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHcpartyType_Firstname() {
		return (EAttribute)hcpartyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHcpartyType_Familyname() {
		return (EAttribute)hcpartyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHcpartyType_Address() {
		return (EReference)hcpartyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHcpartyType_Telecom() {
		return (EReference)hcpartyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHeaderType() {
		return headerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeaderType_Confidentiality() {
		return (EReference)headerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeaderType_Standard() {
		return (EReference)headerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeaderType_Id() {
		return (EReference)headerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeaderType_Date() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeaderType_Time() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeaderType_Sender() {
		return (EReference)headerTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeaderType_Recipient() {
		return (EReference)headerTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeaderType_Urgency() {
		return (EReference)headerTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeaderType_Acknowledgment() {
		return (EReference)headerTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeaderType_Text() {
		return (EReference)headerTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeaderType_Lnk() {
		return (EReference)headerTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeaderType_Expirationdate() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeaderType_Externalsource() {
		return (EReference)headerTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHeadingType() {
		return headingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeadingType_Confidentiality() {
		return (EReference)headingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeadingType_Id() {
		return (EReference)headingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeadingType_Cd() {
		return (EReference)headingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeadingType_Group() {
		return (EAttribute)headingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeadingType_Heading() {
		return (EReference)headingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeadingType_Item() {
		return (EReference)headingTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeadingType_Text() {
		return (EReference)headingTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeadingType_Lnk() {
		return (EReference)headingTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHolterType() {
		return holterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_FCAVG() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHolterType_FCMAX() {
		return (EReference)holterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHolterType_FCMIN() {
		return (EReference)holterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_FCAVGD() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_FCAVGN() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHolterType_RRMAX() {
		return (EReference)holterTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHolterType_RRMIN() {
		return (EReference)holterTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_QRSTOT() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_BRADY() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_PAUSE() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_LONG() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_ESV() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_DBLV() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_SALVV() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_BGV() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_TGV() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_TACHY() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_ESSV() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_DBLSV() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_SALVSV() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_BGSV() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_TGSV() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_TACHYSV() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHolterType_RRINST() {
		return (EAttribute)holterTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncapacityreasonType() {
		return incapacityreasonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncapacityreasonType_Cd() {
		return (EReference)incapacityreasonTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncapacityType() {
		return incapacityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncapacityType_Cd() {
		return (EReference)incapacityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncapacityType_Incapacityreason() {
		return (EReference)incapacityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncapacityType_Percentage() {
		return (EAttribute)incapacityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncapacityType_Outofhomeallowed() {
		return (EAttribute)incapacityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInsuranceType() {
		return insuranceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInsuranceType_Id() {
		return (EReference)insuranceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsuranceType_Membership() {
		return (EAttribute)insuranceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsuranceType_Siscard() {
		return (EAttribute)insuranceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsuranceType_Begindate() {
		return (EAttribute)insuranceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsuranceType_Enddate() {
		return (EAttribute)insuranceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsuranceType_Cg1() {
		return (EAttribute)insuranceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsuranceType_Cg2() {
		return (EAttribute)insuranceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsuranceType_Socialfranchiseperiod1() {
		return (EAttribute)insuranceTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsuranceType_Socialfranchiseperiod2() {
		return (EAttribute)insuranceTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInsuranceType_Personalpart() {
		return (EReference)insuranceTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInsuranceType_Thirdpayercontract() {
		return (EReference)insuranceTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsuranceType_Begindatepayment() {
		return (EAttribute)insuranceTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsuranceType_Approvalnumber() {
		return (EAttribute)insuranceTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemType() {
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Confidentiality() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Id() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Cd() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Content() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Text() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Author() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Beginmoment() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Endmoment() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemType_Iscomplete() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemType_Isvalidated() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Lifecycle() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemType_Isrelevant() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Severity() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Certainty() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Temporality() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Urgency() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Quantity() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Strength() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Frequency() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Site() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Cost() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Dayperiod() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Duration() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Posology() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Regimen() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemType_Deliverydate() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Renewal() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Route() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemType_Batch() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Instructionforoverdosing() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Instructionforpatient() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Instructionforreimbursement() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemType_Issubstitutionallowed() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Feedback() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Local() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemType_Recorddatetime() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemType_Lnk() {
		return (EReference)itemTypeEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKmehrmessageType() {
		return kmehrmessageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKmehrmessageType_Confidentiality() {
		return (EReference)kmehrmessageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKmehrmessageType_Header() {
		return (EReference)kmehrmessageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKmehrmessageType_Folder() {
		return (EReference)kmehrmessageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKmehrmessageType_Signature() {
		return (EReference)kmehrmessageTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKmehrmessageType_EncryptedData() {
		return (EReference)kmehrmessageTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKmehrmessageType_Base64EncryptedData() {
		return (EReference)kmehrmessageTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLifecycleType() {
		return lifecycleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLifecycleType_Cd() {
		return (EReference)lifecycleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalitemattributeType() {
		return localitemattributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalitemattributeType_Id() {
		return (EReference)localitemattributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalitemattributeType_Cd() {
		return (EReference)localitemattributeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalitemattributeType_Content() {
		return (EReference)localitemattributeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocationBirthPlaceType() {
		return locationBirthPlaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocationBirthPlaceType_Cd() {
		return (EReference)locationBirthPlaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocationBirthPlaceType_Text() {
		return (EReference)locationBirthPlaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocationBirthPlaceType_Address() {
		return (EReference)locationBirthPlaceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaxrefType() {
		return maxrefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaxrefType_Decimal() {
		return (EAttribute)maxrefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaxrefType_Text() {
		return (EReference)maxrefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationType() {
		return medicationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedicationType_Cd() {
		return (EReference)medicationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedicationType_Inn() {
		return (EReference)medicationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedicationType_Magistral() {
		return (EReference)medicationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMedicationType_Tradename() {
		return (EAttribute)medicationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedicationType_Presentation() {
		return (EReference)medicationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedicationType_Strength() {
		return (EReference)medicationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedicationType_Route() {
		return (EReference)medicationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMedicationType_Batch() {
		return (EAttribute)medicationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMedicationType_Numberofpackage() {
		return (EAttribute)medicationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedicationType_Package() {
		return (EReference)medicationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMedicationType_Quantityperpackage() {
		return (EAttribute)medicationTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedicationType_Instructionforoverdosing() {
		return (EReference)medicationTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedicationType_Instructionforpatient() {
		return (EReference)medicationTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedicationType_Instructionforreimbursement() {
		return (EReference)medicationTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMedicationType_Issubstitutionallowed() {
		return (EAttribute)medicationTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicinalProductType() {
		return medicinalProductTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedicinalProductType_Intendedcd() {
		return (EReference)medicinalProductTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedicinalProductType_Deliveredcd() {
		return (EReference)medicinalProductTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMedicinalProductType_Intendedname() {
		return (EAttribute)medicinalProductTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMedicinalProductType_Deliveredname() {
		return (EAttribute)medicinalProductTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberinsuranceType() {
		return memberinsuranceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberinsuranceType_Id() {
		return (EReference)memberinsuranceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemberinsuranceType_Membership() {
		return (EAttribute)memberinsuranceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinrefType() {
		return minrefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinrefType_Decimal() {
		return (EAttribute)minrefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMinrefType_Text() {
		return (EReference)minrefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMomentType() {
		return momentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMomentType_Year() {
		return (EAttribute)momentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMomentType_Yearmonth() {
		return (EAttribute)momentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMomentType_Date() {
		return (EAttribute)momentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMomentType_Time() {
		return (EAttribute)momentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMomentType_Text() {
		return (EReference)momentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNationalityType() {
		return nationalityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNationalityType_Cd() {
		return (EReference)nationalityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNominatorType() {
		return nominatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNominatorType_Quantity() {
		return (EReference)nominatorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageType() {
		return packageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageType_Cd() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPeriodicityType() {
		return periodicityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriodicityType_Cd() {
		return (EReference)periodicityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersonalpartType() {
		return personalpartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonalpartType_Id() {
		return (EReference)personalpartTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonalpartType_Cd() {
		return (EReference)personalpartTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonalpartType_Date() {
		return (EAttribute)personalpartTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonalpartType_Time() {
		return (EAttribute)personalpartTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersonType() {
		return personTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Id() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonType_Firstname() {
		return (EAttribute)personTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonType_Familyname() {
		return (EAttribute)personTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Birthdate() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Birthlocation() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Deathdate() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Deathlocation() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Sex() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Nationality() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Address() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Telecom() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonType_Usuallanguage() {
		return (EAttribute)personTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Profession() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Insurancystatus() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Insurancymembership() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonType_Recorddatetime() {
		return (EAttribute)personTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Text() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonType_Civilstate() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersonTypeLight() {
		return personTypeLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonTypeLight_Id() {
		return (EReference)personTypeLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonTypeLight_Firstname() {
		return (EAttribute)personTypeLightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonTypeLight_Familyname() {
		return (EAttribute)personTypeLightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonTypeLight_Address() {
		return (EReference)personTypeLightEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersonTypeLight_Telecom() {
		return (EReference)personTypeLightEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosologyType() {
		return posologyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosologyType_Low() {
		return (EAttribute)posologyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosologyType_High() {
		return (EAttribute)posologyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPosologyType_Unit() {
		return (EReference)posologyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPosologyType_Takes() {
		return (EReference)posologyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPosologyType_Text() {
		return (EReference)posologyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPresentationType() {
		return presentationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPresentationType_Cd() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProfessionType() {
		return professionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfessionType_Id() {
		return (EReference)professionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfessionType_Cd() {
		return (EReference)professionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfessionType_Text() {
		return (EReference)professionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantityprefixType() {
		return quantityprefixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantityprefixType_Cd() {
		return (EReference)quantityprefixTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantityType() {
		return quantityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantityType_Decimal() {
		return (EAttribute)quantityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantityType_Unit() {
		return (EReference)quantityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecipientType() {
		return recipientTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRecipientType_Hcparty() {
		return (EReference)recipientTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecipientType_DummyFriend() {
		return (EAttribute)recipientTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefscopeType() {
		return refscopeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefscopeType_Cd() {
		return (EReference)refscopeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefscopeType_Refvalue() {
		return (EReference)refscopeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefvalueType() {
		return refvalueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefvalueType_Minref() {
		return (EReference)refvalueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefvalueType_Maxref() {
		return (EReference)refvalueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefvalueType_Context() {
		return (EReference)refvalueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegimenType() {
		return regimenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegimenType_Group() {
		return (EAttribute)regimenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegimenType_Daynumber() {
		return (EAttribute)regimenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegimenType_Date() {
		return (EAttribute)regimenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegimenType_Weekday() {
		return (EReference)regimenTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegimenType_Daytime() {
		return (EReference)regimenTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegimenType_Quantity() {
		return (EReference)regimenTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRenewalType() {
		return renewalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRenewalType_Decimal() {
		return (EAttribute)renewalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRenewalType_Duration() {
		return (EReference)renewalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRenewalType_Text() {
		return (EReference)renewalTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRouteType() {
		return routeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRouteType_Cd() {
		return (EReference)routeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRRMAXType() {
		return rrmaxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRRMAXType_Value() {
		return (EAttribute)rrmaxTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRRMAXType_TIME() {
		return (EAttribute)rrmaxTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRRMINType() {
		return rrminTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRRMINType_Value() {
		return (EAttribute)rrminTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRRMINType_TIME() {
		return (EAttribute)rrminTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSenderType() {
		return senderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenderType_Hcparty() {
		return (EReference)senderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeverityType() {
		return severityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeverityType_Cd() {
		return (EReference)severityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSexType() {
		return sexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSexType_Cd() {
		return (EReference)sexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSiteType() {
		return siteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSiteType_Cd() {
		return (EReference)siteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSiteType_Text() {
		return (EReference)siteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceType() {
		return sourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSourceType_Cd() {
		return (EReference)sourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceType_Datetime() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceType_Version() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceType_Proof() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecialisationType() {
		return specialisationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialisationType_Cd() {
		return (EReference)specialisationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecialisationType_Version() {
		return (EAttribute)specialisationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardType() {
		return standardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardType_Cd() {
		return (EReference)standardTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardType_Specialisation() {
		return (EReference)standardTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrengthType() {
		return strengthTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrengthType_Decimal() {
		return (EAttribute)strengthTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrengthType_Unit() {
		return (EReference)strengthTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubstanceproductType() {
		return substanceproductTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubstanceproductType_Intendedcd() {
		return (EReference)substanceproductTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubstanceproductType_Deliveredcd() {
		return (EReference)substanceproductTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubstanceproductType_Intendedname() {
		return (EAttribute)substanceproductTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubstanceproductType_Deliveredname() {
		return (EAttribute)substanceproductTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubstanceType() {
		return substanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubstanceType_Cd() {
		return (EReference)substanceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubstanceType_Substancename() {
		return (EAttribute)substanceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTakesType() {
		return takesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTakesType_Low() {
		return (EAttribute)takesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTakesType_High() {
		return (EAttribute)takesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelecomType() {
		return telecomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTelecomType_Id() {
		return (EReference)telecomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTelecomType_Cd() {
		return (EReference)telecomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelecomType_Telecomnumber() {
		return (EAttribute)telecomTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalityType() {
		return temporalityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalityType_Cd() {
		return (EReference)temporalityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextWithLayoutType() {
		return textWithLayoutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextWithLayoutType_Mixed() {
		return (EAttribute)textWithLayoutTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextWithLayoutType_Any() {
		return (EAttribute)textWithLayoutTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextWithLayoutType_L() {
		return (EAttribute)textWithLayoutTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThirdpayercontractType() {
		return thirdpayercontractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThirdpayercontractType_Cd() {
		return (EReference)thirdpayercontractTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimequantityType() {
		return timequantityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimequantityType_Decimal() {
		return (EAttribute)timequantityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimequantityType_Unit() {
		return (EReference)timequantityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeunitType() {
		return timeunitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeunitType_Cd() {
		return (EReference)timeunitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransactionType() {
		return transactionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_Confidentiality() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_Id() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_Cd() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionType_Date() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionType_Time() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_Author() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_Redactor() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionType_Iscomplete() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionType_Isvalidated() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionType_Expirationdate() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionType_Group() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_Heading() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_Item() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_Text() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_TextWithLayout() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransactionType_Lnk() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionType_Recorddatetime() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransactionType_Version() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitType() {
		return unitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitType_Cd() {
		return (EReference)unitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUrgencyType() {
		return urgencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUrgencyType_Cd() {
		return (EReference)urgencyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeekdayType() {
		return weekdayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeekdayType_Cd() {
		return (EReference)weekdayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeekdayType1() {
		return weekdayType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeekdayType1_Weeknumber() {
		return (EAttribute)weekdayType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KmehrFactory getKmehrFactory() {
		return (KmehrFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		acknowledgmentTypeEClass = createEClass(ACKNOWLEDGMENT_TYPE);
		createEReference(acknowledgmentTypeEClass, ACKNOWLEDGMENT_TYPE__CD);

		addressTypeEClass = createEClass(ADDRESS_TYPE);

		addressTypeBaseEClass = createEClass(ADDRESS_TYPE_BASE);
		createEReference(addressTypeBaseEClass, ADDRESS_TYPE_BASE__ID);
		createEReference(addressTypeBaseEClass, ADDRESS_TYPE_BASE__CD);
		createEReference(addressTypeBaseEClass, ADDRESS_TYPE_BASE__COUNTRY);
		createEAttribute(addressTypeBaseEClass, ADDRESS_TYPE_BASE__ZIP);
		createEAttribute(addressTypeBaseEClass, ADDRESS_TYPE_BASE__NIS);
		createEAttribute(addressTypeBaseEClass, ADDRESS_TYPE_BASE__CITY);
		createEAttribute(addressTypeBaseEClass, ADDRESS_TYPE_BASE__DISTRICT);
		createEAttribute(addressTypeBaseEClass, ADDRESS_TYPE_BASE__STREET);
		createEAttribute(addressTypeBaseEClass, ADDRESS_TYPE_BASE__HOUSENUMBER);
		createEAttribute(addressTypeBaseEClass, ADDRESS_TYPE_BASE__POSTBOXNUMBER);
		createEReference(addressTypeBaseEClass, ADDRESS_TYPE_BASE__TEXT);

		administrationquantityTypeEClass = createEClass(ADMINISTRATIONQUANTITY_TYPE);
		createEAttribute(administrationquantityTypeEClass, ADMINISTRATIONQUANTITY_TYPE__DECIMAL);
		createEReference(administrationquantityTypeEClass, ADMINISTRATIONQUANTITY_TYPE__UNIT);

		administrationunitTypeEClass = createEClass(ADMINISTRATIONUNIT_TYPE);
		createEReference(administrationunitTypeEClass, ADMINISTRATIONUNIT_TYPE__CD);

		authorTypeEClass = createEClass(AUTHOR_TYPE);
		createEReference(authorTypeEClass, AUTHOR_TYPE__HCPARTY);

		base64EncryptedDataTypeEClass = createEClass(BASE64_ENCRYPTED_DATA_TYPE);
		createEReference(base64EncryptedDataTypeEClass, BASE64_ENCRYPTED_DATA_TYPE__CD);
		createEReference(base64EncryptedDataTypeEClass, BASE64_ENCRYPTED_DATA_TYPE__BASE64_ENCRYPTED_VALUE);

		base64EncryptedValueTypeEClass = createEClass(BASE64_ENCRYPTED_VALUE_TYPE);
		createEAttribute(base64EncryptedValueTypeEClass, BASE64_ENCRYPTED_VALUE_TYPE__VALUE);
		createEAttribute(base64EncryptedValueTypeEClass, BASE64_ENCRYPTED_VALUE_TYPE__ENCODING);

		certaintyTypeEClass = createEClass(CERTAINTY_TYPE);
		createEReference(certaintyTypeEClass, CERTAINTY_TYPE__CD);

		civilstateTypeEClass = createEClass(CIVILSTATE_TYPE);
		createEReference(civilstateTypeEClass, CIVILSTATE_TYPE__CD);

		compoundprescriptionTypeEClass = createEClass(COMPOUNDPRESCRIPTION_TYPE);
		createEAttribute(compoundprescriptionTypeEClass, COMPOUNDPRESCRIPTION_TYPE__MIXED);
		createEReference(compoundprescriptionTypeEClass, COMPOUNDPRESCRIPTION_TYPE__COMPOUND);
		createEReference(compoundprescriptionTypeEClass, COMPOUNDPRESCRIPTION_TYPE__FORMULARYREFERENCE);
		createEReference(compoundprescriptionTypeEClass, COMPOUNDPRESCRIPTION_TYPE__MAGISTRALTEXT);
		createEReference(compoundprescriptionTypeEClass, COMPOUNDPRESCRIPTION_TYPE__GALENICFORM);
		createEReference(compoundprescriptionTypeEClass, COMPOUNDPRESCRIPTION_TYPE__QUANTITY);
		createEAttribute(compoundprescriptionTypeEClass, COMPOUNDPRESCRIPTION_TYPE__L);

		compoundTypeEClass = createEClass(COMPOUND_TYPE);
		createEReference(compoundTypeEClass, COMPOUND_TYPE__ID);
		createEReference(compoundTypeEClass, COMPOUND_TYPE__MEDICINALPRODUCT);
		createEReference(compoundTypeEClass, COMPOUND_TYPE__SUBSTANCE);
		createEReference(compoundTypeEClass, COMPOUND_TYPE__QUANTITYPREFIX);
		createEReference(compoundTypeEClass, COMPOUND_TYPE__QUANTITY);

		confidentialityTypeEClass = createEClass(CONFIDENTIALITY_TYPE);
		createEReference(confidentialityTypeEClass, CONFIDENTIALITY_TYPE__HCPARTY);

		contentlocalitemattributeTypeEClass = createEClass(CONTENTLOCALITEMATTRIBUTE_TYPE);
		createEReference(contentlocalitemattributeTypeEClass, CONTENTLOCALITEMATTRIBUTE_TYPE__ID);
		createEReference(contentlocalitemattributeTypeEClass, CONTENTLOCALITEMATTRIBUTE_TYPE__CD);
		createEAttribute(contentlocalitemattributeTypeEClass, CONTENTLOCALITEMATTRIBUTE_TYPE__DECIMAL);
		createEAttribute(contentlocalitemattributeTypeEClass, CONTENTLOCALITEMATTRIBUTE_TYPE__BOOLEAN);
		createEReference(contentlocalitemattributeTypeEClass, CONTENTLOCALITEMATTRIBUTE_TYPE__TEXT);
		createEAttribute(contentlocalitemattributeTypeEClass, CONTENTLOCALITEMATTRIBUTE_TYPE__DATE);
		createEAttribute(contentlocalitemattributeTypeEClass, CONTENTLOCALITEMATTRIBUTE_TYPE__TIME);
		createEReference(contentlocalitemattributeTypeEClass, CONTENTLOCALITEMATTRIBUTE_TYPE__HCPARTY);
		createEReference(contentlocalitemattributeTypeEClass, CONTENTLOCALITEMATTRIBUTE_TYPE__PERSON);
		createEReference(contentlocalitemattributeTypeEClass, CONTENTLOCALITEMATTRIBUTE_TYPE__LNK);
		createEReference(contentlocalitemattributeTypeEClass, CONTENTLOCALITEMATTRIBUTE_TYPE__UNIT);

		contentTypeEClass = createEClass(CONTENT_TYPE);
		createEReference(contentTypeEClass, CONTENT_TYPE__ID);
		createEReference(contentTypeEClass, CONTENT_TYPE__CD);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__DECIMAL);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__UNSIGNED_INT);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__BOOLEAN);
		createEReference(contentTypeEClass, CONTENT_TYPE__TEXT);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__YEAR);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__YEARMONTH);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__DATE);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__TIME);
		createEReference(contentTypeEClass, CONTENT_TYPE__HCPARTY);
		createEReference(contentTypeEClass, CONTENT_TYPE__PERSON);
		createEReference(contentTypeEClass, CONTENT_TYPE__INSURANCE);
		createEReference(contentTypeEClass, CONTENT_TYPE__INCAPACITY);
		createEReference(contentTypeEClass, CONTENT_TYPE__ERROR);
		createEReference(contentTypeEClass, CONTENT_TYPE__MEDICINALPRODUCT);
		createEReference(contentTypeEClass, CONTENT_TYPE__SUBSTANCEPRODUCT);
		createEReference(contentTypeEClass, CONTENT_TYPE__COMPOUNDPRESCRIPTION);
		createEReference(contentTypeEClass, CONTENT_TYPE__MEDICATION);
		createEReference(contentTypeEClass, CONTENT_TYPE__HOLTER);
		createEReference(contentTypeEClass, CONTENT_TYPE__ECG);
		createEReference(contentTypeEClass, CONTENT_TYPE__BACTERIOLOGY);
		createEReference(contentTypeEClass, CONTENT_TYPE__LNK);
		createEReference(contentTypeEClass, CONTENT_TYPE__LOCATION);
		createEReference(contentTypeEClass, CONTENT_TYPE__UNIT);
		createEReference(contentTypeEClass, CONTENT_TYPE__MINREF);
		createEReference(contentTypeEClass, CONTENT_TYPE__MAXREF);
		createEReference(contentTypeEClass, CONTENT_TYPE__REFSCOPE);

		costTypeEClass = createEClass(COST_TYPE);
		createEAttribute(costTypeEClass, COST_TYPE__DECIMAL);
		createEReference(costTypeEClass, COST_TYPE__UNIT);

		countryTypeEClass = createEClass(COUNTRY_TYPE);
		createEReference(countryTypeEClass, COUNTRY_TYPE__CD);

		dateTypeEClass = createEClass(DATE_TYPE);

		dayperiodTypeEClass = createEClass(DAYPERIOD_TYPE);
		createEReference(dayperiodTypeEClass, DAYPERIOD_TYPE__CD);

		daytimeTypeEClass = createEClass(DAYTIME_TYPE);
		createEAttribute(daytimeTypeEClass, DAYTIME_TYPE__TIME);
		createEReference(daytimeTypeEClass, DAYTIME_TYPE__DAYPERIOD);

		denominatorTypeEClass = createEClass(DENOMINATOR_TYPE);
		createEReference(denominatorTypeEClass, DENOMINATOR_TYPE__QUANTITY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KMEHRMESSAGE);

		durationTypeEClass = createEClass(DURATION_TYPE);
		createEAttribute(durationTypeEClass, DURATION_TYPE__DECIMAL);
		createEReference(durationTypeEClass, DURATION_TYPE__UNIT);

		errorMyCarenetTypeEClass = createEClass(ERROR_MY_CARENET_TYPE);
		createEReference(errorMyCarenetTypeEClass, ERROR_MY_CARENET_TYPE__CD);
		createEReference(errorMyCarenetTypeEClass, ERROR_MY_CARENET_TYPE__DESCRIPTION);
		createEAttribute(errorMyCarenetTypeEClass, ERROR_MY_CARENET_TYPE__URL);

		errorTypeEClass = createEClass(ERROR_TYPE);
		createEReference(errorTypeEClass, ERROR_TYPE__ID);
		createEReference(errorTypeEClass, ERROR_TYPE__CD);
		createEReference(errorTypeEClass, ERROR_TYPE__DESCRIPTION);
		createEAttribute(errorTypeEClass, ERROR_TYPE__URL);

		externalsourceTypeEClass = createEClass(EXTERNALSOURCE_TYPE);
		createEReference(externalsourceTypeEClass, EXTERNALSOURCE_TYPE__SOURCE);

		fcmaxTypeEClass = createEClass(FCMAX_TYPE);
		createEAttribute(fcmaxTypeEClass, FCMAX_TYPE__VALUE);
		createEAttribute(fcmaxTypeEClass, FCMAX_TYPE__TIME);

		fcminTypeEClass = createEClass(FCMIN_TYPE);
		createEAttribute(fcminTypeEClass, FCMIN_TYPE__VALUE);
		createEAttribute(fcminTypeEClass, FCMIN_TYPE__TIME);

		feedbackTypeEClass = createEClass(FEEDBACK_TYPE);
		createEAttribute(feedbackTypeEClass, FEEDBACK_TYPE__REPORTREQUESTED);
		createEReference(feedbackTypeEClass, FEEDBACK_TYPE__TEXT);

		folderTypeEClass = createEClass(FOLDER_TYPE);
		createEReference(folderTypeEClass, FOLDER_TYPE__CONFIDENTIALITY);
		createEReference(folderTypeEClass, FOLDER_TYPE__ID);
		createEReference(folderTypeEClass, FOLDER_TYPE__PATIENT);
		createEReference(folderTypeEClass, FOLDER_TYPE__TRANSACTION);
		createEReference(folderTypeEClass, FOLDER_TYPE__TEXT);
		createEReference(folderTypeEClass, FOLDER_TYPE__LNK);

		formularyreferenceTypeEClass = createEClass(FORMULARYREFERENCE_TYPE);
		createEReference(formularyreferenceTypeEClass, FORMULARYREFERENCE_TYPE__CD);
		createEAttribute(formularyreferenceTypeEClass, FORMULARYREFERENCE_TYPE__FORMULARYNAME);

		frequencyTypeEClass = createEClass(FREQUENCY_TYPE);
		createEReference(frequencyTypeEClass, FREQUENCY_TYPE__NOMINATOR);
		createEReference(frequencyTypeEClass, FREQUENCY_TYPE__DENOMINATOR);
		createEAttribute(frequencyTypeEClass, FREQUENCY_TYPE__DECIMAL);
		createEReference(frequencyTypeEClass, FREQUENCY_TYPE__UNIT);
		createEReference(frequencyTypeEClass, FREQUENCY_TYPE__TEXT);
		createEReference(frequencyTypeEClass, FREQUENCY_TYPE__PERIODICITY);

		galenicformTypeEClass = createEClass(GALENICFORM_TYPE);
		createEReference(galenicformTypeEClass, GALENICFORM_TYPE__CD);
		createEReference(galenicformTypeEClass, GALENICFORM_TYPE__GALENICFORMTEXT);

		hcpartyTypeEClass = createEClass(HCPARTY_TYPE);
		createEReference(hcpartyTypeEClass, HCPARTY_TYPE__ID);
		createEReference(hcpartyTypeEClass, HCPARTY_TYPE__CD);
		createEAttribute(hcpartyTypeEClass, HCPARTY_TYPE__NAME);
		createEAttribute(hcpartyTypeEClass, HCPARTY_TYPE__FIRSTNAME);
		createEAttribute(hcpartyTypeEClass, HCPARTY_TYPE__FAMILYNAME);
		createEReference(hcpartyTypeEClass, HCPARTY_TYPE__ADDRESS);
		createEReference(hcpartyTypeEClass, HCPARTY_TYPE__TELECOM);

		headerTypeEClass = createEClass(HEADER_TYPE);
		createEReference(headerTypeEClass, HEADER_TYPE__CONFIDENTIALITY);
		createEReference(headerTypeEClass, HEADER_TYPE__STANDARD);
		createEReference(headerTypeEClass, HEADER_TYPE__ID);
		createEAttribute(headerTypeEClass, HEADER_TYPE__DATE);
		createEAttribute(headerTypeEClass, HEADER_TYPE__TIME);
		createEReference(headerTypeEClass, HEADER_TYPE__SENDER);
		createEReference(headerTypeEClass, HEADER_TYPE__RECIPIENT);
		createEReference(headerTypeEClass, HEADER_TYPE__URGENCY);
		createEReference(headerTypeEClass, HEADER_TYPE__ACKNOWLEDGMENT);
		createEReference(headerTypeEClass, HEADER_TYPE__TEXT);
		createEReference(headerTypeEClass, HEADER_TYPE__LNK);
		createEAttribute(headerTypeEClass, HEADER_TYPE__EXPIRATIONDATE);
		createEReference(headerTypeEClass, HEADER_TYPE__EXTERNALSOURCE);

		headingTypeEClass = createEClass(HEADING_TYPE);
		createEReference(headingTypeEClass, HEADING_TYPE__CONFIDENTIALITY);
		createEReference(headingTypeEClass, HEADING_TYPE__ID);
		createEReference(headingTypeEClass, HEADING_TYPE__CD);
		createEAttribute(headingTypeEClass, HEADING_TYPE__GROUP);
		createEReference(headingTypeEClass, HEADING_TYPE__HEADING);
		createEReference(headingTypeEClass, HEADING_TYPE__ITEM);
		createEReference(headingTypeEClass, HEADING_TYPE__TEXT);
		createEReference(headingTypeEClass, HEADING_TYPE__LNK);

		holterTypeEClass = createEClass(HOLTER_TYPE);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__FCAVG);
		createEReference(holterTypeEClass, HOLTER_TYPE__FCMAX);
		createEReference(holterTypeEClass, HOLTER_TYPE__FCMIN);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__FCAVGD);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__FCAVGN);
		createEReference(holterTypeEClass, HOLTER_TYPE__RRMAX);
		createEReference(holterTypeEClass, HOLTER_TYPE__RRMIN);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__QRSTOT);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__BRADY);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__PAUSE);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__LONG);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__ESV);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__DBLV);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__SALVV);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__BGV);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__TGV);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__TACHY);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__ESSV);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__DBLSV);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__SALVSV);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__BGSV);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__TGSV);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__TACHYSV);
		createEAttribute(holterTypeEClass, HOLTER_TYPE__RRINST);

		incapacityreasonTypeEClass = createEClass(INCAPACITYREASON_TYPE);
		createEReference(incapacityreasonTypeEClass, INCAPACITYREASON_TYPE__CD);

		incapacityTypeEClass = createEClass(INCAPACITY_TYPE);
		createEReference(incapacityTypeEClass, INCAPACITY_TYPE__CD);
		createEReference(incapacityTypeEClass, INCAPACITY_TYPE__INCAPACITYREASON);
		createEAttribute(incapacityTypeEClass, INCAPACITY_TYPE__PERCENTAGE);
		createEAttribute(incapacityTypeEClass, INCAPACITY_TYPE__OUTOFHOMEALLOWED);

		insuranceTypeEClass = createEClass(INSURANCE_TYPE);
		createEReference(insuranceTypeEClass, INSURANCE_TYPE__ID);
		createEAttribute(insuranceTypeEClass, INSURANCE_TYPE__MEMBERSHIP);
		createEAttribute(insuranceTypeEClass, INSURANCE_TYPE__SISCARD);
		createEAttribute(insuranceTypeEClass, INSURANCE_TYPE__BEGINDATE);
		createEAttribute(insuranceTypeEClass, INSURANCE_TYPE__ENDDATE);
		createEAttribute(insuranceTypeEClass, INSURANCE_TYPE__CG1);
		createEAttribute(insuranceTypeEClass, INSURANCE_TYPE__CG2);
		createEAttribute(insuranceTypeEClass, INSURANCE_TYPE__SOCIALFRANCHISEPERIOD1);
		createEAttribute(insuranceTypeEClass, INSURANCE_TYPE__SOCIALFRANCHISEPERIOD2);
		createEReference(insuranceTypeEClass, INSURANCE_TYPE__PERSONALPART);
		createEReference(insuranceTypeEClass, INSURANCE_TYPE__THIRDPAYERCONTRACT);
		createEAttribute(insuranceTypeEClass, INSURANCE_TYPE__BEGINDATEPAYMENT);
		createEAttribute(insuranceTypeEClass, INSURANCE_TYPE__APPROVALNUMBER);

		itemTypeEClass = createEClass(ITEM_TYPE);
		createEReference(itemTypeEClass, ITEM_TYPE__CONFIDENTIALITY);
		createEReference(itemTypeEClass, ITEM_TYPE__ID);
		createEReference(itemTypeEClass, ITEM_TYPE__CD);
		createEReference(itemTypeEClass, ITEM_TYPE__CONTENT);
		createEReference(itemTypeEClass, ITEM_TYPE__TEXT);
		createEReference(itemTypeEClass, ITEM_TYPE__AUTHOR);
		createEReference(itemTypeEClass, ITEM_TYPE__BEGINMOMENT);
		createEReference(itemTypeEClass, ITEM_TYPE__ENDMOMENT);
		createEAttribute(itemTypeEClass, ITEM_TYPE__ISCOMPLETE);
		createEAttribute(itemTypeEClass, ITEM_TYPE__ISVALIDATED);
		createEReference(itemTypeEClass, ITEM_TYPE__LIFECYCLE);
		createEAttribute(itemTypeEClass, ITEM_TYPE__ISRELEVANT);
		createEReference(itemTypeEClass, ITEM_TYPE__SEVERITY);
		createEReference(itemTypeEClass, ITEM_TYPE__CERTAINTY);
		createEReference(itemTypeEClass, ITEM_TYPE__TEMPORALITY);
		createEReference(itemTypeEClass, ITEM_TYPE__URGENCY);
		createEReference(itemTypeEClass, ITEM_TYPE__QUANTITY);
		createEReference(itemTypeEClass, ITEM_TYPE__STRENGTH);
		createEReference(itemTypeEClass, ITEM_TYPE__FREQUENCY);
		createEReference(itemTypeEClass, ITEM_TYPE__SITE);
		createEReference(itemTypeEClass, ITEM_TYPE__COST);
		createEReference(itemTypeEClass, ITEM_TYPE__DAYPERIOD);
		createEReference(itemTypeEClass, ITEM_TYPE__DURATION);
		createEReference(itemTypeEClass, ITEM_TYPE__POSOLOGY);
		createEReference(itemTypeEClass, ITEM_TYPE__REGIMEN);
		createEAttribute(itemTypeEClass, ITEM_TYPE__DELIVERYDATE);
		createEReference(itemTypeEClass, ITEM_TYPE__RENEWAL);
		createEReference(itemTypeEClass, ITEM_TYPE__ROUTE);
		createEAttribute(itemTypeEClass, ITEM_TYPE__BATCH);
		createEReference(itemTypeEClass, ITEM_TYPE__INSTRUCTIONFOROVERDOSING);
		createEReference(itemTypeEClass, ITEM_TYPE__INSTRUCTIONFORPATIENT);
		createEReference(itemTypeEClass, ITEM_TYPE__INSTRUCTIONFORREIMBURSEMENT);
		createEAttribute(itemTypeEClass, ITEM_TYPE__ISSUBSTITUTIONALLOWED);
		createEReference(itemTypeEClass, ITEM_TYPE__FEEDBACK);
		createEReference(itemTypeEClass, ITEM_TYPE__LOCAL);
		createEAttribute(itemTypeEClass, ITEM_TYPE__RECORDDATETIME);
		createEReference(itemTypeEClass, ITEM_TYPE__LNK);

		kmehrmessageTypeEClass = createEClass(KMEHRMESSAGE_TYPE);
		createEReference(kmehrmessageTypeEClass, KMEHRMESSAGE_TYPE__CONFIDENTIALITY);
		createEReference(kmehrmessageTypeEClass, KMEHRMESSAGE_TYPE__HEADER);
		createEReference(kmehrmessageTypeEClass, KMEHRMESSAGE_TYPE__FOLDER);
		createEReference(kmehrmessageTypeEClass, KMEHRMESSAGE_TYPE__SIGNATURE);
		createEReference(kmehrmessageTypeEClass, KMEHRMESSAGE_TYPE__ENCRYPTED_DATA);
		createEReference(kmehrmessageTypeEClass, KMEHRMESSAGE_TYPE__BASE64_ENCRYPTED_DATA);

		lifecycleTypeEClass = createEClass(LIFECYCLE_TYPE);
		createEReference(lifecycleTypeEClass, LIFECYCLE_TYPE__CD);

		localitemattributeTypeEClass = createEClass(LOCALITEMATTRIBUTE_TYPE);
		createEReference(localitemattributeTypeEClass, LOCALITEMATTRIBUTE_TYPE__ID);
		createEReference(localitemattributeTypeEClass, LOCALITEMATTRIBUTE_TYPE__CD);
		createEReference(localitemattributeTypeEClass, LOCALITEMATTRIBUTE_TYPE__CONTENT);

		locationBirthPlaceTypeEClass = createEClass(LOCATION_BIRTH_PLACE_TYPE);
		createEReference(locationBirthPlaceTypeEClass, LOCATION_BIRTH_PLACE_TYPE__CD);
		createEReference(locationBirthPlaceTypeEClass, LOCATION_BIRTH_PLACE_TYPE__TEXT);
		createEReference(locationBirthPlaceTypeEClass, LOCATION_BIRTH_PLACE_TYPE__ADDRESS);

		maxrefTypeEClass = createEClass(MAXREF_TYPE);
		createEAttribute(maxrefTypeEClass, MAXREF_TYPE__DECIMAL);
		createEReference(maxrefTypeEClass, MAXREF_TYPE__TEXT);

		medicationTypeEClass = createEClass(MEDICATION_TYPE);
		createEReference(medicationTypeEClass, MEDICATION_TYPE__CD);
		createEReference(medicationTypeEClass, MEDICATION_TYPE__INN);
		createEReference(medicationTypeEClass, MEDICATION_TYPE__MAGISTRAL);
		createEAttribute(medicationTypeEClass, MEDICATION_TYPE__TRADENAME);
		createEReference(medicationTypeEClass, MEDICATION_TYPE__PRESENTATION);
		createEReference(medicationTypeEClass, MEDICATION_TYPE__STRENGTH);
		createEReference(medicationTypeEClass, MEDICATION_TYPE__ROUTE);
		createEAttribute(medicationTypeEClass, MEDICATION_TYPE__BATCH);
		createEAttribute(medicationTypeEClass, MEDICATION_TYPE__NUMBEROFPACKAGE);
		createEReference(medicationTypeEClass, MEDICATION_TYPE__PACKAGE);
		createEAttribute(medicationTypeEClass, MEDICATION_TYPE__QUANTITYPERPACKAGE);
		createEReference(medicationTypeEClass, MEDICATION_TYPE__INSTRUCTIONFOROVERDOSING);
		createEReference(medicationTypeEClass, MEDICATION_TYPE__INSTRUCTIONFORPATIENT);
		createEReference(medicationTypeEClass, MEDICATION_TYPE__INSTRUCTIONFORREIMBURSEMENT);
		createEAttribute(medicationTypeEClass, MEDICATION_TYPE__ISSUBSTITUTIONALLOWED);

		medicinalProductTypeEClass = createEClass(MEDICINAL_PRODUCT_TYPE);
		createEReference(medicinalProductTypeEClass, MEDICINAL_PRODUCT_TYPE__INTENDEDCD);
		createEReference(medicinalProductTypeEClass, MEDICINAL_PRODUCT_TYPE__DELIVEREDCD);
		createEAttribute(medicinalProductTypeEClass, MEDICINAL_PRODUCT_TYPE__INTENDEDNAME);
		createEAttribute(medicinalProductTypeEClass, MEDICINAL_PRODUCT_TYPE__DELIVEREDNAME);

		memberinsuranceTypeEClass = createEClass(MEMBERINSURANCE_TYPE);
		createEReference(memberinsuranceTypeEClass, MEMBERINSURANCE_TYPE__ID);
		createEAttribute(memberinsuranceTypeEClass, MEMBERINSURANCE_TYPE__MEMBERSHIP);

		minrefTypeEClass = createEClass(MINREF_TYPE);
		createEAttribute(minrefTypeEClass, MINREF_TYPE__DECIMAL);
		createEReference(minrefTypeEClass, MINREF_TYPE__TEXT);

		momentTypeEClass = createEClass(MOMENT_TYPE);
		createEAttribute(momentTypeEClass, MOMENT_TYPE__YEAR);
		createEAttribute(momentTypeEClass, MOMENT_TYPE__YEARMONTH);
		createEAttribute(momentTypeEClass, MOMENT_TYPE__DATE);
		createEAttribute(momentTypeEClass, MOMENT_TYPE__TIME);
		createEReference(momentTypeEClass, MOMENT_TYPE__TEXT);

		nationalityTypeEClass = createEClass(NATIONALITY_TYPE);
		createEReference(nationalityTypeEClass, NATIONALITY_TYPE__CD);

		nominatorTypeEClass = createEClass(NOMINATOR_TYPE);
		createEReference(nominatorTypeEClass, NOMINATOR_TYPE__QUANTITY);

		packageTypeEClass = createEClass(PACKAGE_TYPE);
		createEReference(packageTypeEClass, PACKAGE_TYPE__CD);

		periodicityTypeEClass = createEClass(PERIODICITY_TYPE);
		createEReference(periodicityTypeEClass, PERIODICITY_TYPE__CD);

		personalpartTypeEClass = createEClass(PERSONALPART_TYPE);
		createEReference(personalpartTypeEClass, PERSONALPART_TYPE__ID);
		createEReference(personalpartTypeEClass, PERSONALPART_TYPE__CD);
		createEAttribute(personalpartTypeEClass, PERSONALPART_TYPE__DATE);
		createEAttribute(personalpartTypeEClass, PERSONALPART_TYPE__TIME);

		personTypeEClass = createEClass(PERSON_TYPE);
		createEReference(personTypeEClass, PERSON_TYPE__ID);
		createEAttribute(personTypeEClass, PERSON_TYPE__FIRSTNAME);
		createEAttribute(personTypeEClass, PERSON_TYPE__FAMILYNAME);
		createEReference(personTypeEClass, PERSON_TYPE__BIRTHDATE);
		createEReference(personTypeEClass, PERSON_TYPE__BIRTHLOCATION);
		createEReference(personTypeEClass, PERSON_TYPE__DEATHDATE);
		createEReference(personTypeEClass, PERSON_TYPE__DEATHLOCATION);
		createEReference(personTypeEClass, PERSON_TYPE__SEX);
		createEReference(personTypeEClass, PERSON_TYPE__NATIONALITY);
		createEReference(personTypeEClass, PERSON_TYPE__ADDRESS);
		createEReference(personTypeEClass, PERSON_TYPE__TELECOM);
		createEAttribute(personTypeEClass, PERSON_TYPE__USUALLANGUAGE);
		createEReference(personTypeEClass, PERSON_TYPE__PROFESSION);
		createEReference(personTypeEClass, PERSON_TYPE__INSURANCYSTATUS);
		createEReference(personTypeEClass, PERSON_TYPE__INSURANCYMEMBERSHIP);
		createEAttribute(personTypeEClass, PERSON_TYPE__RECORDDATETIME);
		createEReference(personTypeEClass, PERSON_TYPE__TEXT);
		createEReference(personTypeEClass, PERSON_TYPE__CIVILSTATE);

		personTypeLightEClass = createEClass(PERSON_TYPE_LIGHT);
		createEReference(personTypeLightEClass, PERSON_TYPE_LIGHT__ID);
		createEAttribute(personTypeLightEClass, PERSON_TYPE_LIGHT__FIRSTNAME);
		createEAttribute(personTypeLightEClass, PERSON_TYPE_LIGHT__FAMILYNAME);
		createEReference(personTypeLightEClass, PERSON_TYPE_LIGHT__ADDRESS);
		createEReference(personTypeLightEClass, PERSON_TYPE_LIGHT__TELECOM);

		posologyTypeEClass = createEClass(POSOLOGY_TYPE);
		createEAttribute(posologyTypeEClass, POSOLOGY_TYPE__LOW);
		createEAttribute(posologyTypeEClass, POSOLOGY_TYPE__HIGH);
		createEReference(posologyTypeEClass, POSOLOGY_TYPE__UNIT);
		createEReference(posologyTypeEClass, POSOLOGY_TYPE__TAKES);
		createEReference(posologyTypeEClass, POSOLOGY_TYPE__TEXT);

		presentationTypeEClass = createEClass(PRESENTATION_TYPE);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__CD);

		professionTypeEClass = createEClass(PROFESSION_TYPE);
		createEReference(professionTypeEClass, PROFESSION_TYPE__ID);
		createEReference(professionTypeEClass, PROFESSION_TYPE__CD);
		createEReference(professionTypeEClass, PROFESSION_TYPE__TEXT);

		quantityprefixTypeEClass = createEClass(QUANTITYPREFIX_TYPE);
		createEReference(quantityprefixTypeEClass, QUANTITYPREFIX_TYPE__CD);

		quantityTypeEClass = createEClass(QUANTITY_TYPE);
		createEAttribute(quantityTypeEClass, QUANTITY_TYPE__DECIMAL);
		createEReference(quantityTypeEClass, QUANTITY_TYPE__UNIT);

		recipientTypeEClass = createEClass(RECIPIENT_TYPE);
		createEReference(recipientTypeEClass, RECIPIENT_TYPE__HCPARTY);
		createEAttribute(recipientTypeEClass, RECIPIENT_TYPE__DUMMY_FRIEND);

		refscopeTypeEClass = createEClass(REFSCOPE_TYPE);
		createEReference(refscopeTypeEClass, REFSCOPE_TYPE__CD);
		createEReference(refscopeTypeEClass, REFSCOPE_TYPE__REFVALUE);

		refvalueTypeEClass = createEClass(REFVALUE_TYPE);
		createEReference(refvalueTypeEClass, REFVALUE_TYPE__MINREF);
		createEReference(refvalueTypeEClass, REFVALUE_TYPE__MAXREF);
		createEReference(refvalueTypeEClass, REFVALUE_TYPE__CONTEXT);

		regimenTypeEClass = createEClass(REGIMEN_TYPE);
		createEAttribute(regimenTypeEClass, REGIMEN_TYPE__GROUP);
		createEAttribute(regimenTypeEClass, REGIMEN_TYPE__DAYNUMBER);
		createEAttribute(regimenTypeEClass, REGIMEN_TYPE__DATE);
		createEReference(regimenTypeEClass, REGIMEN_TYPE__WEEKDAY);
		createEReference(regimenTypeEClass, REGIMEN_TYPE__DAYTIME);
		createEReference(regimenTypeEClass, REGIMEN_TYPE__QUANTITY);

		renewalTypeEClass = createEClass(RENEWAL_TYPE);
		createEAttribute(renewalTypeEClass, RENEWAL_TYPE__DECIMAL);
		createEReference(renewalTypeEClass, RENEWAL_TYPE__DURATION);
		createEReference(renewalTypeEClass, RENEWAL_TYPE__TEXT);

		routeTypeEClass = createEClass(ROUTE_TYPE);
		createEReference(routeTypeEClass, ROUTE_TYPE__CD);

		rrmaxTypeEClass = createEClass(RRMAX_TYPE);
		createEAttribute(rrmaxTypeEClass, RRMAX_TYPE__VALUE);
		createEAttribute(rrmaxTypeEClass, RRMAX_TYPE__TIME);

		rrminTypeEClass = createEClass(RRMIN_TYPE);
		createEAttribute(rrminTypeEClass, RRMIN_TYPE__VALUE);
		createEAttribute(rrminTypeEClass, RRMIN_TYPE__TIME);

		senderTypeEClass = createEClass(SENDER_TYPE);
		createEReference(senderTypeEClass, SENDER_TYPE__HCPARTY);

		severityTypeEClass = createEClass(SEVERITY_TYPE);
		createEReference(severityTypeEClass, SEVERITY_TYPE__CD);

		sexTypeEClass = createEClass(SEX_TYPE);
		createEReference(sexTypeEClass, SEX_TYPE__CD);

		siteTypeEClass = createEClass(SITE_TYPE);
		createEReference(siteTypeEClass, SITE_TYPE__CD);
		createEReference(siteTypeEClass, SITE_TYPE__TEXT);

		sourceTypeEClass = createEClass(SOURCE_TYPE);
		createEReference(sourceTypeEClass, SOURCE_TYPE__CD);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__DATETIME);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__VERSION);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__PROOF);

		specialisationTypeEClass = createEClass(SPECIALISATION_TYPE);
		createEReference(specialisationTypeEClass, SPECIALISATION_TYPE__CD);
		createEAttribute(specialisationTypeEClass, SPECIALISATION_TYPE__VERSION);

		standardTypeEClass = createEClass(STANDARD_TYPE);
		createEReference(standardTypeEClass, STANDARD_TYPE__CD);
		createEReference(standardTypeEClass, STANDARD_TYPE__SPECIALISATION);

		strengthTypeEClass = createEClass(STRENGTH_TYPE);
		createEAttribute(strengthTypeEClass, STRENGTH_TYPE__DECIMAL);
		createEReference(strengthTypeEClass, STRENGTH_TYPE__UNIT);

		substanceproductTypeEClass = createEClass(SUBSTANCEPRODUCT_TYPE);
		createEReference(substanceproductTypeEClass, SUBSTANCEPRODUCT_TYPE__INTENDEDCD);
		createEReference(substanceproductTypeEClass, SUBSTANCEPRODUCT_TYPE__DELIVEREDCD);
		createEAttribute(substanceproductTypeEClass, SUBSTANCEPRODUCT_TYPE__INTENDEDNAME);
		createEAttribute(substanceproductTypeEClass, SUBSTANCEPRODUCT_TYPE__DELIVEREDNAME);

		substanceTypeEClass = createEClass(SUBSTANCE_TYPE);
		createEReference(substanceTypeEClass, SUBSTANCE_TYPE__CD);
		createEAttribute(substanceTypeEClass, SUBSTANCE_TYPE__SUBSTANCENAME);

		takesTypeEClass = createEClass(TAKES_TYPE);
		createEAttribute(takesTypeEClass, TAKES_TYPE__LOW);
		createEAttribute(takesTypeEClass, TAKES_TYPE__HIGH);

		telecomTypeEClass = createEClass(TELECOM_TYPE);
		createEReference(telecomTypeEClass, TELECOM_TYPE__ID);
		createEReference(telecomTypeEClass, TELECOM_TYPE__CD);
		createEAttribute(telecomTypeEClass, TELECOM_TYPE__TELECOMNUMBER);

		temporalityTypeEClass = createEClass(TEMPORALITY_TYPE);
		createEReference(temporalityTypeEClass, TEMPORALITY_TYPE__CD);

		textWithLayoutTypeEClass = createEClass(TEXT_WITH_LAYOUT_TYPE);
		createEAttribute(textWithLayoutTypeEClass, TEXT_WITH_LAYOUT_TYPE__MIXED);
		createEAttribute(textWithLayoutTypeEClass, TEXT_WITH_LAYOUT_TYPE__ANY);
		createEAttribute(textWithLayoutTypeEClass, TEXT_WITH_LAYOUT_TYPE__L);

		thirdpayercontractTypeEClass = createEClass(THIRDPAYERCONTRACT_TYPE);
		createEReference(thirdpayercontractTypeEClass, THIRDPAYERCONTRACT_TYPE__CD);

		timequantityTypeEClass = createEClass(TIMEQUANTITY_TYPE);
		createEAttribute(timequantityTypeEClass, TIMEQUANTITY_TYPE__DECIMAL);
		createEReference(timequantityTypeEClass, TIMEQUANTITY_TYPE__UNIT);

		timeunitTypeEClass = createEClass(TIMEUNIT_TYPE);
		createEReference(timeunitTypeEClass, TIMEUNIT_TYPE__CD);

		transactionTypeEClass = createEClass(TRANSACTION_TYPE);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__CONFIDENTIALITY);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__ID);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__CD);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__DATE);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__TIME);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__AUTHOR);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__REDACTOR);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__ISCOMPLETE);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__ISVALIDATED);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__EXPIRATIONDATE);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__GROUP);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__HEADING);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__ITEM);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__TEXT);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__TEXT_WITH_LAYOUT);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__LNK);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__RECORDDATETIME);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__VERSION);

		unitTypeEClass = createEClass(UNIT_TYPE);
		createEReference(unitTypeEClass, UNIT_TYPE__CD);

		urgencyTypeEClass = createEClass(URGENCY_TYPE);
		createEReference(urgencyTypeEClass, URGENCY_TYPE__CD);

		weekdayTypeEClass = createEClass(WEEKDAY_TYPE);
		createEReference(weekdayTypeEClass, WEEKDAY_TYPE__CD);

		weekdayType1EClass = createEClass(WEEKDAY_TYPE1);
		createEAttribute(weekdayType1EClass, WEEKDAY_TYPE1__WEEKNUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CdPackage theCdPackage = (CdPackage)EPackage.Registry.INSTANCE.getEPackage(CdPackage.eNS_URI);
		IdPackage theIdPackage = (IdPackage)EPackage.Registry.INSTANCE.getEPackage(IdPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		DtPackage theDtPackage = (DtPackage)EPackage.Registry.INSTANCE.getEPackage(DtPackage.eNS_URI);
		XmldsigPackage theXmldsigPackage = (XmldsigPackage)EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI);
		XmlencPackage theXmlencPackage = (XmlencPackage)EPackage.Registry.INSTANCE.getEPackage(XmlencPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addressTypeEClass.getESuperTypes().add(this.getAddressTypeBase());
		dateTypeEClass.getESuperTypes().add(this.getMomentType());
		weekdayType1EClass.getESuperTypes().add(this.getWeekdayType());

		// Initialize classes, features, and operations; add parameters
		initEClass(acknowledgmentTypeEClass, AcknowledgmentType.class, "AcknowledgmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcknowledgmentType_Cd(), theCdPackage.getCDACKNOWLEDGMENT(), null, "cd", null, 1, 1, AcknowledgmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressTypeEClass, AddressType.class, "AddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addressTypeBaseEClass, AddressTypeBase.class, "AddressTypeBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressTypeBase_Id(), theIdPackage.getIDKMEHR(), null, "id", null, 0, -1, AddressTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressTypeBase_Cd(), theCdPackage.getCDADDRESS(), null, "cd", null, 0, -1, AddressTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressTypeBase_Country(), this.getCountryType(), null, "country", null, 0, 1, AddressTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressTypeBase_Zip(), theXMLTypePackage.getString(), "zip", null, 0, 1, AddressTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressTypeBase_Nis(), theXMLTypePackage.getString(), "nis", null, 0, 1, AddressTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressTypeBase_City(), theXMLTypePackage.getString(), "city", null, 0, 1, AddressTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressTypeBase_District(), theXMLTypePackage.getString(), "district", null, 0, 1, AddressTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressTypeBase_Street(), theXMLTypePackage.getString(), "street", null, 0, 1, AddressTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressTypeBase_Housenumber(), theXMLTypePackage.getString(), "housenumber", null, 0, 1, AddressTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressTypeBase_Postboxnumber(), theXMLTypePackage.getString(), "postboxnumber", null, 0, 1, AddressTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressTypeBase_Text(), theDtPackage.getTextType(), null, "text", null, 0, -1, AddressTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(administrationquantityTypeEClass, AdministrationquantityType.class, "AdministrationquantityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdministrationquantityType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 1, 1, AdministrationquantityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdministrationquantityType_Unit(), this.getAdministrationunitType(), null, "unit", null, 0, 1, AdministrationquantityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(administrationunitTypeEClass, AdministrationunitType.class, "AdministrationunitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdministrationunitType_Cd(), theCdPackage.getCDADMINISTRATIONUNIT(), null, "cd", null, 1, 1, AdministrationunitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorTypeEClass, AuthorType.class, "AuthorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorType_Hcparty(), this.getHcpartyType(), null, "hcparty", null, 1, -1, AuthorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base64EncryptedDataTypeEClass, Base64EncryptedDataType.class, "Base64EncryptedDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBase64EncryptedDataType_Cd(), theCdPackage.getCDENCRYPTIONMETHOD(), null, "cd", null, 1, 1, Base64EncryptedDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBase64EncryptedDataType_Base64EncryptedValue(), this.getBase64EncryptedValueType(), null, "base64EncryptedValue", null, 1, 1, Base64EncryptedDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base64EncryptedValueTypeEClass, Base64EncryptedValueType.class, "Base64EncryptedValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBase64EncryptedValueType_Value(), theXMLTypePackage.getBase64Binary(), "value", null, 0, 1, Base64EncryptedValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64EncryptedValueType_Encoding(), theXMLTypePackage.getString(), "encoding", null, 0, 1, Base64EncryptedValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certaintyTypeEClass, CertaintyType.class, "CertaintyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCertaintyType_Cd(), theCdPackage.getCDCERTAINTY(), null, "cd", null, 1, 1, CertaintyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(civilstateTypeEClass, CivilstateType.class, "CivilstateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCivilstateType_Cd(), theCdPackage.getCDCIVILSTATE(), null, "cd", null, 1, 1, CivilstateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundprescriptionTypeEClass, CompoundprescriptionType.class, "CompoundprescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompoundprescriptionType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, CompoundprescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundprescriptionType_Compound(), this.getCompoundType(), null, "compound", null, 0, -1, CompoundprescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundprescriptionType_Formularyreference(), this.getFormularyreferenceType(), null, "formularyreference", null, 0, 1, CompoundprescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundprescriptionType_Magistraltext(), theDtPackage.getTextType(), null, "magistraltext", null, 0, 1, CompoundprescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundprescriptionType_Galenicform(), this.getGalenicformType(), null, "galenicform", null, 0, 1, CompoundprescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundprescriptionType_Quantity(), this.getQuantityType(), null, "quantity", null, 0, 1, CompoundprescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundprescriptionType_L(), theXMLTypePackage.getLanguage(), "l", null, 0, 1, CompoundprescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundTypeEClass, CompoundType.class, "CompoundType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundType_Id(), theIdPackage.getIDKMEHR(), null, "id", null, 0, -1, CompoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundType_Medicinalproduct(), this.getMedicinalProductType(), null, "medicinalproduct", null, 0, 1, CompoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundType_Substance(), this.getSubstanceType(), null, "substance", null, 0, 1, CompoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundType_Quantityprefix(), this.getQuantityprefixType(), null, "quantityprefix", null, 0, 1, CompoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundType_Quantity(), this.getQuantityType(), null, "quantity", null, 0, 1, CompoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(confidentialityTypeEClass, ConfidentialityType.class, "ConfidentialityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfidentialityType_Hcparty(), this.getHcpartyType(), null, "hcparty", null, 1, -1, ConfidentialityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentlocalitemattributeTypeEClass, ContentlocalitemattributeType.class, "ContentlocalitemattributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentlocalitemattributeType_Id(), theIdPackage.getIDKMEHR(), null, "id", null, 0, -1, ContentlocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentlocalitemattributeType_Cd(), theCdPackage.getCDCONTENT(), null, "cd", null, 0, -1, ContentlocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentlocalitemattributeType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 0, 1, ContentlocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentlocalitemattributeType_Boolean(), theXMLTypePackage.getBoolean(), "boolean", null, 0, 1, ContentlocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentlocalitemattributeType_Text(), theDtPackage.getTextType(), null, "text", null, 0, 1, ContentlocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentlocalitemattributeType_Date(), theXMLTypePackage.getDate(), "date", null, 0, 1, ContentlocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentlocalitemattributeType_Time(), theXMLTypePackage.getTime(), "time", null, 0, 1, ContentlocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentlocalitemattributeType_Hcparty(), this.getHcpartyType(), null, "hcparty", null, 0, 1, ContentlocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentlocalitemattributeType_Person(), this.getPersonType(), null, "person", null, 0, 1, ContentlocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentlocalitemattributeType_Lnk(), ecorePackage.getEObject(), null, "lnk", null, 0, -1, ContentlocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentlocalitemattributeType_Unit(), this.getUnitType(), null, "unit", null, 0, 1, ContentlocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentTypeEClass, ContentType.class, "ContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentType_Id(), theIdPackage.getIDKMEHR(), null, "id", null, 0, -1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Cd(), theCdPackage.getCDCONTENT(), null, "cd", null, 0, -1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_UnsignedInt(), theXMLTypePackage.getUnsignedInt(), "unsignedInt", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_Boolean(), theXMLTypePackage.getBoolean(), "boolean", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Text(), theDtPackage.getTextType(), null, "text", null, 0, -1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_Year(), theXMLTypePackage.getGYear(), "year", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_Yearmonth(), theXMLTypePackage.getGYearMonth(), "yearmonth", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_Date(), theXMLTypePackage.getDate(), "date", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_Time(), theXMLTypePackage.getTime(), "time", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Hcparty(), this.getHcpartyType(), null, "hcparty", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Person(), this.getPersonType(), null, "person", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Insurance(), this.getInsuranceType(), null, "insurance", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Incapacity(), this.getIncapacityType(), null, "incapacity", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Error(), this.getErrorType(), null, "error", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Medicinalproduct(), this.getMedicinalProductType(), null, "medicinalproduct", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Substanceproduct(), this.getSubstanceproductType(), null, "substanceproduct", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Compoundprescription(), this.getCompoundprescriptionType(), null, "compoundprescription", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Medication(), this.getMedicationType(), null, "medication", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Holter(), this.getHolterType(), null, "holter", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Ecg(), theDtPackage.getTextType(), null, "ecg", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Bacteriology(), theDtPackage.getTextType(), null, "bacteriology", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Lnk(), theCdPackage.getLnkType(), null, "lnk", null, 0, -1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Location(), this.getLocationBirthPlaceType(), null, "location", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Unit(), this.getUnitType(), null, "unit", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Minref(), this.getMinrefType(), null, "minref", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Maxref(), this.getMaxrefType(), null, "maxref", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Refscope(), this.getRefscopeType(), null, "refscope", null, 0, -1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(costTypeEClass, CostType.class, "CostType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCostType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 1, 1, CostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCostType_Unit(), this.getUnitType(), null, "unit", null, 1, 1, CostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countryTypeEClass, CountryType.class, "CountryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountryType_Cd(), theCdPackage.getCDCOUNTRY(), null, "cd", null, 1, 1, CountryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTypeEClass, DateType.class, "DateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dayperiodTypeEClass, DayperiodType.class, "DayperiodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDayperiodType_Cd(), theCdPackage.getCDDAYPERIOD(), null, "cd", null, 1, 1, DayperiodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daytimeTypeEClass, DaytimeType.class, "DaytimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaytimeType_Time(), theDtPackage.getTime(), "time", null, 0, 1, DaytimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDaytimeType_Dayperiod(), this.getDayperiodType(), null, "dayperiod", null, 0, 1, DaytimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(denominatorTypeEClass, DenominatorType.class, "DenominatorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDenominatorType_Quantity(), this.getTimequantityType(), null, "quantity", null, 1, 1, DenominatorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Kmehrmessage(), this.getKmehrmessageType(), null, "kmehrmessage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(durationTypeEClass, DurationType.class, "DurationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDurationType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 1, 1, DurationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDurationType_Unit(), this.getTimeunitType(), null, "unit", null, 1, 1, DurationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorMyCarenetTypeEClass, ErrorMyCarenetType.class, "ErrorMyCarenetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorMyCarenetType_Cd(), theCdPackage.getCDERRORMYCARENET(), null, "cd", null, 1, -1, ErrorMyCarenetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorMyCarenetType_Description(), theDtPackage.getTextType(), null, "description", null, 1, 1, ErrorMyCarenetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorMyCarenetType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, ErrorMyCarenetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorTypeEClass, ErrorType.class, "ErrorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorType_Id(), theIdPackage.getIDKMEHR(), null, "id", null, 0, -1, ErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorType_Cd(), theCdPackage.getCDERROR(), null, "cd", null, 1, -1, ErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorType_Description(), theDtPackage.getTextType(), null, "description", null, 1, 1, ErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, ErrorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalsourceTypeEClass, ExternalsourceType.class, "ExternalsourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalsourceType_Source(), this.getSourceType(), null, "source", null, 1, -1, ExternalsourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fcmaxTypeEClass, FCMAXType.class, "FCMAXType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFCMAXType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, FCMAXType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFCMAXType_TIME(), theXMLTypePackage.getString(), "tIME", null, 0, 1, FCMAXType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fcminTypeEClass, FCMINType.class, "FCMINType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFCMINType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, FCMINType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFCMINType_TIME(), theXMLTypePackage.getString(), "tIME", null, 0, 1, FCMINType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackTypeEClass, FeedbackType.class, "FeedbackType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeedbackType_Reportrequested(), theXMLTypePackage.getBoolean(), "reportrequested", null, 1, 1, FeedbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackType_Text(), theDtPackage.getTextType(), null, "text", null, 0, 1, FeedbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(folderTypeEClass, FolderType.class, "FolderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFolderType_Confidentiality(), this.getConfidentialityType(), null, "confidentiality", null, 0, 1, FolderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFolderType_Id(), theIdPackage.getIDKMEHR(), null, "id", null, 1, -1, FolderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFolderType_Patient(), this.getPersonType(), null, "patient", null, 1, 1, FolderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFolderType_Transaction(), this.getTransactionType(), null, "transaction", null, 1, -1, FolderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFolderType_Text(), theDtPackage.getTextType(), null, "text", null, 0, -1, FolderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFolderType_Lnk(), theCdPackage.getLnkType(), null, "lnk", null, 0, -1, FolderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formularyreferenceTypeEClass, FormularyreferenceType.class, "FormularyreferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormularyreferenceType_Cd(), theCdPackage.getCDFORMULARY(), null, "cd", null, 0, -1, FormularyreferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormularyreferenceType_Formularyname(), theXMLTypePackage.getString(), "formularyname", null, 0, 1, FormularyreferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frequencyTypeEClass, FrequencyType.class, "FrequencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrequencyType_Nominator(), this.getNominatorType(), null, "nominator", null, 0, 1, FrequencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrequencyType_Denominator(), this.getDenominatorType(), null, "denominator", null, 0, 1, FrequencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrequencyType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 0, 1, FrequencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrequencyType_Unit(), this.getUnitType(), null, "unit", null, 0, 1, FrequencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrequencyType_Text(), theDtPackage.getTextType(), null, "text", null, 0, 1, FrequencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrequencyType_Periodicity(), this.getPeriodicityType(), null, "periodicity", null, 0, 1, FrequencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(galenicformTypeEClass, GalenicformType.class, "GalenicformType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGalenicformType_Cd(), theCdPackage.getCDGALENICFORM(), null, "cd", null, 0, 1, GalenicformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGalenicformType_Galenicformtext(), theDtPackage.getTextType(), null, "galenicformtext", null, 0, 1, GalenicformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hcpartyTypeEClass, HcpartyType.class, "HcpartyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHcpartyType_Id(), theIdPackage.getIDHCPARTY(), null, "id", null, 0, -1, HcpartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHcpartyType_Cd(), theCdPackage.getCDHCPARTY(), null, "cd", null, 1, -1, HcpartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHcpartyType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, HcpartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHcpartyType_Firstname(), theXMLTypePackage.getString(), "firstname", null, 0, 1, HcpartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHcpartyType_Familyname(), theXMLTypePackage.getString(), "familyname", null, 0, 1, HcpartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHcpartyType_Address(), this.getAddressType(), null, "address", null, 0, -1, HcpartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHcpartyType_Telecom(), this.getTelecomType(), null, "telecom", null, 0, -1, HcpartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerTypeEClass, HeaderType.class, "HeaderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHeaderType_Confidentiality(), this.getConfidentialityType(), null, "confidentiality", null, 0, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderType_Standard(), this.getStandardType(), null, "standard", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderType_Id(), theIdPackage.getIDKMEHR(), null, "id", null, 1, -1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_Date(), theXMLTypePackage.getDate(), "date", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_Time(), theXMLTypePackage.getTime(), "time", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderType_Sender(), this.getSenderType(), null, "sender", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderType_Recipient(), this.getRecipientType(), null, "recipient", null, 1, -1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderType_Urgency(), this.getUrgencyType(), null, "urgency", null, 0, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderType_Acknowledgment(), this.getAcknowledgmentType(), null, "acknowledgment", null, 0, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderType_Text(), theDtPackage.getTextType(), null, "text", null, 0, -1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderType_Lnk(), theCdPackage.getLnkType(), null, "lnk", null, 0, -1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_Expirationdate(), theXMLTypePackage.getDate(), "expirationdate", null, 0, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderType_Externalsource(), this.getExternalsourceType(), null, "externalsource", null, 0, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headingTypeEClass, HeadingType.class, "HeadingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHeadingType_Confidentiality(), this.getConfidentialityType(), null, "confidentiality", null, 0, 1, HeadingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeadingType_Id(), theIdPackage.getIDKMEHR(), null, "id", null, 1, -1, HeadingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeadingType_Cd(), theCdPackage.getCDHEADING(), null, "cd", null, 1, -1, HeadingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeadingType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, HeadingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeadingType_Heading(), this.getHeadingType(), null, "heading", null, 0, -1, HeadingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHeadingType_Item(), this.getItemType(), null, "item", null, 0, -1, HeadingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHeadingType_Text(), theDtPackage.getTextType(), null, "text", null, 0, -1, HeadingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHeadingType_Lnk(), theCdPackage.getLnkType(), null, "lnk", null, 0, -1, HeadingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(holterTypeEClass, HolterType.class, "HolterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHolterType_FCAVG(), theXMLTypePackage.getString(), "fCAVG", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHolterType_FCMAX(), this.getFCMAXType(), null, "fCMAX", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHolterType_FCMIN(), this.getFCMINType(), null, "fCMIN", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_FCAVGD(), theXMLTypePackage.getString(), "fCAVGD", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_FCAVGN(), theXMLTypePackage.getString(), "fCAVGN", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHolterType_RRMAX(), this.getRRMAXType(), null, "rRMAX", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHolterType_RRMIN(), this.getRRMINType(), null, "rRMIN", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_QRSTOT(), theXMLTypePackage.getString(), "qRSTOT", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_BRADY(), theXMLTypePackage.getString(), "bRADY", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_PAUSE(), theXMLTypePackage.getString(), "pAUSE", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_LONG(), theXMLTypePackage.getString(), "lONG", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_ESV(), theXMLTypePackage.getString(), "eSV", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_DBLV(), theXMLTypePackage.getString(), "dBLV", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_SALVV(), theXMLTypePackage.getString(), "sALVV", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_BGV(), theXMLTypePackage.getString(), "bGV", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_TGV(), theXMLTypePackage.getString(), "tGV", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_TACHY(), theXMLTypePackage.getString(), "tACHY", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_ESSV(), theXMLTypePackage.getString(), "eSSV", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_DBLSV(), theXMLTypePackage.getString(), "dBLSV", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_SALVSV(), theXMLTypePackage.getString(), "sALVSV", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_BGSV(), theXMLTypePackage.getString(), "bGSV", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_TGSV(), theXMLTypePackage.getString(), "tGSV", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_TACHYSV(), theXMLTypePackage.getString(), "tACHYSV", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHolterType_RRINST(), theXMLTypePackage.getString(), "rRINST", null, 0, 1, HolterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incapacityreasonTypeEClass, IncapacityreasonType.class, "IncapacityreasonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncapacityreasonType_Cd(), theCdPackage.getCDINCAPACITYREASON(), null, "cd", null, 1, 1, IncapacityreasonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incapacityTypeEClass, IncapacityType.class, "IncapacityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncapacityType_Cd(), theCdPackage.getCDINCAPACITY(), null, "cd", null, 1, -1, IncapacityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncapacityType_Incapacityreason(), this.getIncapacityreasonType(), null, "incapacityreason", null, 0, 1, IncapacityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncapacityType_Percentage(), theXMLTypePackage.getDecimal(), "percentage", null, 0, 1, IncapacityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncapacityType_Outofhomeallowed(), theXMLTypePackage.getBoolean(), "outofhomeallowed", null, 0, 1, IncapacityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insuranceTypeEClass, InsuranceType.class, "InsuranceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInsuranceType_Id(), theIdPackage.getIDINSURANCE(), null, "id", null, 1, 1, InsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsuranceType_Membership(), theXMLTypePackage.getString(), "membership", null, 1, 1, InsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsuranceType_Siscard(), theXMLTypePackage.getString(), "siscard", null, 0, 1, InsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsuranceType_Begindate(), theXMLTypePackage.getDate(), "begindate", null, 0, 1, InsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsuranceType_Enddate(), theXMLTypePackage.getDate(), "enddate", null, 0, 1, InsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsuranceType_Cg1(), theXMLTypePackage.getString(), "cg1", null, 0, 1, InsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsuranceType_Cg2(), theXMLTypePackage.getString(), "cg2", null, 0, 1, InsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsuranceType_Socialfranchiseperiod1(), theXMLTypePackage.getString(), "socialfranchiseperiod1", null, 0, 1, InsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsuranceType_Socialfranchiseperiod2(), theXMLTypePackage.getString(), "socialfranchiseperiod2", null, 0, 1, InsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsuranceType_Personalpart(), this.getPersonalpartType(), null, "personalpart", null, 0, -1, InsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsuranceType_Thirdpayercontract(), this.getThirdpayercontractType(), null, "thirdpayercontract", null, 0, 1, InsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsuranceType_Begindatepayment(), theXMLTypePackage.getDate(), "begindatepayment", null, 0, 1, InsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsuranceType_Approvalnumber(), theXMLTypePackage.getString(), "approvalnumber", null, 0, 1, InsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemTypeEClass, ItemType.class, "ItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemType_Confidentiality(), this.getConfidentialityType(), null, "confidentiality", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Id(), theIdPackage.getIDKMEHR(), null, "id", null, 1, -1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Cd(), theCdPackage.getCDITEM(), null, "cd", null, 1, -1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Content(), this.getContentType(), null, "content", null, 0, -1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Text(), theDtPackage.getTextType(), null, "text", null, 0, -1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Author(), this.getAuthorType(), null, "author", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Beginmoment(), this.getMomentType(), null, "beginmoment", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Endmoment(), this.getMomentType(), null, "endmoment", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_Iscomplete(), theXMLTypePackage.getBoolean(), "iscomplete", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_Isvalidated(), theXMLTypePackage.getBoolean(), "isvalidated", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Lifecycle(), this.getLifecycleType(), null, "lifecycle", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_Isrelevant(), theXMLTypePackage.getBoolean(), "isrelevant", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Severity(), this.getSeverityType(), null, "severity", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Certainty(), this.getCertaintyType(), null, "certainty", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Temporality(), this.getTemporalityType(), null, "temporality", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Urgency(), this.getUrgencyType(), null, "urgency", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Quantity(), this.getQuantityType(), null, "quantity", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Strength(), this.getStrengthType(), null, "strength", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Frequency(), this.getFrequencyType(), null, "frequency", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Site(), this.getSiteType(), null, "site", null, 0, -1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Cost(), this.getCostType(), null, "cost", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Dayperiod(), this.getDayperiodType(), null, "dayperiod", null, 0, -1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Duration(), this.getDurationType(), null, "duration", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Posology(), this.getPosologyType(), null, "posology", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Regimen(), this.getRegimenType(), null, "regimen", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_Deliverydate(), theDtPackage.getDate(), "deliverydate", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Renewal(), this.getRenewalType(), null, "renewal", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Route(), this.getRouteType(), null, "route", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_Batch(), theXMLTypePackage.getString(), "batch", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Instructionforoverdosing(), theDtPackage.getTextType(), null, "instructionforoverdosing", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Instructionforpatient(), theDtPackage.getTextType(), null, "instructionforpatient", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Instructionforreimbursement(), theDtPackage.getTextType(), null, "instructionforreimbursement", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_Issubstitutionallowed(), theXMLTypePackage.getBoolean(), "issubstitutionallowed", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Feedback(), this.getFeedbackType(), null, "feedback", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Local(), this.getLocalitemattributeType(), null, "local", null, 0, -1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_Recorddatetime(), theXMLTypePackage.getDateTime(), "recorddatetime", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemType_Lnk(), theCdPackage.getLnkType(), null, "lnk", null, 0, -1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kmehrmessageTypeEClass, KmehrmessageType.class, "KmehrmessageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKmehrmessageType_Confidentiality(), this.getConfidentialityType(), null, "confidentiality", null, 0, 1, KmehrmessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKmehrmessageType_Header(), this.getHeaderType(), null, "header", null, 1, 1, KmehrmessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKmehrmessageType_Folder(), this.getFolderType(), null, "folder", null, 0, -1, KmehrmessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKmehrmessageType_Signature(), theXmldsigPackage.getSignatureType(), null, "signature", null, 0, 1, KmehrmessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKmehrmessageType_EncryptedData(), theXmlencPackage.getEncryptedType(), null, "encryptedData", null, 0, 1, KmehrmessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKmehrmessageType_Base64EncryptedData(), this.getBase64EncryptedDataType(), null, "base64EncryptedData", null, 0, 1, KmehrmessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lifecycleTypeEClass, LifecycleType.class, "LifecycleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLifecycleType_Cd(), theCdPackage.getCDLIFECYCLE(), null, "cd", null, 1, 1, LifecycleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localitemattributeTypeEClass, LocalitemattributeType.class, "LocalitemattributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalitemattributeType_Id(), theIdPackage.getIDKMEHR(), null, "id", null, 0, -1, LocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalitemattributeType_Cd(), theCdPackage.getLOCAL(), null, "cd", null, 1, 1, LocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalitemattributeType_Content(), this.getContentlocalitemattributeType(), null, "content", null, 1, 1, LocalitemattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationBirthPlaceTypeEClass, LocationBirthPlaceType.class, "LocationBirthPlaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationBirthPlaceType_Cd(), theCdPackage.getCDEBIRTHPLACE(), null, "cd", null, 0, 1, LocationBirthPlaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationBirthPlaceType_Text(), theDtPackage.getTextType(), null, "text", null, 0, 1, LocationBirthPlaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationBirthPlaceType_Address(), this.getAddressType(), null, "address", null, 1, 1, LocationBirthPlaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxrefTypeEClass, MaxrefType.class, "MaxrefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxrefType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 0, 1, MaxrefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaxrefType_Text(), theDtPackage.getTextType(), null, "text", null, 0, 1, MaxrefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(medicationTypeEClass, MedicationType.class, "MedicationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMedicationType_Cd(), theCdPackage.getCDMEDICATION(), null, "cd", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedicationType_Inn(), theDtPackage.getTextType(), null, "inn", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedicationType_Magistral(), theDtPackage.getTextType(), null, "magistral", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationType_Tradename(), theXMLTypePackage.getString(), "tradename", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedicationType_Presentation(), this.getPresentationType(), null, "presentation", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedicationType_Strength(), this.getStrengthType(), null, "strength", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedicationType_Route(), this.getRouteType(), null, "route", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationType_Batch(), theXMLTypePackage.getString(), "batch", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationType_Numberofpackage(), theXMLTypePackage.getDecimal(), "numberofpackage", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedicationType_Package(), this.getPackageType(), null, "package", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationType_Quantityperpackage(), theXMLTypePackage.getDecimal(), "quantityperpackage", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedicationType_Instructionforoverdosing(), theDtPackage.getTextType(), null, "instructionforoverdosing", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedicationType_Instructionforpatient(), theDtPackage.getTextType(), null, "instructionforpatient", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedicationType_Instructionforreimbursement(), theDtPackage.getTextType(), null, "instructionforreimbursement", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicationType_Issubstitutionallowed(), theXMLTypePackage.getBoolean(), "issubstitutionallowed", null, 0, 1, MedicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(medicinalProductTypeEClass, MedicinalProductType.class, "MedicinalProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMedicinalProductType_Intendedcd(), theCdPackage.getCDDRUGCNK(), null, "intendedcd", null, 1, -1, MedicinalProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedicinalProductType_Deliveredcd(), theCdPackage.getCDDRUGCNK(), null, "deliveredcd", null, 0, -1, MedicinalProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicinalProductType_Intendedname(), theXMLTypePackage.getString(), "intendedname", null, 1, 1, MedicinalProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicinalProductType_Deliveredname(), theXMLTypePackage.getString(), "deliveredname", null, 0, 1, MedicinalProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberinsuranceTypeEClass, MemberinsuranceType.class, "MemberinsuranceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemberinsuranceType_Id(), theIdPackage.getIDINSURANCE(), null, "id", null, 1, 1, MemberinsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberinsuranceType_Membership(), theXMLTypePackage.getString(), "membership", null, 1, 1, MemberinsuranceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minrefTypeEClass, MinrefType.class, "MinrefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinrefType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 0, 1, MinrefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMinrefType_Text(), theDtPackage.getTextType(), null, "text", null, 0, 1, MinrefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(momentTypeEClass, MomentType.class, "MomentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMomentType_Year(), theXMLTypePackage.getGYear(), "year", null, 0, 1, MomentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMomentType_Yearmonth(), theXMLTypePackage.getGYearMonth(), "yearmonth", null, 0, 1, MomentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMomentType_Date(), theXMLTypePackage.getDate(), "date", null, 0, 1, MomentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMomentType_Time(), theXMLTypePackage.getTime(), "time", null, 0, 1, MomentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMomentType_Text(), theDtPackage.getTextType(), null, "text", null, 0, 1, MomentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nationalityTypeEClass, NationalityType.class, "NationalityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNationalityType_Cd(), theCdPackage.getCDCOUNTRY(), null, "cd", null, 1, 1, NationalityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nominatorTypeEClass, NominatorType.class, "NominatorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNominatorType_Quantity(), this.getTimequantityType(), null, "quantity", null, 1, 1, NominatorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageTypeEClass, PackageType.class, "PackageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageType_Cd(), theCdPackage.getCDUNIT(), null, "cd", null, 1, 1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicityTypeEClass, PeriodicityType.class, "PeriodicityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodicityType_Cd(), theCdPackage.getCDPERIODICITY(), null, "cd", null, 1, 1, PeriodicityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personalpartTypeEClass, PersonalpartType.class, "PersonalpartType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonalpartType_Id(), theIdPackage.getIDKMEHR(), null, "id", null, 1, 1, PersonalpartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonalpartType_Cd(), theCdPackage.getCDCARENETPERSONALPART(), null, "cd", null, 1, 1, PersonalpartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalpartType_Date(), theXMLTypePackage.getDate(), "date", null, 0, 1, PersonalpartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalpartType_Time(), theXMLTypePackage.getTime(), "time", null, 0, 1, PersonalpartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personTypeEClass, PersonType.class, "PersonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonType_Id(), theIdPackage.getIDPATIENT(), null, "id", null, 1, -1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonType_Firstname(), theXMLTypePackage.getString(), "firstname", null, 1, -1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonType_Familyname(), theXMLTypePackage.getString(), "familyname", null, 1, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Birthdate(), this.getDateType(), null, "birthdate", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Birthlocation(), this.getAddressTypeBase(), null, "birthlocation", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Deathdate(), this.getDateType(), null, "deathdate", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Deathlocation(), this.getAddressTypeBase(), null, "deathlocation", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Sex(), this.getSexType(), null, "sex", null, 1, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Nationality(), this.getNationalityType(), null, "nationality", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Address(), this.getAddressType(), null, "address", null, 0, -1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Telecom(), this.getTelecomType(), null, "telecom", null, 0, -1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonType_Usuallanguage(), theXMLTypePackage.getLanguage(), "usuallanguage", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Profession(), this.getProfessionType(), null, "profession", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Insurancystatus(), this.getInsuranceType(), null, "insurancystatus", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Insurancymembership(), this.getMemberinsuranceType(), null, "insurancymembership", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonType_Recorddatetime(), theXMLTypePackage.getDateTime(), "recorddatetime", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Text(), theDtPackage.getTextType(), null, "text", null, 0, -1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Civilstate(), this.getCivilstateType(), null, "civilstate", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personTypeLightEClass, PersonTypeLight.class, "PersonTypeLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonTypeLight_Id(), theIdPackage.getIDPATIENT(), null, "id", null, 1, -1, PersonTypeLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonTypeLight_Firstname(), theXMLTypePackage.getString(), "firstname", null, 0, -1, PersonTypeLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonTypeLight_Familyname(), theXMLTypePackage.getString(), "familyname", null, 0, 1, PersonTypeLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonTypeLight_Address(), this.getAddressType(), null, "address", null, 0, -1, PersonTypeLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonTypeLight_Telecom(), this.getTelecomType(), null, "telecom", null, 0, -1, PersonTypeLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(posologyTypeEClass, PosologyType.class, "PosologyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosologyType_Low(), theXMLTypePackage.getDecimal(), "low", null, 0, 1, PosologyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosologyType_High(), theXMLTypePackage.getDecimal(), "high", null, 0, 1, PosologyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosologyType_Unit(), this.getAdministrationunitType(), null, "unit", null, 0, 1, PosologyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosologyType_Takes(), this.getTakesType(), null, "takes", null, 0, 1, PosologyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosologyType_Text(), theDtPackage.getTextType(), null, "text", null, 0, 1, PosologyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presentationTypeEClass, PresentationType.class, "PresentationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresentationType_Cd(), theCdPackage.getCDDRUGPRESENTATION(), null, "cd", null, 1, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(professionTypeEClass, ProfessionType.class, "ProfessionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfessionType_Id(), theIdPackage.getIDPROFESSION(), null, "id", null, 0, -1, ProfessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfessionType_Cd(), theCdPackage.getCDEMPLOYMENTSITUATION(), null, "cd", null, 0, -1, ProfessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfessionType_Text(), theDtPackage.getTextType(), null, "text", null, 0, 1, ProfessionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantityprefixTypeEClass, QuantityprefixType.class, "QuantityprefixType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantityprefixType_Cd(), theCdPackage.getCDQUANTITYPREFIX(), null, "cd", null, 1, 1, QuantityprefixType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantityTypeEClass, QuantityType.class, "QuantityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantityType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 1, 1, QuantityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantityType_Unit(), this.getUnitType(), null, "unit", null, 0, 1, QuantityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recipientTypeEClass, RecipientType.class, "RecipientType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecipientType_Hcparty(), this.getHcpartyType(), null, "hcparty", null, 1, -1, RecipientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecipientType_DummyFriend(), theXMLTypePackage.getString(), "dummyFriend", null, 0, 1, RecipientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refscopeTypeEClass, RefscopeType.class, "RefscopeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefscopeType_Cd(), theCdPackage.getCDREFSCOPE(), null, "cd", null, 1, 1, RefscopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefscopeType_Refvalue(), this.getRefvalueType(), null, "refvalue", null, 0, -1, RefscopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refvalueTypeEClass, RefvalueType.class, "RefvalueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefvalueType_Minref(), this.getMinrefType(), null, "minref", null, 0, 1, RefvalueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefvalueType_Maxref(), this.getMaxrefType(), null, "maxref", null, 0, 1, RefvalueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefvalueType_Context(), theDtPackage.getTextType(), null, "context", null, 1, 1, RefvalueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regimenTypeEClass, RegimenType.class, "RegimenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegimenType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RegimenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegimenType_Daynumber(), theXMLTypePackage.getPositiveInteger(), "daynumber", null, 0, -1, RegimenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegimenType_Date(), theDtPackage.getDate(), "date", null, 0, -1, RegimenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegimenType_Weekday(), this.getWeekdayType1(), null, "weekday", null, 0, -1, RegimenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegimenType_Daytime(), this.getDaytimeType(), null, "daytime", null, 0, -1, RegimenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRegimenType_Quantity(), this.getAdministrationquantityType(), null, "quantity", null, 1, -1, RegimenType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(renewalTypeEClass, RenewalType.class, "RenewalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenewalType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 0, 1, RenewalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenewalType_Duration(), this.getDurationType(), null, "duration", null, 0, 1, RenewalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenewalType_Text(), theDtPackage.getTextType(), null, "text", null, 0, 1, RenewalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeTypeEClass, RouteType.class, "RouteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouteType_Cd(), theCdPackage.getCDDRUGROUTE(), null, "cd", null, 1, 1, RouteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rrmaxTypeEClass, RRMAXType.class, "RRMAXType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRRMAXType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, RRMAXType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRRMAXType_TIME(), theXMLTypePackage.getString(), "tIME", null, 0, 1, RRMAXType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rrminTypeEClass, RRMINType.class, "RRMINType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRRMINType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, RRMINType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRRMINType_TIME(), theXMLTypePackage.getString(), "tIME", null, 0, 1, RRMINType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderTypeEClass, SenderType.class, "SenderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenderType_Hcparty(), this.getHcpartyType(), null, "hcparty", null, 1, -1, SenderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(severityTypeEClass, SeverityType.class, "SeverityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeverityType_Cd(), theCdPackage.getCDSEVERITY(), null, "cd", null, 1, 1, SeverityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sexTypeEClass, SexType.class, "SexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSexType_Cd(), theCdPackage.getCDSEX(), null, "cd", null, 1, 1, SexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siteTypeEClass, SiteType.class, "SiteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSiteType_Cd(), theCdPackage.getCDSITE(), null, "cd", null, 0, 1, SiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSiteType_Text(), theDtPackage.getTextType(), null, "text", null, 0, 1, SiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceTypeEClass, SourceType.class, "SourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceType_Cd(), theCdPackage.getCDEXTERNALSOURCE(), null, "cd", null, 1, -1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_Datetime(), theXMLTypePackage.getDateTime(), "datetime", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_Proof(), theXMLTypePackage.getString(), "proof", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialisationTypeEClass, SpecialisationType.class, "SpecialisationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecialisationType_Cd(), theCdPackage.getCDMESSAGE(), null, "cd", null, 1, 1, SpecialisationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialisationType_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, SpecialisationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardTypeEClass, StandardType.class, "StandardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStandardType_Cd(), theCdPackage.getCDSTANDARD(), null, "cd", null, 1, 1, StandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStandardType_Specialisation(), this.getSpecialisationType(), null, "specialisation", null, 0, 1, StandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strengthTypeEClass, StrengthType.class, "StrengthType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrengthType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 1, 1, StrengthType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrengthType_Unit(), this.getUnitType(), null, "unit", null, 1, 1, StrengthType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceproductTypeEClass, SubstanceproductType.class, "SubstanceproductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceproductType_Intendedcd(), theCdPackage.getCDINNCLUSTER(), null, "intendedcd", null, 1, 1, SubstanceproductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceproductType_Deliveredcd(), theCdPackage.getCDDRUGCNK(), null, "deliveredcd", null, 0, 1, SubstanceproductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubstanceproductType_Intendedname(), theXMLTypePackage.getString(), "intendedname", null, 1, 1, SubstanceproductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubstanceproductType_Deliveredname(), theXMLTypePackage.getString(), "deliveredname", null, 0, 1, SubstanceproductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceTypeEClass, SubstanceType.class, "SubstanceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceType_Cd(), theCdPackage.getCDSUBSTANCE(), null, "cd", null, 0, 1, SubstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubstanceType_Substancename(), theXMLTypePackage.getString(), "substancename", null, 0, 1, SubstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(takesTypeEClass, TakesType.class, "TakesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTakesType_Low(), theXMLTypePackage.getDecimal(), "low", null, 0, 1, TakesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTakesType_High(), theXMLTypePackage.getDecimal(), "high", null, 1, 1, TakesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telecomTypeEClass, TelecomType.class, "TelecomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTelecomType_Id(), theIdPackage.getIDKMEHR(), null, "id", null, 0, -1, TelecomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTelecomType_Cd(), theCdPackage.getCDTELECOM(), null, "cd", null, 1, 2, TelecomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomType_Telecomnumber(), theXMLTypePackage.getString(), "telecomnumber", null, 1, 1, TelecomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalityTypeEClass, TemporalityType.class, "TemporalityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalityType_Cd(), theCdPackage.getCDTEMPORALITY(), null, "cd", null, 1, 1, TemporalityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textWithLayoutTypeEClass, TextWithLayoutType.class, "TextWithLayoutType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextWithLayoutType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TextWithLayoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextWithLayoutType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TextWithLayoutType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextWithLayoutType_L(), theXMLTypePackage.getString(), "l", null, 0, 1, TextWithLayoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thirdpayercontractTypeEClass, ThirdpayercontractType.class, "ThirdpayercontractType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThirdpayercontractType_Cd(), theCdPackage.getCDCARENETTHIRDPAYERCONTRACT(), null, "cd", null, 1, 1, ThirdpayercontractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timequantityTypeEClass, TimequantityType.class, "TimequantityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimequantityType_Decimal(), theXMLTypePackage.getDecimal(), "decimal", null, 1, 1, TimequantityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimequantityType_Unit(), this.getTimeunitType(), null, "unit", null, 0, 1, TimequantityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeunitTypeEClass, TimeunitType.class, "TimeunitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeunitType_Cd(), theCdPackage.getCDTIMEUNIT(), null, "cd", null, 1, 1, TimeunitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionTypeEClass, TransactionType.class, "TransactionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransactionType_Confidentiality(), this.getConfidentialityType(), null, "confidentiality", null, 0, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_Id(), theIdPackage.getIDKMEHR(), null, "id", null, 1, -1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_Cd(), theCdPackage.getCDTRANSACTION(), null, "cd", null, 1, -1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_Date(), theXMLTypePackage.getDate(), "date", null, 1, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_Time(), theXMLTypePackage.getTime(), "time", null, 1, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_Author(), this.getAuthorType(), null, "author", null, 1, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_Redactor(), this.getAuthorType(), null, "redactor", null, 0, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_Iscomplete(), theXMLTypePackage.getBoolean(), "iscomplete", null, 1, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_Isvalidated(), theXMLTypePackage.getBoolean(), "isvalidated", null, 1, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_Expirationdate(), theXMLTypePackage.getDate(), "expirationdate", null, 0, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_Heading(), this.getHeadingType(), null, "heading", null, 0, -1, TransactionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_Item(), this.getItemType(), null, "item", null, 0, -1, TransactionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_Text(), theDtPackage.getTextType(), null, "text", null, 0, -1, TransactionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_TextWithLayout(), this.getTextWithLayoutType(), null, "textWithLayout", null, 0, -1, TransactionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_Lnk(), theCdPackage.getLnkType(), null, "lnk", null, 0, -1, TransactionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_Recorddatetime(), theXMLTypePackage.getDateTime(), "recorddatetime", null, 0, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitTypeEClass, UnitType.class, "UnitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitType_Cd(), theCdPackage.getCDUNIT(), null, "cd", null, 1, 1, UnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urgencyTypeEClass, UrgencyType.class, "UrgencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUrgencyType_Cd(), theCdPackage.getCDURGENCY(), null, "cd", null, 1, 1, UrgencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weekdayTypeEClass, WeekdayType.class, "WeekdayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeekdayType_Cd(), theCdPackage.getCDWEEKDAY(), null, "cd", null, 1, 1, WeekdayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weekdayType1EClass, WeekdayType1.class, "WeekdayType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeekdayType1_Weeknumber(), theXMLTypePackage.getPositiveInteger(), "weeknumber", null, 0, 1, WeekdayType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "\n Implementation-Title: XSD 22. KMEHR\n Specification-Version: 1.38\n Implementation-Version: 1.38.0\n Build-Time: 20230328-0850 \n \n\n Implementation-Title: XSD 22. KMEHR\n Specification-Version: 1.38\n Implementation-Version: 1.38.0\n Build-Time: 20230328-0850 \n \n\n Implementation-Title: XSD 22. KMEHR\n Specification-Version: 1.38\n Implementation-Version: 1.38.0\n Build-Time: 20230328-0850 \n \n\n Implementation-Title: XSD 22. KMEHR\n Specification-Version: 1.38\n Implementation-Version: 1.38.0\n Build-Time: 20230328-0850 \n \n\n Implementation-Title: XSD 22. KMEHR\n Specification-Version: 1.38\n Implementation-Version: 1.38.0\n Build-Time: 20230328-0850 \n "
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (acknowledgmentTypeEClass,
		   source,
		   new String[] {
			   "name", "acknowledgmentType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAcknowledgmentType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (addressTypeEClass,
		   source,
		   new String[] {
			   "name", "addressType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (addressTypeBaseEClass,
		   source,
		   new String[] {
			   "name", "addressTypeBase",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddressTypeBase_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressTypeBase_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressTypeBase_Country(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "country",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressTypeBase_Zip(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zip",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressTypeBase_Nis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressTypeBase_City(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "city",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressTypeBase_District(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "district",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressTypeBase_Street(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "street",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressTypeBase_Housenumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "housenumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressTypeBase_Postboxnumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "postboxnumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressTypeBase_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (administrationquantityTypeEClass,
		   source,
		   new String[] {
			   "name", "administrationquantityType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdministrationquantityType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAdministrationquantityType_Unit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (administrationunitTypeEClass,
		   source,
		   new String[] {
			   "name", "administrationunitType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdministrationunitType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (authorTypeEClass,
		   source,
		   new String[] {
			   "name", "authorType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAuthorType_Hcparty(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hcparty",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (base64EncryptedDataTypeEClass,
		   source,
		   new String[] {
			   "name", "Base64EncryptedDataType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBase64EncryptedDataType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBase64EncryptedDataType_Base64EncryptedValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Base64EncryptedValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (base64EncryptedValueTypeEClass,
		   source,
		   new String[] {
			   "name", "Base64EncryptedValueType",
			   "kind", "simple"
		   });
		addAnnotation
		  (getBase64EncryptedValueType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getBase64EncryptedValueType_Encoding(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "encoding"
		   });
		addAnnotation
		  (certaintyTypeEClass,
		   source,
		   new String[] {
			   "name", "certaintyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCertaintyType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (civilstateTypeEClass,
		   source,
		   new String[] {
			   "name", "civilstate_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCivilstateType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (compoundprescriptionTypeEClass,
		   source,
		   new String[] {
			   "name", "compoundprescriptionType",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getCompoundprescriptionType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getCompoundprescriptionType_Compound(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "compound",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCompoundprescriptionType_Formularyreference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "formularyreference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCompoundprescriptionType_Magistraltext(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "magistraltext",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCompoundprescriptionType_Galenicform(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "galenicform",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCompoundprescriptionType_Quantity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "quantity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCompoundprescriptionType_L(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "L"
		   });
		addAnnotation
		  (compoundTypeEClass,
		   source,
		   new String[] {
			   "name", "compoundType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCompoundType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCompoundType_Medicinalproduct(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "medicinalproduct",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCompoundType_Substance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "substance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCompoundType_Quantityprefix(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "quantityprefix",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCompoundType_Quantity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "quantity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (confidentialityTypeEClass,
		   source,
		   new String[] {
			   "name", "confidentialityType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConfidentialityType_Hcparty(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hcparty",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (contentlocalitemattributeTypeEClass,
		   source,
		   new String[] {
			   "name", "contentlocalitemattributeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContentlocalitemattributeType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentlocalitemattributeType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentlocalitemattributeType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentlocalitemattributeType_Boolean(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "boolean",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentlocalitemattributeType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentlocalitemattributeType_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "date",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentlocalitemattributeType_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentlocalitemattributeType_Hcparty(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hcparty",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentlocalitemattributeType_Person(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "person",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentlocalitemattributeType_Lnk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lnk",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentlocalitemattributeType_Unit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (contentTypeEClass,
		   source,
		   new String[] {
			   "name", "contentType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContentType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_UnsignedInt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unsignedInt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Boolean(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "boolean",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Year(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "year",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Yearmonth(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "yearmonth",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "date",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Hcparty(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hcparty",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Person(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "person",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Insurance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "insurance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Incapacity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "incapacity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Error(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "error",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Medicinalproduct(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "medicinalproduct",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Substanceproduct(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "substanceproduct",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Compoundprescription(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "compoundprescription",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Medication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "medication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Holter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "holter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Ecg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ecg",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Bacteriology(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bacteriology",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Lnk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lnk",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Unit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Minref(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "minref",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Maxref(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "maxref",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContentType_Refscope(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "refscope",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (costTypeEClass,
		   source,
		   new String[] {
			   "name", "costType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCostType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCostType_Unit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (countryTypeEClass,
		   source,
		   new String[] {
			   "name", "countryType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCountryType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dateTypeEClass,
		   source,
		   new String[] {
			   "name", "dateType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (dayperiodTypeEClass,
		   source,
		   new String[] {
			   "name", "dayperiodType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDayperiodType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (daytimeTypeEClass,
		   source,
		   new String[] {
			   "name", "daytime_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDaytimeType_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDaytimeType_Dayperiod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dayperiod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (denominatorTypeEClass,
		   source,
		   new String[] {
			   "name", "denominator_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDenominatorType_Quantity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "quantity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Kmehrmessage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kmehrmessage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (durationTypeEClass,
		   source,
		   new String[] {
			   "name", "durationType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDurationType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDurationType_Unit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (errorMyCarenetTypeEClass,
		   source,
		   new String[] {
			   "name", "errorMyCarenetType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getErrorMyCarenetType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getErrorMyCarenetType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getErrorMyCarenetType_Url(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "url",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (errorTypeEClass,
		   source,
		   new String[] {
			   "name", "errorType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getErrorType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getErrorType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getErrorType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getErrorType_Url(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "url",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (externalsourceTypeEClass,
		   source,
		   new String[] {
			   "name", "externalsource_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExternalsourceType_Source(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "source",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (fcmaxTypeEClass,
		   source,
		   new String[] {
			   "name", "FCMAXType",
			   "kind", "simple"
		   });
		addAnnotation
		  (getFCMAXType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getFCMAXType_TIME(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "TIME"
		   });
		addAnnotation
		  (fcminTypeEClass,
		   source,
		   new String[] {
			   "name", "FCMINType",
			   "kind", "simple"
		   });
		addAnnotation
		  (getFCMINType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getFCMINType_TIME(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "TIME"
		   });
		addAnnotation
		  (feedbackTypeEClass,
		   source,
		   new String[] {
			   "name", "feedback_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeedbackType_Reportrequested(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "reportrequested",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeedbackType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (folderTypeEClass,
		   source,
		   new String[] {
			   "name", "folderType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFolderType_Confidentiality(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "confidentiality",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFolderType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFolderType_Patient(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "patient",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFolderType_Transaction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transaction",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFolderType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFolderType_Lnk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lnk",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (formularyreferenceTypeEClass,
		   source,
		   new String[] {
			   "name", "formularyreferenceType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFormularyreferenceType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFormularyreferenceType_Formularyname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "formularyname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (frequencyTypeEClass,
		   source,
		   new String[] {
			   "name", "frequencyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFrequencyType_Nominator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nominator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrequencyType_Denominator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "denominator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrequencyType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrequencyType_Unit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrequencyType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrequencyType_Periodicity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "periodicity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (galenicformTypeEClass,
		   source,
		   new String[] {
			   "name", "galenicformType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGalenicformType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGalenicformType_Galenicformtext(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "galenicformtext",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (hcpartyTypeEClass,
		   source,
		   new String[] {
			   "name", "hcpartyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHcpartyType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHcpartyType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHcpartyType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHcpartyType_Firstname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "firstname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHcpartyType_Familyname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "familyname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHcpartyType_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHcpartyType_Telecom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "telecom",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (headerTypeEClass,
		   source,
		   new String[] {
			   "name", "headerType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHeaderType_Confidentiality(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "confidentiality",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeaderType_Standard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "standard",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeaderType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeaderType_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "date",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeaderType_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeaderType_Sender(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sender",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeaderType_Recipient(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "recipient",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeaderType_Urgency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "urgency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeaderType_Acknowledgment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "acknowledgment",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeaderType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeaderType_Lnk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lnk",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeaderType_Expirationdate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expirationdate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeaderType_Externalsource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "externalsource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (headingTypeEClass,
		   source,
		   new String[] {
			   "name", "headingType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHeadingType_Confidentiality(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "confidentiality",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeadingType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeadingType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHeadingType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:3"
		   });
		addAnnotation
		  (getHeadingType_Heading(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "heading",
			   "namespace", "##targetNamespace",
			   "group", "#group:3"
		   });
		addAnnotation
		  (getHeadingType_Item(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "item",
			   "namespace", "##targetNamespace",
			   "group", "#group:3"
		   });
		addAnnotation
		  (getHeadingType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace",
			   "group", "#group:3"
		   });
		addAnnotation
		  (getHeadingType_Lnk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lnk",
			   "namespace", "##targetNamespace",
			   "group", "#group:3"
		   });
		addAnnotation
		  (holterTypeEClass,
		   source,
		   new String[] {
			   "name", "holterType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHolterType_FCAVG(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FCAVG",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_FCMAX(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FCMAX",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_FCMIN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FCMIN",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_FCAVGD(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FCAVGD",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_FCAVGN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FCAVGN",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_RRMAX(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RRMAX",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_RRMIN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RRMIN",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_QRSTOT(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "QRSTOT",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_BRADY(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BRADY",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_PAUSE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PAUSE",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_LONG(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LONG",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_ESV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ESV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_DBLV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DBLV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_SALVV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SALVV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_BGV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BGV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_TGV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TGV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_TACHY(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TACHY",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_ESSV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ESSV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_DBLSV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DBLSV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_SALVSV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SALVSV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_BGSV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BGSV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_TGSV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TGSV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_TACHYSV(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TACHYSV",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHolterType_RRINST(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RRINST",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (incapacityreasonTypeEClass,
		   source,
		   new String[] {
			   "name", "incapacityreasonType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIncapacityreasonType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (incapacityTypeEClass,
		   source,
		   new String[] {
			   "name", "incapacityType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIncapacityType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIncapacityType_Incapacityreason(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "incapacityreason",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIncapacityType_Percentage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "percentage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIncapacityType_Outofhomeallowed(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "outofhomeallowed",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (insuranceTypeEClass,
		   source,
		   new String[] {
			   "name", "insuranceType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInsuranceType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsuranceType_Membership(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "membership",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsuranceType_Siscard(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "siscard",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsuranceType_Begindate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "begindate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsuranceType_Enddate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "enddate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsuranceType_Cg1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cg1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsuranceType_Cg2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cg2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsuranceType_Socialfranchiseperiod1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "socialfranchiseperiod1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsuranceType_Socialfranchiseperiod2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "socialfranchiseperiod2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsuranceType_Personalpart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "personalpart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsuranceType_Thirdpayercontract(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "thirdpayercontract",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsuranceType_Begindatepayment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "begindatepayment",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInsuranceType_Approvalnumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "approvalnumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (itemTypeEClass,
		   source,
		   new String[] {
			   "name", "itemType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getItemType_Confidentiality(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "confidentiality",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Content(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "content",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Author(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "author",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Beginmoment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "beginmoment",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Endmoment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "endmoment",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Iscomplete(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "iscomplete",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Isvalidated(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isvalidated",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Lifecycle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lifecycle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Isrelevant(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isrelevant",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Severity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "severity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Certainty(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "certainty",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Temporality(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "temporality",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Urgency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "urgency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Quantity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "quantity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Strength(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "strength",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Frequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "frequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Site(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "site",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Cost(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cost",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Dayperiod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dayperiod",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Duration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "duration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Posology(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "posology",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Regimen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "regimen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Deliverydate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deliverydate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Renewal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "renewal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Route(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "route",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Batch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "batch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Instructionforoverdosing(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "instructionforoverdosing",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Instructionforpatient(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "instructionforpatient",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Instructionforreimbursement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "instructionforreimbursement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Issubstitutionallowed(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issubstitutionallowed",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Feedback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "feedback",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Local(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "local",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Recorddatetime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "recorddatetime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getItemType_Lnk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lnk",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (kmehrmessageTypeEClass,
		   source,
		   new String[] {
			   "name", "kmehrmessageType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKmehrmessageType_Confidentiality(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "confidentiality",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKmehrmessageType_Header(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "header",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKmehrmessageType_Folder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "folder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKmehrmessageType_Signature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signature",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKmehrmessageType_EncryptedData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EncryptedData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKmehrmessageType_Base64EncryptedData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Base64EncryptedData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (lifecycleTypeEClass,
		   source,
		   new String[] {
			   "name", "lifecycleType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLifecycleType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (localitemattributeTypeEClass,
		   source,
		   new String[] {
			   "name", "localitemattributeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLocalitemattributeType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLocalitemattributeType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLocalitemattributeType_Content(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "content",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (locationBirthPlaceTypeEClass,
		   source,
		   new String[] {
			   "name", "locationBirthPlaceType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLocationBirthPlaceType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLocationBirthPlaceType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLocationBirthPlaceType_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (maxrefTypeEClass,
		   source,
		   new String[] {
			   "name", "maxrefType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMaxrefType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMaxrefType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (medicationTypeEClass,
		   source,
		   new String[] {
			   "name", "medicationType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMedicationType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Inn(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inn",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Magistral(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "magistral",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Tradename(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tradename",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Presentation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "presentation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Strength(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "strength",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Route(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "route",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Batch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "batch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Numberofpackage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "numberofpackage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Package(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "package",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Quantityperpackage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "quantityperpackage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Instructionforoverdosing(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "instructionforoverdosing",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Instructionforpatient(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "instructionforpatient",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Instructionforreimbursement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "instructionforreimbursement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicationType_Issubstitutionallowed(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issubstitutionallowed",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (medicinalProductTypeEClass,
		   source,
		   new String[] {
			   "name", "medicinalProductType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMedicinalProductType_Intendedcd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "intendedcd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicinalProductType_Deliveredcd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deliveredcd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicinalProductType_Intendedname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "intendedname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMedicinalProductType_Deliveredname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deliveredname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (memberinsuranceTypeEClass,
		   source,
		   new String[] {
			   "name", "memberinsuranceType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMemberinsuranceType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMemberinsuranceType_Membership(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "membership",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (minrefTypeEClass,
		   source,
		   new String[] {
			   "name", "minrefType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMinrefType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMinrefType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (momentTypeEClass,
		   source,
		   new String[] {
			   "name", "momentType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMomentType_Year(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "year",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMomentType_Yearmonth(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "yearmonth",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMomentType_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "date",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMomentType_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMomentType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nationalityTypeEClass,
		   source,
		   new String[] {
			   "name", "nationality_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNationalityType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nominatorTypeEClass,
		   source,
		   new String[] {
			   "name", "nominator_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNominatorType_Quantity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "quantity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (packageTypeEClass,
		   source,
		   new String[] {
			   "name", "packageType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPackageType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (periodicityTypeEClass,
		   source,
		   new String[] {
			   "name", "periodicityType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPeriodicityType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (personalpartTypeEClass,
		   source,
		   new String[] {
			   "name", "personalpart_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPersonalpartType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonalpartType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonalpartType_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "date",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonalpartType_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (personTypeEClass,
		   source,
		   new String[] {
			   "name", "personType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPersonType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Firstname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "firstname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Familyname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "familyname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Birthdate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "birthdate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Birthlocation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "birthlocation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Deathdate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deathdate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Deathlocation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deathlocation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Sex(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sex",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Nationality(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nationality",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Telecom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "telecom",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Usuallanguage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "usuallanguage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Profession(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "profession",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Insurancystatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "insurancystatus",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Insurancymembership(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "insurancymembership",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Recorddatetime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "recorddatetime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonType_Civilstate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "civilstate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (personTypeLightEClass,
		   source,
		   new String[] {
			   "name", "personTypeLight",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPersonTypeLight_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonTypeLight_Firstname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "firstname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonTypeLight_Familyname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "familyname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonTypeLight_Address(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "address",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPersonTypeLight_Telecom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "telecom",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (posologyTypeEClass,
		   source,
		   new String[] {
			   "name", "posology_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPosologyType_Low(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "low",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPosologyType_High(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "high",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPosologyType_Unit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPosologyType_Takes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "takes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPosologyType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (presentationTypeEClass,
		   source,
		   new String[] {
			   "name", "presentationType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPresentationType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (professionTypeEClass,
		   source,
		   new String[] {
			   "name", "professionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProfessionType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProfessionType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProfessionType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (quantityprefixTypeEClass,
		   source,
		   new String[] {
			   "name", "quantityprefix_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQuantityprefixType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (quantityTypeEClass,
		   source,
		   new String[] {
			   "name", "quantityType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQuantityType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getQuantityType_Unit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (recipientTypeEClass,
		   source,
		   new String[] {
			   "name", "recipientType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRecipientType_Hcparty(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hcparty",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRecipientType_DummyFriend(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dummyFriend",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (refscopeTypeEClass,
		   source,
		   new String[] {
			   "name", "refscopeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRefscopeType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRefscopeType_Refvalue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "refvalue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (refvalueTypeEClass,
		   source,
		   new String[] {
			   "name", "refvalue_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRefvalueType_Minref(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "minref",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRefvalueType_Maxref(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "maxref",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRefvalueType_Context(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "context",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (regimenTypeEClass,
		   source,
		   new String[] {
			   "name", "regimen_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRegimenType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getRegimenType_Daynumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "daynumber",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRegimenType_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "date",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRegimenType_Weekday(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weekday",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRegimenType_Daytime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "daytime",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRegimenType_Quantity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "quantity",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (renewalTypeEClass,
		   source,
		   new String[] {
			   "name", "renewalType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRenewalType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRenewalType_Duration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "duration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRenewalType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (routeTypeEClass,
		   source,
		   new String[] {
			   "name", "routeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRouteType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (rrmaxTypeEClass,
		   source,
		   new String[] {
			   "name", "RRMAXType",
			   "kind", "simple"
		   });
		addAnnotation
		  (getRRMAXType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getRRMAXType_TIME(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "TIME"
		   });
		addAnnotation
		  (rrminTypeEClass,
		   source,
		   new String[] {
			   "name", "RRMINType",
			   "kind", "simple"
		   });
		addAnnotation
		  (getRRMINType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getRRMINType_TIME(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "TIME"
		   });
		addAnnotation
		  (senderTypeEClass,
		   source,
		   new String[] {
			   "name", "senderType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSenderType_Hcparty(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hcparty",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (severityTypeEClass,
		   source,
		   new String[] {
			   "name", "severityType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSeverityType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sexTypeEClass,
		   source,
		   new String[] {
			   "name", "sexType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSexType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (siteTypeEClass,
		   source,
		   new String[] {
			   "name", "siteType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSiteType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSiteType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sourceTypeEClass,
		   source,
		   new String[] {
			   "name", "source_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSourceType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSourceType_Datetime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datetime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSourceType_Version(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "version",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSourceType_Proof(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "proof",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (specialisationTypeEClass,
		   source,
		   new String[] {
			   "name", "specialisation_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpecialisationType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpecialisationType_Version(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "version",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (standardTypeEClass,
		   source,
		   new String[] {
			   "name", "standardType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStandardType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStandardType_Specialisation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "specialisation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (strengthTypeEClass,
		   source,
		   new String[] {
			   "name", "strengthType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStrengthType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStrengthType_Unit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (substanceproductTypeEClass,
		   source,
		   new String[] {
			   "name", "substanceproduct_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubstanceproductType_Intendedcd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "intendedcd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubstanceproductType_Deliveredcd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deliveredcd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubstanceproductType_Intendedname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "intendedname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubstanceproductType_Deliveredname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "deliveredname",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (substanceTypeEClass,
		   source,
		   new String[] {
			   "name", "substanceType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubstanceType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubstanceType_Substancename(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "substancename",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (takesTypeEClass,
		   source,
		   new String[] {
			   "name", "takes_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTakesType_Low(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "low",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTakesType_High(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "high",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (telecomTypeEClass,
		   source,
		   new String[] {
			   "name", "telecomType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTelecomType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTelecomType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTelecomType_Telecomnumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "telecomnumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (temporalityTypeEClass,
		   source,
		   new String[] {
			   "name", "temporalityType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTemporalityType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (textWithLayoutTypeEClass,
		   source,
		   new String[] {
			   "name", "textWithLayoutType",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getTextWithLayoutType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getTextWithLayoutType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##any",
			   "name", ":1",
			   "processing", "lax"
		   });
		addAnnotation
		  (getTextWithLayoutType_L(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "L"
		   });
		addAnnotation
		  (thirdpayercontractTypeEClass,
		   source,
		   new String[] {
			   "name", "thirdpayercontract_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getThirdpayercontractType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (timequantityTypeEClass,
		   source,
		   new String[] {
			   "name", "timequantityType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTimequantityType_Decimal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decimal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimequantityType_Unit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (timeunitTypeEClass,
		   source,
		   new String[] {
			   "name", "timeunitType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTimeunitType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (transactionTypeEClass,
		   source,
		   new String[] {
			   "name", "transactionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTransactionType_Confidentiality(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "confidentiality",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionType_Date(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "date",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionType_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionType_Author(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "author",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionType_Redactor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "redactor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionType_Iscomplete(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "iscomplete",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionType_Isvalidated(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "isvalidated",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionType_Expirationdate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expirationdate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:10"
		   });
		addAnnotation
		  (getTransactionType_Heading(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "heading",
			   "namespace", "##targetNamespace",
			   "group", "#group:10"
		   });
		addAnnotation
		  (getTransactionType_Item(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "item",
			   "namespace", "##targetNamespace",
			   "group", "#group:10"
		   });
		addAnnotation
		  (getTransactionType_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace",
			   "group", "#group:10"
		   });
		addAnnotation
		  (getTransactionType_TextWithLayout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text-with-layout",
			   "namespace", "##targetNamespace",
			   "group", "#group:10"
		   });
		addAnnotation
		  (getTransactionType_Lnk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lnk",
			   "namespace", "##targetNamespace",
			   "group", "#group:10"
		   });
		addAnnotation
		  (getTransactionType_Recorddatetime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "recorddatetime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTransactionType_Version(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "version",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (unitTypeEClass,
		   source,
		   new String[] {
			   "name", "unitType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnitType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (urgencyTypeEClass,
		   source,
		   new String[] {
			   "name", "urgencyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUrgencyType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (weekdayTypeEClass,
		   source,
		   new String[] {
			   "name", "weekdayType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWeekdayType_Cd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (weekdayType1EClass,
		   source,
		   new String[] {
			   "name", "weekday_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWeekdayType1_Weeknumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "weeknumber",
			   "namespace", "##targetNamespace"
		   });
	}

} //KmehrPackageImpl
