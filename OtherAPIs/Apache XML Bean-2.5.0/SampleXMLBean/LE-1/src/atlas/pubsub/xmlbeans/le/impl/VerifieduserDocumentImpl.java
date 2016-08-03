/*
 * An XML document type.
 * Localname: verifieduser
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.VerifieduserDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one verifieduser(@) element.
 *
 * This is a complex type.
 */
public class VerifieduserDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.VerifieduserDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerifieduserDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERIFIEDUSER$0 = 
        new javax.xml.namespace.QName("", "verifieduser");
    
    
    /**
     * Gets the "verifieduser" element
     */
    public java.lang.String getVerifieduser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIEDUSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "verifieduser" element
     */
    public org.apache.xmlbeans.XmlString xgetVerifieduser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIEDUSER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "verifieduser" element
     */
    public void setVerifieduser(java.lang.String verifieduser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIEDUSER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERIFIEDUSER$0);
            }
            target.setStringValue(verifieduser);
        }
    }
    
    /**
     * Sets (as xml) the "verifieduser" element
     */
    public void xsetVerifieduser(org.apache.xmlbeans.XmlString verifieduser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIEDUSER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERIFIEDUSER$0);
            }
            target.set(verifieduser);
        }
    }
}
