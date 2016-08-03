/*
 * An XML document type.
 * Localname: contPhone
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ContPhoneDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one contPhone(@) element.
 *
 * This is a complex type.
 */
public class ContPhoneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ContPhoneDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContPhoneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTPHONE$0 = 
        new javax.xml.namespace.QName("", "contPhone");
    
    
    /**
     * Gets the "contPhone" element
     */
    public java.lang.String getContPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTPHONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contPhone" element
     */
    public org.apache.xmlbeans.XmlString xgetContPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTPHONE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contPhone" element
     */
    public void setContPhone(java.lang.String contPhone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTPHONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTPHONE$0);
            }
            target.setStringValue(contPhone);
        }
    }
    
    /**
     * Sets (as xml) the "contPhone" element
     */
    public void xsetContPhone(org.apache.xmlbeans.XmlString contPhone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTPHONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTPHONE$0);
            }
            target.set(contPhone);
        }
    }
}
