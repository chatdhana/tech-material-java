/*
 * An XML document type.
 * Localname: NewDataSet
 * Namespace: 
 * Java type: com.scb.sci.s2b.NewDataSetDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.s2b;


/**
 * A document containing one NewDataSet(@) element.
 *
 * This is a complex type.
 */
public interface NewDataSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NewDataSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8E3C6F95DC193C2E8FEBB85D373DEB0E").resolveHandle("newdataset77f1doctype");
    
    /**
     * Gets the "NewDataSet" element
     */
    com.scb.sci.s2b.NewDataSetDocument.NewDataSet getNewDataSet();
    
    /**
     * Sets the "NewDataSet" element
     */
    void setNewDataSet(com.scb.sci.s2b.NewDataSetDocument.NewDataSet newDataSet);
    
    /**
     * Appends and returns a new empty "NewDataSet" element
     */
    com.scb.sci.s2b.NewDataSetDocument.NewDataSet addNewNewDataSet();
    
    /**
     * An XML NewDataSet(@).
     *
     * This is a complex type.
     */
    public interface NewDataSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NewDataSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8E3C6F95DC193C2E8FEBB85D373DEB0E").resolveHandle("newdataset732delemtype");
        
        /**
         * Gets array of all "TPCustRequest" elements
         */
        com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest[] getTPCustRequestArray();
        
        /**
         * Gets ith "TPCustRequest" element
         */
        com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest getTPCustRequestArray(int i);
        
        /**
         * Returns number of "TPCustRequest" element
         */
        int sizeOfTPCustRequestArray();
        
        /**
         * Sets array of all "TPCustRequest" element
         */
        void setTPCustRequestArray(com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest[] tpCustRequestArray);
        
        /**
         * Sets ith "TPCustRequest" element
         */
        void setTPCustRequestArray(int i, com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest tpCustRequest);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TPCustRequest" element
         */
        com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest insertNewTPCustRequest(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TPCustRequest" element
         */
        com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest addNewTPCustRequest();
        
        /**
         * Removes the ith "TPCustRequest" element
         */
        void removeTPCustRequest(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.scb.sci.s2b.NewDataSetDocument.NewDataSet newInstance() {
              return (com.scb.sci.s2b.NewDataSetDocument.NewDataSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.s2b.NewDataSetDocument.NewDataSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.s2b.NewDataSetDocument.NewDataSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.s2b.NewDataSetDocument newInstance() {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.s2b.NewDataSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.s2b.NewDataSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.s2b.NewDataSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.s2b.NewDataSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.s2b.NewDataSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.s2b.NewDataSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.s2b.NewDataSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.s2b.NewDataSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.s2b.NewDataSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.s2b.NewDataSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.s2b.NewDataSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.s2b.NewDataSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.s2b.NewDataSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.s2b.NewDataSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.s2b.NewDataSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.scb.sci.s2b.NewDataSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.scb.sci.s2b.NewDataSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.s2b.NewDataSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
