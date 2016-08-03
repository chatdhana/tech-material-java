/*
 * An XML document type.
 * Localname: opicsClassCode
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.OpicsClassCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one opicsClassCode(@) element.
 *
 * This is a complex type.
 */
public class OpicsClassCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.OpicsClassCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public OpicsClassCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPICSCLASSCODE$0 = 
        new javax.xml.namespace.QName("", "opicsClassCode");
    
    
    /**
     * Gets the "opicsClassCode" element
     */
    public java.lang.String getOpicsClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPICSCLASSCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "opicsClassCode" element
     */
    public org.apache.xmlbeans.XmlString xgetOpicsClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPICSCLASSCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "opicsClassCode" element
     */
    public void setOpicsClassCode(java.lang.String opicsClassCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPICSCLASSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPICSCLASSCODE$0);
            }
            target.setStringValue(opicsClassCode);
        }
    }
    
    /**
     * Sets (as xml) the "opicsClassCode" element
     */
    public void xsetOpicsClassCode(org.apache.xmlbeans.XmlString opicsClassCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPICSCLASSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPICSCLASSCODE$0);
            }
            target.set(opicsClassCode);
        }
    }
}
