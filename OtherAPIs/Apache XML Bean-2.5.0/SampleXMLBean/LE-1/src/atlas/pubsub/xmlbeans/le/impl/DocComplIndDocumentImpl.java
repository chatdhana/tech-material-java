/*
 * An XML document type.
 * Localname: docComplInd
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.DocComplIndDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one docComplInd(@) element.
 *
 * This is a complex type.
 */
public class DocComplIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.DocComplIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocComplIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCCOMPLIND$0 = 
        new javax.xml.namespace.QName("", "docComplInd");
    
    
    /**
     * Gets the "docComplInd" element
     */
    public java.lang.String getDocComplInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "docComplInd" element
     */
    public org.apache.xmlbeans.XmlString xgetDocComplInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "docComplInd" element
     */
    public void setDocComplInd(java.lang.String docComplInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCCOMPLIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCCOMPLIND$0);
            }
            target.setStringValue(docComplInd);
        }
    }
    
    /**
     * Sets (as xml) the "docComplInd" element
     */
    public void xsetDocComplInd(org.apache.xmlbeans.XmlString docComplInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCCOMPLIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCCOMPLIND$0);
            }
            target.set(docComplInd);
        }
    }
}
