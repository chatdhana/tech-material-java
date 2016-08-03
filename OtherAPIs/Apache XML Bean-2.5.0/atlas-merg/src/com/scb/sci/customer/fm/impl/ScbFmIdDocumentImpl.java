/*
 * An XML document type.
 * Localname: scbFmId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ScbFmIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one scbFmId(@) element.
 *
 * This is a complex type.
 */
public class ScbFmIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ScbFmIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScbFmIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCBFMID$0 = 
        new javax.xml.namespace.QName("", "scbFmId");
    
    
    /**
     * Gets the "scbFmId" element
     */
    public java.lang.String getScbFmId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBFMID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scbFmId" element
     */
    public org.apache.xmlbeans.XmlString xgetScbFmId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBFMID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scbFmId" element
     */
    public void setScbFmId(java.lang.String scbFmId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBFMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBFMID$0);
            }
            target.setStringValue(scbFmId);
        }
    }
    
    /**
     * Sets (as xml) the "scbFmId" element
     */
    public void xsetScbFmId(org.apache.xmlbeans.XmlString scbFmId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBFMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBFMID$0);
            }
            target.set(scbFmId);
        }
    }
}
