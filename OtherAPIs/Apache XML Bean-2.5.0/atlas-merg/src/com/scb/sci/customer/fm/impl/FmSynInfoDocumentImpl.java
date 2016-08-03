/*
 * An XML document type.
 * Localname: fmSynInfo
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmSynInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmSynInfo(@) element.
 *
 * This is a complex type.
 */
public class FmSynInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmSynInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmSynInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMSYNINFO$0 = 
        new javax.xml.namespace.QName("", "fmSynInfo");
    
    
    /**
     * Gets the "fmSynInfo" element
     */
    public com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo getFmSynInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo target = null;
            target = (com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo)get_store().find_element_user(FMSYNINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmSynInfo" element
     */
    public void setFmSynInfo(com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo fmSynInfo)
    {
        generatedSetterHelperImpl(fmSynInfo, FMSYNINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmSynInfo" element
     */
    public com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo addNewFmSynInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo target = null;
            target = (com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo)get_store().add_element_user(FMSYNINFO$0);
            return target;
        }
    }
    /**
     * An XML fmSynInfo(@).
     *
     * This is a complex type.
     */
    public static class FmSynInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo
    {
        private static final long serialVersionUID = 1L;
        
        public FmSynInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName FMID$4 = 
            new javax.xml.namespace.QName("", "fmId");
        private static final javax.xml.namespace.QName CLIENTFIDESSAVIEWCODE$6 = 
            new javax.xml.namespace.QName("", "clientFidessaViewCode");
        private static final javax.xml.namespace.QName ACCOUNTFIDESSAVIEWCODE$8 = 
            new javax.xml.namespace.QName("", "accountFidessaViewCode");
        private static final javax.xml.namespace.QName CONTRACTINGRELATIONSHIPS$10 = 
            new javax.xml.namespace.QName("", "contractingRelationships");
        private static final javax.xml.namespace.QName VATFLAG$12 = 
            new javax.xml.namespace.QName("", "vatFlag");
        private static final javax.xml.namespace.QName EUVATREGISTRATIONNO$14 = 
            new javax.xml.namespace.QName("", "euVatRegistrationNo");
        private static final javax.xml.namespace.QName MICCODE$16 = 
            new javax.xml.namespace.QName("", "micCode");
        private static final javax.xml.namespace.QName SYMBOLOGY$18 = 
            new javax.xml.namespace.QName("", "symbology");
        private static final javax.xml.namespace.QName USTAXID$20 = 
            new javax.xml.namespace.QName("", "usTaxId");
        private static final javax.xml.namespace.QName OASYSLEVEL$22 = 
            new javax.xml.namespace.QName("", "oasysLevel");
        private static final javax.xml.namespace.QName FMPROFILETYPE$24 = 
            new javax.xml.namespace.QName("", "fmProfileType");
        private static final javax.xml.namespace.QName FMTRADINGACCOUNTTYPE$26 = 
            new javax.xml.namespace.QName("", "fmTradingAccountType");
        private static final javax.xml.namespace.QName SYNROLES$28 = 
            new javax.xml.namespace.QName("", "synRoles");
        private static final javax.xml.namespace.QName INVESTORIDS$30 = 
            new javax.xml.namespace.QName("", "investorIds");
        private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$32 = 
            new javax.xml.namespace.QName("", "updateStatusIndicator");
        private static final javax.xml.namespace.QName CHANGEINDICATOR$34 = 
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
         * Gets the "clientFidessaViewCode" element
         */
        public java.lang.String getClientFidessaViewCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTFIDESSAVIEWCODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "clientFidessaViewCode" element
         */
        public org.apache.xmlbeans.XmlString xgetClientFidessaViewCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTFIDESSAVIEWCODE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "clientFidessaViewCode" element
         */
        public void setClientFidessaViewCode(java.lang.String clientFidessaViewCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTFIDESSAVIEWCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENTFIDESSAVIEWCODE$6);
                }
                target.setStringValue(clientFidessaViewCode);
            }
        }
        
        /**
         * Sets (as xml) the "clientFidessaViewCode" element
         */
        public void xsetClientFidessaViewCode(org.apache.xmlbeans.XmlString clientFidessaViewCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTFIDESSAVIEWCODE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENTFIDESSAVIEWCODE$6);
                }
                target.set(clientFidessaViewCode);
            }
        }
        
        /**
         * Gets the "accountFidessaViewCode" element
         */
        public java.lang.String getAccountFidessaViewCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTFIDESSAVIEWCODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "accountFidessaViewCode" element
         */
        public org.apache.xmlbeans.XmlString xgetAccountFidessaViewCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTFIDESSAVIEWCODE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "accountFidessaViewCode" element
         */
        public void setAccountFidessaViewCode(java.lang.String accountFidessaViewCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTFIDESSAVIEWCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTFIDESSAVIEWCODE$8);
                }
                target.setStringValue(accountFidessaViewCode);
            }
        }
        
        /**
         * Sets (as xml) the "accountFidessaViewCode" element
         */
        public void xsetAccountFidessaViewCode(org.apache.xmlbeans.XmlString accountFidessaViewCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTFIDESSAVIEWCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCOUNTFIDESSAVIEWCODE$8);
                }
                target.set(accountFidessaViewCode);
            }
        }
        
        /**
         * Gets the "contractingRelationships" element
         */
        public com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships getContractingRelationships()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships target = null;
                target = (com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships)get_store().find_element_user(CONTRACTINGRELATIONSHIPS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "contractingRelationships" element
         */
        public boolean isSetContractingRelationships()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTRACTINGRELATIONSHIPS$10) != 0;
            }
        }
        
        /**
         * Sets the "contractingRelationships" element
         */
        public void setContractingRelationships(com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships contractingRelationships)
        {
            generatedSetterHelperImpl(contractingRelationships, CONTRACTINGRELATIONSHIPS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "contractingRelationships" element
         */
        public com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships addNewContractingRelationships()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships target = null;
                target = (com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships)get_store().add_element_user(CONTRACTINGRELATIONSHIPS$10);
                return target;
            }
        }
        
        /**
         * Unsets the "contractingRelationships" element
         */
        public void unsetContractingRelationships()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTRACTINGRELATIONSHIPS$10, 0);
            }
        }
        
        /**
         * Gets the "vatFlag" element
         */
        public java.lang.String getVatFlag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VATFLAG$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "vatFlag" element
         */
        public org.apache.xmlbeans.XmlString xgetVatFlag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VATFLAG$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "vatFlag" element
         */
        public void setVatFlag(java.lang.String vatFlag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VATFLAG$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VATFLAG$12);
                }
                target.setStringValue(vatFlag);
            }
        }
        
        /**
         * Sets (as xml) the "vatFlag" element
         */
        public void xsetVatFlag(org.apache.xmlbeans.XmlString vatFlag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VATFLAG$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VATFLAG$12);
                }
                target.set(vatFlag);
            }
        }
        
        /**
         * Gets the "euVatRegistrationNo" element
         */
        public java.lang.String getEuVatRegistrationNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EUVATREGISTRATIONNO$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "euVatRegistrationNo" element
         */
        public org.apache.xmlbeans.XmlString xgetEuVatRegistrationNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EUVATREGISTRATIONNO$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "euVatRegistrationNo" element
         */
        public void setEuVatRegistrationNo(java.lang.String euVatRegistrationNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EUVATREGISTRATIONNO$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EUVATREGISTRATIONNO$14);
                }
                target.setStringValue(euVatRegistrationNo);
            }
        }
        
        /**
         * Sets (as xml) the "euVatRegistrationNo" element
         */
        public void xsetEuVatRegistrationNo(org.apache.xmlbeans.XmlString euVatRegistrationNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EUVATREGISTRATIONNO$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EUVATREGISTRATIONNO$14);
                }
                target.set(euVatRegistrationNo);
            }
        }
        
        /**
         * Gets the "micCode" element
         */
        public java.lang.String getMicCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MICCODE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "micCode" element
         */
        public org.apache.xmlbeans.XmlString xgetMicCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MICCODE$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "micCode" element
         */
        public void setMicCode(java.lang.String micCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MICCODE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MICCODE$16);
                }
                target.setStringValue(micCode);
            }
        }
        
        /**
         * Sets (as xml) the "micCode" element
         */
        public void xsetMicCode(org.apache.xmlbeans.XmlString micCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MICCODE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MICCODE$16);
                }
                target.set(micCode);
            }
        }
        
        /**
         * Gets the "symbology" element
         */
        public com.scb.sci.customer.fm.SymbologyDocument.Symbology getSymbology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SymbologyDocument.Symbology target = null;
                target = (com.scb.sci.customer.fm.SymbologyDocument.Symbology)get_store().find_element_user(SYMBOLOGY$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "symbology" element
         */
        public void setSymbology(com.scb.sci.customer.fm.SymbologyDocument.Symbology symbology)
        {
            generatedSetterHelperImpl(symbology, SYMBOLOGY$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "symbology" element
         */
        public com.scb.sci.customer.fm.SymbologyDocument.Symbology addNewSymbology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SymbologyDocument.Symbology target = null;
                target = (com.scb.sci.customer.fm.SymbologyDocument.Symbology)get_store().add_element_user(SYMBOLOGY$18);
                return target;
            }
        }
        
        /**
         * Gets the "usTaxId" element
         */
        public java.lang.String getUsTaxId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USTAXID$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "usTaxId" element
         */
        public org.apache.xmlbeans.XmlString xgetUsTaxId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USTAXID$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "usTaxId" element
         */
        public void setUsTaxId(java.lang.String usTaxId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USTAXID$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USTAXID$20);
                }
                target.setStringValue(usTaxId);
            }
        }
        
        /**
         * Sets (as xml) the "usTaxId" element
         */
        public void xsetUsTaxId(org.apache.xmlbeans.XmlString usTaxId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USTAXID$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USTAXID$20);
                }
                target.set(usTaxId);
            }
        }
        
        /**
         * Gets the "oasysLevel" element
         */
        public com.scb.sci.customer.fm.OasysLevelDocument.OasysLevel getOasysLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.OasysLevelDocument.OasysLevel target = null;
                target = (com.scb.sci.customer.fm.OasysLevelDocument.OasysLevel)get_store().find_element_user(OASYSLEVEL$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "oasysLevel" element
         */
        public void setOasysLevel(com.scb.sci.customer.fm.OasysLevelDocument.OasysLevel oasysLevel)
        {
            generatedSetterHelperImpl(oasysLevel, OASYSLEVEL$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "oasysLevel" element
         */
        public com.scb.sci.customer.fm.OasysLevelDocument.OasysLevel addNewOasysLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.OasysLevelDocument.OasysLevel target = null;
                target = (com.scb.sci.customer.fm.OasysLevelDocument.OasysLevel)get_store().add_element_user(OASYSLEVEL$22);
                return target;
            }
        }
        
        /**
         * Gets the "fmProfileType" element
         */
        public com.scb.sci.customer.fm.FmProfileTypeDocument.FmProfileType getFmProfileType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmProfileTypeDocument.FmProfileType target = null;
                target = (com.scb.sci.customer.fm.FmProfileTypeDocument.FmProfileType)get_store().find_element_user(FMPROFILETYPE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fmProfileType" element
         */
        public void setFmProfileType(com.scb.sci.customer.fm.FmProfileTypeDocument.FmProfileType fmProfileType)
        {
            generatedSetterHelperImpl(fmProfileType, FMPROFILETYPE$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmProfileType" element
         */
        public com.scb.sci.customer.fm.FmProfileTypeDocument.FmProfileType addNewFmProfileType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmProfileTypeDocument.FmProfileType target = null;
                target = (com.scb.sci.customer.fm.FmProfileTypeDocument.FmProfileType)get_store().add_element_user(FMPROFILETYPE$24);
                return target;
            }
        }
        
        /**
         * Gets the "fmTradingAccountType" element
         */
        public com.scb.sci.customer.fm.FmTradingAccountTypeDocument.FmTradingAccountType getFmTradingAccountType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmTradingAccountTypeDocument.FmTradingAccountType target = null;
                target = (com.scb.sci.customer.fm.FmTradingAccountTypeDocument.FmTradingAccountType)get_store().find_element_user(FMTRADINGACCOUNTTYPE$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fmTradingAccountType" element
         */
        public void setFmTradingAccountType(com.scb.sci.customer.fm.FmTradingAccountTypeDocument.FmTradingAccountType fmTradingAccountType)
        {
            generatedSetterHelperImpl(fmTradingAccountType, FMTRADINGACCOUNTTYPE$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmTradingAccountType" element
         */
        public com.scb.sci.customer.fm.FmTradingAccountTypeDocument.FmTradingAccountType addNewFmTradingAccountType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmTradingAccountTypeDocument.FmTradingAccountType target = null;
                target = (com.scb.sci.customer.fm.FmTradingAccountTypeDocument.FmTradingAccountType)get_store().add_element_user(FMTRADINGACCOUNTTYPE$26);
                return target;
            }
        }
        
        /**
         * Gets the "synRoles" element
         */
        public com.scb.sci.customer.fm.SynRolesDocument.SynRoles getSynRoles()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SynRolesDocument.SynRoles target = null;
                target = (com.scb.sci.customer.fm.SynRolesDocument.SynRoles)get_store().find_element_user(SYNROLES$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "synRoles" element
         */
        public boolean isSetSynRoles()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SYNROLES$28) != 0;
            }
        }
        
        /**
         * Sets the "synRoles" element
         */
        public void setSynRoles(com.scb.sci.customer.fm.SynRolesDocument.SynRoles synRoles)
        {
            generatedSetterHelperImpl(synRoles, SYNROLES$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "synRoles" element
         */
        public com.scb.sci.customer.fm.SynRolesDocument.SynRoles addNewSynRoles()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SynRolesDocument.SynRoles target = null;
                target = (com.scb.sci.customer.fm.SynRolesDocument.SynRoles)get_store().add_element_user(SYNROLES$28);
                return target;
            }
        }
        
        /**
         * Unsets the "synRoles" element
         */
        public void unsetSynRoles()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SYNROLES$28, 0);
            }
        }
        
        /**
         * Gets the "investorIds" element
         */
        public com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds getInvestorIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds target = null;
                target = (com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds)get_store().find_element_user(INVESTORIDS$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "investorIds" element
         */
        public boolean isSetInvestorIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INVESTORIDS$30) != 0;
            }
        }
        
        /**
         * Sets the "investorIds" element
         */
        public void setInvestorIds(com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds investorIds)
        {
            generatedSetterHelperImpl(investorIds, INVESTORIDS$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "investorIds" element
         */
        public com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds addNewInvestorIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds target = null;
                target = (com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds)get_store().add_element_user(INVESTORIDS$30);
                return target;
            }
        }
        
        /**
         * Unsets the "investorIds" element
         */
        public void unsetInvestorIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INVESTORIDS$30, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$32, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$32, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$32);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$32);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$34, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$34, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$34);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$34);
                }
                target.set(changeIndicator);
            }
        }
    }
}
