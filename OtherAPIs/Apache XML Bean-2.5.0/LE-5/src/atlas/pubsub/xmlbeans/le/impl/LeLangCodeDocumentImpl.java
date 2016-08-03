/*
 * An XML document type.
 * Localname: leLangCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeLangCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leLangCode(@) element.
 *
 * This is a complex type.
 */
public class LeLangCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeLangCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeLangCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LELANGCODE$0 = 
        new javax.xml.namespace.QName("", "leLangCode");
    
    
    /**
     * Gets the "leLangCode" element
     */
    public java.lang.String getLeLangCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELANGCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leLangCode" element
     */
    public org.apache.xmlbeans.XmlString xgetLeLangCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELANGCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leLangCode" element
     */
    public void setLeLangCode(java.lang.String leLangCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELANGCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LELANGCODE$0);
            }
            target.setStringValue(leLangCode);
        }
    }
    
    /**
     * Sets (as xml) the "leLangCode" element
     */
    public void xsetLeLangCode(org.apache.xmlbeans.XmlString leLangCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELANGCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LELANGCODE$0);
            }
            target.set(leLangCode);
        }
    }
}
