/*
 * An XML document type.
 * Localname: verified
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.VerifiedDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one verified(@) element.
 *
 * This is a complex type.
 */
public class VerifiedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.VerifiedDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerifiedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERIFIED$0 = 
        new javax.xml.namespace.QName("", "verified");
    
    
    /**
     * Gets the "verified" element
     */
    public java.lang.String getVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "verified" element
     */
    public org.apache.xmlbeans.XmlString xgetVerified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "verified" element
     */
    public void setVerified(java.lang.String verified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERIFIED$0);
            }
            target.setStringValue(verified);
        }
    }
    
    /**
     * Sets (as xml) the "verified" element
     */
    public void xsetVerified(org.apache.xmlbeans.XmlString verified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERIFIED$0);
            }
            target.set(verified);
        }
    }
}
