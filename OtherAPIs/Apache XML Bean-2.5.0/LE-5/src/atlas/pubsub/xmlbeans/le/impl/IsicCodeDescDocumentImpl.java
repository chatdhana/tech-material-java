/*
 * An XML document type.
 * Localname: isicCodeDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.IsicCodeDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one isicCodeDesc(@) element.
 *
 * This is a complex type.
 */
public class IsicCodeDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.IsicCodeDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public IsicCodeDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISICCODEDESC$0 = 
        new javax.xml.namespace.QName("", "isicCodeDesc");
    
    
    /**
     * Gets the "isicCodeDesc" element
     */
    public java.lang.String getIsicCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICCODEDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "isicCodeDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetIsicCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICCODEDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isicCodeDesc" element
     */
    public void setIsicCodeDesc(java.lang.String isicCodeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICCODEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISICCODEDESC$0);
            }
            target.setStringValue(isicCodeDesc);
        }
    }
    
    /**
     * Sets (as xml) the "isicCodeDesc" element
     */
    public void xsetIsicCodeDesc(org.apache.xmlbeans.XmlString isicCodeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICCODEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISICCODEDESC$0);
            }
            target.set(isicCodeDesc);
        }
    }
}
