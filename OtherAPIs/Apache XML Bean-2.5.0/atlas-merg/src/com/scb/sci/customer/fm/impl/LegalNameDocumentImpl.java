/*
 * An XML document type.
 * Localname: legalName
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.LegalNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one legalName(@) element.
 *
 * This is a complex type.
 */
public class LegalNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.LegalNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public LegalNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEGALNAME$0 = 
        new javax.xml.namespace.QName("", "legalName");
    
    
    /**
     * Gets the "legalName" element
     */
    public java.lang.String getLegalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "legalName" element
     */
    public org.apache.xmlbeans.XmlString xgetLegalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "legalName" element
     */
    public void setLegalName(java.lang.String legalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEGALNAME$0);
            }
            target.setStringValue(legalName);
        }
    }
    
    /**
     * Sets (as xml) the "legalName" element
     */
    public void xsetLegalName(org.apache.xmlbeans.XmlString legalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEGALNAME$0);
            }
            target.set(legalName);
        }
    }
}
