/*
 * An XML document type.
 * Localname: approverCountry
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ApproverCountryDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one approverCountry(@) element.
 *
 * This is a complex type.
 */
public class ApproverCountryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ApproverCountryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ApproverCountryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPROVERCOUNTRY$0 = 
        new javax.xml.namespace.QName("", "approverCountry");
    
    
    /**
     * Gets the "approverCountry" element
     */
    public java.lang.String getApproverCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERCOUNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "approverCountry" element
     */
    public org.apache.xmlbeans.XmlString xgetApproverCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERCOUNTRY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "approverCountry" element
     */
    public void setApproverCountry(java.lang.String approverCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERCOUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPROVERCOUNTRY$0);
            }
            target.setStringValue(approverCountry);
        }
    }
    
    /**
     * Sets (as xml) the "approverCountry" element
     */
    public void xsetApproverCountry(org.apache.xmlbeans.XmlString approverCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERCOUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPROVERCOUNTRY$0);
            }
            target.set(approverCountry);
        }
    }
}
