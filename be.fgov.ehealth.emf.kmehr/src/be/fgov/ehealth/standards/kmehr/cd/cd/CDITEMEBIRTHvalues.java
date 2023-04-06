/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDITEMEBIRT Hvalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDITEMEBIRTHvalues()
 * @model extendedMetaData="name='CD-ITEM-EBIRTHvalues'"
 * @generated
 */
public enum CDITEMEBIRTHvalues implements Enumerator {
	/**
	 * The '<em><b>Multiparity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPARITY_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPARITY(0, "multiparity", "multiparity"),

	/**
	 * The '<em><b>Samesex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMESEX_VALUE
	 * @generated
	 * @ordered
	 */
	SAMESEX(1, "samesex", "samesex"),

	/**
	 * The '<em><b>Stillborn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STILLBORN_VALUE
	 * @generated
	 * @ordered
	 */
	STILLBORN(2, "stillborn", "stillborn"),

	/**
	 * The '<em><b>Birthplace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIRTHPLACE_VALUE
	 * @generated
	 * @ordered
	 */
	BIRTHPLACE(3, "birthplace", "birthplace"),

	/**
	 * The '<em><b>Birthrank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIRTHRANK_VALUE
	 * @generated
	 * @ordered
	 */
	BIRTHRANK(4, "birthrank", "birthrank"),

	/**
	 * The '<em><b>Partusnumber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTUSNUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	PARTUSNUMBER(5, "partusnumber", "partusnumber"),

	/**
	 * The '<em><b>Beforepregnancyweight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFOREPREGNANCYWEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	BEFOREPREGNANCYWEIGHT(6, "beforepregnancyweight", "beforepregnancyweight"),

	/**
	 * The '<em><b>Atdeliveryweight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATDELIVERYWEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	ATDELIVERYWEIGHT(7, "atdeliveryweight", "atdeliveryweight"),

	/**
	 * The '<em><b>Height</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	HEIGHT(8, "height", "height"),

	/**
	 * The '<em><b>Previouschildbirth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIOUSCHILDBIRTH_VALUE
	 * @generated
	 * @ordered
	 */
	PREVIOUSCHILDBIRTH(9, "previouschildbirth", "previouschildbirth"),

	/**
	 * The '<em><b>Previousbornalive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIOUSBORNALIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PREVIOUSBORNALIVE(10, "previousbornalive", "previousbornalive"),

	/**
	 * The '<em><b>Lastbabybirthdate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LASTBABYBIRTHDATE_VALUE
	 * @generated
	 * @ordered
	 */
	LASTBABYBIRTHDATE(11, "lastbabybirthdate", "lastbabybirthdate"),

	/**
	 * The '<em><b>Intermediatestillborndelivery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATESTILLBORNDELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERMEDIATESTILLBORNDELIVERY(12, "intermediatestillborndelivery", "intermediatestillborndelivery"),

	/**
	 * The '<em><b>Previouscaesarean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIOUSCAESAREAN_VALUE
	 * @generated
	 * @ordered
	 */
	PREVIOUSCAESAREAN(13, "previouscaesarean", "previouscaesarean"),

	/**
	 * The '<em><b>Parity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARITY_VALUE
	 * @generated
	 * @ordered
	 */
	PARITY(14, "parity", "parity"),

	/**
	 * The '<em><b>Pregnancyorigin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREGNANCYORIGIN_VALUE
	 * @generated
	 * @ordered
	 */
	PREGNANCYORIGIN(15, "pregnancyorigin", "pregnancyorigin"),

	/**
	 * The '<em><b>Hypertensiondiagnose</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYPERTENSIONDIAGNOSE_VALUE
	 * @generated
	 * @ordered
	 */
	HYPERTENSIONDIAGNOSE(16, "hypertensiondiagnose", "hypertensiondiagnose"),

	/**
	 * The '<em><b>Diabetesdiagnose</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIABETESDIAGNOSE_VALUE
	 * @generated
	 * @ordered
	 */
	DIABETESDIAGNOSE(17, "diabetesdiagnose", "diabetesdiagnose"),

	/**
	 * The '<em><b>HI Vdiagnose</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HI_VDIAGNOSE_VALUE
	 * @generated
	 * @ordered
	 */
	HI_VDIAGNOSE(18, "HIVdiagnose", "HIVdiagnose"),

	/**
	 * The '<em><b>Pregnancyduration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREGNANCYDURATION_VALUE
	 * @generated
	 * @ordered
	 */
	PREGNANCYDURATION(19, "pregnancyduration", "pregnancyduration"),

