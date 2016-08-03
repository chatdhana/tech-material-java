/*
 * An XML document type.
 * Localname: ISIC
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ISICDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one ISIC(@) element.
 *
 * This is a complex type.
 */
public interface ISICDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ISICDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("isic93bddoctype");
    
    /**
     * Gets the "ISIC" element
     */
    com.scb.sci.customer.fm.ISICDocument.ISIC getISIC();
    
    /**
     * Sets the "ISIC" element
     */
    void setISIC(com.scb.sci.customer.fm.ISICDocument.ISIC isic);
    
    /**
     * Appends and returns a new empty "ISIC" element
     */
    com.scb.sci.customer.fm.ISICDocument.ISIC addNewISIC();
    
    /**
     * An XML ISIC(@).
     *
     * This is a complex type.
     */
    public interface ISIC extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ISIC.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("isice36delemtype");
        
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
         * Gets the "ISICId" element
         */
        java.lang.String getISICId();
        
        /**
         * Gets (as xml) the "ISICId" element
         */
        org.apache.xmlbeans.XmlString xgetISICId();
        
        /**
         * Sets the "ISICId" element
         */
        void setISICId(java.lang.String isicId);
        
        /**
         * Sets (as xml) the "ISICId" element
         */
        void xsetISICId(org.apache.xmlbeans.XmlString isicId);
        
        /**
         * Gets the "ISICType" element
         */
        com.scb.sci.customer.fm.ISICTypeDocument.ISICType getISICType();
        
        /**
         * Sets the "ISICType" element
         */
        void setISICType(com.scb.sci.customer.fm.ISICTypeDocument.ISICType isicType);
        
        /**
         * Appends and returns a new empty "ISICType" element
         */
        com.scb.sci.customer.fm.ISICTypeDocument.ISICType addNewISICType();
        
        /**
         * Gets the "ISICCode" element
         */
        com.scb.sci.customer.fm.ISICCodeDocument.ISICCode getISICCode();
        
        /**
         * Sets the "ISICCode" element
         */
        void setISICCode(com.scb.sci.customer.fm.ISICCodeDocument.ISICCode isicCode);
        
        /**
         * Appends and returns a new empty "ISICCode" element
         */
        com.scb.sci.customer.fm.ISICCodeDocument.ISICCode addNewISICCode();
        
        /**
         * Gets the "UN2008IsicCode" element
         */
        java.lang.String getUN2008IsicCode();
        
        /**
         * Gets (as xml) the "UN2008IsicCode" element
         */
        org.apache.xmlbeans.XmlString xgetUN2008IsicCode();
        
        /**
         * Sets the "UN2008IsicCode" element
         */
        void setUN2008IsicCode(java.lang.String un2008IsicCode);
        
        /**
         * Sets (as xml) the "UN2008IsicCode" element
         */
        void xsetUN2008IsicCode(org.apache.xmlbeans.XmlString un2008IsicCode);
        
        /**
         * Gets the "UN2008IsicDescription" element
         */
        java.lang.String getUN2008IsicDescription();
        
        /**
         * Gets (as xml) the "UN2008IsicDescription" element
         */
        org.apache.xmlbeans.XmlString xgetUN2008IsicDescription();
        
        /**
         * Sets the "UN2008IsicDescription" element
         */
        void setUN2008IsicDescription(java.lang.String un2008IsicDescription);
        
        /**
         * Sets (as xml) the "UN2008IsicDescription" element
         */
        void xsetUN2008IsicDescription(org.apache.xmlbeans.XmlString un2008IsicDescription);
        
        /**
         * Gets the "ISICEffectiveDate" element
         */
        java.lang.String getISICEffectiveDate();
        
        /**
         * Gets (as xml) the "ISICEffectiveDate" element
         */
        org.apache.xmlbeans.XmlString xgetISICEffectiveDate();
        
        /**
         * Sets the "ISICEffectiveDate" element
         */
        void setISICEffectiveDate(java.lang.String isicEffectiveDate);
        
        /**
         * Sets (as xml) the "ISICEffectiveDate" element
         */
        void xsetISICEffectiveDate(org.apache.xmlbeans.XmlString isicEffectiveDate);
        
        /**
         * Gets the "ISICWeightage" element
         */
        java.lang.String getISICWeightage();
        
        /**
         * Gets (as xml) the "ISICWeightage" element
         */
        org.apache.xmlbeans.XmlString xgetISICWeightage();
        
        /**
         * Sets the "ISICWeightage" element
         */
        void setISICWeightage(java.lang.String isicWeightage);
        
        /**
         * Sets (as xml) the "ISICWeightage" element
         */
        void xsetISICWeightage(org.apache.xmlbeans.XmlString isicWeightage);
        
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
            public static com.scb.sci.customer.fm.ISICDocument.ISIC newInstance() {
              return (com.scb.sci.customer.fm.ISICDocument.ISIC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.ISICDocument.ISIC newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.ISICDocument.ISIC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.ISICDocument newInstance() {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.ISICDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.ISICDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.ISICDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.ISICDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.ISICDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.ISICDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.ISICDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.ISICDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.ISICDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.ISICDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.ISICDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.ISICDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.ISICDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.ISICDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.ISICDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.ISICDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.ISICDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.ISICDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
