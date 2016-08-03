/*
 * An XML document type.
 * Localname: dataProtInd
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.DataProtIndDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one dataProtInd(@) element.
 *
 * This is a complex type.
 */
public class DataProtIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.DataProtIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataProtIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAPROTIND$0 = 
        new javax.xml.namespace.QName("", "dataProtInd");
    
    
    /**
     * Gets the "dataProtInd" element
     */
    public java.lang.String getDataProtInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROTIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataProtInd" element
     */
    public org.apache.xmlbeans.XmlString xgetDataProtInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROTIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dataProtInd" element
     */
    public void setDataProtInd(java.lang.String dataProtInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROTIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAPROTIND$0);
            }
            target.setStringValue(dataProtInd);
        }
    }
    
    /**
     * Sets (as xml) the "dataProtInd" element
     */
    public void xsetDataProtInd(org.apache.xmlbeans.XmlString dataProtInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROTIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAPROTIND$0);
            }
            target.set(dataProtInd);
        }
    }
}
