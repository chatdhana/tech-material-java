/*
 * An XML document type.
 * Localname: empName
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.EmpNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one empName(@) element.
 *
 * This is a complex type.
 */
public class EmpNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.EmpNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmpNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPNAME$0 = 
        new javax.xml.namespace.QName("", "empName");
    
    
    /**
     * Gets the "empName" element
     */
    public java.lang.String getEmpName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "empName" element
     */
    public org.apache.xmlbeans.XmlString xgetEmpName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "empName" element
     */
    public void setEmpName(java.lang.String empName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPNAME$0);
            }
            target.setStringValue(empName);
        }
    }
    
    /**
     * Sets (as xml) the "empName" element
     */
    public void xsetEmpName(org.apache.xmlbeans.XmlString empName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPNAME$0);
            }
            target.set(empName);
        }
    }
}
