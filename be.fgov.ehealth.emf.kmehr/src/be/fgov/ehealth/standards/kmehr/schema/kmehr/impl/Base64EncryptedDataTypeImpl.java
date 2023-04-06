/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDENCRYPTIONMETHOD;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedDataType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.Base64EncryptedValueType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base64 Encrypted Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.Base64EncryptedDataTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.Base64EncryptedDataTypeImpl#getBase64EncryptedValue <em>Base64 Encrypted Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Base64EncryptedDataTypeImpl extends MinimalEObjectImpl.Container implements Base64EncryptedDataType {
	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected CDENCRYPTIONMETHOD cd;

	/**
	 * The cached value of the '{@link #getBase64EncryptedValue() <em>Base64 Encrypted Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase64EncryptedValue()
	 * @generated
	 * @ordered
	 */
	protected Base64EncryptedValueType base64EncryptedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Base64EncryptedDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.BASE64_ENCRYPTED_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDENCRYPTIONMETHOD getCd() {
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCd(CDENCRYPTIONMETHOD newCd, NotificationChain msgs) {
		CDENCRYPTIONMETHOD oldCd = cd;
		cd = newCd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__CD, oldCd, newCd);
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
	public void setCd(CDENCRYPTIONMETHOD newCd) {
		if (newCd != cd) {
			NotificationChain msgs = null;
			if (cd != null)
				msgs = ((InternalEObject)cd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__CD, null, msgs);
			if (newCd != null)
				msgs = ((InternalEObject)newCd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__CD, null, msgs);
			msgs = basicSetCd(newCd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__CD, newCd, newCd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64EncryptedValueType getBase64EncryptedValue() {
		return base64EncryptedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase64EncryptedValue(Base64EncryptedValueType newBase64EncryptedValue, NotificationChain msgs) {
		Base64EncryptedValueType oldBase64EncryptedValue = base64EncryptedValue;
		base64EncryptedValue = newBase64EncryptedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__BASE64_ENCRYPTED_VALUE, oldBase64EncryptedValue, newBase64EncryptedValue);
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
	public void setBase64EncryptedValue(Base64EncryptedValueType newBase64EncryptedValue) {
		if (newBase64EncryptedValue != base64EncryptedValue) {
			NotificationChain msgs = null;
			if (base64EncryptedValue != null)
				msgs = ((InternalEObject)base64EncryptedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__BASE64_ENCRYPTED_VALUE, null, msgs);
			if (newBase64EncryptedValue != null)
				msgs = ((InternalEObject)newBase64EncryptedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__BASE64_ENCRYPTED_VALUE, null, msgs);
			msgs = basicSetBase64EncryptedValue(newBase64EncryptedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__BASE64_ENCRYPTED_VALUE, newBase64EncryptedValue, newBase64EncryptedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__CD:
				return basicSetCd(null, msgs);
			case KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__BASE64_ENCRYPTED_VALUE:
				return basicSetBase64EncryptedValue(null, msgs);
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
			case KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__CD:
				return getCd();
			case KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__BASE64_ENCRYPTED_VALUE:
				return getBase64EncryptedValue();
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
			case KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__CD:
				setCd((CDENCRYPTIONMETHOD)newValue);
				return;
			case KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__BASE64_ENCRYPTED_VALUE:
				setBase64EncryptedValue((Base64EncryptedValueType)newValue);
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
			case KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__CD:
				setCd((CDENCRYPTIONMETHOD)null);
				return;
			case KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__BASE64_ENCRYPTED_VALUE:
				setBase64EncryptedValue((Base64EncryptedValueType)null);
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
			case KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__CD:
				return cd != null;
			case KmehrPackage.BASE64_ENCRYPTED_DATA_TYPE__BASE64_ENCRYPTED_VALUE:
				return base64EncryptedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //Base64EncryptedDataTypeImpl
