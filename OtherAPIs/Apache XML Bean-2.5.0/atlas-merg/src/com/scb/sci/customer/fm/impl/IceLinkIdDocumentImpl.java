/*
 * An XML document type.
 * Localname: iceLinkId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.IceLinkIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one iceLinkId(@) element.
 *
 * This is a complex type.
 */
public class IceLinkIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.IceLinkIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public IceLinkIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ICELINKID$0 = 
        new javax.xml.namespace.QName("", "iceLinkId");
    
    
    /**
     * Gets the "iceLinkId" element
     */
    public java.lang.String getIceLinkId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICELINKID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "iceLinkId" element
     */
    public org.apache.xmlbeans.XmlString xgetIceLinkId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICELINKID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "iceLinkId" element
     */
    public void setIceLinkId(java.lang.String iceLinkId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICELINKID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ICELINKID$0);
            }
            target.setStringValue(iceLinkId);
        }
    }
    
    /**
     * Sets (as xml) the "iceLinkId" element
     */
    public void xsetIceLinkId(org.apache.xmlbeans.XmlString iceLinkId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICELINKID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ICELINKID$0);
            }
            target.set(iceLinkId);
        }
    }
}
