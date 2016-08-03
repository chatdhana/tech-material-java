/*
 * An XML document type.
 * Localname: fmScbDtlSysGenId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmScbDtlSysGenIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmScbDtlSysGenId(@) element.
 *
 * This is a complex type.
 */
public class FmScbDtlSysGenIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmScbDtlSysGenIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmScbDtlSysGenIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMSCBDTLSYSGENID$0 = 
        new javax.xml.namespace.QName("", "fmScbDtlSysGenId");
    
    
    /**
     * Gets the "fmScbDtlSysGenId" element
     */
    public java.lang.String getFmScbDtlSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMSCBDTLSYSGENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmScbDtlSysGenId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmScbDtlSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMSCBDTLSYSGENID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmScbDtlSysGenId" element
     */
    public void setFmScbDtlSysGenId(java.lang.String fmScbDtlSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMSCBDTLSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMSCBDTLSYSGENID$0);
            }
            target.setStringValue(fmScbDtlSysGenId);
        }
    }
    
    /**
     * Sets (as xml) the "fmScbDtlSysGenId" element
     */
    public void xsetFmScbDtlSysGenId(org.apache.xmlbeans.XmlString fmScbDtlSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMSCBDTLSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMSCBDTLSYSGENID$0);
            }
            target.set(fmScbDtlSysGenId);
        }
    }
}
