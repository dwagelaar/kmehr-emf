/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDIMPLANTATIONTYP Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDIMPLANTATIONTYPEvalues()
 * @model extendedMetaData="name='CD-IMPLANTATION-TYPEvalues'"
 * @generated
 */
public enum CDIMPLANTATIONTYPEvalues implements Enumerator {
	/**
	 * The '<em><b>Unimedial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIMEDIAL_VALUE
	 * @generated
	 * @ordered
	 */
	UNIMEDIAL(0, "unimedial", "unimedial"),

	/**
	 * The '<em><b>Unilateral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNILATERAL_VALUE
	 * @generated
	 * @ordered
	 */
	UNILATERAL(1, "unilateral", "unilateral"),

	/**
	 * The '<em><b>Bicompartimental</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BICOMPARTIMENTAL_VALUE
	 * @generated
	 * @ordered
	 */
	BICOMPARTIMENTAL(2, "bicompartimental", "bicompartimental"),

	/**
	 * The '<em><b>Femoropatellar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMOROPATELLAR_VALUE
	 * @generated
	 * @ordered
	 */
	FEMOROPATELLAR(3, "femoropatellar", "femoropatellar"),

	/**
	 * The '<em><b>Totalcr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALCR_VALUE
	 * @generated
	 * @ordered
	 */
	TOTALCR(4, "totalcr", "totalcr"),

	/**
	 * The '<em><b>Totalps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALPS_VALUE
	 * @generated
	 * @ordered
	 */
	TOTALPS(5, "totalps", "totalps"),

	/**
	 * The '<em><b>Totalcck</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALCCK_VALUE
	 * @generated
	 * @ordered
	 */
	TOTALCCK(6, "totalcck", "totalcck"),

	/**
	 * The '<em><b>Hinge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HINGE_VALUE
	 * @generated
	 * @ordered
	 */
	HINGE(7, "hinge", "hinge"),

