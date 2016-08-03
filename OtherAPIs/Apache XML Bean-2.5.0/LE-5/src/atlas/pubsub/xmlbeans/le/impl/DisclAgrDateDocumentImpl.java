/*
 * An XML document type.
 * Localname: disclAgrDate
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.DisclAgrDateDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one disclAgrDate(@) element.
 *
 * This is a complex type.
 */
public class DisclAgrDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.DisclAgrDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisclAgrDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCLAGRDATE$0 = 
        new javax.xml.namespace.QName("", "disclAgrDate");
    
    
    /**
     * Gets the "disclAgrDate" element
     */
    public java.lang.String getDisclAgrDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLAGRDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "disclAgrDate" element
     */
    public org.apache.xmlbeans.XmlString xgetDisclAgrDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLAGRDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "disclAgrDate" element
     */
    public void setDisclAgrDate(java.lang.String disclAgrDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLAGRDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCLAGRDATE$0);
            }
            target.setStringValue(disclAgrDate);
        }
    }
    
    /**
     * Sets (as xml) the "disclAgrDate" element
     */
    public void xsetDisclAgrDate(org.apache.xmlbeans.XmlString disclAgrDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLAGRDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISCLAGRDATE$0);
            }
            target.set(disclAgrDate);
        }
    }
}
