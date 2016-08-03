/*
 * An XML document type.
 * Localname: segmentDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.SegmentDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one segmentDesc(@) element.
 *
 * This is a complex type.
 */
public class SegmentDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.SegmentDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public SegmentDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEGMENTDESC$0 = 
        new javax.xml.namespace.QName("", "segmentDesc");
    
    
    /**
     * Gets the "segmentDesc" element
     */
    public java.lang.String getSegmentDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEGMENTDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "segmentDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetSegmentDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEGMENTDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "segmentDesc" element
     */
    public void setSegmentDesc(java.lang.String segmentDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEGMENTDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEGMENTDESC$0);
            }
            target.setStringValue(segmentDesc);
        }
    }
    
    /**
     * Sets (as xml) the "segmentDesc" element
     */
    public void xsetSegmentDesc(org.apache.xmlbeans.XmlString segmentDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEGMENTDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEGMENTDESC$0);
            }
            target.set(segmentDesc);
        }
    }
}
