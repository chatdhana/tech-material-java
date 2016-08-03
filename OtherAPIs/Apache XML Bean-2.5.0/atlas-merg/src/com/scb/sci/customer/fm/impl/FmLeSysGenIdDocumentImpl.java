/*
 * An XML document type.
 * Localname: fmLeSysGenId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmLeSysGenIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmLeSysGenId(@) element.
 *
 * This is a complex type.
 */
public class FmLeSysGenIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmLeSysGenIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmLeSysGenIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMLESYSGENID$0 = 
        new javax.xml.namespace.QName("", "fmLeSysGenId");
    
    
    /**
     * Gets the "fmLeSysGenId" element
     */
    public java.lang.String getFmLeSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMLESYSGENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmLeSysGenId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmLeSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMLESYSGENID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmLeSysGenId" element
     */
    public void setFmLeSysGenId(java.lang.String fmLeSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMLESYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMLESYSGENID$0);
            }
            target.setStringValue(fmLeSysGenId);
        }
    }
    
    /**
     * Sets (as xml) the "fmLeSysGenId" element
     */
    public void xsetFmLeSysGenId(org.apache.xmlbeans.XmlString fmLeSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMLESYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMLESYSGENID$0);
            }
            target.set(fmLeSysGenId);
        }
    }
}
