/*
 * An XML document type.
 * Localname: bisWeighting
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.BisWeightingDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one bisWeighting(@) element.
 *
 * This is a complex type.
 */
public class BisWeightingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.BisWeightingDocument
{
    private static final long serialVersionUID = 1L;
    
    public BisWeightingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BISWEIGHTING$0 = 
        new javax.xml.namespace.QName("", "bisWeighting");
    
    
    /**
     * Gets the "bisWeighting" element
     */
    public java.lang.String getBisWeighting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BISWEIGHTING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bisWeighting" element
     */
    public org.apache.xmlbeans.XmlString xgetBisWeighting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BISWEIGHTING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bisWeighting" element
     */
    public void setBisWeighting(java.lang.String bisWeighting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BISWEIGHTING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BISWEIGHTING$0);
            }
            target.setStringValue(bisWeighting);
        }
    }
    
    /**
     * Sets (as xml) the "bisWeighting" element
     */
    public void xsetBisWeighting(org.apache.xmlbeans.XmlString bisWeighting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BISWEIGHTING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BISWEIGHTING$0);
            }
            target.set(bisWeighting);
        }
    }
}
