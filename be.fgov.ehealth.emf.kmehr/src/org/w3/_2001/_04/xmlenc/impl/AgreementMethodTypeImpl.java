/**
 */
package org.w3._2001._04.xmlenc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.KeyInfoType;

import org.w3._2001._04.xmlenc.AgreementMethodType;
import org.w3._2001._04.xmlenc.XmlencPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.AgreementMethodTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.AgreementMethodTypeImpl#getKANonce <em>KA Nonce</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.AgreementMethodTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.AgreementMethodTypeImpl#getOriginatorKeyInfo <em>Originator Key Info</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.AgreementMethodTypeImpl#getRecipientKeyInfo <em>Recipient Key Info</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.AgreementMethodTypeImpl#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementMethodTypeImpl extends MinimalEObjectImpl.Container implements AgreementMethodType {
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
	 * The default value of the '{@link #getKANonce() <em>KA Nonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKANonce()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] KA_NONCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementMethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlencPackage.Literals.AGREEMENT_METHOD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmlencPackage.AGREEMENT_METHOD_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getKANonce() {
		return (byte[])getMixed().get(XmlencPackage.Literals.AGREEMENT_METHOD_TYPE__KA_NONCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKANonce(byte[] newKANonce) {
		((FeatureMap.Internal)getMixed()).set(XmlencPackage.Literals.AGREEMENT_METHOD_TYPE__KA_NONCE, newKANonce);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XmlencPackage.Literals.AGREEMENT_METHOD_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyInfoType getOriginatorKeyInfo() {
		return (KeyInfoType)getMixed().get(XmlencPackage.Literals.AGREEMENT_METHOD_TYPE__ORIGINATOR_KEY_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginatorKeyInfo(KeyInfoType newOriginatorKeyInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlencPackage.Literals.AGREEMENT_METHOD_TYPE__ORIGINATOR_KEY_INFO, newOriginatorKeyInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatorKeyInfo(KeyInfoType newOriginatorKeyInfo) {
		((FeatureMap.Internal)getMixed()).set(XmlencPackage.Literals.AGREEMENT_METHOD_TYPE__ORIGINATOR_KEY_INFO, newOriginatorKeyInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyInfoType getRecipientKeyInfo() {
		return (KeyInfoType)getMixed().get(XmlencPackage.Literals.AGREEMENT_METHOD_TYPE__RECIPIENT_KEY_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipientKeyInfo(KeyInfoType newRecipientKeyInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlencPackage.Literals.AGREEMENT_METHOD_TYPE__RECIPIENT_KEY_INFO, newRecipientKeyInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecipientKeyInfo(KeyInfoType newRecipientKeyInfo) {
		((FeatureMap.Internal)getMixed()).set(XmlencPackage.Literals.AGREEMENT_METHOD_TYPE__RECIPIENT_KEY_INFO, newRecipientKeyInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.AGREEMENT_METHOD_TYPE__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlencPackage.AGREEMENT_METHOD_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ORIGINATOR_KEY_INFO:
				return basicSetOriginatorKeyInfo(null, msgs);
			case XmlencPackage.AGREEMENT_METHOD_TYPE__RECIPIENT_KEY_INFO:
				return basicSetRecipientKeyInfo(null, msgs);
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
			case XmlencPackage.AGREEMENT_METHOD_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XmlencPackage.AGREEMENT_METHOD_TYPE__KA_NONCE:
				return getKANonce();
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ORIGINATOR_KEY_INFO:
				return getOriginatorKeyInfo();
			case XmlencPackage.AGREEMENT_METHOD_TYPE__RECIPIENT_KEY_INFO:
				return getRecipientKeyInfo();
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ALGORITHM:
				return getAlgorithm();
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
			case XmlencPackage.AGREEMENT_METHOD_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XmlencPackage.AGREEMENT_METHOD_TYPE__KA_NONCE:
				setKANonce((byte[])newValue);
				return;
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ORIGINATOR_KEY_INFO:
				setOriginatorKeyInfo((KeyInfoType)newValue);
				return;
			case XmlencPackage.AGREEMENT_METHOD_TYPE__RECIPIENT_KEY_INFO:
				setRecipientKeyInfo((KeyInfoType)newValue);
				return;
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ALGORITHM:
				setAlgorithm((String)newValue);
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
			case XmlencPackage.AGREEMENT_METHOD_TYPE__MIXED:
				getMixed().clear();
				return;
			case XmlencPackage.AGREEMENT_METHOD_TYPE__KA_NONCE:
				setKANonce(KA_NONCE_EDEFAULT);
				return;
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ANY:
				getAny().clear();
				return;
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ORIGINATOR_KEY_INFO:
				setOriginatorKeyInfo((KeyInfoType)null);
				return;
			case XmlencPackage.AGREEMENT_METHOD_TYPE__RECIPIENT_KEY_INFO:
				setRecipientKeyInfo((KeyInfoType)null);
				return;
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
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
			case XmlencPackage.AGREEMENT_METHOD_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XmlencPackage.AGREEMENT_METHOD_TYPE__KA_NONCE:
				return KA_NONCE_EDEFAULT == null ? getKANonce() != null : !KA_NONCE_EDEFAULT.equals(getKANonce());
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ANY:
				return !getAny().isEmpty();
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ORIGINATOR_KEY_INFO:
				return getOriginatorKeyInfo() != null;
			case XmlencPackage.AGREEMENT_METHOD_TYPE__RECIPIENT_KEY_INFO:
				return getRecipientKeyInfo() != null;
			case XmlencPackage.AGREEMENT_METHOD_TYPE__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
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
		result.append(", algorithm: ");
		result.append(algorithm);
		result.append(')');
		return result.toString();
	}

} //AgreementMethodTypeImpl
