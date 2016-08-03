/*
 * An XML document type.
 * Localname: leSysConId
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeSysConIdDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leSysConId(@) element.
 *
 * This is a complex type.
 */
public class LeSysConIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeSysConIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeSysConIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LESYSCONID$0 = 
        new javax.xml.namespace.QName("", "leSysConId");
    
    
    /**
     * Gets the "leSysConId" element
     */
    public java.lang.String getLeSysConId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESYSCONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leSysConId" element
     */
    public org.apache.xmlbeans.XmlString xgetLeSysConId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESYSCONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leSysConId" element
     */
    public void setLeSysConId(java.lang.String leSysConId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESYSCONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LESYSCONID$0);
            }
            target.setStringValue(leSysConId);
        }
    }
    
    /**
     * Sets (as xml) the "leSysConId" element
     */
    public void xsetLeSysConId(org.apache.xmlbeans.XmlString leSysConId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESYSCONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LESYSCONID$0);
            }
            target.set(leSysConId);
        }
    }
}
