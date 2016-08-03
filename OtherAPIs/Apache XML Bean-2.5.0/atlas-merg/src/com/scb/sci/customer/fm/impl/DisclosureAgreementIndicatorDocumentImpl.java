/*
 * An XML document type.
 * Localname: disclosureAgreementIndicator
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DisclosureAgreementIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one disclosureAgreementIndicator(@) element.
 *
 * This is a complex type.
 */
public class DisclosureAgreementIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DisclosureAgreementIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisclosureAgreementIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCLOSUREAGREEMENTINDICATOR$0 = 
        new javax.xml.namespace.QName("", "disclosureAgreementIndicator");
    
    
    /**
     * Gets the "disclosureAgreementIndicator" element
     */
    public java.lang.String getDisclosureAgreementIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLOSUREAGREEMENTINDICATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "disclosureAgreementIndicator" element
     */
    public org.apache.xmlbeans.XmlString xgetDisclosureAgreementIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLOSUREAGREEMENTINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "disclosureAgreementIndicator" element
     */
    public void setDisclosureAgreementIndicator(java.lang.String disclosureAgreementIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLOSUREAGREEMENTINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCLOSUREAGREEMENTINDICATOR$0);
            }
            target.setStringValue(disclosureAgreementIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "disclosureAgreementIndicator" element
     */
    public void xsetDisclosureAgreementIndicator(org.apache.xmlbeans.XmlString disclosureAgreementIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLOSUREAGREEMENTINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISCLOSUREAGREEMENTINDICATOR$0);
            }
            target.set(disclosureAgreementIndicator);
        }
    }
}
