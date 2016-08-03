/*
 * An XML document type.
 * Localname: custStatChngDt
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.CustStatChngDtDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one custStatChngDt(@) element.
 *
 * This is a complex type.
 */
public class CustStatChngDtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.CustStatChngDtDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustStatChngDtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTSTATCHNGDT$0 = 
        new javax.xml.namespace.QName("", "custStatChngDt");
    
    
    /**
     * Gets the "custStatChngDt" element
     */
    public java.lang.String getCustStatChngDt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATCHNGDT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "custStatChngDt" element
     */
    public org.apache.xmlbeans.XmlString xgetCustStatChngDt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATCHNGDT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "custStatChngDt" element
     */
    public void setCustStatChngDt(java.lang.String custStatChngDt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATCHNGDT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTSTATCHNGDT$0);
            }
            target.setStringValue(custStatChngDt);
        }
    }
    
    /**
     * Sets (as xml) the "custStatChngDt" element
     */
    public void xsetCustStatChngDt(org.apache.xmlbeans.XmlString custStatChngDt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATCHNGDT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTSTATCHNGDT$0);
            }
            target.set(custStatChngDt);
        }
    }
}
