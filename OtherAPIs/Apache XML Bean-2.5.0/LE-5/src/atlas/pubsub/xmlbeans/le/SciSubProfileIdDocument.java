/*
 * An XML document type.
 * Localname: sciSubProfileId
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le;


/**
 * A document containing one sciSubProfileId(@) element.
 *
 * This is a complex type.
 */
public interface SciSubProfileIdDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SciSubProfileIdDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("scisubprofileidbf64doctype");
    
    /**
     * Gets the "sciSubProfileId" element
     */
    java.lang.String getSciSubProfileId();
    
    /**
     * Gets (as xml) the "sciSubProfileId" element
     */
    org.apache.xmlbeans.XmlString xgetSciSubProfileId();
    
    /**
     * Sets the "sciSubProfileId" element
     */
    void setSciSubProfileId(java.lang.String sciSubProfileId);
    
    /**
     * Sets (as xml) the "sciSubProfileId" element
     */
    void xsetSciSubProfileId(org.apache.xmlbeans.XmlString sciSubProfileId);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument newInstance() {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
