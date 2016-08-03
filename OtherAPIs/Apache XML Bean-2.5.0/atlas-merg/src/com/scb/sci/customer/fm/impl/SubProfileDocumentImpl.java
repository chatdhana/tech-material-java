/*
 * An XML document type.
 * Localname: subProfile
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.SubProfileDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one subProfile(@) element.
 *
 * This is a complex type.
 */
public class SubProfileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.SubProfileDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubProfileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBPROFILE$0 = 
        new javax.xml.namespace.QName("", "subProfile");
    
    
    /**
     * Gets the "subProfile" element
     */
    public com.scb.sci.customer.fm.SubProfileDocument.SubProfile getSubProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.SubProfileDocument.SubProfile target = null;
            target = (com.scb.sci.customer.fm.SubProfileDocument.SubProfile)get_store().find_element_user(SUBPROFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subProfile" element
     */
    public void setSubProfile(com.scb.sci.customer.fm.SubProfileDocument.SubProfile subProfile)
    {
        generatedSetterHelperImpl(subProfile, SUBPROFILE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subProfile" element
     */
    public com.scb.sci.customer.fm.SubProfileDocument.SubProfile addNewSubProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.SubProfileDocument.SubProfile target = null;
            target = (com.scb.sci.customer.fm.SubProfileDocument.SubProfile)get_store().add_element_user(SUBPROFILE$0);
            return target;
        }
    }
    /**
     * An XML subProfile(@).
     *
     * This is a complex type.
     */
    public static class SubProfileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.SubProfileDocument.SubProfile
    {
        private static final long serialVersionUID = 1L;
        
        public SubProfileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName SUBPROFILENAME$4 = 
            new javax.xml.namespace.QName("", "subProfileName");
        private static final javax.xml.namespace.QName DOMICILECOUNTRY$6 = 
            new javax.xml.namespace.QName("", "domicileCountry");
        private static final javax.xml.namespace.QName DOMICILECOUNTRYREGISTRATIONNUMBER$8 = 
            new javax.xml.namespace.QName("", "domicileCountryRegistrationNumber");
        private static final javax.xml.namespace.QName SWIFTCOUNTRYCODE$10 = 
            new javax.xml.namespace.QName("", "swiftCountryCode");
        private static final javax.xml.namespace.QName CUSTOMERORGTYPE$12 = 
            new javax.xml.namespace.QName("", "CustomerOrgType");
        private static final javax.xml.namespace.QName DISCLOSUREAGREEMENTINDICATOR$14 = 
            new javax.xml.namespace.QName("", "disclosureAgreementIndicator");
        private static final javax.xml.namespace.QName AGREEMENTDATE$16 = 
            new javax.xml.namespace.QName("", "agreementDate");
        private static final javax.xml.namespace.QName LANGUAGECODE$18 = 
            new javax.xml.namespace.QName("", "languageCode");
        private static final javax.xml.namespace.QName RELATIONSHIPSTARTDATE$20 = 
            new javax.xml.namespace.QName("", "relationshipStartDate");
        private static final javax.xml.namespace.QName SERVICELEVELPRIORITY$22 = 
            new javax.xml.namespace.QName("", "serviceLevelPriority");
        private static final javax.xml.namespace.QName TREATURYIND$24 = 
            new javax.xml.namespace.QName("", "treaturyInd");
        private static final javax.xml.namespace.QName OPERATIONSTATUS2$26 = 
            new javax.xml.namespace.QName("", "operationStatus2");
        private static final javax.xml.namespace.QName OPERATIONSTATUS2EFFDATE$28 = 
            new javax.xml.namespace.QName("", "operationStatus2EffDate");
        private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$30 = 
            new javax.xml.namespace.QName("", "updateStatusIndicator");
        private static final javax.xml.namespace.QName CHANGEINDICATOR$32 = 
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
         * Gets the "subProfileName" element
         */
        public java.lang.String getSubProfileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPROFILENAME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subProfileName" element
         */
        public org.apache.xmlbeans.XmlString xgetSubProfileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPROFILENAME$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "subProfileName" element
         */
        public void setSubProfileName(java.lang.String subProfileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPROFILENAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBPROFILENAME$4);
                }
                target.setStringValue(subProfileName);
            }
        }
        
        /**
         * Sets (as xml) the "subProfileName" element
         */
        public void xsetSubProfileName(org.apache.xmlbeans.XmlString subProfileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPROFILENAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBPROFILENAME$4);
                }
                target.set(subProfileName);
            }
        }
        
        /**
         * Gets the "domicileCountry" element
         */
        public java.lang.String getDomicileCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILECOUNTRY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "domicileCountry" element
         */
        public org.apache.xmlbeans.XmlString xgetDomicileCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILECOUNTRY$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "domicileCountry" element
         */
        public void setDomicileCountry(java.lang.String domicileCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILECOUNTRY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMICILECOUNTRY$6);
                }
                target.setStringValue(domicileCountry);
            }
        }
        
        /**
         * Sets (as xml) the "domicileCountry" element
         */
        public void xsetDomicileCountry(org.apache.xmlbeans.XmlString domicileCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILECOUNTRY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMICILECOUNTRY$6);
                }
                target.set(domicileCountry);
            }
        }
        
        /**
         * Gets the "domicileCountryRegistrationNumber" element
         */
        public java.lang.String getDomicileCountryRegistrationNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILECOUNTRYREGISTRATIONNUMBER$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "domicileCountryRegistrationNumber" element
         */
        public org.apache.xmlbeans.XmlString xgetDomicileCountryRegistrationNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILECOUNTRYREGISTRATIONNUMBER$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "domicileCountryRegistrationNumber" element
         */
        public void setDomicileCountryRegistrationNumber(java.lang.String domicileCountryRegistrationNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILECOUNTRYREGISTRATIONNUMBER$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMICILECOUNTRYREGISTRATIONNUMBER$8);
                }
                target.setStringValue(domicileCountryRegistrationNumber);
            }
        }
        
        /**
         * Sets (as xml) the "domicileCountryRegistrationNumber" element
         */
        public void xsetDomicileCountryRegistrationNumber(org.apache.xmlbeans.XmlString domicileCountryRegistrationNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILECOUNTRYREGISTRATIONNUMBER$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMICILECOUNTRYREGISTRATIONNUMBER$8);
                }
                target.set(domicileCountryRegistrationNumber);
            }
        }
        
        /**
         * Gets the "swiftCountryCode" element
         */
        public java.lang.String getSwiftCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIFTCOUNTRYCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "swiftCountryCode" element
         */
        public org.apache.xmlbeans.XmlString xgetSwiftCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIFTCOUNTRYCODE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "swiftCountryCode" element
         */
        public void setSwiftCountryCode(java.lang.String swiftCountryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SWIFTCOUNTRYCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SWIFTCOUNTRYCODE$10);
                }
                target.setStringValue(swiftCountryCode);
            }
        }
        
        /**
         * Sets (as xml) the "swiftCountryCode" element
         */
        public void xsetSwiftCountryCode(org.apache.xmlbeans.XmlString swiftCountryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SWIFTCOUNTRYCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SWIFTCOUNTRYCODE$10);
                }
                target.set(swiftCountryCode);
            }
        }
        
        /**
         * Gets the "CustomerOrgType" element
         */
        public com.scb.sci.customer.fm.CustomerOrgTypeDocument.CustomerOrgType getCustomerOrgType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CustomerOrgTypeDocument.CustomerOrgType target = null;
                target = (com.scb.sci.customer.fm.CustomerOrgTypeDocument.CustomerOrgType)get_store().find_element_user(CUSTOMERORGTYPE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CustomerOrgType" element
         */
        public void setCustomerOrgType(com.scb.sci.customer.fm.CustomerOrgTypeDocument.CustomerOrgType customerOrgType)
        {
            generatedSetterHelperImpl(customerOrgType, CUSTOMERORGTYPE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CustomerOrgType" element
         */
        public com.scb.sci.customer.fm.CustomerOrgTypeDocument.CustomerOrgType addNewCustomerOrgType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CustomerOrgTypeDocument.CustomerOrgType target = null;
                target = (com.scb.sci.customer.fm.CustomerOrgTypeDocument.CustomerOrgType)get_store().add_element_user(CUSTOMERORGTYPE$12);
                return target;
            }
        }
        
        /**
         * Gets the "disclosureAgreementIndicator" element
         */
        public java.lang.String getDisclosureAgreementIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLOSUREAGREEMENTINDICATOR$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "disclosureAgreementIndicator" element
         */
        public org.apache.xmlbeans.XmlString xgetDisclosureAgreementIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLOSUREAGREEMENTINDICATOR$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "disclosureAgreementIndicator" element
         */
        public void setDisclosureAgreementIndicator(java.lang.String disclosureAgreementIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLOSUREAGREEMENTINDICATOR$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCLOSUREAGREEMENTINDICATOR$14);
                }
                target.setStringValue(disclosureAgreementIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "disclosureAgreementIndicator" element
         */
        public void xsetDisclosureAgreementIndicator(org.apache.xmlbeans.XmlString disclosureAgreementIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLOSUREAGREEMENTINDICATOR$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISCLOSUREAGREEMENTINDICATOR$14);
                }
                target.set(disclosureAgreementIndicator);
            }
        }
        
        /**
         * Gets the "agreementDate" element
         */
        public java.lang.String getAgreementDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGREEMENTDATE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "agreementDate" element
         */
        public org.apache.xmlbeans.XmlString xgetAgreementDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGREEMENTDATE$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "agreementDate" element
         */
        public void setAgreementDate(java.lang.String agreementDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGREEMENTDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGREEMENTDATE$16);
                }
                target.setStringValue(agreementDate);
            }
        }
        
        /**
         * Sets (as xml) the "agreementDate" element
         */
        public void xsetAgreementDate(org.apache.xmlbeans.XmlString agreementDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGREEMENTDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGREEMENTDATE$16);
                }
                target.set(agreementDate);
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
                target = (com.scb.sci.customer.fm.LanguageCodeDocument.LanguageCode)get_store().find_element_user(LANGUAGECODE$18, 0);
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
            generatedSetterHelperImpl(languageCode, LANGUAGECODE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (com.scb.sci.customer.fm.LanguageCodeDocument.LanguageCode)get_store().add_element_user(LANGUAGECODE$18);
                return target;
            }
        }
        
        /**
         * Gets the "relationshipStartDate" element
         */
        public java.lang.String getRelationshipStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPSTARTDATE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "relationshipStartDate" element
         */
        public org.apache.xmlbeans.XmlString xgetRelationshipStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPSTARTDATE$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "relationshipStartDate" element
         */
        public void setRelationshipStartDate(java.lang.String relationshipStartDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPSTARTDATE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONSHIPSTARTDATE$20);
                }
                target.setStringValue(relationshipStartDate);
            }
        }
        
        /**
         * Sets (as xml) the "relationshipStartDate" element
         */
        public void xsetRelationshipStartDate(org.apache.xmlbeans.XmlString relationshipStartDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPSTARTDATE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONSHIPSTARTDATE$20);
                }
                target.set(relationshipStartDate);
            }
        }
        
        /**
         * Gets the "serviceLevelPriority" element
         */
        public com.scb.sci.customer.fm.ServiceLevelPriorityDocument.ServiceLevelPriority getServiceLevelPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ServiceLevelPriorityDocument.ServiceLevelPriority target = null;
                target = (com.scb.sci.customer.fm.ServiceLevelPriorityDocument.ServiceLevelPriority)get_store().find_element_user(SERVICELEVELPRIORITY$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "serviceLevelPriority" element
         */
        public void setServiceLevelPriority(com.scb.sci.customer.fm.ServiceLevelPriorityDocument.ServiceLevelPriority serviceLevelPriority)
        {
            generatedSetterHelperImpl(serviceLevelPriority, SERVICELEVELPRIORITY$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "serviceLevelPriority" element
         */
        public com.scb.sci.customer.fm.ServiceLevelPriorityDocument.ServiceLevelPriority addNewServiceLevelPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ServiceLevelPriorityDocument.ServiceLevelPriority target = null;
                target = (com.scb.sci.customer.fm.ServiceLevelPriorityDocument.ServiceLevelPriority)get_store().add_element_user(SERVICELEVELPRIORITY$22);
                return target;
            }
        }
        
        /**
         * Gets the "treaturyInd" element
         */
        public com.scb.sci.customer.fm.TreaturyIndDocument.TreaturyInd getTreaturyInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.TreaturyIndDocument.TreaturyInd target = null;
                target = (com.scb.sci.customer.fm.TreaturyIndDocument.TreaturyInd)get_store().find_element_user(TREATURYIND$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "treaturyInd" element
         */
        public void setTreaturyInd(com.scb.sci.customer.fm.TreaturyIndDocument.TreaturyInd treaturyInd)
        {
            generatedSetterHelperImpl(treaturyInd, TREATURYIND$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "treaturyInd" element
         */
        public com.scb.sci.customer.fm.TreaturyIndDocument.TreaturyInd addNewTreaturyInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.TreaturyIndDocument.TreaturyInd target = null;
                target = (com.scb.sci.customer.fm.TreaturyIndDocument.TreaturyInd)get_store().add_element_user(TREATURYIND$24);
                return target;
            }
        }
        
        /**
         * Gets the "operationStatus2" element
         */
        public com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2 getOperationStatus2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2 target = null;
                target = (com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2)get_store().find_element_user(OPERATIONSTATUS2$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "operationStatus2" element
         */
        public void setOperationStatus2(com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2 operationStatus2)
        {
            generatedSetterHelperImpl(operationStatus2, OPERATIONSTATUS2$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "operationStatus2" element
         */
        public com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2 addNewOperationStatus2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2 target = null;
                target = (com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2)get_store().add_element_user(OPERATIONSTATUS2$26);
                return target;
            }
        }
        
        /**
         * Gets the "operationStatus2EffDate" element
         */
        public java.lang.String getOperationStatus2EffDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUS2EFFDATE$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "operationStatus2EffDate" element
         */
        public org.apache.xmlbeans.XmlString xgetOperationStatus2EffDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONSTATUS2EFFDATE$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "operationStatus2EffDate" element
         */
        public void setOperationStatus2EffDate(java.lang.String operationStatus2EffDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUS2EFFDATE$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONSTATUS2EFFDATE$28);
                }
                target.setStringValue(operationStatus2EffDate);
            }
        }
        
        /**
         * Sets (as xml) the "operationStatus2EffDate" element
         */
        public void xsetOperationStatus2EffDate(org.apache.xmlbeans.XmlString operationStatus2EffDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONSTATUS2EFFDATE$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATIONSTATUS2EFFDATE$28);
                }
                target.set(operationStatus2EffDate);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$30, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$30, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$30);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$30);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$32, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$32, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$32);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$32);
                }
                target.set(changeIndicator);
            }
        }
    }
}
