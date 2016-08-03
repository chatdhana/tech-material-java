/*
 * An XML document type.
 * Localname: transactionProcessingSystems
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.TransactionProcessingSystemsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one transactionProcessingSystems(@) element.
 *
 * This is a complex type.
 */
public interface TransactionProcessingSystemsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransactionProcessingSystemsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("transactionprocessingsystems7f4cdoctype");
    
    /**
     * Gets the "transactionProcessingSystems" element
     */
    com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems getTransactionProcessingSystems();
    
    /**
     * Sets the "transactionProcessingSystems" element
     */
    void setTransactionProcessingSystems(com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems transactionProcessingSystems);
    
    /**
     * Appends and returns a new empty "transactionProcessingSystems" element
     */
    com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems addNewTransactionProcessingSystems();
    
    /**
     * An XML transactionProcessingSystems(@).
     *
     * This is a complex type.
     */
    public interface TransactionProcessingSystems extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransactionProcessingSystems.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("transactionprocessingsystemsbe8delemtype");
        
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
            public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems newInstance() {
              return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument.TransactionProcessingSystems) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument newInstance() {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.TransactionProcessingSystemsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.TransactionProcessingSystemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
