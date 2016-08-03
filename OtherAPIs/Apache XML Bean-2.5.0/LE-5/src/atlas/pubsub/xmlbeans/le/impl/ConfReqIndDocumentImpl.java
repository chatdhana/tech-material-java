/*
 * An XML document type.
 * Localname: confReqInd
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ConfReqIndDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one confReqInd(@) element.
 *
 * This is a complex type.
 */
public class ConfReqIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ConfReqIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConfReqIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFREQIND$0 = 
        new javax.xml.namespace.QName("", "confReqInd");
    
    
    /**
     * Gets the "confReqInd" element
     */
    public java.lang.String getConfReqInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFREQIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "confReqInd" element
     */
    public org.apache.xmlbeans.XmlString xgetConfReqInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFREQIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "confReqInd" element
     */
    public void setConfReqInd(java.lang.String confReqInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFREQIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFREQIND$0);
            }
            target.setStringValue(confReqInd);
        }
    }
    
    /**
     * Sets (as xml) the "confReqInd" element
     */
    public void xsetConfReqInd(org.apache.xmlbeans.XmlString confReqInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFREQIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONFREQIND$0);
            }
            target.set(confReqInd);
        }
    }
}
