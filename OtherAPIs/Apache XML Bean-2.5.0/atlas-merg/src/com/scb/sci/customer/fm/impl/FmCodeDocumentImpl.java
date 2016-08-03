/*
 * An XML document type.
 * Localname: fmCode
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmCode(@) element.
 *
 * This is a complex type.
 */
public class FmCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMCODE$0 = 
        new javax.xml.namespace.QName("", "fmCode");
    
    
    /**
     * Gets the "fmCode" element
     */
    public java.lang.String getFmCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmCode" element
     */
    public org.apache.xmlbeans.XmlString xgetFmCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmCode" element
     */
    public void setFmCode(java.lang.String fmCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMCODE$0);
            }
            target.setStringValue(fmCode);
        }
    }
    
    /**
     * Sets (as xml) the "fmCode" element
     */
    public void xsetFmCode(org.apache.xmlbeans.XmlString fmCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMCODE$0);
            }
            target.set(fmCode);
        }
    }
}
