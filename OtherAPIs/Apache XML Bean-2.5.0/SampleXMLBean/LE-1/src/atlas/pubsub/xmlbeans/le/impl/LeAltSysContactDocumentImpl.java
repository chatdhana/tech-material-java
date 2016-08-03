/*
 * An XML document type.
 * Localname: leAltSysContact
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeAltSysContactDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leAltSysContact(@) element.
 *
 * This is a complex type.
 */
public class LeAltSysContactDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeAltSysContactDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeAltSysContactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEALTSYSCONTACT$0 = 
        new javax.xml.namespace.QName("", "leAltSysContact");
    
    
    /**
     * Gets the "leAltSysContact" element
     */
    public atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact getLeAltSysContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact target = null;
            target = (atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact)get_store().find_element_user(LEALTSYSCONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "leAltSysContact" element
     */
    public void setLeAltSysContact(atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact leAltSysContact)
    {
        generatedSetterHelperImpl(leAltSysContact, LEALTSYSCONTACT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "leAltSysContact" element
     */
    public atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact addNewLeAltSysContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact target = null;
            target = (atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact)get_store().add_element_user(LEALTSYSCONTACT$0);
            return target;
        }
    }
    /**
     * An XML leAltSysContact(@).
     *
     * This is a complex type.
     */
    public static class LeAltSysContactImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact
    {
        private static final long serialVersionUID = 1L;
        
        public LeAltSysContactImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LESYSCONID$0 = 
            new javax.xml.namespace.QName("", "leSysConId");
        private static final javax.xml.namespace.QName SCBLEID$2 = 
            new javax.xml.namespace.QName("", "scbLeId");
        private static final javax.xml.namespace.QName PRODUCT$4 = 
            new javax.xml.namespace.QName("", "product");
        private static final javax.xml.namespace.QName PRODUCTTYPE$6 = 
            new javax.xml.namespace.QName("", "productType");
        private static final javax.xml.namespace.QName UPDSTATUS$8 = 
            new javax.xml.namespace.QName("", "updstatus");
        private static final javax.xml.namespace.QName VERIFIED$10 = 
            new javax.xml.namespace.QName("", "verified");
        
        
        /**
         * Gets the "leSysConId" element
         */
        public java.lang.String getLeSysConId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESYSCONID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leSysConId" element
         */
        public org.apache.xmlbeans.XmlString xgetLeSysConId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESYSCONID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leSysConId" element
         */
        public void setLeSysConId(java.lang.String leSysConId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESYSCONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LESYSCONID$0);
                }
                target.setStringValue(leSysConId);
            }
        }
        
        /**
         * Sets (as xml) the "leSysConId" element
         */
        public void xsetLeSysConId(org.apache.xmlbeans.XmlString leSysConId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESYSCONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LESYSCONID$0);
                }
                target.set(leSysConId);
            }
        }
        
        /**
         * Gets the "scbLeId" element
         */
        public java.lang.String getScbLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBLEID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "scbLeId" element
         */
        public org.apache.xmlbeans.XmlString xgetScbLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBLEID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "scbLeId" element
         */
        public void setScbLeId(java.lang.String scbLeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBLEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBLEID$2);
                }
                target.setStringValue(scbLeId);
            }
        }
        
        /**
         * Sets (as xml) the "scbLeId" element
         */
        public void xsetScbLeId(org.apache.xmlbeans.XmlString scbLeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBLEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBLEID$2);
                }
                target.set(scbLeId);
            }
        }
        
        /**
         * Gets the "product" element
         */
        public java.lang.String getProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "product" element
         */
        public org.apache.xmlbeans.XmlString xgetProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "product" element
         */
        public void setProduct(java.lang.String product)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCT$4);
                }
                target.setStringValue(product);
            }
        }
        
        /**
         * Sets (as xml) the "product" element
         */
        public void xsetProduct(org.apache.xmlbeans.XmlString product)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCT$4);
                }
                target.set(product);
            }
        }
        
        /**
         * Gets the "productType" element
         */
        public java.lang.String getProductType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "productType" element
         */
        public org.apache.xmlbeans.XmlString xgetProductType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "productType" element
         */
        public void setProductType(java.lang.String productType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPE$6);
                }
                target.setStringValue(productType);
            }
        }
        
        /**
         * Sets (as xml) the "productType" element
         */
        public void xsetProductType(org.apache.xmlbeans.XmlString productType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTTYPE$6);
                }
                target.set(productType);
            }
        }
        
        /**
         * Gets the "updstatus" element
         */
        public java.lang.String getUpdstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "updstatus" element
         */
        public org.apache.xmlbeans.XmlString xgetUpdstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "updstatus" element
         */
        public void setUpdstatus(java.lang.String updstatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDSTATUS$8);
                }
                target.setStringValue(updstatus);
            }
        }
        
        /**
         * Sets (as xml) the "updstatus" element
         */
        public void xsetUpdstatus(org.apache.xmlbeans.XmlString updstatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDSTATUS$8);
                }
                target.set(updstatus);
            }
        }
        
        /**
         * Gets the "verified" element
         */
        public java.lang.String getVerified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "verified" element
         */
        public org.apache.xmlbeans.XmlString xgetVerified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "verified" element
         */
        public void setVerified(java.lang.String verified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERIFIED$10);
                }
                target.setStringValue(verified);
            }
        }
        
        /**
         * Sets (as xml) the "verified" element
         */
        public void xsetVerified(org.apache.xmlbeans.XmlString verified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERIFIED$10);
                }
                target.set(verified);
            }
        }
    }
}
