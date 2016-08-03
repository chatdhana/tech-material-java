/*
 * An XML document type.
 * Localname: fmLongName
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmLongNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmLongName(@) element.
 *
 * This is a complex type.
 */
public class FmLongNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmLongNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmLongNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMLONGNAME$0 = 
        new javax.xml.namespace.QName("", "fmLongName");
    
    
    /**
     * Gets the "fmLongName" element
     */
    public java.lang.String getFmLongName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMLONGNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmLongName" element
     */
    public org.apache.xmlbeans.XmlString xgetFmLongName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMLONGNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmLongName" element
     */
    public void setFmLongName(java.lang.String fmLongName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMLONGNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMLONGNAME$0);
            }
            target.setStringValue(fmLongName);
        }
    }
    
    /**
     * Sets (as xml) the "fmLongName" element
     */
    public void xsetFmLongName(org.apache.xmlbeans.XmlString fmLongName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMLONGNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMLONGNAME$0);
            }
            target.set(fmLongName);
        }
    }
}
