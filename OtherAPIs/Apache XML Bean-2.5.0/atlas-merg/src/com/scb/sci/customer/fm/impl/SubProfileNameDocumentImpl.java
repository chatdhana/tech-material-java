/*
 * An XML document type.
 * Localname: subProfileName
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.SubProfileNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one subProfileName(@) element.
 *
 * This is a complex type.
 */
public class SubProfileNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.SubProfileNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubProfileNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBPROFILENAME$0 = 
        new javax.xml.namespace.QName("", "subProfileName");
    
    
    /**
     * Gets the "subProfileName" element
     */
    public java.lang.String getSubProfileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPROFILENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subProfileName" element
     */
    public org.apache.xmlbeans.XmlString xgetSubProfileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPROFILENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "subProfileName" element
     */
    public void setSubProfileName(java.lang.String subProfileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPROFILENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBPROFILENAME$0);
            }
            target.setStringValue(subProfileName);
        }
    }
    
    /**
     * Sets (as xml) the "subProfileName" element
     */
    public void xsetSubProfileName(org.apache.xmlbeans.XmlString subProfileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPROFILENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBPROFILENAME$0);
            }
            target.set(subProfileName);
        }
    }
}
