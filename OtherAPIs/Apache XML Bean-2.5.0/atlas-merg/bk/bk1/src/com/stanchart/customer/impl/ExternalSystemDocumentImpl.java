/*
 * An XML document type.
 * Localname: externalSystem
 * Namespace: 
 * Java type: com.stanchart.customer.ExternalSystemDocument
 *
 * Automatically generated - do not modify.
 */
package com.stanchart.customer.impl;
/**
 * A document containing one externalSystem(@) element.
 *
 * This is a complex type.
 */
public class ExternalSystemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.stanchart.customer.ExternalSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExternalSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALSYSTEM$0 = 
        new javax.xml.namespace.QName("", "externalSystem");
    
    
    /**
     * Gets the "externalSystem" element
     */
    public com.stanchart.customer.ExternalSystemDocument.ExternalSystem getExternalSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.stanchart.customer.ExternalSystemDocument.ExternalSystem target = null;
            target = (com.stanchart.customer.ExternalSystemDocument.ExternalSystem)get_store().find_element_user(EXTERNALSYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "externalSystem" element
     */
    public void setExternalSystem(com.stanchart.customer.ExternalSystemDocument.ExternalSystem externalSystem)
    {
        generatedSetterHelperImpl(externalSystem, EXTERNALSYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "externalSystem" element
     */
    public com.stanchart.customer.ExternalSystemDocument.ExternalSystem addNewExternalSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.stanchart.customer.ExternalSystemDocument.ExternalSystem target = null;
            target = (com.stanchart.customer.ExternalSystemDocument.ExternalSystem)get_store().add_element_user(EXTERNALSYSTEM$0);
            return target;
        }
    }
    /**
     * An XML externalSystem(@).
     *
     * This is a complex type.
     */
    public static class ExternalSystemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.stanchart.customer.ExternalSystemDocument.ExternalSystem
    {
        private static final long serialVersionUID = 1L;
        
        public ExternalSystemImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXTSYSTEMTYPENUM$0 = 
            new javax.xml.namespace.QName("", "extSystemTypeNum");
        private static final javax.xml.namespace.QName EXTSYSTEMTYPEVALUE$2 = 
            new javax.xml.namespace.QName("", "extSystemTypeValue");
        
        
        /**
         * Gets the "extSystemTypeNum" element
         */
        public java.lang.String getExtSystemTypeNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTSYSTEMTYPENUM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "extSystemTypeNum" element
         */
        public org.apache.xmlbeans.XmlString xgetExtSystemTypeNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTSYSTEMTYPENUM$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "extSystemTypeNum" element
         */
        public boolean isSetExtSystemTypeNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTSYSTEMTYPENUM$0) != 0;
            }
        }
        
        /**
         * Sets the "extSystemTypeNum" element
         */
        public void setExtSystemTypeNum(java.lang.String extSystemTypeNum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTSYSTEMTYPENUM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTSYSTEMTYPENUM$0);
                }
                target.setStringValue(extSystemTypeNum);
            }
        }
        
        /**
         * Sets (as xml) the "extSystemTypeNum" element
         */
        public void xsetExtSystemTypeNum(org.apache.xmlbeans.XmlString extSystemTypeNum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTSYSTEMTYPENUM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTSYSTEMTYPENUM$0);
                }
                target.set(extSystemTypeNum);
            }
        }
        
        /**
         * Unsets the "extSystemTypeNum" element
         */
        public void unsetExtSystemTypeNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTSYSTEMTYPENUM$0, 0);
            }
        }
        
        /**
         * Gets the "extSystemTypeValue" element
         */
        public java.lang.String getExtSystemTypeValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTSYSTEMTYPEVALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "extSystemTypeValue" element
         */
        public org.apache.xmlbeans.XmlString xgetExtSystemTypeValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTSYSTEMTYPEVALUE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "extSystemTypeValue" element
         */
        public boolean isSetExtSystemTypeValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTSYSTEMTYPEVALUE$2) != 0;
            }
        }
        
        /**
         * Sets the "extSystemTypeValue" element
         */
        public void setExtSystemTypeValue(java.lang.String extSystemTypeValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTSYSTEMTYPEVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTSYSTEMTYPEVALUE$2);
                }
                target.setStringValue(extSystemTypeValue);
            }
        }
        
        /**
         * Sets (as xml) the "extSystemTypeValue" element
         */
        public void xsetExtSystemTypeValue(org.apache.xmlbeans.XmlString extSystemTypeValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTSYSTEMTYPEVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTSYSTEMTYPEVALUE$2);
                }
                target.set(extSystemTypeValue);
            }
        }
        
        /**
         * Unsets the "extSystemTypeValue" element
         */
        public void unsetExtSystemTypeValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTSYSTEMTYPEVALUE$2, 0);
            }
        }
    }
}
