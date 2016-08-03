/*
 * An XML document type.
 * Localname: statusDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.StatusDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one statusDesc(@) element.
 *
 * This is a complex type.
 */
public class StatusDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.StatusDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSDESC$0 = 
        new javax.xml.namespace.QName("", "statusDesc");
    
    
    /**
     * Gets the "statusDesc" element
     */
    public java.lang.String getStatusDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "statusDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "statusDesc" element
     */
    public void setStatusDesc(java.lang.String statusDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSDESC$0);
            }
            target.setStringValue(statusDesc);
        }
    }
    
    /**
     * Sets (as xml) the "statusDesc" element
     */
    public void xsetStatusDesc(org.apache.xmlbeans.XmlString statusDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSDESC$0);
            }
            target.set(statusDesc);
        }
    }
}
