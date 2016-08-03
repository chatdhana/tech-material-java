/*
 * An XML document type.
 * Localname: verifydate
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.VerifydateDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one verifydate(@) element.
 *
 * This is a complex type.
 */
public class VerifydateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.VerifydateDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerifydateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERIFYDATE$0 = 
        new javax.xml.namespace.QName("", "verifydate");
    
    
    /**
     * Gets the "verifydate" element
     */
    public java.lang.String getVerifydate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFYDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "verifydate" element
     */
    public org.apache.xmlbeans.XmlString xgetVerifydate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFYDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "verifydate" element
     */
    public void setVerifydate(java.lang.String verifydate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFYDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERIFYDATE$0);
            }
            target.setStringValue(verifydate);
        }
    }
    
    /**
     * Sets (as xml) the "verifydate" element
     */
    public void xsetVerifydate(org.apache.xmlbeans.XmlString verifydate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFYDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERIFYDATE$0);
            }
            target.set(verifydate);
        }
    }
}
