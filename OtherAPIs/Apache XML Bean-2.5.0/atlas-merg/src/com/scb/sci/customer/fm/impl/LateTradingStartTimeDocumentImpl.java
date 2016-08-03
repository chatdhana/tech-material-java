/*
 * An XML document type.
 * Localname: lateTradingStartTime
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.LateTradingStartTimeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one lateTradingStartTime(@) element.
 *
 * This is a complex type.
 */
public class LateTradingStartTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.LateTradingStartTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LateTradingStartTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATETRADINGSTARTTIME$0 = 
        new javax.xml.namespace.QName("", "lateTradingStartTime");
    
    
    /**
     * Gets the "lateTradingStartTime" element
     */
    public java.lang.String getLateTradingStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATETRADINGSTARTTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lateTradingStartTime" element
     */
    public org.apache.xmlbeans.XmlString xgetLateTradingStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATETRADINGSTARTTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lateTradingStartTime" element
     */
    public void setLateTradingStartTime(java.lang.String lateTradingStartTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATETRADINGSTARTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATETRADINGSTARTTIME$0);
            }
            target.setStringValue(lateTradingStartTime);
        }
    }
    
    /**
     * Sets (as xml) the "lateTradingStartTime" element
     */
    public void xsetLateTradingStartTime(org.apache.xmlbeans.XmlString lateTradingStartTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATETRADINGSTARTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LATETRADINGSTARTTIME$0);
            }
            target.set(lateTradingStartTime);
        }
    }
}
