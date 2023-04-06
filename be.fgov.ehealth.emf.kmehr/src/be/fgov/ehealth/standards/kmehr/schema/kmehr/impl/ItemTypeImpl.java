/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.impl;

import be.fgov.ehealth.standards.kmehr.cd.cd.CDITEM;
import be.fgov.ehealth.standards.kmehr.cd.cd.LnkType;

import be.fgov.ehealth.standards.kmehr.dt.dt.TextType;

import be.fgov.ehealth.standards.kmehr.id.id.IDKMEHR;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.AuthorType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.CertaintyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ConfidentialityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ContentType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.CostType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.DayperiodType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.DurationType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.FeedbackType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.FrequencyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.ItemType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.LifecycleType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.LocalitemattributeType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.MomentType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.PosologyType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.QuantityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RegimenType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RenewalType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.RouteType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SeverityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.SiteType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.StrengthType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.TemporalityType;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.UrgencyType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getContent <em>Content</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getBeginmoment <em>Beginmoment</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getEndmoment <em>Endmoment</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#isIscomplete <em>Iscomplete</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#isIsvalidated <em>Isvalidated</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#isIsrelevant <em>Isrelevant</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getCertainty <em>Certainty</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getTemporality <em>Temporality</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getUrgency <em>Urgency</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getSite <em>Site</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getDayperiod <em>Dayperiod</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getPosology <em>Posology</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getRegimen <em>Regimen</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getDeliverydate <em>Deliverydate</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getRenewal <em>Renewal</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getBatch <em>Batch</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getInstructionforoverdosing <em>Instructionforoverdosing</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getInstructionforpatient <em>Instructionforpatient</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getInstructionforreimbursement <em>Instructionforreimbursement</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#isIssubstitutionallowed <em>Issubstitutionallowed</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getRecorddatetime <em>Recorddatetime</em>}</li>
 *   <li>{@link be.fgov.ehealth.standards.kmehr.schema.kmehr.impl.ItemTypeImpl#getLnk <em>Lnk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemTypeImpl extends MinimalEObjectImpl.Container implements ItemType {
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
	protected EList<CDITEM> cd;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentType> content;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> text;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected AuthorType author;

	/**
	 * The cached value of the '{@link #getBeginmoment() <em>Beginmoment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginmoment()
	 * @generated
	 * @ordered
	 */
	protected MomentType beginmoment;

	/**
	 * The cached value of the '{@link #getEndmoment() <em>Endmoment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndmoment()
	 * @generated
	 * @ordered
	 */
	protected MomentType endmoment;

	/**
	 * The default value of the '{@link #isIscomplete() <em>Iscomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIscomplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISCOMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIscomplete() <em>Iscomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIscomplete()
	 * @generated
	 * @ordered
	 */
	protected boolean iscomplete = ISCOMPLETE_EDEFAULT;

	/**
	 * This is true if the Iscomplete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iscompleteESet;

	/**
	 * The default value of the '{@link #isIsvalidated() <em>Isvalidated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsvalidated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISVALIDATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsvalidated() <em>Isvalidated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsvalidated()
	 * @generated
	 * @ordered
	 */
	protected boolean isvalidated = ISVALIDATED_EDEFAULT;

	/**
	 * This is true if the Isvalidated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isvalidatedESet;

	/**
	 * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle()
	 * @generated
	 * @ordered
	 */
	protected LifecycleType lifecycle;

	/**
	 * The default value of the '{@link #isIsrelevant() <em>Isrelevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsrelevant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISRELEVANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsrelevant() <em>Isrelevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsrelevant()
	 * @generated
	 * @ordered
	 */
	protected boolean isrelevant = ISRELEVANT_EDEFAULT;

	/**
	 * This is true if the Isrelevant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isrelevantESet;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected SeverityType severity;

	/**
	 * The cached value of the '{@link #getCertainty() <em>Certainty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertainty()
	 * @generated
	 * @ordered
	 */
	protected CertaintyType certainty;

	/**
	 * The cached value of the '{@link #getTemporality() <em>Temporality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporality()
	 * @generated
	 * @ordered
	 */
	protected TemporalityType temporality;

	/**
	 * The cached value of the '{@link #getUrgency() <em>Urgency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrgency()
	 * @generated
	 * @ordered
	 */
	protected UrgencyType urgency;

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
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected StrengthType strength;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected FrequencyType frequency;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected EList<SiteType> site;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected CostType cost;

	/**
	 * The cached value of the '{@link #getDayperiod() <em>Dayperiod</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayperiod()
	 * @generated
	 * @ordered
	 */
	protected EList<DayperiodType> dayperiod;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected DurationType duration;

	/**
	 * The cached value of the '{@link #getPosology() <em>Posology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosology()
	 * @generated
	 * @ordered
	 */
	protected PosologyType posology;

	/**
	 * The cached value of the '{@link #getRegimen() <em>Regimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegimen()
	 * @generated
	 * @ordered
	 */
	protected RegimenType regimen;

	/**
	 * The default value of the '{@link #getDeliverydate() <em>Deliverydate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverydate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DELIVERYDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliverydate() <em>Deliverydate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverydate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar deliverydate = DELIVERYDATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRenewal() <em>Renewal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenewal()
	 * @generated
	 * @ordered
	 */
	protected RenewalType renewal;

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
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected FeedbackType feedback;

	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalitemattributeType> local;

	/**
	 * The default value of the '{@link #getRecorddatetime() <em>Recorddatetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorddatetime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RECORDDATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecorddatetime() <em>Recorddatetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorddatetime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar recorddatetime = RECORDDATETIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLnk() <em>Lnk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnk()
	 * @generated
	 * @ordered
	 */
	protected EList<LnkType> lnk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KmehrPackage.Literals.ITEM_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__CONFIDENTIALITY, oldConfidentiality, newConfidentiality);
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
				msgs = ((InternalEObject)confidentiality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__CONFIDENTIALITY, null, msgs);
			if (newConfidentiality != null)
				msgs = ((InternalEObject)newConfidentiality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__CONFIDENTIALITY, null, msgs);
			msgs = basicSetConfidentiality(newConfidentiality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__CONFIDENTIALITY, newConfidentiality, newConfidentiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IDKMEHR> getId() {
		if (id == null) {
			id = new EObjectContainmentEList<IDKMEHR>(IDKMEHR.class, this, KmehrPackage.ITEM_TYPE__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CDITEM> getCd() {
		if (cd == null) {
			cd = new EObjectContainmentEList<CDITEM>(CDITEM.class, this, KmehrPackage.ITEM_TYPE__CD);
		}
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentType> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<ContentType>(ContentType.class, this, KmehrPackage.ITEM_TYPE__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextType> getText() {
		if (text == null) {
			text = new EObjectContainmentEList<TextType>(TextType.class, this, KmehrPackage.ITEM_TYPE__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorType getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(AuthorType newAuthor, NotificationChain msgs) {
		AuthorType oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__AUTHOR, oldAuthor, newAuthor);
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
	public void setAuthor(AuthorType newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MomentType getBeginmoment() {
		return beginmoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeginmoment(MomentType newBeginmoment, NotificationChain msgs) {
		MomentType oldBeginmoment = beginmoment;
		beginmoment = newBeginmoment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__BEGINMOMENT, oldBeginmoment, newBeginmoment);
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
	public void setBeginmoment(MomentType newBeginmoment) {
		if (newBeginmoment != beginmoment) {
			NotificationChain msgs = null;
			if (beginmoment != null)
				msgs = ((InternalEObject)beginmoment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__BEGINMOMENT, null, msgs);
			if (newBeginmoment != null)
				msgs = ((InternalEObject)newBeginmoment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__BEGINMOMENT, null, msgs);
			msgs = basicSetBeginmoment(newBeginmoment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__BEGINMOMENT, newBeginmoment, newBeginmoment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MomentType getEndmoment() {
		return endmoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndmoment(MomentType newEndmoment, NotificationChain msgs) {
		MomentType oldEndmoment = endmoment;
		endmoment = newEndmoment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__ENDMOMENT, oldEndmoment, newEndmoment);
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
	public void setEndmoment(MomentType newEndmoment) {
		if (newEndmoment != endmoment) {
			NotificationChain msgs = null;
			if (endmoment != null)
				msgs = ((InternalEObject)endmoment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__ENDMOMENT, null, msgs);
			if (newEndmoment != null)
				msgs = ((InternalEObject)newEndmoment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__ENDMOMENT, null, msgs);
			msgs = basicSetEndmoment(newEndmoment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__ENDMOMENT, newEndmoment, newEndmoment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIscomplete() {
		return iscomplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIscomplete(boolean newIscomplete) {
		boolean oldIscomplete = iscomplete;
		iscomplete = newIscomplete;
		boolean oldIscompleteESet = iscompleteESet;
		iscompleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__ISCOMPLETE, oldIscomplete, iscomplete, !oldIscompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIscomplete() {
		boolean oldIscomplete = iscomplete;
		boolean oldIscompleteESet = iscompleteESet;
		iscomplete = ISCOMPLETE_EDEFAULT;
		iscompleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KmehrPackage.ITEM_TYPE__ISCOMPLETE, oldIscomplete, ISCOMPLETE_EDEFAULT, oldIscompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIscomplete() {
		return iscompleteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsvalidated() {
		return isvalidated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsvalidated(boolean newIsvalidated) {
		boolean oldIsvalidated = isvalidated;
		isvalidated = newIsvalidated;
		boolean oldIsvalidatedESet = isvalidatedESet;
		isvalidatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__ISVALIDATED, oldIsvalidated, isvalidated, !oldIsvalidatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsvalidated() {
		boolean oldIsvalidated = isvalidated;
		boolean oldIsvalidatedESet = isvalidatedESet;
		isvalidated = ISVALIDATED_EDEFAULT;
		isvalidatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KmehrPackage.ITEM_TYPE__ISVALIDATED, oldIsvalidated, ISVALIDATED_EDEFAULT, oldIsvalidatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsvalidated() {
		return isvalidatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifecycleType getLifecycle() {
		return lifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifecycle(LifecycleType newLifecycle, NotificationChain msgs) {
		LifecycleType oldLifecycle = lifecycle;
		lifecycle = newLifecycle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__LIFECYCLE, oldLifecycle, newLifecycle);
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
	public void setLifecycle(LifecycleType newLifecycle) {
		if (newLifecycle != lifecycle) {
			NotificationChain msgs = null;
			if (lifecycle != null)
				msgs = ((InternalEObject)lifecycle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__LIFECYCLE, null, msgs);
			if (newLifecycle != null)
				msgs = ((InternalEObject)newLifecycle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__LIFECYCLE, null, msgs);
			msgs = basicSetLifecycle(newLifecycle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__LIFECYCLE, newLifecycle, newLifecycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsrelevant() {
		return isrelevant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsrelevant(boolean newIsrelevant) {
		boolean oldIsrelevant = isrelevant;
		isrelevant = newIsrelevant;
		boolean oldIsrelevantESet = isrelevantESet;
		isrelevantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__ISRELEVANT, oldIsrelevant, isrelevant, !oldIsrelevantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsrelevant() {
		boolean oldIsrelevant = isrelevant;
		boolean oldIsrelevantESet = isrelevantESet;
		isrelevant = ISRELEVANT_EDEFAULT;
		isrelevantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KmehrPackage.ITEM_TYPE__ISRELEVANT, oldIsrelevant, ISRELEVANT_EDEFAULT, oldIsrelevantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsrelevant() {
		return isrelevantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityType getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(SeverityType newSeverity, NotificationChain msgs) {
		SeverityType oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__SEVERITY, oldSeverity, newSeverity);
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
	public void setSeverity(SeverityType newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertaintyType getCertainty() {
		return certainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCertainty(CertaintyType newCertainty, NotificationChain msgs) {
		CertaintyType oldCertainty = certainty;
		certainty = newCertainty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__CERTAINTY, oldCertainty, newCertainty);
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
	public void setCertainty(CertaintyType newCertainty) {
		if (newCertainty != certainty) {
			NotificationChain msgs = null;
			if (certainty != null)
				msgs = ((InternalEObject)certainty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__CERTAINTY, null, msgs);
			if (newCertainty != null)
				msgs = ((InternalEObject)newCertainty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__CERTAINTY, null, msgs);
			msgs = basicSetCertainty(newCertainty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__CERTAINTY, newCertainty, newCertainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalityType getTemporality() {
		return temporality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporality(TemporalityType newTemporality, NotificationChain msgs) {
		TemporalityType oldTemporality = temporality;
		temporality = newTemporality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__TEMPORALITY, oldTemporality, newTemporality);
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
	public void setTemporality(TemporalityType newTemporality) {
		if (newTemporality != temporality) {
			NotificationChain msgs = null;
			if (temporality != null)
				msgs = ((InternalEObject)temporality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__TEMPORALITY, null, msgs);
			if (newTemporality != null)
				msgs = ((InternalEObject)newTemporality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__TEMPORALITY, null, msgs);
			msgs = basicSetTemporality(newTemporality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__TEMPORALITY, newTemporality, newTemporality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UrgencyType getUrgency() {
		return urgency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrgency(UrgencyType newUrgency, NotificationChain msgs) {
		UrgencyType oldUrgency = urgency;
		urgency = newUrgency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__URGENCY, oldUrgency, newUrgency);
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
	public void setUrgency(UrgencyType newUrgency) {
		if (newUrgency != urgency) {
			NotificationChain msgs = null;
			if (urgency != null)
				msgs = ((InternalEObject)urgency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__URGENCY, null, msgs);
			if (newUrgency != null)
				msgs = ((InternalEObject)newUrgency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__URGENCY, null, msgs);
			msgs = basicSetUrgency(newUrgency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__URGENCY, newUrgency, newUrgency));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__QUANTITY, newQuantity, newQuantity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__STRENGTH, oldStrength, newStrength);
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
				msgs = ((InternalEObject)strength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__STRENGTH, null, msgs);
			if (newStrength != null)
				msgs = ((InternalEObject)newStrength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__STRENGTH, null, msgs);
			msgs = basicSetStrength(newStrength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__STRENGTH, newStrength, newStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrequencyType getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequency(FrequencyType newFrequency, NotificationChain msgs) {
		FrequencyType oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__FREQUENCY, oldFrequency, newFrequency);
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
	public void setFrequency(FrequencyType newFrequency) {
		if (newFrequency != frequency) {
			NotificationChain msgs = null;
			if (frequency != null)
				msgs = ((InternalEObject)frequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__FREQUENCY, null, msgs);
			if (newFrequency != null)
				msgs = ((InternalEObject)newFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__FREQUENCY, null, msgs);
			msgs = basicSetFrequency(newFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__FREQUENCY, newFrequency, newFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SiteType> getSite() {
		if (site == null) {
			site = new EObjectContainmentEList<SiteType>(SiteType.class, this, KmehrPackage.ITEM_TYPE__SITE);
		}
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostType getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCost(CostType newCost, NotificationChain msgs) {
		CostType oldCost = cost;
		cost = newCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__COST, oldCost, newCost);
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
	public void setCost(CostType newCost) {
		if (newCost != cost) {
			NotificationChain msgs = null;
			if (cost != null)
				msgs = ((InternalEObject)cost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__COST, null, msgs);
			if (newCost != null)
				msgs = ((InternalEObject)newCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__COST, null, msgs);
			msgs = basicSetCost(newCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__COST, newCost, newCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DayperiodType> getDayperiod() {
		if (dayperiod == null) {
			dayperiod = new EObjectContainmentEList<DayperiodType>(DayperiodType.class, this, KmehrPackage.ITEM_TYPE__DAYPERIOD);
		}
		return dayperiod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DurationType getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(DurationType newDuration, NotificationChain msgs) {
		DurationType oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__DURATION, oldDuration, newDuration);
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
	public void setDuration(DurationType newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PosologyType getPosology() {
		return posology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosology(PosologyType newPosology, NotificationChain msgs) {
		PosologyType oldPosology = posology;
		posology = newPosology;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__POSOLOGY, oldPosology, newPosology);
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
	public void setPosology(PosologyType newPosology) {
		if (newPosology != posology) {
			NotificationChain msgs = null;
			if (posology != null)
				msgs = ((InternalEObject)posology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__POSOLOGY, null, msgs);
			if (newPosology != null)
				msgs = ((InternalEObject)newPosology).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__POSOLOGY, null, msgs);
			msgs = basicSetPosology(newPosology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__POSOLOGY, newPosology, newPosology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegimenType getRegimen() {
		return regimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegimen(RegimenType newRegimen, NotificationChain msgs) {
		RegimenType oldRegimen = regimen;
		regimen = newRegimen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__REGIMEN, oldRegimen, newRegimen);
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
	public void setRegimen(RegimenType newRegimen) {
		if (newRegimen != regimen) {
			NotificationChain msgs = null;
			if (regimen != null)
				msgs = ((InternalEObject)regimen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__REGIMEN, null, msgs);
			if (newRegimen != null)
				msgs = ((InternalEObject)newRegimen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__REGIMEN, null, msgs);
			msgs = basicSetRegimen(newRegimen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__REGIMEN, newRegimen, newRegimen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDeliverydate() {
		return deliverydate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliverydate(XMLGregorianCalendar newDeliverydate) {
		XMLGregorianCalendar oldDeliverydate = deliverydate;
		deliverydate = newDeliverydate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__DELIVERYDATE, oldDeliverydate, deliverydate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenewalType getRenewal() {
		return renewal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRenewal(RenewalType newRenewal, NotificationChain msgs) {
		RenewalType oldRenewal = renewal;
		renewal = newRenewal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__RENEWAL, oldRenewal, newRenewal);
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
	public void setRenewal(RenewalType newRenewal) {
		if (newRenewal != renewal) {
			NotificationChain msgs = null;
			if (renewal != null)
				msgs = ((InternalEObject)renewal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__RENEWAL, null, msgs);
			if (newRenewal != null)
				msgs = ((InternalEObject)newRenewal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__RENEWAL, null, msgs);
			msgs = basicSetRenewal(newRenewal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__RENEWAL, newRenewal, newRenewal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__ROUTE, oldRoute, newRoute);
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
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__ROUTE, newRoute, newRoute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__BATCH, oldBatch, batch));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__INSTRUCTIONFOROVERDOSING, oldInstructionforoverdosing, newInstructionforoverdosing);
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
				msgs = ((InternalEObject)instructionforoverdosing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__INSTRUCTIONFOROVERDOSING, null, msgs);
			if (newInstructionforoverdosing != null)
				msgs = ((InternalEObject)newInstructionforoverdosing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__INSTRUCTIONFOROVERDOSING, null, msgs);
			msgs = basicSetInstructionforoverdosing(newInstructionforoverdosing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__INSTRUCTIONFOROVERDOSING, newInstructionforoverdosing, newInstructionforoverdosing));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__INSTRUCTIONFORPATIENT, oldInstructionforpatient, newInstructionforpatient);
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
				msgs = ((InternalEObject)instructionforpatient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__INSTRUCTIONFORPATIENT, null, msgs);
			if (newInstructionforpatient != null)
				msgs = ((InternalEObject)newInstructionforpatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__INSTRUCTIONFORPATIENT, null, msgs);
			msgs = basicSetInstructionforpatient(newInstructionforpatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__INSTRUCTIONFORPATIENT, newInstructionforpatient, newInstructionforpatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__INSTRUCTIONFORREIMBURSEMENT, oldInstructionforreimbursement, newInstructionforreimbursement);
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
				msgs = ((InternalEObject)instructionforreimbursement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__INSTRUCTIONFORREIMBURSEMENT, null, msgs);
			if (newInstructionforreimbursement != null)
				msgs = ((InternalEObject)newInstructionforreimbursement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__INSTRUCTIONFORREIMBURSEMENT, null, msgs);
			msgs = basicSetInstructionforreimbursement(newInstructionforreimbursement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__INSTRUCTIONFORREIMBURSEMENT, newInstructionforreimbursement, newInstructionforreimbursement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__ISSUBSTITUTIONALLOWED, oldIssubstitutionallowed, issubstitutionallowed, !oldIssubstitutionallowedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KmehrPackage.ITEM_TYPE__ISSUBSTITUTIONALLOWED, oldIssubstitutionallowed, ISSUBSTITUTIONALLOWED_EDEFAULT, oldIssubstitutionallowedESet));
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
	public FeedbackType getFeedback() {
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeedback(FeedbackType newFeedback, NotificationChain msgs) {
		FeedbackType oldFeedback = feedback;
		feedback = newFeedback;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__FEEDBACK, oldFeedback, newFeedback);
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
	public void setFeedback(FeedbackType newFeedback) {
		if (newFeedback != feedback) {
			NotificationChain msgs = null;
			if (feedback != null)
				msgs = ((InternalEObject)feedback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__FEEDBACK, null, msgs);
			if (newFeedback != null)
				msgs = ((InternalEObject)newFeedback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KmehrPackage.ITEM_TYPE__FEEDBACK, null, msgs);
			msgs = basicSetFeedback(newFeedback, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__FEEDBACK, newFeedback, newFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalitemattributeType> getLocal() {
		if (local == null) {
			local = new EObjectContainmentEList<LocalitemattributeType>(LocalitemattributeType.class, this, KmehrPackage.ITEM_TYPE__LOCAL);
		}
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getRecorddatetime() {
		return recorddatetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecorddatetime(XMLGregorianCalendar newRecorddatetime) {
		XMLGregorianCalendar oldRecorddatetime = recorddatetime;
		recorddatetime = newRecorddatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KmehrPackage.ITEM_TYPE__RECORDDATETIME, oldRecorddatetime, recorddatetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LnkType> getLnk() {
		if (lnk == null) {
			lnk = new EObjectContainmentEList<LnkType>(LnkType.class, this, KmehrPackage.ITEM_TYPE__LNK);
		}
		return lnk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KmehrPackage.ITEM_TYPE__CONFIDENTIALITY:
				return basicSetConfidentiality(null, msgs);
			case KmehrPackage.ITEM_TYPE__ID:
				return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
			case KmehrPackage.ITEM_TYPE__CD:
				return ((InternalEList<?>)getCd()).basicRemove(otherEnd, msgs);
			case KmehrPackage.ITEM_TYPE__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case KmehrPackage.ITEM_TYPE__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
			case KmehrPackage.ITEM_TYPE__AUTHOR:
				return basicSetAuthor(null, msgs);
			case KmehrPackage.ITEM_TYPE__BEGINMOMENT:
				return basicSetBeginmoment(null, msgs);
			case KmehrPackage.ITEM_TYPE__ENDMOMENT:
				return basicSetEndmoment(null, msgs);
			case KmehrPackage.ITEM_TYPE__LIFECYCLE:
				return basicSetLifecycle(null, msgs);
			case KmehrPackage.ITEM_TYPE__SEVERITY:
				return basicSetSeverity(null, msgs);
			case KmehrPackage.ITEM_TYPE__CERTAINTY:
				return basicSetCertainty(null, msgs);
			case KmehrPackage.ITEM_TYPE__TEMPORALITY:
				return basicSetTemporality(null, msgs);
			case KmehrPackage.ITEM_TYPE__URGENCY:
				return basicSetUrgency(null, msgs);
			case KmehrPackage.ITEM_TYPE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case KmehrPackage.ITEM_TYPE__STRENGTH:
				return basicSetStrength(null, msgs);
			case KmehrPackage.ITEM_TYPE__FREQUENCY:
				return basicSetFrequency(null, msgs);
			case KmehrPackage.ITEM_TYPE__SITE:
				return ((InternalEList<?>)getSite()).basicRemove(otherEnd, msgs);
			case KmehrPackage.ITEM_TYPE__COST:
				return basicSetCost(null, msgs);
			case KmehrPackage.ITEM_TYPE__DAYPERIOD:
				return ((InternalEList<?>)getDayperiod()).basicRemove(otherEnd, msgs);
			case KmehrPackage.ITEM_TYPE__DURATION:
				return basicSetDuration(null, msgs);
			case KmehrPackage.ITEM_TYPE__POSOLOGY:
				return basicSetPosology(null, msgs);
			case KmehrPackage.ITEM_TYPE__REGIMEN:
				return basicSetRegimen(null, msgs);
			case KmehrPackage.ITEM_TYPE__RENEWAL:
				return basicSetRenewal(null, msgs);
			case KmehrPackage.ITEM_TYPE__ROUTE:
				return basicSetRoute(null, msgs);
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFOROVERDOSING:
				return basicSetInstructionforoverdosing(null, msgs);
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFORPATIENT:
				return basicSetInstructionforpatient(null, msgs);
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFORREIMBURSEMENT:
				return basicSetInstructionforreimbursement(null, msgs);
			case KmehrPackage.ITEM_TYPE__FEEDBACK:
				return basicSetFeedback(null, msgs);
			case KmehrPackage.ITEM_TYPE__LOCAL:
				return ((InternalEList<?>)getLocal()).basicRemove(otherEnd, msgs);
			case KmehrPackage.ITEM_TYPE__LNK:
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
			case KmehrPackage.ITEM_TYPE__CONFIDENTIALITY:
				return getConfidentiality();
			case KmehrPackage.ITEM_TYPE__ID:
				return getId();
			case KmehrPackage.ITEM_TYPE__CD:
				return getCd();
			case KmehrPackage.ITEM_TYPE__CONTENT:
				return getContent();
			case KmehrPackage.ITEM_TYPE__TEXT:
				return getText();
			case KmehrPackage.ITEM_TYPE__AUTHOR:
				return getAuthor();
			case KmehrPackage.ITEM_TYPE__BEGINMOMENT:
				return getBeginmoment();
			case KmehrPackage.ITEM_TYPE__ENDMOMENT:
				return getEndmoment();
			case KmehrPackage.ITEM_TYPE__ISCOMPLETE:
				return isIscomplete();
			case KmehrPackage.ITEM_TYPE__ISVALIDATED:
				return isIsvalidated();
			case KmehrPackage.ITEM_TYPE__LIFECYCLE:
				return getLifecycle();
			case KmehrPackage.ITEM_TYPE__ISRELEVANT:
				return isIsrelevant();
			case KmehrPackage.ITEM_TYPE__SEVERITY:
				return getSeverity();
			case KmehrPackage.ITEM_TYPE__CERTAINTY:
				return getCertainty();
			case KmehrPackage.ITEM_TYPE__TEMPORALITY:
				return getTemporality();
			case KmehrPackage.ITEM_TYPE__URGENCY:
				return getUrgency();
			case KmehrPackage.ITEM_TYPE__QUANTITY:
				return getQuantity();
			case KmehrPackage.ITEM_TYPE__STRENGTH:
				return getStrength();
			case KmehrPackage.ITEM_TYPE__FREQUENCY:
				return getFrequency();
			case KmehrPackage.ITEM_TYPE__SITE:
				return getSite();
			case KmehrPackage.ITEM_TYPE__COST:
				return getCost();
			case KmehrPackage.ITEM_TYPE__DAYPERIOD:
				return getDayperiod();
			case KmehrPackage.ITEM_TYPE__DURATION:
				return getDuration();
			case KmehrPackage.ITEM_TYPE__POSOLOGY:
				return getPosology();
			case KmehrPackage.ITEM_TYPE__REGIMEN:
				return getRegimen();
			case KmehrPackage.ITEM_TYPE__DELIVERYDATE:
				return getDeliverydate();
			case KmehrPackage.ITEM_TYPE__RENEWAL:
				return getRenewal();
			case KmehrPackage.ITEM_TYPE__ROUTE:
				return getRoute();
			case KmehrPackage.ITEM_TYPE__BATCH:
				return getBatch();
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFOROVERDOSING:
				return getInstructionforoverdosing();
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFORPATIENT:
				return getInstructionforpatient();
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFORREIMBURSEMENT:
				return getInstructionforreimbursement();
			case KmehrPackage.ITEM_TYPE__ISSUBSTITUTIONALLOWED:
				return isIssubstitutionallowed();
			case KmehrPackage.ITEM_TYPE__FEEDBACK:
				return getFeedback();
			case KmehrPackage.ITEM_TYPE__LOCAL:
				return getLocal();
			case KmehrPackage.ITEM_TYPE__RECORDDATETIME:
				return getRecorddatetime();
			case KmehrPackage.ITEM_TYPE__LNK:
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
			case KmehrPackage.ITEM_TYPE__CONFIDENTIALITY:
				setConfidentiality((ConfidentialityType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__ID:
				getId().clear();
				getId().addAll((Collection<? extends IDKMEHR>)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__CD:
				getCd().clear();
				getCd().addAll((Collection<? extends CDITEM>)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends ContentType>)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends TextType>)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__AUTHOR:
				setAuthor((AuthorType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__BEGINMOMENT:
				setBeginmoment((MomentType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__ENDMOMENT:
				setEndmoment((MomentType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__ISCOMPLETE:
				setIscomplete((Boolean)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__ISVALIDATED:
				setIsvalidated((Boolean)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__LIFECYCLE:
				setLifecycle((LifecycleType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__ISRELEVANT:
				setIsrelevant((Boolean)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__SEVERITY:
				setSeverity((SeverityType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__CERTAINTY:
				setCertainty((CertaintyType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__TEMPORALITY:
				setTemporality((TemporalityType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__URGENCY:
				setUrgency((UrgencyType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__QUANTITY:
				setQuantity((QuantityType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__STRENGTH:
				setStrength((StrengthType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__FREQUENCY:
				setFrequency((FrequencyType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__SITE:
				getSite().clear();
				getSite().addAll((Collection<? extends SiteType>)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__COST:
				setCost((CostType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__DAYPERIOD:
				getDayperiod().clear();
				getDayperiod().addAll((Collection<? extends DayperiodType>)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__DURATION:
				setDuration((DurationType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__POSOLOGY:
				setPosology((PosologyType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__REGIMEN:
				setRegimen((RegimenType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__DELIVERYDATE:
				setDeliverydate((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__RENEWAL:
				setRenewal((RenewalType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__ROUTE:
				setRoute((RouteType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__BATCH:
				setBatch((String)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFOROVERDOSING:
				setInstructionforoverdosing((TextType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFORPATIENT:
				setInstructionforpatient((TextType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFORREIMBURSEMENT:
				setInstructionforreimbursement((TextType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__ISSUBSTITUTIONALLOWED:
				setIssubstitutionallowed((Boolean)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__FEEDBACK:
				setFeedback((FeedbackType)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__LOCAL:
				getLocal().clear();
				getLocal().addAll((Collection<? extends LocalitemattributeType>)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__RECORDDATETIME:
				setRecorddatetime((XMLGregorianCalendar)newValue);
				return;
			case KmehrPackage.ITEM_TYPE__LNK:
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
			case KmehrPackage.ITEM_TYPE__CONFIDENTIALITY:
				setConfidentiality((ConfidentialityType)null);
				return;
			case KmehrPackage.ITEM_TYPE__ID:
				getId().clear();
				return;
			case KmehrPackage.ITEM_TYPE__CD:
				getCd().clear();
				return;
			case KmehrPackage.ITEM_TYPE__CONTENT:
				getContent().clear();
				return;
			case KmehrPackage.ITEM_TYPE__TEXT:
				getText().clear();
				return;
			case KmehrPackage.ITEM_TYPE__AUTHOR:
				setAuthor((AuthorType)null);
				return;
			case KmehrPackage.ITEM_TYPE__BEGINMOMENT:
				setBeginmoment((MomentType)null);
				return;
			case KmehrPackage.ITEM_TYPE__ENDMOMENT:
				setEndmoment((MomentType)null);
				return;
			case KmehrPackage.ITEM_TYPE__ISCOMPLETE:
				unsetIscomplete();
				return;
			case KmehrPackage.ITEM_TYPE__ISVALIDATED:
				unsetIsvalidated();
				return;
			case KmehrPackage.ITEM_TYPE__LIFECYCLE:
				setLifecycle((LifecycleType)null);
				return;
			case KmehrPackage.ITEM_TYPE__ISRELEVANT:
				unsetIsrelevant();
				return;
			case KmehrPackage.ITEM_TYPE__SEVERITY:
				setSeverity((SeverityType)null);
				return;
			case KmehrPackage.ITEM_TYPE__CERTAINTY:
				setCertainty((CertaintyType)null);
				return;
			case KmehrPackage.ITEM_TYPE__TEMPORALITY:
				setTemporality((TemporalityType)null);
				return;
			case KmehrPackage.ITEM_TYPE__URGENCY:
				setUrgency((UrgencyType)null);
				return;
			case KmehrPackage.ITEM_TYPE__QUANTITY:
				setQuantity((QuantityType)null);
				return;
			case KmehrPackage.ITEM_TYPE__STRENGTH:
				setStrength((StrengthType)null);
				return;
			case KmehrPackage.ITEM_TYPE__FREQUENCY:
				setFrequency((FrequencyType)null);
				return;
			case KmehrPackage.ITEM_TYPE__SITE:
				getSite().clear();
				return;
			case KmehrPackage.ITEM_TYPE__COST:
				setCost((CostType)null);
				return;
			case KmehrPackage.ITEM_TYPE__DAYPERIOD:
				getDayperiod().clear();
				return;
			case KmehrPackage.ITEM_TYPE__DURATION:
				setDuration((DurationType)null);
				return;
			case KmehrPackage.ITEM_TYPE__POSOLOGY:
				setPosology((PosologyType)null);
				return;
			case KmehrPackage.ITEM_TYPE__REGIMEN:
				setRegimen((RegimenType)null);
				return;
			case KmehrPackage.ITEM_TYPE__DELIVERYDATE:
				setDeliverydate(DELIVERYDATE_EDEFAULT);
				return;
			case KmehrPackage.ITEM_TYPE__RENEWAL:
				setRenewal((RenewalType)null);
				return;
			case KmehrPackage.ITEM_TYPE__ROUTE:
				setRoute((RouteType)null);
				return;
			case KmehrPackage.ITEM_TYPE__BATCH:
				setBatch(BATCH_EDEFAULT);
				return;
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFOROVERDOSING:
				setInstructionforoverdosing((TextType)null);
				return;
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFORPATIENT:
				setInstructionforpatient((TextType)null);
				return;
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFORREIMBURSEMENT:
				setInstructionforreimbursement((TextType)null);
				return;
			case KmehrPackage.ITEM_TYPE__ISSUBSTITUTIONALLOWED:
				unsetIssubstitutionallowed();
				return;
			case KmehrPackage.ITEM_TYPE__FEEDBACK:
				setFeedback((FeedbackType)null);
				return;
			case KmehrPackage.ITEM_TYPE__LOCAL:
				getLocal().clear();
				return;
			case KmehrPackage.ITEM_TYPE__RECORDDATETIME:
				setRecorddatetime(RECORDDATETIME_EDEFAULT);
				return;
			case KmehrPackage.ITEM_TYPE__LNK:
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
			case KmehrPackage.ITEM_TYPE__CONFIDENTIALITY:
				return confidentiality != null;
			case KmehrPackage.ITEM_TYPE__ID:
				return id != null && !id.isEmpty();
			case KmehrPackage.ITEM_TYPE__CD:
				return cd != null && !cd.isEmpty();
			case KmehrPackage.ITEM_TYPE__CONTENT:
				return content != null && !content.isEmpty();
			case KmehrPackage.ITEM_TYPE__TEXT:
				return text != null && !text.isEmpty();
			case KmehrPackage.ITEM_TYPE__AUTHOR:
				return author != null;
			case KmehrPackage.ITEM_TYPE__BEGINMOMENT:
				return beginmoment != null;
			case KmehrPackage.ITEM_TYPE__ENDMOMENT:
				return endmoment != null;
			case KmehrPackage.ITEM_TYPE__ISCOMPLETE:
				return isSetIscomplete();
			case KmehrPackage.ITEM_TYPE__ISVALIDATED:
				return isSetIsvalidated();
			case KmehrPackage.ITEM_TYPE__LIFECYCLE:
				return lifecycle != null;
			case KmehrPackage.ITEM_TYPE__ISRELEVANT:
				return isSetIsrelevant();
			case KmehrPackage.ITEM_TYPE__SEVERITY:
				return severity != null;
			case KmehrPackage.ITEM_TYPE__CERTAINTY:
				return certainty != null;
			case KmehrPackage.ITEM_TYPE__TEMPORALITY:
				return temporality != null;
			case KmehrPackage.ITEM_TYPE__URGENCY:
				return urgency != null;
			case KmehrPackage.ITEM_TYPE__QUANTITY:
				return quantity != null;
			case KmehrPackage.ITEM_TYPE__STRENGTH:
				return strength != null;
			case KmehrPackage.ITEM_TYPE__FREQUENCY:
				return frequency != null;
			case KmehrPackage.ITEM_TYPE__SITE:
				return site != null && !site.isEmpty();
			case KmehrPackage.ITEM_TYPE__COST:
				return cost != null;
			case KmehrPackage.ITEM_TYPE__DAYPERIOD:
				return dayperiod != null && !dayperiod.isEmpty();
			case KmehrPackage.ITEM_TYPE__DURATION:
				return duration != null;
			case KmehrPackage.ITEM_TYPE__POSOLOGY:
				return posology != null;
			case KmehrPackage.ITEM_TYPE__REGIMEN:
				return regimen != null;
			case KmehrPackage.ITEM_TYPE__DELIVERYDATE:
				return DELIVERYDATE_EDEFAULT == null ? deliverydate != null : !DELIVERYDATE_EDEFAULT.equals(deliverydate);
			case KmehrPackage.ITEM_TYPE__RENEWAL:
				return renewal != null;
			case KmehrPackage.ITEM_TYPE__ROUTE:
				return route != null;
			case KmehrPackage.ITEM_TYPE__BATCH:
				return BATCH_EDEFAULT == null ? batch != null : !BATCH_EDEFAULT.equals(batch);
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFOROVERDOSING:
				return instructionforoverdosing != null;
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFORPATIENT:
				return instructionforpatient != null;
			case KmehrPackage.ITEM_TYPE__INSTRUCTIONFORREIMBURSEMENT:
				return instructionforreimbursement != null;
			case KmehrPackage.ITEM_TYPE__ISSUBSTITUTIONALLOWED:
				return isSetIssubstitutionallowed();
			case KmehrPackage.ITEM_TYPE__FEEDBACK:
				return feedback != null;
			case KmehrPackage.ITEM_TYPE__LOCAL:
				return local != null && !local.isEmpty();
			case KmehrPackage.ITEM_TYPE__RECORDDATETIME:
				return RECORDDATETIME_EDEFAULT == null ? recorddatetime != null : !RECORDDATETIME_EDEFAULT.equals(recorddatetime);
			case KmehrPackage.ITEM_TYPE__LNK:
				return lnk != null && !lnk.isEmpty();
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
		result.append(" (iscomplete: ");
		if (iscompleteESet) result.append(iscomplete); else result.append("<unset>");
		result.append(", isvalidated: ");
		if (isvalidatedESet) result.append(isvalidated); else result.append("<unset>");
		result.append(", isrelevant: ");
		if (isrelevantESet) result.append(isrelevant); else result.append("<unset>");
		result.append(", deliverydate: ");
		result.append(deliverydate);
		result.append(", batch: ");
		result.append(batch);
		result.append(", issubstitutionallowed: ");
		if (issubstitutionallowedESet) result.append(issubstitutionallowed); else result.append("<unset>");
		result.append(", recorddatetime: ");
		result.append(recorddatetime);
		result.append(')');
		return result.toString();
	}

} //ItemTypeImpl
