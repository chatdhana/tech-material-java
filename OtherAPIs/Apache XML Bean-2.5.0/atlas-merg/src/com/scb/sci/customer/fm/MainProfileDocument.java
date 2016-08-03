/*
 * An XML document type.
 * Localname: mainProfile
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.MainProfileDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one mainProfile(@) element.
 *
 * This is a complex type.
 */
public interface MainProfileDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MainProfileDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("mainprofile0b97doctype");
    
    /**
     * Gets the "mainProfile" element
     */
    com.scb.sci.customer.fm.MainProfileDocument.MainProfile getMainProfile();
    
    /**
     * Sets the "mainProfile" element
     */
    void setMainProfile(com.scb.sci.customer.fm.MainProfileDocument.MainProfile mainProfile);
    
    /**
     * Appends and returns a new empty "mainProfile" element
     */
    com.scb.sci.customer.fm.MainProfileDocument.MainProfile addNewMainProfile();
    
    /**
     * An XML mainProfile(@).
     *
     * This is a complex type.
     */
    public interface MainProfile extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MainProfile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("mainprofile48c3elemtype");
        
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
         * Gets the "shortName" element
         */
        java.lang.String getShortName();
        
        /**
         * Gets (as xml) the "shortName" element
         */
        org.apache.xmlbeans.XmlString xgetShortName();
        
        /**
         * Sets the "shortName" element
         */
        void setShortName(java.lang.String shortName);
        
        /**
         * Sets (as xml) the "shortName" element
         */
        void xsetShortName(org.apache.xmlbeans.XmlString shortName);
        
        /**
         * Gets the "legalName" element
         */
        java.lang.String getLegalName();
        
        /**
         * Gets (as xml) the "legalName" element
         */
        org.apache.xmlbeans.XmlString xgetLegalName();
        
        /**
         * Sets the "legalName" element
         */
        void setLegalName(java.lang.String legalName);
        
        /**
         * Sets (as xml) the "legalName" element
         */
        void xsetLegalName(org.apache.xmlbeans.XmlString legalName);
        
        /**
         * Gets the "legalConstitution" element
         */
        com.scb.sci.customer.fm.LegalConstitutionDocument.LegalConstitution getLegalConstitution();
        
        /**
         * Sets the "legalConstitution" element
         */
        void setLegalConstitution(com.scb.sci.customer.fm.LegalConstitutionDocument.LegalConstitution legalConstitution);
        
        /**
         * Appends and returns a new empty "legalConstitution" element
         */
        com.scb.sci.customer.fm.LegalConstitutionDocument.LegalConstitution addNewLegalConstitution();
        
        /**
         * Gets the "incorporatedCountry" element
         */
        java.lang.String getIncorporatedCountry();
        
        /**
         * Gets (as xml) the "incorporatedCountry" element
         */
        org.apache.xmlbeans.XmlString xgetIncorporatedCountry();
        
        /**
         * Sets the "incorporatedCountry" element
         */
        void setIncorporatedCountry(java.lang.String incorporatedCountry);
        
        /**
         * Sets (as xml) the "incorporatedCountry" element
         */
        void xsetIncorporatedCountry(org.apache.xmlbeans.XmlString incorporatedCountry);
        
        /**
         * Gets the "incorporationNumber" element
         */
        java.lang.String getIncorporationNumber();
        
        /**
         * Gets (as xml) the "incorporationNumber" element
         */
        org.apache.xmlbeans.XmlString xgetIncorporationNumber();
        
        /**
         * Sets the "incorporationNumber" element
         */
        void setIncorporationNumber(java.lang.String incorporationNumber);
        
        /**
         * Sets (as xml) the "incorporationNumber" element
         */
        void xsetIncorporationNumber(org.apache.xmlbeans.XmlString incorporationNumber);
        
        /**
         * Gets the "incorporationDate" element
         */
        java.lang.String getIncorporationDate();
        
        /**
         * Gets (as xml) the "incorporationDate" element
         */
        org.apache.xmlbeans.XmlString xgetIncorporationDate();
        
        /**
         * Sets the "incorporationDate" element
         */
        void setIncorporationDate(java.lang.String incorporationDate);
        
        /**
         * Sets (as xml) the "incorporationDate" element
         */
        void xsetIncorporationDate(org.apache.xmlbeans.XmlString incorporationDate);
        
        /**
         * Gets the "customerType" element
         */
        com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType getCustomerType();
        
        /**
         * Sets the "customerType" element
         */
        void setCustomerType(com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType customerType);
        
        /**
         * Appends and returns a new empty "customerType" element
         */
        com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType addNewCustomerType();
        
        /**
         * Gets the "relationshipStartDate" element
         */
        java.lang.String getRelationshipStartDate();
        
        /**
         * Gets (as xml) the "relationshipStartDate" element
         */
        org.apache.xmlbeans.XmlString xgetRelationshipStartDate();
        
        /**
         * Sets the "relationshipStartDate" element
         */
        void setRelationshipStartDate(java.lang.String relationshipStartDate);
        
        /**
         * Sets (as xml) the "relationshipStartDate" element
         */
        void xsetRelationshipStartDate(org.apache.xmlbeans.XmlString relationshipStartDate);
        
        /**
         * Gets the "segmentCode" element
         */
        com.scb.sci.customer.fm.SegmentCodeDocument.SegmentCode getSegmentCode();
        
        /**
         * Sets the "segmentCode" element
         */
        void setSegmentCode(com.scb.sci.customer.fm.SegmentCodeDocument.SegmentCode segmentCode);
        
        /**
         * Appends and returns a new empty "segmentCode" element
         */
        com.scb.sci.customer.fm.SegmentCodeDocument.SegmentCode addNewSegmentCode();
        
        /**
         * Gets the "subSegmentCode" element
         */
        com.scb.sci.customer.fm.SubSegmentCodeDocument.SubSegmentCode getSubSegmentCode();
        
        /**
         * Sets the "subSegmentCode" element
         */
        void setSubSegmentCode(com.scb.sci.customer.fm.SubSegmentCodeDocument.SubSegmentCode subSegmentCode);
        
        /**
         * Appends and returns a new empty "subSegmentCode" element
         */
        com.scb.sci.customer.fm.SubSegmentCodeDocument.SubSegmentCode addNewSubSegmentCode();
        
        /**
         * Gets the "baselCustomerSegment" element
         */
        com.scb.sci.customer.fm.BaselCustomerSegmentDocument.BaselCustomerSegment getBaselCustomerSegment();
        
        /**
         * Sets the "baselCustomerSegment" element
         */
        void setBaselCustomerSegment(com.scb.sci.customer.fm.BaselCustomerSegmentDocument.BaselCustomerSegment baselCustomerSegment);
        
        /**
         * Appends and returns a new empty "baselCustomerSegment" element
         */
        com.scb.sci.customer.fm.BaselCustomerSegmentDocument.BaselCustomerSegment addNewBaselCustomerSegment();
        
        /**
         * Gets the "baselCustomerSubSegment" element
         */
        com.scb.sci.customer.fm.BaselCustomerSubSegmentDocument.BaselCustomerSubSegment getBaselCustomerSubSegment();
        
        /**
         * Sets the "baselCustomerSubSegment" element
         */
        void setBaselCustomerSubSegment(com.scb.sci.customer.fm.BaselCustomerSubSegmentDocument.BaselCustomerSubSegment baselCustomerSubSegment);
        
        /**
         * Appends and returns a new empty "baselCustomerSubSegment" element
         */
        com.scb.sci.customer.fm.BaselCustomerSubSegmentDocument.BaselCustomerSubSegment addNewBaselCustomerSubSegment();
        
        /**
         * Gets the "businessType" element
         */
        com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType getBusinessType();
        
        /**
         * Sets the "businessType" element
         */
        void setBusinessType(com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType businessType);
        
        /**
         * Appends and returns a new empty "businessType" element
         */
        com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType addNewBusinessType();
        
        /**
         * Gets the "envRiskGrade" element
         */
        com.scb.sci.customer.fm.EnvRiskGradeDocument.EnvRiskGrade getEnvRiskGrade();
        
        /**
         * Sets the "envRiskGrade" element
         */
        void setEnvRiskGrade(com.scb.sci.customer.fm.EnvRiskGradeDocument.EnvRiskGrade envRiskGrade);
        
        /**
         * Appends and returns a new empty "envRiskGrade" element
         */
        com.scb.sci.customer.fm.EnvRiskGradeDocument.EnvRiskGrade addNewEnvRiskGrade();
        
        /**
         * Gets the "top1000Bank" element
         */
        java.lang.String getTop1000Bank();
        
        /**
         * Gets (as xml) the "top1000Bank" element
         */
        org.apache.xmlbeans.XmlString xgetTop1000Bank();
        
        /**
         * Sets the "top1000Bank" element
         */
        void setTop1000Bank(java.lang.String top1000Bank);
        
        /**
         * Sets (as xml) the "top1000Bank" element
         */
        void xsetTop1000Bank(org.apache.xmlbeans.XmlString top1000Bank);
        
        /**
         * Gets the "referralStatus" element
         */
        com.scb.sci.customer.fm.ReferralStatusDocument.ReferralStatus getReferralStatus();
        
        /**
         * Sets the "referralStatus" element
         */
        void setReferralStatus(com.scb.sci.customer.fm.ReferralStatusDocument.ReferralStatus referralStatus);
        
        /**
         * Appends and returns a new empty "referralStatus" element
         */
        com.scb.sci.customer.fm.ReferralStatusDocument.ReferralStatus addNewReferralStatus();
        
        /**
         * Gets the "operationStatus1" element
         */
        com.scb.sci.customer.fm.OperationStatus1Document.OperationStatus1 getOperationStatus1();
        
        /**
         * Sets the "operationStatus1" element
         */
        void setOperationStatus1(com.scb.sci.customer.fm.OperationStatus1Document.OperationStatus1 operationStatus1);
        
        /**
         * Appends and returns a new empty "operationStatus1" element
         */
        com.scb.sci.customer.fm.OperationStatus1Document.OperationStatus1 addNewOperationStatus1();
        
        /**
         * Gets the "operationStatus1EffDate" element
         */
        java.lang.String getOperationStatus1EffDate();
        
        /**
         * Gets (as xml) the "operationStatus1EffDate" element
         */
        org.apache.xmlbeans.XmlString xgetOperationStatus1EffDate();
        
        /**
         * Sets the "operationStatus1EffDate" element
         */
        void setOperationStatus1EffDate(java.lang.String operationStatus1EffDate);
        
        /**
         * Sets (as xml) the "operationStatus1EffDate" element
         */
        void xsetOperationStatus1EffDate(org.apache.xmlbeans.XmlString operationStatus1EffDate);
        
        /**
         * Gets the "borrowerExceptionChkInd" element
         */
        java.lang.String getBorrowerExceptionChkInd();
        
        /**
         * Gets (as xml) the "borrowerExceptionChkInd" element
         */
        org.apache.xmlbeans.XmlString xgetBorrowerExceptionChkInd();
        
        /**
         * Sets the "borrowerExceptionChkInd" element
         */
        void setBorrowerExceptionChkInd(java.lang.String borrowerExceptionChkInd);
        
        /**
         * Sets (as xml) the "borrowerExceptionChkInd" element
         */
        void xsetBorrowerExceptionChkInd(org.apache.xmlbeans.XmlString borrowerExceptionChkInd);
        
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
            public static com.scb.sci.customer.fm.MainProfileDocument.MainProfile newInstance() {
              return (com.scb.sci.customer.fm.MainProfileDocument.MainProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.MainProfileDocument.MainProfile newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.MainProfileDocument.MainProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.MainProfileDocument newInstance() {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.MainProfileDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.MainProfileDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.MainProfileDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.MainProfileDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.MainProfileDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.MainProfileDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.MainProfileDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.MainProfileDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.MainProfileDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.MainProfileDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.MainProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
