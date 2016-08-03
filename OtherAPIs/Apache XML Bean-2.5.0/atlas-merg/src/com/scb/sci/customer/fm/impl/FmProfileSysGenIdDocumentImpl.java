/*
 * An XML document type.
 * Localname: fmProfileSysGenId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmProfileSysGenIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmProfileSysGenId(@) element.
 *
 * This is a complex type.
 */
public class FmProfileSysGenIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmProfileSysGenIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmProfileSysGenIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMPROFILESYSGENID$0 = 
        new javax.xml.namespace.QName("", "fmProfileSysGenId");
    
    
    /**
     * Gets the "fmProfileSysGenId" element
     */
    public java.lang.String getFmProfileSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMPROFILESYSGENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmProfileSysGenId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmProfileSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMPROFILESYSGENID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmProfileSysGenId" element
     */
    public void setFmProfileSysGenId(java.lang.String fmProfileSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMPROFILESYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMPROFILESYSGENID$0);
            }
            target.setStringValue(fmProfileSysGenId);
        }
    }
    
    /**
     * Sets (as xml) the "fmProfileSysGenId" element
     */
    public void xsetFmProfileSysGenId(org.apache.xmlbeans.XmlString fmProfileSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMPROFILESYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMPROFILESYSGENID$0);
            }
            target.set(fmProfileSysGenId);
        }
    }
}
