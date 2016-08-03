/*
 * An XML document type.
 * Localname: accountFidessaViewCode
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.AccountFidessaViewCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one accountFidessaViewCode(@) element.
 *
 * This is a complex type.
 */
public class AccountFidessaViewCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.AccountFidessaViewCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccountFidessaViewCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTFIDESSAVIEWCODE$0 = 
        new javax.xml.namespace.QName("", "accountFidessaViewCode");
    
    
    /**
     * Gets the "accountFidessaViewCode" element
     */
    public java.lang.String getAccountFidessaViewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTFIDESSAVIEWCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "accountFidessaViewCode" element
     */
    public org.apache.xmlbeans.XmlString xgetAccountFidessaViewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTFIDESSAVIEWCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "accountFidessaViewCode" element
     */
    public void setAccountFidessaViewCode(java.lang.String accountFidessaViewCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTFIDESSAVIEWCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTFIDESSAVIEWCODE$0);
            }
            target.setStringValue(accountFidessaViewCode);
        }
    }
    
    /**
     * Sets (as xml) the "accountFidessaViewCode" element
     */
    public void xsetAccountFidessaViewCode(org.apache.xmlbeans.XmlString accountFidessaViewCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTFIDESSAVIEWCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCOUNTFIDESSAVIEWCODE$0);
            }
            target.set(accountFidessaViewCode);
        }
    }
}
