/*
 * An XML document type.
 * Localname: email
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.EmailDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one email(@) element.
 *
 * This is a complex type.
 */
public class EmailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.EmailDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMAIL$0 = 
        new javax.xml.namespace.QName("", "email");
    
    
    /**
     * Gets the "email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "email" element
     */
    public org.apache.xmlbeans.XmlString xgetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "email" element
     */
    public void setEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$0);
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) the "email" element
     */
    public void xsetEmail(org.apache.xmlbeans.XmlString email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$0);
            }
            target.set(email);
        }
    }
}
