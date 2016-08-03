/*
 * An XML document type.
 * Localname: kycDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.KycDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one kycDetails(@) element.
 *
 * This is a complex type.
 */
public class KycDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.KycDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public KycDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KYCDETAILS$0 = 
        new javax.xml.namespace.QName("", "kycDetails");
    
    
    /**
     * Gets the "kycDetails" element
     */
    public com.scb.sci.customer.fm.KycDetailsDocument.KycDetails getKycDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.KycDetailsDocument.KycDetails target = null;
            target = (com.scb.sci.customer.fm.KycDetailsDocument.KycDetails)get_store().find_element_user(KYCDETAILS$0, 0);
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
        generatedSetterHelperImpl(kycDetails, KYCDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.scb.sci.customer.fm.KycDetailsDocument.KycDetails)get_store().add_element_user(KYCDETAILS$0);
            return target;
        }
    }
    /**
     * An XML kycDetails(@).
     *
     * This is a complex type.
     */
    public static class KycDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.KycDetailsDocument.KycDetails
    {
        private static final long serialVersionUID = 1L;
        
        public KycDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KNOWYOURCUSTOMER$0 = 
            new javax.xml.namespace.QName("", "knowYourCustomer");
        
        
        /**
         * Gets the "knowYourCustomer" element
         */
        public com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer getKnowYourCustomer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer target = null;
                target = (com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer)get_store().find_element_user(KNOWYOURCUSTOMER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "knowYourCustomer" element
         */
        public void setKnowYourCustomer(com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer knowYourCustomer)
        {
            generatedSetterHelperImpl(knowYourCustomer, KNOWYOURCUSTOMER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "knowYourCustomer" element
         */
        public com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer addNewKnowYourCustomer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer target = null;
                target = (com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer)get_store().add_element_user(KNOWYOURCUSTOMER$0);
                return target;
            }
        }
    }
}