	/**
	 * The '<em><b>Childposition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILDPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	CHILDPOSITION(20, "childposition", "childposition"),

	/**
	 * The '<em><b>Inductiondelivery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDUCTIONDELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	INDUCTIONDELIVERY(21, "inductiondelivery", "inductiondelivery"),

	/**
	 * The '<em><b>Epiduralanalgesia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPIDURALANALGESIA_VALUE
	 * @generated
	 * @ordered
	 */
	EPIDURALANALGESIA(22, "epiduralanalgesia", "epiduralanalgesia"),

	/**
	 * The '<em><b>Rachianalagesia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RACHIANALAGESIA_VALUE
	 * @generated
	 * @ordered
	 */
	RACHIANALAGESIA(23, "rachianalagesia", "rachianalagesia"),

	/**
	 * The '<em><b>Foetalmonitoring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOETALMONITORING_VALUE
	 * @generated
	 * @ordered
	 */
	FOETALMONITORING(24, "foetalmonitoring", "foetalmonitoring"),

	/**
	 * The '<em><b>Streptococcusbcolonization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREPTOCOCCUSBCOLONIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	STREPTOCOCCUSBCOLONIZATION(25, "streptococcusbcolonization", "streptococcusbcolonization"),

	/**
	 * The '<em><b>Intrapartalsbgprophylaxis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTRAPARTALSBGPROPHYLAXIS_VALUE
	 * @generated
	 * @ordered
	 */
	INTRAPARTALSBGPROPHYLAXIS(26, "intrapartalsbgprophylaxis", "intrapartalsbgprophylaxis"),

	/**
	 * The '<em><b>Deliveryway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVERYWAY_VALUE
	 * @generated
	 * @ordered
	 */
	DELIVERYWAY(27, "deliveryway", "deliveryway"),

	/**
	 * The '<em><b>Episiotomy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPISIOTOMY_VALUE
	 * @generated
	 * @ordered
	 */
	EPISIOTOMY(28, "episiotomy", "episiotomy"),

	/**
	 * The '<em><b>Caesareanindication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAESAREANINDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CAESAREANINDICATION(29, "caesareanindication", "caesareanindication"),

	/**
	 * The '<em><b>Breastfeeding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREASTFEEDING_VALUE
	 * @generated
	 * @ordered
	 */
	BREASTFEEDING(30, "breastfeeding", "breastfeeding"),

	/**
	 * The '<em><b>Atbirthweight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATBIRTHWEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	ATBIRTHWEIGHT(31, "atbirthweight", "atbirthweight"),

	/**
	 * The '<em><b>Apgarscore1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APGARSCORE1_VALUE
	 * @generated
	 * @ordered
	 */
	APGARSCORE1(32, "apgarscore1", "apgarscore1"),

	/**
	 * The '<em><b>Apgarscore5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APGARSCORE5_VALUE
	 * @generated
	 * @ordered
	 */
	APGARSCORE5(33, "apgarscore5", "apgarscore5"),

	/**
	 * The '<em><b>Artificialrespiration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTIFICIALRESPIRATION_VALUE
	 * @generated
	 * @ordered
	 */
	ARTIFICIALRESPIRATION(34, "artificialrespiration", "artificialrespiration"),

	/**
	 * The '<em><b>Neonataldept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEONATALDEPT_VALUE
	 * @generated
	 * @ordered
	 */
	NEONATALDEPT(35, "neonataldept", "neonataldept"),

	/**
	 * The '<em><b>Congenitalmalformation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONGENITALMALFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONGENITALMALFORMATION(36, "congenitalmalformation", "congenitalmalformation"),

	/**
	 * The '<em><b>Othermedicalrisk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERMEDICALRISK_VALUE
	 * @generated
	 * @ordered
	 */
	OTHERMEDICALRISK(37, "othermedicalrisk", "othermedicalrisk");

	/**
	 * The '<em><b>Multiparity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPARITY
	 * @model name="multiparity"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPARITY_VALUE = 0;

	/**
	 * The '<em><b>Samesex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMESEX
	 * @model name="samesex"
	 * @generated
	 * @ordered
	 */
	public static final int SAMESEX_VALUE = 1;

	/**
	 * The '<em><b>Stillborn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STILLBORN
	 * @model name="stillborn"
	 * @generated
	 * @ordered
	 */
	public static final int STILLBORN_VALUE = 2;

	/**
	 * The '<em><b>Birthplace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIRTHPLACE
	 * @model name="birthplace"
	 * @generated
	 * @ordered
	 */
	public static final int BIRTHPLACE_VALUE = 3;

