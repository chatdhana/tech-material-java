/*
 * An XML document type.
 * Localname: usTaxId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.UsTaxIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one usTaxId(@) element.
 *
 * This is a complex type.
 */
public class UsTaxIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.UsTaxIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsTaxIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USTAXID$0 = 
        new javax.xml.namespace.QName("", "usTaxId");
    
    
    /**
     * Gets the "usTaxId" element
     */
    public java.lang.String getUsTaxId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USTAXID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "usTaxId" element
     */
    public org.apache.xmlbeans.XmlString xgetUsTaxId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USTAXID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "usTaxId" element
     */
    public void setUsTaxId(java.lang.String usTaxId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USTAXID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USTAXID$0);
            }
            target.setStringValue(usTaxId);
        }
    }
    
    /**
     * Sets (as xml) the "usTaxId" element
     */
    public void xsetUsTaxId(org.apache.xmlbeans.XmlString usTaxId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USTAXID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USTAXID$0);
            }
            target.set(usTaxId);
        }
    }
}
