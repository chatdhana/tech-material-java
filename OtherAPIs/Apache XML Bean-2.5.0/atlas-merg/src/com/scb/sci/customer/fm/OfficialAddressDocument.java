/*
 * An XML document type.
 * Localname: officialAddress
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.OfficialAddressDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one officialAddress(@) element.
 *
 * This is a complex type.
 */
public interface OfficialAddressDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfficialAddressDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("officialaddress60f0doctype");
    
    /**
     * Gets the "officialAddress" element
     */
    com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress getOfficialAddress();
    
    /**
     * Sets the "officialAddress" element
     */
    void setOfficialAddress(com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress officialAddress);
    
    /**
     * Appends and returns a new empty "officialAddress" element
     */
    com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress addNewOfficialAddress();
    
    /**
     * An XML officialAddress(@).
     *
     * This is a complex type.
     */
    public interface OfficialAddress extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfficialAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("officialaddressa8b5elemtype");
        
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
         * Gets the "addressId" element
         */
        java.lang.String getAddressId();
        
        /**
         * Gets (as xml) the "addressId" element
         */
        org.apache.xmlbeans.XmlString xgetAddressId();
        
        /**
         * Sets the "addressId" element
         */
        void setAddressId(java.lang.String addressId);
        
        /**
         * Sets (as xml) the "addressId" element
         */
        void xsetAddressId(org.apache.xmlbeans.XmlString addressId);
        
        /**
         * Gets the "addressType" element
         */
        com.scb.sci.customer.fm.AddressTypeDocument.AddressType getAddressType();
        
        /**
         * Sets the "addressType" element
         */
        void setAddressType(com.scb.sci.customer.fm.AddressTypeDocument.AddressType addressType);
        
        /**
         * Appends and returns a new empty "addressType" element
         */
        com.scb.sci.customer.fm.AddressTypeDocument.AddressType addNewAddressType();
        
        /**
         * Gets the "attnParty" element
         */
        java.lang.String getAttnParty();
        
        /**
         * Gets (as xml) the "attnParty" element
         */
        org.apache.xmlbeans.XmlString xgetAttnParty();
        
        /**
         * Sets the "attnParty" element
         */
        void setAttnParty(java.lang.String attnParty);
        
        /**
         * Sets (as xml) the "attnParty" element
         */
        void xsetAttnParty(org.apache.xmlbeans.XmlString attnParty);
        
        /**
         * Gets the "line1" element
         */
        java.lang.String getLine1();
        
        /**
         * Gets (as xml) the "line1" element
         */
        org.apache.xmlbeans.XmlString xgetLine1();
        
        /**
         * Sets the "line1" element
         */
        void setLine1(java.lang.String line1);
        
        /**
         * Sets (as xml) the "line1" element
         */
        void xsetLine1(org.apache.xmlbeans.XmlString line1);
        
        /**
         * Gets the "line2" element
         */
        java.lang.String getLine2();
        
        /**
         * Gets (as xml) the "line2" element
         */
        org.apache.xmlbeans.XmlString xgetLine2();
        
        /**
         * Sets the "line2" element
         */
        void setLine2(java.lang.String line2);
        
        /**
         * Sets (as xml) the "line2" element
         */
        void xsetLine2(org.apache.xmlbeans.XmlString line2);
        
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
         * Gets the "fax" element
         */
        java.lang.String getFax();
        
        /**
         * Gets (as xml) the "fax" element
         */
        org.apache.xmlbeans.XmlString xgetFax();
        
        /**
         * Sets the "fax" element
         */
        void setFax(java.lang.String fax);
        
        /**
         * Sets (as xml) the "fax" element
         */
        void xsetFax(org.apache.xmlbeans.XmlString fax);
        
        /**
         * Gets the "email" element
         */
        java.lang.String getEmail();
        
        /**
         * Gets (as xml) the "email" element
         */
        org.apache.xmlbeans.XmlString xgetEmail();
        
        /**
         * Sets the "email" element
         */
        void setEmail(java.lang.String email);
        
        /**
         * Sets (as xml) the "email" element
         */
        void xsetEmail(org.apache.xmlbeans.XmlString email);
        
        /**
         * Gets the "phone" element
         */
        java.lang.String getPhone();
        
        /**
         * Gets (as xml) the "phone" element
         */
        org.apache.xmlbeans.XmlString xgetPhone();
        
        /**
         * Sets the "phone" element
         */
        void setPhone(java.lang.String phone);
        
        /**
         * Sets (as xml) the "phone" element
         */
        void xsetPhone(org.apache.xmlbeans.XmlString phone);
        
        /**
         * Gets the "telex" element
         */
        java.lang.String getTelex();
        
        /**
         * Gets (as xml) the "telex" element
         */
        org.apache.xmlbeans.XmlString xgetTelex();
        
        /**
         * Sets the "telex" element
         */
        void setTelex(java.lang.String telex);
        
        /**
         * Sets (as xml) the "telex" element
         */
        void xsetTelex(org.apache.xmlbeans.XmlString telex);
        
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
            public static com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress newInstance() {
              return (com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.OfficialAddressDocument newInstance() {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.OfficialAddressDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.OfficialAddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.OfficialAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
