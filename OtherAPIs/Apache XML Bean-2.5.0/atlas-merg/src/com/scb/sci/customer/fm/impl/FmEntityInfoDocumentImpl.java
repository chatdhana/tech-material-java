/*
 * An XML document type.
 * Localname: fmEntityInfo
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmEntityInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmEntityInfo(@) element.
 *
 * This is a complex type.
 */
public class FmEntityInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmEntityInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmEntityInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMENTITYINFO$0 = 
        new javax.xml.namespace.QName("", "fmEntityInfo");
    
    
    /**
     * Gets the "fmEntityInfo" element
     */
    public com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo getFmEntityInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo target = null;
            target = (com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo)get_store().find_element_user(FMENTITYINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmEntityInfo" element
     */
    public void setFmEntityInfo(com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo fmEntityInfo)
    {
        generatedSetterHelperImpl(fmEntityInfo, FMENTITYINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmEntityInfo" element
     */
    public com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo addNewFmEntityInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo target = null;
            target = (com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo)get_store().add_element_user(FMENTITYINFO$0);
            return target;
        }
    }
    /**
     * An XML fmEntityInfo(@).
     *
     * This is a complex type.
     */
    public static class FmEntityInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo
    {
        private static final long serialVersionUID = 1L;
        
        public FmEntityInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName FMID$4 = 
            new javax.xml.namespace.QName("", "fmId");
        private static final javax.xml.namespace.QName FMLESYSGENID$6 = 
            new javax.xml.namespace.QName("", "fmLeSysGenId");
        private static final javax.xml.namespace.QName FMLONGNAME$8 = 
            new javax.xml.namespace.QName("", "fmLongName");
        private static final javax.xml.namespace.QName FMLONGNAME1$10 = 
            new javax.xml.namespace.QName("", "fmLongName1");
        private static final javax.xml.namespace.QName ULTPARENTFMID$12 = 
            new javax.xml.namespace.QName("", "ultParentFmId");
        private static final javax.xml.namespace.QName LIMITTYPE$14 = 
            new javax.xml.namespace.QName("", "limitType");
        private static final javax.xml.namespace.QName DVPCUSTIND$16 = 
            new javax.xml.namespace.QName("", "dvpCustInd");
        private static final javax.xml.namespace.QName SCBFMENTITYIND$18 = 
            new javax.xml.namespace.QName("", "scbFmEntityInd");
        private static final javax.xml.namespace.QName CDDID$20 = 
            new javax.xml.namespace.QName("", "cddId");
        private static final javax.xml.namespace.QName IMLACERTIFICATION$22 = 
            new javax.xml.namespace.QName("", "imlaCertification");
        private static final javax.xml.namespace.QName OMGALERTACCOUNT$24 = 
            new javax.xml.namespace.QName("", "omgAlertAccount");
        private static final javax.xml.namespace.QName OMGOGDACCOUNT$26 = 
            new javax.xml.namespace.QName("", "omgOgdAccount");
        private static final javax.xml.namespace.QName OMGCTMACCOUNT$28 = 
            new javax.xml.namespace.QName("", "omgCtmAccount");
        private static final javax.xml.namespace.QName MARKITWIREID$30 = 
            new javax.xml.namespace.QName("", "markitWireId");
        private static final javax.xml.namespace.QName ICELINKID$32 = 
            new javax.xml.namespace.QName("", "iceLinkId");
        private static final javax.xml.namespace.QName BTSID$34 = 
            new javax.xml.namespace.QName("", "btsId");
        private static final javax.xml.namespace.QName RMFFLAG$36 = 
            new javax.xml.namespace.QName("", "rmfFlag");
        private static final javax.xml.namespace.QName EUROCOMPIND$38 = 
            new javax.xml.namespace.QName("", "euroCompInd");
        private static final javax.xml.namespace.QName BISWEIGHTING$40 = 
            new javax.xml.namespace.QName("", "bisWeighting");
        private static final javax.xml.namespace.QName LANGUAGECODE$42 = 
            new javax.xml.namespace.QName("", "languageCode");
        private static final javax.xml.namespace.QName CCILCPID$44 = 
            new javax.xml.namespace.QName("", "ccilCpId");
        private static final javax.xml.namespace.QName TOPBANKIND$46 = 
            new javax.xml.namespace.QName("", "topBankInd");
        private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$48 = 
            new javax.xml.namespace.QName("", "updateStatusIndicator");
        private static final javax.xml.namespace.QName CHANGEINDICATOR$50 = 
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
         * Gets the "fmLeSysGenId" element
         */
        public java.lang.String getFmLeSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMLESYSGENID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmLeSysGenId" element
         */
        public org.apache.xmlbeans.XmlString xgetFmLeSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMLESYSGENID$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmLeSysGenId" element
         */
        public void setFmLeSysGenId(java.lang.String fmLeSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMLESYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMLESYSGENID$6);
                }
                target.setStringValue(fmLeSysGenId);
            }
        }
        
        /**
         * Sets (as xml) the "fmLeSysGenId" element
         */
        public void xsetFmLeSysGenId(org.apache.xmlbeans.XmlString fmLeSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMLESYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMLESYSGENID$6);
                }
                target.set(fmLeSysGenId);
            }
        }
        
        /**
         * Gets the "fmLongName" element
         */
        public java.lang.String getFmLongName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMLONGNAME$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmLongName" element
         */
        public org.apache.xmlbeans.XmlString xgetFmLongName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMLONGNAME$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmLongName" element
         */
        public void setFmLongName(java.lang.String fmLongName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMLONGNAME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMLONGNAME$8);
                }
                target.setStringValue(fmLongName);
            }
        }
        
        /**
         * Sets (as xml) the "fmLongName" element
         */
        public void xsetFmLongName(org.apache.xmlbeans.XmlString fmLongName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMLONGNAME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMLONGNAME$8);
                }
                target.set(fmLongName);
            }
        }
        
        /**
         * Gets the "fmLongName1" element
         */
        public java.lang.String getFmLongName1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMLONGNAME1$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmLongName1" element
         */
        public org.apache.xmlbeans.XmlString xgetFmLongName1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMLONGNAME1$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmLongName1" element
         */
        public void setFmLongName1(java.lang.String fmLongName1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMLONGNAME1$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMLONGNAME1$10);
                }
                target.setStringValue(fmLongName1);
            }
        }
        
        /**
         * Sets (as xml) the "fmLongName1" element
         */
        public void xsetFmLongName1(org.apache.xmlbeans.XmlString fmLongName1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMLONGNAME1$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMLONGNAME1$10);
                }
                target.set(fmLongName1);
            }
        }
        
        /**
         * Gets the "ultParentFmId" element
         */
        public java.lang.String getUltParentFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTPARENTFMID$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ultParentFmId" element
         */
        public org.apache.xmlbeans.XmlString xgetUltParentFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTPARENTFMID$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ultParentFmId" element
         */
        public void setUltParentFmId(java.lang.String ultParentFmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTPARENTFMID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULTPARENTFMID$12);
                }
                target.setStringValue(ultParentFmId);
            }
        }
        
        /**
         * Sets (as xml) the "ultParentFmId" element
         */
        public void xsetUltParentFmId(org.apache.xmlbeans.XmlString ultParentFmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTPARENTFMID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULTPARENTFMID$12);
                }
                target.set(ultParentFmId);
            }
        }
        
        /**
         * Gets the "limitType" element
         */
        public com.scb.sci.customer.fm.LimitTypeDocument.LimitType getLimitType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.LimitTypeDocument.LimitType target = null;
                target = (com.scb.sci.customer.fm.LimitTypeDocument.LimitType)get_store().find_element_user(LIMITTYPE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "limitType" element
         */
        public void setLimitType(com.scb.sci.customer.fm.LimitTypeDocument.LimitType limitType)
        {
            generatedSetterHelperImpl(limitType, LIMITTYPE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "limitType" element
         */
        public com.scb.sci.customer.fm.LimitTypeDocument.LimitType addNewLimitType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.LimitTypeDocument.LimitType target = null;
                target = (com.scb.sci.customer.fm.LimitTypeDocument.LimitType)get_store().add_element_user(LIMITTYPE$14);
                return target;
            }
        }
        
        /**
         * Gets the "dvpCustInd" element
         */
        public java.lang.String getDvpCustInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DVPCUSTIND$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dvpCustInd" element
         */
        public org.apache.xmlbeans.XmlString xgetDvpCustInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DVPCUSTIND$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dvpCustInd" element
         */
        public void setDvpCustInd(java.lang.String dvpCustInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DVPCUSTIND$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DVPCUSTIND$16);
                }
                target.setStringValue(dvpCustInd);
            }
        }
        
        /**
         * Sets (as xml) the "dvpCustInd" element
         */
        public void xsetDvpCustInd(org.apache.xmlbeans.XmlString dvpCustInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DVPCUSTIND$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DVPCUSTIND$16);
                }
                target.set(dvpCustInd);
            }
        }
        
        /**
         * Gets the "scbFmEntityInd" element
         */
        public java.lang.String getScbFmEntityInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBFMENTITYIND$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "scbFmEntityInd" element
         */
        public org.apache.xmlbeans.XmlString xgetScbFmEntityInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBFMENTITYIND$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "scbFmEntityInd" element
         */
        public void setScbFmEntityInd(java.lang.String scbFmEntityInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBFMENTITYIND$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBFMENTITYIND$18);
                }
                target.setStringValue(scbFmEntityInd);
            }
        }
        
        /**
         * Sets (as xml) the "scbFmEntityInd" element
         */
        public void xsetScbFmEntityInd(org.apache.xmlbeans.XmlString scbFmEntityInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBFMENTITYIND$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBFMENTITYIND$18);
                }
                target.set(scbFmEntityInd);
            }
        }
        
        /**
         * Gets the "cddId" element
         */
        public java.lang.String getCddId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDDID$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cddId" element
         */
        public org.apache.xmlbeans.XmlString xgetCddId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CDDID$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "cddId" element
         */
        public void setCddId(java.lang.String cddId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDDID$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDDID$20);
                }
                target.setStringValue(cddId);
            }
        }
        
        /**
         * Sets (as xml) the "cddId" element
         */
        public void xsetCddId(org.apache.xmlbeans.XmlString cddId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CDDID$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CDDID$20);
                }
                target.set(cddId);
            }
        }
        
        /**
         * Gets the "imlaCertification" element
         */
        public java.lang.String getImlaCertification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMLACERTIFICATION$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "imlaCertification" element
         */
        public org.apache.xmlbeans.XmlString xgetImlaCertification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMLACERTIFICATION$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "imlaCertification" element
         */
        public void setImlaCertification(java.lang.String imlaCertification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMLACERTIFICATION$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMLACERTIFICATION$22);
                }
                target.setStringValue(imlaCertification);
            }
        }
        
        /**
         * Sets (as xml) the "imlaCertification" element
         */
        public void xsetImlaCertification(org.apache.xmlbeans.XmlString imlaCertification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMLACERTIFICATION$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMLACERTIFICATION$22);
                }
                target.set(imlaCertification);
            }
        }
        
        /**
         * Gets the "omgAlertAccount" element
         */
        public java.lang.String getOmgAlertAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGALERTACCOUNT$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "omgAlertAccount" element
         */
        public org.apache.xmlbeans.XmlString xgetOmgAlertAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGALERTACCOUNT$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "omgAlertAccount" element
         */
        public void setOmgAlertAccount(java.lang.String omgAlertAccount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGALERTACCOUNT$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMGALERTACCOUNT$24);
                }
                target.setStringValue(omgAlertAccount);
            }
        }
        
        /**
         * Sets (as xml) the "omgAlertAccount" element
         */
        public void xsetOmgAlertAccount(org.apache.xmlbeans.XmlString omgAlertAccount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGALERTACCOUNT$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMGALERTACCOUNT$24);
                }
                target.set(omgAlertAccount);
            }
        }
        
        /**
         * Gets the "omgOgdAccount" element
         */
        public java.lang.String getOmgOgdAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGOGDACCOUNT$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "omgOgdAccount" element
         */
        public org.apache.xmlbeans.XmlString xgetOmgOgdAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGOGDACCOUNT$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "omgOgdAccount" element
         */
        public void setOmgOgdAccount(java.lang.String omgOgdAccount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGOGDACCOUNT$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMGOGDACCOUNT$26);
                }
                target.setStringValue(omgOgdAccount);
            }
        }
        
        /**
         * Sets (as xml) the "omgOgdAccount" element
         */
        public void xsetOmgOgdAccount(org.apache.xmlbeans.XmlString omgOgdAccount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGOGDACCOUNT$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMGOGDACCOUNT$26);
                }
                target.set(omgOgdAccount);
            }
        }
        
        /**
         * Gets the "omgCtmAccount" element
         */
        public java.lang.String getOmgCtmAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGCTMACCOUNT$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "omgCtmAccount" element
         */
        public org.apache.xmlbeans.XmlString xgetOmgCtmAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGCTMACCOUNT$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "omgCtmAccount" element
         */
        public void setOmgCtmAccount(java.lang.String omgCtmAccount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGCTMACCOUNT$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMGCTMACCOUNT$28);
                }
                target.setStringValue(omgCtmAccount);
            }
        }
        
        /**
         * Sets (as xml) the "omgCtmAccount" element
         */
        public void xsetOmgCtmAccount(org.apache.xmlbeans.XmlString omgCtmAccount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGCTMACCOUNT$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMGCTMACCOUNT$28);
                }
                target.set(omgCtmAccount);
            }
        }
        
        /**
         * Gets the "markitWireId" element
         */
        public java.lang.String getMarkitWireId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKITWIREID$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "markitWireId" element
         */
        public org.apache.xmlbeans.XmlString xgetMarkitWireId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MARKITWIREID$30, 0);
                return target;
            }
        }
        
        /**
         * Sets the "markitWireId" element
         */
        public void setMarkitWireId(java.lang.String markitWireId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKITWIREID$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MARKITWIREID$30);
                }
                target.setStringValue(markitWireId);
            }
        }
        
        /**
         * Sets (as xml) the "markitWireId" element
         */
        public void xsetMarkitWireId(org.apache.xmlbeans.XmlString markitWireId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MARKITWIREID$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MARKITWIREID$30);
                }
                target.set(markitWireId);
            }
        }
        
        /**
         * Gets the "iceLinkId" element
         */
        public java.lang.String getIceLinkId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICELINKID$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "iceLinkId" element
         */
        public org.apache.xmlbeans.XmlString xgetIceLinkId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICELINKID$32, 0);
                return target;
            }
        }
        
        /**
         * Sets the "iceLinkId" element
         */
        public void setIceLinkId(java.lang.String iceLinkId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICELINKID$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ICELINKID$32);
                }
                target.setStringValue(iceLinkId);
            }
        }
        
        /**
         * Sets (as xml) the "iceLinkId" element
         */
        public void xsetIceLinkId(org.apache.xmlbeans.XmlString iceLinkId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICELINKID$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ICELINKID$32);
                }
                target.set(iceLinkId);
            }
        }
        
        /**
         * Gets the "btsId" element
         */
        public java.lang.String getBtsId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BTSID$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "btsId" element
         */
        public org.apache.xmlbeans.XmlString xgetBtsId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BTSID$34, 0);
                return target;
            }
        }
        
        /**
         * Sets the "btsId" element
         */
        public void setBtsId(java.lang.String btsId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BTSID$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BTSID$34);
                }
                target.setStringValue(btsId);
            }
        }
        
        /**
         * Sets (as xml) the "btsId" element
         */
        public void xsetBtsId(org.apache.xmlbeans.XmlString btsId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BTSID$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BTSID$34);
                }
                target.set(btsId);
            }
        }
        
        /**
         * Gets the "rmfFlag" element
         */
        public java.lang.String getRmfFlag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RMFFLAG$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rmfFlag" element
         */
        public org.apache.xmlbeans.XmlString xgetRmfFlag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RMFFLAG$36, 0);
                return target;
            }
        }
        
        /**
         * Sets the "rmfFlag" element
         */
        public void setRmfFlag(java.lang.String rmfFlag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RMFFLAG$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RMFFLAG$36);
                }
                target.setStringValue(rmfFlag);
            }
        }
        
        /**
         * Sets (as xml) the "rmfFlag" element
         */
        public void xsetRmfFlag(org.apache.xmlbeans.XmlString rmfFlag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RMFFLAG$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RMFFLAG$36);
                }
                target.set(rmfFlag);
            }
        }
        
        /**
         * Gets the "euroCompInd" element
         */
        public java.lang.String getEuroCompInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EUROCOMPIND$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "euroCompInd" element
         */
        public org.apache.xmlbeans.XmlString xgetEuroCompInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EUROCOMPIND$38, 0);
                return target;
            }
        }
        
        /**
         * Sets the "euroCompInd" element
         */
        public void setEuroCompInd(java.lang.String euroCompInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EUROCOMPIND$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EUROCOMPIND$38);
                }
                target.setStringValue(euroCompInd);
            }
        }
        
        /**
         * Sets (as xml) the "euroCompInd" element
         */
        public void xsetEuroCompInd(org.apache.xmlbeans.XmlString euroCompInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EUROCOMPIND$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EUROCOMPIND$38);
                }
                target.set(euroCompInd);
            }
        }
        
        /**
         * Gets the "bisWeighting" element
         */
        public java.lang.String getBisWeighting()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BISWEIGHTING$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bisWeighting" element
         */
        public org.apache.xmlbeans.XmlString xgetBisWeighting()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BISWEIGHTING$40, 0);
                return target;
            }
        }
        
        /**
         * Sets the "bisWeighting" element
         */
        public void setBisWeighting(java.lang.String bisWeighting)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BISWEIGHTING$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BISWEIGHTING$40);
                }
                target.setStringValue(bisWeighting);
            }
        }
        
        /**
         * Sets (as xml) the "bisWeighting" element
         */
        public void xsetBisWeighting(org.apache.xmlbeans.XmlString bisWeighting)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BISWEIGHTING$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BISWEIGHTING$40);
                }
                target.set(bisWeighting);
            }
        }
        
        /**
         * Gets the "languageCode" element
         */
        public com.scb.sci.customer.fm.LanguageCodeDocument.LanguageCode getLanguageCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.LanguageCodeDocument.LanguageCode target = null;
                target = (com.scb.sci.customer.fm.LanguageCodeDocument.LanguageCode)get_store().find_element_user(LANGUAGECODE$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "languageCode" element
         */
        public void setLanguageCode(com.scb.sci.customer.fm.LanguageCodeDocument.LanguageCode languageCode)
        {
            generatedSetterHelperImpl(languageCode, LANGUAGECODE$42, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "languageCode" element
         */
        public com.scb.sci.customer.fm.LanguageCodeDocument.LanguageCode addNewLanguageCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.LanguageCodeDocument.LanguageCode target = null;
                target = (com.scb.sci.customer.fm.LanguageCodeDocument.LanguageCode)get_store().add_element_user(LANGUAGECODE$42);
                return target;
            }
        }
        
        /**
         * Gets the "ccilCpId" element
         */
        public java.lang.String getCcilCpId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CCILCPID$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ccilCpId" element
         */
        public org.apache.xmlbeans.XmlString xgetCcilCpId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CCILCPID$44, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ccilCpId" element
         */
        public void setCcilCpId(java.lang.String ccilCpId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CCILCPID$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CCILCPID$44);
                }
                target.setStringValue(ccilCpId);
            }
        }
        
        /**
         * Sets (as xml) the "ccilCpId" element
         */
        public void xsetCcilCpId(org.apache.xmlbeans.XmlString ccilCpId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CCILCPID$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CCILCPID$44);
                }
                target.set(ccilCpId);
            }
        }
        
        /**
         * Gets the "topBankInd" element
         */
        public java.lang.String getTopBankInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPBANKIND$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "topBankInd" element
         */
        public org.apache.xmlbeans.XmlString xgetTopBankInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOPBANKIND$46, 0);
                return target;
            }
        }
        
        /**
         * Sets the "topBankInd" element
         */
        public void setTopBankInd(java.lang.String topBankInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPBANKIND$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOPBANKIND$46);
                }
                target.setStringValue(topBankInd);
            }
        }
        
        /**
         * Sets (as xml) the "topBankInd" element
         */
        public void xsetTopBankInd(org.apache.xmlbeans.XmlString topBankInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOPBANKIND$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOPBANKIND$46);
                }
                target.set(topBankInd);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$48, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$48, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$48);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$48);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$50, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$50, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$50);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$50);
                }
                target.set(changeIndicator);
            }
        }
    }
}
