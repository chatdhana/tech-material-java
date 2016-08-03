/*
 * An XML document type.
 * Localname: custStatus
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.CustStatusDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one custStatus(@) element.
 *
 * This is a complex type.
 */
public class CustStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.CustStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTSTATUS$0 = 
        new javax.xml.namespace.QName("", "custStatus");
    
    
    /**
     * Gets the "custStatus" element
     */
    public java.lang.String getCustStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "custStatus" element
     */
    public org.apache.xmlbeans.XmlString xgetCustStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "custStatus" element
     */
    public void setCustStatus(java.lang.String custStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTSTATUS$0);
            }
            target.setStringValue(custStatus);
        }
    }
    
    /**
     * Sets (as xml) the "custStatus" element
     */
    public void xsetCustStatus(org.apache.xmlbeans.XmlString custStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTSTATUS$0);
            }
            target.set(custStatus);
        }
    }
}
