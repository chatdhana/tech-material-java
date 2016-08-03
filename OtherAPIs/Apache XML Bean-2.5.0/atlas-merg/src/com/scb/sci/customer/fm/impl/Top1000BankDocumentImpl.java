/*
 * An XML document type.
 * Localname: top1000Bank
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.Top1000BankDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one top1000Bank(@) element.
 *
 * This is a complex type.
 */
public class Top1000BankDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.Top1000BankDocument
{
    private static final long serialVersionUID = 1L;
    
    public Top1000BankDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOP1000BANK$0 = 
        new javax.xml.namespace.QName("", "top1000Bank");
    
    
    /**
     * Gets the "top1000Bank" element
     */
    public java.lang.String getTop1000Bank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOP1000BANK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "top1000Bank" element
     */
    public org.apache.xmlbeans.XmlString xgetTop1000Bank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOP1000BANK$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "top1000Bank" element
     */
    public void setTop1000Bank(java.lang.String top1000Bank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOP1000BANK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOP1000BANK$0);
            }
            target.setStringValue(top1000Bank);
        }
    }
    
    /**
     * Sets (as xml) the "top1000Bank" element
     */
    public void xsetTop1000Bank(org.apache.xmlbeans.XmlString top1000Bank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOP1000BANK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOP1000BANK$0);
            }
            target.set(top1000Bank);
        }
    }
}
