/*
 * An XML document type.
 * Localname: segment
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.SegmentDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one segment(@) element.
 *
 * This is a complex type.
 */
public class SegmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.SegmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public SegmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEGMENT$0 = 
        new javax.xml.namespace.QName("", "segment");
    
    
    /**
     * Gets the "segment" element
     */
    public java.lang.String getSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEGMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "segment" element
     */
    public org.apache.xmlbeans.XmlString xgetSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEGMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "segment" element
     */
    public void setSegment(java.lang.String segment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEGMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEGMENT$0);
            }
            target.setStringValue(segment);
        }
    }
    
    /**
     * Sets (as xml) the "segment" element
     */
    public void xsetSegment(org.apache.xmlbeans.XmlString segment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEGMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEGMENT$0);
            }
            target.set(segment);
        }
    }
}
