/*
 * An XML document type.
 * Localname: fmScbInfo
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmScbInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmScbInfo(@) element.
 *
 * This is a complex type.
 */
public class FmScbInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmScbInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmScbInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMSCBINFO$0 = 
        new javax.xml.namespace.QName("", "fmScbInfo");
    
    
    /**
     * Gets the "fmScbInfo" element
     */
    public com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo getFmScbInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo target = null;
            target = (com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo)get_store().find_element_user(FMSCBINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmScbInfo" element
     */
    public void setFmScbInfo(com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo fmScbInfo)
    {
        generatedSetterHelperImpl(fmScbInfo, FMSCBINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmScbInfo" element
     */
    public com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo addNewFmScbInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo target = null;
            target = (com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo)get_store().add_element_user(FMSCBINFO$0);
            return target;
        }
    }
    /**
     * An XML fmScbInfo(@).
     *
     * This is a complex type.
     */
    public static class FmScbInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo
    {
        private static final long serialVersionUID = 1L;
        
        public FmScbInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName FMID$4 = 
            new javax.xml.namespace.QName("", "fmId");
        private static final javax.xml.namespace.QName FMSCBDTLSYSGENID$6 = 
            new javax.xml.namespace.QName("", "fmScbDtlSysGenId");
        private static final javax.xml.namespace.QName PROFITCURRENCY$8 = 
            new javax.xml.namespace.QName("", "profitCurrency");
        private static final javax.xml.namespace.QName IMMSBRANCHCODE$10 = 
            new javax.xml.namespace.QName("", "immsBranchCode");
        private static final javax.xml.namespace.QName LOCATION$12 = 
            new javax.xml.namespace.QName("", "location");
        private static final javax.xml.namespace.QName NETTINGALLOWEDIND$14 = 
            new javax.xml.namespace.QName("", "nettingAllowedInd");
        private static final javax.xml.namespace.QName BASECURRENCY$16 = 
            new javax.xml.namespace.QName("", "baseCurrency");
        private static final javax.xml.namespace.QName LATETRADINGSTARTTIME$18 = 
            new javax.xml.namespace.QName("", "lateTradingStartTime");
        private static final javax.xml.namespace.QName DEALSTARTLOCALTIME$20 = 
            new javax.xml.namespace.QName("", "dealStartLocalTime");
        private static final javax.xml.namespace.QName DEALENDLOCALTIME$22 = 
            new javax.xml.namespace.QName("", "dealEndLocalTime");
        private static final javax.xml.namespace.QName REGULATORYBODY$24 = 
            new javax.xml.namespace.QName("", "regulatoryBody");
        private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$26 = 
            new javax.xml.namespace.QName("", "updateStatusIndicator");
        private static final javax.xml.namespace.QName CHANGEINDICATOR$28 = 
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
         * Gets the "fmScbDtlSysGenId" element
         */
        public java.lang.String getFmScbDtlSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMSCBDTLSYSGENID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmScbDtlSysGenId" element
         */
        public org.apache.xmlbeans.XmlString xgetFmScbDtlSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMSCBDTLSYSGENID$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmScbDtlSysGenId" element
         */
        public void setFmScbDtlSysGenId(java.lang.String fmScbDtlSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMSCBDTLSYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMSCBDTLSYSGENID$6);
                }
                target.setStringValue(fmScbDtlSysGenId);
            }
        }
        
        /**
         * Sets (as xml) the "fmScbDtlSysGenId" element
         */
        public void xsetFmScbDtlSysGenId(org.apache.xmlbeans.XmlString fmScbDtlSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMSCBDTLSYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMSCBDTLSYSGENID$6);
                }
                target.set(fmScbDtlSysGenId);
            }
        }
        
        /**
         * Gets the "profitCurrency" element
         */
        public java.lang.String getProfitCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFITCURRENCY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "profitCurrency" element
         */
        public org.apache.xmlbeans.XmlString xgetProfitCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROFITCURRENCY$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "profitCurrency" element
         */
        public void setProfitCurrency(java.lang.String profitCurrency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFITCURRENCY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROFITCURRENCY$8);
                }
                target.setStringValue(profitCurrency);
            }
        }
        
        /**
         * Sets (as xml) the "profitCurrency" element
         */
        public void xsetProfitCurrency(org.apache.xmlbeans.XmlString profitCurrency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROFITCURRENCY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROFITCURRENCY$8);
                }
                target.set(profitCurrency);
            }
        }
        
        /**
         * Gets the "immsBranchCode" element
         */
        public java.lang.String getImmsBranchCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMMSBRANCHCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "immsBranchCode" element
         */
        public org.apache.xmlbeans.XmlString xgetImmsBranchCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMMSBRANCHCODE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "immsBranchCode" element
         */
        public void setImmsBranchCode(java.lang.String immsBranchCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMMSBRANCHCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMMSBRANCHCODE$10);
                }
                target.setStringValue(immsBranchCode);
            }
        }
        
        /**
         * Sets (as xml) the "immsBranchCode" element
         */
        public void xsetImmsBranchCode(org.apache.xmlbeans.XmlString immsBranchCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMMSBRANCHCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMMSBRANCHCODE$10);
                }
                target.set(immsBranchCode);
            }
        }
        
        /**
         * Gets the "location" element
         */
        public java.lang.String getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "location" element
         */
        public org.apache.xmlbeans.XmlString xgetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "location" element
         */
        public void setLocation(java.lang.String location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATION$12);
                }
                target.setStringValue(location);
            }
        }
        
        /**
         * Sets (as xml) the "location" element
         */
        public void xsetLocation(org.apache.xmlbeans.XmlString location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATION$12);
                }
                target.set(location);
            }
        }
        
        /**
         * Gets the "nettingAllowedInd" element
         */
        public java.lang.String getNettingAllowedInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETTINGALLOWEDIND$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "nettingAllowedInd" element
         */
        public org.apache.xmlbeans.XmlString xgetNettingAllowedInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NETTINGALLOWEDIND$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nettingAllowedInd" element
         */
        public void setNettingAllowedInd(java.lang.String nettingAllowedInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETTINGALLOWEDIND$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NETTINGALLOWEDIND$14);
                }
                target.setStringValue(nettingAllowedInd);
            }
        }
        
        /**
         * Sets (as xml) the "nettingAllowedInd" element
         */
        public void xsetNettingAllowedInd(org.apache.xmlbeans.XmlString nettingAllowedInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NETTINGALLOWEDIND$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NETTINGALLOWEDIND$14);
                }
                target.set(nettingAllowedInd);
            }
        }
        
        /**
         * Gets the "baseCurrency" element
         */
        public java.lang.String getBaseCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASECURRENCY$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "baseCurrency" element
         */
        public org.apache.xmlbeans.XmlString xgetBaseCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASECURRENCY$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "baseCurrency" element
         */
        public void setBaseCurrency(java.lang.String baseCurrency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASECURRENCY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASECURRENCY$16);
                }
                target.setStringValue(baseCurrency);
            }
        }
        
        /**
         * Sets (as xml) the "baseCurrency" element
         */
        public void xsetBaseCurrency(org.apache.xmlbeans.XmlString baseCurrency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASECURRENCY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BASECURRENCY$16);
                }
                target.set(baseCurrency);
            }
        }
        
        /**
         * Gets the "lateTradingStartTime" element
         */
        public java.lang.String getLateTradingStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATETRADINGSTARTTIME$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lateTradingStartTime" element
         */
        public org.apache.xmlbeans.XmlString xgetLateTradingStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATETRADINGSTARTTIME$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "lateTradingStartTime" element
         */
        public void setLateTradingStartTime(java.lang.String lateTradingStartTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATETRADINGSTARTTIME$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATETRADINGSTARTTIME$18);
                }
                target.setStringValue(lateTradingStartTime);
            }
        }
        
        /**
         * Sets (as xml) the "lateTradingStartTime" element
         */
        public void xsetLateTradingStartTime(org.apache.xmlbeans.XmlString lateTradingStartTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATETRADINGSTARTTIME$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LATETRADINGSTARTTIME$18);
                }
                target.set(lateTradingStartTime);
            }
        }
        
        /**
         * Gets the "dealStartLocalTime" element
         */
        public java.lang.String getDealStartLocalTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEALSTARTLOCALTIME$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dealStartLocalTime" element
         */
        public org.apache.xmlbeans.XmlString xgetDealStartLocalTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEALSTARTLOCALTIME$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dealStartLocalTime" element
         */
        public void setDealStartLocalTime(java.lang.String dealStartLocalTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEALSTARTLOCALTIME$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEALSTARTLOCALTIME$20);
                }
                target.setStringValue(dealStartLocalTime);
            }
        }
        
        /**
         * Sets (as xml) the "dealStartLocalTime" element
         */
        public void xsetDealStartLocalTime(org.apache.xmlbeans.XmlString dealStartLocalTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEALSTARTLOCALTIME$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEALSTARTLOCALTIME$20);
                }
                target.set(dealStartLocalTime);
            }
        }
        
        /**
         * Gets the "dealEndLocalTime" element
         */
        public java.lang.String getDealEndLocalTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEALENDLOCALTIME$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dealEndLocalTime" element
         */
        public org.apache.xmlbeans.XmlString xgetDealEndLocalTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEALENDLOCALTIME$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dealEndLocalTime" element
         */
        public void setDealEndLocalTime(java.lang.String dealEndLocalTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEALENDLOCALTIME$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEALENDLOCALTIME$22);
                }
                target.setStringValue(dealEndLocalTime);
            }
        }
        
        /**
         * Sets (as xml) the "dealEndLocalTime" element
         */
        public void xsetDealEndLocalTime(org.apache.xmlbeans.XmlString dealEndLocalTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEALENDLOCALTIME$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEALENDLOCALTIME$22);
                }
                target.set(dealEndLocalTime);
            }
        }
        
        /**
         * Gets the "regulatoryBody" element
         */
        public com.scb.sci.customer.fm.RegulatoryBodyDocument.RegulatoryBody getRegulatoryBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.RegulatoryBodyDocument.RegulatoryBody target = null;
                target = (com.scb.sci.customer.fm.RegulatoryBodyDocument.RegulatoryBody)get_store().find_element_user(REGULATORYBODY$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "regulatoryBody" element
         */
        public void setRegulatoryBody(com.scb.sci.customer.fm.RegulatoryBodyDocument.RegulatoryBody regulatoryBody)
        {
            generatedSetterHelperImpl(regulatoryBody, REGULATORYBODY$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "regulatoryBody" element
         */
        public com.scb.sci.customer.fm.RegulatoryBodyDocument.RegulatoryBody addNewRegulatoryBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.RegulatoryBodyDocument.RegulatoryBody target = null;
                target = (com.scb.sci.customer.fm.RegulatoryBodyDocument.RegulatoryBody)get_store().add_element_user(REGULATORYBODY$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$26, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$26, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$26);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$28, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$28, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$28);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$28);
                }
                target.set(changeIndicator);
            }
        }
    }
}