	/**
	 * The '<em><b>Totaluc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALUC_VALUE
	 * @generated
	 * @ordered
	 */
	TOTALUC(8, "totaluc", "totaluc"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(9, "other", "other"),

	/**
	 * The '<em><b>Totalprosthesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALPROSTHESIS_VALUE
	 * @generated
	 * @ordered
	 */
	TOTALPROSTHESIS(10, "totalprosthesis", "totalprosthesis"),

	/**
	 * The '<em><b>Totalprosthesisdualmobility</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALPROSTHESISDUALMOBILITY_VALUE
	 * @generated
	 * @ordered
	 */
	TOTALPROSTHESISDUALMOBILITY(11, "totalprosthesisdualmobility", "totalprosthesisdualmobility"),

	/**
	 * The '<em><b>Hemiprosthesismonoblock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEMIPROSTHESISMONOBLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	HEMIPROSTHESISMONOBLOCK(12, "hemiprosthesismonoblock", "hemiprosthesismonoblock"),

	/**
	 * The '<em><b>Hemiprosthesisbipolar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEMIPROSTHESISBIPOLAR_VALUE
	 * @generated
	 * @ordered
	 */
	HEMIPROSTHESISBIPOLAR(13, "hemiprosthesisbipolar", "hemiprosthesisbipolar"),

	/**
	 * The '<em><b>Bicruciateretaining</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BICRUCIATERETAINING_VALUE
	 * @generated
	 * @ordered
	 */
	BICRUCIATERETAINING(14, "bicruciateretaining", "bicruciateretaining"),

	/**
	 * The '<em><b>Hemiprosthesismodular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEMIPROSTHESISMODULAR_VALUE
	 * @generated
	 * @ordered
	 */
	HEMIPROSTHESISMODULAR(15, "hemiprosthesismodular", "hemiprosthesismodular"),

	/**
	 * The '<em><b>Resurfacingfemhemi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESURFACINGFEMHEMI_VALUE
	 * @generated
	 * @ordered
	 */
	RESURFACINGFEMHEMI(16, "resurfacingfemhemi", "resurfacingfemhemi"),

	/**
	 * The '<em><b>Resurfacingfemcup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESURFACINGFEMCUP_VALUE
	 * @generated
	 * @ordered
	 */
	RESURFACINGFEMCUP(17, "resurfacingfemcup", "resurfacingfemcup"),

	/**
	 * The '<em><b>Resurfacingpartial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESURFACINGPARTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	RESURFACINGPARTIAL(18, "resurfacingpartial", "resurfacingpartial"),

	/**
	 * The '<em><b>Resurfacingpartialfemcondyle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESURFACINGPARTIALFEMCONDYLE_VALUE
	 * @generated
	 * @ordered
	 */
	RESURFACINGPARTIALFEMCONDYLE(19, "resurfacingpartialfemcondyle", "resurfacingpartialfemcondyle");

	/**
	 * The '<em><b>Unimedial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIMEDIAL
	 * @model name="unimedial"
	 * @generated
	 * @ordered
	 */
	public static final int UNIMEDIAL_VALUE = 0;

	/**
	 * The '<em><b>Unilateral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNILATERAL
	 * @model name="unilateral"
	 * @generated
	 * @ordered
	 */
	public static final int UNILATERAL_VALUE = 1;

	/**
	 * The '<em><b>Bicompartimental</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BICOMPARTIMENTAL
	 * @model name="bicompartimental"
	 * @generated
	 * @ordered
	 */
	public static final int BICOMPARTIMENTAL_VALUE = 2;

	/**
	 * The '<em><b>Femoropatellar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMOROPATELLAR
	 * @model name="femoropatellar"
	 * @generated
	 * @ordered
	 */
	public static final int FEMOROPATELLAR_VALUE = 3;

	/**
	 * The '<em><b>Totalcr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALCR
	 * @model name="totalcr"
	 * @generated
	 * @ordered
	 */
	public static final int TOTALCR_VALUE = 4;

	/**
	 * The '<em><b>Totalps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALPS
	 * @model name="totalps"
	 * @generated
	 * @ordered
	 */
	public static final int TOTALPS_VALUE = 5;

	/**
	 * The '<em><b>Totalcck</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALCCK
	 * @model name="totalcck"
	 * @generated
	 * @ordered
	 */
	public static final int TOTALCCK_VALUE = 6;

	/**
	 * The '<em><b>Hinge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HINGE
	 * @model name="hinge"
	 * @generated
	 * @ordered
	 */
	public static final int HINGE_VALUE = 7;

	/**
	 * The '<em><b>Totaluc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALUC
	 * @model name="totaluc"
	 * @generated
	 * @ordered
	 */
	public static final int TOTALUC_VALUE = 8;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 9;

	/**
	 * The '<em><b>Totalprosthesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALPROSTHESIS
	 * @model name="totalprosthesis"
	 * @generated
	 * @ordered
	 */
	public static final int TOTALPROSTHESIS_VALUE = 10;

	/**
	 * The '<em><b>Totalprosthesisdualmobility</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALPROSTHESISDUALMOBILITY
	 * @model name="totalprosthesisdualmobility"
	 * @generated
	 * @ordered
	 */
	public static final int TOTALPROSTHESISDUALMOBILITY_VALUE = 11;

	/**
	 * The '<em><b>Hemiprosthesismonoblock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEMIPROSTHESISMONOBLOCK
	 * @model name="hemiprosthesismonoblock"
	 * @generated
	 * @ordered
	 */
	public static final int HEMIPROSTHESISMONOBLOCK_VALUE = 12;

	/**
	 * The '<em><b>Hemiprosthesisbipolar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEMIPROSTHESISBIPOLAR
	 * @model name="hemiprosthesisbipolar"
	 * @generated
	 * @ordered
	 */
	public static final int HEMIPROSTHESISBIPOLAR_VALUE = 13;

	/**
	 * The '<em><b>Bicruciateretaining</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BICRUCIATERETAINING
	 * @model name="bicruciateretaining"
	 * @generated
	 * @ordered
	 */
	public static final int BICRUCIATERETAINING_VALUE = 14;

	/**
	 * The '<em><b>Hemiprosthesismodular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEMIPROSTHESISMODULAR
	 * @model name="hemiprosthesismodular"
	 * @generated
	 * @ordered
	 */
	public static final int HEMIPROSTHESISMODULAR_VALUE = 15;

	/**
	 * The '<em><b>Resurfacingfemhemi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESURFACINGFEMHEMI
	 * @model name="resurfacingfemhemi"
	 * @generated
	 * @ordered
	 */
	public static final int RESURFACINGFEMHEMI_VALUE = 16;

	/**
	 * The '<em><b>Resurfacingfemcup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESURFACINGFEMCUP
	 * @model name="resurfacingfemcup"
	 * @generated
	 * @ordered
	 */
	public static final int RESURFACINGFEMCUP_VALUE = 17;

	/**
	 * The '<em><b>Resurfacingpartial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESURFACINGPARTIAL
	 * @model name="resurfacingpartial"
	 * @generated
	 * @ordered
	 */
	public static final int RESURFACINGPARTIAL_VALUE = 18;

	/**
	 * The '<em><b>Resurfacingpartialfemcondyle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESURFACINGPARTIALFEMCONDYLE
	 * @model name="resurfacingpartialfemcondyle"
	 * @generated
	 * @ordered
	 */
	public static final int RESURFACINGPARTIALFEMCONDYLE_VALUE = 19;

	/**
	 * An array of all the '<em><b>CDIMPLANTATIONTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDIMPLANTATIONTYPEvalues[] VALUES_ARRAY =
		new CDIMPLANTATIONTYPEvalues[] {
			UNIMEDIAL,
			UNILATERAL,
			BICOMPARTIMENTAL,
			FEMOROPATELLAR,
			TOTALCR,
			TOTALPS,
			TOTALCCK,
			HINGE,
			TOTALUC,
			OTHER,
			TOTALPROSTHESIS,
			TOTALPROSTHESISDUALMOBILITY,
			HEMIPROSTHESISMONOBLOCK,
			HEMIPROSTHESISBIPOLAR,
			BICRUCIATERETAINING,
			HEMIPROSTHESISMODULAR,
			RESURFACINGFEMHEMI,
			RESURFACINGFEMCUP,
			RESURFACINGPARTIAL,
			RESURFACINGPARTIALFEMCONDYLE,
		};

	/**
	 * A public read-only list of all the '<em><b>CDIMPLANTATIONTYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDIMPLANTATIONTYPEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDIMPLANTATIONTYP Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDIMPLANTATIONTYPEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDIMPLANTATIONTYPEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDIMPLANTATIONTYP Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDIMPLANTATIONTYPEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDIMPLANTATIONTYPEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDIMPLANTATIONTYP Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDIMPLANTATIONTYPEvalues get(int value) {
		switch (value) {
			case UNIMEDIAL_VALUE: return UNIMEDIAL;
			case UNILATERAL_VALUE: return UNILATERAL;
			case BICOMPARTIMENTAL_VALUE: return BICOMPARTIMENTAL;
			case FEMOROPATELLAR_VALUE: return FEMOROPATELLAR;
			case TOTALCR_VALUE: return TOTALCR;
			case TOTALPS_VALUE: return TOTALPS;
			case TOTALCCK_VALUE: return TOTALCCK;
			case HINGE_VALUE: return HINGE;
			case TOTALUC_VALUE: return TOTALUC;
			case OTHER_VALUE: return OTHER;
			case TOTALPROSTHESIS_VALUE: return TOTALPROSTHESIS;
			case TOTALPROSTHESISDUALMOBILITY_VALUE: return TOTALPROSTHESISDUALMOBILITY;
			case HEMIPROSTHESISMONOBLOCK_VALUE: return HEMIPROSTHESISMONOBLOCK;
			case HEMIPROSTHESISBIPOLAR_VALUE: return HEMIPROSTHESISBIPOLAR;
			case BICRUCIATERETAINING_VALUE: return BICRUCIATERETAINING;
			case HEMIPROSTHESISMODULAR_VALUE: return HEMIPROSTHESISMODULAR;
			case RESURFACINGFEMHEMI_VALUE: return RESURFACINGFEMHEMI;
			case RESURFACINGFEMCUP_VALUE: return RESURFACINGFEMCUP;
			case RESURFACINGPARTIAL_VALUE: return RESURFACINGPARTIAL;
			case RESURFACINGPARTIALFEMCONDYLE_VALUE: return RESURFACINGPARTIALFEMCONDYLE;
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
	private CDIMPLANTATIONTYPEvalues(int value, String name, String literal) {
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
	
} //CDIMPLANTATIONTYPEvalues
