/*
 * An XML document type.
 * Localname: addrTypeDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.AddrTypeDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one addrTypeDesc(@) element.
 *
 * This is a complex type.
 */
public class AddrTypeDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.AddrTypeDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddrTypeDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRTYPEDESC$0 = 
        new javax.xml.namespace.QName("", "addrTypeDesc");
    
    
    /**
     * Gets the "addrTypeDesc" element
     */
    public java.lang.String getAddrTypeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRTYPEDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addrTypeDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetAddrTypeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRTYPEDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "addrTypeDesc" element
     */
    public void setAddrTypeDesc(java.lang.String addrTypeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRTYPEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRTYPEDESC$0);
            }
            target.setStringValue(addrTypeDesc);
        }
    }
    
    /**
     * Sets (as xml) the "addrTypeDesc" element
     */
    public void xsetAddrTypeDesc(org.apache.xmlbeans.XmlString addrTypeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRTYPEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRTYPEDESC$0);
            }
            target.set(addrTypeDesc);
        }
    }
}
