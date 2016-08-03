/*
 * An XML document type.
 * Localname: leStatusCodeDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeStatusCodeDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leStatusCodeDesc(@) element.
 *
 * This is a complex type.
 */
public class LeStatusCodeDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeStatusCodeDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeStatusCodeDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LESTATUSCODEDESC$0 = 
        new javax.xml.namespace.QName("", "leStatusCodeDesc");
    
    
    /**
     * Gets the "leStatusCodeDesc" element
     */
    public java.lang.String getLeStatusCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESTATUSCODEDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leStatusCodeDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetLeStatusCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESTATUSCODEDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leStatusCodeDesc" element
     */
    public void setLeStatusCodeDesc(java.lang.String leStatusCodeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESTATUSCODEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LESTATUSCODEDESC$0);
            }
            target.setStringValue(leStatusCodeDesc);
        }
    }
    
    /**
     * Sets (as xml) the "leStatusCodeDesc" element
     */
    public void xsetLeStatusCodeDesc(org.apache.xmlbeans.XmlString leStatusCodeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESTATUSCODEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LESTATUSCODEDESC$0);
            }
            target.set(leStatusCodeDesc);
        }
    }
}
