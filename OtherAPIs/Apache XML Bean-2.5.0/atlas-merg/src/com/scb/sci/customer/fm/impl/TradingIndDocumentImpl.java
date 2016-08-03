/*
 * An XML document type.
 * Localname: tradingInd
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.TradingIndDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one tradingInd(@) element.
 *
 * This is a complex type.
 */
public class TradingIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.TradingIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public TradingIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRADINGIND$0 = 
        new javax.xml.namespace.QName("", "tradingInd");
    
    
    /**
     * Gets the "tradingInd" element
     */
    public java.lang.String getTradingInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRADINGIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tradingInd" element
     */
    public org.apache.xmlbeans.XmlString xgetTradingInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRADINGIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tradingInd" element
     */
    public void setTradingInd(java.lang.String tradingInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRADINGIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRADINGIND$0);
            }
            target.setStringValue(tradingInd);
        }
    }
    
    /**
     * Sets (as xml) the "tradingInd" element
     */
    public void xsetTradingInd(org.apache.xmlbeans.XmlString tradingInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRADINGIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRADINGIND$0);
            }
            target.set(tradingInd);
        }
    }
}
