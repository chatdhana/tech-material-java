/*
 * An XML document type.
 * Localname: armEmpName
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ArmEmpNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one armEmpName(@) element.
 *
 * This is a complex type.
 */
public class ArmEmpNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ArmEmpNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArmEmpNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARMEMPNAME$0 = 
        new javax.xml.namespace.QName("", "armEmpName");
    
    
    /**
     * Gets the "armEmpName" element
     */
    public java.lang.String getArmEmpName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMEMPNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "armEmpName" element
     */
    public org.apache.xmlbeans.XmlString xgetArmEmpName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMEMPNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "armEmpName" element
     */
    public void setArmEmpName(java.lang.String armEmpName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMEMPNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMEMPNAME$0);
            }
            target.setStringValue(armEmpName);
        }
    }
    
    /**
     * Sets (as xml) the "armEmpName" element
     */
    public void xsetArmEmpName(org.apache.xmlbeans.XmlString armEmpName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMEMPNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMEMPNAME$0);
            }
            target.set(armEmpName);
        }
    }
}
