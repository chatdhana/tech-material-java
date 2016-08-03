/*
 * An XML document type.
 * Localname: hierarchyTypeDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.HierarchyTypeDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one hierarchyTypeDesc(@) element.
 *
 * This is a complex type.
 */
public class HierarchyTypeDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.HierarchyTypeDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public HierarchyTypeDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIERARCHYTYPEDESC$0 = 
        new javax.xml.namespace.QName("", "hierarchyTypeDesc");
    
    
    /**
     * Gets the "hierarchyTypeDesc" element
     */
    public java.lang.String getHierarchyTypeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHYTYPEDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hierarchyTypeDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetHierarchyTypeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHYTYPEDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "hierarchyTypeDesc" element
     */
    public void setHierarchyTypeDesc(java.lang.String hierarchyTypeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHYTYPEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIERARCHYTYPEDESC$0);
            }
            target.setStringValue(hierarchyTypeDesc);
        }
    }
    
    /**
     * Sets (as xml) the "hierarchyTypeDesc" element
     */
    public void xsetHierarchyTypeDesc(org.apache.xmlbeans.XmlString hierarchyTypeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHYTYPEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HIERARCHYTYPEDESC$0);
            }
            target.set(hierarchyTypeDesc);
        }
    }
}
