/*
 * An XML document type.
 * Localname: instSectorDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.InstSectorDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one instSectorDesc(@) element.
 *
 * This is a complex type.
 */
public class InstSectorDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.InstSectorDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public InstSectorDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTSECTORDESC$0 = 
        new javax.xml.namespace.QName("", "instSectorDesc");
    
    
    /**
     * Gets the "instSectorDesc" element
     */
    public java.lang.String getInstSectorDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTSECTORDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "instSectorDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetInstSectorDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTSECTORDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "instSectorDesc" element
     */
    public void setInstSectorDesc(java.lang.String instSectorDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTSECTORDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSTSECTORDESC$0);
            }
            target.setStringValue(instSectorDesc);
        }
    }
    
    /**
     * Sets (as xml) the "instSectorDesc" element
     */
    public void xsetInstSectorDesc(org.apache.xmlbeans.XmlString instSectorDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTSECTORDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSTSECTORDESC$0);
            }
            target.set(instSectorDesc);
        }
    }
}
