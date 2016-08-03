/*
 * An XML document type.
 * Localname: customerType
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.CustomerTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one customerType(@) element.
 *
 * This is a complex type.
 */
public class CustomerTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CustomerTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustomerTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMERTYPE$0 = 
        new javax.xml.namespace.QName("", "customerType");
    
    
    /**
     * Gets the "customerType" element
     */
    public com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType getCustomerType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType target = null;
            target = (com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType)get_store().find_element_user(CUSTOMERTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "customerType" element
     */
    public void setCustomerType(com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType customerType)
    {
        generatedSetterHelperImpl(customerType, CUSTOMERTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "customerType" element
     */
    public com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType addNewCustomerType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType target = null;
            target = (com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType)get_store().add_element_user(CUSTOMERTYPE$0);
            return target;
        }
    }
    /**
     * An XML customerType(@).
     *
     * This is a complex type.
     */
    public static class CustomerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CustomerTypeDocument.CustomerType
    {
        private static final long serialVersionUID = 1L;
        
        public CustomerTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
