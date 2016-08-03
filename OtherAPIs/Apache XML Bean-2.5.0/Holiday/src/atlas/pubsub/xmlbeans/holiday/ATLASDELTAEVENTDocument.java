/*
 * An XML document type.
 * Localname: ATLAS-DELTA-EVENT
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.holiday;


/**
 * A document containing one ATLAS-DELTA-EVENT(@) element.
 *
 * This is a complex type.
 */
public interface ATLASDELTAEVENTDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ATLASDELTAEVENTDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FE0D14CF07E5009882EDA629AE38D99").resolveHandle("atlasdeltaevent2e4adoctype");
    
    /**
     * Gets the "ATLAS-DELTA-EVENT" element
     */
    atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT getATLASDELTAEVENT();
    
    /**
     * Sets the "ATLAS-DELTA-EVENT" element
     */
    void setATLASDELTAEVENT(atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT atlasdeltaevent);
    
    /**
     * Appends and returns a new empty "ATLAS-DELTA-EVENT" element
     */
    atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT addNewATLASDELTAEVENT();
    
    /**
     * An XML ATLAS-DELTA-EVENT(@).
     *
     * This is a complex type.
     */
    public interface ATLASDELTAEVENT extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ATLASDELTAEVENT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FE0D14CF07E5009882EDA629AE38D99").resolveHandle("atlasdeltaevent94e9elemtype");
        
        /**
         * Gets the "CURRENCY-HOLIDAY" element
         */
        atlas.pubsub.xmlbeans.holiday.CURRENCYHOLIDAYDocument.CURRENCYHOLIDAY getCURRENCYHOLIDAY();
        
        /**
         * Sets the "CURRENCY-HOLIDAY" element
         */
        void setCURRENCYHOLIDAY(atlas.pubsub.xmlbeans.holiday.CURRENCYHOLIDAYDocument.CURRENCYHOLIDAY currencyholiday);
        
        /**
         * Appends and returns a new empty "CURRENCY-HOLIDAY" element
         */
        atlas.pubsub.xmlbeans.holiday.CURRENCYHOLIDAYDocument.CURRENCYHOLIDAY addNewCURRENCYHOLIDAY();
        
        /**
         * Gets the "publishedDateTime" attribute
         */
        java.lang.String getPublishedDateTime();
        
        /**
         * Gets (as xml) the "publishedDateTime" attribute
         */
        org.apache.xmlbeans.XmlString xgetPublishedDateTime();
        
        /**
         * True if has "publishedDateTime" attribute
         */
        boolean isSetPublishedDateTime();
        
        /**
         * Sets the "publishedDateTime" attribute
         */
        void setPublishedDateTime(java.lang.String publishedDateTime);
        
        /**
         * Sets (as xml) the "publishedDateTime" attribute
         */
        void xsetPublishedDateTime(org.apache.xmlbeans.XmlString publishedDateTime);
        
        /**
         * Unsets the "publishedDateTime" attribute
         */
        void unsetPublishedDateTime();
        
        /**
         * Gets the "atlasMessageID" attribute
         */
        java.lang.String getAtlasMessageID();
        
        /**
         * Gets (as xml) the "atlasMessageID" attribute
         */
        org.apache.xmlbeans.XmlString xgetAtlasMessageID();
        
        /**
         * True if has "atlasMessageID" attribute
         */
        boolean isSetAtlasMessageID();
        
        /**
         * Sets the "atlasMessageID" attribute
         */
        void setAtlasMessageID(java.lang.String atlasMessageID);
        
        /**
         * Sets (as xml) the "atlasMessageID" attribute
         */
        void xsetAtlasMessageID(org.apache.xmlbeans.XmlString atlasMessageID);
        
        /**
         * Unsets the "atlasMessageID" attribute
         */
        void unsetAtlasMessageID();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT newInstance() {
              return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument newInstance() {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
