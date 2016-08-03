/*
 * An XML document type.
 * Localname: manualSettle
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ManualSettleDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one manualSettle(@) element.
 *
 * This is a complex type.
 */
public class ManualSettleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ManualSettleDocument
{
    private static final long serialVersionUID = 1L;
    
    public ManualSettleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANUALSETTLE$0 = 
        new javax.xml.namespace.QName("", "manualSettle");
    
    
    /**
     * Gets the "manualSettle" element
     */
    public java.lang.String getManualSettle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALSETTLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "manualSettle" element
     */
    public org.apache.xmlbeans.XmlString xgetManualSettle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUALSETTLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "manualSettle" element
     */
    public void setManualSettle(java.lang.String manualSettle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALSETTLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANUALSETTLE$0);
            }
            target.setStringValue(manualSettle);
        }
    }
    
    /**
     * Sets (as xml) the "manualSettle" element
     */
    public void xsetManualSettle(org.apache.xmlbeans.XmlString manualSettle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUALSETTLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANUALSETTLE$0);
            }
            target.set(manualSettle);
        }
    }
}
