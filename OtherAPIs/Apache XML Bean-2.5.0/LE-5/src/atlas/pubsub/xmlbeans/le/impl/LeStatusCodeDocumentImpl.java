/*
 * An XML document type.
 * Localname: leStatusCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeStatusCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leStatusCode(@) element.
 *
 * This is a complex type.
 */
public class LeStatusCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeStatusCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeStatusCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LESTATUSCODE$0 = 
        new javax.xml.namespace.QName("", "leStatusCode");
    
    
    /**
     * Gets the "leStatusCode" element
     */
    public java.lang.String getLeStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESTATUSCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leStatusCode" element
     */
    public org.apache.xmlbeans.XmlString xgetLeStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESTATUSCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leStatusCode" element
     */
    public void setLeStatusCode(java.lang.String leStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESTATUSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LESTATUSCODE$0);
            }
            target.setStringValue(leStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "leStatusCode" element
     */
    public void xsetLeStatusCode(org.apache.xmlbeans.XmlString leStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESTATUSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LESTATUSCODE$0);
            }
            target.set(leStatusCode);
        }
    }
}
