/*
 * An XML document type.
 * Localname: dateOfSigningOfDiscAgr
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DateOfSigningOfDiscAgrDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one dateOfSigningOfDiscAgr(@) element.
 *
 * This is a complex type.
 */
public class DateOfSigningOfDiscAgrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DateOfSigningOfDiscAgrDocument
{
    private static final long serialVersionUID = 1L;
    
    public DateOfSigningOfDiscAgrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATEOFSIGNINGOFDISCAGR$0 = 
        new javax.xml.namespace.QName("", "dateOfSigningOfDiscAgr");
    
    
    /**
     * Gets the "dateOfSigningOfDiscAgr" element
     */
    public java.lang.String getDateOfSigningOfDiscAgr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOFSIGNINGOFDISCAGR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateOfSigningOfDiscAgr" element
     */
    public org.apache.xmlbeans.XmlString xgetDateOfSigningOfDiscAgr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEOFSIGNINGOFDISCAGR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dateOfSigningOfDiscAgr" element
     */
    public void setDateOfSigningOfDiscAgr(java.lang.String dateOfSigningOfDiscAgr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOFSIGNINGOFDISCAGR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEOFSIGNINGOFDISCAGR$0);
            }
            target.setStringValue(dateOfSigningOfDiscAgr);
        }
    }
    
    /**
     * Sets (as xml) the "dateOfSigningOfDiscAgr" element
     */
    public void xsetDateOfSigningOfDiscAgr(org.apache.xmlbeans.XmlString dateOfSigningOfDiscAgr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEOFSIGNINGOFDISCAGR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEOFSIGNINGOFDISCAGR$0);
            }
            target.set(dateOfSigningOfDiscAgr);
        }
    }
}
