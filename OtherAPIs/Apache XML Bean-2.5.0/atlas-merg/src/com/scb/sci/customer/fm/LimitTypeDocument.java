/*
 * An XML document type.
 * Localname: limitType
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.LimitTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one limitType(@) element.
 *
 * This is a complex type.
 */
public interface LimitTypeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LimitTypeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("limittype693cdoctype");
    
    /**
     * Gets the "limitType" element
     */
    com.scb.sci.customer.fm.LimitTypeDocument.LimitType getLimitType();
    
    /**
     * Sets the "limitType" element
     */
    void setLimitType(com.scb.sci.customer.fm.LimitTypeDocument.LimitType limitType);
    
    /**
     * Appends and returns a new empty "limitType" element
     */
    com.scb.sci.customer.fm.LimitTypeDocument.LimitType addNewLimitType();
    
    /**
     * An XML limitType(@).
     *
     * This is a complex type.
     */
    public interface LimitType extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LimitType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("limittype1fcdelemtype");
        
        /**
         * Gets the "stdCodeNumber" element
         */
        java.lang.String getStdCodeNumber();
        
        /**
         * Gets (as xml) the "stdCodeNumber" element
         */
        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
        
        /**
         * Sets the "stdCodeNumber" element
         */
        void setStdCodeNumber(java.lang.String stdCodeNumber);
        
        /**
         * Sets (as xml) the "stdCodeNumber" element
         */
        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
        
        /**
         * Gets the "stdCodeValue" element
         */
        java.lang.String getStdCodeValue();
        
        /**
         * Gets (as xml) the "stdCodeValue" element
         */
        org.apache.xmlbeans.XmlString xgetStdCodeValue();
        
        /**
         * Sets the "stdCodeValue" element
         */
        void setStdCodeValue(java.lang.String stdCodeValue);
        
        /**
         * Sets (as xml) the "stdCodeValue" element
         */
        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
        
        /**
         * Gets the "stdCodeDescription" element
         */
        java.lang.String getStdCodeDescription();
        
        /**
         * Gets (as xml) the "stdCodeDescription" element
         */
        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
        
        /**
         * Sets the "stdCodeDescription" element
         */
        void setStdCodeDescription(java.lang.String stdCodeDescription);
        
        /**
         * Sets (as xml) the "stdCodeDescription" element
         */
        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.scb.sci.customer.fm.LimitTypeDocument.LimitType newInstance() {
              return (com.scb.sci.customer.fm.LimitTypeDocument.LimitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.LimitTypeDocument.LimitType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.LimitTypeDocument.LimitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.LimitTypeDocument newInstance() {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.LimitTypeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.LimitTypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.LimitTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
