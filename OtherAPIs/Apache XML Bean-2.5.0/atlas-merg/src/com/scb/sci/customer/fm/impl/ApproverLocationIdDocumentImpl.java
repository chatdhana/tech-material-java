/*
 * An XML document type.
 * Localname: approverLocationId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ApproverLocationIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one approverLocationId(@) element.
 *
 * This is a complex type.
 */
public class ApproverLocationIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ApproverLocationIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public ApproverLocationIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPROVERLOCATIONID$0 = 
        new javax.xml.namespace.QName("", "approverLocationId");
    
    
    /**
     * Gets the "approverLocationId" element
     */
    public java.lang.String getApproverLocationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERLOCATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "approverLocationId" element
     */
    public org.apache.xmlbeans.XmlString xgetApproverLocationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERLOCATIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "approverLocationId" element
     */
    public void setApproverLocationId(java.lang.String approverLocationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERLOCATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPROVERLOCATIONID$0);
            }
            target.setStringValue(approverLocationId);
        }
    }
    
    /**
     * Sets (as xml) the "approverLocationId" element
     */
    public void xsetApproverLocationId(org.apache.xmlbeans.XmlString approverLocationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERLOCATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPROVERLOCATIONID$0);
            }
            target.set(approverLocationId);
        }
    }
}
