/*
 * An XML document type.
 * Localname: creditGradeReasonForChange
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.CreditGradeReasonForChangeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one creditGradeReasonForChange(@) element.
 *
 * This is a complex type.
 */
public class CreditGradeReasonForChangeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CreditGradeReasonForChangeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreditGradeReasonForChangeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREDITGRADEREASONFORCHANGE$0 = 
        new javax.xml.namespace.QName("", "creditGradeReasonForChange");
    
    
    /**
     * Gets the "creditGradeReasonForChange" element
     */
    public java.lang.String getCreditGradeReasonForChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITGRADEREASONFORCHANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "creditGradeReasonForChange" element
     */
    public org.apache.xmlbeans.XmlString xgetCreditGradeReasonForChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDITGRADEREASONFORCHANGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "creditGradeReasonForChange" element
     */
    public void setCreditGradeReasonForChange(java.lang.String creditGradeReasonForChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITGRADEREASONFORCHANGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITGRADEREASONFORCHANGE$0);
            }
            target.setStringValue(creditGradeReasonForChange);
        }
    }
    
    /**
     * Sets (as xml) the "creditGradeReasonForChange" element
     */
    public void xsetCreditGradeReasonForChange(org.apache.xmlbeans.XmlString creditGradeReasonForChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDITGRADEREASONFORCHANGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREDITGRADEREASONFORCHANGE$0);
            }
            target.set(creditGradeReasonForChange);
        }
    }
}
