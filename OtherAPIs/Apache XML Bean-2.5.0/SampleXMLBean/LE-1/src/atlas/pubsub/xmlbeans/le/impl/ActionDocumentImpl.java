/*
 * An XML document type.
 * Localname: action
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ActionDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one action(@) element.
 *
 * This is a complex type.
 */
public class ActionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ActionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTION$0 = 
        new javax.xml.namespace.QName("", "action");
    
    
    /**
     * Gets the "action" element
     */
    public java.lang.String getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" element
     */
    public org.apache.xmlbeans.XmlString xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "action" element
     */
    public void setAction(java.lang.String action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$0);
            }
            target.setStringValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" element
     */
    public void xsetAction(org.apache.xmlbeans.XmlString action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTION$0);
            }
            target.set(action);
        }
    }
}
