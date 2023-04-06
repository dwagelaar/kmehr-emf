/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ConfidentialityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.FolderType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.HeaderType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrmessageType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.SignatureType;

import org.w3._2001._04.xmlenc.EncryptedType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kmehrmessage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrmessageTypeImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrmessageTypeImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrmessageTypeImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrmessageTypeImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrmessageTypeImpl#getEncryptedData <em>Encrypted Data</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.KmehrmessageTypeImpl#getBase64EncryptedData <em>Base64 Encrypted Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KmehrmessageTypeImpl extends MinimalEObjectImpl.Container implements KmehrmessageType {
	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected ConfidentialityType confidentiality;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected HeaderType header;

	/**
	 * The cached value of the '{@link #getFolder() <em>Folder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolder()
	 * @generated
	 * @ordered
	 */
	protected EList<FolderType> folder;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected SignatureType signature;

	/**
	 * This is true if the Signature containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signatureESet;

	/**
	 * The cached value of the '{@link #getEncryptedData() <em>Encrypted Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptedData()
	 * @generated
	 * @ordered
	 */
	protected EncryptedType encryptedData;

	/**
	 * The cached value of the '{@link #getBase64EncryptedData() <em>Base64 Encrypted Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase64EncryptedData()
	 * @generated
	 * @ordered
	 */
	protected Base64EncryptedDataType base64EncryptedData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KmehrmessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.KMEHRMESSAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidentialityType getConfidentiality() {
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidentiality(ConfidentialityType newConfidentiality, NotificationChain msgs) {
		ConfidentialityType oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.KMEHRMESSAGE_TYPE__CONFIDENTIALITY, oldConfidentiality, newConfidentiality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidentiality(ConfidentialityType newConfidentiality) {
		if (newConfidentiality != confidentiality) {
			NotificationChain msgs = null;
			if (confidentiality != null)
				msgs = ((InternalEObject)confidentiality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.KMEHRMESSAGE_TYPE__CONFIDENTIALITY, null, msgs);
			if (newConfidentiality != null)
				msgs = ((InternalEObject)newConfidentiality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.KMEHRMESSAGE_TYPE__CONFIDENTIALITY, null, msgs);
			msgs = basicSetConfidentiality(newConfidentiality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.KMEHRMESSAGE_TYPE__CONFIDENTIALITY, newConfidentiality, newConfidentiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeaderType getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderType newHeader, NotificationChain msgs) {
		HeaderType oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.KMEHRMESSAGE_TYPE__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(HeaderType newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.KMEHRMESSAGE_TYPE__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.KMEHRMESSAGE_TYPE__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.KMEHRMESSAGE_TYPE__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FolderType> getFolder() {
		if (folder == null) {
			folder = new EObjectContainmentEList<FolderType>(FolderType.class, this, KmehrPackage.KMEHRMESSAGE_TYPE__FOLDER);
		}
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignatureType getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature(SignatureType newSignature, NotificationChain msgs) {
		SignatureType oldSignature = signature;
		signature = newSignature;
		boolean oldSignatureESet = signatureESet;
		signatureESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.KMEHRMESSAGE_TYPE__SIGNATURE, oldSignature, newSignature, !oldSignatureESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignature(SignatureType newSignature) {
		if (newSignature != signature) {
			NotificationChain msgs = null;
			if (signature != null)
				msgs = ((InternalEObject)signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.KMEHRMESSAGE_TYPE__SIGNATURE, null, msgs);
			if (newSignature != null)
				msgs = ((InternalEObject)newSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.KMEHRMESSAGE_TYPE__SIGNATURE, null, msgs);
			msgs = basicSetSignature(newSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSignatureESet = signatureESet;
			signatureESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.KMEHRMESSAGE_TYPE__SIGNATURE, newSignature, newSignature, !oldSignatureESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSignature(NotificationChain msgs) {
		SignatureType oldSignature = signature;
		signature = null;
		boolean oldSignatureESet = signatureESet;
		signatureESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, KmehrPackage.KMEHRMESSAGE_TYPE__SIGNATURE, oldSignature, null, oldSignatureESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSignature() {
		if (signature != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.KMEHRMESSAGE_TYPE__SIGNATURE, null, msgs);
			msgs = basicUnsetSignature(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSignatureESet = signatureESet;
			signatureESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, KmehrPackage.KMEHRMESSAGE_TYPE__SIGNATURE, null, null, oldSignatureESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSignature() {
		return signatureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptedType getEncryptedData() {
		return encryptedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptedData(EncryptedType newEncryptedData, NotificationChain msgs) {
		EncryptedType oldEncryptedData = encryptedData;
		encryptedData = newEncryptedData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.KMEHRMESSAGE_TYPE__ENCRYPTED_DATA, oldEncryptedData, newEncryptedData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptedData(EncryptedType newEncryptedData) {
		if (newEncryptedData != encryptedData) {
			NotificationChain msgs = null;
			if (encryptedData != null)
				msgs = ((InternalEObject)encryptedData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.KMEHRMESSAGE_TYPE__ENCRYPTED_DATA, null, msgs);
			if (newEncryptedData != null)
				msgs = ((InternalEObject)newEncryptedData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.KMEHRMESSAGE_TYPE__ENCRYPTED_DATA, null, msgs);
			msgs = basicSetEncryptedData(newEncryptedData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.KMEHRMESSAGE_TYPE__ENCRYPTED_DATA, newEncryptedData, newEncryptedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64EncryptedDataType getBase64EncryptedData() {
		return base64EncryptedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase64EncryptedData(Base64EncryptedDataType newBase64EncryptedData, NotificationChain msgs) {
		Base64EncryptedDataType oldBase64EncryptedData = base64EncryptedData;
		base64EncryptedData = newBase64EncryptedData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.KMEHRMESSAGE_TYPE__BASE64_ENCRYPTED_DATA, oldBase64EncryptedData, newBase64EncryptedData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase64EncryptedData(Base64EncryptedDataType newBase64EncryptedData) {
		if (newBase64EncryptedData != base64EncryptedData) {
			NotificationChain msgs = null;
			if (base64EncryptedData != null)
				msgs = ((InternalEObject)base64EncryptedData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.KMEHRMESSAGE_TYPE__BASE64_ENCRYPTED_DATA, null, msgs);
			if (newBase64EncryptedData != null)
				msgs = ((InternalEObject)newBase64EncryptedData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.KMEHRMESSAGE_TYPE__BASE64_ENCRYPTED_DATA, null, msgs);
			msgs = basicSetBase64EncryptedData(newBase64EncryptedData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.KMEHRMESSAGE_TYPE__BASE64_ENCRYPTED_DATA, newBase64EncryptedData, newBase64EncryptedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.KMEHRMESSAGE_TYPE__CONFIDENTIALITY:
				return basicSetConfidentiality(null, msgs);
			case KmehrPackage.KMEHRMESSAGE_TYPE__HEADER:
				return basicSetHeader(null, msgs);
			case KmehrPackage.KMEHRMESSAGE_TYPE__FOLDER:
				return ((InternalEList<?>)getFolder()).basicRemove(otherEnd, msgs);
			case KmehrPackage.KMEHRMESSAGE_TYPE__SIGNATURE:
				return basicUnsetSignature(msgs);
			case KmehrPackage.KMEHRMESSAGE_TYPE__ENCRYPTED_DATA:
				return basicSetEncryptedData(null, msgs);
			case KmehrPackage.KMEHRMESSAGE_TYPE__BASE64_ENCRYPTED_DATA:
				return basicSetBase64EncryptedData(null, msgs);
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
			case KmehrPackage.KMEHRMESSAGE_TYPE__CONFIDENTIALITY:
				return getConfidentiality();
			case KmehrPackage.KMEHRMESSAGE_TYPE__HEADER:
				return getHeader();
			case KmehrPackage.KMEHRMESSAGE_TYPE__FOLDER:
				return getFolder();
			case KmehrPackage.KMEHRMESSAGE_TYPE__SIGNATURE:
				return getSignature();
			case KmehrPackage.KMEHRMESSAGE_TYPE__ENCRYPTED_DATA:
				return getEncryptedData();
			case KmehrPackage.KMEHRMESSAGE_TYPE__BASE64_ENCRYPTED_DATA:
				return getBase64EncryptedData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KmehrPackage.KMEHRMESSAGE_TYPE__CONFIDENTIALITY:
				setConfidentiality((ConfidentialityType)newValue);
				return;
			case KmehrPackage.KMEHRMESSAGE_TYPE__HEADER:
				setHeader((HeaderType)newValue);
				return;
			case KmehrPackage.KMEHRMESSAGE_TYPE__FOLDER:
				getFolder().clear();
				getFolder().addAll((Collection<? extends FolderType>)newValue);
				return;
			case KmehrPackage.KMEHRMESSAGE_TYPE__SIGNATURE:
				setSignature((SignatureType)newValue);
				return;
			case KmehrPackage.KMEHRMESSAGE_TYPE__ENCRYPTED_DATA:
				setEncryptedData((EncryptedType)newValue);
				return;
			case KmehrPackage.KMEHRMESSAGE_TYPE__BASE64_ENCRYPTED_DATA:
				setBase64EncryptedData((Base64EncryptedDataType)newValue);
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
			case KmehrPackage.KMEHRMESSAGE_TYPE__CONFIDENTIALITY:
				setConfidentiality((ConfidentialityType)null);
				return;
			case KmehrPackage.KMEHRMESSAGE_TYPE__HEADER:
				setHeader((HeaderType)null);
				return;
			case KmehrPackage.KMEHRMESSAGE_TYPE__FOLDER:
				getFolder().clear();
				return;
			case KmehrPackage.KMEHRMESSAGE_TYPE__SIGNATURE:
				unsetSignature();
				return;
			case KmehrPackage.KMEHRMESSAGE_TYPE__ENCRYPTED_DATA:
				setEncryptedData((EncryptedType)null);
				return;
			case KmehrPackage.KMEHRMESSAGE_TYPE__BASE64_ENCRYPTED_DATA:
				setBase64EncryptedData((Base64EncryptedDataType)null);
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
			case KmehrPackage.KMEHRMESSAGE_TYPE__CONFIDENTIALITY:
				return confidentiality != null;
			case KmehrPackage.KMEHRMESSAGE_TYPE__HEADER:
				return header != null;
			case KmehrPackage.KMEHRMESSAGE_TYPE__FOLDER:
				return folder != null && !folder.isEmpty();
			case KmehrPackage.KMEHRMESSAGE_TYPE__SIGNATURE:
				return isSetSignature();
			case KmehrPackage.KMEHRMESSAGE_TYPE__ENCRYPTED_DATA:
				return encryptedData != null;
			case KmehrPackage.KMEHRMESSAGE_TYPE__BASE64_ENCRYPTED_DATA:
				return base64EncryptedData != null;
		}
		return super.eIsSet(featureID);
	}

} //KmehrmessageTypeImpl
