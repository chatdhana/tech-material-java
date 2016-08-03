/*
 * An XML document type.
 * Localname: documentOriginatingOrganization
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DocumentOriginatingOrganizationDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one documentOriginatingOrganization(@) element.
 *
 * This is a complex type.
 */
public class DocumentOriginatingOrganizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DocumentOriginatingOrganizationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocumentOriginatingOrganizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTORIGINATINGORGANIZATION$0 = 
        new javax.xml.namespace.QName("", "documentOriginatingOrganization");
    
    
    /**
     * Gets the "documentOriginatingOrganization" element
     */
    public java.lang.String getDocumentOriginatingOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTORIGINATINGORGANIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentOriginatingOrganization" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentOriginatingOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTORIGINATINGORGANIZATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "documentOriginatingOrganization" element
     */
    public void setDocumentOriginatingOrganization(java.lang.String documentOriginatingOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTORIGINATINGORGANIZATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTORIGINATINGORGANIZATION$0);
            }
            target.setStringValue(documentOriginatingOrganization);
        }
    }
    
    /**
     * Sets (as xml) the "documentOriginatingOrganization" element
     */
    public void xsetDocumentOriginatingOrganization(org.apache.xmlbeans.XmlString documentOriginatingOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTORIGINATINGORGANIZATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTORIGINATINGORGANIZATION$0);
            }
            target.set(documentOriginatingOrganization);
        }
    }
}
