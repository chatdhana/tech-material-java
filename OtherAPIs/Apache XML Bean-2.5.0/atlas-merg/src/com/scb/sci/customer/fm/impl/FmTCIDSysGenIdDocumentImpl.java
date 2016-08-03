/*
 * An XML document type.
 * Localname: fmTCIDSysGenId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmTCIDSysGenIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmTCIDSysGenId(@) element.
 *
 * This is a complex type.
 */
public class FmTCIDSysGenIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmTCIDSysGenIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmTCIDSysGenIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMTCIDSYSGENID$0 = 
        new javax.xml.namespace.QName("", "fmTCIDSysGenId");
    
    
    /**
     * Gets the "fmTCIDSysGenId" element
     */
    public java.lang.String getFmTCIDSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMTCIDSYSGENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmTCIDSysGenId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmTCIDSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMTCIDSYSGENID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmTCIDSysGenId" element
     */
    public void setFmTCIDSysGenId(java.lang.String fmTCIDSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMTCIDSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMTCIDSYSGENID$0);
            }
            target.setStringValue(fmTCIDSysGenId);
        }
    }
    
    /**
     * Sets (as xml) the "fmTCIDSysGenId" element
     */
    public void xsetFmTCIDSysGenId(org.apache.xmlbeans.XmlString fmTCIDSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMTCIDSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMTCIDSYSGENID$0);
            }
            target.set(fmTCIDSysGenId);
        }
    }
}
