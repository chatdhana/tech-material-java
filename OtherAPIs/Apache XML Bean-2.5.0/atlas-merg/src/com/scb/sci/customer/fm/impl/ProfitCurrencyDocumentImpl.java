/*
 * An XML document type.
 * Localname: profitCurrency
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ProfitCurrencyDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one profitCurrency(@) element.
 *
 * This is a complex type.
 */
public class ProfitCurrencyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ProfitCurrencyDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProfitCurrencyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROFITCURRENCY$0 = 
        new javax.xml.namespace.QName("", "profitCurrency");
    
    
    /**
     * Gets the "profitCurrency" element
     */
    public java.lang.String getProfitCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFITCURRENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "profitCurrency" element
     */
    public org.apache.xmlbeans.XmlString xgetProfitCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROFITCURRENCY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "profitCurrency" element
     */
    public void setProfitCurrency(java.lang.String profitCurrency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFITCURRENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROFITCURRENCY$0);
            }
            target.setStringValue(profitCurrency);
        }
    }
    
    /**
     * Sets (as xml) the "profitCurrency" element
     */
    public void xsetProfitCurrency(org.apache.xmlbeans.XmlString profitCurrency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROFITCURRENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROFITCURRENCY$0);
            }
            target.set(profitCurrency);
        }
    }
}
