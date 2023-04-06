/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDMEDICATION;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MedicationType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PackageType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PresentationType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RouteType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.StrengthType;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getInn <em>Inn</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getMagistral <em>Magistral</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getTradename <em>Tradename</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getBatch <em>Batch</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getNumberofpackage <em>Numberofpackage</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getQuantityperpackage <em>Quantityperpackage</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getInstructionforoverdosing <em>Instructionforoverdosing</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getInstructionforpatient <em>Instructionforpatient</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#getInstructionforreimbursement <em>Instructionforreimbursement</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.MedicationTypeImpl#isIssubstitutionallowed <em>Issubstitutionallowed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationTypeImpl extends MinimalEObjectImpl.Container implements MedicationType {
	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected CDMEDICATION cd;

	/**
	 * The cached value of the '{@link #getInn() <em>Inn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInn()
	 * @generated
	 * @ordered
	 */
	protected TextType inn;

	/**
	 * The cached value of the '{@link #getMagistral() <em>Magistral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagistral()
	 * @generated
	 * @ordered
	 */
	protected TextType magistral;

	/**
	 * The default value of the '{@link #getTradename() <em>Tradename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradename()
	 * @generated
	 * @ordered
	 */
	protected static final String TRADENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTradename() <em>Tradename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradename()
	 * @generated
	 * @ordered
	 */
	protected String tradename = TRADENAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected PresentationType presentation;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected StrengthType strength;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected RouteType route;

	/**
	 * The default value of the '{@link #getBatch() <em>Batch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatch()
	 * @generated
	 * @ordered
	 */
	protected static final String BATCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatch() <em>Batch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatch()
	 * @generated
	 * @ordered
	 */
	protected String batch = BATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberofpackage() <em>Numberofpackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberofpackage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal NUMBEROFPACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberofpackage() <em>Numberofpackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberofpackage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal numberofpackage = NUMBEROFPACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageType package_;

	/**
	 * The default value of the '{@link #getQuantityperpackage() <em>Quantityperpackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityperpackage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITYPERPACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityperpackage() <em>Quantityperpackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityperpackage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityperpackage = QUANTITYPERPACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstructionforoverdosing() <em>Instructionforoverdosing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionforoverdosing()
	 * @generated
	 * @ordered
	 */
	protected TextType instructionforoverdosing;

	/**
	 * The cached value of the '{@link #getInstructionforpatient() <em>Instructionforpatient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionforpatient()
	 * @generated
	 * @ordered
	 */
	protected TextType instructionforpatient;

	/**
	 * The cached value of the '{@link #getInstructionforreimbursement() <em>Instructionforreimbursement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionforreimbursement()
	 * @generated
	 * @ordered
	 */
	protected TextType instructionforreimbursement;

	/**
	 * The default value of the '{@link #isIssubstitutionallowed() <em>Issubstitutionallowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIssubstitutionallowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISSUBSTITUTIONALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIssubstitutionallowed() <em>Issubstitutionallowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIssubstitutionallowed()
	 * @generated
	 * @ordered
	 */
	protected boolean issubstitutionallowed = ISSUBSTITUTIONALLOWED_EDEFAULT;

	/**
	 * This is true if the Issubstitutionallowed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean issubstitutionallowedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.MEDICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CDMEDICATION getCd() {
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCd(CDMEDICATION newCd, NotificationChain msgs) {
		CDMEDICATION oldCd = cd;
		cd = newCd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__CD, oldCd, newCd);
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
	public void setCd(CDMEDICATION newCd) {
		if (newCd != cd) {
			NotificationChain msgs = null;
			if (cd != null)
				msgs = ((InternalEObject)cd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__CD, null, msgs);
			if (newCd != null)
				msgs = ((InternalEObject)newCd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__CD, null, msgs);
			msgs = basicSetCd(newCd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__CD, newCd, newCd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType getInn() {
		return inn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInn(TextType newInn, NotificationChain msgs) {
		TextType oldInn = inn;
		inn = newInn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__INN, oldInn, newInn);
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
	public void setInn(TextType newInn) {
		if (newInn != inn) {
			NotificationChain msgs = null;
			if (inn != null)
				msgs = ((InternalEObject)inn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__INN, null, msgs);
			if (newInn != null)
				msgs = ((InternalEObject)newInn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__INN, null, msgs);
			msgs = basicSetInn(newInn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__INN, newInn, newInn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType getMagistral() {
		return magistral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMagistral(TextType newMagistral, NotificationChain msgs) {
		TextType oldMagistral = magistral;
		magistral = newMagistral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__MAGISTRAL, oldMagistral, newMagistral);
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
	public void setMagistral(TextType newMagistral) {
		if (newMagistral != magistral) {
			NotificationChain msgs = null;
			if (magistral != null)
				msgs = ((InternalEObject)magistral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__MAGISTRAL, null, msgs);
			if (newMagistral != null)
				msgs = ((InternalEObject)newMagistral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__MAGISTRAL, null, msgs);
			msgs = basicSetMagistral(newMagistral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__MAGISTRAL, newMagistral, newMagistral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTradename() {
		return tradename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTradename(String newTradename) {
		String oldTradename = tradename;
		tradename = newTradename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__TRADENAME, oldTradename, tradename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PresentationType getPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentation(PresentationType newPresentation, NotificationChain msgs) {
		PresentationType oldPresentation = presentation;
		presentation = newPresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__PRESENTATION, oldPresentation, newPresentation);
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
	public void setPresentation(PresentationType newPresentation) {
		if (newPresentation != presentation) {
			NotificationChain msgs = null;
			if (presentation != null)
				msgs = ((InternalEObject)presentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__PRESENTATION, null, msgs);
			if (newPresentation != null)
				msgs = ((InternalEObject)newPresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__PRESENTATION, null, msgs);
			msgs = basicSetPresentation(newPresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__PRESENTATION, newPresentation, newPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrengthType getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrength(StrengthType newStrength, NotificationChain msgs) {
		StrengthType oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__STRENGTH, oldStrength, newStrength);
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
	public void setStrength(StrengthType newStrength) {
		if (newStrength != strength) {
			NotificationChain msgs = null;
			if (strength != null)
				msgs = ((InternalEObject)strength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__STRENGTH, null, msgs);
			if (newStrength != null)
				msgs = ((InternalEObject)newStrength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__STRENGTH, null, msgs);
			msgs = basicSetStrength(newStrength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__STRENGTH, newStrength, newStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouteType getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(RouteType newRoute, NotificationChain msgs) {
		RouteType oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__ROUTE, oldRoute, newRoute);
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
	public void setRoute(RouteType newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBatch() {
		return batch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatch(String newBatch) {
		String oldBatch = batch;
		batch = newBatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__BATCH, oldBatch, batch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getNumberofpackage() {
		return numberofpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberofpackage(BigDecimal newNumberofpackage) {
		BigDecimal oldNumberofpackage = numberofpackage;
		numberofpackage = newNumberofpackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__NUMBEROFPACKAGE, oldNumberofpackage, numberofpackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageType getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(PackageType newPackage, NotificationChain msgs) {
		PackageType oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__PACKAGE, oldPackage, newPackage);
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
	public void setPackage(PackageType newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__PACKAGE, null, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__PACKAGE, null, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityperpackage() {
		return quantityperpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityperpackage(BigDecimal newQuantityperpackage) {
		BigDecimal oldQuantityperpackage = quantityperpackage;
		quantityperpackage = newQuantityperpackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__QUANTITYPERPACKAGE, oldQuantityperpackage, quantityperpackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType getInstructionforoverdosing() {
		return instructionforoverdosing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstructionforoverdosing(TextType newInstructionforoverdosing, NotificationChain msgs) {
		TextType oldInstructionforoverdosing = instructionforoverdosing;
		instructionforoverdosing = newInstructionforoverdosing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFOROVERDOSING, oldInstructionforoverdosing, newInstructionforoverdosing);
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
	public void setInstructionforoverdosing(TextType newInstructionforoverdosing) {
		if (newInstructionforoverdosing != instructionforoverdosing) {
			NotificationChain msgs = null;
			if (instructionforoverdosing != null)
				msgs = ((InternalEObject)instructionforoverdosing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFOROVERDOSING, null, msgs);
			if (newInstructionforoverdosing != null)
				msgs = ((InternalEObject)newInstructionforoverdosing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFOROVERDOSING, null, msgs);
			msgs = basicSetInstructionforoverdosing(newInstructionforoverdosing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFOROVERDOSING, newInstructionforoverdosing, newInstructionforoverdosing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType getInstructionforpatient() {
		return instructionforpatient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstructionforpatient(TextType newInstructionforpatient, NotificationChain msgs) {
		TextType oldInstructionforpatient = instructionforpatient;
		instructionforpatient = newInstructionforpatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORPATIENT, oldInstructionforpatient, newInstructionforpatient);
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
	public void setInstructionforpatient(TextType newInstructionforpatient) {
		if (newInstructionforpatient != instructionforpatient) {
			NotificationChain msgs = null;
			if (instructionforpatient != null)
				msgs = ((InternalEObject)instructionforpatient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORPATIENT, null, msgs);
			if (newInstructionforpatient != null)
				msgs = ((InternalEObject)newInstructionforpatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORPATIENT, null, msgs);
			msgs = basicSetInstructionforpatient(newInstructionforpatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORPATIENT, newInstructionforpatient, newInstructionforpatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextType getInstructionforreimbursement() {
		return instructionforreimbursement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstructionforreimbursement(TextType newInstructionforreimbursement, NotificationChain msgs) {
		TextType oldInstructionforreimbursement = instructionforreimbursement;
		instructionforreimbursement = newInstructionforreimbursement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORREIMBURSEMENT, oldInstructionforreimbursement, newInstructionforreimbursement);
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
	public void setInstructionforreimbursement(TextType newInstructionforreimbursement) {
		if (newInstructionforreimbursement != instructionforreimbursement) {
			NotificationChain msgs = null;
			if (instructionforreimbursement != null)
				msgs = ((InternalEObject)instructionforreimbursement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORREIMBURSEMENT, null, msgs);
			if (newInstructionforreimbursement != null)
				msgs = ((InternalEObject)newInstructionforreimbursement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORREIMBURSEMENT, null, msgs);
			msgs = basicSetInstructionforreimbursement(newInstructionforreimbursement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORREIMBURSEMENT, newInstructionforreimbursement, newInstructionforreimbursement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIssubstitutionallowed() {
		return issubstitutionallowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssubstitutionallowed(boolean newIssubstitutionallowed) {
		boolean oldIssubstitutionallowed = issubstitutionallowed;
		issubstitutionallowed = newIssubstitutionallowed;
		boolean oldIssubstitutionallowedESet = issubstitutionallowedESet;
		issubstitutionallowedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.MEDICATION_TYPE__ISSUBSTITUTIONALLOWED, oldIssubstitutionallowed, issubstitutionallowed, !oldIssubstitutionallowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIssubstitutionallowed() {
		boolean oldIssubstitutionallowed = issubstitutionallowed;
		boolean oldIssubstitutionallowedESet = issubstitutionallowedESet;
		issubstitutionallowed = ISSUBSTITUTIONALLOWED_EDEFAULT;
		issubstitutionallowedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KmehrPackage.MEDICATION_TYPE__ISSUBSTITUTIONALLOWED, oldIssubstitutionallowed, ISSUBSTITUTIONALLOWED_EDEFAULT, oldIssubstitutionallowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIssubstitutionallowed() {
		return issubstitutionallowedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.MEDICATION_TYPE__CD:
				return basicSetCd(null, msgs);
			case KmehrPackage.MEDICATION_TYPE__INN:
				return basicSetInn(null, msgs);
			case KmehrPackage.MEDICATION_TYPE__MAGISTRAL:
				return basicSetMagistral(null, msgs);
			case KmehrPackage.MEDICATION_TYPE__PRESENTATION:
				return basicSetPresentation(null, msgs);
			case KmehrPackage.MEDICATION_TYPE__STRENGTH:
				return basicSetStrength(null, msgs);
			case KmehrPackage.MEDICATION_TYPE__ROUTE:
				return basicSetRoute(null, msgs);
			case KmehrPackage.MEDICATION_TYPE__PACKAGE:
				return basicSetPackage(null, msgs);
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFOROVERDOSING:
				return basicSetInstructionforoverdosing(null, msgs);
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORPATIENT:
				return basicSetInstructionforpatient(null, msgs);
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORREIMBURSEMENT:
				return basicSetInstructionforreimbursement(null, msgs);
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
			case KmehrPackage.MEDICATION_TYPE__CD:
				return getCd();
			case KmehrPackage.MEDICATION_TYPE__INN:
				return getInn();
			case KmehrPackage.MEDICATION_TYPE__MAGISTRAL:
				return getMagistral();
			case KmehrPackage.MEDICATION_TYPE__TRADENAME:
				return getTradename();
			case KmehrPackage.MEDICATION_TYPE__PRESENTATION:
				return getPresentation();
			case KmehrPackage.MEDICATION_TYPE__STRENGTH:
				return getStrength();
			case KmehrPackage.MEDICATION_TYPE__ROUTE:
				return getRoute();
			case KmehrPackage.MEDICATION_TYPE__BATCH:
				return getBatch();
			case KmehrPackage.MEDICATION_TYPE__NUMBEROFPACKAGE:
				return getNumberofpackage();
			case KmehrPackage.MEDICATION_TYPE__PACKAGE:
				return getPackage();
			case KmehrPackage.MEDICATION_TYPE__QUANTITYPERPACKAGE:
				return getQuantityperpackage();
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFOROVERDOSING:
				return getInstructionforoverdosing();
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORPATIENT:
				return getInstructionforpatient();
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORREIMBURSEMENT:
				return getInstructionforreimbursement();
			case KmehrPackage.MEDICATION_TYPE__ISSUBSTITUTIONALLOWED:
				return isIssubstitutionallowed();
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
			case KmehrPackage.MEDICATION_TYPE__CD:
				setCd((CDMEDICATION)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__INN:
				setInn((TextType)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__MAGISTRAL:
				setMagistral((TextType)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__TRADENAME:
				setTradename((String)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__PRESENTATION:
				setPresentation((PresentationType)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__STRENGTH:
				setStrength((StrengthType)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__ROUTE:
				setRoute((RouteType)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__BATCH:
				setBatch((String)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__NUMBEROFPACKAGE:
				setNumberofpackage((BigDecimal)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__PACKAGE:
				setPackage((PackageType)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__QUANTITYPERPACKAGE:
				setQuantityperpackage((BigDecimal)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFOROVERDOSING:
				setInstructionforoverdosing((TextType)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORPATIENT:
				setInstructionforpatient((TextType)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORREIMBURSEMENT:
				setInstructionforreimbursement((TextType)newValue);
				return;
			case KmehrPackage.MEDICATION_TYPE__ISSUBSTITUTIONALLOWED:
				setIssubstitutionallowed((Boolean)newValue);
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
			case KmehrPackage.MEDICATION_TYPE__CD:
				setCd((CDMEDICATION)null);
				return;
			case KmehrPackage.MEDICATION_TYPE__INN:
				setInn((TextType)null);
				return;
			case KmehrPackage.MEDICATION_TYPE__MAGISTRAL:
				setMagistral((TextType)null);
				return;
			case KmehrPackage.MEDICATION_TYPE__TRADENAME:
				setTradename(TRADENAME_EDEFAULT);
				return;
			case KmehrPackage.MEDICATION_TYPE__PRESENTATION:
				setPresentation((PresentationType)null);
				return;
			case KmehrPackage.MEDICATION_TYPE__STRENGTH:
				setStrength((StrengthType)null);
				return;
			case KmehrPackage.MEDICATION_TYPE__ROUTE:
				setRoute((RouteType)null);
				return;
			case KmehrPackage.MEDICATION_TYPE__BATCH:
				setBatch(BATCH_EDEFAULT);
				return;
			case KmehrPackage.MEDICATION_TYPE__NUMBEROFPACKAGE:
				setNumberofpackage(NUMBEROFPACKAGE_EDEFAULT);
				return;
			case KmehrPackage.MEDICATION_TYPE__PACKAGE:
				setPackage((PackageType)null);
				return;
			case KmehrPackage.MEDICATION_TYPE__QUANTITYPERPACKAGE:
				setQuantityperpackage(QUANTITYPERPACKAGE_EDEFAULT);
				return;
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFOROVERDOSING:
				setInstructionforoverdosing((TextType)null);
				return;
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORPATIENT:
				setInstructionforpatient((TextType)null);
				return;
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORREIMBURSEMENT:
				setInstructionforreimbursement((TextType)null);
				return;
			case KmehrPackage.MEDICATION_TYPE__ISSUBSTITUTIONALLOWED:
				unsetIssubstitutionallowed();
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
			case KmehrPackage.MEDICATION_TYPE__CD:
				return cd != null;
			case KmehrPackage.MEDICATION_TYPE__INN:
				return inn != null;
			case KmehrPackage.MEDICATION_TYPE__MAGISTRAL:
				return magistral != null;
			case KmehrPackage.MEDICATION_TYPE__TRADENAME:
				return TRADENAME_EDEFAULT == null ? tradename != null : !TRADENAME_EDEFAULT.equals(tradename);
			case KmehrPackage.MEDICATION_TYPE__PRESENTATION:
				return presentation != null;
			case KmehrPackage.MEDICATION_TYPE__STRENGTH:
				return strength != null;
			case KmehrPackage.MEDICATION_TYPE__ROUTE:
				return route != null;
			case KmehrPackage.MEDICATION_TYPE__BATCH:
				return BATCH_EDEFAULT == null ? batch != null : !BATCH_EDEFAULT.equals(batch);
			case KmehrPackage.MEDICATION_TYPE__NUMBEROFPACKAGE:
				return NUMBEROFPACKAGE_EDEFAULT == null ? numberofpackage != null : !NUMBEROFPACKAGE_EDEFAULT.equals(numberofpackage);
			case KmehrPackage.MEDICATION_TYPE__PACKAGE:
				return package_ != null;
			case KmehrPackage.MEDICATION_TYPE__QUANTITYPERPACKAGE:
				return QUANTITYPERPACKAGE_EDEFAULT == null ? quantityperpackage != null : !QUANTITYPERPACKAGE_EDEFAULT.equals(quantityperpackage);
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFOROVERDOSING:
				return instructionforoverdosing != null;
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORPATIENT:
				return instructionforpatient != null;
			case KmehrPackage.MEDICATION_TYPE__INSTRUCTIONFORREIMBURSEMENT:
				return instructionforreimbursement != null;
			case KmehrPackage.MEDICATION_TYPE__ISSUBSTITUTIONALLOWED:
				return isSetIssubstitutionallowed();
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
		result.append(" (tradename: ");
		result.append(tradename);
		result.append(", batch: ");
		result.append(batch);
		result.append(", numberofpackage: ");
		result.append(numberofpackage);
		result.append(", quantityperpackage: ");
		result.append(quantityperpackage);
		result.append(", issubstitutionallowed: ");
		if (issubstitutionallowedESet) result.append(issubstitutionallowed); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MedicationTypeImpl
