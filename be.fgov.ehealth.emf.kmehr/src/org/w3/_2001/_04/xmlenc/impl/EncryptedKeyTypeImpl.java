/**
 */
package org.w3._2001._04.xmlenc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._2001._04.xmlenc.EncryptedKeyType;
import org.w3._2001._04.xmlenc.ReferenceListType;
import org.w3._2001._04.xmlenc.XmlencPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encrypted Key Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptedKeyTypeImpl#getReferenceList <em>Reference List</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptedKeyTypeImpl#getCarriedKeyName <em>Carried Key Name</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptedKeyTypeImpl#getRecipient <em>Recipient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncryptedKeyTypeImpl extends EncryptedTypeImpl implements EncryptedKeyType {
	/**
	 * The cached value of the '{@link #getReferenceList() <em>Reference List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceList()
	 * @generated
	 * @ordered
	 */
	protected ReferenceListType referenceList;

	/**
	 * The default value of the '{@link #getCarriedKeyName() <em>Carried Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarriedKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIED_KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarriedKeyName() <em>Carried Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarriedKeyName()
	 * @generated
	 * @ordered
	 */
	protected String carriedKeyName = CARRIED_KEY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecipient() <em>Recipient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected static final String RECIPIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected String recipient = RECIPIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncryptedKeyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlencPackage.Literals.ENCRYPTED_KEY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceListType getReferenceList() {
		return referenceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceList(ReferenceListType newReferenceList, NotificationChain msgs) {
		ReferenceListType oldReferenceList = referenceList;
		referenceList = newReferenceList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_KEY_TYPE__REFERENCE_LIST, oldReferenceList, newReferenceList);
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
	public void setReferenceList(ReferenceListType newReferenceList) {
		if (newReferenceList != referenceList) {
			NotificationChain msgs = null;
			if (referenceList != null)
				msgs = ((InternalEObject)referenceList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.ENCRYPTED_KEY_TYPE__REFERENCE_LIST, null, msgs);
			if (newReferenceList != null)
				msgs = ((InternalEObject)newReferenceList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.ENCRYPTED_KEY_TYPE__REFERENCE_LIST, null, msgs);
			msgs = basicSetReferenceList(newReferenceList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_KEY_TYPE__REFERENCE_LIST, newReferenceList, newReferenceList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarriedKeyName() {
		return carriedKeyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarriedKeyName(String newCarriedKeyName) {
		String oldCarriedKeyName = carriedKeyName;
		carriedKeyName = newCarriedKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_KEY_TYPE__CARRIED_KEY_NAME, oldCarriedKeyName, carriedKeyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecipient() {
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecipient(String newRecipient) {
		String oldRecipient = recipient;
		recipient = newRecipient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTED_KEY_TYPE__RECIPIENT, oldRecipient, recipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlencPackage.ENCRYPTED_KEY_TYPE__REFERENCE_LIST:
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
			case XmlencPackage.ENCRYPTED_KEY_TYPE__REFERENCE_LIST:
				return getReferenceList();
			case XmlencPackage.ENCRYPTED_KEY_TYPE__CARRIED_KEY_NAME:
				return getCarriedKeyName();
			case XmlencPackage.ENCRYPTED_KEY_TYPE__RECIPIENT:
				return getRecipient();
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
			case XmlencPackage.ENCRYPTED_KEY_TYPE__REFERENCE_LIST:
				setReferenceList((ReferenceListType)newValue);
				return;
			case XmlencPackage.ENCRYPTED_KEY_TYPE__CARRIED_KEY_NAME:
				setCarriedKeyName((String)newValue);
				return;
			case XmlencPackage.ENCRYPTED_KEY_TYPE__RECIPIENT:
				setRecipient((String)newValue);
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
			case XmlencPackage.ENCRYPTED_KEY_TYPE__REFERENCE_LIST:
				setReferenceList((ReferenceListType)null);
				return;
			case XmlencPackage.ENCRYPTED_KEY_TYPE__CARRIED_KEY_NAME:
				setCarriedKeyName(CARRIED_KEY_NAME_EDEFAULT);
				return;
			case XmlencPackage.ENCRYPTED_KEY_TYPE__RECIPIENT:
				setRecipient(RECIPIENT_EDEFAULT);
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
			case XmlencPackage.ENCRYPTED_KEY_TYPE__REFERENCE_LIST:
				return referenceList != null;
			case XmlencPackage.ENCRYPTED_KEY_TYPE__CARRIED_KEY_NAME:
				return CARRIED_KEY_NAME_EDEFAULT == null ? carriedKeyName != null : !CARRIED_KEY_NAME_EDEFAULT.equals(carriedKeyName);
			case XmlencPackage.ENCRYPTED_KEY_TYPE__RECIPIENT:
				return RECIPIENT_EDEFAULT == null ? recipient != null : !RECIPIENT_EDEFAULT.equals(recipient);
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
		result.append(" (carriedKeyName: ");
		result.append(carriedKeyName);
		result.append(", recipient: ");
		result.append(recipient);
		result.append(')');
		return result.toString();
	}

} //EncryptedKeyTypeImpl