	/**
	 * The '<em><b>Birthrank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIRTHRANK
	 * @model name="birthrank"
	 * @generated
	 * @ordered
	 */
	public static final int BIRTHRANK_VALUE = 4;

	/**
	 * The '<em><b>Partusnumber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTUSNUMBER
	 * @model name="partusnumber"
	 * @generated
	 * @ordered
	 */
	public static final int PARTUSNUMBER_VALUE = 5;

	/**
	 * The '<em><b>Beforepregnancyweight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFOREPREGNANCYWEIGHT
	 * @model name="beforepregnancyweight"
	 * @generated
	 * @ordered
	 */
	public static final int BEFOREPREGNANCYWEIGHT_VALUE = 6;

	/**
	 * The '<em><b>Atdeliveryweight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATDELIVERYWEIGHT
	 * @model name="atdeliveryweight"
	 * @generated
	 * @ordered
	 */
	public static final int ATDELIVERYWEIGHT_VALUE = 7;

	/**
	 * The '<em><b>Height</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEIGHT
	 * @model name="height"
	 * @generated
	 * @ordered
	 */
	public static final int HEIGHT_VALUE = 8;

	/**
	 * The '<em><b>Previouschildbirth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIOUSCHILDBIRTH
	 * @model name="previouschildbirth"
	 * @generated
	 * @ordered
	 */
	public static final int PREVIOUSCHILDBIRTH_VALUE = 9;

	/**
	 * The '<em><b>Previousbornalive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIOUSBORNALIVE
	 * @model name="previousbornalive"
	 * @generated
	 * @ordered
	 */
	public static final int PREVIOUSBORNALIVE_VALUE = 10;

	/**
	 * The '<em><b>Lastbabybirthdate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LASTBABYBIRTHDATE
	 * @model name="lastbabybirthdate"
	 * @generated
	 * @ordered
	 */
	public static final int LASTBABYBIRTHDATE_VALUE = 11;

	/**
	 * The '<em><b>Intermediatestillborndelivery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATESTILLBORNDELIVERY
	 * @model name="intermediatestillborndelivery"
	 * @generated
	 * @ordered
	 */
	public static final int INTERMEDIATESTILLBORNDELIVERY_VALUE = 12;

	/**
	 * The '<em><b>Previouscaesarean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIOUSCAESAREAN
	 * @model name="previouscaesarean"
	 * @generated
	 * @ordered
	 */
	public static final int PREVIOUSCAESAREAN_VALUE = 13;

	/**
	 * The '<em><b>Parity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARITY
	 * @model name="parity"
	 * @generated
	 * @ordered
	 */
	public static final int PARITY_VALUE = 14;

	/**
	 * The '<em><b>Pregnancyorigin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREGNANCYORIGIN
	 * @model name="pregnancyorigin"
	 * @generated
	 * @ordered
	 */
	public static final int PREGNANCYORIGIN_VALUE = 15;

	/**
	 * The '<em><b>Hypertensiondiagnose</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYPERTENSIONDIAGNOSE
	 * @model name="hypertensiondiagnose"
	 * @generated
	 * @ordered
	 */
	public static final int HYPERTENSIONDIAGNOSE_VALUE = 16;

	/**
	 * The '<em><b>Diabetesdiagnose</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIABETESDIAGNOSE
	 * @model name="diabetesdiagnose"
	 * @generated
	 * @ordered
	 */
	public static final int DIABETESDIAGNOSE_VALUE = 17;

	/**
	 * The '<em><b>HI Vdiagnose</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HI_VDIAGNOSE
	 * @model name="HIVdiagnose"
	 * @generated
	 * @ordered
	 */
	public static final int HI_VDIAGNOSE_VALUE = 18;

	/**
	 * The '<em><b>Pregnancyduration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREGNANCYDURATION
	 * @model name="pregnancyduration"
	 * @generated
	 * @ordered
	 */
	public static final int PREGNANCYDURATION_VALUE = 19;

	/**
	 * The '<em><b>Childposition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILDPOSITION
	 * @model name="childposition"
	 * @generated
	 * @ordered
	 */
	public static final int CHILDPOSITION_VALUE = 20;

	/**
	 * The '<em><b>Inductiondelivery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDUCTIONDELIVERY
	 * @model name="inductiondelivery"
	 * @generated
	 * @ordered
	 */
	public static final int INDUCTIONDELIVERY_VALUE = 21;

	/**
	 * The '<em><b>Epiduralanalgesia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPIDURALANALGESIA
	 * @model name="epiduralanalgesia"
	 * @generated
	 * @ordered
	 */
	public static final int EPIDURALANALGESIA_VALUE = 22;

