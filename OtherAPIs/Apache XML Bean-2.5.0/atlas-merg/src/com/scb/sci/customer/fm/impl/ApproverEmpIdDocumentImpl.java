/*
 * An XML document type.
 * Localname: approverEmpId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ApproverEmpIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one approverEmpId(@) element.
 *
 * This is a complex type.
 */
public class ApproverEmpIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ApproverEmpIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public ApproverEmpIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPROVEREMPID$0 = 
        new javax.xml.namespace.QName("", "approverEmpId");
    
    
    /**
     * Gets the "approverEmpId" element
     */
    public java.lang.String getApproverEmpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVEREMPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "approverEmpId" element
     */
    public org.apache.xmlbeans.XmlString xgetApproverEmpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVEREMPID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "approverEmpId" element
     */
    public void setApproverEmpId(java.lang.String approverEmpId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVEREMPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPROVEREMPID$0);
            }
            target.setStringValue(approverEmpId);
        }
    }
    
    /**
     * Sets (as xml) the "approverEmpId" element
     */
    public void xsetApproverEmpId(org.apache.xmlbeans.XmlString approverEmpId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVEREMPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPROVEREMPID$0);
            }
            target.set(approverEmpId);
        }
    }
}
