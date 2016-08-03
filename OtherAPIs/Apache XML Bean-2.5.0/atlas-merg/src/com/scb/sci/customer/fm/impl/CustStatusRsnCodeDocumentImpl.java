/*
 * An XML document type.
 * Localname: custStatusRsnCode
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.CustStatusRsnCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one custStatusRsnCode(@) element.
 *
 * This is a complex type.
 */
public class CustStatusRsnCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CustStatusRsnCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustStatusRsnCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTSTATUSRSNCODE$0 = 
        new javax.xml.namespace.QName("", "custStatusRsnCode");
    
    
    /**
     * Gets the "custStatusRsnCode" element
     */
    public java.lang.String getCustStatusRsnCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATUSRSNCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "custStatusRsnCode" element
     */
    public org.apache.xmlbeans.XmlString xgetCustStatusRsnCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATUSRSNCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "custStatusRsnCode" element
     */
    public void setCustStatusRsnCode(java.lang.String custStatusRsnCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATUSRSNCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTSTATUSRSNCODE$0);
            }
            target.setStringValue(custStatusRsnCode);
        }
    }
    
    /**
     * Sets (as xml) the "custStatusRsnCode" element
     */
    public void xsetCustStatusRsnCode(org.apache.xmlbeans.XmlString custStatusRsnCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATUSRSNCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTSTATUSRSNCODE$0);
            }
            target.set(custStatusRsnCode);
        }
    }
}
