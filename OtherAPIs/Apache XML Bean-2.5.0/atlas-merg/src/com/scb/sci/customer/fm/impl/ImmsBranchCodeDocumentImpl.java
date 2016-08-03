/*
 * An XML document type.
 * Localname: immsBranchCode
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ImmsBranchCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one immsBranchCode(@) element.
 *
 * This is a complex type.
 */
public class ImmsBranchCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ImmsBranchCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImmsBranchCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMMSBRANCHCODE$0 = 
        new javax.xml.namespace.QName("", "immsBranchCode");
    
    
    /**
     * Gets the "immsBranchCode" element
     */
    public java.lang.String getImmsBranchCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMMSBRANCHCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "immsBranchCode" element
     */
    public org.apache.xmlbeans.XmlString xgetImmsBranchCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMMSBRANCHCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "immsBranchCode" element
     */
    public void setImmsBranchCode(java.lang.String immsBranchCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMMSBRANCHCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMMSBRANCHCODE$0);
            }
            target.setStringValue(immsBranchCode);
        }
    }
    
    /**
     * Sets (as xml) the "immsBranchCode" element
     */
    public void xsetImmsBranchCode(org.apache.xmlbeans.XmlString immsBranchCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMMSBRANCHCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMMSBRANCHCODE$0);
            }
            target.set(immsBranchCode);
        }
    }
}
