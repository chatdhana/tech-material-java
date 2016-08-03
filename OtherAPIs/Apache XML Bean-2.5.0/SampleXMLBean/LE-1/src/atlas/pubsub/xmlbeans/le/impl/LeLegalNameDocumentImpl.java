/*
 * An XML document type.
 * Localname: leLegalName
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeLegalNameDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leLegalName(@) element.
 *
 * This is a complex type.
 */
public class LeLegalNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeLegalNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeLegalNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LELEGALNAME$0 = 
        new javax.xml.namespace.QName("", "leLegalName");
    
    
    /**
     * Gets the "leLegalName" element
     */
    public java.lang.String getLeLegalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELEGALNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leLegalName" element
     */
    public org.apache.xmlbeans.XmlString xgetLeLegalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELEGALNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leLegalName" element
     */
    public void setLeLegalName(java.lang.String leLegalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELEGALNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LELEGALNAME$0);
            }
            target.setStringValue(leLegalName);
        }
    }
    
    /**
     * Sets (as xml) the "leLegalName" element
     */
    public void xsetLeLegalName(org.apache.xmlbeans.XmlString leLegalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELEGALNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LELEGALNAME$0);
            }
            target.set(leLegalName);
        }
    }
}
