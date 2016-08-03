/*
 * An XML document type.
 * Localname: leTypeDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeTypeDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leTypeDesc(@) element.
 *
 * This is a complex type.
 */
public class LeTypeDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeTypeDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeTypeDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LETYPEDESC$0 = 
        new javax.xml.namespace.QName("", "leTypeDesc");
    
    
    /**
     * Gets the "leTypeDesc" element
     */
    public java.lang.String getLeTypeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETYPEDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leTypeDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetLeTypeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LETYPEDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leTypeDesc" element
     */
    public void setLeTypeDesc(java.lang.String leTypeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETYPEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LETYPEDESC$0);
            }
            target.setStringValue(leTypeDesc);
        }
    }
    
    /**
     * Sets (as xml) the "leTypeDesc" element
     */
    public void xsetLeTypeDesc(org.apache.xmlbeans.XmlString leTypeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LETYPEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LETYPEDESC$0);
            }
            target.set(leTypeDesc);
        }
    }
}
