/*
 * An XML document type.
 * Localname: fmEntityMoreInfo
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmEntityMoreInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmEntityMoreInfo(@) element.
 *
 * This is a complex type.
 */
public class FmEntityMoreInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmEntityMoreInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmEntityMoreInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMENTITYMOREINFO$0 = 
        new javax.xml.namespace.QName("", "fmEntityMoreInfo");
    
    
    /**
     * Gets the "fmEntityMoreInfo" element
     */
    public com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo getFmEntityMoreInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo target = null;
            target = (com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo)get_store().find_element_user(FMENTITYMOREINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmEntityMoreInfo" element
     */
    public void setFmEntityMoreInfo(com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo fmEntityMoreInfo)
    {
        generatedSetterHelperImpl(fmEntityMoreInfo, FMENTITYMOREINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmEntityMoreInfo" element
     */
    public com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo addNewFmEntityMoreInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo target = null;
            target = (com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo)get_store().add_element_user(FMENTITYMOREINFO$0);
            return target;
        }
    }
    /**
     * An XML fmEntityMoreInfo(@).
     *
     * This is a complex type.
     */
    public static class FmEntityMoreInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo
    {
        private static final long serialVersionUID = 1L;
        
        public FmEntityMoreInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName FMID$4 = 
            new javax.xml.namespace.QName("", "fmId");
        private static final javax.xml.namespace.QName FMMOREDTLSYSGENID$6 = 
            new javax.xml.namespace.QName("", "fmMoreDtlSysGenId");
        private static final javax.xml.namespace.QName SCBCLASSCODE$8 = 
            new javax.xml.namespace.QName("", "scbClassCode");
        private static final javax.xml.namespace.QName FMTYPE$10 = 
            new javax.xml.namespace.QName("", "fmType");
        private static final javax.xml.namespace.QName OPICSCLASSCODE$12 = 
            new javax.xml.namespace.QName("", "opicsClassCode");
        private static final javax.xml.namespace.QName FMCLASSCODE$14 = 
            new javax.xml.namespace.QName("", "fmClassCode");
        private static final javax.xml.namespace.QName FININSTTYPE$16 = 
            new javax.xml.namespace.QName("", "finInstType");
        private static final javax.xml.namespace.QName INSTSECTOR$18 = 
            new javax.xml.namespace.QName("", "instSector");
        private static final javax.xml.namespace.QName CLSEIGIBILITY$20 = 
            new javax.xml.namespace.QName("", "clsEigibility");
        private static final javax.xml.namespace.QName CLSCUSTTYPE$22 = 
            new javax.xml.namespace.QName("", "clsCustType");
        private static final javax.xml.namespace.QName CLSSTARTDATE$24 = 
            new javax.xml.namespace.QName("", "clsStartDate");
        private static final javax.xml.namespace.QName BROKERID$26 = 
            new javax.xml.namespace.QName("", "brokerId");
        private static final javax.xml.namespace.QName ARMEMPCODEMAPID$28 = 
            new javax.xml.namespace.QName("", "armEmpCodeMapId");
        private static final javax.xml.namespace.QName ARMID$30 = 
            new javax.xml.namespace.QName("", "armId");
        private static final javax.xml.namespace.QName ARMCODE$32 = 
            new javax.xml.namespace.QName("", "armCode");
        private static final javax.xml.namespace.QName ARMEMPID$34 = 
            new javax.xml.namespace.QName("", "armEmpId");
        private static final javax.xml.namespace.QName ARMEMPNAME$36 = 
            new javax.xml.namespace.QName("", "armEmpName");
        private static final javax.xml.namespace.QName ARMLOCATIONID$38 = 
            new javax.xml.namespace.QName("", "armLocationId");
        private static final javax.xml.namespace.QName ARMLOCATIONCOUNTRY$40 = 
            new javax.xml.namespace.QName("", "armLocationCountry");
        private static final javax.xml.namespace.QName ARMLOCATIONORGANIZATION$42 = 
            new javax.xml.namespace.QName("", "armLocationOrganization");
        private static final javax.xml.namespace.QName DATAPROTIND$44 = 
            new javax.xml.namespace.QName("", "dataProtInd");
        private static final javax.xml.namespace.QName FMNOTE$46 = 
            new javax.xml.namespace.QName("", "fmNote");
        private static final javax.xml.namespace.QName NRDSIGNEDIND$48 = 
            new javax.xml.namespace.QName("", "nrdSignedInd");
        private static final javax.xml.namespace.QName CONFREQIND$50 = 
            new javax.xml.namespace.QName("", "confReqInd");
        private static final javax.xml.namespace.QName TRADINGIND$52 = 
            new javax.xml.namespace.QName("", "tradingInd");
        private static final javax.xml.namespace.QName DATEOFSIGNINGOFDISCAGR$54 = 
            new javax.xml.namespace.QName("", "dateOfSigningOfDiscAgr");
        private static final javax.xml.namespace.QName DISCLOSUREAGRRECIND$56 = 
            new javax.xml.namespace.QName("", "disclosureAgrRecInd");
        private static final javax.xml.namespace.QName DOCCOMPLETIONIND$58 = 
            new javax.xml.namespace.QName("", "docCompletionInd");
        private static final javax.xml.namespace.QName DOCCOMPLETIONDATE$60 = 
            new javax.xml.namespace.QName("", "docCompletionDate");
        private static final javax.xml.namespace.QName BANKINGSECRECYACTIND$62 = 
            new javax.xml.namespace.QName("", "bankingSecrecyActInd");
        private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$64 = 
            new javax.xml.namespace.QName("", "updateStatusIndicator");
        private static final javax.xml.namespace.QName CHANGEINDICATOR$66 = 
            new javax.xml.namespace.QName("", "changeIndicator");
        
        
        /**
         * Gets the "leId" element
         */
        public java.lang.String getLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leId" element
         */
        public org.apache.xmlbeans.XmlString xgetLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leId" element
         */
        public void setLeId(java.lang.String leId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEID$0);
                }
                target.setStringValue(leId);
            }
        }
        
        /**
         * Sets (as xml) the "leId" element
         */
        public void xsetLeId(org.apache.xmlbeans.XmlString leId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEID$0);
                }
                target.set(leId);
            }
        }
        
        /**
         * Gets the "subProfileId" element
         */
        public java.lang.String getSubProfileId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPROFILEID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subProfileId" element
         */
        public org.apache.xmlbeans.XmlString xgetSubProfileId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPROFILEID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "subProfileId" element
         */
        public void setSubProfileId(java.lang.String subProfileId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPROFILEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBPROFILEID$2);
                }
                target.setStringValue(subProfileId);
            }
        }
        
        /**
         * Sets (as xml) the "subProfileId" element
         */
        public void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPROFILEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBPROFILEID$2);
                }
                target.set(subProfileId);
            }
        }
        
        /**
         * Gets the "fmId" element
         */
        public java.lang.String getFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmId" element
         */
        public org.apache.xmlbeans.XmlString xgetFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmId" element
         */
        public void setFmId(java.lang.String fmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMID$4);
                }
                target.setStringValue(fmId);
            }
        }
        
        /**
         * Sets (as xml) the "fmId" element
         */
        public void xsetFmId(org.apache.xmlbeans.XmlString fmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMID$4);
                }
                target.set(fmId);
            }
        }
        
        /**
         * Gets the "fmMoreDtlSysGenId" element
         */
        public java.lang.String getFmMoreDtlSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMMOREDTLSYSGENID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmMoreDtlSysGenId" element
         */
        public org.apache.xmlbeans.XmlString xgetFmMoreDtlSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMMOREDTLSYSGENID$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmMoreDtlSysGenId" element
         */
        public void setFmMoreDtlSysGenId(java.lang.String fmMoreDtlSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMMOREDTLSYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMMOREDTLSYSGENID$6);
                }
                target.setStringValue(fmMoreDtlSysGenId);
            }
        }
        
        /**
         * Sets (as xml) the "fmMoreDtlSysGenId" element
         */
        public void xsetFmMoreDtlSysGenId(org.apache.xmlbeans.XmlString fmMoreDtlSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMMOREDTLSYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMMOREDTLSYSGENID$6);
                }
                target.set(fmMoreDtlSysGenId);
            }
        }
        
        /**
         * Gets the "scbClassCode" element
         */
        public java.lang.String getScbClassCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBCLASSCODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "scbClassCode" element
         */
        public org.apache.xmlbeans.XmlString xgetScbClassCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBCLASSCODE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "scbClassCode" element
         */
        public void setScbClassCode(java.lang.String scbClassCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBCLASSCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBCLASSCODE$8);
                }
                target.setStringValue(scbClassCode);
            }
        }
        
        /**
         * Sets (as xml) the "scbClassCode" element
         */
        public void xsetScbClassCode(org.apache.xmlbeans.XmlString scbClassCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBCLASSCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBCLASSCODE$8);
                }
                target.set(scbClassCode);
            }
        }
        
        /**
         * Gets the "fmType" element
         */
        public com.scb.sci.customer.fm.FmTypeDocument.FmType getFmType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmTypeDocument.FmType target = null;
                target = (com.scb.sci.customer.fm.FmTypeDocument.FmType)get_store().find_element_user(FMTYPE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fmType" element
         */
        public void setFmType(com.scb.sci.customer.fm.FmTypeDocument.FmType fmType)
        {
            generatedSetterHelperImpl(fmType, FMTYPE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmType" element
         */
        public com.scb.sci.customer.fm.FmTypeDocument.FmType addNewFmType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmTypeDocument.FmType target = null;
                target = (com.scb.sci.customer.fm.FmTypeDocument.FmType)get_store().add_element_user(FMTYPE$10);
                return target;
            }
        }
        
        /**
         * Gets the "opicsClassCode" element
         */
        public java.lang.String getOpicsClassCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPICSCLASSCODE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "opicsClassCode" element
         */
        public org.apache.xmlbeans.XmlString xgetOpicsClassCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPICSCLASSCODE$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "opicsClassCode" element
         */
        public void setOpicsClassCode(java.lang.String opicsClassCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPICSCLASSCODE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPICSCLASSCODE$12);
                }
                target.setStringValue(opicsClassCode);
            }
        }
        
        /**
         * Sets (as xml) the "opicsClassCode" element
         */
        public void xsetOpicsClassCode(org.apache.xmlbeans.XmlString opicsClassCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPICSCLASSCODE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPICSCLASSCODE$12);
                }
                target.set(opicsClassCode);
            }
        }
        
        /**
         * Gets the "fmClassCode" element
         */
        public com.scb.sci.customer.fm.FmClassCodeDocument.FmClassCode getFmClassCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmClassCodeDocument.FmClassCode target = null;
                target = (com.scb.sci.customer.fm.FmClassCodeDocument.FmClassCode)get_store().find_element_user(FMCLASSCODE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fmClassCode" element
         */
        public void setFmClassCode(com.scb.sci.customer.fm.FmClassCodeDocument.FmClassCode fmClassCode)
        {
            generatedSetterHelperImpl(fmClassCode, FMCLASSCODE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmClassCode" element
         */
        public com.scb.sci.customer.fm.FmClassCodeDocument.FmClassCode addNewFmClassCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmClassCodeDocument.FmClassCode target = null;
                target = (com.scb.sci.customer.fm.FmClassCodeDocument.FmClassCode)get_store().add_element_user(FMCLASSCODE$14);
                return target;
            }
        }
        
        /**
         * Gets the "finInstType" element
         */
        public com.scb.sci.customer.fm.FinInstTypeDocument.FinInstType getFinInstType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FinInstTypeDocument.FinInstType target = null;
                target = (com.scb.sci.customer.fm.FinInstTypeDocument.FinInstType)get_store().find_element_user(FININSTTYPE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "finInstType" element
         */
        public void setFinInstType(com.scb.sci.customer.fm.FinInstTypeDocument.FinInstType finInstType)
        {
            generatedSetterHelperImpl(finInstType, FININSTTYPE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "finInstType" element
         */
        public com.scb.sci.customer.fm.FinInstTypeDocument.FinInstType addNewFinInstType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FinInstTypeDocument.FinInstType target = null;
                target = (com.scb.sci.customer.fm.FinInstTypeDocument.FinInstType)get_store().add_element_user(FININSTTYPE$16);
                return target;
            }
        }
        
        /**
         * Gets the "instSector" element
         */
        public com.scb.sci.customer.fm.InstSectorDocument.InstSector getInstSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.InstSectorDocument.InstSector target = null;
                target = (com.scb.sci.customer.fm.InstSectorDocument.InstSector)get_store().find_element_user(INSTSECTOR$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "instSector" element
         */
        public void setInstSector(com.scb.sci.customer.fm.InstSectorDocument.InstSector instSector)
        {
            generatedSetterHelperImpl(instSector, INSTSECTOR$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "instSector" element
         */
        public com.scb.sci.customer.fm.InstSectorDocument.InstSector addNewInstSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.InstSectorDocument.InstSector target = null;
                target = (com.scb.sci.customer.fm.InstSectorDocument.InstSector)get_store().add_element_user(INSTSECTOR$18);
                return target;
            }
        }
        
        /**
         * Gets the "clsEigibility" element
         */
        public java.lang.String getClsEigibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSEIGIBILITY$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "clsEigibility" element
         */
        public org.apache.xmlbeans.XmlString xgetClsEigibility()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSEIGIBILITY$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "clsEigibility" element
         */
        public void setClsEigibility(java.lang.String clsEigibility)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSEIGIBILITY$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLSEIGIBILITY$20);
                }
                target.setStringValue(clsEigibility);
            }
        }
        
        /**
         * Sets (as xml) the "clsEigibility" element
         */
        public void xsetClsEigibility(org.apache.xmlbeans.XmlString clsEigibility)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSEIGIBILITY$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLSEIGIBILITY$20);
                }
                target.set(clsEigibility);
            }
        }
        
        /**
         * Gets the "clsCustType" element
         */
        public com.scb.sci.customer.fm.ClsCustTypeDocument.ClsCustType getClsCustType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ClsCustTypeDocument.ClsCustType target = null;
                target = (com.scb.sci.customer.fm.ClsCustTypeDocument.ClsCustType)get_store().find_element_user(CLSCUSTTYPE$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "clsCustType" element
         */
        public void setClsCustType(com.scb.sci.customer.fm.ClsCustTypeDocument.ClsCustType clsCustType)
        {
            generatedSetterHelperImpl(clsCustType, CLSCUSTTYPE$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "clsCustType" element
         */
        public com.scb.sci.customer.fm.ClsCustTypeDocument.ClsCustType addNewClsCustType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ClsCustTypeDocument.ClsCustType target = null;
                target = (com.scb.sci.customer.fm.ClsCustTypeDocument.ClsCustType)get_store().add_element_user(CLSCUSTTYPE$22);
                return target;
            }
        }
        
        /**
         * Gets the "clsStartDate" element
         */
        public java.lang.String getClsStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSSTARTDATE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "clsStartDate" element
         */
        public org.apache.xmlbeans.XmlString xgetClsStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSSTARTDATE$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "clsStartDate" element
         */
        public void setClsStartDate(java.lang.String clsStartDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSSTARTDATE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLSSTARTDATE$24);
                }
                target.setStringValue(clsStartDate);
            }
        }
        
        /**
         * Sets (as xml) the "clsStartDate" element
         */
        public void xsetClsStartDate(org.apache.xmlbeans.XmlString clsStartDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSSTARTDATE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLSSTARTDATE$24);
                }
                target.set(clsStartDate);
            }
        }
        
        /**
         * Gets the "brokerId" element
         */
        public java.lang.String getBrokerId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROKERID$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "brokerId" element
         */
        public org.apache.xmlbeans.XmlString xgetBrokerId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BROKERID$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "brokerId" element
         */
        public void setBrokerId(java.lang.String brokerId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROKERID$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BROKERID$26);
                }
                target.setStringValue(brokerId);
            }
        }
        
        /**
         * Sets (as xml) the "brokerId" element
         */
        public void xsetBrokerId(org.apache.xmlbeans.XmlString brokerId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BROKERID$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BROKERID$26);
                }
                target.set(brokerId);
            }
        }
        
        /**
         * Gets the "armEmpCodeMapId" element
         */
        public java.lang.String getArmEmpCodeMapId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMEMPCODEMAPID$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "armEmpCodeMapId" element
         */
        public org.apache.xmlbeans.XmlString xgetArmEmpCodeMapId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMEMPCODEMAPID$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "armEmpCodeMapId" element
         */
        public void setArmEmpCodeMapId(java.lang.String armEmpCodeMapId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMEMPCODEMAPID$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMEMPCODEMAPID$28);
                }
                target.setStringValue(armEmpCodeMapId);
            }
        }
        
        /**
         * Sets (as xml) the "armEmpCodeMapId" element
         */
        public void xsetArmEmpCodeMapId(org.apache.xmlbeans.XmlString armEmpCodeMapId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMEMPCODEMAPID$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMEMPCODEMAPID$28);
                }
                target.set(armEmpCodeMapId);
            }
        }
        
        /**
         * Gets the "armId" element
         */
        public java.lang.String getArmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMID$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "armId" element
         */
        public org.apache.xmlbeans.XmlString xgetArmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMID$30, 0);
                return target;
            }
        }
        
        /**
         * Sets the "armId" element
         */
        public void setArmId(java.lang.String armId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMID$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMID$30);
                }
                target.setStringValue(armId);
            }
        }
        
        /**
         * Sets (as xml) the "armId" element
         */
        public void xsetArmId(org.apache.xmlbeans.XmlString armId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMID$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMID$30);
                }
                target.set(armId);
            }
        }
        
        /**
         * Gets the "armCode" element
         */
        public java.lang.String getArmCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCODE$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "armCode" element
         */
        public org.apache.xmlbeans.XmlString xgetArmCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCODE$32, 0);
                return target;
            }
        }
        
        /**
         * Sets the "armCode" element
         */
        public void setArmCode(java.lang.String armCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCODE$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMCODE$32);
                }
                target.setStringValue(armCode);
            }
        }
        
        /**
         * Sets (as xml) the "armCode" element
         */
        public void xsetArmCode(org.apache.xmlbeans.XmlString armCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCODE$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMCODE$32);
                }
                target.set(armCode);
            }
        }
        
        /**
         * Gets the "armEmpId" element
         */
        public java.lang.String getArmEmpId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMEMPID$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "armEmpId" element
         */
        public org.apache.xmlbeans.XmlString xgetArmEmpId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMEMPID$34, 0);
                return target;
            }
        }
        
        /**
         * Sets the "armEmpId" element
         */
        public void setArmEmpId(java.lang.String armEmpId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMEMPID$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMEMPID$34);
                }
                target.setStringValue(armEmpId);
            }
        }
        
        /**
         * Sets (as xml) the "armEmpId" element
         */
        public void xsetArmEmpId(org.apache.xmlbeans.XmlString armEmpId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMEMPID$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMEMPID$34);
                }
                target.set(armEmpId);
            }
        }
        
        /**
         * Gets the "armEmpName" element
         */
        public java.lang.String getArmEmpName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMEMPNAME$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "armEmpName" element
         */
        public org.apache.xmlbeans.XmlString xgetArmEmpName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMEMPNAME$36, 0);
                return target;
            }
        }
        
        /**
         * Sets the "armEmpName" element
         */
        public void setArmEmpName(java.lang.String armEmpName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMEMPNAME$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMEMPNAME$36);
                }
                target.setStringValue(armEmpName);
            }
        }
        
        /**
         * Sets (as xml) the "armEmpName" element
         */
        public void xsetArmEmpName(org.apache.xmlbeans.XmlString armEmpName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMEMPNAME$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMEMPNAME$36);
                }
                target.set(armEmpName);
            }
        }
        
        /**
         * Gets the "armLocationId" element
         */
        public java.lang.String getArmLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMLOCATIONID$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "armLocationId" element
         */
        public org.apache.xmlbeans.XmlString xgetArmLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMLOCATIONID$38, 0);
                return target;
            }
        }
        
        /**
         * Sets the "armLocationId" element
         */
        public void setArmLocationId(java.lang.String armLocationId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMLOCATIONID$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMLOCATIONID$38);
                }
                target.setStringValue(armLocationId);
            }
        }
        
        /**
         * Sets (as xml) the "armLocationId" element
         */
        public void xsetArmLocationId(org.apache.xmlbeans.XmlString armLocationId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMLOCATIONID$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMLOCATIONID$38);
                }
                target.set(armLocationId);
            }
        }
        
        /**
         * Gets the "armLocationCountry" element
         */
        public java.lang.String getArmLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMLOCATIONCOUNTRY$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "armLocationCountry" element
         */
        public org.apache.xmlbeans.XmlString xgetArmLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMLOCATIONCOUNTRY$40, 0);
                return target;
            }
        }
        
        /**
         * Sets the "armLocationCountry" element
         */
        public void setArmLocationCountry(java.lang.String armLocationCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMLOCATIONCOUNTRY$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMLOCATIONCOUNTRY$40);
                }
                target.setStringValue(armLocationCountry);
            }
        }
        
        /**
         * Sets (as xml) the "armLocationCountry" element
         */
        public void xsetArmLocationCountry(org.apache.xmlbeans.XmlString armLocationCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMLOCATIONCOUNTRY$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMLOCATIONCOUNTRY$40);
                }
                target.set(armLocationCountry);
            }
        }
        
        /**
         * Gets the "armLocationOrganization" element
         */
        public java.lang.String getArmLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMLOCATIONORGANIZATION$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "armLocationOrganization" element
         */
        public org.apache.xmlbeans.XmlString xgetArmLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMLOCATIONORGANIZATION$42, 0);
                return target;
            }
        }
        
        /**
         * Sets the "armLocationOrganization" element
         */
        public void setArmLocationOrganization(java.lang.String armLocationOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMLOCATIONORGANIZATION$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMLOCATIONORGANIZATION$42);
                }
                target.setStringValue(armLocationOrganization);
            }
        }
        
        /**
         * Sets (as xml) the "armLocationOrganization" element
         */
        public void xsetArmLocationOrganization(org.apache.xmlbeans.XmlString armLocationOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMLOCATIONORGANIZATION$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMLOCATIONORGANIZATION$42);
                }
                target.set(armLocationOrganization);
            }
        }
        
        /**
         * Gets the "dataProtInd" element
         */
        public java.lang.String getDataProtInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROTIND$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dataProtInd" element
         */
        public org.apache.xmlbeans.XmlString xgetDataProtInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROTIND$44, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dataProtInd" element
         */
        public void setDataProtInd(java.lang.String dataProtInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROTIND$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAPROTIND$44);
                }
                target.setStringValue(dataProtInd);
            }
        }
        
        /**
         * Sets (as xml) the "dataProtInd" element
         */
        public void xsetDataProtInd(org.apache.xmlbeans.XmlString dataProtInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROTIND$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAPROTIND$44);
                }
                target.set(dataProtInd);
            }
        }
        
        /**
         * Gets the "fmNote" element
         */
        public java.lang.String getFmNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMNOTE$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmNote" element
         */
        public org.apache.xmlbeans.XmlString xgetFmNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMNOTE$46, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmNote" element
         */
        public void setFmNote(java.lang.String fmNote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMNOTE$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMNOTE$46);
                }
                target.setStringValue(fmNote);
            }
        }
        
        /**
         * Sets (as xml) the "fmNote" element
         */
        public void xsetFmNote(org.apache.xmlbeans.XmlString fmNote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMNOTE$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMNOTE$46);
                }
                target.set(fmNote);
            }
        }
        
        /**
         * Gets the "nrdSignedInd" element
         */
        public java.lang.String getNrdSignedInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRDSIGNEDIND$48, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "nrdSignedInd" element
         */
        public org.apache.xmlbeans.XmlString xgetNrdSignedInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NRDSIGNEDIND$48, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nrdSignedInd" element
         */
        public void setNrdSignedInd(java.lang.String nrdSignedInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRDSIGNEDIND$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NRDSIGNEDIND$48);
                }
                target.setStringValue(nrdSignedInd);
            }
        }
        
        /**
         * Sets (as xml) the "nrdSignedInd" element
         */
        public void xsetNrdSignedInd(org.apache.xmlbeans.XmlString nrdSignedInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NRDSIGNEDIND$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NRDSIGNEDIND$48);
                }
                target.set(nrdSignedInd);
            }
        }
        
        /**
         * Gets the "confReqInd" element
         */
        public java.lang.String getConfReqInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFREQIND$50, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "confReqInd" element
         */
        public org.apache.xmlbeans.XmlString xgetConfReqInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFREQIND$50, 0);
                return target;
            }
        }
        
        /**
         * Sets the "confReqInd" element
         */
        public void setConfReqInd(java.lang.String confReqInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFREQIND$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFREQIND$50);
                }
                target.setStringValue(confReqInd);
            }
        }
        
        /**
         * Sets (as xml) the "confReqInd" element
         */
        public void xsetConfReqInd(org.apache.xmlbeans.XmlString confReqInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFREQIND$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONFREQIND$50);
                }
                target.set(confReqInd);
            }
        }
        
        /**
         * Gets the "tradingInd" element
         */
        public java.lang.String getTradingInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRADINGIND$52, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tradingInd" element
         */
        public org.apache.xmlbeans.XmlString xgetTradingInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRADINGIND$52, 0);
                return target;
            }
        }
        
        /**
         * Sets the "tradingInd" element
         */
        public void setTradingInd(java.lang.String tradingInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRADINGIND$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRADINGIND$52);
                }
                target.setStringValue(tradingInd);
            }
        }
        
        /**
         * Sets (as xml) the "tradingInd" element
         */
        public void xsetTradingInd(org.apache.xmlbeans.XmlString tradingInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRADINGIND$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRADINGIND$52);
                }
                target.set(tradingInd);
            }
        }
        
        /**
         * Gets the "dateOfSigningOfDiscAgr" element
         */
        public java.lang.String getDateOfSigningOfDiscAgr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOFSIGNINGOFDISCAGR$54, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dateOfSigningOfDiscAgr" element
         */
        public org.apache.xmlbeans.XmlString xgetDateOfSigningOfDiscAgr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEOFSIGNINGOFDISCAGR$54, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dateOfSigningOfDiscAgr" element
         */
        public void setDateOfSigningOfDiscAgr(java.lang.String dateOfSigningOfDiscAgr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOFSIGNINGOFDISCAGR$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEOFSIGNINGOFDISCAGR$54);
                }
                target.setStringValue(dateOfSigningOfDiscAgr);
            }
        }
        
        /**
         * Sets (as xml) the "dateOfSigningOfDiscAgr" element
         */
        public void xsetDateOfSigningOfDiscAgr(org.apache.xmlbeans.XmlString dateOfSigningOfDiscAgr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEOFSIGNINGOFDISCAGR$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEOFSIGNINGOFDISCAGR$54);
                }
                target.set(dateOfSigningOfDiscAgr);
            }
        }
        
        /**
         * Gets the "disclosureAgrRecInd" element
         */
        public java.lang.String getDisclosureAgrRecInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLOSUREAGRRECIND$56, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "disclosureAgrRecInd" element
         */
        public org.apache.xmlbeans.XmlString xgetDisclosureAgrRecInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLOSUREAGRRECIND$56, 0);
                return target;
            }
        }
        
        /**
         * Sets the "disclosureAgrRecInd" element
         */
        public void setDisclosureAgrRecInd(java.lang.String disclosureAgrRecInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLOSUREAGRRECIND$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCLOSUREAGRRECIND$56);
                }
                target.setStringValue(disclosureAgrRecInd);
            }
        }
        
        /**
         * Sets (as xml) the "disclosureAgrRecInd" element
         */
        public void xsetDisclosureAgrRecInd(org.apache.xmlbeans.XmlString disclosureAgrRecInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLOSUREAGRRECIND$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISCLOSUREAGRRECIND$56);
                }
                target.set(disclosureAgrRecInd);
            }
        }
        
        /**
         * Gets the "docCompletionInd" element
         */
        public java.lang.String getDocCompletionInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLETIONIND$58, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "docCompletionInd" element
         */
        public org.apache.xmlbeans.XmlString xgetDocCompletionInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLETIONIND$58, 0);
                return target;
            }
        }
        
        /**
         * Sets the "docCompletionInd" element
         */
        public void setDocCompletionInd(java.lang.String docCompletionInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLETIONIND$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCCOMPLETIONIND$58);
                }
                target.setStringValue(docCompletionInd);
            }
        }
        
        /**
         * Sets (as xml) the "docCompletionInd" element
         */
        public void xsetDocCompletionInd(org.apache.xmlbeans.XmlString docCompletionInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLETIONIND$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCCOMPLETIONIND$58);
                }
                target.set(docCompletionInd);
            }
        }
        
        /**
         * Gets the "docCompletionDate" element
         */
        public java.lang.String getDocCompletionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLETIONDATE$60, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "docCompletionDate" element
         */
        public org.apache.xmlbeans.XmlString xgetDocCompletionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLETIONDATE$60, 0);
                return target;
            }
        }
        
        /**
         * Sets the "docCompletionDate" element
         */
        public void setDocCompletionDate(java.lang.String docCompletionDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLETIONDATE$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCCOMPLETIONDATE$60);
                }
                target.setStringValue(docCompletionDate);
            }
        }
        
        /**
         * Sets (as xml) the "docCompletionDate" element
         */
        public void xsetDocCompletionDate(org.apache.xmlbeans.XmlString docCompletionDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLETIONDATE$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCCOMPLETIONDATE$60);
                }
                target.set(docCompletionDate);
            }
        }
        
        /**
         * Gets the "bankingSecrecyActInd" element
         */
        public java.lang.String getBankingSecrecyActInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BANKINGSECRECYACTIND$62, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bankingSecrecyActInd" element
         */
        public org.apache.xmlbeans.XmlString xgetBankingSecrecyActInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BANKINGSECRECYACTIND$62, 0);
                return target;
            }
        }
        
        /**
         * Sets the "bankingSecrecyActInd" element
         */
        public void setBankingSecrecyActInd(java.lang.String bankingSecrecyActInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BANKINGSECRECYACTIND$62, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BANKINGSECRECYACTIND$62);
                }
                target.setStringValue(bankingSecrecyActInd);
            }
        }
        
        /**
         * Sets (as xml) the "bankingSecrecyActInd" element
         */
        public void xsetBankingSecrecyActInd(org.apache.xmlbeans.XmlString bankingSecrecyActInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BANKINGSECRECYACTIND$62, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BANKINGSECRECYACTIND$62);
                }
                target.set(bankingSecrecyActInd);
            }
        }
        
        /**
         * Gets the "updateStatusIndicator" element
         */
        public java.lang.String getUpdateStatusIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$64, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "updateStatusIndicator" element
         */
        public org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$64, 0);
                return target;
            }
        }
        
        /**
         * Sets the "updateStatusIndicator" element
         */
        public void setUpdateStatusIndicator(java.lang.String updateStatusIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$64);
                }
                target.setStringValue(updateStatusIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "updateStatusIndicator" element
         */
        public void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$64);
                }
                target.set(updateStatusIndicator);
            }
        }
        
        /**
         * Gets the "changeIndicator" element
         */
        public java.lang.String getChangeIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$66, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "changeIndicator" element
         */
        public org.apache.xmlbeans.XmlString xgetChangeIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$66, 0);
                return target;
            }
        }
        
        /**
         * Sets the "changeIndicator" element
         */
        public void setChangeIndicator(java.lang.String changeIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$66);
                }
                target.setStringValue(changeIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "changeIndicator" element
         */
        public void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$66);
                }
                target.set(changeIndicator);
            }
        }
    }
}
