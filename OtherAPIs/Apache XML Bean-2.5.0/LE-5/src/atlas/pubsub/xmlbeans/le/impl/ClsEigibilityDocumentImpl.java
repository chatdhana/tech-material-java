/*
 * An XML document type.
 * Localname: clsEigibility
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ClsEigibilityDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one clsEigibility(@) element.
 *
 * This is a complex type.
 */
public class ClsEigibilityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ClsEigibilityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClsEigibilityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLSEIGIBILITY$0 = 
        new javax.xml.namespace.QName("", "clsEigibility");
    
    
    /**
     * Gets the "clsEigibility" element
     */
    public java.lang.String getClsEigibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSEIGIBILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "clsEigibility" element
     */
    public org.apache.xmlbeans.XmlString xgetClsEigibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSEIGIBILITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "clsEigibility" element
     */
    public void setClsEigibility(java.lang.String clsEigibility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSEIGIBILITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLSEIGIBILITY$0);
            }
            target.setStringValue(clsEigibility);
        }
    }
    
    /**
     * Sets (as xml) the "clsEigibility" element
     */
    public void xsetClsEigibility(org.apache.xmlbeans.XmlString clsEigibility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLSEIGIBILITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLSEIGIBILITY$0);
            }
            target.set(clsEigibility);
        }
    }
}
