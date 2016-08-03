/*
 * An XML document type.
 * Localname: incorporationNumber
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.IncorporationNumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one incorporationNumber(@) element.
 *
 * This is a complex type.
 */
public class IncorporationNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.IncorporationNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncorporationNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCORPORATIONNUMBER$0 = 
        new javax.xml.namespace.QName("", "incorporationNumber");
    
    
    /**
     * Gets the "incorporationNumber" element
     */
    public java.lang.String getIncorporationNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATIONNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "incorporationNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetIncorporationNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCORPORATIONNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "incorporationNumber" element
     */
    public void setIncorporationNumber(java.lang.String incorporationNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATIONNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCORPORATIONNUMBER$0);
            }
            target.setStringValue(incorporationNumber);
        }
    }
    
    /**
     * Sets (as xml) the "incorporationNumber" element
     */
    public void xsetIncorporationNumber(org.apache.xmlbeans.XmlString incorporationNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCORPORATIONNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCORPORATIONNUMBER$0);
            }
            target.set(incorporationNumber);
        }
    }
}
