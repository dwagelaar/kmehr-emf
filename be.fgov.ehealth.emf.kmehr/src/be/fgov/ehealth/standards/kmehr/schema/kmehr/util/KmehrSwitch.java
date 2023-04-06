/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.util;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.*;

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
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage
 * @generated
 */
public class KmehrSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KmehrPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmehrSwitch() {
		if (modelPackage == null) {
			modelPackage = KmehrPackage.eINSTANCE;
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
			case KmehrPackage.ACKNOWLEDGMENT_TYPE: {
				AcknowledgmentType acknowledgmentType = (AcknowledgmentType)theEObject;
				T result = caseAcknowledgmentType(acknowledgmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = caseAddressTypeBase(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.ADDRESS_TYPE_BASE: {
				AddressTypeBase addressTypeBase = (AddressTypeBase)theEObject;
				T result = caseAddressTypeBase(addressTypeBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.ADMINISTRATIONQUANTITY_TYPE: {
				AdministrationquantityType administrationquantityType = (AdministrationquantityType)theEObject;
				T result = caseAdministrationquantityType(administrationquantityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.ADMINISTRATIONUNIT_TYPE: {
				AdministrationunitType administrationunitType = (AdministrationunitType)theEObject;
				T result = caseAdministrationunitType(administrationunitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.AUTHOR_TYPE: {
				AuthorType authorType = (AuthorType)theEObject;
				T result = caseAuthorType(authorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE: {
				Base64EncryptedDataType base64EncryptedDataType = (Base64EncryptedDataType)theEObject;
				T result = caseBase64EncryptedDataType(base64EncryptedDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.BASE64_ENCRYPTED_VALUE_TYPE: {
				Base64EncryptedValueType base64EncryptedValueType = (Base64EncryptedValueType)theEObject;
				T result = caseBase64EncryptedValueType(base64EncryptedValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.CERTAINTY_TYPE: {
				CertaintyType certaintyType = (CertaintyType)theEObject;
				T result = caseCertaintyType(certaintyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.CIVILSTATE_TYPE: {
				CivilstateType civilstateType = (CivilstateType)theEObject;
				T result = caseCivilstateType(civilstateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE: {
				CompoundprescriptionType compoundprescriptionType = (CompoundprescriptionType)theEObject;
				T result = caseCompoundprescriptionType(compoundprescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.COMPOUND_TYPE: {
				CompoundType compoundType = (CompoundType)theEObject;
				T result = caseCompoundType(compoundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.CONFIDENTIALITY_TYPE: {
				ConfidentialityType confidentialityType = (ConfidentialityType)theEObject;
				T result = caseConfidentialityType(confidentialityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.CONTENTLOCALITEMATTRIBUTE_TYPE: {
				ContentlocalitemattributeType contentlocalitemattributeType = (ContentlocalitemattributeType)theEObject;
				T result = caseContentlocalitemattributeType(contentlocalitemattributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.CONTENT_TYPE: {
				ContentType contentType = (ContentType)theEObject;
				T result = caseContentType(contentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.COST_TYPE: {
				CostType costType = (CostType)theEObject;
				T result = caseCostType(costType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.COUNTRY_TYPE: {
				CountryType countryType = (CountryType)theEObject;
				T result = caseCountryType(countryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.DATE_TYPE: {
				DateType dateType = (DateType)theEObject;
				T result = caseDateType(dateType);
				if (result == null) result = caseMomentType(dateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.DAYPERIOD_TYPE: {
				DayperiodType dayperiodType = (DayperiodType)theEObject;
				T result = caseDayperiodType(dayperiodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.DAYTIME_TYPE: {
				DaytimeType daytimeType = (DaytimeType)theEObject;
				T result = caseDaytimeType(daytimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.DENOMINATOR_TYPE: {
				DenominatorType denominatorType = (DenominatorType)theEObject;
				T result = caseDenominatorType(denominatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.DURATION_TYPE: {
				DurationType durationType = (DurationType)theEObject;
				T result = caseDurationType(durationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.ERROR_MY_CARENET_TYPE: {
				ErrorMyCarenetType errorMyCarenetType = (ErrorMyCarenetType)theEObject;
				T result = caseErrorMyCarenetType(errorMyCarenetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.ERROR_TYPE: {
				ErrorType errorType = (ErrorType)theEObject;
				T result = caseErrorType(errorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.EXTERNALSOURCE_TYPE: {
				ExternalsourceType externalsourceType = (ExternalsourceType)theEObject;
				T result = caseExternalsourceType(externalsourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.FCMAX_TYPE: {
				FCMAXType fcmaxType = (FCMAXType)theEObject;
				T result = caseFCMAXType(fcmaxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.FCMIN_TYPE: {
				FCMINType fcminType = (FCMINType)theEObject;
				T result = caseFCMINType(fcminType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.FEEDBACK_TYPE: {
				FeedbackType feedbackType = (FeedbackType)theEObject;
				T result = caseFeedbackType(feedbackType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.FOLDER_TYPE: {
				FolderType folderType = (FolderType)theEObject;
				T result = caseFolderType(folderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.FORMULARYREFERENCE_TYPE: {
				FormularyreferenceType formularyreferenceType = (FormularyreferenceType)theEObject;
				T result = caseFormularyreferenceType(formularyreferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.FREQUENCY_TYPE: {
				FrequencyType frequencyType = (FrequencyType)theEObject;
				T result = caseFrequencyType(frequencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.GALENICFORM_TYPE: {
				GalenicformType galenicformType = (GalenicformType)theEObject;
				T result = caseGalenicformType(galenicformType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.HCPARTY_TYPE: {
				HcpartyType hcpartyType = (HcpartyType)theEObject;
				T result = caseHcpartyType(hcpartyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.HEADER_TYPE: {
				HeaderType headerType = (HeaderType)theEObject;
				T result = caseHeaderType(headerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.HEADING_TYPE: {
				HeadingType headingType = (HeadingType)theEObject;
				T result = caseHeadingType(headingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.HOLTER_TYPE: {
				HolterType holterType = (HolterType)theEObject;
				T result = caseHolterType(holterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.INCAPACITYREASON_TYPE: {
				IncapacityreasonType incapacityreasonType = (IncapacityreasonType)theEObject;
				T result = caseIncapacityreasonType(incapacityreasonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.INCAPACITY_TYPE: {
				IncapacityType incapacityType = (IncapacityType)theEObject;
				T result = caseIncapacityType(incapacityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.INSURANCE_TYPE: {
				InsuranceType insuranceType = (InsuranceType)theEObject;
				T result = caseInsuranceType(insuranceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.ITEM_TYPE: {
				ItemType itemType = (ItemType)theEObject;
				T result = caseItemType(itemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.KMEHRMESSAGE_TYPE: {
				KmehrmessageType kmehrmessageType = (KmehrmessageType)theEObject;
				T result = caseKmehrmessageType(kmehrmessageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.LIFECYCLE_TYPE: {
				LifecycleType lifecycleType = (LifecycleType)theEObject;
				T result = caseLifecycleType(lifecycleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.LOCALITEMATTRIBUTE_TYPE: {
				LocalitemattributeType localitemattributeType = (LocalitemattributeType)theEObject;
				T result = caseLocalitemattributeType(localitemattributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.LOCATION_BIRTH_PLACE_TYPE: {
				LocationBirthPlaceType locationBirthPlaceType = (LocationBirthPlaceType)theEObject;
				T result = caseLocationBirthPlaceType(locationBirthPlaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.MAXREF_TYPE: {
				MaxrefType maxrefType = (MaxrefType)theEObject;
				T result = caseMaxrefType(maxrefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.MEDICATION_TYPE: {
				MedicationType medicationType = (MedicationType)theEObject;
				T result = caseMedicationType(medicationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.MEDICINAL_PRODUCT_TYPE: {
				MedicinalProductType medicinalProductType = (MedicinalProductType)theEObject;
				T result = caseMedicinalProductType(medicinalProductType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.MEMBERINSURANCE_TYPE: {
				MemberinsuranceType memberinsuranceType = (MemberinsuranceType)theEObject;
				T result = caseMemberinsuranceType(memberinsuranceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.MINREF_TYPE: {
				MinrefType minrefType = (MinrefType)theEObject;
				T result = caseMinrefType(minrefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.MOMENT_TYPE: {
				MomentType momentType = (MomentType)theEObject;
				T result = caseMomentType(momentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.NATIONALITY_TYPE: {
				NationalityType nationalityType = (NationalityType)theEObject;
				T result = caseNationalityType(nationalityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.NOMINATOR_TYPE: {
				NominatorType nominatorType = (NominatorType)theEObject;
				T result = caseNominatorType(nominatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.PACKAGE_TYPE: {
				PackageType packageType = (PackageType)theEObject;
				T result = casePackageType(packageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.PERIODICITY_TYPE: {
				PeriodicityType periodicityType = (PeriodicityType)theEObject;
				T result = casePeriodicityType(periodicityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.PERSONALPART_TYPE: {
				PersonalpartType personalpartType = (PersonalpartType)theEObject;
				T result = casePersonalpartType(personalpartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.PERSON_TYPE: {
				PersonType personType = (PersonType)theEObject;
				T result = casePersonType(personType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.PERSON_TYPE_LIGHT: {
				PersonTypeLight personTypeLight = (PersonTypeLight)theEObject;
				T result = casePersonTypeLight(personTypeLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.POSOLOGY_TYPE: {
				PosologyType posologyType = (PosologyType)theEObject;
				T result = casePosologyType(posologyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.PRESENTATION_TYPE: {
				PresentationType presentationType = (PresentationType)theEObject;
				T result = casePresentationType(presentationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.PROFESSION_TYPE: {
				ProfessionType professionType = (ProfessionType)theEObject;
				T result = caseProfessionType(professionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.QUANTITYPREFIX_TYPE: {
				QuantityprefixType quantityprefixType = (QuantityprefixType)theEObject;
				T result = caseQuantityprefixType(quantityprefixType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.QUANTITY_TYPE: {
				QuantityType quantityType = (QuantityType)theEObject;
				T result = caseQuantityType(quantityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.RECIPIENT_TYPE: {
				RecipientType recipientType = (RecipientType)theEObject;
				T result = caseRecipientType(recipientType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.REFSCOPE_TYPE: {
				RefscopeType refscopeType = (RefscopeType)theEObject;
				T result = caseRefscopeType(refscopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.REFVALUE_TYPE: {
				RefvalueType refvalueType = (RefvalueType)theEObject;
				T result = caseRefvalueType(refvalueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.REGIMEN_TYPE: {
				RegimenType regimenType = (RegimenType)theEObject;
				T result = caseRegimenType(regimenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.RENEWAL_TYPE: {
				RenewalType renewalType = (RenewalType)theEObject;
				T result = caseRenewalType(renewalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.ROUTE_TYPE: {
				RouteType routeType = (RouteType)theEObject;
				T result = caseRouteType(routeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.RRMAX_TYPE: {
				RRMAXType rrmaxType = (RRMAXType)theEObject;
				T result = caseRRMAXType(rrmaxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.RRMIN_TYPE: {
				RRMINType rrminType = (RRMINType)theEObject;
				T result = caseRRMINType(rrminType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.SENDER_TYPE: {
				SenderType senderType = (SenderType)theEObject;
				T result = caseSenderType(senderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.SEVERITY_TYPE: {
				SeverityType severityType = (SeverityType)theEObject;
				T result = caseSeverityType(severityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.SEX_TYPE: {
				SexType sexType = (SexType)theEObject;
				T result = caseSexType(sexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.SITE_TYPE: {
				SiteType siteType = (SiteType)theEObject;
				T result = caseSiteType(siteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.SOURCE_TYPE: {
				SourceType sourceType = (SourceType)theEObject;
				T result = caseSourceType(sourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.SPECIALISATION_TYPE: {
				SpecialisationType specialisationType = (SpecialisationType)theEObject;
				T result = caseSpecialisationType(specialisationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.STANDARD_TYPE: {
				StandardType standardType = (StandardType)theEObject;
				T result = caseStandardType(standardType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.STRENGTH_TYPE: {
				StrengthType strengthType = (StrengthType)theEObject;
				T result = caseStrengthType(strengthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.SUBSTANCEPRODUCT_TYPE: {
				SubstanceproductType substanceproductType = (SubstanceproductType)theEObject;
				T result = caseSubstanceproductType(substanceproductType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.SUBSTANCE_TYPE: {
				SubstanceType substanceType = (SubstanceType)theEObject;
				T result = caseSubstanceType(substanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.TAKES_TYPE: {
				TakesType takesType = (TakesType)theEObject;
				T result = caseTakesType(takesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.TELECOM_TYPE: {
				TelecomType telecomType = (TelecomType)theEObject;
				T result = caseTelecomType(telecomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.TEMPORALITY_TYPE: {
				TemporalityType temporalityType = (TemporalityType)theEObject;
				T result = caseTemporalityType(temporalityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.TEXT_WITH_LAYOUT_TYPE: {
				TextWithLayoutType textWithLayoutType = (TextWithLayoutType)theEObject;
				T result = caseTextWithLayoutType(textWithLayoutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.THIRDPAYERCONTRACT_TYPE: {
				ThirdpayercontractType thirdpayercontractType = (ThirdpayercontractType)theEObject;
				T result = caseThirdpayercontractType(thirdpayercontractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.TIMEQUANTITY_TYPE: {
				TimequantityType timequantityType = (TimequantityType)theEObject;
				T result = caseTimequantityType(timequantityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.TIMEUNIT_TYPE: {
				TimeunitType timeunitType = (TimeunitType)theEObject;
				T result = caseTimeunitType(timeunitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.TRANSACTION_TYPE: {
				TransactionType transactionType = (TransactionType)theEObject;
				T result = caseTransactionType(transactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.UNIT_TYPE: {
				UnitType unitType = (UnitType)theEObject;
				T result = caseUnitType(unitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.URGENCY_TYPE: {
				UrgencyType urgencyType = (UrgencyType)theEObject;
				T result = caseUrgencyType(urgencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.WEEKDAY_TYPE: {
				WeekdayType weekdayType = (WeekdayType)theEObject;
				T result = caseWeekdayType(weekdayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KmehrPackage.WEEKDAY_TYPE1: {
				WeekdayType1 weekdayType1 = (WeekdayType1)theEObject;
				T result = caseWeekdayType1(weekdayType1);
				if (result == null) result = caseWeekdayType(weekdayType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acknowledgment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acknowledgment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcknowledgmentType(AcknowledgmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressTypeBase(AddressTypeBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrationquantity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrationquantity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrationquantityType(AdministrationquantityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrationunit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrationunit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrationunitType(AdministrationunitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorType(AuthorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base64 Encrypted Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base64 Encrypted Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase64EncryptedDataType(Base64EncryptedDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base64 Encrypted Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base64 Encrypted Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase64EncryptedValueType(Base64EncryptedValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certainty Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certainty Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertaintyType(CertaintyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Civilstate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Civilstate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCivilstateType(CivilstateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compoundprescription Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compoundprescription Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundprescriptionType(CompoundprescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundType(CompoundType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confidentiality Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confidentiality Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfidentialityType(ConfidentialityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contentlocalitemattribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contentlocalitemattribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentlocalitemattributeType(ContentlocalitemattributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentType(ContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostType(CostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountryType(CountryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateType(DateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dayperiod Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dayperiod Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDayperiodType(DayperiodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daytime Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daytime Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaytimeType(DaytimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Denominator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Denominator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDenominatorType(DenominatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationType(DurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error My Carenet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error My Carenet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorMyCarenetType(ErrorMyCarenetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorType(ErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Externalsource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Externalsource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalsourceType(ExternalsourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FCMAX Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FCMAX Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFCMAXType(FCMAXType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FCMIN Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FCMIN Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFCMINType(FCMINType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedbackType(FeedbackType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderType(FolderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formularyreference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formularyreference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormularyreferenceType(FormularyreferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyType(FrequencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Galenicform Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Galenicform Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGalenicformType(GalenicformType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hcparty Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hcparty Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHcpartyType(HcpartyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderType(HeaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heading Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heading Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadingType(HeadingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Holter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Holter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHolterType(HolterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incapacityreason Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incapacityreason Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncapacityreasonType(IncapacityreasonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incapacity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incapacity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncapacityType(IncapacityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsuranceType(InsuranceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemType(ItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kmehrmessage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kmehrmessage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKmehrmessageType(KmehrmessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifecycle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifecycle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifecycleType(LifecycleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localitemattribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localitemattribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalitemattributeType(LocalitemattributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Birth Place Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Birth Place Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationBirthPlaceType(LocationBirthPlaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maxref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maxref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxrefType(MaxrefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationType(MedicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductType(MedicinalProductType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memberinsurance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memberinsurance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberinsuranceType(MemberinsuranceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinrefType(MinrefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMomentType(MomentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nationality Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nationality Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNationalityType(NationalityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nominator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nominator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNominatorType(NominatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageType(PackageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodicity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodicity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicityType(PeriodicityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personalpart Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personalpart Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonalpartType(PersonalpartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonType(PersonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Type Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Type Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonTypeLight(PersonTypeLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Posology Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Posology Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosologyType(PosologyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationType(PresentationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profession Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profession Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessionType(ProfessionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantityprefix Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantityprefix Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityprefixType(QuantityprefixType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityType(QuantityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recipient Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recipient Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecipientType(RecipientType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refscope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refscope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefscopeType(RefscopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refvalue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refvalue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefvalueType(RefvalueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regimen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regimen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegimenType(RegimenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Renewal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Renewal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenewalType(RenewalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteType(RouteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RRMAX Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RRMAX Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRRMAXType(RRMAXType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RRMIN Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RRMIN Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRRMINType(RRMINType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderType(SenderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Severity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Severity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeverityType(SeverityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSexType(SexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiteType(SiteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceType(SourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialisation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialisation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialisationType(SpecialisationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardType(StandardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strength Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strength Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrengthType(StrengthType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substanceproduct Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substanceproduct Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceproductType(SubstanceproductType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceType(SubstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Takes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Takes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTakesType(TakesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telecom Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telecom Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelecomType(TelecomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporality Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporality Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalityType(TemporalityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text With Layout Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text With Layout Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextWithLayoutType(TextWithLayoutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thirdpayercontract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thirdpayercontract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThirdpayercontractType(ThirdpayercontractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timequantity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timequantity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimequantityType(TimequantityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timeunit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timeunit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeunitType(TimeunitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionType(TransactionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitType(UnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Urgency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Urgency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrgencyType(UrgencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weekday Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weekday Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeekdayType(WeekdayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weekday Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weekday Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeekdayType1(WeekdayType1 object) {
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

} //KmehrSwitch
