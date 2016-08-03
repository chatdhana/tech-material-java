/*
 * An XML document type.
 * Localname: upcount
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.UpcountDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one upcount(@) element.
 *
 * This is a complex type.
 */
public class UpcountDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.UpcountDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpcountDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPCOUNT$0 = 
        new javax.xml.namespace.QName("", "upcount");
    
    
    /**
     * Gets the "upcount" element
     */
    public java.lang.String getUpcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPCOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "upcount" element
     */
    public org.apache.xmlbeans.XmlString xgetUpcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPCOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "upcount" element
     */
    public void setUpcount(java.lang.String upcount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPCOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPCOUNT$0);
            }
            target.setStringValue(upcount);
        }
    }
    
    /**
     * Sets (as xml) the "upcount" element
     */
    public void xsetUpcount(org.apache.xmlbeans.XmlString upcount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPCOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPCOUNT$0);
            }
            target.set(upcount);
        }
    }
}
