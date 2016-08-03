/*
 * An XML document type.
 * Localname: scbLeInd
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ScbLeIndDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one scbLeInd(@) element.
 *
 * This is a complex type.
 */
public class ScbLeIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ScbLeIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScbLeIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCBLEIND$0 = 
        new javax.xml.namespace.QName("", "scbLeInd");
    
    
    /**
     * Gets the "scbLeInd" element
     */
    public java.lang.String getScbLeInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBLEIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scbLeInd" element
     */
    public org.apache.xmlbeans.XmlString xgetScbLeInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBLEIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scbLeInd" element
     */
    public void setScbLeInd(java.lang.String scbLeInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBLEIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBLEIND$0);
            }
            target.setStringValue(scbLeInd);
        }
    }
    
    /**
     * Sets (as xml) the "scbLeInd" element
     */
    public void xsetScbLeInd(org.apache.xmlbeans.XmlString scbLeInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBLEIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBLEIND$0);
            }
            target.set(scbLeInd);
        }
    }
}
