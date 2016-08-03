/*
 * An XML document type.
 * Localname: securityLocation
 * Namespace: 
 * Java type: com.stanchart.customer.SecurityLocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.stanchart.customer.impl;
/**
 * A document containing one securityLocation(@) element.
 *
 * This is a complex type.
 */
public class SecurityLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.stanchart.customer.SecurityLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecurityLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYLOCATION$0 = 
        new javax.xml.namespace.QName("", "securityLocation");
    
    
    /**
     * Gets the "securityLocation" element
     */
    public com.stanchart.customer.SecurityLocationDocument.SecurityLocation getSecurityLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.stanchart.customer.SecurityLocationDocument.SecurityLocation target = null;
            target = (com.stanchart.customer.SecurityLocationDocument.SecurityLocation)get_store().find_element_user(SECURITYLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "securityLocation" element
     */
    public void setSecurityLocation(com.stanchart.customer.SecurityLocationDocument.SecurityLocation securityLocation)
    {
        generatedSetterHelperImpl(securityLocation, SECURITYLOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "securityLocation" element
     */
    public com.stanchart.customer.SecurityLocationDocument.SecurityLocation addNewSecurityLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.stanchart.customer.SecurityLocationDocument.SecurityLocation target = null;
            target = (com.stanchart.customer.SecurityLocationDocument.SecurityLocation)get_store().add_element_user(SECURITYLOCATION$0);
            return target;
        }
    }
    /**
     * An XML securityLocation(@).
     *
     * This is a complex type.
     */
    public static class SecurityLocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.stanchart.customer.SecurityLocationDocument.SecurityLocation
    {
        private static final long serialVersionUID = 1L;
        
        public SecurityLocationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCATIONID$0 = 
            new javax.xml.namespace.QName("", "locationId");
        private static final javax.xml.namespace.QName LOCATIONCOUNTRY$2 = 
            new javax.xml.namespace.QName("", "locationCountry");
        private static final javax.xml.namespace.QName LOCATIONORGANIZATION$4 = 
            new javax.xml.namespace.QName("", "locationOrganization");
        
        
        /**
         * Gets the "locationId" element
         */
        public java.lang.String getLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "locationId" element
         */
        public org.apache.xmlbeans.XmlString xgetLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "locationId" element
         */
        public boolean isSetLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCATIONID$0) != 0;
            }
        }
        
        /**
         * Sets the "locationId" element
         */
        public void setLocationId(java.lang.String locationId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONID$0);
                }
                target.setStringValue(locationId);
            }
        }
        
        /**
         * Sets (as xml) the "locationId" element
         */
        public void xsetLocationId(org.apache.xmlbeans.XmlString locationId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATIONID$0);
                }
                target.set(locationId);
            }
        }
        
        /**
         * Unsets the "locationId" element
         */
        public void unsetLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCATIONID$0, 0);
            }
        }
        
        /**
         * Gets the "locationCountry" element
         */
        public java.lang.String getLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCOUNTRY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "locationCountry" element
         */
        public org.apache.xmlbeans.XmlString xgetLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONCOUNTRY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "locationCountry" element
         */
        public boolean isSetLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCATIONCOUNTRY$2) != 0;
            }
        }
        
        /**
         * Sets the "locationCountry" element
         */
        public void setLocationCountry(java.lang.String locationCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCOUNTRY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONCOUNTRY$2);
                }
                target.setStringValue(locationCountry);
            }
        }
        
        /**
         * Sets (as xml) the "locationCountry" element
         */
        public void xsetLocationCountry(org.apache.xmlbeans.XmlString locationCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONCOUNTRY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATIONCOUNTRY$2);
                }
                target.set(locationCountry);
            }
        }
        
        /**
         * Unsets the "locationCountry" element
         */
        public void unsetLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCATIONCOUNTRY$2, 0);
            }
        }
        
        /**
         * Gets the "locationOrganization" element
         */
        public java.lang.String getLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONORGANIZATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "locationOrganization" element
         */
        public org.apache.xmlbeans.XmlString xgetLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONORGANIZATION$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "locationOrganization" element
         */
        public boolean isSetLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCATIONORGANIZATION$4) != 0;
            }
        }
        
        /**
         * Sets the "locationOrganization" element
         */
        public void setLocationOrganization(java.lang.String locationOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONORGANIZATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONORGANIZATION$4);
                }
                target.setStringValue(locationOrganization);
            }
        }
        
        /**
         * Sets (as xml) the "locationOrganization" element
         */
        public void xsetLocationOrganization(org.apache.xmlbeans.XmlString locationOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONORGANIZATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATIONORGANIZATION$4);
                }
                target.set(locationOrganization);
            }
        }
        
        /**
         * Unsets the "locationOrganization" element
         */
        public void unsetLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCATIONORGANIZATION$4, 0);
            }
        }
    }
}
