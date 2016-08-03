/*
 * An XML document type.
 * Localname: ultParentLeId
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.UltParentLeIdDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one ultParentLeId(@) element.
 *
 * This is a complex type.
 */
public class UltParentLeIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.UltParentLeIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public UltParentLeIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ULTPARENTLEID$0 = 
        new javax.xml.namespace.QName("", "ultParentLeId");
    
    
    /**
     * Gets the "ultParentLeId" element
     */
    public java.lang.String getUltParentLeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTPARENTLEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ultParentLeId" element
     */
    public org.apache.xmlbeans.XmlString xgetUltParentLeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTPARENTLEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ultParentLeId" element
     */
    public void setUltParentLeId(java.lang.String ultParentLeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTPARENTLEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULTPARENTLEID$0);
            }
            target.setStringValue(ultParentLeId);
        }
    }
    
    /**
     * Sets (as xml) the "ultParentLeId" element
     */
    public void xsetUltParentLeId(org.apache.xmlbeans.XmlString ultParentLeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTPARENTLEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULTPARENTLEID$0);
            }
            target.set(ultParentLeId);
        }
    }
}
