/*
 * An XML document type.
 * Localname: fmAddrSysGenId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmAddrSysGenIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmAddrSysGenId(@) element.
 *
 * This is a complex type.
 */
public class FmAddrSysGenIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAddrSysGenIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmAddrSysGenIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMADDRSYSGENID$0 = 
        new javax.xml.namespace.QName("", "fmAddrSysGenId");
    
    
    /**
     * Gets the "fmAddrSysGenId" element
     */
    public java.lang.String getFmAddrSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMADDRSYSGENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmAddrSysGenId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmAddrSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMADDRSYSGENID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmAddrSysGenId" element
     */
    public void setFmAddrSysGenId(java.lang.String fmAddrSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMADDRSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMADDRSYSGENID$0);
            }
            target.setStringValue(fmAddrSysGenId);
        }
    }
    
    /**
     * Sets (as xml) the "fmAddrSysGenId" element
     */
    public void xsetFmAddrSysGenId(org.apache.xmlbeans.XmlString fmAddrSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMADDRSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMADDRSYSGENID$0);
            }
            target.set(fmAddrSysGenId);
        }
    }
}
