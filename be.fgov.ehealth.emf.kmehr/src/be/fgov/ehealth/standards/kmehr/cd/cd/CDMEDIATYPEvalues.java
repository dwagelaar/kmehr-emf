/**
 */
package be.fgov.ehealth.standards.kmehr.cd.cd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CDMEDIATYP Evalues</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage#getCDMEDIATYPEvalues()
 * @model extendedMetaData="name='CD-MEDIATYPEvalues'"
 * @generated
 */
public enum CDMEDIATYPEvalues implements Enumerator {
	/**
	 * The '<em><b>Application Msword</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_MSWORD_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_MSWORD(0, "applicationMsword", "application/msword"),

	/**
	 * The '<em><b>Application Pdf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PDF_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_PDF(1, "applicationPdf", "application/pdf"),

	/**
	 * The '<em><b>Audio Basic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_BASIC_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO_BASIC(2, "audioBasic", "audio/basic"),

	/**
	 * The '<em><b>Audio K3 2adpcm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_K3_2ADPCM_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO_K3_2ADPCM(3, "audioK32adpcm", "audio/k32adpcm"),

	/**
	 * The '<em><b>Audio Mp3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_MP3_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO_MP3(4, "audioMp3", "audio/mp3"),

	/**
	 * The '<em><b>Image G3fax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_G3FAX_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_G3FAX(5, "imageG3fax", "image/g3fax"),

	/**
	 * The '<em><b>Image Gif</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_GIF_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_GIF(6, "imageGif", "image/gif"),

	/**
	 * The '<em><b>Image Jpeg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_JPEG_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_JPEG(7, "imageJpeg", "image/jpeg"),

	/**
	 * The '<em><b>Image Png</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_PNG_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_PNG(8, "imagePng", "image/png"),

	/**
	 * The '<em><b>Image Tiff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_TIFF_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_TIFF(9, "imageTiff", "image/tiff"),

	/**
	 * The '<em><b>Model Vrml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_VRML_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_VRML(10, "modelVrml", "model/vrml"),

	/**
	 * The '<em><b>Multipart XHl7 Cda Level1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_XHL7_CDA_LEVEL1_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPART_XHL7_CDA_LEVEL1(11, "multipartXHl7CdaLevel1", "multipart/x-hl7-cda-level1"),

	/**
	 * The '<em><b>Text Html</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_HTML_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_HTML(12, "textHtml", "text/html"),

	/**
	 * The '<em><b>Text Plain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_PLAIN_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_PLAIN(13, "textPlain", "text/plain"),

	/**
	 * The '<em><b>Text Rtf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_RTF_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_RTF(14, "textRtf", "text/rtf"),

	/**
	 * The '<em><b>Text Sgml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_SGML_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_SGML(15, "textSgml", "text/sgml"),

	/**
	 * The '<em><b>Text XHl7 Ft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_XHL7_FT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_XHL7_FT(16, "textXHl7Ft", "text/x-hl7-ft"),

	/**
	 * The '<em><b>Text Xml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_XML_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_XML(17, "textXml", "text/xml"),

	/**
	 * The '<em><b>Video Mpeg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_MPEG_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_MPEG(18, "videoMpeg", "video/mpeg"),

	/**
	 * The '<em><b>Video XAvi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_XAVI_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_XAVI(19, "videoXAvi", "video/x-avi"),

	/**
	 * The '<em><b>Kmb Transaction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMB_TRANSACTION_VALUE
	 * @generated
	 * @ordered
	 */
	KMB_TRANSACTION(20, "kmbTransaction", "kmb/transaction"),

