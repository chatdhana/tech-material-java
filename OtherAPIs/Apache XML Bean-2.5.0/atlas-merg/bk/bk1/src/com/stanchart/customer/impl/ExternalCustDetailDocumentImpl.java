/*
 * An XML document type.
 * Localname: externalCustDetail
 * Namespace: 
 * Java type: com.stanchart.customer.ExternalCustDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.stanchart.customer.impl;
/**
 * A document containing one externalCustDetail(@) element.
 *
 * This is a complex type.
 */
public class ExternalCustDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.stanchart.customer.ExternalCustDetailDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExternalCustDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALCUSTDETAIL$0 = 
        new javax.xml.namespace.QName("", "externalCustDetail");
    
    
    /**
     * Gets the "externalCustDetail" element
     */
    public com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail getExternalCustDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail target = null;
            target = (com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail)get_store().find_element_user(EXTERNALCUSTDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "externalCustDetail" element
     */
    public void setExternalCustDetail(com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail externalCustDetail)
    {
        generatedSetterHelperImpl(externalCustDetail, EXTERNALCUSTDETAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "externalCustDetail" element
     */
    public com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail addNewExternalCustDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail target = null;
            target = (com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail)get_store().add_element_user(EXTERNALCUSTDETAIL$0);
            return target;
        }
    }
    /**
     * An XML externalCustDetail(@).
     *
     * This is a complex type.
     */
    public static class ExternalCustDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.stanchart.customer.ExternalCustDetailDocument.ExternalCustDetail
    {
        private static final long serialVersionUID = 1L;
        
        public ExternalCustDetailImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXTERNALCUSTID$0 = 
            new javax.xml.namespace.QName("", "externalCustId");
        private static final javax.xml.namespace.QName EXTERNALCUSTNAME$2 = 
            new javax.xml.namespace.QName("", "externalCustName");
        
        
        /**
         * Gets the "externalCustId" element
         */
        public java.lang.String getExternalCustId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALCUSTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "externalCustId" element
         */
        public org.apache.xmlbeans.XmlString xgetExternalCustId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALCUSTID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "externalCustId" element
         */
        public boolean isSetExternalCustId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTERNALCUSTID$0) != 0;
            }
        }
        
        /**
         * Sets the "externalCustId" element
         */
        public void setExternalCustId(java.lang.String externalCustId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALCUSTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALCUSTID$0);
                }
                target.setStringValue(externalCustId);
            }
        }
        
        /**
         * Sets (as xml) the "externalCustId" element
         */
        public void xsetExternalCustId(org.apache.xmlbeans.XmlString externalCustId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALCUSTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALCUSTID$0);
                }
                target.set(externalCustId);
            }
        }
        
        /**
         * Unsets the "externalCustId" element
         */
        public void unsetExternalCustId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTERNALCUSTID$0, 0);
            }
        }
        
        /**
         * Gets the "externalCustName" element
         */
        public java.lang.String getExternalCustName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALCUSTNAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "externalCustName" element
         */
        public org.apache.xmlbeans.XmlString xgetExternalCustName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALCUSTNAME$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "externalCustName" element
         */
        public boolean isSetExternalCustName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTERNALCUSTNAME$2) != 0;
            }
        }
        
        /**
         * Sets the "externalCustName" element
         */
        public void setExternalCustName(java.lang.String externalCustName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALCUSTNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALCUSTNAME$2);
                }
                target.setStringValue(externalCustName);
            }
        }
        
        /**
         * Sets (as xml) the "externalCustName" element
         */
        public void xsetExternalCustName(org.apache.xmlbeans.XmlString externalCustName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALCUSTNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALCUSTNAME$2);
                }
                target.set(externalCustName);
            }
        }
        
        /**
         * Unsets the "externalCustName" element
         */
        public void unsetExternalCustName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTERNALCUSTNAME$2, 0);
            }
        }
    }
}
