/*
 * An XML document type.
 * Localname: mediumCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.MediumCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one mediumCode(@) element.
 *
 * This is a complex type.
 */
public class MediumCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.MediumCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediumCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIUMCODE$0 = 
        new javax.xml.namespace.QName("", "mediumCode");
    
    
    /**
     * Gets the "mediumCode" element
     */
    public java.lang.String getMediumCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediumCode" element
     */
    public org.apache.xmlbeans.XmlString xgetMediumCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mediumCode" element
     */
    public void setMediumCode(java.lang.String mediumCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIUMCODE$0);
            }
            target.setStringValue(mediumCode);
        }
    }
    
    /**
     * Sets (as xml) the "mediumCode" element
     */
    public void xsetMediumCode(org.apache.xmlbeans.XmlString mediumCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIUMCODE$0);
            }
            target.set(mediumCode);
        }
    }
}
