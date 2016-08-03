/*
 * An XML document type.
 * Localname: fax
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FaxDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fax(@) element.
 *
 * This is a complex type.
 */
public class FaxDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FaxDocument
{
    private static final long serialVersionUID = 1L;
    
    public FaxDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAX$0 = 
        new javax.xml.namespace.QName("", "fax");
    
    
    /**
     * Gets the "fax" element
     */
    public java.lang.String getFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fax" element
     */
    public org.apache.xmlbeans.XmlString xgetFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fax" element
     */
    public void setFax(java.lang.String fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$0);
            }
            target.setStringValue(fax);
        }
    }
    
    /**
     * Sets (as xml) the "fax" element
     */
    public void xsetFax(org.apache.xmlbeans.XmlString fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$0);
            }
            target.set(fax);
        }
    }
}
