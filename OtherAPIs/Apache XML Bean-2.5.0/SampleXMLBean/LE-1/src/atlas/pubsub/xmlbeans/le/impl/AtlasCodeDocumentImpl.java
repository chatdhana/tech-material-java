/*
 * An XML document type.
 * Localname: atlasCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.AtlasCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one atlasCode(@) element.
 *
 * This is a complex type.
 */
public class AtlasCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.AtlasCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AtlasCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATLASCODE$0 = 
        new javax.xml.namespace.QName("", "atlasCode");
    
    
    /**
     * Gets the "atlasCode" element
     */
    public java.lang.String getAtlasCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATLASCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "atlasCode" element
     */
    public org.apache.xmlbeans.XmlString xgetAtlasCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATLASCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "atlasCode" element
     */
    public void setAtlasCode(java.lang.String atlasCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATLASCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATLASCODE$0);
            }
            target.setStringValue(atlasCode);
        }
    }
    
    /**
     * Sets (as xml) the "atlasCode" element
     */
    public void xsetAtlasCode(org.apache.xmlbeans.XmlString atlasCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATLASCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATLASCODE$0);
            }
            target.set(atlasCode);
        }
    }
}
