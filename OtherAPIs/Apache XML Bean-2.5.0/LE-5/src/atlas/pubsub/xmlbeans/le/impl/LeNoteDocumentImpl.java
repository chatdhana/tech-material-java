/*
 * An XML document type.
 * Localname: leNote
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeNoteDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leNote(@) element.
 *
 * This is a complex type.
 */
public class LeNoteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeNoteDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeNoteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LENOTE$0 = 
        new javax.xml.namespace.QName("", "leNote");
    
    
    /**
     * Gets the "leNote" element
     */
    public java.lang.String getLeNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENOTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "leNote" element
     */
    public org.apache.xmlbeans.XmlString xgetLeNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LENOTE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leNote" element
     */
    public void setLeNote(java.lang.String leNote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LENOTE$0);
            }
            target.setStringValue(leNote);
        }
    }
    
    /**
     * Sets (as xml) the "leNote" element
     */
    public void xsetLeNote(org.apache.xmlbeans.XmlString leNote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LENOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LENOTE$0);
            }
            target.set(leNote);
        }
    }
}
