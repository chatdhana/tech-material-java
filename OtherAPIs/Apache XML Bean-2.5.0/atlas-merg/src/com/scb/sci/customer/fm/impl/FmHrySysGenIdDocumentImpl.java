/*
 * An XML document type.
 * Localname: fmHrySysGenId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmHrySysGenIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmHrySysGenId(@) element.
 *
 * This is a complex type.
 */
public class FmHrySysGenIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmHrySysGenIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmHrySysGenIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMHRYSYSGENID$0 = 
        new javax.xml.namespace.QName("", "fmHrySysGenId");
    
    
    /**
     * Gets the "fmHrySysGenId" element
     */
    public java.lang.String getFmHrySysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMHRYSYSGENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmHrySysGenId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmHrySysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMHRYSYSGENID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmHrySysGenId" element
     */
    public void setFmHrySysGenId(java.lang.String fmHrySysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMHRYSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMHRYSYSGENID$0);
            }
            target.setStringValue(fmHrySysGenId);
        }
    }
    
    /**
     * Sets (as xml) the "fmHrySysGenId" element
     */
    public void xsetFmHrySysGenId(org.apache.xmlbeans.XmlString fmHrySysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMHRYSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMHRYSYSGENID$0);
            }
            target.set(fmHrySysGenId);
        }
    }
}
