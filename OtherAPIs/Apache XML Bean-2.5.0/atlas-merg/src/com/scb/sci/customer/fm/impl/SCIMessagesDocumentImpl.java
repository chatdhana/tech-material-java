/*
 * An XML document type.
 * Localname: SCIMessages
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.SCIMessagesDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one SCIMessages(@) element.
 *
 * This is a complex type.
 */
public class SCIMessagesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.SCIMessagesDocument
{
    private static final long serialVersionUID = 1L;
    
    public SCIMessagesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCIMESSAGES$0 = 
        new javax.xml.namespace.QName("", "SCIMessages");
    
    
    /**
     * Gets the "SCIMessages" element
     */
    public com.scb.sci.customer.fm.SCIMessagesDocument.SCIMessages getSCIMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.SCIMessagesDocument.SCIMessages target = null;
            target = (com.scb.sci.customer.fm.SCIMessagesDocument.SCIMessages)get_store().find_element_user(SCIMESSAGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SCIMessages" element
     */
    public void setSCIMessages(com.scb.sci.customer.fm.SCIMessagesDocument.SCIMessages sciMessages)
    {
        generatedSetterHelperImpl(sciMessages, SCIMESSAGES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SCIMessages" element
     */
    public com.scb.sci.customer.fm.SCIMessagesDocument.SCIMessages addNewSCIMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.SCIMessagesDocument.SCIMessages target = null;
            target = (com.scb.sci.customer.fm.SCIMessagesDocument.SCIMessages)get_store().add_element_user(SCIMESSAGES$0);
            return target;
        }
    }
    /**
     * An XML SCIMessages(@).
     *
     * This is a complex type.
     */
    public static class SCIMessagesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.SCIMessagesDocument.SCIMessages
    {
        private static final long serialVersionUID = 1L;
        
        public SCIMessagesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGE$0 = 
            new javax.xml.namespace.QName("", "message");
        
        
        /**
         * Gets the "message" element
         */
        public com.scb.sci.customer.fm.MessageDocument.Message getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.MessageDocument.Message target = null;
                target = (com.scb.sci.customer.fm.MessageDocument.Message)get_store().find_element_user(MESSAGE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "message" element
         */
        public void setMessage(com.scb.sci.customer.fm.MessageDocument.Message message)
        {
            generatedSetterHelperImpl(message, MESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "message" element
         */
        public com.scb.sci.customer.fm.MessageDocument.Message addNewMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.MessageDocument.Message target = null;
                target = (com.scb.sci.customer.fm.MessageDocument.Message)get_store().add_element_user(MESSAGE$0);
                return target;
            }
        }
    }
}
