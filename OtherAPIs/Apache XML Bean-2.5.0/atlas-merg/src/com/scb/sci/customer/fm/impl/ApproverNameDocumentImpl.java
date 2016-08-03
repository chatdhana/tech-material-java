/*
 * An XML document type.
 * Localname: approverName
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ApproverNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one approverName(@) element.
 *
 * This is a complex type.
 */
public class ApproverNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ApproverNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ApproverNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPROVERNAME$0 = 
        new javax.xml.namespace.QName("", "approverName");
    
    
    /**
     * Gets the "approverName" element
     */
    public java.lang.String getApproverName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "approverName" element
     */
    public org.apache.xmlbeans.XmlString xgetApproverName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "approverName" element
     */
    public void setApproverName(java.lang.String approverName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPROVERNAME$0);
            }
            target.setStringValue(approverName);
        }
    }
    
    /**
     * Sets (as xml) the "approverName" element
     */
    public void xsetApproverName(org.apache.xmlbeans.XmlString approverName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPROVERNAME$0);
            }
            target.set(approverName);
        }
    }
}
