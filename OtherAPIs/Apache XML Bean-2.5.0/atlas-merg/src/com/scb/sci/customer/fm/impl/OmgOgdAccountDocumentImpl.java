/*
 * An XML document type.
 * Localname: omgOgdAccount
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.OmgOgdAccountDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one omgOgdAccount(@) element.
 *
 * This is a complex type.
 */
public class OmgOgdAccountDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.OmgOgdAccountDocument
{
    private static final long serialVersionUID = 1L;
    
    public OmgOgdAccountDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OMGOGDACCOUNT$0 = 
        new javax.xml.namespace.QName("", "omgOgdAccount");
    
    
    /**
     * Gets the "omgOgdAccount" element
     */
    public java.lang.String getOmgOgdAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGOGDACCOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "omgOgdAccount" element
     */
    public org.apache.xmlbeans.XmlString xgetOmgOgdAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGOGDACCOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "omgOgdAccount" element
     */
    public void setOmgOgdAccount(java.lang.String omgOgdAccount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGOGDACCOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMGOGDACCOUNT$0);
            }
            target.setStringValue(omgOgdAccount);
        }
    }
    
    /**
     * Sets (as xml) the "omgOgdAccount" element
     */
    public void xsetOmgOgdAccount(org.apache.xmlbeans.XmlString omgOgdAccount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGOGDACCOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMGOGDACCOUNT$0);
            }
            target.set(omgOgdAccount);
        }
    }
}