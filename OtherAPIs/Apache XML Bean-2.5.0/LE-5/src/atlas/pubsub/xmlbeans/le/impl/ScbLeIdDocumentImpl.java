/*
 * An XML document type.
 * Localname: scbLeId
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ScbLeIdDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one scbLeId(@) element.
 *
 * This is a complex type.
 */
public class ScbLeIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ScbLeIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScbLeIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCBLEID$0 = 
        new javax.xml.namespace.QName("", "scbLeId");
    
    
    /**
     * Gets the "scbLeId" element
     */
    public java.lang.String getScbLeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBLEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scbLeId" element
     */
    public org.apache.xmlbeans.XmlString xgetScbLeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBLEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scbLeId" element
     */
    public void setScbLeId(java.lang.String scbLeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBLEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBLEID$0);
            }
            target.setStringValue(scbLeId);
        }
    }
    
    /**
     * Sets (as xml) the "scbLeId" element
     */
    public void xsetScbLeId(org.apache.xmlbeans.XmlString scbLeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBLEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBLEID$0);
            }
            target.set(scbLeId);
        }
    }
}
