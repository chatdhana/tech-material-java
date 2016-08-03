/*
 * An XML document type.
 * Localname: armLocationOrganization
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ArmLocationOrganizationDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one armLocationOrganization(@) element.
 *
 * This is a complex type.
 */
public class ArmLocationOrganizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ArmLocationOrganizationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArmLocationOrganizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARMLOCATIONORGANIZATION$0 = 
        new javax.xml.namespace.QName("", "armLocationOrganization");
    
    
    /**
     * Gets the "armLocationOrganization" element
     */
    public java.lang.String getArmLocationOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMLOCATIONORGANIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "armLocationOrganization" element
     */
    public org.apache.xmlbeans.XmlString xgetArmLocationOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMLOCATIONORGANIZATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "armLocationOrganization" element
     */
    public void setArmLocationOrganization(java.lang.String armLocationOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMLOCATIONORGANIZATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMLOCATIONORGANIZATION$0);
            }
            target.setStringValue(armLocationOrganization);
        }
    }
    
    /**
     * Sets (as xml) the "armLocationOrganization" element
     */
    public void xsetArmLocationOrganization(org.apache.xmlbeans.XmlString armLocationOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMLOCATIONORGANIZATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMLOCATIONORGANIZATION$0);
            }
            target.set(armLocationOrganization);
        }
    }
}
