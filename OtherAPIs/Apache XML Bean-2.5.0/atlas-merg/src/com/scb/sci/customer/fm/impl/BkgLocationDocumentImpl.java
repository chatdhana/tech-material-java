/*
 * An XML document type.
 * Localname: bkgLocation
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.BkgLocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one bkgLocation(@) element.
 *
 * This is a complex type.
 */
public class BkgLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.BkgLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public BkgLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BKGLOCATION$0 = 
        new javax.xml.namespace.QName("", "bkgLocation");
    
    
    /**
     * Gets the "bkgLocation" element
     */
    public com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation getBkgLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation target = null;
            target = (com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation)get_store().find_element_user(BKGLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bkgLocation" element
     */
    public void setBkgLocation(com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation bkgLocation)
    {
        generatedSetterHelperImpl(bkgLocation, BKGLOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bkgLocation" element
     */
    public com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation addNewBkgLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation target = null;
            target = (com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation)get_store().add_element_user(BKGLOCATION$0);
            return target;
        }
    }
    /**
     * An XML bkgLocation(@).
     *
     * This is a complex type.
     */
    public static class BkgLocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.BkgLocationDocument.BkgLocation
    {
        private static final long serialVersionUID = 1L;
        
        public BkgLocationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BKGLOCATIONID$0 = 
            new javax.xml.namespace.QName("", "bkgLocationId");
        private static final javax.xml.namespace.QName BKGLOCATIONCOUNTRY$2 = 
            new javax.xml.namespace.QName("", "bkgLocationCountry");
        private static final javax.xml.namespace.QName BKGLOCATIONORGANIZATION$4 = 
            new javax.xml.namespace.QName("", "bkgLocationOrganization");
        
        
        /**
         * Gets the "bkgLocationId" element
         */
        public java.lang.String getBkgLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bkgLocationId" element
         */
        public org.apache.xmlbeans.XmlString xgetBkgLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "bkgLocationId" element
         */
        public void setBkgLocationId(java.lang.String bkgLocationId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BKGLOCATIONID$0);
                }
                target.setStringValue(bkgLocationId);
            }
        }
        
        /**
         * Sets (as xml) the "bkgLocationId" element
         */
        public void xsetBkgLocationId(org.apache.xmlbeans.XmlString bkgLocationId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BKGLOCATIONID$0);
                }
                target.set(bkgLocationId);
            }
        }
        
        /**
         * Gets the "bkgLocationCountry" element
         */
        public java.lang.String getBkgLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONCOUNTRY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bkgLocationCountry" element
         */
        public org.apache.xmlbeans.XmlString xgetBkgLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONCOUNTRY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "bkgLocationCountry" element
         */
        public void setBkgLocationCountry(java.lang.String bkgLocationCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONCOUNTRY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BKGLOCATIONCOUNTRY$2);
                }
                target.setStringValue(bkgLocationCountry);
            }
        }
        
        /**
         * Sets (as xml) the "bkgLocationCountry" element
         */
        public void xsetBkgLocationCountry(org.apache.xmlbeans.XmlString bkgLocationCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONCOUNTRY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BKGLOCATIONCOUNTRY$2);
                }
                target.set(bkgLocationCountry);
            }
        }
        
        /**
         * Gets the "bkgLocationOrganization" element
         */
        public java.lang.String getBkgLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONORGANIZATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bkgLocationOrganization" element
         */
        public org.apache.xmlbeans.XmlString xgetBkgLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONORGANIZATION$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "bkgLocationOrganization" element
         */
        public void setBkgLocationOrganization(java.lang.String bkgLocationOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONORGANIZATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BKGLOCATIONORGANIZATION$4);
                }
                target.setStringValue(bkgLocationOrganization);
            }
        }
        
        /**
         * Sets (as xml) the "bkgLocationOrganization" element
         */
        public void xsetBkgLocationOrganization(org.apache.xmlbeans.XmlString bkgLocationOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONORGANIZATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BKGLOCATIONORGANIZATION$4);
                }
                target.set(bkgLocationOrganization);
            }
        }
    }
}
