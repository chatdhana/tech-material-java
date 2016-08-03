/*
 * An XML document type.
 * Localname: contFax
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ContFaxDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one contFax(@) element.
 *
 * This is a complex type.
 */
public class ContFaxDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ContFaxDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContFaxDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTFAX$0 = 
        new javax.xml.namespace.QName("", "contFax");
    
    
    /**
     * Gets the "contFax" element
     */
    public java.lang.String getContFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTFAX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contFax" element
     */
    public org.apache.xmlbeans.XmlString xgetContFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTFAX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contFax" element
     */
    public void setContFax(java.lang.String contFax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTFAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTFAX$0);
            }
            target.setStringValue(contFax);
        }
    }
    
    /**
     * Sets (as xml) the "contFax" element
     */
    public void xsetContFax(org.apache.xmlbeans.XmlString contFax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTFAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTFAX$0);
            }
            target.set(contFax);
        }
    }
}
