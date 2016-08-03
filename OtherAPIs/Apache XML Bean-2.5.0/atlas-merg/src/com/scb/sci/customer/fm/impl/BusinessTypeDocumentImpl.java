/*
 * An XML document type.
 * Localname: businessType
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.BusinessTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one businessType(@) element.
 *
 * This is a complex type.
 */
public class BusinessTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.BusinessTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public BusinessTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSTYPE$0 = 
        new javax.xml.namespace.QName("", "businessType");
    
    
    /**
     * Gets the "businessType" element
     */
    public com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType getBusinessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType target = null;
            target = (com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType)get_store().find_element_user(BUSINESSTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "businessType" element
     */
    public void setBusinessType(com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType businessType)
    {
        generatedSetterHelperImpl(businessType, BUSINESSTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "businessType" element
     */
    public com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType addNewBusinessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType target = null;
            target = (com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType)get_store().add_element_user(BUSINESSTYPE$0);
            return target;
        }
    }
    /**
     * An XML businessType(@).
     *
     * This is a complex type.
     */
    public static class BusinessTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.BusinessTypeDocument.BusinessType
    {
        private static final long serialVersionUID = 1L;
        
        public BusinessTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STDCODENUMBER$0 = 
            new javax.xml.namespace.QName("", "stdCodeNumber");
        private static final javax.xml.namespace.QName STDCODEVALUE$2 = 
            new javax.xml.namespace.QName("", "stdCodeValue");
        private static final javax.xml.namespace.QName STDCODEDESCRIPTION$4 = 
            new javax.xml.namespace.QName("", "stdCodeDescription");
        
        
        /**
         * Gets the "stdCodeNumber" element
         */
        public java.lang.String getStdCodeNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STDCODENUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stdCodeNumber" element
         */
        public org.apache.xmlbeans.XmlString xgetStdCodeNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STDCODENUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "stdCodeNumber" element
         */
        public void setStdCodeNumber(java.lang.String stdCodeNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STDCODENUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STDCODENUMBER$0);
                }
                target.setStringValue(stdCodeNumber);
            }
        }
        
        /**
         * Sets (as xml) the "stdCodeNumber" element
         */
        public void xsetStdCodeNumber(org.apache.xmlbeans.XmlString stdCodeNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STDCODENUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STDCODENUMBER$0);
                }
                target.set(stdCodeNumber);
            }
        }
        
        /**
         * Gets the "stdCodeValue" element
         */
        public java.lang.String getStdCodeValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STDCODEVALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stdCodeValue" element
         */
        public org.apache.xmlbeans.XmlString xgetStdCodeValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STDCODEVALUE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "stdCodeValue" element
         */
        public void setStdCodeValue(java.lang.String stdCodeValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STDCODEVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STDCODEVALUE$2);
                }
                target.setStringValue(stdCodeValue);
            }
        }
        
        /**
         * Sets (as xml) the "stdCodeValue" element
         */
        public void xsetStdCodeValue(org.apache.xmlbeans.XmlString stdCodeValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STDCODEVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STDCODEVALUE$2);
                }
                target.set(stdCodeValue);
            }
        }
        
        /**
         * Gets the "stdCodeDescription" element
         */
        public java.lang.String getStdCodeDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STDCODEDESCRIPTION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stdCodeDescription" element
         */
        public org.apache.xmlbeans.XmlString xgetStdCodeDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STDCODEDESCRIPTION$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "stdCodeDescription" element
         */
        public void setStdCodeDescription(java.lang.String stdCodeDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STDCODEDESCRIPTION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STDCODEDESCRIPTION$4);
                }
                target.setStringValue(stdCodeDescription);
            }
        }
        
        /**
         * Sets (as xml) the "stdCodeDescription" element
         */
        public void xsetStdCodeDescription(org.apache.xmlbeans.XmlString stdCodeDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STDCODEDESCRIPTION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STDCODEDESCRIPTION$4);
                }
                target.set(stdCodeDescription);
            }
        }
    }
}
