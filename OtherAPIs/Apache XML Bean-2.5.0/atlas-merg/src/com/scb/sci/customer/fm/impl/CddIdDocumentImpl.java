/*
 * An XML document type.
 * Localname: cddId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.CddIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one cddId(@) element.
 *
 * This is a complex type.
 */
public class CddIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CddIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public CddIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDDID$0 = 
        new javax.xml.namespace.QName("", "cddId");
    
    
    /**
     * Gets the "cddId" element
     */
    public java.lang.String getCddId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDDID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cddId" element
     */
    public org.apache.xmlbeans.XmlString xgetCddId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CDDID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cddId" element
     */
    public void setCddId(java.lang.String cddId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDDID$0);
            }
            target.setStringValue(cddId);
        }
    }
    
    /**
     * Sets (as xml) the "cddId" element
     */
    public void xsetCddId(org.apache.xmlbeans.XmlString cddId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CDDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CDDID$0);
            }
            target.set(cddId);
        }
    }
}
