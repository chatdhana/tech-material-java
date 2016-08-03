/*
 * An XML document type.
 * Localname: armCrfStatus
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ArmCrfStatusDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one armCrfStatus(@) element.
 *
 * This is a complex type.
 */
public class ArmCrfStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ArmCrfStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArmCrfStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARMCRFSTATUS$0 = 
        new javax.xml.namespace.QName("", "armCrfStatus");
    
    
    /**
     * Gets the "armCrfStatus" element
     */
    public java.lang.String getArmCrfStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCRFSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "armCrfStatus" element
     */
    public org.apache.xmlbeans.XmlString xgetArmCrfStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCRFSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "armCrfStatus" element
     */
    public void setArmCrfStatus(java.lang.String armCrfStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCRFSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMCRFSTATUS$0);
            }
            target.setStringValue(armCrfStatus);
        }
    }
    
    /**
     * Sets (as xml) the "armCrfStatus" element
     */
    public void xsetArmCrfStatus(org.apache.xmlbeans.XmlString armCrfStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCRFSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMCRFSTATUS$0);
            }
            target.set(armCrfStatus);
        }
    }
}
