/*
 * An XML document type.
 * Localname: startDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.StartDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one startDate(@) element.
 *
 * This is a complex type.
 */
public class StartDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.StartDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public StartDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTDATE$0 = 
        new javax.xml.namespace.QName("", "startDate");
    
    
    /**
     * Gets the "startDate" element
     */
    public java.lang.String getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "startDate" element
     */
    public org.apache.xmlbeans.XmlString xgetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "startDate" element
     */
    public void setStartDate(java.lang.String startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$0);
            }
            target.setStringValue(startDate);
        }
    }
    
    /**
     * Sets (as xml) the "startDate" element
     */
    public void xsetStartDate(org.apache.xmlbeans.XmlString startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTDATE$0);
            }
            target.set(startDate);
        }
    }
}
