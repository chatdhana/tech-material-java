/*
 * An XML document type.
 * Localname: ISICId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ISICIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one ISICId(@) element.
 *
 * This is a complex type.
 */
public class ISICIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ISICIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public ISICIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISICID$0 = 
        new javax.xml.namespace.QName("", "ISICId");
    
    
    /**
     * Gets the "ISICId" element
     */
    public java.lang.String getISICId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ISICId" element
     */
    public org.apache.xmlbeans.XmlString xgetISICId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ISICId" element
     */
    public void setISICId(java.lang.String isicId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISICID$0);
            }
            target.setStringValue(isicId);
        }
    }
    
    /**
     * Sets (as xml) the "ISICId" element
     */
    public void xsetISICId(org.apache.xmlbeans.XmlString isicId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISICID$0);
            }
            target.set(isicId);
        }
    }
}
