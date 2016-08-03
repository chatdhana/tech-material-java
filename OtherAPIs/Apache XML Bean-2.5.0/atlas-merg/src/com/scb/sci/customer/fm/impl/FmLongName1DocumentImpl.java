/*
 * An XML document type.
 * Localname: fmLongName1
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmLongName1Document
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmLongName1(@) element.
 *
 * This is a complex type.
 */
public class FmLongName1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmLongName1Document
{
    private static final long serialVersionUID = 1L;
    
    public FmLongName1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMLONGNAME1$0 = 
        new javax.xml.namespace.QName("", "fmLongName1");
    
    
    /**
     * Gets the "fmLongName1" element
     */
    public java.lang.String getFmLongName1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMLONGNAME1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmLongName1" element
     */
    public org.apache.xmlbeans.XmlString xgetFmLongName1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMLONGNAME1$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmLongName1" element
     */
    public void setFmLongName1(java.lang.String fmLongName1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMLONGNAME1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMLONGNAME1$0);
            }
            target.setStringValue(fmLongName1);
        }
    }
    
    /**
     * Sets (as xml) the "fmLongName1" element
     */
    public void xsetFmLongName1(org.apache.xmlbeans.XmlString fmLongName1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMLONGNAME1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMLONGNAME1$0);
            }
            target.set(fmLongName1);
        }
    }
}
