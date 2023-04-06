/**
 */
package org.w3._2001._04.xmlenc.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2001._04.xmlenc.AgreementMethodType;
import org.w3._2001._04.xmlenc.CipherDataType;
import org.w3._2001._04.xmlenc.CipherReferenceType;
import org.w3._2001._04.xmlenc.DocumentRoot;
import org.w3._2001._04.xmlenc.EncryptedDataType;
import org.w3._2001._04.xmlenc.EncryptedKeyType;
import org.w3._2001._04.xmlenc.EncryptionPropertiesType;
import org.w3._2001._04.xmlenc.EncryptionPropertyType;
import org.w3._2001._04.xmlenc.ReferenceListType;
import org.w3._2001._04.xmlenc.XmlencPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.DocumentRootImpl#getAgreementMethod <em>Agreement Method</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.DocumentRootImpl#getCipherData <em>Cipher Data</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.DocumentRootImpl#getCipherReference <em>Cipher Reference</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.DocumentRootImpl#getEncryptedData <em>Encrypted Data</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.DocumentRootImpl#getEncryptedKey <em>Encrypted Key</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.DocumentRootImpl#getEncryptionProperties <em>Encryption Properties</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.DocumentRootImpl#getEncryptionProperty <em>Encryption Property</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.DocumentRootImpl#getReferenceList <em>Reference List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlencPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmlencPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XmlencPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XmlencPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementMethodType getAgreementMethod() {
		return (AgreementMethodType)getMixed().get(XmlencPackage.Literals.DOCUMENT_ROOT__AGREEMENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgreementMethod(AgreementMethodType newAgreementMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlencPackage.Literals.DOCUMENT_ROOT__AGREEMENT_METHOD, newAgreementMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementMethod(AgreementMethodType newAgreementMethod) {
		((FeatureMap.Internal)getMixed()).set(XmlencPackage.Literals.DOCUMENT_ROOT__AGREEMENT_METHOD, newAgreementMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CipherDataType getCipherData() {
		return (CipherDataType)getMixed().get(XmlencPackage.Literals.DOCUMENT_ROOT__CIPHER_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCipherData(CipherDataType newCipherData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlencPackage.Literals.DOCUMENT_ROOT__CIPHER_DATA, newCipherData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCipherData(CipherDataType newCipherData) {
		((FeatureMap.Internal)getMixed()).set(XmlencPackage.Literals.DOCUMENT_ROOT__CIPHER_DATA, newCipherData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CipherReferenceType getCipherReference() {
		return (CipherReferenceType)getMixed().get(XmlencPackage.Literals.DOCUMENT_ROOT__CIPHER_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCipherReference(CipherReferenceType newCipherReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlencPackage.Literals.DOCUMENT_ROOT__CIPHER_REFERENCE, newCipherReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCipherReference(CipherReferenceType newCipherReference) {
		((FeatureMap.Internal)getMixed()).set(XmlencPackage.Literals.DOCUMENT_ROOT__CIPHER_REFERENCE, newCipherReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptedDataType getEncryptedData() {
		return (EncryptedDataType)getMixed().get(XmlencPackage.Literals.DOCUMENT_ROOT__ENCRYPTED_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptedData(EncryptedDataType newEncryptedData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlencPackage.Literals.DOCUMENT_ROOT__ENCRYPTED_DATA, newEncryptedData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptedData(EncryptedDataType newEncryptedData) {
		((FeatureMap.Internal)getMixed()).set(XmlencPackage.Literals.DOCUMENT_ROOT__ENCRYPTED_DATA, newEncryptedData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptedKeyType getEncryptedKey() {
		return (EncryptedKeyType)getMixed().get(XmlencPackage.Literals.DOCUMENT_ROOT__ENCRYPTED_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptedKey(EncryptedKeyType newEncryptedKey, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlencPackage.Literals.DOCUMENT_ROOT__ENCRYPTED_KEY, newEncryptedKey, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptedKey(EncryptedKeyType newEncryptedKey) {
		((FeatureMap.Internal)getMixed()).set(XmlencPackage.Literals.DOCUMENT_ROOT__ENCRYPTED_KEY, newEncryptedKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptionPropertiesType getEncryptionProperties() {
		return (EncryptionPropertiesType)getMixed().get(XmlencPackage.Literals.DOCUMENT_ROOT__ENCRYPTION_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptionProperties(EncryptionPropertiesType newEncryptionProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlencPackage.Literals.DOCUMENT_ROOT__ENCRYPTION_PROPERTIES, newEncryptionProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptionProperties(EncryptionPropertiesType newEncryptionProperties) {
		((FeatureMap.Internal)getMixed()).set(XmlencPackage.Literals.DOCUMENT_ROOT__ENCRYPTION_PROPERTIES, newEncryptionProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptionPropertyType getEncryptionProperty() {
		return (EncryptionPropertyType)getMixed().get(XmlencPackage.Literals.DOCUMENT_ROOT__ENCRYPTION_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptionProperty(EncryptionPropertyType newEncryptionProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlencPackage.Literals.DOCUMENT_ROOT__ENCRYPTION_PROPERTY, newEncryptionProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptionProperty(EncryptionPropertyType newEncryptionProperty) {
		((FeatureMap.Internal)getMixed()).set(XmlencPackage.Literals.DOCUMENT_ROOT__ENCRYPTION_PROPERTY, newEncryptionProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceListType getReferenceList() {
		return (ReferenceListType)getMixed().get(XmlencPackage.Literals.DOCUMENT_ROOT__REFERENCE_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceList(ReferenceListType newReferenceList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlencPackage.Literals.DOCUMENT_ROOT__REFERENCE_LIST, newReferenceList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceList(ReferenceListType newReferenceList) {
		((FeatureMap.Internal)getMixed()).set(XmlencPackage.Literals.DOCUMENT_ROOT__REFERENCE_LIST, newReferenceList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlencPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XmlencPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case XmlencPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case XmlencPackage.DOCUMENT_ROOT__AGREEMENT_METHOD:
				return basicSetAgreementMethod(null, msgs);
			case XmlencPackage.DOCUMENT_ROOT__CIPHER_DATA:
				return basicSetCipherData(null, msgs);
			case XmlencPackage.DOCUMENT_ROOT__CIPHER_REFERENCE:
				return basicSetCipherReference(null, msgs);
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTED_DATA:
				return basicSetEncryptedData(null, msgs);
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTED_KEY:
				return basicSetEncryptedKey(null, msgs);
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTION_PROPERTIES:
				return basicSetEncryptionProperties(null, msgs);
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTION_PROPERTY:
				return basicSetEncryptionProperty(null, msgs);
			case XmlencPackage.DOCUMENT_ROOT__REFERENCE_LIST:
				return basicSetReferenceList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlencPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XmlencPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case XmlencPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case XmlencPackage.DOCUMENT_ROOT__AGREEMENT_METHOD:
				return getAgreementMethod();
			case XmlencPackage.DOCUMENT_ROOT__CIPHER_DATA:
				return getCipherData();
			case XmlencPackage.DOCUMENT_ROOT__CIPHER_REFERENCE:
				return getCipherReference();
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTED_DATA:
				return getEncryptedData();
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTED_KEY:
				return getEncryptedKey();
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTION_PROPERTIES:
				return getEncryptionProperties();
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTION_PROPERTY:
				return getEncryptionProperty();
			case XmlencPackage.DOCUMENT_ROOT__REFERENCE_LIST:
				return getReferenceList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlencPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XmlencPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case XmlencPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case XmlencPackage.DOCUMENT_ROOT__AGREEMENT_METHOD:
				setAgreementMethod((AgreementMethodType)newValue);
				return;
			case XmlencPackage.DOCUMENT_ROOT__CIPHER_DATA:
				setCipherData((CipherDataType)newValue);
				return;
			case XmlencPackage.DOCUMENT_ROOT__CIPHER_REFERENCE:
				setCipherReference((CipherReferenceType)newValue);
				return;
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTED_DATA:
				setEncryptedData((EncryptedDataType)newValue);
				return;
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTED_KEY:
				setEncryptedKey((EncryptedKeyType)newValue);
				return;
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTION_PROPERTIES:
				setEncryptionProperties((EncryptionPropertiesType)newValue);
				return;
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTION_PROPERTY:
				setEncryptionProperty((EncryptionPropertyType)newValue);
				return;
			case XmlencPackage.DOCUMENT_ROOT__REFERENCE_LIST:
				setReferenceList((ReferenceListType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmlencPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case XmlencPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case XmlencPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case XmlencPackage.DOCUMENT_ROOT__AGREEMENT_METHOD:
				setAgreementMethod((AgreementMethodType)null);
				return;
			case XmlencPackage.DOCUMENT_ROOT__CIPHER_DATA:
				setCipherData((CipherDataType)null);
				return;
			case XmlencPackage.DOCUMENT_ROOT__CIPHER_REFERENCE:
				setCipherReference((CipherReferenceType)null);
				return;
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTED_DATA:
				setEncryptedData((EncryptedDataType)null);
				return;
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTED_KEY:
				setEncryptedKey((EncryptedKeyType)null);
				return;
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTION_PROPERTIES:
				setEncryptionProperties((EncryptionPropertiesType)null);
				return;
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTION_PROPERTY:
				setEncryptionProperty((EncryptionPropertyType)null);
				return;
			case XmlencPackage.DOCUMENT_ROOT__REFERENCE_LIST:
				setReferenceList((ReferenceListType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmlencPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XmlencPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case XmlencPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case XmlencPackage.DOCUMENT_ROOT__AGREEMENT_METHOD:
				return getAgreementMethod() != null;
			case XmlencPackage.DOCUMENT_ROOT__CIPHER_DATA:
				return getCipherData() != null;
			case XmlencPackage.DOCUMENT_ROOT__CIPHER_REFERENCE:
				return getCipherReference() != null;
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTED_DATA:
				return getEncryptedData() != null;
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTED_KEY:
				return getEncryptedKey() != null;
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTION_PROPERTIES:
				return getEncryptionProperties() != null;
			case XmlencPackage.DOCUMENT_ROOT__ENCRYPTION_PROPERTY:
				return getEncryptionProperty() != null;
			case XmlencPackage.DOCUMENT_ROOT__REFERENCE_LIST:
				return getReferenceList() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
