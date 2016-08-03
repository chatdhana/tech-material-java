/*
 * An XML document type.
 * Localname: subProfileDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.SubProfileDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one subProfileDetails(@) element.
 *
 * This is a complex type.
 */
public class SubProfileDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.SubProfileDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubProfileDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBPROFILEDETAILS$0 = 
        new javax.xml.namespace.QName("", "subProfileDetails");
    
    
    /**
     * Gets the "subProfileDetails" element
     */
    public com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails getSubProfileDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails target = null;
            target = (com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails)get_store().find_element_user(SUBPROFILEDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subProfileDetails" element
     */
    public void setSubProfileDetails(com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails subProfileDetails)
    {
        generatedSetterHelperImpl(subProfileDetails, SUBPROFILEDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subProfileDetails" element
     */
    public com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails addNewSubProfileDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails target = null;
            target = (com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails)get_store().add_element_user(SUBPROFILEDETAILS$0);
            return target;
        }
    }
    /**
     * An XML subProfileDetails(@).
     *
     * This is a complex type.
     */
    public static class SubProfileDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails
    {
        private static final long serialVersionUID = 1L;
        
        public SubProfileDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBPROFILE$0 = 
            new javax.xml.namespace.QName("", "subProfile");
        private static final javax.xml.namespace.QName OFFICIALADDRESSDETAILS$2 = 
            new javax.xml.namespace.QName("", "officialAddressDetails");
        private static final javax.xml.namespace.QName EMPRELATIONSHIPDETAILS$4 = 
            new javax.xml.namespace.QName("", "empRelationshipDetails");
        
        
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
         * Gets the "officialAddressDetails" element
         */
        public com.scb.sci.customer.fm.OfficialAddressDetailsDocument.OfficialAddressDetails getOfficialAddressDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.OfficialAddressDetailsDocument.OfficialAddressDetails target = null;
                target = (com.scb.sci.customer.fm.OfficialAddressDetailsDocument.OfficialAddressDetails)get_store().find_element_user(OFFICIALADDRESSDETAILS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "officialAddressDetails" element
         */
        public void setOfficialAddressDetails(com.scb.sci.customer.fm.OfficialAddressDetailsDocument.OfficialAddressDetails officialAddressDetails)
        {
            generatedSetterHelperImpl(officialAddressDetails, OFFICIALADDRESSDETAILS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "officialAddressDetails" element
         */
        public com.scb.sci.customer.fm.OfficialAddressDetailsDocument.OfficialAddressDetails addNewOfficialAddressDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.OfficialAddressDetailsDocument.OfficialAddressDetails target = null;
                target = (com.scb.sci.customer.fm.OfficialAddressDetailsDocument.OfficialAddressDetails)get_store().add_element_user(OFFICIALADDRESSDETAILS$2);
                return target;
            }
        }
        
        /**
         * Gets the "empRelationshipDetails" element
         */
        public com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails getEmpRelationshipDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails target = null;
                target = (com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails)get_store().find_element_user(EMPRELATIONSHIPDETAILS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "empRelationshipDetails" element
         */
        public void setEmpRelationshipDetails(com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails empRelationshipDetails)
        {
            generatedSetterHelperImpl(empRelationshipDetails, EMPRELATIONSHIPDETAILS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "empRelationshipDetails" element
         */
        public com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails addNewEmpRelationshipDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails target = null;
                target = (com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails)get_store().add_element_user(EMPRELATIONSHIPDETAILS$4);
                return target;
            }
        }
    }
}
