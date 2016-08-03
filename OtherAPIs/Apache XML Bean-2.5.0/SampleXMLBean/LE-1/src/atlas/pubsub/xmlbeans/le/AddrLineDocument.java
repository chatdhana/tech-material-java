/*
 * An XML document type.
 * Localname: addrLine
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.AddrLineDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le;


/**
 * A document containing one addrLine(@) element.
 *
 * This is a complex type.
 */
public interface AddrLineDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddrLineDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s18A232EABD86FE9FE68F626177D8784B").resolveHandle("addrlinedefedoctype");
    
    /**
     * Gets the "addrLine" element
     */
    java.lang.String getAddrLine();
    
    /**
     * Gets (as xml) the "addrLine" element
     */
    org.apache.xmlbeans.XmlString xgetAddrLine();
    
    /**
     * Sets the "addrLine" element
     */
    void setAddrLine(java.lang.String addrLine);
    
    /**
     * Sets (as xml) the "addrLine" element
     */
    void xsetAddrLine(org.apache.xmlbeans.XmlString addrLine);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument newInstance() {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.AddrLineDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.AddrLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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