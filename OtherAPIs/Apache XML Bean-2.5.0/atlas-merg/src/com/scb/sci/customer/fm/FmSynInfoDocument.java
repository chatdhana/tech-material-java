/*
 * An XML document type.
 * Localname: fmSynInfo
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmSynInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm;


/**
 * A document containing one fmSynInfo(@) element.
 *
 * This is a complex type.
 */
public interface FmSynInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmSynInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmsyninfo5076doctype");
    
    /**
     * Gets the "fmSynInfo" element
     */
    com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo getFmSynInfo();
    
    /**
     * Sets the "fmSynInfo" element
     */
    void setFmSynInfo(com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo fmSynInfo);
    
    /**
     * Appends and returns a new empty "fmSynInfo" element
     */
    com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo addNewFmSynInfo();
    
    /**
     * An XML fmSynInfo(@).
     *
     * This is a complex type.
     */
    public interface FmSynInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FmSynInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6B2DF887A32B44597DEFB0823B80760E").resolveHandle("fmsyninfoe741elemtype");
        
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
         * Gets the "clientFidessaViewCode" element
         */
        java.lang.String getClientFidessaViewCode();
        
        /**
         * Gets (as xml) the "clientFidessaViewCode" element
         */
        org.apache.xmlbeans.XmlString xgetClientFidessaViewCode();
        
        /**
         * Sets the "clientFidessaViewCode" element
         */
        void setClientFidessaViewCode(java.lang.String clientFidessaViewCode);
        
        /**
         * Sets (as xml) the "clientFidessaViewCode" element
         */
        void xsetClientFidessaViewCode(org.apache.xmlbeans.XmlString clientFidessaViewCode);
        
        /**
         * Gets the "accountFidessaViewCode" element
         */
        java.lang.String getAccountFidessaViewCode();
        
        /**
         * Gets (as xml) the "accountFidessaViewCode" element
         */
        org.apache.xmlbeans.XmlString xgetAccountFidessaViewCode();
        
        /**
         * Sets the "accountFidessaViewCode" element
         */
        void setAccountFidessaViewCode(java.lang.String accountFidessaViewCode);
        
        /**
         * Sets (as xml) the "accountFidessaViewCode" element
         */
        void xsetAccountFidessaViewCode(org.apache.xmlbeans.XmlString accountFidessaViewCode);
        
        /**
         * Gets the "contractingRelationships" element
         */
        com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships getContractingRelationships();
        
        /**
         * True if has "contractingRelationships" element
         */
        boolean isSetContractingRelationships();
        
        /**
         * Sets the "contractingRelationships" element
         */
        void setContractingRelationships(com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships contractingRelationships);
        
        /**
         * Appends and returns a new empty "contractingRelationships" element
         */
        com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships addNewContractingRelationships();
        
        /**
         * Unsets the "contractingRelationships" element
         */
        void unsetContractingRelationships();
        
        /**
         * Gets the "vatFlag" element
         */
        java.lang.String getVatFlag();
        
        /**
         * Gets (as xml) the "vatFlag" element
         */
        org.apache.xmlbeans.XmlString xgetVatFlag();
        
        /**
         * Sets the "vatFlag" element
         */
        void setVatFlag(java.lang.String vatFlag);
        
        /**
         * Sets (as xml) the "vatFlag" element
         */
        void xsetVatFlag(org.apache.xmlbeans.XmlString vatFlag);
        
        /**
         * Gets the "euVatRegistrationNo" element
         */
        java.lang.String getEuVatRegistrationNo();
        
        /**
         * Gets (as xml) the "euVatRegistrationNo" element
         */
        org.apache.xmlbeans.XmlString xgetEuVatRegistrationNo();
        
        /**
         * Sets the "euVatRegistrationNo" element
         */
        void setEuVatRegistrationNo(java.lang.String euVatRegistrationNo);
        
        /**
         * Sets (as xml) the "euVatRegistrationNo" element
         */
        void xsetEuVatRegistrationNo(org.apache.xmlbeans.XmlString euVatRegistrationNo);
        
        /**
         * Gets the "micCode" element
         */
        java.lang.String getMicCode();
        
        /**
         * Gets (as xml) the "micCode" element
         */
        org.apache.xmlbeans.XmlString xgetMicCode();
        
        /**
         * Sets the "micCode" element
         */
        void setMicCode(java.lang.String micCode);
        
        /**
         * Sets (as xml) the "micCode" element
         */
        void xsetMicCode(org.apache.xmlbeans.XmlString micCode);
        
        /**
         * Gets the "symbology" element
         */
        com.scb.sci.customer.fm.SymbologyDocument.Symbology getSymbology();
        
        /**
         * Sets the "symbology" element
         */
        void setSymbology(com.scb.sci.customer.fm.SymbologyDocument.Symbology symbology);
        
        /**
         * Appends and returns a new empty "symbology" element
         */
        com.scb.sci.customer.fm.SymbologyDocument.Symbology addNewSymbology();
        
        /**
         * Gets the "usTaxId" element
         */
        java.lang.String getUsTaxId();
        
        /**
         * Gets (as xml) the "usTaxId" element
         */
        org.apache.xmlbeans.XmlString xgetUsTaxId();
        
        /**
         * Sets the "usTaxId" element
         */
        void setUsTaxId(java.lang.String usTaxId);
        
        /**
         * Sets (as xml) the "usTaxId" element
         */
        void xsetUsTaxId(org.apache.xmlbeans.XmlString usTaxId);
        
        /**
         * Gets the "oasysLevel" element
         */
        com.scb.sci.customer.fm.OasysLevelDocument.OasysLevel getOasysLevel();
        
        /**
         * Sets the "oasysLevel" element
         */
        void setOasysLevel(com.scb.sci.customer.fm.OasysLevelDocument.OasysLevel oasysLevel);
        
        /**
         * Appends and returns a new empty "oasysLevel" element
         */
        com.scb.sci.customer.fm.OasysLevelDocument.OasysLevel addNewOasysLevel();
        
        /**
         * Gets the "fmProfileType" element
         */
        com.scb.sci.customer.fm.FmProfileTypeDocument.FmProfileType getFmProfileType();
        
        /**
         * Sets the "fmProfileType" element
         */
        void setFmProfileType(com.scb.sci.customer.fm.FmProfileTypeDocument.FmProfileType fmProfileType);
        
        /**
         * Appends and returns a new empty "fmProfileType" element
         */
        com.scb.sci.customer.fm.FmProfileTypeDocument.FmProfileType addNewFmProfileType();
        
        /**
         * Gets the "fmTradingAccountType" element
         */
        com.scb.sci.customer.fm.FmTradingAccountTypeDocument.FmTradingAccountType getFmTradingAccountType();
        
        /**
         * Sets the "fmTradingAccountType" element
         */
        void setFmTradingAccountType(com.scb.sci.customer.fm.FmTradingAccountTypeDocument.FmTradingAccountType fmTradingAccountType);
        
        /**
         * Appends and returns a new empty "fmTradingAccountType" element
         */
        com.scb.sci.customer.fm.FmTradingAccountTypeDocument.FmTradingAccountType addNewFmTradingAccountType();
        
        /**
         * Gets the "synRoles" element
         */
        com.scb.sci.customer.fm.SynRolesDocument.SynRoles getSynRoles();
        
        /**
         * True if has "synRoles" element
         */
        boolean isSetSynRoles();
        
        /**
         * Sets the "synRoles" element
         */
        void setSynRoles(com.scb.sci.customer.fm.SynRolesDocument.SynRoles synRoles);
        
        /**
         * Appends and returns a new empty "synRoles" element
         */
        com.scb.sci.customer.fm.SynRolesDocument.SynRoles addNewSynRoles();
        
        /**
         * Unsets the "synRoles" element
         */
        void unsetSynRoles();
        
        /**
         * Gets the "investorIds" element
         */
        com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds getInvestorIds();
        
        /**
         * True if has "investorIds" element
         */
        boolean isSetInvestorIds();
        
        /**
         * Sets the "investorIds" element
         */
        void setInvestorIds(com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds investorIds);
        
        /**
         * Appends and returns a new empty "investorIds" element
         */
        com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds addNewInvestorIds();
        
        /**
         * Unsets the "investorIds" element
         */
        void unsetInvestorIds();
        
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
            public static com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo newInstance() {
              return (com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.scb.sci.customer.fm.FmSynInfoDocument newInstance() {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.scb.sci.customer.fm.FmSynInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static com.scb.sci.customer.fm.FmSynInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.scb.sci.customer.fm.FmSynInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
