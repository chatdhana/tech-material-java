/*
 * An XML document type.
 * Localname: fmMnemonic
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmMnemonicDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmMnemonic(@) element.
 *
 * This is a complex type.
 */
public class FmMnemonicDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmMnemonicDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmMnemonicDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMMNEMONIC$0 = 
        new javax.xml.namespace.QName("", "fmMnemonic");
    
    
    /**
     * Gets the "fmMnemonic" element
     */
    public java.lang.String getFmMnemonic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMMNEMONIC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmMnemonic" element
     */
    public org.apache.xmlbeans.XmlString xgetFmMnemonic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMMNEMONIC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmMnemonic" element
     */
    public void setFmMnemonic(java.lang.String fmMnemonic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMMNEMONIC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMMNEMONIC$0);
            }
            target.setStringValue(fmMnemonic);
        }
    }
    
    /**
     * Sets (as xml) the "fmMnemonic" element
     */
    public void xsetFmMnemonic(org.apache.xmlbeans.XmlString fmMnemonic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMMNEMONIC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMMNEMONIC$0);
            }
            target.set(fmMnemonic);
        }
    }
}
