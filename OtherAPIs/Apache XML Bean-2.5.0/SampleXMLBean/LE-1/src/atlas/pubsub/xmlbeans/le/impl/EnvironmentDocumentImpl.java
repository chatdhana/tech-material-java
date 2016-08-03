/*
 * An XML document type.
 * Localname: environment
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.EnvironmentDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one environment(@) element.
 *
 * This is a complex type.
 */
public class EnvironmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.EnvironmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnvironmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVIRONMENT$0 = 
        new javax.xml.namespace.QName("", "environment");
    
    
    /**
     * Gets the "environment" element
     */
    public java.lang.String getEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIRONMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "environment" element
     */
    public org.apache.xmlbeans.XmlString xgetEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIRONMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "environment" element
     */
    public void setEnvironment(java.lang.String environment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIRONMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIRONMENT$0);
            }
            target.setStringValue(environment);
        }
    }
    
    /**
     * Sets (as xml) the "environment" element
     */
    public void xsetEnvironment(org.apache.xmlbeans.XmlString environment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENVIRONMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENVIRONMENT$0);
            }
            target.set(environment);
        }
    }
}
