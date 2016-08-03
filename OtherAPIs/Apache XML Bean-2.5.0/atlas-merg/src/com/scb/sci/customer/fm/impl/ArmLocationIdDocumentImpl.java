/*
 * An XML document type.
 * Localname: armLocationId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ArmLocationIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one armLocationId(@) element.
 *
 * This is a complex type.
 */
public class ArmLocationIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ArmLocationIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArmLocationIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARMLOCATIONID$0 = 
        new javax.xml.namespace.QName("", "armLocationId");
    
    
    /**
     * Gets the "armLocationId" element
     */
    public java.lang.String getArmLocationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMLOCATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "armLocationId" element
     */
    public org.apache.xmlbeans.XmlString xgetArmLocationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMLOCATIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "armLocationId" element
     */
    public void setArmLocationId(java.lang.String armLocationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMLOCATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMLOCATIONID$0);
            }
            target.setStringValue(armLocationId);
        }
    }
    
    /**
     * Sets (as xml) the "armLocationId" element
     */
    public void xsetArmLocationId(org.apache.xmlbeans.XmlString armLocationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMLOCATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMLOCATIONID$0);
            }
            target.set(armLocationId);
        }
    }
}
