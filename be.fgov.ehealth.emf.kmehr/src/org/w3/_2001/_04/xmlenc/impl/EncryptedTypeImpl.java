/**
 */
package org.w3._2001._04.xmlenc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3._2000._09.xmldsig.KeyInfoType;

import org.w3._2001._04.xmlenc.CipherDataType;
import org.w3._2001._04.xmlenc.EncryptedType;
import org.w3._2001._04.xmlenc.EncryptionMethodType;
import org.w3._2001._04.xmlenc.EncryptionPropertiesType;
import org.w3._2001._04.xmlenc.XmlencPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encrypted Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptedTypeImpl#getEncryptionMethod <em>Encryption Method</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptedTypeImpl#getKeyInfo <em>Key Info</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptedTypeImpl#getCipherData <em>Cipher Data</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptedTypeImpl#getEncryptionProperties <em>Encryption Properties</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptedTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptedTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptedTypeImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptedTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EncryptedTypeImpl extends MinimalEObjectImpl.Container implements EncryptedType {
	/**
	 * The cached value of the '{@link #getEncryptionMethod() <em>Encryption Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionMethod()
	 * @generated
	 * @ordered
	 */
	protected EncryptionMethodType encryptionMethod;

	/**
	 * The cached value of the '{@link #getKeyInfo() <em>Key Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyInfo()
	 * @generated
	 * @ordered
	 */
	protected KeyInfoType keyInfo;

	/**
	 * The cached value of the '{@link #getCipherData() <em>Cipher Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherData()
	 * @generated
	 * @ordered
	 */
	protected CipherDataType cipherData;

	/**
	 * The cached value of the '{@link #getEncryptionProperties() <em>Encryption Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionProperties()
	 * @generated
	 * @ordered
	 */
	protected EncryptionPropertiesType encryptionProperties;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncryptedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlencPackage.Literals.ENCRYPTED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptionMethodType getEncryptionMethod() {
		return encryptionMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptionMethod(EncryptionMethodType newEncryptionMethod, NotificationChain msgs) {
		EncryptionMethodType oldEncryptionMethod = encryptionMethod;
		encryptionMethod = newEncryptionMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_METHOD, oldEncryptionMethod, newEncryptionMethod);
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
	public void setEncryptionMethod(EncryptionMethodType newEncryptionMethod) {
		if (newEncryptionMethod != encryptionMethod) {
			NotificationChain msgs = null;
			if (encryptionMethod != null)
				msgs = ((InternalEObject)encryptionMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_METHOD, null, msgs);
			if (newEncryptionMethod != null)
				msgs = ((InternalEObject)newEncryptionMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_METHOD, null, msgs);
			msgs = basicSetEncryptionMethod(newEncryptionMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_METHOD, newEncryptionMethod, newEncryptionMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyInfoType getKeyInfo() {
		return keyInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyInfo(KeyInfoType newKeyInfo, NotificationChain msgs) {
		KeyInfoType oldKeyInfo = keyInfo;
		keyInfo = newKeyInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_TYPE__KEY_INFO, oldKeyInfo, newKeyInfo);
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
	public void setKeyInfo(KeyInfoType newKeyInfo) {
		if (newKeyInfo != keyInfo) {
			NotificationChain msgs = null;
			if (keyInfo != null)
				msgs = ((InternalEObject)keyInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.ENCRYPTED_TYPE__KEY_INFO, null, msgs);
			if (newKeyInfo != null)
				msgs = ((InternalEObject)newKeyInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.ENCRYPTED_TYPE__KEY_INFO, null, msgs);
			msgs = basicSetKeyInfo(newKeyInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_TYPE__KEY_INFO, newKeyInfo, newKeyInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CipherDataType getCipherData() {
		return cipherData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCipherData(CipherDataType newCipherData, NotificationChain msgs) {
		CipherDataType oldCipherData = cipherData;
		cipherData = newCipherData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_TYPE__CIPHER_DATA, oldCipherData, newCipherData);
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
	public void setCipherData(CipherDataType newCipherData) {
		if (newCipherData != cipherData) {
			NotificationChain msgs = null;
			if (cipherData != null)
				msgs = ((InternalEObject)cipherData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.ENCRYPTED_TYPE__CIPHER_DATA, null, msgs);
			if (newCipherData != null)
				msgs = ((InternalEObject)newCipherData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.ENCRYPTED_TYPE__CIPHER_DATA, null, msgs);
			msgs = basicSetCipherData(newCipherData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_TYPE__CIPHER_DATA, newCipherData, newCipherData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptionPropertiesType getEncryptionProperties() {
		return encryptionProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptionProperties(EncryptionPropertiesType newEncryptionProperties, NotificationChain msgs) {
		EncryptionPropertiesType oldEncryptionProperties = encryptionProperties;
		encryptionProperties = newEncryptionProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES, oldEncryptionProperties, newEncryptionProperties);
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
	public void setEncryptionProperties(EncryptionPropertiesType newEncryptionProperties) {
		if (newEncryptionProperties != encryptionProperties) {
			NotificationChain msgs = null;
			if (encryptionProperties != null)
				msgs = ((InternalEObject)encryptionProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES, null, msgs);
			if (newEncryptionProperties != null)
				msgs = ((InternalEObject)newEncryptionProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES, null, msgs);
			msgs = basicSetEncryptionProperties(newEncryptionProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES, newEncryptionProperties, newEncryptionProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_TYPE__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_TYPE__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_METHOD:
				return basicSetEncryptionMethod(null, msgs);
			case XmlencPackage.ENCRYPTED_TYPE__KEY_INFO:
				return basicSetKeyInfo(null, msgs);
			case XmlencPackage.ENCRYPTED_TYPE__CIPHER_DATA:
				return basicSetCipherData(null, msgs);
			case XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES:
				return basicSetEncryptionProperties(null, msgs);
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
			case XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_METHOD:
				return getEncryptionMethod();
			case XmlencPackage.ENCRYPTED_TYPE__KEY_INFO:
				return getKeyInfo();
			case XmlencPackage.ENCRYPTED_TYPE__CIPHER_DATA:
				return getCipherData();
			case XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES:
				return getEncryptionProperties();
			case XmlencPackage.ENCRYPTED_TYPE__ENCODING:
				return getEncoding();
			case XmlencPackage.ENCRYPTED_TYPE__ID:
				return getId();
			case XmlencPackage.ENCRYPTED_TYPE__MIME_TYPE:
				return getMimeType();
			case XmlencPackage.ENCRYPTED_TYPE__TYPE:
				return getType();
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
			case XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_METHOD:
				setEncryptionMethod((EncryptionMethodType)newValue);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__KEY_INFO:
				setKeyInfo((KeyInfoType)newValue);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__CIPHER_DATA:
				setCipherData((CipherDataType)newValue);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES:
				setEncryptionProperties((EncryptionPropertiesType)newValue);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__ID:
				setId((String)newValue);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__TYPE:
				setType((String)newValue);
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
			case XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_METHOD:
				setEncryptionMethod((EncryptionMethodType)null);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__KEY_INFO:
				setKeyInfo((KeyInfoType)null);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__CIPHER_DATA:
				setCipherData((CipherDataType)null);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES:
				setEncryptionProperties((EncryptionPropertiesType)null);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case XmlencPackage.ENCRYPTED_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_METHOD:
				return encryptionMethod != null;
			case XmlencPackage.ENCRYPTED_TYPE__KEY_INFO:
				return keyInfo != null;
			case XmlencPackage.ENCRYPTED_TYPE__CIPHER_DATA:
				return cipherData != null;
			case XmlencPackage.ENCRYPTED_TYPE__ENCRYPTION_PROPERTIES:
				return encryptionProperties != null;
			case XmlencPackage.ENCRYPTED_TYPE__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case XmlencPackage.ENCRYPTED_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XmlencPackage.ENCRYPTED_TYPE__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
			case XmlencPackage.ENCRYPTED_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (encoding: ");
		result.append(encoding);
		result.append(", id: ");
		result.append(id);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EncryptedTypeImpl
