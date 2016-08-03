/*
 * An XML document type.
 * Localname: documentOriginatingCountry
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DocumentOriginatingCountryDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one documentOriginatingCountry(@) element.
 *
 * This is a complex type.
 */
public class DocumentOriginatingCountryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DocumentOriginatingCountryDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocumentOriginatingCountryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTORIGINATINGCOUNTRY$0 = 
        new javax.xml.namespace.QName("", "documentOriginatingCountry");
    
    
    /**
     * Gets the "documentOriginatingCountry" element
     */
    public java.lang.String getDocumentOriginatingCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTORIGINATINGCOUNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentOriginatingCountry" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentOriginatingCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTORIGINATINGCOUNTRY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "documentOriginatingCountry" element
     */
    public void setDocumentOriginatingCountry(java.lang.String documentOriginatingCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTORIGINATINGCOUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTORIGINATINGCOUNTRY$0);
            }
            target.setStringValue(documentOriginatingCountry);
        }
    }
    
    /**
     * Sets (as xml) the "documentOriginatingCountry" element
     */
    public void xsetDocumentOriginatingCountry(org.apache.xmlbeans.XmlString documentOriginatingCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTORIGINATINGCOUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTORIGINATINGCOUNTRY$0);
            }
            target.set(documentOriginatingCountry);
        }
    }
}
