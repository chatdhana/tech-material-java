/*
 * An XML document type.
 * Localname: documentOriginatingId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DocumentOriginatingIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one documentOriginatingId(@) element.
 *
 * This is a complex type.
 */
public class DocumentOriginatingIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DocumentOriginatingIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocumentOriginatingIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTORIGINATINGID$0 = 
        new javax.xml.namespace.QName("", "documentOriginatingId");
    
    
    /**
     * Gets the "documentOriginatingId" element
     */
    public java.lang.String getDocumentOriginatingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTORIGINATINGID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentOriginatingId" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentOriginatingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTORIGINATINGID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "documentOriginatingId" element
     */
    public void setDocumentOriginatingId(java.lang.String documentOriginatingId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTORIGINATINGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTORIGINATINGID$0);
            }
            target.setStringValue(documentOriginatingId);
        }
    }
    
    /**
     * Sets (as xml) the "documentOriginatingId" element
     */
    public void xsetDocumentOriginatingId(org.apache.xmlbeans.XmlString documentOriginatingId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTORIGINATINGID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTORIGINATINGID$0);
            }
            target.set(documentOriginatingId);
        }
    }
}