	/**
	 * The '<em><b>Image Dicom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_DICOM_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_DICOM(21, "imageDicom", "image/dicom"),

	/**
	 * The '<em><b>Application Hl7 Sda Xml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_HL7_SDA_XML_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_HL7_SDA_XML(22, "applicationHl7SdaXml", "application/hl7-sda+xml"),

	/**
	 * The '<em><b>Application Rtf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_RTF_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_RTF(23, "applicationRtf", "application/rtf");

	/**
	 * The '<em><b>Application Msword</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_MSWORD
	 * @model name="applicationMsword" literal="application/msword"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_MSWORD_VALUE = 0;

	/**
	 * The '<em><b>Application Pdf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PDF
	 * @model name="applicationPdf" literal="application/pdf"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_PDF_VALUE = 1;

	/**
	 * The '<em><b>Audio Basic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_BASIC
	 * @model name="audioBasic" literal="audio/basic"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_BASIC_VALUE = 2;

	/**
	 * The '<em><b>Audio K3 2adpcm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_K3_2ADPCM
	 * @model name="audioK32adpcm" literal="audio/k32adpcm"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_K3_2ADPCM_VALUE = 3;

	/**
	 * The '<em><b>Audio Mp3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_MP3
	 * @model name="audioMp3" literal="audio/mp3"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_MP3_VALUE = 4;

	/**
	 * The '<em><b>Image G3fax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_G3FAX
	 * @model name="imageG3fax" literal="image/g3fax"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_G3FAX_VALUE = 5;

	/**
	 * The '<em><b>Image Gif</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_GIF
	 * @model name="imageGif" literal="image/gif"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_GIF_VALUE = 6;

	/**
	 * The '<em><b>Image Jpeg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_JPEG
	 * @model name="imageJpeg" literal="image/jpeg"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_JPEG_VALUE = 7;

	/**
	 * The '<em><b>Image Png</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_PNG
	 * @model name="imagePng" literal="image/png"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_PNG_VALUE = 8;

	/**
	 * The '<em><b>Image Tiff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_TIFF
	 * @model name="imageTiff" literal="image/tiff"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_TIFF_VALUE = 9;

	/**
	 * The '<em><b>Model Vrml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_VRML
	 * @model name="modelVrml" literal="model/vrml"
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_VRML_VALUE = 10;

	/**
	 * The '<em><b>Multipart XHl7 Cda Level1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPART_XHL7_CDA_LEVEL1
	 * @model name="multipartXHl7CdaLevel1" literal="multipart/x-hl7-cda-level1"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPART_XHL7_CDA_LEVEL1_VALUE = 11;

	/**
	 * The '<em><b>Text Html</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_HTML
	 * @model name="textHtml" literal="text/html"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_HTML_VALUE = 12;

	/**
	 * The '<em><b>Text Plain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_PLAIN
	 * @model name="textPlain" literal="text/plain"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_PLAIN_VALUE = 13;

	/**
	 * The '<em><b>Text Rtf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_RTF
	 * @model name="textRtf" literal="text/rtf"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_RTF_VALUE = 14;

	/**
	 * The '<em><b>Text Sgml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_SGML
	 * @model name="textSgml" literal="text/sgml"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_SGML_VALUE = 15;

	/**
	 * The '<em><b>Text XHl7 Ft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_XHL7_FT
	 * @model name="textXHl7Ft" literal="text/x-hl7-ft"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_XHL7_FT_VALUE = 16;

	/**
	 * The '<em><b>Text Xml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_XML
	 * @model name="textXml" literal="text/xml"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_XML_VALUE = 17;

	/**
	 * The '<em><b>Video Mpeg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_MPEG
	 * @model name="videoMpeg" literal="video/mpeg"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_MPEG_VALUE = 18;

	/**
	 * The '<em><b>Video XAvi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_XAVI
	 * @model name="videoXAvi" literal="video/x-avi"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_XAVI_VALUE = 19;

	/**
	 * The '<em><b>Kmb Transaction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMB_TRANSACTION
	 * @model name="kmbTransaction" literal="kmb/transaction"
	 * @generated
	 * @ordered
	 */
	public static final int KMB_TRANSACTION_VALUE = 20;

