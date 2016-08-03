/*
 * An XML document type.
 * Localname: officialAddress
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.OfficialAddressDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one officialAddress(@) element.
 *
 * This is a complex type.
 */
public class OfficialAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.OfficialAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfficialAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML officialAddress(@).
     *
     * This is a complex type.
     */
    public static class OfficialAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.OfficialAddressDocument.OfficialAddress
    {
        private static final long serialVersionUID = 1L;
        
        public OfficialAddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName ADDRESSID$4 = 
            new javax.xml.namespace.QName("", "addressId");
        private static final javax.xml.namespace.QName ADDRESSTYPE$6 = 
            new javax.xml.namespace.QName("", "addressType");
        private static final javax.xml.namespace.QName ATTNPARTY$8 = 
            new javax.xml.namespace.QName("", "attnParty");
        private static final javax.xml.namespace.QName LINE1$10 = 
            new javax.xml.namespace.QName("", "line1");
        private static final javax.xml.namespace.QName LINE2$12 = 
            new javax.xml.namespace.QName("", "line2");
        private static final javax.xml.namespace.QName CITY$14 = 
            new javax.xml.namespace.QName("", "city");
        private static final javax.xml.namespace.QName STATE$16 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName COUNTRY$18 = 
            new javax.xml.namespace.QName("", "country");
        private static final javax.xml.namespace.QName POSTCODE$20 = 
            new javax.xml.namespace.QName("", "postCode");
        private static final javax.xml.namespace.QName FAX$22 = 
            new javax.xml.namespace.QName("", "fax");
        private static final javax.xml.namespace.QName EMAIL$24 = 
            new javax.xml.namespace.QName("", "email");
        private static final javax.xml.namespace.QName PHONE$26 = 
            new javax.xml.namespace.QName("", "phone");
        private static final javax.xml.namespace.QName TELEX$28 = 
            new javax.xml.namespace.QName("", "telex");
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
         * Gets the "addressId" element
         */
        public java.lang.String getAddressId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSID$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSID$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSID$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSID$4);
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
                target = (com.scb.sci.customer.fm.AddressTypeDocument.AddressType)get_store().find_element_user(ADDRESSTYPE$6, 0);
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
            generatedSetterHelperImpl(addressType, ADDRESSTYPE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (com.scb.sci.customer.fm.AddressTypeDocument.AddressType)get_store().add_element_user(ADDRESSTYPE$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTNPARTY$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTNPARTY$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTNPARTY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTNPARTY$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTNPARTY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTNPARTY$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE1$10, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE1$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE1$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINE1$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE1$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINE1$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE2$12, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE2$12, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE2$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINE2$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE2$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINE2$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$14, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$14, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$16, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATE$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$18, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$18, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$20, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCODE$20, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCODE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTCODE$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$22, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$22, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$22);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$24, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$24, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$24);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$26, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$26, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$26);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEX$28, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEX$28, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEX$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEX$28);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEX$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEX$28);
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
