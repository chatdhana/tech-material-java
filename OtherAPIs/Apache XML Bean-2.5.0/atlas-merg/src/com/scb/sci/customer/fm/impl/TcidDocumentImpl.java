/*
 * An XML document type.
 * Localname: tcid
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.TcidDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one tcid(@) element.
 *
 * This is a complex type.
 */
public class TcidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.TcidDocument
{
    private static final long serialVersionUID = 1L;
    
    public TcidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TCID$0 = 
        new javax.xml.namespace.QName("", "tcid");
    
    
    /**
     * Gets the "tcid" element
     */
    public java.lang.String getTcid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TCID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tcid" element
     */
    public org.apache.xmlbeans.XmlString xgetTcid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TCID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tcid" element
     */
    public void setTcid(java.lang.String tcid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TCID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TCID$0);
            }
            target.setStringValue(tcid);
        }
    }
    
    /**
     * Sets (as xml) the "tcid" element
     */
    public void xsetTcid(org.apache.xmlbeans.XmlString tcid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TCID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TCID$0);
            }
            target.set(tcid);
        }
    }
}
