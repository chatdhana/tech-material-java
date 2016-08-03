/*
 * An XML document type.
 * Localname: fmSysContSysGenId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmSysContSysGenIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmSysContSysGenId(@) element.
 *
 * This is a complex type.
 */
public class FmSysContSysGenIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmSysContSysGenIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmSysContSysGenIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMSYSCONTSYSGENID$0 = 
        new javax.xml.namespace.QName("", "fmSysContSysGenId");
    
    
    /**
     * Gets the "fmSysContSysGenId" element
     */
    public java.lang.String getFmSysContSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMSYSCONTSYSGENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmSysContSysGenId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmSysContSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMSYSCONTSYSGENID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmSysContSysGenId" element
     */
    public void setFmSysContSysGenId(java.lang.String fmSysContSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMSYSCONTSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMSYSCONTSYSGENID$0);
            }
            target.setStringValue(fmSysContSysGenId);
        }
    }
    
    /**
     * Sets (as xml) the "fmSysContSysGenId" element
     */
    public void xsetFmSysContSysGenId(org.apache.xmlbeans.XmlString fmSysContSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMSYSCONTSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMSYSCONTSYSGENID$0);
            }
            target.set(fmSysContSysGenId);
        }
    }
}
