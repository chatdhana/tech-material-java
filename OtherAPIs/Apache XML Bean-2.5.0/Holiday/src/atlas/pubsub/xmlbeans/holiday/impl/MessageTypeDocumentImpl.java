/*
 * An XML document type.
 * Localname: messageType
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.holiday.MessageTypeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.holiday.impl;
/**
 * A document containing one messageType(@) element.
 *
 * This is a complex type.
 */
public class MessageTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.holiday.MessageTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGETYPE$0 = 
        new javax.xml.namespace.QName("", "messageType");
    
    
    /**
     * Gets the "messageType" element
     */
    public java.lang.String getMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageType" element
     */
    public org.apache.xmlbeans.XmlString xgetMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "messageType" element
     */
    public void setMessageType(java.lang.String messageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGETYPE$0);
            }
            target.setStringValue(messageType);
        }
    }
    
    /**
     * Sets (as xml) the "messageType" element
     */
    public void xsetMessageType(org.apache.xmlbeans.XmlString messageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGETYPE$0);
            }
            target.set(messageType);
        }
    }
}
