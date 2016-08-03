/*
 * An XML document type.
 * Localname: dealEndLocalTime
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DealEndLocalTimeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one dealEndLocalTime(@) element.
 *
 * This is a complex type.
 */
public class DealEndLocalTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DealEndLocalTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DealEndLocalTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEALENDLOCALTIME$0 = 
        new javax.xml.namespace.QName("", "dealEndLocalTime");
    
    
    /**
     * Gets the "dealEndLocalTime" element
     */
    public java.lang.String getDealEndLocalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEALENDLOCALTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dealEndLocalTime" element
     */
    public org.apache.xmlbeans.XmlString xgetDealEndLocalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEALENDLOCALTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dealEndLocalTime" element
     */
    public void setDealEndLocalTime(java.lang.String dealEndLocalTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEALENDLOCALTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEALENDLOCALTIME$0);
            }
            target.setStringValue(dealEndLocalTime);
        }
    }
    
    /**
     * Sets (as xml) the "dealEndLocalTime" element
     */
    public void xsetDealEndLocalTime(org.apache.xmlbeans.XmlString dealEndLocalTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEALENDLOCALTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEALENDLOCALTIME$0);
            }
            target.set(dealEndLocalTime);
        }
    }
}