	/**
	 * The '<em><b>Rachianalagesia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RACHIANALAGESIA
	 * @model name="rachianalagesia"
	 * @generated
	 * @ordered
	 */
	public static final int RACHIANALAGESIA_VALUE = 23;

	/**
	 * The '<em><b>Foetalmonitoring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOETALMONITORING
	 * @model name="foetalmonitoring"
	 * @generated
	 * @ordered
	 */
	public static final int FOETALMONITORING_VALUE = 24;

	/**
	 * The '<em><b>Streptococcusbcolonization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREPTOCOCCUSBCOLONIZATION
	 * @model name="streptococcusbcolonization"
	 * @generated
	 * @ordered
	 */
	public static final int STREPTOCOCCUSBCOLONIZATION_VALUE = 25;

	/**
	 * The '<em><b>Intrapartalsbgprophylaxis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTRAPARTALSBGPROPHYLAXIS
	 * @model name="intrapartalsbgprophylaxis"
	 * @generated
	 * @ordered
	 */
	public static final int INTRAPARTALSBGPROPHYLAXIS_VALUE = 26;

	/**
	 * The '<em><b>Deliveryway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVERYWAY
	 * @model name="deliveryway"
	 * @generated
	 * @ordered
	 */
	public static final int DELIVERYWAY_VALUE = 27;

	/**
	 * The '<em><b>Episiotomy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPISIOTOMY
	 * @model name="episiotomy"
	 * @generated
	 * @ordered
	 */
	public static final int EPISIOTOMY_VALUE = 28;

	/**
	 * The '<em><b>Caesareanindication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAESAREANINDICATION
	 * @model name="caesareanindication"
	 * @generated
	 * @ordered
	 */
	public static final int CAESAREANINDICATION_VALUE = 29;

	/**
	 * The '<em><b>Breastfeeding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREASTFEEDING
	 * @model name="breastfeeding"
	 * @generated
	 * @ordered
	 */
	public static final int BREASTFEEDING_VALUE = 30;

	/**
	 * The '<em><b>Atbirthweight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATBIRTHWEIGHT
	 * @model name="atbirthweight"
	 * @generated
	 * @ordered
	 */
	public static final int ATBIRTHWEIGHT_VALUE = 31;

	/**
	 * The '<em><b>Apgarscore1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APGARSCORE1
	 * @model name="apgarscore1"
	 * @generated
	 * @ordered
	 */
	public static final int APGARSCORE1_VALUE = 32;

	/**
	 * The '<em><b>Apgarscore5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APGARSCORE5
	 * @model name="apgarscore5"
	 * @generated
	 * @ordered
	 */
	public static final int APGARSCORE5_VALUE = 33;

	/**
	 * The '<em><b>Artificialrespiration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTIFICIALRESPIRATION
	 * @model name="artificialrespiration"
	 * @generated
	 * @ordered
	 */
	public static final int ARTIFICIALRESPIRATION_VALUE = 34;

	/**
	 * The '<em><b>Neonataldept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEONATALDEPT
	 * @model name="neonataldept"
	 * @generated
	 * @ordered
	 */
	public static final int NEONATALDEPT_VALUE = 35;

	/**
	 * The '<em><b>Congenitalmalformation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONGENITALMALFORMATION
	 * @model name="congenitalmalformation"
	 * @generated
	 * @ordered
	 */
	public static final int CONGENITALMALFORMATION_VALUE = 36;

	/**
	 * The '<em><b>Othermedicalrisk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERMEDICALRISK
	 * @model name="othermedicalrisk"
	 * @generated
	 * @ordered
	 */
	public static final int OTHERMEDICALRISK_VALUE = 37;

