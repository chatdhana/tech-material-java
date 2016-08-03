/*
 * An XML document type.
 * Localname: fmProfileInfo
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmProfileInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one fmProfileInfo(@) element.
 *
 * This is a complex type.
 */
public interface FmProfileInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmProfileInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmprofileinfo52d7doctype");
    
    /**
     * Gets the "fmProfileInfo" element
     */
    com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo getFmProfileInfo();
    
    /**
     * Sets the "fmProfileInfo" element
     */
    void setFmProfileInfo(com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo fmProfileInfo);
    
    /**
     * Appends and returns a new empty "fmProfileInfo" element
     */
    com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo addNewFmProfileInfo();
    
    /**
     * An XML fmProfileInfo(@).
     *
     * This is a complex type.
     */
    public interface FmProfileInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmProfileInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmprofileinfodc03elemtype");
        
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
         * Gets the "fmProfileSysGenId" element
         */
        java.lang.String getFmProfileSysGenId();
        
        /**
         * Gets (as xml) the "fmProfileSysGenId" element
         */
        org.apache.xmlbeans.XmlString xgetFmProfileSysGenId();
        
        /**
         * Sets the "fmProfileSysGenId" element
         */
        void setFmProfileSysGenId(java.lang.String fmProfileSysGenId);
        
        /**
         * Sets (as xml) the "fmProfileSysGenId" element
         */
        void xsetFmProfileSysGenId(org.apache.xmlbeans.XmlString fmProfileSysGenId);
        
        /**
         * Gets the "fmCode" element
         */
        java.lang.String getFmCode();
        
        /**
         * Gets (as xml) the "fmCode" element
         */
        org.apache.xmlbeans.XmlString xgetFmCode();
        
        /**
         * Sets the "fmCode" element
         */
        void setFmCode(java.lang.String fmCode);
        
        /**
         * Sets (as xml) the "fmCode" element
         */
        void xsetFmCode(org.apache.xmlbeans.XmlString fmCode);
        
        /**
         * Gets the "fmProfileShortName" element
         */
        java.lang.String getFmProfileShortName();
        
        /**
         * Gets (as xml) the "fmProfileShortName" element
         */
        org.apache.xmlbeans.XmlString xgetFmProfileShortName();
        
        /**
         * Sets the "fmProfileShortName" element
         */
        void setFmProfileShortName(java.lang.String fmProfileShortName);
        
        /**
         * Sets (as xml) the "fmProfileShortName" element
         */
        void xsetFmProfileShortName(org.apache.xmlbeans.XmlString fmProfileShortName);
        
        /**
         * Gets the "fmMnemonic" element
         */
        java.lang.String getFmMnemonic();
        
        /**
         * Gets (as xml) the "fmMnemonic" element
         */
        org.apache.xmlbeans.XmlString xgetFmMnemonic();
        
        /**
         * Sets the "fmMnemonic" element
         */
        void setFmMnemonic(java.lang.String fmMnemonic);
        
        /**
         * Sets (as xml) the "fmMnemonic" element
         */
        void xsetFmMnemonic(org.apache.xmlbeans.XmlString fmMnemonic);
        
        /**
         * Gets the "fmProfileStatus" element
         */
        com.scb.sci.customer.fm.FmProfileStatusDocument.FmProfileStatus getFmProfileStatus();
        
        /**
         * Sets the "fmProfileStatus" element
         */
        void setFmProfileStatus(com.scb.sci.customer.fm.FmProfileStatusDocument.FmProfileStatus fmProfileStatus);
        
        /**
         * Appends and returns a new empty "fmProfileStatus" element
         */
        com.scb.sci.customer.fm.FmProfileStatusDocument.FmProfileStatus addNewFmProfileStatus();
        
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
            public static com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo newInstance() {
              return (com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.FmProfileInfoDocument newInstance() {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.FmProfileInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmProfileInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmProfileInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
