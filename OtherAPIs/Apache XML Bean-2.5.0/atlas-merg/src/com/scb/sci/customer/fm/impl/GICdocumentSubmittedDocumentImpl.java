/*
 * An XML document type.
 * Localname: GICdocumentSubmitted
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.GICdocumentSubmittedDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one GICdocumentSubmitted(@) element.
 *
 * This is a complex type.
 */
public class GICdocumentSubmittedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.GICdocumentSubmittedDocument
{
    private static final long serialVersionUID = 1L;
    
    public GICdocumentSubmittedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GICDOCUMENTSUBMITTED$0 = 
        new javax.xml.namespace.QName("", "GICdocumentSubmitted");
    
    
    /**
     * Gets the "GICdocumentSubmitted" element
     */
    public java.lang.String getGICdocumentSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GICDOCUMENTSUBMITTED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GICdocumentSubmitted" element
     */
    public org.apache.xmlbeans.XmlString xgetGICdocumentSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GICDOCUMENTSUBMITTED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GICdocumentSubmitted" element
     */
    public void setGICdocumentSubmitted(java.lang.String giCdocumentSubmitted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GICDOCUMENTSUBMITTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GICDOCUMENTSUBMITTED$0);
            }
            target.setStringValue(giCdocumentSubmitted);
        }
    }
    
    /**
     * Sets (as xml) the "GICdocumentSubmitted" element
     */
    public void xsetGICdocumentSubmitted(org.apache.xmlbeans.XmlString giCdocumentSubmitted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GICDOCUMENTSUBMITTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GICDOCUMENTSUBMITTED$0);
            }
            target.set(giCdocumentSubmitted);
        }
    }
}
