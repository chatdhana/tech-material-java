/*
 * An XML document type.
 * Localname: postCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.PostCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one postCode(@) element.
 *
 * This is a complex type.
 */
public class PostCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.PostCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public PostCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTCODE$0 = 
        new javax.xml.namespace.QName("", "postCode");
    
    
    /**
     * Gets the "postCode" element
     */
    public java.lang.String getPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "postCode" element
     */
    public org.apache.xmlbeans.XmlString xgetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "postCode" element
     */
    public void setPostCode(java.lang.String postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$0);
            }
            target.setStringValue(postCode);
        }
    }
    
    /**
     * Sets (as xml) the "postCode" element
     */
    public void xsetPostCode(org.apache.xmlbeans.XmlString postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTCODE$0);
            }
            target.set(postCode);
        }
    }
}
