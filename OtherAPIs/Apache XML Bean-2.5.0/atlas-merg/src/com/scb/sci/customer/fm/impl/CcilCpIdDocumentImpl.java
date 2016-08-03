/*
 * An XML document type.
 * Localname: ccilCpId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.CcilCpIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one ccilCpId(@) element.
 *
 * This is a complex type.
 */
public class CcilCpIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.CcilCpIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public CcilCpIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CCILCPID$0 = 
        new javax.xml.namespace.QName("", "ccilCpId");
    
    
    /**
     * Gets the "ccilCpId" element
     */
    public java.lang.String getCcilCpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CCILCPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ccilCpId" element
     */
    public org.apache.xmlbeans.XmlString xgetCcilCpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CCILCPID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ccilCpId" element
     */
    public void setCcilCpId(java.lang.String ccilCpId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CCILCPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CCILCPID$0);
            }
            target.setStringValue(ccilCpId);
        }
    }
    
    /**
     * Sets (as xml) the "ccilCpId" element
     */
    public void xsetCcilCpId(org.apache.xmlbeans.XmlString ccilCpId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CCILCPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CCILCPID$0);
            }
            target.set(ccilCpId);
        }
    }
}
