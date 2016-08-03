/*
 * An XML document type.
 * Localname: bkgLocationId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.BkgLocationIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one bkgLocationId(@) element.
 *
 * This is a complex type.
 */
public class BkgLocationIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.BkgLocationIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public BkgLocationIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BKGLOCATIONID$0 = 
        new javax.xml.namespace.QName("", "bkgLocationId");
    
    
    /**
     * Gets the "bkgLocationId" element
     */
    public java.lang.String getBkgLocationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bkgLocationId" element
     */
    public org.apache.xmlbeans.XmlString xgetBkgLocationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bkgLocationId" element
     */
    public void setBkgLocationId(java.lang.String bkgLocationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BKGLOCATIONID$0);
            }
            target.setStringValue(bkgLocationId);
        }
    }
    
    /**
     * Sets (as xml) the "bkgLocationId" element
     */
    public void xsetBkgLocationId(org.apache.xmlbeans.XmlString bkgLocationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BKGLOCATIONID$0);
            }
            target.set(bkgLocationId);
        }
    }
}
