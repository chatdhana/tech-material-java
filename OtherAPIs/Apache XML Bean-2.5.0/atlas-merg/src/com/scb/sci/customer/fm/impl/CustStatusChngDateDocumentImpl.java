/*
 * An XML document type.
 * Localname: custStatusChngDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.CustStatusChngDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one custStatusChngDate(@) element.
 *
 * This is a complex type.
 */
public class CustStatusChngDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CustStatusChngDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustStatusChngDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTSTATUSCHNGDATE$0 = 
        new javax.xml.namespace.QName("", "custStatusChngDate");
    
    
    /**
     * Gets the "custStatusChngDate" element
     */
    public java.lang.String getCustStatusChngDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATUSCHNGDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "custStatusChngDate" element
     */
    public org.apache.xmlbeans.XmlString xgetCustStatusChngDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATUSCHNGDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "custStatusChngDate" element
     */
    public void setCustStatusChngDate(java.lang.String custStatusChngDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATUSCHNGDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTSTATUSCHNGDATE$0);
            }
            target.setStringValue(custStatusChngDate);
        }
    }
    
    /**
     * Sets (as xml) the "custStatusChngDate" element
     */
    public void xsetCustStatusChngDate(org.apache.xmlbeans.XmlString custStatusChngDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATUSCHNGDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTSTATUSCHNGDATE$0);
            }
            target.set(custStatusChngDate);
        }
    }
}
