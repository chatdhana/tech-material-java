/*
 * An XML document type.
 * Localname: RESPONSE
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.response.sub;


/**
 * A document containing one RESPONSE(@) element.
 *
 * This is a complex type.
 */
public interface RESPONSEDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RESPONSEDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s40D6B91DBFF1621A4AB066D9A9738340").resolveHandle("response83badoctype");
    
    /**
     * Gets the "RESPONSE" element
     */
    atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE getRESPONSE();
    
    /**
     * Sets the "RESPONSE" element
     */
    void setRESPONSE(atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE response);
    
    /**
     * Appends and returns a new empty "RESPONSE" element
     */
    atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE addNewRESPONSE();
    
    /**
     * An XML RESPONSE(@).
     *
     * This is a complex type.
     */
    public interface RESPONSE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RESPONSE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s40D6B91DBFF1621A4AB066D9A9738340").resolveHandle("response2acdelemtype");
        
        /**
         * Gets the "ACKNOWLEDGEMENT" element
         */
        java.lang.String getACKNOWLEDGEMENT();
        
        /**
         * Gets (as xml) the "ACKNOWLEDGEMENT" element
         */
        org.apache.xmlbeans.XmlString xgetACKNOWLEDGEMENT();
        
        /**
         * Sets the "ACKNOWLEDGEMENT" element
         */
        void setACKNOWLEDGEMENT(java.lang.String acknowledgement);
        
        /**
         * Sets (as xml) the "ACKNOWLEDGEMENT" element
         */
        void xsetACKNOWLEDGEMENT(org.apache.xmlbeans.XmlString acknowledgement);
        
        /**
         * Gets the "NEGATIVE-ACKNOWLEDGEMENT" element
         */
        atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT getNEGATIVEACKNOWLEDGEMENT();
        
        /**
         * Sets the "NEGATIVE-ACKNOWLEDGEMENT" element
         */
        void setNEGATIVEACKNOWLEDGEMENT(atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT negativeacknowledgement);
        
        /**
         * Appends and returns a new empty "NEGATIVE-ACKNOWLEDGEMENT" element
         */
        atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT addNewNEGATIVEACKNOWLEDGEMENT();
        
        /**
         * Gets the "atlasMessageID" attribute
         */
        java.lang.String getAtlasMessageID();
        
        /**
         * Gets (as xml) the "atlasMessageID" attribute
         */
        org.apache.xmlbeans.XmlString xgetAtlasMessageID();
        
        /**
         * True if has "atlasMessageID" attribute
         */
        boolean isSetAtlasMessageID();
        
        /**
         * Sets the "atlasMessageID" attribute
         */
        void setAtlasMessageID(java.lang.String atlasMessageID);
        
        /**
         * Sets (as xml) the "atlasMessageID" attribute
         */
        void xsetAtlasMessageID(org.apache.xmlbeans.XmlString atlasMessageID);
        
        /**
         * Unsets the "atlasMessageID" attribute
         */
        void unsetAtlasMessageID();
        
        /**
         * Gets the "publishedDateTime" attribute
         */
        java.lang.String getPublishedDateTime();
        
        /**
         * Gets (as xml) the "publishedDateTime" attribute
         */
        org.apache.xmlbeans.XmlString xgetPublishedDateTime();
        
        /**
         * True if has "publishedDateTime" attribute
         */
        boolean isSetPublishedDateTime();
        
        /**
         * Sets the "publishedDateTime" attribute
         */
        void setPublishedDateTime(java.lang.String publishedDateTime);
        
        /**
         * Sets (as xml) the "publishedDateTime" attribute
         */
        void xsetPublishedDateTime(org.apache.xmlbeans.XmlString publishedDateTime);
        
        /**
         * Unsets the "publishedDateTime" attribute
         */
        void unsetPublishedDateTime();
        
        /**
         * Gets the "subscriberName" attribute
         */
        java.lang.String getSubscriberName();
        
        /**
         * Gets (as xml) the "subscriberName" attribute
         */
        org.apache.xmlbeans.XmlString xgetSubscriberName();
        
        /**
         * True if has "subscriberName" attribute
         */
        boolean isSetSubscriberName();
        
        /**
         * Sets the "subscriberName" attribute
         */
        void setSubscriberName(java.lang.String subscriberName);
        
        /**
         * Sets (as xml) the "subscriberName" attribute
         */
        void xsetSubscriberName(org.apache.xmlbeans.XmlString subscriberName);
        
        /**
         * Unsets the "subscriberName" attribute
         */
        void unsetSubscriberName();
        
        /**
         * Gets the "messageType" attribute
         */
        java.lang.String getMessageType();
        
        /**
         * Gets (as xml) the "messageType" attribute
         */
        org.apache.xmlbeans.XmlString xgetMessageType();
        
        /**
         * True if has "messageType" attribute
         */
        boolean isSetMessageType();
        
        /**
         * Sets the "messageType" attribute
         */
        void setMessageType(java.lang.String messageType);
        
        /**
         * Sets (as xml) the "messageType" attribute
         */
        void xsetMessageType(org.apache.xmlbeans.XmlString messageType);
        
        /**
         * Unsets the "messageType" attribute
         */
        void unsetMessageType();
        
        /**
         * Gets the "subscriberLocation" attribute
         */
        java.lang.String getSubscriberLocation();
        
        /**
         * Gets (as xml) the "subscriberLocation" attribute
         */
        org.apache.xmlbeans.XmlString xgetSubscriberLocation();
        
        /**
         * True if has "subscriberLocation" attribute
         */
        boolean isSetSubscriberLocation();
        
        /**
         * Sets the "subscriberLocation" attribute
         */
        void setSubscriberLocation(java.lang.String subscriberLocation);
        
        /**
         * Sets (as xml) the "subscriberLocation" attribute
         */
        void xsetSubscriberLocation(org.apache.xmlbeans.XmlString subscriberLocation);
        
        /**
         * Unsets the "subscriberLocation" attribute
         */
        void unsetSubscriberLocation();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE newInstance() {
              return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument.RESPONSE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument newInstance() {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.response.sub.RESPONSEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
