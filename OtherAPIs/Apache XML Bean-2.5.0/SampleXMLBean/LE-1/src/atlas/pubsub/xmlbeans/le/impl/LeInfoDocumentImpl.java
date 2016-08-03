/*
 * An XML document type.
 * Localname: leInfo
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeInfoDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leInfo(@) element.
 *
 * This is a complex type.
 */
public class LeInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEINFO$0 = 
        new javax.xml.namespace.QName("", "leInfo");
    
    
    /**
     * Gets the "leInfo" element
     */
    public atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo getLeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo target = null;
            target = (atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo)get_store().find_element_user(LEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "leInfo" element
     */
    public void setLeInfo(atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo leInfo)
    {
        generatedSetterHelperImpl(leInfo, LEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "leInfo" element
     */
    public atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo addNewLeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo target = null;
            target = (atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo)get_store().add_element_user(LEINFO$0);
            return target;
        }
    }
    /**
     * An XML leInfo(@).
     *
     * This is a complex type.
     */
    public static class LeInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo
    {
        private static final long serialVersionUID = 1L;
        
        public LeInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ULTPARENTLEID$0 = 
            new javax.xml.namespace.QName("", "ultParentLeId");
        private static final javax.xml.namespace.QName PARENTLEID$2 = 
            new javax.xml.namespace.QName("", "parentLeId");
        private static final javax.xml.namespace.QName DOMICILECNTRY$4 = 
            new javax.xml.namespace.QName("", "domicileCntry");
        private static final javax.xml.namespace.QName ULTRISKCNTRY$6 = 
            new javax.xml.namespace.QName("", "ultRiskCntry");
        private static final javax.xml.namespace.QName ULTRISKCNTRYDESC$8 = 
            new javax.xml.namespace.QName("", "ultRiskCntryDesc");
        private static final javax.xml.namespace.QName ATLASCODE$10 = 
            new javax.xml.namespace.QName("", "atlasCode");
        private static final javax.xml.namespace.QName LENAME$12 = 
            new javax.xml.namespace.QName("", "leName");
        private static final javax.xml.namespace.QName LELEGALNAME$14 = 
            new javax.xml.namespace.QName("", "leLegalName");
        private static final javax.xml.namespace.QName LELEGALNAME1$16 = 
            new javax.xml.namespace.QName("", "leLegalName1");
        private static final javax.xml.namespace.QName LESTATUSCODE$18 = 
            new javax.xml.namespace.QName("", "leStatusCode");
        private static final javax.xml.namespace.QName LESTATUSCODEDESC$20 = 
            new javax.xml.namespace.QName("", "leStatusCodeDesc");
        private static final javax.xml.namespace.QName FININSTTYPE$22 = 
            new javax.xml.namespace.QName("", "finInstType");
        private static final javax.xml.namespace.QName FININSTTYPEDESC$24 = 
            new javax.xml.namespace.QName("", "finInstTypeDesc");
        private static final javax.xml.namespace.QName LECLASSCODE$26 = 
            new javax.xml.namespace.QName("", "leClassCode");
        private static final javax.xml.namespace.QName LECLASSCODEDESC$28 = 
            new javax.xml.namespace.QName("", "leClassCodeDesc");
        private static final javax.xml.namespace.QName SCBLEIND$30 = 
            new javax.xml.namespace.QName("", "scbLeInd");
        private static final javax.xml.namespace.QName HIERARCHYTYPE$32 = 
            new javax.xml.namespace.QName("", "hierarchyType");
        private static final javax.xml.namespace.QName HIERARCHYTYPEDESC$34 = 
            new javax.xml.namespace.QName("", "hierarchyTypeDesc");
        private static final javax.xml.namespace.QName ISICCODE$36 = 
            new javax.xml.namespace.QName("", "isicCode");
        private static final javax.xml.namespace.QName ISICCODEDESC$38 = 
            new javax.xml.namespace.QName("", "isicCodeDesc");
        private static final javax.xml.namespace.QName INSTSECTOR$40 = 
            new javax.xml.namespace.QName("", "instSector");
        private static final javax.xml.namespace.QName INSTSECTORDESC$42 = 
            new javax.xml.namespace.QName("", "instSectorDesc");
        private static final javax.xml.namespace.QName LELANGCODE$44 = 
            new javax.xml.namespace.QName("", "leLangCode");
        private static final javax.xml.namespace.QName LELANGCODEDESC$46 = 
            new javax.xml.namespace.QName("", "leLangCodeDesc");
        private static final javax.xml.namespace.QName DATAPROTIND$48 = 
            new javax.xml.namespace.QName("", "dataProtInd");
        private static final javax.xml.namespace.QName NORDECLIND$50 = 
            new javax.xml.namespace.QName("", "norDeclInd");
        private static final javax.xml.namespace.QName TRDIND$52 = 
            new javax.xml.namespace.QName("", "trdInd");
        private static final javax.xml.namespace.QName GLBLIMITIND$54 = 
            new javax.xml.namespace.QName("", "glbLimitInd");
        private static final javax.xml.namespace.QName BROKERID$56 = 
            new javax.xml.namespace.QName("", "brokerId");
        private static final javax.xml.namespace.QName DISCLOSUREAGRIND$58 = 
            new javax.xml.namespace.QName("", "disclosureAgrInd");
        private static final javax.xml.namespace.QName DOCCOMPLIND$60 = 
            new javax.xml.namespace.QName("", "docComplInd");
        private static final javax.xml.namespace.QName DOCCOMPLDATE$62 = 
            new javax.xml.namespace.QName("", "docComplDate");
        private static final javax.xml.namespace.QName LENOTE$64 = 
            new javax.xml.namespace.QName("", "leNote");
        private static final javax.xml.namespace.QName CONFREQIND$66 = 
            new javax.xml.namespace.QName("", "confReqInd");
        private static final javax.xml.namespace.QName SCBCREDITGRADE$68 = 
            new javax.xml.namespace.QName("", "scbCreditGrade");
        private static final javax.xml.namespace.QName SCBCREDITGRADEDESC$70 = 
            new javax.xml.namespace.QName("", "scbCreditGradeDesc");
        private static final javax.xml.namespace.QName TOPBANKIND$72 = 
            new javax.xml.namespace.QName("", "topBankInd");
        private static final javax.xml.namespace.QName LETYPE$74 = 
            new javax.xml.namespace.QName("", "leType");
        private static final javax.xml.namespace.QName LETYPEDESC$76 = 
            new javax.xml.namespace.QName("", "leTypeDesc");
        private static final javax.xml.namespace.QName EUROCOMPIND$78 = 
            new javax.xml.namespace.QName("", "euroCompInd");
        private static final javax.xml.namespace.QName ACTIVATEIND$80 = 
            new javax.xml.namespace.QName("", "activateInd");
        private static final javax.xml.namespace.QName CLSEIGIBILITY$82 = 
            new javax.xml.namespace.QName("", "clsEigibility");
        private static final javax.xml.namespace.QName CLSCUSTTYPE$84 = 
            new javax.xml.namespace.QName("", "clsCustType");
        private static final javax.xml.namespace.QName CLSSTARTDATE$86 = 
            new javax.xml.namespace.QName("", "clsStartDate");
        private static final javax.xml.namespace.QName GROUPCOTYPE$88 = 
            new javax.xml.namespace.QName("", "groupCoType");
        private static final javax.xml.namespace.QName CRUSER$90 = 
            new javax.xml.namespace.QName("", "cruser");
        private static final javax.xml.namespace.QName CRDATE$92 = 
            new javax.xml.namespace.QName("", "crdate");
        private static final javax.xml.namespace.QName UPCOUNT$94 = 
            new javax.xml.namespace.QName("", "upcount");
        private static final javax.xml.namespace.QName UPDSTATUS$96 = 
            new javax.xml.namespace.QName("", "updstatus");
        private static final javax.xml.namespace.QName UPDDATE$98 = 
            new javax.xml.namespace.QName("", "upddate");
        private static final javax.xml.namespace.QName UPDUSER$100 = 
            new javax.xml.namespace.QName("", "upduser");
        private static final javax.xml.namespace.QName VERIFIED$102 = 
            new javax.xml.namespace.QName("", "verified");
        private static final javax.xml.namespace.QName VERIFIEDUSER$104 = 
            new javax.xml.namespace.QName("", "verifieduser");
        private static final javax.xml.namespace.QName VERIFYDATE$106 = 
            new javax.xml.namespace.QName("", "verifydate");
        private static final javax.xml.namespace.QName BISWEIGHTING$108 = 
            new javax.xml.namespace.QName("", "bisWeighting");
        private static final javax.xml.namespace.QName DISCLAGRDATE$110 = 
            new javax.xml.namespace.QName("", "disclAgrDate");
        private static final javax.xml.namespace.QName DVPCUSTINDICATOR$112 = 
            new javax.xml.namespace.QName("", "dvpCustIndicator");
        private static final javax.xml.namespace.QName OPICSCLASSCODE$114 = 
            new javax.xml.namespace.QName("", "opicsClassCode");
        
        
        /**
         * Gets the "ultParentLeId" element
         */
        public java.lang.String getUltParentLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTPARENTLEID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ultParentLeId" element
         */
        public org.apache.xmlbeans.XmlString xgetUltParentLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTPARENTLEID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ultParentLeId" element
         */
        public void setUltParentLeId(java.lang.String ultParentLeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTPARENTLEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULTPARENTLEID$0);
                }
                target.setStringValue(ultParentLeId);
            }
        }
        
        /**
         * Sets (as xml) the "ultParentLeId" element
         */
        public void xsetUltParentLeId(org.apache.xmlbeans.XmlString ultParentLeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTPARENTLEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULTPARENTLEID$0);
                }
                target.set(ultParentLeId);
            }
        }
        
        /**
         * Gets the "parentLeId" element
         */
        public java.lang.String getParentLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTLEID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parentLeId" element
         */
        public org.apache.xmlbeans.XmlString xgetParentLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTLEID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "parentLeId" element
         */
        public void setParentLeId(java.lang.String parentLeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTLEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTLEID$2);
                }
                target.setStringValue(parentLeId);
            }
        }
        
        /**
         * Sets (as xml) the "parentLeId" element
         */
        public void xsetParentLeId(org.apache.xmlbeans.XmlString parentLeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTLEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTLEID$2);
                }
                target.set(parentLeId);
            }
        }
        
        /**
         * Gets the "domicileCntry" element
         */
        public java.lang.String getDomicileCntry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILECNTRY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "domicileCntry" element
         */
        public org.apache.xmlbeans.XmlString xgetDomicileCntry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILECNTRY$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "domicileCntry" element
         */
        public void setDomicileCntry(java.lang.String domicileCntry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILECNTRY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMICILECNTRY$4);
                }
                target.setStringValue(domicileCntry);
            }
        }
        
        /**
         * Sets (as xml) the "domicileCntry" element
         */
        public void xsetDomicileCntry(org.apache.xmlbeans.XmlString domicileCntry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILECNTRY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMICILECNTRY$4);
                }
                target.set(domicileCntry);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTRISKCNTRY$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTRISKCNTRY$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTRISKCNTRY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULTRISKCNTRY$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTRISKCNTRY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULTRISKCNTRY$6);
                }
                target.set(ultRiskCntry);
            }
        }
        
        /**
         * Gets the "ultRiskCntryDesc" element
         */
        public java.lang.String getUltRiskCntryDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTRISKCNTRYDESC$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ultRiskCntryDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetUltRiskCntryDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTRISKCNTRYDESC$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ultRiskCntryDesc" element
         */
        public void setUltRiskCntryDesc(java.lang.String ultRiskCntryDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTRISKCNTRYDESC$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULTRISKCNTRYDESC$8);
                }
                target.setStringValue(ultRiskCntryDesc);
            }
        }
        
        /**
         * Sets (as xml) the "ultRiskCntryDesc" element
         */
        public void xsetUltRiskCntryDesc(org.apache.xmlbeans.XmlString ultRiskCntryDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTRISKCNTRYDESC$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULTRISKCNTRYDESC$8);
                }
                target.set(ultRiskCntryDesc);
            }
        }
        
        /**
         * Gets the "atlasCode" element
         */
        public java.lang.String getAtlasCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATLASCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "atlasCode" element
         */
        public org.apache.xmlbeans.XmlString xgetAtlasCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATLASCODE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "atlasCode" element
         */
        public void setAtlasCode(java.lang.String atlasCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATLASCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATLASCODE$10);
                }
                target.setStringValue(atlasCode);
            }
        }
        
        /**
         * Sets (as xml) the "atlasCode" element
         */
        public void xsetAtlasCode(org.apache.xmlbeans.XmlString atlasCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATLASCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATLASCODE$10);
                }
                target.set(atlasCode);
            }
        }
        
        /**
         * Gets the "leName" element
         */
        public java.lang.String getLeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENAME$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leName" element
         */
        public org.apache.xmlbeans.XmlString xgetLeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LENAME$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leName" element
         */
        public void setLeName(java.lang.String leName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENAME$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LENAME$12);
                }
                target.setStringValue(leName);
            }
        }
        
        /**
         * Sets (as xml) the "leName" element
         */
        public void xsetLeName(org.apache.xmlbeans.XmlString leName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LENAME$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LENAME$12);
                }
                target.set(leName);
            }
        }
        
        /**
         * Gets the "leLegalName" element
         */
        public java.lang.String getLeLegalName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELEGALNAME$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leLegalName" element
         */
        public org.apache.xmlbeans.XmlString xgetLeLegalName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELEGALNAME$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leLegalName" element
         */
        public void setLeLegalName(java.lang.String leLegalName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELEGALNAME$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LELEGALNAME$14);
                }
                target.setStringValue(leLegalName);
            }
        }
        
        /**
         * Sets (as xml) the "leLegalName" element
         */
        public void xsetLeLegalName(org.apache.xmlbeans.XmlString leLegalName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELEGALNAME$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LELEGALNAME$14);
                }
                target.set(leLegalName);
            }
        }
        
        /**
         * Gets the "leLegalName1" element
         */
        public java.lang.String getLeLegalName1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELEGALNAME1$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leLegalName1" element
         */
        public org.apache.xmlbeans.XmlString xgetLeLegalName1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELEGALNAME1$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leLegalName1" element
         */
        public void setLeLegalName1(java.lang.String leLegalName1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELEGALNAME1$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LELEGALNAME1$16);
                }
                target.setStringValue(leLegalName1);
            }
        }
        
        /**
         * Sets (as xml) the "leLegalName1" element
         */
        public void xsetLeLegalName1(org.apache.xmlbeans.XmlString leLegalName1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELEGALNAME1$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LELEGALNAME1$16);
                }
                target.set(leLegalName1);
            }
        }
        
        /**
         * Gets the "leStatusCode" element
         */
        public java.lang.String getLeStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESTATUSCODE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leStatusCode" element
         */
        public org.apache.xmlbeans.XmlString xgetLeStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESTATUSCODE$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leStatusCode" element
         */
        public void setLeStatusCode(java.lang.String leStatusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESTATUSCODE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LESTATUSCODE$18);
                }
                target.setStringValue(leStatusCode);
            }
        }
        
        /**
         * Sets (as xml) the "leStatusCode" element
         */
        public void xsetLeStatusCode(org.apache.xmlbeans.XmlString leStatusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESTATUSCODE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LESTATUSCODE$18);
                }
                target.set(leStatusCode);
            }
        }
        
        /**
         * Gets the "leStatusCodeDesc" element
         */
        public java.lang.String getLeStatusCodeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESTATUSCODEDESC$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leStatusCodeDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetLeStatusCodeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESTATUSCODEDESC$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leStatusCodeDesc" element
         */
        public void setLeStatusCodeDesc(java.lang.String leStatusCodeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESTATUSCODEDESC$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LESTATUSCODEDESC$20);
                }
                target.setStringValue(leStatusCodeDesc);
            }
        }
        
        /**
         * Sets (as xml) the "leStatusCodeDesc" element
         */
        public void xsetLeStatusCodeDesc(org.apache.xmlbeans.XmlString leStatusCodeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESTATUSCODEDESC$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LESTATUSCODEDESC$20);
                }
                target.set(leStatusCodeDesc);
            }
        }
        
        /**
         * Gets the "finInstType" element
         */
        public java.lang.String getFinInstType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FININSTTYPE$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "finInstType" element
         */
        public org.apache.xmlbeans.XmlString xgetFinInstType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FININSTTYPE$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "finInstType" element
         */
        public void setFinInstType(java.lang.String finInstType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FININSTTYPE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FININSTTYPE$22);
                }
                target.setStringValue(finInstType);
            }
        }
        
        /**
         * Sets (as xml) the "finInstType" element
         */
        public void xsetFinInstType(org.apache.xmlbeans.XmlString finInstType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FININSTTYPE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FININSTTYPE$22);
                }
                target.set(finInstType);
            }
        }
        
        /**
         * Gets the "finInstTypeDesc" element
         */
        public java.lang.String getFinInstTypeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FININSTTYPEDESC$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "finInstTypeDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetFinInstTypeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FININSTTYPEDESC$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "finInstTypeDesc" element
         */
        public void setFinInstTypeDesc(java.lang.String finInstTypeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FININSTTYPEDESC$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FININSTTYPEDESC$24);
                }
                target.setStringValue(finInstTypeDesc);
            }
        }
        
        /**
         * Sets (as xml) the "finInstTypeDesc" element
         */
        public void xsetFinInstTypeDesc(org.apache.xmlbeans.XmlString finInstTypeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FININSTTYPEDESC$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FININSTTYPEDESC$24);
                }
                target.set(finInstTypeDesc);
            }
        }
        
        /**
         * Gets the "leClassCode" element
         */
        public java.lang.String getLeClassCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LECLASSCODE$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leClassCode" element
         */
        public org.apache.xmlbeans.XmlString xgetLeClassCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LECLASSCODE$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leClassCode" element
         */
        public void setLeClassCode(java.lang.String leClassCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LECLASSCODE$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LECLASSCODE$26);
                }
                target.setStringValue(leClassCode);
            }
        }
        
        /**
         * Sets (as xml) the "leClassCode" element
         */
        public void xsetLeClassCode(org.apache.xmlbeans.XmlString leClassCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LECLASSCODE$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LECLASSCODE$26);
                }
                target.set(leClassCode);
            }
        }
        
        /**
         * Gets the "leClassCodeDesc" element
         */
        public java.lang.String getLeClassCodeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LECLASSCODEDESC$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leClassCodeDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetLeClassCodeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LECLASSCODEDESC$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leClassCodeDesc" element
         */
        public void setLeClassCodeDesc(java.lang.String leClassCodeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LECLASSCODEDESC$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LECLASSCODEDESC$28);
                }
                target.setStringValue(leClassCodeDesc);
            }
        }
        
        /**
         * Sets (as xml) the "leClassCodeDesc" element
         */
        public void xsetLeClassCodeDesc(org.apache.xmlbeans.XmlString leClassCodeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LECLASSCODEDESC$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LECLASSCODEDESC$28);
                }
                target.set(leClassCodeDesc);
            }
        }
        
        /**
         * Gets the "scbLeInd" element
         */
        public java.lang.String getScbLeInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBLEIND$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "scbLeInd" element
         */
        public org.apache.xmlbeans.XmlString xgetScbLeInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBLEIND$30, 0);
                return target;
            }
        }
        
        /**
         * Sets the "scbLeInd" element
         */
        public void setScbLeInd(java.lang.String scbLeInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBLEIND$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBLEIND$30);
                }
                target.setStringValue(scbLeInd);
            }
        }
        
        /**
         * Sets (as xml) the "scbLeInd" element
         */
        public void xsetScbLeInd(org.apache.xmlbeans.XmlString scbLeInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBLEIND$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBLEIND$30);
                }
                target.set(scbLeInd);
            }
        }
        
        /**
         * Gets the "hierarchyType" element
         */
        public java.lang.String getHierarchyType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHYTYPE$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "hierarchyType" element
         */
        public org.apache.xmlbeans.XmlString xgetHierarchyType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHYTYPE$32, 0);
                return target;
            }
        }
        
        /**
         * Sets the "hierarchyType" element
         */
        public void setHierarchyType(java.lang.String hierarchyType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHYTYPE$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIERARCHYTYPE$32);
                }
                target.setStringValue(hierarchyType);
            }
        }
        
        /**
         * Sets (as xml) the "hierarchyType" element
         */
        public void xsetHierarchyType(org.apache.xmlbeans.XmlString hierarchyType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHYTYPE$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HIERARCHYTYPE$32);
                }
                target.set(hierarchyType);
            }
        }
        
        /**
         * Gets the "hierarchyTypeDesc" element
         */
        public java.lang.String getHierarchyTypeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHYTYPEDESC$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "hierarchyTypeDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetHierarchyTypeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHYTYPEDESC$34, 0);
                return target;
            }
        }
        
        /**
         * Sets the "hierarchyTypeDesc" element
         */
        public void setHierarchyTypeDesc(java.lang.String hierarchyTypeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHYTYPEDESC$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIERARCHYTYPEDESC$34);
                }
                target.setStringValue(hierarchyTypeDesc);
            }
        }
        
        /**
         * Sets (as xml) the "hierarchyTypeDesc" element
         */
        public void xsetHierarchyTypeDesc(org.apache.xmlbeans.XmlString hierarchyTypeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHYTYPEDESC$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HIERARCHYTYPEDESC$34);
                }
                target.set(hierarchyTypeDesc);
            }
        }
        
        /**
         * Gets the "isicCode" element
         */
        public java.lang.String getIsicCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICCODE$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "isicCode" element
         */
        public org.apache.xmlbeans.XmlString xgetIsicCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICCODE$36, 0);
                return target;
            }
        }
        
        /**
         * Sets the "isicCode" element
         */
        public void setIsicCode(java.lang.String isicCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICCODE$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISICCODE$36);
                }
                target.setStringValue(isicCode);
            }
        }
        
        /**
         * Sets (as xml) the "isicCode" element
         */
        public void xsetIsicCode(org.apache.xmlbeans.XmlString isicCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICCODE$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISICCODE$36);
                }
                target.set(isicCode);
            }
        }
        
        /**
         * Gets the "isicCodeDesc" element
         */
        public java.lang.String getIsicCodeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICCODEDESC$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "isicCodeDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetIsicCodeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICCODEDESC$38, 0);
                return target;
            }
        }
        
        /**
         * Sets the "isicCodeDesc" element
         */
        public void setIsicCodeDesc(java.lang.String isicCodeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICCODEDESC$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISICCODEDESC$38);
                }
                target.setStringValue(isicCodeDesc);
            }
        }
        
        /**
         * Sets (as xml) the "isicCodeDesc" element
         */
        public void xsetIsicCodeDesc(org.apache.xmlbeans.XmlString isicCodeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICCODEDESC$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISICCODEDESC$38);
                }
                target.set(isicCodeDesc);
            }
        }
        
        /**
         * Gets the "instSector" element
         */
        public java.lang.String getInstSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTSECTOR$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "instSector" element
         */
        public org.apache.xmlbeans.XmlString xgetInstSector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTSECTOR$40, 0);
                return target;
            }
        }
        
        /**
         * Sets the "instSector" element
         */
        public void setInstSector(java.lang.String instSector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTSECTOR$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSTSECTOR$40);
                }
                target.setStringValue(instSector);
            }
        }
        
        /**
         * Sets (as xml) the "instSector" element
         */
        public void xsetInstSector(org.apache.xmlbeans.XmlString instSector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTSECTOR$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSTSECTOR$40);
                }
                target.set(instSector);
            }
        }
        
        /**
         * Gets the "instSectorDesc" element
         */
        public java.lang.String getInstSectorDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTSECTORDESC$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "instSectorDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetInstSectorDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTSECTORDESC$42, 0);
                return target;
            }
        }
        
        /**
         * Sets the "instSectorDesc" element
         */
        public void setInstSectorDesc(java.lang.String instSectorDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTSECTORDESC$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSTSECTORDESC$42);
                }
                target.setStringValue(instSectorDesc);
            }
        }
        
        /**
         * Sets (as xml) the "instSectorDesc" element
         */
        public void xsetInstSectorDesc(org.apache.xmlbeans.XmlString instSectorDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTSECTORDESC$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSTSECTORDESC$42);
                }
                target.set(instSectorDesc);
            }
        }
        
        /**
         * Gets the "leLangCode" element
         */
        public java.lang.String getLeLangCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELANGCODE$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leLangCode" element
         */
        public org.apache.xmlbeans.XmlString xgetLeLangCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELANGCODE$44, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leLangCode" element
         */
        public void setLeLangCode(java.lang.String leLangCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELANGCODE$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LELANGCODE$44);
                }
                target.setStringValue(leLangCode);
            }
        }
        
        /**
         * Sets (as xml) the "leLangCode" element
         */
        public void xsetLeLangCode(org.apache.xmlbeans.XmlString leLangCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELANGCODE$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LELANGCODE$44);
                }
                target.set(leLangCode);
            }
        }
        
        /**
         * Gets the "leLangCodeDesc" element
         */
        public java.lang.String getLeLangCodeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELANGCODEDESC$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leLangCodeDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetLeLangCodeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELANGCODEDESC$46, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leLangCodeDesc" element
         */
        public void setLeLangCodeDesc(java.lang.String leLangCodeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELANGCODEDESC$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LELANGCODEDESC$46);
                }
                target.setStringValue(leLangCodeDesc);
            }
        }
        
        /**
         * Sets (as xml) the "leLangCodeDesc" element
         */
        public void xsetLeLangCodeDesc(org.apache.xmlbeans.XmlString leLangCodeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELANGCODEDESC$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LELANGCODEDESC$46);
                }
                target.set(leLangCodeDesc);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROTIND$48, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROTIND$48, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROTIND$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAPROTIND$48);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROTIND$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAPROTIND$48);
                }
                target.set(dataProtInd);
            }
        }
        
        /**
         * Gets the "norDeclInd" element
         */
        public java.lang.String getNorDeclInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORDECLIND$50, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "norDeclInd" element
         */
        public org.apache.xmlbeans.XmlString xgetNorDeclInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NORDECLIND$50, 0);
                return target;
            }
        }
        
        /**
         * Sets the "norDeclInd" element
         */
        public void setNorDeclInd(java.lang.String norDeclInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORDECLIND$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NORDECLIND$50);
                }
                target.setStringValue(norDeclInd);
            }
        }
        
        /**
         * Sets (as xml) the "norDeclInd" element
         */
        public void xsetNorDeclInd(org.apache.xmlbeans.XmlString norDeclInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NORDECLIND$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NORDECLIND$50);
                }
                target.set(norDeclInd);
            }
        }
        
        /**
         * Gets the "trdInd" element
         */
        public java.lang.String getTrdInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRDIND$52, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "trdInd" element
         */
        public org.apache.xmlbeans.XmlString xgetTrdInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRDIND$52, 0);
                return target;
            }
        }
        
        /**
         * Sets the "trdInd" element
         */
        public void setTrdInd(java.lang.String trdInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRDIND$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRDIND$52);
                }
                target.setStringValue(trdInd);
            }
        }
        
        /**
         * Sets (as xml) the "trdInd" element
         */
        public void xsetTrdInd(org.apache.xmlbeans.XmlString trdInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRDIND$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRDIND$52);
                }
                target.set(trdInd);
            }
        }
        
        /**
         * Gets the "glbLimitInd" element
         */
        public java.lang.String getGlbLimitInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLBLIMITIND$54, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "glbLimitInd" element
         */
        public org.apache.xmlbeans.XmlString xgetGlbLimitInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLBLIMITIND$54, 0);
                return target;
            }
        }
        
        /**
         * Sets the "glbLimitInd" element
         */
        public void setGlbLimitInd(java.lang.String glbLimitInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLBLIMITIND$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GLBLIMITIND$54);
                }
                target.setStringValue(glbLimitInd);
            }
        }
        
        /**
         * Sets (as xml) the "glbLimitInd" element
         */
        public void xsetGlbLimitInd(org.apache.xmlbeans.XmlString glbLimitInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLBLIMITIND$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GLBLIMITIND$54);
                }
                target.set(glbLimitInd);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROKERID$56, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BROKERID$56, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROKERID$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BROKERID$56);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BROKERID$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BROKERID$56);
                }
                target.set(brokerId);
            }
        }
        
        /**
         * Gets the "disclosureAgrInd" element
         */
        public java.lang.String getDisclosureAgrInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLOSUREAGRIND$58, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "disclosureAgrInd" element
         */
        public org.apache.xmlbeans.XmlString xgetDisclosureAgrInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLOSUREAGRIND$58, 0);
                return target;
            }
        }
        
        /**
         * Sets the "disclosureAgrInd" element
         */
        public void setDisclosureAgrInd(java.lang.String disclosureAgrInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLOSUREAGRIND$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCLOSUREAGRIND$58);
                }
                target.setStringValue(disclosureAgrInd);
            }
        }
        
        /**
         * Sets (as xml) the "disclosureAgrInd" element
         */
        public void xsetDisclosureAgrInd(org.apache.xmlbeans.XmlString disclosureAgrInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLOSUREAGRIND$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISCLOSUREAGRIND$58);
                }
                target.set(disclosureAgrInd);
            }
        }
        
        /**
         * Gets the "docComplInd" element
         */
        public java.lang.String getDocComplInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLIND$60, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "docComplInd" element
         */
        public org.apache.xmlbeans.XmlString xgetDocComplInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLIND$60, 0);
                return target;
            }
        }
        
        /**
         * Sets the "docComplInd" element
         */
        public void setDocComplInd(java.lang.String docComplInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLIND$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCCOMPLIND$60);
                }
                target.setStringValue(docComplInd);
            }
        }
        
        /**
         * Sets (as xml) the "docComplInd" element
         */
        public void xsetDocComplInd(org.apache.xmlbeans.XmlString docComplInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLIND$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCCOMPLIND$60);
                }
                target.set(docComplInd);
            }
        }
        
        /**
         * Gets the "docComplDate" element
         */
        public java.lang.String getDocComplDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLDATE$62, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "docComplDate" element
         */
        public org.apache.xmlbeans.XmlString xgetDocComplDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLDATE$62, 0);
                return target;
            }
        }
        
        /**
         * Sets the "docComplDate" element
         */
        public void setDocComplDate(java.lang.String docComplDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLDATE$62, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCCOMPLDATE$62);
                }
                target.setStringValue(docComplDate);
            }
        }
        
        /**
         * Sets (as xml) the "docComplDate" element
         */
        public void xsetDocComplDate(org.apache.xmlbeans.XmlString docComplDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLDATE$62, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCCOMPLDATE$62);
                }
                target.set(docComplDate);
            }
        }
        
        /**
         * Gets the "leNote" element
         */
        public java.lang.String getLeNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENOTE$64, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leNote" element
         */
        public org.apache.xmlbeans.XmlString xgetLeNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LENOTE$64, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leNote" element
         */
        public void setLeNote(java.lang.String leNote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENOTE$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LENOTE$64);
                }
                target.setStringValue(leNote);
            }
        }
        
        /**
         * Sets (as xml) the "leNote" element
         */
        public void xsetLeNote(org.apache.xmlbeans.XmlString leNote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LENOTE$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LENOTE$64);
                }
                target.set(leNote);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFREQIND$66, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFREQIND$66, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFREQIND$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFREQIND$66);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFREQIND$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONFREQIND$66);
                }
                target.set(confReqInd);
            }
        }
        
        /**
         * Gets the "scbCreditGrade" element
         */
        public java.lang.String getScbCreditGrade()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBCREDITGRADE$68, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "scbCreditGrade" element
         */
        public org.apache.xmlbeans.XmlString xgetScbCreditGrade()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBCREDITGRADE$68, 0);
                return target;
            }
        }
        
        /**
         * Sets the "scbCreditGrade" element
         */
        public void setScbCreditGrade(java.lang.String scbCreditGrade)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBCREDITGRADE$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBCREDITGRADE$68);
                }
                target.setStringValue(scbCreditGrade);
            }
        }
        
        /**
         * Sets (as xml) the "scbCreditGrade" element
         */
        public void xsetScbCreditGrade(org.apache.xmlbeans.XmlString scbCreditGrade)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBCREDITGRADE$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBCREDITGRADE$68);
                }
                target.set(scbCreditGrade);
            }
        }
        
        /**
         * Gets the "scbCreditGradeDesc" element
         */
        public java.lang.String getScbCreditGradeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBCREDITGRADEDESC$70, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "scbCreditGradeDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetScbCreditGradeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBCREDITGRADEDESC$70, 0);
                return target;
            }
        }
        
        /**
         * Sets the "scbCreditGradeDesc" element
         */
        public void setScbCreditGradeDesc(java.lang.String scbCreditGradeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBCREDITGRADEDESC$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBCREDITGRADEDESC$70);
                }
                target.setStringValue(scbCreditGradeDesc);
            }
        }
        
        /**
         * Sets (as xml) the "scbCreditGradeDesc" element
         */
        public void xsetScbCreditGradeDesc(org.apache.xmlbeans.XmlString scbCreditGradeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBCREDITGRADEDESC$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBCREDITGRADEDESC$70);
                }
                target.set(scbCreditGradeDesc);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPBANKIND$72, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOPBANKIND$72, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPBANKIND$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOPBANKIND$72);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOPBANKIND$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOPBANKIND$72);
                }
                target.set(topBankInd);
            }
        }
        
        /**
         * Gets the "leType" element
         */
        public java.lang.String getLeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETYPE$74, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leType" element
         */
        public org.apache.xmlbeans.XmlString xgetLeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LETYPE$74, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leType" element
         */
        public void setLeType(java.lang.String leType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETYPE$74, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LETYPE$74);
                }
                target.setStringValue(leType);
            }
        }
        
        /**
         * Sets (as xml) the "leType" element
         */
        public void xsetLeType(org.apache.xmlbeans.XmlString leType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LETYPE$74, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LETYPE$74);
                }
                target.set(leType);
            }
        }
        
        /**
         * Gets the "leTypeDesc" element
         */
        public java.lang.String getLeTypeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETYPEDESC$76, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leTypeDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetLeTypeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LETYPEDESC$76, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leTypeDesc" element
         */
        public void setLeTypeDesc(java.lang.String leTypeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETYPEDESC$76, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LETYPEDESC$76);
                }
                target.setStringValue(leTypeDesc);
            }
        }
        
        /**
         * Sets (as xml) the "leTypeDesc" element
         */
        public void xsetLeTypeDesc(org.apache.xmlbeans.XmlString leTypeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LETYPEDESC$76, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LETYPEDESC$76);
                }
                target.set(leTypeDesc);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EUROCOMPIND$78, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EUROCOMPIND$78, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EUROCOMPIND$78, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EUROCOMPIND$78);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EUROCOMPIND$78, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EUROCOMPIND$78);
                }
                target.set(euroCompInd);
            }
        }
        
        /**
         * Gets the "activateInd" element
         */
        public java.lang.String getActivateInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVATEIND$80, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "activateInd" element
         */
        public org.apache.xmlbeans.XmlString xgetActivateInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVATEIND$80, 0);
                return target;
            }
        }
        
        /**
         * Sets the "activateInd" element
         */
        public void setActivateInd(java.lang.String activateInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVATEIND$80, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVATEIND$80);
                }
                target.setStringValue(activateInd);
            }
        }
        
        /**
         * Sets (as xml) the "activateInd" element
         */
        public void xsetActivateInd(org.apache.xmlbeans.XmlString activateInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVATEIND$80, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVATEIND$80);
                }
                target.set(activateInd);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSEIGIBILITY$82, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSEIGIBILITY$82, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSEIGIBILITY$82, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLSEIGIBILITY$82);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSEIGIBILITY$82, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLSEIGIBILITY$82);
                }
                target.set(clsEigibility);
            }
        }
        
        /**
         * Gets the "clsCustType" element
         */
        public java.lang.String getClsCustType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSCUSTTYPE$84, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "clsCustType" element
         */
        public org.apache.xmlbeans.XmlString xgetClsCustType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSCUSTTYPE$84, 0);
                return target;
            }
        }
        
        /**
         * Sets the "clsCustType" element
         */
        public void setClsCustType(java.lang.String clsCustType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSCUSTTYPE$84, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLSCUSTTYPE$84);
                }
                target.setStringValue(clsCustType);
            }
        }
        
        /**
         * Sets (as xml) the "clsCustType" element
         */
        public void xsetClsCustType(org.apache.xmlbeans.XmlString clsCustType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSCUSTTYPE$84, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLSCUSTTYPE$84);
                }
                target.set(clsCustType);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSSTARTDATE$86, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSSTARTDATE$86, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSSTARTDATE$86, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLSSTARTDATE$86);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSSTARTDATE$86, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLSSTARTDATE$86);
                }
                target.set(clsStartDate);
            }
        }
        
        /**
         * Gets the "groupCoType" element
         */
        public java.lang.String getGroupCoType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPCOTYPE$88, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "groupCoType" element
         */
        public org.apache.xmlbeans.XmlString xgetGroupCoType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPCOTYPE$88, 0);
                return target;
            }
        }
        
        /**
         * Sets the "groupCoType" element
         */
        public void setGroupCoType(java.lang.String groupCoType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPCOTYPE$88, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPCOTYPE$88);
                }
                target.setStringValue(groupCoType);
            }
        }
        
        /**
         * Sets (as xml) the "groupCoType" element
         */
        public void xsetGroupCoType(org.apache.xmlbeans.XmlString groupCoType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPCOTYPE$88, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPCOTYPE$88);
                }
                target.set(groupCoType);
            }
        }
        
        /**
         * Gets the "cruser" element
         */
        public java.lang.String getCruser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRUSER$90, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cruser" element
         */
        public org.apache.xmlbeans.XmlString xgetCruser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CRUSER$90, 0);
                return target;
            }
        }
        
        /**
         * Sets the "cruser" element
         */
        public void setCruser(java.lang.String cruser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRUSER$90, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRUSER$90);
                }
                target.setStringValue(cruser);
            }
        }
        
        /**
         * Sets (as xml) the "cruser" element
         */
        public void xsetCruser(org.apache.xmlbeans.XmlString cruser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CRUSER$90, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CRUSER$90);
                }
                target.set(cruser);
            }
        }
        
        /**
         * Gets the "crdate" element
         */
        public java.lang.String getCrdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRDATE$92, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "crdate" element
         */
        public org.apache.xmlbeans.XmlString xgetCrdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CRDATE$92, 0);
                return target;
            }
        }
        
        /**
         * Sets the "crdate" element
         */
        public void setCrdate(java.lang.String crdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRDATE$92, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRDATE$92);
                }
                target.setStringValue(crdate);
            }
        }
        
        /**
         * Sets (as xml) the "crdate" element
         */
        public void xsetCrdate(org.apache.xmlbeans.XmlString crdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CRDATE$92, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CRDATE$92);
                }
                target.set(crdate);
            }
        }
        
        /**
         * Gets the "upcount" element
         */
        public java.lang.String getUpcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPCOUNT$94, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "upcount" element
         */
        public org.apache.xmlbeans.XmlString xgetUpcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPCOUNT$94, 0);
                return target;
            }
        }
        
        /**
         * Sets the "upcount" element
         */
        public void setUpcount(java.lang.String upcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPCOUNT$94, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPCOUNT$94);
                }
                target.setStringValue(upcount);
            }
        }
        
        /**
         * Sets (as xml) the "upcount" element
         */
        public void xsetUpcount(org.apache.xmlbeans.XmlString upcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPCOUNT$94, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPCOUNT$94);
                }
                target.set(upcount);
            }
        }
        
        /**
         * Gets the "updstatus" element
         */
        public java.lang.String getUpdstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$96, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "updstatus" element
         */
        public org.apache.xmlbeans.XmlString xgetUpdstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$96, 0);
                return target;
            }
        }
        
        /**
         * Sets the "updstatus" element
         */
        public void setUpdstatus(java.lang.String updstatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$96, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDSTATUS$96);
                }
                target.setStringValue(updstatus);
            }
        }
        
        /**
         * Sets (as xml) the "updstatus" element
         */
        public void xsetUpdstatus(org.apache.xmlbeans.XmlString updstatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$96, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDSTATUS$96);
                }
                target.set(updstatus);
            }
        }
        
        /**
         * Gets the "upddate" element
         */
        public java.lang.String getUpddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDDATE$98, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "upddate" element
         */
        public org.apache.xmlbeans.XmlString xgetUpddate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDDATE$98, 0);
                return target;
            }
        }
        
        /**
         * Sets the "upddate" element
         */
        public void setUpddate(java.lang.String upddate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDDATE$98, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDDATE$98);
                }
                target.setStringValue(upddate);
            }
        }
        
        /**
         * Sets (as xml) the "upddate" element
         */
        public void xsetUpddate(org.apache.xmlbeans.XmlString upddate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDDATE$98, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDDATE$98);
                }
                target.set(upddate);
            }
        }
        
        /**
         * Gets the "upduser" element
         */
        public java.lang.String getUpduser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDUSER$100, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "upduser" element
         */
        public org.apache.xmlbeans.XmlString xgetUpduser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDUSER$100, 0);
                return target;
            }
        }
        
        /**
         * Sets the "upduser" element
         */
        public void setUpduser(java.lang.String upduser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDUSER$100, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDUSER$100);
                }
                target.setStringValue(upduser);
            }
        }
        
        /**
         * Sets (as xml) the "upduser" element
         */
        public void xsetUpduser(org.apache.xmlbeans.XmlString upduser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDUSER$100, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDUSER$100);
                }
                target.set(upduser);
            }
        }
        
        /**
         * Gets the "verified" element
         */
        public java.lang.String getVerified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$102, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "verified" element
         */
        public org.apache.xmlbeans.XmlString xgetVerified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$102, 0);
                return target;
            }
        }
        
        /**
         * Sets the "verified" element
         */
        public void setVerified(java.lang.String verified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$102, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERIFIED$102);
                }
                target.setStringValue(verified);
            }
        }
        
        /**
         * Sets (as xml) the "verified" element
         */
        public void xsetVerified(org.apache.xmlbeans.XmlString verified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$102, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERIFIED$102);
                }
                target.set(verified);
            }
        }
        
        /**
         * Gets the "verifieduser" element
         */
        public java.lang.String getVerifieduser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIEDUSER$104, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "verifieduser" element
         */
        public org.apache.xmlbeans.XmlString xgetVerifieduser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIEDUSER$104, 0);
                return target;
            }
        }
        
        /**
         * Sets the "verifieduser" element
         */
        public void setVerifieduser(java.lang.String verifieduser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIEDUSER$104, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERIFIEDUSER$104);
                }
                target.setStringValue(verifieduser);
            }
        }
        
        /**
         * Sets (as xml) the "verifieduser" element
         */
        public void xsetVerifieduser(org.apache.xmlbeans.XmlString verifieduser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIEDUSER$104, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERIFIEDUSER$104);
                }
                target.set(verifieduser);
            }
        }
        
        /**
         * Gets the "verifydate" element
         */
        public java.lang.String getVerifydate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFYDATE$106, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "verifydate" element
         */
        public org.apache.xmlbeans.XmlString xgetVerifydate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFYDATE$106, 0);
                return target;
            }
        }
        
        /**
         * Sets the "verifydate" element
         */
        public void setVerifydate(java.lang.String verifydate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFYDATE$106, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERIFYDATE$106);
                }
                target.setStringValue(verifydate);
            }
        }
        
        /**
         * Sets (as xml) the "verifydate" element
         */
        public void xsetVerifydate(org.apache.xmlbeans.XmlString verifydate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFYDATE$106, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERIFYDATE$106);
                }
                target.set(verifydate);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BISWEIGHTING$108, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BISWEIGHTING$108, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BISWEIGHTING$108, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BISWEIGHTING$108);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BISWEIGHTING$108, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BISWEIGHTING$108);
                }
                target.set(bisWeighting);
            }
        }
        
        /**
         * Gets the "disclAgrDate" element
         */
        public java.lang.String getDisclAgrDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLAGRDATE$110, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "disclAgrDate" element
         */
        public org.apache.xmlbeans.XmlString xgetDisclAgrDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLAGRDATE$110, 0);
                return target;
            }
        }
        
        /**
         * Sets the "disclAgrDate" element
         */
        public void setDisclAgrDate(java.lang.String disclAgrDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLAGRDATE$110, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCLAGRDATE$110);
                }
                target.setStringValue(disclAgrDate);
            }
        }
        
        /**
         * Sets (as xml) the "disclAgrDate" element
         */
        public void xsetDisclAgrDate(org.apache.xmlbeans.XmlString disclAgrDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLAGRDATE$110, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISCLAGRDATE$110);
                }
                target.set(disclAgrDate);
            }
        }
        
        /**
         * Gets the "dvpCustIndicator" element
         */
        public java.lang.String getDvpCustIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DVPCUSTINDICATOR$112, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dvpCustIndicator" element
         */
        public org.apache.xmlbeans.XmlString xgetDvpCustIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DVPCUSTINDICATOR$112, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dvpCustIndicator" element
         */
        public void setDvpCustIndicator(java.lang.String dvpCustIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DVPCUSTINDICATOR$112, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DVPCUSTINDICATOR$112);
                }
                target.setStringValue(dvpCustIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "dvpCustIndicator" element
         */
        public void xsetDvpCustIndicator(org.apache.xmlbeans.XmlString dvpCustIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DVPCUSTINDICATOR$112, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DVPCUSTINDICATOR$112);
                }
                target.set(dvpCustIndicator);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPICSCLASSCODE$114, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPICSCLASSCODE$114, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPICSCLASSCODE$114, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPICSCLASSCODE$114);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPICSCLASSCODE$114, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPICSCLASSCODE$114);
                }
                target.set(opicsClassCode);
            }
        }
    }
}
