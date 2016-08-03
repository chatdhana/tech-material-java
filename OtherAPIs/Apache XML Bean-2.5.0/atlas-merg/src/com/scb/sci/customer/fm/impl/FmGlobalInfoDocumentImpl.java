/*
 * An XML document type.
 * Localname: fmGlobalInfo
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmGlobalInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmGlobalInfo(@) element.
 *
 * This is a complex type.
 */
public class FmGlobalInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmGlobalInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmGlobalInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMGLOBALINFO$0 = 
        new javax.xml.namespace.QName("", "fmGlobalInfo");
    
    
    /**
     * Gets the "fmGlobalInfo" element
     */
    public com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo getFmGlobalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo target = null;
            target = (com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo)get_store().find_element_user(FMGLOBALINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmGlobalInfo" element
     */
    public void setFmGlobalInfo(com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo fmGlobalInfo)
    {
        generatedSetterHelperImpl(fmGlobalInfo, FMGLOBALINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmGlobalInfo" element
     */
    public com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo addNewFmGlobalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo target = null;
            target = (com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo)get_store().add_element_user(FMGLOBALINFO$0);
            return target;
        }
    }
    /**
     * An XML fmGlobalInfo(@).
     *
     * This is a complex type.
     */
    public static class FmGlobalInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo
    {
        private static final long serialVersionUID = 1L;
        
        public FmGlobalInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName FMGLBLINFSYSGENID$4 = 
            new javax.xml.namespace.QName("", "fmGlblInfSysGenId");
        private static final javax.xml.namespace.QName MIFIDCLNTCLASS$6 = 
            new javax.xml.namespace.QName("", "mifidClntClass");
        private static final javax.xml.namespace.QName ULTRISKCNTRY$8 = 
            new javax.xml.namespace.QName("", "ultRiskCntry");
        private static final javax.xml.namespace.QName SCBAFFLTCODE$10 = 
            new javax.xml.namespace.QName("", "scbAffltCode");
        private static final javax.xml.namespace.QName OMGALERTACRONYM$12 = 
            new javax.xml.namespace.QName("", "omgAlertAcronym");
        private static final javax.xml.namespace.QName OMGOGDACRONYM$14 = 
            new javax.xml.namespace.QName("", "omgOgdAcronym");
        private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$16 = 
            new javax.xml.namespace.QName("", "updateStatusIndicator");
        private static final javax.xml.namespace.QName CHANGEINDICATOR$18 = 
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
         * Gets the "fmGlblInfSysGenId" element
         */
        public java.lang.String getFmGlblInfSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMGLBLINFSYSGENID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmGlblInfSysGenId" element
         */
        public org.apache.xmlbeans.XmlString xgetFmGlblInfSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMGLBLINFSYSGENID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmGlblInfSysGenId" element
         */
        public void setFmGlblInfSysGenId(java.lang.String fmGlblInfSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMGLBLINFSYSGENID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMGLBLINFSYSGENID$4);
                }
                target.setStringValue(fmGlblInfSysGenId);
            }
        }
        
        /**
         * Sets (as xml) the "fmGlblInfSysGenId" element
         */
        public void xsetFmGlblInfSysGenId(org.apache.xmlbeans.XmlString fmGlblInfSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMGLBLINFSYSGENID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMGLBLINFSYSGENID$4);
                }
                target.set(fmGlblInfSysGenId);
            }
        }
        
        /**
         * Gets the "mifidClntClass" element
         */
        public com.scb.sci.customer.fm.MifidClntClassDocument.MifidClntClass getMifidClntClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.MifidClntClassDocument.MifidClntClass target = null;
                target = (com.scb.sci.customer.fm.MifidClntClassDocument.MifidClntClass)get_store().find_element_user(MIFIDCLNTCLASS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "mifidClntClass" element
         */
        public void setMifidClntClass(com.scb.sci.customer.fm.MifidClntClassDocument.MifidClntClass mifidClntClass)
        {
            generatedSetterHelperImpl(mifidClntClass, MIFIDCLNTCLASS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "mifidClntClass" element
         */
        public com.scb.sci.customer.fm.MifidClntClassDocument.MifidClntClass addNewMifidClntClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.MifidClntClassDocument.MifidClntClass target = null;
                target = (com.scb.sci.customer.fm.MifidClntClassDocument.MifidClntClass)get_store().add_element_user(MIFIDCLNTCLASS$6);
                return target;
            }
        }
        
        /**
         * Gets the "ultRiskCntry" element
         */
        public java.lang.String getUltRiskCntry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTRISKCNTRY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ultRiskCntry" element
         */
        public org.apache.xmlbeans.XmlString xgetUltRiskCntry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTRISKCNTRY$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ultRiskCntry" element
         */
        public void setUltRiskCntry(java.lang.String ultRiskCntry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTRISKCNTRY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULTRISKCNTRY$8);
                }
                target.setStringValue(ultRiskCntry);
            }
        }
        
        /**
         * Sets (as xml) the "ultRiskCntry" element
         */
        public void xsetUltRiskCntry(org.apache.xmlbeans.XmlString ultRiskCntry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTRISKCNTRY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULTRISKCNTRY$8);
                }
                target.set(ultRiskCntry);
            }
        }
        
        /**
         * Gets the "scbAffltCode" element
         */
        public com.scb.sci.customer.fm.ScbAffltCodeDocument.ScbAffltCode getScbAffltCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ScbAffltCodeDocument.ScbAffltCode target = null;
                target = (com.scb.sci.customer.fm.ScbAffltCodeDocument.ScbAffltCode)get_store().find_element_user(SCBAFFLTCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "scbAffltCode" element
         */
        public void setScbAffltCode(com.scb.sci.customer.fm.ScbAffltCodeDocument.ScbAffltCode scbAffltCode)
        {
            generatedSetterHelperImpl(scbAffltCode, SCBAFFLTCODE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "scbAffltCode" element
         */
        public com.scb.sci.customer.fm.ScbAffltCodeDocument.ScbAffltCode addNewScbAffltCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ScbAffltCodeDocument.ScbAffltCode target = null;
                target = (com.scb.sci.customer.fm.ScbAffltCodeDocument.ScbAffltCode)get_store().add_element_user(SCBAFFLTCODE$10);
                return target;
            }
        }
        
        /**
         * Gets the "omgAlertAcronym" element
         */
        public java.lang.String getOmgAlertAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGALERTACRONYM$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "omgAlertAcronym" element
         */
        public org.apache.xmlbeans.XmlString xgetOmgAlertAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGALERTACRONYM$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "omgAlertAcronym" element
         */
        public void setOmgAlertAcronym(java.lang.String omgAlertAcronym)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGALERTACRONYM$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMGALERTACRONYM$12);
                }
                target.setStringValue(omgAlertAcronym);
            }
        }
        
        /**
         * Sets (as xml) the "omgAlertAcronym" element
         */
        public void xsetOmgAlertAcronym(org.apache.xmlbeans.XmlString omgAlertAcronym)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGALERTACRONYM$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMGALERTACRONYM$12);
                }
                target.set(omgAlertAcronym);
            }
        }
        
        /**
         * Gets the "omgOgdAcronym" element
         */
        public java.lang.String getOmgOgdAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGOGDACRONYM$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "omgOgdAcronym" element
         */
        public org.apache.xmlbeans.XmlString xgetOmgOgdAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGOGDACRONYM$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "omgOgdAcronym" element
         */
        public void setOmgOgdAcronym(java.lang.String omgOgdAcronym)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGOGDACRONYM$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMGOGDACRONYM$14);
                }
                target.setStringValue(omgOgdAcronym);
            }
        }
        
        /**
         * Sets (as xml) the "omgOgdAcronym" element
         */
        public void xsetOmgOgdAcronym(org.apache.xmlbeans.XmlString omgOgdAcronym)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGOGDACRONYM$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMGOGDACRONYM$14);
                }
                target.set(omgOgdAcronym);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$16, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$18, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$18, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$18);
                }
                target.set(changeIndicator);
            }
        }
    }
}
