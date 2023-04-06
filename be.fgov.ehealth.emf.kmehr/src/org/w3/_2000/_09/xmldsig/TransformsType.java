/**
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transforms Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.TransformsType#getTransform <em>Transform</em>}</li>
 * </ul>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getTransformsType()
 * @model extendedMetaData="name='TransformsType' kind='elementOnly'"
 * @generated
 */
public interface TransformsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.TransformType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getTransformsType_Transform()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Transform' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransformType> getTransform();

} // TransformsType
