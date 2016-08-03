/*
 * An XML document type.
 * Localname: fmCrossReferenceDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one fmCrossReferenceDetails(@) element.
 *
 * This is a complex type.
 */
public interface FmCrossReferenceDetailsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmCrossReferenceDetailsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmcrossreferencedetails41b7doctype");
    
    /**
     * Gets the "fmCrossReferenceDetails" element
     */
    com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails getFmCrossReferenceDetails();
    
    /**
     * Sets the "fmCrossReferenceDetails" element
     */
    void setFmCrossReferenceDetails(com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails fmCrossReferenceDetails);
    
    /**
     * Appends and returns a new empty "fmCrossReferenceDetails" element
     */
    com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails addNewFmCrossReferenceDetails();
    
    /**
     * An XML fmCrossReferenceDetails(@).
     *
     * This is a complex type.
     */
    public interface FmCrossReferenceDetails extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmCrossReferenceDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmcrossreferencedetails7983elemtype");
        
        /**
         * Gets a List of "fmCrossReference" elements
         */
        java.util.List<com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference> getFmCrossReferenceList();
        
        /**
         * Gets array of all "fmCrossReference" elements
         * @deprecated
         */
        @Deprecated
        com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference[] getFmCrossReferenceArray();
        
        /**
         * Gets ith "fmCrossReference" element
         */
        com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference getFmCrossReferenceArray(int i);
        
        /**
         * Returns number of "fmCrossReference" element
         */
        int sizeOfFmCrossReferenceArray();
        
        /**
         * Sets array of all "fmCrossReference" element
         */
        void setFmCrossReferenceArray(com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference[] fmCrossReferenceArray);
        
        /**
         * Sets ith "fmCrossReference" element
         */
        void setFmCrossReferenceArray(int i, com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference fmCrossReference);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fmCrossReference" element
         */
        com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference insertNewFmCrossReference(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fmCrossReference" element
         */
        com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference addNewFmCrossReference();
        
        /**
         * Removes the ith "fmCrossReference" element
         */
        void removeFmCrossReference(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails newInstance() {
              return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument newInstance() {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
