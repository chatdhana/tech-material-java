/*
 * An XML document type.
 * Localname: exceptionalApprovalObtained
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ExceptionalApprovalObtainedDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one exceptionalApprovalObtained(@) element.
 *
 * This is a complex type.
 */
public class ExceptionalApprovalObtainedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ExceptionalApprovalObtainedDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExceptionalApprovalObtainedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCEPTIONALAPPROVALOBTAINED$0 = 
        new javax.xml.namespace.QName("", "exceptionalApprovalObtained");
    
    
    /**
     * Gets the "exceptionalApprovalObtained" element
     */
    public java.lang.String getExceptionalApprovalObtained()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCEPTIONALAPPROVALOBTAINED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "exceptionalApprovalObtained" element
     */
    public org.apache.xmlbeans.XmlString xgetExceptionalApprovalObtained()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCEPTIONALAPPROVALOBTAINED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "exceptionalApprovalObtained" element
     */
    public void setExceptionalApprovalObtained(java.lang.String exceptionalApprovalObtained)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCEPTIONALAPPROVALOBTAINED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCEPTIONALAPPROVALOBTAINED$0);
            }
            target.setStringValue(exceptionalApprovalObtained);
        }
    }
    
    /**
     * Sets (as xml) the "exceptionalApprovalObtained" element
     */
    public void xsetExceptionalApprovalObtained(org.apache.xmlbeans.XmlString exceptionalApprovalObtained)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCEPTIONALAPPROVALOBTAINED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXCEPTIONALAPPROVALOBTAINED$0);
            }
            target.set(exceptionalApprovalObtained);
        }
    }
}
