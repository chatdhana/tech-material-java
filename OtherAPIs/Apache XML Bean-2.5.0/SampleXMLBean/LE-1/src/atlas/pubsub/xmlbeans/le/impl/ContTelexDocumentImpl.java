/*
 * An XML document type.
 * Localname: contTelex
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ContTelexDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one contTelex(@) element.
 *
 * This is a complex type.
 */
public class ContTelexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ContTelexDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContTelexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTTELEX$0 = 
        new javax.xml.namespace.QName("", "contTelex");
    
    
    /**
     * Gets the "contTelex" element
     */
    public java.lang.String getContTelex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTTELEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contTelex" element
     */
    public org.apache.xmlbeans.XmlString xgetContTelex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTTELEX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contTelex" element
     */
    public void setContTelex(java.lang.String contTelex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTTELEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTTELEX$0);
            }
            target.setStringValue(contTelex);
        }
    }
    
    /**
     * Sets (as xml) the "contTelex" element
     */
    public void xsetContTelex(org.apache.xmlbeans.XmlString contTelex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTTELEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTTELEX$0);
            }
            target.set(contTelex);
        }
    }
}
