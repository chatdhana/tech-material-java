/*
 * An XML document type.
 * Localname: mlNextReviewDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.MlNextReviewDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one mlNextReviewDate(@) element.
 *
 * This is a complex type.
 */
public class MlNextReviewDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.MlNextReviewDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public MlNextReviewDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MLNEXTREVIEWDATE$0 = 
        new javax.xml.namespace.QName("", "mlNextReviewDate");
    
    
    /**
     * Gets the "mlNextReviewDate" element
     */
    public java.lang.String getMlNextReviewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MLNEXTREVIEWDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mlNextReviewDate" element
     */
    public org.apache.xmlbeans.XmlString xgetMlNextReviewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MLNEXTREVIEWDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mlNextReviewDate" element
     */
    public void setMlNextReviewDate(java.lang.String mlNextReviewDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MLNEXTREVIEWDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MLNEXTREVIEWDATE$0);
            }
            target.setStringValue(mlNextReviewDate);
        }
    }
    
    /**
     * Sets (as xml) the "mlNextReviewDate" element
     */
    public void xsetMlNextReviewDate(org.apache.xmlbeans.XmlString mlNextReviewDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MLNEXTREVIEWDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MLNEXTREVIEWDATE$0);
            }
            target.set(mlNextReviewDate);
        }
    }
}
