/*
 * An XML document type.
 * Localname: subSegment
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.SubSegmentDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one subSegment(@) element.
 *
 * This is a complex type.
 */
public class SubSegmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.SubSegmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubSegmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSEGMENT$0 = 
        new javax.xml.namespace.QName("", "subSegment");
    
    
    /**
     * Gets the "subSegment" element
     */
    public java.lang.String getSubSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSEGMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subSegment" element
     */
    public org.apache.xmlbeans.XmlString xgetSubSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSEGMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "subSegment" element
     */
    public void setSubSegment(java.lang.String subSegment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSEGMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSEGMENT$0);
            }
            target.setStringValue(subSegment);
        }
    }
    
    /**
     * Sets (as xml) the "subSegment" element
     */
    public void xsetSubSegment(org.apache.xmlbeans.XmlString subSegment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSEGMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSEGMENT$0);
            }
            target.set(subSegment);
        }
    }
}
