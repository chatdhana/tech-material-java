/*
 * An XML document type.
 * Localname: countryIsoCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.CountryIsoCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one countryIsoCode(@) element.
 *
 * This is a complex type.
 */
public class CountryIsoCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.CountryIsoCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryIsoCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYISOCODE$0 = 
        new javax.xml.namespace.QName("", "countryIsoCode");
    
    
    /**
     * Gets the "countryIsoCode" element
     */
    public java.lang.String getCountryIsoCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYISOCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "countryIsoCode" element
     */
    public org.apache.xmlbeans.XmlString xgetCountryIsoCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYISOCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "countryIsoCode" element
     */
    public void setCountryIsoCode(java.lang.String countryIsoCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYISOCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYISOCODE$0);
            }
            target.setStringValue(countryIsoCode);
        }
    }
    
    /**
     * Sets (as xml) the "countryIsoCode" element
     */
    public void xsetCountryIsoCode(org.apache.xmlbeans.XmlString countryIsoCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYISOCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYISOCODE$0);
            }
            target.set(countryIsoCode);
        }
    }
}
