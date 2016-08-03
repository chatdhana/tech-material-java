/*
 * An XML document type.
 * Localname: atlasMessage
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.holiday.AtlasMessageDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.holiday.impl;
/**
 * A document containing one atlasMessage(@) element.
 *
 * This is a complex type.
 */
public class AtlasMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.holiday.AtlasMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public AtlasMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATLASMESSAGE$0 = 
        new javax.xml.namespace.QName("", "atlasMessage");
    
    
    /**
     * Gets the "atlasMessage" element
     */
    public atlas.pubsub.xmlbeans.holiday.AtlasMessageDocument.AtlasMessage getAtlasMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.holiday.AtlasMessageDocument.AtlasMessage target = null;
            target = (atlas.pubsub.xmlbeans.holiday.AtlasMessageDocument.AtlasMessage)get_store().find_element_user(ATLASMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "atlasMessage" element
     */
    public void setAtlasMessage(atlas.pubsub.xmlbeans.holiday.AtlasMessageDocument.AtlasMessage atlasMessage)
    {
        generatedSetterHelperImpl(atlasMessage, ATLASMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "atlasMessage" element
     */
    public atlas.pubsub.xmlbeans.holiday.AtlasMessageDocument.AtlasMessage addNewAtlasMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.holiday.AtlasMessageDocument.AtlasMessage target = null;
            target = (atlas.pubsub.xmlbeans.holiday.AtlasMessageDocument.AtlasMessage)get_store().add_element_user(ATLASMESSAGE$0);
            return target;
        }
    }
    /**
     * An XML atlasMessage(@).
     *
     * This is a complex type.
     */
    public static class AtlasMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.holiday.AtlasMessageDocument.AtlasMessage
    {
        private static final long serialVersionUID = 1L;
        
        public AtlasMessageImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGE$0 = 
            new javax.xml.namespace.QName("", "message");
        private static final javax.xml.namespace.QName ATLASDELTAEVENT$2 = 
            new javax.xml.namespace.QName("", "ATLAS-DELTA-EVENT");
        
        
        /**
         * Gets the "message" element
         */
        public atlas.pubsub.xmlbeans.holiday.MessageDocument.Message getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.holiday.MessageDocument.Message target = null;
                target = (atlas.pubsub.xmlbeans.holiday.MessageDocument.Message)get_store().find_element_user(MESSAGE$0, 0);
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
        public void setMessage(atlas.pubsub.xmlbeans.holiday.MessageDocument.Message message)
        {
            generatedSetterHelperImpl(message, MESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "message" element
         */
        public atlas.pubsub.xmlbeans.holiday.MessageDocument.Message addNewMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.holiday.MessageDocument.Message target = null;
                target = (atlas.pubsub.xmlbeans.holiday.MessageDocument.Message)get_store().add_element_user(MESSAGE$0);
                return target;
            }
        }
        
        /**
         * Gets the "ATLAS-DELTA-EVENT" element
         */
        public atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT getATLASDELTAEVENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT target = null;
                target = (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT)get_store().find_element_user(ATLASDELTAEVENT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ATLAS-DELTA-EVENT" element
         */
        public void setATLASDELTAEVENT(atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT atlasdeltaevent)
        {
            generatedSetterHelperImpl(atlasdeltaevent, ATLASDELTAEVENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ATLAS-DELTA-EVENT" element
         */
        public atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT addNewATLASDELTAEVENT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT target = null;
                target = (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT)get_store().add_element_user(ATLASDELTAEVENT$2);
                return target;
            }
        }
    }
}
