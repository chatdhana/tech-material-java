/*
 * An XML document type.
 * Localname: KYCid
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.KYCidDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one KYCid(@) element.
 *
 * This is a complex type.
 */
public class KYCidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.KYCidDocument
{
    private static final long serialVersionUID = 1L;
    
    public KYCidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KYCID$0 = 
        new javax.xml.namespace.QName("", "KYCid");
    
    
    /**
     * Gets the "KYCid" element
     */
    public java.lang.String getKYCid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KYCID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "KYCid" element
     */
    public org.apache.xmlbeans.XmlString xgetKYCid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KYCID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "KYCid" element
     */
    public void setKYCid(java.lang.String kyCid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KYCID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KYCID$0);
            }
            target.setStringValue(kyCid);
        }
    }
    
    /**
     * Sets (as xml) the "KYCid" element
     */
    public void xsetKYCid(org.apache.xmlbeans.XmlString kyCid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KYCID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KYCID$0);
            }
            target.set(kyCid);
        }
    }
}
