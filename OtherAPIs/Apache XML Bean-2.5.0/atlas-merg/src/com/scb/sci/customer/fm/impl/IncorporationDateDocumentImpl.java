/*
 * An XML document type.
 * Localname: incorporationDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.IncorporationDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one incorporationDate(@) element.
 *
 * This is a complex type.
 */
public class IncorporationDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.IncorporationDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncorporationDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCORPORATIONDATE$0 = 
        new javax.xml.namespace.QName("", "incorporationDate");
    
    
    /**
     * Gets the "incorporationDate" element
     */
    public java.lang.String getIncorporationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "incorporationDate" element
     */
    public org.apache.xmlbeans.XmlString xgetIncorporationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCORPORATIONDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "incorporationDate" element
     */
    public void setIncorporationDate(java.lang.String incorporationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCORPORATIONDATE$0);
            }
            target.setStringValue(incorporationDate);
        }
    }
    
    /**
     * Sets (as xml) the "incorporationDate" element
     */
    public void xsetIncorporationDate(org.apache.xmlbeans.XmlString incorporationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCORPORATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCORPORATIONDATE$0);
            }
            target.set(incorporationDate);
        }
    }
}
