/*
 * An XML document type.
 * Localname: productType
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ProductTypeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one productType(@) element.
 *
 * This is a complex type.
 */
public class ProductTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ProductTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTTYPE$0 = 
        new javax.xml.namespace.QName("", "productType");
    
    
    /**
     * Gets the "productType" element
     */
    public java.lang.String getProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productType" element
     */
    public org.apache.xmlbeans.XmlString xgetProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productType" element
     */
    public void setProductType(java.lang.String productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPE$0);
            }
            target.setStringValue(productType);
        }
    }
    
    /**
     * Sets (as xml) the "productType" element
     */
    public void xsetProductType(org.apache.xmlbeans.XmlString productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTTYPE$0);
            }
            target.set(productType);
        }
    }
}
