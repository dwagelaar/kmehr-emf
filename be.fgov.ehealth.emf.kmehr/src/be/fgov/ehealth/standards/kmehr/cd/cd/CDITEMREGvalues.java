/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDITEMRE Gvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDITEMREGvalues()
 * @model extendedMetaData="name='CD-ITEM-REGvalues'"
 * @generated
 */
public enum CDITEMREGvalues implements Enumerator {
	/**
	 * The '<em><b>Isinitialintervention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISINITIALINTERVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	ISINITIALINTERVENTION(0, "isinitialintervention", "isinitialintervention"),

	/**
	 * The '<em><b>Dominance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMINANCE_VALUE
	 * @generated
	 * @ordered
	 */
	DOMINANCE(1, "dominance", "dominance"),

	/**
	 * The '<em><b>Existingbridge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXISTINGBRIDGE_VALUE
	 * @generated
	 * @ordered
	 */
	EXISTINGBRIDGE(2, "existingbridge", "existingbridge"),

	/**
	 * The '<em><b>Observedlesion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVEDLESION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVEDLESION(3, "observedlesion", "observedlesion"),

	/**
	 * The '<em><b>Segment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SEGMENT(4, "segment", "segment"),

	/**
	 * The '<em><b>Totaltreatedlength</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALTREATEDLENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	TOTALTREATEDLENGTH(5, "totaltreatedlength", "totaltreatedlength"),

	/**
	 * The '<em><b>Bloodvesseldiameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOODVESSELDIAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	BLOODVESSELDIAMETER(6, "bloodvesseldiameter", "bloodvesseldiameter"),

	/**
	 * The '<em><b>Procedure Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE_DEVICE(7, "procedureDevice", "procedure-device"),

	/**
	 * The '<em><b>Contrastproductused</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRASTPRODUCTUSED_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRASTPRODUCTUSED(8, "contrastproductused", "contrastproductused"),

	/**
	 * The '<em><b>Reimbursementnomenclaturetype</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REIMBURSEMENTNOMENCLATURETYPE_VALUE
	 * @generated
	 * @ordered
	 */
	REIMBURSEMENTNOMENCLATURETYPE(9, "reimbursementnomenclaturetype", "reimbursementnomenclaturetype"),

	/**
	 * The '<em><b>Intervention Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVENTION_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVENTION_TYPE(10, "interventionType", "intervention-type"),

	/**
	 * The '<em><b>Intervention Site</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVENTION_SITE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVENTION_SITE(11, "interventionSite", "intervention-site"),

	/**
	 * The '<em><b>Approach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROACH_VALUE
	 * @generated
	 * @ordered
	 */
	APPROACH(12, "approach", "approach"),

	/**
	 * The '<em><b>Navigationcomputer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONCOMPUTER_VALUE
	 * @generated
	 * @ordered
	 */
	NAVIGATIONCOMPUTER(13, "navigationcomputer", "navigationcomputer"),

	/**
	 * The '<em><b>Intervention Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVENTION_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVENTION_DEVICE(14, "interventionDevice", "intervention-device"),

	/**
	 * The '<em><b>Bearingsurface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEARINGSURFACE_VALUE
	 * @generated
	 * @ordered
	 */
	BEARINGSURFACE(15, "bearingsurface", "bearingsurface"),

	/**
	 * The '<em><b>Graftused</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAFTUSED_VALUE
	 * @generated
	 * @ordered
	 */
	GRAFTUSED(16, "graftused", "graftused"),

	/**
	 * The '<em><b>Acetabularinterface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACETABULARINTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	ACETABULARINTERFACE(17, "acetabularinterface", "acetabularinterface"),

	/**
	 * The '<em><b>Femoralinterface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMORALINTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	FEMORALINTERFACE(18, "femoralinterface", "femoralinterface"),

	/**
	 * The '<em><b>Stem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEM_VALUE
	 * @generated
	 * @ordered
	 */
	STEM(19, "stem", "stem"),

	/**
	 * The '<em><b>Cup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUP_VALUE
	 * @generated
	 * @ordered
	 */
	CUP(20, "cup", "cup"),

	/**
	 * The '<em><b>Head</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD(21, "head", "head"),

	/**
	 * The '<em><b>Neck</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NECK_VALUE
	 * @generated
	 * @ordered
	 */
	NECK(22, "neck", "neck"),

	/**
	 * The '<em><b>Insert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT(23, "insert", "insert"),

	/**
	 * The '<em><b>Prosthesis Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROSTHESIS_OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	PROSTHESIS_OTHER(24, "prosthesisOther", "prosthesis-other"),

	/**
	 * The '<em><b>Brand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRAND_VALUE
	 * @generated
	 * @ordered
	 */
	BRAND(25, "brand", "brand"),

