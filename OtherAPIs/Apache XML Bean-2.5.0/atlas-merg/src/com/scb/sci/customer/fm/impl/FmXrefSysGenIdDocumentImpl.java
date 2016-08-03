/*
 * An XML document type.
 * Localname: fmXrefSysGenId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmXrefSysGenIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmXrefSysGenId(@) element.
 *
 * This is a complex type.
 */
public class FmXrefSysGenIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmXrefSysGenIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmXrefSysGenIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMXREFSYSGENID$0 = 
        new javax.xml.namespace.QName("", "fmXrefSysGenId");
    
    
    /**
     * Gets the "fmXrefSysGenId" element
     */
    public java.lang.String getFmXrefSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMXREFSYSGENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmXrefSysGenId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmXrefSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMXREFSYSGENID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmXrefSysGenId" element
     */
    public void setFmXrefSysGenId(java.lang.String fmXrefSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMXREFSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMXREFSYSGENID$0);
            }
            target.setStringValue(fmXrefSysGenId);
        }
    }
    
    /**
     * Sets (as xml) the "fmXrefSysGenId" element
     */
    public void xsetFmXrefSysGenId(org.apache.xmlbeans.XmlString fmXrefSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMXREFSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMXREFSYSGENID$0);
            }
            target.set(fmXrefSysGenId);
        }
    }
}
