/*
 * An XML document type.
 * Localname: partyXrefCode
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.PartyXrefCodeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one partyXrefCode(@) element.
 *
 * This is a complex type.
 */
public class PartyXrefCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.PartyXrefCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public PartyXrefCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTYXREFCODE$0 = 
        new javax.xml.namespace.QName("", "partyXrefCode");
    
    
    /**
     * Gets the "partyXrefCode" element
     */
    public java.lang.String getPartyXrefCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTYXREFCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "partyXrefCode" element
     */
    public org.apache.xmlbeans.XmlString xgetPartyXrefCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTYXREFCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "partyXrefCode" element
     */
    public void setPartyXrefCode(java.lang.String partyXrefCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTYXREFCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTYXREFCODE$0);
            }
            target.setStringValue(partyXrefCode);
        }
    }
    
    /**
     * Sets (as xml) the "partyXrefCode" element
     */
    public void xsetPartyXrefCode(org.apache.xmlbeans.XmlString partyXrefCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTYXREFCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTYXREFCODE$0);
            }
            target.set(partyXrefCode);
        }
    }
}
