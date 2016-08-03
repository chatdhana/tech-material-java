/*
 * An XML document type.
 * Localname: finInstType
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.FinInstTypeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one finInstType(@) element.
 *
 * This is a complex type.
 */
public class FinInstTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.FinInstTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public FinInstTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FININSTTYPE$0 = 
        new javax.xml.namespace.QName("", "finInstType");
    
    
    /**
     * Gets the "finInstType" element
     */
    public java.lang.String getFinInstType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FININSTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "finInstType" element
     */
    public org.apache.xmlbeans.XmlString xgetFinInstType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FININSTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "finInstType" element
     */
    public void setFinInstType(java.lang.String finInstType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FININSTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FININSTTYPE$0);
            }
            target.setStringValue(finInstType);
        }
    }
    
    /**
     * Sets (as xml) the "finInstType" element
     */
    public void xsetFinInstType(org.apache.xmlbeans.XmlString finInstType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FININSTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FININSTTYPE$0);
            }
            target.set(finInstType);
        }
    }
}
