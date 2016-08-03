/*
 * An XML document type.
 * Localname: shortName
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ShortNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one shortName(@) element.
 *
 * This is a complex type.
 */
public class ShortNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ShortNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShortNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHORTNAME$0 = 
        new javax.xml.namespace.QName("", "shortName");
    
    
    /**
     * Gets the "shortName" element
     */
    public java.lang.String getShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shortName" element
     */
    public org.apache.xmlbeans.XmlString xgetShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "shortName" element
     */
    public void setShortName(java.lang.String shortName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHORTNAME$0);
            }
            target.setStringValue(shortName);
        }
    }
    
    /**
     * Sets (as xml) the "shortName" element
     */
    public void xsetShortName(org.apache.xmlbeans.XmlString shortName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHORTNAME$0);
            }
            target.set(shortName);
        }
    }
}
