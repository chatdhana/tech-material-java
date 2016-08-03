/*
 * An XML document type.
 * Localname: leLegalName1
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeLegalName1Document
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leLegalName1(@) element.
 *
 * This is a complex type.
 */
public class LeLegalName1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeLegalName1Document
{
    private static final long serialVersionUID = 1L;
    
    public LeLegalName1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LELEGALNAME1$0 = 
        new javax.xml.namespace.QName("", "leLegalName1");
    
    
    /**
     * Gets the "leLegalName1" element
     */
    public java.lang.String getLeLegalName1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELEGALNAME1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leLegalName1" element
     */
    public org.apache.xmlbeans.XmlString xgetLeLegalName1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELEGALNAME1$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leLegalName1" element
     */
    public void setLeLegalName1(java.lang.String leLegalName1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LELEGALNAME1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LELEGALNAME1$0);
            }
            target.setStringValue(leLegalName1);
        }
    }
    
    /**
     * Sets (as xml) the "leLegalName1" element
     */
    public void xsetLeLegalName1(org.apache.xmlbeans.XmlString leLegalName1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LELEGALNAME1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LELEGALNAME1$0);
            }
            target.set(leLegalName1);
        }
    }
}
