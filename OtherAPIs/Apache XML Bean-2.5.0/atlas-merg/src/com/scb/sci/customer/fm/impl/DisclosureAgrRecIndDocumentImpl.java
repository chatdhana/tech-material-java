/*
 * An XML document type.
 * Localname: disclosureAgrRecInd
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DisclosureAgrRecIndDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one disclosureAgrRecInd(@) element.
 *
 * This is a complex type.
 */
public class DisclosureAgrRecIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DisclosureAgrRecIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisclosureAgrRecIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCLOSUREAGRRECIND$0 = 
        new javax.xml.namespace.QName("", "disclosureAgrRecInd");
    
    
    /**
     * Gets the "disclosureAgrRecInd" element
     */
    public java.lang.String getDisclosureAgrRecInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLOSUREAGRRECIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "disclosureAgrRecInd" element
     */
    public org.apache.xmlbeans.XmlString xgetDisclosureAgrRecInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLOSUREAGRRECIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "disclosureAgrRecInd" element
     */
    public void setDisclosureAgrRecInd(java.lang.String disclosureAgrRecInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLOSUREAGRRECIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCLOSUREAGRRECIND$0);
            }
            target.setStringValue(disclosureAgrRecInd);
        }
    }
    
    /**
     * Sets (as xml) the "disclosureAgrRecInd" element
     */
    public void xsetDisclosureAgrRecInd(org.apache.xmlbeans.XmlString disclosureAgrRecInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLOSUREAGRRECIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISCLOSUREAGRRECIND$0);
            }
            target.set(disclosureAgrRecInd);
        }
    }
}
