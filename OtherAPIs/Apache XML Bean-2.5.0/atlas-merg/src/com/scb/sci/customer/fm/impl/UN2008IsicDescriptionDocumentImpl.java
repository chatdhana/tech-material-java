/*
 * An XML document type.
 * Localname: UN2008IsicDescription
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.UN2008IsicDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one UN2008IsicDescription(@) element.
 *
 * This is a complex type.
 */
public class UN2008IsicDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.UN2008IsicDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public UN2008IsicDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UN2008ISICDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "UN2008IsicDescription");
    
    
    /**
     * Gets the "UN2008IsicDescription" element
     */
    public java.lang.String getUN2008IsicDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UN2008ISICDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UN2008IsicDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetUN2008IsicDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UN2008ISICDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UN2008IsicDescription" element
     */
    public void setUN2008IsicDescription(java.lang.String un2008IsicDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UN2008ISICDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UN2008ISICDESCRIPTION$0);
            }
            target.setStringValue(un2008IsicDescription);
        }
    }
    
    /**
     * Sets (as xml) the "UN2008IsicDescription" element
     */
    public void xsetUN2008IsicDescription(org.apache.xmlbeans.XmlString un2008IsicDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UN2008ISICDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UN2008ISICDESCRIPTION$0);
            }
            target.set(un2008IsicDescription);
        }
    }
}
