/*
 * An XML document type.
 * Localname: fmAddress
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmAddressDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmAddress(@) element.
 *
 * This is a complex type.
 */
public class FmAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMADDRESS$0 = 
        new javax.xml.namespace.QName("", "fmAddress");
    
    
    /**
     * Gets the "fmAddress" element
     */
    public com.scb.sci.customer.fm.FmAddressDocument.FmAddress getFmAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmAddressDocument.FmAddress target = null;
            target = (com.scb.sci.customer.fm.FmAddressDocument.FmAddress)get_store().find_element_user(FMADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmAddress" element
     */
    public void setFmAddress(com.scb.sci.customer.fm.FmAddressDocument.FmAddress fmAddress)
    {
        generatedSetterHelperImpl(fmAddress, FMADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmAddress" element
     */
    public com.scb.sci.customer.fm.FmAddressDocument.FmAddress addNewFmAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmAddressDocument.FmAddress target = null;
            target = (com.scb.sci.customer.fm.FmAddressDocument.FmAddress)get_store().add_element_user(FMADDRESS$0);
            return target;
        }
    }
    /**
     * An XML fmAddress(@).
     *
     * This is a complex type.
     */
    public static class FmAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAddressDocument.FmAddress
    {
        private static final long serialVersionUID = 1L;
        
        public FmAddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName FMID$4 = 
            new javax.xml.namespace.QName("", "fmId");
        private static final javax.xml.namespace.QName FMADDRSYSGENID$6 = 
            new javax.xml.namespace.QName("", "fmAddrSysGenId");
        private static final javax.xml.namespace.QName ADDRTYPE$8 = 
            new javax.xml.namespace.QName("", "addrType");
        private static final javax.xml.namespace.QName ADDRLINE1$10 = 
            new javax.xml.namespace.QName("", "addrLine1");
        private static final javax.xml.namespace.QName ADDRLINE2$12 = 
            new javax.xml.namespace.QName("", "addrLine2");
        private static final javax.xml.namespace.QName COUNTRY$14 = 
            new javax.xml.namespace.QName("", "country");
        private static final javax.xml.namespace.QName CITY$16 = 
            new javax.xml.namespace.QName("", "city");
        private static final javax.xml.namespace.QName POSTCODE$18 = 
            new javax.xml.namespace.QName("", "postCode");
        private static final javax.xml.namespace.QName STATE$20 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName ALTNAME$22 = 
            new javax.xml.namespace.QName("", "altName");
        private static final javax.xml.namespace.QName CONTEMAIL$24 = 
            new javax.xml.namespace.QName("", "contEmail");
        private static final javax.xml.namespace.QName CONTPHONE$26 = 
            new javax.xml.namespace.QName("", "contPhone");
        private static final javax.xml.namespace.QName DESCRIPTION$28 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName CONTROLE$30 = 
            new javax.xml.namespace.QName("", "contRole");
        private static final javax.xml.namespace.QName CONTTITLE$32 = 
            new javax.xml.namespace.QName("", "contTitle");
        private static final javax.xml.namespace.QName CONTFIRSTNAME$34 = 
            new javax.xml.namespace.QName("", "contFirstName");
        private static final javax.xml.namespace.QName CONTLASTNAME$36 = 
            new javax.xml.namespace.QName("", "contLastName");
        private static final javax.xml.namespace.QName CONTFAX$38 = 
            new javax.xml.namespace.QName("", "contFax");
        private static final javax.xml.namespace.QName CONTTELEX$40 = 
            new javax.xml.namespace.QName("", "contTelex");
        private static final javax.xml.namespace.QName STARTDATE$42 = 
            new javax.xml.namespace.QName("", "startDate");
        private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$44 = 
            new javax.xml.namespace.QName("", "updateStatusIndicator");
        private static final javax.xml.namespace.QName CHANGEINDICATOR$46 = 
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
         * Gets the "fmId" element
         */
        public java.lang.String getFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmId" element
         */
        public org.apache.xmlbeans.XmlString xgetFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmId" element
         */
        public void setFmId(java.lang.String fmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMID$4);
                }
                target.setStringValue(fmId);
            }
        }
        
        /**
         * Sets (as xml) the "fmId" element
         */
        public void xsetFmId(org.apache.xmlbeans.XmlString fmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMID$4);
                }
                target.set(fmId);
            }
        }
        
        /**
         * Gets the "fmAddrSysGenId" element
         */
        public java.lang.String getFmAddrSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMADDRSYSGENID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmAddrSysGenId" element
         */
        public org.apache.xmlbeans.XmlString xgetFmAddrSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMADDRSYSGENID$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmAddrSysGenId" element
         */
        public void setFmAddrSysGenId(java.lang.String fmAddrSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMADDRSYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMADDRSYSGENID$6);
                }
                target.setStringValue(fmAddrSysGenId);
            }
        }
        
        /**
         * Sets (as xml) the "fmAddrSysGenId" element
         */
        public void xsetFmAddrSysGenId(org.apache.xmlbeans.XmlString fmAddrSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMADDRSYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMADDRSYSGENID$6);
                }
                target.set(fmAddrSysGenId);
            }
        }
        
        /**
         * Gets the "addrType" element
         */
        public com.scb.sci.customer.fm.AddrTypeDocument.AddrType getAddrType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.AddrTypeDocument.AddrType target = null;
                target = (com.scb.sci.customer.fm.AddrTypeDocument.AddrType)get_store().find_element_user(ADDRTYPE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "addrType" element
         */
        public void setAddrType(com.scb.sci.customer.fm.AddrTypeDocument.AddrType addrType)
        {
            generatedSetterHelperImpl(addrType, ADDRTYPE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "addrType" element
         */
        public com.scb.sci.customer.fm.AddrTypeDocument.AddrType addNewAddrType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.AddrTypeDocument.AddrType target = null;
                target = (com.scb.sci.customer.fm.AddrTypeDocument.AddrType)get_store().add_element_user(ADDRTYPE$8);
                return target;
            }
        }
        
        /**
         * Gets the "addrLine1" element
         */
        public java.lang.String getAddrLine1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE1$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addrLine1" element
         */
        public org.apache.xmlbeans.XmlString xgetAddrLine1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE1$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "addrLine1" element
         */
        public void setAddrLine1(java.lang.String addrLine1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE1$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRLINE1$10);
                }
                target.setStringValue(addrLine1);
            }
        }
        
        /**
         * Sets (as xml) the "addrLine1" element
         */
        public void xsetAddrLine1(org.apache.xmlbeans.XmlString addrLine1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE1$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRLINE1$10);
                }
                target.set(addrLine1);
            }
        }
        
        /**
         * Gets the "addrLine2" element
         */
        public java.lang.String getAddrLine2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE2$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addrLine2" element
         */
        public org.apache.xmlbeans.XmlString xgetAddrLine2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE2$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "addrLine2" element
         */
        public void setAddrLine2(java.lang.String addrLine2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE2$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRLINE2$12);
                }
                target.setStringValue(addrLine2);
            }
        }
        
        /**
         * Sets (as xml) the "addrLine2" element
         */
        public void xsetAddrLine2(org.apache.xmlbeans.XmlString addrLine2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE2$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRLINE2$12);
                }
                target.set(addrLine2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$14, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$14, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$14);
                }
                target.set(country);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$16, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$16);
                }
                target.set(city);
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
         * Gets the "state" element
         */
        public java.lang.String getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$20, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$20, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATE$20);
                }
                target.set(state);
            }
        }
        
        /**
         * Gets the "altName" element
         */
        public java.lang.String getAltName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTNAME$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "altName" element
         */
        public org.apache.xmlbeans.XmlString xgetAltName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTNAME$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "altName" element
         */
        public void setAltName(java.lang.String altName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTNAME$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTNAME$22);
                }
                target.setStringValue(altName);
            }
        }
        
        /**
         * Sets (as xml) the "altName" element
         */
        public void xsetAltName(org.apache.xmlbeans.XmlString altName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTNAME$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTNAME$22);
                }
                target.set(altName);
            }
        }
        
        /**
         * Gets the "contEmail" element
         */
        public java.lang.String getContEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEMAIL$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contEmail" element
         */
        public org.apache.xmlbeans.XmlString xgetContEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEMAIL$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "contEmail" element
         */
        public void setContEmail(java.lang.String contEmail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEMAIL$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTEMAIL$24);
                }
                target.setStringValue(contEmail);
            }
        }
        
        /**
         * Sets (as xml) the "contEmail" element
         */
        public void xsetContEmail(org.apache.xmlbeans.XmlString contEmail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEMAIL$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTEMAIL$24);
                }
                target.set(contEmail);
            }
        }
        
        /**
         * Gets the "contPhone" element
         */
        public java.lang.String getContPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTPHONE$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contPhone" element
         */
        public org.apache.xmlbeans.XmlString xgetContPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTPHONE$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "contPhone" element
         */
        public void setContPhone(java.lang.String contPhone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTPHONE$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTPHONE$26);
                }
                target.setStringValue(contPhone);
            }
        }
        
        /**
         * Sets (as xml) the "contPhone" element
         */
        public void xsetContPhone(org.apache.xmlbeans.XmlString contPhone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTPHONE$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTPHONE$26);
                }
                target.set(contPhone);
            }
        }
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$28);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$28);
                }
                target.set(description);
            }
        }
        
        /**
         * Gets the "contRole" element
         */
        public java.lang.String getContRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTROLE$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contRole" element
         */
        public org.apache.xmlbeans.XmlString xgetContRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTROLE$30, 0);
                return target;
            }
        }
        
        /**
         * Sets the "contRole" element
         */
        public void setContRole(java.lang.String contRole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTROLE$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTROLE$30);
                }
                target.setStringValue(contRole);
            }
        }
        
        /**
         * Sets (as xml) the "contRole" element
         */
        public void xsetContRole(org.apache.xmlbeans.XmlString contRole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTROLE$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTROLE$30);
                }
                target.set(contRole);
            }
        }
        
        /**
         * Gets the "contTitle" element
         */
        public com.scb.sci.customer.fm.ContTitleDocument.ContTitle getContTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ContTitleDocument.ContTitle target = null;
                target = (com.scb.sci.customer.fm.ContTitleDocument.ContTitle)get_store().find_element_user(CONTTITLE$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "contTitle" element
         */
        public void setContTitle(com.scb.sci.customer.fm.ContTitleDocument.ContTitle contTitle)
        {
            generatedSetterHelperImpl(contTitle, CONTTITLE$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "contTitle" element
         */
        public com.scb.sci.customer.fm.ContTitleDocument.ContTitle addNewContTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ContTitleDocument.ContTitle target = null;
                target = (com.scb.sci.customer.fm.ContTitleDocument.ContTitle)get_store().add_element_user(CONTTITLE$32);
                return target;
            }
        }
        
        /**
         * Gets the "contFirstName" element
         */
        public java.lang.String getContFirstName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTFIRSTNAME$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contFirstName" element
         */
        public org.apache.xmlbeans.XmlString xgetContFirstName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTFIRSTNAME$34, 0);
                return target;
            }
        }
        
        /**
         * Sets the "contFirstName" element
         */
        public void setContFirstName(java.lang.String contFirstName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTFIRSTNAME$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTFIRSTNAME$34);
                }
                target.setStringValue(contFirstName);
            }
        }
        
        /**
         * Sets (as xml) the "contFirstName" element
         */
        public void xsetContFirstName(org.apache.xmlbeans.XmlString contFirstName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTFIRSTNAME$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTFIRSTNAME$34);
                }
                target.set(contFirstName);
            }
        }
        
        /**
         * Gets the "contLastName" element
         */
        public java.lang.String getContLastName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTLASTNAME$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contLastName" element
         */
        public org.apache.xmlbeans.XmlString xgetContLastName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTLASTNAME$36, 0);
                return target;
            }
        }
        
        /**
         * Sets the "contLastName" element
         */
        public void setContLastName(java.lang.String contLastName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTLASTNAME$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTLASTNAME$36);
                }
                target.setStringValue(contLastName);
            }
        }
        
        /**
         * Sets (as xml) the "contLastName" element
         */
        public void xsetContLastName(org.apache.xmlbeans.XmlString contLastName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTLASTNAME$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTLASTNAME$36);
                }
                target.set(contLastName);
            }
        }
        
        /**
         * Gets the "contFax" element
         */
        public java.lang.String getContFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTFAX$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contFax" element
         */
        public org.apache.xmlbeans.XmlString xgetContFax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTFAX$38, 0);
                return target;
            }
        }
        
        /**
         * Sets the "contFax" element
         */
        public void setContFax(java.lang.String contFax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTFAX$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTFAX$38);
                }
                target.setStringValue(contFax);
            }
        }
        
        /**
         * Sets (as xml) the "contFax" element
         */
        public void xsetContFax(org.apache.xmlbeans.XmlString contFax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTFAX$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTFAX$38);
                }
                target.set(contFax);
            }
        }
        
        /**
         * Gets the "contTelex" element
         */
        public java.lang.String getContTelex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTTELEX$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contTelex" element
         */
        public org.apache.xmlbeans.XmlString xgetContTelex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTTELEX$40, 0);
                return target;
            }
        }
        
        /**
         * Sets the "contTelex" element
         */
        public void setContTelex(java.lang.String contTelex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTTELEX$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTTELEX$40);
                }
                target.setStringValue(contTelex);
            }
        }
        
        /**
         * Sets (as xml) the "contTelex" element
         */
        public void xsetContTelex(org.apache.xmlbeans.XmlString contTelex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTTELEX$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTTELEX$40);
                }
                target.set(contTelex);
            }
        }
        
        /**
         * Gets the "startDate" element
         */
        public java.lang.String getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "startDate" element
         */
        public org.apache.xmlbeans.XmlString xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$42, 0);
                return target;
            }
        }
        
        /**
         * Sets the "startDate" element
         */
        public void setStartDate(java.lang.String startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$42);
                }
                target.setStringValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "startDate" element
         */
        public void xsetStartDate(org.apache.xmlbeans.XmlString startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTDATE$42);
                }
                target.set(startDate);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$44, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$44, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$44);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$44);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$46, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$46, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$46);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$46);
                }
                target.set(changeIndicator);
            }
        }
    }
}
