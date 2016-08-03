/*
 * An XML document type.
 * Localname: xrefSystem
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.XrefSystemDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one xrefSystem(@) element.
 *
 * This is a complex type.
 */
public class XrefSystemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.XrefSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public XrefSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XREFSYSTEM$0 = 
        new javax.xml.namespace.QName("", "xrefSystem");
    
    
    /**
     * Gets the "xrefSystem" element
     */
    public java.lang.String getXrefSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XREFSYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "xrefSystem" element
     */
    public org.apache.xmlbeans.XmlString xgetXrefSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XREFSYSTEM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "xrefSystem" element
     */
    public void setXrefSystem(java.lang.String xrefSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XREFSYSTEM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XREFSYSTEM$0);
            }
            target.setStringValue(xrefSystem);
        }
    }
    
    /**
     * Sets (as xml) the "xrefSystem" element
     */
    public void xsetXrefSystem(org.apache.xmlbeans.XmlString xrefSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XREFSYSTEM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XREFSYSTEM$0);
            }
            target.set(xrefSystem);
        }
    }
}
