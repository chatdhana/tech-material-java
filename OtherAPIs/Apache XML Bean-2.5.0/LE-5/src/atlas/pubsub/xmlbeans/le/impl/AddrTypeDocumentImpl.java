/*
 * An XML document type.
 * Localname: addrType
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.AddrTypeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one addrType(@) element.
 *
 * This is a complex type.
 */
public class AddrTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.AddrTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddrTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRTYPE$0 = 
        new javax.xml.namespace.QName("", "addrType");
    
    
    /**
     * Gets the "addrType" element
     */
    public java.lang.String getAddrType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addrType" element
     */
    public org.apache.xmlbeans.XmlString xgetAddrType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "addrType" element
     */
    public void setAddrType(java.lang.String addrType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRTYPE$0);
            }
            target.setStringValue(addrType);
        }
    }
    
    /**
     * Sets (as xml) the "addrType" element
     */
    public void xsetAddrType(org.apache.xmlbeans.XmlString addrType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRTYPE$0);
            }
            target.set(addrType);
        }
    }
}
