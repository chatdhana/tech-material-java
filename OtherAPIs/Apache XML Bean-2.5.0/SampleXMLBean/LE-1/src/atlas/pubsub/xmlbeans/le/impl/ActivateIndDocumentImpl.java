/*
 * An XML document type.
 * Localname: activateInd
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ActivateIndDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one activateInd(@) element.
 *
 * This is a complex type.
 */
public class ActivateIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ActivateIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivateIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVATEIND$0 = 
        new javax.xml.namespace.QName("", "activateInd");
    
    
    /**
     * Gets the "activateInd" element
     */
    public java.lang.String getActivateInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVATEIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "activateInd" element
     */
    public org.apache.xmlbeans.XmlString xgetActivateInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVATEIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "activateInd" element
     */
    public void setActivateInd(java.lang.String activateInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVATEIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVATEIND$0);
            }
            target.setStringValue(activateInd);
        }
    }
    
    /**
     * Sets (as xml) the "activateInd" element
     */
    public void xsetActivateInd(org.apache.xmlbeans.XmlString activateInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVATEIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVATEIND$0);
            }
            target.set(activateInd);
        }
    }
}
