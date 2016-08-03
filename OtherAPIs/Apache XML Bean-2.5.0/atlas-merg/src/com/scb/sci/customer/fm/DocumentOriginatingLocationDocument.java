/*
 * An XML document type.
 * Localname: documentOriginatingLocation
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DocumentOriginatingLocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one documentOriginatingLocation(@) element.
 *
 * This is a complex type.
 */
public interface DocumentOriginatingLocationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentOriginatingLocationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("documentoriginatinglocation050adoctype");
    
    /**
     * Gets the "documentOriginatingLocation" element
     */
    com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation getDocumentOriginatingLocation();
    
    /**
     * Sets the "documentOriginatingLocation" element
     */
    void setDocumentOriginatingLocation(com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation documentOriginatingLocation);
    
    /**
     * Appends and returns a new empty "documentOriginatingLocation" element
     */
    com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation addNewDocumentOriginatingLocation();
    
    /**
     * An XML documentOriginatingLocation(@).
     *
     * This is a complex type.
     */
    public interface DocumentOriginatingLocation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentOriginatingLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("documentoriginatinglocationd669elemtype");
        
        /**
         * Gets the "documentOriginatingId" element
         */
        java.lang.String getDocumentOriginatingId();
        
        /**
         * Gets (as xml) the "documentOriginatingId" element
         */
        org.apache.xmlbeans.XmlString xgetDocumentOriginatingId();
        
        /**
         * Sets the "documentOriginatingId" element
         */
        void setDocumentOriginatingId(java.lang.String documentOriginatingId);
        
        /**
         * Sets (as xml) the "documentOriginatingId" element
         */
        void xsetDocumentOriginatingId(org.apache.xmlbeans.XmlString documentOriginatingId);
        
        /**
         * Gets the "documentOriginatingCountry" element
         */
        java.lang.String getDocumentOriginatingCountry();
        
        /**
         * Gets (as xml) the "documentOriginatingCountry" element
         */
        org.apache.xmlbeans.XmlString xgetDocumentOriginatingCountry();
        
        /**
         * Sets the "documentOriginatingCountry" element
         */
        void setDocumentOriginatingCountry(java.lang.String documentOriginatingCountry);
        
        /**
         * Sets (as xml) the "documentOriginatingCountry" element
         */
        void xsetDocumentOriginatingCountry(org.apache.xmlbeans.XmlString documentOriginatingCountry);
        
        /**
         * Gets the "documentOriginatingOrganization" element
         */
        java.lang.String getDocumentOriginatingOrganization();
        
        /**
         * Gets (as xml) the "documentOriginatingOrganization" element
         */
        org.apache.xmlbeans.XmlString xgetDocumentOriginatingOrganization();
        
        /**
         * Sets the "documentOriginatingOrganization" element
         */
        void setDocumentOriginatingOrganization(java.lang.String documentOriginatingOrganization);
        
        /**
         * Sets (as xml) the "documentOriginatingOrganization" element
         */
        void xsetDocumentOriginatingOrganization(org.apache.xmlbeans.XmlString documentOriginatingOrganization);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation newInstance() {
              return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument newInstance() {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.DocumentOriginatingLocationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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