/*
 * An XML document type.
 * Localname: clientFidessaViewCode
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ClientFidessaViewCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one clientFidessaViewCode(@) element.
 *
 * This is a complex type.
 */
public class ClientFidessaViewCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ClientFidessaViewCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClientFidessaViewCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTFIDESSAVIEWCODE$0 = 
        new javax.xml.namespace.QName("", "clientFidessaViewCode");
    
    
    /**
     * Gets the "clientFidessaViewCode" element
     */
    public java.lang.String getClientFidessaViewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTFIDESSAVIEWCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "clientFidessaViewCode" element
     */
    public org.apache.xmlbeans.XmlString xgetClientFidessaViewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTFIDESSAVIEWCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "clientFidessaViewCode" element
     */
    public void setClientFidessaViewCode(java.lang.String clientFidessaViewCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTFIDESSAVIEWCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENTFIDESSAVIEWCODE$0);
            }
            target.setStringValue(clientFidessaViewCode);
        }
    }
    
    /**
     * Sets (as xml) the "clientFidessaViewCode" element
     */
    public void xsetClientFidessaViewCode(org.apache.xmlbeans.XmlString clientFidessaViewCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTFIDESSAVIEWCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENTFIDESSAVIEWCODE$0);
            }
            target.set(clientFidessaViewCode);
        }
    }
}
