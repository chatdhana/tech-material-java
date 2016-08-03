/*
 * An XML document type.
 * Localname: docComplDate
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.DocComplDateDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one docComplDate(@) element.
 *
 * This is a complex type.
 */
public class DocComplDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.DocComplDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocComplDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCCOMPLDATE$0 = 
        new javax.xml.namespace.QName("", "docComplDate");
    
    
    /**
     * Gets the "docComplDate" element
     */
    public java.lang.String getDocComplDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "docComplDate" element
     */
    public org.apache.xmlbeans.XmlString xgetDocComplDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "docComplDate" element
     */
    public void setDocComplDate(java.lang.String docComplDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCCOMPLDATE$0);
            }
            target.setStringValue(docComplDate);
        }
    }
    
    /**
     * Sets (as xml) the "docComplDate" element
     */
    public void xsetDocComplDate(org.apache.xmlbeans.XmlString docComplDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCCOMPLDATE$0);
            }
            target.set(docComplDate);
        }
    }
}
