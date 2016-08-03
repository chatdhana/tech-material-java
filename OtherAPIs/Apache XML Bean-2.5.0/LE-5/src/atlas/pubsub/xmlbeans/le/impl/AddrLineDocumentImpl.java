/*
 * An XML document type.
 * Localname: addrLine
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.AddrLineDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one addrLine(@) element.
 *
 * This is a complex type.
 */
public class AddrLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.AddrLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddrLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRLINE$0 = 
        new javax.xml.namespace.QName("", "addrLine");
    
    
    /**
     * Gets the "addrLine" element
     */
    public java.lang.String getAddrLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addrLine" element
     */
    public org.apache.xmlbeans.XmlString xgetAddrLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "addrLine" element
     */
    public void setAddrLine(java.lang.String addrLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRLINE$0);
            }
            target.setStringValue(addrLine);
        }
    }
    
    /**
     * Sets (as xml) the "addrLine" element
     */
    public void xsetAddrLine(org.apache.xmlbeans.XmlString addrLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRLINE$0);
            }
            target.set(addrLine);
        }
    }
}
