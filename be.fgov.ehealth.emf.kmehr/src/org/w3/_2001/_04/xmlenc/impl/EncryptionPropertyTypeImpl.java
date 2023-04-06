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

import org.w3._2001._04.xmlenc.EncryptionPropertyType;
import org.w3._2001._04.xmlenc.XmlencPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encryption Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptionPropertyTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptionPropertyTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptionPropertyTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptionPropertyTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptionPropertyTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.EncryptionPropertyTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncryptionPropertyTypeImpl extends MinimalEObjectImpl.Container implements EncryptionPropertyType {
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
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncryptionPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlencPackage.Literals.ENCRYPTION_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmlencPackage.ENCRYPTION_PROPERTY_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XmlencPackage.Literals.ENCRYPTION_PROPERTY_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(XmlencPackage.Literals.ENCRYPTION_PROPERTY_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlencPackage.ENCRYPTION_PROPERTY_TYPE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ID:
				return getId();
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__TARGET:
				return getTarget();
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ID:
				setId((String)newValue);
				return;
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__TARGET:
				setTarget((String)newValue);
				return;
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__MIXED:
				getMixed().clear();
				return;
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__GROUP:
				getGroup().clear();
				return;
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ANY:
				getAny().clear();
				return;
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__GROUP:
				return !getGroup().isEmpty();
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ANY:
				return !getAny().isEmpty();
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(", id: ");
		result.append(id);
		result.append(", target: ");
		result.append(target);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //EncryptionPropertyTypeImpl
