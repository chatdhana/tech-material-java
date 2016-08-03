/*
 * An XML document type.
 * Localname: fmAltAddrSysGenId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmAltAddrSysGenIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmAltAddrSysGenId(@) element.
 *
 * This is a complex type.
 */
public class FmAltAddrSysGenIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAltAddrSysGenIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmAltAddrSysGenIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMALTADDRSYSGENID$0 = 
        new javax.xml.namespace.QName("", "fmAltAddrSysGenId");
    
    
    /**
     * Gets the "fmAltAddrSysGenId" element
     */
    public java.lang.String getFmAltAddrSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMALTADDRSYSGENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmAltAddrSysGenId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmAltAddrSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMALTADDRSYSGENID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmAltAddrSysGenId" element
     */
    public void setFmAltAddrSysGenId(java.lang.String fmAltAddrSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMALTADDRSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMALTADDRSYSGENID$0);
            }
            target.setStringValue(fmAltAddrSysGenId);
        }
    }
    
    /**
     * Sets (as xml) the "fmAltAddrSysGenId" element
     */
    public void xsetFmAltAddrSysGenId(org.apache.xmlbeans.XmlString fmAltAddrSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMALTADDRSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMALTADDRSYSGENID$0);
            }
            target.set(fmAltAddrSysGenId);
        }
    }
}
