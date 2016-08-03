/*
 * An XML document type.
 * Localname: SCIMessages
 * Namespace: 
 * Java type: com.stanchart.customer.SCIMessagesDocument
 *
 * Automatically generated - do not modify.
 */
package com.stanchart.customer;


/**
 * A document containing one SCIMessages(@) element.
 *
 * This is a complex type.
 */
public interface SCIMessagesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SCIMessagesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("scimessagesbe4cdoctype");
    
    /**
     * Gets the "SCIMessages" element
     */
    com.stanchart.customer.SCIMessagesDocument.SCIMessages getSCIMessages();
    
    /**
     * Sets the "SCIMessages" element
     */
    void setSCIMessages(com.stanchart.customer.SCIMessagesDocument.SCIMessages sciMessages);
    
    /**
     * Appends and returns a new empty "SCIMessages" element
     */
    com.stanchart.customer.SCIMessagesDocument.SCIMessages addNewSCIMessages();
    
    /**
     * An XML SCIMessages(@).
     *
     * This is a complex type.
     */
    public interface SCIMessages extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SCIMessages.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("scimessages4d6delemtype");
        
        /**
         * Gets array of all "addressType" elements
         */
        com.stanchart.customer.AddressTypeDocument.AddressType[] getAddressTypeArray();
        
        /**
         * Gets ith "addressType" element
         */
        com.stanchart.customer.AddressTypeDocument.AddressType getAddressTypeArray(int i);
        
        /**
         * Returns number of "addressType" element
         */
        int sizeOfAddressTypeArray();
        
        /**
         * Sets array of all "addressType" element
         */
        void setAddressTypeArray(com.stanchart.customer.AddressTypeDocument.AddressType[] addressTypeArray);
        
        /**
         * Sets ith "addressType" element
         */
        void setAddressTypeArray(int i, com.stanchart.customer.AddressTypeDocument.AddressType addressType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "addressType" element
         */
        com.stanchart.customer.AddressTypeDocument.AddressType insertNewAddressType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "addressType" element
         */
        com.stanchart.customer.AddressTypeDocument.AddressType addNewAddressType();
        
        /**
         * Removes the ith "addressType" element
         */
        void removeAddressType(int i);
        
        /**
         * Gets array of all "instructionRefType" elements
         */
        com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType[] getInstructionRefTypeArray();
        
        /**
         * Gets ith "instructionRefType" element
         */
        com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType getInstructionRefTypeArray(int i);
        
        /**
         * Returns number of "instructionRefType" element
         */
        int sizeOfInstructionRefTypeArray();
        
        /**
         * Sets array of all "instructionRefType" element
         */
        void setInstructionRefTypeArray(com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType[] instructionRefTypeArray);
        
        /**
         * Sets ith "instructionRefType" element
         */
        void setInstructionRefTypeArray(int i, com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType instructionRefType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "instructionRefType" element
         */
        com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType insertNewInstructionRefType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "instructionRefType" element
         */
        com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType addNewInstructionRefType();
        
        /**
         * Removes the ith "instructionRefType" element
         */
        void removeInstructionRefType(int i);
        
        /**
         * Gets array of all "instructionBookingLocation" elements
         */
        com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation[] getInstructionBookingLocationArray();
        
        /**
         * Gets ith "instructionBookingLocation" element
         */
        com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation getInstructionBookingLocationArray(int i);
        
        /**
         * Returns number of "instructionBookingLocation" element
         */
        int sizeOfInstructionBookingLocationArray();
        
        /**
         * Sets array of all "instructionBookingLocation" element
         */
        void setInstructionBookingLocationArray(com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation[] instructionBookingLocationArray);
        
        /**
         * Sets ith "instructionBookingLocation" element
         */
        void setInstructionBookingLocationArray(int i, com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation instructionBookingLocation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "instructionBookingLocation" element
         */
        com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation insertNewInstructionBookingLocation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "instructionBookingLocation" element
         */
        com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation addNewInstructionBookingLocation();
        
        /**
         * Removes the ith "instructionBookingLocation" element
         */
        void removeInstructionBookingLocation(int i);
        
        /**
         * Gets array of all "systemXRefLocation" elements
         */
        com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation[] getSystemXRefLocationArray();
        
        /**
         * Gets ith "systemXRefLocation" element
         */
        com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation getSystemXRefLocationArray(int i);
        
        /**
         * Returns number of "systemXRefLocation" element
         */
        int sizeOfSystemXRefLocationArray();
        
        /**
         * Sets array of all "systemXRefLocation" element
         */
        void setSystemXRefLocationArray(com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation[] systemXRefLocationArray);
        
        /**
         * Sets ith "systemXRefLocation" element
         */
        void setSystemXRefLocationArray(int i, com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation systemXRefLocation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "systemXRefLocation" element
         */
        com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation insertNewSystemXRefLocation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "systemXRefLocation" element
         */
        com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation addNewSystemXRefLocation();
        
        /**
         * Removes the ith "systemXRefLocation" element
         */
        void removeSystemXRefLocation(int i);
        
        /**
         * Gets array of all "externalSystem" elements
         */
        com.stanchart.customer.ExternalSystemDocument.ExternalSystem[] getExternalSystemArray();
        
        /**
         * Gets ith "externalSystem" element
         */
        com.stanchart.customer.ExternalSystemDocument.ExternalSystem getExternalSystemArray(int i);
        
        /**
         * Returns number of "externalSystem" element
         */
        int sizeOfExternalSystemArray();
        
        /**
         * Sets array of all "externalSystem" element
         */
        void setExternalSystemArray(com.stanchart.customer.ExternalSystemDocument.ExternalSystem[] externalSystemArray);
        
        /**
         * Sets ith "externalSystem" element
         */
        void setExternalSystemArray(int i, com.stanchart.customer.ExternalSystemDocument.ExternalSystem externalSystem);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "externalSystem" element
         */
        com.stanchart.customer.ExternalSystemDocument.ExternalSystem insertNewExternalSystem(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "externalSystem" element
         */
        com.stanchart.customer.ExternalSystemDocument.ExternalSystem addNewExternalSystem();
        
        /**
         * Removes the ith "externalSystem" element
         */
        void removeExternalSystem(int i);
        
        /**
         * Gets array of all "externalCustDetail" elements
         */
        com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail[] getExternalCustDetailArray();
        
        /**
         * Gets ith "externalCustDetail" element
         */
        com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail getExternalCustDetailArray(int i);
        
        /**
         * Returns number of "externalCustDetail" element
         */
        int sizeOfExternalCustDetailArray();
        
        /**
         * Sets array of all "externalCustDetail" element
         */
        void setExternalCustDetailArray(com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail[] externalCustDetailArray);
        
        /**
         * Sets ith "externalCustDetail" element
         */
        void setExternalCustDetailArray(int i, com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail externalCustDetail);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "externalCustDetail" element
         */
        com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail insertNewExternalCustDetail(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "externalCustDetail" element
         */
        com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail addNewExternalCustDetail();
        
        /**
         * Removes the ith "externalCustDetail" element
         */
        void removeExternalCustDetail(int i);
        
        /**
         * Gets array of all "securityLocation" elements
         */
        com.stanchart.customer.SecurityLocationDocument.SecurityLocation[] getSecurityLocationArray();
        
        /**
         * Gets ith "securityLocation" element
         */
        com.stanchart.customer.SecurityLocationDocument.SecurityLocation getSecurityLocationArray(int i);
        
        /**
         * Returns number of "securityLocation" element
         */
        int sizeOfSecurityLocationArray();
        
        /**
         * Sets array of all "securityLocation" element
         */
        void setSecurityLocationArray(com.stanchart.customer.SecurityLocationDocument.SecurityLocation[] securityLocationArray);
        
        /**
         * Sets ith "securityLocation" element
         */
        void setSecurityLocationArray(int i, com.stanchart.customer.SecurityLocationDocument.SecurityLocation securityLocation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "securityLocation" element
         */
        com.stanchart.customer.SecurityLocationDocument.SecurityLocation insertNewSecurityLocation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "securityLocation" element
         */
        com.stanchart.customer.SecurityLocationDocument.SecurityLocation addNewSecurityLocation();
        
        /**
         * Removes the ith "securityLocation" element
         */
        void removeSecurityLocation(int i);
        
        /**
         * Gets array of all "securityType" elements
         */
        com.stanchart.customer.SecurityTypeDocument.SecurityType[] getSecurityTypeArray();
        
        /**
         * Gets ith "securityType" element
         */
        com.stanchart.customer.SecurityTypeDocument.SecurityType getSecurityTypeArray(int i);
        
        /**
         * Returns number of "securityType" element
         */
        int sizeOfSecurityTypeArray();
        
        /**
         * Sets array of all "securityType" element
         */
        void setSecurityTypeArray(com.stanchart.customer.SecurityTypeDocument.SecurityType[] securityTypeArray);
        
        /**
         * Sets ith "securityType" element
         */
        void setSecurityTypeArray(int i, com.stanchart.customer.SecurityTypeDocument.SecurityType securityType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "securityType" element
         */
        com.stanchart.customer.SecurityTypeDocument.SecurityType insertNewSecurityType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "securityType" element
         */
        com.stanchart.customer.SecurityTypeDocument.SecurityType addNewSecurityType();
        
        /**
         * Removes the ith "securityType" element
         */
        void removeSecurityType(int i);
        
        /**
         * Gets array of all "securitySubType" elements
         */
        com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType[] getSecuritySubTypeArray();
        
        /**
         * Gets ith "securitySubType" element
         */
        com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType getSecuritySubTypeArray(int i);
        
        /**
         * Returns number of "securitySubType" element
         */
        int sizeOfSecuritySubTypeArray();
        
        /**
         * Sets array of all "securitySubType" element
         */
        void setSecuritySubTypeArray(com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType[] securitySubTypeArray);
        
        /**
         * Sets ith "securitySubType" element
         */
        void setSecuritySubTypeArray(int i, com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType securitySubType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "securitySubType" element
         */
        com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType insertNewSecuritySubType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "securitySubType" element
         */
        com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType addNewSecuritySubType();
        
        /**
         * Removes the ith "securitySubType" element
         */
        void removeSecuritySubType(int i);
        
        /**
         * Gets array of all "com_isis_mhdr" elements
         */
        com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr[] getComIsisMhdrArray();
        
        /**
         * Gets ith "com_isis_mhdr" element
         */
        com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr getComIsisMhdrArray(int i);
        
        /**
         * Returns number of "com_isis_mhdr" element
         */
        int sizeOfComIsisMhdrArray();
        
        /**
         * Sets array of all "com_isis_mhdr" element
         */
        void setComIsisMhdrArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr[] comIsisMhdrArray);
        
        /**
         * Sets ith "com_isis_mhdr" element
         */
        void setComIsisMhdrArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr comIsisMhdr);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "com_isis_mhdr" element
         */
        com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr insertNewComIsisMhdr(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "com_isis_mhdr" element
         */
        com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr addNewComIsisMhdr();
        
        /**
         * Removes the ith "com_isis_mhdr" element
         */
        void removeComIsisMhdr(int i);
        
        /**
         * Gets array of all "message" elements
         */
        com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message[] getMessageArray();
        
        /**
         * Gets ith "message" element
         */
        com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message getMessageArray(int i);
        
        /**
         * Returns number of "message" element
         */
        int sizeOfMessageArray();
        
        /**
         * Sets array of all "message" element
         */
        void setMessageArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message[] messageArray);
        
        /**
         * Sets ith "message" element
         */
        void setMessageArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message message);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "message" element
         */
        com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message insertNewMessage(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "message" element
         */
        com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message addNewMessage();
        
        /**
         * Removes the ith "message" element
         */
        void removeMessage(int i);
        
        /**
         * An XML com_isis_mhdr(@).
         *
         * This is a complex type.
         */
        public interface ComIsisMhdr extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComIsisMhdr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("comisismhdrb49felemtype");
            
            /**
             * Gets the "VerId" element
             */
            java.lang.String getVerId();
            
            /**
             * Gets (as xml) the "VerId" element
             */
            org.apache.xmlbeans.XmlString xgetVerId();
            
            /**
             * True if has "VerId" element
             */
            boolean isSetVerId();
            
            /**
             * Sets the "VerId" element
             */
            void setVerId(java.lang.String verId);
            
            /**
             * Sets (as xml) the "VerId" element
             */
            void xsetVerId(org.apache.xmlbeans.XmlString verId);
            
            /**
             * Unsets the "VerId" element
             */
            void unsetVerId();
            
            /**
             * Gets array of all "HdrLst" elements
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.HdrLst[] getHdrLstArray();
            
            /**
             * Gets ith "HdrLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.HdrLst getHdrLstArray(int i);
            
            /**
             * Returns number of "HdrLst" element
             */
            int sizeOfHdrLstArray();
            
            /**
             * Sets array of all "HdrLst" element
             */
            void setHdrLstArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.HdrLst[] hdrLstArray);
            
            /**
             * Sets ith "HdrLst" element
             */
            void setHdrLstArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.HdrLst hdrLst);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "HdrLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.HdrLst insertNewHdrLst(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "HdrLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.HdrLst addNewHdrLst();
            
            /**
             * Removes the ith "HdrLst" element
             */
            void removeHdrLst(int i);
            
            /**
             * Gets array of all "SrcLst" elements
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.SrcLst[] getSrcLstArray();
            
            /**
             * Gets ith "SrcLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.SrcLst getSrcLstArray(int i);
            
            /**
             * Returns number of "SrcLst" element
             */
            int sizeOfSrcLstArray();
            
            /**
             * Sets array of all "SrcLst" element
             */
            void setSrcLstArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.SrcLst[] srcLstArray);
            
            /**
             * Sets ith "SrcLst" element
             */
            void setSrcLstArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.SrcLst srcLst);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "SrcLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.SrcLst insertNewSrcLst(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "SrcLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.SrcLst addNewSrcLst();
            
            /**
             * Removes the ith "SrcLst" element
             */
            void removeSrcLst(int i);
            
            /**
             * Gets array of all "AdapterUsrIdLst" elements
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.AdapterUsrIdLst[] getAdapterUsrIdLstArray();
            
            /**
             * Gets ith "AdapterUsrIdLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.AdapterUsrIdLst getAdapterUsrIdLstArray(int i);
            
            /**
             * Returns number of "AdapterUsrIdLst" element
             */
            int sizeOfAdapterUsrIdLstArray();
            
            /**
             * Sets array of all "AdapterUsrIdLst" element
             */
            void setAdapterUsrIdLstArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.AdapterUsrIdLst[] adapterUsrIdLstArray);
            
            /**
             * Sets ith "AdapterUsrIdLst" element
             */
            void setAdapterUsrIdLstArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.AdapterUsrIdLst adapterUsrIdLst);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "AdapterUsrIdLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.AdapterUsrIdLst insertNewAdapterUsrIdLst(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "AdapterUsrIdLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.AdapterUsrIdLst addNewAdapterUsrIdLst();
            
            /**
             * Removes the ith "AdapterUsrIdLst" element
             */
            void removeAdapterUsrIdLst(int i);
            
            /**
             * Gets array of all "RcnclLst" elements
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.RcnclLst[] getRcnclLstArray();
            
            /**
             * Gets ith "RcnclLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.RcnclLst getRcnclLstArray(int i);
            
            /**
             * Returns number of "RcnclLst" element
             */
            int sizeOfRcnclLstArray();
            
            /**
             * Sets array of all "RcnclLst" element
             */
            void setRcnclLstArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.RcnclLst[] rcnclLstArray);
            
            /**
             * Sets ith "RcnclLst" element
             */
            void setRcnclLstArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.RcnclLst rcnclLst);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "RcnclLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.RcnclLst insertNewRcnclLst(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "RcnclLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.RcnclLst addNewRcnclLst();
            
            /**
             * Removes the ith "RcnclLst" element
             */
            void removeRcnclLst(int i);
            
            /**
             * Gets the "MsgTp" element
             */
            java.lang.String getMsgTp();
            
            /**
             * Gets (as xml) the "MsgTp" element
             */
            org.apache.xmlbeans.XmlString xgetMsgTp();
            
            /**
             * True if has "MsgTp" element
             */
            boolean isSetMsgTp();
            
            /**
             * Sets the "MsgTp" element
             */
            void setMsgTp(java.lang.String msgTp);
            
            /**
             * Sets (as xml) the "MsgTp" element
             */
            void xsetMsgTp(org.apache.xmlbeans.XmlString msgTp);
            
            /**
             * Unsets the "MsgTp" element
             */
            void unsetMsgTp();
            
            /**
             * Gets the "ApplMsgUUId" element
             */
            java.lang.String getApplMsgUUId();
            
            /**
             * Gets (as xml) the "ApplMsgUUId" element
             */
            org.apache.xmlbeans.XmlString xgetApplMsgUUId();
            
            /**
             * True if has "ApplMsgUUId" element
             */
            boolean isSetApplMsgUUId();
            
            /**
             * Sets the "ApplMsgUUId" element
             */
            void setApplMsgUUId(java.lang.String applMsgUUId);
            
            /**
             * Sets (as xml) the "ApplMsgUUId" element
             */
            void xsetApplMsgUUId(org.apache.xmlbeans.XmlString applMsgUUId);
            
            /**
             * Unsets the "ApplMsgUUId" element
             */
            void unsetApplMsgUUId();
            
            /**
             * Gets array of all "ApplKeyLst" elements
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.ApplKeyLst[] getApplKeyLstArray();
            
            /**
             * Gets ith "ApplKeyLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.ApplKeyLst getApplKeyLstArray(int i);
            
            /**
             * Returns number of "ApplKeyLst" element
             */
            int sizeOfApplKeyLstArray();
            
            /**
             * Sets array of all "ApplKeyLst" element
             */
            void setApplKeyLstArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.ApplKeyLst[] applKeyLstArray);
            
            /**
             * Sets ith "ApplKeyLst" element
             */
            void setApplKeyLstArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.ApplKeyLst applKeyLst);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ApplKeyLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.ApplKeyLst insertNewApplKeyLst(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ApplKeyLst" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.ApplKeyLst addNewApplKeyLst();
            
            /**
             * Removes the ith "ApplKeyLst" element
             */
            void removeApplKeyLst(int i);
            
            /**
             * Gets the "MsgUUId" element
             */
            java.lang.String getMsgUUId();
            
            /**
             * Gets (as xml) the "MsgUUId" element
             */
            org.apache.xmlbeans.XmlString xgetMsgUUId();
            
            /**
             * True if has "MsgUUId" element
             */
            boolean isSetMsgUUId();
            
            /**
             * Sets the "MsgUUId" element
             */
            void setMsgUUId(java.lang.String msgUUId);
            
            /**
             * Sets (as xml) the "MsgUUId" element
             */
            void xsetMsgUUId(org.apache.xmlbeans.XmlString msgUUId);
            
            /**
             * Unsets the "MsgUUId" element
             */
            void unsetMsgUUId();
            
            /**
             * Gets the "UsrTxt" element
             */
            java.lang.String getUsrTxt();
            
            /**
             * Gets (as xml) the "UsrTxt" element
             */
            org.apache.xmlbeans.XmlString xgetUsrTxt();
            
            /**
             * True if has "UsrTxt" element
             */
            boolean isSetUsrTxt();
            
            /**
             * Sets the "UsrTxt" element
             */
            void setUsrTxt(java.lang.String usrTxt);
            
            /**
             * Sets (as xml) the "UsrTxt" element
             */
            void xsetUsrTxt(org.apache.xmlbeans.XmlString usrTxt);
            
            /**
             * Unsets the "UsrTxt" element
             */
            void unsetUsrTxt();
            
            /**
             * An XML HdrLst(@).
             *
             * This is a complex type.
             */
            public interface HdrLst extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HdrLst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("hdrlst29c2elemtype");
                
                /**
                 * Gets the "ErrHdrF" element
                 */
                java.lang.String getErrHdrF();
                
                /**
                 * Gets (as xml) the "ErrHdrF" element
                 */
                org.apache.xmlbeans.XmlString xgetErrHdrF();
                
                /**
                 * True if has "ErrHdrF" element
                 */
                boolean isSetErrHdrF();
                
                /**
                 * Sets the "ErrHdrF" element
                 */
                void setErrHdrF(java.lang.String errHdrF);
                
                /**
                 * Sets (as xml) the "ErrHdrF" element
                 */
                void xsetErrHdrF(org.apache.xmlbeans.XmlString errHdrF);
                
                /**
                 * Unsets the "ErrHdrF" element
                 */
                void unsetErrHdrF();
                
                /**
                 * Gets the "AudtHdrF" element
                 */
                java.lang.String getAudtHdrF();
                
                /**
                 * Gets (as xml) the "AudtHdrF" element
                 */
                org.apache.xmlbeans.XmlString xgetAudtHdrF();
                
                /**
                 * True if has "AudtHdrF" element
                 */
                boolean isSetAudtHdrF();
                
                /**
                 * Sets the "AudtHdrF" element
                 */
                void setAudtHdrF(java.lang.String audtHdrF);
                
                /**
                 * Sets (as xml) the "AudtHdrF" element
                 */
                void xsetAudtHdrF(org.apache.xmlbeans.XmlString audtHdrF);
                
                /**
                 * Unsets the "AudtHdrF" element
                 */
                void unsetAudtHdrF();
                
                /**
                 * Gets the "TrcHdrF" element
                 */
                java.lang.String getTrcHdrF();
                
                /**
                 * Gets (as xml) the "TrcHdrF" element
                 */
                org.apache.xmlbeans.XmlString xgetTrcHdrF();
                
                /**
                 * True if has "TrcHdrF" element
                 */
                boolean isSetTrcHdrF();
                
                /**
                 * Sets the "TrcHdrF" element
                 */
                void setTrcHdrF(java.lang.String trcHdrF);
                
                /**
                 * Sets (as xml) the "TrcHdrF" element
                 */
                void xsetTrcHdrF(org.apache.xmlbeans.XmlString trcHdrF);
                
                /**
                 * Unsets the "TrcHdrF" element
                 */
                void unsetTrcHdrF();
                
                /**
                 * Gets the "ErrPayloadF" element
                 */
                java.lang.String getErrPayloadF();
                
                /**
                 * Gets (as xml) the "ErrPayloadF" element
                 */
                org.apache.xmlbeans.XmlString xgetErrPayloadF();
                
                /**
                 * True if has "ErrPayloadF" element
                 */
                boolean isSetErrPayloadF();
                
                /**
                 * Sets the "ErrPayloadF" element
                 */
                void setErrPayloadF(java.lang.String errPayloadF);
                
                /**
                 * Sets (as xml) the "ErrPayloadF" element
                 */
                void xsetErrPayloadF(org.apache.xmlbeans.XmlString errPayloadF);
                
                /**
                 * Unsets the "ErrPayloadF" element
                 */
                void unsetErrPayloadF();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.HdrLst newInstance() {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.HdrLst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.HdrLst newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.HdrLst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML SrcLst(@).
             *
             * This is a complex type.
             */
            public interface SrcLst extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SrcLst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("srclst3d14elemtype");
                
                /**
                 * Gets the "LocnId" element
                 */
                java.lang.String getLocnId();
                
                /**
                 * Gets (as xml) the "LocnId" element
                 */
                org.apache.xmlbeans.XmlString xgetLocnId();
                
                /**
                 * True if has "LocnId" element
                 */
                boolean isSetLocnId();
                
                /**
                 * Sets the "LocnId" element
                 */
                void setLocnId(java.lang.String locnId);
                
                /**
                 * Sets (as xml) the "LocnId" element
                 */
                void xsetLocnId(org.apache.xmlbeans.XmlString locnId);
                
                /**
                 * Unsets the "LocnId" element
                 */
                void unsetLocnId();
                
                /**
                 * Gets the "SystemId" element
                 */
                java.lang.String getSystemId();
                
                /**
                 * Gets (as xml) the "SystemId" element
                 */
                org.apache.xmlbeans.XmlString xgetSystemId();
                
                /**
                 * True if has "SystemId" element
                 */
                boolean isSetSystemId();
                
                /**
                 * Sets the "SystemId" element
                 */
                void setSystemId(java.lang.String systemId);
                
                /**
                 * Sets (as xml) the "SystemId" element
                 */
                void xsetSystemId(org.apache.xmlbeans.XmlString systemId);
                
                /**
                 * Unsets the "SystemId" element
                 */
                void unsetSystemId();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.SrcLst newInstance() {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.SrcLst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.SrcLst newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.SrcLst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML AdapterUsrIdLst(@).
             *
             * This is a complex type.
             */
            public interface AdapterUsrIdLst extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdapterUsrIdLst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("adapterusridlstab68elemtype");
                
                /**
                 * Gets the "UsrId" element
                 */
                java.lang.String getUsrId();
                
                /**
                 * Gets (as xml) the "UsrId" element
                 */
                org.apache.xmlbeans.XmlString xgetUsrId();
                
                /**
                 * True if has "UsrId" element
                 */
                boolean isSetUsrId();
                
                /**
                 * Sets the "UsrId" element
                 */
                void setUsrId(java.lang.String usrId);
                
                /**
                 * Sets (as xml) the "UsrId" element
                 */
                void xsetUsrId(org.apache.xmlbeans.XmlString usrId);
                
                /**
                 * Unsets the "UsrId" element
                 */
                void unsetUsrId();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.AdapterUsrIdLst newInstance() {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.AdapterUsrIdLst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.AdapterUsrIdLst newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.AdapterUsrIdLst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML RcnclLst(@).
             *
             * This is a complex type.
             */
            public interface RcnclLst extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RcnclLst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("rcncllst5f32elemtype");
                
                /**
                 * Gets the "Amt" element
                 */
                java.lang.String getAmt();
                
                /**
                 * Gets (as xml) the "Amt" element
                 */
                org.apache.xmlbeans.XmlString xgetAmt();
                
                /**
                 * True if has "Amt" element
                 */
                boolean isSetAmt();
                
                /**
                 * Sets the "Amt" element
                 */
                void setAmt(java.lang.String amt);
                
                /**
                 * Sets (as xml) the "Amt" element
                 */
                void xsetAmt(org.apache.xmlbeans.XmlString amt);
                
                /**
                 * Unsets the "Amt" element
                 */
                void unsetAmt();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.RcnclLst newInstance() {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.RcnclLst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.RcnclLst newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.RcnclLst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ApplKeyLst(@).
             *
             * This is a complex type.
             */
            public interface ApplKeyLst extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApplKeyLst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("applkeylst8504elemtype");
                
                /**
                 * Gets the "ApplKey" element
                 */
                java.lang.String getApplKey();
                
                /**
                 * Gets (as xml) the "ApplKey" element
                 */
                org.apache.xmlbeans.XmlString xgetApplKey();
                
                /**
                 * True if has "ApplKey" element
                 */
                boolean isSetApplKey();
                
                /**
                 * Sets the "ApplKey" element
                 */
                void setApplKey(java.lang.String applKey);
                
                /**
                 * Sets (as xml) the "ApplKey" element
                 */
                void xsetApplKey(org.apache.xmlbeans.XmlString applKey);
                
                /**
                 * Unsets the "ApplKey" element
                 */
                void unsetApplKey();
                
                /**
                 * Gets the "ApplVal" element
                 */
                java.lang.String getApplVal();
                
                /**
                 * Gets (as xml) the "ApplVal" element
                 */
                org.apache.xmlbeans.XmlString xgetApplVal();
                
                /**
                 * True if has "ApplVal" element
                 */
                boolean isSetApplVal();
                
                /**
                 * Sets the "ApplVal" element
                 */
                void setApplVal(java.lang.String applVal);
                
                /**
                 * Sets (as xml) the "ApplVal" element
                 */
                void xsetApplVal(org.apache.xmlbeans.XmlString applVal);
                
                /**
                 * Unsets the "ApplVal" element
                 */
                void unsetApplVal();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.ApplKeyLst newInstance() {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.ApplKeyLst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.ApplKeyLst newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr.ApplKeyLst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr newInstance() {
                  return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.ComIsisMhdr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML message(@).
         *
         * This is a complex type.
         */
        public interface Message extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Message.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("messagec770elemtype");
            
            /**
             * Gets the "messageId" element
             */
            java.lang.String getMessageId();
            
            /**
             * Gets (as xml) the "messageId" element
             */
            org.apache.xmlbeans.XmlString xgetMessageId();
            
            /**
             * True if has "messageId" element
             */
            boolean isSetMessageId();
            
            /**
             * Sets the "messageId" element
             */
            void setMessageId(java.lang.String messageId);
            
            /**
             * Sets (as xml) the "messageId" element
             */
            void xsetMessageId(org.apache.xmlbeans.XmlString messageId);
            
            /**
             * Unsets the "messageId" element
             */
            void unsetMessageId();
            
            /**
             * Gets the "messageType" element
             */
            java.lang.String getMessageType();
            
            /**
             * Gets (as xml) the "messageType" element
             */
            org.apache.xmlbeans.XmlString xgetMessageType();
            
            /**
             * True if has "messageType" element
             */
            boolean isSetMessageType();
            
            /**
             * Sets the "messageType" element
             */
            void setMessageType(java.lang.String messageType);
            
            /**
             * Sets (as xml) the "messageType" element
             */
            void xsetMessageType(org.apache.xmlbeans.XmlString messageType);
            
            /**
             * Unsets the "messageType" element
             */
            void unsetMessageType();
            
            /**
             * Gets the "publishType" element
             */
            java.lang.String getPublishType();
            
            /**
             * Gets (as xml) the "publishType" element
             */
            org.apache.xmlbeans.XmlString xgetPublishType();
            
            /**
             * True if has "publishType" element
             */
            boolean isSetPublishType();
            
            /**
             * Sets the "publishType" element
             */
            void setPublishType(java.lang.String publishType);
            
            /**
             * Sets (as xml) the "publishType" element
             */
            void xsetPublishType(org.apache.xmlbeans.XmlString publishType);
            
            /**
             * Unsets the "publishType" element
             */
            void unsetPublishType();
            
            /**
             * Gets the "publishDate" element
             */
            java.lang.String getPublishDate();
            
            /**
             * Gets (as xml) the "publishDate" element
             */
            org.apache.xmlbeans.XmlString xgetPublishDate();
            
            /**
             * True if has "publishDate" element
             */
            boolean isSetPublishDate();
            
            /**
             * Sets the "publishDate" element
             */
            void setPublishDate(java.lang.String publishDate);
            
            /**
             * Sets (as xml) the "publishDate" element
             */
            void xsetPublishDate(org.apache.xmlbeans.XmlString publishDate);
            
            /**
             * Unsets the "publishDate" element
             */
            void unsetPublishDate();
            
            /**
             * Gets the "topicName" element
             */
            java.lang.String getTopicName();
            
            /**
             * Gets (as xml) the "topicName" element
             */
            org.apache.xmlbeans.XmlString xgetTopicName();
            
            /**
             * True if has "topicName" element
             */
            boolean isSetTopicName();
            
            /**
             * Sets the "topicName" element
             */
            void setTopicName(java.lang.String topicName);
            
            /**
             * Sets (as xml) the "topicName" element
             */
            void xsetTopicName(org.apache.xmlbeans.XmlString topicName);
            
            /**
             * Unsets the "topicName" element
             */
            void unsetTopicName();
            
            /**
             * Gets the "subscriberId" element
             */
            java.lang.String getSubscriberId();
            
            /**
             * Gets (as xml) the "subscriberId" element
             */
            org.apache.xmlbeans.XmlString xgetSubscriberId();
            
            /**
             * True if has "subscriberId" element
             */
            boolean isSetSubscriberId();
            
            /**
             * Sets the "subscriberId" element
             */
            void setSubscriberId(java.lang.String subscriberId);
            
            /**
             * Sets (as xml) the "subscriberId" element
             */
            void xsetSubscriberId(org.apache.xmlbeans.XmlString subscriberId);
            
            /**
             * Unsets the "subscriberId" element
             */
            void unsetSubscriberId();
            
            /**
             * Gets array of all "transactionProcessingSystems" elements
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.TransactionProcessingSystems[] getTransactionProcessingSystemsArray();
            
            /**
             * Gets ith "transactionProcessingSystems" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.TransactionProcessingSystems getTransactionProcessingSystemsArray(int i);
            
            /**
             * Returns number of "transactionProcessingSystems" element
             */
            int sizeOfTransactionProcessingSystemsArray();
            
            /**
             * Sets array of all "transactionProcessingSystems" element
             */
            void setTransactionProcessingSystemsArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.TransactionProcessingSystems[] transactionProcessingSystemsArray);
            
            /**
             * Sets ith "transactionProcessingSystems" element
             */
            void setTransactionProcessingSystemsArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.TransactionProcessingSystems transactionProcessingSystems);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "transactionProcessingSystems" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.TransactionProcessingSystems insertNewTransactionProcessingSystems(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "transactionProcessingSystems" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.TransactionProcessingSystems addNewTransactionProcessingSystems();
            
            /**
             * Removes the ith "transactionProcessingSystems" element
             */
            void removeTransactionProcessingSystems(int i);
            
            /**
             * Gets array of all "legalEntity" elements
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity[] getLegalEntityArray();
            
            /**
             * Gets ith "legalEntity" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity getLegalEntityArray(int i);
            
            /**
             * Returns number of "legalEntity" element
             */
            int sizeOfLegalEntityArray();
            
            /**
             * Sets array of all "legalEntity" element
             */
            void setLegalEntityArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity[] legalEntityArray);
            
            /**
             * Sets ith "legalEntity" element
             */
            void setLegalEntityArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity legalEntity);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "legalEntity" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity insertNewLegalEntity(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "legalEntity" element
             */
            com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity addNewLegalEntity();
            
            /**
             * Removes the ith "legalEntity" element
             */
            void removeLegalEntity(int i);
            
            /**
             * An XML transactionProcessingSystems(@).
             *
             * This is a complex type.
             */
            public interface TransactionProcessingSystems extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransactionProcessingSystems.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("transactionprocessingsystems0d0felemtype");
                
                /**
                 * Gets the "bkgLocationCountry" element
                 */
                java.lang.String getBkgLocationCountry();
                
                /**
                 * Gets (as xml) the "bkgLocationCountry" element
                 */
                org.apache.xmlbeans.XmlString xgetBkgLocationCountry();
                
                /**
                 * True if has "bkgLocationCountry" element
                 */
                boolean isSetBkgLocationCountry();
                
                /**
                 * Sets the "bkgLocationCountry" element
                 */
                void setBkgLocationCountry(java.lang.String bkgLocationCountry);
                
                /**
                 * Sets (as xml) the "bkgLocationCountry" element
                 */
                void xsetBkgLocationCountry(org.apache.xmlbeans.XmlString bkgLocationCountry);
                
                /**
                 * Unsets the "bkgLocationCountry" element
                 */
                void unsetBkgLocationCountry();
                
                /**
                 * Gets the "bkgLocationOrganization" element
                 */
                java.lang.String getBkgLocationOrganization();
                
                /**
                 * Gets (as xml) the "bkgLocationOrganization" element
                 */
                org.apache.xmlbeans.XmlString xgetBkgLocationOrganization();
                
                /**
                 * True if has "bkgLocationOrganization" element
                 */
                boolean isSetBkgLocationOrganization();
                
                /**
                 * Sets the "bkgLocationOrganization" element
                 */
                void setBkgLocationOrganization(java.lang.String bkgLocationOrganization);
                
                /**
                 * Sets (as xml) the "bkgLocationOrganization" element
                 */
                void xsetBkgLocationOrganization(org.apache.xmlbeans.XmlString bkgLocationOrganization);
                
                /**
                 * Unsets the "bkgLocationOrganization" element
                 */
                void unsetBkgLocationOrganization();
                
                /**
                 * Gets the "extSystemTypeNum" element
                 */
                java.lang.String getExtSystemTypeNum();
                
                /**
                 * Gets (as xml) the "extSystemTypeNum" element
                 */
                org.apache.xmlbeans.XmlString xgetExtSystemTypeNum();
                
                /**
                 * True if has "extSystemTypeNum" element
                 */
                boolean isSetExtSystemTypeNum();
                
                /**
                 * Sets the "extSystemTypeNum" element
                 */
                void setExtSystemTypeNum(java.lang.String extSystemTypeNum);
                
                /**
                 * Sets (as xml) the "extSystemTypeNum" element
                 */
                void xsetExtSystemTypeNum(org.apache.xmlbeans.XmlString extSystemTypeNum);
                
                /**
                 * Unsets the "extSystemTypeNum" element
                 */
                void unsetExtSystemTypeNum();
                
                /**
                 * Gets the "extSystemTypeValue" element
                 */
                java.lang.String getExtSystemTypeValue();
                
                /**
                 * Gets (as xml) the "extSystemTypeValue" element
                 */
                org.apache.xmlbeans.XmlString xgetExtSystemTypeValue();
                
                /**
                 * True if has "extSystemTypeValue" element
                 */
                boolean isSetExtSystemTypeValue();
                
                /**
                 * Sets the "extSystemTypeValue" element
                 */
                void setExtSystemTypeValue(java.lang.String extSystemTypeValue);
                
                /**
                 * Sets (as xml) the "extSystemTypeValue" element
                 */
                void xsetExtSystemTypeValue(org.apache.xmlbeans.XmlString extSystemTypeValue);
                
                /**
                 * Unsets the "extSystemTypeValue" element
                 */
                void unsetExtSystemTypeValue();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.TransactionProcessingSystems newInstance() {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.TransactionProcessingSystems) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.TransactionProcessingSystems newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.TransactionProcessingSystems) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML legalEntity(@).
             *
             * This is a complex type.
             */
            public interface LegalEntity extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LegalEntity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("legalentityc1e8elemtype");
                
                /**
                 * Gets array of all "mainProfileDetails" elements
                 */
                com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails[] getMainProfileDetailsArray();
                
                /**
                 * Gets ith "mainProfileDetails" element
                 */
                com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails getMainProfileDetailsArray(int i);
                
                /**
                 * Returns number of "mainProfileDetails" element
                 */
                int sizeOfMainProfileDetailsArray();
                
                /**
                 * Sets array of all "mainProfileDetails" element
                 */
                void setMainProfileDetailsArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails[] mainProfileDetailsArray);
                
                /**
                 * Sets ith "mainProfileDetails" element
                 */
                void setMainProfileDetailsArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails mainProfileDetails);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "mainProfileDetails" element
                 */
                com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails insertNewMainProfileDetails(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "mainProfileDetails" element
                 */
                com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails addNewMainProfileDetails();
                
                /**
                 * Removes the ith "mainProfileDetails" element
                 */
                void removeMainProfileDetails(int i);
                
                /**
                 * Gets array of all "subProfileDetails" elements
                 */
                com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails[] getSubProfileDetailsArray();
                
                /**
                 * Gets ith "subProfileDetails" element
                 */
                com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails getSubProfileDetailsArray(int i);
                
                /**
                 * Returns number of "subProfileDetails" element
                 */
                int sizeOfSubProfileDetailsArray();
                
                /**
                 * Sets array of all "subProfileDetails" element
                 */
                void setSubProfileDetailsArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails[] subProfileDetailsArray);
                
                /**
                 * Sets ith "subProfileDetails" element
                 */
                void setSubProfileDetailsArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails subProfileDetails);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "subProfileDetails" element
                 */
                com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails insertNewSubProfileDetails(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "subProfileDetails" element
                 */
                com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails addNewSubProfileDetails();
                
                /**
                 * Removes the ith "subProfileDetails" element
                 */
                void removeSubProfileDetails(int i);
                
                /**
                 * An XML mainProfileDetails(@).
                 *
                 * This is a complex type.
                 */
                public interface MainProfileDetails extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MainProfileDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("mainprofiledetailsb1e6elemtype");
                    
                    /**
                     * Gets array of all "mainProfile" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile[] getMainProfileArray();
                    
                    /**
                     * Gets ith "mainProfile" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile getMainProfileArray(int i);
                    
                    /**
                     * Returns number of "mainProfile" element
                     */
                    int sizeOfMainProfileArray();
                    
                    /**
                     * Sets array of all "mainProfile" element
                     */
                    void setMainProfileArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile[] mainProfileArray);
                    
                    /**
                     * Sets ith "mainProfile" element
                     */
                    void setMainProfileArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile mainProfile);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "mainProfile" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile insertNewMainProfile(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "mainProfile" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile addNewMainProfile();
                    
                    /**
                     * Removes the ith "mainProfile" element
                     */
                    void removeMainProfile(int i);
                    
                    /**
                     * Gets array of all "registeredAddress" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.RegisteredAddress[] getRegisteredAddressArray();
                    
                    /**
                     * Gets ith "registeredAddress" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.RegisteredAddress getRegisteredAddressArray(int i);
                    
                    /**
                     * Returns number of "registeredAddress" element
                     */
                    int sizeOfRegisteredAddressArray();
                    
                    /**
                     * Sets array of all "registeredAddress" element
                     */
                    void setRegisteredAddressArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.RegisteredAddress[] registeredAddressArray);
                    
                    /**
                     * Sets ith "registeredAddress" element
                     */
                    void setRegisteredAddressArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.RegisteredAddress registeredAddress);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "registeredAddress" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.RegisteredAddress insertNewRegisteredAddress(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "registeredAddress" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.RegisteredAddress addNewRegisteredAddress();
                    
                    /**
                     * Removes the ith "registeredAddress" element
                     */
                    void removeRegisteredAddress(int i);
                    
                    /**
                     * Gets array of all "creditGrade" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade[] getCreditGradeArray();
                    
                    /**
                     * Gets ith "creditGrade" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade getCreditGradeArray(int i);
                    
                    /**
                     * Returns number of "creditGrade" element
                     */
                    int sizeOfCreditGradeArray();
                    
                    /**
                     * Sets array of all "creditGrade" element
                     */
                    void setCreditGradeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade[] creditGradeArray);
                    
                    /**
                     * Sets ith "creditGrade" element
                     */
                    void setCreditGradeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade creditGrade);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "creditGrade" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade insertNewCreditGrade(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "creditGrade" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade addNewCreditGrade();
                    
                    /**
                     * Removes the ith "creditGrade" element
                     */
                    void removeCreditGrade(int i);
                    
                    /**
                     * Gets array of all "ISIC" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC[] getISICArray();
                    
                    /**
                     * Gets ith "ISIC" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC getISICArray(int i);
                    
                    /**
                     * Returns number of "ISIC" element
                     */
                    int sizeOfISICArray();
                    
                    /**
                     * Sets array of all "ISIC" element
                     */
                    void setISICArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC[] isicArray);
                    
                    /**
                     * Sets ith "ISIC" element
                     */
                    void setISICArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC isic);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "ISIC" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC insertNewISIC(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "ISIC" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC addNewISIC();
                    
                    /**
                     * Removes the ith "ISIC" element
                     */
                    void removeISIC(int i);
                    
                    /**
                     * Gets array of all "creditStatus" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus[] getCreditStatusArray();
                    
                    /**
                     * Gets ith "creditStatus" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus getCreditStatusArray(int i);
                    
                    /**
                     * Returns number of "creditStatus" element
                     */
                    int sizeOfCreditStatusArray();
                    
                    /**
                     * Sets array of all "creditStatus" element
                     */
                    void setCreditStatusArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus[] creditStatusArray);
                    
                    /**
                     * Sets ith "creditStatus" element
                     */
                    void setCreditStatusArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus creditStatus);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "creditStatus" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus insertNewCreditStatus(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "creditStatus" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus addNewCreditStatus();
                    
                    /**
                     * Removes the ith "creditStatus" element
                     */
                    void removeCreditStatus(int i);
                    
                    /**
                     * Gets array of all "mainProfileInstructionRef" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfileInstructionRef[] getMainProfileInstructionRefArray();
                    
                    /**
                     * Gets ith "mainProfileInstructionRef" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfileInstructionRef getMainProfileInstructionRefArray(int i);
                    
                    /**
                     * Returns number of "mainProfileInstructionRef" element
                     */
                    int sizeOfMainProfileInstructionRefArray();
                    
                    /**
                     * Sets array of all "mainProfileInstructionRef" element
                     */
                    void setMainProfileInstructionRefArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfileInstructionRef[] mainProfileInstructionRefArray);
                    
                    /**
                     * Sets ith "mainProfileInstructionRef" element
                     */
                    void setMainProfileInstructionRefArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfileInstructionRef mainProfileInstructionRef);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "mainProfileInstructionRef" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfileInstructionRef insertNewMainProfileInstructionRef(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "mainProfileInstructionRef" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfileInstructionRef addNewMainProfileInstructionRef();
                    
                    /**
                     * Removes the ith "mainProfileInstructionRef" element
                     */
                    void removeMainProfileInstructionRef(int i);
                    
                    /**
                     * Gets array of all "knowYourCustomer" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer[] getKnowYourCustomerArray();
                    
                    /**
                     * Gets ith "knowYourCustomer" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer getKnowYourCustomerArray(int i);
                    
                    /**
                     * Returns number of "knowYourCustomer" element
                     */
                    int sizeOfKnowYourCustomerArray();
                    
                    /**
                     * Sets array of all "knowYourCustomer" element
                     */
                    void setKnowYourCustomerArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer[] knowYourCustomerArray);
                    
                    /**
                     * Sets ith "knowYourCustomer" element
                     */
                    void setKnowYourCustomerArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer knowYourCustomer);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "knowYourCustomer" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer insertNewKnowYourCustomer(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "knowYourCustomer" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer addNewKnowYourCustomer();
                    
                    /**
                     * Removes the ith "knowYourCustomer" element
                     */
                    void removeKnowYourCustomer(int i);
                    
                    /**
                     * An XML mainProfile(@).
                     *
                     * This is a complex type.
                     */
                    public interface MainProfile extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MainProfile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("mainprofile493aelemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "shortName" element
                       */
                      java.lang.String getShortName();
                      
                      /**
                       * Gets (as xml) the "shortName" element
                       */
                      org.apache.xmlbeans.XmlString xgetShortName();
                      
                      /**
                       * True if has "shortName" element
                       */
                      boolean isSetShortName();
                      
                      /**
                       * Sets the "shortName" element
                       */
                      void setShortName(java.lang.String shortName);
                      
                      /**
                       * Sets (as xml) the "shortName" element
                       */
                      void xsetShortName(org.apache.xmlbeans.XmlString shortName);
                      
                      /**
                       * Unsets the "shortName" element
                       */
                      void unsetShortName();
                      
                      /**
                       * Gets the "legalName" element
                       */
                      java.lang.String getLegalName();
                      
                      /**
                       * Gets (as xml) the "legalName" element
                       */
                      org.apache.xmlbeans.XmlString xgetLegalName();
                      
                      /**
                       * True if has "legalName" element
                       */
                      boolean isSetLegalName();
                      
                      /**
                       * Sets the "legalName" element
                       */
                      void setLegalName(java.lang.String legalName);
                      
                      /**
                       * Sets (as xml) the "legalName" element
                       */
                      void xsetLegalName(org.apache.xmlbeans.XmlString legalName);
                      
                      /**
                       * Unsets the "legalName" element
                       */
                      void unsetLegalName();
                      
                      /**
                       * Gets array of all "legalConstitution" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.LegalConstitution[] getLegalConstitutionArray();
                      
                      /**
                       * Gets ith "legalConstitution" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.LegalConstitution getLegalConstitutionArray(int i);
                      
                      /**
                       * Returns number of "legalConstitution" element
                       */
                      int sizeOfLegalConstitutionArray();
                      
                      /**
                       * Sets array of all "legalConstitution" element
                       */
                      void setLegalConstitutionArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.LegalConstitution[] legalConstitutionArray);
                      
                      /**
                       * Sets ith "legalConstitution" element
                       */
                      void setLegalConstitutionArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.LegalConstitution legalConstitution);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "legalConstitution" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.LegalConstitution insertNewLegalConstitution(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "legalConstitution" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.LegalConstitution addNewLegalConstitution();
                      
                      /**
                       * Removes the ith "legalConstitution" element
                       */
                      void removeLegalConstitution(int i);
                      
                      /**
                       * Gets the "incorporatedCountry" element
                       */
                      java.lang.String getIncorporatedCountry();
                      
                      /**
                       * Gets (as xml) the "incorporatedCountry" element
                       */
                      org.apache.xmlbeans.XmlString xgetIncorporatedCountry();
                      
                      /**
                       * True if has "incorporatedCountry" element
                       */
                      boolean isSetIncorporatedCountry();
                      
                      /**
                       * Sets the "incorporatedCountry" element
                       */
                      void setIncorporatedCountry(java.lang.String incorporatedCountry);
                      
                      /**
                       * Sets (as xml) the "incorporatedCountry" element
                       */
                      void xsetIncorporatedCountry(org.apache.xmlbeans.XmlString incorporatedCountry);
                      
                      /**
                       * Unsets the "incorporatedCountry" element
                       */
                      void unsetIncorporatedCountry();
                      
                      /**
                       * Gets the "incorporationNumber" element
                       */
                      java.lang.String getIncorporationNumber();
                      
                      /**
                       * Gets (as xml) the "incorporationNumber" element
                       */
                      org.apache.xmlbeans.XmlString xgetIncorporationNumber();
                      
                      /**
                       * True if has "incorporationNumber" element
                       */
                      boolean isSetIncorporationNumber();
                      
                      /**
                       * Sets the "incorporationNumber" element
                       */
                      void setIncorporationNumber(java.lang.String incorporationNumber);
                      
                      /**
                       * Sets (as xml) the "incorporationNumber" element
                       */
                      void xsetIncorporationNumber(org.apache.xmlbeans.XmlString incorporationNumber);
                      
                      /**
                       * Unsets the "incorporationNumber" element
                       */
                      void unsetIncorporationNumber();
                      
                      /**
                       * Gets the "incorporationDate" element
                       */
                      java.lang.String getIncorporationDate();
                      
                      /**
                       * Gets (as xml) the "incorporationDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetIncorporationDate();
                      
                      /**
                       * True if has "incorporationDate" element
                       */
                      boolean isSetIncorporationDate();
                      
                      /**
                       * Sets the "incorporationDate" element
                       */
                      void setIncorporationDate(java.lang.String incorporationDate);
                      
                      /**
                       * Sets (as xml) the "incorporationDate" element
                       */
                      void xsetIncorporationDate(org.apache.xmlbeans.XmlString incorporationDate);
                      
                      /**
                       * Unsets the "incorporationDate" element
                       */
                      void unsetIncorporationDate();
                      
                      /**
                       * Gets array of all "customerType" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.CustomerType[] getCustomerTypeArray();
                      
                      /**
                       * Gets ith "customerType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.CustomerType getCustomerTypeArray(int i);
                      
                      /**
                       * Returns number of "customerType" element
                       */
                      int sizeOfCustomerTypeArray();
                      
                      /**
                       * Sets array of all "customerType" element
                       */
                      void setCustomerTypeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.CustomerType[] customerTypeArray);
                      
                      /**
                       * Sets ith "customerType" element
                       */
                      void setCustomerTypeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.CustomerType customerType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "customerType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.CustomerType insertNewCustomerType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "customerType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.CustomerType addNewCustomerType();
                      
                      /**
                       * Removes the ith "customerType" element
                       */
                      void removeCustomerType(int i);
                      
                      /**
                       * Gets the "relationshipStartDate" element
                       */
                      java.lang.String getRelationshipStartDate();
                      
                      /**
                       * Gets (as xml) the "relationshipStartDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetRelationshipStartDate();
                      
                      /**
                       * True if has "relationshipStartDate" element
                       */
                      boolean isSetRelationshipStartDate();
                      
                      /**
                       * Sets the "relationshipStartDate" element
                       */
                      void setRelationshipStartDate(java.lang.String relationshipStartDate);
                      
                      /**
                       * Sets (as xml) the "relationshipStartDate" element
                       */
                      void xsetRelationshipStartDate(org.apache.xmlbeans.XmlString relationshipStartDate);
                      
                      /**
                       * Unsets the "relationshipStartDate" element
                       */
                      void unsetRelationshipStartDate();
                      
                      /**
                       * Gets array of all "segmentCode" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SegmentCode[] getSegmentCodeArray();
                      
                      /**
                       * Gets ith "segmentCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SegmentCode getSegmentCodeArray(int i);
                      
                      /**
                       * Returns number of "segmentCode" element
                       */
                      int sizeOfSegmentCodeArray();
                      
                      /**
                       * Sets array of all "segmentCode" element
                       */
                      void setSegmentCodeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SegmentCode[] segmentCodeArray);
                      
                      /**
                       * Sets ith "segmentCode" element
                       */
                      void setSegmentCodeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SegmentCode segmentCode);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "segmentCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SegmentCode insertNewSegmentCode(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "segmentCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SegmentCode addNewSegmentCode();
                      
                      /**
                       * Removes the ith "segmentCode" element
                       */
                      void removeSegmentCode(int i);
                      
                      /**
                       * Gets array of all "subSegmentCode" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SubSegmentCode[] getSubSegmentCodeArray();
                      
                      /**
                       * Gets ith "subSegmentCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SubSegmentCode getSubSegmentCodeArray(int i);
                      
                      /**
                       * Returns number of "subSegmentCode" element
                       */
                      int sizeOfSubSegmentCodeArray();
                      
                      /**
                       * Sets array of all "subSegmentCode" element
                       */
                      void setSubSegmentCodeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SubSegmentCode[] subSegmentCodeArray);
                      
                      /**
                       * Sets ith "subSegmentCode" element
                       */
                      void setSubSegmentCodeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SubSegmentCode subSegmentCode);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "subSegmentCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SubSegmentCode insertNewSubSegmentCode(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "subSegmentCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SubSegmentCode addNewSubSegmentCode();
                      
                      /**
                       * Removes the ith "subSegmentCode" element
                       */
                      void removeSubSegmentCode(int i);
                      
                      /**
                       * Gets array of all "baselCustomerSegment" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSegment[] getBaselCustomerSegmentArray();
                      
                      /**
                       * Gets ith "baselCustomerSegment" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSegment getBaselCustomerSegmentArray(int i);
                      
                      /**
                       * Returns number of "baselCustomerSegment" element
                       */
                      int sizeOfBaselCustomerSegmentArray();
                      
                      /**
                       * Sets array of all "baselCustomerSegment" element
                       */
                      void setBaselCustomerSegmentArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSegment[] baselCustomerSegmentArray);
                      
                      /**
                       * Sets ith "baselCustomerSegment" element
                       */
                      void setBaselCustomerSegmentArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSegment baselCustomerSegment);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "baselCustomerSegment" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSegment insertNewBaselCustomerSegment(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "baselCustomerSegment" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSegment addNewBaselCustomerSegment();
                      
                      /**
                       * Removes the ith "baselCustomerSegment" element
                       */
                      void removeBaselCustomerSegment(int i);
                      
                      /**
                       * Gets array of all "baselCustomerSubSegment" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSubSegment[] getBaselCustomerSubSegmentArray();
                      
                      /**
                       * Gets ith "baselCustomerSubSegment" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSubSegment getBaselCustomerSubSegmentArray(int i);
                      
                      /**
                       * Returns number of "baselCustomerSubSegment" element
                       */
                      int sizeOfBaselCustomerSubSegmentArray();
                      
                      /**
                       * Sets array of all "baselCustomerSubSegment" element
                       */
                      void setBaselCustomerSubSegmentArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSubSegment[] baselCustomerSubSegmentArray);
                      
                      /**
                       * Sets ith "baselCustomerSubSegment" element
                       */
                      void setBaselCustomerSubSegmentArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSubSegment baselCustomerSubSegment);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "baselCustomerSubSegment" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSubSegment insertNewBaselCustomerSubSegment(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "baselCustomerSubSegment" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSubSegment addNewBaselCustomerSubSegment();
                      
                      /**
                       * Removes the ith "baselCustomerSubSegment" element
                       */
                      void removeBaselCustomerSubSegment(int i);
                      
                      /**
                       * Gets array of all "businessType" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BusinessType[] getBusinessTypeArray();
                      
                      /**
                       * Gets ith "businessType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BusinessType getBusinessTypeArray(int i);
                      
                      /**
                       * Returns number of "businessType" element
                       */
                      int sizeOfBusinessTypeArray();
                      
                      /**
                       * Sets array of all "businessType" element
                       */
                      void setBusinessTypeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BusinessType[] businessTypeArray);
                      
                      /**
                       * Sets ith "businessType" element
                       */
                      void setBusinessTypeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BusinessType businessType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "businessType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BusinessType insertNewBusinessType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "businessType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BusinessType addNewBusinessType();
                      
                      /**
                       * Removes the ith "businessType" element
                       */
                      void removeBusinessType(int i);
                      
                      /**
                       * Gets array of all "envRiskGrade" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.EnvRiskGrade[] getEnvRiskGradeArray();
                      
                      /**
                       * Gets ith "envRiskGrade" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.EnvRiskGrade getEnvRiskGradeArray(int i);
                      
                      /**
                       * Returns number of "envRiskGrade" element
                       */
                      int sizeOfEnvRiskGradeArray();
                      
                      /**
                       * Sets array of all "envRiskGrade" element
                       */
                      void setEnvRiskGradeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.EnvRiskGrade[] envRiskGradeArray);
                      
                      /**
                       * Sets ith "envRiskGrade" element
                       */
                      void setEnvRiskGradeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.EnvRiskGrade envRiskGrade);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "envRiskGrade" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.EnvRiskGrade insertNewEnvRiskGrade(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "envRiskGrade" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.EnvRiskGrade addNewEnvRiskGrade();
                      
                      /**
                       * Removes the ith "envRiskGrade" element
                       */
                      void removeEnvRiskGrade(int i);
                      
                      /**
                       * Gets the "top1000Bank" element
                       */
                      java.lang.String getTop1000Bank();
                      
                      /**
                       * Gets (as xml) the "top1000Bank" element
                       */
                      org.apache.xmlbeans.XmlString xgetTop1000Bank();
                      
                      /**
                       * True if has "top1000Bank" element
                       */
                      boolean isSetTop1000Bank();
                      
                      /**
                       * Sets the "top1000Bank" element
                       */
                      void setTop1000Bank(java.lang.String top1000Bank);
                      
                      /**
                       * Sets (as xml) the "top1000Bank" element
                       */
                      void xsetTop1000Bank(org.apache.xmlbeans.XmlString top1000Bank);
                      
                      /**
                       * Unsets the "top1000Bank" element
                       */
                      void unsetTop1000Bank();
                      
                      /**
                       * Gets array of all "referralStatus" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.ReferralStatus[] getReferralStatusArray();
                      
                      /**
                       * Gets ith "referralStatus" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.ReferralStatus getReferralStatusArray(int i);
                      
                      /**
                       * Returns number of "referralStatus" element
                       */
                      int sizeOfReferralStatusArray();
                      
                      /**
                       * Sets array of all "referralStatus" element
                       */
                      void setReferralStatusArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.ReferralStatus[] referralStatusArray);
                      
                      /**
                       * Sets ith "referralStatus" element
                       */
                      void setReferralStatusArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.ReferralStatus referralStatus);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "referralStatus" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.ReferralStatus insertNewReferralStatus(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "referralStatus" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.ReferralStatus addNewReferralStatus();
                      
                      /**
                       * Removes the ith "referralStatus" element
                       */
                      void removeReferralStatus(int i);
                      
                      /**
                       * Gets array of all "operationStatus1" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.OperationStatus1[] getOperationStatus1Array();
                      
                      /**
                       * Gets ith "operationStatus1" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.OperationStatus1 getOperationStatus1Array(int i);
                      
                      /**
                       * Returns number of "operationStatus1" element
                       */
                      int sizeOfOperationStatus1Array();
                      
                      /**
                       * Sets array of all "operationStatus1" element
                       */
                      void setOperationStatus1Array(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.OperationStatus1[] operationStatus1Array);
                      
                      /**
                       * Sets ith "operationStatus1" element
                       */
                      void setOperationStatus1Array(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.OperationStatus1 operationStatus1);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "operationStatus1" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.OperationStatus1 insertNewOperationStatus1(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "operationStatus1" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.OperationStatus1 addNewOperationStatus1();
                      
                      /**
                       * Removes the ith "operationStatus1" element
                       */
                      void removeOperationStatus1(int i);
                      
                      /**
                       * Gets the "operationStatus1EffDate" element
                       */
                      java.lang.String getOperationStatus1EffDate();
                      
                      /**
                       * Gets (as xml) the "operationStatus1EffDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetOperationStatus1EffDate();
                      
                      /**
                       * True if has "operationStatus1EffDate" element
                       */
                      boolean isSetOperationStatus1EffDate();
                      
                      /**
                       * Sets the "operationStatus1EffDate" element
                       */
                      void setOperationStatus1EffDate(java.lang.String operationStatus1EffDate);
                      
                      /**
                       * Sets (as xml) the "operationStatus1EffDate" element
                       */
                      void xsetOperationStatus1EffDate(org.apache.xmlbeans.XmlString operationStatus1EffDate);
                      
                      /**
                       * Unsets the "operationStatus1EffDate" element
                       */
                      void unsetOperationStatus1EffDate();
                      
                      /**
                       * Gets the "borrowerExceptionChkInd" element
                       */
                      java.lang.String getBorrowerExceptionChkInd();
                      
                      /**
                       * Gets (as xml) the "borrowerExceptionChkInd" element
                       */
                      org.apache.xmlbeans.XmlString xgetBorrowerExceptionChkInd();
                      
                      /**
                       * True if has "borrowerExceptionChkInd" element
                       */
                      boolean isSetBorrowerExceptionChkInd();
                      
                      /**
                       * Sets the "borrowerExceptionChkInd" element
                       */
                      void setBorrowerExceptionChkInd(java.lang.String borrowerExceptionChkInd);
                      
                      /**
                       * Sets (as xml) the "borrowerExceptionChkInd" element
                       */
                      void xsetBorrowerExceptionChkInd(org.apache.xmlbeans.XmlString borrowerExceptionChkInd);
                      
                      /**
                       * Unsets the "borrowerExceptionChkInd" element
                       */
                      void unsetBorrowerExceptionChkInd();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * An XML legalConstitution(@).
                       *
                       * This is a complex type.
                       */
                      public interface LegalConstitution extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LegalConstitution.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("legalconstitution356aelemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.LegalConstitution newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.LegalConstitution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.LegalConstitution newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.LegalConstitution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML customerType(@).
                       *
                       * This is a complex type.
                       */
                      public interface CustomerType extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CustomerType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("customertypea9f6elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.CustomerType newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.CustomerType newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML segmentCode(@).
                       *
                       * This is a complex type.
                       */
                      public interface SegmentCode extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SegmentCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("segmentcode257eelemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SegmentCode newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SegmentCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SegmentCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SegmentCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML subSegmentCode(@).
                       *
                       * This is a complex type.
                       */
                      public interface SubSegmentCode extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubSegmentCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("subsegmentcode51ceelemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SubSegmentCode newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SubSegmentCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SubSegmentCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.SubSegmentCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML baselCustomerSegment(@).
                       *
                       * This is a complex type.
                       */
                      public interface BaselCustomerSegment extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaselCustomerSegment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("baselcustomersegment6bb4elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSegment newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSegment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSegment newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSegment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML baselCustomerSubSegment(@).
                       *
                       * This is a complex type.
                       */
                      public interface BaselCustomerSubSegment extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaselCustomerSubSegment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("baselcustomersubsegment6152elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSubSegment newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSubSegment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSubSegment newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BaselCustomerSubSegment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML businessType(@).
                       *
                       * This is a complex type.
                       */
                      public interface BusinessType extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BusinessType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("businesstype9cd4elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BusinessType newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BusinessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BusinessType newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.BusinessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML envRiskGrade(@).
                       *
                       * This is a complex type.
                       */
                      public interface EnvRiskGrade extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvRiskGrade.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("envriskgrade1ef3elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.EnvRiskGrade newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.EnvRiskGrade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.EnvRiskGrade newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.EnvRiskGrade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML referralStatus(@).
                       *
                       * This is a complex type.
                       */
                      public interface ReferralStatus extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReferralStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("referralstatusbc5felemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.ReferralStatus newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.ReferralStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.ReferralStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.ReferralStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML operationStatus1(@).
                       *
                       * This is a complex type.
                       */
                      public interface OperationStatus1 extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationStatus1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("operationstatus17716elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.OperationStatus1 newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.OperationStatus1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.OperationStatus1 newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile.OperationStatus1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML registeredAddress(@).
                     *
                     * This is a complex type.
                     */
                    public interface RegisteredAddress extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RegisteredAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("registeredaddress0c18elemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "addressId" element
                       */
                      java.lang.String getAddressId();
                      
                      /**
                       * Gets (as xml) the "addressId" element
                       */
                      org.apache.xmlbeans.XmlString xgetAddressId();
                      
                      /**
                       * True if has "addressId" element
                       */
                      boolean isSetAddressId();
                      
                      /**
                       * Sets the "addressId" element
                       */
                      void setAddressId(java.lang.String addressId);
                      
                      /**
                       * Sets (as xml) the "addressId" element
                       */
                      void xsetAddressId(org.apache.xmlbeans.XmlString addressId);
                      
                      /**
                       * Unsets the "addressId" element
                       */
                      void unsetAddressId();
                      
                      /**
                       * Gets array of all "addressType" elements
                       */
                      com.stanchart.customer.AddressTypeDocument.AddressType[] getAddressTypeArray();
                      
                      /**
                       * Gets ith "addressType" element
                       */
                      com.stanchart.customer.AddressTypeDocument.AddressType getAddressTypeArray(int i);
                      
                      /**
                       * Returns number of "addressType" element
                       */
                      int sizeOfAddressTypeArray();
                      
                      /**
                       * Sets array of all "addressType" element
                       */
                      void setAddressTypeArray(com.stanchart.customer.AddressTypeDocument.AddressType[] addressTypeArray);
                      
                      /**
                       * Sets ith "addressType" element
                       */
                      void setAddressTypeArray(int i, com.stanchart.customer.AddressTypeDocument.AddressType addressType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "addressType" element
                       */
                      com.stanchart.customer.AddressTypeDocument.AddressType insertNewAddressType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "addressType" element
                       */
                      com.stanchart.customer.AddressTypeDocument.AddressType addNewAddressType();
                      
                      /**
                       * Removes the ith "addressType" element
                       */
                      void removeAddressType(int i);
                      
                      /**
                       * Gets the "attnParty" element
                       */
                      java.lang.String getAttnParty();
                      
                      /**
                       * Gets (as xml) the "attnParty" element
                       */
                      org.apache.xmlbeans.XmlString xgetAttnParty();
                      
                      /**
                       * True if has "attnParty" element
                       */
                      boolean isSetAttnParty();
                      
                      /**
                       * Sets the "attnParty" element
                       */
                      void setAttnParty(java.lang.String attnParty);
                      
                      /**
                       * Sets (as xml) the "attnParty" element
                       */
                      void xsetAttnParty(org.apache.xmlbeans.XmlString attnParty);
                      
                      /**
                       * Unsets the "attnParty" element
                       */
                      void unsetAttnParty();
                      
                      /**
                       * Gets the "line1" element
                       */
                      java.lang.String getLine1();
                      
                      /**
                       * Gets (as xml) the "line1" element
                       */
                      org.apache.xmlbeans.XmlString xgetLine1();
                      
                      /**
                       * True if has "line1" element
                       */
                      boolean isSetLine1();
                      
                      /**
                       * Sets the "line1" element
                       */
                      void setLine1(java.lang.String line1);
                      
                      /**
                       * Sets (as xml) the "line1" element
                       */
                      void xsetLine1(org.apache.xmlbeans.XmlString line1);
                      
                      /**
                       * Unsets the "line1" element
                       */
                      void unsetLine1();
                      
                      /**
                       * Gets the "line2" element
                       */
                      java.lang.String getLine2();
                      
                      /**
                       * Gets (as xml) the "line2" element
                       */
                      org.apache.xmlbeans.XmlString xgetLine2();
                      
                      /**
                       * True if has "line2" element
                       */
                      boolean isSetLine2();
                      
                      /**
                       * Sets the "line2" element
                       */
                      void setLine2(java.lang.String line2);
                      
                      /**
                       * Sets (as xml) the "line2" element
                       */
                      void xsetLine2(org.apache.xmlbeans.XmlString line2);
                      
                      /**
                       * Unsets the "line2" element
                       */
                      void unsetLine2();
                      
                      /**
                       * Gets the "city" element
                       */
                      java.lang.String getCity();
                      
                      /**
                       * Gets (as xml) the "city" element
                       */
                      org.apache.xmlbeans.XmlString xgetCity();
                      
                      /**
                       * True if has "city" element
                       */
                      boolean isSetCity();
                      
                      /**
                       * Sets the "city" element
                       */
                      void setCity(java.lang.String city);
                      
                      /**
                       * Sets (as xml) the "city" element
                       */
                      void xsetCity(org.apache.xmlbeans.XmlString city);
                      
                      /**
                       * Unsets the "city" element
                       */
                      void unsetCity();
                      
                      /**
                       * Gets the "state" element
                       */
                      java.lang.String getState();
                      
                      /**
                       * Gets (as xml) the "state" element
                       */
                      org.apache.xmlbeans.XmlString xgetState();
                      
                      /**
                       * True if has "state" element
                       */
                      boolean isSetState();
                      
                      /**
                       * Sets the "state" element
                       */
                      void setState(java.lang.String state);
                      
                      /**
                       * Sets (as xml) the "state" element
                       */
                      void xsetState(org.apache.xmlbeans.XmlString state);
                      
                      /**
                       * Unsets the "state" element
                       */
                      void unsetState();
                      
                      /**
                       * Gets the "country" element
                       */
                      java.lang.String getCountry();
                      
                      /**
                       * Gets (as xml) the "country" element
                       */
                      org.apache.xmlbeans.XmlString xgetCountry();
                      
                      /**
                       * True if has "country" element
                       */
                      boolean isSetCountry();
                      
                      /**
                       * Sets the "country" element
                       */
                      void setCountry(java.lang.String country);
                      
                      /**
                       * Sets (as xml) the "country" element
                       */
                      void xsetCountry(org.apache.xmlbeans.XmlString country);
                      
                      /**
                       * Unsets the "country" element
                       */
                      void unsetCountry();
                      
                      /**
                       * Gets the "postCode" element
                       */
                      java.lang.String getPostCode();
                      
                      /**
                       * Gets (as xml) the "postCode" element
                       */
                      org.apache.xmlbeans.XmlString xgetPostCode();
                      
                      /**
                       * True if has "postCode" element
                       */
                      boolean isSetPostCode();
                      
                      /**
                       * Sets the "postCode" element
                       */
                      void setPostCode(java.lang.String postCode);
                      
                      /**
                       * Sets (as xml) the "postCode" element
                       */
                      void xsetPostCode(org.apache.xmlbeans.XmlString postCode);
                      
                      /**
                       * Unsets the "postCode" element
                       */
                      void unsetPostCode();
                      
                      /**
                       * Gets the "fax" element
                       */
                      java.lang.String getFax();
                      
                      /**
                       * Gets (as xml) the "fax" element
                       */
                      org.apache.xmlbeans.XmlString xgetFax();
                      
                      /**
                       * True if has "fax" element
                       */
                      boolean isSetFax();
                      
                      /**
                       * Sets the "fax" element
                       */
                      void setFax(java.lang.String fax);
                      
                      /**
                       * Sets (as xml) the "fax" element
                       */
                      void xsetFax(org.apache.xmlbeans.XmlString fax);
                      
                      /**
                       * Unsets the "fax" element
                       */
                      void unsetFax();
                      
                      /**
                       * Gets the "email" element
                       */
                      java.lang.String getEmail();
                      
                      /**
                       * Gets (as xml) the "email" element
                       */
                      org.apache.xmlbeans.XmlString xgetEmail();
                      
                      /**
                       * True if has "email" element
                       */
                      boolean isSetEmail();
                      
                      /**
                       * Sets the "email" element
                       */
                      void setEmail(java.lang.String email);
                      
                      /**
                       * Sets (as xml) the "email" element
                       */
                      void xsetEmail(org.apache.xmlbeans.XmlString email);
                      
                      /**
                       * Unsets the "email" element
                       */
                      void unsetEmail();
                      
                      /**
                       * Gets the "phone" element
                       */
                      java.lang.String getPhone();
                      
                      /**
                       * Gets (as xml) the "phone" element
                       */
                      org.apache.xmlbeans.XmlString xgetPhone();
                      
                      /**
                       * True if has "phone" element
                       */
                      boolean isSetPhone();
                      
                      /**
                       * Sets the "phone" element
                       */
                      void setPhone(java.lang.String phone);
                      
                      /**
                       * Sets (as xml) the "phone" element
                       */
                      void xsetPhone(org.apache.xmlbeans.XmlString phone);
                      
                      /**
                       * Unsets the "phone" element
                       */
                      void unsetPhone();
                      
                      /**
                       * Gets the "telex" element
                       */
                      java.lang.String getTelex();
                      
                      /**
                       * Gets (as xml) the "telex" element
                       */
                      org.apache.xmlbeans.XmlString xgetTelex();
                      
                      /**
                       * True if has "telex" element
                       */
                      boolean isSetTelex();
                      
                      /**
                       * Sets the "telex" element
                       */
                      void setTelex(java.lang.String telex);
                      
                      /**
                       * Sets (as xml) the "telex" element
                       */
                      void xsetTelex(org.apache.xmlbeans.XmlString telex);
                      
                      /**
                       * Unsets the "telex" element
                       */
                      void unsetTelex();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.RegisteredAddress newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.RegisteredAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.RegisteredAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.RegisteredAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML creditGrade(@).
                     *
                     * This is a complex type.
                     */
                    public interface CreditGrade extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreditGrade.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("creditgrade2e4celemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "creditGradeId" element
                       */
                      java.lang.String getCreditGradeId();
                      
                      /**
                       * Gets (as xml) the "creditGradeId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCreditGradeId();
                      
                      /**
                       * True if has "creditGradeId" element
                       */
                      boolean isSetCreditGradeId();
                      
                      /**
                       * Sets the "creditGradeId" element
                       */
                      void setCreditGradeId(java.lang.String creditGradeId);
                      
                      /**
                       * Sets (as xml) the "creditGradeId" element
                       */
                      void xsetCreditGradeId(org.apache.xmlbeans.XmlString creditGradeId);
                      
                      /**
                       * Unsets the "creditGradeId" element
                       */
                      void unsetCreditGradeId();
                      
                      /**
                       * Gets array of all "creditGradeType" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeType[] getCreditGradeTypeArray();
                      
                      /**
                       * Gets ith "creditGradeType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeType getCreditGradeTypeArray(int i);
                      
                      /**
                       * Returns number of "creditGradeType" element
                       */
                      int sizeOfCreditGradeTypeArray();
                      
                      /**
                       * Sets array of all "creditGradeType" element
                       */
                      void setCreditGradeTypeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeType[] creditGradeTypeArray);
                      
                      /**
                       * Sets ith "creditGradeType" element
                       */
                      void setCreditGradeTypeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeType creditGradeType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "creditGradeType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeType insertNewCreditGradeType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "creditGradeType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeType addNewCreditGradeType();
                      
                      /**
                       * Removes the ith "creditGradeType" element
                       */
                      void removeCreditGradeType(int i);
                      
                      /**
                       * Gets array of all "creditGradeCode" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeCode[] getCreditGradeCodeArray();
                      
                      /**
                       * Gets ith "creditGradeCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeCode getCreditGradeCodeArray(int i);
                      
                      /**
                       * Returns number of "creditGradeCode" element
                       */
                      int sizeOfCreditGradeCodeArray();
                      
                      /**
                       * Sets array of all "creditGradeCode" element
                       */
                      void setCreditGradeCodeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeCode[] creditGradeCodeArray);
                      
                      /**
                       * Sets ith "creditGradeCode" element
                       */
                      void setCreditGradeCodeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeCode creditGradeCode);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "creditGradeCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeCode insertNewCreditGradeCode(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "creditGradeCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeCode addNewCreditGradeCode();
                      
                      /**
                       * Removes the ith "creditGradeCode" element
                       */
                      void removeCreditGradeCode(int i);
                      
                      /**
                       * Gets the "creditGradeEffectiveDate" element
                       */
                      java.lang.String getCreditGradeEffectiveDate();
                      
                      /**
                       * Gets (as xml) the "creditGradeEffectiveDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetCreditGradeEffectiveDate();
                      
                      /**
                       * True if has "creditGradeEffectiveDate" element
                       */
                      boolean isSetCreditGradeEffectiveDate();
                      
                      /**
                       * Sets the "creditGradeEffectiveDate" element
                       */
                      void setCreditGradeEffectiveDate(java.lang.String creditGradeEffectiveDate);
                      
                      /**
                       * Sets (as xml) the "creditGradeEffectiveDate" element
                       */
                      void xsetCreditGradeEffectiveDate(org.apache.xmlbeans.XmlString creditGradeEffectiveDate);
                      
                      /**
                       * Unsets the "creditGradeEffectiveDate" element
                       */
                      void unsetCreditGradeEffectiveDate();
                      
                      /**
                       * Gets the "creditGradeReasonForChange" element
                       */
                      java.lang.String getCreditGradeReasonForChange();
                      
                      /**
                       * Gets (as xml) the "creditGradeReasonForChange" element
                       */
                      org.apache.xmlbeans.XmlString xgetCreditGradeReasonForChange();
                      
                      /**
                       * True if has "creditGradeReasonForChange" element
                       */
                      boolean isSetCreditGradeReasonForChange();
                      
                      /**
                       * Sets the "creditGradeReasonForChange" element
                       */
                      void setCreditGradeReasonForChange(java.lang.String creditGradeReasonForChange);
                      
                      /**
                       * Sets (as xml) the "creditGradeReasonForChange" element
                       */
                      void xsetCreditGradeReasonForChange(org.apache.xmlbeans.XmlString creditGradeReasonForChange);
                      
                      /**
                       * Unsets the "creditGradeReasonForChange" element
                       */
                      void unsetCreditGradeReasonForChange();
                      
                      /**
                       * Gets array of all "approverLocation" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.ApproverLocation[] getApproverLocationArray();
                      
                      /**
                       * Gets ith "approverLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.ApproverLocation getApproverLocationArray(int i);
                      
                      /**
                       * Returns number of "approverLocation" element
                       */
                      int sizeOfApproverLocationArray();
                      
                      /**
                       * Sets array of all "approverLocation" element
                       */
                      void setApproverLocationArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.ApproverLocation[] approverLocationArray);
                      
                      /**
                       * Sets ith "approverLocation" element
                       */
                      void setApproverLocationArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.ApproverLocation approverLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "approverLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.ApproverLocation insertNewApproverLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "approverLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.ApproverLocation addNewApproverLocation();
                      
                      /**
                       * Removes the ith "approverLocation" element
                       */
                      void removeApproverLocation(int i);
                      
                      /**
                       * Gets the "coinNo" element
                       */
                      java.lang.String getCoinNo();
                      
                      /**
                       * Gets (as xml) the "coinNo" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoinNo();
                      
                      /**
                       * True if has "coinNo" element
                       */
                      boolean isSetCoinNo();
                      
                      /**
                       * Sets the "coinNo" element
                       */
                      void setCoinNo(java.lang.String coinNo);
                      
                      /**
                       * Sets (as xml) the "coinNo" element
                       */
                      void xsetCoinNo(org.apache.xmlbeans.XmlString coinNo);
                      
                      /**
                       * Unsets the "coinNo" element
                       */
                      void unsetCoinNo();
                      
                      /**
                       * Gets the "approverEmpId" element
                       */
                      java.lang.String getApproverEmpId();
                      
                      /**
                       * Gets (as xml) the "approverEmpId" element
                       */
                      org.apache.xmlbeans.XmlString xgetApproverEmpId();
                      
                      /**
                       * True if has "approverEmpId" element
                       */
                      boolean isSetApproverEmpId();
                      
                      /**
                       * Sets the "approverEmpId" element
                       */
                      void setApproverEmpId(java.lang.String approverEmpId);
                      
                      /**
                       * Sets (as xml) the "approverEmpId" element
                       */
                      void xsetApproverEmpId(org.apache.xmlbeans.XmlString approverEmpId);
                      
                      /**
                       * Unsets the "approverEmpId" element
                       */
                      void unsetApproverEmpId();
                      
                      /**
                       * Gets the "approverName" element
                       */
                      java.lang.String getApproverName();
                      
                      /**
                       * Gets (as xml) the "approverName" element
                       */
                      org.apache.xmlbeans.XmlString xgetApproverName();
                      
                      /**
                       * True if has "approverName" element
                       */
                      boolean isSetApproverName();
                      
                      /**
                       * Sets the "approverName" element
                       */
                      void setApproverName(java.lang.String approverName);
                      
                      /**
                       * Sets (as xml) the "approverName" element
                       */
                      void xsetApproverName(org.apache.xmlbeans.XmlString approverName);
                      
                      /**
                       * Unsets the "approverName" element
                       */
                      void unsetApproverName();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * An XML creditGradeType(@).
                       *
                       * This is a complex type.
                       */
                      public interface CreditGradeType extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreditGradeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("creditgradetype6298elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeType newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeType newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML creditGradeCode(@).
                       *
                       * This is a complex type.
                       */
                      public interface CreditGradeCode extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreditGradeCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("creditgradecode8285elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeCode newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.CreditGradeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML approverLocation(@).
                       *
                       * This is a complex type.
                       */
                      public interface ApproverLocation extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApproverLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("approverlocationc366elemtype");
                        
                        /**
                         * Gets the "approverLocationId" element
                         */
                        java.lang.String getApproverLocationId();
                        
                        /**
                         * Gets (as xml) the "approverLocationId" element
                         */
                        org.apache.xmlbeans.XmlString xgetApproverLocationId();
                        
                        /**
                         * True if has "approverLocationId" element
                         */
                        boolean isSetApproverLocationId();
                        
                        /**
                         * Sets the "approverLocationId" element
                         */
                        void setApproverLocationId(java.lang.String approverLocationId);
                        
                        /**
                         * Sets (as xml) the "approverLocationId" element
                         */
                        void xsetApproverLocationId(org.apache.xmlbeans.XmlString approverLocationId);
                        
                        /**
                         * Unsets the "approverLocationId" element
                         */
                        void unsetApproverLocationId();
                        
                        /**
                         * Gets the "approverCountry" element
                         */
                        java.lang.String getApproverCountry();
                        
                        /**
                         * Gets (as xml) the "approverCountry" element
                         */
                        org.apache.xmlbeans.XmlString xgetApproverCountry();
                        
                        /**
                         * True if has "approverCountry" element
                         */
                        boolean isSetApproverCountry();
                        
                        /**
                         * Sets the "approverCountry" element
                         */
                        void setApproverCountry(java.lang.String approverCountry);
                        
                        /**
                         * Sets (as xml) the "approverCountry" element
                         */
                        void xsetApproverCountry(org.apache.xmlbeans.XmlString approverCountry);
                        
                        /**
                         * Unsets the "approverCountry" element
                         */
                        void unsetApproverCountry();
                        
                        /**
                         * Gets the "approverOrganization" element
                         */
                        java.lang.String getApproverOrganization();
                        
                        /**
                         * Gets (as xml) the "approverOrganization" element
                         */
                        org.apache.xmlbeans.XmlString xgetApproverOrganization();
                        
                        /**
                         * True if has "approverOrganization" element
                         */
                        boolean isSetApproverOrganization();
                        
                        /**
                         * Sets the "approverOrganization" element
                         */
                        void setApproverOrganization(java.lang.String approverOrganization);
                        
                        /**
                         * Sets (as xml) the "approverOrganization" element
                         */
                        void xsetApproverOrganization(org.apache.xmlbeans.XmlString approverOrganization);
                        
                        /**
                         * Unsets the "approverOrganization" element
                         */
                        void unsetApproverOrganization();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.ApproverLocation newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.ApproverLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.ApproverLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade.ApproverLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditGrade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML ISIC(@).
                     *
                     * This is a complex type.
                     */
                    public interface ISIC extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ISIC.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("isic5596elemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "ISICId" element
                       */
                      java.lang.String getISICId();
                      
                      /**
                       * Gets (as xml) the "ISICId" element
                       */
                      org.apache.xmlbeans.XmlString xgetISICId();
                      
                      /**
                       * True if has "ISICId" element
                       */
                      boolean isSetISICId();
                      
                      /**
                       * Sets the "ISICId" element
                       */
                      void setISICId(java.lang.String isicId);
                      
                      /**
                       * Sets (as xml) the "ISICId" element
                       */
                      void xsetISICId(org.apache.xmlbeans.XmlString isicId);
                      
                      /**
                       * Unsets the "ISICId" element
                       */
                      void unsetISICId();
                      
                      /**
                       * Gets array of all "ISICType" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICType[] getISICTypeArray();
                      
                      /**
                       * Gets ith "ISICType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICType getISICTypeArray(int i);
                      
                      /**
                       * Returns number of "ISICType" element
                       */
                      int sizeOfISICTypeArray();
                      
                      /**
                       * Sets array of all "ISICType" element
                       */
                      void setISICTypeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICType[] isicTypeArray);
                      
                      /**
                       * Sets ith "ISICType" element
                       */
                      void setISICTypeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICType isicType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "ISICType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICType insertNewISICType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "ISICType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICType addNewISICType();
                      
                      /**
                       * Removes the ith "ISICType" element
                       */
                      void removeISICType(int i);
                      
                      /**
                       * Gets array of all "ISICCode" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICCode[] getISICCodeArray();
                      
                      /**
                       * Gets ith "ISICCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICCode getISICCodeArray(int i);
                      
                      /**
                       * Returns number of "ISICCode" element
                       */
                      int sizeOfISICCodeArray();
                      
                      /**
                       * Sets array of all "ISICCode" element
                       */
                      void setISICCodeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICCode[] isicCodeArray);
                      
                      /**
                       * Sets ith "ISICCode" element
                       */
                      void setISICCodeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICCode isicCode);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "ISICCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICCode insertNewISICCode(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "ISICCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICCode addNewISICCode();
                      
                      /**
                       * Removes the ith "ISICCode" element
                       */
                      void removeISICCode(int i);
                      
                      /**
                       * Gets the "ISICEffectiveDate" element
                       */
                      java.lang.String getISICEffectiveDate();
                      
                      /**
                       * Gets (as xml) the "ISICEffectiveDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetISICEffectiveDate();
                      
                      /**
                       * True if has "ISICEffectiveDate" element
                       */
                      boolean isSetISICEffectiveDate();
                      
                      /**
                       * Sets the "ISICEffectiveDate" element
                       */
                      void setISICEffectiveDate(java.lang.String isicEffectiveDate);
                      
                      /**
                       * Sets (as xml) the "ISICEffectiveDate" element
                       */
                      void xsetISICEffectiveDate(org.apache.xmlbeans.XmlString isicEffectiveDate);
                      
                      /**
                       * Unsets the "ISICEffectiveDate" element
                       */
                      void unsetISICEffectiveDate();
                      
                      /**
                       * Gets the "ISICWeightage" element
                       */
                      java.lang.String getISICWeightage();
                      
                      /**
                       * Gets (as xml) the "ISICWeightage" element
                       */
                      org.apache.xmlbeans.XmlString xgetISICWeightage();
                      
                      /**
                       * True if has "ISICWeightage" element
                       */
                      boolean isSetISICWeightage();
                      
                      /**
                       * Sets the "ISICWeightage" element
                       */
                      void setISICWeightage(java.lang.String isicWeightage);
                      
                      /**
                       * Sets (as xml) the "ISICWeightage" element
                       */
                      void xsetISICWeightage(org.apache.xmlbeans.XmlString isicWeightage);
                      
                      /**
                       * Unsets the "ISICWeightage" element
                       */
                      void unsetISICWeightage();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * An XML ISICType(@).
                       *
                       * This is a complex type.
                       */
                      public interface ISICType extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ISICType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("isictype6540elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICType newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICType newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML ISICCode(@).
                       *
                       * This is a complex type.
                       */
                      public interface ISICCode extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ISICCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("isiccodea5f3elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICCode newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC.ISICCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.ISIC) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML creditStatus(@).
                     *
                     * This is a complex type.
                     */
                    public interface CreditStatus extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreditStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("creditstatusa4efelemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "creditStatusId" element
                       */
                      java.lang.String getCreditStatusId();
                      
                      /**
                       * Gets (as xml) the "creditStatusId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCreditStatusId();
                      
                      /**
                       * True if has "creditStatusId" element
                       */
                      boolean isSetCreditStatusId();
                      
                      /**
                       * Sets the "creditStatusId" element
                       */
                      void setCreditStatusId(java.lang.String creditStatusId);
                      
                      /**
                       * Sets (as xml) the "creditStatusId" element
                       */
                      void xsetCreditStatusId(org.apache.xmlbeans.XmlString creditStatusId);
                      
                      /**
                       * Unsets the "creditStatusId" element
                       */
                      void unsetCreditStatusId();
                      
                      /**
                       * Gets array of all "creditStatusType" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusType[] getCreditStatusTypeArray();
                      
                      /**
                       * Gets ith "creditStatusType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusType getCreditStatusTypeArray(int i);
                      
                      /**
                       * Returns number of "creditStatusType" element
                       */
                      int sizeOfCreditStatusTypeArray();
                      
                      /**
                       * Sets array of all "creditStatusType" element
                       */
                      void setCreditStatusTypeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusType[] creditStatusTypeArray);
                      
                      /**
                       * Sets ith "creditStatusType" element
                       */
                      void setCreditStatusTypeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusType creditStatusType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "creditStatusType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusType insertNewCreditStatusType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "creditStatusType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusType addNewCreditStatusType();
                      
                      /**
                       * Removes the ith "creditStatusType" element
                       */
                      void removeCreditStatusType(int i);
                      
                      /**
                       * Gets array of all "creditStatusCode" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusCode[] getCreditStatusCodeArray();
                      
                      /**
                       * Gets ith "creditStatusCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusCode getCreditStatusCodeArray(int i);
                      
                      /**
                       * Returns number of "creditStatusCode" element
                       */
                      int sizeOfCreditStatusCodeArray();
                      
                      /**
                       * Sets array of all "creditStatusCode" element
                       */
                      void setCreditStatusCodeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusCode[] creditStatusCodeArray);
                      
                      /**
                       * Sets ith "creditStatusCode" element
                       */
                      void setCreditStatusCodeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusCode creditStatusCode);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "creditStatusCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusCode insertNewCreditStatusCode(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "creditStatusCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusCode addNewCreditStatusCode();
                      
                      /**
                       * Removes the ith "creditStatusCode" element
                       */
                      void removeCreditStatusCode(int i);
                      
                      /**
                       * Gets the "creditStatusEffectiveDate" element
                       */
                      java.lang.String getCreditStatusEffectiveDate();
                      
                      /**
                       * Gets (as xml) the "creditStatusEffectiveDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetCreditStatusEffectiveDate();
                      
                      /**
                       * True if has "creditStatusEffectiveDate" element
                       */
                      boolean isSetCreditStatusEffectiveDate();
                      
                      /**
                       * Sets the "creditStatusEffectiveDate" element
                       */
                      void setCreditStatusEffectiveDate(java.lang.String creditStatusEffectiveDate);
                      
                      /**
                       * Sets (as xml) the "creditStatusEffectiveDate" element
                       */
                      void xsetCreditStatusEffectiveDate(org.apache.xmlbeans.XmlString creditStatusEffectiveDate);
                      
                      /**
                       * Unsets the "creditStatusEffectiveDate" element
                       */
                      void unsetCreditStatusEffectiveDate();
                      
                      /**
                       * Gets the "comments" element
                       */
                      java.lang.String getComments();
                      
                      /**
                       * Gets (as xml) the "comments" element
                       */
                      org.apache.xmlbeans.XmlString xgetComments();
                      
                      /**
                       * True if has "comments" element
                       */
                      boolean isSetComments();
                      
                      /**
                       * Sets the "comments" element
                       */
                      void setComments(java.lang.String comments);
                      
                      /**
                       * Sets (as xml) the "comments" element
                       */
                      void xsetComments(org.apache.xmlbeans.XmlString comments);
                      
                      /**
                       * Unsets the "comments" element
                       */
                      void unsetComments();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * An XML creditStatusType(@).
                       *
                       * This is a complex type.
                       */
                      public interface CreditStatusType extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreditStatusType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("creditstatustype42a0elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusType newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusType newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML creditStatusCode(@).
                       *
                       * This is a complex type.
                       */
                      public interface CreditStatusCode extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreditStatusCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("creditstatuscode2053elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusCode newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus.CreditStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.CreditStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML mainProfileInstructionRef(@).
                     *
                     * This is a complex type.
                     */
                    public interface MainProfileInstructionRef extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MainProfileInstructionRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("mainprofileinstructionref0795elemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "instructionRefMapId" element
                       */
                      java.lang.String getInstructionRefMapId();
                      
                      /**
                       * Gets (as xml) the "instructionRefMapId" element
                       */
                      org.apache.xmlbeans.XmlString xgetInstructionRefMapId();
                      
                      /**
                       * True if has "instructionRefMapId" element
                       */
                      boolean isSetInstructionRefMapId();
                      
                      /**
                       * Sets the "instructionRefMapId" element
                       */
                      void setInstructionRefMapId(java.lang.String instructionRefMapId);
                      
                      /**
                       * Sets (as xml) the "instructionRefMapId" element
                       */
                      void xsetInstructionRefMapId(org.apache.xmlbeans.XmlString instructionRefMapId);
                      
                      /**
                       * Unsets the "instructionRefMapId" element
                       */
                      void unsetInstructionRefMapId();
                      
                      /**
                       * Gets the "instructionRefId" element
                       */
                      java.lang.String getInstructionRefId();
                      
                      /**
                       * Gets (as xml) the "instructionRefId" element
                       */
                      org.apache.xmlbeans.XmlString xgetInstructionRefId();
                      
                      /**
                       * True if has "instructionRefId" element
                       */
                      boolean isSetInstructionRefId();
                      
                      /**
                       * Sets the "instructionRefId" element
                       */
                      void setInstructionRefId(java.lang.String instructionRefId);
                      
                      /**
                       * Sets (as xml) the "instructionRefId" element
                       */
                      void xsetInstructionRefId(org.apache.xmlbeans.XmlString instructionRefId);
                      
                      /**
                       * Unsets the "instructionRefId" element
                       */
                      void unsetInstructionRefId();
                      
                      /**
                       * Gets the "instructionRefNumber" element
                       */
                      java.lang.String getInstructionRefNumber();
                      
                      /**
                       * Gets (as xml) the "instructionRefNumber" element
                       */
                      org.apache.xmlbeans.XmlString xgetInstructionRefNumber();
                      
                      /**
                       * True if has "instructionRefNumber" element
                       */
                      boolean isSetInstructionRefNumber();
                      
                      /**
                       * Sets the "instructionRefNumber" element
                       */
                      void setInstructionRefNumber(java.lang.String instructionRefNumber);
                      
                      /**
                       * Sets (as xml) the "instructionRefNumber" element
                       */
                      void xsetInstructionRefNumber(org.apache.xmlbeans.XmlString instructionRefNumber);
                      
                      /**
                       * Unsets the "instructionRefNumber" element
                       */
                      void unsetInstructionRefNumber();
                      
                      /**
                       * Gets array of all "instructionRefType" elements
                       */
                      com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType[] getInstructionRefTypeArray();
                      
                      /**
                       * Gets ith "instructionRefType" element
                       */
                      com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType getInstructionRefTypeArray(int i);
                      
                      /**
                       * Returns number of "instructionRefType" element
                       */
                      int sizeOfInstructionRefTypeArray();
                      
                      /**
                       * Sets array of all "instructionRefType" element
                       */
                      void setInstructionRefTypeArray(com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType[] instructionRefTypeArray);
                      
                      /**
                       * Sets ith "instructionRefType" element
                       */
                      void setInstructionRefTypeArray(int i, com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType instructionRefType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "instructionRefType" element
                       */
                      com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType insertNewInstructionRefType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "instructionRefType" element
                       */
                      com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType addNewInstructionRefType();
                      
                      /**
                       * Removes the ith "instructionRefType" element
                       */
                      void removeInstructionRefType(int i);
                      
                      /**
                       * Gets array of all "instructionBookingLocation" elements
                       */
                      com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation[] getInstructionBookingLocationArray();
                      
                      /**
                       * Gets ith "instructionBookingLocation" element
                       */
                      com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation getInstructionBookingLocationArray(int i);
                      
                      /**
                       * Returns number of "instructionBookingLocation" element
                       */
                      int sizeOfInstructionBookingLocationArray();
                      
                      /**
                       * Sets array of all "instructionBookingLocation" element
                       */
                      void setInstructionBookingLocationArray(com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation[] instructionBookingLocationArray);
                      
                      /**
                       * Sets ith "instructionBookingLocation" element
                       */
                      void setInstructionBookingLocationArray(int i, com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation instructionBookingLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "instructionBookingLocation" element
                       */
                      com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation insertNewInstructionBookingLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "instructionBookingLocation" element
                       */
                      com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation addNewInstructionBookingLocation();
                      
                      /**
                       * Removes the ith "instructionBookingLocation" element
                       */
                      void removeInstructionBookingLocation(int i);
                      
                      /**
                       * Gets the "instructionRefApprovalDate" element
                       */
                      java.lang.String getInstructionRefApprovalDate();
                      
                      /**
                       * Gets (as xml) the "instructionRefApprovalDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetInstructionRefApprovalDate();
                      
                      /**
                       * True if has "instructionRefApprovalDate" element
                       */
                      boolean isSetInstructionRefApprovalDate();
                      
                      /**
                       * Sets the "instructionRefApprovalDate" element
                       */
                      void setInstructionRefApprovalDate(java.lang.String instructionRefApprovalDate);
                      
                      /**
                       * Sets (as xml) the "instructionRefApprovalDate" element
                       */
                      void xsetInstructionRefApprovalDate(org.apache.xmlbeans.XmlString instructionRefApprovalDate);
                      
                      /**
                       * Unsets the "instructionRefApprovalDate" element
                       */
                      void unsetInstructionRefApprovalDate();
                      
                      /**
                       * Gets the "comments" element
                       */
                      java.lang.String getComments();
                      
                      /**
                       * Gets (as xml) the "comments" element
                       */
                      org.apache.xmlbeans.XmlString xgetComments();
                      
                      /**
                       * True if has "comments" element
                       */
                      boolean isSetComments();
                      
                      /**
                       * Sets the "comments" element
                       */
                      void setComments(java.lang.String comments);
                      
                      /**
                       * Sets (as xml) the "comments" element
                       */
                      void xsetComments(org.apache.xmlbeans.XmlString comments);
                      
                      /**
                       * Unsets the "comments" element
                       */
                      void unsetComments();
                      
                      /**
                       * Gets the "userGroupInd" element
                       */
                      java.lang.String getUserGroupInd();
                      
                      /**
                       * Gets (as xml) the "userGroupInd" element
                       */
                      org.apache.xmlbeans.XmlString xgetUserGroupInd();
                      
                      /**
                       * True if has "userGroupInd" element
                       */
                      boolean isSetUserGroupInd();
                      
                      /**
                       * Sets the "userGroupInd" element
                       */
                      void setUserGroupInd(java.lang.String userGroupInd);
                      
                      /**
                       * Sets (as xml) the "userGroupInd" element
                       */
                      void xsetUserGroupInd(org.apache.xmlbeans.XmlString userGroupInd);
                      
                      /**
                       * Unsets the "userGroupInd" element
                       */
                      void unsetUserGroupInd();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfileInstructionRef newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfileInstructionRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfileInstructionRef newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.MainProfileInstructionRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML knowYourCustomer(@).
                     *
                     * This is a complex type.
                     */
                    public interface KnowYourCustomer extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KnowYourCustomer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("knowyourcustomer40feelemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "KYCid" element
                       */
                      java.lang.String getKYCid();
                      
                      /**
                       * Gets (as xml) the "KYCid" element
                       */
                      org.apache.xmlbeans.XmlString xgetKYCid();
                      
                      /**
                       * True if has "KYCid" element
                       */
                      boolean isSetKYCid();
                      
                      /**
                       * Sets the "KYCid" element
                       */
                      void setKYCid(java.lang.String kyCid);
                      
                      /**
                       * Sets (as xml) the "KYCid" element
                       */
                      void xsetKYCid(org.apache.xmlbeans.XmlString kyCid);
                      
                      /**
                       * Unsets the "KYCid" element
                       */
                      void unsetKYCid();
                      
                      /**
                       * Gets array of all "documentOriginatingLocation" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.DocumentOriginatingLocation[] getDocumentOriginatingLocationArray();
                      
                      /**
                       * Gets ith "documentOriginatingLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.DocumentOriginatingLocation getDocumentOriginatingLocationArray(int i);
                      
                      /**
                       * Returns number of "documentOriginatingLocation" element
                       */
                      int sizeOfDocumentOriginatingLocationArray();
                      
                      /**
                       * Sets array of all "documentOriginatingLocation" element
                       */
                      void setDocumentOriginatingLocationArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.DocumentOriginatingLocation[] documentOriginatingLocationArray);
                      
                      /**
                       * Sets ith "documentOriginatingLocation" element
                       */
                      void setDocumentOriginatingLocationArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.DocumentOriginatingLocation documentOriginatingLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "documentOriginatingLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.DocumentOriginatingLocation insertNewDocumentOriginatingLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "documentOriginatingLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.DocumentOriginatingLocation addNewDocumentOriginatingLocation();
                      
                      /**
                       * Removes the ith "documentOriginatingLocation" element
                       */
                      void removeDocumentOriginatingLocation(int i);
                      
                      /**
                       * Gets array of all "mlRiskRating" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.MlRiskRating[] getMlRiskRatingArray();
                      
                      /**
                       * Gets ith "mlRiskRating" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.MlRiskRating getMlRiskRatingArray(int i);
                      
                      /**
                       * Returns number of "mlRiskRating" element
                       */
                      int sizeOfMlRiskRatingArray();
                      
                      /**
                       * Sets array of all "mlRiskRating" element
                       */
                      void setMlRiskRatingArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.MlRiskRating[] mlRiskRatingArray);
                      
                      /**
                       * Sets ith "mlRiskRating" element
                       */
                      void setMlRiskRatingArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.MlRiskRating mlRiskRating);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "mlRiskRating" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.MlRiskRating insertNewMlRiskRating(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "mlRiskRating" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.MlRiskRating addNewMlRiskRating();
                      
                      /**
                       * Removes the ith "mlRiskRating" element
                       */
                      void removeMlRiskRating(int i);
                      
                      /**
                       * Gets the "mlLastReviewDate" element
                       */
                      java.lang.String getMlLastReviewDate();
                      
                      /**
                       * Gets (as xml) the "mlLastReviewDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetMlLastReviewDate();
                      
                      /**
                       * True if has "mlLastReviewDate" element
                       */
                      boolean isSetMlLastReviewDate();
                      
                      /**
                       * Sets the "mlLastReviewDate" element
                       */
                      void setMlLastReviewDate(java.lang.String mlLastReviewDate);
                      
                      /**
                       * Sets (as xml) the "mlLastReviewDate" element
                       */
                      void xsetMlLastReviewDate(org.apache.xmlbeans.XmlString mlLastReviewDate);
                      
                      /**
                       * Unsets the "mlLastReviewDate" element
                       */
                      void unsetMlLastReviewDate();
                      
                      /**
                       * Gets the "mlNextReviewDate" element
                       */
                      java.lang.String getMlNextReviewDate();
                      
                      /**
                       * Gets (as xml) the "mlNextReviewDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetMlNextReviewDate();
                      
                      /**
                       * True if has "mlNextReviewDate" element
                       */
                      boolean isSetMlNextReviewDate();
                      
                      /**
                       * Sets the "mlNextReviewDate" element
                       */
                      void setMlNextReviewDate(java.lang.String mlNextReviewDate);
                      
                      /**
                       * Sets (as xml) the "mlNextReviewDate" element
                       */
                      void xsetMlNextReviewDate(org.apache.xmlbeans.XmlString mlNextReviewDate);
                      
                      /**
                       * Unsets the "mlNextReviewDate" element
                       */
                      void unsetMlNextReviewDate();
                      
                      /**
                       * Gets the "firstKYCreview" element
                       */
                      java.lang.String getFirstKYCreview();
                      
                      /**
                       * Gets (as xml) the "firstKYCreview" element
                       */
                      org.apache.xmlbeans.XmlString xgetFirstKYCreview();
                      
                      /**
                       * True if has "firstKYCreview" element
                       */
                      boolean isSetFirstKYCreview();
                      
                      /**
                       * Sets the "firstKYCreview" element
                       */
                      void setFirstKYCreview(java.lang.String firstKYCreview);
                      
                      /**
                       * Sets (as xml) the "firstKYCreview" element
                       */
                      void xsetFirstKYCreview(org.apache.xmlbeans.XmlString firstKYCreview);
                      
                      /**
                       * Unsets the "firstKYCreview" element
                       */
                      void unsetFirstKYCreview();
                      
                      /**
                       * Gets the "KYCdocumentSubmitted" element
                       */
                      java.lang.String getKYCdocumentSubmitted();
                      
                      /**
                       * Gets (as xml) the "KYCdocumentSubmitted" element
                       */
                      org.apache.xmlbeans.XmlString xgetKYCdocumentSubmitted();
                      
                      /**
                       * True if has "KYCdocumentSubmitted" element
                       */
                      boolean isSetKYCdocumentSubmitted();
                      
                      /**
                       * Sets the "KYCdocumentSubmitted" element
                       */
                      void setKYCdocumentSubmitted(java.lang.String kyCdocumentSubmitted);
                      
                      /**
                       * Sets (as xml) the "KYCdocumentSubmitted" element
                       */
                      void xsetKYCdocumentSubmitted(org.apache.xmlbeans.XmlString kyCdocumentSubmitted);
                      
                      /**
                       * Unsets the "KYCdocumentSubmitted" element
                       */
                      void unsetKYCdocumentSubmitted();
                      
                      /**
                       * Gets the "GICdocumentSubmitted" element
                       */
                      java.lang.String getGICdocumentSubmitted();
                      
                      /**
                       * Gets (as xml) the "GICdocumentSubmitted" element
                       */
                      org.apache.xmlbeans.XmlString xgetGICdocumentSubmitted();
                      
                      /**
                       * True if has "GICdocumentSubmitted" element
                       */
                      boolean isSetGICdocumentSubmitted();
                      
                      /**
                       * Sets the "GICdocumentSubmitted" element
                       */
                      void setGICdocumentSubmitted(java.lang.String giCdocumentSubmitted);
                      
                      /**
                       * Sets (as xml) the "GICdocumentSubmitted" element
                       */
                      void xsetGICdocumentSubmitted(org.apache.xmlbeans.XmlString giCdocumentSubmitted);
                      
                      /**
                       * Unsets the "GICdocumentSubmitted" element
                       */
                      void unsetGICdocumentSubmitted();
                      
                      /**
                       * Gets the "exceptionalApprovalObtained" element
                       */
                      java.lang.String getExceptionalApprovalObtained();
                      
                      /**
                       * Gets (as xml) the "exceptionalApprovalObtained" element
                       */
                      org.apache.xmlbeans.XmlString xgetExceptionalApprovalObtained();
                      
                      /**
                       * True if has "exceptionalApprovalObtained" element
                       */
                      boolean isSetExceptionalApprovalObtained();
                      
                      /**
                       * Sets the "exceptionalApprovalObtained" element
                       */
                      void setExceptionalApprovalObtained(java.lang.String exceptionalApprovalObtained);
                      
                      /**
                       * Sets (as xml) the "exceptionalApprovalObtained" element
                       */
                      void xsetExceptionalApprovalObtained(org.apache.xmlbeans.XmlString exceptionalApprovalObtained);
                      
                      /**
                       * Unsets the "exceptionalApprovalObtained" element
                       */
                      void unsetExceptionalApprovalObtained();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * An XML documentOriginatingLocation(@).
                       *
                       * This is a complex type.
                       */
                      public interface DocumentOriginatingLocation extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentOriginatingLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("documentoriginatinglocation661delemtype");
                        
                        /**
                         * Gets the "documentOriginatingId" element
                         */
                        java.lang.String getDocumentOriginatingId();
                        
                        /**
                         * Gets (as xml) the "documentOriginatingId" element
                         */
                        org.apache.xmlbeans.XmlString xgetDocumentOriginatingId();
                        
                        /**
                         * True if has "documentOriginatingId" element
                         */
                        boolean isSetDocumentOriginatingId();
                        
                        /**
                         * Sets the "documentOriginatingId" element
                         */
                        void setDocumentOriginatingId(java.lang.String documentOriginatingId);
                        
                        /**
                         * Sets (as xml) the "documentOriginatingId" element
                         */
                        void xsetDocumentOriginatingId(org.apache.xmlbeans.XmlString documentOriginatingId);
                        
                        /**
                         * Unsets the "documentOriginatingId" element
                         */
                        void unsetDocumentOriginatingId();
                        
                        /**
                         * Gets the "documentOriginatingCountry" element
                         */
                        java.lang.String getDocumentOriginatingCountry();
                        
                        /**
                         * Gets (as xml) the "documentOriginatingCountry" element
                         */
                        org.apache.xmlbeans.XmlString xgetDocumentOriginatingCountry();
                        
                        /**
                         * True if has "documentOriginatingCountry" element
                         */
                        boolean isSetDocumentOriginatingCountry();
                        
                        /**
                         * Sets the "documentOriginatingCountry" element
                         */
                        void setDocumentOriginatingCountry(java.lang.String documentOriginatingCountry);
                        
                        /**
                         * Sets (as xml) the "documentOriginatingCountry" element
                         */
                        void xsetDocumentOriginatingCountry(org.apache.xmlbeans.XmlString documentOriginatingCountry);
                        
                        /**
                         * Unsets the "documentOriginatingCountry" element
                         */
                        void unsetDocumentOriginatingCountry();
                        
                        /**
                         * Gets the "documentOriginatingOrganization" element
                         */
                        java.lang.String getDocumentOriginatingOrganization();
                        
                        /**
                         * Gets (as xml) the "documentOriginatingOrganization" element
                         */
                        org.apache.xmlbeans.XmlString xgetDocumentOriginatingOrganization();
                        
                        /**
                         * True if has "documentOriginatingOrganization" element
                         */
                        boolean isSetDocumentOriginatingOrganization();
                        
                        /**
                         * Sets the "documentOriginatingOrganization" element
                         */
                        void setDocumentOriginatingOrganization(java.lang.String documentOriginatingOrganization);
                        
                        /**
                         * Sets (as xml) the "documentOriginatingOrganization" element
                         */
                        void xsetDocumentOriginatingOrganization(org.apache.xmlbeans.XmlString documentOriginatingOrganization);
                        
                        /**
                         * Unsets the "documentOriginatingOrganization" element
                         */
                        void unsetDocumentOriginatingOrganization();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.DocumentOriginatingLocation newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.DocumentOriginatingLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.DocumentOriginatingLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.DocumentOriginatingLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML mlRiskRating(@).
                       *
                       * This is a complex type.
                       */
                      public interface MlRiskRating extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MlRiskRating.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("mlriskrating8f55elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.MlRiskRating newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.MlRiskRating) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.MlRiskRating newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer.MlRiskRating) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails.KnowYourCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails newInstance() {
                        return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.MainProfileDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML subProfileDetails(@).
                 *
                 * This is a complex type.
                 */
                public interface SubProfileDetails extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubProfileDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("subprofiledetails729delemtype");
                    
                    /**
                     * Gets array of all "subProfile" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile[] getSubProfileArray();
                    
                    /**
                     * Gets ith "subProfile" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile getSubProfileArray(int i);
                    
                    /**
                     * Returns number of "subProfile" element
                     */
                    int sizeOfSubProfileArray();
                    
                    /**
                     * Sets array of all "subProfile" element
                     */
                    void setSubProfileArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile[] subProfileArray);
                    
                    /**
                     * Sets ith "subProfile" element
                     */
                    void setSubProfileArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile subProfile);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "subProfile" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile insertNewSubProfile(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "subProfile" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile addNewSubProfile();
                    
                    /**
                     * Removes the ith "subProfile" element
                     */
                    void removeSubProfile(int i);
                    
                    /**
                     * Gets array of all "officialAddress" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.OfficialAddress[] getOfficialAddressArray();
                    
                    /**
                     * Gets ith "officialAddress" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.OfficialAddress getOfficialAddressArray(int i);
                    
                    /**
                     * Returns number of "officialAddress" element
                     */
                    int sizeOfOfficialAddressArray();
                    
                    /**
                     * Sets array of all "officialAddress" element
                     */
                    void setOfficialAddressArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.OfficialAddress[] officialAddressArray);
                    
                    /**
                     * Sets ith "officialAddress" element
                     */
                    void setOfficialAddressArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.OfficialAddress officialAddress);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "officialAddress" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.OfficialAddress insertNewOfficialAddress(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "officialAddress" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.OfficialAddress addNewOfficialAddress();
                    
                    /**
                     * Removes the ith "officialAddress" element
                     */
                    void removeOfficialAddress(int i);
                    
                    /**
                     * Gets array of all "empRelationship" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship[] getEmpRelationshipArray();
                    
                    /**
                     * Gets ith "empRelationship" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship getEmpRelationshipArray(int i);
                    
                    /**
                     * Returns number of "empRelationship" element
                     */
                    int sizeOfEmpRelationshipArray();
                    
                    /**
                     * Sets array of all "empRelationship" element
                     */
                    void setEmpRelationshipArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship[] empRelationshipArray);
                    
                    /**
                     * Sets ith "empRelationship" element
                     */
                    void setEmpRelationshipArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship empRelationship);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "empRelationship" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship insertNewEmpRelationship(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "empRelationship" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship addNewEmpRelationship();
                    
                    /**
                     * Removes the ith "empRelationship" element
                     */
                    void removeEmpRelationship(int i);
                    
                    /**
                     * Gets array of all "subProfileInstructionRef" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileInstructionRef[] getSubProfileInstructionRefArray();
                    
                    /**
                     * Gets ith "subProfileInstructionRef" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileInstructionRef getSubProfileInstructionRefArray(int i);
                    
                    /**
                     * Returns number of "subProfileInstructionRef" element
                     */
                    int sizeOfSubProfileInstructionRefArray();
                    
                    /**
                     * Sets array of all "subProfileInstructionRef" element
                     */
                    void setSubProfileInstructionRefArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileInstructionRef[] subProfileInstructionRefArray);
                    
                    /**
                     * Sets ith "subProfileInstructionRef" element
                     */
                    void setSubProfileInstructionRefArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileInstructionRef subProfileInstructionRef);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "subProfileInstructionRef" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileInstructionRef insertNewSubProfileInstructionRef(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "subProfileInstructionRef" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileInstructionRef addNewSubProfileInstructionRef();
                    
                    /**
                     * Removes the ith "subProfileInstructionRef" element
                     */
                    void removeSubProfileInstructionRef(int i);
                    
                    /**
                     * Gets array of all "limitProfile" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile[] getLimitProfileArray();
                    
                    /**
                     * Gets ith "limitProfile" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile getLimitProfileArray(int i);
                    
                    /**
                     * Returns number of "limitProfile" element
                     */
                    int sizeOfLimitProfileArray();
                    
                    /**
                     * Sets array of all "limitProfile" element
                     */
                    void setLimitProfileArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile[] limitProfileArray);
                    
                    /**
                     * Sets ith "limitProfile" element
                     */
                    void setLimitProfileArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile limitProfile);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "limitProfile" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile insertNewLimitProfile(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "limitProfile" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile addNewLimitProfile();
                    
                    /**
                     * Removes the ith "limitProfile" element
                     */
                    void removeLimitProfile(int i);
                    
                    /**
                     * Gets array of all "policyException" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException[] getPolicyExceptionArray();
                    
                    /**
                     * Gets ith "policyException" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException getPolicyExceptionArray(int i);
                    
                    /**
                     * Returns number of "policyException" element
                     */
                    int sizeOfPolicyExceptionArray();
                    
                    /**
                     * Sets array of all "policyException" element
                     */
                    void setPolicyExceptionArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException[] policyExceptionArray);
                    
                    /**
                     * Sets ith "policyException" element
                     */
                    void setPolicyExceptionArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException policyException);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "policyException" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException insertNewPolicyException(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "policyException" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException addNewPolicyException();
                    
                    /**
                     * Removes the ith "policyException" element
                     */
                    void removePolicyException(int i);
                    
                    /**
                     * Gets array of all "limits" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits[] getLimitsArray();
                    
                    /**
                     * Gets ith "limits" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits getLimitsArray(int i);
                    
                    /**
                     * Returns number of "limits" element
                     */
                    int sizeOfLimitsArray();
                    
                    /**
                     * Sets array of all "limits" element
                     */
                    void setLimitsArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits[] limitsArray);
                    
                    /**
                     * Sets ith "limits" element
                     */
                    void setLimitsArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits limits);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "limits" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits insertNewLimits(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "limits" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits addNewLimits();
                    
                    /**
                     * Removes the ith "limits" element
                     */
                    void removeLimits(int i);
                    
                    /**
                     * Gets array of all "limitsSysXRefMap" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsSysXRefMap[] getLimitsSysXRefMapArray();
                    
                    /**
                     * Gets ith "limitsSysXRefMap" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsSysXRefMap getLimitsSysXRefMapArray(int i);
                    
                    /**
                     * Returns number of "limitsSysXRefMap" element
                     */
                    int sizeOfLimitsSysXRefMapArray();
                    
                    /**
                     * Sets array of all "limitsSysXRefMap" element
                     */
                    void setLimitsSysXRefMapArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsSysXRefMap[] limitsSysXRefMapArray);
                    
                    /**
                     * Sets ith "limitsSysXRefMap" element
                     */
                    void setLimitsSysXRefMapArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsSysXRefMap limitsSysXRefMap);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "limitsSysXRefMap" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsSysXRefMap insertNewLimitsSysXRefMap(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "limitsSysXRefMap" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsSysXRefMap addNewLimitsSysXRefMap();
                    
                    /**
                     * Removes the ith "limitsSysXRefMap" element
                     */
                    void removeLimitsSysXRefMap(int i);
                    
                    /**
                     * Gets array of all "limitsApprSecMap" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsApprSecMap[] getLimitsApprSecMapArray();
                    
                    /**
                     * Gets ith "limitsApprSecMap" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsApprSecMap getLimitsApprSecMapArray(int i);
                    
                    /**
                     * Returns number of "limitsApprSecMap" element
                     */
                    int sizeOfLimitsApprSecMapArray();
                    
                    /**
                     * Sets array of all "limitsApprSecMap" element
                     */
                    void setLimitsApprSecMapArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsApprSecMap[] limitsApprSecMapArray);
                    
                    /**
                     * Sets ith "limitsApprSecMap" element
                     */
                    void setLimitsApprSecMapArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsApprSecMap limitsApprSecMap);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "limitsApprSecMap" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsApprSecMap insertNewLimitsApprSecMap(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "limitsApprSecMap" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsApprSecMap addNewLimitsApprSecMap();
                    
                    /**
                     * Removes the ith "limitsApprSecMap" element
                     */
                    void removeLimitsApprSecMap(int i);
                    
                    /**
                     * Gets array of all "coborrowerLimits" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits[] getCoborrowerLimitsArray();
                    
                    /**
                     * Gets ith "coborrowerLimits" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits getCoborrowerLimitsArray(int i);
                    
                    /**
                     * Returns number of "coborrowerLimits" element
                     */
                    int sizeOfCoborrowerLimitsArray();
                    
                    /**
                     * Sets array of all "coborrowerLimits" element
                     */
                    void setCoborrowerLimitsArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits[] coborrowerLimitsArray);
                    
                    /**
                     * Sets ith "coborrowerLimits" element
                     */
                    void setCoborrowerLimitsArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits coborrowerLimits);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "coborrowerLimits" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits insertNewCoborrowerLimits(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "coborrowerLimits" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits addNewCoborrowerLimits();
                    
                    /**
                     * Removes the ith "coborrowerLimits" element
                     */
                    void removeCoborrowerLimits(int i);
                    
                    /**
                     * Gets array of all "coborrowerLmtsSecMap" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLmtsSecMap[] getCoborrowerLmtsSecMapArray();
                    
                    /**
                     * Gets ith "coborrowerLmtsSecMap" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLmtsSecMap getCoborrowerLmtsSecMapArray(int i);
                    
                    /**
                     * Returns number of "coborrowerLmtsSecMap" element
                     */
                    int sizeOfCoborrowerLmtsSecMapArray();
                    
                    /**
                     * Sets array of all "coborrowerLmtsSecMap" element
                     */
                    void setCoborrowerLmtsSecMapArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLmtsSecMap[] coborrowerLmtsSecMapArray);
                    
                    /**
                     * Sets ith "coborrowerLmtsSecMap" element
                     */
                    void setCoborrowerLmtsSecMapArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLmtsSecMap coborrowerLmtsSecMap);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "coborrowerLmtsSecMap" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLmtsSecMap insertNewCoborrowerLmtsSecMap(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "coborrowerLmtsSecMap" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLmtsSecMap addNewCoborrowerLmtsSecMap();
                    
                    /**
                     * Removes the ith "coborrowerLmtsSecMap" element
                     */
                    void removeCoborrowerLmtsSecMap(int i);
                    
                    /**
                     * Gets array of all "coborrowSysXRefMap" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowSysXRefMap[] getCoborrowSysXRefMapArray();
                    
                    /**
                     * Gets ith "coborrowSysXRefMap" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowSysXRefMap getCoborrowSysXRefMapArray(int i);
                    
                    /**
                     * Returns number of "coborrowSysXRefMap" element
                     */
                    int sizeOfCoborrowSysXRefMapArray();
                    
                    /**
                     * Sets array of all "coborrowSysXRefMap" element
                     */
                    void setCoborrowSysXRefMapArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowSysXRefMap[] coborrowSysXRefMapArray);
                    
                    /**
                     * Sets ith "coborrowSysXRefMap" element
                     */
                    void setCoborrowSysXRefMapArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowSysXRefMap coborrowSysXRefMap);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "coborrowSysXRefMap" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowSysXRefMap insertNewCoborrowSysXRefMap(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "coborrowSysXRefMap" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowSysXRefMap addNewCoborrowSysXRefMap();
                    
                    /**
                     * Removes the ith "coborrowSysXRefMap" element
                     */
                    void removeCoborrowSysXRefMap(int i);
                    
                    /**
                     * Gets array of all "subProfileSystemXRef" elements
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef[] getSubProfileSystemXRefArray();
                    
                    /**
                     * Gets ith "subProfileSystemXRef" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef getSubProfileSystemXRefArray(int i);
                    
                    /**
                     * Returns number of "subProfileSystemXRef" element
                     */
                    int sizeOfSubProfileSystemXRefArray();
                    
                    /**
                     * Sets array of all "subProfileSystemXRef" element
                     */
                    void setSubProfileSystemXRefArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef[] subProfileSystemXRefArray);
                    
                    /**
                     * Sets ith "subProfileSystemXRef" element
                     */
                    void setSubProfileSystemXRefArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef subProfileSystemXRef);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "subProfileSystemXRef" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef insertNewSubProfileSystemXRef(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "subProfileSystemXRef" element
                     */
                    com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef addNewSubProfileSystemXRef();
                    
                    /**
                     * Removes the ith "subProfileSystemXRef" element
                     */
                    void removeSubProfileSystemXRef(int i);
                    
                    /**
                     * An XML subProfile(@).
                     *
                     * This is a complex type.
                     */
                    public interface SubProfile extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubProfile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("subprofile0172elemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "subProfileId" element
                       */
                      java.lang.String getSubProfileId();
                      
                      /**
                       * Gets (as xml) the "subProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileId();
                      
                      /**
                       * True if has "subProfileId" element
                       */
                      boolean isSetSubProfileId();
                      
                      /**
                       * Sets the "subProfileId" element
                       */
                      void setSubProfileId(java.lang.String subProfileId);
                      
                      /**
                       * Sets (as xml) the "subProfileId" element
                       */
                      void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
                      
                      /**
                       * Unsets the "subProfileId" element
                       */
                      void unsetSubProfileId();
                      
                      /**
                       * Gets the "subProfileName" element
                       */
                      java.lang.String getSubProfileName();
                      
                      /**
                       * Gets (as xml) the "subProfileName" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileName();
                      
                      /**
                       * True if has "subProfileName" element
                       */
                      boolean isSetSubProfileName();
                      
                      /**
                       * Sets the "subProfileName" element
                       */
                      void setSubProfileName(java.lang.String subProfileName);
                      
                      /**
                       * Sets (as xml) the "subProfileName" element
                       */
                      void xsetSubProfileName(org.apache.xmlbeans.XmlString subProfileName);
                      
                      /**
                       * Unsets the "subProfileName" element
                       */
                      void unsetSubProfileName();
                      
                      /**
                       * Gets the "domicileCountry" element
                       */
                      java.lang.String getDomicileCountry();
                      
                      /**
                       * Gets (as xml) the "domicileCountry" element
                       */
                      org.apache.xmlbeans.XmlString xgetDomicileCountry();
                      
                      /**
                       * True if has "domicileCountry" element
                       */
                      boolean isSetDomicileCountry();
                      
                      /**
                       * Sets the "domicileCountry" element
                       */
                      void setDomicileCountry(java.lang.String domicileCountry);
                      
                      /**
                       * Sets (as xml) the "domicileCountry" element
                       */
                      void xsetDomicileCountry(org.apache.xmlbeans.XmlString domicileCountry);
                      
                      /**
                       * Unsets the "domicileCountry" element
                       */
                      void unsetDomicileCountry();
                      
                      /**
                       * Gets the "domicileCountryRegistrationNumber" element
                       */
                      java.lang.String getDomicileCountryRegistrationNumber();
                      
                      /**
                       * Gets (as xml) the "domicileCountryRegistrationNumber" element
                       */
                      org.apache.xmlbeans.XmlString xgetDomicileCountryRegistrationNumber();
                      
                      /**
                       * True if has "domicileCountryRegistrationNumber" element
                       */
                      boolean isSetDomicileCountryRegistrationNumber();
                      
                      /**
                       * Sets the "domicileCountryRegistrationNumber" element
                       */
                      void setDomicileCountryRegistrationNumber(java.lang.String domicileCountryRegistrationNumber);
                      
                      /**
                       * Sets (as xml) the "domicileCountryRegistrationNumber" element
                       */
                      void xsetDomicileCountryRegistrationNumber(org.apache.xmlbeans.XmlString domicileCountryRegistrationNumber);
                      
                      /**
                       * Unsets the "domicileCountryRegistrationNumber" element
                       */
                      void unsetDomicileCountryRegistrationNumber();
                      
                      /**
                       * Gets the "swiftCountryCode" element
                       */
                      java.lang.String getSwiftCountryCode();
                      
                      /**
                       * Gets (as xml) the "swiftCountryCode" element
                       */
                      org.apache.xmlbeans.XmlString xgetSwiftCountryCode();
                      
                      /**
                       * True if has "swiftCountryCode" element
                       */
                      boolean isSetSwiftCountryCode();
                      
                      /**
                       * Sets the "swiftCountryCode" element
                       */
                      void setSwiftCountryCode(java.lang.String swiftCountryCode);
                      
                      /**
                       * Sets (as xml) the "swiftCountryCode" element
                       */
                      void xsetSwiftCountryCode(org.apache.xmlbeans.XmlString swiftCountryCode);
                      
                      /**
                       * Unsets the "swiftCountryCode" element
                       */
                      void unsetSwiftCountryCode();
                      
                      /**
                       * Gets array of all "CustomerOrgType" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.CustomerOrgType[] getCustomerOrgTypeArray();
                      
                      /**
                       * Gets ith "CustomerOrgType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.CustomerOrgType getCustomerOrgTypeArray(int i);
                      
                      /**
                       * Returns number of "CustomerOrgType" element
                       */
                      int sizeOfCustomerOrgTypeArray();
                      
                      /**
                       * Sets array of all "CustomerOrgType" element
                       */
                      void setCustomerOrgTypeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.CustomerOrgType[] customerOrgTypeArray);
                      
                      /**
                       * Sets ith "CustomerOrgType" element
                       */
                      void setCustomerOrgTypeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.CustomerOrgType customerOrgType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "CustomerOrgType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.CustomerOrgType insertNewCustomerOrgType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "CustomerOrgType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.CustomerOrgType addNewCustomerOrgType();
                      
                      /**
                       * Removes the ith "CustomerOrgType" element
                       */
                      void removeCustomerOrgType(int i);
                      
                      /**
                       * Gets the "disclosureAgreementIndicator" element
                       */
                      java.lang.String getDisclosureAgreementIndicator();
                      
                      /**
                       * Gets (as xml) the "disclosureAgreementIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetDisclosureAgreementIndicator();
                      
                      /**
                       * True if has "disclosureAgreementIndicator" element
                       */
                      boolean isSetDisclosureAgreementIndicator();
                      
                      /**
                       * Sets the "disclosureAgreementIndicator" element
                       */
                      void setDisclosureAgreementIndicator(java.lang.String disclosureAgreementIndicator);
                      
                      /**
                       * Sets (as xml) the "disclosureAgreementIndicator" element
                       */
                      void xsetDisclosureAgreementIndicator(org.apache.xmlbeans.XmlString disclosureAgreementIndicator);
                      
                      /**
                       * Unsets the "disclosureAgreementIndicator" element
                       */
                      void unsetDisclosureAgreementIndicator();
                      
                      /**
                       * Gets the "agreementDate" element
                       */
                      java.lang.String getAgreementDate();
                      
                      /**
                       * Gets (as xml) the "agreementDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetAgreementDate();
                      
                      /**
                       * True if has "agreementDate" element
                       */
                      boolean isSetAgreementDate();
                      
                      /**
                       * Sets the "agreementDate" element
                       */
                      void setAgreementDate(java.lang.String agreementDate);
                      
                      /**
                       * Sets (as xml) the "agreementDate" element
                       */
                      void xsetAgreementDate(org.apache.xmlbeans.XmlString agreementDate);
                      
                      /**
                       * Unsets the "agreementDate" element
                       */
                      void unsetAgreementDate();
                      
                      /**
                       * Gets array of all "languageCode" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.LanguageCode[] getLanguageCodeArray();
                      
                      /**
                       * Gets ith "languageCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.LanguageCode getLanguageCodeArray(int i);
                      
                      /**
                       * Returns number of "languageCode" element
                       */
                      int sizeOfLanguageCodeArray();
                      
                      /**
                       * Sets array of all "languageCode" element
                       */
                      void setLanguageCodeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.LanguageCode[] languageCodeArray);
                      
                      /**
                       * Sets ith "languageCode" element
                       */
                      void setLanguageCodeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.LanguageCode languageCode);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "languageCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.LanguageCode insertNewLanguageCode(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "languageCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.LanguageCode addNewLanguageCode();
                      
                      /**
                       * Removes the ith "languageCode" element
                       */
                      void removeLanguageCode(int i);
                      
                      /**
                       * Gets the "relationshipStartDate" element
                       */
                      java.lang.String getRelationshipStartDate();
                      
                      /**
                       * Gets (as xml) the "relationshipStartDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetRelationshipStartDate();
                      
                      /**
                       * True if has "relationshipStartDate" element
                       */
                      boolean isSetRelationshipStartDate();
                      
                      /**
                       * Sets the "relationshipStartDate" element
                       */
                      void setRelationshipStartDate(java.lang.String relationshipStartDate);
                      
                      /**
                       * Sets (as xml) the "relationshipStartDate" element
                       */
                      void xsetRelationshipStartDate(org.apache.xmlbeans.XmlString relationshipStartDate);
                      
                      /**
                       * Unsets the "relationshipStartDate" element
                       */
                      void unsetRelationshipStartDate();
                      
                      /**
                       * Gets array of all "serviceLevelPriority" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.ServiceLevelPriority[] getServiceLevelPriorityArray();
                      
                      /**
                       * Gets ith "serviceLevelPriority" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.ServiceLevelPriority getServiceLevelPriorityArray(int i);
                      
                      /**
                       * Returns number of "serviceLevelPriority" element
                       */
                      int sizeOfServiceLevelPriorityArray();
                      
                      /**
                       * Sets array of all "serviceLevelPriority" element
                       */
                      void setServiceLevelPriorityArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.ServiceLevelPriority[] serviceLevelPriorityArray);
                      
                      /**
                       * Sets ith "serviceLevelPriority" element
                       */
                      void setServiceLevelPriorityArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.ServiceLevelPriority serviceLevelPriority);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "serviceLevelPriority" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.ServiceLevelPriority insertNewServiceLevelPriority(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "serviceLevelPriority" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.ServiceLevelPriority addNewServiceLevelPriority();
                      
                      /**
                       * Removes the ith "serviceLevelPriority" element
                       */
                      void removeServiceLevelPriority(int i);
                      
                      /**
                       * Gets array of all "treaturyInd" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.TreaturyInd[] getTreaturyIndArray();
                      
                      /**
                       * Gets ith "treaturyInd" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.TreaturyInd getTreaturyIndArray(int i);
                      
                      /**
                       * Returns number of "treaturyInd" element
                       */
                      int sizeOfTreaturyIndArray();
                      
                      /**
                       * Sets array of all "treaturyInd" element
                       */
                      void setTreaturyIndArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.TreaturyInd[] treaturyIndArray);
                      
                      /**
                       * Sets ith "treaturyInd" element
                       */
                      void setTreaturyIndArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.TreaturyInd treaturyInd);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "treaturyInd" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.TreaturyInd insertNewTreaturyInd(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "treaturyInd" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.TreaturyInd addNewTreaturyInd();
                      
                      /**
                       * Removes the ith "treaturyInd" element
                       */
                      void removeTreaturyInd(int i);
                      
                      /**
                       * Gets array of all "operationStatus2" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.OperationStatus2[] getOperationStatus2Array();
                      
                      /**
                       * Gets ith "operationStatus2" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.OperationStatus2 getOperationStatus2Array(int i);
                      
                      /**
                       * Returns number of "operationStatus2" element
                       */
                      int sizeOfOperationStatus2Array();
                      
                      /**
                       * Sets array of all "operationStatus2" element
                       */
                      void setOperationStatus2Array(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.OperationStatus2[] operationStatus2Array);
                      
                      /**
                       * Sets ith "operationStatus2" element
                       */
                      void setOperationStatus2Array(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.OperationStatus2 operationStatus2);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "operationStatus2" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.OperationStatus2 insertNewOperationStatus2(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "operationStatus2" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.OperationStatus2 addNewOperationStatus2();
                      
                      /**
                       * Removes the ith "operationStatus2" element
                       */
                      void removeOperationStatus2(int i);
                      
                      /**
                       * Gets the "operationStatus2EffDate" element
                       */
                      java.lang.String getOperationStatus2EffDate();
                      
                      /**
                       * Gets (as xml) the "operationStatus2EffDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetOperationStatus2EffDate();
                      
                      /**
                       * True if has "operationStatus2EffDate" element
                       */
                      boolean isSetOperationStatus2EffDate();
                      
                      /**
                       * Sets the "operationStatus2EffDate" element
                       */
                      void setOperationStatus2EffDate(java.lang.String operationStatus2EffDate);
                      
                      /**
                       * Sets (as xml) the "operationStatus2EffDate" element
                       */
                      void xsetOperationStatus2EffDate(org.apache.xmlbeans.XmlString operationStatus2EffDate);
                      
                      /**
                       * Unsets the "operationStatus2EffDate" element
                       */
                      void unsetOperationStatus2EffDate();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * An XML CustomerOrgType(@).
                       *
                       * This is a complex type.
                       */
                      public interface CustomerOrgType extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CustomerOrgType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("customerorgtypef416elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.CustomerOrgType newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.CustomerOrgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.CustomerOrgType newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.CustomerOrgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML languageCode(@).
                       *
                       * This is a complex type.
                       */
                      public interface LanguageCode extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LanguageCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("languagecode5221elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.LanguageCode newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.LanguageCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.LanguageCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.LanguageCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML serviceLevelPriority(@).
                       *
                       * This is a complex type.
                       */
                      public interface ServiceLevelPriority extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceLevelPriority.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("servicelevelpriority0fb3elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.ServiceLevelPriority newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.ServiceLevelPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.ServiceLevelPriority newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.ServiceLevelPriority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML treaturyInd(@).
                       *
                       * This is a complex type.
                       */
                      public interface TreaturyInd extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TreaturyInd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("treaturyind6d39elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.TreaturyInd newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.TreaturyInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.TreaturyInd newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.TreaturyInd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML operationStatus2(@).
                       *
                       * This is a complex type.
                       */
                      public interface OperationStatus2 extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationStatus2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("operationstatus238edelemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.OperationStatus2 newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.OperationStatus2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.OperationStatus2 newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile.OperationStatus2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML officialAddress(@).
                     *
                     * This is a complex type.
                     */
                    public interface OfficialAddress extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfficialAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("officialaddress14a2elemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "subProfileId" element
                       */
                      java.lang.String getSubProfileId();
                      
                      /**
                       * Gets (as xml) the "subProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileId();
                      
                      /**
                       * True if has "subProfileId" element
                       */
                      boolean isSetSubProfileId();
                      
                      /**
                       * Sets the "subProfileId" element
                       */
                      void setSubProfileId(java.lang.String subProfileId);
                      
                      /**
                       * Sets (as xml) the "subProfileId" element
                       */
                      void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
                      
                      /**
                       * Unsets the "subProfileId" element
                       */
                      void unsetSubProfileId();
                      
                      /**
                       * Gets the "addressId" element
                       */
                      java.lang.String getAddressId();
                      
                      /**
                       * Gets (as xml) the "addressId" element
                       */
                      org.apache.xmlbeans.XmlString xgetAddressId();
                      
                      /**
                       * True if has "addressId" element
                       */
                      boolean isSetAddressId();
                      
                      /**
                       * Sets the "addressId" element
                       */
                      void setAddressId(java.lang.String addressId);
                      
                      /**
                       * Sets (as xml) the "addressId" element
                       */
                      void xsetAddressId(org.apache.xmlbeans.XmlString addressId);
                      
                      /**
                       * Unsets the "addressId" element
                       */
                      void unsetAddressId();
                      
                      /**
                       * Gets array of all "addressType" elements
                       */
                      com.stanchart.customer.AddressTypeDocument.AddressType[] getAddressTypeArray();
                      
                      /**
                       * Gets ith "addressType" element
                       */
                      com.stanchart.customer.AddressTypeDocument.AddressType getAddressTypeArray(int i);
                      
                      /**
                       * Returns number of "addressType" element
                       */
                      int sizeOfAddressTypeArray();
                      
                      /**
                       * Sets array of all "addressType" element
                       */
                      void setAddressTypeArray(com.stanchart.customer.AddressTypeDocument.AddressType[] addressTypeArray);
                      
                      /**
                       * Sets ith "addressType" element
                       */
                      void setAddressTypeArray(int i, com.stanchart.customer.AddressTypeDocument.AddressType addressType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "addressType" element
                       */
                      com.stanchart.customer.AddressTypeDocument.AddressType insertNewAddressType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "addressType" element
                       */
                      com.stanchart.customer.AddressTypeDocument.AddressType addNewAddressType();
                      
                      /**
                       * Removes the ith "addressType" element
                       */
                      void removeAddressType(int i);
                      
                      /**
                       * Gets the "attnParty" element
                       */
                      java.lang.String getAttnParty();
                      
                      /**
                       * Gets (as xml) the "attnParty" element
                       */
                      org.apache.xmlbeans.XmlString xgetAttnParty();
                      
                      /**
                       * True if has "attnParty" element
                       */
                      boolean isSetAttnParty();
                      
                      /**
                       * Sets the "attnParty" element
                       */
                      void setAttnParty(java.lang.String attnParty);
                      
                      /**
                       * Sets (as xml) the "attnParty" element
                       */
                      void xsetAttnParty(org.apache.xmlbeans.XmlString attnParty);
                      
                      /**
                       * Unsets the "attnParty" element
                       */
                      void unsetAttnParty();
                      
                      /**
                       * Gets the "line1" element
                       */
                      java.lang.String getLine1();
                      
                      /**
                       * Gets (as xml) the "line1" element
                       */
                      org.apache.xmlbeans.XmlString xgetLine1();
                      
                      /**
                       * True if has "line1" element
                       */
                      boolean isSetLine1();
                      
                      /**
                       * Sets the "line1" element
                       */
                      void setLine1(java.lang.String line1);
                      
                      /**
                       * Sets (as xml) the "line1" element
                       */
                      void xsetLine1(org.apache.xmlbeans.XmlString line1);
                      
                      /**
                       * Unsets the "line1" element
                       */
                      void unsetLine1();
                      
                      /**
                       * Gets the "line2" element
                       */
                      java.lang.String getLine2();
                      
                      /**
                       * Gets (as xml) the "line2" element
                       */
                      org.apache.xmlbeans.XmlString xgetLine2();
                      
                      /**
                       * True if has "line2" element
                       */
                      boolean isSetLine2();
                      
                      /**
                       * Sets the "line2" element
                       */
                      void setLine2(java.lang.String line2);
                      
                      /**
                       * Sets (as xml) the "line2" element
                       */
                      void xsetLine2(org.apache.xmlbeans.XmlString line2);
                      
                      /**
                       * Unsets the "line2" element
                       */
                      void unsetLine2();
                      
                      /**
                       * Gets the "city" element
                       */
                      java.lang.String getCity();
                      
                      /**
                       * Gets (as xml) the "city" element
                       */
                      org.apache.xmlbeans.XmlString xgetCity();
                      
                      /**
                       * True if has "city" element
                       */
                      boolean isSetCity();
                      
                      /**
                       * Sets the "city" element
                       */
                      void setCity(java.lang.String city);
                      
                      /**
                       * Sets (as xml) the "city" element
                       */
                      void xsetCity(org.apache.xmlbeans.XmlString city);
                      
                      /**
                       * Unsets the "city" element
                       */
                      void unsetCity();
                      
                      /**
                       * Gets the "state" element
                       */
                      java.lang.String getState();
                      
                      /**
                       * Gets (as xml) the "state" element
                       */
                      org.apache.xmlbeans.XmlString xgetState();
                      
                      /**
                       * True if has "state" element
                       */
                      boolean isSetState();
                      
                      /**
                       * Sets the "state" element
                       */
                      void setState(java.lang.String state);
                      
                      /**
                       * Sets (as xml) the "state" element
                       */
                      void xsetState(org.apache.xmlbeans.XmlString state);
                      
                      /**
                       * Unsets the "state" element
                       */
                      void unsetState();
                      
                      /**
                       * Gets the "country" element
                       */
                      java.lang.String getCountry();
                      
                      /**
                       * Gets (as xml) the "country" element
                       */
                      org.apache.xmlbeans.XmlString xgetCountry();
                      
                      /**
                       * True if has "country" element
                       */
                      boolean isSetCountry();
                      
                      /**
                       * Sets the "country" element
                       */
                      void setCountry(java.lang.String country);
                      
                      /**
                       * Sets (as xml) the "country" element
                       */
                      void xsetCountry(org.apache.xmlbeans.XmlString country);
                      
                      /**
                       * Unsets the "country" element
                       */
                      void unsetCountry();
                      
                      /**
                       * Gets the "postCode" element
                       */
                      java.lang.String getPostCode();
                      
                      /**
                       * Gets (as xml) the "postCode" element
                       */
                      org.apache.xmlbeans.XmlString xgetPostCode();
                      
                      /**
                       * True if has "postCode" element
                       */
                      boolean isSetPostCode();
                      
                      /**
                       * Sets the "postCode" element
                       */
                      void setPostCode(java.lang.String postCode);
                      
                      /**
                       * Sets (as xml) the "postCode" element
                       */
                      void xsetPostCode(org.apache.xmlbeans.XmlString postCode);
                      
                      /**
                       * Unsets the "postCode" element
                       */
                      void unsetPostCode();
                      
                      /**
                       * Gets the "fax" element
                       */
                      java.lang.String getFax();
                      
                      /**
                       * Gets (as xml) the "fax" element
                       */
                      org.apache.xmlbeans.XmlString xgetFax();
                      
                      /**
                       * True if has "fax" element
                       */
                      boolean isSetFax();
                      
                      /**
                       * Sets the "fax" element
                       */
                      void setFax(java.lang.String fax);
                      
                      /**
                       * Sets (as xml) the "fax" element
                       */
                      void xsetFax(org.apache.xmlbeans.XmlString fax);
                      
                      /**
                       * Unsets the "fax" element
                       */
                      void unsetFax();
                      
                      /**
                       * Gets the "email" element
                       */
                      java.lang.String getEmail();
                      
                      /**
                       * Gets (as xml) the "email" element
                       */
                      org.apache.xmlbeans.XmlString xgetEmail();
                      
                      /**
                       * True if has "email" element
                       */
                      boolean isSetEmail();
                      
                      /**
                       * Sets the "email" element
                       */
                      void setEmail(java.lang.String email);
                      
                      /**
                       * Sets (as xml) the "email" element
                       */
                      void xsetEmail(org.apache.xmlbeans.XmlString email);
                      
                      /**
                       * Unsets the "email" element
                       */
                      void unsetEmail();
                      
                      /**
                       * Gets the "phone" element
                       */
                      java.lang.String getPhone();
                      
                      /**
                       * Gets (as xml) the "phone" element
                       */
                      org.apache.xmlbeans.XmlString xgetPhone();
                      
                      /**
                       * True if has "phone" element
                       */
                      boolean isSetPhone();
                      
                      /**
                       * Sets the "phone" element
                       */
                      void setPhone(java.lang.String phone);
                      
                      /**
                       * Sets (as xml) the "phone" element
                       */
                      void xsetPhone(org.apache.xmlbeans.XmlString phone);
                      
                      /**
                       * Unsets the "phone" element
                       */
                      void unsetPhone();
                      
                      /**
                       * Gets the "telex" element
                       */
                      java.lang.String getTelex();
                      
                      /**
                       * Gets (as xml) the "telex" element
                       */
                      org.apache.xmlbeans.XmlString xgetTelex();
                      
                      /**
                       * True if has "telex" element
                       */
                      boolean isSetTelex();
                      
                      /**
                       * Sets the "telex" element
                       */
                      void setTelex(java.lang.String telex);
                      
                      /**
                       * Sets (as xml) the "telex" element
                       */
                      void xsetTelex(org.apache.xmlbeans.XmlString telex);
                      
                      /**
                       * Unsets the "telex" element
                       */
                      void unsetTelex();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.OfficialAddress newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.OfficialAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.OfficialAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.OfficialAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML empRelationship(@).
                     *
                     * This is a complex type.
                     */
                    public interface EmpRelationship extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmpRelationship.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("emprelationship3239elemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "subProfileId" element
                       */
                      java.lang.String getSubProfileId();
                      
                      /**
                       * Gets (as xml) the "subProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileId();
                      
                      /**
                       * True if has "subProfileId" element
                       */
                      boolean isSetSubProfileId();
                      
                      /**
                       * Sets the "subProfileId" element
                       */
                      void setSubProfileId(java.lang.String subProfileId);
                      
                      /**
                       * Sets (as xml) the "subProfileId" element
                       */
                      void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
                      
                      /**
                       * Unsets the "subProfileId" element
                       */
                      void unsetSubProfileId();
                      
                      /**
                       * Gets the "empEmpCodeMapId" element
                       */
                      java.lang.String getEmpEmpCodeMapId();
                      
                      /**
                       * Gets (as xml) the "empEmpCodeMapId" element
                       */
                      org.apache.xmlbeans.XmlString xgetEmpEmpCodeMapId();
                      
                      /**
                       * True if has "empEmpCodeMapId" element
                       */
                      boolean isSetEmpEmpCodeMapId();
                      
                      /**
                       * Sets the "empEmpCodeMapId" element
                       */
                      void setEmpEmpCodeMapId(java.lang.String empEmpCodeMapId);
                      
                      /**
                       * Sets (as xml) the "empEmpCodeMapId" element
                       */
                      void xsetEmpEmpCodeMapId(org.apache.xmlbeans.XmlString empEmpCodeMapId);
                      
                      /**
                       * Unsets the "empEmpCodeMapId" element
                       */
                      void unsetEmpEmpCodeMapId();
                      
                      /**
                       * Gets the "empMapId" element
                       */
                      java.lang.String getEmpMapId();
                      
                      /**
                       * Gets (as xml) the "empMapId" element
                       */
                      org.apache.xmlbeans.XmlString xgetEmpMapId();
                      
                      /**
                       * True if has "empMapId" element
                       */
                      boolean isSetEmpMapId();
                      
                      /**
                       * Sets the "empMapId" element
                       */
                      void setEmpMapId(java.lang.String empMapId);
                      
                      /**
                       * Sets (as xml) the "empMapId" element
                       */
                      void xsetEmpMapId(org.apache.xmlbeans.XmlString empMapId);
                      
                      /**
                       * Unsets the "empMapId" element
                       */
                      void unsetEmpMapId();
                      
                      /**
                       * Gets the "empId" element
                       */
                      java.lang.String getEmpId();
                      
                      /**
                       * Gets (as xml) the "empId" element
                       */
                      org.apache.xmlbeans.XmlString xgetEmpId();
                      
                      /**
                       * True if has "empId" element
                       */
                      boolean isSetEmpId();
                      
                      /**
                       * Sets the "empId" element
                       */
                      void setEmpId(java.lang.String empId);
                      
                      /**
                       * Sets (as xml) the "empId" element
                       */
                      void xsetEmpId(org.apache.xmlbeans.XmlString empId);
                      
                      /**
                       * Unsets the "empId" element
                       */
                      void unsetEmpId();
                      
                      /**
                       * Gets the "empCode" element
                       */
                      java.lang.String getEmpCode();
                      
                      /**
                       * Gets (as xml) the "empCode" element
                       */
                      org.apache.xmlbeans.XmlString xgetEmpCode();
                      
                      /**
                       * True if has "empCode" element
                       */
                      boolean isSetEmpCode();
                      
                      /**
                       * Sets the "empCode" element
                       */
                      void setEmpCode(java.lang.String empCode);
                      
                      /**
                       * Sets (as xml) the "empCode" element
                       */
                      void xsetEmpCode(org.apache.xmlbeans.XmlString empCode);
                      
                      /**
                       * Unsets the "empCode" element
                       */
                      void unsetEmpCode();
                      
                      /**
                       * Gets the "empName" element
                       */
                      java.lang.String getEmpName();
                      
                      /**
                       * Gets (as xml) the "empName" element
                       */
                      org.apache.xmlbeans.XmlString xgetEmpName();
                      
                      /**
                       * True if has "empName" element
                       */
                      boolean isSetEmpName();
                      
                      /**
                       * Sets the "empName" element
                       */
                      void setEmpName(java.lang.String empName);
                      
                      /**
                       * Sets (as xml) the "empName" element
                       */
                      void xsetEmpName(org.apache.xmlbeans.XmlString empName);
                      
                      /**
                       * Unsets the "empName" element
                       */
                      void unsetEmpName();
                      
                      /**
                       * Gets array of all "bkgLocation" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.BkgLocation[] getBkgLocationArray();
                      
                      /**
                       * Gets ith "bkgLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.BkgLocation getBkgLocationArray(int i);
                      
                      /**
                       * Returns number of "bkgLocation" element
                       */
                      int sizeOfBkgLocationArray();
                      
                      /**
                       * Sets array of all "bkgLocation" element
                       */
                      void setBkgLocationArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.BkgLocation[] bkgLocationArray);
                      
                      /**
                       * Sets ith "bkgLocation" element
                       */
                      void setBkgLocationArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.BkgLocation bkgLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "bkgLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.BkgLocation insertNewBkgLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "bkgLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.BkgLocation addNewBkgLocation();
                      
                      /**
                       * Removes the ith "bkgLocation" element
                       */
                      void removeBkgLocation(int i);
                      
                      /**
                       * Gets array of all "empRelationshipType" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.EmpRelationshipType[] getEmpRelationshipTypeArray();
                      
                      /**
                       * Gets ith "empRelationshipType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.EmpRelationshipType getEmpRelationshipTypeArray(int i);
                      
                      /**
                       * Returns number of "empRelationshipType" element
                       */
                      int sizeOfEmpRelationshipTypeArray();
                      
                      /**
                       * Sets array of all "empRelationshipType" element
                       */
                      void setEmpRelationshipTypeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.EmpRelationshipType[] empRelationshipTypeArray);
                      
                      /**
                       * Sets ith "empRelationshipType" element
                       */
                      void setEmpRelationshipTypeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.EmpRelationshipType empRelationshipType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "empRelationshipType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.EmpRelationshipType insertNewEmpRelationshipType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "empRelationshipType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.EmpRelationshipType addNewEmpRelationshipType();
                      
                      /**
                       * Removes the ith "empRelationshipType" element
                       */
                      void removeEmpRelationshipType(int i);
                      
                      /**
                       * Gets the "principalFAMInd" element
                       */
                      java.lang.String getPrincipalFAMInd();
                      
                      /**
                       * Gets (as xml) the "principalFAMInd" element
                       */
                      org.apache.xmlbeans.XmlString xgetPrincipalFAMInd();
                      
                      /**
                       * True if has "principalFAMInd" element
                       */
                      boolean isSetPrincipalFAMInd();
                      
                      /**
                       * Sets the "principalFAMInd" element
                       */
                      void setPrincipalFAMInd(java.lang.String principalFAMInd);
                      
                      /**
                       * Sets (as xml) the "principalFAMInd" element
                       */
                      void xsetPrincipalFAMInd(org.apache.xmlbeans.XmlString principalFAMInd);
                      
                      /**
                       * Unsets the "principalFAMInd" element
                       */
                      void unsetPrincipalFAMInd();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * An XML bkgLocation(@).
                       *
                       * This is a complex type.
                       */
                      public interface BkgLocation extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BkgLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("bkglocationc908elemtype");
                        
                        /**
                         * Gets the "bkgLocationId" element
                         */
                        java.lang.String getBkgLocationId();
                        
                        /**
                         * Gets (as xml) the "bkgLocationId" element
                         */
                        org.apache.xmlbeans.XmlString xgetBkgLocationId();
                        
                        /**
                         * True if has "bkgLocationId" element
                         */
                        boolean isSetBkgLocationId();
                        
                        /**
                         * Sets the "bkgLocationId" element
                         */
                        void setBkgLocationId(java.lang.String bkgLocationId);
                        
                        /**
                         * Sets (as xml) the "bkgLocationId" element
                         */
                        void xsetBkgLocationId(org.apache.xmlbeans.XmlString bkgLocationId);
                        
                        /**
                         * Unsets the "bkgLocationId" element
                         */
                        void unsetBkgLocationId();
                        
                        /**
                         * Gets the "bkgLocationCountry" element
                         */
                        java.lang.String getBkgLocationCountry();
                        
                        /**
                         * Gets (as xml) the "bkgLocationCountry" element
                         */
                        org.apache.xmlbeans.XmlString xgetBkgLocationCountry();
                        
                        /**
                         * True if has "bkgLocationCountry" element
                         */
                        boolean isSetBkgLocationCountry();
                        
                        /**
                         * Sets the "bkgLocationCountry" element
                         */
                        void setBkgLocationCountry(java.lang.String bkgLocationCountry);
                        
                        /**
                         * Sets (as xml) the "bkgLocationCountry" element
                         */
                        void xsetBkgLocationCountry(org.apache.xmlbeans.XmlString bkgLocationCountry);
                        
                        /**
                         * Unsets the "bkgLocationCountry" element
                         */
                        void unsetBkgLocationCountry();
                        
                        /**
                         * Gets the "bkgLocationOrganization" element
                         */
                        java.lang.String getBkgLocationOrganization();
                        
                        /**
                         * Gets (as xml) the "bkgLocationOrganization" element
                         */
                        org.apache.xmlbeans.XmlString xgetBkgLocationOrganization();
                        
                        /**
                         * True if has "bkgLocationOrganization" element
                         */
                        boolean isSetBkgLocationOrganization();
                        
                        /**
                         * Sets the "bkgLocationOrganization" element
                         */
                        void setBkgLocationOrganization(java.lang.String bkgLocationOrganization);
                        
                        /**
                         * Sets (as xml) the "bkgLocationOrganization" element
                         */
                        void xsetBkgLocationOrganization(org.apache.xmlbeans.XmlString bkgLocationOrganization);
                        
                        /**
                         * Unsets the "bkgLocationOrganization" element
                         */
                        void unsetBkgLocationOrganization();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.BkgLocation newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.BkgLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.BkgLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.BkgLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML empRelationshipType(@).
                       *
                       * This is a complex type.
                       */
                      public interface EmpRelationshipType extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmpRelationshipType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("emprelationshiptype8dafelemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.EmpRelationshipType newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.EmpRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.EmpRelationshipType newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship.EmpRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.EmpRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML subProfileInstructionRef(@).
                     *
                     * This is a complex type.
                     */
                    public interface SubProfileInstructionRef extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubProfileInstructionRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("subprofileinstructionrefaff7elemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "subProfileId" element
                       */
                      java.lang.String getSubProfileId();
                      
                      /**
                       * Gets (as xml) the "subProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileId();
                      
                      /**
                       * True if has "subProfileId" element
                       */
                      boolean isSetSubProfileId();
                      
                      /**
                       * Sets the "subProfileId" element
                       */
                      void setSubProfileId(java.lang.String subProfileId);
                      
                      /**
                       * Sets (as xml) the "subProfileId" element
                       */
                      void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
                      
                      /**
                       * Unsets the "subProfileId" element
                       */
                      void unsetSubProfileId();
                      
                      /**
                       * Gets the "instructionRefMapId" element
                       */
                      java.lang.String getInstructionRefMapId();
                      
                      /**
                       * Gets (as xml) the "instructionRefMapId" element
                       */
                      org.apache.xmlbeans.XmlString xgetInstructionRefMapId();
                      
                      /**
                       * True if has "instructionRefMapId" element
                       */
                      boolean isSetInstructionRefMapId();
                      
                      /**
                       * Sets the "instructionRefMapId" element
                       */
                      void setInstructionRefMapId(java.lang.String instructionRefMapId);
                      
                      /**
                       * Sets (as xml) the "instructionRefMapId" element
                       */
                      void xsetInstructionRefMapId(org.apache.xmlbeans.XmlString instructionRefMapId);
                      
                      /**
                       * Unsets the "instructionRefMapId" element
                       */
                      void unsetInstructionRefMapId();
                      
                      /**
                       * Gets the "instructionRefId" element
                       */
                      java.lang.String getInstructionRefId();
                      
                      /**
                       * Gets (as xml) the "instructionRefId" element
                       */
                      org.apache.xmlbeans.XmlString xgetInstructionRefId();
                      
                      /**
                       * True if has "instructionRefId" element
                       */
                      boolean isSetInstructionRefId();
                      
                      /**
                       * Sets the "instructionRefId" element
                       */
                      void setInstructionRefId(java.lang.String instructionRefId);
                      
                      /**
                       * Sets (as xml) the "instructionRefId" element
                       */
                      void xsetInstructionRefId(org.apache.xmlbeans.XmlString instructionRefId);
                      
                      /**
                       * Unsets the "instructionRefId" element
                       */
                      void unsetInstructionRefId();
                      
                      /**
                       * Gets the "instructionRefNumber" element
                       */
                      java.lang.String getInstructionRefNumber();
                      
                      /**
                       * Gets (as xml) the "instructionRefNumber" element
                       */
                      org.apache.xmlbeans.XmlString xgetInstructionRefNumber();
                      
                      /**
                       * True if has "instructionRefNumber" element
                       */
                      boolean isSetInstructionRefNumber();
                      
                      /**
                       * Sets the "instructionRefNumber" element
                       */
                      void setInstructionRefNumber(java.lang.String instructionRefNumber);
                      
                      /**
                       * Sets (as xml) the "instructionRefNumber" element
                       */
                      void xsetInstructionRefNumber(org.apache.xmlbeans.XmlString instructionRefNumber);
                      
                      /**
                       * Unsets the "instructionRefNumber" element
                       */
                      void unsetInstructionRefNumber();
                      
                      /**
                       * Gets array of all "instructionRefType" elements
                       */
                      com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType[] getInstructionRefTypeArray();
                      
                      /**
                       * Gets ith "instructionRefType" element
                       */
                      com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType getInstructionRefTypeArray(int i);
                      
                      /**
                       * Returns number of "instructionRefType" element
                       */
                      int sizeOfInstructionRefTypeArray();
                      
                      /**
                       * Sets array of all "instructionRefType" element
                       */
                      void setInstructionRefTypeArray(com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType[] instructionRefTypeArray);
                      
                      /**
                       * Sets ith "instructionRefType" element
                       */
                      void setInstructionRefTypeArray(int i, com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType instructionRefType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "instructionRefType" element
                       */
                      com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType insertNewInstructionRefType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "instructionRefType" element
                       */
                      com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType addNewInstructionRefType();
                      
                      /**
                       * Removes the ith "instructionRefType" element
                       */
                      void removeInstructionRefType(int i);
                      
                      /**
                       * Gets array of all "instructionBookingLocation" elements
                       */
                      com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation[] getInstructionBookingLocationArray();
                      
                      /**
                       * Gets ith "instructionBookingLocation" element
                       */
                      com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation getInstructionBookingLocationArray(int i);
                      
                      /**
                       * Returns number of "instructionBookingLocation" element
                       */
                      int sizeOfInstructionBookingLocationArray();
                      
                      /**
                       * Sets array of all "instructionBookingLocation" element
                       */
                      void setInstructionBookingLocationArray(com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation[] instructionBookingLocationArray);
                      
                      /**
                       * Sets ith "instructionBookingLocation" element
                       */
                      void setInstructionBookingLocationArray(int i, com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation instructionBookingLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "instructionBookingLocation" element
                       */
                      com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation insertNewInstructionBookingLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "instructionBookingLocation" element
                       */
                      com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation addNewInstructionBookingLocation();
                      
                      /**
                       * Removes the ith "instructionBookingLocation" element
                       */
                      void removeInstructionBookingLocation(int i);
                      
                      /**
                       * Gets the "instructionRefApprovalDate" element
                       */
                      java.lang.String getInstructionRefApprovalDate();
                      
                      /**
                       * Gets (as xml) the "instructionRefApprovalDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetInstructionRefApprovalDate();
                      
                      /**
                       * True if has "instructionRefApprovalDate" element
                       */
                      boolean isSetInstructionRefApprovalDate();
                      
                      /**
                       * Sets the "instructionRefApprovalDate" element
                       */
                      void setInstructionRefApprovalDate(java.lang.String instructionRefApprovalDate);
                      
                      /**
                       * Sets (as xml) the "instructionRefApprovalDate" element
                       */
                      void xsetInstructionRefApprovalDate(org.apache.xmlbeans.XmlString instructionRefApprovalDate);
                      
                      /**
                       * Unsets the "instructionRefApprovalDate" element
                       */
                      void unsetInstructionRefApprovalDate();
                      
                      /**
                       * Gets the "comments" element
                       */
                      java.lang.String getComments();
                      
                      /**
                       * Gets (as xml) the "comments" element
                       */
                      org.apache.xmlbeans.XmlString xgetComments();
                      
                      /**
                       * True if has "comments" element
                       */
                      boolean isSetComments();
                      
                      /**
                       * Sets the "comments" element
                       */
                      void setComments(java.lang.String comments);
                      
                      /**
                       * Sets (as xml) the "comments" element
                       */
                      void xsetComments(org.apache.xmlbeans.XmlString comments);
                      
                      /**
                       * Unsets the "comments" element
                       */
                      void unsetComments();
                      
                      /**
                       * Gets the "updateMainProfileInd" element
                       */
                      java.lang.String getUpdateMainProfileInd();
                      
                      /**
                       * Gets (as xml) the "updateMainProfileInd" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateMainProfileInd();
                      
                      /**
                       * True if has "updateMainProfileInd" element
                       */
                      boolean isSetUpdateMainProfileInd();
                      
                      /**
                       * Sets the "updateMainProfileInd" element
                       */
                      void setUpdateMainProfileInd(java.lang.String updateMainProfileInd);
                      
                      /**
                       * Sets (as xml) the "updateMainProfileInd" element
                       */
                      void xsetUpdateMainProfileInd(org.apache.xmlbeans.XmlString updateMainProfileInd);
                      
                      /**
                       * Unsets the "updateMainProfileInd" element
                       */
                      void unsetUpdateMainProfileInd();
                      
                      /**
                       * Gets the "userGroupInd" element
                       */
                      java.lang.String getUserGroupInd();
                      
                      /**
                       * Gets (as xml) the "userGroupInd" element
                       */
                      org.apache.xmlbeans.XmlString xgetUserGroupInd();
                      
                      /**
                       * True if has "userGroupInd" element
                       */
                      boolean isSetUserGroupInd();
                      
                      /**
                       * Sets the "userGroupInd" element
                       */
                      void setUserGroupInd(java.lang.String userGroupInd);
                      
                      /**
                       * Sets (as xml) the "userGroupInd" element
                       */
                      void xsetUserGroupInd(org.apache.xmlbeans.XmlString userGroupInd);
                      
                      /**
                       * Unsets the "userGroupInd" element
                       */
                      void unsetUserGroupInd();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileInstructionRef newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileInstructionRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileInstructionRef newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileInstructionRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML limitProfile(@).
                     *
                     * This is a complex type.
                     */
                    public interface LimitProfile extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LimitProfile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("limitprofilec497elemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "subProfileId" element
                       */
                      java.lang.String getSubProfileId();
                      
                      /**
                       * Gets (as xml) the "subProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileId();
                      
                      /**
                       * True if has "subProfileId" element
                       */
                      boolean isSetSubProfileId();
                      
                      /**
                       * Sets the "subProfileId" element
                       */
                      void setSubProfileId(java.lang.String subProfileId);
                      
                      /**
                       * Sets (as xml) the "subProfileId" element
                       */
                      void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
                      
                      /**
                       * Unsets the "subProfileId" element
                       */
                      void unsetSubProfileId();
                      
                      /**
                       * Gets the "limitProfileId" element
                       */
                      java.lang.String getLimitProfileId();
                      
                      /**
                       * Gets (as xml) the "limitProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitProfileId();
                      
                      /**
                       * True if has "limitProfileId" element
                       */
                      boolean isSetLimitProfileId();
                      
                      /**
                       * Sets the "limitProfileId" element
                       */
                      void setLimitProfileId(java.lang.String limitProfileId);
                      
                      /**
                       * Sets (as xml) the "limitProfileId" element
                       */
                      void xsetLimitProfileId(org.apache.xmlbeans.XmlString limitProfileId);
                      
                      /**
                       * Unsets the "limitProfileId" element
                       */
                      void unsetLimitProfileId();
                      
                      /**
                       * Gets the "BCArefNumber" element
                       */
                      java.lang.String getBCArefNumber();
                      
                      /**
                       * Gets (as xml) the "BCArefNumber" element
                       */
                      org.apache.xmlbeans.XmlString xgetBCArefNumber();
                      
                      /**
                       * True if has "BCArefNumber" element
                       */
                      boolean isSetBCArefNumber();
                      
                      /**
                       * Sets the "BCArefNumber" element
                       */
                      void setBCArefNumber(java.lang.String bcArefNumber);
                      
                      /**
                       * Sets (as xml) the "BCArefNumber" element
                       */
                      void xsetBCArefNumber(org.apache.xmlbeans.XmlString bcArefNumber);
                      
                      /**
                       * Unsets the "BCArefNumber" element
                       */
                      void unsetBCArefNumber();
                      
                      /**
                       * Gets the "BCAapproveDate" element
                       */
                      java.lang.String getBCAapproveDate();
                      
                      /**
                       * Gets (as xml) the "BCAapproveDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetBCAapproveDate();
                      
                      /**
                       * True if has "BCAapproveDate" element
                       */
                      boolean isSetBCAapproveDate();
                      
                      /**
                       * Sets the "BCAapproveDate" element
                       */
                      void setBCAapproveDate(java.lang.String bcAapproveDate);
                      
                      /**
                       * Sets (as xml) the "BCAapproveDate" element
                       */
                      void xsetBCAapproveDate(org.apache.xmlbeans.XmlString bcAapproveDate);
                      
                      /**
                       * Unsets the "BCAapproveDate" element
                       */
                      void unsetBCAapproveDate();
                      
                      /**
                       * Gets array of all "originatingLocation" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.OriginatingLocation[] getOriginatingLocationArray();
                      
                      /**
                       * Gets ith "originatingLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.OriginatingLocation getOriginatingLocationArray(int i);
                      
                      /**
                       * Returns number of "originatingLocation" element
                       */
                      int sizeOfOriginatingLocationArray();
                      
                      /**
                       * Sets array of all "originatingLocation" element
                       */
                      void setOriginatingLocationArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.OriginatingLocation[] originatingLocationArray);
                      
                      /**
                       * Sets ith "originatingLocation" element
                       */
                      void setOriginatingLocationArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.OriginatingLocation originatingLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "originatingLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.OriginatingLocation insertNewOriginatingLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "originatingLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.OriginatingLocation addNewOriginatingLocation();
                      
                      /**
                       * Removes the ith "originatingLocation" element
                       */
                      void removeOriginatingLocation(int i);
                      
                      /**
                       * Gets the "interimReviewDate" element
                       */
                      java.lang.String getInterimReviewDate();
                      
                      /**
                       * Gets (as xml) the "interimReviewDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetInterimReviewDate();
                      
                      /**
                       * True if has "interimReviewDate" element
                       */
                      boolean isSetInterimReviewDate();
                      
                      /**
                       * Sets the "interimReviewDate" element
                       */
                      void setInterimReviewDate(java.lang.String interimReviewDate);
                      
                      /**
                       * Sets (as xml) the "interimReviewDate" element
                       */
                      void xsetInterimReviewDate(org.apache.xmlbeans.XmlString interimReviewDate);
                      
                      /**
                       * Unsets the "interimReviewDate" element
                       */
                      void unsetInterimReviewDate();
                      
                      /**
                       * Gets the "annualReviewDate" element
                       */
                      java.lang.String getAnnualReviewDate();
                      
                      /**
                       * Gets (as xml) the "annualReviewDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetAnnualReviewDate();
                      
                      /**
                       * True if has "annualReviewDate" element
                       */
                      boolean isSetAnnualReviewDate();
                      
                      /**
                       * Sets the "annualReviewDate" element
                       */
                      void setAnnualReviewDate(java.lang.String annualReviewDate);
                      
                      /**
                       * Sets (as xml) the "annualReviewDate" element
                       */
                      void xsetAnnualReviewDate(org.apache.xmlbeans.XmlString annualReviewDate);
                      
                      /**
                       * Unsets the "annualReviewDate" element
                       */
                      void unsetAnnualReviewDate();
                      
                      /**
                       * Gets the "extensionDate" element
                       */
                      java.lang.String getExtensionDate();
                      
                      /**
                       * Gets (as xml) the "extensionDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetExtensionDate();
                      
                      /**
                       * True if has "extensionDate" element
                       */
                      boolean isSetExtensionDate();
                      
                      /**
                       * Sets the "extensionDate" element
                       */
                      void setExtensionDate(java.lang.String extensionDate);
                      
                      /**
                       * Sets (as xml) the "extensionDate" element
                       */
                      void xsetExtensionDate(org.apache.xmlbeans.XmlString extensionDate);
                      
                      /**
                       * Unsets the "extensionDate" element
                       */
                      void unsetExtensionDate();
                      
                      /**
                       * Gets the "projectedEconomicPorfit" element
                       */
                      java.lang.String getProjectedEconomicPorfit();
                      
                      /**
                       * Gets (as xml) the "projectedEconomicPorfit" element
                       */
                      org.apache.xmlbeans.XmlString xgetProjectedEconomicPorfit();
                      
                      /**
                       * True if has "projectedEconomicPorfit" element
                       */
                      boolean isSetProjectedEconomicPorfit();
                      
                      /**
                       * Sets the "projectedEconomicPorfit" element
                       */
                      void setProjectedEconomicPorfit(java.lang.String projectedEconomicPorfit);
                      
                      /**
                       * Sets (as xml) the "projectedEconomicPorfit" element
                       */
                      void xsetProjectedEconomicPorfit(org.apache.xmlbeans.XmlString projectedEconomicPorfit);
                      
                      /**
                       * Unsets the "projectedEconomicPorfit" element
                       */
                      void unsetProjectedEconomicPorfit();
                      
                      /**
                       * Gets the "expectedLossForCreditPurpose" element
                       */
                      java.lang.String getExpectedLossForCreditPurpose();
                      
                      /**
                       * Gets (as xml) the "expectedLossForCreditPurpose" element
                       */
                      org.apache.xmlbeans.XmlString xgetExpectedLossForCreditPurpose();
                      
                      /**
                       * True if has "expectedLossForCreditPurpose" element
                       */
                      boolean isSetExpectedLossForCreditPurpose();
                      
                      /**
                       * Sets the "expectedLossForCreditPurpose" element
                       */
                      void setExpectedLossForCreditPurpose(java.lang.String expectedLossForCreditPurpose);
                      
                      /**
                       * Sets (as xml) the "expectedLossForCreditPurpose" element
                       */
                      void xsetExpectedLossForCreditPurpose(org.apache.xmlbeans.XmlString expectedLossForCreditPurpose);
                      
                      /**
                       * Unsets the "expectedLossForCreditPurpose" element
                       */
                      void unsetExpectedLossForCreditPurpose();
                      
                      /**
                       * Gets the "productProgramComplianceInd" element
                       */
                      java.lang.String getProductProgramComplianceInd();
                      
                      /**
                       * Gets (as xml) the "productProgramComplianceInd" element
                       */
                      org.apache.xmlbeans.XmlString xgetProductProgramComplianceInd();
                      
                      /**
                       * True if has "productProgramComplianceInd" element
                       */
                      boolean isSetProductProgramComplianceInd();
                      
                      /**
                       * Sets the "productProgramComplianceInd" element
                       */
                      void setProductProgramComplianceInd(java.lang.String productProgramComplianceInd);
                      
                      /**
                       * Sets (as xml) the "productProgramComplianceInd" element
                       */
                      void xsetProductProgramComplianceInd(org.apache.xmlbeans.XmlString productProgramComplianceInd);
                      
                      /**
                       * Unsets the "productProgramComplianceInd" element
                       */
                      void unsetProductProgramComplianceInd();
                      
                      /**
                       * Gets the "creditPolicyComplianceInd" element
                       */
                      java.lang.String getCreditPolicyComplianceInd();
                      
                      /**
                       * Gets (as xml) the "creditPolicyComplianceInd" element
                       */
                      org.apache.xmlbeans.XmlString xgetCreditPolicyComplianceInd();
                      
                      /**
                       * True if has "creditPolicyComplianceInd" element
                       */
                      boolean isSetCreditPolicyComplianceInd();
                      
                      /**
                       * Sets the "creditPolicyComplianceInd" element
                       */
                      void setCreditPolicyComplianceInd(java.lang.String creditPolicyComplianceInd);
                      
                      /**
                       * Sets (as xml) the "creditPolicyComplianceInd" element
                       */
                      void xsetCreditPolicyComplianceInd(org.apache.xmlbeans.XmlString creditPolicyComplianceInd);
                      
                      /**
                       * Unsets the "creditPolicyComplianceInd" element
                       */
                      void unsetCreditPolicyComplianceInd();
                      
                      /**
                       * Gets the "underWritingComplianceInd" element
                       */
                      java.lang.String getUnderWritingComplianceInd();
                      
                      /**
                       * Gets (as xml) the "underWritingComplianceInd" element
                       */
                      org.apache.xmlbeans.XmlString xgetUnderWritingComplianceInd();
                      
                      /**
                       * True if has "underWritingComplianceInd" element
                       */
                      boolean isSetUnderWritingComplianceInd();
                      
                      /**
                       * Sets the "underWritingComplianceInd" element
                       */
                      void setUnderWritingComplianceInd(java.lang.String underWritingComplianceInd);
                      
                      /**
                       * Sets (as xml) the "underWritingComplianceInd" element
                       */
                      void xsetUnderWritingComplianceInd(org.apache.xmlbeans.XmlString underWritingComplianceInd);
                      
                      /**
                       * Unsets the "underWritingComplianceInd" element
                       */
                      void unsetUnderWritingComplianceInd();
                      
                      /**
                       * Gets the "countryRiskApprReqd" element
                       */
                      java.lang.String getCountryRiskApprReqd();
                      
                      /**
                       * Gets (as xml) the "countryRiskApprReqd" element
                       */
                      org.apache.xmlbeans.XmlString xgetCountryRiskApprReqd();
                      
                      /**
                       * True if has "countryRiskApprReqd" element
                       */
                      boolean isSetCountryRiskApprReqd();
                      
                      /**
                       * Sets the "countryRiskApprReqd" element
                       */
                      void setCountryRiskApprReqd(java.lang.String countryRiskApprReqd);
                      
                      /**
                       * Sets (as xml) the "countryRiskApprReqd" element
                       */
                      void xsetCountryRiskApprReqd(org.apache.xmlbeans.XmlString countryRiskApprReqd);
                      
                      /**
                       * Unsets the "countryRiskApprReqd" element
                       */
                      void unsetCountryRiskApprReqd();
                      
                      /**
                       * Gets the "firstApproverEmpId" element
                       */
                      java.lang.String getFirstApproverEmpId();
                      
                      /**
                       * Gets (as xml) the "firstApproverEmpId" element
                       */
                      org.apache.xmlbeans.XmlString xgetFirstApproverEmpId();
                      
                      /**
                       * True if has "firstApproverEmpId" element
                       */
                      boolean isSetFirstApproverEmpId();
                      
                      /**
                       * Sets the "firstApproverEmpId" element
                       */
                      void setFirstApproverEmpId(java.lang.String firstApproverEmpId);
                      
                      /**
                       * Sets (as xml) the "firstApproverEmpId" element
                       */
                      void xsetFirstApproverEmpId(org.apache.xmlbeans.XmlString firstApproverEmpId);
                      
                      /**
                       * Unsets the "firstApproverEmpId" element
                       */
                      void unsetFirstApproverEmpId();
                      
                      /**
                       * Gets array of all "firstApproverLocation" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.FirstApproverLocation[] getFirstApproverLocationArray();
                      
                      /**
                       * Gets ith "firstApproverLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.FirstApproverLocation getFirstApproverLocationArray(int i);
                      
                      /**
                       * Returns number of "firstApproverLocation" element
                       */
                      int sizeOfFirstApproverLocationArray();
                      
                      /**
                       * Sets array of all "firstApproverLocation" element
                       */
                      void setFirstApproverLocationArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.FirstApproverLocation[] firstApproverLocationArray);
                      
                      /**
                       * Sets ith "firstApproverLocation" element
                       */
                      void setFirstApproverLocationArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.FirstApproverLocation firstApproverLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "firstApproverLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.FirstApproverLocation insertNewFirstApproverLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "firstApproverLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.FirstApproverLocation addNewFirstApproverLocation();
                      
                      /**
                       * Removes the ith "firstApproverLocation" element
                       */
                      void removeFirstApproverLocation(int i);
                      
                      /**
                       * Gets the "firstApproverCoinNo" element
                       */
                      java.lang.String getFirstApproverCoinNo();
                      
                      /**
                       * Gets (as xml) the "firstApproverCoinNo" element
                       */
                      org.apache.xmlbeans.XmlString xgetFirstApproverCoinNo();
                      
                      /**
                       * True if has "firstApproverCoinNo" element
                       */
                      boolean isSetFirstApproverCoinNo();
                      
                      /**
                       * Sets the "firstApproverCoinNo" element
                       */
                      void setFirstApproverCoinNo(java.lang.String firstApproverCoinNo);
                      
                      /**
                       * Sets (as xml) the "firstApproverCoinNo" element
                       */
                      void xsetFirstApproverCoinNo(org.apache.xmlbeans.XmlString firstApproverCoinNo);
                      
                      /**
                       * Unsets the "firstApproverCoinNo" element
                       */
                      void unsetFirstApproverCoinNo();
                      
                      /**
                       * Gets the "firstApproverName" element
                       */
                      java.lang.String getFirstApproverName();
                      
                      /**
                       * Gets (as xml) the "firstApproverName" element
                       */
                      org.apache.xmlbeans.XmlString xgetFirstApproverName();
                      
                      /**
                       * True if has "firstApproverName" element
                       */
                      boolean isSetFirstApproverName();
                      
                      /**
                       * Sets the "firstApproverName" element
                       */
                      void setFirstApproverName(java.lang.String firstApproverName);
                      
                      /**
                       * Sets (as xml) the "firstApproverName" element
                       */
                      void xsetFirstApproverName(org.apache.xmlbeans.XmlString firstApproverName);
                      
                      /**
                       * Unsets the "firstApproverName" element
                       */
                      void unsetFirstApproverName();
                      
                      /**
                       * Gets the "secondApproverEmpId" element
                       */
                      java.lang.String getSecondApproverEmpId();
                      
                      /**
                       * Gets (as xml) the "secondApproverEmpId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSecondApproverEmpId();
                      
                      /**
                       * True if has "secondApproverEmpId" element
                       */
                      boolean isSetSecondApproverEmpId();
                      
                      /**
                       * Sets the "secondApproverEmpId" element
                       */
                      void setSecondApproverEmpId(java.lang.String secondApproverEmpId);
                      
                      /**
                       * Sets (as xml) the "secondApproverEmpId" element
                       */
                      void xsetSecondApproverEmpId(org.apache.xmlbeans.XmlString secondApproverEmpId);
                      
                      /**
                       * Unsets the "secondApproverEmpId" element
                       */
                      void unsetSecondApproverEmpId();
                      
                      /**
                       * Gets array of all "secondApproverLocation" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.SecondApproverLocation[] getSecondApproverLocationArray();
                      
                      /**
                       * Gets ith "secondApproverLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.SecondApproverLocation getSecondApproverLocationArray(int i);
                      
                      /**
                       * Returns number of "secondApproverLocation" element
                       */
                      int sizeOfSecondApproverLocationArray();
                      
                      /**
                       * Sets array of all "secondApproverLocation" element
                       */
                      void setSecondApproverLocationArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.SecondApproverLocation[] secondApproverLocationArray);
                      
                      /**
                       * Sets ith "secondApproverLocation" element
                       */
                      void setSecondApproverLocationArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.SecondApproverLocation secondApproverLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "secondApproverLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.SecondApproverLocation insertNewSecondApproverLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "secondApproverLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.SecondApproverLocation addNewSecondApproverLocation();
                      
                      /**
                       * Removes the ith "secondApproverLocation" element
                       */
                      void removeSecondApproverLocation(int i);
                      
                      /**
                       * Gets the "secondApproverCoinNo" element
                       */
                      java.lang.String getSecondApproverCoinNo();
                      
                      /**
                       * Gets (as xml) the "secondApproverCoinNo" element
                       */
                      org.apache.xmlbeans.XmlString xgetSecondApproverCoinNo();
                      
                      /**
                       * True if has "secondApproverCoinNo" element
                       */
                      boolean isSetSecondApproverCoinNo();
                      
                      /**
                       * Sets the "secondApproverCoinNo" element
                       */
                      void setSecondApproverCoinNo(java.lang.String secondApproverCoinNo);
                      
                      /**
                       * Sets (as xml) the "secondApproverCoinNo" element
                       */
                      void xsetSecondApproverCoinNo(org.apache.xmlbeans.XmlString secondApproverCoinNo);
                      
                      /**
                       * Unsets the "secondApproverCoinNo" element
                       */
                      void unsetSecondApproverCoinNo();
                      
                      /**
                       * Gets the "secondApproverName" element
                       */
                      java.lang.String getSecondApproverName();
                      
                      /**
                       * Gets (as xml) the "secondApproverName" element
                       */
                      org.apache.xmlbeans.XmlString xgetSecondApproverName();
                      
                      /**
                       * True if has "secondApproverName" element
                       */
                      boolean isSetSecondApproverName();
                      
                      /**
                       * Sets the "secondApproverName" element
                       */
                      void setSecondApproverName(java.lang.String secondApproverName);
                      
                      /**
                       * Sets (as xml) the "secondApproverName" element
                       */
                      void xsetSecondApproverName(org.apache.xmlbeans.XmlString secondApproverName);
                      
                      /**
                       * Unsets the "secondApproverName" element
                       */
                      void unsetSecondApproverName();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * An XML originatingLocation(@).
                       *
                       * This is a complex type.
                       */
                      public interface OriginatingLocation extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OriginatingLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("originatinglocation6c9delemtype");
                        
                        /**
                         * Gets the "originatingLocationId" element
                         */
                        java.lang.String getOriginatingLocationId();
                        
                        /**
                         * Gets (as xml) the "originatingLocationId" element
                         */
                        org.apache.xmlbeans.XmlString xgetOriginatingLocationId();
                        
                        /**
                         * True if has "originatingLocationId" element
                         */
                        boolean isSetOriginatingLocationId();
                        
                        /**
                         * Sets the "originatingLocationId" element
                         */
                        void setOriginatingLocationId(java.lang.String originatingLocationId);
                        
                        /**
                         * Sets (as xml) the "originatingLocationId" element
                         */
                        void xsetOriginatingLocationId(org.apache.xmlbeans.XmlString originatingLocationId);
                        
                        /**
                         * Unsets the "originatingLocationId" element
                         */
                        void unsetOriginatingLocationId();
                        
                        /**
                         * Gets the "originatingLocationCountry" element
                         */
                        java.lang.String getOriginatingLocationCountry();
                        
                        /**
                         * Gets (as xml) the "originatingLocationCountry" element
                         */
                        org.apache.xmlbeans.XmlString xgetOriginatingLocationCountry();
                        
                        /**
                         * True if has "originatingLocationCountry" element
                         */
                        boolean isSetOriginatingLocationCountry();
                        
                        /**
                         * Sets the "originatingLocationCountry" element
                         */
                        void setOriginatingLocationCountry(java.lang.String originatingLocationCountry);
                        
                        /**
                         * Sets (as xml) the "originatingLocationCountry" element
                         */
                        void xsetOriginatingLocationCountry(org.apache.xmlbeans.XmlString originatingLocationCountry);
                        
                        /**
                         * Unsets the "originatingLocationCountry" element
                         */
                        void unsetOriginatingLocationCountry();
                        
                        /**
                         * Gets the "originatingLocationOrganization" element
                         */
                        java.lang.String getOriginatingLocationOrganization();
                        
                        /**
                         * Gets (as xml) the "originatingLocationOrganization" element
                         */
                        org.apache.xmlbeans.XmlString xgetOriginatingLocationOrganization();
                        
                        /**
                         * True if has "originatingLocationOrganization" element
                         */
                        boolean isSetOriginatingLocationOrganization();
                        
                        /**
                         * Sets the "originatingLocationOrganization" element
                         */
                        void setOriginatingLocationOrganization(java.lang.String originatingLocationOrganization);
                        
                        /**
                         * Sets (as xml) the "originatingLocationOrganization" element
                         */
                        void xsetOriginatingLocationOrganization(org.apache.xmlbeans.XmlString originatingLocationOrganization);
                        
                        /**
                         * Unsets the "originatingLocationOrganization" element
                         */
                        void unsetOriginatingLocationOrganization();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.OriginatingLocation newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.OriginatingLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.OriginatingLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.OriginatingLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML firstApproverLocation(@).
                       *
                       * This is a complex type.
                       */
                      public interface FirstApproverLocation extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FirstApproverLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("firstapproverlocationaaf1elemtype");
                        
                        /**
                         * Gets the "locationId" element
                         */
                        java.lang.String getLocationId();
                        
                        /**
                         * Gets (as xml) the "locationId" element
                         */
                        org.apache.xmlbeans.XmlString xgetLocationId();
                        
                        /**
                         * True if has "locationId" element
                         */
                        boolean isSetLocationId();
                        
                        /**
                         * Sets the "locationId" element
                         */
                        void setLocationId(java.lang.String locationId);
                        
                        /**
                         * Sets (as xml) the "locationId" element
                         */
                        void xsetLocationId(org.apache.xmlbeans.XmlString locationId);
                        
                        /**
                         * Unsets the "locationId" element
                         */
                        void unsetLocationId();
                        
                        /**
                         * Gets the "locationCountry" element
                         */
                        java.lang.String getLocationCountry();
                        
                        /**
                         * Gets (as xml) the "locationCountry" element
                         */
                        org.apache.xmlbeans.XmlString xgetLocationCountry();
                        
                        /**
                         * True if has "locationCountry" element
                         */
                        boolean isSetLocationCountry();
                        
                        /**
                         * Sets the "locationCountry" element
                         */
                        void setLocationCountry(java.lang.String locationCountry);
                        
                        /**
                         * Sets (as xml) the "locationCountry" element
                         */
                        void xsetLocationCountry(org.apache.xmlbeans.XmlString locationCountry);
                        
                        /**
                         * Unsets the "locationCountry" element
                         */
                        void unsetLocationCountry();
                        
                        /**
                         * Gets the "locationOrganization" element
                         */
                        java.lang.String getLocationOrganization();
                        
                        /**
                         * Gets (as xml) the "locationOrganization" element
                         */
                        org.apache.xmlbeans.XmlString xgetLocationOrganization();
                        
                        /**
                         * True if has "locationOrganization" element
                         */
                        boolean isSetLocationOrganization();
                        
                        /**
                         * Sets the "locationOrganization" element
                         */
                        void setLocationOrganization(java.lang.String locationOrganization);
                        
                        /**
                         * Sets (as xml) the "locationOrganization" element
                         */
                        void xsetLocationOrganization(org.apache.xmlbeans.XmlString locationOrganization);
                        
                        /**
                         * Unsets the "locationOrganization" element
                         */
                        void unsetLocationOrganization();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.FirstApproverLocation newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.FirstApproverLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.FirstApproverLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.FirstApproverLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML secondApproverLocation(@).
                       *
                       * This is a complex type.
                       */
                      public interface SecondApproverLocation extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondApproverLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("secondapproverlocation389delemtype");
                        
                        /**
                         * Gets the "locationId" element
                         */
                        java.lang.String getLocationId();
                        
                        /**
                         * Gets (as xml) the "locationId" element
                         */
                        org.apache.xmlbeans.XmlString xgetLocationId();
                        
                        /**
                         * True if has "locationId" element
                         */
                        boolean isSetLocationId();
                        
                        /**
                         * Sets the "locationId" element
                         */
                        void setLocationId(java.lang.String locationId);
                        
                        /**
                         * Sets (as xml) the "locationId" element
                         */
                        void xsetLocationId(org.apache.xmlbeans.XmlString locationId);
                        
                        /**
                         * Unsets the "locationId" element
                         */
                        void unsetLocationId();
                        
                        /**
                         * Gets the "locationCountry" element
                         */
                        java.lang.String getLocationCountry();
                        
                        /**
                         * Gets (as xml) the "locationCountry" element
                         */
                        org.apache.xmlbeans.XmlString xgetLocationCountry();
                        
                        /**
                         * True if has "locationCountry" element
                         */
                        boolean isSetLocationCountry();
                        
                        /**
                         * Sets the "locationCountry" element
                         */
                        void setLocationCountry(java.lang.String locationCountry);
                        
                        /**
                         * Sets (as xml) the "locationCountry" element
                         */
                        void xsetLocationCountry(org.apache.xmlbeans.XmlString locationCountry);
                        
                        /**
                         * Unsets the "locationCountry" element
                         */
                        void unsetLocationCountry();
                        
                        /**
                         * Gets the "locationOrganization" element
                         */
                        java.lang.String getLocationOrganization();
                        
                        /**
                         * Gets (as xml) the "locationOrganization" element
                         */
                        org.apache.xmlbeans.XmlString xgetLocationOrganization();
                        
                        /**
                         * True if has "locationOrganization" element
                         */
                        boolean isSetLocationOrganization();
                        
                        /**
                         * Sets the "locationOrganization" element
                         */
                        void setLocationOrganization(java.lang.String locationOrganization);
                        
                        /**
                         * Sets (as xml) the "locationOrganization" element
                         */
                        void xsetLocationOrganization(org.apache.xmlbeans.XmlString locationOrganization);
                        
                        /**
                         * Unsets the "locationOrganization" element
                         */
                        void unsetLocationOrganization();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.SecondApproverLocation newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.SecondApproverLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.SecondApproverLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile.SecondApproverLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML policyException(@).
                     *
                     * This is a complex type.
                     */
                    public interface PolicyException extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PolicyException.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("policyexceptionf956elemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "subProfileId" element
                       */
                      java.lang.String getSubProfileId();
                      
                      /**
                       * Gets (as xml) the "subProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileId();
                      
                      /**
                       * True if has "subProfileId" element
                       */
                      boolean isSetSubProfileId();
                      
                      /**
                       * Sets the "subProfileId" element
                       */
                      void setSubProfileId(java.lang.String subProfileId);
                      
                      /**
                       * Sets (as xml) the "subProfileId" element
                       */
                      void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
                      
                      /**
                       * Unsets the "subProfileId" element
                       */
                      void unsetSubProfileId();
                      
                      /**
                       * Gets the "limitProfileId" element
                       */
                      java.lang.String getLimitProfileId();
                      
                      /**
                       * Gets (as xml) the "limitProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitProfileId();
                      
                      /**
                       * True if has "limitProfileId" element
                       */
                      boolean isSetLimitProfileId();
                      
                      /**
                       * Sets the "limitProfileId" element
                       */
                      void setLimitProfileId(java.lang.String limitProfileId);
                      
                      /**
                       * Sets (as xml) the "limitProfileId" element
                       */
                      void xsetLimitProfileId(org.apache.xmlbeans.XmlString limitProfileId);
                      
                      /**
                       * Unsets the "limitProfileId" element
                       */
                      void unsetLimitProfileId();
                      
                      /**
                       * Gets the "policyExceptionId" element
                       */
                      java.lang.String getPolicyExceptionId();
                      
                      /**
                       * Gets (as xml) the "policyExceptionId" element
                       */
                      org.apache.xmlbeans.XmlString xgetPolicyExceptionId();
                      
                      /**
                       * True if has "policyExceptionId" element
                       */
                      boolean isSetPolicyExceptionId();
                      
                      /**
                       * Sets the "policyExceptionId" element
                       */
                      void setPolicyExceptionId(java.lang.String policyExceptionId);
                      
                      /**
                       * Sets (as xml) the "policyExceptionId" element
                       */
                      void xsetPolicyExceptionId(org.apache.xmlbeans.XmlString policyExceptionId);
                      
                      /**
                       * Unsets the "policyExceptionId" element
                       */
                      void unsetPolicyExceptionId();
                      
                      /**
                       * Gets array of all "policyExceptionCode" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException.PolicyExceptionCode[] getPolicyExceptionCodeArray();
                      
                      /**
                       * Gets ith "policyExceptionCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException.PolicyExceptionCode getPolicyExceptionCodeArray(int i);
                      
                      /**
                       * Returns number of "policyExceptionCode" element
                       */
                      int sizeOfPolicyExceptionCodeArray();
                      
                      /**
                       * Sets array of all "policyExceptionCode" element
                       */
                      void setPolicyExceptionCodeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException.PolicyExceptionCode[] policyExceptionCodeArray);
                      
                      /**
                       * Sets ith "policyExceptionCode" element
                       */
                      void setPolicyExceptionCodeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException.PolicyExceptionCode policyExceptionCode);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "policyExceptionCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException.PolicyExceptionCode insertNewPolicyExceptionCode(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "policyExceptionCode" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException.PolicyExceptionCode addNewPolicyExceptionCode();
                      
                      /**
                       * Removes the ith "policyExceptionCode" element
                       */
                      void removePolicyExceptionCode(int i);
                      
                      /**
                       * Gets the "ExceptionCodeEffectiveDate" element
                       */
                      java.lang.String getExceptionCodeEffectiveDate();
                      
                      /**
                       * Gets (as xml) the "ExceptionCodeEffectiveDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetExceptionCodeEffectiveDate();
                      
                      /**
                       * True if has "ExceptionCodeEffectiveDate" element
                       */
                      boolean isSetExceptionCodeEffectiveDate();
                      
                      /**
                       * Sets the "ExceptionCodeEffectiveDate" element
                       */
                      void setExceptionCodeEffectiveDate(java.lang.String exceptionCodeEffectiveDate);
                      
                      /**
                       * Sets (as xml) the "ExceptionCodeEffectiveDate" element
                       */
                      void xsetExceptionCodeEffectiveDate(org.apache.xmlbeans.XmlString exceptionCodeEffectiveDate);
                      
                      /**
                       * Unsets the "ExceptionCodeEffectiveDate" element
                       */
                      void unsetExceptionCodeEffectiveDate();
                      
                      /**
                       * Gets the "comments" element
                       */
                      java.lang.String getComments();
                      
                      /**
                       * Gets (as xml) the "comments" element
                       */
                      org.apache.xmlbeans.XmlString xgetComments();
                      
                      /**
                       * True if has "comments" element
                       */
                      boolean isSetComments();
                      
                      /**
                       * Sets the "comments" element
                       */
                      void setComments(java.lang.String comments);
                      
                      /**
                       * Sets (as xml) the "comments" element
                       */
                      void xsetComments(org.apache.xmlbeans.XmlString comments);
                      
                      /**
                       * Unsets the "comments" element
                       */
                      void unsetComments();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * An XML policyExceptionCode(@).
                       *
                       * This is a complex type.
                       */
                      public interface PolicyExceptionCode extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PolicyExceptionCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("policyexceptioncode751celemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException.PolicyExceptionCode newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException.PolicyExceptionCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException.PolicyExceptionCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException.PolicyExceptionCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.PolicyException) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML limits(@).
                     *
                     * This is a complex type.
                     */
                    public interface Limits extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Limits.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("limits9f41elemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "subProfileId" element
                       */
                      java.lang.String getSubProfileId();
                      
                      /**
                       * Gets (as xml) the "subProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileId();
                      
                      /**
                       * True if has "subProfileId" element
                       */
                      boolean isSetSubProfileId();
                      
                      /**
                       * Sets the "subProfileId" element
                       */
                      void setSubProfileId(java.lang.String subProfileId);
                      
                      /**
                       * Sets (as xml) the "subProfileId" element
                       */
                      void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
                      
                      /**
                       * Unsets the "subProfileId" element
                       */
                      void unsetSubProfileId();
                      
                      /**
                       * Gets the "limitProfileId" element
                       */
                      java.lang.String getLimitProfileId();
                      
                      /**
                       * Gets (as xml) the "limitProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitProfileId();
                      
                      /**
                       * True if has "limitProfileId" element
                       */
                      boolean isSetLimitProfileId();
                      
                      /**
                       * Sets the "limitProfileId" element
                       */
                      void setLimitProfileId(java.lang.String limitProfileId);
                      
                      /**
                       * Sets (as xml) the "limitProfileId" element
                       */
                      void xsetLimitProfileId(org.apache.xmlbeans.XmlString limitProfileId);
                      
                      /**
                       * Unsets the "limitProfileId" element
                       */
                      void unsetLimitProfileId();
                      
                      /**
                       * Gets the "limitId" element
                       */
                      java.lang.String getLimitId();
                      
                      /**
                       * Gets (as xml) the "limitId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitId();
                      
                      /**
                       * True if has "limitId" element
                       */
                      boolean isSetLimitId();
                      
                      /**
                       * Sets the "limitId" element
                       */
                      void setLimitId(java.lang.String limitId);
                      
                      /**
                       * Sets (as xml) the "limitId" element
                       */
                      void xsetLimitId(org.apache.xmlbeans.XmlString limitId);
                      
                      /**
                       * Unsets the "limitId" element
                       */
                      void unsetLimitId();
                      
                      /**
                       * Gets the "expiryDate" element
                       */
                      java.lang.String getExpiryDate();
                      
                      /**
                       * Gets (as xml) the "expiryDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetExpiryDate();
                      
                      /**
                       * True if has "expiryDate" element
                       */
                      boolean isSetExpiryDate();
                      
                      /**
                       * Sets the "expiryDate" element
                       */
                      void setExpiryDate(java.lang.String expiryDate);
                      
                      /**
                       * Sets (as xml) the "expiryDate" element
                       */
                      void xsetExpiryDate(org.apache.xmlbeans.XmlString expiryDate);
                      
                      /**
                       * Unsets the "expiryDate" element
                       */
                      void unsetExpiryDate();
                      
                      /**
                       * Gets the "outerLimitId" element
                       */
                      java.lang.String getOuterLimitId();
                      
                      /**
                       * Gets (as xml) the "outerLimitId" element
                       */
                      org.apache.xmlbeans.XmlString xgetOuterLimitId();
                      
                      /**
                       * True if has "outerLimitId" element
                       */
                      boolean isSetOuterLimitId();
                      
                      /**
                       * Sets the "outerLimitId" element
                       */
                      void setOuterLimitId(java.lang.String outerLimitId);
                      
                      /**
                       * Sets (as xml) the "outerLimitId" element
                       */
                      void xsetOuterLimitId(org.apache.xmlbeans.XmlString outerLimitId);
                      
                      /**
                       * Unsets the "outerLimitId" element
                       */
                      void unsetOuterLimitId();
                      
                      /**
                       * Gets array of all "originatingBookingLocation" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.OriginatingBookingLocation[] getOriginatingBookingLocationArray();
                      
                      /**
                       * Gets ith "originatingBookingLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.OriginatingBookingLocation getOriginatingBookingLocationArray(int i);
                      
                      /**
                       * Returns number of "originatingBookingLocation" element
                       */
                      int sizeOfOriginatingBookingLocationArray();
                      
                      /**
                       * Sets array of all "originatingBookingLocation" element
                       */
                      void setOriginatingBookingLocationArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.OriginatingBookingLocation[] originatingBookingLocationArray);
                      
                      /**
                       * Sets ith "originatingBookingLocation" element
                       */
                      void setOriginatingBookingLocationArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.OriginatingBookingLocation originatingBookingLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "originatingBookingLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.OriginatingBookingLocation insertNewOriginatingBookingLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "originatingBookingLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.OriginatingBookingLocation addNewOriginatingBookingLocation();
                      
                      /**
                       * Removes the ith "originatingBookingLocation" element
                       */
                      void removeOriginatingBookingLocation(int i);
                      
                      /**
                       * Gets array of all "productType" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.ProductType[] getProductTypeArray();
                      
                      /**
                       * Gets ith "productType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.ProductType getProductTypeArray(int i);
                      
                      /**
                       * Returns number of "productType" element
                       */
                      int sizeOfProductTypeArray();
                      
                      /**
                       * Sets array of all "productType" element
                       */
                      void setProductTypeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.ProductType[] productTypeArray);
                      
                      /**
                       * Sets ith "productType" element
                       */
                      void setProductTypeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.ProductType productType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "productType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.ProductType insertNewProductType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "productType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.ProductType addNewProductType();
                      
                      /**
                       * Removes the ith "productType" element
                       */
                      void removeProductType(int i);
                      
                      /**
                       * Gets array of all "limitType" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitType[] getLimitTypeArray();
                      
                      /**
                       * Gets ith "limitType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitType getLimitTypeArray(int i);
                      
                      /**
                       * Returns number of "limitType" element
                       */
                      int sizeOfLimitTypeArray();
                      
                      /**
                       * Sets array of all "limitType" element
                       */
                      void setLimitTypeArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitType[] limitTypeArray);
                      
                      /**
                       * Sets ith "limitType" element
                       */
                      void setLimitTypeArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitType limitType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "limitType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitType insertNewLimitType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "limitType" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitType addNewLimitType();
                      
                      /**
                       * Removes the ith "limitType" element
                       */
                      void removeLimitType(int i);
                      
                      /**
                       * Gets the "limitCurrency" element
                       */
                      java.lang.String getLimitCurrency();
                      
                      /**
                       * Gets (as xml) the "limitCurrency" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitCurrency();
                      
                      /**
                       * True if has "limitCurrency" element
                       */
                      boolean isSetLimitCurrency();
                      
                      /**
                       * Sets the "limitCurrency" element
                       */
                      void setLimitCurrency(java.lang.String limitCurrency);
                      
                      /**
                       * Sets (as xml) the "limitCurrency" element
                       */
                      void xsetLimitCurrency(org.apache.xmlbeans.XmlString limitCurrency);
                      
                      /**
                       * Unsets the "limitCurrency" element
                       */
                      void unsetLimitCurrency();
                      
                      /**
                       * Gets the "limitAmount" element
                       */
                      java.lang.String getLimitAmount();
                      
                      /**
                       * Gets (as xml) the "limitAmount" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitAmount();
                      
                      /**
                       * True if has "limitAmount" element
                       */
                      boolean isSetLimitAmount();
                      
                      /**
                       * Sets the "limitAmount" element
                       */
                      void setLimitAmount(java.lang.String limitAmount);
                      
                      /**
                       * Sets (as xml) the "limitAmount" element
                       */
                      void xsetLimitAmount(org.apache.xmlbeans.XmlString limitAmount);
                      
                      /**
                       * Unsets the "limitAmount" element
                       */
                      void unsetLimitAmount();
                      
                      /**
                       * Gets array of all "limitSecurity" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitSecurity[] getLimitSecurityArray();
                      
                      /**
                       * Gets ith "limitSecurity" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitSecurity getLimitSecurityArray(int i);
                      
                      /**
                       * Returns number of "limitSecurity" element
                       */
                      int sizeOfLimitSecurityArray();
                      
                      /**
                       * Sets array of all "limitSecurity" element
                       */
                      void setLimitSecurityArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitSecurity[] limitSecurityArray);
                      
                      /**
                       * Sets ith "limitSecurity" element
                       */
                      void setLimitSecurityArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitSecurity limitSecurity);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "limitSecurity" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitSecurity insertNewLimitSecurity(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "limitSecurity" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitSecurity addNewLimitSecurity();
                      
                      /**
                       * Removes the ith "limitSecurity" element
                       */
                      void removeLimitSecurity(int i);
                      
                      /**
                       * Gets the "limitTenor" element
                       */
                      java.lang.String getLimitTenor();
                      
                      /**
                       * Gets (as xml) the "limitTenor" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitTenor();
                      
                      /**
                       * True if has "limitTenor" element
                       */
                      boolean isSetLimitTenor();
                      
                      /**
                       * Sets the "limitTenor" element
                       */
                      void setLimitTenor(java.lang.String limitTenor);
                      
                      /**
                       * Sets (as xml) the "limitTenor" element
                       */
                      void xsetLimitTenor(org.apache.xmlbeans.XmlString limitTenor);
                      
                      /**
                       * Unsets the "limitTenor" element
                       */
                      void unsetLimitTenor();
                      
                      /**
                       * Gets array of all "limitTenorBasis" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitTenorBasis[] getLimitTenorBasisArray();
                      
                      /**
                       * Gets ith "limitTenorBasis" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitTenorBasis getLimitTenorBasisArray(int i);
                      
                      /**
                       * Returns number of "limitTenorBasis" element
                       */
                      int sizeOfLimitTenorBasisArray();
                      
                      /**
                       * Sets array of all "limitTenorBasis" element
                       */
                      void setLimitTenorBasisArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitTenorBasis[] limitTenorBasisArray);
                      
                      /**
                       * Sets ith "limitTenorBasis" element
                       */
                      void setLimitTenorBasisArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitTenorBasis limitTenorBasis);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "limitTenorBasis" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitTenorBasis insertNewLimitTenorBasis(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "limitTenorBasis" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitTenorBasis addNewLimitTenorBasis();
                      
                      /**
                       * Removes the ith "limitTenorBasis" element
                       */
                      void removeLimitTenorBasis(int i);
                      
                      /**
                       * Gets array of all "limitInterestBase" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitInterestBase[] getLimitInterestBaseArray();
                      
                      /**
                       * Gets ith "limitInterestBase" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitInterestBase getLimitInterestBaseArray(int i);
                      
                      /**
                       * Returns number of "limitInterestBase" element
                       */
                      int sizeOfLimitInterestBaseArray();
                      
                      /**
                       * Sets array of all "limitInterestBase" element
                       */
                      void setLimitInterestBaseArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitInterestBase[] limitInterestBaseArray);
                      
                      /**
                       * Sets ith "limitInterestBase" element
                       */
                      void setLimitInterestBaseArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitInterestBase limitInterestBase);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "limitInterestBase" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitInterestBase insertNewLimitInterestBase(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "limitInterestBase" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitInterestBase addNewLimitInterestBase();
                      
                      /**
                       * Removes the ith "limitInterestBase" element
                       */
                      void removeLimitInterestBase(int i);
                      
                      /**
                       * Gets the "interestMargin" element
                       */
                      java.lang.String getInterestMargin();
                      
                      /**
                       * Gets (as xml) the "interestMargin" element
                       */
                      org.apache.xmlbeans.XmlString xgetInterestMargin();
                      
                      /**
                       * True if has "interestMargin" element
                       */
                      boolean isSetInterestMargin();
                      
                      /**
                       * Sets the "interestMargin" element
                       */
                      void setInterestMargin(java.lang.String interestMargin);
                      
                      /**
                       * Sets (as xml) the "interestMargin" element
                       */
                      void xsetInterestMargin(org.apache.xmlbeans.XmlString interestMargin);
                      
                      /**
                       * Unsets the "interestMargin" element
                       */
                      void unsetInterestMargin();
                      
                      /**
                       * Gets the "commission" element
                       */
                      java.lang.String getCommission();
                      
                      /**
                       * Gets (as xml) the "commission" element
                       */
                      org.apache.xmlbeans.XmlString xgetCommission();
                      
                      /**
                       * True if has "commission" element
                       */
                      boolean isSetCommission();
                      
                      /**
                       * Sets the "commission" element
                       */
                      void setCommission(java.lang.String commission);
                      
                      /**
                       * Sets (as xml) the "commission" element
                       */
                      void xsetCommission(org.apache.xmlbeans.XmlString commission);
                      
                      /**
                       * Unsets the "commission" element
                       */
                      void unsetCommission();
                      
                      /**
                       * Gets the "fee" element
                       */
                      java.lang.String getFee();
                      
                      /**
                       * Gets (as xml) the "fee" element
                       */
                      org.apache.xmlbeans.XmlString xgetFee();
                      
                      /**
                       * True if has "fee" element
                       */
                      boolean isSetFee();
                      
                      /**
                       * Sets the "fee" element
                       */
                      void setFee(java.lang.String fee);
                      
                      /**
                       * Sets (as xml) the "fee" element
                       */
                      void xsetFee(org.apache.xmlbeans.XmlString fee);
                      
                      /**
                       * Unsets the "fee" element
                       */
                      void unsetFee();
                      
                      /**
                       * Gets the "condition" element
                       */
                      java.lang.String getCondition();
                      
                      /**
                       * Gets (as xml) the "condition" element
                       */
                      org.apache.xmlbeans.XmlString xgetCondition();
                      
                      /**
                       * True if has "condition" element
                       */
                      boolean isSetCondition();
                      
                      /**
                       * Sets the "condition" element
                       */
                      void setCondition(java.lang.String condition);
                      
                      /**
                       * Sets (as xml) the "condition" element
                       */
                      void xsetCondition(org.apache.xmlbeans.XmlString condition);
                      
                      /**
                       * Unsets the "condition" element
                       */
                      void unsetCondition();
                      
                      /**
                       * Gets the "limitAdvisedInd" element
                       */
                      java.lang.String getLimitAdvisedInd();
                      
                      /**
                       * Gets (as xml) the "limitAdvisedInd" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitAdvisedInd();
                      
                      /**
                       * True if has "limitAdvisedInd" element
                       */
                      boolean isSetLimitAdvisedInd();
                      
                      /**
                       * Sets the "limitAdvisedInd" element
                       */
                      void setLimitAdvisedInd(java.lang.String limitAdvisedInd);
                      
                      /**
                       * Sets (as xml) the "limitAdvisedInd" element
                       */
                      void xsetLimitAdvisedInd(org.apache.xmlbeans.XmlString limitAdvisedInd);
                      
                      /**
                       * Unsets the "limitAdvisedInd" element
                       */
                      void unsetLimitAdvisedInd();
                      
                      /**
                       * Gets the "limitCommittedInd" element
                       */
                      java.lang.String getLimitCommittedInd();
                      
                      /**
                       * Gets (as xml) the "limitCommittedInd" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitCommittedInd();
                      
                      /**
                       * True if has "limitCommittedInd" element
                       */
                      boolean isSetLimitCommittedInd();
                      
                      /**
                       * Sets the "limitCommittedInd" element
                       */
                      void setLimitCommittedInd(java.lang.String limitCommittedInd);
                      
                      /**
                       * Sets (as xml) the "limitCommittedInd" element
                       */
                      void xsetLimitCommittedInd(org.apache.xmlbeans.XmlString limitCommittedInd);
                      
                      /**
                       * Unsets the "limitCommittedInd" element
                       */
                      void unsetLimitCommittedInd();
                      
                      /**
                       * Gets the "sharedLimitInd" element
                       */
                      java.lang.String getSharedLimitInd();
                      
                      /**
                       * Gets (as xml) the "sharedLimitInd" element
                       */
                      org.apache.xmlbeans.XmlString xgetSharedLimitInd();
                      
                      /**
                       * True if has "sharedLimitInd" element
                       */
                      boolean isSetSharedLimitInd();
                      
                      /**
                       * Sets the "sharedLimitInd" element
                       */
                      void setSharedLimitInd(java.lang.String sharedLimitInd);
                      
                      /**
                       * Sets (as xml) the "sharedLimitInd" element
                       */
                      void xsetSharedLimitInd(org.apache.xmlbeans.XmlString sharedLimitInd);
                      
                      /**
                       * Unsets the "sharedLimitInd" element
                       */
                      void unsetSharedLimitInd();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * An XML originatingBookingLocation(@).
                       *
                       * This is a complex type.
                       */
                      public interface OriginatingBookingLocation extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OriginatingBookingLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("originatingbookinglocation7250elemtype");
                        
                        /**
                         * Gets the "originatingLocationId" element
                         */
                        java.lang.String getOriginatingLocationId();
                        
                        /**
                         * Gets (as xml) the "originatingLocationId" element
                         */
                        org.apache.xmlbeans.XmlString xgetOriginatingLocationId();
                        
                        /**
                         * True if has "originatingLocationId" element
                         */
                        boolean isSetOriginatingLocationId();
                        
                        /**
                         * Sets the "originatingLocationId" element
                         */
                        void setOriginatingLocationId(java.lang.String originatingLocationId);
                        
                        /**
                         * Sets (as xml) the "originatingLocationId" element
                         */
                        void xsetOriginatingLocationId(org.apache.xmlbeans.XmlString originatingLocationId);
                        
                        /**
                         * Unsets the "originatingLocationId" element
                         */
                        void unsetOriginatingLocationId();
                        
                        /**
                         * Gets the "originatingLocationCountry" element
                         */
                        java.lang.String getOriginatingLocationCountry();
                        
                        /**
                         * Gets (as xml) the "originatingLocationCountry" element
                         */
                        org.apache.xmlbeans.XmlString xgetOriginatingLocationCountry();
                        
                        /**
                         * True if has "originatingLocationCountry" element
                         */
                        boolean isSetOriginatingLocationCountry();
                        
                        /**
                         * Sets the "originatingLocationCountry" element
                         */
                        void setOriginatingLocationCountry(java.lang.String originatingLocationCountry);
                        
                        /**
                         * Sets (as xml) the "originatingLocationCountry" element
                         */
                        void xsetOriginatingLocationCountry(org.apache.xmlbeans.XmlString originatingLocationCountry);
                        
                        /**
                         * Unsets the "originatingLocationCountry" element
                         */
                        void unsetOriginatingLocationCountry();
                        
                        /**
                         * Gets the "originatingLocationOrganization" element
                         */
                        java.lang.String getOriginatingLocationOrganization();
                        
                        /**
                         * Gets (as xml) the "originatingLocationOrganization" element
                         */
                        org.apache.xmlbeans.XmlString xgetOriginatingLocationOrganization();
                        
                        /**
                         * True if has "originatingLocationOrganization" element
                         */
                        boolean isSetOriginatingLocationOrganization();
                        
                        /**
                         * Sets the "originatingLocationOrganization" element
                         */
                        void setOriginatingLocationOrganization(java.lang.String originatingLocationOrganization);
                        
                        /**
                         * Sets (as xml) the "originatingLocationOrganization" element
                         */
                        void xsetOriginatingLocationOrganization(org.apache.xmlbeans.XmlString originatingLocationOrganization);
                        
                        /**
                         * Unsets the "originatingLocationOrganization" element
                         */
                        void unsetOriginatingLocationOrganization();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.OriginatingBookingLocation newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.OriginatingBookingLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.OriginatingBookingLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.OriginatingBookingLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML productType(@).
                       *
                       * This is a complex type.
                       */
                      public interface ProductType extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("producttype089celemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.ProductType newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.ProductType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.ProductType newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.ProductType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML limitType(@).
                       *
                       * This is a complex type.
                       */
                      public interface LimitType extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LimitType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("limittype6350elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitType newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitType newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML limitSecurity(@).
                       *
                       * This is a complex type.
                       */
                      public interface LimitSecurity extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LimitSecurity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("limitsecurity698aelemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitSecurity newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitSecurity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitSecurity newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitSecurity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML limitTenorBasis(@).
                       *
                       * This is a complex type.
                       */
                      public interface LimitTenorBasis extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LimitTenorBasis.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("limittenorbasis1fecelemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitTenorBasis newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitTenorBasis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitTenorBasis newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitTenorBasis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML limitInterestBase(@).
                       *
                       * This is a complex type.
                       */
                      public interface LimitInterestBase extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LimitInterestBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("limitinterestbase7e8felemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitInterestBase newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitInterestBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitInterestBase newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits.LimitInterestBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.Limits) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML limitsSysXRefMap(@).
                     *
                     * This is a complex type.
                     */
                    public interface LimitsSysXRefMap extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LimitsSysXRefMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("limitssysxrefmap6235elemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "subProfileId" element
                       */
                      java.lang.String getSubProfileId();
                      
                      /**
                       * Gets (as xml) the "subProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileId();
                      
                      /**
                       * True if has "subProfileId" element
                       */
                      boolean isSetSubProfileId();
                      
                      /**
                       * Sets the "subProfileId" element
                       */
                      void setSubProfileId(java.lang.String subProfileId);
                      
                      /**
                       * Sets (as xml) the "subProfileId" element
                       */
                      void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
                      
                      /**
                       * Unsets the "subProfileId" element
                       */
                      void unsetSubProfileId();
                      
                      /**
                       * Gets the "limitProfileId" element
                       */
                      java.lang.String getLimitProfileId();
                      
                      /**
                       * Gets (as xml) the "limitProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitProfileId();
                      
                      /**
                       * True if has "limitProfileId" element
                       */
                      boolean isSetLimitProfileId();
                      
                      /**
                       * Sets the "limitProfileId" element
                       */
                      void setLimitProfileId(java.lang.String limitProfileId);
                      
                      /**
                       * Sets (as xml) the "limitProfileId" element
                       */
                      void xsetLimitProfileId(org.apache.xmlbeans.XmlString limitProfileId);
                      
                      /**
                       * Unsets the "limitProfileId" element
                       */
                      void unsetLimitProfileId();
                      
                      /**
                       * Gets the "limitId" element
                       */
                      java.lang.String getLimitId();
                      
                      /**
                       * Gets (as xml) the "limitId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitId();
                      
                      /**
                       * True if has "limitId" element
                       */
                      boolean isSetLimitId();
                      
                      /**
                       * Sets the "limitId" element
                       */
                      void setLimitId(java.lang.String limitId);
                      
                      /**
                       * Sets (as xml) the "limitId" element
                       */
                      void xsetLimitId(org.apache.xmlbeans.XmlString limitId);
                      
                      /**
                       * Unsets the "limitId" element
                       */
                      void unsetLimitId();
                      
                      /**
                       * Gets the "extSysXRefId" element
                       */
                      java.lang.String getExtSysXRefId();
                      
                      /**
                       * Gets (as xml) the "extSysXRefId" element
                       */
                      org.apache.xmlbeans.XmlString xgetExtSysXRefId();
                      
                      /**
                       * True if has "extSysXRefId" element
                       */
                      boolean isSetExtSysXRefId();
                      
                      /**
                       * Sets the "extSysXRefId" element
                       */
                      void setExtSysXRefId(java.lang.String extSysXRefId);
                      
                      /**
                       * Sets (as xml) the "extSysXRefId" element
                       */
                      void xsetExtSysXRefId(org.apache.xmlbeans.XmlString extSysXRefId);
                      
                      /**
                       * Unsets the "extSysXRefId" element
                       */
                      void unsetExtSysXRefId();
                      
                      /**
                       * Gets the "limitsXrefMapId" element
                       */
                      java.lang.String getLimitsXrefMapId();
                      
                      /**
                       * Gets (as xml) the "limitsXrefMapId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitsXrefMapId();
                      
                      /**
                       * True if has "limitsXrefMapId" element
                       */
                      boolean isSetLimitsXrefMapId();
                      
                      /**
                       * Sets the "limitsXrefMapId" element
                       */
                      void setLimitsXrefMapId(java.lang.String limitsXrefMapId);
                      
                      /**
                       * Sets (as xml) the "limitsXrefMapId" element
                       */
                      void xsetLimitsXrefMapId(org.apache.xmlbeans.XmlString limitsXrefMapId);
                      
                      /**
                       * Unsets the "limitsXrefMapId" element
                       */
                      void unsetLimitsXrefMapId();
                      
                      /**
                       * Gets array of all "systemXRefLocation" elements
                       */
                      com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation[] getSystemXRefLocationArray();
                      
                      /**
                       * Gets ith "systemXRefLocation" element
                       */
                      com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation getSystemXRefLocationArray(int i);
                      
                      /**
                       * Returns number of "systemXRefLocation" element
                       */
                      int sizeOfSystemXRefLocationArray();
                      
                      /**
                       * Sets array of all "systemXRefLocation" element
                       */
                      void setSystemXRefLocationArray(com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation[] systemXRefLocationArray);
                      
                      /**
                       * Sets ith "systemXRefLocation" element
                       */
                      void setSystemXRefLocationArray(int i, com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation systemXRefLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "systemXRefLocation" element
                       */
                      com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation insertNewSystemXRefLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "systemXRefLocation" element
                       */
                      com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation addNewSystemXRefLocation();
                      
                      /**
                       * Removes the ith "systemXRefLocation" element
                       */
                      void removeSystemXRefLocation(int i);
                      
                      /**
                       * Gets array of all "externalSystem" elements
                       */
                      com.stanchart.customer.ExternalSystemDocument.ExternalSystem[] getExternalSystemArray();
                      
                      /**
                       * Gets ith "externalSystem" element
                       */
                      com.stanchart.customer.ExternalSystemDocument.ExternalSystem getExternalSystemArray(int i);
                      
                      /**
                       * Returns number of "externalSystem" element
                       */
                      int sizeOfExternalSystemArray();
                      
                      /**
                       * Sets array of all "externalSystem" element
                       */
                      void setExternalSystemArray(com.stanchart.customer.ExternalSystemDocument.ExternalSystem[] externalSystemArray);
                      
                      /**
                       * Sets ith "externalSystem" element
                       */
                      void setExternalSystemArray(int i, com.stanchart.customer.ExternalSystemDocument.ExternalSystem externalSystem);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "externalSystem" element
                       */
                      com.stanchart.customer.ExternalSystemDocument.ExternalSystem insertNewExternalSystem(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "externalSystem" element
                       */
                      com.stanchart.customer.ExternalSystemDocument.ExternalSystem addNewExternalSystem();
                      
                      /**
                       * Removes the ith "externalSystem" element
                       */
                      void removeExternalSystem(int i);
                      
                      /**
                       * Gets array of all "externalCustDetail" elements
                       */
                      com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail[] getExternalCustDetailArray();
                      
                      /**
                       * Gets ith "externalCustDetail" element
                       */
                      com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail getExternalCustDetailArray(int i);
                      
                      /**
                       * Returns number of "externalCustDetail" element
                       */
                      int sizeOfExternalCustDetailArray();
                      
                      /**
                       * Sets array of all "externalCustDetail" element
                       */
                      void setExternalCustDetailArray(com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail[] externalCustDetailArray);
                      
                      /**
                       * Sets ith "externalCustDetail" element
                       */
                      void setExternalCustDetailArray(int i, com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail externalCustDetail);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "externalCustDetail" element
                       */
                      com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail insertNewExternalCustDetail(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "externalCustDetail" element
                       */
                      com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail addNewExternalCustDetail();
                      
                      /**
                       * Removes the ith "externalCustDetail" element
                       */
                      void removeExternalCustDetail(int i);
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsSysXRefMap newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsSysXRefMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsSysXRefMap newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsSysXRefMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML limitsApprSecMap(@).
                     *
                     * This is a complex type.
                     */
                    public interface LimitsApprSecMap extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LimitsApprSecMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("limitsapprsecmap787delemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "subProfileId" element
                       */
                      java.lang.String getSubProfileId();
                      
                      /**
                       * Gets (as xml) the "subProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileId();
                      
                      /**
                       * True if has "subProfileId" element
                       */
                      boolean isSetSubProfileId();
                      
                      /**
                       * Sets the "subProfileId" element
                       */
                      void setSubProfileId(java.lang.String subProfileId);
                      
                      /**
                       * Sets (as xml) the "subProfileId" element
                       */
                      void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
                      
                      /**
                       * Unsets the "subProfileId" element
                       */
                      void unsetSubProfileId();
                      
                      /**
                       * Gets the "limitProfileId" element
                       */
                      java.lang.String getLimitProfileId();
                      
                      /**
                       * Gets (as xml) the "limitProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitProfileId();
                      
                      /**
                       * True if has "limitProfileId" element
                       */
                      boolean isSetLimitProfileId();
                      
                      /**
                       * Sets the "limitProfileId" element
                       */
                      void setLimitProfileId(java.lang.String limitProfileId);
                      
                      /**
                       * Sets (as xml) the "limitProfileId" element
                       */
                      void xsetLimitProfileId(org.apache.xmlbeans.XmlString limitProfileId);
                      
                      /**
                       * Unsets the "limitProfileId" element
                       */
                      void unsetLimitProfileId();
                      
                      /**
                       * Gets the "limitId" element
                       */
                      java.lang.String getLimitId();
                      
                      /**
                       * Gets (as xml) the "limitId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitId();
                      
                      /**
                       * True if has "limitId" element
                       */
                      boolean isSetLimitId();
                      
                      /**
                       * Sets the "limitId" element
                       */
                      void setLimitId(java.lang.String limitId);
                      
                      /**
                       * Sets (as xml) the "limitId" element
                       */
                      void xsetLimitId(org.apache.xmlbeans.XmlString limitId);
                      
                      /**
                       * Unsets the "limitId" element
                       */
                      void unsetLimitId();
                      
                      /**
                       * Gets the "secId" element
                       */
                      java.lang.String getSecId();
                      
                      /**
                       * Gets (as xml) the "secId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSecId();
                      
                      /**
                       * True if has "secId" element
                       */
                      boolean isSetSecId();
                      
                      /**
                       * Sets the "secId" element
                       */
                      void setSecId(java.lang.String secId);
                      
                      /**
                       * Sets (as xml) the "secId" element
                       */
                      void xsetSecId(org.apache.xmlbeans.XmlString secId);
                      
                      /**
                       * Unsets the "secId" element
                       */
                      void unsetSecId();
                      
                      /**
                       * Gets the "limitsApprSecMapId" element
                       */
                      java.lang.String getLimitsApprSecMapId();
                      
                      /**
                       * Gets (as xml) the "limitsApprSecMapId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitsApprSecMapId();
                      
                      /**
                       * True if has "limitsApprSecMapId" element
                       */
                      boolean isSetLimitsApprSecMapId();
                      
                      /**
                       * Sets the "limitsApprSecMapId" element
                       */
                      void setLimitsApprSecMapId(java.lang.String limitsApprSecMapId);
                      
                      /**
                       * Sets (as xml) the "limitsApprSecMapId" element
                       */
                      void xsetLimitsApprSecMapId(org.apache.xmlbeans.XmlString limitsApprSecMapId);
                      
                      /**
                       * Unsets the "limitsApprSecMapId" element
                       */
                      void unsetLimitsApprSecMapId();
                      
                      /**
                       * Gets the "pledgorId" element
                       */
                      java.lang.String getPledgorId();
                      
                      /**
                       * Gets (as xml) the "pledgorId" element
                       */
                      org.apache.xmlbeans.XmlString xgetPledgorId();
                      
                      /**
                       * True if has "pledgorId" element
                       */
                      boolean isSetPledgorId();
                      
                      /**
                       * Sets the "pledgorId" element
                       */
                      void setPledgorId(java.lang.String pledgorId);
                      
                      /**
                       * Sets (as xml) the "pledgorId" element
                       */
                      void xsetPledgorId(org.apache.xmlbeans.XmlString pledgorId);
                      
                      /**
                       * Unsets the "pledgorId" element
                       */
                      void unsetPledgorId();
                      
                      /**
                       * Gets array of all "securityLocation" elements
                       */
                      com.stanchart.customer.SecurityLocationDocument.SecurityLocation[] getSecurityLocationArray();
                      
                      /**
                       * Gets ith "securityLocation" element
                       */
                      com.stanchart.customer.SecurityLocationDocument.SecurityLocation getSecurityLocationArray(int i);
                      
                      /**
                       * Returns number of "securityLocation" element
                       */
                      int sizeOfSecurityLocationArray();
                      
                      /**
                       * Sets array of all "securityLocation" element
                       */
                      void setSecurityLocationArray(com.stanchart.customer.SecurityLocationDocument.SecurityLocation[] securityLocationArray);
                      
                      /**
                       * Sets ith "securityLocation" element
                       */
                      void setSecurityLocationArray(int i, com.stanchart.customer.SecurityLocationDocument.SecurityLocation securityLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "securityLocation" element
                       */
                      com.stanchart.customer.SecurityLocationDocument.SecurityLocation insertNewSecurityLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "securityLocation" element
                       */
                      com.stanchart.customer.SecurityLocationDocument.SecurityLocation addNewSecurityLocation();
                      
                      /**
                       * Removes the ith "securityLocation" element
                       */
                      void removeSecurityLocation(int i);
                      
                      /**
                       * Gets array of all "securityType" elements
                       */
                      com.stanchart.customer.SecurityTypeDocument.SecurityType[] getSecurityTypeArray();
                      
                      /**
                       * Gets ith "securityType" element
                       */
                      com.stanchart.customer.SecurityTypeDocument.SecurityType getSecurityTypeArray(int i);
                      
                      /**
                       * Returns number of "securityType" element
                       */
                      int sizeOfSecurityTypeArray();
                      
                      /**
                       * Sets array of all "securityType" element
                       */
                      void setSecurityTypeArray(com.stanchart.customer.SecurityTypeDocument.SecurityType[] securityTypeArray);
                      
                      /**
                       * Sets ith "securityType" element
                       */
                      void setSecurityTypeArray(int i, com.stanchart.customer.SecurityTypeDocument.SecurityType securityType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "securityType" element
                       */
                      com.stanchart.customer.SecurityTypeDocument.SecurityType insertNewSecurityType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "securityType" element
                       */
                      com.stanchart.customer.SecurityTypeDocument.SecurityType addNewSecurityType();
                      
                      /**
                       * Removes the ith "securityType" element
                       */
                      void removeSecurityType(int i);
                      
                      /**
                       * Gets array of all "securitySubType" elements
                       */
                      com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType[] getSecuritySubTypeArray();
                      
                      /**
                       * Gets ith "securitySubType" element
                       */
                      com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType getSecuritySubTypeArray(int i);
                      
                      /**
                       * Returns number of "securitySubType" element
                       */
                      int sizeOfSecuritySubTypeArray();
                      
                      /**
                       * Sets array of all "securitySubType" element
                       */
                      void setSecuritySubTypeArray(com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType[] securitySubTypeArray);
                      
                      /**
                       * Sets ith "securitySubType" element
                       */
                      void setSecuritySubTypeArray(int i, com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType securitySubType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "securitySubType" element
                       */
                      com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType insertNewSecuritySubType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "securitySubType" element
                       */
                      com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType addNewSecuritySubType();
                      
                      /**
                       * Removes the ith "securitySubType" element
                       */
                      void removeSecuritySubType(int i);
                      
                      /**
                       * Gets the "securityCurrency" element
                       */
                      java.lang.String getSecurityCurrency();
                      
                      /**
                       * Gets (as xml) the "securityCurrency" element
                       */
                      org.apache.xmlbeans.XmlString xgetSecurityCurrency();
                      
                      /**
                       * True if has "securityCurrency" element
                       */
                      boolean isSetSecurityCurrency();
                      
                      /**
                       * Sets the "securityCurrency" element
                       */
                      void setSecurityCurrency(java.lang.String securityCurrency);
                      
                      /**
                       * Sets (as xml) the "securityCurrency" element
                       */
                      void xsetSecurityCurrency(org.apache.xmlbeans.XmlString securityCurrency);
                      
                      /**
                       * Unsets the "securityCurrency" element
                       */
                      void unsetSecurityCurrency();
                      
                      /**
                       * Gets the "ForceSaleValue" element
                       */
                      java.lang.String getForceSaleValue();
                      
                      /**
                       * Gets (as xml) the "ForceSaleValue" element
                       */
                      org.apache.xmlbeans.XmlString xgetForceSaleValue();
                      
                      /**
                       * True if has "ForceSaleValue" element
                       */
                      boolean isSetForceSaleValue();
                      
                      /**
                       * Sets the "ForceSaleValue" element
                       */
                      void setForceSaleValue(java.lang.String forceSaleValue);
                      
                      /**
                       * Sets (as xml) the "ForceSaleValue" element
                       */
                      void xsetForceSaleValue(org.apache.xmlbeans.XmlString forceSaleValue);
                      
                      /**
                       * Unsets the "ForceSaleValue" element
                       */
                      void unsetForceSaleValue();
                      
                      /**
                       * Gets the "FSVDate" element
                       */
                      java.lang.String getFSVDate();
                      
                      /**
                       * Gets (as xml) the "FSVDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetFSVDate();
                      
                      /**
                       * True if has "FSVDate" element
                       */
                      boolean isSetFSVDate();
                      
                      /**
                       * Sets the "FSVDate" element
                       */
                      void setFSVDate(java.lang.String fsvDate);
                      
                      /**
                       * Sets (as xml) the "FSVDate" element
                       */
                      void xsetFSVDate(org.apache.xmlbeans.XmlString fsvDate);
                      
                      /**
                       * Unsets the "FSVDate" element
                       */
                      void unsetFSVDate();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsApprSecMap newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsApprSecMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsApprSecMap newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.LimitsApprSecMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML coborrowerLimits(@).
                     *
                     * This is a complex type.
                     */
                    public interface CoborrowerLimits extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoborrowerLimits.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("coborrowerlimits9eafelemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "subProfileId" element
                       */
                      java.lang.String getSubProfileId();
                      
                      /**
                       * Gets (as xml) the "subProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileId();
                      
                      /**
                       * True if has "subProfileId" element
                       */
                      boolean isSetSubProfileId();
                      
                      /**
                       * Sets the "subProfileId" element
                       */
                      void setSubProfileId(java.lang.String subProfileId);
                      
                      /**
                       * Sets (as xml) the "subProfileId" element
                       */
                      void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
                      
                      /**
                       * Unsets the "subProfileId" element
                       */
                      void unsetSubProfileId();
                      
                      /**
                       * Gets the "limitProfileId" element
                       */
                      java.lang.String getLimitProfileId();
                      
                      /**
                       * Gets (as xml) the "limitProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitProfileId();
                      
                      /**
                       * True if has "limitProfileId" element
                       */
                      boolean isSetLimitProfileId();
                      
                      /**
                       * Sets the "limitProfileId" element
                       */
                      void setLimitProfileId(java.lang.String limitProfileId);
                      
                      /**
                       * Sets (as xml) the "limitProfileId" element
                       */
                      void xsetLimitProfileId(org.apache.xmlbeans.XmlString limitProfileId);
                      
                      /**
                       * Unsets the "limitProfileId" element
                       */
                      void unsetLimitProfileId();
                      
                      /**
                       * Gets the "limitId" element
                       */
                      java.lang.String getLimitId();
                      
                      /**
                       * Gets (as xml) the "limitId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitId();
                      
                      /**
                       * True if has "limitId" element
                       */
                      boolean isSetLimitId();
                      
                      /**
                       * Sets the "limitId" element
                       */
                      void setLimitId(java.lang.String limitId);
                      
                      /**
                       * Sets (as xml) the "limitId" element
                       */
                      void xsetLimitId(org.apache.xmlbeans.XmlString limitId);
                      
                      /**
                       * Unsets the "limitId" element
                       */
                      void unsetLimitId();
                      
                      /**
                       * Gets the "coborrowerLeId" element
                       */
                      java.lang.String getCoborrowerLeId();
                      
                      /**
                       * Gets (as xml) the "coborrowerLeId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoborrowerLeId();
                      
                      /**
                       * True if has "coborrowerLeId" element
                       */
                      boolean isSetCoborrowerLeId();
                      
                      /**
                       * Sets the "coborrowerLeId" element
                       */
                      void setCoborrowerLeId(java.lang.String coborrowerLeId);
                      
                      /**
                       * Sets (as xml) the "coborrowerLeId" element
                       */
                      void xsetCoborrowerLeId(org.apache.xmlbeans.XmlString coborrowerLeId);
                      
                      /**
                       * Unsets the "coborrowerLeId" element
                       */
                      void unsetCoborrowerLeId();
                      
                      /**
                       * Gets the "coborrowerSubProfileId" element
                       */
                      java.lang.String getCoborrowerSubProfileId();
                      
                      /**
                       * Gets (as xml) the "coborrowerSubProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoborrowerSubProfileId();
                      
                      /**
                       * True if has "coborrowerSubProfileId" element
                       */
                      boolean isSetCoborrowerSubProfileId();
                      
                      /**
                       * Sets the "coborrowerSubProfileId" element
                       */
                      void setCoborrowerSubProfileId(java.lang.String coborrowerSubProfileId);
                      
                      /**
                       * Sets (as xml) the "coborrowerSubProfileId" element
                       */
                      void xsetCoborrowerSubProfileId(org.apache.xmlbeans.XmlString coborrowerSubProfileId);
                      
                      /**
                       * Unsets the "coborrowerSubProfileId" element
                       */
                      void unsetCoborrowerSubProfileId();
                      
                      /**
                       * Gets the "coborrowerLimitsId" element
                       */
                      java.lang.String getCoborrowerLimitsId();
                      
                      /**
                       * Gets (as xml) the "coborrowerLimitsId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoborrowerLimitsId();
                      
                      /**
                       * True if has "coborrowerLimitsId" element
                       */
                      boolean isSetCoborrowerLimitsId();
                      
                      /**
                       * Sets the "coborrowerLimitsId" element
                       */
                      void setCoborrowerLimitsId(java.lang.String coborrowerLimitsId);
                      
                      /**
                       * Sets (as xml) the "coborrowerLimitsId" element
                       */
                      void xsetCoborrowerLimitsId(org.apache.xmlbeans.XmlString coborrowerLimitsId);
                      
                      /**
                       * Unsets the "coborrowerLimitsId" element
                       */
                      void unsetCoborrowerLimitsId();
                      
                      /**
                       * Gets array of all "coBorrowerBookingLocation" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoBorrowerBookingLocation[] getCoBorrowerBookingLocationArray();
                      
                      /**
                       * Gets ith "coBorrowerBookingLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoBorrowerBookingLocation getCoBorrowerBookingLocationArray(int i);
                      
                      /**
                       * Returns number of "coBorrowerBookingLocation" element
                       */
                      int sizeOfCoBorrowerBookingLocationArray();
                      
                      /**
                       * Sets array of all "coBorrowerBookingLocation" element
                       */
                      void setCoBorrowerBookingLocationArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoBorrowerBookingLocation[] coBorrowerBookingLocationArray);
                      
                      /**
                       * Sets ith "coBorrowerBookingLocation" element
                       */
                      void setCoBorrowerBookingLocationArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoBorrowerBookingLocation coBorrowerBookingLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "coBorrowerBookingLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoBorrowerBookingLocation insertNewCoBorrowerBookingLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "coBorrowerBookingLocation" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoBorrowerBookingLocation addNewCoBorrowerBookingLocation();
                      
                      /**
                       * Removes the ith "coBorrowerBookingLocation" element
                       */
                      void removeCoBorrowerBookingLocation(int i);
                      
                      /**
                       * Gets the "coBorrowerLimitCurrency" element
                       */
                      java.lang.String getCoBorrowerLimitCurrency();
                      
                      /**
                       * Gets (as xml) the "coBorrowerLimitCurrency" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoBorrowerLimitCurrency();
                      
                      /**
                       * True if has "coBorrowerLimitCurrency" element
                       */
                      boolean isSetCoBorrowerLimitCurrency();
                      
                      /**
                       * Sets the "coBorrowerLimitCurrency" element
                       */
                      void setCoBorrowerLimitCurrency(java.lang.String coBorrowerLimitCurrency);
                      
                      /**
                       * Sets (as xml) the "coBorrowerLimitCurrency" element
                       */
                      void xsetCoBorrowerLimitCurrency(org.apache.xmlbeans.XmlString coBorrowerLimitCurrency);
                      
                      /**
                       * Unsets the "coBorrowerLimitCurrency" element
                       */
                      void unsetCoBorrowerLimitCurrency();
                      
                      /**
                       * Gets the "coborrowerLimitAmount" element
                       */
                      java.lang.String getCoborrowerLimitAmount();
                      
                      /**
                       * Gets (as xml) the "coborrowerLimitAmount" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoborrowerLimitAmount();
                      
                      /**
                       * True if has "coborrowerLimitAmount" element
                       */
                      boolean isSetCoborrowerLimitAmount();
                      
                      /**
                       * Sets the "coborrowerLimitAmount" element
                       */
                      void setCoborrowerLimitAmount(java.lang.String coborrowerLimitAmount);
                      
                      /**
                       * Sets (as xml) the "coborrowerLimitAmount" element
                       */
                      void xsetCoborrowerLimitAmount(org.apache.xmlbeans.XmlString coborrowerLimitAmount);
                      
                      /**
                       * Unsets the "coborrowerLimitAmount" element
                       */
                      void unsetCoborrowerLimitAmount();
                      
                      /**
                       * Gets array of all "coborrowerLimitSecurity" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoborrowerLimitSecurity[] getCoborrowerLimitSecurityArray();
                      
                      /**
                       * Gets ith "coborrowerLimitSecurity" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoborrowerLimitSecurity getCoborrowerLimitSecurityArray(int i);
                      
                      /**
                       * Returns number of "coborrowerLimitSecurity" element
                       */
                      int sizeOfCoborrowerLimitSecurityArray();
                      
                      /**
                       * Sets array of all "coborrowerLimitSecurity" element
                       */
                      void setCoborrowerLimitSecurityArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoborrowerLimitSecurity[] coborrowerLimitSecurityArray);
                      
                      /**
                       * Sets ith "coborrowerLimitSecurity" element
                       */
                      void setCoborrowerLimitSecurityArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoborrowerLimitSecurity coborrowerLimitSecurity);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "coborrowerLimitSecurity" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoborrowerLimitSecurity insertNewCoborrowerLimitSecurity(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "coborrowerLimitSecurity" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoborrowerLimitSecurity addNewCoborrowerLimitSecurity();
                      
                      /**
                       * Removes the ith "coborrowerLimitSecurity" element
                       */
                      void removeCoborrowerLimitSecurity(int i);
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * An XML coBorrowerBookingLocation(@).
                       *
                       * This is a complex type.
                       */
                      public interface CoBorrowerBookingLocation extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoBorrowerBookingLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("coborrowerbookinglocation2753elemtype");
                        
                        /**
                         * Gets the "locationId" element
                         */
                        java.lang.String getLocationId();
                        
                        /**
                         * Gets (as xml) the "locationId" element
                         */
                        org.apache.xmlbeans.XmlString xgetLocationId();
                        
                        /**
                         * True if has "locationId" element
                         */
                        boolean isSetLocationId();
                        
                        /**
                         * Sets the "locationId" element
                         */
                        void setLocationId(java.lang.String locationId);
                        
                        /**
                         * Sets (as xml) the "locationId" element
                         */
                        void xsetLocationId(org.apache.xmlbeans.XmlString locationId);
                        
                        /**
                         * Unsets the "locationId" element
                         */
                        void unsetLocationId();
                        
                        /**
                         * Gets the "locationCountry" element
                         */
                        java.lang.String getLocationCountry();
                        
                        /**
                         * Gets (as xml) the "locationCountry" element
                         */
                        org.apache.xmlbeans.XmlString xgetLocationCountry();
                        
                        /**
                         * True if has "locationCountry" element
                         */
                        boolean isSetLocationCountry();
                        
                        /**
                         * Sets the "locationCountry" element
                         */
                        void setLocationCountry(java.lang.String locationCountry);
                        
                        /**
                         * Sets (as xml) the "locationCountry" element
                         */
                        void xsetLocationCountry(org.apache.xmlbeans.XmlString locationCountry);
                        
                        /**
                         * Unsets the "locationCountry" element
                         */
                        void unsetLocationCountry();
                        
                        /**
                         * Gets the "locationOrganization" element
                         */
                        java.lang.String getLocationOrganization();
                        
                        /**
                         * Gets (as xml) the "locationOrganization" element
                         */
                        org.apache.xmlbeans.XmlString xgetLocationOrganization();
                        
                        /**
                         * True if has "locationOrganization" element
                         */
                        boolean isSetLocationOrganization();
                        
                        /**
                         * Sets the "locationOrganization" element
                         */
                        void setLocationOrganization(java.lang.String locationOrganization);
                        
                        /**
                         * Sets (as xml) the "locationOrganization" element
                         */
                        void xsetLocationOrganization(org.apache.xmlbeans.XmlString locationOrganization);
                        
                        /**
                         * Unsets the "locationOrganization" element
                         */
                        void unsetLocationOrganization();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoBorrowerBookingLocation newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoBorrowerBookingLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoBorrowerBookingLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoBorrowerBookingLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML coborrowerLimitSecurity(@).
                       *
                       * This is a complex type.
                       */
                      public interface CoborrowerLimitSecurity extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoborrowerLimitSecurity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("coborrowerlimitsecurity53a6elemtype");
                        
                        /**
                         * Gets the "stdCodeNumber" element
                         */
                        java.lang.String getStdCodeNumber();
                        
                        /**
                         * Gets (as xml) the "stdCodeNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeNumber();
                        
                        /**
                         * True if has "stdCodeNumber" element
                         */
                        boolean isSetStdCodeNumber();
                        
                        /**
                         * Sets the "stdCodeNumber" element
                         */
                        void setStdCodeNumber(java.lang.String stdCodeNumber);
                        
                        /**
                         * Sets (as xml) the "stdCodeNumber" element
                         */
                        void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber);
                        
                        /**
                         * Unsets the "stdCodeNumber" element
                         */
                        void unsetStdCodeNumber();
                        
                        /**
                         * Gets the "stdCodeValue" element
                         */
                        java.lang.String getStdCodeValue();
                        
                        /**
                         * Gets (as xml) the "stdCodeValue" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeValue();
                        
                        /**
                         * True if has "stdCodeValue" element
                         */
                        boolean isSetStdCodeValue();
                        
                        /**
                         * Sets the "stdCodeValue" element
                         */
                        void setStdCodeValue(java.lang.String stdCodeValue);
                        
                        /**
                         * Sets (as xml) the "stdCodeValue" element
                         */
                        void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue);
                        
                        /**
                         * Unsets the "stdCodeValue" element
                         */
                        void unsetStdCodeValue();
                        
                        /**
                         * Gets the "stdCodeDescription" element
                         */
                        java.lang.String getStdCodeDescription();
                        
                        /**
                         * Gets (as xml) the "stdCodeDescription" element
                         */
                        org.apache.xmlbeans.XmlString xgetStdCodeDescription();
                        
                        /**
                         * True if has "stdCodeDescription" element
                         */
                        boolean isSetStdCodeDescription();
                        
                        /**
                         * Sets the "stdCodeDescription" element
                         */
                        void setStdCodeDescription(java.lang.String stdCodeDescription);
                        
                        /**
                         * Sets (as xml) the "stdCodeDescription" element
                         */
                        void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription);
                        
                        /**
                         * Unsets the "stdCodeDescription" element
                         */
                        void unsetStdCodeDescription();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoborrowerLimitSecurity newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoborrowerLimitSecurity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoborrowerLimitSecurity newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits.CoborrowerLimitSecurity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLimits) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML coborrowerLmtsSecMap(@).
                     *
                     * This is a complex type.
                     */
                    public interface CoborrowerLmtsSecMap extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoborrowerLmtsSecMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("coborrowerlmtssecmap4bc2elemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "subProfileId" element
                       */
                      java.lang.String getSubProfileId();
                      
                      /**
                       * Gets (as xml) the "subProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileId();
                      
                      /**
                       * True if has "subProfileId" element
                       */
                      boolean isSetSubProfileId();
                      
                      /**
                       * Sets the "subProfileId" element
                       */
                      void setSubProfileId(java.lang.String subProfileId);
                      
                      /**
                       * Sets (as xml) the "subProfileId" element
                       */
                      void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
                      
                      /**
                       * Unsets the "subProfileId" element
                       */
                      void unsetSubProfileId();
                      
                      /**
                       * Gets the "limitProfileId" element
                       */
                      java.lang.String getLimitProfileId();
                      
                      /**
                       * Gets (as xml) the "limitProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitProfileId();
                      
                      /**
                       * True if has "limitProfileId" element
                       */
                      boolean isSetLimitProfileId();
                      
                      /**
                       * Sets the "limitProfileId" element
                       */
                      void setLimitProfileId(java.lang.String limitProfileId);
                      
                      /**
                       * Sets (as xml) the "limitProfileId" element
                       */
                      void xsetLimitProfileId(org.apache.xmlbeans.XmlString limitProfileId);
                      
                      /**
                       * Unsets the "limitProfileId" element
                       */
                      void unsetLimitProfileId();
                      
                      /**
                       * Gets the "limitId" element
                       */
                      java.lang.String getLimitId();
                      
                      /**
                       * Gets (as xml) the "limitId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitId();
                      
                      /**
                       * True if has "limitId" element
                       */
                      boolean isSetLimitId();
                      
                      /**
                       * Sets the "limitId" element
                       */
                      void setLimitId(java.lang.String limitId);
                      
                      /**
                       * Sets (as xml) the "limitId" element
                       */
                      void xsetLimitId(org.apache.xmlbeans.XmlString limitId);
                      
                      /**
                       * Unsets the "limitId" element
                       */
                      void unsetLimitId();
                      
                      /**
                       * Gets the "coborrowerLeId" element
                       */
                      java.lang.String getCoborrowerLeId();
                      
                      /**
                       * Gets (as xml) the "coborrowerLeId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoborrowerLeId();
                      
                      /**
                       * True if has "coborrowerLeId" element
                       */
                      boolean isSetCoborrowerLeId();
                      
                      /**
                       * Sets the "coborrowerLeId" element
                       */
                      void setCoborrowerLeId(java.lang.String coborrowerLeId);
                      
                      /**
                       * Sets (as xml) the "coborrowerLeId" element
                       */
                      void xsetCoborrowerLeId(org.apache.xmlbeans.XmlString coborrowerLeId);
                      
                      /**
                       * Unsets the "coborrowerLeId" element
                       */
                      void unsetCoborrowerLeId();
                      
                      /**
                       * Gets the "coborrowerSubProfileId" element
                       */
                      java.lang.String getCoborrowerSubProfileId();
                      
                      /**
                       * Gets (as xml) the "coborrowerSubProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoborrowerSubProfileId();
                      
                      /**
                       * True if has "coborrowerSubProfileId" element
                       */
                      boolean isSetCoborrowerSubProfileId();
                      
                      /**
                       * Sets the "coborrowerSubProfileId" element
                       */
                      void setCoborrowerSubProfileId(java.lang.String coborrowerSubProfileId);
                      
                      /**
                       * Sets (as xml) the "coborrowerSubProfileId" element
                       */
                      void xsetCoborrowerSubProfileId(org.apache.xmlbeans.XmlString coborrowerSubProfileId);
                      
                      /**
                       * Unsets the "coborrowerSubProfileId" element
                       */
                      void unsetCoborrowerSubProfileId();
                      
                      /**
                       * Gets the "coborrowerLimitsId" element
                       */
                      java.lang.String getCoborrowerLimitsId();
                      
                      /**
                       * Gets (as xml) the "coborrowerLimitsId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoborrowerLimitsId();
                      
                      /**
                       * True if has "coborrowerLimitsId" element
                       */
                      boolean isSetCoborrowerLimitsId();
                      
                      /**
                       * Sets the "coborrowerLimitsId" element
                       */
                      void setCoborrowerLimitsId(java.lang.String coborrowerLimitsId);
                      
                      /**
                       * Sets (as xml) the "coborrowerLimitsId" element
                       */
                      void xsetCoborrowerLimitsId(org.apache.xmlbeans.XmlString coborrowerLimitsId);
                      
                      /**
                       * Unsets the "coborrowerLimitsId" element
                       */
                      void unsetCoborrowerLimitsId();
                      
                      /**
                       * Gets the "secId" element
                       */
                      java.lang.String getSecId();
                      
                      /**
                       * Gets (as xml) the "secId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSecId();
                      
                      /**
                       * True if has "secId" element
                       */
                      boolean isSetSecId();
                      
                      /**
                       * Sets the "secId" element
                       */
                      void setSecId(java.lang.String secId);
                      
                      /**
                       * Sets (as xml) the "secId" element
                       */
                      void xsetSecId(org.apache.xmlbeans.XmlString secId);
                      
                      /**
                       * Unsets the "secId" element
                       */
                      void unsetSecId();
                      
                      /**
                       * Gets the "coborrowerLmtsSecMapId" element
                       */
                      java.lang.String getCoborrowerLmtsSecMapId();
                      
                      /**
                       * Gets (as xml) the "coborrowerLmtsSecMapId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoborrowerLmtsSecMapId();
                      
                      /**
                       * True if has "coborrowerLmtsSecMapId" element
                       */
                      boolean isSetCoborrowerLmtsSecMapId();
                      
                      /**
                       * Sets the "coborrowerLmtsSecMapId" element
                       */
                      void setCoborrowerLmtsSecMapId(java.lang.String coborrowerLmtsSecMapId);
                      
                      /**
                       * Sets (as xml) the "coborrowerLmtsSecMapId" element
                       */
                      void xsetCoborrowerLmtsSecMapId(org.apache.xmlbeans.XmlString coborrowerLmtsSecMapId);
                      
                      /**
                       * Unsets the "coborrowerLmtsSecMapId" element
                       */
                      void unsetCoborrowerLmtsSecMapId();
                      
                      /**
                       * Gets the "pledgorId" element
                       */
                      java.lang.String getPledgorId();
                      
                      /**
                       * Gets (as xml) the "pledgorId" element
                       */
                      org.apache.xmlbeans.XmlString xgetPledgorId();
                      
                      /**
                       * True if has "pledgorId" element
                       */
                      boolean isSetPledgorId();
                      
                      /**
                       * Sets the "pledgorId" element
                       */
                      void setPledgorId(java.lang.String pledgorId);
                      
                      /**
                       * Sets (as xml) the "pledgorId" element
                       */
                      void xsetPledgorId(org.apache.xmlbeans.XmlString pledgorId);
                      
                      /**
                       * Unsets the "pledgorId" element
                       */
                      void unsetPledgorId();
                      
                      /**
                       * Gets array of all "securityLocation" elements
                       */
                      com.stanchart.customer.SecurityLocationDocument.SecurityLocation[] getSecurityLocationArray();
                      
                      /**
                       * Gets ith "securityLocation" element
                       */
                      com.stanchart.customer.SecurityLocationDocument.SecurityLocation getSecurityLocationArray(int i);
                      
                      /**
                       * Returns number of "securityLocation" element
                       */
                      int sizeOfSecurityLocationArray();
                      
                      /**
                       * Sets array of all "securityLocation" element
                       */
                      void setSecurityLocationArray(com.stanchart.customer.SecurityLocationDocument.SecurityLocation[] securityLocationArray);
                      
                      /**
                       * Sets ith "securityLocation" element
                       */
                      void setSecurityLocationArray(int i, com.stanchart.customer.SecurityLocationDocument.SecurityLocation securityLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "securityLocation" element
                       */
                      com.stanchart.customer.SecurityLocationDocument.SecurityLocation insertNewSecurityLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "securityLocation" element
                       */
                      com.stanchart.customer.SecurityLocationDocument.SecurityLocation addNewSecurityLocation();
                      
                      /**
                       * Removes the ith "securityLocation" element
                       */
                      void removeSecurityLocation(int i);
                      
                      /**
                       * Gets array of all "securityType" elements
                       */
                      com.stanchart.customer.SecurityTypeDocument.SecurityType[] getSecurityTypeArray();
                      
                      /**
                       * Gets ith "securityType" element
                       */
                      com.stanchart.customer.SecurityTypeDocument.SecurityType getSecurityTypeArray(int i);
                      
                      /**
                       * Returns number of "securityType" element
                       */
                      int sizeOfSecurityTypeArray();
                      
                      /**
                       * Sets array of all "securityType" element
                       */
                      void setSecurityTypeArray(com.stanchart.customer.SecurityTypeDocument.SecurityType[] securityTypeArray);
                      
                      /**
                       * Sets ith "securityType" element
                       */
                      void setSecurityTypeArray(int i, com.stanchart.customer.SecurityTypeDocument.SecurityType securityType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "securityType" element
                       */
                      com.stanchart.customer.SecurityTypeDocument.SecurityType insertNewSecurityType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "securityType" element
                       */
                      com.stanchart.customer.SecurityTypeDocument.SecurityType addNewSecurityType();
                      
                      /**
                       * Removes the ith "securityType" element
                       */
                      void removeSecurityType(int i);
                      
                      /**
                       * Gets array of all "securitySubType" elements
                       */
                      com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType[] getSecuritySubTypeArray();
                      
                      /**
                       * Gets ith "securitySubType" element
                       */
                      com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType getSecuritySubTypeArray(int i);
                      
                      /**
                       * Returns number of "securitySubType" element
                       */
                      int sizeOfSecuritySubTypeArray();
                      
                      /**
                       * Sets array of all "securitySubType" element
                       */
                      void setSecuritySubTypeArray(com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType[] securitySubTypeArray);
                      
                      /**
                       * Sets ith "securitySubType" element
                       */
                      void setSecuritySubTypeArray(int i, com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType securitySubType);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "securitySubType" element
                       */
                      com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType insertNewSecuritySubType(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "securitySubType" element
                       */
                      com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType addNewSecuritySubType();
                      
                      /**
                       * Removes the ith "securitySubType" element
                       */
                      void removeSecuritySubType(int i);
                      
                      /**
                       * Gets the "securityCurrency" element
                       */
                      java.lang.String getSecurityCurrency();
                      
                      /**
                       * Gets (as xml) the "securityCurrency" element
                       */
                      org.apache.xmlbeans.XmlString xgetSecurityCurrency();
                      
                      /**
                       * True if has "securityCurrency" element
                       */
                      boolean isSetSecurityCurrency();
                      
                      /**
                       * Sets the "securityCurrency" element
                       */
                      void setSecurityCurrency(java.lang.String securityCurrency);
                      
                      /**
                       * Sets (as xml) the "securityCurrency" element
                       */
                      void xsetSecurityCurrency(org.apache.xmlbeans.XmlString securityCurrency);
                      
                      /**
                       * Unsets the "securityCurrency" element
                       */
                      void unsetSecurityCurrency();
                      
                      /**
                       * Gets the "ForceSaleValue" element
                       */
                      java.lang.String getForceSaleValue();
                      
                      /**
                       * Gets (as xml) the "ForceSaleValue" element
                       */
                      org.apache.xmlbeans.XmlString xgetForceSaleValue();
                      
                      /**
                       * True if has "ForceSaleValue" element
                       */
                      boolean isSetForceSaleValue();
                      
                      /**
                       * Sets the "ForceSaleValue" element
                       */
                      void setForceSaleValue(java.lang.String forceSaleValue);
                      
                      /**
                       * Sets (as xml) the "ForceSaleValue" element
                       */
                      void xsetForceSaleValue(org.apache.xmlbeans.XmlString forceSaleValue);
                      
                      /**
                       * Unsets the "ForceSaleValue" element
                       */
                      void unsetForceSaleValue();
                      
                      /**
                       * Gets the "FSVDate" element
                       */
                      java.lang.String getFSVDate();
                      
                      /**
                       * Gets (as xml) the "FSVDate" element
                       */
                      org.apache.xmlbeans.XmlString xgetFSVDate();
                      
                      /**
                       * True if has "FSVDate" element
                       */
                      boolean isSetFSVDate();
                      
                      /**
                       * Sets the "FSVDate" element
                       */
                      void setFSVDate(java.lang.String fsvDate);
                      
                      /**
                       * Sets (as xml) the "FSVDate" element
                       */
                      void xsetFSVDate(org.apache.xmlbeans.XmlString fsvDate);
                      
                      /**
                       * Unsets the "FSVDate" element
                       */
                      void unsetFSVDate();
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLmtsSecMap newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLmtsSecMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLmtsSecMap newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowerLmtsSecMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML coborrowSysXRefMap(@).
                     *
                     * This is a complex type.
                     */
                    public interface CoborrowSysXRefMap extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoborrowSysXRefMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("coborrowsysxrefmap413eelemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "subProfileId" element
                       */
                      java.lang.String getSubProfileId();
                      
                      /**
                       * Gets (as xml) the "subProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileId();
                      
                      /**
                       * True if has "subProfileId" element
                       */
                      boolean isSetSubProfileId();
                      
                      /**
                       * Sets the "subProfileId" element
                       */
                      void setSubProfileId(java.lang.String subProfileId);
                      
                      /**
                       * Sets (as xml) the "subProfileId" element
                       */
                      void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
                      
                      /**
                       * Unsets the "subProfileId" element
                       */
                      void unsetSubProfileId();
                      
                      /**
                       * Gets the "limitProfileId" element
                       */
                      java.lang.String getLimitProfileId();
                      
                      /**
                       * Gets (as xml) the "limitProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitProfileId();
                      
                      /**
                       * True if has "limitProfileId" element
                       */
                      boolean isSetLimitProfileId();
                      
                      /**
                       * Sets the "limitProfileId" element
                       */
                      void setLimitProfileId(java.lang.String limitProfileId);
                      
                      /**
                       * Sets (as xml) the "limitProfileId" element
                       */
                      void xsetLimitProfileId(org.apache.xmlbeans.XmlString limitProfileId);
                      
                      /**
                       * Unsets the "limitProfileId" element
                       */
                      void unsetLimitProfileId();
                      
                      /**
                       * Gets the "limitId" element
                       */
                      java.lang.String getLimitId();
                      
                      /**
                       * Gets (as xml) the "limitId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLimitId();
                      
                      /**
                       * True if has "limitId" element
                       */
                      boolean isSetLimitId();
                      
                      /**
                       * Sets the "limitId" element
                       */
                      void setLimitId(java.lang.String limitId);
                      
                      /**
                       * Sets (as xml) the "limitId" element
                       */
                      void xsetLimitId(org.apache.xmlbeans.XmlString limitId);
                      
                      /**
                       * Unsets the "limitId" element
                       */
                      void unsetLimitId();
                      
                      /**
                       * Gets the "coborrowerLeId" element
                       */
                      java.lang.String getCoborrowerLeId();
                      
                      /**
                       * Gets (as xml) the "coborrowerLeId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoborrowerLeId();
                      
                      /**
                       * True if has "coborrowerLeId" element
                       */
                      boolean isSetCoborrowerLeId();
                      
                      /**
                       * Sets the "coborrowerLeId" element
                       */
                      void setCoborrowerLeId(java.lang.String coborrowerLeId);
                      
                      /**
                       * Sets (as xml) the "coborrowerLeId" element
                       */
                      void xsetCoborrowerLeId(org.apache.xmlbeans.XmlString coborrowerLeId);
                      
                      /**
                       * Unsets the "coborrowerLeId" element
                       */
                      void unsetCoborrowerLeId();
                      
                      /**
                       * Gets the "coborrowerSubProfileId" element
                       */
                      java.lang.String getCoborrowerSubProfileId();
                      
                      /**
                       * Gets (as xml) the "coborrowerSubProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoborrowerSubProfileId();
                      
                      /**
                       * True if has "coborrowerSubProfileId" element
                       */
                      boolean isSetCoborrowerSubProfileId();
                      
                      /**
                       * Sets the "coborrowerSubProfileId" element
                       */
                      void setCoborrowerSubProfileId(java.lang.String coborrowerSubProfileId);
                      
                      /**
                       * Sets (as xml) the "coborrowerSubProfileId" element
                       */
                      void xsetCoborrowerSubProfileId(org.apache.xmlbeans.XmlString coborrowerSubProfileId);
                      
                      /**
                       * Unsets the "coborrowerSubProfileId" element
                       */
                      void unsetCoborrowerSubProfileId();
                      
                      /**
                       * Gets the "coborrowerLimitsId" element
                       */
                      java.lang.String getCoborrowerLimitsId();
                      
                      /**
                       * Gets (as xml) the "coborrowerLimitsId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoborrowerLimitsId();
                      
                      /**
                       * True if has "coborrowerLimitsId" element
                       */
                      boolean isSetCoborrowerLimitsId();
                      
                      /**
                       * Sets the "coborrowerLimitsId" element
                       */
                      void setCoborrowerLimitsId(java.lang.String coborrowerLimitsId);
                      
                      /**
                       * Sets (as xml) the "coborrowerLimitsId" element
                       */
                      void xsetCoborrowerLimitsId(org.apache.xmlbeans.XmlString coborrowerLimitsId);
                      
                      /**
                       * Unsets the "coborrowerLimitsId" element
                       */
                      void unsetCoborrowerLimitsId();
                      
                      /**
                       * Gets the "extSysXRefId" element
                       */
                      java.lang.String getExtSysXRefId();
                      
                      /**
                       * Gets (as xml) the "extSysXRefId" element
                       */
                      org.apache.xmlbeans.XmlString xgetExtSysXRefId();
                      
                      /**
                       * True if has "extSysXRefId" element
                       */
                      boolean isSetExtSysXRefId();
                      
                      /**
                       * Sets the "extSysXRefId" element
                       */
                      void setExtSysXRefId(java.lang.String extSysXRefId);
                      
                      /**
                       * Sets (as xml) the "extSysXRefId" element
                       */
                      void xsetExtSysXRefId(org.apache.xmlbeans.XmlString extSysXRefId);
                      
                      /**
                       * Unsets the "extSysXRefId" element
                       */
                      void unsetExtSysXRefId();
                      
                      /**
                       * Gets the "coborrowerLmtsXrefMapId" element
                       */
                      java.lang.String getCoborrowerLmtsXrefMapId();
                      
                      /**
                       * Gets (as xml) the "coborrowerLmtsXrefMapId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCoborrowerLmtsXrefMapId();
                      
                      /**
                       * True if has "coborrowerLmtsXrefMapId" element
                       */
                      boolean isSetCoborrowerLmtsXrefMapId();
                      
                      /**
                       * Sets the "coborrowerLmtsXrefMapId" element
                       */
                      void setCoborrowerLmtsXrefMapId(java.lang.String coborrowerLmtsXrefMapId);
                      
                      /**
                       * Sets (as xml) the "coborrowerLmtsXrefMapId" element
                       */
                      void xsetCoborrowerLmtsXrefMapId(org.apache.xmlbeans.XmlString coborrowerLmtsXrefMapId);
                      
                      /**
                       * Unsets the "coborrowerLmtsXrefMapId" element
                       */
                      void unsetCoborrowerLmtsXrefMapId();
                      
                      /**
                       * Gets array of all "systemXRefLocation" elements
                       */
                      com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation[] getSystemXRefLocationArray();
                      
                      /**
                       * Gets ith "systemXRefLocation" element
                       */
                      com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation getSystemXRefLocationArray(int i);
                      
                      /**
                       * Returns number of "systemXRefLocation" element
                       */
                      int sizeOfSystemXRefLocationArray();
                      
                      /**
                       * Sets array of all "systemXRefLocation" element
                       */
                      void setSystemXRefLocationArray(com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation[] systemXRefLocationArray);
                      
                      /**
                       * Sets ith "systemXRefLocation" element
                       */
                      void setSystemXRefLocationArray(int i, com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation systemXRefLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "systemXRefLocation" element
                       */
                      com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation insertNewSystemXRefLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "systemXRefLocation" element
                       */
                      com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation addNewSystemXRefLocation();
                      
                      /**
                       * Removes the ith "systemXRefLocation" element
                       */
                      void removeSystemXRefLocation(int i);
                      
                      /**
                       * Gets array of all "externalSystem" elements
                       */
                      com.stanchart.customer.ExternalSystemDocument.ExternalSystem[] getExternalSystemArray();
                      
                      /**
                       * Gets ith "externalSystem" element
                       */
                      com.stanchart.customer.ExternalSystemDocument.ExternalSystem getExternalSystemArray(int i);
                      
                      /**
                       * Returns number of "externalSystem" element
                       */
                      int sizeOfExternalSystemArray();
                      
                      /**
                       * Sets array of all "externalSystem" element
                       */
                      void setExternalSystemArray(com.stanchart.customer.ExternalSystemDocument.ExternalSystem[] externalSystemArray);
                      
                      /**
                       * Sets ith "externalSystem" element
                       */
                      void setExternalSystemArray(int i, com.stanchart.customer.ExternalSystemDocument.ExternalSystem externalSystem);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "externalSystem" element
                       */
                      com.stanchart.customer.ExternalSystemDocument.ExternalSystem insertNewExternalSystem(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "externalSystem" element
                       */
                      com.stanchart.customer.ExternalSystemDocument.ExternalSystem addNewExternalSystem();
                      
                      /**
                       * Removes the ith "externalSystem" element
                       */
                      void removeExternalSystem(int i);
                      
                      /**
                       * Gets array of all "externalCustDetail" elements
                       */
                      com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail[] getExternalCustDetailArray();
                      
                      /**
                       * Gets ith "externalCustDetail" element
                       */
                      com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail getExternalCustDetailArray(int i);
                      
                      /**
                       * Returns number of "externalCustDetail" element
                       */
                      int sizeOfExternalCustDetailArray();
                      
                      /**
                       * Sets array of all "externalCustDetail" element
                       */
                      void setExternalCustDetailArray(com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail[] externalCustDetailArray);
                      
                      /**
                       * Sets ith "externalCustDetail" element
                       */
                      void setExternalCustDetailArray(int i, com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail externalCustDetail);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "externalCustDetail" element
                       */
                      com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail insertNewExternalCustDetail(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "externalCustDetail" element
                       */
                      com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail addNewExternalCustDetail();
                      
                      /**
                       * Removes the ith "externalCustDetail" element
                       */
                      void removeExternalCustDetail(int i);
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowSysXRefMap newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowSysXRefMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowSysXRefMap newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.CoborrowSysXRefMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML subProfileSystemXRef(@).
                     *
                     * This is a complex type.
                     */
                    public interface SubProfileSystemXRef extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubProfileSystemXRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("subprofilesystemxref761celemtype");
                      
                      /**
                       * Gets the "leId" element
                       */
                      java.lang.String getLeId();
                      
                      /**
                       * Gets (as xml) the "leId" element
                       */
                      org.apache.xmlbeans.XmlString xgetLeId();
                      
                      /**
                       * True if has "leId" element
                       */
                      boolean isSetLeId();
                      
                      /**
                       * Sets the "leId" element
                       */
                      void setLeId(java.lang.String leId);
                      
                      /**
                       * Sets (as xml) the "leId" element
                       */
                      void xsetLeId(org.apache.xmlbeans.XmlString leId);
                      
                      /**
                       * Unsets the "leId" element
                       */
                      void unsetLeId();
                      
                      /**
                       * Gets the "subProfileId" element
                       */
                      java.lang.String getSubProfileId();
                      
                      /**
                       * Gets (as xml) the "subProfileId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSubProfileId();
                      
                      /**
                       * True if has "subProfileId" element
                       */
                      boolean isSetSubProfileId();
                      
                      /**
                       * Sets the "subProfileId" element
                       */
                      void setSubProfileId(java.lang.String subProfileId);
                      
                      /**
                       * Sets (as xml) the "subProfileId" element
                       */
                      void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId);
                      
                      /**
                       * Unsets the "subProfileId" element
                       */
                      void unsetSubProfileId();
                      
                      /**
                       * Gets the "sysemXRefId" element
                       */
                      java.lang.String getSysemXRefId();
                      
                      /**
                       * Gets (as xml) the "sysemXRefId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSysemXRefId();
                      
                      /**
                       * True if has "sysemXRefId" element
                       */
                      boolean isSetSysemXRefId();
                      
                      /**
                       * Sets the "sysemXRefId" element
                       */
                      void setSysemXRefId(java.lang.String sysemXRefId);
                      
                      /**
                       * Sets (as xml) the "sysemXRefId" element
                       */
                      void xsetSysemXRefId(org.apache.xmlbeans.XmlString sysemXRefId);
                      
                      /**
                       * Unsets the "sysemXRefId" element
                       */
                      void unsetSysemXRefId();
                      
                      /**
                       * Gets array of all "systemXRefLocation" elements
                       */
                      com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation[] getSystemXRefLocationArray();
                      
                      /**
                       * Gets ith "systemXRefLocation" element
                       */
                      com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation getSystemXRefLocationArray(int i);
                      
                      /**
                       * Returns number of "systemXRefLocation" element
                       */
                      int sizeOfSystemXRefLocationArray();
                      
                      /**
                       * Sets array of all "systemXRefLocation" element
                       */
                      void setSystemXRefLocationArray(com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation[] systemXRefLocationArray);
                      
                      /**
                       * Sets ith "systemXRefLocation" element
                       */
                      void setSystemXRefLocationArray(int i, com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation systemXRefLocation);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "systemXRefLocation" element
                       */
                      com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation insertNewSystemXRefLocation(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "systemXRefLocation" element
                       */
                      com.stanchart.customer.SystemXRefLocationDocument.SystemXRefLocation addNewSystemXRefLocation();
                      
                      /**
                       * Removes the ith "systemXRefLocation" element
                       */
                      void removeSystemXRefLocation(int i);
                      
                      /**
                       * Gets array of all "externalSystem" elements
                       */
                      com.stanchart.customer.ExternalSystemDocument.ExternalSystem[] getExternalSystemArray();
                      
                      /**
                       * Gets ith "externalSystem" element
                       */
                      com.stanchart.customer.ExternalSystemDocument.ExternalSystem getExternalSystemArray(int i);
                      
                      /**
                       * Returns number of "externalSystem" element
                       */
                      int sizeOfExternalSystemArray();
                      
                      /**
                       * Sets array of all "externalSystem" element
                       */
                      void setExternalSystemArray(com.stanchart.customer.ExternalSystemDocument.ExternalSystem[] externalSystemArray);
                      
                      /**
                       * Sets ith "externalSystem" element
                       */
                      void setExternalSystemArray(int i, com.stanchart.customer.ExternalSystemDocument.ExternalSystem externalSystem);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "externalSystem" element
                       */
                      com.stanchart.customer.ExternalSystemDocument.ExternalSystem insertNewExternalSystem(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "externalSystem" element
                       */
                      com.stanchart.customer.ExternalSystemDocument.ExternalSystem addNewExternalSystem();
                      
                      /**
                       * Removes the ith "externalSystem" element
                       */
                      void removeExternalSystem(int i);
                      
                      /**
                       * Gets array of all "externalCustDetail" elements
                       */
                      com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail[] getExternalCustDetailArray();
                      
                      /**
                       * Gets ith "externalCustDetail" element
                       */
                      com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail getExternalCustDetailArray(int i);
                      
                      /**
                       * Returns number of "externalCustDetail" element
                       */
                      int sizeOfExternalCustDetailArray();
                      
                      /**
                       * Sets array of all "externalCustDetail" element
                       */
                      void setExternalCustDetailArray(com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail[] externalCustDetailArray);
                      
                      /**
                       * Sets ith "externalCustDetail" element
                       */
                      void setExternalCustDetailArray(int i, com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail externalCustDetail);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "externalCustDetail" element
                       */
                      com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail insertNewExternalCustDetail(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "externalCustDetail" element
                       */
                      com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail addNewExternalCustDetail();
                      
                      /**
                       * Removes the ith "externalCustDetail" element
                       */
                      void removeExternalCustDetail(int i);
                      
                      /**
                       * Gets array of all "accountDetail" elements
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef.AccountDetail[] getAccountDetailArray();
                      
                      /**
                       * Gets ith "accountDetail" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef.AccountDetail getAccountDetailArray(int i);
                      
                      /**
                       * Returns number of "accountDetail" element
                       */
                      int sizeOfAccountDetailArray();
                      
                      /**
                       * Sets array of all "accountDetail" element
                       */
                      void setAccountDetailArray(com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef.AccountDetail[] accountDetailArray);
                      
                      /**
                       * Sets ith "accountDetail" element
                       */
                      void setAccountDetailArray(int i, com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef.AccountDetail accountDetail);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "accountDetail" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef.AccountDetail insertNewAccountDetail(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "accountDetail" element
                       */
                      com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef.AccountDetail addNewAccountDetail();
                      
                      /**
                       * Removes the ith "accountDetail" element
                       */
                      void removeAccountDetail(int i);
                      
                      /**
                       * Gets the "updateStatusIndicator" element
                       */
                      java.lang.String getUpdateStatusIndicator();
                      
                      /**
                       * Gets (as xml) the "updateStatusIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator();
                      
                      /**
                       * True if has "updateStatusIndicator" element
                       */
                      boolean isSetUpdateStatusIndicator();
                      
                      /**
                       * Sets the "updateStatusIndicator" element
                       */
                      void setUpdateStatusIndicator(java.lang.String updateStatusIndicator);
                      
                      /**
                       * Sets (as xml) the "updateStatusIndicator" element
                       */
                      void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator);
                      
                      /**
                       * Unsets the "updateStatusIndicator" element
                       */
                      void unsetUpdateStatusIndicator();
                      
                      /**
                       * Gets the "changeIndicator" element
                       */
                      java.lang.String getChangeIndicator();
                      
                      /**
                       * Gets (as xml) the "changeIndicator" element
                       */
                      org.apache.xmlbeans.XmlString xgetChangeIndicator();
                      
                      /**
                       * True if has "changeIndicator" element
                       */
                      boolean isSetChangeIndicator();
                      
                      /**
                       * Sets the "changeIndicator" element
                       */
                      void setChangeIndicator(java.lang.String changeIndicator);
                      
                      /**
                       * Sets (as xml) the "changeIndicator" element
                       */
                      void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator);
                      
                      /**
                       * Unsets the "changeIndicator" element
                       */
                      void unsetChangeIndicator();
                      
                      /**
                       * An XML accountDetail(@).
                       *
                       * This is a complex type.
                       */
                      public interface AccountDetail extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccountDetail.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9F196910B54BF4DCAB99B75F4B783434").resolveHandle("accountdetail8f82elemtype");
                        
                        /**
                         * Gets the "accountNumber" element
                         */
                        java.lang.String getAccountNumber();
                        
                        /**
                         * Gets (as xml) the "accountNumber" element
                         */
                        org.apache.xmlbeans.XmlString xgetAccountNumber();
                        
                        /**
                         * True if has "accountNumber" element
                         */
                        boolean isSetAccountNumber();
                        
                        /**
                         * Sets the "accountNumber" element
                         */
                        void setAccountNumber(java.lang.String accountNumber);
                        
                        /**
                         * Sets (as xml) the "accountNumber" element
                         */
                        void xsetAccountNumber(org.apache.xmlbeans.XmlString accountNumber);
                        
                        /**
                         * Unsets the "accountNumber" element
                         */
                        void unsetAccountNumber();
                        
                        /**
                         * Gets the "accountStatus" element
                         */
                        java.lang.String getAccountStatus();
                        
                        /**
                         * Gets (as xml) the "accountStatus" element
                         */
                        org.apache.xmlbeans.XmlString xgetAccountStatus();
                        
                        /**
                         * True if has "accountStatus" element
                         */
                        boolean isSetAccountStatus();
                        
                        /**
                         * Sets the "accountStatus" element
                         */
                        void setAccountStatus(java.lang.String accountStatus);
                        
                        /**
                         * Sets (as xml) the "accountStatus" element
                         */
                        void xsetAccountStatus(org.apache.xmlbeans.XmlString accountStatus);
                        
                        /**
                         * Unsets the "accountStatus" element
                         */
                        void unsetAccountStatus();
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef.AccountDetail newInstance() {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef.AccountDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef.AccountDetail newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef.AccountDetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef newInstance() {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails.SubProfileSystemXRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails newInstance() {
                        return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity.SubProfileDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity newInstance() {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message.LegalEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message newInstance() {
                  return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.stanchart.customer.SCIMessagesDocument.SCIMessages.Message) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.stanchart.customer.SCIMessagesDocument.SCIMessages newInstance() {
              return (com.stanchart.customer.SCIMessagesDocument.SCIMessages) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.stanchart.customer.SCIMessagesDocument.SCIMessages newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.stanchart.customer.SCIMessagesDocument.SCIMessages) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.stanchart.customer.SCIMessagesDocument newInstance() {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.stanchart.customer.SCIMessagesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.stanchart.customer.SCIMessagesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.stanchart.customer.SCIMessagesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.stanchart.customer.SCIMessagesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.stanchart.customer.SCIMessagesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.stanchart.customer.SCIMessagesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.stanchart.customer.SCIMessagesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.stanchart.customer.SCIMessagesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.stanchart.customer.SCIMessagesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.stanchart.customer.SCIMessagesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.stanchart.customer.SCIMessagesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.stanchart.customer.SCIMessagesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.stanchart.customer.SCIMessagesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.stanchart.customer.SCIMessagesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.stanchart.customer.SCIMessagesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.stanchart.customer.SCIMessagesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.stanchart.customer.SCIMessagesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.stanchart.customer.SCIMessagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
