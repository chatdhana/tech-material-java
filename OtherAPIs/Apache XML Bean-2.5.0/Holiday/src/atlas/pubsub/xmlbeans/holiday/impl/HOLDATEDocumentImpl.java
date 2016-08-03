/*
 * An XML document type.
 * Localname: HOL-DATE
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.holiday.HOLDATEDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.holiday.impl;
/**
 * A document containing one HOL-DATE(@) element.
 *
 * This is a complex type.
 */
public class HOLDATEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.holiday.HOLDATEDocument
{
    private static final long serialVersionUID = 1L;
    
    public HOLDATEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOLDATE$0 = 
        new javax.xml.namespace.QName("", "HOL-DATE");
    
    
    /**
     * Gets the "HOL-DATE" element
     */
    public java.lang.String getHOLDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOLDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HOL-DATE" element
     */
    public org.apache.xmlbeans.XmlString xgetHOLDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOLDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HOL-DATE" element
     */
    public void setHOLDATE(java.lang.String holdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOLDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOLDATE$0);
            }
            target.setStringValue(holdate);
        }
    }
    
    /**
     * Sets (as xml) the "HOL-DATE" element
     */
    public void xsetHOLDATE(org.apache.xmlbeans.XmlString holdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOLDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOLDATE$0);
            }
            target.set(holdate);
        }
    }
}
