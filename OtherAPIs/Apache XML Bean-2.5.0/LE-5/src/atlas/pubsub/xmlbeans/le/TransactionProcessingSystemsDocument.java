/*
 * An XML document type.
 * Localname: transactionProcessingSystems
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le;


/**
 * A document containing one transactionProcessingSystems(@) element.
 *
 * This is a complex type.
 */
public interface TransactionProcessingSystemsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransactionProcessingSystemsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("transactionprocessingsystems7f4cdoctype");
    
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
     * An XML transactionProcessingSystems(@).
     *
     * This is a complex type.
     */
    public interface TransactionProcessingSystems extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransactionProcessingSystems.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("transactionprocessingsystemsbe8delemtype");
        
        /**
         * Gets the "bkgLocationCountry" element
         */
        java.lang.String getBkgLocationCountry();
        
        /**
         * Gets (as xml) the "bkgLocationCountry" element
         */
        org.apache.xmlbeans.XmlString xgetBkgLocationCountry();
        
        /**
         * Sets the "bkgLocationCountry" element
         */
        void setBkgLocationCountry(java.lang.String bkgLocationCountry);
        
        /**
         * Sets (as xml) the "bkgLocationCountry" element
         */
        void xsetBkgLocationCountry(org.apache.xmlbeans.XmlString bkgLocationCountry);
        
        /**
         * Gets the "bkgLocationOrganization" element
         */
        java.lang.String getBkgLocationOrganization();
        
        /**
         * Gets (as xml) the "bkgLocationOrganization" element
         */
        org.apache.xmlbeans.XmlString xgetBkgLocationOrganization();
        
        /**
         * Sets the "bkgLocationOrganization" element
         */
        void setBkgLocationOrganization(java.lang.String bkgLocationOrganization);
        
        /**
         * Sets (as xml) the "bkgLocationOrganization" element
         */
        void xsetBkgLocationOrganization(org.apache.xmlbeans.XmlString bkgLocationOrganization);
        
        /**
         * Gets the "extSystemTypeNum" element
         */
        java.lang.String getExtSystemTypeNum();
        
        /**
         * Gets (as xml) the "extSystemTypeNum" element
         */
        org.apache.xmlbeans.XmlString xgetExtSystemTypeNum();
        
        /**
         * Sets the "extSystemTypeNum" element
         */
        void setExtSystemTypeNum(java.lang.String extSystemTypeNum);
        
        /**
         * Sets (as xml) the "extSystemTypeNum" element
         */
        void xsetExtSystemTypeNum(org.apache.xmlbeans.XmlString extSystemTypeNum);
        
        /**
         * Gets the "extSystemTypeValue" element
         */
        java.lang.String getExtSystemTypeValue();
        
        /**
         * Gets (as xml) the "extSystemTypeValue" element
         */
        org.apache.xmlbeans.XmlString xgetExtSystemTypeValue();
        
        /**
         * Sets the "extSystemTypeValue" element
         */
        void setExtSystemTypeValue(java.lang.String extSystemTypeValue);
        
        /**
         * Sets (as xml) the "extSystemTypeValue" element
         */
        void xsetExtSystemTypeValue(org.apache.xmlbeans.XmlString extSystemTypeValue);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems newInstance() {
              return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument newInstance() {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
