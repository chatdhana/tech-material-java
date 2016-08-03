/*
 * An XML document type.
 * Localname: RESPONSE
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.response.sub.impl;
/**
 * A document containing one RESPONSE(@) element.
 *
 * This is a complex type.
 */
public class RESPONSEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument
{
    private static final long serialVersionUID = 1L;
    
    public RESPONSEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSE$0 = 
        new javax.xml.namespace.QName("", "RESPONSE");
    
    
    /**
     * Gets the "RESPONSE" element
     */
    public atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE getRESPONSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE target = null;
            target = (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RESPONSE" element
     */
    public void setRESPONSE(atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE response)
    {
        generatedSetterHelperImpl(response, RESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RESPONSE" element
     */
    public atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE addNewRESPONSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE target = null;
            target = (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE)get_store().add_element_user(RESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RESPONSE(@).
     *
     * This is a complex type.
     */
    public static class RESPONSEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE
    {
        private static final long serialVersionUID = 1L;
        
        public RESPONSEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACKNOWLEDGEMENT$0 = 
            new javax.xml.namespace.QName("", "ACKNOWLEDGEMENT");
        private static final javax.xml.namespace.QName NEGATIVEACKNOWLEDGEMENT$2 = 
            new javax.xml.namespace.QName("", "NEGATIVE-ACKNOWLEDGEMENT");
        private static final javax.xml.namespace.QName ATLASMESSAGEID$4 = 
            new javax.xml.namespace.QName("", "atlasMessageID");
        private static final javax.xml.namespace.QName PUBLISHEDDATETIME$6 = 
            new javax.xml.namespace.QName("", "publishedDateTime");
        private static final javax.xml.namespace.QName SUBSCRIBERNAME$8 = 
            new javax.xml.namespace.QName("", "subscriberName");
        private static final javax.xml.namespace.QName MESSAGETYPE$10 = 
            new javax.xml.namespace.QName("", "messageType");
        private static final javax.xml.namespace.QName SUBSCRIBERLOCATION$12 = 
            new javax.xml.namespace.QName("", "subscriberLocation");
        
        
        /**
         * Gets the "ACKNOWLEDGEMENT" element
         */
        public java.lang.String getACKNOWLEDGEMENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACKNOWLEDGEMENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ACKNOWLEDGEMENT" element
         */
        public org.apache.xmlbeans.XmlString xgetACKNOWLEDGEMENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACKNOWLEDGEMENT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ACKNOWLEDGEMENT" element
         */
        public void setACKNOWLEDGEMENT(java.lang.String acknowledgement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACKNOWLEDGEMENT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACKNOWLEDGEMENT$0);
                }
                target.setStringValue(acknowledgement);
            }
        }
        
        /**
         * Sets (as xml) the "ACKNOWLEDGEMENT" element
         */
        public void xsetACKNOWLEDGEMENT(org.apache.xmlbeans.XmlString acknowledgement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACKNOWLEDGEMENT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACKNOWLEDGEMENT$0);
                }
                target.set(acknowledgement);
            }
        }
        
        /**
         * Gets the "NEGATIVE-ACKNOWLEDGEMENT" element
         */
        public atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT getNEGATIVEACKNOWLEDGEMENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT target = null;
                target = (atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT)get_store().find_element_user(NEGATIVEACKNOWLEDGEMENT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "NEGATIVE-ACKNOWLEDGEMENT" element
         */
        public void setNEGATIVEACKNOWLEDGEMENT(atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT negativeacknowledgement)
        {
            generatedSetterHelperImpl(negativeacknowledgement, NEGATIVEACKNOWLEDGEMENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "NEGATIVE-ACKNOWLEDGEMENT" element
         */
        public atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT addNewNEGATIVEACKNOWLEDGEMENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT target = null;
                target = (atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT)get_store().add_element_user(NEGATIVEACKNOWLEDGEMENT$2);
                return target;
            }
        }
        
        /**
         * Gets the "atlasMessageID" attribute
         */
        public java.lang.String getAtlasMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATLASMESSAGEID$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "atlasMessageID" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAtlasMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ATLASMESSAGEID$4);
                return target;
            }
        }
        
        /**
         * True if has "atlasMessageID" attribute
         */
        public boolean isSetAtlasMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ATLASMESSAGEID$4) != null;
            }
        }
        
        /**
         * Sets the "atlasMessageID" attribute
         */
        public void setAtlasMessageID(java.lang.String atlasMessageID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATLASMESSAGEID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATLASMESSAGEID$4);
                }
                target.setStringValue(atlasMessageID);
            }
        }
        
        /**
         * Sets (as xml) the "atlasMessageID" attribute
         */
        public void xsetAtlasMessageID(org.apache.xmlbeans.XmlString atlasMessageID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ATLASMESSAGEID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ATLASMESSAGEID$4);
                }
                target.set(atlasMessageID);
            }
        }
        
        /**
         * Unsets the "atlasMessageID" attribute
         */
        public void unsetAtlasMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ATLASMESSAGEID$4);
            }
        }
        
        /**
         * Gets the "publishedDateTime" attribute
         */
        public java.lang.String getPublishedDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHEDDATETIME$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "publishedDateTime" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPublishedDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHEDDATETIME$6);
                return target;
            }
        }
        
        /**
         * True if has "publishedDateTime" attribute
         */
        public boolean isSetPublishedDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PUBLISHEDDATETIME$6) != null;
            }
        }
        
        /**
         * Sets the "publishedDateTime" attribute
         */
        public void setPublishedDateTime(java.lang.String publishedDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHEDDATETIME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLISHEDDATETIME$6);
                }
                target.setStringValue(publishedDateTime);
            }
        }
        
        /**
         * Sets (as xml) the "publishedDateTime" attribute
         */
        public void xsetPublishedDateTime(org.apache.xmlbeans.XmlString publishedDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHEDDATETIME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PUBLISHEDDATETIME$6);
                }
                target.set(publishedDateTime);
            }
        }
        
        /**
         * Unsets the "publishedDateTime" attribute
         */
        public void unsetPublishedDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PUBLISHEDDATETIME$6);
            }
        }
        
        /**
         * Gets the "subscriberName" attribute
         */
        public java.lang.String getSubscriberName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBSCRIBERNAME$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subscriberName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSubscriberName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUBSCRIBERNAME$8);
                return target;
            }
        }
        
        /**
         * True if has "subscriberName" attribute
         */
        public boolean isSetSubscriberName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUBSCRIBERNAME$8) != null;
            }
        }
        
        /**
         * Sets the "subscriberName" attribute
         */
        public void setSubscriberName(java.lang.String subscriberName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBSCRIBERNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBSCRIBERNAME$8);
                }
                target.setStringValue(subscriberName);
            }
        }
        
        /**
         * Sets (as xml) the "subscriberName" attribute
         */
        public void xsetSubscriberName(org.apache.xmlbeans.XmlString subscriberName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUBSCRIBERNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SUBSCRIBERNAME$8);
                }
                target.set(subscriberName);
            }
        }
        
        /**
         * Unsets the "subscriberName" attribute
         */
        public void unsetSubscriberName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUBSCRIBERNAME$8);
            }
        }
        
        /**
         * Gets the "messageType" attribute
         */
        public java.lang.String getMessageType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGETYPE$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "messageType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMessageType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGETYPE$10);
                return target;
            }
        }
        
        /**
         * True if has "messageType" attribute
         */
        public boolean isSetMessageType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MESSAGETYPE$10) != null;
            }
        }
        
        /**
         * Sets the "messageType" attribute
         */
        public void setMessageType(java.lang.String messageType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGETYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGETYPE$10);
                }
                target.setStringValue(messageType);
            }
        }
        
        /**
         * Sets (as xml) the "messageType" attribute
         */
        public void xsetMessageType(org.apache.xmlbeans.XmlString messageType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGETYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MESSAGETYPE$10);
                }
                target.set(messageType);
            }
        }
        
        /**
         * Unsets the "messageType" attribute
         */
        public void unsetMessageType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MESSAGETYPE$10);
            }
        }
        
        /**
         * Gets the "subscriberLocation" attribute
         */
        public java.lang.String getSubscriberLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBSCRIBERLOCATION$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subscriberLocation" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSubscriberLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUBSCRIBERLOCATION$12);
                return target;
            }
        }
        
        /**
         * True if has "subscriberLocation" attribute
         */
        public boolean isSetSubscriberLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUBSCRIBERLOCATION$12) != null;
            }
        }
        
        /**
         * Sets the "subscriberLocation" attribute
         */
        public void setSubscriberLocation(java.lang.String subscriberLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBSCRIBERLOCATION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBSCRIBERLOCATION$12);
                }
                target.setStringValue(subscriberLocation);
            }
        }
        
        /**
         * Sets (as xml) the "subscriberLocation" attribute
         */
        public void xsetSubscriberLocation(org.apache.xmlbeans.XmlString subscriberLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUBSCRIBERLOCATION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SUBSCRIBERLOCATION$12);
                }
                target.set(subscriberLocation);
            }
        }
        
        /**
         * Unsets the "subscriberLocation" attribute
         */
        public void unsetSubscriberLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUBSCRIBERLOCATION$12);
            }
        }
    }
}
