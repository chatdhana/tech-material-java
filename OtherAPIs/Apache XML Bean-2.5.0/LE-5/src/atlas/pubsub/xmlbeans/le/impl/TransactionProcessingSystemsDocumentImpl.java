/*
 * An XML document type.
 * Localname: transactionProcessingSystems
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one transactionProcessingSystems(@) element.
 *
 * This is a complex type.
 */
public class TransactionProcessingSystemsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransactionProcessingSystemsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONPROCESSINGSYSTEMS$0 = 
        new javax.xml.namespace.QName("", "transactionProcessingSystems");
    
    
    /**
     * Gets the "transactionProcessingSystems" element
     */
    public atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems getTransactionProcessingSystems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems target = null;
            target = (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems)get_store().find_element_user(TRANSACTIONPROCESSINGSYSTEMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "transactionProcessingSystems" element
     */
    public void setTransactionProcessingSystems(atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems transactionProcessingSystems)
    {
        generatedSetterHelperImpl(transactionProcessingSystems, TRANSACTIONPROCESSINGSYSTEMS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "transactionProcessingSystems" element
     */
    public atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems addNewTransactionProcessingSystems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems target = null;
            target = (atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems)get_store().add_element_user(TRANSACTIONPROCESSINGSYSTEMS$0);
            return target;
        }
    }
    /**
     * An XML transactionProcessingSystems(@).
     *
     * This is a complex type.
     */
    public static class TransactionProcessingSystemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.TransactionProcessingSystemsDocument.TransactionProcessingSystems
    {
        private static final long serialVersionUID = 1L;
        
        public TransactionProcessingSystemsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BKGLOCATIONCOUNTRY$0 = 
            new javax.xml.namespace.QName("", "bkgLocationCountry");
        private static final javax.xml.namespace.QName BKGLOCATIONORGANIZATION$2 = 
            new javax.xml.namespace.QName("", "bkgLocationOrganization");
        private static final javax.xml.namespace.QName EXTSYSTEMTYPENUM$4 = 
            new javax.xml.namespace.QName("", "extSystemTypeNum");
        private static final javax.xml.namespace.QName EXTSYSTEMTYPEVALUE$6 = 
            new javax.xml.namespace.QName("", "extSystemTypeValue");
        
        
        /**
         * Gets the "bkgLocationCountry" element
         */
        public java.lang.String getBkgLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONCOUNTRY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bkgLocationCountry" element
         */
        public org.apache.xmlbeans.XmlString xgetBkgLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONCOUNTRY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "bkgLocationCountry" element
         */
        public void setBkgLocationCountry(java.lang.String bkgLocationCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONCOUNTRY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BKGLOCATIONCOUNTRY$0);
                }
                target.setStringValue(bkgLocationCountry);
            }
        }
        
        /**
         * Sets (as xml) the "bkgLocationCountry" element
         */
        public void xsetBkgLocationCountry(org.apache.xmlbeans.XmlString bkgLocationCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONCOUNTRY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BKGLOCATIONCOUNTRY$0);
                }
                target.set(bkgLocationCountry);
            }
        }
        
        /**
         * Gets the "bkgLocationOrganization" element
         */
        public java.lang.String getBkgLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONORGANIZATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bkgLocationOrganization" element
         */
        public org.apache.xmlbeans.XmlString xgetBkgLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONORGANIZATION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "bkgLocationOrganization" element
         */
        public void setBkgLocationOrganization(java.lang.String bkgLocationOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BKGLOCATIONORGANIZATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BKGLOCATIONORGANIZATION$2);
                }
                target.setStringValue(bkgLocationOrganization);
            }
        }
        
        /**
         * Sets (as xml) the "bkgLocationOrganization" element
         */
        public void xsetBkgLocationOrganization(org.apache.xmlbeans.XmlString bkgLocationOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BKGLOCATIONORGANIZATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BKGLOCATIONORGANIZATION$2);
                }
                target.set(bkgLocationOrganization);
            }
        }
        
        /**
         * Gets the "extSystemTypeNum" element
         */
        public java.lang.String getExtSystemTypeNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTSYSTEMTYPENUM$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "extSystemTypeNum" element
         */
        public org.apache.xmlbeans.XmlString xgetExtSystemTypeNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTSYSTEMTYPENUM$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "extSystemTypeNum" element
         */
        public void setExtSystemTypeNum(java.lang.String extSystemTypeNum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTSYSTEMTYPENUM$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTSYSTEMTYPENUM$4);
                }
                target.setStringValue(extSystemTypeNum);
            }
        }
        
        /**
         * Sets (as xml) the "extSystemTypeNum" element
         */
        public void xsetExtSystemTypeNum(org.apache.xmlbeans.XmlString extSystemTypeNum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTSYSTEMTYPENUM$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTSYSTEMTYPENUM$4);
                }
                target.set(extSystemTypeNum);
            }
        }
        
        /**
         * Gets the "extSystemTypeValue" element
         */
        public java.lang.String getExtSystemTypeValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTSYSTEMTYPEVALUE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "extSystemTypeValue" element
         */
        public org.apache.xmlbeans.XmlString xgetExtSystemTypeValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTSYSTEMTYPEVALUE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "extSystemTypeValue" element
         */
        public void setExtSystemTypeValue(java.lang.String extSystemTypeValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTSYSTEMTYPEVALUE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTSYSTEMTYPEVALUE$6);
                }
                target.setStringValue(extSystemTypeValue);
            }
        }
        
        /**
         * Sets (as xml) the "extSystemTypeValue" element
         */
        public void xsetExtSystemTypeValue(org.apache.xmlbeans.XmlString extSystemTypeValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTSYSTEMTYPEVALUE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTSYSTEMTYPEVALUE$6);
                }
                target.set(extSystemTypeValue);
            }
        }
    }
}
