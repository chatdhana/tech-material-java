/*
 * An XML document type.
 * Localname: micCode
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.MicCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one micCode(@) element.
 *
 * This is a complex type.
 */
public class MicCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.MicCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MicCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MICCODE$0 = 
        new javax.xml.namespace.QName("", "micCode");
    
    
    /**
     * Gets the "micCode" element
     */
    public java.lang.String getMicCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MICCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "micCode" element
     */
    public org.apache.xmlbeans.XmlString xgetMicCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MICCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "micCode" element
     */
    public void setMicCode(java.lang.String micCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MICCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MICCODE$0);
            }
            target.setStringValue(micCode);
        }
    }
    
    /**
     * Sets (as xml) the "micCode" element
     */
    public void xsetMicCode(org.apache.xmlbeans.XmlString micCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MICCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MICCODE$0);
            }
            target.set(micCode);
        }
    }
}
