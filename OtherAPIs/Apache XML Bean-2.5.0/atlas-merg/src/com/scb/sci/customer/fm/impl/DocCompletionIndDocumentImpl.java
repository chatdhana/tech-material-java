/*
 * An XML document type.
 * Localname: docCompletionInd
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DocCompletionIndDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one docCompletionInd(@) element.
 *
 * This is a complex type.
 */
public class DocCompletionIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DocCompletionIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocCompletionIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCCOMPLETIONIND$0 = 
        new javax.xml.namespace.QName("", "docCompletionInd");
    
    
    /**
     * Gets the "docCompletionInd" element
     */
    public java.lang.String getDocCompletionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLETIONIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "docCompletionInd" element
     */
    public org.apache.xmlbeans.XmlString xgetDocCompletionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLETIONIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "docCompletionInd" element
     */
    public void setDocCompletionInd(java.lang.String docCompletionInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLETIONIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCCOMPLETIONIND$0);
            }
            target.setStringValue(docCompletionInd);
        }
    }
    
    /**
     * Sets (as xml) the "docCompletionInd" element
     */
    public void xsetDocCompletionInd(org.apache.xmlbeans.XmlString docCompletionInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLETIONIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCCOMPLETIONIND$0);
            }
            target.set(docCompletionInd);
        }
    }
}
