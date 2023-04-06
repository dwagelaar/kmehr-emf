/**
 */
package be.fgov.ehealth.standards.kmehr.schema.kmehr.util;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KmehrXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmehrXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		KmehrPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the KmehrResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new KmehrResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new KmehrResourceFactoryImpl());
		}
		return registrations;
	}

} //KmehrXMLProcessor
