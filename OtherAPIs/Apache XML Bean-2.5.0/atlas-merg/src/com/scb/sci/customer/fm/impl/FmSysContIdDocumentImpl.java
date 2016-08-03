/*
 * An XML document type.
 * Localname: fmSysContId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmSysContIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmSysContId(@) element.
 *
 * This is a complex type.
 */
public class FmSysContIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmSysContIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmSysContIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMSYSCONTID$0 = 
        new javax.xml.namespace.QName("", "fmSysContId");
    
    
    /**
     * Gets the "fmSysContId" element
     */
    public java.lang.String getFmSysContId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMSYSCONTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmSysContId" element
     */
    public org.apache.xmlbeans.XmlString xgetFmSysContId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMSYSCONTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmSysContId" element
     */
    public void setFmSysContId(java.lang.String fmSysContId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMSYSCONTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMSYSCONTID$0);
            }
            target.setStringValue(fmSysContId);
        }
    }
    
    /**
     * Sets (as xml) the "fmSysContId" element
     */
    public void xsetFmSysContId(org.apache.xmlbeans.XmlString fmSysContId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMSYSCONTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMSYSCONTID$0);
            }
            target.set(fmSysContId);
        }
    }
}
