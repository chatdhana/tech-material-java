/*
 * An XML document type.
 * Localname: bkgLocationCountry
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.BkgLocationCountryDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one bkgLocationCountry(@) element.
 *
 * This is a complex type.
 */
public class BkgLocationCountryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.BkgLocationCountryDocument
{
    private static final long serialVersionUID = 1L;
    
    public BkgLocationCountryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BKGLOCATIONCOUNTRY$0 = 
        new javax.xml.namespace.QName("", "bkgLocationCountry");
    
    
    /**
     * Gets the "bkgLocationCountry" element
     */
    public java.lang.String getBkgLocationCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONCOUNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bkgLocationCountry" element
     */
    public org.apache.xmlbeans.XmlString xgetBkgLocationCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONCOUNTRY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bkgLocationCountry" element
     */
    public void setBkgLocationCountry(java.lang.String bkgLocationCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONCOUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BKGLOCATIONCOUNTRY$0);
            }
            target.setStringValue(bkgLocationCountry);
        }
    }
    
    /**
     * Sets (as xml) the "bkgLocationCountry" element
     */
    public void xsetBkgLocationCountry(org.apache.xmlbeans.XmlString bkgLocationCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONCOUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BKGLOCATIONCOUNTRY$0);
            }
            target.set(bkgLocationCountry);
        }
    }
}
