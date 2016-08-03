/*
 * An XML document type.
 * Localname: markitWireId
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.MarkitWireIdDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one markitWireId(@) element.
 *
 * This is a complex type.
 */
public class MarkitWireIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.MarkitWireIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public MarkitWireIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MARKITWIREID$0 = 
        new javax.xml.namespace.QName("", "markitWireId");
    
    
    /**
     * Gets the "markitWireId" element
     */
    public java.lang.String getMarkitWireId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKITWIREID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "markitWireId" element
     */
    public org.apache.xmlbeans.XmlString xgetMarkitWireId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MARKITWIREID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "markitWireId" element
     */
    public void setMarkitWireId(java.lang.String markitWireId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKITWIREID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MARKITWIREID$0);
            }
            target.setStringValue(markitWireId);
        }
    }
    
    /**
     * Sets (as xml) the "markitWireId" element
     */
    public void xsetMarkitWireId(org.apache.xmlbeans.XmlString markitWireId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MARKITWIREID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MARKITWIREID$0);
            }
            target.set(markitWireId);
        }
    }
}
