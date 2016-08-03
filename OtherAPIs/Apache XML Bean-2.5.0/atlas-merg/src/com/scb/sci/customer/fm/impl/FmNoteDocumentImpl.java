/*
 * An XML document type.
 * Localname: fmNote
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmNoteDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmNote(@) element.
 *
 * This is a complex type.
 */
public class FmNoteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmNoteDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmNoteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMNOTE$0 = 
        new javax.xml.namespace.QName("", "fmNote");
    
    
    /**
     * Gets the "fmNote" element
     */
    public java.lang.String getFmNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMNOTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmNote" element
     */
    public org.apache.xmlbeans.XmlString xgetFmNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMNOTE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fmNote" element
     */
    public void setFmNote(java.lang.String fmNote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMNOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMNOTE$0);
            }
            target.setStringValue(fmNote);
        }
    }
    
    /**
     * Sets (as xml) the "fmNote" element
     */
    public void xsetFmNote(org.apache.xmlbeans.XmlString fmNote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMNOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMNOTE$0);
            }
            target.set(fmNote);
        }
    }
}
