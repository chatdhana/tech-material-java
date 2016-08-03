/*
 * An XML document type.
 * Localname: atlasMessage
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.AtlasMessageDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le;


/**
 * A document containing one atlasMessage(@) element.
 *
 * This is a complex type.
 */
public interface AtlasMessageDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AtlasMessageDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s18A232EABD86FE9FE68F626177D8784B").resolveHandle("atlasmessage4bf5doctype");
    
    /**
     * Gets the "atlasMessage" element
     */
    atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage getAtlasMessage();
    
    /**
     * Sets the "atlasMessage" element
     */
    void setAtlasMessage(atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage atlasMessage);
    
    /**
     * Appends and returns a new empty "atlasMessage" element
     */
    atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage addNewAtlasMessage();
    
    /**
     * An XML atlasMessage(@).
     *
     * This is a complex type.
     */
    public interface AtlasMessage extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AtlasMessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s18A232EABD86FE9FE68F626177D8784B").resolveHandle("atlasmessage9b6delemtype");
        
        /**
         * Gets the "message" element
         */
        atlas.pubsub.xmlbeans.le.MessageDocument.Message getMessage();
        
        /**
         * Sets the "message" element
         */
        void setMessage(atlas.pubsub.xmlbeans.le.MessageDocument.Message message);
        
        /**
         * Appends and returns a new empty "message" element
         */
        atlas.pubsub.xmlbeans.le.MessageDocument.Message addNewMessage();
        
        /**
         * Gets the "header" element
         */
        atlas.pubsub.xmlbeans.le.HeaderDocument.Header getHeader();
        
        /**
         * Sets the "header" element
         */
        void setHeader(atlas.pubsub.xmlbeans.le.HeaderDocument.Header header);
        
        /**
         * Appends and returns a new empty "header" element
         */
        atlas.pubsub.xmlbeans.le.HeaderDocument.Header addNewHeader();
        
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
         * Gets the "leInfo" element
         */
        atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo getLeInfo();
        
        /**
         * Sets the "leInfo" element
         */
        void setLeInfo(atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo leInfo);
        
        /**
         * Appends and returns a new empty "leInfo" element
         */
        atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo addNewLeInfo();
        
        /**
         * Gets the "leSysContact" element
         */
        atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact getLeSysContact();
        
        /**
         * Sets the "leSysContact" element
         */
        void setLeSysContact(atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact leSysContact);
        
        /**
         * Appends and returns a new empty "leSysContact" element
         */
        atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact addNewLeSysContact();
        
        /**
         * Gets the "leAltSysContact" element
         */
        atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact getLeAltSysContact();
        
        /**
         * Sets the "leAltSysContact" element
         */
        void setLeAltSysContact(atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact leAltSysContact);
        
        /**
         * Appends and returns a new empty "leAltSysContact" element
         */
        atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact addNewLeAltSysContact();
        
        /**
         * Gets the "leTcId" element
         */
        atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId getLeTcId();
        
        /**
         * Sets the "leTcId" element
         */
        void setLeTcId(atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId leTcId);
        
        /**
         * Appends and returns a new empty "leTcId" element
         */
        atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId addNewLeTcId();
        
        /**
         * Gets the "leAddress" element
         */
        atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress getLeAddress();
        
        /**
         * Sets the "leAddress" element
         */
        void setLeAddress(atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress leAddress);
        
        /**
         * Appends and returns a new empty "leAddress" element
         */
        atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress addNewLeAddress();
        
        /**
         * Gets the "leAltAddress" element
         */
        atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress getLeAltAddress();
        
        /**
         * Sets the "leAltAddress" element
         */
        void setLeAltAddress(atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress leAltAddress);
        
        /**
         * Appends and returns a new empty "leAltAddress" element
         */
        atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress addNewLeAltAddress();
        
        /**
         * Gets a List of "counterpartyXref" elements
         */
        java.util.List<atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref> getCounterpartyXrefList();
        
        /**
         * Gets array of all "counterpartyXref" elements
         * @deprecated
         */
        @Deprecated
        atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref[] getCounterpartyXrefArray();
        
        /**
         * Gets ith "counterpartyXref" element
         */
        atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref getCounterpartyXrefArray(int i);
        
        /**
         * Returns number of "counterpartyXref" element
         */
        int sizeOfCounterpartyXrefArray();
        
        /**
         * Sets array of all "counterpartyXref" element
         */
        void setCounterpartyXrefArray(atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref[] counterpartyXrefArray);
        
        /**
         * Sets ith "counterpartyXref" element
         */
        void setCounterpartyXrefArray(int i, atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref counterpartyXref);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "counterpartyXref" element
         */
        atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref insertNewCounterpartyXref(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "counterpartyXref" element
         */
        atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref addNewCounterpartyXref();
        
        /**
         * Removes the ith "counterpartyXref" element
         */
        void removeCounterpartyXref(int i);
        
        /**
         * Gets the "armLeCrf" element
         */
        atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf getArmLeCrf();
        
        /**
         * Sets the "armLeCrf" element
         */
        void setArmLeCrf(atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf armLeCrf);
        
        /**
         * Appends and returns a new empty "armLeCrf" element
         */
        atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf addNewArmLeCrf();
        
        /**
         * Gets the "leBranchDetails" element
         */
        atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails getLeBranchDetails();
        
        /**
         * Sets the "leBranchDetails" element
         */
        void setLeBranchDetails(atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails leBranchDetails);
        
        /**
         * Appends and returns a new empty "leBranchDetails" element
         */
        atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails addNewLeBranchDetails();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage newInstance() {
              return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument newInstance() {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static atlas.pubsub.xmlbeans.le.AtlasMessageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (atlas.pubsub.xmlbeans.le.AtlasMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
