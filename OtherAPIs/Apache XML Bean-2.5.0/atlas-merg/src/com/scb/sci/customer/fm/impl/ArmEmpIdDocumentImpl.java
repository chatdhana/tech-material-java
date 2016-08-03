/*
 * An XML document type.
 * Localname: armEmpId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ArmEmpIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one armEmpId(@) element.
 *
 * This is a complex type.
 */
public class ArmEmpIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ArmEmpIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArmEmpIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARMEMPID$0 = 
        new javax.xml.namespace.QName("", "armEmpId");
    
    
    /**
     * Gets the "armEmpId" element
     */
    public java.lang.String getArmEmpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMEMPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "armEmpId" element
     */
    public org.apache.xmlbeans.XmlString xgetArmEmpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMEMPID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "armEmpId" element
     */
    public void setArmEmpId(java.lang.String armEmpId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMEMPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMEMPID$0);
            }
            target.setStringValue(armEmpId);
        }
    }
    
    /**
     * Sets (as xml) the "armEmpId" element
     */
    public void xsetArmEmpId(org.apache.xmlbeans.XmlString armEmpId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMEMPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMEMPID$0);
            }
            target.set(armEmpId);
        }
    }
}
