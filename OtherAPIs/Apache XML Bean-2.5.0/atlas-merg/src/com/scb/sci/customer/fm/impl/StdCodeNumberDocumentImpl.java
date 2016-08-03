/*
 * An XML document type.
 * Localname: stdCodeNumber
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.StdCodeNumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one stdCodeNumber(@) element.
 *
 * This is a complex type.
 */
public class StdCodeNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.StdCodeNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public StdCodeNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STDCODENUMBER$0 = 
        new javax.xml.namespace.QName("", "stdCodeNumber");
    
    
    /**
     * Gets the "stdCodeNumber" element
     */
    public java.lang.String getStdCodeNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STDCODENUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stdCodeNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetStdCodeNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STDCODENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "stdCodeNumber" element
     */
    public void setStdCodeNumber(java.lang.String stdCodeNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STDCODENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STDCODENUMBER$0);
            }
            target.setStringValue(stdCodeNumber);
        }
    }
    
    /**
     * Sets (as xml) the "stdCodeNumber" element
     */
    public void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STDCODENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STDCODENUMBER$0);
            }
            target.set(stdCodeNumber);
        }
    }
}
