/**
 */
package org.w3._2001._04.xmlenc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3._2001._04.xmlenc.CipherReferenceType;
import org.w3._2001._04.xmlenc.TransformsType;
import org.w3._2001._04.xmlenc.XmlencPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cipher Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.CipherReferenceTypeImpl#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.CipherReferenceTypeImpl#getURI <em>URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CipherReferenceTypeImpl extends MinimalEObjectImpl.Container implements CipherReferenceType {
	/**
	 * The cached value of the '{@link #getTransforms() <em>Transforms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransforms()
	 * @generated
	 * @ordered
	 */
	protected TransformsType transforms;

	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uRI = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CipherReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlencPackage.Literals.CIPHER_REFERENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformsType getTransforms() {
		return transforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransforms(TransformsType newTransforms, NotificationChain msgs) {
		TransformsType oldTransforms = transforms;
		transforms = newTransforms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlencPackage.CIPHER_REFERENCE_TYPE__TRANSFORMS, oldTransforms, newTransforms);
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
	public void setTransforms(TransformsType newTransforms) {
		if (newTransforms != transforms) {
			NotificationChain msgs = null;
			if (transforms != null)
				msgs = ((InternalEObject)transforms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.CIPHER_REFERENCE_TYPE__TRANSFORMS, null, msgs);
			if (newTransforms != null)
				msgs = ((InternalEObject)newTransforms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlencPackage.CIPHER_REFERENCE_TYPE__TRANSFORMS, null, msgs);
			msgs = basicSetTransforms(newTransforms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.CIPHER_REFERENCE_TYPE__TRANSFORMS, newTransforms, newTransforms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getURI() {
		return uRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setURI(String newURI) {
		String oldURI = uRI;
		uRI = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.CIPHER_REFERENCE_TYPE__URI, oldURI, uRI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlencPackage.CIPHER_REFERENCE_TYPE__TRANSFORMS:
				return basicSetTransforms(null, msgs);
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
			case XmlencPackage.CIPHER_REFERENCE_TYPE__TRANSFORMS:
				return getTransforms();
			case XmlencPackage.CIPHER_REFERENCE_TYPE__URI:
				return getURI();
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
			case XmlencPackage.CIPHER_REFERENCE_TYPE__TRANSFORMS:
				setTransforms((TransformsType)newValue);
				return;
			case XmlencPackage.CIPHER_REFERENCE_TYPE__URI:
				setURI((String)newValue);
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
			case XmlencPackage.CIPHER_REFERENCE_TYPE__TRANSFORMS:
				setTransforms((TransformsType)null);
				return;
			case XmlencPackage.CIPHER_REFERENCE_TYPE__URI:
				setURI(URI_EDEFAULT);
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
			case XmlencPackage.CIPHER_REFERENCE_TYPE__TRANSFORMS:
				return transforms != null;
			case XmlencPackage.CIPHER_REFERENCE_TYPE__URI:
				return URI_EDEFAULT == null ? uRI != null : !URI_EDEFAULT.equals(uRI);
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
		result.append(" (uRI: ");
		result.append(uRI);
		result.append(')');
		return result.toString();
	}

} //CipherReferenceTypeImpl
