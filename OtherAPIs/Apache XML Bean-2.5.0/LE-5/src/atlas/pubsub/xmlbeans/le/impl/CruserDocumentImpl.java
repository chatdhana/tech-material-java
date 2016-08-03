/*
 * An XML document type.
 * Localname: cruser
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.CruserDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one cruser(@) element.
 *
 * This is a complex type.
 */
public class CruserDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.CruserDocument
{
    private static final long serialVersionUID = 1L;
    
    public CruserDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CRUSER$0 = 
        new javax.xml.namespace.QName("", "cruser");
    
    
    /**
     * Gets the "cruser" element
     */
    public java.lang.String getCruser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRUSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cruser" element
     */
    public org.apache.xmlbeans.XmlString xgetCruser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CRUSER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cruser" element
     */
    public void setCruser(java.lang.String cruser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRUSER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRUSER$0);
            }
            target.setStringValue(cruser);
        }
    }
    
    /**
     * Sets (as xml) the "cruser" element
     */
    public void xsetCruser(org.apache.xmlbeans.XmlString cruser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CRUSER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CRUSER$0);
            }
            target.set(cruser);
        }
    }
}
