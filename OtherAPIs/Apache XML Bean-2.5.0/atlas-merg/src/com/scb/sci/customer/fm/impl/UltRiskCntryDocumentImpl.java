/*
 * An XML document type.
 * Localname: ultRiskCntry
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.UltRiskCntryDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one ultRiskCntry(@) element.
 *
 * This is a complex type.
 */
public class UltRiskCntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.UltRiskCntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public UltRiskCntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ULTRISKCNTRY$0 = 
        new javax.xml.namespace.QName("", "ultRiskCntry");
    
    
    /**
     * Gets the "ultRiskCntry" element
     */
    public java.lang.String getUltRiskCntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTRISKCNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ultRiskCntry" element
     */
    public org.apache.xmlbeans.XmlString xgetUltRiskCntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTRISKCNTRY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ultRiskCntry" element
     */
    public void setUltRiskCntry(java.lang.String ultRiskCntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTRISKCNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULTRISKCNTRY$0);
            }
            target.setStringValue(ultRiskCntry);
        }
    }
    
    /**
     * Sets (as xml) the "ultRiskCntry" element
     */
    public void xsetUltRiskCntry(org.apache.xmlbeans.XmlString ultRiskCntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTRISKCNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULTRISKCNTRY$0);
            }
            target.set(ultRiskCntry);
        }
    }
}
