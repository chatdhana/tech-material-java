/*
 * An XML document type.
 * Localname: upddate
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.UpddateDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one upddate(@) element.
 *
 * This is a complex type.
 */
public class UpddateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.UpddateDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpddateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDDATE$0 = 
        new javax.xml.namespace.QName("", "upddate");
    
    
    /**
     * Gets the "upddate" element
     */
    public java.lang.String getUpddate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "upddate" element
     */
    public org.apache.xmlbeans.XmlString xgetUpddate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "upddate" element
     */
    public void setUpddate(java.lang.String upddate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDDATE$0);
            }
            target.setStringValue(upddate);
        }
    }
    
    /**
     * Sets (as xml) the "upddate" element
     */
    public void xsetUpddate(org.apache.xmlbeans.XmlString upddate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDDATE$0);
            }
            target.set(upddate);
        }
    }
}
