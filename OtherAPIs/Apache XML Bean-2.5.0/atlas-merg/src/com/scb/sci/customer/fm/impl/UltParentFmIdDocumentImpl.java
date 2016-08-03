/*
 * An XML document type.
 * Localname: ultParentFmId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.UltParentFmIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one ultParentFmId(@) element.
 *
 * This is a complex type.
 */
public class UltParentFmIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.UltParentFmIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public UltParentFmIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ULTPARENTFMID$0 = 
        new javax.xml.namespace.QName("", "ultParentFmId");
    
    
    /**
     * Gets the "ultParentFmId" element
     */
    public java.lang.String getUltParentFmId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTPARENTFMID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ultParentFmId" element
     */
    public org.apache.xmlbeans.XmlString xgetUltParentFmId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTPARENTFMID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ultParentFmId" element
     */
    public void setUltParentFmId(java.lang.String ultParentFmId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTPARENTFMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULTPARENTFMID$0);
            }
            target.setStringValue(ultParentFmId);
        }
    }
    
    /**
     * Sets (as xml) the "ultParentFmId" element
     */
    public void xsetUltParentFmId(org.apache.xmlbeans.XmlString ultParentFmId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTPARENTFMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULTPARENTFMID$0);
            }
            target.set(ultParentFmId);
        }
    }
}
