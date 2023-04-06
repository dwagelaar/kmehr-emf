/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.AdministrationquantityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.DaytimeType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.WeekdayType1;

import java.math.BigInteger;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regimen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RegimenTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RegimenTypeImpl#getDaynumber <em>Daynumber</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RegimenTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RegimenTypeImpl#getWeekday <em>Weekday</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RegimenTypeImpl#getDaytime <em>Daytime</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.RegimenTypeImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegimenTypeImpl extends MinimalEObjectImpl.Container implements RegimenType {
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
	protected RegimenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.REGIMEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, KmehrPackage.REGIMEN_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigInteger> getDaynumber() {
		return getGroup().list(KmehrPackage.Literals.REGIMEN_TYPE__DAYNUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XMLGregorianCalendar> getDate() {
		return getGroup().list(KmehrPackage.Literals.REGIMEN_TYPE__DATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WeekdayType1> getWeekday() {
		return getGroup().list(KmehrPackage.Literals.REGIMEN_TYPE__WEEKDAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DaytimeType> getDaytime() {
		return getGroup().list(KmehrPackage.Literals.REGIMEN_TYPE__DAYTIME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdministrationquantityType> getQuantity() {
		return getGroup().list(KmehrPackage.Literals.REGIMEN_TYPE__QUANTITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.REGIMEN_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case KmehrPackage.REGIMEN_TYPE__WEEKDAY:
				return ((InternalEList<?>)getWeekday()).basicRemove(otherEnd, msgs);
			case KmehrPackage.REGIMEN_TYPE__DAYTIME:
				return ((InternalEList<?>)getDaytime()).basicRemove(otherEnd, msgs);
			case KmehrPackage.REGIMEN_TYPE__QUANTITY:
				return ((InternalEList<?>)getQuantity()).basicRemove(otherEnd, msgs);
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
			case KmehrPackage.REGIMEN_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case KmehrPackage.REGIMEN_TYPE__DAYNUMBER:
				return getDaynumber();
			case KmehrPackage.REGIMEN_TYPE__DATE:
				return getDate();
			case KmehrPackage.REGIMEN_TYPE__WEEKDAY:
				return getWeekday();
			case KmehrPackage.REGIMEN_TYPE__DAYTIME:
				return getDaytime();
			case KmehrPackage.REGIMEN_TYPE__QUANTITY:
				return getQuantity();
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
			case KmehrPackage.REGIMEN_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case KmehrPackage.REGIMEN_TYPE__DAYNUMBER:
				getDaynumber().clear();
				getDaynumber().addAll((Collection<? extends BigInteger>)newValue);
				return;
			case KmehrPackage.REGIMEN_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends XMLGregorianCalendar>)newValue);
				return;
			case KmehrPackage.REGIMEN_TYPE__WEEKDAY:
				getWeekday().clear();
				getWeekday().addAll((Collection<? extends WeekdayType1>)newValue);
				return;
			case KmehrPackage.REGIMEN_TYPE__DAYTIME:
				getDaytime().clear();
				getDaytime().addAll((Collection<? extends DaytimeType>)newValue);
				return;
			case KmehrPackage.REGIMEN_TYPE__QUANTITY:
				getQuantity().clear();
				getQuantity().addAll((Collection<? extends AdministrationquantityType>)newValue);
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
			case KmehrPackage.REGIMEN_TYPE__GROUP:
				getGroup().clear();
				return;
			case KmehrPackage.REGIMEN_TYPE__DAYNUMBER:
				getDaynumber().clear();
				return;
			case KmehrPackage.REGIMEN_TYPE__DATE:
				getDate().clear();
				return;
			case KmehrPackage.REGIMEN_TYPE__WEEKDAY:
				getWeekday().clear();
				return;
			case KmehrPackage.REGIMEN_TYPE__DAYTIME:
				getDaytime().clear();
				return;
			case KmehrPackage.REGIMEN_TYPE__QUANTITY:
				getQuantity().clear();
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
			case KmehrPackage.REGIMEN_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case KmehrPackage.REGIMEN_TYPE__DAYNUMBER:
				return !getDaynumber().isEmpty();
			case KmehrPackage.REGIMEN_TYPE__DATE:
				return !getDate().isEmpty();
			case KmehrPackage.REGIMEN_TYPE__WEEKDAY:
				return !getWeekday().isEmpty();
			case KmehrPackage.REGIMEN_TYPE__DAYTIME:
				return !getDaytime().isEmpty();
			case KmehrPackage.REGIMEN_TYPE__QUANTITY:
				return !getQuantity().isEmpty();
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

} //RegimenTypeImpl
