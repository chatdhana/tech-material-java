/*
 * An XML document type.
 * Localname: armCrfId
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ArmCrfIdDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one armCrfId(@) element.
 *
 * This is a complex type.
 */
public class ArmCrfIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ArmCrfIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArmCrfIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARMCRFID$0 = 
        new javax.xml.namespace.QName("", "armCrfId");
    
    
    /**
     * Gets the "armCrfId" element
     */
    public java.lang.String getArmCrfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCRFID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "armCrfId" element
     */
    public org.apache.xmlbeans.XmlString xgetArmCrfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCRFID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "armCrfId" element
     */
    public void setArmCrfId(java.lang.String armCrfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCRFID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMCRFID$0);
            }
            target.setStringValue(armCrfId);
        }
    }
    
    /**
     * Sets (as xml) the "armCrfId" element
     */
    public void xsetArmCrfId(org.apache.xmlbeans.XmlString armCrfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCRFID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMCRFID$0);
            }
            target.set(armCrfId);
        }
    }
}
