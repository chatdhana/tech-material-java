/*
 * An XML document type.
 * Localname: mifidClntClass
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.MifidClntClassDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one mifidClntClass(@) element.
 *
 * This is a complex type.
 */
public class MifidClntClassDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.MifidClntClassDocument
{
    private static final long serialVersionUID = 1L;
    
    public MifidClntClassDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIFIDCLNTCLASS$0 = 
        new javax.xml.namespace.QName("", "mifidClntClass");
    
    
    /**
     * Gets the "mifidClntClass" element
     */
    public java.lang.String getMifidClntClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIFIDCLNTCLASS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mifidClntClass" element
     */
    public org.apache.xmlbeans.XmlString xgetMifidClntClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIFIDCLNTCLASS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mifidClntClass" element
     */
    public void setMifidClntClass(java.lang.String mifidClntClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIFIDCLNTCLASS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIFIDCLNTCLASS$0);
            }
            target.setStringValue(mifidClntClass);
        }
    }
    
    /**
     * Sets (as xml) the "mifidClntClass" element
     */
    public void xsetMifidClntClass(org.apache.xmlbeans.XmlString mifidClntClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIFIDCLNTCLASS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIFIDCLNTCLASS$0);
            }
            target.set(mifidClntClass);
        }
    }
}
