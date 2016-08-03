/*
 * An XML document type.
 * Localname: subSegmentDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.SubSegmentDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one subSegmentDesc(@) element.
 *
 * This is a complex type.
 */
public class SubSegmentDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.SubSegmentDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubSegmentDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSEGMENTDESC$0 = 
        new javax.xml.namespace.QName("", "subSegmentDesc");
    
    
    /**
     * Gets the "subSegmentDesc" element
     */
    public java.lang.String getSubSegmentDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSEGMENTDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subSegmentDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetSubSegmentDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSEGMENTDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "subSegmentDesc" element
     */
    public void setSubSegmentDesc(java.lang.String subSegmentDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSEGMENTDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSEGMENTDESC$0);
            }
            target.setStringValue(subSegmentDesc);
        }
    }
    
    /**
     * Sets (as xml) the "subSegmentDesc" element
     */
    public void xsetSubSegmentDesc(org.apache.xmlbeans.XmlString subSegmentDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSEGMENTDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSEGMENTDESC$0);
            }
            target.set(subSegmentDesc);
        }
    }
}
