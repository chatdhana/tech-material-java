/*
 * An XML document type.
 * Localname: leLangCodeDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeLangCodeDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leLangCodeDesc(@) element.
 *
 * This is a complex type.
 */
public class LeLangCodeDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeLangCodeDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeLangCodeDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LELANGCODEDESC$0 = 
        new javax.xml.namespace.QName("", "leLangCodeDesc");
    
    
    /**
     * Gets the "leLangCodeDesc" element
     */
    public java.lang.String getLeLangCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELANGCODEDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leLangCodeDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetLeLangCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELANGCODEDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leLangCodeDesc" element
     */
    public void setLeLangCodeDesc(java.lang.String leLangCodeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELANGCODEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LELANGCODEDESC$0);
            }
            target.setStringValue(leLangCodeDesc);
        }
    }
    
    /**
     * Sets (as xml) the "leLangCodeDesc" element
     */
    public void xsetLeLangCodeDesc(org.apache.xmlbeans.XmlString leLangCodeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELANGCODEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LELANGCODEDESC$0);
            }
            target.set(leLangCodeDesc);
        }
    }
}
