/*
 * An XML document type.
 * Localname: swiftCountryCode
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.SwiftCountryCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one swiftCountryCode(@) element.
 *
 * This is a complex type.
 */
public class SwiftCountryCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.SwiftCountryCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public SwiftCountryCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SWIFTCOUNTRYCODE$0 = 
        new javax.xml.namespace.QName("", "swiftCountryCode");
    
    
    /**
     * Gets the "swiftCountryCode" element
     */
    public java.lang.String getSwiftCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIFTCOUNTRYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "swiftCountryCode" element
     */
    public org.apache.xmlbeans.XmlString xgetSwiftCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIFTCOUNTRYCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "swiftCountryCode" element
     */
    public void setSwiftCountryCode(java.lang.String swiftCountryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIFTCOUNTRYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SWIFTCOUNTRYCODE$0);
            }
            target.setStringValue(swiftCountryCode);
        }
    }
    
    /**
     * Sets (as xml) the "swiftCountryCode" element
     */
    public void xsetSwiftCountryCode(org.apache.xmlbeans.XmlString swiftCountryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIFTCOUNTRYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SWIFTCOUNTRYCODE$0);
            }
            target.set(swiftCountryCode);
        }
    }
}
