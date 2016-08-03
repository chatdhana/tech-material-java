/*
 * An XML document type.
 * Localname: fmCrossReference
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmCrossReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one fmCrossReference(@) element.
 *
 * This is a complex type.
 */
public interface FmCrossReferenceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmCrossReferenceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmcrossreference760bdoctype");
    
    /**
     * Gets the "fmCrossReference" element
     */
    com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference getFmCrossReference();
    
    /**
     * Sets the "fmCrossReference" element
     */
    void setFmCrossReference(com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference fmCrossReference);
    
    /**
     * Appends and returns a new empty "fmCrossReference" element
     */
    com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference addNewFmCrossReference();
    
    /**
     * An XML fmCrossReference(@).
     *
     * This is a complex type.
     */
    public interface FmCrossReference extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmCrossReference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmcrossreferencedb2delemtype");
        
        /**
         * Gets the "leId" element
         */
        java.lang.String getLeId();
        
        /**
         * Gets (as xml) the "leId" element
         */
        org.apache.xmlbeans.XmlString xgetLeId();
        
        /**
         * Sets the "leId" element
         */
        void setLeId(java.lang.String leId);
        
        /**
         * Sets (as xml) the "leId" element
         */
        void xsetLeId(org.apache.xmlbeans.XmlString leId);
        
        /**
         * Gets the "subProfileId" element
         */
        java.lang.String getSubProfileId();
        
        /**
         * Gets (as xml) the "subProfileId" element
         */
        org.apache.xmlbeans.XmlString xgetSubProfileId();
        
        /**
         * Sets the "subProfileId" element
         */
        void setSubProfileId(java.lang.String subProfileId);
        
        /**
         * Sets (as xml) the "subProfileId" element
         */
        void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
        
        /**
         * Gets the "fmId" element
         */
        java.lang.String getFmId();
        
        /**
         * Gets (as xml) the "fmId" element
         */
        org.apache.xmlbeans.XmlString xgetFmId();
        
        /**
         * Sets the "fmId" element
         */
        void setFmId(java.lang.String fmId);
        
        /**
         * Sets (as xml) the "fmId" element
         */
        void xsetFmId(org.apache.xmlbeans.XmlString fmId);
        
        /**
         * Gets the "fmXrefSysGenId" element
         */
        java.lang.String getFmXrefSysGenId();
        
        /**
         * Gets (as xml) the "fmXrefSysGenId" element
         */
        org.apache.xmlbeans.XmlString xgetFmXrefSysGenId();
        
        /**
         * Sets the "fmXrefSysGenId" element
         */
        void setFmXrefSysGenId(java.lang.String fmXrefSysGenId);
        
        /**
         * Sets (as xml) the "fmXrefSysGenId" element
         */
        void xsetFmXrefSysGenId(org.apache.xmlbeans.XmlString fmXrefSysGenId);
        
        /**
         * Gets the "xrefLocation" element
         */
        java.lang.String getXrefLocation();
        
        /**
         * Gets (as xml) the "xrefLocation" element
         */
        org.apache.xmlbeans.XmlString xgetXrefLocation();
        
        /**
         * Sets the "xrefLocation" element
         */
        void setXrefLocation(java.lang.String xrefLocation);
        
        /**
         * Sets (as xml) the "xrefLocation" element
         */
        void xsetXrefLocation(org.apache.xmlbeans.XmlString xrefLocation);
        
        /**
         * Gets the "xrefSystem" element
         */
        java.lang.String getXrefSystem();
        
        /**
         * Gets (as xml) the "xrefSystem" element
         */
        org.apache.xmlbeans.XmlString xgetXrefSystem();
        
        /**
         * Sets the "xrefSystem" element
         */
        void setXrefSystem(java.lang.String xrefSystem);
        
        /**
         * Sets (as xml) the "xrefSystem" element
         */
        void xsetXrefSystem(org.apache.xmlbeans.XmlString xrefSystem);
        
        /**
         * Gets the "xrefExternalId" element
         */
        java.lang.String getXrefExternalId();
        
        /**
         * Gets (as xml) the "xrefExternalId" element
         */
        org.apache.xmlbeans.XmlString xgetXrefExternalId();
        
        /**
         * Sets the "xrefExternalId" element
         */
        void setXrefExternalId(java.lang.String xrefExternalId);
        
        /**
         * Sets (as xml) the "xrefExternalId" element
         */
        void xsetXrefExternalId(org.apache.xmlbeans.XmlString xrefExternalId);
        
        /**
         * Gets the "immsMnemonic" element
         */
        java.lang.String getImmsMnemonic();
        
        /**
         * Gets (as xml) the "immsMnemonic" element
         */
        org.apache.xmlbeans.XmlString xgetImmsMnemonic();
        
        /**
         * Sets the "immsMnemonic" element
         */
        void setImmsMnemonic(java.lang.String immsMnemonic);
        
        /**
         * Sets (as xml) the "immsMnemonic" element
         */
        void xsetImmsMnemonic(org.apache.xmlbeans.XmlString immsMnemonic);
        
        /**
         * Gets the "updateStatusIndicator" element
         */
        java.lang.String getUpdateStatusIndicator();
        
        /**
         * Gets (as xml) the "updateStatusIndicator" element
         */
        org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
        
        /**
         * Sets the "updateStatusIndicator" element
         */
        void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
        
        /**
         * Sets (as xml) the "updateStatusIndicator" element
         */
        void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
        
        /**
         * Gets the "changeIndicator" element
         */
        java.lang.String getChangeIndicator();
        
        /**
         * Gets (as xml) the "changeIndicator" element
         */
        org.apache.xmlbeans.XmlString xgetChangeIndicator();
        
        /**
         * Sets the "changeIndicator" element
         */
        void setChangeIndicator(java.lang.String changeIndicator);
        
        /**
         * Sets (as xml) the "changeIndicator" element
         */
        void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference newInstance() {
              return (com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument newInstance() {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmCrossReferenceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmCrossReferenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
