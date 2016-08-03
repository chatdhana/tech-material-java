/*
 * An XML document type.
 * Localname: mainProfile
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.MainProfileDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one mainProfile(@) element.
 *
 * This is a complex type.
 */
public class MainProfileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.MainProfileDocument
{
    private static final long serialVersionUID = 1L;
    
    public MainProfileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAINPROFILE$0 = 
        new javax.xml.namespace.QName("", "mainProfile");
    
    
    /**
     * Gets the "mainProfile" element
     */
    public com.scb.sci.customer.fm.MainProfileDocument.MainProfile getMainProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.MainProfileDocument.MainProfile target = null;
            target = (com.scb.sci.customer.fm.MainProfileDocument.MainProfile)get_store().find_element_user(MAINPROFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mainProfile" element
     */
    public void setMainProfile(com.scb.sci.customer.fm.MainProfileDocument.MainProfile mainProfile)
    {
        generatedSetterHelperImpl(mainProfile, MAINPROFILE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "mainProfile" element
     */
    public com.scb.sci.customer.fm.MainProfileDocument.MainProfile addNewMainProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.MainProfileDocument.MainProfile target = null;
            target = (com.scb.sci.customer.fm.MainProfileDocument.MainProfile)get_store().add_element_user(MAINPROFILE$0);
            return target;
        }
    }
    /**
     * An XML mainProfile(@).
     *
     * This is a complex type.
     */
    public static class MainProfileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.MainProfileDocument.MainProfile
    {
        private static final long serialVersionUID = 1L;
        
        public MainProfileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SHORTNAME$2 = 
            new javax.xml.namespace.QName("", "shortName");
        private static final javax.xml.namespace.QName LEGALNAME$4 = 
            new javax.xml.namespace.QName("", "legalName");
        private static final javax.xml.namespace.QName LEGALCONSTITUTION$6 = 
            new javax.xml.namespace.QName("", "legalConstitution");
        private static final javax.xml.namespace.QName INCORPORATEDCOUNTRY$8 = 
            new javax.xml.namespace.QName("", "incorporatedCountry");
        private static final javax.xml.namespace.QName INCORPORATIONNUMBER$10 = 
            new javax.xml.namespace.QName("", "incorporationNumber");
        private static final javax.xml.namespace.QName INCORPORATIONDATE$12 = 
            new javax.xml.namespace.QName("", "incorporationDate");
        private static final javax.xml.namespace.QName CUSTOMERTYPE$14 = 
            new javax.xml.namespace.QName("", "customerType");
        private static final javax.xml.namespace.QName RELATIONSHIPSTARTDATE$16 = 
            new javax.xml.namespace.QName("", "relationshipStartDate");
        private static final javax.xml.namespace.QName SEGMENTCODE$18 = 
            new javax.xml.namespace.QName("", "segmentCode");
        private static final javax.xml.namespace.QName SUBSEGMENTCODE$20 = 
            new javax.xml.namespace.QName("", "subSegmentCode");
        private static final javax.xml.namespace.QName BASELCUSTOMERSEGMENT$22 = 
            new javax.xml.namespace.QName("", "baselCustomerSegment");
        private static final javax.xml.namespace.QName BASELCUSTOMERSUBSEGMENT$24 = 
            new javax.xml.namespace.QName("", "baselCustomerSubSegment");
        private static final javax.xml.namespace.QName BUSINESSTYPE$26 = 
            new javax.xml.namespace.QName("", "businessType");
        private static final javax.xml.namespace.QName ENVRISKGRADE$28 = 
            new javax.xml.namespace.QName("", "envRiskGrade");
        private static final javax.xml.namespace.QName TOP1000BANK$30 = 
            new javax.xml.namespace.QName("", "top1000Bank");
        private static final javax.xml.namespace.QName REFERRALSTATUS$32 = 
            new javax.xml.namespace.QName("", "referralStatus");
        private static final javax.xml.namespace.QName OPERATIONSTATUS1$34 = 
            new javax.xml.namespace.QName("", "operationStatus1");
        private static final javax.xml.namespace.QName OPERATIONSTATUS1EFFDATE$36 = 
            new javax.xml.namespace.QName("", "operationStatus1EffDate");
        private static final javax.xml.namespace.QName BORROWEREXCEPTIONCHKIND$38 = 
            new javax.xml.namespace.QName("", "borrowerExceptionChkInd");
        private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$40 = 
            new javax.xml.namespace.QName("", "updateStatusIndicator");
        private static final javax.xml.namespace.QName CHANGEINDICATOR$42 = 
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
         * Gets the "shortName" element
         */
        public java.lang.String getShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTNAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "shortName" element
         */
        public org.apache.xmlbeans.XmlString xgetShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTNAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "shortName" element
         */
        public void setShortName(java.lang.String shortName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHORTNAME$2);
                }
                target.setStringValue(shortName);
            }
        }
        
        /**
         * Sets (as xml) the "shortName" element
         */
        public void xsetShortName(org.apache.xmlbeans.XmlString shortName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHORTNAME$2);
                }
                target.set(shortName);
            }
        }
        
        /**
         * Gets the "legalName" element
         */
        public java.lang.String getLegalName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALNAME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "legalName" element
         */
        public org.apache.xmlbeans.XmlString xgetLegalName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALNAME$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "legalName" element
         */
        public void setLegalName(java.lang.String legalName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEGALNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEGALNAME$4);
                }
                target.setStringValue(legalName);
            }
        }
        
        /**
         * Sets (as xml) the "legalName" element
         */
        public void xsetLegalName(org.apache.xmlbeans.XmlString legalName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEGALNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEGALNAME$4);
                }
                target.set(legalName);
            }
        }
        
        /**
         * Gets the "legalConstitution" element
         */
        public com.scb.sci.customer.fm.LegalConstitutionDocument.LegalConstitution getLegalConstitution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.LegalConstitutionDocument.LegalConstitution target = null;
                target = (com.scb.sci.customer.fm.LegalConstitutionDocument.LegalConstitution)get_store().find_element_user(LEGALCONSTITUTION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "legalConstitution" element
         */
        public void setLegalConstitution(com.scb.sci.customer.fm.LegalConstitutionDocument.LegalConstitution legalConstitution)
        {
            generatedSetterHelperImpl(legalConstitution, LEGALCONSTITUTION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "legalConstitution" element
         */
        public com.scb.sci.customer.fm.LegalConstitutionDocument.LegalConstitution addNewLegalConstitution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.LegalConstitutionDocument.LegalConstitution target = null;
                target = (com.scb.sci.customer.fm.LegalConstitutionDocument.LegalConstitution)get_store().add_element_user(LEGALCONSTITUTION$6);
                return target;
            }
        }
        
        /**
         * Gets the "incorporatedCountry" element
         */
        public java.lang.String getIncorporatedCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATEDCOUNTRY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "incorporatedCountry" element
         */
        public org.apache.xmlbeans.XmlString xgetIncorporatedCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCORPORATEDCOUNTRY$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "incorporatedCountry" element
         */
        public void setIncorporatedCountry(java.lang.String incorporatedCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATEDCOUNTRY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCORPORATEDCOUNTRY$8);
                }
                target.setStringValue(incorporatedCountry);
            }
        }
        
        /**
         * Sets (as xml) the "incorporatedCountry" element
         */
        public void xsetIncorporatedCountry(org.apache.xmlbeans.XmlString incorporatedCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCORPORATEDCOUNTRY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCORPORATEDCOUNTRY$8);
                }
                target.set(incorporatedCountry);
            }
        }
        
        /**
         * Gets the "incorporationNumber" element
         */
        public java.lang.String getIncorporationNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATIONNUMBER$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "incorporationNumber" element
         */
        public org.apache.xmlbeans.XmlString xgetIncorporationNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCORPORATIONNUMBER$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "incorporationNumber" element
         */
        public void setIncorporationNumber(java.lang.String incorporationNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATIONNUMBER$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCORPORATIONNUMBER$10);
                }
                target.setStringValue(incorporationNumber);
            }
        }
        
        /**
         * Sets (as xml) the "incorporationNumber" element
         */
        public void xsetIncorporationNumber(org.apache.xmlbeans.XmlString incorporationNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCORPORATIONNUMBER$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCORPORATIONNUMBER$10);
                }
                target.set(incorporationNumber);
            }
        }
        
        /**
         * Gets the "incorporationDate" element
         */
        public java.lang.String getIncorporationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATIONDATE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "incorporationDate" element
         */
        public org.apache.xmlbeans.XmlString xgetIncorporationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCORPORATIONDATE$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "incorporationDate" element
         */
        public void setIncorporationDate(java.lang.String incorporationDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCORPORATIONDATE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCORPORATIONDATE$12);
                }
                target.setStringValue(incorporationDate);
            }
        }
        
        /**
         * Sets (as xml) the "incorporationDate" element
         */
        public void xsetIncorporationDate(org.apache.xmlbeans.XmlString incorporationDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCORPORATIONDATE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCORPORATIONDATE$12);
                }
                target.set(incorporationDate);
            }
        }
        
        /**
         * Gets the "customerType" element
         */
        public com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType getCustomerType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType target = null;
                target = (com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType)get_store().find_element_user(CUSTOMERTYPE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "customerType" element
         */
        public void setCustomerType(com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType customerType)
        {
            generatedSetterHelperImpl(customerType, CUSTOMERTYPE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "customerType" element
         */
        public com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType addNewCustomerType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType target = null;
                target = (com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType)get_store().add_element_user(CUSTOMERTYPE$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPSTARTDATE$16, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPSTARTDATE$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPSTARTDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONSHIPSTARTDATE$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPSTARTDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONSHIPSTARTDATE$16);
                }
                target.set(relationshipStartDate);
            }
        }
        
        /**
         * Gets the "segmentCode" element
         */
        public com.scb.sci.customer.fm.SegmentCodeDocument.SegmentCode getSegmentCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SegmentCodeDocument.SegmentCode target = null;
                target = (com.scb.sci.customer.fm.SegmentCodeDocument.SegmentCode)get_store().find_element_user(SEGMENTCODE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "segmentCode" element
         */
        public void setSegmentCode(com.scb.sci.customer.fm.SegmentCodeDocument.SegmentCode segmentCode)
        {
            generatedSetterHelperImpl(segmentCode, SEGMENTCODE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "segmentCode" element
         */
        public com.scb.sci.customer.fm.SegmentCodeDocument.SegmentCode addNewSegmentCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SegmentCodeDocument.SegmentCode target = null;
                target = (com.scb.sci.customer.fm.SegmentCodeDocument.SegmentCode)get_store().add_element_user(SEGMENTCODE$18);
                return target;
            }
        }
        
        /**
         * Gets the "subSegmentCode" element
         */
        public com.scb.sci.customer.fm.SubSegmentCodeDocument.SubSegmentCode getSubSegmentCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SubSegmentCodeDocument.SubSegmentCode target = null;
                target = (com.scb.sci.customer.fm.SubSegmentCodeDocument.SubSegmentCode)get_store().find_element_user(SUBSEGMENTCODE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "subSegmentCode" element
         */
        public void setSubSegmentCode(com.scb.sci.customer.fm.SubSegmentCodeDocument.SubSegmentCode subSegmentCode)
        {
            generatedSetterHelperImpl(subSegmentCode, SUBSEGMENTCODE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "subSegmentCode" element
         */
        public com.scb.sci.customer.fm.SubSegmentCodeDocument.SubSegmentCode addNewSubSegmentCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SubSegmentCodeDocument.SubSegmentCode target = null;
                target = (com.scb.sci.customer.fm.SubSegmentCodeDocument.SubSegmentCode)get_store().add_element_user(SUBSEGMENTCODE$20);
                return target;
            }
        }
        
        /**
         * Gets the "baselCustomerSegment" element
         */
        public com.scb.sci.customer.fm.BaselCustomerSegmentDocument.BaselCustomerSegment getBaselCustomerSegment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.BaselCustomerSegmentDocument.BaselCustomerSegment target = null;
                target = (com.scb.sci.customer.fm.BaselCustomerSegmentDocument.BaselCustomerSegment)get_store().find_element_user(BASELCUSTOMERSEGMENT$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "baselCustomerSegment" element
         */
        public void setBaselCustomerSegment(com.scb.sci.customer.fm.BaselCustomerSegmentDocument.BaselCustomerSegment baselCustomerSegment)
        {
            generatedSetterHelperImpl(baselCustomerSegment, BASELCUSTOMERSEGMENT$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "baselCustomerSegment" element
         */
        public com.scb.sci.customer.fm.BaselCustomerSegmentDocument.BaselCustomerSegment addNewBaselCustomerSegment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.BaselCustomerSegmentDocument.BaselCustomerSegment target = null;
                target = (com.scb.sci.customer.fm.BaselCustomerSegmentDocument.BaselCustomerSegment)get_store().add_element_user(BASELCUSTOMERSEGMENT$22);
                return target;
            }
        }
        
        /**
         * Gets the "baselCustomerSubSegment" element
         */
        public com.scb.sci.customer.fm.BaselCustomerSubSegmentDocument.BaselCustomerSubSegment getBaselCustomerSubSegment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.BaselCustomerSubSegmentDocument.BaselCustomerSubSegment target = null;
                target = (com.scb.sci.customer.fm.BaselCustomerSubSegmentDocument.BaselCustomerSubSegment)get_store().find_element_user(BASELCUSTOMERSUBSEGMENT$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "baselCustomerSubSegment" element
         */
        public void setBaselCustomerSubSegment(com.scb.sci.customer.fm.BaselCustomerSubSegmentDocument.BaselCustomerSubSegment baselCustomerSubSegment)
        {
            generatedSetterHelperImpl(baselCustomerSubSegment, BASELCUSTOMERSUBSEGMENT$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "baselCustomerSubSegment" element
         */
        public com.scb.sci.customer.fm.BaselCustomerSubSegmentDocument.BaselCustomerSubSegment addNewBaselCustomerSubSegment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.BaselCustomerSubSegmentDocument.BaselCustomerSubSegment target = null;
                target = (com.scb.sci.customer.fm.BaselCustomerSubSegmentDocument.BaselCustomerSubSegment)get_store().add_element_user(BASELCUSTOMERSUBSEGMENT$24);
                return target;
            }
        }
        
        /**
         * Gets the "businessType" element
         */
        public com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType getBusinessType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType target = null;
                target = (com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType)get_store().find_element_user(BUSINESSTYPE$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "businessType" element
         */
        public void setBusinessType(com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType businessType)
        {
            generatedSetterHelperImpl(businessType, BUSINESSTYPE$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "businessType" element
         */
        public com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType addNewBusinessType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType target = null;
                target = (com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType)get_store().add_element_user(BUSINESSTYPE$26);
                return target;
            }
        }
        
        /**
         * Gets the "envRiskGrade" element
         */
        public com.scb.sci.customer.fm.EnvRiskGradeDocument.EnvRiskGrade getEnvRiskGrade()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.EnvRiskGradeDocument.EnvRiskGrade target = null;
                target = (com.scb.sci.customer.fm.EnvRiskGradeDocument.EnvRiskGrade)get_store().find_element_user(ENVRISKGRADE$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "envRiskGrade" element
         */
        public void setEnvRiskGrade(com.scb.sci.customer.fm.EnvRiskGradeDocument.EnvRiskGrade envRiskGrade)
        {
            generatedSetterHelperImpl(envRiskGrade, ENVRISKGRADE$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "envRiskGrade" element
         */
        public com.scb.sci.customer.fm.EnvRiskGradeDocument.EnvRiskGrade addNewEnvRiskGrade()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.EnvRiskGradeDocument.EnvRiskGrade target = null;
                target = (com.scb.sci.customer.fm.EnvRiskGradeDocument.EnvRiskGrade)get_store().add_element_user(ENVRISKGRADE$28);
                return target;
            }
        }
        
        /**
         * Gets the "top1000Bank" element
         */
        public java.lang.String getTop1000Bank()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOP1000BANK$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "top1000Bank" element
         */
        public org.apache.xmlbeans.XmlString xgetTop1000Bank()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOP1000BANK$30, 0);
                return target;
            }
        }
        
        /**
         * Sets the "top1000Bank" element
         */
        public void setTop1000Bank(java.lang.String top1000Bank)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOP1000BANK$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOP1000BANK$30);
                }
                target.setStringValue(top1000Bank);
            }
        }
        
        /**
         * Sets (as xml) the "top1000Bank" element
         */
        public void xsetTop1000Bank(org.apache.xmlbeans.XmlString top1000Bank)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOP1000BANK$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOP1000BANK$30);
                }
                target.set(top1000Bank);
            }
        }
        
        /**
         * Gets the "referralStatus" element
         */
        public com.scb.sci.customer.fm.ReferralStatusDocument.ReferralStatus getReferralStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ReferralStatusDocument.ReferralStatus target = null;
                target = (com.scb.sci.customer.fm.ReferralStatusDocument.ReferralStatus)get_store().find_element_user(REFERRALSTATUS$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "referralStatus" element
         */
        public void setReferralStatus(com.scb.sci.customer.fm.ReferralStatusDocument.ReferralStatus referralStatus)
        {
            generatedSetterHelperImpl(referralStatus, REFERRALSTATUS$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "referralStatus" element
         */
        public com.scb.sci.customer.fm.ReferralStatusDocument.ReferralStatus addNewReferralStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ReferralStatusDocument.ReferralStatus target = null;
                target = (com.scb.sci.customer.fm.ReferralStatusDocument.ReferralStatus)get_store().add_element_user(REFERRALSTATUS$32);
                return target;
            }
        }
        
        /**
         * Gets the "operationStatus1" element
         */
        public com.scb.sci.customer.fm.OperationStatus1Document.OperationStatus1 getOperationStatus1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.OperationStatus1Document.OperationStatus1 target = null;
                target = (com.scb.sci.customer.fm.OperationStatus1Document.OperationStatus1)get_store().find_element_user(OPERATIONSTATUS1$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "operationStatus1" element
         */
        public void setOperationStatus1(com.scb.sci.customer.fm.OperationStatus1Document.OperationStatus1 operationStatus1)
        {
            generatedSetterHelperImpl(operationStatus1, OPERATIONSTATUS1$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "operationStatus1" element
         */
        public com.scb.sci.customer.fm.OperationStatus1Document.OperationStatus1 addNewOperationStatus1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.OperationStatus1Document.OperationStatus1 target = null;
                target = (com.scb.sci.customer.fm.OperationStatus1Document.OperationStatus1)get_store().add_element_user(OPERATIONSTATUS1$34);
                return target;
            }
        }
        
        /**
         * Gets the "operationStatus1EffDate" element
         */
        public java.lang.String getOperationStatus1EffDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUS1EFFDATE$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "operationStatus1EffDate" element
         */
        public org.apache.xmlbeans.XmlString xgetOperationStatus1EffDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONSTATUS1EFFDATE$36, 0);
                return target;
            }
        }
        
        /**
         * Sets the "operationStatus1EffDate" element
         */
        public void setOperationStatus1EffDate(java.lang.String operationStatus1EffDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSTATUS1EFFDATE$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONSTATUS1EFFDATE$36);
                }
                target.setStringValue(operationStatus1EffDate);
            }
        }
        
        /**
         * Sets (as xml) the "operationStatus1EffDate" element
         */
        public void xsetOperationStatus1EffDate(org.apache.xmlbeans.XmlString operationStatus1EffDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONSTATUS1EFFDATE$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATIONSTATUS1EFFDATE$36);
                }
                target.set(operationStatus1EffDate);
            }
        }
        
        /**
         * Gets the "borrowerExceptionChkInd" element
         */
        public java.lang.String getBorrowerExceptionChkInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BORROWEREXCEPTIONCHKIND$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "borrowerExceptionChkInd" element
         */
        public org.apache.xmlbeans.XmlString xgetBorrowerExceptionChkInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BORROWEREXCEPTIONCHKIND$38, 0);
                return target;
            }
        }
        
        /**
         * Sets the "borrowerExceptionChkInd" element
         */
        public void setBorrowerExceptionChkInd(java.lang.String borrowerExceptionChkInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BORROWEREXCEPTIONCHKIND$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BORROWEREXCEPTIONCHKIND$38);
                }
                target.setStringValue(borrowerExceptionChkInd);
            }
        }
        
        /**
         * Sets (as xml) the "borrowerExceptionChkInd" element
         */
        public void xsetBorrowerExceptionChkInd(org.apache.xmlbeans.XmlString borrowerExceptionChkInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BORROWEREXCEPTIONCHKIND$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BORROWEREXCEPTIONCHKIND$38);
                }
                target.set(borrowerExceptionChkInd);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$40, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$40, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$40);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$40);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$42, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$42, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$42);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$42);
                }
                target.set(changeIndicator);
            }
        }
    }
}
