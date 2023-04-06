/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDFORMULARY;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.FormularyreferenceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formularyreference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FormularyreferenceTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.FormularyreferenceTypeImpl#getFormularyname <em>Formularyname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormularyreferenceTypeImpl extends MinimalEObjectImpl.Container implements FormularyreferenceType {
	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected EList<CDFORMULARY> cd;

	/**
	 * The default value of the '{@link #getFormularyname() <em>Formularyname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormularyname()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULARYNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormularyname() <em>Formularyname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormularyname()
	 * @generated
	 * @ordered
	 */
	protected String formularyname = FORMULARYNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormularyreferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.FORMULARYREFERENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CDFORMULARY> getCd() {
		if (cd == null) {
			cd = new EObjectContainmentEList<CDFORMULARY>(CDFORMULARY.class, this, KmehrPackage.FORMULARYREFERENCE_TYPE__CD);
		}
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormularyname() {
		return formularyname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormularyname(String newFormularyname) {
		String oldFormularyname = formularyname;
		formularyname = newFormularyname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.FORMULARYREFERENCE_TYPE__FORMULARYNAME, oldFormularyname, formularyname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.FORMULARYREFERENCE_TYPE__CD:
				return ((InternalEList<?>)getCd()).basicRemove(otherEnd, msgs);
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
			case KmehrPackage.FORMULARYREFERENCE_TYPE__CD:
				return getCd();
			case KmehrPackage.FORMULARYREFERENCE_TYPE__FORMULARYNAME:
				return getFormularyname();
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
			case KmehrPackage.FORMULARYREFERENCE_TYPE__CD:
				getCd().clear();
				getCd().addAll((Collection<? extends CDFORMULARY>)newValue);
				return;
			case KmehrPackage.FORMULARYREFERENCE_TYPE__FORMULARYNAME:
				setFormularyname((String)newValue);
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
			case KmehrPackage.FORMULARYREFERENCE_TYPE__CD:
				getCd().clear();
				return;
			case KmehrPackage.FORMULARYREFERENCE_TYPE__FORMULARYNAME:
				setFormularyname(FORMULARYNAME_EDEFAULT);
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
			case KmehrPackage.FORMULARYREFERENCE_TYPE__CD:
				return cd != null && !cd.isEmpty();
			case KmehrPackage.FORMULARYREFERENCE_TYPE__FORMULARYNAME:
				return FORMULARYNAME_EDEFAULT == null ? formularyname != null : !FORMULARYNAME_EDEFAULT.equals(formularyname);
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
		result.append(" (formularyname: ");
		result.append(formularyname);
		result.append(')');
		return result.toString();
	}

} //FormularyreferenceTypeImpl
