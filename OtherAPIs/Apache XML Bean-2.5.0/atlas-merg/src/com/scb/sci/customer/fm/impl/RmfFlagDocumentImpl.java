/*
 * An XML document type.
 * Localname: rmfFlag
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.RmfFlagDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one rmfFlag(@) element.
 *
 * This is a complex type.
 */
public class RmfFlagDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.RmfFlagDocument
{
    private static final long serialVersionUID = 1L;
    
    public RmfFlagDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RMFFLAG$0 = 
        new javax.xml.namespace.QName("", "rmfFlag");
    
    
    /**
     * Gets the "rmfFlag" element
     */
    public java.lang.String getRmfFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RMFFLAG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rmfFlag" element
     */
    public org.apache.xmlbeans.XmlString xgetRmfFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RMFFLAG$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "rmfFlag" element
     */
    public void setRmfFlag(java.lang.String rmfFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RMFFLAG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RMFFLAG$0);
            }
            target.setStringValue(rmfFlag);
        }
    }
    
    /**
     * Sets (as xml) the "rmfFlag" element
     */
    public void xsetRmfFlag(org.apache.xmlbeans.XmlString rmfFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RMFFLAG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RMFFLAG$0);
            }
            target.set(rmfFlag);
        }
    }
}
