/*
 * An XML document type.
 * Localname: countryName
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.CountryNameDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one countryName(@) element.
 *
 * This is a complex type.
 */
public class CountryNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.CountryNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYNAME$0 = 
        new javax.xml.namespace.QName("", "countryName");
    
    
    /**
     * Gets the "countryName" element
     */
    public java.lang.String getCountryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "countryName" element
     */
    public org.apache.xmlbeans.XmlString xgetCountryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "countryName" element
     */
    public void setCountryName(java.lang.String countryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYNAME$0);
            }
            target.setStringValue(countryName);
        }
    }
    
    /**
     * Sets (as xml) the "countryName" element
     */
    public void xsetCountryName(org.apache.xmlbeans.XmlString countryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYNAME$0);
            }
            target.set(countryName);
        }
    }
}
