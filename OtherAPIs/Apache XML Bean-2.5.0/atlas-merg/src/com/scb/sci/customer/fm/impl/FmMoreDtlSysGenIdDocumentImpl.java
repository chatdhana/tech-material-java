/*
 * An XML document type.
 * Localname: fmMoreDtlSysGenId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmMoreDtlSysGenIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmMoreDtlSysGenId(@) element.
 *
 * This is a complex type.
 */
public class FmMoreDtlSysGenIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmMoreDtlSysGenIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmMoreDtlSysGenIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMMOREDTLSYSGENID$0 = 
        new javax.xml.namespace.QName("", "fmMoreDtlSysGenId");
    
    
    /**
     * Gets the "fmMoreDtlSysGenId" element
     */
    public java.lang.String getFmMoreDtlSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMMOREDTLSYSGENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmMoreDtlSysGenId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmMoreDtlSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMMOREDTLSYSGENID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmMoreDtlSysGenId" element
     */
    public void setFmMoreDtlSysGenId(java.lang.String fmMoreDtlSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMMOREDTLSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMMOREDTLSYSGENID$0);
            }
            target.setStringValue(fmMoreDtlSysGenId);
        }
    }
    
    /**
     * Sets (as xml) the "fmMoreDtlSysGenId" element
     */
    public void xsetFmMoreDtlSysGenId(org.apache.xmlbeans.XmlString fmMoreDtlSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMMOREDTLSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMMOREDTLSYSGENID$0);
            }
            target.set(fmMoreDtlSysGenId);
        }
    }
}
