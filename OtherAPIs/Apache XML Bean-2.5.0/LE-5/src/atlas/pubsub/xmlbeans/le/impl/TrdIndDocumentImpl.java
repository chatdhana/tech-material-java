/*
 * An XML document type.
 * Localname: trdInd
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.TrdIndDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one trdInd(@) element.
 *
 * This is a complex type.
 */
public class TrdIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.TrdIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public TrdIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRDIND$0 = 
        new javax.xml.namespace.QName("", "trdInd");
    
    
    /**
     * Gets the "trdInd" element
     */
    public java.lang.String getTrdInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRDIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "trdInd" element
     */
    public org.apache.xmlbeans.XmlString xgetTrdInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRDIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "trdInd" element
     */
    public void setTrdInd(java.lang.String trdInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRDIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRDIND$0);
            }
            target.setStringValue(trdInd);
        }
    }
    
    /**
     * Sets (as xml) the "trdInd" element
     */
    public void xsetTrdInd(org.apache.xmlbeans.XmlString trdInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRDIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRDIND$0);
            }
            target.set(trdInd);
        }
    }
}
