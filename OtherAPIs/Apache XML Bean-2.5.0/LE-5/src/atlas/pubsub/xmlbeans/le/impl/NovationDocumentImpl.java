/*
 * An XML document type.
 * Localname: novation
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.NovationDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one novation(@) element.
 *
 * This is a complex type.
 */
public class NovationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.NovationDocument
{
    private static final long serialVersionUID = 1L;
    
    public NovationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOVATION$0 = 
        new javax.xml.namespace.QName("", "novation");
    
    
    /**
     * Gets the "novation" element
     */
    public java.lang.String getNovation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOVATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "novation" element
     */
    public org.apache.xmlbeans.XmlString xgetNovation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOVATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "novation" element
     */
    public void setNovation(java.lang.String novation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOVATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOVATION$0);
            }
            target.setStringValue(novation);
        }
    }
    
    /**
     * Sets (as xml) the "novation" element
     */
    public void xsetNovation(org.apache.xmlbeans.XmlString novation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOVATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOVATION$0);
            }
            target.set(novation);
        }
    }
}
