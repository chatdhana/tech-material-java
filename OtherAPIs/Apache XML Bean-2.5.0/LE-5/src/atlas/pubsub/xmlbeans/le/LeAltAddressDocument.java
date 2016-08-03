/*
 * An XML document type.
 * Localname: leAltAddress
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeAltAddressDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le;


/**
 * A document containing one leAltAddress(@) element.
 *
 * This is a complex type.
 */
public interface LeAltAddressDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LeAltAddressDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("lealtaddress7b5ddoctype");
    
    /**
     * Gets the "leAltAddress" element
     */
    atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress getLeAltAddress();
    
    /**
     * Sets the "leAltAddress" element
     */
    void setLeAltAddress(atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress leAltAddress);
    
    /**
     * Appends and returns a new empty "leAltAddress" element
     */
    atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress addNewLeAltAddress();
    
    /**
     * An XML leAltAddress(@).
     *
     * This is a complex type.
     */
    public interface LeAltAddress extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LeAltAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("lealtaddressde6delemtype");
        
        /**
         * Gets a List of "leAltAddressInfo" elements
         */
        java.util.List<atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo> getLeAltAddressInfoList();
        
        /**
         * Gets array of all "leAltAddressInfo" elements
         * @deprecated
         */
        @Deprecated
        atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo[] getLeAltAddressInfoArray();
        
        /**
         * Gets ith "leAltAddressInfo" element
         */
        atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo getLeAltAddressInfoArray(int i);
        
        /**
         * Returns number of "leAltAddressInfo" element
         */
        int sizeOfLeAltAddressInfoArray();
        
        /**
         * Sets array of all "leAltAddressInfo" element
         */
        void setLeAltAddressInfoArray(atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo[] leAltAddressInfoArray);
        
        /**
         * Sets ith "leAltAddressInfo" element
         */
        void setLeAltAddressInfoArray(int i, atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo leAltAddressInfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leAltAddressInfo" element
         */
        atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo insertNewLeAltAddressInfo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leAltAddressInfo" element
         */
        atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo addNewLeAltAddressInfo();
        
        /**
         * Removes the ith "leAltAddressInfo" element
         */
        void removeLeAltAddressInfo(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress newInstance() {
              return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument newInstance() {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.LeAltAddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
