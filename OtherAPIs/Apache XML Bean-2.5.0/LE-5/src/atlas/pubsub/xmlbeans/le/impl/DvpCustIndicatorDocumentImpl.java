/*
 * An XML document type.
 * Localname: dvpCustIndicator
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.DvpCustIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one dvpCustIndicator(@) element.
 *
 * This is a complex type.
 */
public class DvpCustIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.DvpCustIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public DvpCustIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DVPCUSTINDICATOR$0 = 
        new javax.xml.namespace.QName("", "dvpCustIndicator");
    
    
    /**
     * Gets the "dvpCustIndicator" element
     */
    public java.lang.String getDvpCustIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DVPCUSTINDICATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dvpCustIndicator" element
     */
    public org.apache.xmlbeans.XmlString xgetDvpCustIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DVPCUSTINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dvpCustIndicator" element
     */
    public void setDvpCustIndicator(java.lang.String dvpCustIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DVPCUSTINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DVPCUSTINDICATOR$0);
            }
            target.setStringValue(dvpCustIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "dvpCustIndicator" element
     */
    public void xsetDvpCustIndicator(org.apache.xmlbeans.XmlString dvpCustIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DVPCUSTINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DVPCUSTINDICATOR$0);
            }
            target.set(dvpCustIndicator);
        }
    }
}
