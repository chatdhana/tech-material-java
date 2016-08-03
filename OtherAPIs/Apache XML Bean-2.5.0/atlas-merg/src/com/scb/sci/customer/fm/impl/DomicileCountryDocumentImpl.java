/*
 * An XML document type.
 * Localname: domicileCountry
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DomicileCountryDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one domicileCountry(@) element.
 *
 * This is a complex type.
 */
public class DomicileCountryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DomicileCountryDocument
{
    private static final long serialVersionUID = 1L;
    
    public DomicileCountryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMICILECOUNTRY$0 = 
        new javax.xml.namespace.QName("", "domicileCountry");
    
    
    /**
     * Gets the "domicileCountry" element
     */
    public java.lang.String getDomicileCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILECOUNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domicileCountry" element
     */
    public org.apache.xmlbeans.XmlString xgetDomicileCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILECOUNTRY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "domicileCountry" element
     */
    public void setDomicileCountry(java.lang.String domicileCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILECOUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMICILECOUNTRY$0);
            }
            target.setStringValue(domicileCountry);
        }
    }
    
    /**
     * Sets (as xml) the "domicileCountry" element
     */
    public void xsetDomicileCountry(org.apache.xmlbeans.XmlString domicileCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILECOUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMICILECOUNTRY$0);
            }
            target.set(domicileCountry);
        }
    }
}
