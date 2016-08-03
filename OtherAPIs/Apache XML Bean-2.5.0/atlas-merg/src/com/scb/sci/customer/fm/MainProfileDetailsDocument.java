/*
 * An XML document type.
 * Localname: mainProfileDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.MainProfileDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one mainProfileDetails(@) element.
 *
 * This is a complex type.
 */
public interface MainProfileDetailsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MainProfileDetailsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("mainprofiledetails96abdoctype");
    
    /**
     * Gets the "mainProfileDetails" element
     */
    com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails getMainProfileDetails();
    
    /**
     * Sets the "mainProfileDetails" element
     */
    void setMainProfileDetails(com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails mainProfileDetails);
    
    /**
     * Appends and returns a new empty "mainProfileDetails" element
     */
    com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails addNewMainProfileDetails();
    
    /**
     * An XML mainProfileDetails(@).
     *
     * This is a complex type.
     */
    public interface MainProfileDetails extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MainProfileDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("mainprofiledetails2e6delemtype");
        
        /**
         * Gets the "mainProfile" element
         */
        com.scb.sci.customer.fm.MainProfileDocument.MainProfile getMainProfile();
        
        /**
         * Sets the "mainProfile" element
         */
        void setMainProfile(com.scb.sci.customer.fm.MainProfileDocument.MainProfile mainProfile);
        
        /**
         * Appends and returns a new empty "mainProfile" element
         */
        com.scb.sci.customer.fm.MainProfileDocument.MainProfile addNewMainProfile();
        
        /**
         * Gets the "registeredAddress" element
         */
        com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress getRegisteredAddress();
        
        /**
         * Sets the "registeredAddress" element
         */
        void setRegisteredAddress(com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress registeredAddress);
        
        /**
         * Appends and returns a new empty "registeredAddress" element
         */
        com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress addNewRegisteredAddress();
        
        /**
         * Gets the "creditGradeDetails" element
         */
        com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails getCreditGradeDetails();
        
        /**
         * Sets the "creditGradeDetails" element
         */
        void setCreditGradeDetails(com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails creditGradeDetails);
        
        /**
         * Appends and returns a new empty "creditGradeDetails" element
         */
        com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails addNewCreditGradeDetails();
        
        /**
         * Gets the "ISICDetails" element
         */
        com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails getISICDetails();
        
        /**
         * Sets the "ISICDetails" element
         */
        void setISICDetails(com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails isicDetails);
        
        /**
         * Appends and returns a new empty "ISICDetails" element
         */
        com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails addNewISICDetails();
        
        /**
         * Gets the "kycDetails" element
         */
        com.scb.sci.customer.fm.KycDetailsDocument.KycDetails getKycDetails();
        
        /**
         * Sets the "kycDetails" element
         */
        void setKycDetails(com.scb.sci.customer.fm.KycDetailsDocument.KycDetails kycDetails);
        
        /**
         * Appends and returns a new empty "kycDetails" element
         */
        com.scb.sci.customer.fm.KycDetailsDocument.KycDetails addNewKycDetails();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails newInstance() {
              return (com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument newInstance() {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.MainProfileDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.MainProfileDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
