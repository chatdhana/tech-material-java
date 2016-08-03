/*
 * An XML document type.
 * Localname: changeIndicator
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ChangeIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one changeIndicator(@) element.
 *
 * This is a complex type.
 */
public class ChangeIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ChangeIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChangeIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHANGEINDICATOR$0 = 
        new javax.xml.namespace.QName("", "changeIndicator");
    
    
    /**
     * Gets the "changeIndicator" element
     */
    public java.lang.String getChangeIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "changeIndicator" element
     */
    public org.apache.xmlbeans.XmlString xgetChangeIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "changeIndicator" element
     */
    public void setChangeIndicator(java.lang.String changeIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$0);
            }
            target.setStringValue(changeIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "changeIndicator" element
     */
    public void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$0);
            }
            target.set(changeIndicator);
        }
    }
}
