/*
 * An XML document type.
 * Localname: docCompletionDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DocCompletionDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one docCompletionDate(@) element.
 *
 * This is a complex type.
 */
public class DocCompletionDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DocCompletionDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocCompletionDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCCOMPLETIONDATE$0 = 
        new javax.xml.namespace.QName("", "docCompletionDate");
    
    
    /**
     * Gets the "docCompletionDate" element
     */
    public java.lang.String getDocCompletionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLETIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "docCompletionDate" element
     */
    public org.apache.xmlbeans.XmlString xgetDocCompletionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLETIONDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "docCompletionDate" element
     */
    public void setDocCompletionDate(java.lang.String docCompletionDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLETIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCCOMPLETIONDATE$0);
            }
            target.setStringValue(docCompletionDate);
        }
    }
    
    /**
     * Sets (as xml) the "docCompletionDate" element
     */
    public void xsetDocCompletionDate(org.apache.xmlbeans.XmlString docCompletionDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLETIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCCOMPLETIONDATE$0);
            }
            target.set(docCompletionDate);
        }
    }
}
