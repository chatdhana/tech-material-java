/*
 * An XML document type.
 * Localname: addrLine2
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.AddrLine2Document
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one addrLine2(@) element.
 *
 * This is a complex type.
 */
public class AddrLine2DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.AddrLine2Document
{
    private static final long serialVersionUID = 1L;
    
    public AddrLine2DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRLINE2$0 = 
        new javax.xml.namespace.QName("", "addrLine2");
    
    
    /**
     * Gets the "addrLine2" element
     */
    public java.lang.String getAddrLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addrLine2" element
     */
    public org.apache.xmlbeans.XmlString xgetAddrLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE2$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "addrLine2" element
     */
    public void setAddrLine2(java.lang.String addrLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRLINE2$0);
            }
            target.setStringValue(addrLine2);
        }
    }
    
    /**
     * Sets (as xml) the "addrLine2" element
     */
    public void xsetAddrLine2(org.apache.xmlbeans.XmlString addrLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRLINE2$0);
            }
            target.set(addrLine2);
        }
    }
}
