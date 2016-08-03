/*
 * An XML document type.
 * Localname: NEGATIVE-ACKNOWLEDGEMENT
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.response.sub.impl;
/**
 * A document containing one NEGATIVE-ACKNOWLEDGEMENT(@) element.
 *
 * This is a complex type.
 */
public class NEGATIVEACKNOWLEDGEMENTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument
{
    private static final long serialVersionUID = 1L;
    
    public NEGATIVEACKNOWLEDGEMENTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEGATIVEACKNOWLEDGEMENT$0 = 
        new javax.xml.namespace.QName("", "NEGATIVE-ACKNOWLEDGEMENT");
    
    
    /**
     * Gets the "NEGATIVE-ACKNOWLEDGEMENT" element
     */
    public atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT getNEGATIVEACKNOWLEDGEMENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT target = null;
            target = (atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT)get_store().find_element_user(NEGATIVEACKNOWLEDGEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NEGATIVE-ACKNOWLEDGEMENT" element
     */
    public void setNEGATIVEACKNOWLEDGEMENT(atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT negativeacknowledgement)
    {
        generatedSetterHelperImpl(negativeacknowledgement, NEGATIVEACKNOWLEDGEMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "NEGATIVE-ACKNOWLEDGEMENT" element
     */
    public atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT addNewNEGATIVEACKNOWLEDGEMENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT target = null;
            target = (atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT)get_store().add_element_user(NEGATIVEACKNOWLEDGEMENT$0);
            return target;
        }
    }
    /**
     * An XML NEGATIVE-ACKNOWLEDGEMENT(@).
     *
     * This is a complex type.
     */
    public static class NEGATIVEACKNOWLEDGEMENTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.response.sub.NEGATIVEACKNOWLEDGEMENTDocument.NEGATIVEACKNOWLEDGEMENT
    {
        private static final long serialVersionUID = 1L;
        
        public NEGATIVEACKNOWLEDGEMENTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REASON$0 = 
            new javax.xml.namespace.QName("", "REASON");
        
        
        /**
         * Gets the "REASON" element
         */
        public java.lang.String getREASON()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "REASON" element
         */
        public org.apache.xmlbeans.XmlString xgetREASON()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "REASON" element
         */
        public void setREASON(java.lang.String reason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$0);
                }
                target.setStringValue(reason);
            }
        }
        
        /**
         * Sets (as xml) the "REASON" element
         */
        public void xsetREASON(org.apache.xmlbeans.XmlString reason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASON$0);
                }
                target.set(reason);
            }
        }
    }
}
