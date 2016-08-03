/*
 * An XML document type.
 * Localname: fmHierarchy
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmHierarchyDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one fmHierarchy(@) element.
 *
 * This is a complex type.
 */
public interface FmHierarchyDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmHierarchyDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmhierarchy3715doctype");
    
    /**
     * Gets the "fmHierarchy" element
     */
    com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy getFmHierarchy();
    
    /**
     * Sets the "fmHierarchy" element
     */
    void setFmHierarchy(com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy fmHierarchy);
    
    /**
     * Appends and returns a new empty "fmHierarchy" element
     */
    com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy addNewFmHierarchy();
    
    /**
     * An XML fmHierarchy(@).
     *
     * This is a complex type.
     */
    public interface FmHierarchy extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmHierarchy.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmhierarchyab3felemtype");
        
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
         * Gets the "fmHrySysGenId" element
         */
        java.lang.String getFmHrySysGenId();
        
        /**
         * Gets (as xml) the "fmHrySysGenId" element
         */
        org.apache.xmlbeans.XmlString xgetFmHrySysGenId();
        
        /**
         * Sets the "fmHrySysGenId" element
         */
        void setFmHrySysGenId(java.lang.String fmHrySysGenId);
        
        /**
         * Sets (as xml) the "fmHrySysGenId" element
         */
        void xsetFmHrySysGenId(org.apache.xmlbeans.XmlString fmHrySysGenId);
        
        /**
         * Gets the "parentFmId" element
         */
        java.lang.String getParentFmId();
        
        /**
         * Gets (as xml) the "parentFmId" element
         */
        org.apache.xmlbeans.XmlString xgetParentFmId();
        
        /**
         * Sets the "parentFmId" element
         */
        void setParentFmId(java.lang.String parentFmId);
        
        /**
         * Sets (as xml) the "parentFmId" element
         */
        void xsetParentFmId(org.apache.xmlbeans.XmlString parentFmId);
        
        /**
         * Gets the "hierarchyType" element
         */
        com.scb.sci.customer.fm.HierarchyTypeDocument.HierarchyType getHierarchyType();
        
        /**
         * Sets the "hierarchyType" element
         */
        void setHierarchyType(com.scb.sci.customer.fm.HierarchyTypeDocument.HierarchyType hierarchyType);
        
        /**
         * Appends and returns a new empty "hierarchyType" element
         */
        com.scb.sci.customer.fm.HierarchyTypeDocument.HierarchyType addNewHierarchyType();
        
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
            public static com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy newInstance() {
              return (com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.FmHierarchyDocument newInstance() {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.FmHierarchyDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmHierarchyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmHierarchyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
