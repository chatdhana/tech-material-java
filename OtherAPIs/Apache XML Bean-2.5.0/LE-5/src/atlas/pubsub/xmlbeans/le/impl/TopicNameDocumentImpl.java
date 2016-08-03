/*
 * An XML document type.
 * Localname: topicName
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.TopicNameDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one topicName(@) element.
 *
 * This is a complex type.
 */
public class TopicNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.TopicNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopicNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPICNAME$0 = 
        new javax.xml.namespace.QName("", "topicName");
    
    
    /**
     * Gets the "topicName" element
     */
    public java.lang.String getTopicName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPICNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "topicName" element
     */
    public org.apache.xmlbeans.XmlString xgetTopicName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOPICNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "topicName" element
     */
    public void setTopicName(java.lang.String topicName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPICNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOPICNAME$0);
            }
            target.setStringValue(topicName);
        }
    }
    
    /**
     * Sets (as xml) the "topicName" element
     */
    public void xsetTopicName(org.apache.xmlbeans.XmlString topicName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOPICNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOPICNAME$0);
            }
            target.set(topicName);
        }
    }
}
