/*
 * An XML document type.
 * Localname: empCode
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.EmpCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one empCode(@) element.
 *
 * This is a complex type.
 */
public class EmpCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.EmpCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmpCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPCODE$0 = 
        new javax.xml.namespace.QName("", "empCode");
    
    
    /**
     * Gets the "empCode" element
     */
    public java.lang.String getEmpCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "empCode" element
     */
    public org.apache.xmlbeans.XmlString xgetEmpCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "empCode" element
     */
    public void setEmpCode(java.lang.String empCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPCODE$0);
            }
            target.setStringValue(empCode);
        }
    }
    
    /**
     * Sets (as xml) the "empCode" element
     */
    public void xsetEmpCode(org.apache.xmlbeans.XmlString empCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPCODE$0);
            }
            target.set(empCode);
        }
    }
}
