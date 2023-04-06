/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDITE Mschemes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDITEMschemes()
 * @model extendedMetaData="name='CD-ITEMschemes'"
 * @generated
 */
public enum CDITEMschemes implements Enumerator {
	/**
	 * The '<em><b>CDITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEM_VALUE
	 * @generated
	 * @ordered
	 */
	CDITEM(0, "CDITEM", "CD-ITEM"),

	/**
	 * The '<em><b>CDITEMMAA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMMAA_VALUE
	 * @generated
	 * @ordered
	 */
	CDITEMMAA(1, "CDITEMMAA", "CD-ITEM-MAA"),

	/**
	 * The '<em><b>CDITEMCARENET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMCARENET_VALUE
	 * @generated
	 * @ordered
	 */
	CDITEMCARENET(2, "CDITEMCARENET", "CD-ITEM-CARENET"),

	/**
	 * The '<em><b>CDLAB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDLAB_VALUE
	 * @generated
	 * @ordered
	 */
	CDLAB(3, "CDLAB", "CD-LAB"),

	/**
	 * The '<em><b>CDTECHNICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTECHNICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CDTECHNICAL(4, "CDTECHNICAL", "CD-TECHNICAL"),

	/**
	 * The '<em><b>CDCONTACTPERSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCONTACTPERSON_VALUE
	 * @generated
	 * @ordered
	 */
	CDCONTACTPERSON(5, "CDCONTACTPERSON", "CD-CONTACT-PERSON"),

	/**
	 * The '<em><b>ICD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICD_VALUE
	 * @generated
	 * @ordered
	 */
	ICD(6, "ICD", "ICD"),

	/**
	 * The '<em><b>ICPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICPC_VALUE
	 * @generated
	 * @ordered
	 */
	ICPC(7, "ICPC", "ICPC"),

	/**
	 * The '<em><b>LOCAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(8, "LOCAL", "LOCAL"),

	/**
	 * The '<em><b>CDVACCINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDVACCINE_VALUE
	 * @generated
	 * @ordered
	 */
	CDVACCINE(9, "CDVACCINE", "CD-VACCINE"),

	/**
	 * The '<em><b>CDECG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDECG_VALUE
	 * @generated
	 * @ordered
	 */
	CDECG(10, "CDECG", "CD-ECG"),

	/**
	 * The '<em><b>CDECARECLINICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDECARECLINICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CDECARECLINICAL(11, "CDECARECLINICAL", "CD-ECARE-CLINICAL"),

	/**
	 * The '<em><b>CDECARELAB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDECARELAB_VALUE
	 * @generated
	 * @ordered
	 */
	CDECARELAB(12, "CDECARELAB", "CD-ECARE-LAB"),

	/**
	 * The '<em><b>CDECAREHAQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDECAREHAQ_VALUE
	 * @generated
	 * @ordered
	 */
	CDECAREHAQ(13, "CDECAREHAQ", "CD-ECARE-HAQ"),

	/**
	 * The '<em><b>CDITEMEBIRTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMEBIRTH_VALUE
	 * @generated
	 * @ordered
	 */
	CDITEMEBIRTH(14, "CDITEMEBIRTH", "CD-ITEM-EBIRTH"),

	/**
	 * The '<em><b>CDPARAMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	CDPARAMETER(15, "CDPARAMETER", "CD-PARAMETER"),

	/**
	 * The '<em><b>CDITEMBVT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMBVT_VALUE
	 * @generated
	 * @ordered
	 */
	CDITEMBVT(16, "CDITEMBVT", "CD-ITEM-BVT"),

