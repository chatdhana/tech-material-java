/*
 * An XML document type.
 * Localname: isicCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.IsicCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one isicCode(@) element.
 *
 * This is a complex type.
 */
public class IsicCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.IsicCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public IsicCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISICCODE$0 = 
        new javax.xml.namespace.QName("", "isicCode");
    
    
    /**
     * Gets the "isicCode" element
     */
    public java.lang.String getIsicCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "isicCode" element
     */
    public org.apache.xmlbeans.XmlString xgetIsicCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isicCode" element
     */
    public void setIsicCode(java.lang.String isicCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISICCODE$0);
            }
            target.setStringValue(isicCode);
        }
    }
    
    /**
     * Sets (as xml) the "isicCode" element
     */
    public void xsetIsicCode(org.apache.xmlbeans.XmlString isicCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISICCODE$0);
            }
            target.set(isicCode);
        }
    }
}
