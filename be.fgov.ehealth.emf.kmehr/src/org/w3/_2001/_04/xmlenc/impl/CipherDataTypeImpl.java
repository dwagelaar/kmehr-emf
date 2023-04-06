/**
 */
package org.w3._2001._04.xmlenc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3._2001._04.xmlenc.CipherDataType;
import org.w3._2001._04.xmlenc.CipherReferenceType;
import org.w3._2001._04.xmlenc.XmlencPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cipher Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.CipherDataTypeImpl#getCipherValue <em>Cipher Value</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.CipherDataTypeImpl#getCipherReference <em>Cipher Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CipherDataTypeImpl extends MinimalEObjectImpl.Container implements CipherDataType {
	/**
	 * The default value of the '{@link #getCipherValue() <em>Cipher Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CIPHER_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCipherValue() <em>Cipher Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherValue()
	 * @generated
	 * @ordered
	 */
	protected byte[] cipherValue = CIPHER_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCipherReference() <em>Cipher Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherReference()
	 * @generated
	 * @ordered
	 */
	protected CipherReferenceType cipherReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CipherDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlencPackage.Literals.CIPHER_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getCipherValue() {
		return cipherValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCipherValue(byte[] newCipherValue) {
		byte[] oldCipherValue = cipherValue;
		cipherValue = newCipherValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.CIPHER_DATA_TYPE__CIPHER_VALUE, oldCipherValue, cipherValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CipherReferenceType getCipherReference() {
		return cipherReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCipherReference(CipherReferenceType newCipherReference, NotificationChain msgs) {
		CipherReferenceType oldCipherReference = cipherReference;
		cipherReference = newCipherReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlencPackage.CIPHER_DATA_TYPE__CIPHER_REFERENCE, oldCipherReference, newCipherReference);
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
	public void setCipherReference(CipherReferenceType newCipherReference) {
		if (newCipherReference != cipherReference) {
			NotificationChain msgs = null;
			if (cipherReference != null)
				msgs = ((InternalEObject)cipherReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.CIPHER_DATA_TYPE__CIPHER_REFERENCE, null, msgs);
			if (newCipherReference != null)
				msgs = ((InternalEObject)newCipherReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.CIPHER_DATA_TYPE__CIPHER_REFERENCE, null, msgs);
			msgs = basicSetCipherReference(newCipherReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.CIPHER_DATA_TYPE__CIPHER_REFERENCE, newCipherReference, newCipherReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlencPackage.CIPHER_DATA_TYPE__CIPHER_REFERENCE:
				return basicSetCipherReference(null, msgs);
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
			case XmlencPackage.CIPHER_DATA_TYPE__CIPHER_VALUE:
				return getCipherValue();
			case XmlencPackage.CIPHER_DATA_TYPE__CIPHER_REFERENCE:
				return getCipherReference();
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
			case XmlencPackage.CIPHER_DATA_TYPE__CIPHER_VALUE:
				setCipherValue((byte[])newValue);
				return;
			case XmlencPackage.CIPHER_DATA_TYPE__CIPHER_REFERENCE:
				setCipherReference((CipherReferenceType)newValue);
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
			case XmlencPackage.CIPHER_DATA_TYPE__CIPHER_VALUE:
				setCipherValue(CIPHER_VALUE_EDEFAULT);
				return;
			case XmlencPackage.CIPHER_DATA_TYPE__CIPHER_REFERENCE:
				setCipherReference((CipherReferenceType)null);
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
			case XmlencPackage.CIPHER_DATA_TYPE__CIPHER_VALUE:
				return CIPHER_VALUE_EDEFAULT == null ? cipherValue != null : !CIPHER_VALUE_EDEFAULT.equals(cipherValue);
			case XmlencPackage.CIPHER_DATA_TYPE__CIPHER_REFERENCE:
				return cipherReference != null;
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
		result.append(" (cipherValue: ");
		result.append(cipherValue);
		result.append(')');
		return result.toString();
	}

} //CipherDataTypeImpl
