/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.*;

import org.eclipse.emf.ecore.EClass;
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
public class KmehrFactoryImpl extends EFactoryImpl implements KmehrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KmehrFactory init() {
		try {
			KmehrFactory theKmehrFactory = (KmehrFactory)EPackage.Registry.INSTANCE.getEFactory(KmehrPackage.eNS_URI);
			if (theKmehrFactory != null) {
				return theKmehrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KmehrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmehrFactoryImpl() {
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
			case KmehrPackage.ACKNOWLEDGMENT_TYPE: return createAcknowledgmentType();
			case KmehrPackage.ADDRESS_TYPE: return createAddressType();
			case KmehrPackage.ADDRESS_TYPE_BASE: return createAddressTypeBase();
			case KmehrPackage.ADMINISTRATIONQUANTITY_TYPE: return createAdministrationquantityType();
			case KmehrPackage.ADMINISTRATIONUNIT_TYPE: return createAdministrationunitType();
			case KmehrPackage.AUTHOR_TYPE: return createAuthorType();
			case KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE: return createBase64EncryptedDataType();
			case KmehrPackage.BASE64_ENCRYPTED_VALUE_TYPE: return createBase64EncryptedValueType();
			case KmehrPackage.CERTAINTY_TYPE: return createCertaintyType();
			case KmehrPackage.CIVILSTATE_TYPE: return createCivilstateType();
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE: return createCompoundprescriptionType();
			case KmehrPackage.COMPOUND_TYPE: return createCompoundType();
			case KmehrPackage.CONFIDENTIALITY_TYPE: return createConfidentialityType();
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE: return createContentlocalitemattributeType();
			case KmehrPackage.CONTENT_TYPE: return createContentType();
			case KmehrPackage.COST_TYPE: return createCostType();
			case KmehrPackage.COUNTRY_TYPE: return createCountryType();
			case KmehrPackage.DATE_TYPE: return createDateType();
			case KmehrPackage.DAYPERIOD_TYPE: return createDayperiodType();
			case KmehrPackage.DAYTIME_TYPE: return createDaytimeType();
			case KmehrPackage.DENOMINATOR_TYPE: return createDenominatorType();
			case KmehrPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case KmehrPackage.DURATION_TYPE: return createDurationType();
			case KmehrPackage.ERROR_MY_CARENET_TYPE: return createErrorMyCarenetType();
			case KmehrPackage.ERROR_TYPE: return createErrorType();
			case KmehrPackage.EXTERNALSOURCE_TYPE: return createExternalsourceType();
			case KmehrPackage.FCMAX_TYPE: return createFCMAXType();
			case KmehrPackage.FCMIN_TYPE: return createFCMINType();
			case KmehrPackage.FEEDBACK_TYPE: return createFeedbackType();
			case KmehrPackage.FOLDER_TYPE: return createFolderType();
			case KmehrPackage.FORMULARYREFERENCE_TYPE: return createFormularyreferenceType();
			case KmehrPackage.FREQUENCY_TYPE: return createFrequencyType();
			case KmehrPackage.GALENICFORM_TYPE: return createGalenicformType();
			case KmehrPackage.HCPARTY_TYPE: return createHcpartyType();
			case KmehrPackage.HEADER_TYPE: return createHeaderType();
			case KmehrPackage.HEADING_TYPE: return createHeadingType();
			case KmehrPackage.HOLTER_TYPE: return createHolterType();
			case KmehrPackage.INCAPACITYREASON_TYPE: return createIncapacityreasonType();
			case KmehrPackage.INCAPACITY_TYPE: return createIncapacityType();
			case KmehrPackage.INSURANCE_TYPE: return createInsuranceType();
			case KmehrPackage.ITEM_TYPE: return createItemType();
			case KmehrPackage.KMEHRMESSAGE_TYPE: return createKmehrmessageType();
			case KmehrPackage.LIFECYCLE_TYPE: return createLifecycleType();
			case KmehrPackage.LOCALITEMATTRIBUTE_TYPE: return createLocalitemattributeType();
			case KmehrPackage.LOCATION_BIRTH_PLACE_TYPE: return createLocationBirthPlaceType();
			case KmehrPackage.MAXREF_TYPE: return createMaxrefType();
			case KmehrPackage.MEDICATION_TYPE: return createMedicationType();
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE: return createMedicinalProductType();
			case KmehrPackage.MEMBERINSURANCE_TYPE: return createMemberinsuranceType();
			case KmehrPackage.MINREF_TYPE: return createMinrefType();
			case KmehrPackage.MOMENT_TYPE: return createMomentType();
			case KmehrPackage.NATIONALITY_TYPE: return createNationalityType();
			case KmehrPackage.NOMINATOR_TYPE: return createNominatorType();
			case KmehrPackage.PACKAGE_TYPE: return createPackageType();
			case KmehrPackage.PERIODICITY_TYPE: return createPeriodicityType();
			case KmehrPackage.PERSONALPART_TYPE: return createPersonalpartType();
			case KmehrPackage.PERSON_TYPE: return createPersonType();
			case KmehrPackage.PERSON_TYPE_LIGHT: return createPersonTypeLight();
			case KmehrPackage.POSOLOGY_TYPE: return createPosologyType();
			case KmehrPackage.PRESENTATION_TYPE: return createPresentationType();
			case KmehrPackage.PROFESSION_TYPE: return createProfessionType();
			case KmehrPackage.QUANTITYPREFIX_TYPE: return createQuantityprefixType();
			case KmehrPackage.QUANTITY_TYPE: return createQuantityType();
			case KmehrPackage.RECIPIENT_TYPE: return createRecipientType();
			case KmehrPackage.REFSCOPE_TYPE: return createRefscopeType();
			case KmehrPackage.REFVALUE_TYPE: return createRefvalueType();
			case KmehrPackage.REGIMEN_TYPE: return createRegimenType();
			case KmehrPackage.RENEWAL_TYPE: return createRenewalType();
			case KmehrPackage.ROUTE_TYPE: return createRouteType();
			case KmehrPackage.RRMAX_TYPE: return createRRMAXType();
			case KmehrPackage.RRMIN_TYPE: return createRRMINType();
			case KmehrPackage.SENDER_TYPE: return createSenderType();
			case KmehrPackage.SEVERITY_TYPE: return createSeverityType();
			case KmehrPackage.SEX_TYPE: return createSexType();
			case KmehrPackage.SITE_TYPE: return createSiteType();
			case KmehrPackage.SOURCE_TYPE: return createSourceType();
			case KmehrPackage.SPECIALISATION_TYPE: return createSpecialisationType();
			case KmehrPackage.STANDARD_TYPE: return createStandardType();
			case KmehrPackage.STRENGTH_TYPE: return createStrengthType();
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE: return createSubstanceproductType();
			case KmehrPackage.SUBSTANCE_TYPE: return createSubstanceType();
			case KmehrPackage.TAKES_TYPE: return createTakesType();
			case KmehrPackage.TELECOM_TYPE: return createTelecomType();
			case KmehrPackage.TEMPORALITY_TYPE: return createTemporalityType();
			case KmehrPackage.TEXT_WITH_LAYOUT_TYPE: return createTextWithLayoutType();
			case KmehrPackage.THIRDPAYERCONTRACT_TYPE: return createThirdpayercontractType();
			case KmehrPackage.TIMEQUANTITY_TYPE: return createTimequantityType();
			case KmehrPackage.TIMEUNIT_TYPE: return createTimeunitType();
			case KmehrPackage.TRANSACTION_TYPE: return createTransactionType();
			case KmehrPackage.UNIT_TYPE: return createUnitType();
			case KmehrPackage.URGENCY_TYPE: return createUrgencyType();
			case KmehrPackage.WEEKDAY_TYPE: return createWeekdayType();
			case KmehrPackage.WEEKDAY_TYPE1: return createWeekdayType1();
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
	public AcknowledgmentType createAcknowledgmentType() {
		AcknowledgmentTypeImpl acknowledgmentType = new AcknowledgmentTypeImpl();
		return acknowledgmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressTypeBase createAddressTypeBase() {
		AddressTypeBaseImpl addressTypeBase = new AddressTypeBaseImpl();
		return addressTypeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdministrationquantityType createAdministrationquantityType() {
		AdministrationquantityTypeImpl administrationquantityType = new AdministrationquantityTypeImpl();
		return administrationquantityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdministrationunitType createAdministrationunitType() {
		AdministrationunitTypeImpl administrationunitType = new AdministrationunitTypeImpl();
		return administrationunitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorType createAuthorType() {
		AuthorTypeImpl authorType = new AuthorTypeImpl();
		return authorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64EncryptedDataType createBase64EncryptedDataType() {
		Base64EncryptedDataTypeImpl base64EncryptedDataType = new Base64EncryptedDataTypeImpl();
		return base64EncryptedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64EncryptedValueType createBase64EncryptedValueType() {
		Base64EncryptedValueTypeImpl base64EncryptedValueType = new Base64EncryptedValueTypeImpl();
		return base64EncryptedValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertaintyType createCertaintyType() {
		CertaintyTypeImpl certaintyType = new CertaintyTypeImpl();
		return certaintyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CivilstateType createCivilstateType() {
		CivilstateTypeImpl civilstateType = new CivilstateTypeImpl();
		return civilstateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundprescriptionType createCompoundprescriptionType() {
		CompoundprescriptionTypeImpl compoundprescriptionType = new CompoundprescriptionTypeImpl();
		return compoundprescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundType createCompoundType() {
		CompoundTypeImpl compoundType = new CompoundTypeImpl();
		return compoundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidentialityType createConfidentialityType() {
		ConfidentialityTypeImpl confidentialityType = new ConfidentialityTypeImpl();
		return confidentialityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentlocalitemattributeType createContentlocalitemattributeType() {
		ContentlocalitemattributeTypeImpl contentlocalitemattributeType = new ContentlocalitemattributeTypeImpl();
		return contentlocalitemattributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentType createContentType() {
		ContentTypeImpl contentType = new ContentTypeImpl();
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostType createCostType() {
		CostTypeImpl costType = new CostTypeImpl();
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryType createCountryType() {
		CountryTypeImpl countryType = new CountryTypeImpl();
		return countryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DayperiodType createDayperiodType() {
		DayperiodTypeImpl dayperiodType = new DayperiodTypeImpl();
		return dayperiodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DaytimeType createDaytimeType() {
		DaytimeTypeImpl daytimeType = new DaytimeTypeImpl();
		return daytimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DenominatorType createDenominatorType() {
		DenominatorTypeImpl denominatorType = new DenominatorTypeImpl();
		return denominatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DurationType createDurationType() {
		DurationTypeImpl durationType = new DurationTypeImpl();
		return durationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorMyCarenetType createErrorMyCarenetType() {
		ErrorMyCarenetTypeImpl errorMyCarenetType = new ErrorMyCarenetTypeImpl();
		return errorMyCarenetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorType createErrorType() {
		ErrorTypeImpl errorType = new ErrorTypeImpl();
		return errorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalsourceType createExternalsourceType() {
		ExternalsourceTypeImpl externalsourceType = new ExternalsourceTypeImpl();
		return externalsourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FCMAXType createFCMAXType() {
		FCMAXTypeImpl fcmaxType = new FCMAXTypeImpl();
		return fcmaxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FCMINType createFCMINType() {
		FCMINTypeImpl fcminType = new FCMINTypeImpl();
		return fcminType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackType createFeedbackType() {
		FeedbackTypeImpl feedbackType = new FeedbackTypeImpl();
		return feedbackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FolderType createFolderType() {
		FolderTypeImpl folderType = new FolderTypeImpl();
		return folderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormularyreferenceType createFormularyreferenceType() {
		FormularyreferenceTypeImpl formularyreferenceType = new FormularyreferenceTypeImpl();
		return formularyreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrequencyType createFrequencyType() {
		FrequencyTypeImpl frequencyType = new FrequencyTypeImpl();
		return frequencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GalenicformType createGalenicformType() {
		GalenicformTypeImpl galenicformType = new GalenicformTypeImpl();
		return galenicformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HcpartyType createHcpartyType() {
		HcpartyTypeImpl hcpartyType = new HcpartyTypeImpl();
		return hcpartyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeaderType createHeaderType() {
		HeaderTypeImpl headerType = new HeaderTypeImpl();
		return headerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeadingType createHeadingType() {
		HeadingTypeImpl headingType = new HeadingTypeImpl();
		return headingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HolterType createHolterType() {
		HolterTypeImpl holterType = new HolterTypeImpl();
		return holterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncapacityreasonType createIncapacityreasonType() {
		IncapacityreasonTypeImpl incapacityreasonType = new IncapacityreasonTypeImpl();
		return incapacityreasonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncapacityType createIncapacityType() {
		IncapacityTypeImpl incapacityType = new IncapacityTypeImpl();
		return incapacityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsuranceType createInsuranceType() {
		InsuranceTypeImpl insuranceType = new InsuranceTypeImpl();
		return insuranceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemType createItemType() {
		ItemTypeImpl itemType = new ItemTypeImpl();
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KmehrmessageType createKmehrmessageType() {
		KmehrmessageTypeImpl kmehrmessageType = new KmehrmessageTypeImpl();
		return kmehrmessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifecycleType createLifecycleType() {
		LifecycleTypeImpl lifecycleType = new LifecycleTypeImpl();
		return lifecycleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalitemattributeType createLocalitemattributeType() {
		LocalitemattributeTypeImpl localitemattributeType = new LocalitemattributeTypeImpl();
		return localitemattributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationBirthPlaceType createLocationBirthPlaceType() {
		LocationBirthPlaceTypeImpl locationBirthPlaceType = new LocationBirthPlaceTypeImpl();
		return locationBirthPlaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaxrefType createMaxrefType() {
		MaxrefTypeImpl maxrefType = new MaxrefTypeImpl();
		return maxrefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationType createMedicationType() {
		MedicationTypeImpl medicationType = new MedicationTypeImpl();
		return medicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductType createMedicinalProductType() {
		MedicinalProductTypeImpl medicinalProductType = new MedicinalProductTypeImpl();
		return medicinalProductType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberinsuranceType createMemberinsuranceType() {
		MemberinsuranceTypeImpl memberinsuranceType = new MemberinsuranceTypeImpl();
		return memberinsuranceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinrefType createMinrefType() {
		MinrefTypeImpl minrefType = new MinrefTypeImpl();
		return minrefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MomentType createMomentType() {
		MomentTypeImpl momentType = new MomentTypeImpl();
		return momentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NationalityType createNationalityType() {
		NationalityTypeImpl nationalityType = new NationalityTypeImpl();
		return nationalityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NominatorType createNominatorType() {
		NominatorTypeImpl nominatorType = new NominatorTypeImpl();
		return nominatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageType createPackageType() {
		PackageTypeImpl packageType = new PackageTypeImpl();
		return packageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeriodicityType createPeriodicityType() {
		PeriodicityTypeImpl periodicityType = new PeriodicityTypeImpl();
		return periodicityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonalpartType createPersonalpartType() {
		PersonalpartTypeImpl personalpartType = new PersonalpartTypeImpl();
		return personalpartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonType createPersonType() {
		PersonTypeImpl personType = new PersonTypeImpl();
		return personType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonTypeLight createPersonTypeLight() {
		PersonTypeLightImpl personTypeLight = new PersonTypeLightImpl();
		return personTypeLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PosologyType createPosologyType() {
		PosologyTypeImpl posologyType = new PosologyTypeImpl();
		return posologyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PresentationType createPresentationType() {
		PresentationTypeImpl presentationType = new PresentationTypeImpl();
		return presentationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfessionType createProfessionType() {
		ProfessionTypeImpl professionType = new ProfessionTypeImpl();
		return professionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityprefixType createQuantityprefixType() {
		QuantityprefixTypeImpl quantityprefixType = new QuantityprefixTypeImpl();
		return quantityprefixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityType createQuantityType() {
		QuantityTypeImpl quantityType = new QuantityTypeImpl();
		return quantityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecipientType createRecipientType() {
		RecipientTypeImpl recipientType = new RecipientTypeImpl();
		return recipientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefscopeType createRefscopeType() {
		RefscopeTypeImpl refscopeType = new RefscopeTypeImpl();
		return refscopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefvalueType createRefvalueType() {
		RefvalueTypeImpl refvalueType = new RefvalueTypeImpl();
		return refvalueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegimenType createRegimenType() {
		RegimenTypeImpl regimenType = new RegimenTypeImpl();
		return regimenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenewalType createRenewalType() {
		RenewalTypeImpl renewalType = new RenewalTypeImpl();
		return renewalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteType createRouteType() {
		RouteTypeImpl routeType = new RouteTypeImpl();
		return routeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RRMAXType createRRMAXType() {
		RRMAXTypeImpl rrmaxType = new RRMAXTypeImpl();
		return rrmaxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RRMINType createRRMINType() {
		RRMINTypeImpl rrminType = new RRMINTypeImpl();
		return rrminType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SenderType createSenderType() {
		SenderTypeImpl senderType = new SenderTypeImpl();
		return senderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityType createSeverityType() {
		SeverityTypeImpl severityType = new SeverityTypeImpl();
		return severityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SexType createSexType() {
		SexTypeImpl sexType = new SexTypeImpl();
		return sexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SiteType createSiteType() {
		SiteTypeImpl siteType = new SiteTypeImpl();
		return siteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceType createSourceType() {
		SourceTypeImpl sourceType = new SourceTypeImpl();
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecialisationType createSpecialisationType() {
		SpecialisationTypeImpl specialisationType = new SpecialisationTypeImpl();
		return specialisationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardType createStandardType() {
		StandardTypeImpl standardType = new StandardTypeImpl();
		return standardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrengthType createStrengthType() {
		StrengthTypeImpl strengthType = new StrengthTypeImpl();
		return strengthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceproductType createSubstanceproductType() {
		SubstanceproductTypeImpl substanceproductType = new SubstanceproductTypeImpl();
		return substanceproductType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceType createSubstanceType() {
		SubstanceTypeImpl substanceType = new SubstanceTypeImpl();
		return substanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TakesType createTakesType() {
		TakesTypeImpl takesType = new TakesTypeImpl();
		return takesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelecomType createTelecomType() {
		TelecomTypeImpl telecomType = new TelecomTypeImpl();
		return telecomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalityType createTemporalityType() {
		TemporalityTypeImpl temporalityType = new TemporalityTypeImpl();
		return temporalityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextWithLayoutType createTextWithLayoutType() {
		TextWithLayoutTypeImpl textWithLayoutType = new TextWithLayoutTypeImpl();
		return textWithLayoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThirdpayercontractType createThirdpayercontractType() {
		ThirdpayercontractTypeImpl thirdpayercontractType = new ThirdpayercontractTypeImpl();
		return thirdpayercontractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimequantityType createTimequantityType() {
		TimequantityTypeImpl timequantityType = new TimequantityTypeImpl();
		return timequantityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeunitType createTimeunitType() {
		TimeunitTypeImpl timeunitType = new TimeunitTypeImpl();
		return timeunitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionType createTransactionType() {
		TransactionTypeImpl transactionType = new TransactionTypeImpl();
		return transactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitType createUnitType() {
		UnitTypeImpl unitType = new UnitTypeImpl();
		return unitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UrgencyType createUrgencyType() {
		UrgencyTypeImpl urgencyType = new UrgencyTypeImpl();
		return urgencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeekdayType createWeekdayType() {
		WeekdayTypeImpl weekdayType = new WeekdayTypeImpl();
		return weekdayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeekdayType1 createWeekdayType1() {
		WeekdayType1Impl weekdayType1 = new WeekdayType1Impl();
		return weekdayType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KmehrPackage getKmehrPackage() {
		return (KmehrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KmehrPackage getPackage() {
		return KmehrPackage.eINSTANCE;
	}

} //KmehrFactoryImpl