	/**
	 * The '<em><b>Producer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCER_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCER(26, "producer", "producer"),

	/**
	 * The '<em><b>Size</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	SIZE(27, "size", "size"),

	/**
	 * The '<em><b>Revisiontechnic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVISIONTECHNIC_VALUE
	 * @generated
	 * @ordered
	 */
	REVISIONTECHNIC(28, "revisiontechnic", "revisiontechnic"),

	/**
	 * The '<em><b>Kneeimplanttype</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNEEIMPLANTTYPE_VALUE
	 * @generated
	 * @ordered
	 */
	KNEEIMPLANTTYPE(29, "kneeimplanttype", "kneeimplanttype"),

	/**
	 * The '<em><b>Kneeinsert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNEEINSERT_VALUE
	 * @generated
	 * @ordered
	 */
	KNEEINSERT(30, "kneeinsert", "kneeinsert"),

	/**
	 * The '<em><b>Tibialinterface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIBIALINTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	TIBIALINTERFACE(31, "tibialinterface", "tibialinterface"),

	/**
	 * The '<em><b>Patellarinterface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATELLARINTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	PATELLARINTERFACE(32, "patellarinterface", "patellarinterface"),

	/**
	 * The '<em><b>Patella</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATELLA_VALUE
	 * @generated
	 * @ordered
	 */
	PATELLA(33, "patella", "patella"),

	/**
	 * The '<em><b>Femur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMUR_VALUE
	 * @generated
	 * @ordered
	 */
	FEMUR(34, "femur", "femur"),

	/**
	 * The '<em><b>Tibia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIBIA_VALUE
	 * @generated
	 * @ordered
	 */
	TIBIA(35, "tibia", "tibia"),

	/**
	 * The '<em><b>Tickness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TICKNESS_VALUE
	 * @generated
	 * @ordered
	 */
	TICKNESS(36, "tickness", "tickness"),

	/**
	 * The '<em><b>Kneeprosthesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNEEPROSTHESIS_VALUE
	 * @generated
	 * @ordered
	 */
	KNEEPROSTHESIS(37, "kneeprosthesis", "kneeprosthesis"),

	/**
	 * The '<em><b>Revisioncomponent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVISIONCOMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	REVISIONCOMPONENT(38, "revisioncomponent", "revisioncomponent"),

	/**
	 * The '<em><b>Doctorsremark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTORSREMARK_VALUE
	 * @generated
	 * @ordered
	 */
	DOCTORSREMARK(39, "doctorsremark", "doctorsremark"),

	/**
	 * The '<em><b>Resynchronisation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESYNCHRONISATION_VALUE
	 * @generated
	 * @ordered
	 */
	RESYNCHRONISATION(40, "resynchronisation", "resynchronisation"),

	/**
	 * The '<em><b>Pacingindication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACINGINDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	PACINGINDICATION(41, "pacingindication", "pacingindication"),

	/**
	 * The '<em><b>Issecondoperator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSECONDOPERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	ISSECONDOPERATOR(42, "issecondoperator", "issecondoperator"),

	/**
	 * The '<em><b>Postpcitimi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTPCITIMI_VALUE
	 * @generated
	 * @ordered
	 */
	POSTPCITIMI(43, "postpcitimi", "postpcitimi"),

	/**
	 * The '<em><b>Poststenosis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTSTENOSIS_VALUE
	 * @generated
	 * @ordered
	 */
	POSTSTENOSIS(44, "poststenosis", "poststenosis"),

	/**
	 * The '<em><b>Infiltration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFILTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	INFILTRATION(45, "infiltration", "infiltration"),

	/**
	 * The '<em><b>Operation Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_TYPE(46, "operationType", "operation-type"),

	/**
	 * The '<em><b>Alignment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALIGNMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ALIGNMENT(47, "alignment", "alignment"),

	/**
	 * The '<em><b>Custominstrumentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOMINSTRUMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOMINSTRUMENTATION(48, "custominstrumentation", "custominstrumentation"),

	/**
	 * The '<em><b>Substitute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTITUTE(49, "substitute", "substitute"),

	/**
	 * The '<em><b>Modularneck</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULARNECK_VALUE
	 * @generated
	 * @ordered
	 */
	MODULARNECK(50, "modularneck", "modularneck"),

	/**
	 * The '<em><b>Materialsremark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATERIALSREMARK_VALUE
	 * @generated
	 * @ordered
	 */
	MATERIALSREMARK(51, "materialsremark", "materialsremark"),

	/**
	 * The '<em><b>Ortho Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORTHO_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	ORTHO_DEVICE(52, "orthoDevice", "ortho-device"),

	/**
	 * The '<em><b>Devicename</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICENAME_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICENAME(53, "devicename", "devicename"),

	/**
	 * The '<em><b>Distributor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTOR_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTOR(54, "distributor", "distributor"),

	/**
	 * The '<em><b>Manufacturer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUFACTURER_VALUE
	 * @generated
	 * @ordered
	 */
	MANUFACTURER(55, "manufacturer", "manufacturer"),

