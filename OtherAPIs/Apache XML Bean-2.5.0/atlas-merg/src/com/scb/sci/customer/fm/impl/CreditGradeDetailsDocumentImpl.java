/*
 * An XML document type.
 * Localname: creditGradeDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.CreditGradeDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one creditGradeDetails(@) element.
 *
 * This is a complex type.
 */
public class CreditGradeDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CreditGradeDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreditGradeDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREDITGRADEDETAILS$0 = 
        new javax.xml.namespace.QName("", "creditGradeDetails");
    
    
    /**
     * Gets the "creditGradeDetails" element
     */
    public com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails getCreditGradeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails target = null;
            target = (com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails)get_store().find_element_user(CREDITGRADEDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "creditGradeDetails" element
     */
    public void setCreditGradeDetails(com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails creditGradeDetails)
    {
        generatedSetterHelperImpl(creditGradeDetails, CREDITGRADEDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "creditGradeDetails" element
     */
    public com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails addNewCreditGradeDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails target = null;
            target = (com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails)get_store().add_element_user(CREDITGRADEDETAILS$0);
            return target;
        }
    }
    /**
     * An XML creditGradeDetails(@).
     *
     * This is a complex type.
     */
    public static class CreditGradeDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CreditGradeDetailsDocument.CreditGradeDetails
    {
        private static final long serialVersionUID = 1L;
        
        public CreditGradeDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREDITGRADE$0 = 
            new javax.xml.namespace.QName("", "creditGrade");
        
        
        /**
         * Gets the "creditGrade" element
         */
        public com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade getCreditGrade()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade target = null;
                target = (com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade)get_store().find_element_user(CREDITGRADE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "creditGrade" element
         */
        public void setCreditGrade(com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade creditGrade)
        {
            generatedSetterHelperImpl(creditGrade, CREDITGRADE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "creditGrade" element
         */
        public com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade addNewCreditGrade()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade target = null;
                target = (com.scb.sci.customer.fm.CreditGradeDocument.CreditGrade)get_store().add_element_user(CREDITGRADE$0);
                return target;
            }
        }
    }
}
