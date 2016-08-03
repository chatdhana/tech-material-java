/*
 * An XML document type.
 * Localname: scbClassCode
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ScbClassCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one scbClassCode(@) element.
 *
 * This is a complex type.
 */
public class ScbClassCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ScbClassCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScbClassCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCBCLASSCODE$0 = 
        new javax.xml.namespace.QName("", "scbClassCode");
    
    
    /**
     * Gets the "scbClassCode" element
     */
    public java.lang.String getScbClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBCLASSCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scbClassCode" element
     */
    public org.apache.xmlbeans.XmlString xgetScbClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBCLASSCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scbClassCode" element
     */
    public void setScbClassCode(java.lang.String scbClassCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBCLASSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBCLASSCODE$0);
            }
            target.setStringValue(scbClassCode);
        }
    }
    
    /**
     * Sets (as xml) the "scbClassCode" element
     */
    public void xsetScbClassCode(org.apache.xmlbeans.XmlString scbClassCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBCLASSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBCLASSCODE$0);
            }
            target.set(scbClassCode);
        }
    }
}
