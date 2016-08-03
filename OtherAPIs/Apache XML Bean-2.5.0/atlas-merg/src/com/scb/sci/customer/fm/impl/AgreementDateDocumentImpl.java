/*
 * An XML document type.
 * Localname: agreementDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.AgreementDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one agreementDate(@) element.
 *
 * This is a complex type.
 */
public class AgreementDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.AgreementDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public AgreementDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGREEMENTDATE$0 = 
        new javax.xml.namespace.QName("", "agreementDate");
    
    
    /**
     * Gets the "agreementDate" element
     */
    public java.lang.String getAgreementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGREEMENTDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "agreementDate" element
     */
    public org.apache.xmlbeans.XmlString xgetAgreementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGREEMENTDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "agreementDate" element
     */
    public void setAgreementDate(java.lang.String agreementDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGREEMENTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGREEMENTDATE$0);
            }
            target.setStringValue(agreementDate);
        }
    }
    
    /**
     * Sets (as xml) the "agreementDate" element
     */
    public void xsetAgreementDate(org.apache.xmlbeans.XmlString agreementDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGREEMENTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGREEMENTDATE$0);
            }
            target.set(agreementDate);
        }
    }
}
