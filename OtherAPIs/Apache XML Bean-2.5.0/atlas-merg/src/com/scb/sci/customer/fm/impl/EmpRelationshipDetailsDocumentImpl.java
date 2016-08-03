/*
 * An XML document type.
 * Localname: empRelationshipDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.EmpRelationshipDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one empRelationshipDetails(@) element.
 *
 * This is a complex type.
 */
public class EmpRelationshipDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.EmpRelationshipDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmpRelationshipDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPRELATIONSHIPDETAILS$0 = 
        new javax.xml.namespace.QName("", "empRelationshipDetails");
    
    
    /**
     * Gets the "empRelationshipDetails" element
     */
    public com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails getEmpRelationshipDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails target = null;
            target = (com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails)get_store().find_element_user(EMPRELATIONSHIPDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "empRelationshipDetails" element
     */
    public void setEmpRelationshipDetails(com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails empRelationshipDetails)
    {
        generatedSetterHelperImpl(empRelationshipDetails, EMPRELATIONSHIPDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "empRelationshipDetails" element
     */
    public com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails addNewEmpRelationshipDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails target = null;
            target = (com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails)get_store().add_element_user(EMPRELATIONSHIPDETAILS$0);
            return target;
        }
    }
    /**
     * An XML empRelationshipDetails(@).
     *
     * This is a complex type.
     */
    public static class EmpRelationshipDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.EmpRelationshipDetailsDocument.EmpRelationshipDetails
    {
        private static final long serialVersionUID = 1L;
        
        public EmpRelationshipDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EMPRELATIONSHIP$0 = 
            new javax.xml.namespace.QName("", "empRelationship");
        
        
        /**
         * Gets the "empRelationship" element
         */
        public com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship getEmpRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship target = null;
                target = (com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship)get_store().find_element_user(EMPRELATIONSHIP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "empRelationship" element
         */
        public void setEmpRelationship(com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship empRelationship)
        {
            generatedSetterHelperImpl(empRelationship, EMPRELATIONSHIP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "empRelationship" element
         */
        public com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship addNewEmpRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship target = null;
                target = (com.scb.sci.customer.fm.EmpRelationshipDocument.EmpRelationship)get_store().add_element_user(EMPRELATIONSHIP$0);
                return target;
            }
        }
    }
}