	/**
	 * The '<em><b>Femoralreplacement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMORALREPLACEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	FEMORALREPLACEMENT(56, "femoralreplacement", "femoralreplacement"),

	/**
	 * The '<em><b>Acetabularreplacement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACETABULARREPLACEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ACETABULARREPLACEMENT(57, "acetabularreplacement", "acetabularreplacement"),

	/**
	 * The '<em><b>Revisedcomponent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVISEDCOMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	REVISEDCOMPONENT(58, "revisedcomponent", "revisedcomponent"),

	/**
	 * The '<em><b>Cardioversion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDIOVERSION_VALUE
	 * @generated
	 * @ordered
	 */
	CARDIOVERSION(59, "cardioversion", "cardioversion"),

	/**
	 * The '<em><b>Motivation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	MOTIVATION(60, "motivation", "motivation"),

	/**
	 * The '<em><b>Criteriacomments</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITERIACOMMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	CRITERIACOMMENTS(61, "criteriacomments", "criteriacomments"),

	/**
	 * The '<em><b>Comorbiditiescomments</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMORBIDITIESCOMMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	COMORBIDITIESCOMMENTS(62, "comorbiditiescomments", "comorbiditiescomments"),

	/**
	 * The '<em><b>Informationprimo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATIONPRIMO_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATIONPRIMO(63, "informationprimo", "informationprimo"),

	/**
	 * The '<em><b>Lvef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LVEF_VALUE
	 * @generated
	 * @ordered
	 */
	LVEF(64, "lvef", "lvef"),

	/**
	 * The '<em><b>Qrs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QRS_VALUE
	 * @generated
	 * @ordered
	 */
	QRS(65, "qrs", "qrs"),

	/**
	 * The '<em><b>Diameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	DIAMETER(66, "diameter", "diameter"),

	/**
	 * The '<em><b>Cardiacasynchrony</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDIACASYNCHRONY_VALUE
	 * @generated
	 * @ordered
	 */
	CARDIACASYNCHRONY(67, "cardiacasynchrony", "cardiacasynchrony"),

	/**
	 * The '<em><b>Indication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	INDICATION(68, "indication", "indication"),

	/**
	 * The '<em><b>Registration Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTRATION_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	REGISTRATION_TYPE(69, "registrationType", "registration-type"),

	/**
	 * The '<em><b>Declarationdas28</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLARATIONDAS28_VALUE
	 * @generated
	 * @ordered
	 */
	DECLARATIONDAS28(70, "declarationdas28", "declarationdas28"),

	/**
	 * The '<em><b>Declarationhaq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLARATIONHAQ_VALUE
	 * @generated
	 * @ordered
	 */
	DECLARATIONHAQ(71, "declarationhaq", "declarationhaq"),

	/**
	 * The '<em><b>Declarationinfiltration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLARATIONINFILTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	DECLARATIONINFILTRATION(72, "declarationinfiltration", "declarationinfiltration"),

	/**
	 * The '<em><b>Declarationmedication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLARATIONMEDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	DECLARATIONMEDICATION(73, "declarationmedication", "declarationmedication"),

	/**
	 * The '<em><b>Substance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE(74, "substance", "substance"),

	/**
	 * The '<em><b>Medicationstopinfo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATIONSTOPINFO_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATIONSTOPINFO(75, "medicationstopinfo", "medicationstopinfo"),

	/**
	 * The '<em><b>Chapter4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAPTER4_VALUE
	 * @generated
	 * @ordered
	 */
	CHAPTER4(76, "chapter4", "chapter4"),

	/**
	 * The '<em><b>Dosis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOSIS_VALUE
	 * @generated
	 * @ordered
	 */
	DOSIS(77, "dosis", "dosis"),

	/**
	 * The '<em><b>Frequency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENCY_VALUE
	 * @generated
	 * @ordered
	 */
	FREQUENCY(78, "frequency", "frequency"),

	/**
	 * The '<em><b>Route</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUTE_VALUE
	 * @generated
	 * @ordered
	 */
	ROUTE(79, "route", "route");

	/**
	 * The '<em><b>Isinitialintervention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISINITIALINTERVENTION
	 * @model name="isinitialintervention"
	 * @generated
	 * @ordered
	 */
	public static final int ISINITIALINTERVENTION_VALUE = 0;

	/**
	 * The '<em><b>Dominance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMINANCE
	 * @model name="dominance"
	 * @generated
	 * @ordered
	 */
	public static final int DOMINANCE_VALUE = 1;

	/**
	 * The '<em><b>Existingbridge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXISTINGBRIDGE
	 * @model name="existingbridge"
	 * @generated
	 * @ordered
	 */
	public static final int EXISTINGBRIDGE_VALUE = 2;

