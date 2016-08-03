/*
 * An XML document type.
 * Localname: telex
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.TelexDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one telex(@) element.
 *
 * This is a complex type.
 */
public class TelexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.TelexDocument
{
    private static final long serialVersionUID = 1L;
    
    public TelexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEX$0 = 
        new javax.xml.namespace.QName("", "telex");
    
    
    /**
     * Gets the "telex" element
     */
    public java.lang.String getTelex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "telex" element
     */
    public org.apache.xmlbeans.XmlString xgetTelex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "telex" element
     */
    public void setTelex(java.lang.String telex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEX$0);
            }
            target.setStringValue(telex);
        }
    }
    
    /**
     * Sets (as xml) the "telex" element
     */
    public void xsetTelex(org.apache.xmlbeans.XmlString telex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEX$0);
            }
            target.set(telex);
        }
    }
}
