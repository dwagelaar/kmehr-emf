/**
 */
package org.w3._2001._04.xmlenc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2001._04.xmlenc.ReferenceListType;
import org.w3._2001._04.xmlenc.ReferenceType;
import org.w3._2001._04.xmlenc.XmlencPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.ReferenceListTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.ReferenceListTypeImpl#getDataReference <em>Data Reference</em>}</li>
 *   <li>{@link org.w3._2001._04.xmlenc.impl.ReferenceListTypeImpl#getKeyReference <em>Key Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceListTypeImpl extends MinimalEObjectImpl.Container implements ReferenceListType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlencPackage.Literals.REFERENCE_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XmlencPackage.REFERENCE_LIST_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferenceType> getDataReference() {
		return getGroup().list(XmlencPackage.Literals.REFERENCE_LIST_TYPE__DATA_REFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferenceType> getKeyReference() {
		return getGroup().list(XmlencPackage.Literals.REFERENCE_LIST_TYPE__KEY_REFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlencPackage.REFERENCE_LIST_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XmlencPackage.REFERENCE_LIST_TYPE__DATA_REFERENCE:
				return ((InternalEList<?>)getDataReference()).basicRemove(otherEnd, msgs);
			case XmlencPackage.REFERENCE_LIST_TYPE__KEY_REFERENCE:
				return ((InternalEList<?>)getKeyReference()).basicRemove(otherEnd, msgs);
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
			case XmlencPackage.REFERENCE_LIST_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XmlencPackage.REFERENCE_LIST_TYPE__DATA_REFERENCE:
				return getDataReference();
			case XmlencPackage.REFERENCE_LIST_TYPE__KEY_REFERENCE:
				return getKeyReference();
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
			case XmlencPackage.REFERENCE_LIST_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XmlencPackage.REFERENCE_LIST_TYPE__DATA_REFERENCE:
				getDataReference().clear();
				getDataReference().addAll((Collection<? extends ReferenceType>)newValue);
				return;
			case XmlencPackage.REFERENCE_LIST_TYPE__KEY_REFERENCE:
				getKeyReference().clear();
				getKeyReference().addAll((Collection<? extends ReferenceType>)newValue);
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
			case XmlencPackage.REFERENCE_LIST_TYPE__GROUP:
				getGroup().clear();
				return;
			case XmlencPackage.REFERENCE_LIST_TYPE__DATA_REFERENCE:
				getDataReference().clear();
				return;
			case XmlencPackage.REFERENCE_LIST_TYPE__KEY_REFERENCE:
				getKeyReference().clear();
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
			case XmlencPackage.REFERENCE_LIST_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XmlencPackage.REFERENCE_LIST_TYPE__DATA_REFERENCE:
				return !getDataReference().isEmpty();
			case XmlencPackage.REFERENCE_LIST_TYPE__KEY_REFERENCE:
				return !getKeyReference().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ReferenceListTypeImpl
