/*
 * An XML document type.
 * Localname: line1
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.Line1Document
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one line1(@) element.
 *
 * This is a complex type.
 */
public class Line1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.Line1Document
{
    private static final long serialVersionUID = 1L;
    
    public Line1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINE1$0 = 
        new javax.xml.namespace.QName("", "line1");
    
    
    /**
     * Gets the "line1" element
     */
    public java.lang.String getLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "line1" element
     */
    public org.apache.xmlbeans.XmlString xgetLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE1$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "line1" element
     */
    public void setLine1(java.lang.String line1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINE1$0);
            }
            target.setStringValue(line1);
        }
    }
    
    /**
     * Sets (as xml) the "line1" element
     */
    public void xsetLine1(org.apache.xmlbeans.XmlString line1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINE1$0);
            }
            target.set(line1);
        }
    }
}