	/**
	 * An array of all the '<em><b>CDITEMEBIRT Hvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDITEMEBIRTHvalues[] VALUES_ARRAY =
		new CDITEMEBIRTHvalues[] {
			MULTIPARITY,
			SAMESEX,
			STILLBORN,
			BIRTHPLACE,
			BIRTHRANK,
			PARTUSNUMBER,
			BEFOREPREGNANCYWEIGHT,
			ATDELIVERYWEIGHT,
			HEIGHT,
			PREVIOUSCHILDBIRTH,
			PREVIOUSBORNALIVE,
			LASTBABYBIRTHDATE,
			INTERMEDIATESTILLBORNDELIVERY,
			PREVIOUSCAESAREAN,
			PARITY,
			PREGNANCYORIGIN,
			HYPERTENSIONDIAGNOSE,
			DIABETESDIAGNOSE,
			HI_VDIAGNOSE,
			PREGNANCYDURATION,
			CHILDPOSITION,
			INDUCTIONDELIVERY,
			EPIDURALANALGESIA,
			RACHIANALAGESIA,
			FOETALMONITORING,
			STREPTOCOCCUSBCOLONIZATION,
			INTRAPARTALSBGPROPHYLAXIS,
			DELIVERYWAY,
			EPISIOTOMY,
			CAESAREANINDICATION,
			BREASTFEEDING,
			ATBIRTHWEIGHT,
			APGARSCORE1,
			APGARSCORE5,
			ARTIFICIALRESPIRATION,
			NEONATALDEPT,
			CONGENITALMALFORMATION,
			OTHERMEDICALRISK,
		};

	/**
	 * A public read-only list of all the '<em><b>CDITEMEBIRT Hvalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDITEMEBIRTHvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDITEMEBIRT Hvalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMEBIRTHvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMEBIRTHvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITEMEBIRT Hvalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMEBIRTHvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDITEMEBIRTHvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDITEMEBIRT Hvalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDITEMEBIRTHvalues get(int value) {
		switch (value) {
			case MULTIPARITY_VALUE: return MULTIPARITY;
			case SAMESEX_VALUE: return SAMESEX;
			case STILLBORN_VALUE: return STILLBORN;
			case BIRTHPLACE_VALUE: return BIRTHPLACE;
			case BIRTHRANK_VALUE: return BIRTHRANK;
			case PARTUSNUMBER_VALUE: return PARTUSNUMBER;
			case BEFOREPREGNANCYWEIGHT_VALUE: return BEFOREPREGNANCYWEIGHT;
			case ATDELIVERYWEIGHT_VALUE: return ATDELIVERYWEIGHT;
			case HEIGHT_VALUE: return HEIGHT;
			case PREVIOUSCHILDBIRTH_VALUE: return PREVIOUSCHILDBIRTH;
			case PREVIOUSBORNALIVE_VALUE: return PREVIOUSBORNALIVE;
			case LASTBABYBIRTHDATE_VALUE: return LASTBABYBIRTHDATE;
			case INTERMEDIATESTILLBORNDELIVERY_VALUE: return INTERMEDIATESTILLBORNDELIVERY;
			case PREVIOUSCAESAREAN_VALUE: return PREVIOUSCAESAREAN;
			case PARITY_VALUE: return PARITY;
			case PREGNANCYORIGIN_VALUE: return PREGNANCYORIGIN;
			case HYPERTENSIONDIAGNOSE_VALUE: return HYPERTENSIONDIAGNOSE;
			case DIABETESDIAGNOSE_VALUE: return DIABETESDIAGNOSE;
			case HI_VDIAGNOSE_VALUE: return HI_VDIAGNOSE;
			case PREGNANCYDURATION_VALUE: return PREGNANCYDURATION;
			case CHILDPOSITION_VALUE: return CHILDPOSITION;
			case INDUCTIONDELIVERY_VALUE: return INDUCTIONDELIVERY;
			case EPIDURALANALGESIA_VALUE: return EPIDURALANALGESIA;
			case RACHIANALAGESIA_VALUE: return RACHIANALAGESIA;
			case FOETALMONITORING_VALUE: return FOETALMONITORING;
			case STREPTOCOCCUSBCOLONIZATION_VALUE: return STREPTOCOCCUSBCOLONIZATION;
			case INTRAPARTALSBGPROPHYLAXIS_VALUE: return INTRAPARTALSBGPROPHYLAXIS;
			case DELIVERYWAY_VALUE: return DELIVERYWAY;
			case EPISIOTOMY_VALUE: return EPISIOTOMY;
			case CAESAREANINDICATION_VALUE: return CAESAREANINDICATION;
			case BREASTFEEDING_VALUE: return BREASTFEEDING;
			case ATBIRTHWEIGHT_VALUE: return ATBIRTHWEIGHT;
			case APGARSCORE1_VALUE: return APGARSCORE1;
			case APGARSCORE5_VALUE: return APGARSCORE5;
			case ARTIFICIALRESPIRATION_VALUE: return ARTIFICIALRESPIRATION;
			case NEONATALDEPT_VALUE: return NEONATALDEPT;
			case CONGENITALMALFORMATION_VALUE: return CONGENITALMALFORMATION;
			case OTHERMEDICALRISK_VALUE: return OTHERMEDICALRISK;
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
	private CDITEMEBIRTHvalues(int value, String name, String literal) {
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
	
} //CDITEMEBIRTHvalues
