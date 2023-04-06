/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.CompoundType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicinalProductType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityprefixType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SubstanceType;

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
 * An implementation of the model object '<em><b>Compound Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundTypeImpl#getMedicinalproduct <em>Medicinalproduct</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundTypeImpl#getSubstance <em>Substance</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundTypeImpl#getQuantityprefix <em>Quantityprefix</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.CompoundTypeImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundTypeImpl extends MinimalEObjectImpl.Container implements CompoundType {
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
	 * The cached value of the '{@link #getMedicinalproduct() <em>Medicinalproduct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicinalproduct()
	 * @generated
	 * @ordered
	 */
	protected MedicinalProductType medicinalproduct;

	/**
	 * The cached value of the '{@link #getSubstance() <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstance()
	 * @generated
	 * @ordered
	 */
	protected SubstanceType substance;

	/**
	 * The cached value of the '{@link #getQuantityprefix() <em>Quantityprefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityprefix()
	 * @generated
	 * @ordered
	 */
	protected QuantityprefixType quantityprefix;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected QuantityType quantity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.COMPOUND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDKMEHR> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<IDKMEHR>(IDKMEHR.class, this, KmehrPackage.COMPOUND_TYPE__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicinalProductType getMedicinalproduct() {
		return medicinalproduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicinalproduct(MedicinalProductType newMedicinalproduct, NotificationChain msgs) {
		MedicinalProductType oldMedicinalproduct = medicinalproduct;
		medicinalproduct = newMedicinalproduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.COMPOUND_TYPE__MEDICINALPRODUCT, oldMedicinalproduct, newMedicinalproduct);
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
	public void setMedicinalproduct(MedicinalProductType newMedicinalproduct) {
		if (newMedicinalproduct != medicinalproduct) {
			NotificationChain msgs = null;
			if (medicinalproduct != null)
				msgs = ((InternalEObject)medicinalproduct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.COMPOUND_TYPE__MEDICINALPRODUCT, null, msgs);
			if (newMedicinalproduct != null)
				msgs = ((InternalEObject)newMedicinalproduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.COMPOUND_TYPE__MEDICINALPRODUCT, null, msgs);
			msgs = basicSetMedicinalproduct(newMedicinalproduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.COMPOUND_TYPE__MEDICINALPRODUCT, newMedicinalproduct, newMedicinalproduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceType getSubstance() {
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstance(SubstanceType newSubstance, NotificationChain msgs) {
		SubstanceType oldSubstance = substance;
		substance = newSubstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.COMPOUND_TYPE__SUBSTANCE, oldSubstance, newSubstance);
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
	public void setSubstance(SubstanceType newSubstance) {
		if (newSubstance != substance) {
			NotificationChain msgs = null;
			if (substance != null)
				msgs = ((InternalEObject)substance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.COMPOUND_TYPE__SUBSTANCE, null, msgs);
			if (newSubstance != null)
				msgs = ((InternalEObject)newSubstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.COMPOUND_TYPE__SUBSTANCE, null, msgs);
			msgs = basicSetSubstance(newSubstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.COMPOUND_TYPE__SUBSTANCE, newSubstance, newSubstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityprefixType getQuantityprefix() {
		return quantityprefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantityprefix(QuantityprefixType newQuantityprefix, NotificationChain msgs) {
		QuantityprefixType oldQuantityprefix = quantityprefix;
		quantityprefix = newQuantityprefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.COMPOUND_TYPE__QUANTITYPREFIX, oldQuantityprefix, newQuantityprefix);
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
	public void setQuantityprefix(QuantityprefixType newQuantityprefix) {
		if (newQuantityprefix != quantityprefix) {
			NotificationChain msgs = null;
			if (quantityprefix != null)
				msgs = ((InternalEObject)quantityprefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.COMPOUND_TYPE__QUANTITYPREFIX, null, msgs);
			if (newQuantityprefix != null)
				msgs = ((InternalEObject)newQuantityprefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.COMPOUND_TYPE__QUANTITYPREFIX, null, msgs);
			msgs = basicSetQuantityprefix(newQuantityprefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.COMPOUND_TYPE__QUANTITYPREFIX, newQuantityprefix, newQuantityprefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityType getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(QuantityType newQuantity, NotificationChain msgs) {
		QuantityType oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.COMPOUND_TYPE__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(QuantityType newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.COMPOUND_TYPE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.COMPOUND_TYPE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.COMPOUND_TYPE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.COMPOUND_TYPE__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case KmehrPackage.COMPOUND_TYPE__MEDICINALPRODUCT:
				return basicSetMedicinalproduct(null, msgs);
			case KmehrPackage.COMPOUND_TYPE__SUBSTANCE:
				return basicSetSubstance(null, msgs);
			case KmehrPackage.COMPOUND_TYPE__QUANTITYPREFIX:
				return basicSetQuantityprefix(null, msgs);
			case KmehrPackage.COMPOUND_TYPE__QUANTITY:
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
			case KmehrPackage.COMPOUND_TYPE__ID:
				return getId();
			case KmehrPackage.COMPOUND_TYPE__MEDICINALPRODUCT:
				return getMedicinalproduct();
			case KmehrPackage.COMPOUND_TYPE__SUBSTANCE:
				return getSubstance();
			case KmehrPackage.COMPOUND_TYPE__QUANTITYPREFIX:
				return getQuantityprefix();
			case KmehrPackage.COMPOUND_TYPE__QUANTITY:
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
			case KmehrPackage.COMPOUND_TYPE__ID:
				getId().clear();
				getId().addAll((Collection<? extends IDKMEHR>)newValue);
				return;
			case KmehrPackage.COMPOUND_TYPE__MEDICINALPRODUCT:
				setMedicinalproduct((MedicinalProductType)newValue);
				return;
			case KmehrPackage.COMPOUND_TYPE__SUBSTANCE:
				setSubstance((SubstanceType)newValue);
				return;
			case KmehrPackage.COMPOUND_TYPE__QUANTITYPREFIX:
				setQuantityprefix((QuantityprefixType)newValue);
				return;
			case KmehrPackage.COMPOUND_TYPE__QUANTITY:
				setQuantity((QuantityType)newValue);
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
			case KmehrPackage.COMPOUND_TYPE__ID:
				getId().clear();
				return;
			case KmehrPackage.COMPOUND_TYPE__MEDICINALPRODUCT:
				setMedicinalproduct((MedicinalProductType)null);
				return;
			case KmehrPackage.COMPOUND_TYPE__SUBSTANCE:
				setSubstance((SubstanceType)null);
				return;
			case KmehrPackage.COMPOUND_TYPE__QUANTITYPREFIX:
				setQuantityprefix((QuantityprefixType)null);
				return;
			case KmehrPackage.COMPOUND_TYPE__QUANTITY:
				setQuantity((QuantityType)null);
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
			case KmehrPackage.COMPOUND_TYPE__ID:
				return id != null && !id.isEmpty();
			case KmehrPackage.COMPOUND_TYPE__MEDICINALPRODUCT:
				return medicinalproduct != null;
			case KmehrPackage.COMPOUND_TYPE__SUBSTANCE:
				return substance != null;
			case KmehrPackage.COMPOUND_TYPE__QUANTITYPREFIX:
				return quantityprefix != null;
			case KmehrPackage.COMPOUND_TYPE__QUANTITY:
				return quantity != null;
		}
		return super.eIsSet(featureID);
	}

} //CompoundTypeImpl
