/*
 * An XML document type.
 * Localname: mainProfileDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.MainProfileDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one mainProfileDetails(@) element.
 *
 * This is a complex type.
 */
public class MainProfileDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.MainProfileDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MainProfileDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAINPROFILEDETAILS$0 = 
        new javax.xml.namespace.QName("", "mainProfileDetails");
    
    
    /**
     * Gets the "mainProfileDetails" element
     */
    public com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails getMainProfileDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails target = null;
            target = (com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails)get_store().find_element_user(MAINPROFILEDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mainProfileDetails" element
     */
    public void setMainProfileDetails(com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails mainProfileDetails)
    {
        generatedSetterHelperImpl(mainProfileDetails, MAINPROFILEDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "mainProfileDetails" element
     */
    public com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails addNewMainProfileDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails target = null;
            target = (com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails)get_store().add_element_user(MAINPROFILEDETAILS$0);
            return target;
        }
    }
    /**
     * An XML mainProfileDetails(@).
     *
     * This is a complex type.
     */
    public static class MainProfileDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails
    {
        private static final long serialVersionUID = 1L;
        
        public MainProfileDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MAINPROFILE$0 = 
            new javax.xml.namespace.QName("", "mainProfile");
        private static final javax.xml.namespace.QName REGISTEREDADDRESS$2 = 
            new javax.xml.namespace.QName("", "registeredAddress");
        private static final javax.xml.namespace.QName CREDITGRADEDETAILS$4 = 
            new javax.xml.namespace.QName("", "creditGradeDetails");
        private static final javax.xml.namespace.QName ISICDETAILS$6 = 
            new javax.xml.namespace.QName("", "ISICDetails");
        private static final javax.xml.namespace.QName KYCDETAILS$8 = 
            new javax.xml.namespace.QName("", "kycDetails");
        
        
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
         * Gets the "registeredAddress" element
         */
        public com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress getRegisteredAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress target = null;
                target = (com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress)get_store().find_element_user(REGISTEREDADDRESS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "registeredAddress" element
         */
        public void setRegisteredAddress(com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress registeredAddress)
        {
            generatedSetterHelperImpl(registeredAddress, REGISTEREDADDRESS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "registeredAddress" element
         */
        public com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress addNewRegisteredAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress target = null;
                target = (com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress)get_store().add_element_user(REGISTEREDADDRESS$2);
                return target;
            }
        }
        
        /**
         * Gets the "creditGradeDetails" element
         */
        public com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails getCreditGradeDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails target = null;
                target = (com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails)get_store().find_element_user(CREDITGRADEDETAILS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "creditGradeDetails" element
         */
        public void setCreditGradeDetails(com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails creditGradeDetails)
        {
            generatedSetterHelperImpl(creditGradeDetails, CREDITGRADEDETAILS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "creditGradeDetails" element
         */
        public com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails addNewCreditGradeDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails target = null;
                target = (com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails)get_store().add_element_user(CREDITGRADEDETAILS$4);
                return target;
            }
        }
        
        /**
         * Gets the "ISICDetails" element
         */
        public com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails getISICDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails target = null;
                target = (com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails)get_store().find_element_user(ISICDETAILS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ISICDetails" element
         */
        public void setISICDetails(com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails isicDetails)
        {
            generatedSetterHelperImpl(isicDetails, ISICDETAILS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ISICDetails" element
         */
        public com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails addNewISICDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails target = null;
                target = (com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails)get_store().add_element_user(ISICDETAILS$6);
                return target;
            }
        }
        
        /**
         * Gets the "kycDetails" element
         */
        public com.scb.sci.customer.fm.KycDetailsDocument.KycDetails getKycDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.KycDetailsDocument.KycDetails target = null;
                target = (com.scb.sci.customer.fm.KycDetailsDocument.KycDetails)get_store().find_element_user(KYCDETAILS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "kycDetails" element
         */
        public void setKycDetails(com.scb.sci.customer.fm.KycDetailsDocument.KycDetails kycDetails)
        {
            generatedSetterHelperImpl(kycDetails, KYCDETAILS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "kycDetails" element
         */
        public com.scb.sci.customer.fm.KycDetailsDocument.KycDetails addNewKycDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.KycDetailsDocument.KycDetails target = null;
                target = (com.scb.sci.customer.fm.KycDetailsDocument.KycDetails)get_store().add_element_user(KYCDETAILS$8);
                return target;
            }
        }
    }
}
