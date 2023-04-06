/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundprescriptionType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.FormularyreferenceType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.GalenicformType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compoundprescription Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundprescriptionTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundprescriptionTypeImpl#getCompound <em>Compound</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundprescriptionTypeImpl#getFormularyreference <em>Formularyreference</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundprescriptionTypeImpl#getMagistraltext <em>Magistraltext</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundprescriptionTypeImpl#getGalenicform <em>Galenicform</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundprescriptionTypeImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundprescriptionTypeImpl#getL <em>L</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundprescriptionTypeImpl extends MinimalEObjectImpl.Container implements CompoundprescriptionType {
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
	 * The default value of the '{@link #getL() <em>L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL()
	 * @generated
	 * @ordered
	 */
	protected static final String L_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getL() <em>L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL()
	 * @generated
	 * @ordered
	 */
	protected String l = L_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundprescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompoundType> getCompound() {
		return getMixed().list(KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE__COMPOUND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormularyreferenceType getFormularyreference() {
		return (FormularyreferenceType)getMixed().get(KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE__FORMULARYREFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormularyreference(FormularyreferenceType newFormularyreference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE__FORMULARYREFERENCE, newFormularyreference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormularyreference(FormularyreferenceType newFormularyreference) {
		((FeatureMap.Internal)getMixed()).set(KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE__FORMULARYREFERENCE, newFormularyreference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType getMagistraltext() {
		return (TextType)getMixed().get(KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE__MAGISTRALTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMagistraltext(TextType newMagistraltext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE__MAGISTRALTEXT, newMagistraltext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMagistraltext(TextType newMagistraltext) {
		((FeatureMap.Internal)getMixed()).set(KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE__MAGISTRALTEXT, newMagistraltext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GalenicformType getGalenicform() {
		return (GalenicformType)getMixed().get(KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE__GALENICFORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGalenicform(GalenicformType newGalenicform, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE__GALENICFORM, newGalenicform, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGalenicform(GalenicformType newGalenicform) {
		((FeatureMap.Internal)getMixed()).set(KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE__GALENICFORM, newGalenicform);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityType getQuantity() {
		return (QuantityType)getMixed().get(KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(QuantityType newQuantity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE__QUANTITY, newQuantity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(QuantityType newQuantity) {
		((FeatureMap.Internal)getMixed()).set(KmehrPackage.Literals.COMPOUNDPRESCRIPTION_TYPE__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getL() {
		return l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setL(String newL) {
		String oldL = l;
		l = newL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__L, oldL, l));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__COMPOUND:
				return ((InternalEList<?>)getCompound()).basicRemove(otherEnd, msgs);
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__FORMULARYREFERENCE:
				return basicSetFormularyreference(null, msgs);
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__MAGISTRALTEXT:
				return basicSetMagistraltext(null, msgs);
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__GALENICFORM:
				return basicSetGalenicform(null, msgs);
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__QUANTITY:
				return basicSetQuantity(null, msgs);
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
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__COMPOUND:
				return getCompound();
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__FORMULARYREFERENCE:
				return getFormularyreference();
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__MAGISTRALTEXT:
				return getMagistraltext();
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__GALENICFORM:
				return getGalenicform();
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__QUANTITY:
				return getQuantity();
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__L:
				return getL();
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
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__COMPOUND:
				getCompound().clear();
				getCompound().addAll((Collection<? extends CompoundType>)newValue);
				return;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__FORMULARYREFERENCE:
				setFormularyreference((FormularyreferenceType)newValue);
				return;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__MAGISTRALTEXT:
				setMagistraltext((TextType)newValue);
				return;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__GALENICFORM:
				setGalenicform((GalenicformType)newValue);
				return;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__QUANTITY:
				setQuantity((QuantityType)newValue);
				return;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__L:
				setL((String)newValue);
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
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__MIXED:
				getMixed().clear();
				return;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__COMPOUND:
				getCompound().clear();
				return;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__FORMULARYREFERENCE:
				setFormularyreference((FormularyreferenceType)null);
				return;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__MAGISTRALTEXT:
				setMagistraltext((TextType)null);
				return;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__GALENICFORM:
				setGalenicform((GalenicformType)null);
				return;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__QUANTITY:
				setQuantity((QuantityType)null);
				return;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__L:
				setL(L_EDEFAULT);
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
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__COMPOUND:
				return !getCompound().isEmpty();
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__FORMULARYREFERENCE:
				return getFormularyreference() != null;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__MAGISTRALTEXT:
				return getMagistraltext() != null;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__GALENICFORM:
				return getGalenicform() != null;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__QUANTITY:
				return getQuantity() != null;
			case KmehrPackage.COMPOUNDPRESCRIPTION_TYPE__L:
				return L_EDEFAULT == null ? l != null : !L_EDEFAULT.equals(l);
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
		result.append(", l: ");
		result.append(l);
		result.append(')');
		return result.toString();
	}

} //CompoundprescriptionTypeImpl
