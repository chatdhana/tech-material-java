/*
 * An XML document type.
 * Localname: stdCodeValue
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.StdCodeValueDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one stdCodeValue(@) element.
 *
 * This is a complex type.
 */
public class StdCodeValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.StdCodeValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public StdCodeValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STDCODEVALUE$0 = 
        new javax.xml.namespace.QName("", "stdCodeValue");
    
    
    /**
     * Gets the "stdCodeValue" element
     */
    public java.lang.String getStdCodeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STDCODEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stdCodeValue" element
     */
    public org.apache.xmlbeans.XmlString xgetStdCodeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STDCODEVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "stdCodeValue" element
     */
    public void setStdCodeValue(java.lang.String stdCodeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STDCODEVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STDCODEVALUE$0);
            }
            target.setStringValue(stdCodeValue);
        }
    }
    
    /**
     * Sets (as xml) the "stdCodeValue" element
     */
    public void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STDCODEVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STDCODEVALUE$0);
            }
            target.set(stdCodeValue);
        }
    }
}
