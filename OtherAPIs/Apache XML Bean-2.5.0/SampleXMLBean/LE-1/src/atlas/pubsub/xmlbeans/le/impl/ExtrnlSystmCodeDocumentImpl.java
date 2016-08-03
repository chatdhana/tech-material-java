/*
 * An XML document type.
 * Localname: extrnlSystmCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ExtrnlSystmCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one extrnlSystmCode(@) element.
 *
 * This is a complex type.
 */
public class ExtrnlSystmCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ExtrnlSystmCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtrnlSystmCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRNLSYSTMCODE$0 = 
        new javax.xml.namespace.QName("", "extrnlSystmCode");
    
    
    /**
     * Gets the "extrnlSystmCode" element
     */
    public java.lang.String getExtrnlSystmCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRNLSYSTMCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "extrnlSystmCode" element
     */
    public org.apache.xmlbeans.XmlString xgetExtrnlSystmCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRNLSYSTMCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "extrnlSystmCode" element
     */
    public void setExtrnlSystmCode(java.lang.String extrnlSystmCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRNLSYSTMCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRNLSYSTMCODE$0);
            }
            target.setStringValue(extrnlSystmCode);
        }
    }
    
    /**
     * Sets (as xml) the "extrnlSystmCode" element
     */
    public void xsetExtrnlSystmCode(org.apache.xmlbeans.XmlString extrnlSystmCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRNLSYSTMCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRNLSYSTMCODE$0);
            }
            target.set(extrnlSystmCode);
        }
    }
}
