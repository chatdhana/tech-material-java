/*
 * An XML document type.
 * Localname: mediumUsage
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.MediumUsageDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one mediumUsage(@) element.
 *
 * This is a complex type.
 */
public class MediumUsageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.MediumUsageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediumUsageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIUMUSAGE$0 = 
        new javax.xml.namespace.QName("", "mediumUsage");
    
    
    /**
     * Gets the "mediumUsage" element
     */
    public java.lang.String getMediumUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMUSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediumUsage" element
     */
    public org.apache.xmlbeans.XmlString xgetMediumUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMUSAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mediumUsage" element
     */
    public void setMediumUsage(java.lang.String mediumUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMUSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIUMUSAGE$0);
            }
            target.setStringValue(mediumUsage);
        }
    }
    
    /**
     * Sets (as xml) the "mediumUsage" element
     */
    public void xsetMediumUsage(org.apache.xmlbeans.XmlString mediumUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMUSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIUMUSAGE$0);
            }
            target.set(mediumUsage);
        }
    }
}
