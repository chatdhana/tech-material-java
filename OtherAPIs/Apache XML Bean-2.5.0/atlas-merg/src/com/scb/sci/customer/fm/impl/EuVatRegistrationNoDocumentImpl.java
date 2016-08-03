/*
 * An XML document type.
 * Localname: euVatRegistrationNo
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.EuVatRegistrationNoDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one euVatRegistrationNo(@) element.
 *
 * This is a complex type.
 */
public class EuVatRegistrationNoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.EuVatRegistrationNoDocument
{
    private static final long serialVersionUID = 1L;
    
    public EuVatRegistrationNoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EUVATREGISTRATIONNO$0 = 
        new javax.xml.namespace.QName("", "euVatRegistrationNo");
    
    
    /**
     * Gets the "euVatRegistrationNo" element
     */
    public java.lang.String getEuVatRegistrationNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EUVATREGISTRATIONNO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "euVatRegistrationNo" element
     */
    public org.apache.xmlbeans.XmlString xgetEuVatRegistrationNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EUVATREGISTRATIONNO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "euVatRegistrationNo" element
     */
    public void setEuVatRegistrationNo(java.lang.String euVatRegistrationNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EUVATREGISTRATIONNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EUVATREGISTRATIONNO$0);
            }
            target.setStringValue(euVatRegistrationNo);
        }
    }
    
    /**
     * Sets (as xml) the "euVatRegistrationNo" element
     */
    public void xsetEuVatRegistrationNo(org.apache.xmlbeans.XmlString euVatRegistrationNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EUVATREGISTRATIONNO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EUVATREGISTRATIONNO$0);
            }
            target.set(euVatRegistrationNo);
        }
    }
}
