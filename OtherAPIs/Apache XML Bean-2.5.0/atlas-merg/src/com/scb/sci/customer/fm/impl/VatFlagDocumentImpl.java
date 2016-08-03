/*
 * An XML document type.
 * Localname: vatFlag
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.VatFlagDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one vatFlag(@) element.
 *
 * This is a complex type.
 */
public class VatFlagDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.VatFlagDocument
{
    private static final long serialVersionUID = 1L;
    
    public VatFlagDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VATFLAG$0 = 
        new javax.xml.namespace.QName("", "vatFlag");
    
    
    /**
     * Gets the "vatFlag" element
     */
    public java.lang.String getVatFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VATFLAG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "vatFlag" element
     */
    public org.apache.xmlbeans.XmlString xgetVatFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VATFLAG$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "vatFlag" element
     */
    public void setVatFlag(java.lang.String vatFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VATFLAG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VATFLAG$0);
            }
            target.setStringValue(vatFlag);
        }
    }
    
    /**
     * Sets (as xml) the "vatFlag" element
     */
    public void xsetVatFlag(org.apache.xmlbeans.XmlString vatFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VATFLAG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VATFLAG$0);
            }
            target.set(vatFlag);
        }
    }
}
