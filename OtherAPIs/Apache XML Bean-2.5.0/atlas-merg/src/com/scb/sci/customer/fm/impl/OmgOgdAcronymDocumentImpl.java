/*
 * An XML document type.
 * Localname: omgOgdAcronym
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.OmgOgdAcronymDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one omgOgdAcronym(@) element.
 *
 * This is a complex type.
 */
public class OmgOgdAcronymDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.OmgOgdAcronymDocument
{
    private static final long serialVersionUID = 1L;
    
    public OmgOgdAcronymDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OMGOGDACRONYM$0 = 
        new javax.xml.namespace.QName("", "omgOgdAcronym");
    
    
    /**
     * Gets the "omgOgdAcronym" element
     */
    public java.lang.String getOmgOgdAcronym()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGOGDACRONYM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "omgOgdAcronym" element
     */
    public org.apache.xmlbeans.XmlString xgetOmgOgdAcronym()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGOGDACRONYM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "omgOgdAcronym" element
     */
    public void setOmgOgdAcronym(java.lang.String omgOgdAcronym)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGOGDACRONYM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMGOGDACRONYM$0);
            }
            target.setStringValue(omgOgdAcronym);
        }
    }
    
    /**
     * Sets (as xml) the "omgOgdAcronym" element
     */
    public void xsetOmgOgdAcronym(org.apache.xmlbeans.XmlString omgOgdAcronym)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGOGDACRONYM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMGOGDACRONYM$0);
            }
            target.set(omgOgdAcronym);
        }
    }
}
