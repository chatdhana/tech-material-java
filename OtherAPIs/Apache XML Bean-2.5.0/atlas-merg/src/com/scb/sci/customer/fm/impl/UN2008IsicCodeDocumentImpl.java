/*
 * An XML document type.
 * Localname: UN2008IsicCode
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.UN2008IsicCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one UN2008IsicCode(@) element.
 *
 * This is a complex type.
 */
public class UN2008IsicCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.UN2008IsicCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public UN2008IsicCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UN2008ISICCODE$0 = 
        new javax.xml.namespace.QName("", "UN2008IsicCode");
    
    
    /**
     * Gets the "UN2008IsicCode" element
     */
    public java.lang.String getUN2008IsicCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UN2008ISICCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UN2008IsicCode" element
     */
    public org.apache.xmlbeans.XmlString xgetUN2008IsicCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UN2008ISICCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UN2008IsicCode" element
     */
    public void setUN2008IsicCode(java.lang.String un2008IsicCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UN2008ISICCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UN2008ISICCODE$0);
            }
            target.setStringValue(un2008IsicCode);
        }
    }
    
    /**
     * Sets (as xml) the "UN2008IsicCode" element
     */
    public void xsetUN2008IsicCode(org.apache.xmlbeans.XmlString un2008IsicCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UN2008ISICCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UN2008ISICCODE$0);
            }
            target.set(un2008IsicCode);
        }
    }
}
