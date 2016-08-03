/*
 * An XML document type.
 * Localname: empEmpCodeMapId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.EmpEmpCodeMapIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one empEmpCodeMapId(@) element.
 *
 * This is a complex type.
 */
public class EmpEmpCodeMapIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.EmpEmpCodeMapIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmpEmpCodeMapIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPEMPCODEMAPID$0 = 
        new javax.xml.namespace.QName("", "empEmpCodeMapId");
    
    
    /**
     * Gets the "empEmpCodeMapId" element
     */
    public java.lang.String getEmpEmpCodeMapId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPEMPCODEMAPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "empEmpCodeMapId" element
     */
    public org.apache.xmlbeans.XmlString xgetEmpEmpCodeMapId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPEMPCODEMAPID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "empEmpCodeMapId" element
     */
    public void setEmpEmpCodeMapId(java.lang.String empEmpCodeMapId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPEMPCODEMAPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPEMPCODEMAPID$0);
            }
            target.setStringValue(empEmpCodeMapId);
        }
    }
    
    /**
     * Sets (as xml) the "empEmpCodeMapId" element
     */
    public void xsetEmpEmpCodeMapId(org.apache.xmlbeans.XmlString empEmpCodeMapId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPEMPCODEMAPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPEMPCODEMAPID$0);
            }
            target.set(empEmpCodeMapId);
        }
    }
}
