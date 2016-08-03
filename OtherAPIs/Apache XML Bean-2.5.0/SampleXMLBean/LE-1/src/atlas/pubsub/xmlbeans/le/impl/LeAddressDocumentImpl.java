/*
 * An XML document type.
 * Localname: leAddress
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeAddressDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leAddress(@) element.
 *
 * This is a complex type.
 */
public class LeAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEADDRESS$0 = 
        new javax.xml.namespace.QName("", "leAddress");
    
    
    /**
     * Gets the "leAddress" element
     */
    public atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress getLeAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress target = null;
            target = (atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress)get_store().find_element_user(LEADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "leAddress" element
     */
    public void setLeAddress(atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress leAddress)
    {
        generatedSetterHelperImpl(leAddress, LEADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "leAddress" element
     */
    public atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress addNewLeAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress target = null;
            target = (atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress)get_store().add_element_user(LEADDRESS$0);
            return target;
        }
    }
    /**
     * An XML leAddress(@).
     *
     * This is a complex type.
     */
    public static class LeAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress
    {
        private static final long serialVersionUID = 1L;
        
        public LeAddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEADDRID$0 = 
            new javax.xml.namespace.QName("", "leAddrId");
        private static final javax.xml.namespace.QName ADDRTYPE$2 = 
            new javax.xml.namespace.QName("", "addrType");
        private static final javax.xml.namespace.QName ADDRTYPEDESC$4 = 
            new javax.xml.namespace.QName("", "addrTypeDesc");
        private static final javax.xml.namespace.QName STARTDATE$6 = 
            new javax.xml.namespace.QName("", "startDate");
        private static final javax.xml.namespace.QName COUNTRYISOCODE$8 = 
            new javax.xml.namespace.QName("", "countryIsoCode");
        private static final javax.xml.namespace.QName COUNTRYNAME$10 = 
            new javax.xml.namespace.QName("", "countryName");
        private static final javax.xml.namespace.QName CITYCODE$12 = 
            new javax.xml.namespace.QName("", "cityCode");
        private static final javax.xml.namespace.QName CITYNAME$14 = 
            new javax.xml.namespace.QName("", "cityName");
        private static final javax.xml.namespace.QName ADDRLINE1$16 = 
            new javax.xml.namespace.QName("", "addrLine1");
        private static final javax.xml.namespace.QName ADDRLINE2$18 = 
            new javax.xml.namespace.QName("", "addrLine2");
        private static final javax.xml.namespace.QName POSTCODE$20 = 
            new javax.xml.namespace.QName("", "postCode");
        private static final javax.xml.namespace.QName STATE$22 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName CONTROLE$24 = 
            new javax.xml.namespace.QName("", "contRole");
        private static final javax.xml.namespace.QName ALTNAME$26 = 
            new javax.xml.namespace.QName("", "altName");
        private static final javax.xml.namespace.QName TITLE$28 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName CONTFIRSTNAME$30 = 
            new javax.xml.namespace.QName("", "contFirstName");
        private static final javax.xml.namespace.QName CONTLASTNAME$32 = 
            new javax.xml.namespace.QName("", "contLastName");
        private static final javax.xml.namespace.QName CONTFAX$34 = 
            new javax.xml.namespace.QName("", "contFax");
        private static final javax.xml.namespace.QName CONTEMAIL$36 = 
            new javax.xml.namespace.QName("", "contEmail");
        private static final javax.xml.namespace.QName CONTPHONE$38 = 
            new javax.xml.namespace.QName("", "contPhone");
        private static final javax.xml.namespace.QName CONTTELEX$40 = 
            new javax.xml.namespace.QName("", "contTelex");
        private static final javax.xml.namespace.QName DESCRIPTION$42 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName UPDSTATUS$44 = 
            new javax.xml.namespace.QName("", "updstatus");
        private static final javax.xml.namespace.QName VERIFIED$46 = 
            new javax.xml.namespace.QName("", "verified");
        
        
        /**
         * Gets the "leAddrId" element
         */
        public java.lang.String getLeAddrId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEADDRID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leAddrId" element
         */
        public org.apache.xmlbeans.XmlString xgetLeAddrId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEADDRID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leAddrId" element
         */
        public void setLeAddrId(java.lang.String leAddrId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEADDRID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEADDRID$0);
                }
                target.setStringValue(leAddrId);
            }
        }
        
        /**
         * Sets (as xml) the "leAddrId" element
         */
        public void xsetLeAddrId(org.apache.xmlbeans.XmlString leAddrId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEADDRID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEADDRID$0);
                }
                target.set(leAddrId);
            }
        }
        
        /**
         * Gets the "addrType" element
         */
        public java.lang.String getAddrType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addrType" element
         */
        public org.apache.xmlbeans.XmlString xgetAddrType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "addrType" element
         */
        public void setAddrType(java.lang.String addrType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRTYPE$2);
                }
                target.setStringValue(addrType);
            }
        }
        
        /**
         * Sets (as xml) the "addrType" element
         */
        public void xsetAddrType(org.apache.xmlbeans.XmlString addrType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRTYPE$2);
                }
                target.set(addrType);
            }
        }
        
        /**
         * Gets the "addrTypeDesc" element
         */
        public java.lang.String getAddrTypeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRTYPEDESC$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addrTypeDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetAddrTypeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRTYPEDESC$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "addrTypeDesc" element
         */
        public void setAddrTypeDesc(java.lang.String addrTypeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRTYPEDESC$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRTYPEDESC$4);
                }
                target.setStringValue(addrTypeDesc);
            }
        }
        
        /**
         * Sets (as xml) the "addrTypeDesc" element
         */
        public void xsetAddrTypeDesc(org.apache.xmlbeans.XmlString addrTypeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRTYPEDESC$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRTYPEDESC$4);
                }
                target.set(addrTypeDesc);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTDATE$6);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Gets the "countryIsoCode" element
         */
        public java.lang.String getCountryIsoCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYISOCODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "countryIsoCode" element
         */
        public org.apache.xmlbeans.XmlString xgetCountryIsoCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYISOCODE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "countryIsoCode" element
         */
        public void setCountryIsoCode(java.lang.String countryIsoCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYISOCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYISOCODE$8);
                }
                target.setStringValue(countryIsoCode);
            }
        }
        
        /**
         * Sets (as xml) the "countryIsoCode" element
         */
        public void xsetCountryIsoCode(org.apache.xmlbeans.XmlString countryIsoCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYISOCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYISOCODE$8);
                }
                target.set(countryIsoCode);
            }
        }
        
        /**
         * Gets the "countryName" element
         */
        public java.lang.String getCountryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYNAME$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "countryName" element
         */
        public org.apache.xmlbeans.XmlString xgetCountryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYNAME$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "countryName" element
         */
        public void setCountryName(java.lang.String countryName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYNAME$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYNAME$10);
                }
                target.setStringValue(countryName);
            }
        }
        
        /**
         * Sets (as xml) the "countryName" element
         */
        public void xsetCountryName(org.apache.xmlbeans.XmlString countryName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYNAME$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYNAME$10);
                }
                target.set(countryName);
            }
        }
        
        /**
         * Gets the "cityCode" element
         */
        public java.lang.String getCityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYCODE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cityCode" element
         */
        public org.apache.xmlbeans.XmlString xgetCityCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYCODE$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "cityCode" element
         */
        public void setCityCode(java.lang.String cityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYCODE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITYCODE$12);
                }
                target.setStringValue(cityCode);
            }
        }
        
        /**
         * Sets (as xml) the "cityCode" element
         */
        public void xsetCityCode(org.apache.xmlbeans.XmlString cityCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYCODE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITYCODE$12);
                }
                target.set(cityCode);
            }
        }
        
        /**
         * Gets the "cityName" element
         */
        public java.lang.String getCityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYNAME$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cityName" element
         */
        public org.apache.xmlbeans.XmlString xgetCityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYNAME$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "cityName" element
         */
        public void setCityName(java.lang.String cityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYNAME$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITYNAME$14);
                }
                target.setStringValue(cityName);
            }
        }
        
        /**
         * Sets (as xml) the "cityName" element
         */
        public void xsetCityName(org.apache.xmlbeans.XmlString cityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYNAME$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITYNAME$14);
                }
                target.set(cityName);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE1$16, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE1$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE1$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRLINE1$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE1$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRLINE1$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE2$18, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE2$18, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE2$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRLINE2$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE2$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRLINE2$18);
                }
                target.set(addrLine2);
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
         * Gets the "state" element
         */
        public java.lang.String getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$22, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$22, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$22);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATE$22);
                }
                target.set(state);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTROLE$24, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTROLE$24, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTROLE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTROLE$24);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTROLE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTROLE$24);
                }
                target.set(contRole);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTNAME$26, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTNAME$26, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTNAME$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTNAME$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTNAME$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTNAME$26);
                }
                target.set(altName);
            }
        }
        
        /**
         * Gets the "title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" element
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$28);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" element
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$28);
                }
                target.set(title);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTFIRSTNAME$30, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTFIRSTNAME$30, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTFIRSTNAME$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTFIRSTNAME$30);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTFIRSTNAME$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTFIRSTNAME$30);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTLASTNAME$32, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTLASTNAME$32, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTLASTNAME$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTLASTNAME$32);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTLASTNAME$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTLASTNAME$32);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTFAX$34, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTFAX$34, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTFAX$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTFAX$34);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTFAX$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTFAX$34);
                }
                target.set(contFax);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEMAIL$36, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEMAIL$36, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEMAIL$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTEMAIL$36);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEMAIL$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTEMAIL$36);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTPHONE$38, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTPHONE$38, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTPHONE$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTPHONE$38);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTPHONE$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTPHONE$38);
                }
                target.set(contPhone);
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
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$42, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$42, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$42);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$42);
                }
                target.set(description);
            }
        }
        
        /**
         * Gets the "updstatus" element
         */
        public java.lang.String getUpdstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "updstatus" element
         */
        public org.apache.xmlbeans.XmlString xgetUpdstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$44, 0);
                return target;
            }
        }
        
        /**
         * Sets the "updstatus" element
         */
        public void setUpdstatus(java.lang.String updstatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDSTATUS$44);
                }
                target.setStringValue(updstatus);
            }
        }
        
        /**
         * Sets (as xml) the "updstatus" element
         */
        public void xsetUpdstatus(org.apache.xmlbeans.XmlString updstatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDSTATUS$44);
                }
                target.set(updstatus);
            }
        }
        
        /**
         * Gets the "verified" element
         */
        public java.lang.String getVerified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "verified" element
         */
        public org.apache.xmlbeans.XmlString xgetVerified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$46, 0);
                return target;
            }
        }
        
        /**
         * Sets the "verified" element
         */
        public void setVerified(java.lang.String verified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERIFIED$46);
                }
                target.setStringValue(verified);
            }
        }
        
        /**
         * Sets (as xml) the "verified" element
         */
        public void xsetVerified(org.apache.xmlbeans.XmlString verified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERIFIED$46);
                }
                target.set(verified);
            }
        }
    }
}
