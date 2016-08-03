/*
 * An XML document type.
 * Localname: approverLocation
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ApproverLocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one approverLocation(@) element.
 *
 * This is a complex type.
 */
public class ApproverLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ApproverLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ApproverLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPROVERLOCATION$0 = 
        new javax.xml.namespace.QName("", "approverLocation");
    
    
    /**
     * Gets the "approverLocation" element
     */
    public com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation getApproverLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation target = null;
            target = (com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation)get_store().find_element_user(APPROVERLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "approverLocation" element
     */
    public void setApproverLocation(com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation approverLocation)
    {
        generatedSetterHelperImpl(approverLocation, APPROVERLOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "approverLocation" element
     */
    public com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation addNewApproverLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation target = null;
            target = (com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation)get_store().add_element_user(APPROVERLOCATION$0);
            return target;
        }
    }
    /**
     * An XML approverLocation(@).
     *
     * This is a complex type.
     */
    public static class ApproverLocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ApproverLocationDocument.ApproverLocation
    {
        private static final long serialVersionUID = 1L;
        
        public ApproverLocationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName APPROVERLOCATIONID$0 = 
            new javax.xml.namespace.QName("", "approverLocationId");
        private static final javax.xml.namespace.QName APPROVERCOUNTRY$2 = 
            new javax.xml.namespace.QName("", "approverCountry");
        private static final javax.xml.namespace.QName APPROVERORGANIZATION$4 = 
            new javax.xml.namespace.QName("", "approverOrganization");
        
        
        /**
         * Gets the "approverLocationId" element
         */
        public java.lang.String getApproverLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERLOCATIONID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "approverLocationId" element
         */
        public org.apache.xmlbeans.XmlString xgetApproverLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERLOCATIONID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "approverLocationId" element
         */
        public void setApproverLocationId(java.lang.String approverLocationId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERLOCATIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPROVERLOCATIONID$0);
                }
                target.setStringValue(approverLocationId);
            }
        }
        
        /**
         * Sets (as xml) the "approverLocationId" element
         */
        public void xsetApproverLocationId(org.apache.xmlbeans.XmlString approverLocationId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERLOCATIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPROVERLOCATIONID$0);
                }
                target.set(approverLocationId);
            }
        }
        
        /**
         * Gets the "approverCountry" element
         */
        public java.lang.String getApproverCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERCOUNTRY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "approverCountry" element
         */
        public org.apache.xmlbeans.XmlString xgetApproverCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERCOUNTRY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "approverCountry" element
         */
        public void setApproverCountry(java.lang.String approverCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERCOUNTRY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPROVERCOUNTRY$2);
                }
                target.setStringValue(approverCountry);
            }
        }
        
        /**
         * Sets (as xml) the "approverCountry" element
         */
        public void xsetApproverCountry(org.apache.xmlbeans.XmlString approverCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERCOUNTRY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPROVERCOUNTRY$2);
                }
                target.set(approverCountry);
            }
        }
        
        /**
         * Gets the "approverOrganization" element
         */
        public java.lang.String getApproverOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERORGANIZATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "approverOrganization" element
         */
        public org.apache.xmlbeans.XmlString xgetApproverOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERORGANIZATION$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "approverOrganization" element
         */
        public void setApproverOrganization(java.lang.String approverOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVERORGANIZATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPROVERORGANIZATION$4);
                }
                target.setStringValue(approverOrganization);
            }
        }
        
        /**
         * Sets (as xml) the "approverOrganization" element
         */
        public void xsetApproverOrganization(org.apache.xmlbeans.XmlString approverOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVERORGANIZATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPROVERORGANIZATION$4);
                }
                target.set(approverOrganization);
            }
        }
    }
}
