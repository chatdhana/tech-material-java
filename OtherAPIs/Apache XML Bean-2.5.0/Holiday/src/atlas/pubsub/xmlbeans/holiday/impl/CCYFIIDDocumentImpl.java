/*
 * An XML document type.
 * Localname: CCY-FI-ID
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.holiday.impl;
/**
 * A document containing one CCY-FI-ID(@) element.
 *
 * This is a complex type.
 */
public class CCYFIIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.holiday.CCYFIIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public CCYFIIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CCYFIID$0 = 
        new javax.xml.namespace.QName("", "CCY-FI-ID");
    
    
    /**
     * Gets the "CCY-FI-ID" element
     */
    public java.lang.String getCCYFIID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CCYFIID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CCY-FI-ID" element
     */
    public org.apache.xmlbeans.XmlString xgetCCYFIID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CCYFIID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CCY-FI-ID" element
     */
    public void setCCYFIID(java.lang.String ccyfiid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CCYFIID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CCYFIID$0);
            }
            target.setStringValue(ccyfiid);
        }
    }
    
    /**
     * Sets (as xml) the "CCY-FI-ID" element
     */
    public void xsetCCYFIID(org.apache.xmlbeans.XmlString ccyfiid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CCYFIID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CCYFIID$0);
            }
            target.set(ccyfiid);
        }
    }
}
