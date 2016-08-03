/*
 * An XML document type.
 * Localname: groupCoType
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.GroupCoTypeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one groupCoType(@) element.
 *
 * This is a complex type.
 */
public class GroupCoTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.GroupCoTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupCoTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPCOTYPE$0 = 
        new javax.xml.namespace.QName("", "groupCoType");
    
    
    /**
     * Gets the "groupCoType" element
     */
    public java.lang.String getGroupCoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPCOTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "groupCoType" element
     */
    public org.apache.xmlbeans.XmlString xgetGroupCoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPCOTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "groupCoType" element
     */
    public void setGroupCoType(java.lang.String groupCoType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPCOTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPCOTYPE$0);
            }
            target.setStringValue(groupCoType);
        }
    }
    
    /**
     * Sets (as xml) the "groupCoType" element
     */
    public void xsetGroupCoType(org.apache.xmlbeans.XmlString groupCoType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPCOTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPCOTYPE$0);
            }
            target.set(groupCoType);
        }
    }
}
