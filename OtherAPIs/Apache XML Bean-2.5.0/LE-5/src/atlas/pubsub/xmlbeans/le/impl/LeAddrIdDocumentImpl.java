/*
 * An XML document type.
 * Localname: leAddrId
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeAddrIdDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leAddrId(@) element.
 *
 * This is a complex type.
 */
public class LeAddrIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeAddrIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeAddrIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEADDRID$0 = 
        new javax.xml.namespace.QName("", "leAddrId");
    
    
    /**
     * Gets the "leAddrId" element
     */
    public java.lang.String getLeAddrId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEADDRID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leAddrId" element
     */
    public org.apache.xmlbeans.XmlString xgetLeAddrId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEADDRID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leAddrId" element
     */
    public void setLeAddrId(java.lang.String leAddrId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEADDRID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEADDRID$0);
            }
            target.setStringValue(leAddrId);
        }
    }
    
    /**
     * Sets (as xml) the "leAddrId" element
     */
    public void xsetLeAddrId(org.apache.xmlbeans.XmlString leAddrId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEADDRID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEADDRID$0);
            }
            target.set(leAddrId);
        }
    }
}
