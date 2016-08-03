/*
 * An XML document type.
 * Localname: country
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.CountryDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one country(@) element.
 *
 * This is a complex type.
 */
public class CountryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CountryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRY$0 = 
        new javax.xml.namespace.QName("", "country");
    
    
    /**
     * Gets the "country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "country" element
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$0);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "country" element
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$0);
            }
            target.set(country);
        }
    }
}
