/*
 * An XML document type.
 * Localname: crdate
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.CrdateDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one crdate(@) element.
 *
 * This is a complex type.
 */
public class CrdateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.CrdateDocument
{
    private static final long serialVersionUID = 1L;
    
    public CrdateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CRDATE$0 = 
        new javax.xml.namespace.QName("", "crdate");
    
    
    /**
     * Gets the "crdate" element
     */
    public java.lang.String getCrdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "crdate" element
     */
    public org.apache.xmlbeans.XmlString xgetCrdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CRDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "crdate" element
     */
    public void setCrdate(java.lang.String crdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRDATE$0);
            }
            target.setStringValue(crdate);
        }
    }
    
    /**
     * Sets (as xml) the "crdate" element
     */
    public void xsetCrdate(org.apache.xmlbeans.XmlString crdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CRDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CRDATE$0);
            }
            target.set(crdate);
        }
    }
}
