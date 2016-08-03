/*
 * An XML document type.
 * Localname: scbCreditGradeDesc
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ScbCreditGradeDescDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one scbCreditGradeDesc(@) element.
 *
 * This is a complex type.
 */
public class ScbCreditGradeDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ScbCreditGradeDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScbCreditGradeDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCBCREDITGRADEDESC$0 = 
        new javax.xml.namespace.QName("", "scbCreditGradeDesc");
    
    
    /**
     * Gets the "scbCreditGradeDesc" element
     */
    public java.lang.String getScbCreditGradeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBCREDITGRADEDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scbCreditGradeDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetScbCreditGradeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBCREDITGRADEDESC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scbCreditGradeDesc" element
     */
    public void setScbCreditGradeDesc(java.lang.String scbCreditGradeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBCREDITGRADEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBCREDITGRADEDESC$0);
            }
            target.setStringValue(scbCreditGradeDesc);
        }
    }
    
    /**
     * Sets (as xml) the "scbCreditGradeDesc" element
     */
    public void xsetScbCreditGradeDesc(org.apache.xmlbeans.XmlString scbCreditGradeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBCREDITGRADEDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBCREDITGRADEDESC$0);
            }
            target.set(scbCreditGradeDesc);
        }
    }
}
