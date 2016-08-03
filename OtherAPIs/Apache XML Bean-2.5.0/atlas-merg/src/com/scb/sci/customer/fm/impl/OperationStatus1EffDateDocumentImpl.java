/*
 * An XML document type.
 * Localname: operationStatus1EffDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.OperationStatus1EffDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one operationStatus1EffDate(@) element.
 *
 * This is a complex type.
 */
public class OperationStatus1EffDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.OperationStatus1EffDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationStatus1EffDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONSTATUS1EFFDATE$0 = 
        new javax.xml.namespace.QName("", "operationStatus1EffDate");
    
    
    /**
     * Gets the "operationStatus1EffDate" element
     */
    public java.lang.String getOperationStatus1EffDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUS1EFFDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operationStatus1EffDate" element
     */
    public org.apache.xmlbeans.XmlString xgetOperationStatus1EffDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONSTATUS1EFFDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "operationStatus1EffDate" element
     */
    public void setOperationStatus1EffDate(java.lang.String operationStatus1EffDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUS1EFFDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONSTATUS1EFFDATE$0);
            }
            target.setStringValue(operationStatus1EffDate);
        }
    }
    
    /**
     * Sets (as xml) the "operationStatus1EffDate" element
     */
    public void xsetOperationStatus1EffDate(org.apache.xmlbeans.XmlString operationStatus1EffDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONSTATUS1EFFDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATIONSTATUS1EFFDATE$0);
            }
            target.set(operationStatus1EffDate);
        }
    }
}
