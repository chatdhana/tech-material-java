/*
 * An XML document type.
 * Localname: documentOriginatingLocation
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DocumentOriginatingLocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one documentOriginatingLocation(@) element.
 *
 * This is a complex type.
 */
public class DocumentOriginatingLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DocumentOriginatingLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocumentOriginatingLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTORIGINATINGLOCATION$0 = 
        new javax.xml.namespace.QName("", "documentOriginatingLocation");
    
    
    /**
     * Gets the "documentOriginatingLocation" element
     */
    public com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation getDocumentOriginatingLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation target = null;
            target = (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation)get_store().find_element_user(DOCUMENTORIGINATINGLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "documentOriginatingLocation" element
     */
    public void setDocumentOriginatingLocation(com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation documentOriginatingLocation)
    {
        generatedSetterHelperImpl(documentOriginatingLocation, DOCUMENTORIGINATINGLOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "documentOriginatingLocation" element
     */
    public com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation addNewDocumentOriginatingLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation target = null;
            target = (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation)get_store().add_element_user(DOCUMENTORIGINATINGLOCATION$0);
            return target;
        }
    }
    /**
     * An XML documentOriginatingLocation(@).
     *
     * This is a complex type.
     */
    public static class DocumentOriginatingLocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation
    {
        private static final long serialVersionUID = 1L;
        
        public DocumentOriginatingLocationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOCUMENTORIGINATINGID$0 = 
            new javax.xml.namespace.QName("", "documentOriginatingId");
        private static final javax.xml.namespace.QName DOCUMENTORIGINATINGCOUNTRY$2 = 
            new javax.xml.namespace.QName("", "documentOriginatingCountry");
        private static final javax.xml.namespace.QName DOCUMENTORIGINATINGORGANIZATION$4 = 
            new javax.xml.namespace.QName("", "documentOriginatingOrganization");
        
        
        /**
         * Gets the "documentOriginatingId" element
         */
        public java.lang.String getDocumentOriginatingId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTORIGINATINGID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "documentOriginatingId" element
         */
        public org.apache.xmlbeans.XmlString xgetDocumentOriginatingId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTORIGINATINGID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "documentOriginatingId" element
         */
        public void setDocumentOriginatingId(java.lang.String documentOriginatingId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTORIGINATINGID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTORIGINATINGID$0);
                }
                target.setStringValue(documentOriginatingId);
            }
        }
        
        /**
         * Sets (as xml) the "documentOriginatingId" element
         */
        public void xsetDocumentOriginatingId(org.apache.xmlbeans.XmlString documentOriginatingId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTORIGINATINGID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTORIGINATINGID$0);
                }
                target.set(documentOriginatingId);
            }
        }
        
        /**
         * Gets the "documentOriginatingCountry" element
         */
        public java.lang.String getDocumentOriginatingCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTORIGINATINGCOUNTRY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "documentOriginatingCountry" element
         */
        public org.apache.xmlbeans.XmlString xgetDocumentOriginatingCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTORIGINATINGCOUNTRY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "documentOriginatingCountry" element
         */
        public void setDocumentOriginatingCountry(java.lang.String documentOriginatingCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTORIGINATINGCOUNTRY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTORIGINATINGCOUNTRY$2);
                }
                target.setStringValue(documentOriginatingCountry);
            }
        }
        
        /**
         * Sets (as xml) the "documentOriginatingCountry" element
         */
        public void xsetDocumentOriginatingCountry(org.apache.xmlbeans.XmlString documentOriginatingCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTORIGINATINGCOUNTRY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTORIGINATINGCOUNTRY$2);
                }
                target.set(documentOriginatingCountry);
            }
        }
        
        /**
         * Gets the "documentOriginatingOrganization" element
         */
        public java.lang.String getDocumentOriginatingOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTORIGINATINGORGANIZATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "documentOriginatingOrganization" element
         */
        public org.apache.xmlbeans.XmlString xgetDocumentOriginatingOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTORIGINATINGORGANIZATION$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "documentOriginatingOrganization" element
         */
        public void setDocumentOriginatingOrganization(java.lang.String documentOriginatingOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTORIGINATINGORGANIZATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTORIGINATINGORGANIZATION$4);
                }
                target.setStringValue(documentOriginatingOrganization);
            }
        }
        
        /**
         * Sets (as xml) the "documentOriginatingOrganization" element
         */
        public void xsetDocumentOriginatingOrganization(org.apache.xmlbeans.XmlString documentOriginatingOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTORIGINATINGORGANIZATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTORIGINATINGORGANIZATION$4);
                }
                target.set(documentOriginatingOrganization);
            }
        }
    }
}
