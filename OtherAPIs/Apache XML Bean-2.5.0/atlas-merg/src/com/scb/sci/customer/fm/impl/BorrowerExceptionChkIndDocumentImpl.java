/*
 * An XML document type.
 * Localname: borrowerExceptionChkInd
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.BorrowerExceptionChkIndDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one borrowerExceptionChkInd(@) element.
 *
 * This is a complex type.
 */
public class BorrowerExceptionChkIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.BorrowerExceptionChkIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public BorrowerExceptionChkIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BORROWEREXCEPTIONCHKIND$0 = 
        new javax.xml.namespace.QName("", "borrowerExceptionChkInd");
    
    
    /**
     * Gets the "borrowerExceptionChkInd" element
     */
    public java.lang.String getBorrowerExceptionChkInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BORROWEREXCEPTIONCHKIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "borrowerExceptionChkInd" element
     */
    public org.apache.xmlbeans.XmlString xgetBorrowerExceptionChkInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BORROWEREXCEPTIONCHKIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "borrowerExceptionChkInd" element
     */
    public void setBorrowerExceptionChkInd(java.lang.String borrowerExceptionChkInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BORROWEREXCEPTIONCHKIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BORROWEREXCEPTIONCHKIND$0);
            }
            target.setStringValue(borrowerExceptionChkInd);
        }
    }
    
    /**
     * Sets (as xml) the "borrowerExceptionChkInd" element
     */
    public void xsetBorrowerExceptionChkInd(org.apache.xmlbeans.XmlString borrowerExceptionChkInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BORROWEREXCEPTIONCHKIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BORROWEREXCEPTIONCHKIND$0);
            }
            target.set(borrowerExceptionChkInd);
        }
    }
}
