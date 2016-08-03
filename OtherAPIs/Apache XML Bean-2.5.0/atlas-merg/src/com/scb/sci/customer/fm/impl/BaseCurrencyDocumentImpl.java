/*
 * An XML document type.
 * Localname: baseCurrency
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.BaseCurrencyDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one baseCurrency(@) element.
 *
 * This is a complex type.
 */
public class BaseCurrencyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.BaseCurrencyDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseCurrencyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASECURRENCY$0 = 
        new javax.xml.namespace.QName("", "baseCurrency");
    
    
    /**
     * Gets the "baseCurrency" element
     */
    public java.lang.String getBaseCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASECURRENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "baseCurrency" element
     */
    public org.apache.xmlbeans.XmlString xgetBaseCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASECURRENCY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "baseCurrency" element
     */
    public void setBaseCurrency(java.lang.String baseCurrency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASECURRENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASECURRENCY$0);
            }
            target.setStringValue(baseCurrency);
        }
    }
    
    /**
     * Sets (as xml) the "baseCurrency" element
     */
    public void xsetBaseCurrency(org.apache.xmlbeans.XmlString baseCurrency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASECURRENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BASECURRENCY$0);
            }
            target.set(baseCurrency);
        }
    }
}
