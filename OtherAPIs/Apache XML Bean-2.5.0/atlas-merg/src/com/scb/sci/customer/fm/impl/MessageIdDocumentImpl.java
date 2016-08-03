/*
 * An XML document type.
 * Localname: messageId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.MessageIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one messageId(@) element.
 *
 * This is a complex type.
 */
public class MessageIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.MessageIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEID$0 = 
        new javax.xml.namespace.QName("", "messageId");
    
    
    /**
     * Gets the "messageId" element
     */
    public java.lang.String getMessageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageId" element
     */
    public org.apache.xmlbeans.XmlString xgetMessageId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "messageId" element
     */
    public void setMessageId(java.lang.String messageId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEID$0);
            }
            target.setStringValue(messageId);
        }
    }
    
    /**
     * Sets (as xml) the "messageId" element
     */
    public void xsetMessageId(org.apache.xmlbeans.XmlString messageId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGEID$0);
            }
            target.set(messageId);
        }
    }
}
