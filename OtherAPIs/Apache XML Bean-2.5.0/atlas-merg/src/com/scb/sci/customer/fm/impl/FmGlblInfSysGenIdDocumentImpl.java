/*
 * An XML document type.
 * Localname: fmGlblInfSysGenId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmGlblInfSysGenIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmGlblInfSysGenId(@) element.
 *
 * This is a complex type.
 */
public class FmGlblInfSysGenIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmGlblInfSysGenIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmGlblInfSysGenIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMGLBLINFSYSGENID$0 = 
        new javax.xml.namespace.QName("", "fmGlblInfSysGenId");
    
    
    /**
     * Gets the "fmGlblInfSysGenId" element
     */
    public java.lang.String getFmGlblInfSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMGLBLINFSYSGENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmGlblInfSysGenId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmGlblInfSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMGLBLINFSYSGENID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmGlblInfSysGenId" element
     */
    public void setFmGlblInfSysGenId(java.lang.String fmGlblInfSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMGLBLINFSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMGLBLINFSYSGENID$0);
            }
            target.setStringValue(fmGlblInfSysGenId);
        }
    }
    
    /**
     * Sets (as xml) the "fmGlblInfSysGenId" element
     */
    public void xsetFmGlblInfSysGenId(org.apache.xmlbeans.XmlString fmGlblInfSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMGLBLINFSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMGLBLINFSYSGENID$0);
            }
            target.set(fmGlblInfSysGenId);
        }
    }
}
