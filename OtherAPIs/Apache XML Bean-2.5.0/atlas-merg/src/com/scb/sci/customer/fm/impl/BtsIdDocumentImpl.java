/*
 * An XML document type.
 * Localname: btsId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.BtsIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one btsId(@) element.
 *
 * This is a complex type.
 */
public class BtsIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.BtsIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public BtsIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BTSID$0 = 
        new javax.xml.namespace.QName("", "btsId");
    
    
    /**
     * Gets the "btsId" element
     */
    public java.lang.String getBtsId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BTSID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "btsId" element
     */
    public org.apache.xmlbeans.XmlString xgetBtsId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BTSID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "btsId" element
     */
    public void setBtsId(java.lang.String btsId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BTSID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BTSID$0);
            }
            target.setStringValue(btsId);
        }
    }
    
    /**
     * Sets (as xml) the "btsId" element
     */
    public void xsetBtsId(org.apache.xmlbeans.XmlString btsId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BTSID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BTSID$0);
            }
            target.set(btsId);
        }
    }
}
