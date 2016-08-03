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
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AtlasMessageDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("atlasmessage4bf5doctype");
    
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AtlasMessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s439D8C1846844DC8F6D8E680711729A1").resolveHandle("atlasmessage9b6delemtype");
        
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
         * Gets a List of "leSysContact" elements
         */
        java.util.List<atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact> getLeSysContactList();
        
        /**
         * Gets array of all "leSysContact" elements
         * @deprecated
         */
        @Deprecated
        atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact[] getLeSysContactArray();
        
        /**
         * Gets ith "leSysContact" element
         */
        atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact getLeSysContactArray(int i);
        
        /**
         * Returns number of "leSysContact" element
         */
        int sizeOfLeSysContactArray();
        
        /**
         * Sets array of all "leSysContact" element
         */
        void setLeSysContactArray(atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact[] leSysContactArray);
        
        /**
         * Sets ith "leSysContact" element
         */
        void setLeSysContactArray(int i, atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact leSysContact);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leSysContact" element
         */
        atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact insertNewLeSysContact(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leSysContact" element
         */
        atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact addNewLeSysContact();
        
        /**
         * Removes the ith "leSysContact" element
         */
        void removeLeSysContact(int i);
        
        /**
         * Gets a List of "leAltSysContact" elements
         */
        java.util.List<atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact> getLeAltSysContactList();
        
        /**
         * Gets array of all "leAltSysContact" elements
         * @deprecated
         */
        @Deprecated
        atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact[] getLeAltSysContactArray();
        
        /**
         * Gets ith "leAltSysContact" element
         */
        atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact getLeAltSysContactArray(int i);
        
        /**
         * Returns number of "leAltSysContact" element
         */
        int sizeOfLeAltSysContactArray();
        
        /**
         * Sets array of all "leAltSysContact" element
         */
        void setLeAltSysContactArray(atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact[] leAltSysContactArray);
        
        /**
         * Sets ith "leAltSysContact" element
         */
        void setLeAltSysContactArray(int i, atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact leAltSysContact);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leAltSysContact" element
         */
        atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact insertNewLeAltSysContact(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leAltSysContact" element
         */
        atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact addNewLeAltSysContact();
        
        /**
         * Removes the ith "leAltSysContact" element
         */
        void removeLeAltSysContact(int i);
        
        /**
         * Gets a List of "leTcId" elements
         */
        java.util.List<atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId> getLeTcIdList();
        
        /**
         * Gets array of all "leTcId" elements
         * @deprecated
         */
        @Deprecated
        atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId[] getLeTcIdArray();
        
        /**
         * Gets ith "leTcId" element
         */
        atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId getLeTcIdArray(int i);
        
        /**
         * Returns number of "leTcId" element
         */
        int sizeOfLeTcIdArray();
        
        /**
         * Sets array of all "leTcId" element
         */
        void setLeTcIdArray(atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId[] leTcIdArray);
        
        /**
         * Sets ith "leTcId" element
         */
        void setLeTcIdArray(int i, atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId leTcId);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leTcId" element
         */
        atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId insertNewLeTcId(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leTcId" element
         */
        atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId addNewLeTcId();
        
        /**
         * Removes the ith "leTcId" element
         */
        void removeLeTcId(int i);
        
        /**
         * Gets a List of "leAddress" elements
         */
        java.util.List<atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress> getLeAddressList();
        
        /**
         * Gets array of all "leAddress" elements
         * @deprecated
         */
        @Deprecated
        atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress[] getLeAddressArray();
        
        /**
         * Gets ith "leAddress" element
         */
        atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress getLeAddressArray(int i);
        
        /**
         * Returns number of "leAddress" element
         */
        int sizeOfLeAddressArray();
        
        /**
         * Sets array of all "leAddress" element
         */
        void setLeAddressArray(atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress[] leAddressArray);
        
        /**
         * Sets ith "leAddress" element
         */
        void setLeAddressArray(int i, atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress leAddress);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leAddress" element
         */
        atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress insertNewLeAddress(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leAddress" element
         */
        atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress addNewLeAddress();
        
        /**
         * Removes the ith "leAddress" element
         */
        void removeLeAddress(int i);
        
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
         * Gets the "leHierarchyDetails" element
         */
        atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails getLeHierarchyDetails();
        
        /**
         * Sets the "leHierarchyDetails" element
         */
        void setLeHierarchyDetails(atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails leHierarchyDetails);
        
        /**
         * Appends and returns a new empty "leHierarchyDetails" element
         */
        atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails addNewLeHierarchyDetails();
        
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
