/*
 * An XML document type.
 * Localname: omgAlertAcronym
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.OmgAlertAcronymDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one omgAlertAcronym(@) element.
 *
 * This is a complex type.
 */
public class OmgAlertAcronymDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.OmgAlertAcronymDocument
{
    private static final long serialVersionUID = 1L;
    
    public OmgAlertAcronymDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OMGALERTACRONYM$0 = 
        new javax.xml.namespace.QName("", "omgAlertAcronym");
    
    
    /**
     * Gets the "omgAlertAcronym" element
     */
    public java.lang.String getOmgAlertAcronym()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGALERTACRONYM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "omgAlertAcronym" element
     */
    public org.apache.xmlbeans.XmlString xgetOmgAlertAcronym()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGALERTACRONYM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "omgAlertAcronym" element
     */
    public void setOmgAlertAcronym(java.lang.String omgAlertAcronym)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMGALERTACRONYM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMGALERTACRONYM$0);
            }
            target.setStringValue(omgAlertAcronym);
        }
    }
    
    /**
     * Sets (as xml) the "omgAlertAcronym" element
     */
    public void xsetOmgAlertAcronym(org.apache.xmlbeans.XmlString omgAlertAcronym)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMGALERTACRONYM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMGALERTACRONYM$0);
            }
            target.set(omgAlertAcronym);
        }
    }
}
