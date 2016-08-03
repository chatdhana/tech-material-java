/*
 * An XML document type.
 * Localname: leClassCodeDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeClassCodeDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leClassCodeDesc(@) element.
 *
 * This is a complex type.
 */
public class LeClassCodeDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeClassCodeDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeClassCodeDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LECLASSCODEDESC$0 = 
        new javax.xml.namespace.QName("", "leClassCodeDesc");
    
    
    /**
     * Gets the "leClassCodeDesc" element
     */
    public java.lang.String getLeClassCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LECLASSCODEDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leClassCodeDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetLeClassCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LECLASSCODEDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leClassCodeDesc" element
     */
    public void setLeClassCodeDesc(java.lang.String leClassCodeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LECLASSCODEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LECLASSCODEDESC$0);
            }
            target.setStringValue(leClassCodeDesc);
        }
    }
    
    /**
     * Sets (as xml) the "leClassCodeDesc" element
     */
    public void xsetLeClassCodeDesc(org.apache.xmlbeans.XmlString leClassCodeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LECLASSCODEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LECLASSCODEDESC$0);
            }
            target.set(leClassCodeDesc);
        }
    }
}
