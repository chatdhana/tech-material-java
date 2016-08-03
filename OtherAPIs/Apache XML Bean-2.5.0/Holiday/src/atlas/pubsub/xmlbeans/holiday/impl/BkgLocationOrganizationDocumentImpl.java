/*
 * An XML document type.
 * Localname: bkgLocationOrganization
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.holiday.BkgLocationOrganizationDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.holiday.impl;
/**
 * A document containing one bkgLocationOrganization(@) element.
 *
 * This is a complex type.
 */
public class BkgLocationOrganizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.holiday.BkgLocationOrganizationDocument
{
    private static final long serialVersionUID = 1L;
    
    public BkgLocationOrganizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BKGLOCATIONORGANIZATION$0 = 
        new javax.xml.namespace.QName("", "bkgLocationOrganization");
    
    
    /**
     * Gets the "bkgLocationOrganization" element
     */
    public java.lang.String getBkgLocationOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONORGANIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bkgLocationOrganization" element
     */
    public org.apache.xmlbeans.XmlString xgetBkgLocationOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONORGANIZATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bkgLocationOrganization" element
     */
    public void setBkgLocationOrganization(java.lang.String bkgLocationOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONORGANIZATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BKGLOCATIONORGANIZATION$0);
            }
            target.setStringValue(bkgLocationOrganization);
        }
    }
    
    /**
     * Sets (as xml) the "bkgLocationOrganization" element
     */
    public void xsetBkgLocationOrganization(org.apache.xmlbeans.XmlString bkgLocationOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONORGANIZATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BKGLOCATIONORGANIZATION$0);
            }
            target.set(bkgLocationOrganization);
        }
    }
}
