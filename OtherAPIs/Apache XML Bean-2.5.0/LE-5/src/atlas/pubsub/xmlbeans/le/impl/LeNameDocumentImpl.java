/*
 * An XML document type.
 * Localname: leName
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeNameDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leName(@) element.
 *
 * This is a complex type.
 */
public class LeNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LENAME$0 = 
        new javax.xml.namespace.QName("", "leName");
    
    
    /**
     * Gets the "leName" element
     */
    public java.lang.String getLeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leName" element
     */
    public org.apache.xmlbeans.XmlString xgetLeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leName" element
     */
    public void setLeName(java.lang.String leName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LENAME$0);
            }
            target.setStringValue(leName);
        }
    }
    
    /**
     * Sets (as xml) the "leName" element
     */
    public void xsetLeName(org.apache.xmlbeans.XmlString leName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LENAME$0);
            }
            target.set(leName);
        }
    }
}
