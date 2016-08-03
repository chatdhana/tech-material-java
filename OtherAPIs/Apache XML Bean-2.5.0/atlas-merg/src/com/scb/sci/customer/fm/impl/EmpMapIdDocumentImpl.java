/*
 * An XML document type.
 * Localname: empMapId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.EmpMapIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one empMapId(@) element.
 *
 * This is a complex type.
 */
public class EmpMapIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.EmpMapIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmpMapIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPMAPID$0 = 
        new javax.xml.namespace.QName("", "empMapId");
    
    
    /**
     * Gets the "empMapId" element
     */
    public java.lang.String getEmpMapId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPMAPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "empMapId" element
     */
    public org.apache.xmlbeans.XmlString xgetEmpMapId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPMAPID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "empMapId" element
     */
    public void setEmpMapId(java.lang.String empMapId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPMAPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPMAPID$0);
            }
            target.setStringValue(empMapId);
        }
    }
    
    /**
     * Sets (as xml) the "empMapId" element
     */
    public void xsetEmpMapId(org.apache.xmlbeans.XmlString empMapId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPMAPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPMAPID$0);
            }
            target.set(empMapId);
        }
    }
}
