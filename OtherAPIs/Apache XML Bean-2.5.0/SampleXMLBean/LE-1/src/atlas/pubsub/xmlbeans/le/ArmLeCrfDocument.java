/*
 * An XML document type.
 * Localname: armLeCrf
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ArmLeCrfDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le;


/**
 * A document containing one armLeCrf(@) element.
 *
 * This is a complex type.
 */
public interface ArmLeCrfDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArmLeCrfDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s18A232EABD86FE9FE68F626177D8784B").resolveHandle("armlecrf0c1bdoctype");
    
    /**
     * Gets the "armLeCrf" element
     */
    atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf getArmLeCrf();
    
    /**
     * Sets the "armLeCrf" element
     */
    void setArmLeCrf(atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf armLeCrf);
    
    /**
     * Appends and returns a new empty "armLeCrf" element
     */
    atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf addNewArmLeCrf();
    
    /**
     * An XML armLeCrf(@).
     *
     * This is a complex type.
     */
    public interface ArmLeCrf extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArmLeCrf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s18A232EABD86FE9FE68F626177D8784B").resolveHandle("armlecrfd42delemtype");
        
        /**
         * Gets the "armCrfId" element
         */
        java.lang.String getArmCrfId();
        
        /**
         * Gets (as xml) the "armCrfId" element
         */
        org.apache.xmlbeans.XmlString xgetArmCrfId();
        
        /**
         * Sets the "armCrfId" element
         */
        void setArmCrfId(java.lang.String armCrfId);
        
        /**
         * Sets (as xml) the "armCrfId" element
         */
        void xsetArmCrfId(org.apache.xmlbeans.XmlString armCrfId);
        
        /**
         * Gets the "armCode" element
         */
        java.lang.String getArmCode();
        
        /**
         * Gets (as xml) the "armCode" element
         */
        org.apache.xmlbeans.XmlString xgetArmCode();
        
        /**
         * Sets the "armCode" element
         */
        void setArmCode(java.lang.String armCode);
        
        /**
         * Sets (as xml) the "armCode" element
         */
        void xsetArmCode(org.apache.xmlbeans.XmlString armCode);
        
        /**
         * Gets the "armCrfStatus" element
         */
        java.lang.String getArmCrfStatus();
        
        /**
         * Gets (as xml) the "armCrfStatus" element
         */
        org.apache.xmlbeans.XmlString xgetArmCrfStatus();
        
        /**
         * Sets the "armCrfStatus" element
         */
        void setArmCrfStatus(java.lang.String armCrfStatus);
        
        /**
         * Sets (as xml) the "armCrfStatus" element
         */
        void xsetArmCrfStatus(org.apache.xmlbeans.XmlString armCrfStatus);
        
        /**
         * Gets the "updstatus" element
         */
        java.lang.String getUpdstatus();
        
        /**
         * Gets (as xml) the "updstatus" element
         */
        org.apache.xmlbeans.XmlString xgetUpdstatus();
        
        /**
         * Sets the "updstatus" element
         */
        void setUpdstatus(java.lang.String updstatus);
        
        /**
         * Sets (as xml) the "updstatus" element
         */
        void xsetUpdstatus(org.apache.xmlbeans.XmlString updstatus);
        
        /**
         * Gets the "verified" element
         */
        java.lang.String getVerified();
        
        /**
         * Gets (as xml) the "verified" element
         */
        org.apache.xmlbeans.XmlString xgetVerified();
        
        /**
         * Sets the "verified" element
         */
        void setVerified(java.lang.String verified);
        
        /**
         * Sets (as xml) the "verified" element
         */
        void xsetVerified(org.apache.xmlbeans.XmlString verified);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf newInstance() {
              return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument newInstance() {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.ArmLeCrfDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