	/**
	 * The '<em><b>Observedlesion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVEDLESION
	 * @model name="observedlesion"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVEDLESION_VALUE = 3;

	/**
	 * The '<em><b>Segment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEGMENT
	 * @model name="segment"
	 * @generated
	 * @ordered
	 */
	public static final int SEGMENT_VALUE = 4;

	/**
	 * The '<em><b>Totaltreatedlength</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALTREATEDLENGTH
	 * @model name="totaltreatedlength"
	 * @generated
	 * @ordered
	 */
	public static final int TOTALTREATEDLENGTH_VALUE = 5;

	/**
	 * The '<em><b>Bloodvesseldiameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOODVESSELDIAMETER
	 * @model name="bloodvesseldiameter"
	 * @generated
	 * @ordered
	 */
	public static final int BLOODVESSELDIAMETER_VALUE = 6;

	/**
	 * The '<em><b>Procedure Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE_DEVICE
	 * @model name="procedureDevice" literal="procedure-device"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DEVICE_VALUE = 7;

	/**
	 * The '<em><b>Contrastproductused</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRASTPRODUCTUSED
	 * @model name="contrastproductused"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRASTPRODUCTUSED_VALUE = 8;

	/**
	 * The '<em><b>Reimbursementnomenclaturetype</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REIMBURSEMENTNOMENCLATURETYPE
	 * @model name="reimbursementnomenclaturetype"
	 * @generated
	 * @ordered
	 */
	public static final int REIMBURSEMENTNOMENCLATURETYPE_VALUE = 9;

	/**
	 * The '<em><b>Intervention Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVENTION_TYPE
	 * @model name="interventionType" literal="intervention-type"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVENTION_TYPE_VALUE = 10;

	/**
	 * The '<em><b>Intervention Site</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVENTION_SITE
	 * @model name="interventionSite" literal="intervention-site"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVENTION_SITE_VALUE = 11;

	/**
	 * The '<em><b>Approach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROACH
	 * @model name="approach"
	 * @generated
	 * @ordered
	 */
	public static final int APPROACH_VALUE = 12;

	/**
	 * The '<em><b>Navigationcomputer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATIONCOMPUTER
	 * @model name="navigationcomputer"
	 * @generated
	 * @ordered
	 */
	public static final int NAVIGATIONCOMPUTER_VALUE = 13;

	/**
	 * The '<em><b>Intervention Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVENTION_DEVICE
	 * @model name="interventionDevice" literal="intervention-device"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVENTION_DEVICE_VALUE = 14;

	/**
	 * The '<em><b>Bearingsurface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEARINGSURFACE
	 * @model name="bearingsurface"
	 * @generated
	 * @ordered
	 */
	public static final int BEARINGSURFACE_VALUE = 15;

	/**
	 * The '<em><b>Graftused</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAFTUSED
	 * @model name="graftused"
	 * @generated
	 * @ordered
	 */
	public static final int GRAFTUSED_VALUE = 16;

	/**
	 * The '<em><b>Acetabularinterface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACETABULARINTERFACE
	 * @model name="acetabularinterface"
	 * @generated
	 * @ordered
	 */
	public static final int ACETABULARINTERFACE_VALUE = 17;

	/**
	 * The '<em><b>Femoralinterface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMORALINTERFACE
	 * @model name="femoralinterface"
	 * @generated
	 * @ordered
	 */
	public static final int FEMORALINTERFACE_VALUE = 18;

	/**
	 * The '<em><b>Stem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEM
	 * @model name="stem"
	 * @generated
	 * @ordered
	 */
	public static final int STEM_VALUE = 19;

	/**
	 * The '<em><b>Cup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUP
	 * @model name="cup"
	 * @generated
	 * @ordered
	 */
	public static final int CUP_VALUE = 20;

	/**
	 * The '<em><b>Head</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD
	 * @model name="head"
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_VALUE = 21;

	/**
	 * The '<em><b>Neck</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NECK
	 * @model name="neck"
	 * @generated
	 * @ordered
	 */
	public static final int NECK_VALUE = 22;

	/**
	 * The '<em><b>Insert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT
	 * @model name="insert"
	 * @generated
	 * @ordered
	 */
	public static final int INSERT_VALUE = 23;

	/**
	 * The '<em><b>Prosthesis Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROSTHESIS_OTHER
	 * @model name="prosthesisOther" literal="prosthesis-other"
	 * @generated
	 * @ordered
	 */
	public static final int PROSTHESIS_OTHER_VALUE = 24;

	/**
	 * The '<em><b>Brand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRAND
	 * @model name="brand"
	 * @generated
	 * @ordered
	 */
	public static final int BRAND_VALUE = 25;

	/**
	 * The '<em><b>Producer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCER
	 * @model name="producer"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCER_VALUE = 26;

	/**
	 * The '<em><b>Size</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIZE
	 * @model name="size"
	 * @generated
	 * @ordered
	 */
	public static final int SIZE_VALUE = 27;

