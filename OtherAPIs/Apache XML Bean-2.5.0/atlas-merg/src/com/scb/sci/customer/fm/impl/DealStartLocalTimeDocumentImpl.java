/*
 * An XML document type.
 * Localname: dealStartLocalTime
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DealStartLocalTimeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one dealStartLocalTime(@) element.
 *
 * This is a complex type.
 */
public class DealStartLocalTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DealStartLocalTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DealStartLocalTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEALSTARTLOCALTIME$0 = 
        new javax.xml.namespace.QName("", "dealStartLocalTime");
    
    
    /**
     * Gets the "dealStartLocalTime" element
     */
    public java.lang.String getDealStartLocalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEALSTARTLOCALTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dealStartLocalTime" element
     */
    public org.apache.xmlbeans.XmlString xgetDealStartLocalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEALSTARTLOCALTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dealStartLocalTime" element
     */
    public void setDealStartLocalTime(java.lang.String dealStartLocalTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEALSTARTLOCALTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEALSTARTLOCALTIME$0);
            }
            target.setStringValue(dealStartLocalTime);
        }
    }
    
    /**
     * Sets (as xml) the "dealStartLocalTime" element
     */
    public void xsetDealStartLocalTime(org.apache.xmlbeans.XmlString dealStartLocalTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEALSTARTLOCALTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEALSTARTLOCALTIME$0);
            }
            target.set(dealStartLocalTime);
        }
    }
}