	/**
	 * The '<em><b>Image Dicom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_DICOM
	 * @model name="imageDicom" literal="image/dicom"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_DICOM_VALUE = 21;

	/**
	 * The '<em><b>Application Hl7 Sda Xml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_HL7_SDA_XML
	 * @model name="applicationHl7SdaXml" literal="application/hl7-sda+xml"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_HL7_SDA_XML_VALUE = 22;

	/**
	 * The '<em><b>Application Rtf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_RTF
	 * @model name="applicationRtf" literal="application/rtf"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_RTF_VALUE = 23;

	/**
	 * An array of all the '<em><b>CDMEDIATYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CDMEDIATYPEvalues[] VALUES_ARRAY =
		new CDMEDIATYPEvalues[] {
			APPLICATION_MSWORD,
			APPLICATION_PDF,
			AUDIO_BASIC,
			AUDIO_K3_2ADPCM,
			AUDIO_MP3,
			IMAGE_G3FAX,
			IMAGE_GIF,
			IMAGE_JPEG,
			IMAGE_PNG,
			IMAGE_TIFF,
			MODEL_VRML,
			MULTIPART_XHL7_CDA_LEVEL1,
			TEXT_HTML,
			TEXT_PLAIN,
			TEXT_RTF,
			TEXT_SGML,
			TEXT_XHL7_FT,
			TEXT_XML,
			VIDEO_MPEG,
			VIDEO_XAVI,
			KMB_TRANSACTION,
			IMAGE_DICOM,
			APPLICATION_HL7_SDA_XML,
			APPLICATION_RTF,
		};

	/**
	 * A public read-only list of all the '<em><b>CDMEDIATYP Evalues</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CDMEDIATYPEvalues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CDMEDIATYP Evalues</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMEDIATYPEvalues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDMEDIATYPEvalues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDMEDIATYP Evalues</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMEDIATYPEvalues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CDMEDIATYPEvalues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CDMEDIATYP Evalues</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CDMEDIATYPEvalues get(int value) {
		switch (value) {
			case APPLICATION_MSWORD_VALUE: return APPLICATION_MSWORD;
			case APPLICATION_PDF_VALUE: return APPLICATION_PDF;
			case AUDIO_BASIC_VALUE: return AUDIO_BASIC;
			case AUDIO_K3_2ADPCM_VALUE: return AUDIO_K3_2ADPCM;
			case AUDIO_MP3_VALUE: return AUDIO_MP3;
			case IMAGE_G3FAX_VALUE: return IMAGE_G3FAX;
			case IMAGE_GIF_VALUE: return IMAGE_GIF;
			case IMAGE_JPEG_VALUE: return IMAGE_JPEG;
			case IMAGE_PNG_VALUE: return IMAGE_PNG;
			case IMAGE_TIFF_VALUE: return IMAGE_TIFF;
			case MODEL_VRML_VALUE: return MODEL_VRML;
			case MULTIPART_XHL7_CDA_LEVEL1_VALUE: return MULTIPART_XHL7_CDA_LEVEL1;
			case TEXT_HTML_VALUE: return TEXT_HTML;
			case TEXT_PLAIN_VALUE: return TEXT_PLAIN;
			case TEXT_RTF_VALUE: return TEXT_RTF;
			case TEXT_SGML_VALUE: return TEXT_SGML;
			case TEXT_XHL7_FT_VALUE: return TEXT_XHL7_FT;
			case TEXT_XML_VALUE: return TEXT_XML;
			case VIDEO_MPEG_VALUE: return VIDEO_MPEG;
			case VIDEO_XAVI_VALUE: return VIDEO_XAVI;
			case KMB_TRANSACTION_VALUE: return KMB_TRANSACTION;
			case IMAGE_DICOM_VALUE: return IMAGE_DICOM;
			case APPLICATION_HL7_SDA_XML_VALUE: return APPLICATION_HL7_SDA_XML;
			case APPLICATION_RTF_VALUE: return APPLICATION_RTF;
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
	private CDMEDIATYPEvalues(int value, String name, String literal) {
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
	
} //CDMEDIATYPEvalues
