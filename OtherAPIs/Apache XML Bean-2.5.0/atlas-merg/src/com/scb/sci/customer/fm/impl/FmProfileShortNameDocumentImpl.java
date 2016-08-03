/*
 * An XML document type.
 * Localname: fmProfileShortName
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmProfileShortNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmProfileShortName(@) element.
 *
 * This is a complex type.
 */
public class FmProfileShortNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmProfileShortNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmProfileShortNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMPROFILESHORTNAME$0 = 
        new javax.xml.namespace.QName("", "fmProfileShortName");
    
    
    /**
     * Gets the "fmProfileShortName" element
     */
    public java.lang.String getFmProfileShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMPROFILESHORTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmProfileShortName" element
     */
    public org.apache.xmlbeans.XmlString xgetFmProfileShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMPROFILESHORTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmProfileShortName" element
     */
    public void setFmProfileShortName(java.lang.String fmProfileShortName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMPROFILESHORTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMPROFILESHORTNAME$0);
            }
            target.setStringValue(fmProfileShortName);
        }
    }
    
    /**
     * Sets (as xml) the "fmProfileShortName" element
     */
    public void xsetFmProfileShortName(org.apache.xmlbeans.XmlString fmProfileShortName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMPROFILESHORTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMPROFILESHORTNAME$0);
            }
            target.set(fmProfileShortName);
        }
    }
}
