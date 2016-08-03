/*
 * An XML document type.
 * Localname: updstatus
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.UpdstatusDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one updstatus(@) element.
 *
 * This is a complex type.
 */
public class UpdstatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.UpdstatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdstatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDSTATUS$0 = 
        new javax.xml.namespace.QName("", "updstatus");
    
    
    /**
     * Gets the "updstatus" element
     */
    public java.lang.String getUpdstatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "updstatus" element
     */
    public org.apache.xmlbeans.XmlString xgetUpdstatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "updstatus" element
     */
    public void setUpdstatus(java.lang.String updstatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDSTATUS$0);
            }
            target.setStringValue(updstatus);
        }
    }
    
    /**
     * Sets (as xml) the "updstatus" element
     */
    public void xsetUpdstatus(org.apache.xmlbeans.XmlString updstatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDSTATUS$0);
            }
            target.set(updstatus);
        }
    }
}
