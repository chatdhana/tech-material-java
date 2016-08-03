/*
 * An XML document type.
 * Localname: addrLine1
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.AddrLine1Document
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one addrLine1(@) element.
 *
 * This is a complex type.
 */
public class AddrLine1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.AddrLine1Document
{
    private static final long serialVersionUID = 1L;
    
    public AddrLine1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRLINE1$0 = 
        new javax.xml.namespace.QName("", "addrLine1");
    
    
    /**
     * Gets the "addrLine1" element
     */
    public java.lang.String getAddrLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addrLine1" element
     */
    public org.apache.xmlbeans.XmlString xgetAddrLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE1$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "addrLine1" element
     */
    public void setAddrLine1(java.lang.String addrLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRLINE1$0);
            }
            target.setStringValue(addrLine1);
        }
    }
    
    /**
     * Sets (as xml) the "addrLine1" element
     */
    public void xsetAddrLine1(org.apache.xmlbeans.XmlString addrLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRLINE1$0);
            }
            target.set(addrLine1);
        }
    }
}
