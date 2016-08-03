/*
 * An XML document type.
 * Localname: subProfileId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.SubProfileIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one subProfileId(@) element.
 *
 * This is a complex type.
 */
public class SubProfileIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.SubProfileIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubProfileIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBPROFILEID$0 = 
        new javax.xml.namespace.QName("", "subProfileId");
    
    
    /**
     * Gets the "subProfileId" element
     */
    public java.lang.String getSubProfileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPROFILEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subProfileId" element
     */
    public org.apache.xmlbeans.XmlString xgetSubProfileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPROFILEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "subProfileId" element
     */
    public void setSubProfileId(java.lang.String subProfileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPROFILEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBPROFILEID$0);
            }
            target.setStringValue(subProfileId);
        }
    }
    
    /**
     * Sets (as xml) the "subProfileId" element
     */
    public void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPROFILEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBPROFILEID$0);
            }
            target.set(subProfileId);
        }
    }
}
