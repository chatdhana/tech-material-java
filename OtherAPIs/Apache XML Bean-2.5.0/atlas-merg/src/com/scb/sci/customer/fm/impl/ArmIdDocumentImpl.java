/*
 * An XML document type.
 * Localname: armId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ArmIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one armId(@) element.
 *
 * This is a complex type.
 */
public class ArmIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ArmIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArmIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARMID$0 = 
        new javax.xml.namespace.QName("", "armId");
    
    
    /**
     * Gets the "armId" element
     */
    public java.lang.String getArmId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "armId" element
     */
    public org.apache.xmlbeans.XmlString xgetArmId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "armId" element
     */
    public void setArmId(java.lang.String armId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMID$0);
            }
            target.setStringValue(armId);
        }
    }
    
    /**
     * Sets (as xml) the "armId" element
     */
    public void xsetArmId(org.apache.xmlbeans.XmlString armId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMID$0);
            }
            target.set(armId);
        }
    }
}
