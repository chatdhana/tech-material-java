/*
 * An XML document type.
 * Localname: instSector
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.InstSectorDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one instSector(@) element.
 *
 * This is a complex type.
 */
public class InstSectorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.InstSectorDocument
{
    private static final long serialVersionUID = 1L;
    
    public InstSectorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTSECTOR$0 = 
        new javax.xml.namespace.QName("", "instSector");
    
    
    /**
     * Gets the "instSector" element
     */
    public java.lang.String getInstSector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTSECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "instSector" element
     */
    public org.apache.xmlbeans.XmlString xgetInstSector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTSECTOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "instSector" element
     */
    public void setInstSector(java.lang.String instSector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTSECTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSTSECTOR$0);
            }
            target.setStringValue(instSector);
        }
    }
    
    /**
     * Sets (as xml) the "instSector" element
     */
    public void xsetInstSector(org.apache.xmlbeans.XmlString instSector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTSECTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSTSECTOR$0);
            }
            target.set(instSector);
        }
    }
}
