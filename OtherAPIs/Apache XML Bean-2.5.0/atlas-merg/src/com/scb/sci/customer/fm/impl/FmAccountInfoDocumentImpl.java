/*
 * An XML document type.
 * Localname: fmAccountInfo
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmAccountInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmAccountInfo(@) element.
 *
 * This is a complex type.
 */
public class FmAccountInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAccountInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmAccountInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMACCOUNTINFO$0 = 
        new javax.xml.namespace.QName("", "fmAccountInfo");
    
    
    /**
     * Gets the "fmAccountInfo" element
     */
    public com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo getFmAccountInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo target = null;
            target = (com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo)get_store().find_element_user(FMACCOUNTINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmAccountInfo" element
     */
    public void setFmAccountInfo(com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo fmAccountInfo)
    {
        generatedSetterHelperImpl(fmAccountInfo, FMACCOUNTINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmAccountInfo" element
     */
    public com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo addNewFmAccountInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo target = null;
            target = (com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo)get_store().add_element_user(FMACCOUNTINFO$0);
            return target;
        }
    }
    /**
     * An XML fmAccountInfo(@).
     *
     * This is a complex type.
     */
    public static class FmAccountInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo
    {
        private static final long serialVersionUID = 1L;
        
        public FmAccountInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FMPROFILEINFO$0 = 
            new javax.xml.namespace.QName("", "fmProfileInfo");
        private static final javax.xml.namespace.QName FMENTITYINFO$2 = 
            new javax.xml.namespace.QName("", "fmEntityInfo");
        private static final javax.xml.namespace.QName FMENTITYMOREINFO$4 = 
            new javax.xml.namespace.QName("", "fmEntityMoreInfo");
        private static final javax.xml.namespace.QName FMHIERARCHYDETAILS$6 = 
            new javax.xml.namespace.QName("", "fmHierarchyDetails");
        private static final javax.xml.namespace.QName FMADDRESSDETAILS$8 = 
            new javax.xml.namespace.QName("", "fmAddressDetails");
        private static final javax.xml.namespace.QName FMALTADDRESSDETAILS$10 = 
            new javax.xml.namespace.QName("", "fmAltAddressDetails");
        private static final javax.xml.namespace.QName FMBRANCHDETAILS$12 = 
            new javax.xml.namespace.QName("", "fmBranchDetails");
        private static final javax.xml.namespace.QName FMSYSCONTACTDETAILS$14 = 
            new javax.xml.namespace.QName("", "fmSysContactDetails");
        private static final javax.xml.namespace.QName FMALTSYSCONTACTDETAILS$16 = 
            new javax.xml.namespace.QName("", "fmAltSysContactDetails");
        private static final javax.xml.namespace.QName FMCROSSREFERENCEDETAILS$18 = 
            new javax.xml.namespace.QName("", "fmCrossReferenceDetails");
        private static final javax.xml.namespace.QName FMTCIDDETAILS$20 = 
            new javax.xml.namespace.QName("", "fmTCIDDetails");
        private static final javax.xml.namespace.QName FMSCBINFO$22 = 
            new javax.xml.namespace.QName("", "fmScbInfo");
        private static final javax.xml.namespace.QName FMSYNINFO$24 = 
            new javax.xml.namespace.QName("", "fmSynInfo");
        
        
        /**
         * Gets the "fmProfileInfo" element
         */
        public com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo getFmProfileInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo target = null;
                target = (com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo)get_store().find_element_user(FMPROFILEINFO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fmProfileInfo" element
         */
        public void setFmProfileInfo(com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo fmProfileInfo)
        {
            generatedSetterHelperImpl(fmProfileInfo, FMPROFILEINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmProfileInfo" element
         */
        public com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo addNewFmProfileInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo target = null;
                target = (com.scb.sci.customer.fm.FmProfileInfoDocument.FmProfileInfo)get_store().add_element_user(FMPROFILEINFO$0);
                return target;
            }
        }
        
        /**
         * Gets the "fmEntityInfo" element
         */
        public com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo getFmEntityInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo target = null;
                target = (com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo)get_store().find_element_user(FMENTITYINFO$2, 0);
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
            generatedSetterHelperImpl(fmEntityInfo, FMENTITYINFO$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (com.scb.sci.customer.fm.FmEntityInfoDocument.FmEntityInfo)get_store().add_element_user(FMENTITYINFO$2);
                return target;
            }
        }
        
        /**
         * Gets the "fmEntityMoreInfo" element
         */
        public com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo getFmEntityMoreInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo target = null;
                target = (com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo)get_store().find_element_user(FMENTITYMOREINFO$4, 0);
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
            generatedSetterHelperImpl(fmEntityMoreInfo, FMENTITYMOREINFO$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (com.scb.sci.customer.fm.FmEntityMoreInfoDocument.FmEntityMoreInfo)get_store().add_element_user(FMENTITYMOREINFO$4);
                return target;
            }
        }
        
        /**
         * Gets the "fmHierarchyDetails" element
         */
        public com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails getFmHierarchyDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails target = null;
                target = (com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails)get_store().find_element_user(FMHIERARCHYDETAILS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fmHierarchyDetails" element
         */
        public void setFmHierarchyDetails(com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails fmHierarchyDetails)
        {
            generatedSetterHelperImpl(fmHierarchyDetails, FMHIERARCHYDETAILS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmHierarchyDetails" element
         */
        public com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails addNewFmHierarchyDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails target = null;
                target = (com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails)get_store().add_element_user(FMHIERARCHYDETAILS$6);
                return target;
            }
        }
        
        /**
         * Gets the "fmAddressDetails" element
         */
        public com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails getFmAddressDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails target = null;
                target = (com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails)get_store().find_element_user(FMADDRESSDETAILS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fmAddressDetails" element
         */
        public void setFmAddressDetails(com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails fmAddressDetails)
        {
            generatedSetterHelperImpl(fmAddressDetails, FMADDRESSDETAILS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmAddressDetails" element
         */
        public com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails addNewFmAddressDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails target = null;
                target = (com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails)get_store().add_element_user(FMADDRESSDETAILS$8);
                return target;
            }
        }
        
        /**
         * Gets the "fmAltAddressDetails" element
         */
        public com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails getFmAltAddressDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails target = null;
                target = (com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails)get_store().find_element_user(FMALTADDRESSDETAILS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fmAltAddressDetails" element
         */
        public boolean isSetFmAltAddressDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMALTADDRESSDETAILS$10) != 0;
            }
        }
        
        /**
         * Sets the "fmAltAddressDetails" element
         */
        public void setFmAltAddressDetails(com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails fmAltAddressDetails)
        {
            generatedSetterHelperImpl(fmAltAddressDetails, FMALTADDRESSDETAILS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmAltAddressDetails" element
         */
        public com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails addNewFmAltAddressDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails target = null;
                target = (com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails)get_store().add_element_user(FMALTADDRESSDETAILS$10);
                return target;
            }
        }
        
        /**
         * Unsets the "fmAltAddressDetails" element
         */
        public void unsetFmAltAddressDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMALTADDRESSDETAILS$10, 0);
            }
        }
        
        /**
         * Gets the "fmBranchDetails" element
         */
        public com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails getFmBranchDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails target = null;
                target = (com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails)get_store().find_element_user(FMBRANCHDETAILS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fmBranchDetails" element
         */
        public boolean isSetFmBranchDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMBRANCHDETAILS$12) != 0;
            }
        }
        
        /**
         * Sets the "fmBranchDetails" element
         */
        public void setFmBranchDetails(com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails fmBranchDetails)
        {
            generatedSetterHelperImpl(fmBranchDetails, FMBRANCHDETAILS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmBranchDetails" element
         */
        public com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails addNewFmBranchDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails target = null;
                target = (com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails)get_store().add_element_user(FMBRANCHDETAILS$12);
                return target;
            }
        }
        
        /**
         * Unsets the "fmBranchDetails" element
         */
        public void unsetFmBranchDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMBRANCHDETAILS$12, 0);
            }
        }
        
        /**
         * Gets the "fmSysContactDetails" element
         */
        public com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails getFmSysContactDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails target = null;
                target = (com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails)get_store().find_element_user(FMSYSCONTACTDETAILS$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fmSysContactDetails" element
         */
        public boolean isSetFmSysContactDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMSYSCONTACTDETAILS$14) != 0;
            }
        }
        
        /**
         * Sets the "fmSysContactDetails" element
         */
        public void setFmSysContactDetails(com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails fmSysContactDetails)
        {
            generatedSetterHelperImpl(fmSysContactDetails, FMSYSCONTACTDETAILS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmSysContactDetails" element
         */
        public com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails addNewFmSysContactDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails target = null;
                target = (com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails)get_store().add_element_user(FMSYSCONTACTDETAILS$14);
                return target;
            }
        }
        
        /**
         * Unsets the "fmSysContactDetails" element
         */
        public void unsetFmSysContactDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMSYSCONTACTDETAILS$14, 0);
            }
        }
        
        /**
         * Gets the "fmAltSysContactDetails" element
         */
        public com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails getFmAltSysContactDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails target = null;
                target = (com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails)get_store().find_element_user(FMALTSYSCONTACTDETAILS$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fmAltSysContactDetails" element
         */
        public boolean isSetFmAltSysContactDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMALTSYSCONTACTDETAILS$16) != 0;
            }
        }
        
        /**
         * Sets the "fmAltSysContactDetails" element
         */
        public void setFmAltSysContactDetails(com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails fmAltSysContactDetails)
        {
            generatedSetterHelperImpl(fmAltSysContactDetails, FMALTSYSCONTACTDETAILS$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmAltSysContactDetails" element
         */
        public com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails addNewFmAltSysContactDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails target = null;
                target = (com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails)get_store().add_element_user(FMALTSYSCONTACTDETAILS$16);
                return target;
            }
        }
        
        /**
         * Unsets the "fmAltSysContactDetails" element
         */
        public void unsetFmAltSysContactDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMALTSYSCONTACTDETAILS$16, 0);
            }
        }
        
        /**
         * Gets the "fmCrossReferenceDetails" element
         */
        public com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails getFmCrossReferenceDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails target = null;
                target = (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails)get_store().find_element_user(FMCROSSREFERENCEDETAILS$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fmCrossReferenceDetails" element
         */
        public void setFmCrossReferenceDetails(com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails fmCrossReferenceDetails)
        {
            generatedSetterHelperImpl(fmCrossReferenceDetails, FMCROSSREFERENCEDETAILS$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmCrossReferenceDetails" element
         */
        public com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails addNewFmCrossReferenceDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails target = null;
                target = (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails)get_store().add_element_user(FMCROSSREFERENCEDETAILS$18);
                return target;
            }
        }
        
        /**
         * Gets the "fmTCIDDetails" element
         */
        public com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails getFmTCIDDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails target = null;
                target = (com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails)get_store().find_element_user(FMTCIDDETAILS$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fmTCIDDetails" element
         */
        public boolean isSetFmTCIDDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMTCIDDETAILS$20) != 0;
            }
        }
        
        /**
         * Sets the "fmTCIDDetails" element
         */
        public void setFmTCIDDetails(com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails fmTCIDDetails)
        {
            generatedSetterHelperImpl(fmTCIDDetails, FMTCIDDETAILS$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmTCIDDetails" element
         */
        public com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails addNewFmTCIDDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails target = null;
                target = (com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails)get_store().add_element_user(FMTCIDDETAILS$20);
                return target;
            }
        }
        
        /**
         * Unsets the "fmTCIDDetails" element
         */
        public void unsetFmTCIDDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMTCIDDETAILS$20, 0);
            }
        }
        
        /**
         * Gets the "fmScbInfo" element
         */
        public com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo getFmScbInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo target = null;
                target = (com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo)get_store().find_element_user(FMSCBINFO$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fmScbInfo" element
         */
        public boolean isSetFmScbInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMSCBINFO$22) != 0;
            }
        }
        
        /**
         * Sets the "fmScbInfo" element
         */
        public void setFmScbInfo(com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo fmScbInfo)
        {
            generatedSetterHelperImpl(fmScbInfo, FMSCBINFO$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (com.scb.sci.customer.fm.FmScbInfoDocument.FmScbInfo)get_store().add_element_user(FMSCBINFO$22);
                return target;
            }
        }
        
        /**
         * Unsets the "fmScbInfo" element
         */
        public void unsetFmScbInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMSCBINFO$22, 0);
            }
        }
        
        /**
         * Gets the "fmSynInfo" element
         */
        public com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo getFmSynInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo target = null;
                target = (com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo)get_store().find_element_user(FMSYNINFO$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fmSynInfo" element
         */
        public boolean isSetFmSynInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMSYNINFO$24) != 0;
            }
        }
        
        /**
         * Sets the "fmSynInfo" element
         */
        public void setFmSynInfo(com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo fmSynInfo)
        {
            generatedSetterHelperImpl(fmSynInfo, FMSYNINFO$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (com.scb.sci.customer.fm.FmSynInfoDocument.FmSynInfo)get_store().add_element_user(FMSYNINFO$24);
                return target;
            }
        }
        
        /**
         * Unsets the "fmSynInfo" element
         */
        public void unsetFmSynInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMSYNINFO$24, 0);
            }
        }
    }
}
