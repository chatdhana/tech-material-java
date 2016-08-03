/*
 * An XML document type.
 * Localname: scbCreditGrade
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ScbCreditGradeDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one scbCreditGrade(@) element.
 *
 * This is a complex type.
 */
public class ScbCreditGradeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ScbCreditGradeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScbCreditGradeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCBCREDITGRADE$0 = 
        new javax.xml.namespace.QName("", "scbCreditGrade");
    
    
    /**
     * Gets the "scbCreditGrade" element
     */
    public java.lang.String getScbCreditGrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBCREDITGRADE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scbCreditGrade" element
     */
    public org.apache.xmlbeans.XmlString xgetScbCreditGrade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBCREDITGRADE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scbCreditGrade" element
     */
    public void setScbCreditGrade(java.lang.String scbCreditGrade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBCREDITGRADE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBCREDITGRADE$0);
            }
            target.setStringValue(scbCreditGrade);
        }
    }
    
    /**
     * Sets (as xml) the "scbCreditGrade" element
     */
    public void xsetScbCreditGrade(org.apache.xmlbeans.XmlString scbCreditGrade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBCREDITGRADE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBCREDITGRADE$0);
            }
            target.set(scbCreditGrade);
        }
    }
}
