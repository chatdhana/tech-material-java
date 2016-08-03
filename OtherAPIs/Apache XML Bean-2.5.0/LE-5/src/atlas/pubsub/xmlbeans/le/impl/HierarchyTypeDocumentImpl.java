/*
 * An XML document type.
 * Localname: hierarchyType
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.HierarchyTypeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one hierarchyType(@) element.
 *
 * This is a complex type.
 */
public class HierarchyTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.HierarchyTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public HierarchyTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIERARCHYTYPE$0 = 
        new javax.xml.namespace.QName("", "hierarchyType");
    
    
    /**
     * Gets the "hierarchyType" element
     */
    public java.lang.String getHierarchyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hierarchyType" element
     */
    public org.apache.xmlbeans.XmlString xgetHierarchyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHYTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "hierarchyType" element
     */
    public void setHierarchyType(java.lang.String hierarchyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHYTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIERARCHYTYPE$0);
            }
            target.setStringValue(hierarchyType);
        }
    }
    
    /**
     * Sets (as xml) the "hierarchyType" element
     */
    public void xsetHierarchyType(org.apache.xmlbeans.XmlString hierarchyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHYTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HIERARCHYTYPE$0);
            }
            target.set(hierarchyType);
        }
    }
}
