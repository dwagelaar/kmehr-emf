/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDHEADING;
import be.fgov.ehealth.standards.kmehr.cd.cd.LnkType;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.ConfidentialityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.HeadingType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heading Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeadingTypeImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeadingTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeadingTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeadingTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeadingTypeImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeadingTypeImpl#getItem <em>Item</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeadingTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.HeadingTypeImpl#getLnk <em>Lnk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadingTypeImpl extends MinimalEObjectImpl.Container implements HeadingType {
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
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected EList<IDKMEHR> id;

	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected EList<CDHEADING> cd;

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
	protected HeadingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.HEADING_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADING_TYPE__CONFIDENTIALITY, oldConfidentiality, newConfidentiality);
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
				msgs = ((InternalEObject)confidentiality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADING_TYPE__CONFIDENTIALITY, null, msgs);
			if (newConfidentiality != null)
				msgs = ((InternalEObject)newConfidentiality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.HEADING_TYPE__CONFIDENTIALITY, null, msgs);
			msgs = basicSetConfidentiality(newConfidentiality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.HEADING_TYPE__CONFIDENTIALITY, newConfidentiality, newConfidentiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDKMEHR> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<IDKMEHR>(IDKMEHR.class, this, KmehrPackage.HEADING_TYPE__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CDHEADING> getCd() {
		if (cd == null) {
			cd = new EObjectContainmentEList<CDHEADING>(CDHEADING.class, this, KmehrPackage.HEADING_TYPE__CD);
		}
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, KmehrPackage.HEADING_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HeadingType> getHeading() {
		return getGroup().list(KmehrPackage.Literals.HEADING_TYPE__HEADING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemType> getItem() {
		return getGroup().list(KmehrPackage.Literals.HEADING_TYPE__ITEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextType> getText() {
		return getGroup().list(KmehrPackage.Literals.HEADING_TYPE__TEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LnkType> getLnk() {
		return getGroup().list(KmehrPackage.Literals.HEADING_TYPE__LNK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.HEADING_TYPE__CONFIDENTIALITY:
				return basicSetConfidentiality(null, msgs);
			case KmehrPackage.HEADING_TYPE__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case KmehrPackage.HEADING_TYPE__CD:
				return ((InternalEList<?>)getCd()).basicRemove(otherEnd, msgs);
			case KmehrPackage.HEADING_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case KmehrPackage.HEADING_TYPE__HEADING:
				return ((InternalEList<?>)getHeading()).basicRemove(otherEnd, msgs);
			case KmehrPackage.HEADING_TYPE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case KmehrPackage.HEADING_TYPE__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
			case KmehrPackage.HEADING_TYPE__LNK:
				return ((InternalEList<?>)getLnk()).basicRemove(otherEnd, msgs);
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
			case KmehrPackage.HEADING_TYPE__CONFIDENTIALITY:
				return getConfidentiality();
			case KmehrPackage.HEADING_TYPE__ID:
				return getId();
			case KmehrPackage.HEADING_TYPE__CD:
				return getCd();
			case KmehrPackage.HEADING_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case KmehrPackage.HEADING_TYPE__HEADING:
				return getHeading();
			case KmehrPackage.HEADING_TYPE__ITEM:
				return getItem();
			case KmehrPackage.HEADING_TYPE__TEXT:
				return getText();
			case KmehrPackage.HEADING_TYPE__LNK:
				return getLnk();
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
			case KmehrPackage.HEADING_TYPE__CONFIDENTIALITY:
				setConfidentiality((ConfidentialityType)newValue);
				return;
			case KmehrPackage.HEADING_TYPE__ID:
				getId().clear();
				getId().addAll((Collection<? extends IDKMEHR>)newValue);
				return;
			case KmehrPackage.HEADING_TYPE__CD:
				getCd().clear();
				getCd().addAll((Collection<? extends CDHEADING>)newValue);
				return;
			case KmehrPackage.HEADING_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case KmehrPackage.HEADING_TYPE__HEADING:
				getHeading().clear();
				getHeading().addAll((Collection<? extends HeadingType>)newValue);
				return;
			case KmehrPackage.HEADING_TYPE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case KmehrPackage.HEADING_TYPE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends TextType>)newValue);
				return;
			case KmehrPackage.HEADING_TYPE__LNK:
				getLnk().clear();
				getLnk().addAll((Collection<? extends LnkType>)newValue);
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
			case KmehrPackage.HEADING_TYPE__CONFIDENTIALITY:
				setConfidentiality((ConfidentialityType)null);
				return;
			case KmehrPackage.HEADING_TYPE__ID:
				getId().clear();
				return;
			case KmehrPackage.HEADING_TYPE__CD:
				getCd().clear();
				return;
			case KmehrPackage.HEADING_TYPE__GROUP:
				getGroup().clear();
				return;
			case KmehrPackage.HEADING_TYPE__HEADING:
				getHeading().clear();
				return;
			case KmehrPackage.HEADING_TYPE__ITEM:
				getItem().clear();
				return;
			case KmehrPackage.HEADING_TYPE__TEXT:
				getText().clear();
				return;
			case KmehrPackage.HEADING_TYPE__LNK:
				getLnk().clear();
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
			case KmehrPackage.HEADING_TYPE__CONFIDENTIALITY:
				return confidentiality != null;
			case KmehrPackage.HEADING_TYPE__ID:
				return id != null && !id.isEmpty();
			case KmehrPackage.HEADING_TYPE__CD:
				return cd != null && !cd.isEmpty();
			case KmehrPackage.HEADING_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case KmehrPackage.HEADING_TYPE__HEADING:
				return !getHeading().isEmpty();
			case KmehrPackage.HEADING_TYPE__ITEM:
				return !getItem().isEmpty();
			case KmehrPackage.HEADING_TYPE__TEXT:
				return !getText().isEmpty();
			case KmehrPackage.HEADING_TYPE__LNK:
				return !getLnk().isEmpty();
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

} //HeadingTypeImpl
