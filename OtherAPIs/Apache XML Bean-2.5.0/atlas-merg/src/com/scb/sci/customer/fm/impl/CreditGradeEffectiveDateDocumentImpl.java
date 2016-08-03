/*
 * An XML document type.
 * Localname: creditGradeEffectiveDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.CreditGradeEffectiveDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one creditGradeEffectiveDate(@) element.
 *
 * This is a complex type.
 */
public class CreditGradeEffectiveDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CreditGradeEffectiveDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreditGradeEffectiveDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREDITGRADEEFFECTIVEDATE$0 = 
        new javax.xml.namespace.QName("", "creditGradeEffectiveDate");
    
    
    /**
     * Gets the "creditGradeEffectiveDate" element
     */
    public java.lang.String getCreditGradeEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITGRADEEFFECTIVEDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "creditGradeEffectiveDate" element
     */
    public org.apache.xmlbeans.XmlString xgetCreditGradeEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDITGRADEEFFECTIVEDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "creditGradeEffectiveDate" element
     */
    public void setCreditGradeEffectiveDate(java.lang.String creditGradeEffectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITGRADEEFFECTIVEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITGRADEEFFECTIVEDATE$0);
            }
            target.setStringValue(creditGradeEffectiveDate);
        }
    }
    
    /**
     * Sets (as xml) the "creditGradeEffectiveDate" element
     */
    public void xsetCreditGradeEffectiveDate(org.apache.xmlbeans.XmlString creditGradeEffectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDITGRADEEFFECTIVEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREDITGRADEEFFECTIVEDATE$0);
            }
            target.set(creditGradeEffectiveDate);
        }
    }
}
