/*
 * An XML document type.
 * Localname: sourceSystem
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.SourceSystemDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one sourceSystem(@) element.
 *
 * This is a complex type.
 */
public class SourceSystemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.SourceSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCESYSTEM$0 = 
        new javax.xml.namespace.QName("", "sourceSystem");
    
    
    /**
     * Gets the "sourceSystem" element
     */
    public java.lang.String getSourceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCESYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceSystem" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCESYSTEM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceSystem" element
     */
    public void setSourceSystem(java.lang.String sourceSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCESYSTEM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCESYSTEM$0);
            }
            target.setStringValue(sourceSystem);
        }
    }
    
    /**
     * Sets (as xml) the "sourceSystem" element
     */
    public void xsetSourceSystem(org.apache.xmlbeans.XmlString sourceSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCESYSTEM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCESYSTEM$0);
            }
            target.set(sourceSystem);
        }
    }
}
