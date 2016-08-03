/*
 * An XML document type.
 * Localname: KYCdocumentSubmitted
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.KYCdocumentSubmittedDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one KYCdocumentSubmitted(@) element.
 *
 * This is a complex type.
 */
public class KYCdocumentSubmittedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.KYCdocumentSubmittedDocument
{
    private static final long serialVersionUID = 1L;
    
    public KYCdocumentSubmittedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KYCDOCUMENTSUBMITTED$0 = 
        new javax.xml.namespace.QName("", "KYCdocumentSubmitted");
    
    
    /**
     * Gets the "KYCdocumentSubmitted" element
     */
    public java.lang.String getKYCdocumentSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KYCDOCUMENTSUBMITTED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "KYCdocumentSubmitted" element
     */
    public org.apache.xmlbeans.XmlString xgetKYCdocumentSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KYCDOCUMENTSUBMITTED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "KYCdocumentSubmitted" element
     */
    public void setKYCdocumentSubmitted(java.lang.String kyCdocumentSubmitted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KYCDOCUMENTSUBMITTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KYCDOCUMENTSUBMITTED$0);
            }
            target.setStringValue(kyCdocumentSubmitted);
        }
    }
    
    /**
     * Sets (as xml) the "KYCdocumentSubmitted" element
     */
    public void xsetKYCdocumentSubmitted(org.apache.xmlbeans.XmlString kyCdocumentSubmitted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KYCDOCUMENTSUBMITTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KYCDOCUMENTSUBMITTED$0);
            }
            target.set(kyCdocumentSubmitted);
        }
    }
}
