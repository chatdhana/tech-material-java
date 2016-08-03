/*
 * An XML document type.
 * Localname: counterpartyXref
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le;


/**
 * A document containing one counterpartyXref(@) element.
 *
 * This is a complex type.
 */
public interface CounterpartyXrefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CounterpartyXrefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("counterpartyxref8d1edoctype");
    
    /**
     * Gets the "counterpartyXref" element
     */
    atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref getCounterpartyXref();
    
    /**
     * Sets the "counterpartyXref" element
     */
    void setCounterpartyXref(atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref counterpartyXref);
    
    /**
     * Appends and returns a new empty "counterpartyXref" element
     */
    atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref addNewCounterpartyXref();
    
    /**
     * An XML counterpartyXref(@).
     *
     * This is a complex type.
     */
    public interface CounterpartyXref extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CounterpartyXref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("counterpartyxref644delemtype");
        
        /**
         * Gets the "partyXrefCode" element
         */
        java.lang.String getPartyXrefCode();
        
        /**
         * Gets (as xml) the "partyXrefCode" element
         */
        org.apache.xmlbeans.XmlString xgetPartyXrefCode();
        
        /**
         * Sets the "partyXrefCode" element
         */
        void setPartyXrefCode(java.lang.String partyXrefCode);
        
        /**
         * Sets (as xml) the "partyXrefCode" element
         */
        void xsetPartyXrefCode(org.apache.xmlbeans.XmlString partyXrefCode);
        
        /**
         * Gets the "locationCode" element
         */
        java.lang.String getLocationCode();
        
        /**
         * Gets (as xml) the "locationCode" element
         */
        org.apache.xmlbeans.XmlString xgetLocationCode();
        
        /**
         * Sets the "locationCode" element
         */
        void setLocationCode(java.lang.String locationCode);
        
        /**
         * Sets (as xml) the "locationCode" element
         */
        void xsetLocationCode(org.apache.xmlbeans.XmlString locationCode);
        
        /**
         * Gets the "extrnlSystmCode" element
         */
        java.lang.String getExtrnlSystmCode();
        
        /**
         * Gets (as xml) the "extrnlSystmCode" element
         */
        org.apache.xmlbeans.XmlString xgetExtrnlSystmCode();
        
        /**
         * Sets the "extrnlSystmCode" element
         */
        void setExtrnlSystmCode(java.lang.String extrnlSystmCode);
        
        /**
         * Sets (as xml) the "extrnlSystmCode" element
         */
        void xsetExtrnlSystmCode(org.apache.xmlbeans.XmlString extrnlSystmCode);
        
        /**
         * Gets the "immsMnemonic" element
         */
        java.lang.String getImmsMnemonic();
        
        /**
         * Gets (as xml) the "immsMnemonic" element
         */
        org.apache.xmlbeans.XmlString xgetImmsMnemonic();
        
        /**
         * Sets the "immsMnemonic" element
         */
        void setImmsMnemonic(java.lang.String immsMnemonic);
        
        /**
         * Sets (as xml) the "immsMnemonic" element
         */
        void xsetImmsMnemonic(org.apache.xmlbeans.XmlString immsMnemonic);
        
        /**
         * Gets the "upcount" element
         */
        java.lang.String getUpcount();
        
        /**
         * Gets (as xml) the "upcount" element
         */
        org.apache.xmlbeans.XmlString xgetUpcount();
        
        /**
         * Sets the "upcount" element
         */
        void setUpcount(java.lang.String upcount);
        
        /**
         * Sets (as xml) the "upcount" element
         */
        void xsetUpcount(org.apache.xmlbeans.XmlString upcount);
        
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
            public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref newInstance() {
              return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument newInstance() {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
