/*
 * An XML document type.
 * Localname: fmBranchSysGenId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmBranchSysGenIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmBranchSysGenId(@) element.
 *
 * This is a complex type.
 */
public class FmBranchSysGenIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmBranchSysGenIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmBranchSysGenIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMBRANCHSYSGENID$0 = 
        new javax.xml.namespace.QName("", "fmBranchSysGenId");
    
    
    /**
     * Gets the "fmBranchSysGenId" element
     */
    public java.lang.String getFmBranchSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMBRANCHSYSGENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmBranchSysGenId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmBranchSysGenId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMBRANCHSYSGENID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmBranchSysGenId" element
     */
    public void setFmBranchSysGenId(java.lang.String fmBranchSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMBRANCHSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMBRANCHSYSGENID$0);
            }
            target.setStringValue(fmBranchSysGenId);
        }
    }
    
    /**
     * Sets (as xml) the "fmBranchSysGenId" element
     */
    public void xsetFmBranchSysGenId(org.apache.xmlbeans.XmlString fmBranchSysGenId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMBRANCHSYSGENID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMBRANCHSYSGENID$0);
            }
            target.set(fmBranchSysGenId);
        }
    }
}
