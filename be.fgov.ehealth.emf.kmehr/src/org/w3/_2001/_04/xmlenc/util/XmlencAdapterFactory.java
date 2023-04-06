/**
 */
package org.w3._2001._04.xmlenc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.w3._2001._04.xmlenc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.w3._2001._04.xmlenc.XmlencPackage
 * @generated
 */
public class XmlencAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmlencPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlencAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XmlencPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlencSwitch<Adapter> modelSwitch =
		new XmlencSwitch<Adapter>() {
			@Override
			public Adapter caseAgreementMethodType(AgreementMethodType object) {
				return createAgreementMethodTypeAdapter();
			}
			@Override
			public Adapter caseCipherDataType(CipherDataType object) {
				return createCipherDataTypeAdapter();
			}
			@Override
			public Adapter caseCipherReferenceType(CipherReferenceType object) {
				return createCipherReferenceTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEncryptedDataType(EncryptedDataType object) {
				return createEncryptedDataTypeAdapter();
			}
			@Override
			public Adapter caseEncryptedKeyType(EncryptedKeyType object) {
				return createEncryptedKeyTypeAdapter();
			}
			@Override
			public Adapter caseEncryptedType(EncryptedType object) {
				return createEncryptedTypeAdapter();
			}
			@Override
			public Adapter caseEncryptionMethodType(EncryptionMethodType object) {
				return createEncryptionMethodTypeAdapter();
			}
			@Override
			public Adapter caseEncryptionPropertiesType(EncryptionPropertiesType object) {
				return createEncryptionPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseEncryptionPropertyType(EncryptionPropertyType object) {
				return createEncryptionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseReferenceListType(ReferenceListType object) {
				return createReferenceListTypeAdapter();
			}
			@Override
			public Adapter caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			@Override
			public Adapter caseTransformsType(TransformsType object) {
				return createTransformsTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2001._04.xmlenc.AgreementMethodType <em>Agreement Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2001._04.xmlenc.AgreementMethodType
	 * @generated
	 */
	public Adapter createAgreementMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2001._04.xmlenc.CipherDataType <em>Cipher Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2001._04.xmlenc.CipherDataType
	 * @generated
	 */
	public Adapter createCipherDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2001._04.xmlenc.CipherReferenceType <em>Cipher Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2001._04.xmlenc.CipherReferenceType
	 * @generated
	 */
	public Adapter createCipherReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2001._04.xmlenc.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2001._04.xmlenc.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2001._04.xmlenc.EncryptedDataType <em>Encrypted Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2001._04.xmlenc.EncryptedDataType
	 * @generated
	 */
	public Adapter createEncryptedDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2001._04.xmlenc.EncryptedKeyType <em>Encrypted Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2001._04.xmlenc.EncryptedKeyType
	 * @generated
	 */
	public Adapter createEncryptedKeyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2001._04.xmlenc.EncryptedType <em>Encrypted Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2001._04.xmlenc.EncryptedType
	 * @generated
	 */
	public Adapter createEncryptedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2001._04.xmlenc.EncryptionMethodType <em>Encryption Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2001._04.xmlenc.EncryptionMethodType
	 * @generated
	 */
	public Adapter createEncryptionMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2001._04.xmlenc.EncryptionPropertiesType <em>Encryption Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2001._04.xmlenc.EncryptionPropertiesType
	 * @generated
	 */
	public Adapter createEncryptionPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2001._04.xmlenc.EncryptionPropertyType <em>Encryption Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2001._04.xmlenc.EncryptionPropertyType
	 * @generated
	 */
	public Adapter createEncryptionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2001._04.xmlenc.ReferenceListType <em>Reference List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2001._04.xmlenc.ReferenceListType
	 * @generated
	 */
	public Adapter createReferenceListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2001._04.xmlenc.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2001._04.xmlenc.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2001._04.xmlenc.TransformsType <em>Transforms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3._2001._04.xmlenc.TransformsType
	 * @generated
	 */
	public Adapter createTransformsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XmlencAdapterFactory
