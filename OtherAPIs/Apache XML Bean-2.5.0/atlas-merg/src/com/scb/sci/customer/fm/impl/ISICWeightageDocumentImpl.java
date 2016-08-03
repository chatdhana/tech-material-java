/*
 * An XML document type.
 * Localname: ISICWeightage
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ISICWeightageDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one ISICWeightage(@) element.
 *
 * This is a complex type.
 */
public class ISICWeightageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ISICWeightageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ISICWeightageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISICWEIGHTAGE$0 = 
        new javax.xml.namespace.QName("", "ISICWeightage");
    
    
    /**
     * Gets the "ISICWeightage" element
     */
    public java.lang.String getISICWeightage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICWEIGHTAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ISICWeightage" element
     */
    public org.apache.xmlbeans.XmlString xgetISICWeightage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICWEIGHTAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ISICWeightage" element
     */
    public void setISICWeightage(java.lang.String isicWeightage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICWEIGHTAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISICWEIGHTAGE$0);
            }
            target.setStringValue(isicWeightage);
        }
    }
    
    /**
     * Sets (as xml) the "ISICWeightage" element
     */
    public void xsetISICWeightage(org.apache.xmlbeans.XmlString isicWeightage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICWEIGHTAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISICWEIGHTAGE$0);
            }
            target.set(isicWeightage);
        }
    }
}
