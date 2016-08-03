/*
 * An XML document type.
 * Localname: dvpCustInd
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DvpCustIndDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one dvpCustInd(@) element.
 *
 * This is a complex type.
 */
public class DvpCustIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DvpCustIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public DvpCustIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DVPCUSTIND$0 = 
        new javax.xml.namespace.QName("", "dvpCustInd");
    
    
    /**
     * Gets the "dvpCustInd" element
     */
    public java.lang.String getDvpCustInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DVPCUSTIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dvpCustInd" element
     */
    public org.apache.xmlbeans.XmlString xgetDvpCustInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DVPCUSTIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dvpCustInd" element
     */
    public void setDvpCustInd(java.lang.String dvpCustInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DVPCUSTIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DVPCUSTIND$0);
            }
            target.setStringValue(dvpCustInd);
        }
    }
    
    /**
     * Sets (as xml) the "dvpCustInd" element
     */
    public void xsetDvpCustInd(org.apache.xmlbeans.XmlString dvpCustInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DVPCUSTIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DVPCUSTIND$0);
            }
            target.set(dvpCustInd);
        }
    }
}
