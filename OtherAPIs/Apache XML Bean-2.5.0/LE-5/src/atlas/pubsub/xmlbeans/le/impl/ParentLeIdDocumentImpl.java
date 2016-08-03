/*
 * An XML document type.
 * Localname: parentLeId
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ParentLeIdDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one parentLeId(@) element.
 *
 * This is a complex type.
 */
public class ParentLeIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ParentLeIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParentLeIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARENTLEID$0 = 
        new javax.xml.namespace.QName("", "parentLeId");
    
    
    /**
     * Gets the "parentLeId" element
     */
    public java.lang.String getParentLeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTLEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parentLeId" element
     */
    public org.apache.xmlbeans.XmlString xgetParentLeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTLEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "parentLeId" element
     */
    public void setParentLeId(java.lang.String parentLeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTLEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTLEID$0);
            }
            target.setStringValue(parentLeId);
        }
    }
    
    /**
     * Sets (as xml) the "parentLeId" element
     */
    public void xsetParentLeId(org.apache.xmlbeans.XmlString parentLeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTLEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTLEID$0);
            }
            target.set(parentLeId);
        }
    }
}
