/*
 * An XML document type.
 * Localname: custStatRsnCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.CustStatRsnCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one custStatRsnCode(@) element.
 *
 * This is a complex type.
 */
public class CustStatRsnCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.CustStatRsnCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustStatRsnCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTSTATRSNCODE$0 = 
        new javax.xml.namespace.QName("", "custStatRsnCode");
    
    
    /**
     * Gets the "custStatRsnCode" element
     */
    public java.lang.String getCustStatRsnCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATRSNCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "custStatRsnCode" element
     */
    public org.apache.xmlbeans.XmlString xgetCustStatRsnCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATRSNCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "custStatRsnCode" element
     */
    public void setCustStatRsnCode(java.lang.String custStatRsnCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSTATRSNCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTSTATRSNCODE$0);
            }
            target.setStringValue(custStatRsnCode);
        }
    }
    
    /**
     * Sets (as xml) the "custStatRsnCode" element
     */
    public void xsetCustStatRsnCode(org.apache.xmlbeans.XmlString custStatRsnCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTSTATRSNCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTSTATRSNCODE$0);
            }
            target.set(custStatRsnCode);
        }
    }
}
