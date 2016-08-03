/*
 * An XML document type.
 * Localname: finInstTypeDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.FinInstTypeDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one finInstTypeDesc(@) element.
 *
 * This is a complex type.
 */
public class FinInstTypeDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.FinInstTypeDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public FinInstTypeDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FININSTTYPEDESC$0 = 
        new javax.xml.namespace.QName("", "finInstTypeDesc");
    
    
    /**
     * Gets the "finInstTypeDesc" element
     */
    public java.lang.String getFinInstTypeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FININSTTYPEDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "finInstTypeDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetFinInstTypeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FININSTTYPEDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "finInstTypeDesc" element
     */
    public void setFinInstTypeDesc(java.lang.String finInstTypeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FININSTTYPEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FININSTTYPEDESC$0);
            }
            target.setStringValue(finInstTypeDesc);
        }
    }
    
    /**
     * Sets (as xml) the "finInstTypeDesc" element
     */
    public void xsetFinInstTypeDesc(org.apache.xmlbeans.XmlString finInstTypeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FININSTTYPEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FININSTTYPEDESC$0);
            }
            target.set(finInstTypeDesc);
        }
    }
}
