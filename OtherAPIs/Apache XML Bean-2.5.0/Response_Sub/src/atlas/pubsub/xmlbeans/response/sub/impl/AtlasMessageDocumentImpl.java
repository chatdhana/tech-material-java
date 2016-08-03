/*
 * An XML document type.
 * Localname: atlasMessage
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.response.sub.AtlasMessageDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.response.sub.impl;
/**
 * A document containing one atlasMessage(@) element.
 *
 * This is a complex type.
 */
public class AtlasMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.response.sub.AtlasMessageDocument
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
    public atlas.pubsub.xmlbeans.response.sub.AtlasMessageDocument.AtlasMessage getAtlasMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.response.sub.AtlasMessageDocument.AtlasMessage target = null;
            target = (atlas.pubsub.xmlbeans.response.sub.AtlasMessageDocument.AtlasMessage)get_store().find_element_user(ATLASMESSAGE$0, 0);
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
    public void setAtlasMessage(atlas.pubsub.xmlbeans.response.sub.AtlasMessageDocument.AtlasMessage atlasMessage)
    {
        generatedSetterHelperImpl(atlasMessage, ATLASMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "atlasMessage" element
     */
    public atlas.pubsub.xmlbeans.response.sub.AtlasMessageDocument.AtlasMessage addNewAtlasMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.response.sub.AtlasMessageDocument.AtlasMessage target = null;
            target = (atlas.pubsub.xmlbeans.response.sub.AtlasMessageDocument.AtlasMessage)get_store().add_element_user(ATLASMESSAGE$0);
            return target;
        }
    }
    /**
     * An XML atlasMessage(@).
     *
     * This is a complex type.
     */
    public static class AtlasMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.response.sub.AtlasMessageDocument.AtlasMessage
    {
        private static final long serialVersionUID = 1L;
        
        public AtlasMessageImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
