/*
 * An XML document type.
 * Localname: REASON
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.response.sub.REASONDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.response.sub.impl;
/**
 * A document containing one REASON(@) element.
 *
 * This is a complex type.
 */
public class REASONDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.response.sub.REASONDocument
{
    private static final long serialVersionUID = 1L;
    
    public REASONDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REASON$0 = 
        new javax.xml.namespace.QName("", "REASON");
    
    
    /**
     * Gets the "REASON" element
     */
    public java.lang.String getREASON()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "REASON" element
     */
    public org.apache.xmlbeans.XmlString xgetREASON()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "REASON" element
     */
    public void setREASON(java.lang.String reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$0);
            }
            target.setStringValue(reason);
        }
    }
    
    /**
     * Sets (as xml) the "REASON" element
     */
    public void xsetREASON(org.apache.xmlbeans.XmlString reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASON$0);
            }
            target.set(reason);
        }
    }
}
