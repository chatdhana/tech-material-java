/*
 * An XML document type.
 * Localname: instructionBookingLocation
 * Namespace: 
 * Java type: com.stanchart.customer.InstructionBookingLocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.stanchart.customer;


/**
 * A document containing one instructionBookingLocation(@) element.
 *
 * This is a complex type.
 */
public interface InstructionBookingLocationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InstructionBookingLocationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("instructionbookinglocationf3f9doctype");
    
    /**
     * Gets the "instructionBookingLocation" element
     */
    com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation getInstructionBookingLocation();
    
    /**
     * Sets the "instructionBookingLocation" element
     */
    void setInstructionBookingLocation(com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation instructionBookingLocation);
    
    /**
     * Appends and returns a new empty "instructionBookingLocation" element
     */
    com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation addNewInstructionBookingLocation();
    
    /**
     * An XML instructionBookingLocation(@).
     *
     * This is a complex type.
     */
    public interface InstructionBookingLocation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InstructionBookingLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("instructionbookinglocation162delemtype");
        
        /**
         * Gets the "bookingLocationId" element
         */
        java.lang.String getBookingLocationId();
        
        /**
         * Gets (as xml) the "bookingLocationId" element
         */
        org.apache.xmlbeans.XmlString xgetBookingLocationId();
        
        /**
         * True if has "bookingLocationId" element
         */
        boolean isSetBookingLocationId();
        
        /**
         * Sets the "bookingLocationId" element
         */
        void setBookingLocationId(java.lang.String bookingLocationId);
        
        /**
         * Sets (as xml) the "bookingLocationId" element
         */
        void xsetBookingLocationId(org.apache.xmlbeans.XmlString bookingLocationId);
        
        /**
         * Unsets the "bookingLocationId" element
         */
        void unsetBookingLocationId();
        
        /**
         * Gets the "bookingLocationCountry" element
         */
        java.lang.String getBookingLocationCountry();
        
        /**
         * Gets (as xml) the "bookingLocationCountry" element
         */
        org.apache.xmlbeans.XmlString xgetBookingLocationCountry();
        
        /**
         * True if has "bookingLocationCountry" element
         */
        boolean isSetBookingLocationCountry();
        
        /**
         * Sets the "bookingLocationCountry" element
         */
        void setBookingLocationCountry(java.lang.String bookingLocationCountry);
        
        /**
         * Sets (as xml) the "bookingLocationCountry" element
         */
        void xsetBookingLocationCountry(org.apache.xmlbeans.XmlString bookingLocationCountry);
        
        /**
         * Unsets the "bookingLocationCountry" element
         */
        void unsetBookingLocationCountry();
        
        /**
         * Gets the "bookingLocationOrganization" element
         */
        java.lang.String getBookingLocationOrganization();
        
        /**
         * Gets (as xml) the "bookingLocationOrganization" element
         */
        org.apache.xmlbeans.XmlString xgetBookingLocationOrganization();
        
        /**
         * True if has "bookingLocationOrganization" element
         */
        boolean isSetBookingLocationOrganization();
        
        /**
         * Sets the "bookingLocationOrganization" element
         */
        void setBookingLocationOrganization(java.lang.String bookingLocationOrganization);
        
        /**
         * Sets (as xml) the "bookingLocationOrganization" element
         */
        void xsetBookingLocationOrganization(org.apache.xmlbeans.XmlString bookingLocationOrganization);
        
        /**
         * Unsets the "bookingLocationOrganization" element
         */
        void unsetBookingLocationOrganization();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation newInstance() {
              return (com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.stanchart.customer.InstructionBookingLocationDocument newInstance() {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.stanchart.customer.InstructionBookingLocationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.stanchart.customer.InstructionBookingLocationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.stanchart.customer.InstructionBookingLocationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
