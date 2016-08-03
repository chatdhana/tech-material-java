/*
 * An XML document type.
 * Localname: mediumCodeDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.MediumCodeDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one mediumCodeDesc(@) element.
 *
 * This is a complex type.
 */
public class MediumCodeDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.MediumCodeDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediumCodeDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIUMCODEDESC$0 = 
        new javax.xml.namespace.QName("", "mediumCodeDesc");
    
    
    /**
     * Gets the "mediumCodeDesc" element
     */
    public java.lang.String getMediumCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMCODEDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediumCodeDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetMediumCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMCODEDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mediumCodeDesc" element
     */
    public void setMediumCodeDesc(java.lang.String mediumCodeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMCODEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIUMCODEDESC$0);
            }
            target.setStringValue(mediumCodeDesc);
        }
    }
    
    /**
     * Sets (as xml) the "mediumCodeDesc" element
     */
    public void xsetMediumCodeDesc(org.apache.xmlbeans.XmlString mediumCodeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMCODEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIUMCODEDESC$0);
            }
            target.set(mediumCodeDesc);
        }
    }
}
