/*
 * An XML document type.
 * Localname: nrdSignedInd
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.NrdSignedIndDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one nrdSignedInd(@) element.
 *
 * This is a complex type.
 */
public class NrdSignedIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.NrdSignedIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public NrdSignedIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NRDSIGNEDIND$0 = 
        new javax.xml.namespace.QName("", "nrdSignedInd");
    
    
    /**
     * Gets the "nrdSignedInd" element
     */
    public java.lang.String getNrdSignedInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRDSIGNEDIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nrdSignedInd" element
     */
    public org.apache.xmlbeans.XmlString xgetNrdSignedInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NRDSIGNEDIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nrdSignedInd" element
     */
    public void setNrdSignedInd(java.lang.String nrdSignedInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRDSIGNEDIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NRDSIGNEDIND$0);
            }
            target.setStringValue(nrdSignedInd);
        }
    }
    
    /**
     * Sets (as xml) the "nrdSignedInd" element
     */
    public void xsetNrdSignedInd(org.apache.xmlbeans.XmlString nrdSignedInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NRDSIGNEDIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NRDSIGNEDIND$0);
            }
            target.set(nrdSignedInd);
        }
    }
}