	/**
	 * The '<em><b>CDBVTAVAILABLEMATERIALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTAVAILABLEMATERIALS_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTAVAILABLEMATERIALS(17, "CDBVTAVAILABLEMATERIALS", "CD-BVT-AVAILABLEMATERIALS"),

	/**
	 * The '<em><b>CDBVTCONSERVATIONDELAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTCONSERVATIONDELAY_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTCONSERVATIONDELAY(18, "CDBVTCONSERVATIONDELAY", "CD-BVT-CONSERVATIONDELAY"),

	/**
	 * The '<em><b>CDBVTCONSERVATIONMODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTCONSERVATIONMODE_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTCONSERVATIONMODE(19, "CDBVTCONSERVATIONMODE", "CD-BVT-CONSERVATIONMODE"),

	/**
	 * The '<em><b>CDBVTSAMPLETYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTSAMPLETYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTSAMPLETYPE(20, "CDBVTSAMPLETYPE", "CD-BVT-SAMPLETYPE"),

	/**
	 * The '<em><b>CDBCRDIFFERENTATIONDEGREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBCRDIFFERENTATIONDEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	CDBCRDIFFERENTATIONDEGREE(21, "CDBCRDIFFERENTATIONDEGREE", "CD-BCR-DIFFERENTATIONDEGREE"),

	/**
	 * The '<em><b>CDBVTLATERALITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTLATERALITY_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTLATERALITY(22, "CDBVTLATERALITY", "CD-BVT-LATERALITY"),

	/**
	 * The '<em><b>CDBVTPATIENTOPPOSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTPATIENTOPPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTPATIENTOPPOSITION(23, "CDBVTPATIENTOPPOSITION", "CD-BVT-PATIENTOPPOSITION"),

	/**
	 * The '<em><b>CDBVTSTATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTSTATUS_VALUE
	 * @generated
	 * @ordered
	 */
	CDBVTSTATUS(24, "CDBVTSTATUS", "CD-BVT-STATUS"),

	/**
	 * The '<em><b>CDITEMREG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMREG_VALUE
	 * @generated
	 * @ordered
	 */
	CDITEMREG(25, "CDITEMREG", "CD-ITEM-REG"),

	/**
	 * The '<em><b>CDITEMMYCARENET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMMYCARENET_VALUE
	 * @generated
	 * @ordered
	 */
	CDITEMMYCARENET(26, "CDITEMMYCARENET", "CD-ITEM-MYCARENET"),

	/**
	 * The '<em><b>CDDEFIBDIAGNOSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBDIAGNOSIS_VALUE
	 * @generated
	 * @ordered
	 */
	CDDEFIBDIAGNOSIS(27, "CDDEFIBDIAGNOSIS", "CD-DEFIB-DIAGNOSIS"),

	/**
	 * The '<em><b>CDACTSNURSING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDACTSNURSING_VALUE
	 * @generated
	 * @ordered
	 */
	CDACTSNURSING(28, "CDACTSNURSING", "CD-ACTS-NURSING"),

	/**
	 * The '<em><b>CDQERMIDINTERVENTIONTYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDINTERVENTIONTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CDQERMIDINTERVENTIONTYPE(29, "CDQERMIDINTERVENTIONTYPE", "CD-QERMID-INTERVENTIONTYPE");

	/**
	 * The '<em><b>CDITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEM
	 * @model literal="CD-ITEM"
	 * @generated
	 * @ordered
	 */
	public static final int CDITEM_VALUE = 0;

	/**
	 * The '<em><b>CDITEMMAA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMMAA
	 * @model literal="CD-ITEM-MAA"
	 * @generated
	 * @ordered
	 */
	public static final int CDITEMMAA_VALUE = 1;

	/**
	 * The '<em><b>CDITEMCARENET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMCARENET
	 * @model literal="CD-ITEM-CARENET"
	 * @generated
	 * @ordered
	 */
	public static final int CDITEMCARENET_VALUE = 2;

	/**
	 * The '<em><b>CDLAB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDLAB
	 * @model literal="CD-LAB"
	 * @generated
	 * @ordered
	 */
	public static final int CDLAB_VALUE = 3;

	/**
	 * The '<em><b>CDTECHNICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDTECHNICAL
	 * @model literal="CD-TECHNICAL"
	 * @generated
	 * @ordered
	 */
	public static final int CDTECHNICAL_VALUE = 4;

	/**
	 * The '<em><b>CDCONTACTPERSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDCONTACTPERSON
	 * @model literal="CD-CONTACT-PERSON"
	 * @generated
	 * @ordered
	 */
	public static final int CDCONTACTPERSON_VALUE = 5;

	/**
	 * The '<em><b>ICD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICD_VALUE = 6;

	/**
	 * The '<em><b>ICPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICPC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICPC_VALUE = 7;

	/**
	 * The '<em><b>LOCAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 8;

	/**
	 * The '<em><b>CDVACCINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDVACCINE
	 * @model literal="CD-VACCINE"
	 * @generated
	 * @ordered
	 */
	public static final int CDVACCINE_VALUE = 9;

