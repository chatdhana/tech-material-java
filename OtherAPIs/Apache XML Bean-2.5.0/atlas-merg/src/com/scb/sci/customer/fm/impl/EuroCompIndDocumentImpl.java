/*
 * An XML document type.
 * Localname: euroCompInd
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.EuroCompIndDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one euroCompInd(@) element.
 *
 * This is a complex type.
 */
public class EuroCompIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.EuroCompIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public EuroCompIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EUROCOMPIND$0 = 
        new javax.xml.namespace.QName("", "euroCompInd");
    
    
    /**
     * Gets the "euroCompInd" element
     */
    public java.lang.String getEuroCompInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EUROCOMPIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "euroCompInd" element
     */
    public org.apache.xmlbeans.XmlString xgetEuroCompInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EUROCOMPIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "euroCompInd" element
     */
    public void setEuroCompInd(java.lang.String euroCompInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EUROCOMPIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EUROCOMPIND$0);
            }
            target.setStringValue(euroCompInd);
        }
    }
    
    /**
     * Sets (as xml) the "euroCompInd" element
     */
    public void xsetEuroCompInd(org.apache.xmlbeans.XmlString euroCompInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EUROCOMPIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EUROCOMPIND$0);
            }
            target.set(euroCompInd);
        }
    }
}
