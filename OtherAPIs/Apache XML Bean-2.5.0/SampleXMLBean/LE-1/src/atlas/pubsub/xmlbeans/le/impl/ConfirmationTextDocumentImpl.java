/*
 * An XML document type.
 * Localname: confirmationText
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ConfirmationTextDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one confirmationText(@) element.
 *
 * This is a complex type.
 */
public class ConfirmationTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ConfirmationTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConfirmationTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIRMATIONTEXT$0 = 
        new javax.xml.namespace.QName("", "confirmationText");
    
    
    /**
     * Gets the "confirmationText" element
     */
    public java.lang.String getConfirmationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "confirmationText" element
     */
    public org.apache.xmlbeans.XmlString xgetConfirmationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIRMATIONTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "confirmationText" element
     */
    public void setConfirmationText(java.lang.String confirmationText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMATIONTEXT$0);
            }
            target.setStringValue(confirmationText);
        }
    }
    
    /**
     * Sets (as xml) the "confirmationText" element
     */
    public void xsetConfirmationText(org.apache.xmlbeans.XmlString confirmationText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIRMATIONTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONFIRMATIONTEXT$0);
            }
            target.set(confirmationText);
        }
    }
}
