/*
 * An XML document type.
 * Localname: fmAddrId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmAddrIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmAddrId(@) element.
 *
 * This is a complex type.
 */
public class FmAddrIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAddrIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmAddrIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMADDRID$0 = 
        new javax.xml.namespace.QName("", "fmAddrId");
    
    
    /**
     * Gets the "fmAddrId" element
     */
    public java.lang.String getFmAddrId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMADDRID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmAddrId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmAddrId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMADDRID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmAddrId" element
     */
    public void setFmAddrId(java.lang.String fmAddrId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMADDRID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMADDRID$0);
            }
            target.setStringValue(fmAddrId);
        }
    }
    
    /**
     * Sets (as xml) the "fmAddrId" element
     */
    public void xsetFmAddrId(org.apache.xmlbeans.XmlString fmAddrId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMADDRID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMADDRID$0);
            }
            target.set(fmAddrId);
        }
    }
}
