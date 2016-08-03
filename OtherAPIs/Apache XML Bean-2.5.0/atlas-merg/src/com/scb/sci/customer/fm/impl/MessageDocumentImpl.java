/*
 * An XML document type.
 * Localname: message
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.MessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one message(@) element.
 *
 * This is a complex type.
 */
public class MessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.MessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML message(@).
     *
     * This is a complex type.
     */
    public static class MessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.MessageDocument.Message
    {
        private static final long serialVersionUID = 1L;
        
        public MessageImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGEID$0 = 
            new javax.xml.namespace.QName("", "messageId");
        private static final javax.xml.namespace.QName MESSAGETYPE$2 = 
            new javax.xml.namespace.QName("", "messageType");
        private static final javax.xml.namespace.QName PUBLISHTYPE$4 = 
            new javax.xml.namespace.QName("", "publishType");
        private static final javax.xml.namespace.QName PUBLISHDATE$6 = 
            new javax.xml.namespace.QName("", "publishDate");
        private static final javax.xml.namespace.QName TOPICNAME$8 = 
            new javax.xml.namespace.QName("", "topicName");
        private static final javax.xml.namespace.QName SUBSCRIBERID$10 = 
            new javax.xml.namespace.QName("", "subscriberId");
        private static final javax.xml.namespace.QName TRANSACTIONPROCESSINGSYSTEMS$12 = 
            new javax.xml.namespace.QName("", "transactionProcessingSystems");
        private static final javax.xml.namespace.QName LEGALENTITY$14 = 
            new javax.xml.namespace.QName("", "legalEntity");
        
        
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
        
        /**
         * Gets the "messageType" element
         */
        public java.lang.String getMessageType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGETYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "messageType" element
         */
        public org.apache.xmlbeans.XmlString xgetMessageType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGETYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "messageType" element
         */
        public void setMessageType(java.lang.String messageType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGETYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGETYPE$2);
                }
                target.setStringValue(messageType);
            }
        }
        
        /**
         * Sets (as xml) the "messageType" element
         */
        public void xsetMessageType(org.apache.xmlbeans.XmlString messageType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGETYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGETYPE$2);
                }
                target.set(messageType);
            }
        }
        
        /**
         * Gets the "publishType" element
         */
        public java.lang.String getPublishType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHTYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "publishType" element
         */
        public org.apache.xmlbeans.XmlString xgetPublishType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLISHTYPE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "publishType" element
         */
        public void setPublishType(java.lang.String publishType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLISHTYPE$4);
                }
                target.setStringValue(publishType);
            }
        }
        
        /**
         * Sets (as xml) the "publishType" element
         */
        public void xsetPublishType(org.apache.xmlbeans.XmlString publishType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLISHTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBLISHTYPE$4);
                }
                target.set(publishType);
            }
        }
        
        /**
         * Gets the "publishDate" element
         */
        public java.lang.String getPublishDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHDATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "publishDate" element
         */
        public org.apache.xmlbeans.XmlString xgetPublishDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLISHDATE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "publishDate" element
         */
        public void setPublishDate(java.lang.String publishDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLISHDATE$6);
                }
                target.setStringValue(publishDate);
            }
        }
        
        /**
         * Sets (as xml) the "publishDate" element
         */
        public void xsetPublishDate(org.apache.xmlbeans.XmlString publishDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLISHDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBLISHDATE$6);
                }
                target.set(publishDate);
            }
        }
        
        /**
         * Gets the "topicName" element
         */
        public java.lang.String getTopicName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPICNAME$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "topicName" element
         */
        public org.apache.xmlbeans.XmlString xgetTopicName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOPICNAME$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "topicName" element
         */
        public void setTopicName(java.lang.String topicName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPICNAME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOPICNAME$8);
                }
                target.setStringValue(topicName);
            }
        }
        
        /**
         * Sets (as xml) the "topicName" element
         */
        public void xsetTopicName(org.apache.xmlbeans.XmlString topicName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOPICNAME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOPICNAME$8);
                }
                target.set(topicName);
            }
        }
        
        /**
         * Gets the "subscriberId" element
         */
        public java.lang.String getSubscriberId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERID$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subscriberId" element
         */
        public org.apache.xmlbeans.XmlString xgetSubscriberId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERID$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "subscriberId" element
         */
        public void setSubscriberId(java.lang.String subscriberId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERID$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIBERID$10);
                }
                target.setStringValue(subscriberId);
            }
        }
        
        /**
         * Sets (as xml) the "subscriberId" element
         */
        public void xsetSubscriberId(org.apache.xmlbeans.XmlString subscriberId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERID$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSCRIBERID$10);
                }
                target.set(subscriberId);
            }
        }
        
        /**
         * Gets the "transactionProcessingSystems" element
         */
        public com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems getTransactionProcessingSystems()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems target = null;
                target = (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems)get_store().find_element_user(TRANSACTIONPROCESSINGSYSTEMS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "transactionProcessingSystems" element
         */
        public boolean isSetTransactionProcessingSystems()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANSACTIONPROCESSINGSYSTEMS$12) != 0;
            }
        }
        
        /**
         * Sets the "transactionProcessingSystems" element
         */
        public void setTransactionProcessingSystems(com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems transactionProcessingSystems)
        {
            generatedSetterHelperImpl(transactionProcessingSystems, TRANSACTIONPROCESSINGSYSTEMS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "transactionProcessingSystems" element
         */
        public com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems addNewTransactionProcessingSystems()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems target = null;
                target = (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems)get_store().add_element_user(TRANSACTIONPROCESSINGSYSTEMS$12);
                return target;
            }
        }
        
        /**
         * Unsets the "transactionProcessingSystems" element
         */
        public void unsetTransactionProcessingSystems()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANSACTIONPROCESSINGSYSTEMS$12, 0);
            }
        }
        
        /**
         * Gets the "legalEntity" element
         */
        public com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity getLegalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity target = null;
                target = (com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity)get_store().find_element_user(LEGALENTITY$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "legalEntity" element
         */
        public void setLegalEntity(com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity legalEntity)
        {
            generatedSetterHelperImpl(legalEntity, LEGALENTITY$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "legalEntity" element
         */
        public com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity addNewLegalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity target = null;
                target = (com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity)get_store().add_element_user(LEGALENTITY$14);
                return target;
            }
        }
    }
}
