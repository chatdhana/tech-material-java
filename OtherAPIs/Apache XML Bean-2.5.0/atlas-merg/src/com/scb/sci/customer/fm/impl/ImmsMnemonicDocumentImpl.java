/*
 * An XML document type.
 * Localname: immsMnemonic
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ImmsMnemonicDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one immsMnemonic(@) element.
 *
 * This is a complex type.
 */
public class ImmsMnemonicDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ImmsMnemonicDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImmsMnemonicDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMMSMNEMONIC$0 = 
        new javax.xml.namespace.QName("", "immsMnemonic");
    
    
    /**
     * Gets the "immsMnemonic" element
     */
    public java.lang.String getImmsMnemonic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMMSMNEMONIC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "immsMnemonic" element
     */
    public org.apache.xmlbeans.XmlString xgetImmsMnemonic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMMSMNEMONIC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "immsMnemonic" element
     */
    public void setImmsMnemonic(java.lang.String immsMnemonic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMMSMNEMONIC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMMSMNEMONIC$0);
            }
            target.setStringValue(immsMnemonic);
        }
    }
    
    /**
     * Sets (as xml) the "immsMnemonic" element
     */
    public void xsetImmsMnemonic(org.apache.xmlbeans.XmlString immsMnemonic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMMSMNEMONIC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMMSMNEMONIC$0);
            }
            target.set(immsMnemonic);
        }
    }
}
