/*
 * An XML document type.
 * Localname: parentFmId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ParentFmIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one parentFmId(@) element.
 *
 * This is a complex type.
 */
public class ParentFmIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ParentFmIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParentFmIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARENTFMID$0 = 
        new javax.xml.namespace.QName("", "parentFmId");
    
    
    /**
     * Gets the "parentFmId" element
     */
    public java.lang.String getParentFmId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTFMID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parentFmId" element
     */
    public org.apache.xmlbeans.XmlString xgetParentFmId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTFMID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "parentFmId" element
     */
    public void setParentFmId(java.lang.String parentFmId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTFMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTFMID$0);
            }
            target.setStringValue(parentFmId);
        }
    }
    
    /**
     * Sets (as xml) the "parentFmId" element
     */
    public void xsetParentFmId(org.apache.xmlbeans.XmlString parentFmId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTFMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTFMID$0);
            }
            target.set(parentFmId);
        }
    }
}
