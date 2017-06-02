/**
 */
package gluemodel.CIM.IEC61970.Informative.InfERPSupport;

import gluemodel.CIM.IEC61968.Common.Document;

import gluemodel.CIM.IEC61970.Informative.InfCommon.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Org Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocOrgRole#getDocument <em>Document</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocOrgRole#getErpOrganisation <em>Erp Organisation</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getDocOrgRole()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Roles played between Organisations and Documents.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Roles played between Organisations and Documents.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Roles played between Organisations and Documents.' Profile\040documentation='Roles played between Organisations and Documents.'"
 * @generated
 */
public interface DocOrgRole extends Role {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.Common.Document#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(Document)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getDocOrgRole_Document()
	 * @see gluemodel.CIM.IEC61968.Common.Document#getErpOrganisationRoles
	 * @model opposite="ErpOrganisationRoles"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocOrgRole#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>Erp Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getDocumentRoles <em>Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation</em>' reference.
	 * @see #setErpOrganisation(ErpOrganisation)
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getDocOrgRole_ErpOrganisation()
	 * @see gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpOrganisation#getDocumentRoles
	 * @model opposite="DocumentRoles"
	 * @generated
	 */
	ErpOrganisation getErpOrganisation();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfERPSupport.DocOrgRole#getErpOrganisation <em>Erp Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Organisation</em>' reference.
	 * @see #getErpOrganisation()
	 * @generated
	 */
	void setErpOrganisation(ErpOrganisation value);

} // DocOrgRole
