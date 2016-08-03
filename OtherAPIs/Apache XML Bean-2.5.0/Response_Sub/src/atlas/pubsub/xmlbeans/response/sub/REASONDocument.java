/*
 * An XML document type.
 * Localname: REASON
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.response.sub.REASONDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.response.sub;


/**
 * A document containing one REASON(@) element.
 *
 * This is a complex type.
 */
public interface REASONDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(REASONDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s40D6B91DBFF1621A4AB066D9A9738340").resolveHandle("reason8ffddoctype");
    
    /**
     * Gets the "REASON" element
     */
    java.lang.String getREASON();
    
    /**
     * Gets (as xml) the "REASON" element
     */
    org.apache.xmlbeans.XmlString xgetREASON();
    
    /**
     * Sets the "REASON" element
     */
    void setREASON(java.lang.String reason);
    
    /**
     * Sets (as xml) the "REASON" element
     */
    void xsetREASON(org.apache.xmlbeans.XmlString reason);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument newInstance() {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.response.sub.REASONDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.response.sub.REASONDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
