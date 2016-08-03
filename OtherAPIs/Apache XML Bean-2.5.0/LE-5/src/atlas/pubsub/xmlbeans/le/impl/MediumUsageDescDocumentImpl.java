/*
 * An XML document type.
 * Localname: mediumUsageDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.MediumUsageDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one mediumUsageDesc(@) element.
 *
 * This is a complex type.
 */
public class MediumUsageDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.MediumUsageDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediumUsageDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIUMUSAGEDESC$0 = 
        new javax.xml.namespace.QName("", "mediumUsageDesc");
    
    
    /**
     * Gets the "mediumUsageDesc" element
     */
    public java.lang.String getMediumUsageDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMUSAGEDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediumUsageDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetMediumUsageDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMUSAGEDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mediumUsageDesc" element
     */
    public void setMediumUsageDesc(java.lang.String mediumUsageDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMUSAGEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIUMUSAGEDESC$0);
            }
            target.setStringValue(mediumUsageDesc);
        }
    }
    
    /**
     * Sets (as xml) the "mediumUsageDesc" element
     */
    public void xsetMediumUsageDesc(org.apache.xmlbeans.XmlString mediumUsageDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMUSAGEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIUMUSAGEDESC$0);
            }
            target.set(mediumUsageDesc);
        }
    }
}
