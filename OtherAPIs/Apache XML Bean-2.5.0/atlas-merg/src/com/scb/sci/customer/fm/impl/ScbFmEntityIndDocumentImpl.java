/*
 * An XML document type.
 * Localname: scbFmEntityInd
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ScbFmEntityIndDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one scbFmEntityInd(@) element.
 *
 * This is a complex type.
 */
public class ScbFmEntityIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ScbFmEntityIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScbFmEntityIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCBFMENTITYIND$0 = 
        new javax.xml.namespace.QName("", "scbFmEntityInd");
    
    
    /**
     * Gets the "scbFmEntityInd" element
     */
    public java.lang.String getScbFmEntityInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBFMENTITYIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scbFmEntityInd" element
     */
    public org.apache.xmlbeans.XmlString xgetScbFmEntityInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBFMENTITYIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scbFmEntityInd" element
     */
    public void setScbFmEntityInd(java.lang.String scbFmEntityInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBFMENTITYIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBFMENTITYIND$0);
            }
            target.setStringValue(scbFmEntityInd);
        }
    }
    
    /**
     * Sets (as xml) the "scbFmEntityInd" element
     */
    public void xsetScbFmEntityInd(org.apache.xmlbeans.XmlString scbFmEntityInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBFMENTITYIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBFMENTITYIND$0);
            }
            target.set(scbFmEntityInd);
        }
    }
}
