/*
 * An XML document type.
 * Localname: fmAddress
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmAddressDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one fmAddress(@) element.
 *
 * This is a complex type.
 */
public interface FmAddressDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmAddressDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmaddressf8d4doctype");
    
    /**
     * Gets the "fmAddress" element
     */
    com.scb.sci.customer.fm.FmAddressDocument.FmAddress getFmAddress();
    
    /**
     * Sets the "fmAddress" element
     */
    void setFmAddress(com.scb.sci.customer.fm.FmAddressDocument.FmAddress fmAddress);
    
    /**
     * Appends and returns a new empty "fmAddress" element
     */
    com.scb.sci.customer.fm.FmAddressDocument.FmAddress addNewFmAddress();
    
    /**
     * An XML fmAddress(@).
     *
     * This is a complex type.
     */
    public interface FmAddress extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmaddress9afdelemtype");
        
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
         * Gets the "fmAddrSysGenId" element
         */
        java.lang.String getFmAddrSysGenId();
        
        /**
         * Gets (as xml) the "fmAddrSysGenId" element
         */
        org.apache.xmlbeans.XmlString xgetFmAddrSysGenId();
        
        /**
         * Sets the "fmAddrSysGenId" element
         */
        void setFmAddrSysGenId(java.lang.String fmAddrSysGenId);
        
        /**
         * Sets (as xml) the "fmAddrSysGenId" element
         */
        void xsetFmAddrSysGenId(org.apache.xmlbeans.XmlString fmAddrSysGenId);
        
        /**
         * Gets the "addrType" element
         */
        com.scb.sci.customer.fm.AddrTypeDocument.AddrType getAddrType();
        
        /**
         * Sets the "addrType" element
         */
        void setAddrType(com.scb.sci.customer.fm.AddrTypeDocument.AddrType addrType);
        
        /**
         * Appends and returns a new empty "addrType" element
         */
        com.scb.sci.customer.fm.AddrTypeDocument.AddrType addNewAddrType();
        
        /**
         * Gets the "addrLine1" element
         */
        java.lang.String getAddrLine1();
        
        /**
         * Gets (as xml) the "addrLine1" element
         */
        org.apache.xmlbeans.XmlString xgetAddrLine1();
        
        /**
         * Sets the "addrLine1" element
         */
        void setAddrLine1(java.lang.String addrLine1);
        
        /**
         * Sets (as xml) the "addrLine1" element
         */
        void xsetAddrLine1(org.apache.xmlbeans.XmlString addrLine1);
        
        /**
         * Gets the "addrLine2" element
         */
        java.lang.String getAddrLine2();
        
        /**
         * Gets (as xml) the "addrLine2" element
         */
        org.apache.xmlbeans.XmlString xgetAddrLine2();
        
        /**
         * Sets the "addrLine2" element
         */
        void setAddrLine2(java.lang.String addrLine2);
        
        /**
         * Sets (as xml) the "addrLine2" element
         */
        void xsetAddrLine2(org.apache.xmlbeans.XmlString addrLine2);
        
        /**
         * Gets the "country" element
         */
        java.lang.String getCountry();
        
        /**
         * Gets (as xml) the "country" element
         */
        org.apache.xmlbeans.XmlString xgetCountry();
        
        /**
         * Sets the "country" element
         */
        void setCountry(java.lang.String country);
        
        /**
         * Sets (as xml) the "country" element
         */
        void xsetCountry(org.apache.xmlbeans.XmlString country);
        
        /**
         * Gets the "city" element
         */
        java.lang.String getCity();
        
        /**
         * Gets (as xml) the "city" element
         */
        org.apache.xmlbeans.XmlString xgetCity();
        
        /**
         * Sets the "city" element
         */
        void setCity(java.lang.String city);
        
        /**
         * Sets (as xml) the "city" element
         */
        void xsetCity(org.apache.xmlbeans.XmlString city);
        
        /**
         * Gets the "postCode" element
         */
        java.lang.String getPostCode();
        
        /**
         * Gets (as xml) the "postCode" element
         */
        org.apache.xmlbeans.XmlString xgetPostCode();
        
        /**
         * Sets the "postCode" element
         */
        void setPostCode(java.lang.String postCode);
        
        /**
         * Sets (as xml) the "postCode" element
         */
        void xsetPostCode(org.apache.xmlbeans.XmlString postCode);
        
        /**
         * Gets the "state" element
         */
        java.lang.String getState();
        
        /**
         * Gets (as xml) the "state" element
         */
        org.apache.xmlbeans.XmlString xgetState();
        
        /**
         * Sets the "state" element
         */
        void setState(java.lang.String state);
        
        /**
         * Sets (as xml) the "state" element
         */
        void xsetState(org.apache.xmlbeans.XmlString state);
        
        /**
         * Gets the "altName" element
         */
        java.lang.String getAltName();
        
        /**
         * Gets (as xml) the "altName" element
         */
        org.apache.xmlbeans.XmlString xgetAltName();
        
        /**
         * Sets the "altName" element
         */
        void setAltName(java.lang.String altName);
        
        /**
         * Sets (as xml) the "altName" element
         */
        void xsetAltName(org.apache.xmlbeans.XmlString altName);
        
        /**
         * Gets the "contEmail" element
         */
        java.lang.String getContEmail();
        
        /**
         * Gets (as xml) the "contEmail" element
         */
        org.apache.xmlbeans.XmlString xgetContEmail();
        
        /**
         * Sets the "contEmail" element
         */
        void setContEmail(java.lang.String contEmail);
        
        /**
         * Sets (as xml) the "contEmail" element
         */
        void xsetContEmail(org.apache.xmlbeans.XmlString contEmail);
        
        /**
         * Gets the "contPhone" element
         */
        java.lang.String getContPhone();
        
        /**
         * Gets (as xml) the "contPhone" element
         */
        org.apache.xmlbeans.XmlString xgetContPhone();
        
        /**
         * Sets the "contPhone" element
         */
        void setContPhone(java.lang.String contPhone);
        
        /**
         * Sets (as xml) the "contPhone" element
         */
        void xsetContPhone(org.apache.xmlbeans.XmlString contPhone);
        
        /**
         * Gets the "description" element
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" element
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * Sets the "description" element
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" element
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Gets the "contRole" element
         */
        java.lang.String getContRole();
        
        /**
         * Gets (as xml) the "contRole" element
         */
        org.apache.xmlbeans.XmlString xgetContRole();
        
        /**
         * Sets the "contRole" element
         */
        void setContRole(java.lang.String contRole);
        
        /**
         * Sets (as xml) the "contRole" element
         */
        void xsetContRole(org.apache.xmlbeans.XmlString contRole);
        
        /**
         * Gets the "contTitle" element
         */
        com.scb.sci.customer.fm.ContTitleDocument.ContTitle getContTitle();
        
        /**
         * Sets the "contTitle" element
         */
        void setContTitle(com.scb.sci.customer.fm.ContTitleDocument.ContTitle contTitle);
        
        /**
         * Appends and returns a new empty "contTitle" element
         */
        com.scb.sci.customer.fm.ContTitleDocument.ContTitle addNewContTitle();
        
        /**
         * Gets the "contFirstName" element
         */
        java.lang.String getContFirstName();
        
        /**
         * Gets (as xml) the "contFirstName" element
         */
        org.apache.xmlbeans.XmlString xgetContFirstName();
        
        /**
         * Sets the "contFirstName" element
         */
        void setContFirstName(java.lang.String contFirstName);
        
        /**
         * Sets (as xml) the "contFirstName" element
         */
        void xsetContFirstName(org.apache.xmlbeans.XmlString contFirstName);
        
        /**
         * Gets the "contLastName" element
         */
        java.lang.String getContLastName();
        
        /**
         * Gets (as xml) the "contLastName" element
         */
        org.apache.xmlbeans.XmlString xgetContLastName();
        
        /**
         * Sets the "contLastName" element
         */
        void setContLastName(java.lang.String contLastName);
        
        /**
         * Sets (as xml) the "contLastName" element
         */
        void xsetContLastName(org.apache.xmlbeans.XmlString contLastName);
        
        /**
         * Gets the "contFax" element
         */
        java.lang.String getContFax();
        
        /**
         * Gets (as xml) the "contFax" element
         */
        org.apache.xmlbeans.XmlString xgetContFax();
        
        /**
         * Sets the "contFax" element
         */
        void setContFax(java.lang.String contFax);
        
        /**
         * Sets (as xml) the "contFax" element
         */
        void xsetContFax(org.apache.xmlbeans.XmlString contFax);
        
        /**
         * Gets the "contTelex" element
         */
        java.lang.String getContTelex();
        
        /**
         * Gets (as xml) the "contTelex" element
         */
        org.apache.xmlbeans.XmlString xgetContTelex();
        
        /**
         * Sets the "contTelex" element
         */
        void setContTelex(java.lang.String contTelex);
        
        /**
         * Sets (as xml) the "contTelex" element
         */
        void xsetContTelex(org.apache.xmlbeans.XmlString contTelex);
        
        /**
         * Gets the "startDate" element
         */
        java.lang.String getStartDate();
        
        /**
         * Gets (as xml) the "startDate" element
         */
        org.apache.xmlbeans.XmlString xgetStartDate();
        
        /**
         * Sets the "startDate" element
         */
        void setStartDate(java.lang.String startDate);
        
        /**
         * Sets (as xml) the "startDate" element
         */
        void xsetStartDate(org.apache.xmlbeans.XmlString startDate);
        
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
            public static com.scb.sci.customer.fm.FmAddressDocument.FmAddress newInstance() {
              return (com.scb.sci.customer.fm.FmAddressDocument.FmAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.FmAddressDocument.FmAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.FmAddressDocument.FmAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.FmAddressDocument newInstance() {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.FmAddressDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.FmAddressDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAddressDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.FmAddressDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAddressDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.FmAddressDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAddressDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.FmAddressDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAddressDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.FmAddressDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAddressDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.FmAddressDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAddressDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.FmAddressDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.FmAddressDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmAddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmAddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
