/*
 * An XML document type.
 * Localname: updateStatusIndicator
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.UpdateStatusIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one updateStatusIndicator(@) element.
 *
 * This is a complex type.
 */
public class UpdateStatusIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.UpdateStatusIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateStatusIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$0 = 
        new javax.xml.namespace.QName("", "updateStatusIndicator");
    
    
    /**
     * Gets the "updateStatusIndicator" element
     */
    public java.lang.String getUpdateStatusIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "updateStatusIndicator" element
     */
    public org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "updateStatusIndicator" element
     */
    public void setUpdateStatusIndicator(java.lang.String updateStatusIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$0);
            }
            target.setStringValue(updateStatusIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "updateStatusIndicator" element
     */
    public void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$0);
            }
            target.set(updateStatusIndicator);
        }
    }
}
