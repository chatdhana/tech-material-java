/*
 * An XML document type.
 * Localname: leType
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeTypeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leType(@) element.
 *
 * This is a complex type.
 */
public class LeTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LETYPE$0 = 
        new javax.xml.namespace.QName("", "leType");
    
    
    /**
     * Gets the "leType" element
     */
    public java.lang.String getLeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leType" element
     */
    public org.apache.xmlbeans.XmlString xgetLeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leType" element
     */
    public void setLeType(java.lang.String leType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LETYPE$0);
            }
            target.setStringValue(leType);
        }
    }
    
    /**
     * Sets (as xml) the "leType" element
     */
    public void xsetLeType(org.apache.xmlbeans.XmlString leType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LETYPE$0);
            }
            target.set(leType);
        }
    }
}
