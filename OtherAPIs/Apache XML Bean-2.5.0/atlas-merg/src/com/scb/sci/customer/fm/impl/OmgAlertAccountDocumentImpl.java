/*
 * An XML document type.
 * Localname: omgAlertAccount
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.OmgAlertAccountDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one omgAlertAccount(@) element.
 *
 * This is a complex type.
 */
public class OmgAlertAccountDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.OmgAlertAccountDocument
{
    private static final long serialVersionUID = 1L;
    
    public OmgAlertAccountDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OMGALERTACCOUNT$0 = 
        new javax.xml.namespace.QName("", "omgAlertAccount");
    
    
    /**
     * Gets the "omgAlertAccount" element
     */
    public java.lang.String getOmgAlertAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGALERTACCOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "omgAlertAccount" element
     */
    public org.apache.xmlbeans.XmlString xgetOmgAlertAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGALERTACCOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "omgAlertAccount" element
     */
    public void setOmgAlertAccount(java.lang.String omgAlertAccount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGALERTACCOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMGALERTACCOUNT$0);
            }
            target.setStringValue(omgAlertAccount);
        }
    }
    
    /**
     * Sets (as xml) the "omgAlertAccount" element
     */
    public void xsetOmgAlertAccount(org.apache.xmlbeans.XmlString omgAlertAccount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGALERTACCOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMGALERTACCOUNT$0);
            }
            target.set(omgAlertAccount);
        }
    }
}