	/**
	 * The '<em><b>Revisiontechnic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVISIONTECHNIC
	 * @model name="revisiontechnic"
	 * @generated
	 * @ordered
	 */
	public static final int REVISIONTECHNIC_VALUE = 28;

	/**
	 * The '<em><b>Kneeimplanttype</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNEEIMPLANTTYPE
	 * @model name="kneeimplanttype"
	 * @generated
	 * @ordered
	 */
	public static final int KNEEIMPLANTTYPE_VALUE = 29;

	/**
	 * The '<em><b>Kneeinsert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNEEINSERT
	 * @model name="kneeinsert"
	 * @generated
	 * @ordered
	 */
	public static final int KNEEINSERT_VALUE = 30;

	/**
	 * The '<em><b>Tibialinterface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIBIALINTERFACE
	 * @model name="tibialinterface"
	 * @generated
	 * @ordered
	 */
	public static final int TIBIALINTERFACE_VALUE = 31;

	/**
	 * The '<em><b>Patellarinterface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATELLARINTERFACE
	 * @model name="patellarinterface"
	 * @generated
	 * @ordered
	 */
	public static final int PATELLARINTERFACE_VALUE = 32;

	/**
	 * The '<em><b>Patella</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATELLA
	 * @model name="patella"
	 * @generated
	 * @ordered
	 */
	public static final int PATELLA_VALUE = 33;

	/**
	 * The '<em><b>Femur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMUR
	 * @model name="femur"
	 * @generated
	 * @ordered
	 */
	public static final int FEMUR_VALUE = 34;

	/**
	 * The '<em><b>Tibia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIBIA
	 * @model name="tibia"
	 * @generated
	 * @ordered
	 */
	public static final int TIBIA_VALUE = 35;

	/**
	 * The '<em><b>Tickness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TICKNESS
	 * @model name="tickness"
	 * @generated
	 * @ordered
	 */
	public static final int TICKNESS_VALUE = 36;

	/**
	 * The '<em><b>Kneeprosthesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNEEPROSTHESIS
	 * @model name="kneeprosthesis"
	 * @generated
	 * @ordered
	 */
	public static final int KNEEPROSTHESIS_VALUE = 37;

	/**
	 * The '<em><b>Revisioncomponent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVISIONCOMPONENT
	 * @model name="revisioncomponent"
	 * @generated
	 * @ordered
	 */
	public static final int REVISIONCOMPONENT_VALUE = 38;

	/**
	 * The '<em><b>Doctorsremark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTORSREMARK
	 * @model name="doctorsremark"
	 * @generated
	 * @ordered
	 */
	public static final int DOCTORSREMARK_VALUE = 39;

	/**
	 * The '<em><b>Resynchronisation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESYNCHRONISATION
	 * @model name="resynchronisation"
	 * @generated
	 * @ordered
	 */
	public static final int RESYNCHRONISATION_VALUE = 40;

	/**
	 * The '<em><b>Pacingindication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACINGINDICATION
	 * @model name="pacingindication"
	 * @generated
	 * @ordered
	 */
	public static final int PACINGINDICATION_VALUE = 41;

	/**
	 * The '<em><b>Issecondoperator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSECONDOPERATOR
	 * @model name="issecondoperator"
	 * @generated
	 * @ordered
	 */
	public static final int ISSECONDOPERATOR_VALUE = 42;

	/**
	 * The '<em><b>Postpcitimi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTPCITIMI
	 * @model name="postpcitimi"
	 * @generated
	 * @ordered
	 */
	public static final int POSTPCITIMI_VALUE = 43;

	/**
	 * The '<em><b>Poststenosis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTSTENOSIS
	 * @model name="poststenosis"
	 * @generated
	 * @ordered
	 */
	public static final int POSTSTENOSIS_VALUE = 44;

	/**
	 * The '<em><b>Infiltration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFILTRATION
	 * @model name="infiltration"
	 * @generated
	 * @ordered
	 */
	public static final int INFILTRATION_VALUE = 45;

	/**
	 * The '<em><b>Operation Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_TYPE
	 * @model name="operationType" literal="operation-type"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_TYPE_VALUE = 46;

	/**
	 * The '<em><b>Alignment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALIGNMENT
	 * @model name="alignment"
	 * @generated
	 * @ordered
	 */
	public static final int ALIGNMENT_VALUE = 47;

	/**
	 * The '<em><b>Custominstrumentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOMINSTRUMENTATION
	 * @model name="custominstrumentation"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOMINSTRUMENTATION_VALUE = 48;

	/**
	 * The '<em><b>Substitute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTE
	 * @model name="substitute"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTITUTE_VALUE = 49;

	/**
	 * The '<em><b>Modularneck</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULARNECK
	 * @model name="modularneck"
	 * @generated
	 * @ordered
	 */
	public static final int MODULARNECK_VALUE = 50;

