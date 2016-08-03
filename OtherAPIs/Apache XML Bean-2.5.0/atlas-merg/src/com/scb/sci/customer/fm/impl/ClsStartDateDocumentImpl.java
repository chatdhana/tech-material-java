/*
 * An XML document type.
 * Localname: clsStartDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ClsStartDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one clsStartDate(@) element.
 *
 * This is a complex type.
 */
public class ClsStartDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ClsStartDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClsStartDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLSSTARTDATE$0 = 
        new javax.xml.namespace.QName("", "clsStartDate");
    
    
    /**
     * Gets the "clsStartDate" element
     */
    public java.lang.String getClsStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSSTARTDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "clsStartDate" element
     */
    public org.apache.xmlbeans.XmlString xgetClsStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSSTARTDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "clsStartDate" element
     */
    public void setClsStartDate(java.lang.String clsStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSSTARTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLSSTARTDATE$0);
            }
            target.setStringValue(clsStartDate);
        }
    }
    
    /**
     * Sets (as xml) the "clsStartDate" element
     */
    public void xsetClsStartDate(org.apache.xmlbeans.XmlString clsStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSSTARTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLSSTARTDATE$0);
            }
            target.set(clsStartDate);
        }
    }
}