	/**
	 * The '<em><b>CDECG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDECG
	 * @model literal="CD-ECG"
	 * @generated
	 * @ordered
	 */
	public static final int CDECG_VALUE = 10;

	/**
	 * The '<em><b>CDECARECLINICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDECARECLINICAL
	 * @model literal="CD-ECARE-CLINICAL"
	 * @generated
	 * @ordered
	 */
	public static final int CDECARECLINICAL_VALUE = 11;

	/**
	 * The '<em><b>CDECARELAB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDECARELAB
	 * @model literal="CD-ECARE-LAB"
	 * @generated
	 * @ordered
	 */
	public static final int CDECARELAB_VALUE = 12;

	/**
	 * The '<em><b>CDECAREHAQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDECAREHAQ
	 * @model literal="CD-ECARE-HAQ"
	 * @generated
	 * @ordered
	 */
	public static final int CDECAREHAQ_VALUE = 13;

	/**
	 * The '<em><b>CDITEMEBIRTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMEBIRTH
	 * @model literal="CD-ITEM-EBIRTH"
	 * @generated
	 * @ordered
	 */
	public static final int CDITEMEBIRTH_VALUE = 14;

	/**
	 * The '<em><b>CDPARAMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDPARAMETER
	 * @model literal="CD-PARAMETER"
	 * @generated
	 * @ordered
	 */
	public static final int CDPARAMETER_VALUE = 15;

	/**
	 * The '<em><b>CDITEMBVT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMBVT
	 * @model literal="CD-ITEM-BVT"
	 * @generated
	 * @ordered
	 */
	public static final int CDITEMBVT_VALUE = 16;

	/**
	 * The '<em><b>CDBVTAVAILABLEMATERIALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTAVAILABLEMATERIALS
	 * @model literal="CD-BVT-AVAILABLEMATERIALS"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTAVAILABLEMATERIALS_VALUE = 17;

	/**
	 * The '<em><b>CDBVTCONSERVATIONDELAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTCONSERVATIONDELAY
	 * @model literal="CD-BVT-CONSERVATIONDELAY"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTCONSERVATIONDELAY_VALUE = 18;

	/**
	 * The '<em><b>CDBVTCONSERVATIONMODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTCONSERVATIONMODE
	 * @model literal="CD-BVT-CONSERVATIONMODE"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTCONSERVATIONMODE_VALUE = 19;

	/**
	 * The '<em><b>CDBVTSAMPLETYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTSAMPLETYPE
	 * @model literal="CD-BVT-SAMPLETYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTSAMPLETYPE_VALUE = 20;

	/**
	 * The '<em><b>CDBCRDIFFERENTATIONDEGREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBCRDIFFERENTATIONDEGREE
	 * @model literal="CD-BCR-DIFFERENTATIONDEGREE"
	 * @generated
	 * @ordered
	 */
	public static final int CDBCRDIFFERENTATIONDEGREE_VALUE = 21;

	/**
	 * The '<em><b>CDBVTLATERALITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTLATERALITY
	 * @model literal="CD-BVT-LATERALITY"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTLATERALITY_VALUE = 22;

	/**
	 * The '<em><b>CDBVTPATIENTOPPOSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTPATIENTOPPOSITION
	 * @model literal="CD-BVT-PATIENTOPPOSITION"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTPATIENTOPPOSITION_VALUE = 23;

	/**
	 * The '<em><b>CDBVTSTATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDBVTSTATUS
	 * @model literal="CD-BVT-STATUS"
	 * @generated
	 * @ordered
	 */
	public static final int CDBVTSTATUS_VALUE = 24;

	/**
	 * The '<em><b>CDITEMREG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMREG
	 * @model literal="CD-ITEM-REG"
	 * @generated
	 * @ordered
	 */
	public static final int CDITEMREG_VALUE = 25;

	/**
	 * The '<em><b>CDITEMMYCARENET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDITEMMYCARENET
	 * @model literal="CD-ITEM-MYCARENET"
	 * @generated
	 * @ordered
	 */
	public static final int CDITEMMYCARENET_VALUE = 26;

	/**
	 * The '<em><b>CDDEFIBDIAGNOSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDDEFIBDIAGNOSIS
	 * @model literal="CD-DEFIB-DIAGNOSIS"
	 * @generated
	 * @ordered
	 */
	public static final int CDDEFIBDIAGNOSIS_VALUE = 27;

