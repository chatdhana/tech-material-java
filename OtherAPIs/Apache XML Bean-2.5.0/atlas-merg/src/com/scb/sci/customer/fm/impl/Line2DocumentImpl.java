/*
 * An XML document type.
 * Localname: line2
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.Line2Document
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one line2(@) element.
 *
 * This is a complex type.
 */
public class Line2DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.Line2Document
{
    private static final long serialVersionUID = 1L;
    
    public Line2DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINE2$0 = 
        new javax.xml.namespace.QName("", "line2");
    
    
    /**
     * Gets the "line2" element
     */
    public java.lang.String getLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "line2" element
     */
    public org.apache.xmlbeans.XmlString xgetLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE2$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "line2" element
     */
    public void setLine2(java.lang.String line2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINE2$0);
            }
            target.setStringValue(line2);
        }
    }
    
    /**
     * Sets (as xml) the "line2" element
     */
    public void xsetLine2(org.apache.xmlbeans.XmlString line2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINE2$0);
            }
            target.set(line2);
        }
    }
}
