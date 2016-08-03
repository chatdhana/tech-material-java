/*
 * An XML document type.
 * Localname: clsCustType
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ClsCustTypeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one clsCustType(@) element.
 *
 * This is a complex type.
 */
public class ClsCustTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ClsCustTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClsCustTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLSCUSTTYPE$0 = 
        new javax.xml.namespace.QName("", "clsCustType");
    
    
    /**
     * Gets the "clsCustType" element
     */
    public java.lang.String getClsCustType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSCUSTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "clsCustType" element
     */
    public org.apache.xmlbeans.XmlString xgetClsCustType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSCUSTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "clsCustType" element
     */
    public void setClsCustType(java.lang.String clsCustType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSCUSTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLSCUSTTYPE$0);
            }
            target.setStringValue(clsCustType);
        }
    }
    
    /**
     * Sets (as xml) the "clsCustType" element
     */
    public void xsetClsCustType(org.apache.xmlbeans.XmlString clsCustType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSCUSTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLSCUSTTYPE$0);
            }
            target.set(clsCustType);
        }
    }
}
