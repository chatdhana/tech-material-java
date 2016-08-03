/*
 * An XML document type.
 * Localname: ACKNOWLEDGEMENT
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.response.sub.ACKNOWLEDGEMENTDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.response.sub.impl;
/**
 * A document containing one ACKNOWLEDGEMENT(@) element.
 *
 * This is a complex type.
 */
public class ACKNOWLEDGEMENTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.response.sub.ACKNOWLEDGEMENTDocument
{
    private static final long serialVersionUID = 1L;
    
    public ACKNOWLEDGEMENTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACKNOWLEDGEMENT$0 = 
        new javax.xml.namespace.QName("", "ACKNOWLEDGEMENT");
    
    
    /**
     * Gets the "ACKNOWLEDGEMENT" element
     */
    public java.lang.String getACKNOWLEDGEMENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACKNOWLEDGEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ACKNOWLEDGEMENT" element
     */
    public org.apache.xmlbeans.XmlString xgetACKNOWLEDGEMENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACKNOWLEDGEMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ACKNOWLEDGEMENT" element
     */
    public void setACKNOWLEDGEMENT(java.lang.String acknowledgement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACKNOWLEDGEMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACKNOWLEDGEMENT$0);
            }
            target.setStringValue(acknowledgement);
        }
    }
    
    /**
     * Sets (as xml) the "ACKNOWLEDGEMENT" element
     */
    public void xsetACKNOWLEDGEMENT(org.apache.xmlbeans.XmlString acknowledgement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACKNOWLEDGEMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACKNOWLEDGEMENT$0);
            }
            target.set(acknowledgement);
        }
    }
}
