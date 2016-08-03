/*
 * An XML document type.
 * Localname: contFirstName
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ContFirstNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one contFirstName(@) element.
 *
 * This is a complex type.
 */
public class ContFirstNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ContFirstNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContFirstNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTFIRSTNAME$0 = 
        new javax.xml.namespace.QName("", "contFirstName");
    
    
    /**
     * Gets the "contFirstName" element
     */
    public java.lang.String getContFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTFIRSTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contFirstName" element
     */
    public org.apache.xmlbeans.XmlString xgetContFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTFIRSTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contFirstName" element
     */
    public void setContFirstName(java.lang.String contFirstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTFIRSTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTFIRSTNAME$0);
            }
            target.setStringValue(contFirstName);
        }
    }
    
    /**
     * Sets (as xml) the "contFirstName" element
     */
    public void xsetContFirstName(org.apache.xmlbeans.XmlString contFirstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTFIRSTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTFIRSTNAME$0);
            }
            target.set(contFirstName);
        }
    }
}
