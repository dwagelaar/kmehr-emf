/**
 */
package org.w3._2001._04.xmlenc.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.w3._2001._04.xmlenc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.w3._2001._04.xmlenc.XmlencPackage
 * @generated
 */
public class XmlencSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmlencPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlencSwitch() {
		if (modelPackage == null) {
			modelPackage = XmlencPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XmlencPackage.AGREEMENT_METHOD_TYPE: {
				AgreementMethodType agreementMethodType = (AgreementMethodType)theEObject;
				T result = caseAgreementMethodType(agreementMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlencPackage.CIPHER_DATA_TYPE: {
				CipherDataType cipherDataType = (CipherDataType)theEObject;
				T result = caseCipherDataType(cipherDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlencPackage.CIPHER_REFERENCE_TYPE: {
				CipherReferenceType cipherReferenceType = (CipherReferenceType)theEObject;
				T result = caseCipherReferenceType(cipherReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlencPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlencPackage.ENCRYPTED_DATA_TYPE: {
				EncryptedDataType encryptedDataType = (EncryptedDataType)theEObject;
				T result = caseEncryptedDataType(encryptedDataType);
				if (result == null) result = caseEncryptedType(encryptedDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlencPackage.ENCRYPTED_KEY_TYPE: {
				EncryptedKeyType encryptedKeyType = (EncryptedKeyType)theEObject;
				T result = caseEncryptedKeyType(encryptedKeyType);
				if (result == null) result = caseEncryptedType(encryptedKeyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlencPackage.ENCRYPTED_TYPE: {
				EncryptedType encryptedType = (EncryptedType)theEObject;
				T result = caseEncryptedType(encryptedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlencPackage.ENCRYPTION_METHOD_TYPE: {
				EncryptionMethodType encryptionMethodType = (EncryptionMethodType)theEObject;
				T result = caseEncryptionMethodType(encryptionMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlencPackage.ENCRYPTION_PROPERTIES_TYPE: {
				EncryptionPropertiesType encryptionPropertiesType = (EncryptionPropertiesType)theEObject;
				T result = caseEncryptionPropertiesType(encryptionPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlencPackage.ENCRYPTION_PROPERTY_TYPE: {
				EncryptionPropertyType encryptionPropertyType = (EncryptionPropertyType)theEObject;
				T result = caseEncryptionPropertyType(encryptionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlencPackage.REFERENCE_LIST_TYPE: {
				ReferenceListType referenceListType = (ReferenceListType)theEObject;
				T result = caseReferenceListType(referenceListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlencPackage.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmlencPackage.TRANSFORMS_TYPE: {
				TransformsType transformsType = (TransformsType)theEObject;
				T result = caseTransformsType(transformsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agreement Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agreement Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgreementMethodType(AgreementMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cipher Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cipher Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCipherDataType(CipherDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cipher Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cipher Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCipherReferenceType(CipherReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encrypted Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encrypted Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncryptedDataType(EncryptedDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encrypted Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encrypted Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncryptedKeyType(EncryptedKeyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encrypted Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encrypted Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncryptedType(EncryptedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encryption Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encryption Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncryptionMethodType(EncryptionMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encryption Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encryption Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncryptionPropertiesType(EncryptionPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encryption Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encryption Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncryptionPropertyType(EncryptionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceListType(ReferenceListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transforms Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transforms Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformsType(TransformsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XmlencSwitch
