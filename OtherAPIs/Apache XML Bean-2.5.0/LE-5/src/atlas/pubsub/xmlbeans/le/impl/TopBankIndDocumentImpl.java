/*
 * An XML document type.
 * Localname: topBankInd
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.TopBankIndDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one topBankInd(@) element.
 *
 * This is a complex type.
 */
public class TopBankIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.TopBankIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopBankIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPBANKIND$0 = 
        new javax.xml.namespace.QName("", "topBankInd");
    
    
    /**
     * Gets the "topBankInd" element
     */
    public java.lang.String getTopBankInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPBANKIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "topBankInd" element
     */
    public org.apache.xmlbeans.XmlString xgetTopBankInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOPBANKIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "topBankInd" element
     */
    public void setTopBankInd(java.lang.String topBankInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPBANKIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOPBANKIND$0);
            }
            target.setStringValue(topBankInd);
        }
    }
    
    /**
     * Sets (as xml) the "topBankInd" element
     */
    public void xsetTopBankInd(org.apache.xmlbeans.XmlString topBankInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOPBANKIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOPBANKIND$0);
            }
            target.set(topBankInd);
        }
    }
}
