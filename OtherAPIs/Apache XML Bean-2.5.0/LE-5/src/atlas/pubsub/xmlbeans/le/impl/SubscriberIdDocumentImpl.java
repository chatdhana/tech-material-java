/*
 * An XML document type.
 * Localname: subscriberId
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.SubscriberIdDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one subscriberId(@) element.
 *
 * This is a complex type.
 */
public class SubscriberIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.SubscriberIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubscriberIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBERID$0 = 
        new javax.xml.namespace.QName("", "subscriberId");
    
    
    /**
     * Gets the "subscriberId" element
     */
    public java.lang.String getSubscriberId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subscriberId" element
     */
    public org.apache.xmlbeans.XmlString xgetSubscriberId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "subscriberId" element
     */
    public void setSubscriberId(java.lang.String subscriberId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIBERID$0);
            }
            target.setStringValue(subscriberId);
        }
    }
    
    /**
     * Sets (as xml) the "subscriberId" element
     */
    public void xsetSubscriberId(org.apache.xmlbeans.XmlString subscriberId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSCRIBERID$0);
            }
            target.set(subscriberId);
        }
    }
}
