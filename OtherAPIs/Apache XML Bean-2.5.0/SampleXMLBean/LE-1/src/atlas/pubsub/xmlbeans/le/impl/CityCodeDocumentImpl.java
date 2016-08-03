/*
 * An XML document type.
 * Localname: cityCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.CityCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one cityCode(@) element.
 *
 * This is a complex type.
 */
public class CityCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.CityCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CityCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITYCODE$0 = 
        new javax.xml.namespace.QName("", "cityCode");
    
    
    /**
     * Gets the "cityCode" element
     */
    public java.lang.String getCityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cityCode" element
     */
    public org.apache.xmlbeans.XmlString xgetCityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cityCode" element
     */
    public void setCityCode(java.lang.String cityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITYCODE$0);
            }
            target.setStringValue(cityCode);
        }
    }
    
    /**
     * Sets (as xml) the "cityCode" element
     */
    public void xsetCityCode(org.apache.xmlbeans.XmlString cityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITYCODE$0);
            }
            target.set(cityCode);
        }
    }
}
