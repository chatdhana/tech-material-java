/*
 * An XML document type.
 * Localname: publishType
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.PublishTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one publishType(@) element.
 *
 * This is a complex type.
 */
public class PublishTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.PublishTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public PublishTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHTYPE$0 = 
        new javax.xml.namespace.QName("", "publishType");
    
    
    /**
     * Gets the "publishType" element
     */
    public java.lang.String getPublishType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "publishType" element
     */
    public org.apache.xmlbeans.XmlString xgetPublishType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLISHTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "publishType" element
     */
    public void setPublishType(java.lang.String publishType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLISHTYPE$0);
            }
            target.setStringValue(publishType);
        }
    }
    
    /**
     * Sets (as xml) the "publishType" element
     */
    public void xsetPublishType(org.apache.xmlbeans.XmlString publishType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLISHTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBLISHTYPE$0);
            }
            target.set(publishType);
        }
    }
}