	/**
	 * The '<em><b>Materialsremark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATERIALSREMARK
	 * @model name="materialsremark"
	 * @generated
	 * @ordered
	 */
	public static final int MATERIALSREMARK_VALUE = 51;

	/**
	 * The '<em><b>Ortho Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORTHO_DEVICE
	 * @model name="orthoDevice" literal="ortho-device"
	 * @generated
	 * @ordered
	 */
	public static final int ORTHO_DEVICE_VALUE = 52;

	/**
	 * The '<em><b>Devicename</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICENAME
	 * @model name="devicename"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICENAME_VALUE = 53;

	/**
	 * The '<em><b>Distributor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTOR
	 * @model name="distributor"
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTOR_VALUE = 54;

	/**
	 * The '<em><b>Manufacturer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUFACTURER
	 * @model name="manufacturer"
	 * @generated
	 * @ordered
	 */
	public static final int MANUFACTURER_VALUE = 55;

	/**
	 * The '<em><b>Femoralreplacement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMORALREPLACEMENT
	 * @model name="femoralreplacement"
	 * @generated
	 * @ordered
	 */
	public static final int FEMORALREPLACEMENT_VALUE = 56;

	/**
	 * The '<em><b>Acetabularreplacement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACETABULARREPLACEMENT
	 * @model name="acetabularreplacement"
	 * @generated
	 * @ordered
	 */
	public static final int ACETABULARREPLACEMENT_VALUE = 57;

	/**
	 * The '<em><b>Revisedcomponent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVISEDCOMPONENT
	 * @model name="revisedcomponent"
	 * @generated
	 * @ordered
	 */
	public static final int REVISEDCOMPONENT_VALUE = 58;

	/**
	 * The '<em><b>Cardioversion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDIOVERSION
	 * @model name="cardioversion"
	 * @generated
	 * @ordered
	 */
	public static final int CARDIOVERSION_VALUE = 59;

	/**
	 * The '<em><b>Motivation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTIVATION
	 * @model name="motivation"
	 * @generated
	 * @ordered
	 */
	public static final int MOTIVATION_VALUE = 60;

	/**
	 * The '<em><b>Criteriacomments</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITERIACOMMENTS
	 * @model name="criteriacomments"
	 * @generated
	 * @ordered
	 */
	public static final int CRITERIACOMMENTS_VALUE = 61;

	/**
	 * The '<em><b>Comorbiditiescomments</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMORBIDITIESCOMMENTS
	 * @model name="comorbiditiescomments"
	 * @generated
	 * @ordered
	 */
	public static final int COMORBIDITIESCOMMENTS_VALUE = 62;

	/**
	 * The '<em><b>Informationprimo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATIONPRIMO
	 * @model name="informationprimo"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATIONPRIMO_VALUE = 63;

	/**
	 * The '<em><b>Lvef</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LVEF
	 * @model name="lvef"
	 * @generated
	 * @ordered
	 */
	public static final int LVEF_VALUE = 64;

	/**
	 * The '<em><b>Qrs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QRS
	 * @model name="qrs"
	 * @generated
	 * @ordered
	 */
	public static final int QRS_VALUE = 65;

	/**
	 * The '<em><b>Diameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAMETER
	 * @model name="diameter"
	 * @generated
	 * @ordered
	 */
	public static final int DIAMETER_VALUE = 66;

	/**
	 * The '<em><b>Cardiacasynchrony</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDIACASYNCHRONY
	 * @model name="cardiacasynchrony"
	 * @generated
	 * @ordered
	 */
	public static final int CARDIACASYNCHRONY_VALUE = 67;

	/**
	 * The '<em><b>Indication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDICATION
	 * @model name="indication"
	 * @generated
	 * @ordered
	 */
	public static final int INDICATION_VALUE = 68;

	/**
	 * The '<em><b>Registration Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTRATION_TYPE
	 * @model name="registrationType" literal="registration-type"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRATION_TYPE_VALUE = 69;

	/**
	 * The '<em><b>Declarationdas28</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLARATIONDAS28
	 * @model name="declarationdas28"
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATIONDAS28_VALUE = 70;

	/**
	 * The '<em><b>Declarationhaq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLARATIONHAQ
	 * @model name="declarationhaq"
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATIONHAQ_VALUE = 71;

	/**
	 * The '<em><b>Declarationinfiltration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLARATIONINFILTRATION
	 * @model name="declarationinfiltration"
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATIONINFILTRATION_VALUE = 72;

	/**
	 * The '<em><b>Declarationmedication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLARATIONMEDICATION
	 * @model name="declarationmedication"
	 * @generated
	 * @ordered
	 */
	public static final int DECLARATIONMEDICATION_VALUE = 73;

	/**
	 * The '<em><b>Substance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE
	 * @model name="substance"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_VALUE = 74;

	/**
	 * The '<em><b>Medicationstopinfo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATIONSTOPINFO
	 * @model name="medicationstopinfo"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATIONSTOPINFO_VALUE = 75;

	/**
	 * The '<em><b>Chapter4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAPTER4
	 * @model name="chapter4"
	 * @generated
	 * @ordered
	 */
	public static final int CHAPTER4_VALUE = 76;

