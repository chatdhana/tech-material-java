/*
 * An XML document type.
 * Localname: mlLastReviewDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.MlLastReviewDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one mlLastReviewDate(@) element.
 *
 * This is a complex type.
 */
public class MlLastReviewDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.MlLastReviewDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public MlLastReviewDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MLLASTREVIEWDATE$0 = 
        new javax.xml.namespace.QName("", "mlLastReviewDate");
    
    
    /**
     * Gets the "mlLastReviewDate" element
     */
    public java.lang.String getMlLastReviewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MLLASTREVIEWDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mlLastReviewDate" element
     */
    public org.apache.xmlbeans.XmlString xgetMlLastReviewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MLLASTREVIEWDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mlLastReviewDate" element
     */
    public void setMlLastReviewDate(java.lang.String mlLastReviewDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MLLASTREVIEWDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MLLASTREVIEWDATE$0);
            }
            target.setStringValue(mlLastReviewDate);
        }
    }
    
    /**
     * Sets (as xml) the "mlLastReviewDate" element
     */
    public void xsetMlLastReviewDate(org.apache.xmlbeans.XmlString mlLastReviewDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MLLASTREVIEWDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MLLASTREVIEWDATE$0);
            }
            target.set(mlLastReviewDate);
        }
    }
}
