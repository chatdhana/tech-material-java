/*
 * An XML document type.
 * Localname: fmId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmId(@) element.
 *
 * This is a complex type.
 */
public class FmIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMID$0 = 
        new javax.xml.namespace.QName("", "fmId");
    
    
    /**
     * Gets the "fmId" element
     */
    public java.lang.String getFmId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmId" element
     */
    public void setFmId(java.lang.String fmId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMID$0);
            }
            target.setStringValue(fmId);
        }
    }
    
    /**
     * Sets (as xml) the "fmId" element
     */
    public void xsetFmId(org.apache.xmlbeans.XmlString fmId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMID$0);
            }
            target.set(fmId);
        }
    }
}
