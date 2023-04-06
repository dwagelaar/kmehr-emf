/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.util;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage
 * @generated
 */
public class KmehrAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KmehrPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmehrAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KmehrPackage.eINSTANCE;
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
	protected KmehrSwitch<Adapter> modelSwitch =
		new KmehrSwitch<Adapter>() {
			@Override
			public Adapter caseAcknowledgmentType(AcknowledgmentType object) {
				return createAcknowledgmentTypeAdapter();
			}
			@Override
			public Adapter caseAddressType(AddressType object) {
				return createAddressTypeAdapter();
			}
			@Override
			public Adapter caseAddressTypeBase(AddressTypeBase object) {
				return createAddressTypeBaseAdapter();
			}
			@Override
			public Adapter caseAdministrationquantityType(AdministrationquantityType object) {
				return createAdministrationquantityTypeAdapter();
			}
			@Override
			public Adapter caseAdministrationunitType(AdministrationunitType object) {
				return createAdministrationunitTypeAdapter();
			}
			@Override
			public Adapter caseAuthorType(AuthorType object) {
				return createAuthorTypeAdapter();
			}
			@Override
			public Adapter caseBase64EncryptedDataType(Base64EncryptedDataType object) {
				return createBase64EncryptedDataTypeAdapter();
			}
			@Override
			public Adapter caseBase64EncryptedValueType(Base64EncryptedValueType object) {
				return createBase64EncryptedValueTypeAdapter();
			}
			@Override
			public Adapter caseCertaintyType(CertaintyType object) {
				return createCertaintyTypeAdapter();
			}
			@Override
			public Adapter caseCivilstateType(CivilstateType object) {
				return createCivilstateTypeAdapter();
			}
			@Override
			public Adapter caseCompoundprescriptionType(CompoundprescriptionType object) {
				return createCompoundprescriptionTypeAdapter();
			}
			@Override
			public Adapter caseCompoundType(CompoundType object) {
				return createCompoundTypeAdapter();
			}
			@Override
			public Adapter caseConfidentialityType(ConfidentialityType object) {
				return createConfidentialityTypeAdapter();
			}
			@Override
			public Adapter caseContentlocalitemattributeType(ContentlocalitemattributeType object) {
				return createContentlocalitemattributeTypeAdapter();
			}
			@Override
			public Adapter caseContentType(ContentType object) {
				return createContentTypeAdapter();
			}
			@Override
			public Adapter caseCostType(CostType object) {
				return createCostTypeAdapter();
			}
			@Override
			public Adapter caseCountryType(CountryType object) {
				return createCountryTypeAdapter();
			}
			@Override
			public Adapter caseDateType(DateType object) {
				return createDateTypeAdapter();
			}
			@Override
			public Adapter caseDayperiodType(DayperiodType object) {
				return createDayperiodTypeAdapter();
			}
			@Override
			public Adapter caseDaytimeType(DaytimeType object) {
				return createDaytimeTypeAdapter();
			}
			@Override
			public Adapter caseDenominatorType(DenominatorType object) {
				return createDenominatorTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDurationType(DurationType object) {
				return createDurationTypeAdapter();
			}
			@Override
			public Adapter caseErrorMyCarenetType(ErrorMyCarenetType object) {
				return createErrorMyCarenetTypeAdapter();
			}
			@Override
			public Adapter caseErrorType(ErrorType object) {
				return createErrorTypeAdapter();
			}
			@Override
			public Adapter caseExternalsourceType(ExternalsourceType object) {
				return createExternalsourceTypeAdapter();
			}
			@Override
			public Adapter caseFCMAXType(FCMAXType object) {
				return createFCMAXTypeAdapter();
			}
			@Override
			public Adapter caseFCMINType(FCMINType object) {
				return createFCMINTypeAdapter();
			}
			@Override
			public Adapter caseFeedbackType(FeedbackType object) {
				return createFeedbackTypeAdapter();
			}
			@Override
			public Adapter caseFolderType(FolderType object) {
				return createFolderTypeAdapter();
			}
			@Override
			public Adapter caseFormularyreferenceType(FormularyreferenceType object) {
				return createFormularyreferenceTypeAdapter();
			}
			@Override
			public Adapter caseFrequencyType(FrequencyType object) {
				return createFrequencyTypeAdapter();
			}
			@Override
			public Adapter caseGalenicformType(GalenicformType object) {
				return createGalenicformTypeAdapter();
			}
			@Override
			public Adapter caseHcpartyType(HcpartyType object) {
				return createHcpartyTypeAdapter();
			}
			@Override
			public Adapter caseHeaderType(HeaderType object) {
				return createHeaderTypeAdapter();
			}
			@Override
			public Adapter caseHeadingType(HeadingType object) {
				return createHeadingTypeAdapter();
			}
			@Override
			public Adapter caseHolterType(HolterType object) {
				return createHolterTypeAdapter();
			}
			@Override
			public Adapter caseIncapacityreasonType(IncapacityreasonType object) {
				return createIncapacityreasonTypeAdapter();
			}
			@Override
			public Adapter caseIncapacityType(IncapacityType object) {
				return createIncapacityTypeAdapter();
			}
			@Override
			public Adapter caseInsuranceType(InsuranceType object) {
				return createInsuranceTypeAdapter();
			}
			@Override
			public Adapter caseItemType(ItemType object) {
				return createItemTypeAdapter();
			}
			@Override
			public Adapter caseKmehrmessageType(KmehrmessageType object) {
				return createKmehrmessageTypeAdapter();
			}
			@Override
			public Adapter caseLifecycleType(LifecycleType object) {
				return createLifecycleTypeAdapter();
			}
			@Override
			public Adapter caseLocalitemattributeType(LocalitemattributeType object) {
				return createLocalitemattributeTypeAdapter();
			}
			@Override
			public Adapter caseLocationBirthPlaceType(LocationBirthPlaceType object) {
				return createLocationBirthPlaceTypeAdapter();
			}
			@Override
			public Adapter caseMaxrefType(MaxrefType object) {
				return createMaxrefTypeAdapter();
			}
			@Override
			public Adapter caseMedicationType(MedicationType object) {
				return createMedicationTypeAdapter();
			}
			@Override
			public Adapter caseMedicinalProductType(MedicinalProductType object) {
				return createMedicinalProductTypeAdapter();
			}
			@Override
			public Adapter caseMemberinsuranceType(MemberinsuranceType object) {
				return createMemberinsuranceTypeAdapter();
			}
			@Override
			public Adapter caseMinrefType(MinrefType object) {
				return createMinrefTypeAdapter();
			}
			@Override
			public Adapter caseMomentType(MomentType object) {
				return createMomentTypeAdapter();
			}
			@Override
			public Adapter caseNationalityType(NationalityType object) {
				return createNationalityTypeAdapter();
			}
			@Override
			public Adapter caseNominatorType(NominatorType object) {
				return createNominatorTypeAdapter();
			}
			@Override
			public Adapter casePackageType(PackageType object) {
				return createPackageTypeAdapter();
			}
			@Override
			public Adapter casePeriodicityType(PeriodicityType object) {
				return createPeriodicityTypeAdapter();
			}
			@Override
			public Adapter casePersonalpartType(PersonalpartType object) {
				return createPersonalpartTypeAdapter();
			}
			@Override
			public Adapter casePersonType(PersonType object) {
				return createPersonTypeAdapter();
			}
			@Override
			public Adapter casePersonTypeLight(PersonTypeLight object) {
				return createPersonTypeLightAdapter();
			}
			@Override
			public Adapter casePosologyType(PosologyType object) {
				return createPosologyTypeAdapter();
			}
			@Override
			public Adapter casePresentationType(PresentationType object) {
				return createPresentationTypeAdapter();
			}
			@Override
			public Adapter caseProfessionType(ProfessionType object) {
				return createProfessionTypeAdapter();
			}
			@Override
			public Adapter caseQuantityprefixType(QuantityprefixType object) {
				return createQuantityprefixTypeAdapter();
			}
			@Override
			public Adapter caseQuantityType(QuantityType object) {
				return createQuantityTypeAdapter();
			}
			@Override
			public Adapter caseRecipientType(RecipientType object) {
				return createRecipientTypeAdapter();
			}
			@Override
			public Adapter caseRefscopeType(RefscopeType object) {
				return createRefscopeTypeAdapter();
			}
			@Override
			public Adapter caseRefvalueType(RefvalueType object) {
				return createRefvalueTypeAdapter();
			}
			@Override
			public Adapter caseRegimenType(RegimenType object) {
				return createRegimenTypeAdapter();
			}
			@Override
			public Adapter caseRenewalType(RenewalType object) {
				return createRenewalTypeAdapter();
			}
			@Override
			public Adapter caseRouteType(RouteType object) {
				return createRouteTypeAdapter();
			}
			@Override
			public Adapter caseRRMAXType(RRMAXType object) {
				return createRRMAXTypeAdapter();
			}
			@Override
			public Adapter caseRRMINType(RRMINType object) {
				return createRRMINTypeAdapter();
			}
			@Override
			public Adapter caseSenderType(SenderType object) {
				return createSenderTypeAdapter();
			}
			@Override
			public Adapter caseSeverityType(SeverityType object) {
				return createSeverityTypeAdapter();
			}
			@Override
			public Adapter caseSexType(SexType object) {
				return createSexTypeAdapter();
			}
			@Override
			public Adapter caseSiteType(SiteType object) {
				return createSiteTypeAdapter();
			}
			@Override
			public Adapter caseSourceType(SourceType object) {
				return createSourceTypeAdapter();
			}
			@Override
			public Adapter caseSpecialisationType(SpecialisationType object) {
				return createSpecialisationTypeAdapter();
			}
			@Override
			public Adapter caseStandardType(StandardType object) {
				return createStandardTypeAdapter();
			}
			@Override
			public Adapter caseStrengthType(StrengthType object) {
				return createStrengthTypeAdapter();
			}
			@Override
			public Adapter caseSubstanceproductType(SubstanceproductType object) {
				return createSubstanceproductTypeAdapter();
			}
			@Override
			public Adapter caseSubstanceType(SubstanceType object) {
				return createSubstanceTypeAdapter();
			}
			@Override
			public Adapter caseTakesType(TakesType object) {
				return createTakesTypeAdapter();
			}
			@Override
			public Adapter caseTelecomType(TelecomType object) {
				return createTelecomTypeAdapter();
			}
			@Override
			public Adapter caseTemporalityType(TemporalityType object) {
				return createTemporalityTypeAdapter();
			}
			@Override
			public Adapter caseTextWithLayoutType(TextWithLayoutType object) {
				return createTextWithLayoutTypeAdapter();
			}
			@Override
			public Adapter caseThirdpayercontractType(ThirdpayercontractType object) {
				return createThirdpayercontractTypeAdapter();
			}
			@Override
			public Adapter caseTimequantityType(TimequantityType object) {
				return createTimequantityTypeAdapter();
			}
			@Override
			public Adapter caseTimeunitType(TimeunitType object) {
				return createTimeunitTypeAdapter();
			}
			@Override
			public Adapter caseTransactionType(TransactionType object) {
				return createTransactionTypeAdapter();
			}
			@Override
			public Adapter caseUnitType(UnitType object) {
				return createUnitTypeAdapter();
			}
			@Override
			public Adapter caseUrgencyType(UrgencyType object) {
				return createUrgencyTypeAdapter();
			}
			@Override
			public Adapter caseWeekdayType(WeekdayType object) {
				return createWeekdayTypeAdapter();
			}
			@Override
			public Adapter caseWeekdayType1(WeekdayType1 object) {
				return createWeekdayType1Adapter();
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
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AcknowledgmentType <em>Acknowledgment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AcknowledgmentType
	 * @generated
	 */
	public Adapter createAcknowledgmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressType
	 * @generated
	 */
	public Adapter createAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase <em>Address Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase
	 * @generated
	 */
	public Adapter createAddressTypeBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationquantityType <em>Administrationquantity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationquantityType
	 * @generated
	 */
	public Adapter createAdministrationquantityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationunitType <em>Administrationunit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationunitType
	 * @generated
	 */
	public Adapter createAdministrationunitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AuthorType <em>Author Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AuthorType
	 * @generated
	 */
	public Adapter createAuthorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType <em>Base64 Encrypted Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType
	 * @generated
	 */
	public Adapter createBase64EncryptedDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedValueType <em>Base64 Encrypted Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedValueType
	 * @generated
	 */
	public Adapter createBase64EncryptedValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CertaintyType <em>Certainty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CertaintyType
	 * @generated
	 */
	public Adapter createCertaintyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CivilstateType <em>Civilstate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CivilstateType
	 * @generated
	 */
	public Adapter createCivilstateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType <em>Compoundprescription Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType
	 * @generated
	 */
	public Adapter createCompoundprescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType <em>Compound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType
	 * @generated
	 */
	public Adapter createCompoundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ConfidentialityType <em>Confidentiality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ConfidentialityType
	 * @generated
	 */
	public Adapter createConfidentialityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType <em>Contentlocalitemattribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType
	 * @generated
	 */
	public Adapter createContentlocalitemattributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType
	 * @generated
	 */
	public Adapter createContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CostType
	 * @generated
	 */
	public Adapter createCostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CountryType <em>Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CountryType
	 * @generated
	 */
	public Adapter createCountryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DateType
	 * @generated
	 */
	public Adapter createDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DayperiodType <em>Dayperiod Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DayperiodType
	 * @generated
	 */
	public Adapter createDayperiodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType <em>Daytime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType
	 * @generated
	 */
	public Adapter createDaytimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DenominatorType <em>Denominator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DenominatorType
	 * @generated
	 */
	public Adapter createDenominatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DurationType <em>Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DurationType
	 * @generated
	 */
	public Adapter createDurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorMyCarenetType <em>Error My Carenet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorMyCarenetType
	 * @generated
	 */
	public Adapter createErrorMyCarenetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType
	 * @generated
	 */
	public Adapter createErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ExternalsourceType <em>Externalsource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ExternalsourceType
	 * @generated
	 */
	public Adapter createExternalsourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType <em>FCMAX Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType
	 * @generated
	 */
	public Adapter createFCMAXTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMINType <em>FCMIN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMINType
	 * @generated
	 */
	public Adapter createFCMINTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType <em>Feedback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType
	 * @generated
	 */
	public Adapter createFeedbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType <em>Folder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType
	 * @generated
	 */
	public Adapter createFolderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FormularyreferenceType <em>Formularyreference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FormularyreferenceType
	 * @generated
	 */
	public Adapter createFormularyreferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType <em>Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType
	 * @generated
	 */
	public Adapter createFrequencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType <em>Galenicform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType
	 * @generated
	 */
	public Adapter createGalenicformTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType <em>Hcparty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType
	 * @generated
	 */
	public Adapter createHcpartyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType
	 * @generated
	 */
	public Adapter createHeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType <em>Heading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType
	 * @generated
	 */
	public Adapter createHeadingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType <em>Holter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType
	 * @generated
	 */
	public Adapter createHolterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityreasonType <em>Incapacityreason Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityreasonType
	 * @generated
	 */
	public Adapter createIncapacityreasonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType <em>Incapacity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType
	 * @generated
	 */
	public Adapter createIncapacityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType <em>Insurance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType
	 * @generated
	 */
	public Adapter createInsuranceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType
	 * @generated
	 */
	public Adapter createItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType <em>Kmehrmessage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType
	 * @generated
	 */
	public Adapter createKmehrmessageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LifecycleType <em>Lifecycle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.LifecycleType
	 * @generated
	 */
	public Adapter createLifecycleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LocalitemattributeType <em>Localitemattribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.LocalitemattributeType
	 * @generated
	 */
	public Adapter createLocalitemattributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LocationBirthPlaceType <em>Location Birth Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.LocationBirthPlaceType
	 * @generated
	 */
	public Adapter createLocationBirthPlaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MaxrefType <em>Maxref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MaxrefType
	 * @generated
	 */
	public Adapter createMaxrefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType <em>Medication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType
	 * @generated
	 */
	public Adapter createMedicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType <em>Medicinal Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType
	 * @generated
	 */
	public Adapter createMedicinalProductTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MemberinsuranceType <em>Memberinsurance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MemberinsuranceType
	 * @generated
	 */
	public Adapter createMemberinsuranceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MinrefType <em>Minref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MinrefType
	 * @generated
	 */
	public Adapter createMinrefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType <em>Moment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType
	 * @generated
	 */
	public Adapter createMomentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.NationalityType <em>Nationality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.NationalityType
	 * @generated
	 */
	public Adapter createNationalityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.NominatorType <em>Nominator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.NominatorType
	 * @generated
	 */
	public Adapter createNominatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PackageType
	 * @generated
	 */
	public Adapter createPackageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PeriodicityType <em>Periodicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PeriodicityType
	 * @generated
	 */
	public Adapter createPeriodicityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType <em>Personalpart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType
	 * @generated
	 */
	public Adapter createPersonalpartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType <em>Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType
	 * @generated
	 */
	public Adapter createPersonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight <em>Person Type Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight
	 * @generated
	 */
	public Adapter createPersonTypeLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType <em>Posology Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType
	 * @generated
	 */
	public Adapter createPosologyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PresentationType <em>Presentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PresentationType
	 * @generated
	 */
	public Adapter createPresentationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ProfessionType <em>Profession Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ProfessionType
	 * @generated
	 */
	public Adapter createProfessionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityprefixType <em>Quantityprefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityprefixType
	 * @generated
	 */
	public Adapter createQuantityprefixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityType <em>Quantity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityType
	 * @generated
	 */
	public Adapter createQuantityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType <em>Recipient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType
	 * @generated
	 */
	public Adapter createRecipientTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefscopeType <em>Refscope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RefscopeType
	 * @generated
	 */
	public Adapter createRefscopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType <em>Refvalue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType
	 * @generated
	 */
	public Adapter createRefvalueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType <em>Regimen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType
	 * @generated
	 */
	public Adapter createRegimenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RenewalType <em>Renewal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RenewalType
	 * @generated
	 */
	public Adapter createRenewalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RouteType <em>Route Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RouteType
	 * @generated
	 */
	public Adapter createRouteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMAXType <em>RRMAX Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMAXType
	 * @generated
	 */
	public Adapter createRRMAXTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMINType <em>RRMIN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMINType
	 * @generated
	 */
	public Adapter createRRMINTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SenderType <em>Sender Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SenderType
	 * @generated
	 */
	public Adapter createSenderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SeverityType <em>Severity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SeverityType
	 * @generated
	 */
	public Adapter createSeverityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SexType <em>Sex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SexType
	 * @generated
	 */
	public Adapter createSexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SiteType <em>Site Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SiteType
	 * @generated
	 */
	public Adapter createSiteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType
	 * @generated
	 */
	public Adapter createSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SpecialisationType <em>Specialisation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SpecialisationType
	 * @generated
	 */
	public Adapter createSpecialisationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType <em>Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType
	 * @generated
	 */
	public Adapter createStandardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.StrengthType <em>Strength Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.StrengthType
	 * @generated
	 */
	public Adapter createStrengthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType <em>Substanceproduct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType
	 * @generated
	 */
	public Adapter createSubstanceproductTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType <em>Substance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType
	 * @generated
	 */
	public Adapter createSubstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TakesType <em>Takes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TakesType
	 * @generated
	 */
	public Adapter createTakesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType <em>Telecom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType
	 * @generated
	 */
	public Adapter createTelecomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TemporalityType <em>Temporality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TemporalityType
	 * @generated
	 */
	public Adapter createTemporalityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TextWithLayoutType <em>Text With Layout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TextWithLayoutType
	 * @generated
	 */
	public Adapter createTextWithLayoutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ThirdpayercontractType <em>Thirdpayercontract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ThirdpayercontractType
	 * @generated
	 */
	public Adapter createThirdpayercontractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TimequantityType <em>Timequantity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TimequantityType
	 * @generated
	 */
	public Adapter createTimequantityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TimeunitType <em>Timeunit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TimeunitType
	 * @generated
	 */
	public Adapter createTimeunitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType
	 * @generated
	 */
	public Adapter createTransactionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.UnitType
	 * @generated
	 */
	public Adapter createUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.UrgencyType <em>Urgency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.UrgencyType
	 * @generated
	 */
	public Adapter createUrgencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType <em>Weekday Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType
	 * @generated
	 */
	public Adapter createWeekdayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType1 <em>Weekday Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType1
	 * @generated
	 */
	public Adapter createWeekdayType1Adapter() {
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

} //KmehrAdapterFactory
