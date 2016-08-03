/*
 * An XML document type.
 * Localname: ISICEffectiveDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ISICEffectiveDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one ISICEffectiveDate(@) element.
 *
 * This is a complex type.
 */
public class ISICEffectiveDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ISICEffectiveDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public ISICEffectiveDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISICEFFECTIVEDATE$0 = 
        new javax.xml.namespace.QName("", "ISICEffectiveDate");
    
    
    /**
     * Gets the "ISICEffectiveDate" element
     */
    public java.lang.String getISICEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICEFFECTIVEDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ISICEffectiveDate" element
     */
    public org.apache.xmlbeans.XmlString xgetISICEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICEFFECTIVEDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ISICEffectiveDate" element
     */
    public void setISICEffectiveDate(java.lang.String isicEffectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICEFFECTIVEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISICEFFECTIVEDATE$0);
            }
            target.setStringValue(isicEffectiveDate);
        }
    }
    
    /**
     * Sets (as xml) the "ISICEffectiveDate" element
     */
    public void xsetISICEffectiveDate(org.apache.xmlbeans.XmlString isicEffectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICEFFECTIVEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISICEFFECTIVEDATE$0);
            }
            target.set(isicEffectiveDate);
        }
    }
}
