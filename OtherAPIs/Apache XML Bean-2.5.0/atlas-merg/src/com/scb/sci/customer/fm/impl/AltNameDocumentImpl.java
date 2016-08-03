/*
 * An XML document type.
 * Localname: altName
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.AltNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one altName(@) element.
 *
 * This is a complex type.
 */
public class AltNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.AltNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public AltNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTNAME$0 = 
        new javax.xml.namespace.QName("", "altName");
    
    
    /**
     * Gets the "altName" element
     */
    public java.lang.String getAltName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "altName" element
     */
    public org.apache.xmlbeans.XmlString xgetAltName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "altName" element
     */
    public void setAltName(java.lang.String altName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTNAME$0);
            }
            target.setStringValue(altName);
        }
    }
    
    /**
     * Sets (as xml) the "altName" element
     */
    public void xsetAltName(org.apache.xmlbeans.XmlString altName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTNAME$0);
            }
            target.set(altName);
        }
    }
}
