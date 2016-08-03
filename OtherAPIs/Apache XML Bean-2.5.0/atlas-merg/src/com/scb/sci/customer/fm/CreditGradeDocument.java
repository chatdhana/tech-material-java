/*
 * An XML document type.
 * Localname: creditGrade
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.CreditGradeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one creditGrade(@) element.
 *
 * This is a complex type.
 */
public interface CreditGradeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreditGradeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("creditgrade3a45doctype");
    
    /**
     * Gets the "creditGrade" element
     */
    com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade getCreditGrade();
    
    /**
     * Sets the "creditGrade" element
     */
    void setCreditGrade(com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade creditGrade);
    
    /**
     * Appends and returns a new empty "creditGrade" element
     */
    com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade addNewCreditGrade();
    
    /**
     * An XML creditGrade(@).
     *
     * This is a complex type.
     */
    public interface CreditGrade extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreditGrade.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("creditgrade5d9felemtype");
        
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
         * Gets the "creditGradeId" element
         */
        java.lang.String getCreditGradeId();
        
        /**
         * Gets (as xml) the "creditGradeId" element
         */
        org.apache.xmlbeans.XmlString xgetCreditGradeId();
        
        /**
         * Sets the "creditGradeId" element
         */
        void setCreditGradeId(java.lang.String creditGradeId);
        
        /**
         * Sets (as xml) the "creditGradeId" element
         */
        void xsetCreditGradeId(org.apache.xmlbeans.XmlString creditGradeId);
        
        /**
         * Gets the "creditGradeType" element
         */
        com.scb.sci.customer.fm.CreditGradeTypeDocument.CreditGradeType getCreditGradeType();
        
        /**
         * Sets the "creditGradeType" element
         */
        void setCreditGradeType(com.scb.sci.customer.fm.CreditGradeTypeDocument.CreditGradeType creditGradeType);
        
        /**
         * Appends and returns a new empty "creditGradeType" element
         */
        com.scb.sci.customer.fm.CreditGradeTypeDocument.CreditGradeType addNewCreditGradeType();
        
        /**
         * Gets the "creditGradeCode" element
         */
        com.scb.sci.customer.fm.CreditGradeCodeDocument.CreditGradeCode getCreditGradeCode();
        
        /**
         * Sets the "creditGradeCode" element
         */
        void setCreditGradeCode(com.scb.sci.customer.fm.CreditGradeCodeDocument.CreditGradeCode creditGradeCode);
        
        /**
         * Appends and returns a new empty "creditGradeCode" element
         */
        com.scb.sci.customer.fm.CreditGradeCodeDocument.CreditGradeCode addNewCreditGradeCode();
        
        /**
         * Gets the "creditGradeEffectiveDate" element
         */
        java.lang.String getCreditGradeEffectiveDate();
        
        /**
         * Gets (as xml) the "creditGradeEffectiveDate" element
         */
        org.apache.xmlbeans.XmlString xgetCreditGradeEffectiveDate();
        
        /**
         * Sets the "creditGradeEffectiveDate" element
         */
        void setCreditGradeEffectiveDate(java.lang.String creditGradeEffectiveDate);
        
        /**
         * Sets (as xml) the "creditGradeEffectiveDate" element
         */
        void xsetCreditGradeEffectiveDate(org.apache.xmlbeans.XmlString creditGradeEffectiveDate);
        
        /**
         * Gets the "creditGradeReasonForChange" element
         */
        java.lang.String getCreditGradeReasonForChange();
        
        /**
         * Gets (as xml) the "creditGradeReasonForChange" element
         */
        org.apache.xmlbeans.XmlString xgetCreditGradeReasonForChange();
        
        /**
         * Sets the "creditGradeReasonForChange" element
         */
        void setCreditGradeReasonForChange(java.lang.String creditGradeReasonForChange);
        
        /**
         * Sets (as xml) the "creditGradeReasonForChange" element
         */
        void xsetCreditGradeReasonForChange(org.apache.xmlbeans.XmlString creditGradeReasonForChange);
        
        /**
         * Gets the "approverLocation" element
         */
        com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation getApproverLocation();
        
        /**
         * Sets the "approverLocation" element
         */
        void setApproverLocation(com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation approverLocation);
        
        /**
         * Appends and returns a new empty "approverLocation" element
         */
        com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation addNewApproverLocation();
        
        /**
         * Gets the "coinNo" element
         */
        java.lang.String getCoinNo();
        
        /**
         * Gets (as xml) the "coinNo" element
         */
        org.apache.xmlbeans.XmlString xgetCoinNo();
        
        /**
         * Sets the "coinNo" element
         */
        void setCoinNo(java.lang.String coinNo);
        
        /**
         * Sets (as xml) the "coinNo" element
         */
        void xsetCoinNo(org.apache.xmlbeans.XmlString coinNo);
        
        /**
         * Gets the "approverEmpId" element
         */
        java.lang.String getApproverEmpId();
        
        /**
         * Gets (as xml) the "approverEmpId" element
         */
        org.apache.xmlbeans.XmlString xgetApproverEmpId();
        
        /**
         * Sets the "approverEmpId" element
         */
        void setApproverEmpId(java.lang.String approverEmpId);
        
        /**
         * Sets (as xml) the "approverEmpId" element
         */
        void xsetApproverEmpId(org.apache.xmlbeans.XmlString approverEmpId);
        
        /**
         * Gets the "approverName" element
         */
        java.lang.String getApproverName();
        
        /**
         * Gets (as xml) the "approverName" element
         */
        org.apache.xmlbeans.XmlString xgetApproverName();
        
        /**
         * Sets the "approverName" element
         */
        void setApproverName(java.lang.String approverName);
        
        /**
         * Sets (as xml) the "approverName" element
         */
        void xsetApproverName(org.apache.xmlbeans.XmlString approverName);
        
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
            public static com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade newInstance() {
              return (com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.CreditGradeDocument newInstance() {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.CreditGradeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.CreditGradeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.CreditGradeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
