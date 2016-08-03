/*
 * An XML document type.
 * Localname: fmAccountInfo
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmAccountInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one fmAccountInfo(@) element.
 *
 * This is a complex type.
 */
public interface FmAccountInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmAccountInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmaccountinfo715bdoctype");
    
    /**
     * Gets the "fmAccountInfo" element
     */
    com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo getFmAccountInfo();
    
    /**
     * Sets the "fmAccountInfo" element
     */
    void setFmAccountInfo(com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo fmAccountInfo);
    
    /**
     * Appends and returns a new empty "fmAccountInfo" element
     */
    com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo addNewFmAccountInfo();
    
    /**
     * An XML fmAccountInfo(@).
     *
     * This is a complex type.
     */
    public interface FmAccountInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmAccountInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmaccountinfo910belemtype");
        
        /**
         * Gets the "fmProfileInfo" element
         */
        com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo getFmProfileInfo();
        
        /**
         * Sets the "fmProfileInfo" element
         */
        void setFmProfileInfo(com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo fmProfileInfo);
        
        /**
         * Appends and returns a new empty "fmProfileInfo" element
         */
        com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo addNewFmProfileInfo();
        
        /**
         * Gets the "fmEntityInfo" element
         */
        com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo getFmEntityInfo();
        
        /**
         * Sets the "fmEntityInfo" element
         */
        void setFmEntityInfo(com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo fmEntityInfo);
        
        /**
         * Appends and returns a new empty "fmEntityInfo" element
         */
        com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo addNewFmEntityInfo();
        
        /**
         * Gets the "fmEntityMoreInfo" element
         */
        com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo getFmEntityMoreInfo();
        
        /**
         * Sets the "fmEntityMoreInfo" element
         */
        void setFmEntityMoreInfo(com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo fmEntityMoreInfo);
        
        /**
         * Appends and returns a new empty "fmEntityMoreInfo" element
         */
        com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo addNewFmEntityMoreInfo();
        
        /**
         * Gets the "fmHierarchyDetails" element
         */
        com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails getFmHierarchyDetails();
        
        /**
         * Sets the "fmHierarchyDetails" element
         */
        void setFmHierarchyDetails(com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails fmHierarchyDetails);
        
        /**
         * Appends and returns a new empty "fmHierarchyDetails" element
         */
        com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails addNewFmHierarchyDetails();
        
        /**
         * Gets the "fmAddressDetails" element
         */
        com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails getFmAddressDetails();
        
        /**
         * Sets the "fmAddressDetails" element
         */
        void setFmAddressDetails(com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails fmAddressDetails);
        
        /**
         * Appends and returns a new empty "fmAddressDetails" element
         */
        com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails addNewFmAddressDetails();
        
        /**
         * Gets the "fmAltAddressDetails" element
         */
        com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails getFmAltAddressDetails();
        
        /**
         * True if has "fmAltAddressDetails" element
         */
        boolean isSetFmAltAddressDetails();
        
        /**
         * Sets the "fmAltAddressDetails" element
         */
        void setFmAltAddressDetails(com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails fmAltAddressDetails);
        
        /**
         * Appends and returns a new empty "fmAltAddressDetails" element
         */
        com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails addNewFmAltAddressDetails();
        
        /**
         * Unsets the "fmAltAddressDetails" element
         */
        void unsetFmAltAddressDetails();
        
        /**
         * Gets the "fmBranchDetails" element
         */
        com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails getFmBranchDetails();
        
        /**
         * True if has "fmBranchDetails" element
         */
        boolean isSetFmBranchDetails();
        
        /**
         * Sets the "fmBranchDetails" element
         */
        void setFmBranchDetails(com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails fmBranchDetails);
        
        /**
         * Appends and returns a new empty "fmBranchDetails" element
         */
        com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails addNewFmBranchDetails();
        
        /**
         * Unsets the "fmBranchDetails" element
         */
        void unsetFmBranchDetails();
        
        /**
         * Gets the "fmSysContactDetails" element
         */
        com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails getFmSysContactDetails();
        
        /**
         * True if has "fmSysContactDetails" element
         */
        boolean isSetFmSysContactDetails();
        
        /**
         * Sets the "fmSysContactDetails" element
         */
        void setFmSysContactDetails(com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails fmSysContactDetails);
        
        /**
         * Appends and returns a new empty "fmSysContactDetails" element
         */
        com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails addNewFmSysContactDetails();
        
        /**
         * Unsets the "fmSysContactDetails" element
         */
        void unsetFmSysContactDetails();
        
        /**
         * Gets the "fmAltSysContactDetails" element
         */
        com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails getFmAltSysContactDetails();
        
        /**
         * True if has "fmAltSysContactDetails" element
         */
        boolean isSetFmAltSysContactDetails();
        
        /**
         * Sets the "fmAltSysContactDetails" element
         */
        void setFmAltSysContactDetails(com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails fmAltSysContactDetails);
        
        /**
         * Appends and returns a new empty "fmAltSysContactDetails" element
         */
        com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails addNewFmAltSysContactDetails();
        
        /**
         * Unsets the "fmAltSysContactDetails" element
         */
        void unsetFmAltSysContactDetails();
        
        /**
         * Gets the "fmCrossReferenceDetails" element
         */
        com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails getFmCrossReferenceDetails();
        
        /**
         * Sets the "fmCrossReferenceDetails" element
         */
        void setFmCrossReferenceDetails(com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails fmCrossReferenceDetails);
        
        /**
         * Appends and returns a new empty "fmCrossReferenceDetails" element
         */
        com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails addNewFmCrossReferenceDetails();
        
        /**
         * Gets the "fmTCIDDetails" element
         */
        com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails getFmTCIDDetails();
        
        /**
         * True if has "fmTCIDDetails" element
         */
        boolean isSetFmTCIDDetails();
        
        /**
         * Sets the "fmTCIDDetails" element
         */
        void setFmTCIDDetails(com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails fmTCIDDetails);
        
        /**
         * Appends and returns a new empty "fmTCIDDetails" element
         */
        com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails addNewFmTCIDDetails();
        
        /**
         * Unsets the "fmTCIDDetails" element
         */
        void unsetFmTCIDDetails();
        
        /**
         * Gets the "fmScbInfo" element
         */
        com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo getFmScbInfo();
        
        /**
         * True if has "fmScbInfo" element
         */
        boolean isSetFmScbInfo();
        
        /**
         * Sets the "fmScbInfo" element
         */
        void setFmScbInfo(com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo fmScbInfo);
        
        /**
         * Appends and returns a new empty "fmScbInfo" element
         */
        com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo addNewFmScbInfo();
        
        /**
         * Unsets the "fmScbInfo" element
         */
        void unsetFmScbInfo();
        
        /**
         * Gets the "fmSynInfo" element
         */
        com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo getFmSynInfo();
        
        /**
         * True if has "fmSynInfo" element
         */
        boolean isSetFmSynInfo();
        
        /**
         * Sets the "fmSynInfo" element
         */
        void setFmSynInfo(com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo fmSynInfo);
        
        /**
         * Appends and returns a new empty "fmSynInfo" element
         */
        com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo addNewFmSynInfo();
        
        /**
         * Unsets the "fmSynInfo" element
         */
        void unsetFmSynInfo();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo newInstance() {
              return (com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.FmAccountInfoDocument newInstance() {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.FmAccountInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmAccountInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmAccountInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
