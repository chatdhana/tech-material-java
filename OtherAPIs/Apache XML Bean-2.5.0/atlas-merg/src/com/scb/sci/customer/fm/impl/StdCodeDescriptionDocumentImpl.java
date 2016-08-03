/*
 * An XML document type.
 * Localname: stdCodeDescription
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.StdCodeDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one stdCodeDescription(@) element.
 *
 * This is a complex type.
 */
public class StdCodeDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.StdCodeDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public StdCodeDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STDCODEDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "stdCodeDescription");
    
    
    /**
     * Gets the "stdCodeDescription" element
     */
    public java.lang.String getStdCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STDCODEDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stdCodeDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetStdCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STDCODEDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "stdCodeDescription" element
     */
    public void setStdCodeDescription(java.lang.String stdCodeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STDCODEDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STDCODEDESCRIPTION$0);
            }
            target.setStringValue(stdCodeDescription);
        }
    }
    
    /**
     * Sets (as xml) the "stdCodeDescription" element
     */
    public void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STDCODEDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STDCODEDESCRIPTION$0);
            }
            target.set(stdCodeDescription);
        }
    }
}
