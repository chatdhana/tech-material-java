/*
 * An XML document type.
 * Localname: leHierarchyDetails
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le;


/**
 * A document containing one leHierarchyDetails(@) element.
 *
 * This is a complex type.
 */
public interface LeHierarchyDetailsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LeHierarchyDetailsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("lehierarchydetails7e1fdoctype");
    
    /**
     * Gets the "leHierarchyDetails" element
     */
    atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails getLeHierarchyDetails();
    
    /**
     * Sets the "leHierarchyDetails" element
     */
    void setLeHierarchyDetails(atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails leHierarchyDetails);
    
    /**
     * Appends and returns a new empty "leHierarchyDetails" element
     */
    atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails addNewLeHierarchyDetails();
    
    /**
     * An XML leHierarchyDetails(@).
     *
     * This is a complex type.
     */
    public interface LeHierarchyDetails extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LeHierarchyDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("lehierarchydetails1eedelemtype");
        
        /**
         * Gets a List of "leHierarchyInfo" elements
         */
        java.util.List<atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo> getLeHierarchyInfoList();
        
        /**
         * Gets array of all "leHierarchyInfo" elements
         * @deprecated
         */
        @Deprecated
        atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo[] getLeHierarchyInfoArray();
        
        /**
         * Gets ith "leHierarchyInfo" element
         */
        atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo getLeHierarchyInfoArray(int i);
        
        /**
         * Returns number of "leHierarchyInfo" element
         */
        int sizeOfLeHierarchyInfoArray();
        
        /**
         * Sets array of all "leHierarchyInfo" element
         */
        void setLeHierarchyInfoArray(atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo[] leHierarchyInfoArray);
        
        /**
         * Sets ith "leHierarchyInfo" element
         */
        void setLeHierarchyInfoArray(int i, atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo leHierarchyInfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leHierarchyInfo" element
         */
        atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo insertNewLeHierarchyInfo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leHierarchyInfo" element
         */
        atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo addNewLeHierarchyInfo();
        
        /**
         * Removes the ith "leHierarchyInfo" element
         */
        void removeLeHierarchyInfo(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails newInstance() {
              return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument newInstance() {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
