/*
 * An XML document type.
 * Localname: tcIdCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.TcIdCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one tcIdCode(@) element.
 *
 * This is a complex type.
 */
public class TcIdCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.TcIdCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TcIdCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TCIDCODE$0 = 
        new javax.xml.namespace.QName("", "tcIdCode");
    
    
    /**
     * Gets the "tcIdCode" element
     */
    public java.lang.String getTcIdCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TCIDCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tcIdCode" element
     */
    public org.apache.xmlbeans.XmlString xgetTcIdCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TCIDCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tcIdCode" element
     */
    public void setTcIdCode(java.lang.String tcIdCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TCIDCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TCIDCODE$0);
            }
            target.setStringValue(tcIdCode);
        }
    }
    
    /**
     * Sets (as xml) the "tcIdCode" element
     */
    public void xsetTcIdCode(org.apache.xmlbeans.XmlString tcIdCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TCIDCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TCIDCODE$0);
            }
            target.set(tcIdCode);
        }
    }
}
