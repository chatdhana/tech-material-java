/*
 * An XML document type.
 * Localname: xrefLocation
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.XrefLocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one xrefLocation(@) element.
 *
 * This is a complex type.
 */
public class XrefLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.XrefLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public XrefLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XREFLOCATION$0 = 
        new javax.xml.namespace.QName("", "xrefLocation");
    
    
    /**
     * Gets the "xrefLocation" element
     */
    public java.lang.String getXrefLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XREFLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "xrefLocation" element
     */
    public org.apache.xmlbeans.XmlString xgetXrefLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XREFLOCATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "xrefLocation" element
     */
    public void setXrefLocation(java.lang.String xrefLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XREFLOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XREFLOCATION$0);
            }
            target.setStringValue(xrefLocation);
        }
    }
    
    /**
     * Sets (as xml) the "xrefLocation" element
     */
    public void xsetXrefLocation(org.apache.xmlbeans.XmlString xrefLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XREFLOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XREFLOCATION$0);
            }
            target.set(xrefLocation);
        }
    }
}
