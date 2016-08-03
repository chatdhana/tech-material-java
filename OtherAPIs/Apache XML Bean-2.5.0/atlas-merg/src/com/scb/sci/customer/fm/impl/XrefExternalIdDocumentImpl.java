/*
 * An XML document type.
 * Localname: xrefExternalId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.XrefExternalIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one xrefExternalId(@) element.
 *
 * This is a complex type.
 */
public class XrefExternalIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.XrefExternalIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public XrefExternalIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XREFEXTERNALID$0 = 
        new javax.xml.namespace.QName("", "xrefExternalId");
    
    
    /**
     * Gets the "xrefExternalId" element
     */
    public java.lang.String getXrefExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XREFEXTERNALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "xrefExternalId" element
     */
    public org.apache.xmlbeans.XmlString xgetXrefExternalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XREFEXTERNALID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "xrefExternalId" element
     */
    public void setXrefExternalId(java.lang.String xrefExternalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XREFEXTERNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XREFEXTERNALID$0);
            }
            target.setStringValue(xrefExternalId);
        }
    }
    
    /**
     * Sets (as xml) the "xrefExternalId" element
     */
    public void xsetXrefExternalId(org.apache.xmlbeans.XmlString xrefExternalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XREFEXTERNALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XREFEXTERNALID$0);
            }
            target.set(xrefExternalId);
        }
    }
}
