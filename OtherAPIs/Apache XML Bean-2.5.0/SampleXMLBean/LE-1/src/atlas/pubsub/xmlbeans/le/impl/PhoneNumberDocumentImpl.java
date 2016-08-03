/*
 * An XML document type.
 * Localname: phoneNumber
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.PhoneNumberDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one phoneNumber(@) element.
 *
 * This is a complex type.
 */
public class PhoneNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.PhoneNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public PhoneNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHONENUMBER$0 = 
        new javax.xml.namespace.QName("", "phoneNumber");
    
    
    /**
     * Gets the "phoneNumber" element
     */
    public java.lang.String getPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONENUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "phoneNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetPhoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "phoneNumber" element
     */
    public void setPhoneNumber(java.lang.String phoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONENUMBER$0);
            }
            target.setStringValue(phoneNumber);
        }
    }
    
    /**
     * Sets (as xml) the "phoneNumber" element
     */
    public void xsetPhoneNumber(org.apache.xmlbeans.XmlString phoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONENUMBER$0);
            }
            target.set(phoneNumber);
        }
    }
}