	/**
	 * The '<em><b>Dosis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOSIS
	 * @model name="dosis"
	 * @generated
	 * @ordered
	 */
	public static final int DOSIS_VALUE = 77;

	/**
	 * The '<em><b>Frequency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENCY
	 * @model name="frequency"
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_VALUE = 78;

	/**
	 * The '<em><b>Route</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUTE
	 * @model name="route"
	 * @generated
	 * @ordered
	 */
	public static final int ROUTE_VALUE = 79;

	/**
	 * An array of all the '<em><b>CDITEMRE Gvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDITEMREGvalues[] VALUES_ARRAY =
		new CDITEMREGvalues[] {
			ISINITIALINTERVENTION,
			DOMINANCE,
			EXISTINGBRIDGE,
			OBSERVEDLESION,
			SEGMENT,
			TOTALTREATEDLENGTH,
			BLOODVESSELDIAMETER,
			PROCEDURE_DEVICE,
			CONTRASTPRODUCTUSED,
			REIMBURSEMENTNOMENCLATURETYPE,
			INTERVENTION_TYPE,
			INTERVENTION_SITE,
			APPROACH,
			NAVIGATIONCOMPUTER,
			INTERVENTION_DEVICE,
			BEARINGSURFACE,
			GRAFTUSED,
			ACETABULARINTERFACE,
			FEMORALINTERFACE,
			STEM,
			CUP,
			HEAD,
			NECK,
			INSERT,
			PROSTHESIS_OTHER,
			BRAND,
			PRODUCER,
			SIZE,
			REVISIONTECHNIC,
			KNEEIMPLANTTYPE,
			KNEEINSERT,
			TIBIALINTERFACE,
			PATELLARINTERFACE,
			PATELLA,
			FEMUR,
			TIBIA,
			TICKNESS,
			KNEEPROSTHESIS,
			REVISIONCOMPONENT,
			DOCTORSREMARK,
			RESYNCHRONISATION,
			PACINGINDICATION,
			ISSECONDOPERATOR,
			POSTPCITIMI,
			POSTSTENOSIS,
			INFILTRATION,
			OPERATION_TYPE,
			ALIGNMENT,
			CUSTOMINSTRUMENTATION,
			SUBSTITUTE,
			MODULARNECK,
			MATERIALSREMARK,
			ORTHO_DEVICE,
			DEVICENAME,
			DISTRIBUTOR,
			MANUFACTURER,
			FEMORALREPLACEMENT,
			ACETABULARREPLACEMENT,
			REVISEDCOMPONENT,
			CARDIOVERSION,
			MOTIVATION,
			CRITERIACOMMENTS,
			COMORBIDITIESCOMMENTS,
			INFORMATIONPRIMO,
			LVEF,
			QRS,
			DIAMETER,
			CARDIACASYNCHRONY,
			INDICATION,
			REGISTRATION_TYPE,
			DECLARATIONDAS28,
			DECLARATIONHAQ,
			DECLARATIONINFILTRATION,
			DECLARATIONMEDICATION,
			SUBSTANCE,
			MEDICATIONSTOPINFO,
			CHAPTER4,
			DOSIS,
			FREQUENCY,
			ROUTE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDITEMRE Gvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDITEMREGvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDITEMRE Gvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMREGvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMREGvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITEMRE Gvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMREGvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMREGvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITEMRE Gvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMREGvalues get(int value) {
		switch (value) {
			case ISINITIALINTERVENTION_VALUE: return ISINITIALINTERVENTION;
			case DOMINANCE_VALUE: return DOMINANCE;
			case EXISTINGBRIDGE_VALUE: return EXISTINGBRIDGE;
			case OBSERVEDLESION_VALUE: return OBSERVEDLESION;
			case SEGMENT_VALUE: return SEGMENT;
			case TOTALTREATEDLENGTH_VALUE: return TOTALTREATEDLENGTH;
			case BLOODVESSELDIAMETER_VALUE: return BLOODVESSELDIAMETER;
			case PROCEDURE_DEVICE_VALUE: return PROCEDURE_DEVICE;
			case CONTRASTPRODUCTUSED_VALUE: return CONTRASTPRODUCTUSED;
			case REIMBURSEMENTNOMENCLATURETYPE_VALUE: return REIMBURSEMENTNOMENCLATURETYPE;
			case INTERVENTION_TYPE_VALUE: return INTERVENTION_TYPE;
			case INTERVENTION_SITE_VALUE: return INTERVENTION_SITE;
			case APPROACH_VALUE: return APPROACH;
			case NAVIGATIONCOMPUTER_VALUE: return NAVIGATIONCOMPUTER;
			case INTERVENTION_DEVICE_VALUE: return INTERVENTION_DEVICE;
			case BEARINGSURFACE_VALUE: return BEARINGSURFACE;
			case GRAFTUSED_VALUE: return GRAFTUSED;
			case ACETABULARINTERFACE_VALUE: return ACETABULARINTERFACE;
			case FEMORALINTERFACE_VALUE: return FEMORALINTERFACE;
			case STEM_VALUE: return STEM;
			case CUP_VALUE: return CUP;
			case HEAD_VALUE: return HEAD;
			case NECK_VALUE: return NECK;
			case INSERT_VALUE: return INSERT;
			case PROSTHESIS_OTHER_VALUE: return PROSTHESIS_OTHER;
			case BRAND_VALUE: return BRAND;
			case PRODUCER_VALUE: return PRODUCER;
			case SIZE_VALUE: return SIZE;
			case REVISIONTECHNIC_VALUE: return REVISIONTECHNIC;
			case KNEEIMPLANTTYPE_VALUE: return KNEEIMPLANTTYPE;
			case KNEEINSERT_VALUE: return KNEEINSERT;
			case TIBIALINTERFACE_VALUE: return TIBIALINTERFACE;
			case PATELLARINTERFACE_VALUE: return PATELLARINTERFACE;
			case PATELLA_VALUE: return PATELLA;
			case FEMUR_VALUE: return FEMUR;
			case TIBIA_VALUE: return TIBIA;
			case TICKNESS_VALUE: return TICKNESS;
			case KNEEPROSTHESIS_VALUE: return KNEEPROSTHESIS;
			case REVISIONCOMPONENT_VALUE: return REVISIONCOMPONENT;
			case DOCTORSREMARK_VALUE: return DOCTORSREMARK;
			case RESYNCHRONISATION_VALUE: return RESYNCHRONISATION;
			case PACINGINDICATION_VALUE: return PACINGINDICATION;
			case ISSECONDOPERATOR_VALUE: return ISSECONDOPERATOR;
			case POSTPCITIMI_VALUE: return POSTPCITIMI;
			case POSTSTENOSIS_VALUE: return POSTSTENOSIS;
			case INFILTRATION_VALUE: return INFILTRATION;
			case OPERATION_TYPE_VALUE: return OPERATION_TYPE;
			case ALIGNMENT_VALUE: return ALIGNMENT;
			case CUSTOMINSTRUMENTATION_VALUE: return CUSTOMINSTRUMENTATION;
			case SUBSTITUTE_VALUE: return SUBSTITUTE;
			case MODULARNECK_VALUE: return MODULARNECK;
			case MATERIALSREMARK_VALUE: return MATERIALSREMARK;
			case ORTHO_DEVICE_VALUE: return ORTHO_DEVICE;
			case DEVICENAME_VALUE: return DEVICENAME;
			case DISTRIBUTOR_VALUE: return DISTRIBUTOR;
			case MANUFACTURER_VALUE: return MANUFACTURER;
			case FEMORALREPLACEMENT_VALUE: return FEMORALREPLACEMENT;
			case ACETABULARREPLACEMENT_VALUE: return ACETABULARREPLACEMENT;
			case REVISEDCOMPONENT_VALUE: return REVISEDCOMPONENT;
			case CARDIOVERSION_VALUE: return CARDIOVERSION;
			case MOTIVATION_VALUE: return MOTIVATION;
			case CRITERIACOMMENTS_VALUE: return CRITERIACOMMENTS;
			case COMORBIDITIESCOMMENTS_VALUE: return COMORBIDITIESCOMMENTS;
			case INFORMATIONPRIMO_VALUE: return INFORMATIONPRIMO;
			case LVEF_VALUE: return LVEF;
			case QRS_VALUE: return QRS;
			case DIAMETER_VALUE: return DIAMETER;
			case CARDIACASYNCHRONY_VALUE: return CARDIACASYNCHRONY;
			case INDICATION_VALUE: return INDICATION;
			case REGISTRATION_TYPE_VALUE: return REGISTRATION_TYPE;
			case DECLARATIONDAS28_VALUE: return DECLARATIONDAS28;
			case DECLARATIONHAQ_VALUE: return DECLARATIONHAQ;
			case DECLARATIONINFILTRATION_VALUE: return DECLARATIONINFILTRATION;
			case DECLARATIONMEDICATION_VALUE: return DECLARATIONMEDICATION;
			case SUBSTANCE_VALUE: return SUBSTANCE;
			case MEDICATIONSTOPINFO_VALUE: return MEDICATIONSTOPINFO;
			case CHAPTER4_VALUE: return CHAPTER4;
			case DOSIS_VALUE: return DOSIS;
			case FREQUENCY_VALUE: return FREQUENCY;
			case ROUTE_VALUE: return ROUTE;
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
	private CDITEMREGvalues(int value, String name, String literal) {
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
	
} //CDITEMREGvalues
