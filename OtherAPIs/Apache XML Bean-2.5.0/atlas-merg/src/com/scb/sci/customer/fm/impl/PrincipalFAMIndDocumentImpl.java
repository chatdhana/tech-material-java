/*
 * An XML document type.
 * Localname: principalFAMInd
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.PrincipalFAMIndDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one principalFAMInd(@) element.
 *
 * This is a complex type.
 */
public class PrincipalFAMIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.PrincipalFAMIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrincipalFAMIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRINCIPALFAMIND$0 = 
        new javax.xml.namespace.QName("", "principalFAMInd");
    
    
    /**
     * Gets the "principalFAMInd" element
     */
    public java.lang.String getPrincipalFAMInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRINCIPALFAMIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "principalFAMInd" element
     */
    public org.apache.xmlbeans.XmlString xgetPrincipalFAMInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRINCIPALFAMIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "principalFAMInd" element
     */
    public void setPrincipalFAMInd(java.lang.String principalFAMInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRINCIPALFAMIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRINCIPALFAMIND$0);
            }
            target.setStringValue(principalFAMInd);
        }
    }
    
    /**
     * Sets (as xml) the "principalFAMInd" element
     */
    public void xsetPrincipalFAMInd(org.apache.xmlbeans.XmlString principalFAMInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRINCIPALFAMIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRINCIPALFAMIND$0);
            }
            target.set(principalFAMInd);
        }
    }
}
