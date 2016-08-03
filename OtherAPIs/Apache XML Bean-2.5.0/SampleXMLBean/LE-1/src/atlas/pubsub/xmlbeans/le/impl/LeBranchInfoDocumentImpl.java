/*
 * An XML document type.
 * Localname: leBranchInfo
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeBranchInfoDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leBranchInfo(@) element.
 *
 * This is a complex type.
 */
public class LeBranchInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeBranchInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeBranchInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEBRANCHINFO$0 = 
        new javax.xml.namespace.QName("", "leBranchInfo");
    
    
    /**
     * Gets the "leBranchInfo" element
     */
    public atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo getLeBranchInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo target = null;
            target = (atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo)get_store().find_element_user(LEBRANCHINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "leBranchInfo" element
     */
    public void setLeBranchInfo(atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo leBranchInfo)
    {
        generatedSetterHelperImpl(leBranchInfo, LEBRANCHINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "leBranchInfo" element
     */
    public atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo addNewLeBranchInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo target = null;
            target = (atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo)get_store().add_element_user(LEBRANCHINFO$0);
            return target;
        }
    }
    /**
     * An XML leBranchInfo(@).
     *
     * This is a complex type.
     */
    public static class LeBranchInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo
    {
        private static final long serialVersionUID = 1L;
        
        public LeBranchInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SCBLEID$0 = 
            new javax.xml.namespace.QName("", "scbLeId");
        private static final javax.xml.namespace.QName CUSTSTATRSNCODE$2 = 
            new javax.xml.namespace.QName("", "custStatRsnCode");
        private static final javax.xml.namespace.QName CUSTSTATCHNGDT$4 = 
            new javax.xml.namespace.QName("", "custStatChngDt");
        private static final javax.xml.namespace.QName PHONECONFIRM$6 = 
            new javax.xml.namespace.QName("", "phoneConfirm");
        private static final javax.xml.namespace.QName NETSETTLE$8 = 
            new javax.xml.namespace.QName("", "netSettle");
        private static final javax.xml.namespace.QName NOVATION$10 = 
            new javax.xml.namespace.QName("", "novation");
        private static final javax.xml.namespace.QName MANUALSETTLE$12 = 
            new javax.xml.namespace.QName("", "manualSettle");
        private static final javax.xml.namespace.QName PHONENUMBER$14 = 
            new javax.xml.namespace.QName("", "phoneNumber");
        private static final javax.xml.namespace.QName FAXNUMBER$16 = 
            new javax.xml.namespace.QName("", "faxNumber");
        private static final javax.xml.namespace.QName ARMCODE$18 = 
            new javax.xml.namespace.QName("", "armCode");
        private static final javax.xml.namespace.QName CUSTSTATUS$20 = 
            new javax.xml.namespace.QName("", "custStatus");
        private static final javax.xml.namespace.QName UPDSTATUS$22 = 
            new javax.xml.namespace.QName("", "updstatus");
        private static final javax.xml.namespace.QName VERIFIED$24 = 
            new javax.xml.namespace.QName("", "verified");
        
        
        /**
         * Gets the "scbLeId" element
         */
        public java.lang.String getScbLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBLEID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "scbLeId" element
         */
        public org.apache.xmlbeans.XmlString xgetScbLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBLEID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "scbLeId" element
         */
        public void setScbLeId(java.lang.String scbLeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBLEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBLEID$0);
                }
                target.setStringValue(scbLeId);
            }
        }
        
        /**
         * Sets (as xml) the "scbLeId" element
         */
        public void xsetScbLeId(org.apache.xmlbeans.XmlString scbLeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBLEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBLEID$0);
                }
                target.set(scbLeId);
            }
        }
        
        /**
         * Gets the "custStatRsnCode" element
         */
        public java.lang.String getCustStatRsnCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATRSNCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "custStatRsnCode" element
         */
        public org.apache.xmlbeans.XmlString xgetCustStatRsnCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATRSNCODE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "custStatRsnCode" element
         */
        public void setCustStatRsnCode(java.lang.String custStatRsnCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATRSNCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTSTATRSNCODE$2);
                }
                target.setStringValue(custStatRsnCode);
            }
        }
        
        /**
         * Sets (as xml) the "custStatRsnCode" element
         */
        public void xsetCustStatRsnCode(org.apache.xmlbeans.XmlString custStatRsnCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATRSNCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTSTATRSNCODE$2);
                }
                target.set(custStatRsnCode);
            }
        }
        
        /**
         * Gets the "custStatChngDt" element
         */
        public java.lang.String getCustStatChngDt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATCHNGDT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "custStatChngDt" element
         */
        public org.apache.xmlbeans.XmlString xgetCustStatChngDt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATCHNGDT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "custStatChngDt" element
         */
        public void setCustStatChngDt(java.lang.String custStatChngDt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATCHNGDT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTSTATCHNGDT$4);
                }
                target.setStringValue(custStatChngDt);
            }
        }
        
        /**
         * Sets (as xml) the "custStatChngDt" element
         */
        public void xsetCustStatChngDt(org.apache.xmlbeans.XmlString custStatChngDt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATCHNGDT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTSTATCHNGDT$4);
                }
                target.set(custStatChngDt);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONECONFIRM$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONECONFIRM$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONECONFIRM$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONECONFIRM$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONECONFIRM$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONECONFIRM$6);
                }
                target.set(phoneConfirm);
            }
        }
        
        /**
         * Gets the "netSettle" element
         */
        public java.lang.String getNetSettle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETSETTLE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "netSettle" element
         */
        public org.apache.xmlbeans.XmlString xgetNetSettle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NETSETTLE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "netSettle" element
         */
        public void setNetSettle(java.lang.String netSettle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETSETTLE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NETSETTLE$8);
                }
                target.setStringValue(netSettle);
            }
        }
        
        /**
         * Sets (as xml) the "netSettle" element
         */
        public void xsetNetSettle(org.apache.xmlbeans.XmlString netSettle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NETSETTLE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NETSETTLE$8);
                }
                target.set(netSettle);
            }
        }
        
        /**
         * Gets the "novation" element
         */
        public java.lang.String getNovation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOVATION$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "novation" element
         */
        public org.apache.xmlbeans.XmlString xgetNovation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOVATION$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "novation" element
         */
        public void setNovation(java.lang.String novation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOVATION$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOVATION$10);
                }
                target.setStringValue(novation);
            }
        }
        
        /**
         * Sets (as xml) the "novation" element
         */
        public void xsetNovation(org.apache.xmlbeans.XmlString novation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOVATION$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOVATION$10);
                }
                target.set(novation);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALSETTLE$12, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUALSETTLE$12, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALSETTLE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANUALSETTLE$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUALSETTLE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANUALSETTLE$12);
                }
                target.set(manualSettle);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONENUMBER$14, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENUMBER$14, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONENUMBER$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONENUMBER$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENUMBER$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONENUMBER$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAXNUMBER$16, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAXNUMBER$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAXNUMBER$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAXNUMBER$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAXNUMBER$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAXNUMBER$16);
                }
                target.set(faxNumber);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCODE$18, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCODE$18, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCODE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMCODE$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCODE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMCODE$18);
                }
                target.set(armCode);
            }
        }
        
        /**
         * Gets the "custStatus" element
         */
        public java.lang.String getCustStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATUS$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "custStatus" element
         */
        public org.apache.xmlbeans.XmlString xgetCustStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATUS$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "custStatus" element
         */
        public void setCustStatus(java.lang.String custStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATUS$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTSTATUS$20);
                }
                target.setStringValue(custStatus);
            }
        }
        
        /**
         * Sets (as xml) the "custStatus" element
         */
        public void xsetCustStatus(org.apache.xmlbeans.XmlString custStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATUS$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTSTATUS$20);
                }
                target.set(custStatus);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$22, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$22, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDSTATUS$22);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDSTATUS$22);
                }
                target.set(updstatus);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$24, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$24, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERIFIED$24);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERIFIED$24);
                }
                target.set(verified);
            }
        }
    }
}
