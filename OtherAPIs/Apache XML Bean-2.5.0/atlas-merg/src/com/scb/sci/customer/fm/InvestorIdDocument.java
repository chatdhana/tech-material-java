/*
 * An XML document type.
 * Localname: investorId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.InvestorIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one investorId(@) element.
 *
 * This is a complex type.
 */
public interface InvestorIdDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InvestorIdDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("investoridcd0cdoctype");
    
    /**
     * Gets the "investorId" element
     */
    com.scb.sci.customer.fm.InvestorIdDocument.InvestorId getInvestorId();
    
    /**
     * Sets the "investorId" element
     */
    void setInvestorId(com.scb.sci.customer.fm.InvestorIdDocument.InvestorId investorId);
    
    /**
     * Appends and returns a new empty "investorId" element
     */
    com.scb.sci.customer.fm.InvestorIdDocument.InvestorId addNewInvestorId();
    
    /**
     * An XML investorId(@).
     *
     * This is a complex type.
     */
    public interface InvestorId extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InvestorId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("investoridd70delemtype");
        
        /**
         * Gets a List of "market" elements
         */
        java.util.List<com.scb.sci.customer.fm.MarketDocument.Market> getMarketList();
        
        /**
         * Gets array of all "market" elements
         * @deprecated
         */
        @Deprecated
        com.scb.sci.customer.fm.MarketDocument.Market[] getMarketArray();
        
        /**
         * Gets ith "market" element
         */
        com.scb.sci.customer.fm.MarketDocument.Market getMarketArray(int i);
        
        /**
         * Returns number of "market" element
         */
        int sizeOfMarketArray();
        
        /**
         * Sets array of all "market" element
         */
        void setMarketArray(com.scb.sci.customer.fm.MarketDocument.Market[] marketArray);
        
        /**
         * Sets ith "market" element
         */
        void setMarketArray(int i, com.scb.sci.customer.fm.MarketDocument.Market market);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "market" element
         */
        com.scb.sci.customer.fm.MarketDocument.Market insertNewMarket(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "market" element
         */
        com.scb.sci.customer.fm.MarketDocument.Market addNewMarket();
        
        /**
         * Removes the ith "market" element
         */
        void removeMarket(int i);
        
        /**
         * Gets the "code" element
         */
        java.lang.String getCode();
        
        /**
         * Gets (as xml) the "code" element
         */
        org.apache.xmlbeans.XmlString xgetCode();
        
        /**
         * Sets the "code" element
         */
        void setCode(java.lang.String code);
        
        /**
         * Sets (as xml) the "code" element
         */
        void xsetCode(org.apache.xmlbeans.XmlString code);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.scb.sci.customer.fm.InvestorIdDocument.InvestorId newInstance() {
              return (com.scb.sci.customer.fm.InvestorIdDocument.InvestorId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.InvestorIdDocument.InvestorId newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.InvestorIdDocument.InvestorId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.InvestorIdDocument newInstance() {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.InvestorIdDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.InvestorIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.InvestorIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
