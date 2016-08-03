/*
 * An XML document type.
 * Localname: armCode
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ArmCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one armCode(@) element.
 *
 * This is a complex type.
 */
public class ArmCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ArmCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArmCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARMCODE$0 = 
        new javax.xml.namespace.QName("", "armCode");
    
    
    /**
     * Gets the "armCode" element
     */
    public java.lang.String getArmCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "armCode" element
     */
    public org.apache.xmlbeans.XmlString xgetArmCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "armCode" element
     */
    public void setArmCode(java.lang.String armCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMCODE$0);
            }
            target.setStringValue(armCode);
        }
    }
    
    /**
     * Sets (as xml) the "armCode" element
     */
    public void xsetArmCode(org.apache.xmlbeans.XmlString armCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMCODE$0);
            }
            target.set(armCode);
        }
    }
}
