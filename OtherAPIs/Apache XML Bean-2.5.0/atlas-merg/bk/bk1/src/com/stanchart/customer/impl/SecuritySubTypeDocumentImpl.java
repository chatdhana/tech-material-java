/*
 * An XML document type.
 * Localname: securitySubType
 * Namespace: 
 * Java type: com.stanchart.customer.SecuritySubTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.stanchart.customer.impl;
/**
 * A document containing one securitySubType(@) element.
 *
 * This is a complex type.
 */
public class SecuritySubTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.stanchart.customer.SecuritySubTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecuritySubTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYSUBTYPE$0 = 
        new javax.xml.namespace.QName("", "securitySubType");
    
    
    /**
     * Gets the "securitySubType" element
     */
    public com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType getSecuritySubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType target = null;
            target = (com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType)get_store().find_element_user(SECURITYSUBTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "securitySubType" element
     */
    public void setSecuritySubType(com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType securitySubType)
    {
        generatedSetterHelperImpl(securitySubType, SECURITYSUBTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "securitySubType" element
     */
    public com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType addNewSecuritySubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType target = null;
            target = (com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType)get_store().add_element_user(SECURITYSUBTYPE$0);
            return target;
        }
    }
    /**
     * An XML securitySubType(@).
     *
     * This is a complex type.
     */
    public static class SecuritySubTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.stanchart.customer.SecuritySubTypeDocument.SecuritySubType
    {
        private static final long serialVersionUID = 1L;
        
        public SecuritySubTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
         * True if has "stdCodeNumber" element
         */
        public boolean isSetStdCodeNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STDCODENUMBER$0) != 0;
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
         * Unsets the "stdCodeNumber" element
         */
        public void unsetStdCodeNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STDCODENUMBER$0, 0);
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
         * True if has "stdCodeValue" element
         */
        public boolean isSetStdCodeValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STDCODEVALUE$2) != 0;
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
         * Unsets the "stdCodeValue" element
         */
        public void unsetStdCodeValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STDCODEVALUE$2, 0);
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
         * True if has "stdCodeDescription" element
         */
        public boolean isSetStdCodeDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STDCODEDESCRIPTION$4) != 0;
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
        
        /**
         * Unsets the "stdCodeDescription" element
         */
        public void unsetStdCodeDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STDCODEDESCRIPTION$4, 0);
            }
        }
    }
}
