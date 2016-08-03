/*
 * An XML document type.
 * Localname: empRelationship
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.EmpRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one empRelationship(@) element.
 *
 * This is a complex type.
 */
public interface EmpRelationshipDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmpRelationshipDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("emprelationship3d87doctype");
    
    /**
     * Gets the "empRelationship" element
     */
    com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship getEmpRelationship();
    
    /**
     * Sets the "empRelationship" element
     */
    void setEmpRelationship(com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship empRelationship);
    
    /**
     * Appends and returns a new empty "empRelationship" element
     */
    com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship addNewEmpRelationship();
    
    /**
     * An XML empRelationship(@).
     *
     * This is a complex type.
     */
    public interface EmpRelationship extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmpRelationship.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("emprelationship0a23elemtype");
        
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
         * Gets the "empEmpCodeMapId" element
         */
        java.lang.String getEmpEmpCodeMapId();
        
        /**
         * Gets (as xml) the "empEmpCodeMapId" element
         */
        org.apache.xmlbeans.XmlString xgetEmpEmpCodeMapId();
        
        /**
         * Sets the "empEmpCodeMapId" element
         */
        void setEmpEmpCodeMapId(java.lang.String empEmpCodeMapId);
        
        /**
         * Sets (as xml) the "empEmpCodeMapId" element
         */
        void xsetEmpEmpCodeMapId(org.apache.xmlbeans.XmlString empEmpCodeMapId);
        
        /**
         * Gets the "empMapId" element
         */
        java.lang.String getEmpMapId();
        
        /**
         * Gets (as xml) the "empMapId" element
         */
        org.apache.xmlbeans.XmlString xgetEmpMapId();
        
        /**
         * Sets the "empMapId" element
         */
        void setEmpMapId(java.lang.String empMapId);
        
        /**
         * Sets (as xml) the "empMapId" element
         */
        void xsetEmpMapId(org.apache.xmlbeans.XmlString empMapId);
        
        /**
         * Gets the "empId" element
         */
        java.lang.String getEmpId();
        
        /**
         * Gets (as xml) the "empId" element
         */
        org.apache.xmlbeans.XmlString xgetEmpId();
        
        /**
         * Sets the "empId" element
         */
        void setEmpId(java.lang.String empId);
        
        /**
         * Sets (as xml) the "empId" element
         */
        void xsetEmpId(org.apache.xmlbeans.XmlString empId);
        
        /**
         * Gets the "empCode" element
         */
        java.lang.String getEmpCode();
        
        /**
         * Gets (as xml) the "empCode" element
         */
        org.apache.xmlbeans.XmlString xgetEmpCode();
        
        /**
         * Sets the "empCode" element
         */
        void setEmpCode(java.lang.String empCode);
        
        /**
         * Sets (as xml) the "empCode" element
         */
        void xsetEmpCode(org.apache.xmlbeans.XmlString empCode);
        
        /**
         * Gets the "empName" element
         */
        java.lang.String getEmpName();
        
        /**
         * Gets (as xml) the "empName" element
         */
        org.apache.xmlbeans.XmlString xgetEmpName();
        
        /**
         * Sets the "empName" element
         */
        void setEmpName(java.lang.String empName);
        
        /**
         * Sets (as xml) the "empName" element
         */
        void xsetEmpName(org.apache.xmlbeans.XmlString empName);
        
        /**
         * Gets the "bkgLocation" element
         */
        com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation getBkgLocation();
        
        /**
         * Sets the "bkgLocation" element
         */
        void setBkgLocation(com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation bkgLocation);
        
        /**
         * Appends and returns a new empty "bkgLocation" element
         */
        com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation addNewBkgLocation();
        
        /**
         * Gets the "empRelationshipType" element
         */
        com.scb.sci.customer.fm.EmpRelationshipTypeDocument.EmpRelationshipType getEmpRelationshipType();
        
        /**
         * Sets the "empRelationshipType" element
         */
        void setEmpRelationshipType(com.scb.sci.customer.fm.EmpRelationshipTypeDocument.EmpRelationshipType empRelationshipType);
        
        /**
         * Appends and returns a new empty "empRelationshipType" element
         */
        com.scb.sci.customer.fm.EmpRelationshipTypeDocument.EmpRelationshipType addNewEmpRelationshipType();
        
        /**
         * Gets the "principalFAMInd" element
         */
        java.lang.String getPrincipalFAMInd();
        
        /**
         * Gets (as xml) the "principalFAMInd" element
         */
        org.apache.xmlbeans.XmlString xgetPrincipalFAMInd();
        
        /**
         * Sets the "principalFAMInd" element
         */
        void setPrincipalFAMInd(java.lang.String principalFAMInd);
        
        /**
         * Sets (as xml) the "principalFAMInd" element
         */
        void xsetPrincipalFAMInd(org.apache.xmlbeans.XmlString principalFAMInd);
        
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
            public static com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship newInstance() {
              return (com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.EmpRelationshipDocument newInstance() {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.EmpRelationshipDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.EmpRelationshipDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.EmpRelationshipDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
