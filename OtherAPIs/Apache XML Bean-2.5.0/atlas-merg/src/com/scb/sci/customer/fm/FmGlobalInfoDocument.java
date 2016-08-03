/*
 * An XML document type.
 * Localname: fmGlobalInfo
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmGlobalInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one fmGlobalInfo(@) element.
 *
 * This is a complex type.
 */
public interface FmGlobalInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmGlobalInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmglobalinfo4a11doctype");
    
    /**
     * Gets the "fmGlobalInfo" element
     */
    com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo getFmGlobalInfo();
    
    /**
     * Sets the "fmGlobalInfo" element
     */
    void setFmGlobalInfo(com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo fmGlobalInfo);
    
    /**
     * Appends and returns a new empty "fmGlobalInfo" element
     */
    com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo addNewFmGlobalInfo();
    
    /**
     * An XML fmGlobalInfo(@).
     *
     * This is a complex type.
     */
    public interface FmGlobalInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmGlobalInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmglobalinfo1fedelemtype");
        
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
         * Gets the "fmGlblInfSysGenId" element
         */
        java.lang.String getFmGlblInfSysGenId();
        
        /**
         * Gets (as xml) the "fmGlblInfSysGenId" element
         */
        org.apache.xmlbeans.XmlString xgetFmGlblInfSysGenId();
        
        /**
         * Sets the "fmGlblInfSysGenId" element
         */
        void setFmGlblInfSysGenId(java.lang.String fmGlblInfSysGenId);
        
        /**
         * Sets (as xml) the "fmGlblInfSysGenId" element
         */
        void xsetFmGlblInfSysGenId(org.apache.xmlbeans.XmlString fmGlblInfSysGenId);
        
        /**
         * Gets the "mifidClntClass" element
         */
        com.scb.sci.customer.fm.MifidClntClassDocument.MifidClntClass getMifidClntClass();
        
        /**
         * Sets the "mifidClntClass" element
         */
        void setMifidClntClass(com.scb.sci.customer.fm.MifidClntClassDocument.MifidClntClass mifidClntClass);
        
        /**
         * Appends and returns a new empty "mifidClntClass" element
         */
        com.scb.sci.customer.fm.MifidClntClassDocument.MifidClntClass addNewMifidClntClass();
        
        /**
         * Gets the "ultRiskCntry" element
         */
        java.lang.String getUltRiskCntry();
        
        /**
         * Gets (as xml) the "ultRiskCntry" element
         */
        org.apache.xmlbeans.XmlString xgetUltRiskCntry();
        
        /**
         * Sets the "ultRiskCntry" element
         */
        void setUltRiskCntry(java.lang.String ultRiskCntry);
        
        /**
         * Sets (as xml) the "ultRiskCntry" element
         */
        void xsetUltRiskCntry(org.apache.xmlbeans.XmlString ultRiskCntry);
        
        /**
         * Gets the "scbAffltCode" element
         */
        com.scb.sci.customer.fm.ScbAffltCodeDocument.ScbAffltCode getScbAffltCode();
        
        /**
         * Sets the "scbAffltCode" element
         */
        void setScbAffltCode(com.scb.sci.customer.fm.ScbAffltCodeDocument.ScbAffltCode scbAffltCode);
        
        /**
         * Appends and returns a new empty "scbAffltCode" element
         */
        com.scb.sci.customer.fm.ScbAffltCodeDocument.ScbAffltCode addNewScbAffltCode();
        
        /**
         * Gets the "omgAlertAcronym" element
         */
        java.lang.String getOmgAlertAcronym();
        
        /**
         * Gets (as xml) the "omgAlertAcronym" element
         */
        org.apache.xmlbeans.XmlString xgetOmgAlertAcronym();
        
        /**
         * Sets the "omgAlertAcronym" element
         */
        void setOmgAlertAcronym(java.lang.String omgAlertAcronym);
        
        /**
         * Sets (as xml) the "omgAlertAcronym" element
         */
        void xsetOmgAlertAcronym(org.apache.xmlbeans.XmlString omgAlertAcronym);
        
        /**
         * Gets the "omgOgdAcronym" element
         */
        java.lang.String getOmgOgdAcronym();
        
        /**
         * Gets (as xml) the "omgOgdAcronym" element
         */
        org.apache.xmlbeans.XmlString xgetOmgOgdAcronym();
        
        /**
         * Sets the "omgOgdAcronym" element
         */
        void setOmgOgdAcronym(java.lang.String omgOgdAcronym);
        
        /**
         * Sets (as xml) the "omgOgdAcronym" element
         */
        void xsetOmgOgdAcronym(org.apache.xmlbeans.XmlString omgOgdAcronym);
        
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
            public static com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo newInstance() {
              return (com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument newInstance() {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmGlobalInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmGlobalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
