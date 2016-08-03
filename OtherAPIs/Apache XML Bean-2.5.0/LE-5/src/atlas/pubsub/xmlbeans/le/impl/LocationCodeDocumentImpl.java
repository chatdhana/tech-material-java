/*
 * An XML document type.
 * Localname: locationCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LocationCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one locationCode(@) element.
 *
 * This is a complex type.
 */
public class LocationCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LocationCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONCODE$0 = 
        new javax.xml.namespace.QName("", "locationCode");
    
    
    /**
     * Gets the "locationCode" element
     */
    public java.lang.String getLocationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "locationCode" element
     */
    public org.apache.xmlbeans.XmlString xgetLocationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "locationCode" element
     */
    public void setLocationCode(java.lang.String locationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONCODE$0);
            }
            target.setStringValue(locationCode);
        }
    }
    
    /**
     * Sets (as xml) the "locationCode" element
     */
    public void xsetLocationCode(org.apache.xmlbeans.XmlString locationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATIONCODE$0);
            }
            target.set(locationCode);
        }
    }
}
