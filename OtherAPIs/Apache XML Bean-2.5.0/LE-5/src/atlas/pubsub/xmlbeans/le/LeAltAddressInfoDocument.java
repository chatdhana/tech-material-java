/*
 * An XML document type.
 * Localname: leAltAddressInfo
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le;


/**
 * A document containing one leAltAddressInfo(@) element.
 *
 * This is a complex type.
 */
public interface LeAltAddressInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LeAltAddressInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("lealtaddressinfo5dabdoctype");
    
    /**
     * Gets the "leAltAddressInfo" element
     */
    atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo getLeAltAddressInfo();
    
    /**
     * Sets the "leAltAddressInfo" element
     */
    void setLeAltAddressInfo(atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo leAltAddressInfo);
    
    /**
     * Appends and returns a new empty "leAltAddressInfo" element
     */
    atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo addNewLeAltAddressInfo();
    
    /**
     * An XML leAltAddressInfo(@).
     *
     * This is a complex type.
     */
    public interface LeAltAddressInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LeAltAddressInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("lealtaddressinfo772delemtype");
        
        /**
         * Gets the "leAddrId" element
         */
        java.lang.String getLeAddrId();
        
        /**
         * Gets (as xml) the "leAddrId" element
         */
        org.apache.xmlbeans.XmlString xgetLeAddrId();
        
        /**
         * Sets the "leAddrId" element
         */
        void setLeAddrId(java.lang.String leAddrId);
        
        /**
         * Sets (as xml) the "leAddrId" element
         */
        void xsetLeAddrId(org.apache.xmlbeans.XmlString leAddrId);
        
        /**
         * Gets the "scbLeId" element
         */
        java.lang.String getScbLeId();
        
        /**
         * Gets (as xml) the "scbLeId" element
         */
        org.apache.xmlbeans.XmlString xgetScbLeId();
        
        /**
         * Sets the "scbLeId" element
         */
        void setScbLeId(java.lang.String scbLeId);
        
        /**
         * Sets (as xml) the "scbLeId" element
         */
        void xsetScbLeId(org.apache.xmlbeans.XmlString scbLeId);
        
        /**
         * Gets the "product" element
         */
        java.lang.String getProduct();
        
        /**
         * Gets (as xml) the "product" element
         */
        org.apache.xmlbeans.XmlString xgetProduct();
        
        /**
         * Sets the "product" element
         */
        void setProduct(java.lang.String product);
        
        /**
         * Sets (as xml) the "product" element
         */
        void xsetProduct(org.apache.xmlbeans.XmlString product);
        
        /**
         * Gets the "productType" element
         */
        java.lang.String getProductType();
        
        /**
         * Gets (as xml) the "productType" element
         */
        org.apache.xmlbeans.XmlString xgetProductType();
        
        /**
         * Sets the "productType" element
         */
        void setProductType(java.lang.String productType);
        
        /**
         * Sets (as xml) the "productType" element
         */
        void xsetProductType(org.apache.xmlbeans.XmlString productType);
        
        /**
         * Gets the "updstatus" element
         */
        java.lang.String getUpdstatus();
        
        /**
         * Gets (as xml) the "updstatus" element
         */
        org.apache.xmlbeans.XmlString xgetUpdstatus();
        
        /**
         * Sets the "updstatus" element
         */
        void setUpdstatus(java.lang.String updstatus);
        
        /**
         * Sets (as xml) the "updstatus" element
         */
        void xsetUpdstatus(org.apache.xmlbeans.XmlString updstatus);
        
        /**
         * Gets the "verified" element
         */
        java.lang.String getVerified();
        
        /**
         * Gets (as xml) the "verified" element
         */
        org.apache.xmlbeans.XmlString xgetVerified();
        
        /**
         * Sets the "verified" element
         */
        void setVerified(java.lang.String verified);
        
        /**
         * Sets (as xml) the "verified" element
         */
        void xsetVerified(org.apache.xmlbeans.XmlString verified);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo newInstance() {
              return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument newInstance() {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
