/*
 * An XML document type.
 * Localname: armLocationCountry
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ArmLocationCountryDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one armLocationCountry(@) element.
 *
 * This is a complex type.
 */
public class ArmLocationCountryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ArmLocationCountryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArmLocationCountryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARMLOCATIONCOUNTRY$0 = 
        new javax.xml.namespace.QName("", "armLocationCountry");
    
    
    /**
     * Gets the "armLocationCountry" element
     */
    public java.lang.String getArmLocationCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMLOCATIONCOUNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "armLocationCountry" element
     */
    public org.apache.xmlbeans.XmlString xgetArmLocationCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMLOCATIONCOUNTRY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "armLocationCountry" element
     */
    public void setArmLocationCountry(java.lang.String armLocationCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMLOCATIONCOUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMLOCATIONCOUNTRY$0);
            }
            target.setStringValue(armLocationCountry);
        }
    }
    
    /**
     * Sets (as xml) the "armLocationCountry" element
     */
    public void xsetArmLocationCountry(org.apache.xmlbeans.XmlString armLocationCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMLOCATIONCOUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMLOCATIONCOUNTRY$0);
            }
            target.set(armLocationCountry);
        }
    }
}
