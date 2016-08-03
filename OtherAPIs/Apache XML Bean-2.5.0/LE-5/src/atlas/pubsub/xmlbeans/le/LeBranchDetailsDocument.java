/*
 * An XML document type.
 * Localname: leBranchDetails
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le;


/**
 * A document containing one leBranchDetails(@) element.
 *
 * This is a complex type.
 */
public interface LeBranchDetailsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LeBranchDetailsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("lebranchdetails8faedoctype");
    
    /**
     * Gets the "leBranchDetails" element
     */
    atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails getLeBranchDetails();
    
    /**
     * Sets the "leBranchDetails" element
     */
    void setLeBranchDetails(atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails leBranchDetails);
    
    /**
     * Appends and returns a new empty "leBranchDetails" element
     */
    atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails addNewLeBranchDetails();
    
    /**
     * An XML leBranchDetails(@).
     *
     * This is a complex type.
     */
    public interface LeBranchDetails extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LeBranchDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("lebranchdetails12b1elemtype");
        
        /**
         * Gets a List of "leBranchInfo" elements
         */
        java.util.List<atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo> getLeBranchInfoList();
        
        /**
         * Gets array of all "leBranchInfo" elements
         * @deprecated
         */
        @Deprecated
        atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo[] getLeBranchInfoArray();
        
        /**
         * Gets ith "leBranchInfo" element
         */
        atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo getLeBranchInfoArray(int i);
        
        /**
         * Returns number of "leBranchInfo" element
         */
        int sizeOfLeBranchInfoArray();
        
        /**
         * Sets array of all "leBranchInfo" element
         */
        void setLeBranchInfoArray(atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo[] leBranchInfoArray);
        
        /**
         * Sets ith "leBranchInfo" element
         */
        void setLeBranchInfoArray(int i, atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo leBranchInfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leBranchInfo" element
         */
        atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo insertNewLeBranchInfo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leBranchInfo" element
         */
        atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo addNewLeBranchInfo();
        
        /**
         * Removes the ith "leBranchInfo" element
         */
        void removeLeBranchInfo(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails newInstance() {
              return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument newInstance() {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
