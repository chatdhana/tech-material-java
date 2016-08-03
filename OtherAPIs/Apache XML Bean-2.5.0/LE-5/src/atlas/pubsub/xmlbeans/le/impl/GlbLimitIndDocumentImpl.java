/*
 * An XML document type.
 * Localname: glbLimitInd
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.GlbLimitIndDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one glbLimitInd(@) element.
 *
 * This is a complex type.
 */
public class GlbLimitIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.GlbLimitIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlbLimitIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLBLIMITIND$0 = 
        new javax.xml.namespace.QName("", "glbLimitInd");
    
    
    /**
     * Gets the "glbLimitInd" element
     */
    public java.lang.String getGlbLimitInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLBLIMITIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "glbLimitInd" element
     */
    public org.apache.xmlbeans.XmlString xgetGlbLimitInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLBLIMITIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "glbLimitInd" element
     */
    public void setGlbLimitInd(java.lang.String glbLimitInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLBLIMITIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GLBLIMITIND$0);
            }
            target.setStringValue(glbLimitInd);
        }
    }
    
    /**
     * Sets (as xml) the "glbLimitInd" element
     */
    public void xsetGlbLimitInd(org.apache.xmlbeans.XmlString glbLimitInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLBLIMITIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GLBLIMITIND$0);
            }
            target.set(glbLimitInd);
        }
    }
}
