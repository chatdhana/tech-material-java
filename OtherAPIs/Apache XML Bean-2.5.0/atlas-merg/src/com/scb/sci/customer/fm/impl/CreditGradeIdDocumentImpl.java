/*
 * An XML document type.
 * Localname: creditGradeId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.CreditGradeIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one creditGradeId(@) element.
 *
 * This is a complex type.
 */
public class CreditGradeIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CreditGradeIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreditGradeIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREDITGRADEID$0 = 
        new javax.xml.namespace.QName("", "creditGradeId");
    
    
    /**
     * Gets the "creditGradeId" element
     */
    public java.lang.String getCreditGradeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITGRADEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "creditGradeId" element
     */
    public org.apache.xmlbeans.XmlString xgetCreditGradeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDITGRADEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "creditGradeId" element
     */
    public void setCreditGradeId(java.lang.String creditGradeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITGRADEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITGRADEID$0);
            }
            target.setStringValue(creditGradeId);
        }
    }
    
    /**
     * Sets (as xml) the "creditGradeId" element
     */
    public void xsetCreditGradeId(org.apache.xmlbeans.XmlString creditGradeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREDITGRADEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREDITGRADEID$0);
            }
            target.set(creditGradeId);
        }
    }
}
