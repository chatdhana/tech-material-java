/*
 * An XML document type.
 * Localname: operationStatus2EffDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.OperationStatus2EffDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one operationStatus2EffDate(@) element.
 *
 * This is a complex type.
 */
public class OperationStatus2EffDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.OperationStatus2EffDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationStatus2EffDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONSTATUS2EFFDATE$0 = 
        new javax.xml.namespace.QName("", "operationStatus2EffDate");
    
    
    /**
     * Gets the "operationStatus2EffDate" element
     */
    public java.lang.String getOperationStatus2EffDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUS2EFFDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operationStatus2EffDate" element
     */
    public org.apache.xmlbeans.XmlString xgetOperationStatus2EffDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONSTATUS2EFFDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "operationStatus2EffDate" element
     */
    public void setOperationStatus2EffDate(java.lang.String operationStatus2EffDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUS2EFFDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONSTATUS2EFFDATE$0);
            }
            target.setStringValue(operationStatus2EffDate);
        }
    }
    
    /**
     * Sets (as xml) the "operationStatus2EffDate" element
     */
    public void xsetOperationStatus2EffDate(org.apache.xmlbeans.XmlString operationStatus2EffDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONSTATUS2EFFDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATIONSTATUS2EFFDATE$0);
            }
            target.set(operationStatus2EffDate);
        }
    }
}
