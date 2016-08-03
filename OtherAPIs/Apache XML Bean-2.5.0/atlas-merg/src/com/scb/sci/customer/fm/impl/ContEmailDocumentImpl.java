/*
 * An XML document type.
 * Localname: contEmail
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ContEmailDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one contEmail(@) element.
 *
 * This is a complex type.
 */
public class ContEmailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ContEmailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContEmailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEMAIL$0 = 
        new javax.xml.namespace.QName("", "contEmail");
    
    
    /**
     * Gets the "contEmail" element
     */
    public java.lang.String getContEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contEmail" element
     */
    public org.apache.xmlbeans.XmlString xgetContEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEMAIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contEmail" element
     */
    public void setContEmail(java.lang.String contEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTEMAIL$0);
            }
            target.setStringValue(contEmail);
        }
    }
    
    /**
     * Sets (as xml) the "contEmail" element
     */
    public void xsetContEmail(org.apache.xmlbeans.XmlString contEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTEMAIL$0);
            }
            target.set(contEmail);
        }
    }
}
