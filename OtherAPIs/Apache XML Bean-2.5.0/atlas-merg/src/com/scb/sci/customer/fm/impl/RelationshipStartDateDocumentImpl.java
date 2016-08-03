/*
 * An XML document type.
 * Localname: relationshipStartDate
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.RelationshipStartDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one relationshipStartDate(@) element.
 *
 * This is a complex type.
 */
public class RelationshipStartDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.RelationshipStartDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipStartDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPSTARTDATE$0 = 
        new javax.xml.namespace.QName("", "relationshipStartDate");
    
    
    /**
     * Gets the "relationshipStartDate" element
     */
    public java.lang.String getRelationshipStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPSTARTDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relationshipStartDate" element
     */
    public org.apache.xmlbeans.XmlString xgetRelationshipStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPSTARTDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "relationshipStartDate" element
     */
    public void setRelationshipStartDate(java.lang.String relationshipStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPSTARTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONSHIPSTARTDATE$0);
            }
            target.setStringValue(relationshipStartDate);
        }
    }
    
    /**
     * Sets (as xml) the "relationshipStartDate" element
     */
    public void xsetRelationshipStartDate(org.apache.xmlbeans.XmlString relationshipStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPSTARTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONSHIPSTARTDATE$0);
            }
            target.set(relationshipStartDate);
        }
    }
}
