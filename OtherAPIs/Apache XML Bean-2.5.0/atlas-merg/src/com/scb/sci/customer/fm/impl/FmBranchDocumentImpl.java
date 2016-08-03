/*
 * An XML document type.
 * Localname: fmBranch
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmBranchDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmBranch(@) element.
 *
 * This is a complex type.
 */
public class FmBranchDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmBranchDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmBranchDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMBRANCH$0 = 
        new javax.xml.namespace.QName("", "fmBranch");
    
    
    /**
     * Gets the "fmBranch" element
     */
    public com.scb.sci.customer.fm.FmBranchDocument.FmBranch getFmBranch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmBranchDocument.FmBranch target = null;
            target = (com.scb.sci.customer.fm.FmBranchDocument.FmBranch)get_store().find_element_user(FMBRANCH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmBranch" element
     */
    public void setFmBranch(com.scb.sci.customer.fm.FmBranchDocument.FmBranch fmBranch)
    {
        generatedSetterHelperImpl(fmBranch, FMBRANCH$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmBranch" element
     */
    public com.scb.sci.customer.fm.FmBranchDocument.FmBranch addNewFmBranch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmBranchDocument.FmBranch target = null;
            target = (com.scb.sci.customer.fm.FmBranchDocument.FmBranch)get_store().add_element_user(FMBRANCH$0);
            return target;
        }
    }
    /**
     * An XML fmBranch(@).
     *
     * This is a complex type.
     */
    public static class FmBranchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmBranchDocument.FmBranch
    {
        private static final long serialVersionUID = 1L;
        
        public FmBranchImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName FMID$4 = 
            new javax.xml.namespace.QName("", "fmId");
        private static final javax.xml.namespace.QName FMBRANCHSYSGENID$6 = 
            new javax.xml.namespace.QName("", "fmBranchSysGenId");
        private static final javax.xml.namespace.QName SCBFMID$8 = 
            new javax.xml.namespace.QName("", "scbFmId");
        private static final javax.xml.namespace.QName CUSTSTATUSRSNCODE$10 = 
            new javax.xml.namespace.QName("", "custStatusRsnCode");
        private static final javax.xml.namespace.QName CUSTSTATUSCHNGDATE$12 = 
            new javax.xml.namespace.QName("", "custStatusChngDate");
        private static final javax.xml.namespace.QName PHONECONFIRM$14 = 
            new javax.xml.namespace.QName("", "phoneConfirm");
        private static final javax.xml.namespace.QName PHONENUMBER$16 = 
            new javax.xml.namespace.QName("", "phoneNumber");
        private static final javax.xml.namespace.QName FAXNUMBER$18 = 
            new javax.xml.namespace.QName("", "faxNumber");
        private static final javax.xml.namespace.QName NETSETTLE$20 = 
            new javax.xml.namespace.QName("", "netSettle");
        private static final javax.xml.namespace.QName NOVATION$22 = 
            new javax.xml.namespace.QName("", "novation");
        private static final javax.xml.namespace.QName CUSTSTATUS$24 = 
            new javax.xml.namespace.QName("", "custStatus");
        private static final javax.xml.namespace.QName MANUALSETTLE$26 = 
            new javax.xml.namespace.QName("", "manualSettle");
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
        private static final javax.xml.namespace.QName EXTRNLSYSTMCODE$44 = 
            new javax.xml.namespace.QName("", "extrnlSystmCode");
        private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$46 = 
            new javax.xml.namespace.QName("", "updateStatusIndicator");
        private static final javax.xml.namespace.QName CHANGEINDICATOR$48 = 
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
         * Gets the "fmBranchSysGenId" element
         */
        public java.lang.String getFmBranchSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMBRANCHSYSGENID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmBranchSysGenId" element
         */
        public org.apache.xmlbeans.XmlString xgetFmBranchSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMBRANCHSYSGENID$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmBranchSysGenId" element
         */
        public void setFmBranchSysGenId(java.lang.String fmBranchSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMBRANCHSYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMBRANCHSYSGENID$6);
                }
                target.setStringValue(fmBranchSysGenId);
            }
        }
        
        /**
         * Sets (as xml) the "fmBranchSysGenId" element
         */
        public void xsetFmBranchSysGenId(org.apache.xmlbeans.XmlString fmBranchSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMBRANCHSYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMBRANCHSYSGENID$6);
                }
                target.set(fmBranchSysGenId);
            }
        }
        
        /**
         * Gets the "scbFmId" element
         */
        public java.lang.String getScbFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBFMID$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "scbFmId" element
         */
        public org.apache.xmlbeans.XmlString xgetScbFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBFMID$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "scbFmId" element
         */
        public void setScbFmId(java.lang.String scbFmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBFMID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBFMID$8);
                }
                target.setStringValue(scbFmId);
            }
        }
        
        /**
         * Sets (as xml) the "scbFmId" element
         */
        public void xsetScbFmId(org.apache.xmlbeans.XmlString scbFmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBFMID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBFMID$8);
                }
                target.set(scbFmId);
            }
        }
        
        /**
         * Gets the "custStatusRsnCode" element
         */
        public java.lang.String getCustStatusRsnCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATUSRSNCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "custStatusRsnCode" element
         */
        public org.apache.xmlbeans.XmlString xgetCustStatusRsnCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATUSRSNCODE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "custStatusRsnCode" element
         */
        public void setCustStatusRsnCode(java.lang.String custStatusRsnCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATUSRSNCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTSTATUSRSNCODE$10);
                }
                target.setStringValue(custStatusRsnCode);
            }
        }
        
        /**
         * Sets (as xml) the "custStatusRsnCode" element
         */
        public void xsetCustStatusRsnCode(org.apache.xmlbeans.XmlString custStatusRsnCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATUSRSNCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTSTATUSRSNCODE$10);
                }
                target.set(custStatusRsnCode);
            }
        }
        
        /**
         * Gets the "custStatusChngDate" element
         */
        public java.lang.String getCustStatusChngDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATUSCHNGDATE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "custStatusChngDate" element
         */
        public org.apache.xmlbeans.XmlString xgetCustStatusChngDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATUSCHNGDATE$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "custStatusChngDate" element
         */
        public void setCustStatusChngDate(java.lang.String custStatusChngDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATUSCHNGDATE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTSTATUSCHNGDATE$12);
                }
                target.setStringValue(custStatusChngDate);
            }
        }
        
        /**
         * Sets (as xml) the "custStatusChngDate" element
         */
        public void xsetCustStatusChngDate(org.apache.xmlbeans.XmlString custStatusChngDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATUSCHNGDATE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTSTATUSCHNGDATE$12);
                }
                target.set(custStatusChngDate);
            }
        }
        
        /**
         * Gets the "phoneConfirm" element
         */
        public java.lang.String getPhoneConfirm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONECONFIRM$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "phoneConfirm" element
         */
        public org.apache.xmlbeans.XmlString xgetPhoneConfirm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONECONFIRM$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "phoneConfirm" element
         */
        public void setPhoneConfirm(java.lang.String phoneConfirm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONECONFIRM$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONECONFIRM$14);
                }
                target.setStringValue(phoneConfirm);
            }
        }
        
        /**
         * Sets (as xml) the "phoneConfirm" element
         */
        public void xsetPhoneConfirm(org.apache.xmlbeans.XmlString phoneConfirm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONECONFIRM$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONECONFIRM$14);
                }
                target.set(phoneConfirm);
            }
        }
        
        /**
         * Gets the "phoneNumber" element
         */
        public java.lang.String getPhoneNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONENUMBER$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "phoneNumber" element
         */
        public org.apache.xmlbeans.XmlString xgetPhoneNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENUMBER$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "phoneNumber" element
         */
        public void setPhoneNumber(java.lang.String phoneNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONENUMBER$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONENUMBER$16);
                }
                target.setStringValue(phoneNumber);
            }
        }
        
        /**
         * Sets (as xml) the "phoneNumber" element
         */
        public void xsetPhoneNumber(org.apache.xmlbeans.XmlString phoneNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENUMBER$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONENUMBER$16);
                }
                target.set(phoneNumber);
            }
        }
        
        /**
         * Gets the "faxNumber" element
         */
        public java.lang.String getFaxNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAXNUMBER$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "faxNumber" element
         */
        public org.apache.xmlbeans.XmlString xgetFaxNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAXNUMBER$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "faxNumber" element
         */
        public void setFaxNumber(java.lang.String faxNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAXNUMBER$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAXNUMBER$18);
                }
                target.setStringValue(faxNumber);
            }
        }
        
        /**
         * Sets (as xml) the "faxNumber" element
         */
        public void xsetFaxNumber(org.apache.xmlbeans.XmlString faxNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAXNUMBER$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAXNUMBER$18);
                }
                target.set(faxNumber);
            }
        }
        
        /**
         * Gets the "netSettle" element
         */
        public com.scb.sci.customer.fm.NetSettleDocument.NetSettle getNetSettle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.NetSettleDocument.NetSettle target = null;
                target = (com.scb.sci.customer.fm.NetSettleDocument.NetSettle)get_store().find_element_user(NETSETTLE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "netSettle" element
         */
        public void setNetSettle(com.scb.sci.customer.fm.NetSettleDocument.NetSettle netSettle)
        {
            generatedSetterHelperImpl(netSettle, NETSETTLE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "netSettle" element
         */
        public com.scb.sci.customer.fm.NetSettleDocument.NetSettle addNewNetSettle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.NetSettleDocument.NetSettle target = null;
                target = (com.scb.sci.customer.fm.NetSettleDocument.NetSettle)get_store().add_element_user(NETSETTLE$20);
                return target;
            }
        }
        
        /**
         * Gets the "novation" element
         */
        public com.scb.sci.customer.fm.NovationDocument.Novation getNovation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.NovationDocument.Novation target = null;
                target = (com.scb.sci.customer.fm.NovationDocument.Novation)get_store().find_element_user(NOVATION$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "novation" element
         */
        public void setNovation(com.scb.sci.customer.fm.NovationDocument.Novation novation)
        {
            generatedSetterHelperImpl(novation, NOVATION$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "novation" element
         */
        public com.scb.sci.customer.fm.NovationDocument.Novation addNewNovation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.NovationDocument.Novation target = null;
                target = (com.scb.sci.customer.fm.NovationDocument.Novation)get_store().add_element_user(NOVATION$22);
                return target;
            }
        }
        
        /**
         * Gets the "custStatus" element
         */
        public com.scb.sci.customer.fm.CustStatusDocument.CustStatus getCustStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CustStatusDocument.CustStatus target = null;
                target = (com.scb.sci.customer.fm.CustStatusDocument.CustStatus)get_store().find_element_user(CUSTSTATUS$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "custStatus" element
         */
        public void setCustStatus(com.scb.sci.customer.fm.CustStatusDocument.CustStatus custStatus)
        {
            generatedSetterHelperImpl(custStatus, CUSTSTATUS$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "custStatus" element
         */
        public com.scb.sci.customer.fm.CustStatusDocument.CustStatus addNewCustStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CustStatusDocument.CustStatus target = null;
                target = (com.scb.sci.customer.fm.CustStatusDocument.CustStatus)get_store().add_element_user(CUSTSTATUS$24);
                return target;
            }
        }
        
        /**
         * Gets the "manualSettle" element
         */
        public java.lang.String getManualSettle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALSETTLE$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "manualSettle" element
         */
        public org.apache.xmlbeans.XmlString xgetManualSettle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUALSETTLE$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "manualSettle" element
         */
        public void setManualSettle(java.lang.String manualSettle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALSETTLE$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANUALSETTLE$26);
                }
                target.setStringValue(manualSettle);
            }
        }
        
        /**
         * Sets (as xml) the "manualSettle" element
         */
        public void xsetManualSettle(org.apache.xmlbeans.XmlString manualSettle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUALSETTLE$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANUALSETTLE$26);
                }
                target.set(manualSettle);
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
         * Gets the "extrnlSystmCode" element
         */
        public com.scb.sci.customer.fm.ExtrnlSystmCodeDocument.ExtrnlSystmCode getExtrnlSystmCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ExtrnlSystmCodeDocument.ExtrnlSystmCode target = null;
                target = (com.scb.sci.customer.fm.ExtrnlSystmCodeDocument.ExtrnlSystmCode)get_store().find_element_user(EXTRNLSYSTMCODE$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "extrnlSystmCode" element
         */
        public void setExtrnlSystmCode(com.scb.sci.customer.fm.ExtrnlSystmCodeDocument.ExtrnlSystmCode extrnlSystmCode)
        {
            generatedSetterHelperImpl(extrnlSystmCode, EXTRNLSYSTMCODE$44, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "extrnlSystmCode" element
         */
        public com.scb.sci.customer.fm.ExtrnlSystmCodeDocument.ExtrnlSystmCode addNewExtrnlSystmCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ExtrnlSystmCodeDocument.ExtrnlSystmCode target = null;
                target = (com.scb.sci.customer.fm.ExtrnlSystmCodeDocument.ExtrnlSystmCode)get_store().add_element_user(EXTRNLSYSTMCODE$44);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$46, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$46, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$46);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$46);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$48, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$48, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$48);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$48);
                }
                target.set(changeIndicator);
            }
        }
    }
}
