/*
 * An XML document type.
 * Localname: incorporatedCountry
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.IncorporatedCountryDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one incorporatedCountry(@) element.
 *
 * This is a complex type.
 */
public class IncorporatedCountryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.IncorporatedCountryDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncorporatedCountryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCORPORATEDCOUNTRY$0 = 
        new javax.xml.namespace.QName("", "incorporatedCountry");
    
    
    /**
     * Gets the "incorporatedCountry" element
     */
    public java.lang.String getIncorporatedCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATEDCOUNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "incorporatedCountry" element
     */
    public org.apache.xmlbeans.XmlString xgetIncorporatedCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCORPORATEDCOUNTRY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "incorporatedCountry" element
     */
    public void setIncorporatedCountry(java.lang.String incorporatedCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATEDCOUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCORPORATEDCOUNTRY$0);
            }
            target.setStringValue(incorporatedCountry);
        }
    }
    
    /**
     * Sets (as xml) the "incorporatedCountry" element
     */
    public void xsetIncorporatedCountry(org.apache.xmlbeans.XmlString incorporatedCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCORPORATEDCOUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCORPORATEDCOUNTRY$0);
            }
            target.set(incorporatedCountry);
        }
    }
}
