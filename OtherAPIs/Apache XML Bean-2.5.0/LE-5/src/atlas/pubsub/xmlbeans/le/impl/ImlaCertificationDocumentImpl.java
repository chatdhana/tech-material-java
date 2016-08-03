/*
 * An XML document type.
 * Localname: imlaCertification
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ImlaCertificationDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one imlaCertification(@) element.
 *
 * This is a complex type.
 */
public class ImlaCertificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ImlaCertificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImlaCertificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMLACERTIFICATION$0 = 
        new javax.xml.namespace.QName("", "imlaCertification");
    
    
    /**
     * Gets the "imlaCertification" element
     */
    public java.lang.String getImlaCertification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMLACERTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "imlaCertification" element
     */
    public org.apache.xmlbeans.XmlString xgetImlaCertification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMLACERTIFICATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "imlaCertification" element
     */
    public void setImlaCertification(java.lang.String imlaCertification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMLACERTIFICATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMLACERTIFICATION$0);
            }
            target.setStringValue(imlaCertification);
        }
    }
    
    /**
     * Sets (as xml) the "imlaCertification" element
     */
    public void xsetImlaCertification(org.apache.xmlbeans.XmlString imlaCertification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMLACERTIFICATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMLACERTIFICATION$0);
            }
            target.set(imlaCertification);
        }
    }
}
