/*
 * An XML document type.
 * Localname: knowYourCustomer
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.KnowYourCustomerDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one knowYourCustomer(@) element.
 *
 * This is a complex type.
 */
public interface KnowYourCustomerDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KnowYourCustomerDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("knowyourcustomerd1d5doctype");
    
    /**
     * Gets the "knowYourCustomer" element
     */
    com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer getKnowYourCustomer();
    
    /**
     * Sets the "knowYourCustomer" element
     */
    void setKnowYourCustomer(com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer knowYourCustomer);
    
    /**
     * Appends and returns a new empty "knowYourCustomer" element
     */
    com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer addNewKnowYourCustomer();
    
    /**
     * An XML knowYourCustomer(@).
     *
     * This is a complex type.
     */
    public interface KnowYourCustomer extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KnowYourCustomer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("knowyourcustomer22edelemtype");
        
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
         * Gets the "KYCid" element
         */
        java.lang.String getKYCid();
        
        /**
         * Gets (as xml) the "KYCid" element
         */
        org.apache.xmlbeans.XmlString xgetKYCid();
        
        /**
         * Sets the "KYCid" element
         */
        void setKYCid(java.lang.String kyCid);
        
        /**
         * Sets (as xml) the "KYCid" element
         */
        void xsetKYCid(org.apache.xmlbeans.XmlString kyCid);
        
        /**
         * Gets the "documentOriginatingLocation" element
         */
        com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation getDocumentOriginatingLocation();
        
        /**
         * Sets the "documentOriginatingLocation" element
         */
        void setDocumentOriginatingLocation(com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation documentOriginatingLocation);
        
        /**
         * Appends and returns a new empty "documentOriginatingLocation" element
         */
        com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation addNewDocumentOriginatingLocation();
        
        /**
         * Gets the "mlRiskRating" element
         */
        com.scb.sci.customer.fm.MlRiskRatingDocument.MlRiskRating getMlRiskRating();
        
        /**
         * Sets the "mlRiskRating" element
         */
        void setMlRiskRating(com.scb.sci.customer.fm.MlRiskRatingDocument.MlRiskRating mlRiskRating);
        
        /**
         * Appends and returns a new empty "mlRiskRating" element
         */
        com.scb.sci.customer.fm.MlRiskRatingDocument.MlRiskRating addNewMlRiskRating();
        
        /**
         * Gets the "mlLastReviewDate" element
         */
        java.lang.String getMlLastReviewDate();
        
        /**
         * Gets (as xml) the "mlLastReviewDate" element
         */
        org.apache.xmlbeans.XmlString xgetMlLastReviewDate();
        
        /**
         * Sets the "mlLastReviewDate" element
         */
        void setMlLastReviewDate(java.lang.String mlLastReviewDate);
        
        /**
         * Sets (as xml) the "mlLastReviewDate" element
         */
        void xsetMlLastReviewDate(org.apache.xmlbeans.XmlString mlLastReviewDate);
        
        /**
         * Gets the "mlNextReviewDate" element
         */
        java.lang.String getMlNextReviewDate();
        
        /**
         * Gets (as xml) the "mlNextReviewDate" element
         */
        org.apache.xmlbeans.XmlString xgetMlNextReviewDate();
        
        /**
         * Sets the "mlNextReviewDate" element
         */
        void setMlNextReviewDate(java.lang.String mlNextReviewDate);
        
        /**
         * Sets (as xml) the "mlNextReviewDate" element
         */
        void xsetMlNextReviewDate(org.apache.xmlbeans.XmlString mlNextReviewDate);
        
        /**
         * Gets the "firstKYCreview" element
         */
        java.lang.String getFirstKYCreview();
        
        /**
         * Gets (as xml) the "firstKYCreview" element
         */
        org.apache.xmlbeans.XmlString xgetFirstKYCreview();
        
        /**
         * Sets the "firstKYCreview" element
         */
        void setFirstKYCreview(java.lang.String firstKYCreview);
        
        /**
         * Sets (as xml) the "firstKYCreview" element
         */
        void xsetFirstKYCreview(org.apache.xmlbeans.XmlString firstKYCreview);
        
        /**
         * Gets the "KYCdocumentSubmitted" element
         */
        java.lang.String getKYCdocumentSubmitted();
        
        /**
         * Gets (as xml) the "KYCdocumentSubmitted" element
         */
        org.apache.xmlbeans.XmlString xgetKYCdocumentSubmitted();
        
        /**
         * Sets the "KYCdocumentSubmitted" element
         */
        void setKYCdocumentSubmitted(java.lang.String kyCdocumentSubmitted);
        
        /**
         * Sets (as xml) the "KYCdocumentSubmitted" element
         */
        void xsetKYCdocumentSubmitted(org.apache.xmlbeans.XmlString kyCdocumentSubmitted);
        
        /**
         * Gets the "GICdocumentSubmitted" element
         */
        java.lang.String getGICdocumentSubmitted();
        
        /**
         * Gets (as xml) the "GICdocumentSubmitted" element
         */
        org.apache.xmlbeans.XmlString xgetGICdocumentSubmitted();
        
        /**
         * Sets the "GICdocumentSubmitted" element
         */
        void setGICdocumentSubmitted(java.lang.String giCdocumentSubmitted);
        
        /**
         * Sets (as xml) the "GICdocumentSubmitted" element
         */
        void xsetGICdocumentSubmitted(org.apache.xmlbeans.XmlString giCdocumentSubmitted);
        
        /**
         * Gets the "exceptionalApprovalObtained" element
         */
        java.lang.String getExceptionalApprovalObtained();
        
        /**
         * Gets (as xml) the "exceptionalApprovalObtained" element
         */
        org.apache.xmlbeans.XmlString xgetExceptionalApprovalObtained();
        
        /**
         * Sets the "exceptionalApprovalObtained" element
         */
        void setExceptionalApprovalObtained(java.lang.String exceptionalApprovalObtained);
        
        /**
         * Sets (as xml) the "exceptionalApprovalObtained" element
         */
        void xsetExceptionalApprovalObtained(org.apache.xmlbeans.XmlString exceptionalApprovalObtained);
        
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
            public static com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer newInstance() {
              return (com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument newInstance() {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.KnowYourCustomerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.KnowYourCustomerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
