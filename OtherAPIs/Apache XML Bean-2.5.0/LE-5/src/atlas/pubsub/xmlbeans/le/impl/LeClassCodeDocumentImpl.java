/*
 * An XML document type.
 * Localname: leClassCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeClassCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leClassCode(@) element.
 *
 * This is a complex type.
 */
public class LeClassCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeClassCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeClassCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LECLASSCODE$0 = 
        new javax.xml.namespace.QName("", "leClassCode");
    
    
    /**
     * Gets the "leClassCode" element
     */
    public java.lang.String getLeClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LECLASSCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leClassCode" element
     */
    public org.apache.xmlbeans.XmlString xgetLeClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LECLASSCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leClassCode" element
     */
    public void setLeClassCode(java.lang.String leClassCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LECLASSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LECLASSCODE$0);
            }
            target.setStringValue(leClassCode);
        }
    }
    
    /**
     * Sets (as xml) the "leClassCode" element
     */
    public void xsetLeClassCode(org.apache.xmlbeans.XmlString leClassCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LECLASSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LECLASSCODE$0);
            }
            target.set(leClassCode);
        }
    }
}
