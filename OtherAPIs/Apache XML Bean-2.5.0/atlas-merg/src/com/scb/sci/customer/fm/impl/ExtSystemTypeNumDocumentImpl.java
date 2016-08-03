/*
 * An XML document type.
 * Localname: extSystemTypeNum
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ExtSystemTypeNumDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one extSystemTypeNum(@) element.
 *
 * This is a complex type.
 */
public class ExtSystemTypeNumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ExtSystemTypeNumDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtSystemTypeNumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTSYSTEMTYPENUM$0 = 
        new javax.xml.namespace.QName("", "extSystemTypeNum");
    
    
    /**
     * Gets the "extSystemTypeNum" element
     */
    public java.lang.String getExtSystemTypeNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTSYSTEMTYPENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "extSystemTypeNum" element
     */
    public org.apache.xmlbeans.XmlString xgetExtSystemTypeNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTSYSTEMTYPENUM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "extSystemTypeNum" element
     */
    public void setExtSystemTypeNum(java.lang.String extSystemTypeNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTSYSTEMTYPENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTSYSTEMTYPENUM$0);
            }
            target.setStringValue(extSystemTypeNum);
        }
    }
    
    /**
     * Sets (as xml) the "extSystemTypeNum" element
     */
    public void xsetExtSystemTypeNum(org.apache.xmlbeans.XmlString extSystemTypeNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTSYSTEMTYPENUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTSYSTEMTYPENUM$0);
            }
            target.set(extSystemTypeNum);
        }
    }
}
