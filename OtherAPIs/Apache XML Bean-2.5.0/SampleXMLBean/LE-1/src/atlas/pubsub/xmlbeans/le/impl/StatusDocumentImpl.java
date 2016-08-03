/*
 * An XML document type.
 * Localname: status
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.StatusDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one status(@) element.
 *
 * This is a complex type.
 */
public class StatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.StatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("", "status");
    
    
    /**
     * Gets the "status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
        }
    }
}
