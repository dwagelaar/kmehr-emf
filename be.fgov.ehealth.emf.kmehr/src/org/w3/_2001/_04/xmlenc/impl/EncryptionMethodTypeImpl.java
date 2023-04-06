/**
 */
package org.w3._2001._04.xmlenc.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2001._04.xmlenc.EncryptionMethodType;
import org.w3._2001._04.xmlenc.XmlencPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encryption Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptionMethodTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptionMethodTypeImpl#getKeySize <em>Key Size</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptionMethodTypeImpl#getOAEPparams <em>OAE Pparams</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptionMethodTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptionMethodTypeImpl#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncryptionMethodTypeImpl extends MinimalEObjectImpl.Container implements EncryptionMethodType {
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
	 * The default value of the '{@link #getKeySize() <em>Key Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeySize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger KEY_SIZE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOAEPparams() <em>OAE Pparams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOAEPparams()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] OAE_PPARAMS_EDEFAULT = null;

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
	protected EncryptionMethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlencPackage.Literals.ENCRYPTION_METHOD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmlencPackage.ENCRYPTION_METHOD_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getKeySize() {
		return (BigInteger)getMixed().get(XmlencPackage.Literals.ENCRYPTION_METHOD_TYPE__KEY_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeySize(BigInteger newKeySize) {
		((FeatureMap.Internal)getMixed()).set(XmlencPackage.Literals.ENCRYPTION_METHOD_TYPE__KEY_SIZE, newKeySize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getOAEPparams() {
		return (byte[])getMixed().get(XmlencPackage.Literals.ENCRYPTION_METHOD_TYPE__OAE_PPARAMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOAEPparams(byte[] newOAEPparams) {
		((FeatureMap.Internal)getMixed()).set(XmlencPackage.Literals.ENCRYPTION_METHOD_TYPE__OAE_PPARAMS, newOAEPparams);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XmlencPackage.Literals.ENCRYPTION_METHOD_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTION_METHOD_TYPE__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__KEY_SIZE:
				return getKeySize();
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__OAE_PPARAMS:
				return getOAEPparams();
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__ALGORITHM:
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
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__KEY_SIZE:
				setKeySize((BigInteger)newValue);
				return;
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__OAE_PPARAMS:
				setOAEPparams((byte[])newValue);
				return;
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__ALGORITHM:
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
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__MIXED:
				getMixed().clear();
				return;
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__KEY_SIZE:
				setKeySize(KEY_SIZE_EDEFAULT);
				return;
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__OAE_PPARAMS:
				setOAEPparams(OAE_PPARAMS_EDEFAULT);
				return;
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__ANY:
				getAny().clear();
				return;
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__ALGORITHM:
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
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__KEY_SIZE:
				return KEY_SIZE_EDEFAULT == null ? getKeySize() != null : !KEY_SIZE_EDEFAULT.equals(getKeySize());
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__OAE_PPARAMS:
				return OAE_PPARAMS_EDEFAULT == null ? getOAEPparams() != null : !OAE_PPARAMS_EDEFAULT.equals(getOAEPparams());
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__ANY:
				return !getAny().isEmpty();
			case XmlencPackage.ENCRYPTION_METHOD_TYPE__ALGORITHM:
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

} //EncryptionMethodTypeImpl
