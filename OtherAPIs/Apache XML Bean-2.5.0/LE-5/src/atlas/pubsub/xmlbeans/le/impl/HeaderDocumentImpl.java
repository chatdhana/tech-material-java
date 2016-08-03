/*
 * An XML document type.
 * Localname: header
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.HeaderDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one header(@) element.
 *
 * This is a complex type.
 */
public class HeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.HeaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("", "header");
    
    
    /**
     * Gets the "header" element
     */
    public atlas.pubsub.xmlbeans.le.HeaderDocument.Header getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.HeaderDocument.Header target = null;
            target = (atlas.pubsub.xmlbeans.le.HeaderDocument.Header)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "header" element
     */
    public void setHeader(atlas.pubsub.xmlbeans.le.HeaderDocument.Header header)
    {
        generatedSetterHelperImpl(header, HEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "header" element
     */
    public atlas.pubsub.xmlbeans.le.HeaderDocument.Header addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.HeaderDocument.Header target = null;
            target = (atlas.pubsub.xmlbeans.le.HeaderDocument.Header)get_store().add_element_user(HEADER$0);
            return target;
        }
    }
    /**
     * An XML header(@).
     *
     * This is a complex type.
     */
    public static class HeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.HeaderDocument.Header
    {
        private static final long serialVersionUID = 1L;
        
        public HeaderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGEID$0 = 
            new javax.xml.namespace.QName("", "messageId");
        private static final javax.xml.namespace.QName ACTION$2 = 
            new javax.xml.namespace.QName("", "action");
        private static final javax.xml.namespace.QName SOURCESYSTEM$4 = 
            new javax.xml.namespace.QName("", "sourceSystem");
        private static final javax.xml.namespace.QName ENVIRONMENT$6 = 
            new javax.xml.namespace.QName("", "environment");
        private static final javax.xml.namespace.QName MESSAGETYPE$8 = 
            new javax.xml.namespace.QName("", "messageType");
        
        
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
         * Gets the "action" element
         */
        public java.lang.String getAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "action" element
         */
        public org.apache.xmlbeans.XmlString xgetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "action" element
         */
        public void setAction(java.lang.String action)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$2);
                }
                target.setStringValue(action);
            }
        }
        
        /**
         * Sets (as xml) the "action" element
         */
        public void xsetAction(org.apache.xmlbeans.XmlString action)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTION$2);
                }
                target.set(action);
            }
        }
        
        /**
         * Gets the "sourceSystem" element
         */
        public java.lang.String getSourceSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCESYSTEM$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sourceSystem" element
         */
        public org.apache.xmlbeans.XmlString xgetSourceSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCESYSTEM$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sourceSystem" element
         */
        public void setSourceSystem(java.lang.String sourceSystem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCESYSTEM$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCESYSTEM$4);
                }
                target.setStringValue(sourceSystem);
            }
        }
        
        /**
         * Sets (as xml) the "sourceSystem" element
         */
        public void xsetSourceSystem(org.apache.xmlbeans.XmlString sourceSystem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCESYSTEM$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCESYSTEM$4);
                }
                target.set(sourceSystem);
            }
        }
        
        /**
         * Gets the "environment" element
         */
        public java.lang.String getEnvironment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIRONMENT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "environment" element
         */
        public org.apache.xmlbeans.XmlString xgetEnvironment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIRONMENT$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "environment" element
         */
        public void setEnvironment(java.lang.String environment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIRONMENT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIRONMENT$6);
                }
                target.setStringValue(environment);
            }
        }
        
        /**
         * Sets (as xml) the "environment" element
         */
        public void xsetEnvironment(org.apache.xmlbeans.XmlString environment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIRONMENT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIRONMENT$6);
                }
                target.set(environment);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGETYPE$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGETYPE$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGETYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGETYPE$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGETYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGETYPE$8);
                }
                target.set(messageType);
            }
        }
    }
}
