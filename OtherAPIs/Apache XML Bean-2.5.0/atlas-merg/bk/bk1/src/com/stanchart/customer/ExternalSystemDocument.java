/*
 * An XML document type.
 * Localname: externalSystem
 * Namespace: 
 * Java type: com.stanchart.customer.ExternalSystemDocument
 *
 * Automatically generated - do not modify.
 */
package com.stanchart.customer;


/**
 * A document containing one externalSystem(@) element.
 *
 * This is a complex type.
 */
public interface ExternalSystemDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExternalSystemDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("externalsystembe93doctype");
    
    /**
     * Gets the "externalSystem" element
     */
    com.stanchart.customer.ExternalSystemDocument.ExternalSystem getExternalSystem();
    
    /**
     * Sets the "externalSystem" element
     */
    void setExternalSystem(com.stanchart.customer.ExternalSystemDocument.ExternalSystem externalSystem);
    
    /**
     * Appends and returns a new empty "externalSystem" element
     */
    com.stanchart.customer.ExternalSystemDocument.ExternalSystem addNewExternalSystem();
    
    /**
     * An XML externalSystem(@).
     *
     * This is a complex type.
     */
    public interface ExternalSystem extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExternalSystem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("externalsystem9cedelemtype");
        
        /**
         * Gets the "extSystemTypeNum" element
         */
        java.lang.String getExtSystemTypeNum();
        
        /**
         * Gets (as xml) the "extSystemTypeNum" element
         */
        org.apache.xmlbeans.XmlString xgetExtSystemTypeNum();
        
        /**
         * True if has "extSystemTypeNum" element
         */
        boolean isSetExtSystemTypeNum();
        
        /**
         * Sets the "extSystemTypeNum" element
         */
        void setExtSystemTypeNum(java.lang.String extSystemTypeNum);
        
        /**
         * Sets (as xml) the "extSystemTypeNum" element
         */
        void xsetExtSystemTypeNum(org.apache.xmlbeans.XmlString extSystemTypeNum);
        
        /**
         * Unsets the "extSystemTypeNum" element
         */
        void unsetExtSystemTypeNum();
        
        /**
         * Gets the "extSystemTypeValue" element
         */
        java.lang.String getExtSystemTypeValue();
        
        /**
         * Gets (as xml) the "extSystemTypeValue" element
         */
        org.apache.xmlbeans.XmlString xgetExtSystemTypeValue();
        
        /**
         * True if has "extSystemTypeValue" element
         */
        boolean isSetExtSystemTypeValue();
        
        /**
         * Sets the "extSystemTypeValue" element
         */
        void setExtSystemTypeValue(java.lang.String extSystemTypeValue);
        
        /**
         * Sets (as xml) the "extSystemTypeValue" element
         */
        void xsetExtSystemTypeValue(org.apache.xmlbeans.XmlString extSystemTypeValue);
        
        /**
         * Unsets the "extSystemTypeValue" element
         */
        void unsetExtSystemTypeValue();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.stanchart.customer.ExternalSystemDocument.ExternalSystem newInstance() {
              return (com.stanchart.customer.ExternalSystemDocument.ExternalSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.stanchart.customer.ExternalSystemDocument.ExternalSystem newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.stanchart.customer.ExternalSystemDocument.ExternalSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.stanchart.customer.ExternalSystemDocument newInstance() {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.stanchart.customer.ExternalSystemDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.stanchart.customer.ExternalSystemDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.stanchart.customer.ExternalSystemDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.stanchart.customer.ExternalSystemDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.stanchart.customer.ExternalSystemDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.stanchart.customer.ExternalSystemDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.stanchart.customer.ExternalSystemDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.stanchart.customer.ExternalSystemDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.stanchart.customer.ExternalSystemDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.stanchart.customer.ExternalSystemDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.stanchart.customer.ExternalSystemDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.stanchart.customer.ExternalSystemDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.stanchart.customer.ExternalSystemDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.stanchart.customer.ExternalSystemDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.stanchart.customer.ExternalSystemDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.stanchart.customer.ExternalSystemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.stanchart.customer.ExternalSystemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.stanchart.customer.ExternalSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
