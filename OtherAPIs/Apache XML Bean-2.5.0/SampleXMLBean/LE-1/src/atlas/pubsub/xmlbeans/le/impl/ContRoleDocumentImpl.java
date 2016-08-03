/*
 * An XML document type.
 * Localname: contRole
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ContRoleDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one contRole(@) element.
 *
 * This is a complex type.
 */
public class ContRoleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ContRoleDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContRoleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROLE$0 = 
        new javax.xml.namespace.QName("", "contRole");
    
    
    /**
     * Gets the "contRole" element
     */
    public java.lang.String getContRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contRole" element
     */
    public org.apache.xmlbeans.XmlString xgetContRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTROLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contRole" element
     */
    public void setContRole(java.lang.String contRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTROLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTROLE$0);
            }
            target.setStringValue(contRole);
        }
    }
    
    /**
     * Sets (as xml) the "contRole" element
     */
    public void xsetContRole(org.apache.xmlbeans.XmlString contRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTROLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTROLE$0);
            }
            target.set(contRole);
        }
    }
}
