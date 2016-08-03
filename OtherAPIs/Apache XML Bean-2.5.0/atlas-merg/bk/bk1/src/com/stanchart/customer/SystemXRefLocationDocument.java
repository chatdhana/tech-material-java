/*
 * An XML document type.
 * Localname: systemXRefLocation
 * Namespace: 
 * Java type: com.stanchart.customer.SystemXRefLocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.stanchart.customer;


/**
 * A document containing one systemXRefLocation(@) element.
 *
 * This is a complex type.
 */
public interface SystemXRefLocationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SystemXRefLocationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("systemxreflocationd9d8doctype");
    
    /**
     * Gets the "systemXRefLocation" element
     */
    com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation getSystemXRefLocation();
    
    /**
     * Sets the "systemXRefLocation" element
     */
    void setSystemXRefLocation(com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation systemXRefLocation);
    
    /**
     * Appends and returns a new empty "systemXRefLocation" element
     */
    com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation addNewSystemXRefLocation();
    
    /**
     * An XML systemXRefLocation(@).
     *
     * This is a complex type.
     */
    public interface SystemXRefLocation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SystemXRefLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("systemxreflocationdc8delemtype");
        
        /**
         * Gets the "locationId" element
         */
        java.lang.String getLocationId();
        
        /**
         * Gets (as xml) the "locationId" element
         */
        org.apache.xmlbeans.XmlString xgetLocationId();
        
        /**
         * True if has "locationId" element
         */
        boolean isSetLocationId();
        
        /**
         * Sets the "locationId" element
         */
        void setLocationId(java.lang.String locationId);
        
        /**
         * Sets (as xml) the "locationId" element
         */
        void xsetLocationId(org.apache.xmlbeans.XmlString locationId);
        
        /**
         * Unsets the "locationId" element
         */
        void unsetLocationId();
        
        /**
         * Gets the "locationCountry" element
         */
        java.lang.String getLocationCountry();
        
        /**
         * Gets (as xml) the "locationCountry" element
         */
        org.apache.xmlbeans.XmlString xgetLocationCountry();
        
        /**
         * True if has "locationCountry" element
         */
        boolean isSetLocationCountry();
        
        /**
         * Sets the "locationCountry" element
         */
        void setLocationCountry(java.lang.String locationCountry);
        
        /**
         * Sets (as xml) the "locationCountry" element
         */
        void xsetLocationCountry(org.apache.xmlbeans.XmlString locationCountry);
        
        /**
         * Unsets the "locationCountry" element
         */
        void unsetLocationCountry();
        
        /**
         * Gets the "locationOrganization" element
         */
        java.lang.String getLocationOrganization();
        
        /**
         * Gets (as xml) the "locationOrganization" element
         */
        org.apache.xmlbeans.XmlString xgetLocationOrganization();
        
        /**
         * True if has "locationOrganization" element
         */
        boolean isSetLocationOrganization();
        
        /**
         * Sets the "locationOrganization" element
         */
        void setLocationOrganization(java.lang.String locationOrganization);
        
        /**
         * Sets (as xml) the "locationOrganization" element
         */
        void xsetLocationOrganization(org.apache.xmlbeans.XmlString locationOrganization);
        
        /**
         * Unsets the "locationOrganization" element
         */
        void unsetLocationOrganization();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation newInstance() {
              return (com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.stanchart.customer.SystemXRefLocationDocument newInstance() {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.stanchart.customer.SystemXRefLocationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.stanchart.customer.SystemXRefLocationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.stanchart.customer.SystemXRefLocationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.stanchart.customer.SystemXRefLocationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.stanchart.customer.SystemXRefLocationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.stanchart.customer.SystemXRefLocationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.stanchart.customer.SystemXRefLocationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.stanchart.customer.SystemXRefLocationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.stanchart.customer.SystemXRefLocationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.stanchart.customer.SystemXRefLocationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.stanchart.customer.SystemXRefLocationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.stanchart.customer.SystemXRefLocationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.stanchart.customer.SystemXRefLocationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.stanchart.customer.SystemXRefLocationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.stanchart.customer.SystemXRefLocationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.stanchart.customer.SystemXRefLocationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.stanchart.customer.SystemXRefLocationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.stanchart.customer.SystemXRefLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
