/*
 * An XML document type.
 * Localname: faxNumber
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FaxNumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one faxNumber(@) element.
 *
 * This is a complex type.
 */
public class FaxNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FaxNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public FaxNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAXNUMBER$0 = 
        new javax.xml.namespace.QName("", "faxNumber");
    
    
    /**
     * Gets the "faxNumber" element
     */
    public java.lang.String getFaxNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAXNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "faxNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetFaxNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAXNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "faxNumber" element
     */
    public void setFaxNumber(java.lang.String faxNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAXNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAXNUMBER$0);
            }
            target.setStringValue(faxNumber);
        }
    }
    
    /**
     * Sets (as xml) the "faxNumber" element
     */
    public void xsetFaxNumber(org.apache.xmlbeans.XmlString faxNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAXNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAXNUMBER$0);
            }
            target.set(faxNumber);
        }
    }
}
