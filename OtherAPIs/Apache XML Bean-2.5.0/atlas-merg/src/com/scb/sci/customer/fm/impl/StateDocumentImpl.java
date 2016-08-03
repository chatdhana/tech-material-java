/*
 * An XML document type.
 * Localname: state
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.StateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one state(@) element.
 *
 * This is a complex type.
 */
public class StateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.StateDocument
{
    private static final long serialVersionUID = 1L;
    
    public StateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATE$0 = 
        new javax.xml.namespace.QName("", "state");
    
    
    /**
     * Gets the "state" element
     */
    public java.lang.String getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "state" element
     */
    public org.apache.xmlbeans.XmlString xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "state" element
     */
    public void setState(java.lang.String state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$0);
            }
            target.setStringValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "state" element
     */
    public void xsetState(org.apache.xmlbeans.XmlString state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATE$0);
            }
            target.set(state);
        }
    }
}
