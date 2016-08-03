/*
 * An XML document type.
 * Localname: contLastName
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ContLastNameDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one contLastName(@) element.
 *
 * This is a complex type.
 */
public class ContLastNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ContLastNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContLastNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTLASTNAME$0 = 
        new javax.xml.namespace.QName("", "contLastName");
    
    
    /**
     * Gets the "contLastName" element
     */
    public java.lang.String getContLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTLASTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contLastName" element
     */
    public org.apache.xmlbeans.XmlString xgetContLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTLASTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contLastName" element
     */
    public void setContLastName(java.lang.String contLastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTLASTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTLASTNAME$0);
            }
            target.setStringValue(contLastName);
        }
    }
    
    /**
     * Sets (as xml) the "contLastName" element
     */
    public void xsetContLastName(org.apache.xmlbeans.XmlString contLastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTLASTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTLASTNAME$0);
            }
            target.set(contLastName);
        }
    }
}
