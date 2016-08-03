/*
 * An XML document type.
 * Localname: firstKYCreview
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FirstKYCreviewDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one firstKYCreview(@) element.
 *
 * This is a complex type.
 */
public class FirstKYCreviewDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FirstKYCreviewDocument
{
    private static final long serialVersionUID = 1L;
    
    public FirstKYCreviewDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIRSTKYCREVIEW$0 = 
        new javax.xml.namespace.QName("", "firstKYCreview");
    
    
    /**
     * Gets the "firstKYCreview" element
     */
    public java.lang.String getFirstKYCreview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTKYCREVIEW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstKYCreview" element
     */
    public org.apache.xmlbeans.XmlString xgetFirstKYCreview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTKYCREVIEW$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "firstKYCreview" element
     */
    public void setFirstKYCreview(java.lang.String firstKYCreview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTKYCREVIEW$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTKYCREVIEW$0);
            }
            target.setStringValue(firstKYCreview);
        }
    }
    
    /**
     * Sets (as xml) the "firstKYCreview" element
     */
    public void xsetFirstKYCreview(org.apache.xmlbeans.XmlString firstKYCreview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTKYCREVIEW$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRSTKYCREVIEW$0);
            }
            target.set(firstKYCreview);
        }
    }
}
