/*
 * An XML document type.
 * Localname: sciSubProfileId
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one sciSubProfileId(@) element.
 *
 * This is a complex type.
 */
public class SciSubProfileIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.SciSubProfileIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public SciSubProfileIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCISUBPROFILEID$0 = 
        new javax.xml.namespace.QName("", "sciSubProfileId");
    
    
    /**
     * Gets the "sciSubProfileId" element
     */
    public java.lang.String getSciSubProfileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCISUBPROFILEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sciSubProfileId" element
     */
    public org.apache.xmlbeans.XmlString xgetSciSubProfileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCISUBPROFILEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sciSubProfileId" element
     */
    public void setSciSubProfileId(java.lang.String sciSubProfileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCISUBPROFILEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCISUBPROFILEID$0);
            }
            target.setStringValue(sciSubProfileId);
        }
    }
    
    /**
     * Sets (as xml) the "sciSubProfileId" element
     */
    public void xsetSciSubProfileId(org.apache.xmlbeans.XmlString sciSubProfileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCISUBPROFILEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCISUBPROFILEID$0);
            }
            target.set(sciSubProfileId);
        }
    }
}
