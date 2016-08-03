/*
 * An XML document type.
 * Localname: armEmpCodeMapId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ArmEmpCodeMapIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one armEmpCodeMapId(@) element.
 *
 * This is a complex type.
 */
public class ArmEmpCodeMapIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ArmEmpCodeMapIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArmEmpCodeMapIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARMEMPCODEMAPID$0 = 
        new javax.xml.namespace.QName("", "armEmpCodeMapId");
    
    
    /**
     * Gets the "armEmpCodeMapId" element
     */
    public java.lang.String getArmEmpCodeMapId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMEMPCODEMAPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "armEmpCodeMapId" element
     */
    public org.apache.xmlbeans.XmlString xgetArmEmpCodeMapId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMEMPCODEMAPID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "armEmpCodeMapId" element
     */
    public void setArmEmpCodeMapId(java.lang.String armEmpCodeMapId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMEMPCODEMAPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMEMPCODEMAPID$0);
            }
            target.setStringValue(armEmpCodeMapId);
        }
    }
    
    /**
     * Sets (as xml) the "armEmpCodeMapId" element
     */
    public void xsetArmEmpCodeMapId(org.apache.xmlbeans.XmlString armEmpCodeMapId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMEMPCODEMAPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMEMPCODEMAPID$0);
            }
            target.set(armEmpCodeMapId);
        }
    }
}
