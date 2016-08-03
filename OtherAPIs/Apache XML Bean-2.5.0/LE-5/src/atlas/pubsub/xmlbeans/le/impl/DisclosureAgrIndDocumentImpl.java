/*
 * An XML document type.
 * Localname: disclosureAgrInd
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.DisclosureAgrIndDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one disclosureAgrInd(@) element.
 *
 * This is a complex type.
 */
public class DisclosureAgrIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.DisclosureAgrIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisclosureAgrIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCLOSUREAGRIND$0 = 
        new javax.xml.namespace.QName("", "disclosureAgrInd");
    
    
    /**
     * Gets the "disclosureAgrInd" element
     */
    public java.lang.String getDisclosureAgrInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLOSUREAGRIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "disclosureAgrInd" element
     */
    public org.apache.xmlbeans.XmlString xgetDisclosureAgrInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLOSUREAGRIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "disclosureAgrInd" element
     */
    public void setDisclosureAgrInd(java.lang.String disclosureAgrInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCLOSUREAGRIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCLOSUREAGRIND$0);
            }
            target.setStringValue(disclosureAgrInd);
        }
    }
    
    /**
     * Sets (as xml) the "disclosureAgrInd" element
     */
    public void xsetDisclosureAgrInd(org.apache.xmlbeans.XmlString disclosureAgrInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCLOSUREAGRIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISCLOSUREAGRIND$0);
            }
            target.set(disclosureAgrInd);
        }
    }
}
