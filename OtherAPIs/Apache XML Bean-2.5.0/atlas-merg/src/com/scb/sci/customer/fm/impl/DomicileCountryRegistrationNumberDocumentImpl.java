/*
 * An XML document type.
 * Localname: domicileCountryRegistrationNumber
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DomicileCountryRegistrationNumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one domicileCountryRegistrationNumber(@) element.
 *
 * This is a complex type.
 */
public class DomicileCountryRegistrationNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DomicileCountryRegistrationNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public DomicileCountryRegistrationNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMICILECOUNTRYREGISTRATIONNUMBER$0 = 
        new javax.xml.namespace.QName("", "domicileCountryRegistrationNumber");
    
    
    /**
     * Gets the "domicileCountryRegistrationNumber" element
     */
    public java.lang.String getDomicileCountryRegistrationNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILECOUNTRYREGISTRATIONNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domicileCountryRegistrationNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetDomicileCountryRegistrationNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILECOUNTRYREGISTRATIONNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "domicileCountryRegistrationNumber" element
     */
    public void setDomicileCountryRegistrationNumber(java.lang.String domicileCountryRegistrationNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILECOUNTRYREGISTRATIONNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMICILECOUNTRYREGISTRATIONNUMBER$0);
            }
            target.setStringValue(domicileCountryRegistrationNumber);
        }
    }
    
    /**
     * Sets (as xml) the "domicileCountryRegistrationNumber" element
     */
    public void xsetDomicileCountryRegistrationNumber(org.apache.xmlbeans.XmlString domicileCountryRegistrationNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILECOUNTRYREGISTRATIONNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMICILECOUNTRYREGISTRATIONNUMBER$0);
            }
            target.set(domicileCountryRegistrationNumber);
        }
    }
}
