/*
 * An XML document type.
 * Localname: fmEntityMoreInfo
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmEntityMoreInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one fmEntityMoreInfo(@) element.
 *
 * This is a complex type.
 */
public interface FmEntityMoreInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmEntityMoreInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmentitymoreinfo7dc6doctype");
    
    /**
     * Gets the "fmEntityMoreInfo" element
     */
    com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo getFmEntityMoreInfo();
    
    /**
     * Sets the "fmEntityMoreInfo" element
     */
    void setFmEntityMoreInfo(com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo fmEntityMoreInfo);
    
    /**
     * Appends and returns a new empty "fmEntityMoreInfo" element
     */
    com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo addNewFmEntityMoreInfo();
    
    /**
     * An XML fmEntityMoreInfo(@).
     *
     * This is a complex type.
     */
    public interface FmEntityMoreInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmEntityMoreInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmentitymoreinfo134delemtype");
        
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
         * Gets the "subProfileId" element
         */
        java.lang.String getSubProfileId();
        
        /**
         * Gets (as xml) the "subProfileId" element
         */
        org.apache.xmlbeans.XmlString xgetSubProfileId();
        
        /**
         * Sets the "subProfileId" element
         */
        void setSubProfileId(java.lang.String subProfileId);
        
        /**
         * Sets (as xml) the "subProfileId" element
         */
        void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
        
        /**
         * Gets the "fmId" element
         */
        java.lang.String getFmId();
        
        /**
         * Gets (as xml) the "fmId" element
         */
        org.apache.xmlbeans.XmlString xgetFmId();
        
        /**
         * Sets the "fmId" element
         */
        void setFmId(java.lang.String fmId);
        
        /**
         * Sets (as xml) the "fmId" element
         */
        void xsetFmId(org.apache.xmlbeans.XmlString fmId);
        
        /**
         * Gets the "fmMoreDtlSysGenId" element
         */
        java.lang.String getFmMoreDtlSysGenId();
        
        /**
         * Gets (as xml) the "fmMoreDtlSysGenId" element
         */
        org.apache.xmlbeans.XmlString xgetFmMoreDtlSysGenId();
        
        /**
         * Sets the "fmMoreDtlSysGenId" element
         */
        void setFmMoreDtlSysGenId(java.lang.String fmMoreDtlSysGenId);
        
        /**
         * Sets (as xml) the "fmMoreDtlSysGenId" element
         */
        void xsetFmMoreDtlSysGenId(org.apache.xmlbeans.XmlString fmMoreDtlSysGenId);
        
        /**
         * Gets the "scbClassCode" element
         */
        java.lang.String getScbClassCode();
        
        /**
         * Gets (as xml) the "scbClassCode" element
         */
        org.apache.xmlbeans.XmlString xgetScbClassCode();
        
        /**
         * Sets the "scbClassCode" element
         */
        void setScbClassCode(java.lang.String scbClassCode);
        
        /**
         * Sets (as xml) the "scbClassCode" element
         */
        void xsetScbClassCode(org.apache.xmlbeans.XmlString scbClassCode);
        
        /**
         * Gets the "fmType" element
         */
        com.scb.sci.customer.fm.FmTypeDocument.FmType getFmType();
        
        /**
         * Sets the "fmType" element
         */
        void setFmType(com.scb.sci.customer.fm.FmTypeDocument.FmType fmType);
        
        /**
         * Appends and returns a new empty "fmType" element
         */
        com.scb.sci.customer.fm.FmTypeDocument.FmType addNewFmType();
        
        /**
         * Gets the "opicsClassCode" element
         */
        java.lang.String getOpicsClassCode();
        
        /**
         * Gets (as xml) the "opicsClassCode" element
         */
        org.apache.xmlbeans.XmlString xgetOpicsClassCode();
        
        /**
         * Sets the "opicsClassCode" element
         */
        void setOpicsClassCode(java.lang.String opicsClassCode);
        
        /**
         * Sets (as xml) the "opicsClassCode" element
         */
        void xsetOpicsClassCode(org.apache.xmlbeans.XmlString opicsClassCode);
        
        /**
         * Gets the "fmClassCode" element
         */
        com.scb.sci.customer.fm.FmClassCodeDocument.FmClassCode getFmClassCode();
        
        /**
         * Sets the "fmClassCode" element
         */
        void setFmClassCode(com.scb.sci.customer.fm.FmClassCodeDocument.FmClassCode fmClassCode);
        
        /**
         * Appends and returns a new empty "fmClassCode" element
         */
        com.scb.sci.customer.fm.FmClassCodeDocument.FmClassCode addNewFmClassCode();
        
        /**
         * Gets the "finInstType" element
         */
        com.scb.sci.customer.fm.FinInstTypeDocument.FinInstType getFinInstType();
        
        /**
         * Sets the "finInstType" element
         */
        void setFinInstType(com.scb.sci.customer.fm.FinInstTypeDocument.FinInstType finInstType);
        
        /**
         * Appends and returns a new empty "finInstType" element
         */
        com.scb.sci.customer.fm.FinInstTypeDocument.FinInstType addNewFinInstType();
        
        /**
         * Gets the "instSector" element
         */
        com.scb.sci.customer.fm.InstSectorDocument.InstSector getInstSector();
        
        /**
         * Sets the "instSector" element
         */
        void setInstSector(com.scb.sci.customer.fm.InstSectorDocument.InstSector instSector);
        
        /**
         * Appends and returns a new empty "instSector" element
         */
        com.scb.sci.customer.fm.InstSectorDocument.InstSector addNewInstSector();
        
        /**
         * Gets the "clsEigibility" element
         */
        java.lang.String getClsEigibility();
        
        /**
         * Gets (as xml) the "clsEigibility" element
         */
        org.apache.xmlbeans.XmlString xgetClsEigibility();
        
        /**
         * Sets the "clsEigibility" element
         */
        void setClsEigibility(java.lang.String clsEigibility);
        
        /**
         * Sets (as xml) the "clsEigibility" element
         */
        void xsetClsEigibility(org.apache.xmlbeans.XmlString clsEigibility);
        
        /**
         * Gets the "clsCustType" element
         */
        com.scb.sci.customer.fm.ClsCustTypeDocument.ClsCustType getClsCustType();
        
        /**
         * Sets the "clsCustType" element
         */
        void setClsCustType(com.scb.sci.customer.fm.ClsCustTypeDocument.ClsCustType clsCustType);
        
        /**
         * Appends and returns a new empty "clsCustType" element
         */
        com.scb.sci.customer.fm.ClsCustTypeDocument.ClsCustType addNewClsCustType();
        
        /**
         * Gets the "clsStartDate" element
         */
        java.lang.String getClsStartDate();
        
        /**
         * Gets (as xml) the "clsStartDate" element
         */
        org.apache.xmlbeans.XmlString xgetClsStartDate();
        
        /**
         * Sets the "clsStartDate" element
         */
        void setClsStartDate(java.lang.String clsStartDate);
        
        /**
         * Sets (as xml) the "clsStartDate" element
         */
        void xsetClsStartDate(org.apache.xmlbeans.XmlString clsStartDate);
        
        /**
         * Gets the "brokerId" element
         */
        java.lang.String getBrokerId();
        
        /**
         * Gets (as xml) the "brokerId" element
         */
        org.apache.xmlbeans.XmlString xgetBrokerId();
        
        /**
         * Sets the "brokerId" element
         */
        void setBrokerId(java.lang.String brokerId);
        
        /**
         * Sets (as xml) the "brokerId" element
         */
        void xsetBrokerId(org.apache.xmlbeans.XmlString brokerId);
        
        /**
         * Gets the "armEmpCodeMapId" element
         */
        java.lang.String getArmEmpCodeMapId();
        
        /**
         * Gets (as xml) the "armEmpCodeMapId" element
         */
        org.apache.xmlbeans.XmlString xgetArmEmpCodeMapId();
        
        /**
         * Sets the "armEmpCodeMapId" element
         */
        void setArmEmpCodeMapId(java.lang.String armEmpCodeMapId);
        
        /**
         * Sets (as xml) the "armEmpCodeMapId" element
         */
        void xsetArmEmpCodeMapId(org.apache.xmlbeans.XmlString armEmpCodeMapId);
        
        /**
         * Gets the "armId" element
         */
        java.lang.String getArmId();
        
        /**
         * Gets (as xml) the "armId" element
         */
        org.apache.xmlbeans.XmlString xgetArmId();
        
        /**
         * Sets the "armId" element
         */
        void setArmId(java.lang.String armId);
        
        /**
         * Sets (as xml) the "armId" element
         */
        void xsetArmId(org.apache.xmlbeans.XmlString armId);
        
        /**
         * Gets the "armCode" element
         */
        java.lang.String getArmCode();
        
        /**
         * Gets (as xml) the "armCode" element
         */
        org.apache.xmlbeans.XmlString xgetArmCode();
        
        /**
         * Sets the "armCode" element
         */
        void setArmCode(java.lang.String armCode);
        
        /**
         * Sets (as xml) the "armCode" element
         */
        void xsetArmCode(org.apache.xmlbeans.XmlString armCode);
        
        /**
         * Gets the "armEmpId" element
         */
        java.lang.String getArmEmpId();
        
        /**
         * Gets (as xml) the "armEmpId" element
         */
        org.apache.xmlbeans.XmlString xgetArmEmpId();
        
        /**
         * Sets the "armEmpId" element
         */
        void setArmEmpId(java.lang.String armEmpId);
        
        /**
         * Sets (as xml) the "armEmpId" element
         */
        void xsetArmEmpId(org.apache.xmlbeans.XmlString armEmpId);
        
        /**
         * Gets the "armEmpName" element
         */
        java.lang.String getArmEmpName();
        
        /**
         * Gets (as xml) the "armEmpName" element
         */
        org.apache.xmlbeans.XmlString xgetArmEmpName();
        
        /**
         * Sets the "armEmpName" element
         */
        void setArmEmpName(java.lang.String armEmpName);
        
        /**
         * Sets (as xml) the "armEmpName" element
         */
        void xsetArmEmpName(org.apache.xmlbeans.XmlString armEmpName);
        
        /**
         * Gets the "armLocationId" element
         */
        java.lang.String getArmLocationId();
        
        /**
         * Gets (as xml) the "armLocationId" element
         */
        org.apache.xmlbeans.XmlString xgetArmLocationId();
        
        /**
         * Sets the "armLocationId" element
         */
        void setArmLocationId(java.lang.String armLocationId);
        
        /**
         * Sets (as xml) the "armLocationId" element
         */
        void xsetArmLocationId(org.apache.xmlbeans.XmlString armLocationId);
        
        /**
         * Gets the "armLocationCountry" element
         */
        java.lang.String getArmLocationCountry();
        
        /**
         * Gets (as xml) the "armLocationCountry" element
         */
        org.apache.xmlbeans.XmlString xgetArmLocationCountry();
        
        /**
         * Sets the "armLocationCountry" element
         */
        void setArmLocationCountry(java.lang.String armLocationCountry);
        
        /**
         * Sets (as xml) the "armLocationCountry" element
         */
        void xsetArmLocationCountry(org.apache.xmlbeans.XmlString armLocationCountry);
        
        /**
         * Gets the "armLocationOrganization" element
         */
        java.lang.String getArmLocationOrganization();
        
        /**
         * Gets (as xml) the "armLocationOrganization" element
         */
        org.apache.xmlbeans.XmlString xgetArmLocationOrganization();
        
        /**
         * Sets the "armLocationOrganization" element
         */
        void setArmLocationOrganization(java.lang.String armLocationOrganization);
        
        /**
         * Sets (as xml) the "armLocationOrganization" element
         */
        void xsetArmLocationOrganization(org.apache.xmlbeans.XmlString armLocationOrganization);
        
        /**
         * Gets the "dataProtInd" element
         */
        java.lang.String getDataProtInd();
        
        /**
         * Gets (as xml) the "dataProtInd" element
         */
        org.apache.xmlbeans.XmlString xgetDataProtInd();
        
        /**
         * Sets the "dataProtInd" element
         */
        void setDataProtInd(java.lang.String dataProtInd);
        
        /**
         * Sets (as xml) the "dataProtInd" element
         */
        void xsetDataProtInd(org.apache.xmlbeans.XmlString dataProtInd);
        
        /**
         * Gets the "fmNote" element
         */
        java.lang.String getFmNote();
        
        /**
         * Gets (as xml) the "fmNote" element
         */
        org.apache.xmlbeans.XmlString xgetFmNote();
        
        /**
         * Sets the "fmNote" element
         */
        void setFmNote(java.lang.String fmNote);
        
        /**
         * Sets (as xml) the "fmNote" element
         */
        void xsetFmNote(org.apache.xmlbeans.XmlString fmNote);
        
        /**
         * Gets the "nrdSignedInd" element
         */
        java.lang.String getNrdSignedInd();
        
        /**
         * Gets (as xml) the "nrdSignedInd" element
         */
        org.apache.xmlbeans.XmlString xgetNrdSignedInd();
        
        /**
         * Sets the "nrdSignedInd" element
         */
        void setNrdSignedInd(java.lang.String nrdSignedInd);
        
        /**
         * Sets (as xml) the "nrdSignedInd" element
         */
        void xsetNrdSignedInd(org.apache.xmlbeans.XmlString nrdSignedInd);
        
        /**
         * Gets the "confReqInd" element
         */
        java.lang.String getConfReqInd();
        
        /**
         * Gets (as xml) the "confReqInd" element
         */
        org.apache.xmlbeans.XmlString xgetConfReqInd();
        
        /**
         * Sets the "confReqInd" element
         */
        void setConfReqInd(java.lang.String confReqInd);
        
        /**
         * Sets (as xml) the "confReqInd" element
         */
        void xsetConfReqInd(org.apache.xmlbeans.XmlString confReqInd);
        
        /**
         * Gets the "tradingInd" element
         */
        java.lang.String getTradingInd();
        
        /**
         * Gets (as xml) the "tradingInd" element
         */
        org.apache.xmlbeans.XmlString xgetTradingInd();
        
        /**
         * Sets the "tradingInd" element
         */
        void setTradingInd(java.lang.String tradingInd);
        
        /**
         * Sets (as xml) the "tradingInd" element
         */
        void xsetTradingInd(org.apache.xmlbeans.XmlString tradingInd);
        
        /**
         * Gets the "dateOfSigningOfDiscAgr" element
         */
        java.lang.String getDateOfSigningOfDiscAgr();
        
        /**
         * Gets (as xml) the "dateOfSigningOfDiscAgr" element
         */
        org.apache.xmlbeans.XmlString xgetDateOfSigningOfDiscAgr();
        
        /**
         * Sets the "dateOfSigningOfDiscAgr" element
         */
        void setDateOfSigningOfDiscAgr(java.lang.String dateOfSigningOfDiscAgr);
        
        /**
         * Sets (as xml) the "dateOfSigningOfDiscAgr" element
         */
        void xsetDateOfSigningOfDiscAgr(org.apache.xmlbeans.XmlString dateOfSigningOfDiscAgr);
        
        /**
         * Gets the "disclosureAgrRecInd" element
         */
        java.lang.String getDisclosureAgrRecInd();
        
        /**
         * Gets (as xml) the "disclosureAgrRecInd" element
         */
        org.apache.xmlbeans.XmlString xgetDisclosureAgrRecInd();
        
        /**
         * Sets the "disclosureAgrRecInd" element
         */
        void setDisclosureAgrRecInd(java.lang.String disclosureAgrRecInd);
        
        /**
         * Sets (as xml) the "disclosureAgrRecInd" element
         */
        void xsetDisclosureAgrRecInd(org.apache.xmlbeans.XmlString disclosureAgrRecInd);
        
        /**
         * Gets the "docCompletionInd" element
         */
        java.lang.String getDocCompletionInd();
        
        /**
         * Gets (as xml) the "docCompletionInd" element
         */
        org.apache.xmlbeans.XmlString xgetDocCompletionInd();
        
        /**
         * Sets the "docCompletionInd" element
         */
        void setDocCompletionInd(java.lang.String docCompletionInd);
        
        /**
         * Sets (as xml) the "docCompletionInd" element
         */
        void xsetDocCompletionInd(org.apache.xmlbeans.XmlString docCompletionInd);
        
        /**
         * Gets the "docCompletionDate" element
         */
        java.lang.String getDocCompletionDate();
        
        /**
         * Gets (as xml) the "docCompletionDate" element
         */
        org.apache.xmlbeans.XmlString xgetDocCompletionDate();
        
        /**
         * Sets the "docCompletionDate" element
         */
        void setDocCompletionDate(java.lang.String docCompletionDate);
        
        /**
         * Sets (as xml) the "docCompletionDate" element
         */
        void xsetDocCompletionDate(org.apache.xmlbeans.XmlString docCompletionDate);
        
        /**
         * Gets the "bankingSecrecyActInd" element
         */
        java.lang.String getBankingSecrecyActInd();
        
        /**
         * Gets (as xml) the "bankingSecrecyActInd" element
         */
        org.apache.xmlbeans.XmlString xgetBankingSecrecyActInd();
        
        /**
         * Sets the "bankingSecrecyActInd" element
         */
        void setBankingSecrecyActInd(java.lang.String bankingSecrecyActInd);
        
        /**
         * Sets (as xml) the "bankingSecrecyActInd" element
         */
        void xsetBankingSecrecyActInd(org.apache.xmlbeans.XmlString bankingSecrecyActInd);
        
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
            public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo newInstance() {
              return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument newInstance() {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmEntityMoreInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmEntityMoreInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
