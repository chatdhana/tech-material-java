/*
 * An XML document type.
 * Localname: instructionRefType
 * Namespace: 
 * Java type: com.stanchart.customer.InstructionRefTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.stanchart.customer.impl;
/**
 * A document containing one instructionRefType(@) element.
 *
 * This is a complex type.
 */
public class InstructionRefTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.stanchart.customer.InstructionRefTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public InstructionRefTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTRUCTIONREFTYPE$0 = 
        new javax.xml.namespace.QName("", "instructionRefType");
    
    
    /**
     * Gets the "instructionRefType" element
     */
    public com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType getInstructionRefType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType target = null;
            target = (com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType)get_store().find_element_user(INSTRUCTIONREFTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "instructionRefType" element
     */
    public void setInstructionRefType(com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType instructionRefType)
    {
        generatedSetterHelperImpl(instructionRefType, INSTRUCTIONREFTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "instructionRefType" element
     */
    public com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType addNewInstructionRefType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType target = null;
            target = (com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType)get_store().add_element_user(INSTRUCTIONREFTYPE$0);
            return target;
        }
    }
    /**
     * An XML instructionRefType(@).
     *
     * This is a complex type.
     */
    public static class InstructionRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.stanchart.customer.InstructionRefTypeDocument.InstructionRefType
    {
        private static final long serialVersionUID = 1L;
        
        public InstructionRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
