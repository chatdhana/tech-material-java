/*
 * An XML document type.
 * Localname: leAddress
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeAddressDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le;


/**
 * A document containing one leAddress(@) element.
 *
 * This is a complex type.
 */
public interface LeAddressDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LeAddressDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s18A232EABD86FE9FE68F626177D8784B").resolveHandle("leaddress2be2doctype");
    
    /**
     * Gets the "leAddress" element
     */
    atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress getLeAddress();
    
    /**
     * Sets the "leAddress" element
     */
    void setLeAddress(atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress leAddress);
    
    /**
     * Appends and returns a new empty "leAddress" element
     */
    atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress addNewLeAddress();
    
    /**
     * An XML leAddress(@).
     *
     * This is a complex type.
     */
    public interface LeAddress extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LeAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s18A232EABD86FE9FE68F626177D8784B").resolveHandle("leaddressdc19elemtype");
        
        /**
         * Gets the "leAddrId" element
         */
        java.lang.String getLeAddrId();
        
        /**
         * Gets (as xml) the "leAddrId" element
         */
        org.apache.xmlbeans.XmlString xgetLeAddrId();
        
        /**
         * Sets the "leAddrId" element
         */
        void setLeAddrId(java.lang.String leAddrId);
        
        /**
         * Sets (as xml) the "leAddrId" element
         */
        void xsetLeAddrId(org.apache.xmlbeans.XmlString leAddrId);
        
        /**
         * Gets the "addrType" element
         */
        java.lang.String getAddrType();
        
        /**
         * Gets (as xml) the "addrType" element
         */
        org.apache.xmlbeans.XmlString xgetAddrType();
        
        /**
         * Sets the "addrType" element
         */
        void setAddrType(java.lang.String addrType);
        
        /**
         * Sets (as xml) the "addrType" element
         */
        void xsetAddrType(org.apache.xmlbeans.XmlString addrType);
        
        /**
         * Gets the "addrTypeDesc" element
         */
        java.lang.String getAddrTypeDesc();
        
        /**
         * Gets (as xml) the "addrTypeDesc" element
         */
        org.apache.xmlbeans.XmlString xgetAddrTypeDesc();
        
        /**
         * Sets the "addrTypeDesc" element
         */
        void setAddrTypeDesc(java.lang.String addrTypeDesc);
        
        /**
         * Sets (as xml) the "addrTypeDesc" element
         */
        void xsetAddrTypeDesc(org.apache.xmlbeans.XmlString addrTypeDesc);
        
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
         * Gets the "countryIsoCode" element
         */
        java.lang.String getCountryIsoCode();
        
        /**
         * Gets (as xml) the "countryIsoCode" element
         */
        org.apache.xmlbeans.XmlString xgetCountryIsoCode();
        
        /**
         * Sets the "countryIsoCode" element
         */
        void setCountryIsoCode(java.lang.String countryIsoCode);
        
        /**
         * Sets (as xml) the "countryIsoCode" element
         */
        void xsetCountryIsoCode(org.apache.xmlbeans.XmlString countryIsoCode);
        
        /**
         * Gets the "countryName" element
         */
        java.lang.String getCountryName();
        
        /**
         * Gets (as xml) the "countryName" element
         */
        org.apache.xmlbeans.XmlString xgetCountryName();
        
        /**
         * Sets the "countryName" element
         */
        void setCountryName(java.lang.String countryName);
        
        /**
         * Sets (as xml) the "countryName" element
         */
        void xsetCountryName(org.apache.xmlbeans.XmlString countryName);
        
        /**
         * Gets the "cityCode" element
         */
        java.lang.String getCityCode();
        
        /**
         * Gets (as xml) the "cityCode" element
         */
        org.apache.xmlbeans.XmlString xgetCityCode();
        
        /**
         * Sets the "cityCode" element
         */
        void setCityCode(java.lang.String cityCode);
        
        /**
         * Sets (as xml) the "cityCode" element
         */
        void xsetCityCode(org.apache.xmlbeans.XmlString cityCode);
        
        /**
         * Gets the "cityName" element
         */
        java.lang.String getCityName();
        
        /**
         * Gets (as xml) the "cityName" element
         */
        org.apache.xmlbeans.XmlString xgetCityName();
        
        /**
         * Sets the "cityName" element
         */
        void setCityName(java.lang.String cityName);
        
        /**
         * Sets (as xml) the "cityName" element
         */
        void xsetCityName(org.apache.xmlbeans.XmlString cityName);
        
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
         * Gets the "title" element
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" element
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" element
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
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
            public static atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress newInstance() {
              return (atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument newInstance() {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.LeAddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.LeAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
