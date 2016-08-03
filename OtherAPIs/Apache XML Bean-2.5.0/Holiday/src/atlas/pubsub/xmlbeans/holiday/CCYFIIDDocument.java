/*
 * An XML document type.
 * Localname: CCY-FI-ID
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.holiday;


/**
 * A document containing one CCY-FI-ID(@) element.
 *
 * This is a complex type.
 */
public interface CCYFIIDDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CCYFIIDDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FE0D14CF07E5009882EDA629AE38D99").resolveHandle("ccyfiid3738doctype");
    
    /**
     * Gets the "CCY-FI-ID" element
     */
    java.lang.String getCCYFIID();
    
    /**
     * Gets (as xml) the "CCY-FI-ID" element
     */
    org.apache.xmlbeans.XmlString xgetCCYFIID();
    
    /**
     * Sets the "CCY-FI-ID" element
     */
    void setCCYFIID(java.lang.String ccyfiid);
    
    /**
     * Sets (as xml) the "CCY-FI-ID" element
     */
    void xsetCCYFIID(org.apache.xmlbeans.XmlString ccyfiid);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument newInstance() {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
