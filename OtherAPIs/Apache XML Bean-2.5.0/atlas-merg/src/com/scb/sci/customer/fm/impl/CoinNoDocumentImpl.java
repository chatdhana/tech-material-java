/*
 * An XML document type.
 * Localname: coinNo
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.CoinNoDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one coinNo(@) element.
 *
 * This is a complex type.
 */
public class CoinNoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CoinNoDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoinNoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COINNO$0 = 
        new javax.xml.namespace.QName("", "coinNo");
    
    
    /**
     * Gets the "coinNo" element
     */
    public java.lang.String getCoinNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COINNO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "coinNo" element
     */
    public org.apache.xmlbeans.XmlString xgetCoinNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COINNO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "coinNo" element
     */
    public void setCoinNo(java.lang.String coinNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COINNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COINNO$0);
            }
            target.setStringValue(coinNo);
        }
    }
    
    /**
     * Sets (as xml) the "coinNo" element
     */
    public void xsetCoinNo(org.apache.xmlbeans.XmlString coinNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COINNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COINNO$0);
            }
            target.set(coinNo);
        }
    }
}
