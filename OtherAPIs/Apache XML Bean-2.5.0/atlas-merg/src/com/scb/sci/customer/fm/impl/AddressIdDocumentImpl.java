/*
 * An XML document type.
 * Localname: addressId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.AddressIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one addressId(@) element.
 *
 * This is a complex type.
 */
public class AddressIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.AddressIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSID$0 = 
        new javax.xml.namespace.QName("", "addressId");
    
    
    /**
     * Gets the "addressId" element
     */
    public java.lang.String getAddressId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addressId" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "addressId" element
     */
    public void setAddressId(java.lang.String addressId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSID$0);
            }
            target.setStringValue(addressId);
        }
    }
    
    /**
     * Sets (as xml) the "addressId" element
     */
    public void xsetAddressId(org.apache.xmlbeans.XmlString addressId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSID$0);
            }
            target.set(addressId);
        }
    }
}
