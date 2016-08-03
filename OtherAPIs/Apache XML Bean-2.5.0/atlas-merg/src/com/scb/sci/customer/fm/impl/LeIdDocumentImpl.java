/*
 * An XML document type.
 * Localname: leId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.LeIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one leId(@) element.
 *
 * This is a complex type.
 */
public class LeIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.LeIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEID$0 = 
        new javax.xml.namespace.QName("", "leId");
    
    
    /**
     * Gets the "leId" element
     */
    public java.lang.String getLeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leId" element
     */
    public org.apache.xmlbeans.XmlString xgetLeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leId" element
     */
    public void setLeId(java.lang.String leId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEID$0);
            }
            target.setStringValue(leId);
        }
    }
    
    /**
     * Sets (as xml) the "leId" element
     */
    public void xsetLeId(org.apache.xmlbeans.XmlString leId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEID$0);
            }
            target.set(leId);
        }
    }
}
