/*
 * An XML document type.
 * Localname: empId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.EmpIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one empId(@) element.
 *
 * This is a complex type.
 */
public class EmpIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.EmpIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmpIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPID$0 = 
        new javax.xml.namespace.QName("", "empId");
    
    
    /**
     * Gets the "empId" element
     */
    public java.lang.String getEmpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "empId" element
     */
    public org.apache.xmlbeans.XmlString xgetEmpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "empId" element
     */
    public void setEmpId(java.lang.String empId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPID$0);
            }
            target.setStringValue(empId);
        }
    }
    
    /**
     * Sets (as xml) the "empId" element
     */
    public void xsetEmpId(org.apache.xmlbeans.XmlString empId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPID$0);
            }
            target.set(empId);
        }
    }
}
