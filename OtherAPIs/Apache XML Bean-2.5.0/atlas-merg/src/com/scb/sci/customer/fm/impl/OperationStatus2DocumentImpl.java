/*
 * An XML document type.
 * Localname: operationStatus2
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.OperationStatus2Document
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one operationStatus2(@) element.
 *
 * This is a complex type.
 */
public class OperationStatus2DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.OperationStatus2Document
{
    private static final long serialVersionUID = 1L;
    
    public OperationStatus2DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONSTATUS2$0 = 
        new javax.xml.namespace.QName("", "operationStatus2");
    
    
    /**
     * Gets the "operationStatus2" element
     */
    public com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2 getOperationStatus2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2 target = null;
            target = (com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2)get_store().find_element_user(OPERATIONSTATUS2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operationStatus2" element
     */
    public void setOperationStatus2(com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2 operationStatus2)
    {
        generatedSetterHelperImpl(operationStatus2, OPERATIONSTATUS2$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "operationStatus2" element
     */
    public com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2 addNewOperationStatus2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2 target = null;
            target = (com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2)get_store().add_element_user(OPERATIONSTATUS2$0);
            return target;
        }
    }
    /**
     * An XML operationStatus2(@).
     *
     * This is a complex type.
     */
    public static class OperationStatus2Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.OperationStatus2Document.OperationStatus2
    {
        private static final long serialVersionUID = 1L;
        
        public OperationStatus2Impl(org.apache.xmlbeans.SchemaType sType)
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
