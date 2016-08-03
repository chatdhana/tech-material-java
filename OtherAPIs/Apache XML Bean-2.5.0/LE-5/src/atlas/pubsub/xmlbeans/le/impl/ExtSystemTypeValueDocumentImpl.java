/*
 * An XML document type.
 * Localname: extSystemTypeValue
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ExtSystemTypeValueDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one extSystemTypeValue(@) element.
 *
 * This is a complex type.
 */
public class ExtSystemTypeValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ExtSystemTypeValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtSystemTypeValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTSYSTEMTYPEVALUE$0 = 
        new javax.xml.namespace.QName("", "extSystemTypeValue");
    
    
    /**
     * Gets the "extSystemTypeValue" element
     */
    public java.lang.String getExtSystemTypeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTSYSTEMTYPEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "extSystemTypeValue" element
     */
    public org.apache.xmlbeans.XmlString xgetExtSystemTypeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTSYSTEMTYPEVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "extSystemTypeValue" element
     */
    public void setExtSystemTypeValue(java.lang.String extSystemTypeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTSYSTEMTYPEVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTSYSTEMTYPEVALUE$0);
            }
            target.setStringValue(extSystemTypeValue);
        }
    }
    
    /**
     * Sets (as xml) the "extSystemTypeValue" element
     */
    public void xsetExtSystemTypeValue(org.apache.xmlbeans.XmlString extSystemTypeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTSYSTEMTYPEVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTSYSTEMTYPEVALUE$0);
            }
            target.set(extSystemTypeValue);
        }
    }
}
