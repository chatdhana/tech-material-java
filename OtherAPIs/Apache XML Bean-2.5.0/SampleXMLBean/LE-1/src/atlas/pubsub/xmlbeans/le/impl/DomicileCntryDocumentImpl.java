/*
 * An XML document type.
 * Localname: domicileCntry
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.DomicileCntryDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one domicileCntry(@) element.
 *
 * This is a complex type.
 */
public class DomicileCntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.DomicileCntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public DomicileCntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMICILECNTRY$0 = 
        new javax.xml.namespace.QName("", "domicileCntry");
    
    
    /**
     * Gets the "domicileCntry" element
     */
    public java.lang.String getDomicileCntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILECNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domicileCntry" element
     */
    public org.apache.xmlbeans.XmlString xgetDomicileCntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILECNTRY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "domicileCntry" element
     */
    public void setDomicileCntry(java.lang.String domicileCntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMICILECNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMICILECNTRY$0);
            }
            target.setStringValue(domicileCntry);
        }
    }
    
    /**
     * Sets (as xml) the "domicileCntry" element
     */
    public void xsetDomicileCntry(org.apache.xmlbeans.XmlString domicileCntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMICILECNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMICILECNTRY$0);
            }
            target.set(domicileCntry);
        }
    }
}
