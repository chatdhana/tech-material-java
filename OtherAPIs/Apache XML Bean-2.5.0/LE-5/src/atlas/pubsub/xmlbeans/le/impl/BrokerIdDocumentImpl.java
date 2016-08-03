/*
 * An XML document type.
 * Localname: brokerId
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.BrokerIdDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one brokerId(@) element.
 *
 * This is a complex type.
 */
public class BrokerIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.BrokerIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public BrokerIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BROKERID$0 = 
        new javax.xml.namespace.QName("", "brokerId");
    
    
    /**
     * Gets the "brokerId" element
     */
    public java.lang.String getBrokerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROKERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "brokerId" element
     */
    public org.apache.xmlbeans.XmlString xgetBrokerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BROKERID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "brokerId" element
     */
    public void setBrokerId(java.lang.String brokerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROKERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BROKERID$0);
            }
            target.setStringValue(brokerId);
        }
    }
    
    /**
     * Sets (as xml) the "brokerId" element
     */
    public void xsetBrokerId(org.apache.xmlbeans.XmlString brokerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BROKERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BROKERID$0);
            }
            target.set(brokerId);
        }
    }
}
