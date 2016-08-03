/*
 * An XML document type.
 * Localname: phoneConfirm
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.PhoneConfirmDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one phoneConfirm(@) element.
 *
 * This is a complex type.
 */
public class PhoneConfirmDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.PhoneConfirmDocument
{
    private static final long serialVersionUID = 1L;
    
    public PhoneConfirmDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHONECONFIRM$0 = 
        new javax.xml.namespace.QName("", "phoneConfirm");
    
    
    /**
     * Gets the "phoneConfirm" element
     */
    public java.lang.String getPhoneConfirm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONECONFIRM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "phoneConfirm" element
     */
    public org.apache.xmlbeans.XmlString xgetPhoneConfirm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONECONFIRM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "phoneConfirm" element
     */
    public void setPhoneConfirm(java.lang.String phoneConfirm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONECONFIRM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONECONFIRM$0);
            }
            target.setStringValue(phoneConfirm);
        }
    }
    
    /**
     * Sets (as xml) the "phoneConfirm" element
     */
    public void xsetPhoneConfirm(org.apache.xmlbeans.XmlString phoneConfirm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONECONFIRM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONECONFIRM$0);
            }
            target.set(phoneConfirm);
        }
    }
}
