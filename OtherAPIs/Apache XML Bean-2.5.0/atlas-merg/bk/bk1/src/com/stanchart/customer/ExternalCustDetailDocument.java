/*
 * An XML document type.
 * Localname: externalCustDetail
 * Namespace: 
 * Java type: com.stanchart.customer.ExternalCustDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.stanchart.customer;


/**
 * A document containing one externalCustDetail(@) element.
 *
 * This is a complex type.
 */
public interface ExternalCustDetailDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExternalCustDetailDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("externalcustdetailfae8doctype");
    
    /**
     * Gets the "externalCustDetail" element
     */
    com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail getExternalCustDetail();
    
    /**
     * Sets the "externalCustDetail" element
     */
    void setExternalCustDetail(com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail externalCustDetail);
    
    /**
     * Appends and returns a new empty "externalCustDetail" element
     */
    com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail addNewExternalCustDetail();
    
    /**
     * An XML externalCustDetail(@).
     *
     * This is a complex type.
     */
    public interface ExternalCustDetail extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExternalCustDetail.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("externalcustdetail268delemtype");
        
        /**
         * Gets the "externalCustId" element
         */
        java.lang.String getExternalCustId();
        
        /**
         * Gets (as xml) the "externalCustId" element
         */
        org.apache.xmlbeans.XmlString xgetExternalCustId();
        
        /**
         * True if has "externalCustId" element
         */
        boolean isSetExternalCustId();
        
        /**
         * Sets the "externalCustId" element
         */
        void setExternalCustId(java.lang.String externalCustId);
        
        /**
         * Sets (as xml) the "externalCustId" element
         */
        void xsetExternalCustId(org.apache.xmlbeans.XmlString externalCustId);
        
        /**
         * Unsets the "externalCustId" element
         */
        void unsetExternalCustId();
        
        /**
         * Gets the "externalCustName" element
         */
        java.lang.String getExternalCustName();
        
        /**
         * Gets (as xml) the "externalCustName" element
         */
        org.apache.xmlbeans.XmlString xgetExternalCustName();
        
        /**
         * True if has "externalCustName" element
         */
        boolean isSetExternalCustName();
        
        /**
         * Sets the "externalCustName" element
         */
        void setExternalCustName(java.lang.String externalCustName);
        
        /**
         * Sets (as xml) the "externalCustName" element
         */
        void xsetExternalCustName(org.apache.xmlbeans.XmlString externalCustName);
        
        /**
         * Unsets the "externalCustName" element
         */
        void unsetExternalCustName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail newInstance() {
              return (com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.stanchart.customer.ExternalCustDetailDocument newInstance() {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.stanchart.customer.ExternalCustDetailDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.stanchart.customer.ExternalCustDetailDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.stanchart.customer.ExternalCustDetailDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.stanchart.customer.ExternalCustDetailDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.stanchart.customer.ExternalCustDetailDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.stanchart.customer.ExternalCustDetailDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.stanchart.customer.ExternalCustDetailDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.stanchart.customer.ExternalCustDetailDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.stanchart.customer.ExternalCustDetailDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.stanchart.customer.ExternalCustDetailDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.stanchart.customer.ExternalCustDetailDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.stanchart.customer.ExternalCustDetailDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.stanchart.customer.ExternalCustDetailDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.stanchart.customer.ExternalCustDetailDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.stanchart.customer.ExternalCustDetailDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.stanchart.customer.ExternalCustDetailDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.stanchart.customer.ExternalCustDetailDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.stanchart.customer.ExternalCustDetailDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
