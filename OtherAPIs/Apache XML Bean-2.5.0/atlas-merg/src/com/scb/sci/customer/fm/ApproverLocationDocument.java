/*
 * An XML document type.
 * Localname: approverLocation
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ApproverLocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one approverLocation(@) element.
 *
 * This is a complex type.
 */
public interface ApproverLocationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApproverLocationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("approverlocationcc13doctype");
    
    /**
     * Gets the "approverLocation" element
     */
    com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation getApproverLocation();
    
    /**
     * Sets the "approverLocation" element
     */
    void setApproverLocation(com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation approverLocation);
    
    /**
     * Appends and returns a new empty "approverLocation" element
     */
    com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation addNewApproverLocation();
    
    /**
     * An XML approverLocation(@).
     *
     * This is a complex type.
     */
    public interface ApproverLocation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApproverLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("approverlocationce2delemtype");
        
        /**
         * Gets the "approverLocationId" element
         */
        java.lang.String getApproverLocationId();
        
        /**
         * Gets (as xml) the "approverLocationId" element
         */
        org.apache.xmlbeans.XmlString xgetApproverLocationId();
        
        /**
         * Sets the "approverLocationId" element
         */
        void setApproverLocationId(java.lang.String approverLocationId);
        
        /**
         * Sets (as xml) the "approverLocationId" element
         */
        void xsetApproverLocationId(org.apache.xmlbeans.XmlString approverLocationId);
        
        /**
         * Gets the "approverCountry" element
         */
        java.lang.String getApproverCountry();
        
        /**
         * Gets (as xml) the "approverCountry" element
         */
        org.apache.xmlbeans.XmlString xgetApproverCountry();
        
        /**
         * Sets the "approverCountry" element
         */
        void setApproverCountry(java.lang.String approverCountry);
        
        /**
         * Sets (as xml) the "approverCountry" element
         */
        void xsetApproverCountry(org.apache.xmlbeans.XmlString approverCountry);
        
        /**
         * Gets the "approverOrganization" element
         */
        java.lang.String getApproverOrganization();
        
        /**
         * Gets (as xml) the "approverOrganization" element
         */
        org.apache.xmlbeans.XmlString xgetApproverOrganization();
        
        /**
         * Sets the "approverOrganization" element
         */
        void setApproverOrganization(java.lang.String approverOrganization);
        
        /**
         * Sets (as xml) the "approverOrganization" element
         */
        void xsetApproverOrganization(org.apache.xmlbeans.XmlString approverOrganization);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation newInstance() {
              return (com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.ApproverLocationDocument newInstance() {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.ApproverLocationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.ApproverLocationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.ApproverLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
