/*
 * An XML document type.
 * Localname: TPCustRequest
 * Namespace: 
 * Java type: com.scb.sci.s2b.TPCustRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.s2b;


/**
 * A document containing one TPCustRequest(@) element.
 *
 * This is a complex type.
 */
public interface TPCustRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TPCustRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8E3C6F95DC193C2E8FEBB85D373DEB0E").resolveHandle("tpcustrequest4cc7doctype");
    
    /**
     * Gets the "TPCustRequest" element
     */
    com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest getTPCustRequest();
    
    /**
     * Sets the "TPCustRequest" element
     */
    void setTPCustRequest(com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest tpCustRequest);
    
    /**
     * Appends and returns a new empty "TPCustRequest" element
     */
    com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest addNewTPCustRequest();
    
    /**
     * An XML TPCustRequest(@).
     *
     * This is a complex type.
     */
    public interface TPCustRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TPCustRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8E3C6F95DC193C2E8FEBB85D373DEB0E").resolveHandle("tpcustrequestefe3elemtype");
        
        /**
         * Gets the "leId" element
         */
        java.lang.String getLeId();
        
        /**
         * Gets (as xml) the "leId" element
         */
        org.apache.xmlbeans.XmlString xgetLeId();
        
        /**
         * True if has "leId" element
         */
        boolean isSetLeId();
        
        /**
         * Sets the "leId" element
         */
        void setLeId(java.lang.String leId);
        
        /**
         * Sets (as xml) the "leId" element
         */
        void xsetLeId(org.apache.xmlbeans.XmlString leId);
        
        /**
         * Unsets the "leId" element
         */
        void unsetLeId();
        
        /**
         * Gets the "subProfileId" element
         */
        java.lang.String getSubProfileId();
        
        /**
         * Gets (as xml) the "subProfileId" element
         */
        org.apache.xmlbeans.XmlString xgetSubProfileId();
        
        /**
         * True if has "subProfileId" element
         */
        boolean isSetSubProfileId();
        
        /**
         * Sets the "subProfileId" element
         */
        void setSubProfileId(java.lang.String subProfileId);
        
        /**
         * Sets (as xml) the "subProfileId" element
         */
        void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
        
        /**
         * Unsets the "subProfileId" element
         */
        void unsetSubProfileId();
        
        /**
         * Gets the "limitInd" element
         */
        java.lang.String getLimitInd();
        
        /**
         * Gets (as xml) the "limitInd" element
         */
        org.apache.xmlbeans.XmlString xgetLimitInd();
        
        /**
         * True if has "limitInd" element
         */
        boolean isSetLimitInd();
        
        /**
         * Sets the "limitInd" element
         */
        void setLimitInd(java.lang.String limitInd);
        
        /**
         * Sets (as xml) the "limitInd" element
         */
        void xsetLimitInd(org.apache.xmlbeans.XmlString limitInd);
        
        /**
         * Unsets the "limitInd" element
         */
        void unsetLimitInd();
        
        /**
         * Gets array of all "requestedSystemDetails" elements
         */
        com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails[] getRequestedSystemDetailsArray();
        
        /**
         * Gets ith "requestedSystemDetails" element
         */
        com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails getRequestedSystemDetailsArray(int i);
        
        /**
         * Returns number of "requestedSystemDetails" element
         */
        int sizeOfRequestedSystemDetailsArray();
        
        /**
         * Sets array of all "requestedSystemDetails" element
         */
        void setRequestedSystemDetailsArray(com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails[] requestedSystemDetailsArray);
        
        /**
         * Sets ith "requestedSystemDetails" element
         */
        void setRequestedSystemDetailsArray(int i, com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails requestedSystemDetails);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "requestedSystemDetails" element
         */
        com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails insertNewRequestedSystemDetails(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "requestedSystemDetails" element
         */
        com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails addNewRequestedSystemDetails();
        
        /**
         * Removes the ith "requestedSystemDetails" element
         */
        void removeRequestedSystemDetails(int i);
        
        /**
         * An XML requestedSystemDetails(@).
         *
         * This is a complex type.
         */
        public interface RequestedSystemDetails extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestedSystemDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8E3C6F95DC193C2E8FEBB85D373DEB0E").resolveHandle("requestedsystemdetails10b4elemtype");
            
            /**
             * Gets the "requestType" element
             */
            java.lang.String getRequestType();
            
            /**
             * Gets (as xml) the "requestType" element
             */
            org.apache.xmlbeans.XmlString xgetRequestType();
            
            /**
             * True if has "requestType" element
             */
            boolean isSetRequestType();
            
            /**
             * Sets the "requestType" element
             */
            void setRequestType(java.lang.String requestType);
            
            /**
             * Sets (as xml) the "requestType" element
             */
            void xsetRequestType(org.apache.xmlbeans.XmlString requestType);
            
            /**
             * Unsets the "requestType" element
             */
            void unsetRequestType();
            
            /**
             * Gets the "requestedSystemName" element
             */
            java.lang.String getRequestedSystemName();
            
            /**
             * Gets (as xml) the "requestedSystemName" element
             */
            org.apache.xmlbeans.XmlString xgetRequestedSystemName();
            
            /**
             * True if has "requestedSystemName" element
             */
            boolean isSetRequestedSystemName();
            
            /**
             * Sets the "requestedSystemName" element
             */
            void setRequestedSystemName(java.lang.String requestedSystemName);
            
            /**
             * Sets (as xml) the "requestedSystemName" element
             */
            void xsetRequestedSystemName(org.apache.xmlbeans.XmlString requestedSystemName);
            
            /**
             * Unsets the "requestedSystemName" element
             */
            void unsetRequestedSystemName();
            
            /**
             * Gets the "requestId" element
             */
            java.lang.String getRequestId();
            
            /**
             * Gets (as xml) the "requestId" element
             */
            org.apache.xmlbeans.XmlString xgetRequestId();
            
            /**
             * True if has "requestId" element
             */
            boolean isSetRequestId();
            
            /**
             * Sets the "requestId" element
             */
            void setRequestId(java.lang.String requestId);
            
            /**
             * Sets (as xml) the "requestId" element
             */
            void xsetRequestId(org.apache.xmlbeans.XmlString requestId);
            
            /**
             * Unsets the "requestId" element
             */
            void unsetRequestId();
            
            /**
             * Gets the "requestDate" element
             */
            java.lang.String getRequestDate();
            
            /**
             * Gets (as xml) the "requestDate" element
             */
            org.apache.xmlbeans.XmlString xgetRequestDate();
            
            /**
             * True if has "requestDate" element
             */
            boolean isSetRequestDate();
            
            /**
             * Sets the "requestDate" element
             */
            void setRequestDate(java.lang.String requestDate);
            
            /**
             * Sets (as xml) the "requestDate" element
             */
            void xsetRequestDate(org.apache.xmlbeans.XmlString requestDate);
            
            /**
             * Unsets the "requestDate" element
             */
            void unsetRequestDate();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails newInstance() {
                  return (com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest newInstance() {
              return (com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.s2b.TPCustRequestDocument.TPCustRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.s2b.TPCustRequestDocument newInstance() {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.s2b.TPCustRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.s2b.TPCustRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.s2b.TPCustRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.s2b.TPCustRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.s2b.TPCustRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.s2b.TPCustRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.s2b.TPCustRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.s2b.TPCustRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.s2b.TPCustRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.s2b.TPCustRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.s2b.TPCustRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.s2b.TPCustRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.s2b.TPCustRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.s2b.TPCustRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.s2b.TPCustRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.scb.sci.s2b.TPCustRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.scb.sci.s2b.TPCustRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.s2b.TPCustRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
