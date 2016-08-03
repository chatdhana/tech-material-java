/*
 * An XML document type.
 * Localname: bankingSecrecyActInd
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.BankingSecrecyActIndDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one bankingSecrecyActInd(@) element.
 *
 * This is a complex type.
 */
public class BankingSecrecyActIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.BankingSecrecyActIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public BankingSecrecyActIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BANKINGSECRECYACTIND$0 = 
        new javax.xml.namespace.QName("", "bankingSecrecyActInd");
    
    
    /**
     * Gets the "bankingSecrecyActInd" element
     */
    public java.lang.String getBankingSecrecyActInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BANKINGSECRECYACTIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bankingSecrecyActInd" element
     */
    public org.apache.xmlbeans.XmlString xgetBankingSecrecyActInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BANKINGSECRECYACTIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bankingSecrecyActInd" element
     */
    public void setBankingSecrecyActInd(java.lang.String bankingSecrecyActInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BANKINGSECRECYACTIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BANKINGSECRECYACTIND$0);
            }
            target.setStringValue(bankingSecrecyActInd);
        }
    }
    
    /**
     * Sets (as xml) the "bankingSecrecyActInd" element
     */
    public void xsetBankingSecrecyActInd(org.apache.xmlbeans.XmlString bankingSecrecyActInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BANKINGSECRECYACTIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BANKINGSECRECYACTIND$0);
            }
            target.set(bankingSecrecyActInd);
        }
    }
}
