/*
 * An XML document type.
 * Localname: publishDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.PublishDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one publishDate(@) element.
 *
 * This is a complex type.
 */
public class PublishDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.PublishDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public PublishDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHDATE$0 = 
        new javax.xml.namespace.QName("", "publishDate");
    
    
    /**
     * Gets the "publishDate" element
     */
    public java.lang.String getPublishDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "publishDate" element
     */
    public org.apache.xmlbeans.XmlString xgetPublishDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLISHDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "publishDate" element
     */
    public void setPublishDate(java.lang.String publishDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLISHDATE$0);
            }
            target.setStringValue(publishDate);
        }
    }
    
    /**
     * Sets (as xml) the "publishDate" element
     */
    public void xsetPublishDate(org.apache.xmlbeans.XmlString publishDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLISHDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBLISHDATE$0);
            }
            target.set(publishDate);
        }
    }
}
