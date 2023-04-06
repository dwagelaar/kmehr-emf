/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrFactory
 * @model kind="package"
 * @generated
 */
public interface KmehrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kmehr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ehealth.fgov.be/standards/kmehr/schema/v1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kmehr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KmehrPackage eINSTANCE = be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl.init();

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AcknowledgmentTypeImpl <em>Acknowledgment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AcknowledgmentTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getAcknowledgmentType()
	 * @generated
	 */
	int ACKNOWLEDGMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACKNOWLEDGMENT_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Acknowledgment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACKNOWLEDGMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Acknowledgment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACKNOWLEDGMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl <em>Address Type Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getAddressTypeBase()
	 * @generated
	 */
	int ADDRESS_TYPE_BASE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_BASE__ID = 0;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_BASE__CD = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_BASE__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_BASE__ZIP = 3;

	/**
	 * The feature id for the '<em><b>Nis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_BASE__NIS = 4;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_BASE__CITY = 5;

	/**
	 * The feature id for the '<em><b>District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_BASE__DISTRICT = 6;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_BASE__STREET = 7;

	/**
	 * The feature id for the '<em><b>Housenumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_BASE__HOUSENUMBER = 8;

	/**
	 * The feature id for the '<em><b>Postboxnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_BASE__POSTBOXNUMBER = 9;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_BASE__TEXT = 10;

	/**
	 * The number of structural features of the '<em>Address Type Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_BASE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Address Type Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeImpl <em>Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ID = ADDRESS_TYPE_BASE__ID;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__CD = ADDRESS_TYPE_BASE__CD;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__COUNTRY = ADDRESS_TYPE_BASE__COUNTRY;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ZIP = ADDRESS_TYPE_BASE__ZIP;

	/**
	 * The feature id for the '<em><b>Nis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__NIS = ADDRESS_TYPE_BASE__NIS;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__CITY = ADDRESS_TYPE_BASE__CITY;

	/**
	 * The feature id for the '<em><b>District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__DISTRICT = ADDRESS_TYPE_BASE__DISTRICT;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__STREET = ADDRESS_TYPE_BASE__STREET;

	/**
	 * The feature id for the '<em><b>Housenumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__HOUSENUMBER = ADDRESS_TYPE_BASE__HOUSENUMBER;

	/**
	 * The feature id for the '<em><b>Postboxnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__POSTBOXNUMBER = ADDRESS_TYPE_BASE__POSTBOXNUMBER;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__TEXT = ADDRESS_TYPE_BASE__TEXT;

	/**
	 * The number of structural features of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_FEATURE_COUNT = ADDRESS_TYPE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_OPERATION_COUNT = ADDRESS_TYPE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AdministrationquantityTypeImpl <em>Administrationquantity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AdministrationquantityTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getAdministrationquantityType()
	 * @generated
	 */
	int ADMINISTRATIONQUANTITY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIONQUANTITY_TYPE__DECIMAL = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIONQUANTITY_TYPE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Administrationquantity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIONQUANTITY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Administrationquantity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIONQUANTITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AdministrationunitTypeImpl <em>Administrationunit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AdministrationunitTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getAdministrationunitType()
	 * @generated
	 */
	int ADMINISTRATIONUNIT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIONUNIT_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Administrationunit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIONUNIT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Administrationunit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIONUNIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AuthorTypeImpl <em>Author Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AuthorTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getAuthorType()
	 * @generated
	 */
	int AUTHOR_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Hcparty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_TYPE__HCPARTY = 0;

	/**
	 * The number of structural features of the '<em>Author Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Author Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.Base64EncryptedDataTypeImpl <em>Base64 Encrypted Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.Base64EncryptedDataTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getBase64EncryptedDataType()
	 * @generated
	 */
	int BASE64_ENCRYPTED_DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_ENCRYPTED_DATA_TYPE__CD = 0;

	/**
	 * The feature id for the '<em><b>Base64 Encrypted Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_ENCRYPTED_DATA_TYPE__BASE64_ENCRYPTED_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Base64 Encrypted Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_ENCRYPTED_DATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base64 Encrypted Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_ENCRYPTED_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.Base64EncryptedValueTypeImpl <em>Base64 Encrypted Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.Base64EncryptedValueTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getBase64EncryptedValueType()
	 * @generated
	 */
	int BASE64_ENCRYPTED_VALUE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_ENCRYPTED_VALUE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_ENCRYPTED_VALUE_TYPE__ENCODING = 1;

	/**
	 * The number of structural features of the '<em>Base64 Encrypted Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_ENCRYPTED_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base64 Encrypted Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_ENCRYPTED_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CertaintyTypeImpl <em>Certainty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CertaintyTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getCertaintyType()
	 * @generated
	 */
	int CERTAINTY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTAINTY_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Certainty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTAINTY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Certainty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTAINTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CivilstateTypeImpl <em>Civilstate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CivilstateTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getCivilstateType()
	 * @generated
	 */
	int CIVILSTATE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIVILSTATE_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Civilstate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIVILSTATE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Civilstate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIVILSTATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundprescriptionTypeImpl <em>Compoundprescription Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundprescriptionTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getCompoundprescriptionType()
	 * @generated
	 */
	int COMPOUNDPRESCRIPTION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUNDPRESCRIPTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Compound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUNDPRESCRIPTION_TYPE__COMPOUND = 1;

	/**
	 * The feature id for the '<em><b>Formularyreference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUNDPRESCRIPTION_TYPE__FORMULARYREFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Magistraltext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUNDPRESCRIPTION_TYPE__MAGISTRALTEXT = 3;

	/**
	 * The feature id for the '<em><b>Galenicform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUNDPRESCRIPTION_TYPE__GALENICFORM = 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUNDPRESCRIPTION_TYPE__QUANTITY = 5;

	/**
	 * The feature id for the '<em><b>L</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUNDPRESCRIPTION_TYPE__L = 6;

	/**
	 * The number of structural features of the '<em>Compoundprescription Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUNDPRESCRIPTION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Compoundprescription Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUNDPRESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundTypeImpl <em>Compound Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getCompoundType()
	 * @generated
	 */
	int COMPOUND_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Medicinalproduct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE__MEDICINALPRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE__SUBSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Quantityprefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE__QUANTITYPREFIX = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE__QUANTITY = 4;

	/**
	 * The number of structural features of the '<em>Compound Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Compound Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ConfidentialityTypeImpl <em>Confidentiality Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ConfidentialityTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getConfidentialityType()
	 * @generated
	 */
	int CONFIDENTIALITY_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Hcparty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_TYPE__HCPARTY = 0;

	/**
	 * The number of structural features of the '<em>Confidentiality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Confidentiality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl <em>Contentlocalitemattribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getContentlocalitemattributeType()
	 * @generated
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE__CD = 1;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE__DECIMAL = 2;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE__BOOLEAN = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE__DATE = 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE__TIME = 6;

	/**
	 * The feature id for the '<em><b>Hcparty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE__HCPARTY = 7;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE__PERSON = 8;

	/**
	 * The feature id for the '<em><b>Lnk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE__LNK = 9;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE__UNIT = 10;

	/**
	 * The number of structural features of the '<em>Contentlocalitemattribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Contentlocalitemattribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTLOCALITEMATTRIBUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__CD = 1;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__DECIMAL = 2;

	/**
	 * The feature id for the '<em><b>Unsigned Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__UNSIGNED_INT = 3;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__BOOLEAN = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__TEXT = 5;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__YEAR = 6;

	/**
	 * The feature id for the '<em><b>Yearmonth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__YEARMONTH = 7;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__DATE = 8;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__TIME = 9;

	/**
	 * The feature id for the '<em><b>Hcparty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__HCPARTY = 10;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__PERSON = 11;

	/**
	 * The feature id for the '<em><b>Insurance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__INSURANCE = 12;

	/**
	 * The feature id for the '<em><b>Incapacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__INCAPACITY = 13;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__ERROR = 14;

	/**
	 * The feature id for the '<em><b>Medicinalproduct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__MEDICINALPRODUCT = 15;

	/**
	 * The feature id for the '<em><b>Substanceproduct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__SUBSTANCEPRODUCT = 16;

	/**
	 * The feature id for the '<em><b>Compoundprescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__COMPOUNDPRESCRIPTION = 17;

	/**
	 * The feature id for the '<em><b>Medication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__MEDICATION = 18;

	/**
	 * The feature id for the '<em><b>Holter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__HOLTER = 19;

	/**
	 * The feature id for the '<em><b>Ecg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__ECG = 20;

	/**
	 * The feature id for the '<em><b>Bacteriology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__BACTERIOLOGY = 21;

	/**
	 * The feature id for the '<em><b>Lnk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__LNK = 22;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__LOCATION = 23;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__UNIT = 24;

	/**
	 * The feature id for the '<em><b>Minref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__MINREF = 25;

	/**
	 * The feature id for the '<em><b>Maxref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__MAXREF = 26;

	/**
	 * The feature id for the '<em><b>Refscope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__REFSCOPE = 27;

	/**
	 * The number of structural features of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_FEATURE_COUNT = 28;

	/**
	 * The number of operations of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CostTypeImpl <em>Cost Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CostTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getCostType()
	 * @generated
	 */
	int COST_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__DECIMAL = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Cost Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cost Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CountryTypeImpl <em>Country Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CountryTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getCountryType()
	 * @generated
	 */
	int COUNTRY_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Country Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Country Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MomentTypeImpl <em>Moment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MomentTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getMomentType()
	 * @generated
	 */
	int MOMENT_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_TYPE__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Yearmonth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_TYPE__YEARMONTH = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_TYPE__DATE = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_TYPE__TIME = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_TYPE__TEXT = 4;

	/**
	 * The number of structural features of the '<em>Moment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Moment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DateTypeImpl <em>Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DateTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__YEAR = MOMENT_TYPE__YEAR;

	/**
	 * The feature id for the '<em><b>Yearmonth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__YEARMONTH = MOMENT_TYPE__YEARMONTH;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__DATE = MOMENT_TYPE__DATE;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__TIME = MOMENT_TYPE__TIME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__TEXT = MOMENT_TYPE__TEXT;

	/**
	 * The number of structural features of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_FEATURE_COUNT = MOMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_OPERATION_COUNT = MOMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DayperiodTypeImpl <em>Dayperiod Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DayperiodTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getDayperiodType()
	 * @generated
	 */
	int DAYPERIOD_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAYPERIOD_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Dayperiod Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAYPERIOD_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dayperiod Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAYPERIOD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DaytimeTypeImpl <em>Daytime Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DaytimeTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getDaytimeType()
	 * @generated
	 */
	int DAYTIME_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAYTIME_TYPE__TIME = 0;

	/**
	 * The feature id for the '<em><b>Dayperiod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAYTIME_TYPE__DAYPERIOD = 1;

	/**
	 * The number of structural features of the '<em>Daytime Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAYTIME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Daytime Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAYTIME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DenominatorTypeImpl <em>Denominator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DenominatorTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getDenominatorType()
	 * @generated
	 */
	int DENOMINATOR_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENOMINATOR_TYPE__QUANTITY = 0;

	/**
	 * The number of structural features of the '<em>Denominator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENOMINATOR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Denominator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENOMINATOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DocumentRootImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 21;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Kmehrmessage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KMEHRMESSAGE = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DurationTypeImpl <em>Duration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DurationTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getDurationType()
	 * @generated
	 */
	int DURATION_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_TYPE__DECIMAL = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_TYPE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Duration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Duration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ErrorMyCarenetTypeImpl <em>Error My Carenet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ErrorMyCarenetTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getErrorMyCarenetType()
	 * @generated
	 */
	int ERROR_MY_CARENET_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MY_CARENET_TYPE__CD = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MY_CARENET_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MY_CARENET_TYPE__URL = 2;

	/**
	 * The number of structural features of the '<em>Error My Carenet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MY_CARENET_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Error My Carenet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MY_CARENET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ErrorTypeImpl <em>Error Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ErrorTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getErrorType()
	 * @generated
	 */
	int ERROR_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__CD = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__URL = 3;

	/**
	 * The number of structural features of the '<em>Error Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Error Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ExternalsourceTypeImpl <em>Externalsource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ExternalsourceTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getExternalsourceType()
	 * @generated
	 */
	int EXTERNALSOURCE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALSOURCE_TYPE__SOURCE = 0;

	/**
	 * The number of structural features of the '<em>Externalsource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALSOURCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Externalsource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNALSOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FCMAXTypeImpl <em>FCMAX Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FCMAXTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getFCMAXType()
	 * @generated
	 */
	int FCMAX_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCMAX_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>TIME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCMAX_TYPE__TIME = 1;

	/**
	 * The number of structural features of the '<em>FCMAX Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCMAX_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>FCMAX Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCMAX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FCMINTypeImpl <em>FCMIN Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FCMINTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getFCMINType()
	 * @generated
	 */
	int FCMIN_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCMIN_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>TIME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCMIN_TYPE__TIME = 1;

	/**
	 * The number of structural features of the '<em>FCMIN Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCMIN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>FCMIN Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCMIN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FeedbackTypeImpl <em>Feedback Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FeedbackTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getFeedbackType()
	 * @generated
	 */
	int FEEDBACK_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Reportrequested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE__REPORTREQUESTED = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Feedback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feedback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FolderTypeImpl <em>Folder Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FolderTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getFolderType()
	 * @generated
	 */
	int FOLDER_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__CONFIDENTIALITY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__PATIENT = 2;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__TRANSACTION = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Lnk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__LNK = 5;

	/**
	 * The number of structural features of the '<em>Folder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Folder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FormularyreferenceTypeImpl <em>Formularyreference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FormularyreferenceTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getFormularyreferenceType()
	 * @generated
	 */
	int FORMULARYREFERENCE_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARYREFERENCE_TYPE__CD = 0;

	/**
	 * The feature id for the '<em><b>Formularyname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARYREFERENCE_TYPE__FORMULARYNAME = 1;

	/**
	 * The number of structural features of the '<em>Formularyreference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARYREFERENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Formularyreference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARYREFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FrequencyTypeImpl <em>Frequency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FrequencyTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getFrequencyType()
	 * @generated
	 */
	int FREQUENCY_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Nominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_TYPE__NOMINATOR = 0;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_TYPE__DENOMINATOR = 1;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_TYPE__DECIMAL = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_TYPE__UNIT = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_TYPE__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Periodicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_TYPE__PERIODICITY = 5;

	/**
	 * The number of structural features of the '<em>Frequency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Frequency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.GalenicformTypeImpl <em>Galenicform Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.GalenicformTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getGalenicformType()
	 * @generated
	 */
	int GALENICFORM_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALENICFORM_TYPE__CD = 0;

	/**
	 * The feature id for the '<em><b>Galenicformtext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALENICFORM_TYPE__GALENICFORMTEXT = 1;

	/**
	 * The number of structural features of the '<em>Galenicform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALENICFORM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Galenicform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALENICFORM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HcpartyTypeImpl <em>Hcparty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HcpartyTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getHcpartyType()
	 * @generated
	 */
	int HCPARTY_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCPARTY_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCPARTY_TYPE__CD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCPARTY_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCPARTY_TYPE__FIRSTNAME = 3;

	/**
	 * The feature id for the '<em><b>Familyname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCPARTY_TYPE__FAMILYNAME = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCPARTY_TYPE__ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCPARTY_TYPE__TELECOM = 6;

	/**
	 * The number of structural features of the '<em>Hcparty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCPARTY_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Hcparty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCPARTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl <em>Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getHeaderType()
	 * @generated
	 */
	int HEADER_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__CONFIDENTIALITY = 0;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__STANDARD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__DATE = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__TIME = 4;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__SENDER = 5;

	/**
	 * The feature id for the '<em><b>Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__RECIPIENT = 6;

	/**
	 * The feature id for the '<em><b>Urgency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__URGENCY = 7;

	/**
	 * The feature id for the '<em><b>Acknowledgment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__ACKNOWLEDGMENT = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__TEXT = 9;

	/**
	 * The feature id for the '<em><b>Lnk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__LNK = 10;

	/**
	 * The feature id for the '<em><b>Expirationdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__EXPIRATIONDATE = 11;

	/**
	 * The feature id for the '<em><b>Externalsource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__EXTERNALSOURCE = 12;

	/**
	 * The number of structural features of the '<em>Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeadingTypeImpl <em>Heading Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeadingTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getHeadingType()
	 * @generated
	 */
	int HEADING_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_TYPE__CONFIDENTIALITY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_TYPE__CD = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_TYPE__GROUP = 3;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_TYPE__HEADING = 4;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_TYPE__ITEM = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_TYPE__TEXT = 6;

	/**
	 * The feature id for the '<em><b>Lnk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_TYPE__LNK = 7;

	/**
	 * The number of structural features of the '<em>Heading Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Heading Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl <em>Holter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getHolterType()
	 * @generated
	 */
	int HOLTER_TYPE = 36;

	/**
	 * The feature id for the '<em><b>FCAVG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__FCAVG = 0;

	/**
	 * The feature id for the '<em><b>FCMAX</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__FCMAX = 1;

	/**
	 * The feature id for the '<em><b>FCMIN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__FCMIN = 2;

	/**
	 * The feature id for the '<em><b>FCAVGD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__FCAVGD = 3;

	/**
	 * The feature id for the '<em><b>FCAVGN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__FCAVGN = 4;

	/**
	 * The feature id for the '<em><b>RRMAX</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__RRMAX = 5;

	/**
	 * The feature id for the '<em><b>RRMIN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__RRMIN = 6;

	/**
	 * The feature id for the '<em><b>QRSTOT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__QRSTOT = 7;

	/**
	 * The feature id for the '<em><b>BRADY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__BRADY = 8;

	/**
	 * The feature id for the '<em><b>PAUSE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__PAUSE = 9;

	/**
	 * The feature id for the '<em><b>LONG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__LONG = 10;

	/**
	 * The feature id for the '<em><b>ESV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__ESV = 11;

	/**
	 * The feature id for the '<em><b>DBLV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__DBLV = 12;

	/**
	 * The feature id for the '<em><b>SALVV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__SALVV = 13;

	/**
	 * The feature id for the '<em><b>BGV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__BGV = 14;

	/**
	 * The feature id for the '<em><b>TGV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__TGV = 15;

	/**
	 * The feature id for the '<em><b>TACHY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__TACHY = 16;

	/**
	 * The feature id for the '<em><b>ESSV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__ESSV = 17;

	/**
	 * The feature id for the '<em><b>DBLSV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__DBLSV = 18;

	/**
	 * The feature id for the '<em><b>SALVSV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__SALVSV = 19;

	/**
	 * The feature id for the '<em><b>BGSV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__BGSV = 20;

	/**
	 * The feature id for the '<em><b>TGSV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__TGSV = 21;

	/**
	 * The feature id for the '<em><b>TACHYSV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__TACHYSV = 22;

	/**
	 * The feature id for the '<em><b>RRINST</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE__RRINST = 23;

	/**
	 * The number of structural features of the '<em>Holter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Holter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLTER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.IncapacityreasonTypeImpl <em>Incapacityreason Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.IncapacityreasonTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getIncapacityreasonType()
	 * @generated
	 */
	int INCAPACITYREASON_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCAPACITYREASON_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Incapacityreason Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCAPACITYREASON_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Incapacityreason Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCAPACITYREASON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.IncapacityTypeImpl <em>Incapacity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.IncapacityTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getIncapacityType()
	 * @generated
	 */
	int INCAPACITY_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCAPACITY_TYPE__CD = 0;

	/**
	 * The feature id for the '<em><b>Incapacityreason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCAPACITY_TYPE__INCAPACITYREASON = 1;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCAPACITY_TYPE__PERCENTAGE = 2;

	/**
	 * The feature id for the '<em><b>Outofhomeallowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCAPACITY_TYPE__OUTOFHOMEALLOWED = 3;

	/**
	 * The number of structural features of the '<em>Incapacity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCAPACITY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Incapacity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCAPACITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl <em>Insurance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getInsuranceType()
	 * @generated
	 */
	int INSURANCE_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE__MEMBERSHIP = 1;

	/**
	 * The feature id for the '<em><b>Siscard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE__SISCARD = 2;

	/**
	 * The feature id for the '<em><b>Begindate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE__BEGINDATE = 3;

	/**
	 * The feature id for the '<em><b>Enddate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE__ENDDATE = 4;

	/**
	 * The feature id for the '<em><b>Cg1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE__CG1 = 5;

	/**
	 * The feature id for the '<em><b>Cg2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE__CG2 = 6;

	/**
	 * The feature id for the '<em><b>Socialfranchiseperiod1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE__SOCIALFRANCHISEPERIOD1 = 7;

	/**
	 * The feature id for the '<em><b>Socialfranchiseperiod2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE__SOCIALFRANCHISEPERIOD2 = 8;

	/**
	 * The feature id for the '<em><b>Personalpart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE__PERSONALPART = 9;

	/**
	 * The feature id for the '<em><b>Thirdpayercontract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE__THIRDPAYERCONTRACT = 10;

	/**
	 * The feature id for the '<em><b>Begindatepayment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE__BEGINDATEPAYMENT = 11;

	/**
	 * The feature id for the '<em><b>Approvalnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE__APPROVALNUMBER = 12;

	/**
	 * The number of structural features of the '<em>Insurance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Insurance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__CONFIDENTIALITY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__CD = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Beginmoment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__BEGINMOMENT = 6;

	/**
	 * The feature id for the '<em><b>Endmoment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__ENDMOMENT = 7;

	/**
	 * The feature id for the '<em><b>Iscomplete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__ISCOMPLETE = 8;

	/**
	 * The feature id for the '<em><b>Isvalidated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__ISVALIDATED = 9;

	/**
	 * The feature id for the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__LIFECYCLE = 10;

	/**
	 * The feature id for the '<em><b>Isrelevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__ISRELEVANT = 11;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__SEVERITY = 12;

	/**
	 * The feature id for the '<em><b>Certainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__CERTAINTY = 13;

	/**
	 * The feature id for the '<em><b>Temporality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__TEMPORALITY = 14;

	/**
	 * The feature id for the '<em><b>Urgency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__URGENCY = 15;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__QUANTITY = 16;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__STRENGTH = 17;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__FREQUENCY = 18;

	/**
	 * The feature id for the '<em><b>Site</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__SITE = 19;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__COST = 20;

	/**
	 * The feature id for the '<em><b>Dayperiod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__DAYPERIOD = 21;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__DURATION = 22;

	/**
	 * The feature id for the '<em><b>Posology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__POSOLOGY = 23;

	/**
	 * The feature id for the '<em><b>Regimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__REGIMEN = 24;

	/**
	 * The feature id for the '<em><b>Deliverydate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__DELIVERYDATE = 25;

	/**
	 * The feature id for the '<em><b>Renewal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__RENEWAL = 26;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__ROUTE = 27;

	/**
	 * The feature id for the '<em><b>Batch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__BATCH = 28;

	/**
	 * The feature id for the '<em><b>Instructionforoverdosing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__INSTRUCTIONFOROVERDOSING = 29;

	/**
	 * The feature id for the '<em><b>Instructionforpatient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__INSTRUCTIONFORPATIENT = 30;

	/**
	 * The feature id for the '<em><b>Instructionforreimbursement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__INSTRUCTIONFORREIMBURSEMENT = 31;

	/**
	 * The feature id for the '<em><b>Issubstitutionallowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__ISSUBSTITUTIONALLOWED = 32;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__FEEDBACK = 33;

	/**
	 * The feature id for the '<em><b>Local</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__LOCAL = 34;

	/**
	 * The feature id for the '<em><b>Recorddatetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__RECORDDATETIME = 35;

	/**
	 * The feature id for the '<em><b>Lnk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__LNK = 36;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 37;

	/**
	 * The number of operations of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrmessageTypeImpl <em>Kmehrmessage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrmessageTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getKmehrmessageType()
	 * @generated
	 */
	int KMEHRMESSAGE_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEHRMESSAGE_TYPE__CONFIDENTIALITY = 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEHRMESSAGE_TYPE__HEADER = 1;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEHRMESSAGE_TYPE__FOLDER = 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEHRMESSAGE_TYPE__SIGNATURE = 3;

	/**
	 * The feature id for the '<em><b>Encrypted Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEHRMESSAGE_TYPE__ENCRYPTED_DATA = 4;

	/**
	 * The feature id for the '<em><b>Base64 Encrypted Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEHRMESSAGE_TYPE__BASE64_ENCRYPTED_DATA = 5;

	/**
	 * The number of structural features of the '<em>Kmehrmessage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEHRMESSAGE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Kmehrmessage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEHRMESSAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.LifecycleTypeImpl <em>Lifecycle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.LifecycleTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getLifecycleType()
	 * @generated
	 */
	int LIFECYCLE_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Lifecycle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lifecycle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.LocalitemattributeTypeImpl <em>Localitemattribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.LocalitemattributeTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getLocalitemattributeType()
	 * @generated
	 */
	int LOCALITEMATTRIBUTE_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITEMATTRIBUTE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITEMATTRIBUTE_TYPE__CD = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITEMATTRIBUTE_TYPE__CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Localitemattribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITEMATTRIBUTE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Localitemattribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITEMATTRIBUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.LocationBirthPlaceTypeImpl <em>Location Birth Place Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.LocationBirthPlaceTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getLocationBirthPlaceType()
	 * @generated
	 */
	int LOCATION_BIRTH_PLACE_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_BIRTH_PLACE_TYPE__CD = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_BIRTH_PLACE_TYPE__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_BIRTH_PLACE_TYPE__ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Location Birth Place Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_BIRTH_PLACE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location Birth Place Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_BIRTH_PLACE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MaxrefTypeImpl <em>Maxref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MaxrefTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getMaxrefType()
	 * @generated
	 */
	int MAXREF_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXREF_TYPE__DECIMAL = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXREF_TYPE__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Maxref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXREF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Maxref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXREF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl <em>Medication Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getMedicationType()
	 * @generated
	 */
	int MEDICATION_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__CD = 0;

	/**
	 * The feature id for the '<em><b>Inn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__INN = 1;

	/**
	 * The feature id for the '<em><b>Magistral</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__MAGISTRAL = 2;

	/**
	 * The feature id for the '<em><b>Tradename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__TRADENAME = 3;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__PRESENTATION = 4;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__STRENGTH = 5;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__ROUTE = 6;

	/**
	 * The feature id for the '<em><b>Batch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__BATCH = 7;

	/**
	 * The feature id for the '<em><b>Numberofpackage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__NUMBEROFPACKAGE = 8;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__PACKAGE = 9;

	/**
	 * The feature id for the '<em><b>Quantityperpackage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__QUANTITYPERPACKAGE = 10;

	/**
	 * The feature id for the '<em><b>Instructionforoverdosing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__INSTRUCTIONFOROVERDOSING = 11;

	/**
	 * The feature id for the '<em><b>Instructionforpatient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__INSTRUCTIONFORPATIENT = 12;

	/**
	 * The feature id for the '<em><b>Instructionforreimbursement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__INSTRUCTIONFORREIMBURSEMENT = 13;

	/**
	 * The feature id for the '<em><b>Issubstitutionallowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE__ISSUBSTITUTIONALLOWED = 14;

	/**
	 * The number of structural features of the '<em>Medication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Medication Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicinalProductTypeImpl <em>Medicinal Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicinalProductTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getMedicinalProductType()
	 * @generated
	 */
	int MEDICINAL_PRODUCT_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Intendedcd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINAL_PRODUCT_TYPE__INTENDEDCD = 0;

	/**
	 * The feature id for the '<em><b>Deliveredcd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINAL_PRODUCT_TYPE__DELIVEREDCD = 1;

	/**
	 * The feature id for the '<em><b>Intendedname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINAL_PRODUCT_TYPE__INTENDEDNAME = 2;

	/**
	 * The feature id for the '<em><b>Deliveredname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINAL_PRODUCT_TYPE__DELIVEREDNAME = 3;

	/**
	 * The number of structural features of the '<em>Medicinal Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINAL_PRODUCT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Medicinal Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINAL_PRODUCT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MemberinsuranceTypeImpl <em>Memberinsurance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MemberinsuranceTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getMemberinsuranceType()
	 * @generated
	 */
	int MEMBERINSURANCE_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERINSURANCE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERINSURANCE_TYPE__MEMBERSHIP = 1;

	/**
	 * The number of structural features of the '<em>Memberinsurance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERINSURANCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Memberinsurance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERINSURANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MinrefTypeImpl <em>Minref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MinrefTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getMinrefType()
	 * @generated
	 */
	int MINREF_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINREF_TYPE__DECIMAL = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINREF_TYPE__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Minref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINREF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Minref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINREF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.NationalityTypeImpl <em>Nationality Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.NationalityTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getNationalityType()
	 * @generated
	 */
	int NATIONALITY_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONALITY_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Nationality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONALITY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nationality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONALITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.NominatorTypeImpl <em>Nominator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.NominatorTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getNominatorType()
	 * @generated
	 */
	int NOMINATOR_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINATOR_TYPE__QUANTITY = 0;

	/**
	 * The number of structural features of the '<em>Nominator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINATOR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nominator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINATOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PackageTypeImpl <em>Package Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PackageTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPackageType()
	 * @generated
	 */
	int PACKAGE_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Package Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Package Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PeriodicityTypeImpl <em>Periodicity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PeriodicityTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPeriodicityType()
	 * @generated
	 */
	int PERIODICITY_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICITY_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Periodicity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICITY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Periodicity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonalpartTypeImpl <em>Personalpart Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonalpartTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPersonalpartType()
	 * @generated
	 */
	int PERSONALPART_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALPART_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALPART_TYPE__CD = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALPART_TYPE__DATE = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALPART_TYPE__TIME = 3;

	/**
	 * The number of structural features of the '<em>Personalpart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALPART_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Personalpart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALPART_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl <em>Person Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPersonType()
	 * @generated
	 */
	int PERSON_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__FIRSTNAME = 1;

	/**
	 * The feature id for the '<em><b>Familyname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__FAMILYNAME = 2;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__BIRTHDATE = 3;

	/**
	 * The feature id for the '<em><b>Birthlocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__BIRTHLOCATION = 4;

	/**
	 * The feature id for the '<em><b>Deathdate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__DEATHDATE = 5;

	/**
	 * The feature id for the '<em><b>Deathlocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__DEATHLOCATION = 6;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__SEX = 7;

	/**
	 * The feature id for the '<em><b>Nationality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__NATIONALITY = 8;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__ADDRESS = 9;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__TELECOM = 10;

	/**
	 * The feature id for the '<em><b>Usuallanguage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__USUALLANGUAGE = 11;

	/**
	 * The feature id for the '<em><b>Profession</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__PROFESSION = 12;

	/**
	 * The feature id for the '<em><b>Insurancystatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__INSURANCYSTATUS = 13;

	/**
	 * The feature id for the '<em><b>Insurancymembership</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__INSURANCYMEMBERSHIP = 14;

	/**
	 * The feature id for the '<em><b>Recorddatetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__RECORDDATETIME = 15;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__TEXT = 16;

	/**
	 * The feature id for the '<em><b>Civilstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__CIVILSTATE = 17;

	/**
	 * The number of structural features of the '<em>Person Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Person Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeLightImpl <em>Person Type Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeLightImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPersonTypeLight()
	 * @generated
	 */
	int PERSON_TYPE_LIGHT = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_LIGHT__ID = 0;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_LIGHT__FIRSTNAME = 1;

	/**
	 * The feature id for the '<em><b>Familyname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_LIGHT__FAMILYNAME = 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_LIGHT__ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_LIGHT__TELECOM = 4;

	/**
	 * The number of structural features of the '<em>Person Type Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_LIGHT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Person Type Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_LIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PosologyTypeImpl <em>Posology Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PosologyTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPosologyType()
	 * @generated
	 */
	int POSOLOGY_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSOLOGY_TYPE__LOW = 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSOLOGY_TYPE__HIGH = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSOLOGY_TYPE__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Takes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSOLOGY_TYPE__TAKES = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSOLOGY_TYPE__TEXT = 4;

	/**
	 * The number of structural features of the '<em>Posology Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSOLOGY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Posology Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSOLOGY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PresentationTypeImpl <em>Presentation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PresentationTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPresentationType()
	 * @generated
	 */
	int PRESENTATION_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Presentation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Presentation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ProfessionTypeImpl <em>Profession Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ProfessionTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getProfessionType()
	 * @generated
	 */
	int PROFESSION_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSION_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSION_TYPE__CD = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSION_TYPE__TEXT = 2;

	/**
	 * The number of structural features of the '<em>Profession Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Profession Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.QuantityprefixTypeImpl <em>Quantityprefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.QuantityprefixTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getQuantityprefixType()
	 * @generated
	 */
	int QUANTITYPREFIX_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITYPREFIX_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Quantityprefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITYPREFIX_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Quantityprefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITYPREFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.QuantityTypeImpl <em>Quantity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.QuantityTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getQuantityType()
	 * @generated
	 */
	int QUANTITY_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE__DECIMAL = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Quantity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Quantity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RecipientTypeImpl <em>Recipient Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RecipientTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRecipientType()
	 * @generated
	 */
	int RECIPIENT_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Hcparty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT_TYPE__HCPARTY = 0;

	/**
	 * The feature id for the '<em><b>Dummy Friend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT_TYPE__DUMMY_FRIEND = 1;

	/**
	 * The number of structural features of the '<em>Recipient Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Recipient Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPIENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RefscopeTypeImpl <em>Refscope Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RefscopeTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRefscopeType()
	 * @generated
	 */
	int REFSCOPE_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFSCOPE_TYPE__CD = 0;

	/**
	 * The feature id for the '<em><b>Refvalue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFSCOPE_TYPE__REFVALUE = 1;

	/**
	 * The number of structural features of the '<em>Refscope Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFSCOPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Refscope Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFSCOPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RefvalueTypeImpl <em>Refvalue Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RefvalueTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRefvalueType()
	 * @generated
	 */
	int REFVALUE_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Minref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFVALUE_TYPE__MINREF = 0;

	/**
	 * The feature id for the '<em><b>Maxref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFVALUE_TYPE__MAXREF = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFVALUE_TYPE__CONTEXT = 2;

	/**
	 * The number of structural features of the '<em>Refvalue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFVALUE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Refvalue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFVALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RegimenTypeImpl <em>Regimen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RegimenTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRegimenType()
	 * @generated
	 */
	int REGIMEN_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIMEN_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Daynumber</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIMEN_TYPE__DAYNUMBER = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIMEN_TYPE__DATE = 2;

	/**
	 * The feature id for the '<em><b>Weekday</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIMEN_TYPE__WEEKDAY = 3;

	/**
	 * The feature id for the '<em><b>Daytime</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIMEN_TYPE__DAYTIME = 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIMEN_TYPE__QUANTITY = 5;

	/**
	 * The number of structural features of the '<em>Regimen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIMEN_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Regimen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIMEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RenewalTypeImpl <em>Renewal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RenewalTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRenewalType()
	 * @generated
	 */
	int RENEWAL_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWAL_TYPE__DECIMAL = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWAL_TYPE__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWAL_TYPE__TEXT = 2;

	/**
	 * The number of structural features of the '<em>Renewal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWAL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Renewal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENEWAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RouteTypeImpl <em>Route Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RouteTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRouteType()
	 * @generated
	 */
	int ROUTE_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Route Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Route Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RRMAXTypeImpl <em>RRMAX Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RRMAXTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRRMAXType()
	 * @generated
	 */
	int RRMAX_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RRMAX_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>TIME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RRMAX_TYPE__TIME = 1;

	/**
	 * The number of structural features of the '<em>RRMAX Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RRMAX_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RRMAX Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RRMAX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RRMINTypeImpl <em>RRMIN Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RRMINTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRRMINType()
	 * @generated
	 */
	int RRMIN_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RRMIN_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>TIME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RRMIN_TYPE__TIME = 1;

	/**
	 * The number of structural features of the '<em>RRMIN Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RRMIN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RRMIN Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RRMIN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SenderTypeImpl <em>Sender Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SenderTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSenderType()
	 * @generated
	 */
	int SENDER_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Hcparty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_TYPE__HCPARTY = 0;

	/**
	 * The number of structural features of the '<em>Sender Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sender Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SeverityTypeImpl <em>Severity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SeverityTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSeverityType()
	 * @generated
	 */
	int SEVERITY_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Severity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Severity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SexTypeImpl <em>Sex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SexTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSexType()
	 * @generated
	 */
	int SEX_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEX_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Sex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEX_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SiteTypeImpl <em>Site Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SiteTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSiteType()
	 * @generated
	 */
	int SITE_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TYPE__CD = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TYPE__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Site Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Site Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SourceTypeImpl <em>Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SourceTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__CD = 0;

	/**
	 * The feature id for the '<em><b>Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__DATETIME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__PROOF = 3;

	/**
	 * The number of structural features of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SpecialisationTypeImpl <em>Specialisation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SpecialisationTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSpecialisationType()
	 * @generated
	 */
	int SPECIALISATION_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_TYPE__CD = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Specialisation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specialisation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.StandardTypeImpl <em>Standard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.StandardTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getStandardType()
	 * @generated
	 */
	int STANDARD_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE__CD = 0;

	/**
	 * The feature id for the '<em><b>Specialisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE__SPECIALISATION = 1;

	/**
	 * The number of structural features of the '<em>Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Standard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.StrengthTypeImpl <em>Strength Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.StrengthTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getStrengthType()
	 * @generated
	 */
	int STRENGTH_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH_TYPE__DECIMAL = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH_TYPE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Strength Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Strength Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SubstanceproductTypeImpl <em>Substanceproduct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SubstanceproductTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSubstanceproductType()
	 * @generated
	 */
	int SUBSTANCEPRODUCT_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Intendedcd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCEPRODUCT_TYPE__INTENDEDCD = 0;

	/**
	 * The feature id for the '<em><b>Deliveredcd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCEPRODUCT_TYPE__DELIVEREDCD = 1;

	/**
	 * The feature id for the '<em><b>Intendedname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCEPRODUCT_TYPE__INTENDEDNAME = 2;

	/**
	 * The feature id for the '<em><b>Deliveredname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCEPRODUCT_TYPE__DELIVEREDNAME = 3;

	/**
	 * The number of structural features of the '<em>Substanceproduct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCEPRODUCT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Substanceproduct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCEPRODUCT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SubstanceTypeImpl <em>Substance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SubstanceTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSubstanceType()
	 * @generated
	 */
	int SUBSTANCE_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_TYPE__CD = 0;

	/**
	 * The feature id for the '<em><b>Substancename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_TYPE__SUBSTANCENAME = 1;

	/**
	 * The number of structural features of the '<em>Substance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Substance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TakesTypeImpl <em>Takes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TakesTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTakesType()
	 * @generated
	 */
	int TAKES_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKES_TYPE__LOW = 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKES_TYPE__HIGH = 1;

	/**
	 * The number of structural features of the '<em>Takes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Takes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TelecomTypeImpl <em>Telecom Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TelecomTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTelecomType()
	 * @generated
	 */
	int TELECOM_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_TYPE__CD = 1;

	/**
	 * The feature id for the '<em><b>Telecomnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_TYPE__TELECOMNUMBER = 2;

	/**
	 * The number of structural features of the '<em>Telecom Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Telecom Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TemporalityTypeImpl <em>Temporality Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TemporalityTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTemporalityType()
	 * @generated
	 */
	int TEMPORALITY_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORALITY_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Temporality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORALITY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Temporality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORALITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TextWithLayoutTypeImpl <em>Text With Layout Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TextWithLayoutTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTextWithLayoutType()
	 * @generated
	 */
	int TEXT_WITH_LAYOUT_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WITH_LAYOUT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WITH_LAYOUT_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>L</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WITH_LAYOUT_TYPE__L = 2;

	/**
	 * The number of structural features of the '<em>Text With Layout Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WITH_LAYOUT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Text With Layout Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WITH_LAYOUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ThirdpayercontractTypeImpl <em>Thirdpayercontract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ThirdpayercontractTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getThirdpayercontractType()
	 * @generated
	 */
	int THIRDPAYERCONTRACT_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRDPAYERCONTRACT_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Thirdpayercontract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRDPAYERCONTRACT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Thirdpayercontract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRDPAYERCONTRACT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TimequantityTypeImpl <em>Timequantity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TimequantityTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTimequantityType()
	 * @generated
	 */
	int TIMEQUANTITY_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEQUANTITY_TYPE__DECIMAL = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEQUANTITY_TYPE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Timequantity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEQUANTITY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Timequantity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEQUANTITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TimeunitTypeImpl <em>Timeunit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TimeunitTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTimeunitType()
	 * @generated
	 */
	int TIMEUNIT_TYPE = 87;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEUNIT_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Timeunit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEUNIT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Timeunit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEUNIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl <em>Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTransactionType()
	 * @generated
	 */
	int TRANSACTION_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__CONFIDENTIALITY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__CD = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__DATE = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__TIME = 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Redactor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__REDACTOR = 6;

	/**
	 * The feature id for the '<em><b>Iscomplete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__ISCOMPLETE = 7;

	/**
	 * The feature id for the '<em><b>Isvalidated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__ISVALIDATED = 8;

	/**
	 * The feature id for the '<em><b>Expirationdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__EXPIRATIONDATE = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__GROUP = 10;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__HEADING = 11;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__ITEM = 12;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__TEXT = 13;

	/**
	 * The feature id for the '<em><b>Text With Layout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__TEXT_WITH_LAYOUT = 14;

	/**
	 * The feature id for the '<em><b>Lnk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__LNK = 15;

	/**
	 * The feature id for the '<em><b>Recorddatetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__RECORDDATETIME = 16;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__VERSION = 17;

	/**
	 * The number of structural features of the '<em>Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.UnitTypeImpl <em>Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.UnitTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 89;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.UrgencyTypeImpl <em>Urgency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.UrgencyTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getUrgencyType()
	 * @generated
	 */
	int URGENCY_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URGENCY_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Urgency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URGENCY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Urgency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URGENCY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.WeekdayTypeImpl <em>Weekday Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.WeekdayTypeImpl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getWeekdayType()
	 * @generated
	 */
	int WEEKDAY_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_TYPE__CD = 0;

	/**
	 * The number of structural features of the '<em>Weekday Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Weekday Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.WeekdayType1Impl <em>Weekday Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.WeekdayType1Impl
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getWeekdayType1()
	 * @generated
	 */
	int WEEKDAY_TYPE1 = 92;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_TYPE1__CD = WEEKDAY_TYPE__CD;

	/**
	 * The feature id for the '<em><b>Weeknumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_TYPE1__WEEKNUMBER = WEEKDAY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weekday Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_TYPE1_FEATURE_COUNT = WEEKDAY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Weekday Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKDAY_TYPE1_OPERATION_COUNT = WEEKDAY_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AcknowledgmentType <em>Acknowledgment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acknowledgment Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AcknowledgmentType
	 * @generated
	 */
	EClass getAcknowledgmentType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AcknowledgmentType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AcknowledgmentType#getCd()
	 * @see #getAcknowledgmentType()
	 * @generated
	 */
	EReference getAcknowledgmentType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressType
	 * @generated
	 */
	EClass getAddressType();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase <em>Address Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type Base</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase
	 * @generated
	 */
	EClass getAddressTypeBase();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getId()
	 * @see #getAddressTypeBase()
	 * @generated
	 */
	EReference getAddressTypeBase_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getCd()
	 * @see #getAddressTypeBase()
	 * @generated
	 */
	EReference getAddressTypeBase_Cd();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getCountry()
	 * @see #getAddressTypeBase()
	 * @generated
	 */
	EReference getAddressTypeBase_Country();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getZip()
	 * @see #getAddressTypeBase()
	 * @generated
	 */
	EAttribute getAddressTypeBase_Zip();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getNis <em>Nis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nis</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getNis()
	 * @see #getAddressTypeBase()
	 * @generated
	 */
	EAttribute getAddressTypeBase_Nis();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getCity()
	 * @see #getAddressTypeBase()
	 * @generated
	 */
	EAttribute getAddressTypeBase_City();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getDistrict <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>District</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getDistrict()
	 * @see #getAddressTypeBase()
	 * @generated
	 */
	EAttribute getAddressTypeBase_District();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getStreet()
	 * @see #getAddressTypeBase()
	 * @generated
	 */
	EAttribute getAddressTypeBase_Street();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getHousenumber <em>Housenumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Housenumber</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getHousenumber()
	 * @see #getAddressTypeBase()
	 * @generated
	 */
	EAttribute getAddressTypeBase_Housenumber();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getPostboxnumber <em>Postboxnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postboxnumber</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getPostboxnumber()
	 * @see #getAddressTypeBase()
	 * @generated
	 */
	EAttribute getAddressTypeBase_Postboxnumber();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AddressTypeBase#getText()
	 * @see #getAddressTypeBase()
	 * @generated
	 */
	EReference getAddressTypeBase_Text();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationquantityType <em>Administrationquantity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrationquantity Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationquantityType
	 * @generated
	 */
	EClass getAdministrationquantityType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationquantityType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationquantityType#getDecimal()
	 * @see #getAdministrationquantityType()
	 * @generated
	 */
	EAttribute getAdministrationquantityType_Decimal();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationquantityType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationquantityType#getUnit()
	 * @see #getAdministrationquantityType()
	 * @generated
	 */
	EReference getAdministrationquantityType_Unit();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationunitType <em>Administrationunit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrationunit Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationunitType
	 * @generated
	 */
	EClass getAdministrationunitType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationunitType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationunitType#getCd()
	 * @see #getAdministrationunitType()
	 * @generated
	 */
	EReference getAdministrationunitType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AuthorType <em>Author Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AuthorType
	 * @generated
	 */
	EClass getAuthorType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.AuthorType#getHcparty <em>Hcparty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hcparty</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.AuthorType#getHcparty()
	 * @see #getAuthorType()
	 * @generated
	 */
	EReference getAuthorType_Hcparty();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType <em>Base64 Encrypted Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base64 Encrypted Data Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType
	 * @generated
	 */
	EClass getBase64EncryptedDataType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType#getCd()
	 * @see #getBase64EncryptedDataType()
	 * @generated
	 */
	EReference getBase64EncryptedDataType_Cd();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType#getBase64EncryptedValue <em>Base64 Encrypted Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base64 Encrypted Value</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType#getBase64EncryptedValue()
	 * @see #getBase64EncryptedDataType()
	 * @generated
	 */
	EReference getBase64EncryptedDataType_Base64EncryptedValue();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedValueType <em>Base64 Encrypted Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base64 Encrypted Value Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedValueType
	 * @generated
	 */
	EClass getBase64EncryptedValueType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedValueType#getValue()
	 * @see #getBase64EncryptedValueType()
	 * @generated
	 */
	EAttribute getBase64EncryptedValueType_Value();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedValueType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedValueType#getEncoding()
	 * @see #getBase64EncryptedValueType()
	 * @generated
	 */
	EAttribute getBase64EncryptedValueType_Encoding();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CertaintyType <em>Certainty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certainty Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CertaintyType
	 * @generated
	 */
	EClass getCertaintyType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CertaintyType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CertaintyType#getCd()
	 * @see #getCertaintyType()
	 * @generated
	 */
	EReference getCertaintyType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CivilstateType <em>Civilstate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Civilstate Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CivilstateType
	 * @generated
	 */
	EClass getCivilstateType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CivilstateType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CivilstateType#getCd()
	 * @see #getCivilstateType()
	 * @generated
	 */
	EReference getCivilstateType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType <em>Compoundprescription Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compoundprescription Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType
	 * @generated
	 */
	EClass getCompoundprescriptionType();

	/**
	 * Returns the meta object for the attribute list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getMixed()
	 * @see #getCompoundprescriptionType()
	 * @generated
	 */
	EAttribute getCompoundprescriptionType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getCompound <em>Compound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compound</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getCompound()
	 * @see #getCompoundprescriptionType()
	 * @generated
	 */
	EReference getCompoundprescriptionType_Compound();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getFormularyreference <em>Formularyreference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formularyreference</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getFormularyreference()
	 * @see #getCompoundprescriptionType()
	 * @generated
	 */
	EReference getCompoundprescriptionType_Formularyreference();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getMagistraltext <em>Magistraltext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Magistraltext</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getMagistraltext()
	 * @see #getCompoundprescriptionType()
	 * @generated
	 */
	EReference getCompoundprescriptionType_Magistraltext();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getGalenicform <em>Galenicform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Galenicform</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getGalenicform()
	 * @see #getCompoundprescriptionType()
	 * @generated
	 */
	EReference getCompoundprescriptionType_Galenicform();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantity</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getQuantity()
	 * @see #getCompoundprescriptionType()
	 * @generated
	 */
	EReference getCompoundprescriptionType_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType#getL()
	 * @see #getCompoundprescriptionType()
	 * @generated
	 */
	EAttribute getCompoundprescriptionType_L();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType <em>Compound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType
	 * @generated
	 */
	EClass getCompoundType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getId()
	 * @see #getCompoundType()
	 * @generated
	 */
	EReference getCompoundType_Id();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getMedicinalproduct <em>Medicinalproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Medicinalproduct</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getMedicinalproduct()
	 * @see #getCompoundType()
	 * @generated
	 */
	EReference getCompoundType_Medicinalproduct();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getSubstance <em>Substance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substance</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getSubstance()
	 * @see #getCompoundType()
	 * @generated
	 */
	EReference getCompoundType_Substance();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getQuantityprefix <em>Quantityprefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantityprefix</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getQuantityprefix()
	 * @see #getCompoundType()
	 * @generated
	 */
	EReference getCompoundType_Quantityprefix();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantity</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType#getQuantity()
	 * @see #getCompoundType()
	 * @generated
	 */
	EReference getCompoundType_Quantity();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ConfidentialityType <em>Confidentiality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confidentiality Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ConfidentialityType
	 * @generated
	 */
	EClass getConfidentialityType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ConfidentialityType#getHcparty <em>Hcparty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hcparty</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ConfidentialityType#getHcparty()
	 * @see #getConfidentialityType()
	 * @generated
	 */
	EReference getConfidentialityType_Hcparty();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType <em>Contentlocalitemattribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contentlocalitemattribute Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType
	 * @generated
	 */
	EClass getContentlocalitemattributeType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getId()
	 * @see #getContentlocalitemattributeType()
	 * @generated
	 */
	EReference getContentlocalitemattributeType_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getCd()
	 * @see #getContentlocalitemattributeType()
	 * @generated
	 */
	EReference getContentlocalitemattributeType_Cd();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getDecimal()
	 * @see #getContentlocalitemattributeType()
	 * @generated
	 */
	EAttribute getContentlocalitemattributeType_Decimal();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#isBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#isBoolean()
	 * @see #getContentlocalitemattributeType()
	 * @generated
	 */
	EAttribute getContentlocalitemattributeType_Boolean();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getText()
	 * @see #getContentlocalitemattributeType()
	 * @generated
	 */
	EReference getContentlocalitemattributeType_Text();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getDate()
	 * @see #getContentlocalitemattributeType()
	 * @generated
	 */
	EAttribute getContentlocalitemattributeType_Date();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getTime()
	 * @see #getContentlocalitemattributeType()
	 * @generated
	 */
	EAttribute getContentlocalitemattributeType_Time();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getHcparty <em>Hcparty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hcparty</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getHcparty()
	 * @see #getContentlocalitemattributeType()
	 * @generated
	 */
	EReference getContentlocalitemattributeType_Hcparty();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getPerson()
	 * @see #getContentlocalitemattributeType()
	 * @generated
	 */
	EReference getContentlocalitemattributeType_Person();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getLnk <em>Lnk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lnk</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getLnk()
	 * @see #getContentlocalitemattributeType()
	 * @generated
	 */
	EReference getContentlocalitemattributeType_Lnk();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentlocalitemattributeType#getUnit()
	 * @see #getContentlocalitemattributeType()
	 * @generated
	 */
	EReference getContentlocalitemattributeType_Unit();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType
	 * @generated
	 */
	EClass getContentType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getId()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getCd()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Cd();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getDecimal()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Decimal();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getUnsignedInt <em>Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsigned Int</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getUnsignedInt()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_UnsignedInt();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#isBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#isBoolean()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Boolean();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getText()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Text();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getYear()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Year();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getYearmonth <em>Yearmonth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yearmonth</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getYearmonth()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Yearmonth();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getDate()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Date();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getTime()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Time();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getHcparty <em>Hcparty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hcparty</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getHcparty()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Hcparty();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getPerson()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Person();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getInsurance <em>Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insurance</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getInsurance()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Insurance();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getIncapacity <em>Incapacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Incapacity</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getIncapacity()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Incapacity();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getError()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Error();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMedicinalproduct <em>Medicinalproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Medicinalproduct</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMedicinalproduct()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Medicinalproduct();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getSubstanceproduct <em>Substanceproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substanceproduct</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getSubstanceproduct()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Substanceproduct();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getCompoundprescription <em>Compoundprescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compoundprescription</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getCompoundprescription()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Compoundprescription();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMedication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Medication</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMedication()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Medication();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getHolter <em>Holter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Holter</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getHolter()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Holter();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getEcg <em>Ecg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ecg</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getEcg()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Ecg();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getBacteriology <em>Bacteriology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bacteriology</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getBacteriology()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Bacteriology();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getLnk <em>Lnk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lnk</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getLnk()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Lnk();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getLocation()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Location();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getUnit()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMinref <em>Minref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minref</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMinref()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Minref();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMaxref <em>Maxref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maxref</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getMaxref()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Maxref();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getRefscope <em>Refscope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refscope</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType#getRefscope()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Refscope();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CostType
	 * @generated
	 */
	EClass getCostType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CostType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CostType#getDecimal()
	 * @see #getCostType()
	 * @generated
	 */
	EAttribute getCostType_Decimal();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CostType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CostType#getUnit()
	 * @see #getCostType()
	 * @generated
	 */
	EReference getCostType_Unit();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CountryType <em>Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CountryType
	 * @generated
	 */
	EClass getCountryType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.CountryType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.CountryType#getCd()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DateType
	 * @generated
	 */
	EClass getDateType();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DayperiodType <em>Dayperiod Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dayperiod Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DayperiodType
	 * @generated
	 */
	EClass getDayperiodType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DayperiodType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DayperiodType#getCd()
	 * @see #getDayperiodType()
	 * @generated
	 */
	EReference getDayperiodType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType <em>Daytime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daytime Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType
	 * @generated
	 */
	EClass getDaytimeType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType#getTime()
	 * @see #getDaytimeType()
	 * @generated
	 */
	EAttribute getDaytimeType_Time();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType#getDayperiod <em>Dayperiod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dayperiod</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType#getDayperiod()
	 * @see #getDaytimeType()
	 * @generated
	 */
	EReference getDaytimeType_Dayperiod();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DenominatorType <em>Denominator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Denominator Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DenominatorType
	 * @generated
	 */
	EClass getDenominatorType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DenominatorType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantity</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DenominatorType#getQuantity()
	 * @see #getDenominatorType()
	 * @generated
	 */
	EReference getDenominatorType_Quantity();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot#getKmehrmessage <em>Kmehrmessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kmehrmessage</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DocumentRoot#getKmehrmessage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Kmehrmessage();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DurationType <em>Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DurationType
	 * @generated
	 */
	EClass getDurationType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DurationType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DurationType#getDecimal()
	 * @see #getDurationType()
	 * @generated
	 */
	EAttribute getDurationType_Decimal();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.DurationType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.DurationType#getUnit()
	 * @see #getDurationType()
	 * @generated
	 */
	EReference getDurationType_Unit();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorMyCarenetType <em>Error My Carenet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error My Carenet Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorMyCarenetType
	 * @generated
	 */
	EClass getErrorMyCarenetType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorMyCarenetType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorMyCarenetType#getCd()
	 * @see #getErrorMyCarenetType()
	 * @generated
	 */
	EReference getErrorMyCarenetType_Cd();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorMyCarenetType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorMyCarenetType#getDescription()
	 * @see #getErrorMyCarenetType()
	 * @generated
	 */
	EReference getErrorMyCarenetType_Description();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorMyCarenetType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorMyCarenetType#getUrl()
	 * @see #getErrorMyCarenetType()
	 * @generated
	 */
	EAttribute getErrorMyCarenetType_Url();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType
	 * @generated
	 */
	EClass getErrorType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType#getId()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType#getCd()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_Cd();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType#getDescription()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_Description();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ErrorType#getUrl()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_Url();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ExternalsourceType <em>Externalsource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Externalsource Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ExternalsourceType
	 * @generated
	 */
	EClass getExternalsourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ExternalsourceType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ExternalsourceType#getSource()
	 * @see #getExternalsourceType()
	 * @generated
	 */
	EReference getExternalsourceType_Source();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType <em>FCMAX Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FCMAX Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType
	 * @generated
	 */
	EClass getFCMAXType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType#getValue()
	 * @see #getFCMAXType()
	 * @generated
	 */
	EAttribute getFCMAXType_Value();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType#getTIME <em>TIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TIME</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMAXType#getTIME()
	 * @see #getFCMAXType()
	 * @generated
	 */
	EAttribute getFCMAXType_TIME();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMINType <em>FCMIN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FCMIN Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMINType
	 * @generated
	 */
	EClass getFCMINType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMINType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMINType#getValue()
	 * @see #getFCMINType()
	 * @generated
	 */
	EAttribute getFCMINType_Value();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMINType#getTIME <em>TIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TIME</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FCMINType#getTIME()
	 * @see #getFCMINType()
	 * @generated
	 */
	EAttribute getFCMINType_TIME();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType <em>Feedback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType
	 * @generated
	 */
	EClass getFeedbackType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType#isReportrequested <em>Reportrequested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reportrequested</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType#isReportrequested()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EAttribute getFeedbackType_Reportrequested();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType#getText()
	 * @see #getFeedbackType()
	 * @generated
	 */
	EReference getFeedbackType_Text();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType <em>Folder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType
	 * @generated
	 */
	EClass getFolderType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidentiality</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getConfidentiality()
	 * @see #getFolderType()
	 * @generated
	 */
	EReference getFolderType_Confidentiality();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getId()
	 * @see #getFolderType()
	 * @generated
	 */
	EReference getFolderType_Id();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patient</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getPatient()
	 * @see #getFolderType()
	 * @generated
	 */
	EReference getFolderType_Patient();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transaction</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getTransaction()
	 * @see #getFolderType()
	 * @generated
	 */
	EReference getFolderType_Transaction();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getText()
	 * @see #getFolderType()
	 * @generated
	 */
	EReference getFolderType_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getLnk <em>Lnk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lnk</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType#getLnk()
	 * @see #getFolderType()
	 * @generated
	 */
	EReference getFolderType_Lnk();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FormularyreferenceType <em>Formularyreference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formularyreference Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FormularyreferenceType
	 * @generated
	 */
	EClass getFormularyreferenceType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FormularyreferenceType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FormularyreferenceType#getCd()
	 * @see #getFormularyreferenceType()
	 * @generated
	 */
	EReference getFormularyreferenceType_Cd();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FormularyreferenceType#getFormularyname <em>Formularyname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formularyname</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FormularyreferenceType#getFormularyname()
	 * @see #getFormularyreferenceType()
	 * @generated
	 */
	EAttribute getFormularyreferenceType_Formularyname();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType <em>Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType
	 * @generated
	 */
	EClass getFrequencyType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getNominator <em>Nominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nominator</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getNominator()
	 * @see #getFrequencyType()
	 * @generated
	 */
	EReference getFrequencyType_Nominator();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Denominator</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getDenominator()
	 * @see #getFrequencyType()
	 * @generated
	 */
	EReference getFrequencyType_Denominator();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getDecimal()
	 * @see #getFrequencyType()
	 * @generated
	 */
	EAttribute getFrequencyType_Decimal();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getUnit()
	 * @see #getFrequencyType()
	 * @generated
	 */
	EReference getFrequencyType_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getText()
	 * @see #getFrequencyType()
	 * @generated
	 */
	EReference getFrequencyType_Text();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getPeriodicity <em>Periodicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Periodicity</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType#getPeriodicity()
	 * @see #getFrequencyType()
	 * @generated
	 */
	EReference getFrequencyType_Periodicity();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType <em>Galenicform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Galenicform Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType
	 * @generated
	 */
	EClass getGalenicformType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType#getCd()
	 * @see #getGalenicformType()
	 * @generated
	 */
	EReference getGalenicformType_Cd();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType#getGalenicformtext <em>Galenicformtext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Galenicformtext</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType#getGalenicformtext()
	 * @see #getGalenicformType()
	 * @generated
	 */
	EReference getGalenicformType_Galenicformtext();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType <em>Hcparty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hcparty Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType
	 * @generated
	 */
	EClass getHcpartyType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getId()
	 * @see #getHcpartyType()
	 * @generated
	 */
	EReference getHcpartyType_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getCd()
	 * @see #getHcpartyType()
	 * @generated
	 */
	EReference getHcpartyType_Cd();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getName()
	 * @see #getHcpartyType()
	 * @generated
	 */
	EAttribute getHcpartyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getFirstname()
	 * @see #getHcpartyType()
	 * @generated
	 */
	EAttribute getHcpartyType_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getFamilyname <em>Familyname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Familyname</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getFamilyname()
	 * @see #getHcpartyType()
	 * @generated
	 */
	EAttribute getHcpartyType_Familyname();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getAddress()
	 * @see #getHcpartyType()
	 * @generated
	 */
	EReference getHcpartyType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getTelecom <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HcpartyType#getTelecom()
	 * @see #getHcpartyType()
	 * @generated
	 */
	EReference getHcpartyType_Telecom();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType
	 * @generated
	 */
	EClass getHeaderType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidentiality</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getConfidentiality()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_Confidentiality();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standard</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getStandard()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_Standard();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getId()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_Id();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getDate()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Date();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getTime()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Time();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sender</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getSender()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_Sender();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getRecipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recipient</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getRecipient()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_Recipient();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getUrgency <em>Urgency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Urgency</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getUrgency()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_Urgency();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getAcknowledgment <em>Acknowledgment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acknowledgment</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getAcknowledgment()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_Acknowledgment();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getText()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getLnk <em>Lnk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lnk</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getLnk()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_Lnk();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getExpirationdate <em>Expirationdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expirationdate</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getExpirationdate()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Expirationdate();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getExternalsource <em>Externalsource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Externalsource</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType#getExternalsource()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_Externalsource();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType <em>Heading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType
	 * @generated
	 */
	EClass getHeadingType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidentiality</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getConfidentiality()
	 * @see #getHeadingType()
	 * @generated
	 */
	EReference getHeadingType_Confidentiality();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getId()
	 * @see #getHeadingType()
	 * @generated
	 */
	EReference getHeadingType_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getCd()
	 * @see #getHeadingType()
	 * @generated
	 */
	EReference getHeadingType_Cd();

	/**
	 * Returns the meta object for the attribute list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getGroup()
	 * @see #getHeadingType()
	 * @generated
	 */
	EAttribute getHeadingType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Heading</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getHeading()
	 * @see #getHeadingType()
	 * @generated
	 */
	EReference getHeadingType_Heading();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getItem()
	 * @see #getHeadingType()
	 * @generated
	 */
	EReference getHeadingType_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getText()
	 * @see #getHeadingType()
	 * @generated
	 */
	EReference getHeadingType_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getLnk <em>Lnk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lnk</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType#getLnk()
	 * @see #getHeadingType()
	 * @generated
	 */
	EReference getHeadingType_Lnk();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType <em>Holter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Holter Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType
	 * @generated
	 */
	EClass getHolterType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCAVG <em>FCAVG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FCAVG</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCAVG()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_FCAVG();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCMAX <em>FCMAX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FCMAX</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCMAX()
	 * @see #getHolterType()
	 * @generated
	 */
	EReference getHolterType_FCMAX();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCMIN <em>FCMIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FCMIN</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCMIN()
	 * @see #getHolterType()
	 * @generated
	 */
	EReference getHolterType_FCMIN();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCAVGD <em>FCAVGD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FCAVGD</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCAVGD()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_FCAVGD();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCAVGN <em>FCAVGN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FCAVGN</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getFCAVGN()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_FCAVGN();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getRRMAX <em>RRMAX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RRMAX</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getRRMAX()
	 * @see #getHolterType()
	 * @generated
	 */
	EReference getHolterType_RRMAX();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getRRMIN <em>RRMIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RRMIN</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getRRMIN()
	 * @see #getHolterType()
	 * @generated
	 */
	EReference getHolterType_RRMIN();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getQRSTOT <em>QRSTOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QRSTOT</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getQRSTOT()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_QRSTOT();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getBRADY <em>BRADY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BRADY</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getBRADY()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_BRADY();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getPAUSE <em>PAUSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PAUSE</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getPAUSE()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_PAUSE();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getLONG <em>LONG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONG</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getLONG()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_LONG();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getESV <em>ESV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ESV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getESV()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_ESV();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getDBLV <em>DBLV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DBLV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getDBLV()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_DBLV();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getSALVV <em>SALVV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SALVV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getSALVV()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_SALVV();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getBGV <em>BGV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BGV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getBGV()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_BGV();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTGV <em>TGV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TGV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTGV()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_TGV();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTACHY <em>TACHY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TACHY</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTACHY()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_TACHY();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getESSV <em>ESSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ESSV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getESSV()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_ESSV();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getDBLSV <em>DBLSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DBLSV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getDBLSV()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_DBLSV();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getSALVSV <em>SALVSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SALVSV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getSALVSV()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_SALVSV();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getBGSV <em>BGSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BGSV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getBGSV()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_BGSV();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTGSV <em>TGSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TGSV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTGSV()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_TGSV();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTACHYSV <em>TACHYSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TACHYSV</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getTACHYSV()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_TACHYSV();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getRRINST <em>RRINST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RRINST</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.HolterType#getRRINST()
	 * @see #getHolterType()
	 * @generated
	 */
	EAttribute getHolterType_RRINST();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityreasonType <em>Incapacityreason Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incapacityreason Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityreasonType
	 * @generated
	 */
	EClass getIncapacityreasonType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityreasonType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityreasonType#getCd()
	 * @see #getIncapacityreasonType()
	 * @generated
	 */
	EReference getIncapacityreasonType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType <em>Incapacity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incapacity Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType
	 * @generated
	 */
	EClass getIncapacityType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#getCd()
	 * @see #getIncapacityType()
	 * @generated
	 */
	EReference getIncapacityType_Cd();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#getIncapacityreason <em>Incapacityreason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Incapacityreason</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#getIncapacityreason()
	 * @see #getIncapacityType()
	 * @generated
	 */
	EReference getIncapacityType_Incapacityreason();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#getPercentage()
	 * @see #getIncapacityType()
	 * @generated
	 */
	EAttribute getIncapacityType_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#isOutofhomeallowed <em>Outofhomeallowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outofhomeallowed</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.IncapacityType#isOutofhomeallowed()
	 * @see #getIncapacityType()
	 * @generated
	 */
	EAttribute getIncapacityType_Outofhomeallowed();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType <em>Insurance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insurance Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType
	 * @generated
	 */
	EClass getInsuranceType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getId()
	 * @see #getInsuranceType()
	 * @generated
	 */
	EReference getInsuranceType_Id();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Membership</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getMembership()
	 * @see #getInsuranceType()
	 * @generated
	 */
	EAttribute getInsuranceType_Membership();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getSiscard <em>Siscard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Siscard</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getSiscard()
	 * @see #getInsuranceType()
	 * @generated
	 */
	EAttribute getInsuranceType_Siscard();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getBegindate <em>Begindate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begindate</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getBegindate()
	 * @see #getInsuranceType()
	 * @generated
	 */
	EAttribute getInsuranceType_Begindate();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getEnddate <em>Enddate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enddate</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getEnddate()
	 * @see #getInsuranceType()
	 * @generated
	 */
	EAttribute getInsuranceType_Enddate();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getCg1 <em>Cg1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cg1</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getCg1()
	 * @see #getInsuranceType()
	 * @generated
	 */
	EAttribute getInsuranceType_Cg1();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getCg2 <em>Cg2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cg2</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getCg2()
	 * @see #getInsuranceType()
	 * @generated
	 */
	EAttribute getInsuranceType_Cg2();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getSocialfranchiseperiod1 <em>Socialfranchiseperiod1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socialfranchiseperiod1</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getSocialfranchiseperiod1()
	 * @see #getInsuranceType()
	 * @generated
	 */
	EAttribute getInsuranceType_Socialfranchiseperiod1();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getSocialfranchiseperiod2 <em>Socialfranchiseperiod2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socialfranchiseperiod2</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getSocialfranchiseperiod2()
	 * @see #getInsuranceType()
	 * @generated
	 */
	EAttribute getInsuranceType_Socialfranchiseperiod2();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getPersonalpart <em>Personalpart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personalpart</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getPersonalpart()
	 * @see #getInsuranceType()
	 * @generated
	 */
	EReference getInsuranceType_Personalpart();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getThirdpayercontract <em>Thirdpayercontract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thirdpayercontract</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getThirdpayercontract()
	 * @see #getInsuranceType()
	 * @generated
	 */
	EReference getInsuranceType_Thirdpayercontract();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getBegindatepayment <em>Begindatepayment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begindatepayment</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getBegindatepayment()
	 * @see #getInsuranceType()
	 * @generated
	 */
	EAttribute getInsuranceType_Begindatepayment();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getApprovalnumber <em>Approvalnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approvalnumber</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.InsuranceType#getApprovalnumber()
	 * @see #getInsuranceType()
	 * @generated
	 */
	EAttribute getInsuranceType_Approvalnumber();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidentiality</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getConfidentiality()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Confidentiality();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getId()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getCd()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Cd();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getContent()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getText()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Text();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getAuthor()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Author();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getBeginmoment <em>Beginmoment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beginmoment</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getBeginmoment()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Beginmoment();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getEndmoment <em>Endmoment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endmoment</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getEndmoment()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Endmoment();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIscomplete <em>Iscomplete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iscomplete</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIscomplete()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Iscomplete();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIsvalidated <em>Isvalidated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isvalidated</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIsvalidated()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Isvalidated();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getLifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lifecycle</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getLifecycle()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Lifecycle();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIsrelevant <em>Isrelevant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isrelevant</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIsrelevant()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Isrelevant();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Severity</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getSeverity()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Severity();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getCertainty <em>Certainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Certainty</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getCertainty()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Certainty();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getTemporality <em>Temporality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporality</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getTemporality()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Temporality();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getUrgency <em>Urgency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Urgency</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getUrgency()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Urgency();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantity</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getQuantity()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Quantity();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strength</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getStrength()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Strength();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getFrequency()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Frequency();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Site</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getSite()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Site();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cost</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getCost()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Cost();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getDayperiod <em>Dayperiod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dayperiod</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getDayperiod()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Dayperiod();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getDuration()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getPosology <em>Posology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Posology</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getPosology()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Posology();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRegimen <em>Regimen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regimen</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRegimen()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Regimen();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getDeliverydate <em>Deliverydate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deliverydate</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getDeliverydate()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Deliverydate();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRenewal <em>Renewal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Renewal</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRenewal()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Renewal();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRoute()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Route();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getBatch <em>Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getBatch()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Batch();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getInstructionforoverdosing <em>Instructionforoverdosing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instructionforoverdosing</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getInstructionforoverdosing()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Instructionforoverdosing();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getInstructionforpatient <em>Instructionforpatient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instructionforpatient</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getInstructionforpatient()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Instructionforpatient();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getInstructionforreimbursement <em>Instructionforreimbursement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instructionforreimbursement</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getInstructionforreimbursement()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Instructionforreimbursement();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIssubstitutionallowed <em>Issubstitutionallowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issubstitutionallowed</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#isIssubstitutionallowed()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Issubstitutionallowed();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feedback</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getFeedback()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Feedback();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getLocal()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Local();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRecorddatetime <em>Recorddatetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recorddatetime</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getRecorddatetime()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Recorddatetime();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getLnk <em>Lnk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lnk</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType#getLnk()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Lnk();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType <em>Kmehrmessage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kmehrmessage Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType
	 * @generated
	 */
	EClass getKmehrmessageType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidentiality</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType#getConfidentiality()
	 * @see #getKmehrmessageType()
	 * @generated
	 */
	EReference getKmehrmessageType_Confidentiality();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType#getHeader()
	 * @see #getKmehrmessageType()
	 * @generated
	 */
	EReference getKmehrmessageType_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folder</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType#getFolder()
	 * @see #getKmehrmessageType()
	 * @generated
	 */
	EReference getKmehrmessageType_Folder();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType#getSignature()
	 * @see #getKmehrmessageType()
	 * @generated
	 */
	EReference getKmehrmessageType_Signature();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType#getEncryptedData <em>Encrypted Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encrypted Data</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType#getEncryptedData()
	 * @see #getKmehrmessageType()
	 * @generated
	 */
	EReference getKmehrmessageType_EncryptedData();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType#getBase64EncryptedData <em>Base64 Encrypted Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base64 Encrypted Data</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType#getBase64EncryptedData()
	 * @see #getKmehrmessageType()
	 * @generated
	 */
	EReference getKmehrmessageType_Base64EncryptedData();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LifecycleType <em>Lifecycle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifecycle Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.LifecycleType
	 * @generated
	 */
	EClass getLifecycleType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LifecycleType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.LifecycleType#getCd()
	 * @see #getLifecycleType()
	 * @generated
	 */
	EReference getLifecycleType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LocalitemattributeType <em>Localitemattribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localitemattribute Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.LocalitemattributeType
	 * @generated
	 */
	EClass getLocalitemattributeType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LocalitemattributeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.LocalitemattributeType#getId()
	 * @see #getLocalitemattributeType()
	 * @generated
	 */
	EReference getLocalitemattributeType_Id();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LocalitemattributeType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.LocalitemattributeType#getCd()
	 * @see #getLocalitemattributeType()
	 * @generated
	 */
	EReference getLocalitemattributeType_Cd();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LocalitemattributeType#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.LocalitemattributeType#getContent()
	 * @see #getLocalitemattributeType()
	 * @generated
	 */
	EReference getLocalitemattributeType_Content();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LocationBirthPlaceType <em>Location Birth Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Birth Place Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.LocationBirthPlaceType
	 * @generated
	 */
	EClass getLocationBirthPlaceType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LocationBirthPlaceType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.LocationBirthPlaceType#getCd()
	 * @see #getLocationBirthPlaceType()
	 * @generated
	 */
	EReference getLocationBirthPlaceType_Cd();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LocationBirthPlaceType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.LocationBirthPlaceType#getText()
	 * @see #getLocationBirthPlaceType()
	 * @generated
	 */
	EReference getLocationBirthPlaceType_Text();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.LocationBirthPlaceType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.LocationBirthPlaceType#getAddress()
	 * @see #getLocationBirthPlaceType()
	 * @generated
	 */
	EReference getLocationBirthPlaceType_Address();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MaxrefType <em>Maxref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maxref Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MaxrefType
	 * @generated
	 */
	EClass getMaxrefType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MaxrefType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MaxrefType#getDecimal()
	 * @see #getMaxrefType()
	 * @generated
	 */
	EAttribute getMaxrefType_Decimal();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MaxrefType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MaxrefType#getText()
	 * @see #getMaxrefType()
	 * @generated
	 */
	EReference getMaxrefType_Text();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType <em>Medication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType
	 * @generated
	 */
	EClass getMedicationType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getCd()
	 * @see #getMedicationType()
	 * @generated
	 */
	EReference getMedicationType_Cd();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInn <em>Inn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inn</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInn()
	 * @see #getMedicationType()
	 * @generated
	 */
	EReference getMedicationType_Inn();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getMagistral <em>Magistral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Magistral</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getMagistral()
	 * @see #getMedicationType()
	 * @generated
	 */
	EReference getMedicationType_Magistral();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getTradename <em>Tradename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tradename</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getTradename()
	 * @see #getMedicationType()
	 * @generated
	 */
	EAttribute getMedicationType_Tradename();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getPresentation()
	 * @see #getMedicationType()
	 * @generated
	 */
	EReference getMedicationType_Presentation();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strength</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getStrength()
	 * @see #getMedicationType()
	 * @generated
	 */
	EReference getMedicationType_Strength();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getRoute()
	 * @see #getMedicationType()
	 * @generated
	 */
	EReference getMedicationType_Route();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getBatch <em>Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getBatch()
	 * @see #getMedicationType()
	 * @generated
	 */
	EAttribute getMedicationType_Batch();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getNumberofpackage <em>Numberofpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numberofpackage</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getNumberofpackage()
	 * @see #getMedicationType()
	 * @generated
	 */
	EAttribute getMedicationType_Numberofpackage();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getPackage()
	 * @see #getMedicationType()
	 * @generated
	 */
	EReference getMedicationType_Package();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getQuantityperpackage <em>Quantityperpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantityperpackage</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getQuantityperpackage()
	 * @see #getMedicationType()
	 * @generated
	 */
	EAttribute getMedicationType_Quantityperpackage();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInstructionforoverdosing <em>Instructionforoverdosing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instructionforoverdosing</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInstructionforoverdosing()
	 * @see #getMedicationType()
	 * @generated
	 */
	EReference getMedicationType_Instructionforoverdosing();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInstructionforpatient <em>Instructionforpatient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instructionforpatient</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInstructionforpatient()
	 * @see #getMedicationType()
	 * @generated
	 */
	EReference getMedicationType_Instructionforpatient();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInstructionforreimbursement <em>Instructionforreimbursement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instructionforreimbursement</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#getInstructionforreimbursement()
	 * @see #getMedicationType()
	 * @generated
	 */
	EReference getMedicationType_Instructionforreimbursement();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#isIssubstitutionallowed <em>Issubstitutionallowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issubstitutionallowed</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType#isIssubstitutionallowed()
	 * @see #getMedicationType()
	 * @generated
	 */
	EAttribute getMedicationType_Issubstitutionallowed();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType <em>Medicinal Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medicinal Product Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType
	 * @generated
	 */
	EClass getMedicinalProductType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getIntendedcd <em>Intendedcd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intendedcd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getIntendedcd()
	 * @see #getMedicinalProductType()
	 * @generated
	 */
	EReference getMedicinalProductType_Intendedcd();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getDeliveredcd <em>Deliveredcd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deliveredcd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getDeliveredcd()
	 * @see #getMedicinalProductType()
	 * @generated
	 */
	EReference getMedicinalProductType_Deliveredcd();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getIntendedname <em>Intendedname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intendedname</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getIntendedname()
	 * @see #getMedicinalProductType()
	 * @generated
	 */
	EAttribute getMedicinalProductType_Intendedname();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getDeliveredname <em>Deliveredname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deliveredname</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType#getDeliveredname()
	 * @see #getMedicinalProductType()
	 * @generated
	 */
	EAttribute getMedicinalProductType_Deliveredname();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MemberinsuranceType <em>Memberinsurance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memberinsurance Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MemberinsuranceType
	 * @generated
	 */
	EClass getMemberinsuranceType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MemberinsuranceType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MemberinsuranceType#getId()
	 * @see #getMemberinsuranceType()
	 * @generated
	 */
	EReference getMemberinsuranceType_Id();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MemberinsuranceType#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Membership</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MemberinsuranceType#getMembership()
	 * @see #getMemberinsuranceType()
	 * @generated
	 */
	EAttribute getMemberinsuranceType_Membership();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MinrefType <em>Minref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minref Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MinrefType
	 * @generated
	 */
	EClass getMinrefType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MinrefType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MinrefType#getDecimal()
	 * @see #getMinrefType()
	 * @generated
	 */
	EAttribute getMinrefType_Decimal();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MinrefType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MinrefType#getText()
	 * @see #getMinrefType()
	 * @generated
	 */
	EReference getMinrefType_Text();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType <em>Moment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moment Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType
	 * @generated
	 */
	EClass getMomentType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getYear()
	 * @see #getMomentType()
	 * @generated
	 */
	EAttribute getMomentType_Year();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getYearmonth <em>Yearmonth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yearmonth</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getYearmonth()
	 * @see #getMomentType()
	 * @generated
	 */
	EAttribute getMomentType_Yearmonth();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getDate()
	 * @see #getMomentType()
	 * @generated
	 */
	EAttribute getMomentType_Date();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getTime()
	 * @see #getMomentType()
	 * @generated
	 */
	EAttribute getMomentType_Time();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType#getText()
	 * @see #getMomentType()
	 * @generated
	 */
	EReference getMomentType_Text();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.NationalityType <em>Nationality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nationality Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.NationalityType
	 * @generated
	 */
	EClass getNationalityType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.NationalityType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.NationalityType#getCd()
	 * @see #getNationalityType()
	 * @generated
	 */
	EReference getNationalityType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.NominatorType <em>Nominator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nominator Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.NominatorType
	 * @generated
	 */
	EClass getNominatorType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.NominatorType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantity</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.NominatorType#getQuantity()
	 * @see #getNominatorType()
	 * @generated
	 */
	EReference getNominatorType_Quantity();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PackageType
	 * @generated
	 */
	EClass getPackageType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PackageType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PackageType#getCd()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PeriodicityType <em>Periodicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodicity Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PeriodicityType
	 * @generated
	 */
	EClass getPeriodicityType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PeriodicityType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PeriodicityType#getCd()
	 * @see #getPeriodicityType()
	 * @generated
	 */
	EReference getPeriodicityType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType <em>Personalpart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personalpart Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType
	 * @generated
	 */
	EClass getPersonalpartType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getId()
	 * @see #getPersonalpartType()
	 * @generated
	 */
	EReference getPersonalpartType_Id();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getCd()
	 * @see #getPersonalpartType()
	 * @generated
	 */
	EReference getPersonalpartType_Cd();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getDate()
	 * @see #getPersonalpartType()
	 * @generated
	 */
	EAttribute getPersonalpartType_Date();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonalpartType#getTime()
	 * @see #getPersonalpartType()
	 * @generated
	 */
	EAttribute getPersonalpartType_Time();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType <em>Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType
	 * @generated
	 */
	EClass getPersonType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getId()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Id();

	/**
	 * Returns the meta object for the attribute list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Firstname</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getFirstname()
	 * @see #getPersonType()
	 * @generated
	 */
	EAttribute getPersonType_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getFamilyname <em>Familyname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Familyname</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getFamilyname()
	 * @see #getPersonType()
	 * @generated
	 */
	EAttribute getPersonType_Familyname();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Birthdate</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getBirthdate()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Birthdate();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getBirthlocation <em>Birthlocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Birthlocation</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getBirthlocation()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Birthlocation();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getDeathdate <em>Deathdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deathdate</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getDeathdate()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Deathdate();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getDeathlocation <em>Deathlocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deathlocation</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getDeathlocation()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Deathlocation();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sex</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getSex()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Sex();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getNationality <em>Nationality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nationality</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getNationality()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Nationality();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getAddress()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getTelecom <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getTelecom()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Telecom();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getUsuallanguage <em>Usuallanguage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usuallanguage</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getUsuallanguage()
	 * @see #getPersonType()
	 * @generated
	 */
	EAttribute getPersonType_Usuallanguage();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getProfession <em>Profession</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profession</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getProfession()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Profession();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getInsurancystatus <em>Insurancystatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insurancystatus</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getInsurancystatus()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Insurancystatus();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getInsurancymembership <em>Insurancymembership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insurancymembership</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getInsurancymembership()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Insurancymembership();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getRecorddatetime <em>Recorddatetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recorddatetime</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getRecorddatetime()
	 * @see #getPersonType()
	 * @generated
	 */
	EAttribute getPersonType_Recorddatetime();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getText()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Text();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getCivilstate <em>Civilstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Civilstate</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonType#getCivilstate()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Civilstate();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight <em>Person Type Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Type Light</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight
	 * @generated
	 */
	EClass getPersonTypeLight();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight#getId()
	 * @see #getPersonTypeLight()
	 * @generated
	 */
	EReference getPersonTypeLight_Id();

	/**
	 * Returns the meta object for the attribute list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Firstname</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight#getFirstname()
	 * @see #getPersonTypeLight()
	 * @generated
	 */
	EAttribute getPersonTypeLight_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight#getFamilyname <em>Familyname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Familyname</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight#getFamilyname()
	 * @see #getPersonTypeLight()
	 * @generated
	 */
	EAttribute getPersonTypeLight_Familyname();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight#getAddress()
	 * @see #getPersonTypeLight()
	 * @generated
	 */
	EReference getPersonTypeLight_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight#getTelecom <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PersonTypeLight#getTelecom()
	 * @see #getPersonTypeLight()
	 * @generated
	 */
	EReference getPersonTypeLight_Telecom();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType <em>Posology Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Posology Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType
	 * @generated
	 */
	EClass getPosologyType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType#getLow()
	 * @see #getPosologyType()
	 * @generated
	 */
	EAttribute getPosologyType_Low();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType#getHigh()
	 * @see #getPosologyType()
	 * @generated
	 */
	EAttribute getPosologyType_High();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType#getUnit()
	 * @see #getPosologyType()
	 * @generated
	 */
	EReference getPosologyType_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType#getTakes <em>Takes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Takes</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType#getTakes()
	 * @see #getPosologyType()
	 * @generated
	 */
	EReference getPosologyType_Takes();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType#getText()
	 * @see #getPosologyType()
	 * @generated
	 */
	EReference getPosologyType_Text();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PresentationType <em>Presentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PresentationType
	 * @generated
	 */
	EClass getPresentationType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.PresentationType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.PresentationType#getCd()
	 * @see #getPresentationType()
	 * @generated
	 */
	EReference getPresentationType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ProfessionType <em>Profession Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profession Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ProfessionType
	 * @generated
	 */
	EClass getProfessionType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ProfessionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ProfessionType#getId()
	 * @see #getProfessionType()
	 * @generated
	 */
	EReference getProfessionType_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ProfessionType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ProfessionType#getCd()
	 * @see #getProfessionType()
	 * @generated
	 */
	EReference getProfessionType_Cd();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ProfessionType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ProfessionType#getText()
	 * @see #getProfessionType()
	 * @generated
	 */
	EReference getProfessionType_Text();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityprefixType <em>Quantityprefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantityprefix Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityprefixType
	 * @generated
	 */
	EClass getQuantityprefixType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityprefixType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityprefixType#getCd()
	 * @see #getQuantityprefixType()
	 * @generated
	 */
	EReference getQuantityprefixType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityType <em>Quantity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityType
	 * @generated
	 */
	EClass getQuantityType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityType#getDecimal()
	 * @see #getQuantityType()
	 * @generated
	 */
	EAttribute getQuantityType_Decimal();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityType#getUnit()
	 * @see #getQuantityType()
	 * @generated
	 */
	EReference getQuantityType_Unit();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType <em>Recipient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipient Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType
	 * @generated
	 */
	EClass getRecipientType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType#getHcparty <em>Hcparty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hcparty</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType#getHcparty()
	 * @see #getRecipientType()
	 * @generated
	 */
	EReference getRecipientType_Hcparty();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType#getDummyFriend <em>Dummy Friend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dummy Friend</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RecipientType#getDummyFriend()
	 * @see #getRecipientType()
	 * @generated
	 */
	EAttribute getRecipientType_DummyFriend();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefscopeType <em>Refscope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refscope Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RefscopeType
	 * @generated
	 */
	EClass getRefscopeType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefscopeType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RefscopeType#getCd()
	 * @see #getRefscopeType()
	 * @generated
	 */
	EReference getRefscopeType_Cd();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefscopeType#getRefvalue <em>Refvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refvalue</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RefscopeType#getRefvalue()
	 * @see #getRefscopeType()
	 * @generated
	 */
	EReference getRefscopeType_Refvalue();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType <em>Refvalue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refvalue Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType
	 * @generated
	 */
	EClass getRefvalueType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType#getMinref <em>Minref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minref</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType#getMinref()
	 * @see #getRefvalueType()
	 * @generated
	 */
	EReference getRefvalueType_Minref();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType#getMaxref <em>Maxref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maxref</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType#getMaxref()
	 * @see #getRefvalueType()
	 * @generated
	 */
	EReference getRefvalueType_Maxref();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RefvalueType#getContext()
	 * @see #getRefvalueType()
	 * @generated
	 */
	EReference getRefvalueType_Context();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType <em>Regimen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regimen Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType
	 * @generated
	 */
	EClass getRegimenType();

	/**
	 * Returns the meta object for the attribute list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getGroup()
	 * @see #getRegimenType()
	 * @generated
	 */
	EAttribute getRegimenType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getDaynumber <em>Daynumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Daynumber</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getDaynumber()
	 * @see #getRegimenType()
	 * @generated
	 */
	EAttribute getRegimenType_Daynumber();

	/**
	 * Returns the meta object for the attribute list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Date</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getDate()
	 * @see #getRegimenType()
	 * @generated
	 */
	EAttribute getRegimenType_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getWeekday <em>Weekday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weekday</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getWeekday()
	 * @see #getRegimenType()
	 * @generated
	 */
	EReference getRegimenType_Weekday();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getDaytime <em>Daytime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Daytime</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getDaytime()
	 * @see #getRegimenType()
	 * @generated
	 */
	EReference getRegimenType_Daytime();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantity</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType#getQuantity()
	 * @see #getRegimenType()
	 * @generated
	 */
	EReference getRegimenType_Quantity();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RenewalType <em>Renewal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renewal Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RenewalType
	 * @generated
	 */
	EClass getRenewalType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RenewalType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RenewalType#getDecimal()
	 * @see #getRenewalType()
	 * @generated
	 */
	EAttribute getRenewalType_Decimal();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RenewalType#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RenewalType#getDuration()
	 * @see #getRenewalType()
	 * @generated
	 */
	EReference getRenewalType_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RenewalType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RenewalType#getText()
	 * @see #getRenewalType()
	 * @generated
	 */
	EReference getRenewalType_Text();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RouteType <em>Route Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RouteType
	 * @generated
	 */
	EClass getRouteType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RouteType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RouteType#getCd()
	 * @see #getRouteType()
	 * @generated
	 */
	EReference getRouteType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMAXType <em>RRMAX Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RRMAX Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMAXType
	 * @generated
	 */
	EClass getRRMAXType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMAXType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMAXType#getValue()
	 * @see #getRRMAXType()
	 * @generated
	 */
	EAttribute getRRMAXType_Value();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMAXType#getTIME <em>TIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TIME</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMAXType#getTIME()
	 * @see #getRRMAXType()
	 * @generated
	 */
	EAttribute getRRMAXType_TIME();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMINType <em>RRMIN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RRMIN Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMINType
	 * @generated
	 */
	EClass getRRMINType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMINType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMINType#getValue()
	 * @see #getRRMINType()
	 * @generated
	 */
	EAttribute getRRMINType_Value();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMINType#getTIME <em>TIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TIME</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.RRMINType#getTIME()
	 * @see #getRRMINType()
	 * @generated
	 */
	EAttribute getRRMINType_TIME();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SenderType <em>Sender Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SenderType
	 * @generated
	 */
	EClass getSenderType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SenderType#getHcparty <em>Hcparty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hcparty</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SenderType#getHcparty()
	 * @see #getSenderType()
	 * @generated
	 */
	EReference getSenderType_Hcparty();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SeverityType <em>Severity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Severity Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SeverityType
	 * @generated
	 */
	EClass getSeverityType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SeverityType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SeverityType#getCd()
	 * @see #getSeverityType()
	 * @generated
	 */
	EReference getSeverityType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SexType <em>Sex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sex Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SexType
	 * @generated
	 */
	EClass getSexType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SexType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SexType#getCd()
	 * @see #getSexType()
	 * @generated
	 */
	EReference getSexType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SiteType <em>Site Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SiteType
	 * @generated
	 */
	EClass getSiteType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SiteType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SiteType#getCd()
	 * @see #getSiteType()
	 * @generated
	 */
	EReference getSiteType_Cd();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SiteType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SiteType#getText()
	 * @see #getSiteType()
	 * @generated
	 */
	EReference getSiteType_Text();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType
	 * @generated
	 */
	EClass getSourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getCd()
	 * @see #getSourceType()
	 * @generated
	 */
	EReference getSourceType_Cd();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getDatetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getDatetime()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Datetime();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getVersion()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Version();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getProof <em>Proof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proof</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SourceType#getProof()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Proof();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SpecialisationType <em>Specialisation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SpecialisationType
	 * @generated
	 */
	EClass getSpecialisationType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SpecialisationType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SpecialisationType#getCd()
	 * @see #getSpecialisationType()
	 * @generated
	 */
	EReference getSpecialisationType_Cd();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SpecialisationType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SpecialisationType#getVersion()
	 * @see #getSpecialisationType()
	 * @generated
	 */
	EAttribute getSpecialisationType_Version();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType <em>Standard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType
	 * @generated
	 */
	EClass getStandardType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType#getCd()
	 * @see #getStandardType()
	 * @generated
	 */
	EReference getStandardType_Cd();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specialisation</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.StandardType#getSpecialisation()
	 * @see #getStandardType()
	 * @generated
	 */
	EReference getStandardType_Specialisation();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.StrengthType <em>Strength Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strength Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.StrengthType
	 * @generated
	 */
	EClass getStrengthType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.StrengthType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.StrengthType#getDecimal()
	 * @see #getStrengthType()
	 * @generated
	 */
	EAttribute getStrengthType_Decimal();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.StrengthType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.StrengthType#getUnit()
	 * @see #getStrengthType()
	 * @generated
	 */
	EReference getStrengthType_Unit();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType <em>Substanceproduct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substanceproduct Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType
	 * @generated
	 */
	EClass getSubstanceproductType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getIntendedcd <em>Intendedcd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intendedcd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getIntendedcd()
	 * @see #getSubstanceproductType()
	 * @generated
	 */
	EReference getSubstanceproductType_Intendedcd();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getDeliveredcd <em>Deliveredcd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deliveredcd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getDeliveredcd()
	 * @see #getSubstanceproductType()
	 * @generated
	 */
	EReference getSubstanceproductType_Deliveredcd();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getIntendedname <em>Intendedname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intendedname</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getIntendedname()
	 * @see #getSubstanceproductType()
	 * @generated
	 */
	EAttribute getSubstanceproductType_Intendedname();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getDeliveredname <em>Deliveredname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deliveredname</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceproductType#getDeliveredname()
	 * @see #getSubstanceproductType()
	 * @generated
	 */
	EAttribute getSubstanceproductType_Deliveredname();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType <em>Substance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substance Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType
	 * @generated
	 */
	EClass getSubstanceType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType#getCd()
	 * @see #getSubstanceType()
	 * @generated
	 */
	EReference getSubstanceType_Cd();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType#getSubstancename <em>Substancename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substancename</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType#getSubstancename()
	 * @see #getSubstanceType()
	 * @generated
	 */
	EAttribute getSubstanceType_Substancename();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TakesType <em>Takes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Takes Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TakesType
	 * @generated
	 */
	EClass getTakesType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TakesType#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TakesType#getLow()
	 * @see #getTakesType()
	 * @generated
	 */
	EAttribute getTakesType_Low();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TakesType#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TakesType#getHigh()
	 * @see #getTakesType()
	 * @generated
	 */
	EAttribute getTakesType_High();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType <em>Telecom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telecom Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType
	 * @generated
	 */
	EClass getTelecomType();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType#getId()
	 * @see #getTelecomType()
	 * @generated
	 */
	EReference getTelecomType_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType#getCd()
	 * @see #getTelecomType()
	 * @generated
	 */
	EReference getTelecomType_Cd();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType#getTelecomnumber <em>Telecomnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telecomnumber</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType#getTelecomnumber()
	 * @see #getTelecomType()
	 * @generated
	 */
	EAttribute getTelecomType_Telecomnumber();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TemporalityType <em>Temporality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporality Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TemporalityType
	 * @generated
	 */
	EClass getTemporalityType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TemporalityType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TemporalityType#getCd()
	 * @see #getTemporalityType()
	 * @generated
	 */
	EReference getTemporalityType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TextWithLayoutType <em>Text With Layout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text With Layout Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TextWithLayoutType
	 * @generated
	 */
	EClass getTextWithLayoutType();

	/**
	 * Returns the meta object for the attribute list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TextWithLayoutType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TextWithLayoutType#getMixed()
	 * @see #getTextWithLayoutType()
	 * @generated
	 */
	EAttribute getTextWithLayoutType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TextWithLayoutType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TextWithLayoutType#getAny()
	 * @see #getTextWithLayoutType()
	 * @generated
	 */
	EAttribute getTextWithLayoutType_Any();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TextWithLayoutType#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TextWithLayoutType#getL()
	 * @see #getTextWithLayoutType()
	 * @generated
	 */
	EAttribute getTextWithLayoutType_L();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ThirdpayercontractType <em>Thirdpayercontract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thirdpayercontract Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ThirdpayercontractType
	 * @generated
	 */
	EClass getThirdpayercontractType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.ThirdpayercontractType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.ThirdpayercontractType#getCd()
	 * @see #getThirdpayercontractType()
	 * @generated
	 */
	EReference getThirdpayercontractType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TimequantityType <em>Timequantity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timequantity Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TimequantityType
	 * @generated
	 */
	EClass getTimequantityType();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TimequantityType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TimequantityType#getDecimal()
	 * @see #getTimequantityType()
	 * @generated
	 */
	EAttribute getTimequantityType_Decimal();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TimequantityType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TimequantityType#getUnit()
	 * @see #getTimequantityType()
	 * @generated
	 */
	EReference getTimequantityType_Unit();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TimeunitType <em>Timeunit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeunit Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TimeunitType
	 * @generated
	 */
	EClass getTimeunitType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TimeunitType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TimeunitType#getCd()
	 * @see #getTimeunitType()
	 * @generated
	 */
	EReference getTimeunitType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType
	 * @generated
	 */
	EClass getTransactionType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidentiality</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getConfidentiality()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Confidentiality();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getId()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getCd()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Cd();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getDate()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Date();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getTime()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Time();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getAuthor()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Author();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getRedactor <em>Redactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Redactor</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getRedactor()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Redactor();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#isIscomplete <em>Iscomplete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iscomplete</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#isIscomplete()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Iscomplete();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#isIsvalidated <em>Isvalidated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isvalidated</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#isIsvalidated()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Isvalidated();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getExpirationdate <em>Expirationdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expirationdate</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getExpirationdate()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Expirationdate();

	/**
	 * Returns the meta object for the attribute list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getGroup()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Heading</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getHeading()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Heading();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getItem()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getText()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getTextWithLayout <em>Text With Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text With Layout</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getTextWithLayout()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_TextWithLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getLnk <em>Lnk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lnk</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getLnk()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Lnk();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getRecorddatetime <em>Recorddatetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recorddatetime</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getRecorddatetime()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Recorddatetime();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.TransactionType#getVersion()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Version();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.UnitType
	 * @generated
	 */
	EClass getUnitType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.UnitType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.UnitType#getCd()
	 * @see #getUnitType()
	 * @generated
	 */
	EReference getUnitType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.UrgencyType <em>Urgency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Urgency Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.UrgencyType
	 * @generated
	 */
	EClass getUrgencyType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.UrgencyType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.UrgencyType#getCd()
	 * @see #getUrgencyType()
	 * @generated
	 */
	EReference getUrgencyType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType <em>Weekday Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weekday Type</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType
	 * @generated
	 */
	EClass getWeekdayType();

	/**
	 * Returns the meta object for the containment reference '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cd</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType#getCd()
	 * @see #getWeekdayType()
	 * @generated
	 */
	EReference getWeekdayType_Cd();

	/**
	 * Returns the meta object for class '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType1 <em>Weekday Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weekday Type1</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType1
	 * @generated
	 */
	EClass getWeekdayType1();

	/**
	 * Returns the meta object for the attribute '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType1#getWeeknumber <em>Weeknumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weeknumber</em>'.
	 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType1#getWeeknumber()
	 * @see #getWeekdayType1()
	 * @generated
	 */
	EAttribute getWeekdayType1_Weeknumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KmehrFactory getKmehrFactory();

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
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AcknowledgmentTypeImpl <em>Acknowledgment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AcknowledgmentTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getAcknowledgmentType()
		 * @generated
		 */
		EClass ACKNOWLEDGMENT_TYPE = eINSTANCE.getAcknowledgmentType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACKNOWLEDGMENT_TYPE__CD = eINSTANCE.getAcknowledgmentType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeImpl <em>Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getAddressType()
		 * @generated
		 */
		EClass ADDRESS_TYPE = eINSTANCE.getAddressType();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl <em>Address Type Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AddressTypeBaseImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getAddressTypeBase()
		 * @generated
		 */
		EClass ADDRESS_TYPE_BASE = eINSTANCE.getAddressTypeBase();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_TYPE_BASE__ID = eINSTANCE.getAddressTypeBase_Id();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_TYPE_BASE__CD = eINSTANCE.getAddressTypeBase_Cd();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_TYPE_BASE__COUNTRY = eINSTANCE.getAddressTypeBase_Country();

		/**
		 * The meta object literal for the '<em><b>Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE_BASE__ZIP = eINSTANCE.getAddressTypeBase_Zip();

		/**
		 * The meta object literal for the '<em><b>Nis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE_BASE__NIS = eINSTANCE.getAddressTypeBase_Nis();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE_BASE__CITY = eINSTANCE.getAddressTypeBase_City();

		/**
		 * The meta object literal for the '<em><b>District</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE_BASE__DISTRICT = eINSTANCE.getAddressTypeBase_District();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE_BASE__STREET = eINSTANCE.getAddressTypeBase_Street();

		/**
		 * The meta object literal for the '<em><b>Housenumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE_BASE__HOUSENUMBER = eINSTANCE.getAddressTypeBase_Housenumber();

		/**
		 * The meta object literal for the '<em><b>Postboxnumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE_BASE__POSTBOXNUMBER = eINSTANCE.getAddressTypeBase_Postboxnumber();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_TYPE_BASE__TEXT = eINSTANCE.getAddressTypeBase_Text();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AdministrationquantityTypeImpl <em>Administrationquantity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AdministrationquantityTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getAdministrationquantityType()
		 * @generated
		 */
		EClass ADMINISTRATIONQUANTITY_TYPE = eINSTANCE.getAdministrationquantityType();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIONQUANTITY_TYPE__DECIMAL = eINSTANCE.getAdministrationquantityType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATIONQUANTITY_TYPE__UNIT = eINSTANCE.getAdministrationquantityType_Unit();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AdministrationunitTypeImpl <em>Administrationunit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AdministrationunitTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getAdministrationunitType()
		 * @generated
		 */
		EClass ADMINISTRATIONUNIT_TYPE = eINSTANCE.getAdministrationunitType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATIONUNIT_TYPE__CD = eINSTANCE.getAdministrationunitType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AuthorTypeImpl <em>Author Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.AuthorTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getAuthorType()
		 * @generated
		 */
		EClass AUTHOR_TYPE = eINSTANCE.getAuthorType();

		/**
		 * The meta object literal for the '<em><b>Hcparty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHOR_TYPE__HCPARTY = eINSTANCE.getAuthorType_Hcparty();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.Base64EncryptedDataTypeImpl <em>Base64 Encrypted Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.Base64EncryptedDataTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getBase64EncryptedDataType()
		 * @generated
		 */
		EClass BASE64_ENCRYPTED_DATA_TYPE = eINSTANCE.getBase64EncryptedDataType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE64_ENCRYPTED_DATA_TYPE__CD = eINSTANCE.getBase64EncryptedDataType_Cd();

		/**
		 * The meta object literal for the '<em><b>Base64 Encrypted Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE64_ENCRYPTED_DATA_TYPE__BASE64_ENCRYPTED_VALUE = eINSTANCE.getBase64EncryptedDataType_Base64EncryptedValue();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.Base64EncryptedValueTypeImpl <em>Base64 Encrypted Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.Base64EncryptedValueTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getBase64EncryptedValueType()
		 * @generated
		 */
		EClass BASE64_ENCRYPTED_VALUE_TYPE = eINSTANCE.getBase64EncryptedValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64_ENCRYPTED_VALUE_TYPE__VALUE = eINSTANCE.getBase64EncryptedValueType_Value();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64_ENCRYPTED_VALUE_TYPE__ENCODING = eINSTANCE.getBase64EncryptedValueType_Encoding();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CertaintyTypeImpl <em>Certainty Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CertaintyTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getCertaintyType()
		 * @generated
		 */
		EClass CERTAINTY_TYPE = eINSTANCE.getCertaintyType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERTAINTY_TYPE__CD = eINSTANCE.getCertaintyType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CivilstateTypeImpl <em>Civilstate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CivilstateTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getCivilstateType()
		 * @generated
		 */
		EClass CIVILSTATE_TYPE = eINSTANCE.getCivilstateType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIVILSTATE_TYPE__CD = eINSTANCE.getCivilstateType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundprescriptionTypeImpl <em>Compoundprescription Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundprescriptionTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getCompoundprescriptionType()
		 * @generated
		 */
		EClass COMPOUNDPRESCRIPTION_TYPE = eINSTANCE.getCompoundprescriptionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUNDPRESCRIPTION_TYPE__MIXED = eINSTANCE.getCompoundprescriptionType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Compound</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUNDPRESCRIPTION_TYPE__COMPOUND = eINSTANCE.getCompoundprescriptionType_Compound();

		/**
		 * The meta object literal for the '<em><b>Formularyreference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUNDPRESCRIPTION_TYPE__FORMULARYREFERENCE = eINSTANCE.getCompoundprescriptionType_Formularyreference();

		/**
		 * The meta object literal for the '<em><b>Magistraltext</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUNDPRESCRIPTION_TYPE__MAGISTRALTEXT = eINSTANCE.getCompoundprescriptionType_Magistraltext();

		/**
		 * The meta object literal for the '<em><b>Galenicform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUNDPRESCRIPTION_TYPE__GALENICFORM = eINSTANCE.getCompoundprescriptionType_Galenicform();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUNDPRESCRIPTION_TYPE__QUANTITY = eINSTANCE.getCompoundprescriptionType_Quantity();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUNDPRESCRIPTION_TYPE__L = eINSTANCE.getCompoundprescriptionType_L();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundTypeImpl <em>Compound Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getCompoundType()
		 * @generated
		 */
		EClass COMPOUND_TYPE = eINSTANCE.getCompoundType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_TYPE__ID = eINSTANCE.getCompoundType_Id();

		/**
		 * The meta object literal for the '<em><b>Medicinalproduct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_TYPE__MEDICINALPRODUCT = eINSTANCE.getCompoundType_Medicinalproduct();

		/**
		 * The meta object literal for the '<em><b>Substance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_TYPE__SUBSTANCE = eINSTANCE.getCompoundType_Substance();

		/**
		 * The meta object literal for the '<em><b>Quantityprefix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_TYPE__QUANTITYPREFIX = eINSTANCE.getCompoundType_Quantityprefix();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_TYPE__QUANTITY = eINSTANCE.getCompoundType_Quantity();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ConfidentialityTypeImpl <em>Confidentiality Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ConfidentialityTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getConfidentialityType()
		 * @generated
		 */
		EClass CONFIDENTIALITY_TYPE = eINSTANCE.getConfidentialityType();

		/**
		 * The meta object literal for the '<em><b>Hcparty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY_TYPE__HCPARTY = eINSTANCE.getConfidentialityType_Hcparty();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl <em>Contentlocalitemattribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentlocalitemattributeTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getContentlocalitemattributeType()
		 * @generated
		 */
		EClass CONTENTLOCALITEMATTRIBUTE_TYPE = eINSTANCE.getContentlocalitemattributeType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTLOCALITEMATTRIBUTE_TYPE__ID = eINSTANCE.getContentlocalitemattributeType_Id();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTLOCALITEMATTRIBUTE_TYPE__CD = eINSTANCE.getContentlocalitemattributeType_Cd();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENTLOCALITEMATTRIBUTE_TYPE__DECIMAL = eINSTANCE.getContentlocalitemattributeType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENTLOCALITEMATTRIBUTE_TYPE__BOOLEAN = eINSTANCE.getContentlocalitemattributeType_Boolean();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTLOCALITEMATTRIBUTE_TYPE__TEXT = eINSTANCE.getContentlocalitemattributeType_Text();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENTLOCALITEMATTRIBUTE_TYPE__DATE = eINSTANCE.getContentlocalitemattributeType_Date();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENTLOCALITEMATTRIBUTE_TYPE__TIME = eINSTANCE.getContentlocalitemattributeType_Time();

		/**
		 * The meta object literal for the '<em><b>Hcparty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTLOCALITEMATTRIBUTE_TYPE__HCPARTY = eINSTANCE.getContentlocalitemattributeType_Hcparty();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTLOCALITEMATTRIBUTE_TYPE__PERSON = eINSTANCE.getContentlocalitemattributeType_Person();

		/**
		 * The meta object literal for the '<em><b>Lnk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTLOCALITEMATTRIBUTE_TYPE__LNK = eINSTANCE.getContentlocalitemattributeType_Lnk();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTLOCALITEMATTRIBUTE_TYPE__UNIT = eINSTANCE.getContentlocalitemattributeType_Unit();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl <em>Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ContentTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getContentType()
		 * @generated
		 */
		EClass CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__ID = eINSTANCE.getContentType_Id();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__CD = eINSTANCE.getContentType_Cd();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__DECIMAL = eINSTANCE.getContentType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Unsigned Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__UNSIGNED_INT = eINSTANCE.getContentType_UnsignedInt();

		/**
		 * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__BOOLEAN = eINSTANCE.getContentType_Boolean();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__TEXT = eINSTANCE.getContentType_Text();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__YEAR = eINSTANCE.getContentType_Year();

		/**
		 * The meta object literal for the '<em><b>Yearmonth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__YEARMONTH = eINSTANCE.getContentType_Yearmonth();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__DATE = eINSTANCE.getContentType_Date();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__TIME = eINSTANCE.getContentType_Time();

		/**
		 * The meta object literal for the '<em><b>Hcparty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__HCPARTY = eINSTANCE.getContentType_Hcparty();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__PERSON = eINSTANCE.getContentType_Person();

		/**
		 * The meta object literal for the '<em><b>Insurance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__INSURANCE = eINSTANCE.getContentType_Insurance();

		/**
		 * The meta object literal for the '<em><b>Incapacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__INCAPACITY = eINSTANCE.getContentType_Incapacity();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__ERROR = eINSTANCE.getContentType_Error();

		/**
		 * The meta object literal for the '<em><b>Medicinalproduct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__MEDICINALPRODUCT = eINSTANCE.getContentType_Medicinalproduct();

		/**
		 * The meta object literal for the '<em><b>Substanceproduct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__SUBSTANCEPRODUCT = eINSTANCE.getContentType_Substanceproduct();

		/**
		 * The meta object literal for the '<em><b>Compoundprescription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__COMPOUNDPRESCRIPTION = eINSTANCE.getContentType_Compoundprescription();

		/**
		 * The meta object literal for the '<em><b>Medication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__MEDICATION = eINSTANCE.getContentType_Medication();

		/**
		 * The meta object literal for the '<em><b>Holter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__HOLTER = eINSTANCE.getContentType_Holter();

		/**
		 * The meta object literal for the '<em><b>Ecg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__ECG = eINSTANCE.getContentType_Ecg();

		/**
		 * The meta object literal for the '<em><b>Bacteriology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__BACTERIOLOGY = eINSTANCE.getContentType_Bacteriology();

		/**
		 * The meta object literal for the '<em><b>Lnk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__LNK = eINSTANCE.getContentType_Lnk();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__LOCATION = eINSTANCE.getContentType_Location();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__UNIT = eINSTANCE.getContentType_Unit();

		/**
		 * The meta object literal for the '<em><b>Minref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__MINREF = eINSTANCE.getContentType_Minref();

		/**
		 * The meta object literal for the '<em><b>Maxref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__MAXREF = eINSTANCE.getContentType_Maxref();

		/**
		 * The meta object literal for the '<em><b>Refscope</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__REFSCOPE = eINSTANCE.getContentType_Refscope();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CostTypeImpl <em>Cost Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CostTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getCostType()
		 * @generated
		 */
		EClass COST_TYPE = eINSTANCE.getCostType();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_TYPE__DECIMAL = eINSTANCE.getCostType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_TYPE__UNIT = eINSTANCE.getCostType_Unit();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CountryTypeImpl <em>Country Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CountryTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getCountryType()
		 * @generated
		 */
		EClass COUNTRY_TYPE = eINSTANCE.getCountryType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY_TYPE__CD = eINSTANCE.getCountryType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DateTypeImpl <em>Date Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DateTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getDateType()
		 * @generated
		 */
		EClass DATE_TYPE = eINSTANCE.getDateType();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DayperiodTypeImpl <em>Dayperiod Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DayperiodTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getDayperiodType()
		 * @generated
		 */
		EClass DAYPERIOD_TYPE = eINSTANCE.getDayperiodType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAYPERIOD_TYPE__CD = eINSTANCE.getDayperiodType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DaytimeTypeImpl <em>Daytime Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DaytimeTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getDaytimeType()
		 * @generated
		 */
		EClass DAYTIME_TYPE = eINSTANCE.getDaytimeType();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAYTIME_TYPE__TIME = eINSTANCE.getDaytimeType_Time();

		/**
		 * The meta object literal for the '<em><b>Dayperiod</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAYTIME_TYPE__DAYPERIOD = eINSTANCE.getDaytimeType_Dayperiod();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DenominatorTypeImpl <em>Denominator Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DenominatorTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getDenominatorType()
		 * @generated
		 */
		EClass DENOMINATOR_TYPE = eINSTANCE.getDenominatorType();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENOMINATOR_TYPE__QUANTITY = eINSTANCE.getDenominatorType_Quantity();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DocumentRootImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Kmehrmessage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KMEHRMESSAGE = eINSTANCE.getDocumentRoot_Kmehrmessage();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DurationTypeImpl <em>Duration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.DurationTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getDurationType()
		 * @generated
		 */
		EClass DURATION_TYPE = eINSTANCE.getDurationType();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_TYPE__DECIMAL = eINSTANCE.getDurationType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURATION_TYPE__UNIT = eINSTANCE.getDurationType_Unit();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ErrorMyCarenetTypeImpl <em>Error My Carenet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ErrorMyCarenetTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getErrorMyCarenetType()
		 * @generated
		 */
		EClass ERROR_MY_CARENET_TYPE = eINSTANCE.getErrorMyCarenetType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MY_CARENET_TYPE__CD = eINSTANCE.getErrorMyCarenetType_Cd();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MY_CARENET_TYPE__DESCRIPTION = eINSTANCE.getErrorMyCarenetType_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_MY_CARENET_TYPE__URL = eINSTANCE.getErrorMyCarenetType_Url();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ErrorTypeImpl <em>Error Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ErrorTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getErrorType()
		 * @generated
		 */
		EClass ERROR_TYPE = eINSTANCE.getErrorType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TYPE__ID = eINSTANCE.getErrorType_Id();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TYPE__CD = eINSTANCE.getErrorType_Cd();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TYPE__DESCRIPTION = eINSTANCE.getErrorType_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TYPE__URL = eINSTANCE.getErrorType_Url();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ExternalsourceTypeImpl <em>Externalsource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ExternalsourceTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getExternalsourceType()
		 * @generated
		 */
		EClass EXTERNALSOURCE_TYPE = eINSTANCE.getExternalsourceType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNALSOURCE_TYPE__SOURCE = eINSTANCE.getExternalsourceType_Source();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FCMAXTypeImpl <em>FCMAX Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FCMAXTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getFCMAXType()
		 * @generated
		 */
		EClass FCMAX_TYPE = eINSTANCE.getFCMAXType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FCMAX_TYPE__VALUE = eINSTANCE.getFCMAXType_Value();

		/**
		 * The meta object literal for the '<em><b>TIME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FCMAX_TYPE__TIME = eINSTANCE.getFCMAXType_TIME();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FCMINTypeImpl <em>FCMIN Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FCMINTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getFCMINType()
		 * @generated
		 */
		EClass FCMIN_TYPE = eINSTANCE.getFCMINType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FCMIN_TYPE__VALUE = eINSTANCE.getFCMINType_Value();

		/**
		 * The meta object literal for the '<em><b>TIME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FCMIN_TYPE__TIME = eINSTANCE.getFCMINType_TIME();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FeedbackTypeImpl <em>Feedback Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FeedbackTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getFeedbackType()
		 * @generated
		 */
		EClass FEEDBACK_TYPE = eINSTANCE.getFeedbackType();

		/**
		 * The meta object literal for the '<em><b>Reportrequested</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_TYPE__REPORTREQUESTED = eINSTANCE.getFeedbackType_Reportrequested();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_TYPE__TEXT = eINSTANCE.getFeedbackType_Text();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FolderTypeImpl <em>Folder Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FolderTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getFolderType()
		 * @generated
		 */
		EClass FOLDER_TYPE = eINSTANCE.getFolderType();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER_TYPE__CONFIDENTIALITY = eINSTANCE.getFolderType_Confidentiality();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER_TYPE__ID = eINSTANCE.getFolderType_Id();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER_TYPE__PATIENT = eINSTANCE.getFolderType_Patient();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER_TYPE__TRANSACTION = eINSTANCE.getFolderType_Transaction();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER_TYPE__TEXT = eINSTANCE.getFolderType_Text();

		/**
		 * The meta object literal for the '<em><b>Lnk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER_TYPE__LNK = eINSTANCE.getFolderType_Lnk();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FormularyreferenceTypeImpl <em>Formularyreference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FormularyreferenceTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getFormularyreferenceType()
		 * @generated
		 */
		EClass FORMULARYREFERENCE_TYPE = eINSTANCE.getFormularyreferenceType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARYREFERENCE_TYPE__CD = eINSTANCE.getFormularyreferenceType_Cd();

		/**
		 * The meta object literal for the '<em><b>Formularyname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARYREFERENCE_TYPE__FORMULARYNAME = eINSTANCE.getFormularyreferenceType_Formularyname();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FrequencyTypeImpl <em>Frequency Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FrequencyTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getFrequencyType()
		 * @generated
		 */
		EClass FREQUENCY_TYPE = eINSTANCE.getFrequencyType();

		/**
		 * The meta object literal for the '<em><b>Nominator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREQUENCY_TYPE__NOMINATOR = eINSTANCE.getFrequencyType_Nominator();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREQUENCY_TYPE__DENOMINATOR = eINSTANCE.getFrequencyType_Denominator();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_TYPE__DECIMAL = eINSTANCE.getFrequencyType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREQUENCY_TYPE__UNIT = eINSTANCE.getFrequencyType_Unit();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREQUENCY_TYPE__TEXT = eINSTANCE.getFrequencyType_Text();

		/**
		 * The meta object literal for the '<em><b>Periodicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREQUENCY_TYPE__PERIODICITY = eINSTANCE.getFrequencyType_Periodicity();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.GalenicformTypeImpl <em>Galenicform Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.GalenicformTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getGalenicformType()
		 * @generated
		 */
		EClass GALENICFORM_TYPE = eINSTANCE.getGalenicformType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GALENICFORM_TYPE__CD = eINSTANCE.getGalenicformType_Cd();

		/**
		 * The meta object literal for the '<em><b>Galenicformtext</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GALENICFORM_TYPE__GALENICFORMTEXT = eINSTANCE.getGalenicformType_Galenicformtext();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HcpartyTypeImpl <em>Hcparty Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HcpartyTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getHcpartyType()
		 * @generated
		 */
		EClass HCPARTY_TYPE = eINSTANCE.getHcpartyType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HCPARTY_TYPE__ID = eINSTANCE.getHcpartyType_Id();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HCPARTY_TYPE__CD = eINSTANCE.getHcpartyType_Cd();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HCPARTY_TYPE__NAME = eINSTANCE.getHcpartyType_Name();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HCPARTY_TYPE__FIRSTNAME = eINSTANCE.getHcpartyType_Firstname();

		/**
		 * The meta object literal for the '<em><b>Familyname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HCPARTY_TYPE__FAMILYNAME = eINSTANCE.getHcpartyType_Familyname();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HCPARTY_TYPE__ADDRESS = eINSTANCE.getHcpartyType_Address();

		/**
		 * The meta object literal for the '<em><b>Telecom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HCPARTY_TYPE__TELECOM = eINSTANCE.getHcpartyType_Telecom();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl <em>Header Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeaderTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getHeaderType()
		 * @generated
		 */
		EClass HEADER_TYPE = eINSTANCE.getHeaderType();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_TYPE__CONFIDENTIALITY = eINSTANCE.getHeaderType_Confidentiality();

		/**
		 * The meta object literal for the '<em><b>Standard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_TYPE__STANDARD = eINSTANCE.getHeaderType_Standard();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_TYPE__ID = eINSTANCE.getHeaderType_Id();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__DATE = eINSTANCE.getHeaderType_Date();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__TIME = eINSTANCE.getHeaderType_Time();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_TYPE__SENDER = eINSTANCE.getHeaderType_Sender();

		/**
		 * The meta object literal for the '<em><b>Recipient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_TYPE__RECIPIENT = eINSTANCE.getHeaderType_Recipient();

		/**
		 * The meta object literal for the '<em><b>Urgency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_TYPE__URGENCY = eINSTANCE.getHeaderType_Urgency();

		/**
		 * The meta object literal for the '<em><b>Acknowledgment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_TYPE__ACKNOWLEDGMENT = eINSTANCE.getHeaderType_Acknowledgment();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_TYPE__TEXT = eINSTANCE.getHeaderType_Text();

		/**
		 * The meta object literal for the '<em><b>Lnk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_TYPE__LNK = eINSTANCE.getHeaderType_Lnk();

		/**
		 * The meta object literal for the '<em><b>Expirationdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__EXPIRATIONDATE = eINSTANCE.getHeaderType_Expirationdate();

		/**
		 * The meta object literal for the '<em><b>Externalsource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_TYPE__EXTERNALSOURCE = eINSTANCE.getHeaderType_Externalsource();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeadingTypeImpl <em>Heading Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeadingTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getHeadingType()
		 * @generated
		 */
		EClass HEADING_TYPE = eINSTANCE.getHeadingType();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADING_TYPE__CONFIDENTIALITY = eINSTANCE.getHeadingType_Confidentiality();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADING_TYPE__ID = eINSTANCE.getHeadingType_Id();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADING_TYPE__CD = eINSTANCE.getHeadingType_Cd();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING_TYPE__GROUP = eINSTANCE.getHeadingType_Group();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADING_TYPE__HEADING = eINSTANCE.getHeadingType_Heading();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADING_TYPE__ITEM = eINSTANCE.getHeadingType_Item();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADING_TYPE__TEXT = eINSTANCE.getHeadingType_Text();

		/**
		 * The meta object literal for the '<em><b>Lnk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADING_TYPE__LNK = eINSTANCE.getHeadingType_Lnk();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl <em>Holter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HolterTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getHolterType()
		 * @generated
		 */
		EClass HOLTER_TYPE = eINSTANCE.getHolterType();

		/**
		 * The meta object literal for the '<em><b>FCAVG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__FCAVG = eINSTANCE.getHolterType_FCAVG();

		/**
		 * The meta object literal for the '<em><b>FCMAX</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOLTER_TYPE__FCMAX = eINSTANCE.getHolterType_FCMAX();

		/**
		 * The meta object literal for the '<em><b>FCMIN</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOLTER_TYPE__FCMIN = eINSTANCE.getHolterType_FCMIN();

		/**
		 * The meta object literal for the '<em><b>FCAVGD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__FCAVGD = eINSTANCE.getHolterType_FCAVGD();

		/**
		 * The meta object literal for the '<em><b>FCAVGN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__FCAVGN = eINSTANCE.getHolterType_FCAVGN();

		/**
		 * The meta object literal for the '<em><b>RRMAX</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOLTER_TYPE__RRMAX = eINSTANCE.getHolterType_RRMAX();

		/**
		 * The meta object literal for the '<em><b>RRMIN</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOLTER_TYPE__RRMIN = eINSTANCE.getHolterType_RRMIN();

		/**
		 * The meta object literal for the '<em><b>QRSTOT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__QRSTOT = eINSTANCE.getHolterType_QRSTOT();

		/**
		 * The meta object literal for the '<em><b>BRADY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__BRADY = eINSTANCE.getHolterType_BRADY();

		/**
		 * The meta object literal for the '<em><b>PAUSE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__PAUSE = eINSTANCE.getHolterType_PAUSE();

		/**
		 * The meta object literal for the '<em><b>LONG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__LONG = eINSTANCE.getHolterType_LONG();

		/**
		 * The meta object literal for the '<em><b>ESV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__ESV = eINSTANCE.getHolterType_ESV();

		/**
		 * The meta object literal for the '<em><b>DBLV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__DBLV = eINSTANCE.getHolterType_DBLV();

		/**
		 * The meta object literal for the '<em><b>SALVV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__SALVV = eINSTANCE.getHolterType_SALVV();

		/**
		 * The meta object literal for the '<em><b>BGV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__BGV = eINSTANCE.getHolterType_BGV();

		/**
		 * The meta object literal for the '<em><b>TGV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__TGV = eINSTANCE.getHolterType_TGV();

		/**
		 * The meta object literal for the '<em><b>TACHY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__TACHY = eINSTANCE.getHolterType_TACHY();

		/**
		 * The meta object literal for the '<em><b>ESSV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__ESSV = eINSTANCE.getHolterType_ESSV();

		/**
		 * The meta object literal for the '<em><b>DBLSV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__DBLSV = eINSTANCE.getHolterType_DBLSV();

		/**
		 * The meta object literal for the '<em><b>SALVSV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__SALVSV = eINSTANCE.getHolterType_SALVSV();

		/**
		 * The meta object literal for the '<em><b>BGSV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__BGSV = eINSTANCE.getHolterType_BGSV();

		/**
		 * The meta object literal for the '<em><b>TGSV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__TGSV = eINSTANCE.getHolterType_TGSV();

		/**
		 * The meta object literal for the '<em><b>TACHYSV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__TACHYSV = eINSTANCE.getHolterType_TACHYSV();

		/**
		 * The meta object literal for the '<em><b>RRINST</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLTER_TYPE__RRINST = eINSTANCE.getHolterType_RRINST();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.IncapacityreasonTypeImpl <em>Incapacityreason Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.IncapacityreasonTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getIncapacityreasonType()
		 * @generated
		 */
		EClass INCAPACITYREASON_TYPE = eINSTANCE.getIncapacityreasonType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCAPACITYREASON_TYPE__CD = eINSTANCE.getIncapacityreasonType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.IncapacityTypeImpl <em>Incapacity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.IncapacityTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getIncapacityType()
		 * @generated
		 */
		EClass INCAPACITY_TYPE = eINSTANCE.getIncapacityType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCAPACITY_TYPE__CD = eINSTANCE.getIncapacityType_Cd();

		/**
		 * The meta object literal for the '<em><b>Incapacityreason</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCAPACITY_TYPE__INCAPACITYREASON = eINSTANCE.getIncapacityType_Incapacityreason();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCAPACITY_TYPE__PERCENTAGE = eINSTANCE.getIncapacityType_Percentage();

		/**
		 * The meta object literal for the '<em><b>Outofhomeallowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCAPACITY_TYPE__OUTOFHOMEALLOWED = eINSTANCE.getIncapacityType_Outofhomeallowed();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl <em>Insurance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.InsuranceTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getInsuranceType()
		 * @generated
		 */
		EClass INSURANCE_TYPE = eINSTANCE.getInsuranceType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_TYPE__ID = eINSTANCE.getInsuranceType_Id();

		/**
		 * The meta object literal for the '<em><b>Membership</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_TYPE__MEMBERSHIP = eINSTANCE.getInsuranceType_Membership();

		/**
		 * The meta object literal for the '<em><b>Siscard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_TYPE__SISCARD = eINSTANCE.getInsuranceType_Siscard();

		/**
		 * The meta object literal for the '<em><b>Begindate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_TYPE__BEGINDATE = eINSTANCE.getInsuranceType_Begindate();

		/**
		 * The meta object literal for the '<em><b>Enddate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_TYPE__ENDDATE = eINSTANCE.getInsuranceType_Enddate();

		/**
		 * The meta object literal for the '<em><b>Cg1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_TYPE__CG1 = eINSTANCE.getInsuranceType_Cg1();

		/**
		 * The meta object literal for the '<em><b>Cg2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_TYPE__CG2 = eINSTANCE.getInsuranceType_Cg2();

		/**
		 * The meta object literal for the '<em><b>Socialfranchiseperiod1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_TYPE__SOCIALFRANCHISEPERIOD1 = eINSTANCE.getInsuranceType_Socialfranchiseperiod1();

		/**
		 * The meta object literal for the '<em><b>Socialfranchiseperiod2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_TYPE__SOCIALFRANCHISEPERIOD2 = eINSTANCE.getInsuranceType_Socialfranchiseperiod2();

		/**
		 * The meta object literal for the '<em><b>Personalpart</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_TYPE__PERSONALPART = eINSTANCE.getInsuranceType_Personalpart();

		/**
		 * The meta object literal for the '<em><b>Thirdpayercontract</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_TYPE__THIRDPAYERCONTRACT = eINSTANCE.getInsuranceType_Thirdpayercontract();

		/**
		 * The meta object literal for the '<em><b>Begindatepayment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_TYPE__BEGINDATEPAYMENT = eINSTANCE.getInsuranceType_Begindatepayment();

		/**
		 * The meta object literal for the '<em><b>Approvalnumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_TYPE__APPROVALNUMBER = eINSTANCE.getInsuranceType_Approvalnumber();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__CONFIDENTIALITY = eINSTANCE.getItemType_Confidentiality();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__ID = eINSTANCE.getItemType_Id();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__CD = eINSTANCE.getItemType_Cd();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__CONTENT = eINSTANCE.getItemType_Content();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__TEXT = eINSTANCE.getItemType_Text();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__AUTHOR = eINSTANCE.getItemType_Author();

		/**
		 * The meta object literal for the '<em><b>Beginmoment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__BEGINMOMENT = eINSTANCE.getItemType_Beginmoment();

		/**
		 * The meta object literal for the '<em><b>Endmoment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__ENDMOMENT = eINSTANCE.getItemType_Endmoment();

		/**
		 * The meta object literal for the '<em><b>Iscomplete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__ISCOMPLETE = eINSTANCE.getItemType_Iscomplete();

		/**
		 * The meta object literal for the '<em><b>Isvalidated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__ISVALIDATED = eINSTANCE.getItemType_Isvalidated();

		/**
		 * The meta object literal for the '<em><b>Lifecycle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__LIFECYCLE = eINSTANCE.getItemType_Lifecycle();

		/**
		 * The meta object literal for the '<em><b>Isrelevant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__ISRELEVANT = eINSTANCE.getItemType_Isrelevant();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__SEVERITY = eINSTANCE.getItemType_Severity();

		/**
		 * The meta object literal for the '<em><b>Certainty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__CERTAINTY = eINSTANCE.getItemType_Certainty();

		/**
		 * The meta object literal for the '<em><b>Temporality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__TEMPORALITY = eINSTANCE.getItemType_Temporality();

		/**
		 * The meta object literal for the '<em><b>Urgency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__URGENCY = eINSTANCE.getItemType_Urgency();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__QUANTITY = eINSTANCE.getItemType_Quantity();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__STRENGTH = eINSTANCE.getItemType_Strength();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__FREQUENCY = eINSTANCE.getItemType_Frequency();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__SITE = eINSTANCE.getItemType_Site();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__COST = eINSTANCE.getItemType_Cost();

		/**
		 * The meta object literal for the '<em><b>Dayperiod</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__DAYPERIOD = eINSTANCE.getItemType_Dayperiod();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__DURATION = eINSTANCE.getItemType_Duration();

		/**
		 * The meta object literal for the '<em><b>Posology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__POSOLOGY = eINSTANCE.getItemType_Posology();

		/**
		 * The meta object literal for the '<em><b>Regimen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__REGIMEN = eINSTANCE.getItemType_Regimen();

		/**
		 * The meta object literal for the '<em><b>Deliverydate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__DELIVERYDATE = eINSTANCE.getItemType_Deliverydate();

		/**
		 * The meta object literal for the '<em><b>Renewal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__RENEWAL = eINSTANCE.getItemType_Renewal();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__ROUTE = eINSTANCE.getItemType_Route();

		/**
		 * The meta object literal for the '<em><b>Batch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__BATCH = eINSTANCE.getItemType_Batch();

		/**
		 * The meta object literal for the '<em><b>Instructionforoverdosing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__INSTRUCTIONFOROVERDOSING = eINSTANCE.getItemType_Instructionforoverdosing();

		/**
		 * The meta object literal for the '<em><b>Instructionforpatient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__INSTRUCTIONFORPATIENT = eINSTANCE.getItemType_Instructionforpatient();

		/**
		 * The meta object literal for the '<em><b>Instructionforreimbursement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__INSTRUCTIONFORREIMBURSEMENT = eINSTANCE.getItemType_Instructionforreimbursement();

		/**
		 * The meta object literal for the '<em><b>Issubstitutionallowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__ISSUBSTITUTIONALLOWED = eINSTANCE.getItemType_Issubstitutionallowed();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__FEEDBACK = eINSTANCE.getItemType_Feedback();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__LOCAL = eINSTANCE.getItemType_Local();

		/**
		 * The meta object literal for the '<em><b>Recorddatetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__RECORDDATETIME = eINSTANCE.getItemType_Recorddatetime();

		/**
		 * The meta object literal for the '<em><b>Lnk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__LNK = eINSTANCE.getItemType_Lnk();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrmessageTypeImpl <em>Kmehrmessage Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrmessageTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getKmehrmessageType()
		 * @generated
		 */
		EClass KMEHRMESSAGE_TYPE = eINSTANCE.getKmehrmessageType();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KMEHRMESSAGE_TYPE__CONFIDENTIALITY = eINSTANCE.getKmehrmessageType_Confidentiality();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KMEHRMESSAGE_TYPE__HEADER = eINSTANCE.getKmehrmessageType_Header();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KMEHRMESSAGE_TYPE__FOLDER = eINSTANCE.getKmehrmessageType_Folder();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KMEHRMESSAGE_TYPE__SIGNATURE = eINSTANCE.getKmehrmessageType_Signature();

		/**
		 * The meta object literal for the '<em><b>Encrypted Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KMEHRMESSAGE_TYPE__ENCRYPTED_DATA = eINSTANCE.getKmehrmessageType_EncryptedData();

		/**
		 * The meta object literal for the '<em><b>Base64 Encrypted Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KMEHRMESSAGE_TYPE__BASE64_ENCRYPTED_DATA = eINSTANCE.getKmehrmessageType_Base64EncryptedData();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.LifecycleTypeImpl <em>Lifecycle Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.LifecycleTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getLifecycleType()
		 * @generated
		 */
		EClass LIFECYCLE_TYPE = eINSTANCE.getLifecycleType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFECYCLE_TYPE__CD = eINSTANCE.getLifecycleType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.LocalitemattributeTypeImpl <em>Localitemattribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.LocalitemattributeTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getLocalitemattributeType()
		 * @generated
		 */
		EClass LOCALITEMATTRIBUTE_TYPE = eINSTANCE.getLocalitemattributeType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALITEMATTRIBUTE_TYPE__ID = eINSTANCE.getLocalitemattributeType_Id();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALITEMATTRIBUTE_TYPE__CD = eINSTANCE.getLocalitemattributeType_Cd();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALITEMATTRIBUTE_TYPE__CONTENT = eINSTANCE.getLocalitemattributeType_Content();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.LocationBirthPlaceTypeImpl <em>Location Birth Place Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.LocationBirthPlaceTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getLocationBirthPlaceType()
		 * @generated
		 */
		EClass LOCATION_BIRTH_PLACE_TYPE = eINSTANCE.getLocationBirthPlaceType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_BIRTH_PLACE_TYPE__CD = eINSTANCE.getLocationBirthPlaceType_Cd();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_BIRTH_PLACE_TYPE__TEXT = eINSTANCE.getLocationBirthPlaceType_Text();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_BIRTH_PLACE_TYPE__ADDRESS = eINSTANCE.getLocationBirthPlaceType_Address();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MaxrefTypeImpl <em>Maxref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MaxrefTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getMaxrefType()
		 * @generated
		 */
		EClass MAXREF_TYPE = eINSTANCE.getMaxrefType();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAXREF_TYPE__DECIMAL = eINSTANCE.getMaxrefType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAXREF_TYPE__TEXT = eINSTANCE.getMaxrefType_Text();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl <em>Medication Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getMedicationType()
		 * @generated
		 */
		EClass MEDICATION_TYPE = eINSTANCE.getMedicationType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATION_TYPE__CD = eINSTANCE.getMedicationType_Cd();

		/**
		 * The meta object literal for the '<em><b>Inn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATION_TYPE__INN = eINSTANCE.getMedicationType_Inn();

		/**
		 * The meta object literal for the '<em><b>Magistral</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATION_TYPE__MAGISTRAL = eINSTANCE.getMedicationType_Magistral();

		/**
		 * The meta object literal for the '<em><b>Tradename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_TYPE__TRADENAME = eINSTANCE.getMedicationType_Tradename();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATION_TYPE__PRESENTATION = eINSTANCE.getMedicationType_Presentation();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATION_TYPE__STRENGTH = eINSTANCE.getMedicationType_Strength();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATION_TYPE__ROUTE = eINSTANCE.getMedicationType_Route();

		/**
		 * The meta object literal for the '<em><b>Batch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_TYPE__BATCH = eINSTANCE.getMedicationType_Batch();

		/**
		 * The meta object literal for the '<em><b>Numberofpackage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_TYPE__NUMBEROFPACKAGE = eINSTANCE.getMedicationType_Numberofpackage();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATION_TYPE__PACKAGE = eINSTANCE.getMedicationType_Package();

		/**
		 * The meta object literal for the '<em><b>Quantityperpackage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_TYPE__QUANTITYPERPACKAGE = eINSTANCE.getMedicationType_Quantityperpackage();

		/**
		 * The meta object literal for the '<em><b>Instructionforoverdosing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATION_TYPE__INSTRUCTIONFOROVERDOSING = eINSTANCE.getMedicationType_Instructionforoverdosing();

		/**
		 * The meta object literal for the '<em><b>Instructionforpatient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATION_TYPE__INSTRUCTIONFORPATIENT = eINSTANCE.getMedicationType_Instructionforpatient();

		/**
		 * The meta object literal for the '<em><b>Instructionforreimbursement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATION_TYPE__INSTRUCTIONFORREIMBURSEMENT = eINSTANCE.getMedicationType_Instructionforreimbursement();

		/**
		 * The meta object literal for the '<em><b>Issubstitutionallowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION_TYPE__ISSUBSTITUTIONALLOWED = eINSTANCE.getMedicationType_Issubstitutionallowed();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicinalProductTypeImpl <em>Medicinal Product Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicinalProductTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getMedicinalProductType()
		 * @generated
		 */
		EClass MEDICINAL_PRODUCT_TYPE = eINSTANCE.getMedicinalProductType();

		/**
		 * The meta object literal for the '<em><b>Intendedcd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICINAL_PRODUCT_TYPE__INTENDEDCD = eINSTANCE.getMedicinalProductType_Intendedcd();

		/**
		 * The meta object literal for the '<em><b>Deliveredcd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICINAL_PRODUCT_TYPE__DELIVEREDCD = eINSTANCE.getMedicinalProductType_Deliveredcd();

		/**
		 * The meta object literal for the '<em><b>Intendedname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICINAL_PRODUCT_TYPE__INTENDEDNAME = eINSTANCE.getMedicinalProductType_Intendedname();

		/**
		 * The meta object literal for the '<em><b>Deliveredname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICINAL_PRODUCT_TYPE__DELIVEREDNAME = eINSTANCE.getMedicinalProductType_Deliveredname();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MemberinsuranceTypeImpl <em>Memberinsurance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MemberinsuranceTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getMemberinsuranceType()
		 * @generated
		 */
		EClass MEMBERINSURANCE_TYPE = eINSTANCE.getMemberinsuranceType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERINSURANCE_TYPE__ID = eINSTANCE.getMemberinsuranceType_Id();

		/**
		 * The meta object literal for the '<em><b>Membership</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERINSURANCE_TYPE__MEMBERSHIP = eINSTANCE.getMemberinsuranceType_Membership();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MinrefTypeImpl <em>Minref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MinrefTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getMinrefType()
		 * @generated
		 */
		EClass MINREF_TYPE = eINSTANCE.getMinrefType();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINREF_TYPE__DECIMAL = eINSTANCE.getMinrefType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINREF_TYPE__TEXT = eINSTANCE.getMinrefType_Text();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MomentTypeImpl <em>Moment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MomentTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getMomentType()
		 * @generated
		 */
		EClass MOMENT_TYPE = eINSTANCE.getMomentType();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOMENT_TYPE__YEAR = eINSTANCE.getMomentType_Year();

		/**
		 * The meta object literal for the '<em><b>Yearmonth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOMENT_TYPE__YEARMONTH = eINSTANCE.getMomentType_Yearmonth();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOMENT_TYPE__DATE = eINSTANCE.getMomentType_Date();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOMENT_TYPE__TIME = eINSTANCE.getMomentType_Time();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOMENT_TYPE__TEXT = eINSTANCE.getMomentType_Text();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.NationalityTypeImpl <em>Nationality Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.NationalityTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getNationalityType()
		 * @generated
		 */
		EClass NATIONALITY_TYPE = eINSTANCE.getNationalityType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATIONALITY_TYPE__CD = eINSTANCE.getNationalityType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.NominatorTypeImpl <em>Nominator Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.NominatorTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getNominatorType()
		 * @generated
		 */
		EClass NOMINATOR_TYPE = eINSTANCE.getNominatorType();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOMINATOR_TYPE__QUANTITY = eINSTANCE.getNominatorType_Quantity();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PackageTypeImpl <em>Package Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PackageTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPackageType()
		 * @generated
		 */
		EClass PACKAGE_TYPE = eINSTANCE.getPackageType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__CD = eINSTANCE.getPackageType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PeriodicityTypeImpl <em>Periodicity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PeriodicityTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPeriodicityType()
		 * @generated
		 */
		EClass PERIODICITY_TYPE = eINSTANCE.getPeriodicityType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODICITY_TYPE__CD = eINSTANCE.getPeriodicityType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonalpartTypeImpl <em>Personalpart Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonalpartTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPersonalpartType()
		 * @generated
		 */
		EClass PERSONALPART_TYPE = eINSTANCE.getPersonalpartType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONALPART_TYPE__ID = eINSTANCE.getPersonalpartType_Id();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONALPART_TYPE__CD = eINSTANCE.getPersonalpartType_Cd();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONALPART_TYPE__DATE = eINSTANCE.getPersonalpartType_Date();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONALPART_TYPE__TIME = eINSTANCE.getPersonalpartType_Time();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl <em>Person Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPersonType()
		 * @generated
		 */
		EClass PERSON_TYPE = eINSTANCE.getPersonType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__ID = eINSTANCE.getPersonType_Id();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TYPE__FIRSTNAME = eINSTANCE.getPersonType_Firstname();

		/**
		 * The meta object literal for the '<em><b>Familyname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TYPE__FAMILYNAME = eINSTANCE.getPersonType_Familyname();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__BIRTHDATE = eINSTANCE.getPersonType_Birthdate();

		/**
		 * The meta object literal for the '<em><b>Birthlocation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__BIRTHLOCATION = eINSTANCE.getPersonType_Birthlocation();

		/**
		 * The meta object literal for the '<em><b>Deathdate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__DEATHDATE = eINSTANCE.getPersonType_Deathdate();

		/**
		 * The meta object literal for the '<em><b>Deathlocation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__DEATHLOCATION = eINSTANCE.getPersonType_Deathlocation();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__SEX = eINSTANCE.getPersonType_Sex();

		/**
		 * The meta object literal for the '<em><b>Nationality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__NATIONALITY = eINSTANCE.getPersonType_Nationality();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__ADDRESS = eINSTANCE.getPersonType_Address();

		/**
		 * The meta object literal for the '<em><b>Telecom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__TELECOM = eINSTANCE.getPersonType_Telecom();

		/**
		 * The meta object literal for the '<em><b>Usuallanguage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TYPE__USUALLANGUAGE = eINSTANCE.getPersonType_Usuallanguage();

		/**
		 * The meta object literal for the '<em><b>Profession</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__PROFESSION = eINSTANCE.getPersonType_Profession();

		/**
		 * The meta object literal for the '<em><b>Insurancystatus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__INSURANCYSTATUS = eINSTANCE.getPersonType_Insurancystatus();

		/**
		 * The meta object literal for the '<em><b>Insurancymembership</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__INSURANCYMEMBERSHIP = eINSTANCE.getPersonType_Insurancymembership();

		/**
		 * The meta object literal for the '<em><b>Recorddatetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TYPE__RECORDDATETIME = eINSTANCE.getPersonType_Recorddatetime();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__TEXT = eINSTANCE.getPersonType_Text();

		/**
		 * The meta object literal for the '<em><b>Civilstate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__CIVILSTATE = eINSTANCE.getPersonType_Civilstate();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeLightImpl <em>Person Type Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PersonTypeLightImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPersonTypeLight()
		 * @generated
		 */
		EClass PERSON_TYPE_LIGHT = eINSTANCE.getPersonTypeLight();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE_LIGHT__ID = eINSTANCE.getPersonTypeLight_Id();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TYPE_LIGHT__FIRSTNAME = eINSTANCE.getPersonTypeLight_Firstname();

		/**
		 * The meta object literal for the '<em><b>Familyname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TYPE_LIGHT__FAMILYNAME = eINSTANCE.getPersonTypeLight_Familyname();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE_LIGHT__ADDRESS = eINSTANCE.getPersonTypeLight_Address();

		/**
		 * The meta object literal for the '<em><b>Telecom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE_LIGHT__TELECOM = eINSTANCE.getPersonTypeLight_Telecom();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PosologyTypeImpl <em>Posology Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PosologyTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPosologyType()
		 * @generated
		 */
		EClass POSOLOGY_TYPE = eINSTANCE.getPosologyType();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSOLOGY_TYPE__LOW = eINSTANCE.getPosologyType_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSOLOGY_TYPE__HIGH = eINSTANCE.getPosologyType_High();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSOLOGY_TYPE__UNIT = eINSTANCE.getPosologyType_Unit();

		/**
		 * The meta object literal for the '<em><b>Takes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSOLOGY_TYPE__TAKES = eINSTANCE.getPosologyType_Takes();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSOLOGY_TYPE__TEXT = eINSTANCE.getPosologyType_Text();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PresentationTypeImpl <em>Presentation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.PresentationTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getPresentationType()
		 * @generated
		 */
		EClass PRESENTATION_TYPE = eINSTANCE.getPresentationType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_TYPE__CD = eINSTANCE.getPresentationType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ProfessionTypeImpl <em>Profession Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ProfessionTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getProfessionType()
		 * @generated
		 */
		EClass PROFESSION_TYPE = eINSTANCE.getProfessionType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSION_TYPE__ID = eINSTANCE.getProfessionType_Id();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSION_TYPE__CD = eINSTANCE.getProfessionType_Cd();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSION_TYPE__TEXT = eINSTANCE.getProfessionType_Text();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.QuantityprefixTypeImpl <em>Quantityprefix Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.QuantityprefixTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getQuantityprefixType()
		 * @generated
		 */
		EClass QUANTITYPREFIX_TYPE = eINSTANCE.getQuantityprefixType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITYPREFIX_TYPE__CD = eINSTANCE.getQuantityprefixType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.QuantityTypeImpl <em>Quantity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.QuantityTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getQuantityType()
		 * @generated
		 */
		EClass QUANTITY_TYPE = eINSTANCE.getQuantityType();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_TYPE__DECIMAL = eINSTANCE.getQuantityType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_TYPE__UNIT = eINSTANCE.getQuantityType_Unit();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RecipientTypeImpl <em>Recipient Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RecipientTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRecipientType()
		 * @generated
		 */
		EClass RECIPIENT_TYPE = eINSTANCE.getRecipientType();

		/**
		 * The meta object literal for the '<em><b>Hcparty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPIENT_TYPE__HCPARTY = eINSTANCE.getRecipientType_Hcparty();

		/**
		 * The meta object literal for the '<em><b>Dummy Friend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPIENT_TYPE__DUMMY_FRIEND = eINSTANCE.getRecipientType_DummyFriend();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RefscopeTypeImpl <em>Refscope Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RefscopeTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRefscopeType()
		 * @generated
		 */
		EClass REFSCOPE_TYPE = eINSTANCE.getRefscopeType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFSCOPE_TYPE__CD = eINSTANCE.getRefscopeType_Cd();

		/**
		 * The meta object literal for the '<em><b>Refvalue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFSCOPE_TYPE__REFVALUE = eINSTANCE.getRefscopeType_Refvalue();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RefvalueTypeImpl <em>Refvalue Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RefvalueTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRefvalueType()
		 * @generated
		 */
		EClass REFVALUE_TYPE = eINSTANCE.getRefvalueType();

		/**
		 * The meta object literal for the '<em><b>Minref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFVALUE_TYPE__MINREF = eINSTANCE.getRefvalueType_Minref();

		/**
		 * The meta object literal for the '<em><b>Maxref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFVALUE_TYPE__MAXREF = eINSTANCE.getRefvalueType_Maxref();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFVALUE_TYPE__CONTEXT = eINSTANCE.getRefvalueType_Context();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RegimenTypeImpl <em>Regimen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RegimenTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRegimenType()
		 * @generated
		 */
		EClass REGIMEN_TYPE = eINSTANCE.getRegimenType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIMEN_TYPE__GROUP = eINSTANCE.getRegimenType_Group();

		/**
		 * The meta object literal for the '<em><b>Daynumber</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIMEN_TYPE__DAYNUMBER = eINSTANCE.getRegimenType_Daynumber();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIMEN_TYPE__DATE = eINSTANCE.getRegimenType_Date();

		/**
		 * The meta object literal for the '<em><b>Weekday</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIMEN_TYPE__WEEKDAY = eINSTANCE.getRegimenType_Weekday();

		/**
		 * The meta object literal for the '<em><b>Daytime</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIMEN_TYPE__DAYTIME = eINSTANCE.getRegimenType_Daytime();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIMEN_TYPE__QUANTITY = eINSTANCE.getRegimenType_Quantity();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RenewalTypeImpl <em>Renewal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RenewalTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRenewalType()
		 * @generated
		 */
		EClass RENEWAL_TYPE = eINSTANCE.getRenewalType();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENEWAL_TYPE__DECIMAL = eINSTANCE.getRenewalType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENEWAL_TYPE__DURATION = eINSTANCE.getRenewalType_Duration();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENEWAL_TYPE__TEXT = eINSTANCE.getRenewalType_Text();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RouteTypeImpl <em>Route Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RouteTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRouteType()
		 * @generated
		 */
		EClass ROUTE_TYPE = eINSTANCE.getRouteType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_TYPE__CD = eINSTANCE.getRouteType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RRMAXTypeImpl <em>RRMAX Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RRMAXTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRRMAXType()
		 * @generated
		 */
		EClass RRMAX_TYPE = eINSTANCE.getRRMAXType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RRMAX_TYPE__VALUE = eINSTANCE.getRRMAXType_Value();

		/**
		 * The meta object literal for the '<em><b>TIME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RRMAX_TYPE__TIME = eINSTANCE.getRRMAXType_TIME();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RRMINTypeImpl <em>RRMIN Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RRMINTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getRRMINType()
		 * @generated
		 */
		EClass RRMIN_TYPE = eINSTANCE.getRRMINType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RRMIN_TYPE__VALUE = eINSTANCE.getRRMINType_Value();

		/**
		 * The meta object literal for the '<em><b>TIME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RRMIN_TYPE__TIME = eINSTANCE.getRRMINType_TIME();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SenderTypeImpl <em>Sender Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SenderTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSenderType()
		 * @generated
		 */
		EClass SENDER_TYPE = eINSTANCE.getSenderType();

		/**
		 * The meta object literal for the '<em><b>Hcparty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER_TYPE__HCPARTY = eINSTANCE.getSenderType_Hcparty();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SeverityTypeImpl <em>Severity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SeverityTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSeverityType()
		 * @generated
		 */
		EClass SEVERITY_TYPE = eINSTANCE.getSeverityType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEVERITY_TYPE__CD = eINSTANCE.getSeverityType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SexTypeImpl <em>Sex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SexTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSexType()
		 * @generated
		 */
		EClass SEX_TYPE = eINSTANCE.getSexType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEX_TYPE__CD = eINSTANCE.getSexType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SiteTypeImpl <em>Site Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SiteTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSiteType()
		 * @generated
		 */
		EClass SITE_TYPE = eINSTANCE.getSiteType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_TYPE__CD = eINSTANCE.getSiteType_Cd();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_TYPE__TEXT = eINSTANCE.getSiteType_Text();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SourceTypeImpl <em>Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SourceTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSourceType()
		 * @generated
		 */
		EClass SOURCE_TYPE = eINSTANCE.getSourceType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_TYPE__CD = eINSTANCE.getSourceType_Cd();

		/**
		 * The meta object literal for the '<em><b>Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__DATETIME = eINSTANCE.getSourceType_Datetime();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__VERSION = eINSTANCE.getSourceType_Version();

		/**
		 * The meta object literal for the '<em><b>Proof</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__PROOF = eINSTANCE.getSourceType_Proof();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SpecialisationTypeImpl <em>Specialisation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SpecialisationTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSpecialisationType()
		 * @generated
		 */
		EClass SPECIALISATION_TYPE = eINSTANCE.getSpecialisationType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION_TYPE__CD = eINSTANCE.getSpecialisationType_Cd();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION_TYPE__VERSION = eINSTANCE.getSpecialisationType_Version();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.StandardTypeImpl <em>Standard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.StandardTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getStandardType()
		 * @generated
		 */
		EClass STANDARD_TYPE = eINSTANCE.getStandardType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_TYPE__CD = eINSTANCE.getStandardType_Cd();

		/**
		 * The meta object literal for the '<em><b>Specialisation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_TYPE__SPECIALISATION = eINSTANCE.getStandardType_Specialisation();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.StrengthTypeImpl <em>Strength Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.StrengthTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getStrengthType()
		 * @generated
		 */
		EClass STRENGTH_TYPE = eINSTANCE.getStrengthType();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRENGTH_TYPE__DECIMAL = eINSTANCE.getStrengthType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRENGTH_TYPE__UNIT = eINSTANCE.getStrengthType_Unit();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SubstanceproductTypeImpl <em>Substanceproduct Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SubstanceproductTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSubstanceproductType()
		 * @generated
		 */
		EClass SUBSTANCEPRODUCT_TYPE = eINSTANCE.getSubstanceproductType();

		/**
		 * The meta object literal for the '<em><b>Intendedcd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCEPRODUCT_TYPE__INTENDEDCD = eINSTANCE.getSubstanceproductType_Intendedcd();

		/**
		 * The meta object literal for the '<em><b>Deliveredcd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCEPRODUCT_TYPE__DELIVEREDCD = eINSTANCE.getSubstanceproductType_Deliveredcd();

		/**
		 * The meta object literal for the '<em><b>Intendedname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTANCEPRODUCT_TYPE__INTENDEDNAME = eINSTANCE.getSubstanceproductType_Intendedname();

		/**
		 * The meta object literal for the '<em><b>Deliveredname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTANCEPRODUCT_TYPE__DELIVEREDNAME = eINSTANCE.getSubstanceproductType_Deliveredname();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SubstanceTypeImpl <em>Substance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.SubstanceTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getSubstanceType()
		 * @generated
		 */
		EClass SUBSTANCE_TYPE = eINSTANCE.getSubstanceType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTANCE_TYPE__CD = eINSTANCE.getSubstanceType_Cd();

		/**
		 * The meta object literal for the '<em><b>Substancename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTANCE_TYPE__SUBSTANCENAME = eINSTANCE.getSubstanceType_Substancename();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TakesTypeImpl <em>Takes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TakesTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTakesType()
		 * @generated
		 */
		EClass TAKES_TYPE = eINSTANCE.getTakesType();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAKES_TYPE__LOW = eINSTANCE.getTakesType_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAKES_TYPE__HIGH = eINSTANCE.getTakesType_High();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TelecomTypeImpl <em>Telecom Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TelecomTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTelecomType()
		 * @generated
		 */
		EClass TELECOM_TYPE = eINSTANCE.getTelecomType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELECOM_TYPE__ID = eINSTANCE.getTelecomType_Id();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELECOM_TYPE__CD = eINSTANCE.getTelecomType_Cd();

		/**
		 * The meta object literal for the '<em><b>Telecomnumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_TYPE__TELECOMNUMBER = eINSTANCE.getTelecomType_Telecomnumber();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TemporalityTypeImpl <em>Temporality Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TemporalityTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTemporalityType()
		 * @generated
		 */
		EClass TEMPORALITY_TYPE = eINSTANCE.getTemporalityType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORALITY_TYPE__CD = eINSTANCE.getTemporalityType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TextWithLayoutTypeImpl <em>Text With Layout Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TextWithLayoutTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTextWithLayoutType()
		 * @generated
		 */
		EClass TEXT_WITH_LAYOUT_TYPE = eINSTANCE.getTextWithLayoutType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_WITH_LAYOUT_TYPE__MIXED = eINSTANCE.getTextWithLayoutType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_WITH_LAYOUT_TYPE__ANY = eINSTANCE.getTextWithLayoutType_Any();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_WITH_LAYOUT_TYPE__L = eINSTANCE.getTextWithLayoutType_L();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ThirdpayercontractTypeImpl <em>Thirdpayercontract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ThirdpayercontractTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getThirdpayercontractType()
		 * @generated
		 */
		EClass THIRDPAYERCONTRACT_TYPE = eINSTANCE.getThirdpayercontractType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THIRDPAYERCONTRACT_TYPE__CD = eINSTANCE.getThirdpayercontractType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TimequantityTypeImpl <em>Timequantity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TimequantityTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTimequantityType()
		 * @generated
		 */
		EClass TIMEQUANTITY_TYPE = eINSTANCE.getTimequantityType();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEQUANTITY_TYPE__DECIMAL = eINSTANCE.getTimequantityType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEQUANTITY_TYPE__UNIT = eINSTANCE.getTimequantityType_Unit();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TimeunitTypeImpl <em>Timeunit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TimeunitTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTimeunitType()
		 * @generated
		 */
		EClass TIMEUNIT_TYPE = eINSTANCE.getTimeunitType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEUNIT_TYPE__CD = eINSTANCE.getTimeunitType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl <em>Transaction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.TransactionTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getTransactionType()
		 * @generated
		 */
		EClass TRANSACTION_TYPE = eINSTANCE.getTransactionType();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__CONFIDENTIALITY = eINSTANCE.getTransactionType_Confidentiality();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__ID = eINSTANCE.getTransactionType_Id();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__CD = eINSTANCE.getTransactionType_Cd();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__DATE = eINSTANCE.getTransactionType_Date();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__TIME = eINSTANCE.getTransactionType_Time();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__AUTHOR = eINSTANCE.getTransactionType_Author();

		/**
		 * The meta object literal for the '<em><b>Redactor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__REDACTOR = eINSTANCE.getTransactionType_Redactor();

		/**
		 * The meta object literal for the '<em><b>Iscomplete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__ISCOMPLETE = eINSTANCE.getTransactionType_Iscomplete();

		/**
		 * The meta object literal for the '<em><b>Isvalidated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__ISVALIDATED = eINSTANCE.getTransactionType_Isvalidated();

		/**
		 * The meta object literal for the '<em><b>Expirationdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__EXPIRATIONDATE = eINSTANCE.getTransactionType_Expirationdate();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__GROUP = eINSTANCE.getTransactionType_Group();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__HEADING = eINSTANCE.getTransactionType_Heading();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__ITEM = eINSTANCE.getTransactionType_Item();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__TEXT = eINSTANCE.getTransactionType_Text();

		/**
		 * The meta object literal for the '<em><b>Text With Layout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__TEXT_WITH_LAYOUT = eINSTANCE.getTransactionType_TextWithLayout();

		/**
		 * The meta object literal for the '<em><b>Lnk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__LNK = eINSTANCE.getTransactionType_Lnk();

		/**
		 * The meta object literal for the '<em><b>Recorddatetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__RECORDDATETIME = eINSTANCE.getTransactionType_Recorddatetime();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__VERSION = eINSTANCE.getTransactionType_Version();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.UnitTypeImpl <em>Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.UnitTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getUnitType()
		 * @generated
		 */
		EClass UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TYPE__CD = eINSTANCE.getUnitType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.UrgencyTypeImpl <em>Urgency Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.UrgencyTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getUrgencyType()
		 * @generated
		 */
		EClass URGENCY_TYPE = eINSTANCE.getUrgencyType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference URGENCY_TYPE__CD = eINSTANCE.getUrgencyType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.WeekdayTypeImpl <em>Weekday Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.WeekdayTypeImpl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getWeekdayType()
		 * @generated
		 */
		EClass WEEKDAY_TYPE = eINSTANCE.getWeekdayType();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEEKDAY_TYPE__CD = eINSTANCE.getWeekdayType_Cd();

		/**
		 * The meta object literal for the '{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.WeekdayType1Impl <em>Weekday Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.WeekdayType1Impl
		 * @see be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrPackageImpl#getWeekdayType1()
		 * @generated
		 */
		EClass WEEKDAY_TYPE1 = eINSTANCE.getWeekdayType1();

		/**
		 * The meta object literal for the '<em><b>Weeknumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEEKDAY_TYPE1__WEEKNUMBER = eINSTANCE.getWeekdayType1_Weeknumber();

	}

} //KmehrPackage
