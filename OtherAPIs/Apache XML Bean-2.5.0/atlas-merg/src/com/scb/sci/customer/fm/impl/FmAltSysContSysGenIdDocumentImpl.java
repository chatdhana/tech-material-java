/*
 * An XML document type.
 * Localname: fmAltSysContSysGenId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmAltSysContSysGenIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmAltSysContSysGenId(@) element.
 *
 * This is a complex type.
 */
public class FmAltSysContSysGenIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAltSysContSysGenIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmAltSysContSysGenIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMALTSYSCONTSYSGENID$0 = 
        new javax.xml.namespace.QName("", "fmAltSysContSysGenId");
    
    
    /**
     * Gets the "fmAltSysContSysGenId" element
     */
    public java.lang.String getFmAltSysContSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMALTSYSCONTSYSGENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmAltSysContSysGenId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmAltSysContSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMALTSYSCONTSYSGENID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmAltSysContSysGenId" element
     */
    public void setFmAltSysContSysGenId(java.lang.String fmAltSysContSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMALTSYSCONTSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMALTSYSCONTSYSGENID$0);
            }
            target.setStringValue(fmAltSysContSysGenId);
        }
    }
    
    /**
     * Sets (as xml) the "fmAltSysContSysGenId" element
     */
    public void xsetFmAltSysContSysGenId(org.apache.xmlbeans.XmlString fmAltSysContSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMALTSYSCONTSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMALTSYSCONTSYSGENID$0);
            }
            target.set(fmAltSysContSysGenId);
        }
    }
}
