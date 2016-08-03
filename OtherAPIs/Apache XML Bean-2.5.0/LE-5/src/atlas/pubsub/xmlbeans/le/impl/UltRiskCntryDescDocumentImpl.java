/*
 * An XML document type.
 * Localname: ultRiskCntryDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.UltRiskCntryDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one ultRiskCntryDesc(@) element.
 *
 * This is a complex type.
 */
public class UltRiskCntryDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.UltRiskCntryDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public UltRiskCntryDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ULTRISKCNTRYDESC$0 = 
        new javax.xml.namespace.QName("", "ultRiskCntryDesc");
    
    
    /**
     * Gets the "ultRiskCntryDesc" element
     */
    public java.lang.String getUltRiskCntryDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTRISKCNTRYDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ultRiskCntryDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetUltRiskCntryDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTRISKCNTRYDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ultRiskCntryDesc" element
     */
    public void setUltRiskCntryDesc(java.lang.String ultRiskCntryDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULTRISKCNTRYDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULTRISKCNTRYDESC$0);
            }
            target.setStringValue(ultRiskCntryDesc);
        }
    }
    
    /**
     * Sets (as xml) the "ultRiskCntryDesc" element
     */
    public void xsetUltRiskCntryDesc(org.apache.xmlbeans.XmlString ultRiskCntryDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULTRISKCNTRYDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULTRISKCNTRYDESC$0);
            }
            target.set(ultRiskCntryDesc);
        }
    }
}
