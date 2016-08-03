/*
 * An XML document type.
 * Localname: registeredAddress
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.RegisteredAddressDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one registeredAddress(@) element.
 *
 * This is a complex type.
 */
public class RegisteredAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.RegisteredAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegisteredAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTEREDADDRESS$0 = 
        new javax.xml.namespace.QName("", "registeredAddress");
    
    
    /**
     * Gets the "registeredAddress" element
     */
    public com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress getRegisteredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress target = null;
            target = (com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress)get_store().find_element_user(REGISTEREDADDRESS$0, 0);
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
        generatedSetterHelperImpl(registeredAddress, REGISTEREDADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress)get_store().add_element_user(REGISTEREDADDRESS$0);
            return target;
        }
    }
    /**
     * An XML registeredAddress(@).
     *
     * This is a complex type.
     */
    public static class RegisteredAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.RegisteredAddressDocument.RegisteredAddress
    {
        private static final long serialVersionUID = 1L;
        
        public RegisteredAddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName ADDRESSID$2 = 
            new javax.xml.namespace.QName("", "addressId");
        private static final javax.xml.namespace.QName ADDRESSTYPE$4 = 
            new javax.xml.namespace.QName("", "addressType");
        private static final javax.xml.namespace.QName ATTNPARTY$6 = 
            new javax.xml.namespace.QName("", "attnParty");
        private static final javax.xml.namespace.QName LINE1$8 = 
            new javax.xml.namespace.QName("", "line1");
        private static final javax.xml.namespace.QName LINE2$10 = 
            new javax.xml.namespace.QName("", "line2");
        private static final javax.xml.namespace.QName CITY$12 = 
            new javax.xml.namespace.QName("", "city");
        private static final javax.xml.namespace.QName STATE$14 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName COUNTRY$16 = 
            new javax.xml.namespace.QName("", "country");
        private static final javax.xml.namespace.QName POSTCODE$18 = 
            new javax.xml.namespace.QName("", "postCode");
        private static final javax.xml.namespace.QName FAX$20 = 
            new javax.xml.namespace.QName("", "fax");
        private static final javax.xml.namespace.QName EMAIL$22 = 
            new javax.xml.namespace.QName("", "email");
        private static final javax.xml.namespace.QName PHONE$24 = 
            new javax.xml.namespace.QName("", "phone");
        private static final javax.xml.namespace.QName TELEX$26 = 
            new javax.xml.namespace.QName("", "telex");
        private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$28 = 
            new javax.xml.namespace.QName("", "updateStatusIndicator");
        private static final javax.xml.namespace.QName CHANGEINDICATOR$30 = 
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
         * Gets the "addressId" element
         */
        public java.lang.String getAddressId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addressId" element
         */
        public org.apache.xmlbeans.XmlString xgetAddressId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "addressId" element
         */
        public void setAddressId(java.lang.String addressId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSID$2);
                }
                target.setStringValue(addressId);
            }
        }
        
        /**
         * Sets (as xml) the "addressId" element
         */
        public void xsetAddressId(org.apache.xmlbeans.XmlString addressId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSID$2);
                }
                target.set(addressId);
            }
        }
        
        /**
         * Gets the "addressType" element
         */
        public com.scb.sci.customer.fm.AddressTypeDocument.AddressType getAddressType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.AddressTypeDocument.AddressType target = null;
                target = (com.scb.sci.customer.fm.AddressTypeDocument.AddressType)get_store().find_element_user(ADDRESSTYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "addressType" element
         */
        public void setAddressType(com.scb.sci.customer.fm.AddressTypeDocument.AddressType addressType)
        {
            generatedSetterHelperImpl(addressType, ADDRESSTYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "addressType" element
         */
        public com.scb.sci.customer.fm.AddressTypeDocument.AddressType addNewAddressType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.AddressTypeDocument.AddressType target = null;
                target = (com.scb.sci.customer.fm.AddressTypeDocument.AddressType)get_store().add_element_user(ADDRESSTYPE$4);
                return target;
            }
        }
        
        /**
         * Gets the "attnParty" element
         */
        public java.lang.String getAttnParty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTNPARTY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "attnParty" element
         */
        public org.apache.xmlbeans.XmlString xgetAttnParty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTNPARTY$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "attnParty" element
         */
        public void setAttnParty(java.lang.String attnParty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTNPARTY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTNPARTY$6);
                }
                target.setStringValue(attnParty);
            }
        }
        
        /**
         * Sets (as xml) the "attnParty" element
         */
        public void xsetAttnParty(org.apache.xmlbeans.XmlString attnParty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTNPARTY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTNPARTY$6);
                }
                target.set(attnParty);
            }
        }
        
        /**
         * Gets the "line1" element
         */
        public java.lang.String getLine1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE1$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "line1" element
         */
        public org.apache.xmlbeans.XmlString xgetLine1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE1$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "line1" element
         */
        public void setLine1(java.lang.String line1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE1$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINE1$8);
                }
                target.setStringValue(line1);
            }
        }
        
        /**
         * Sets (as xml) the "line1" element
         */
        public void xsetLine1(org.apache.xmlbeans.XmlString line1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE1$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINE1$8);
                }
                target.set(line1);
            }
        }
        
        /**
         * Gets the "line2" element
         */
        public java.lang.String getLine2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE2$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "line2" element
         */
        public org.apache.xmlbeans.XmlString xgetLine2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE2$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "line2" element
         */
        public void setLine2(java.lang.String line2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE2$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINE2$10);
                }
                target.setStringValue(line2);
            }
        }
        
        /**
         * Sets (as xml) the "line2" element
         */
        public void xsetLine2(org.apache.xmlbeans.XmlString line2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE2$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINE2$10);
                }
                target.set(line2);
            }
        }
        
        /**
         * Gets the "city" element
         */
        public java.lang.String getCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "city" element
         */
        public org.apache.xmlbeans.XmlString xgetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "city" element
         */
        public void setCity(java.lang.String city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$12);
                }
                target.setStringValue(city);
            }
        }
        
        /**
         * Sets (as xml) the "city" element
         */
        public void xsetCity(org.apache.xmlbeans.XmlString city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$12);
                }
                target.set(city);
            }
        }
        
        /**
         * Gets the "state" element
         */
        public java.lang.String getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" element
         */
        public org.apache.xmlbeans.XmlString xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "state" element
         */
        public void setState(java.lang.String state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$14);
                }
                target.setStringValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" element
         */
        public void xsetState(org.apache.xmlbeans.XmlString state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATE$14);
                }
                target.set(state);
            }
        }
        
        /**
         * Gets the "country" element
         */
        public java.lang.String getCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "country" element
         */
        public org.apache.xmlbeans.XmlString xgetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "country" element
         */
        public void setCountry(java.lang.String country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$16);
                }
                target.setStringValue(country);
            }
        }
        
        /**
         * Sets (as xml) the "country" element
         */
        public void xsetCountry(org.apache.xmlbeans.XmlString country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$16);
                }
                target.set(country);
            }
        }
        
        /**
         * Gets the "postCode" element
         */
        public java.lang.String getPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "postCode" element
         */
        public org.apache.xmlbeans.XmlString xgetPostCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCODE$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "postCode" element
         */
        public void setPostCode(java.lang.String postCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$18);
                }
                target.setStringValue(postCode);
            }
        }
        
        /**
         * Sets (as xml) the "postCode" element
         */
        public void xsetPostCode(org.apache.xmlbeans.XmlString postCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCODE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTCODE$18);
                }
                target.set(postCode);
            }
        }
        
        /**
         * Gets the "fax" element
         */
        public java.lang.String getFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fax" element
         */
        public org.apache.xmlbeans.XmlString xgetFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fax" element
         */
        public void setFax(java.lang.String fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$20);
                }
                target.setStringValue(fax);
            }
        }
        
        /**
         * Sets (as xml) the "fax" element
         */
        public void xsetFax(org.apache.xmlbeans.XmlString fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$20);
                }
                target.set(fax);
            }
        }
        
        /**
         * Gets the "email" element
         */
        public java.lang.String getEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "email" element
         */
        public org.apache.xmlbeans.XmlString xgetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "email" element
         */
        public void setEmail(java.lang.String email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$22);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "email" element
         */
        public void xsetEmail(org.apache.xmlbeans.XmlString email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$22);
                }
                target.set(email);
            }
        }
        
        /**
         * Gets the "phone" element
         */
        public java.lang.String getPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "phone" element
         */
        public org.apache.xmlbeans.XmlString xgetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "phone" element
         */
        public void setPhone(java.lang.String phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$24);
                }
                target.setStringValue(phone);
            }
        }
        
        /**
         * Sets (as xml) the "phone" element
         */
        public void xsetPhone(org.apache.xmlbeans.XmlString phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$24);
                }
                target.set(phone);
            }
        }
        
        /**
         * Gets the "telex" element
         */
        public java.lang.String getTelex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEX$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "telex" element
         */
        public org.apache.xmlbeans.XmlString xgetTelex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEX$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "telex" element
         */
        public void setTelex(java.lang.String telex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEX$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEX$26);
                }
                target.setStringValue(telex);
            }
        }
        
        /**
         * Sets (as xml) the "telex" element
         */
        public void xsetTelex(org.apache.xmlbeans.XmlString telex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEX$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEX$26);
                }
                target.set(telex);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$28, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$28, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$28);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$28);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$30, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$30, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$30);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$30);
                }
                target.set(changeIndicator);
            }
        }
    }
}
