/*
 * An XML document type.
 * Localname: norDeclInd
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.NorDeclIndDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one norDeclInd(@) element.
 *
 * This is a complex type.
 */
public class NorDeclIndDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.NorDeclIndDocument
{
    private static final long serialVersionUID = 1L;
    
    public NorDeclIndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NORDECLIND$0 = 
        new javax.xml.namespace.QName("", "norDeclInd");
    
    
    /**
     * Gets the "norDeclInd" element
     */
    public java.lang.String getNorDeclInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORDECLIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "norDeclInd" element
     */
    public org.apache.xmlbeans.XmlString xgetNorDeclInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NORDECLIND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "norDeclInd" element
     */
    public void setNorDeclInd(java.lang.String norDeclInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORDECLIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NORDECLIND$0);
            }
            target.setStringValue(norDeclInd);
        }
    }
    
    /**
     * Sets (as xml) the "norDeclInd" element
     */
    public void xsetNorDeclInd(org.apache.xmlbeans.XmlString norDeclInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NORDECLIND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NORDECLIND$0);
            }
            target.set(norDeclInd);
        }
    }
}
