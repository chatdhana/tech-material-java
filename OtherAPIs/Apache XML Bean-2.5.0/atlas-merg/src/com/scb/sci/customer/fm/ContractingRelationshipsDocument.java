/*
 * An XML document type.
 * Localname: contractingRelationships
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ContractingRelationshipsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one contractingRelationships(@) element.
 *
 * This is a complex type.
 */
public interface ContractingRelationshipsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContractingRelationshipsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("contractingrelationships6304doctype");
    
    /**
     * Gets the "contractingRelationships" element
     */
    com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships getContractingRelationships();
    
    /**
     * Sets the "contractingRelationships" element
     */
    void setContractingRelationships(com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships contractingRelationships);
    
    /**
     * Appends and returns a new empty "contractingRelationships" element
     */
    com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships addNewContractingRelationships();
    
    /**
     * An XML contractingRelationships(@).
     *
     * This is a complex type.
     */
    public interface ContractingRelationships extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContractingRelationships.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("contractingrelationships248delemtype");
        
        /**
         * Gets a List of "contractingRelationship" elements
         */
        java.util.List<com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship> getContractingRelationshipList();
        
        /**
         * Gets array of all "contractingRelationship" elements
         * @deprecated
         */
        @Deprecated
        com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship[] getContractingRelationshipArray();
        
        /**
         * Gets ith "contractingRelationship" element
         */
        com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship getContractingRelationshipArray(int i);
        
        /**
         * Returns number of "contractingRelationship" element
         */
        int sizeOfContractingRelationshipArray();
        
        /**
         * Sets array of all "contractingRelationship" element
         */
        void setContractingRelationshipArray(com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship[] contractingRelationshipArray);
        
        /**
         * Sets ith "contractingRelationship" element
         */
        void setContractingRelationshipArray(int i, com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship contractingRelationship);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "contractingRelationship" element
         */
        com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship insertNewContractingRelationship(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "contractingRelationship" element
         */
        com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship addNewContractingRelationship();
        
        /**
         * Removes the ith "contractingRelationship" element
         */
        void removeContractingRelationship(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships newInstance() {
              return (com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument newInstance() {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.ContractingRelationshipsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.ContractingRelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
