/*
 * An XML document type.
 * Localname: sciLeId
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.SciLeIdDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one sciLeId(@) element.
 *
 * This is a complex type.
 */
public class SciLeIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.SciLeIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public SciLeIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCILEID$0 = 
        new javax.xml.namespace.QName("", "sciLeId");
    
    
    /**
     * Gets the "sciLeId" element
     */
    public java.lang.String getSciLeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCILEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sciLeId" element
     */
    public org.apache.xmlbeans.XmlString xgetSciLeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCILEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sciLeId" element
     */
    public void setSciLeId(java.lang.String sciLeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCILEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCILEID$0);
            }
            target.setStringValue(sciLeId);
        }
    }
    
    /**
     * Sets (as xml) the "sciLeId" element
     */
    public void xsetSciLeId(org.apache.xmlbeans.XmlString sciLeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCILEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCILEID$0);
            }
            target.set(sciLeId);
        }
    }
}
