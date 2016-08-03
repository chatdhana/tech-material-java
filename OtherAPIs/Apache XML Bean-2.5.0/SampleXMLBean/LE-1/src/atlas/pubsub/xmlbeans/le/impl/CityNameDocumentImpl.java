/*
 * An XML document type.
 * Localname: cityName
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.CityNameDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one cityName(@) element.
 *
 * This is a complex type.
 */
public class CityNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.CityNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public CityNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITYNAME$0 = 
        new javax.xml.namespace.QName("", "cityName");
    
    
    /**
     * Gets the "cityName" element
     */
    public java.lang.String getCityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cityName" element
     */
    public org.apache.xmlbeans.XmlString xgetCityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cityName" element
     */
    public void setCityName(java.lang.String cityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITYNAME$0);
            }
            target.setStringValue(cityName);
        }
    }
    
    /**
     * Sets (as xml) the "cityName" element
     */
    public void xsetCityName(org.apache.xmlbeans.XmlString cityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITYNAME$0);
            }
            target.set(cityName);
        }
    }
}
