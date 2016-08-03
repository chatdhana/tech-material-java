/*
 * An XML document type.
 * Localname: message
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.MessageDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le;


/**
 * A document containing one message(@) element.
 *
 * This is a complex type.
 */
public interface MessageDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("message2d6edoctype");
    
    /**
     * Gets the "message" element
     */
    atlas.pubsub.xmlbeans.le.MessageDocument.Message getMessage();
    
    /**
     * Sets the "message" element
     */
    void setMessage(atlas.pubsub.xmlbeans.le.MessageDocument.Message message);
    
    /**
     * Appends and returns a new empty "message" element
     */
    atlas.pubsub.xmlbeans.le.MessageDocument.Message addNewMessage();
    
    /**
     * An XML message(@).
     *
     * This is a complex type.
     */
    public interface Message extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Message.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("message3231elemtype");
        
        /**
         * Gets the "messageId" element
         */
        java.lang.String getMessageId();
        
        /**
         * Gets (as xml) the "messageId" element
         */
        org.apache.xmlbeans.XmlString xgetMessageId();
        
        /**
         * Sets the "messageId" element
         */
        void setMessageId(java.lang.String messageId);
        
        /**
         * Sets (as xml) the "messageId" element
         */
        void xsetMessageId(org.apache.xmlbeans.XmlString messageId);
        
        /**
         * Gets the "messageType" element
         */
        java.lang.String getMessageType();
        
        /**
         * Gets (as xml) the "messageType" element
         */
        org.apache.xmlbeans.XmlString xgetMessageType();
        
        /**
         * Sets the "messageType" element
         */
        void setMessageType(java.lang.String messageType);
        
        /**
         * Sets (as xml) the "messageType" element
         */
        void xsetMessageType(org.apache.xmlbeans.XmlString messageType);
        
        /**
         * Gets the "publishType" element
         */
        java.lang.String getPublishType();
        
        /**
         * Gets (as xml) the "publishType" element
         */
        org.apache.xmlbeans.XmlString xgetPublishType();
        
        /**
         * Sets the "publishType" element
         */
        void setPublishType(java.lang.String publishType);
        
        /**
         * Sets (as xml) the "publishType" element
         */
        void xsetPublishType(org.apache.xmlbeans.XmlString publishType);
        
        /**
         * Gets the "publishDate" element
         */
        java.lang.String getPublishDate();
        
        /**
         * Gets (as xml) the "publishDate" element
         */
        org.apache.xmlbeans.XmlString xgetPublishDate();
        
        /**
         * Sets the "publishDate" element
         */
        void setPublishDate(java.lang.String publishDate);
        
        /**
         * Sets (as xml) the "publishDate" element
         */
        void xsetPublishDate(org.apache.xmlbeans.XmlString publishDate);
        
        /**
         * Gets the "topicName" element
         */
        java.lang.String getTopicName();
        
        /**
         * Gets (as xml) the "topicName" element
         */
        org.apache.xmlbeans.XmlString xgetTopicName();
        
        /**
         * Sets the "topicName" element
         */
        void setTopicName(java.lang.String topicName);
        
        /**
         * Sets (as xml) the "topicName" element
         */
        void xsetTopicName(org.apache.xmlbeans.XmlString topicName);
        
        /**
         * Gets the "subscriberId" element
         */
        java.lang.String getSubscriberId();
        
        /**
         * Gets (as xml) the "subscriberId" element
         */
        org.apache.xmlbeans.XmlString xgetSubscriberId();
        
        /**
         * Sets the "subscriberId" element
         */
        void setSubscriberId(java.lang.String subscriberId);
        
        /**
         * Sets (as xml) the "subscriberId" element
         */
        void xsetSubscriberId(org.apache.xmlbeans.XmlString subscriberId);
        
        /**
         * Gets the "transactionProcessingSystems" element
         */
        atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems getTransactionProcessingSystems();
        
        /**
         * Sets the "transactionProcessingSystems" element
         */
        void setTransactionProcessingSystems(atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems transactionProcessingSystems);
        
        /**
         * Appends and returns a new empty "transactionProcessingSystems" element
         */
        atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems addNewTransactionProcessingSystems();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static atlas.pubsub.xmlbeans.le.MessageDocument.Message newInstance() {
              return (atlas.pubsub.xmlbeans.le.MessageDocument.Message) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static atlas.pubsub.xmlbeans.le.MessageDocument.Message newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (atlas.pubsub.xmlbeans.le.MessageDocument.Message) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.le.MessageDocument newInstance() {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.MessageDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.MessageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.MessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