	/**
	 * The '<em><b>CDACTSNURSING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDACTSNURSING
	 * @model literal="CD-ACTS-NURSING"
	 * @generated
	 * @ordered
	 */
	public static final int CDACTSNURSING_VALUE = 28;

	/**
	 * The '<em><b>CDQERMIDINTERVENTIONTYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDQERMIDINTERVENTIONTYPE
	 * @model literal="CD-QERMID-INTERVENTIONTYPE"
	 * @generated
	 * @ordered
	 */
	public static final int CDQERMIDINTERVENTIONTYPE_VALUE = 29;

	/**
	 * An array of all the '<em><b>CDITE Mschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDITEMschemes[] VALUES_ARRAY =
		new CDITEMschemes[] {
			CDITEM,
			CDITEMMAA,
			CDITEMCARENET,
			CDLAB,
			CDTECHNICAL,
			CDCONTACTPERSON,
			ICD,
			ICPC,
			LOCAL,
			CDVACCINE,
			CDECG,
			CDECARECLINICAL,
			CDECARELAB,
			CDECAREHAQ,
			CDITEMEBIRTH,
			CDPARAMETER,
			CDITEMBVT,
			CDBVTAVAILABLEMATERIALS,
			CDBVTCONSERVATIONDELAY,
			CDBVTCONSERVATIONMODE,
			CDBVTSAMPLETYPE,
			CDBCRDIFFERENTATIONDEGREE,
			CDBVTLATERALITY,
			CDBVTPATIENTOPPOSITION,
			CDBVTSTATUS,
			CDITEMREG,
			CDITEMMYCARENET,
			CDDEFIBDIAGNOSIS,
			CDACTSNURSING,
			CDQERMIDINTERVENTIONTYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDITE Mschemes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDITEMschemes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDITE Mschemes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMschemes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMschemes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITE Mschemes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMschemes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMschemes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITE Mschemes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMschemes get(int value) {
		switch (value) {
			case CDITEM_VALUE: return CDITEM;
			case CDITEMMAA_VALUE: return CDITEMMAA;
			case CDITEMCARENET_VALUE: return CDITEMCARENET;
			case CDLAB_VALUE: return CDLAB;
			case CDTECHNICAL_VALUE: return CDTECHNICAL;
			case CDCONTACTPERSON_VALUE: return CDCONTACTPERSON;
			case ICD_VALUE: return ICD;
			case ICPC_VALUE: return ICPC;
			case LOCAL_VALUE: return LOCAL;
			case CDVACCINE_VALUE: return CDVACCINE;
			case CDECG_VALUE: return CDECG;
			case CDECARECLINICAL_VALUE: return CDECARECLINICAL;
			case CDECARELAB_VALUE: return CDECARELAB;
			case CDECAREHAQ_VALUE: return CDECAREHAQ;
			case CDITEMEBIRTH_VALUE: return CDITEMEBIRTH;
			case CDPARAMETER_VALUE: return CDPARAMETER;
			case CDITEMBVT_VALUE: return CDITEMBVT;
			case CDBVTAVAILABLEMATERIALS_VALUE: return CDBVTAVAILABLEMATERIALS;
			case CDBVTCONSERVATIONDELAY_VALUE: return CDBVTCONSERVATIONDELAY;
			case CDBVTCONSERVATIONMODE_VALUE: return CDBVTCONSERVATIONMODE;
			case CDBVTSAMPLETYPE_VALUE: return CDBVTSAMPLETYPE;
			case CDBCRDIFFERENTATIONDEGREE_VALUE: return CDBCRDIFFERENTATIONDEGREE;
			case CDBVTLATERALITY_VALUE: return CDBVTLATERALITY;
			case CDBVTPATIENTOPPOSITION_VALUE: return CDBVTPATIENTOPPOSITION;
			case CDBVTSTATUS_VALUE: return CDBVTSTATUS;
			case CDITEMREG_VALUE: return CDITEMREG;
			case CDITEMMYCARENET_VALUE: return CDITEMMYCARENET;
			case CDDEFIBDIAGNOSIS_VALUE: return CDDEFIBDIAGNOSIS;
			case CDACTSNURSING_VALUE: return CDACTSNURSING;
			case CDQERMIDINTERVENTIONTYPE_VALUE: return CDQERMIDINTERVENTIONTYPE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CDITEMschemes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CDITEMschemes
