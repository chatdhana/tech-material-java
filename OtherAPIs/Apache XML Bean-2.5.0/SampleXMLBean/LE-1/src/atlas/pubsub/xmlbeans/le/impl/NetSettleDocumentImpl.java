/*
 * An XML document type.
 * Localname: netSettle
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.NetSettleDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one netSettle(@) element.
 *
 * This is a complex type.
 */
public class NetSettleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.NetSettleDocument
{
    private static final long serialVersionUID = 1L;
    
    public NetSettleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NETSETTLE$0 = 
        new javax.xml.namespace.QName("", "netSettle");
    
    
    /**
     * Gets the "netSettle" element
     */
    public java.lang.String getNetSettle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETSETTLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "netSettle" element
     */
    public org.apache.xmlbeans.XmlString xgetNetSettle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NETSETTLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "netSettle" element
     */
    public void setNetSettle(java.lang.String netSettle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETSETTLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NETSETTLE$0);
            }
            target.setStringValue(netSettle);
        }
    }
    
    /**
     * Sets (as xml) the "netSettle" element
     */
    public void xsetNetSettle(org.apache.xmlbeans.XmlString netSettle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NETSETTLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NETSETTLE$0);
            }
            target.set(netSettle);
        }
    }
}
