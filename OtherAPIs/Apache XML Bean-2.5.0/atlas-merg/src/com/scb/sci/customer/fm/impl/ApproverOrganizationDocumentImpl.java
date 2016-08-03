/*
 * An XML document type.
 * Localname: approverOrganization
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ApproverOrganizationDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one approverOrganization(@) element.
 *
 * This is a complex type.
 */
public class ApproverOrganizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ApproverOrganizationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ApproverOrganizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPROVERORGANIZATION$0 = 
        new javax.xml.namespace.QName("", "approverOrganization");
    
    
    /**
     * Gets the "approverOrganization" element
     */
    public java.lang.String getApproverOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERORGANIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "approverOrganization" element
     */
    public org.apache.xmlbeans.XmlString xgetApproverOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERORGANIZATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "approverOrganization" element
     */
    public void setApproverOrganization(java.lang.String approverOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERORGANIZATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPROVERORGANIZATION$0);
            }
            target.setStringValue(approverOrganization);
        }
    }
    
    /**
     * Sets (as xml) the "approverOrganization" element
     */
    public void xsetApproverOrganization(org.apache.xmlbeans.XmlString approverOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERORGANIZATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPROVERORGANIZATION$0);
            }
            target.set(approverOrganization);
        }
    }
}
