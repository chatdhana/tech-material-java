/*
 * An XML document type.
 * Localname: location
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.LocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one location(@) element.
 *
 * This is a complex type.
 */
public class LocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.LocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("", "location");
    
    
    /**
     * Gets the "location" element
     */
    public java.lang.String getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "location" element
     */
    public org.apache.xmlbeans.XmlString xgetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(java.lang.String location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATION$0);
            }
            target.setStringValue(location);
        }
    }
    
    /**
     * Sets (as xml) the "location" element
     */
    public void xsetLocation(org.apache.xmlbeans.XmlString location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATION$0);
            }
            target.set(location);
        }
    }
}
