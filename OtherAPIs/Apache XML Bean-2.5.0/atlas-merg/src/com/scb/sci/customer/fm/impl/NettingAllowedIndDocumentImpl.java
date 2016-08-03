/*
 * An XML document type.
 * Localname: nettingAllowedInd
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.NettingAllowedIndDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one nettingAllowedInd(@) element.
 *
 * This is a complex type.
 */
public class NettingAllowedIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.NettingAllowedIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public NettingAllowedIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NETTINGALLOWEDIND$0 = 
        new javax.xml.namespace.QName("", "nettingAllowedInd");
    
    
    /**
     * Gets the "nettingAllowedInd" element
     */
    public java.lang.String getNettingAllowedInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETTINGALLOWEDIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nettingAllowedInd" element
     */
    public org.apache.xmlbeans.XmlString xgetNettingAllowedInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NETTINGALLOWEDIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nettingAllowedInd" element
     */
    public void setNettingAllowedInd(java.lang.String nettingAllowedInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETTINGALLOWEDIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NETTINGALLOWEDIND$0);
            }
            target.setStringValue(nettingAllowedInd);
        }
    }
    
    /**
     * Sets (as xml) the "nettingAllowedInd" element
     */
    public void xsetNettingAllowedInd(org.apache.xmlbeans.XmlString nettingAllowedInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NETTINGALLOWEDIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NETTINGALLOWEDIND$0);
            }
            target.set(nettingAllowedInd);
        }
    }
}
