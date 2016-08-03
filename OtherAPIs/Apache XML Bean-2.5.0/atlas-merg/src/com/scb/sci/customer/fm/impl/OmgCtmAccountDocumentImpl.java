/*
 * An XML document type.
 * Localname: omgCtmAccount
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.OmgCtmAccountDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one omgCtmAccount(@) element.
 *
 * This is a complex type.
 */
public class OmgCtmAccountDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.OmgCtmAccountDocument
{
    private static final long serialVersionUID = 1L;
    
    public OmgCtmAccountDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OMGCTMACCOUNT$0 = 
        new javax.xml.namespace.QName("", "omgCtmAccount");
    
    
    /**
     * Gets the "omgCtmAccount" element
     */
    public java.lang.String getOmgCtmAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGCTMACCOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "omgCtmAccount" element
     */
    public org.apache.xmlbeans.XmlString xgetOmgCtmAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGCTMACCOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "omgCtmAccount" element
     */
    public void setOmgCtmAccount(java.lang.String omgCtmAccount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGCTMACCOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMGCTMACCOUNT$0);
            }
            target.setStringValue(omgCtmAccount);
        }
    }
    
    /**
     * Sets (as xml) the "omgCtmAccount" element
     */
    public void xsetOmgCtmAccount(org.apache.xmlbeans.XmlString omgCtmAccount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGCTMACCOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMGCTMACCOUNT$0);
            }
            target.set(omgCtmAccount);
        }
    }
}
