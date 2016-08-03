/*
 * An XML document type.
 * Localname: upduser
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.UpduserDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one upduser(@) element.
 *
 * This is a complex type.
 */
public class UpduserDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.UpduserDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpduserDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDUSER$0 = 
        new javax.xml.namespace.QName("", "upduser");
    
    
    /**
     * Gets the "upduser" element
     */
    public java.lang.String getUpduser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDUSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "upduser" element
     */
    public org.apache.xmlbeans.XmlString xgetUpduser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDUSER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "upduser" element
     */
    public void setUpduser(java.lang.String upduser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDUSER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDUSER$0);
            }
            target.setStringValue(upduser);
        }
    }
    
    /**
     * Sets (as xml) the "upduser" element
     */
    public void xsetUpduser(org.apache.xmlbeans.XmlString upduser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDUSER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDUSER$0);
            }
            target.set(upduser);
        }
    }
}
