/*
 * An XML document type.
 * Localname: officialAddressDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.OfficialAddressDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one officialAddressDetails(@) element.
 *
 * This is a complex type.
 */
public class OfficialAddressDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.OfficialAddressDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfficialAddressDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFICIALADDRESSDETAILS$0 = 
        new javax.xml.namespace.QName("", "officialAddressDetails");
    
    
    /**
     * Gets the "officialAddressDetails" element
     */
    public com.scb.sci.customer.fm.OfficialAddressDetailsDocument.OfficialAddressDetails getOfficialAddressDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.OfficialAddressDetailsDocument.OfficialAddressDetails target = null;
            target = (com.scb.sci.customer.fm.OfficialAddressDetailsDocument.OfficialAddressDetails)get_store().find_element_user(OFFICIALADDRESSDETAILS$0, 0);
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
        generatedSetterHelperImpl(officialAddressDetails, OFFICIALADDRESSDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.scb.sci.customer.fm.OfficialAddressDetailsDocument.OfficialAddressDetails)get_store().add_element_user(OFFICIALADDRESSDETAILS$0);
            return target;
        }
    }
    /**
     * An XML officialAddressDetails(@).
     *
     * This is a complex type.
     */
    public static class OfficialAddressDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.OfficialAddressDetailsDocument.OfficialAddressDetails
    {
        private static final long serialVersionUID = 1L;
        
        public OfficialAddressDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OFFICIALADDRESS$0 = 
            new javax.xml.namespace.QName("", "officialAddress");
        
        
        /**
         * Gets the "officialAddress" element
         */
        public com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress getOfficialAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress target = null;
                target = (com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress)get_store().find_element_user(OFFICIALADDRESS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "officialAddress" element
         */
        public void setOfficialAddress(com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress officialAddress)
        {
            generatedSetterHelperImpl(officialAddress, OFFICIALADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "officialAddress" element
         */
        public com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress addNewOfficialAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress target = null;
                target = (com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress)get_store().add_element_user(OFFICIALADDRESS$0);
                return target;
            }
        }
    }
}
