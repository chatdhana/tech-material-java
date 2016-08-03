/*
 * An XML document type.
 * Localname: attnParty
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.AttnPartyDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one attnParty(@) element.
 *
 * This is a complex type.
 */
public class AttnPartyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.AttnPartyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttnPartyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTNPARTY$0 = 
        new javax.xml.namespace.QName("", "attnParty");
    
    
    /**
     * Gets the "attnParty" element
     */
    public java.lang.String getAttnParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTNPARTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attnParty" element
     */
    public org.apache.xmlbeans.XmlString xgetAttnParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTNPARTY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "attnParty" element
     */
    public void setAttnParty(java.lang.String attnParty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTNPARTY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTNPARTY$0);
            }
            target.setStringValue(attnParty);
        }
    }
    
    /**
     * Sets (as xml) the "attnParty" element
     */
    public void xsetAttnParty(org.apache.xmlbeans.XmlString attnParty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTNPARTY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTNPARTY$0);
            }
            target.set(attnParty);
        }
    }
}
