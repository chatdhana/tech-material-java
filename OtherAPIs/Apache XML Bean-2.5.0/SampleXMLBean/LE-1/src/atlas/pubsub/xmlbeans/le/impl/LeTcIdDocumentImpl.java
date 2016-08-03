/*
 * An XML document type.
 * Localname: leTcId
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeTcIdDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leTcId(@) element.
 *
 * This is a complex type.
 */
public class LeTcIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeTcIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeTcIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LETCID$0 = 
        new javax.xml.namespace.QName("", "leTcId");
    
    
    /**
     * Gets the "leTcId" element
     */
    public atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId getLeTcId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId target = null;
            target = (atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId)get_store().find_element_user(LETCID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "leTcId" element
     */
    public void setLeTcId(atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId leTcId)
    {
        generatedSetterHelperImpl(leTcId, LETCID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "leTcId" element
     */
    public atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId addNewLeTcId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId target = null;
            target = (atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId)get_store().add_element_user(LETCID$0);
            return target;
        }
    }
    /**
     * An XML leTcId(@).
     *
     * This is a complex type.
     */
    public static class LeTcIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId
    {
        private static final long serialVersionUID = 1L;
        
        public LeTcIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TCIDCODE$0 = 
            new javax.xml.namespace.QName("", "tcIdCode");
        private static final javax.xml.namespace.QName STATUS$2 = 
            new javax.xml.namespace.QName("", "status");
        private static final javax.xml.namespace.QName STATUSDESC$4 = 
            new javax.xml.namespace.QName("", "statusDesc");
        private static final javax.xml.namespace.QName UPDSTATUS$6 = 
            new javax.xml.namespace.QName("", "updstatus");
        private static final javax.xml.namespace.QName VERIFIED$8 = 
            new javax.xml.namespace.QName("", "verified");
        
        
        /**
         * Gets the "tcIdCode" element
         */
        public java.lang.String getTcIdCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TCIDCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tcIdCode" element
         */
        public org.apache.xmlbeans.XmlString xgetTcIdCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TCIDCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "tcIdCode" element
         */
        public void setTcIdCode(java.lang.String tcIdCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TCIDCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TCIDCODE$0);
                }
                target.setStringValue(tcIdCode);
            }
        }
        
        /**
         * Sets (as xml) the "tcIdCode" element
         */
        public void xsetTcIdCode(org.apache.xmlbeans.XmlString tcIdCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TCIDCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TCIDCODE$0);
                }
                target.set(tcIdCode);
            }
        }
        
        /**
         * Gets the "status" element
         */
        public java.lang.String getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "status" element
         */
        public org.apache.xmlbeans.XmlString xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "status" element
         */
        public void setStatus(java.lang.String status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$2);
                }
                target.setStringValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "status" element
         */
        public void xsetStatus(org.apache.xmlbeans.XmlString status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$2);
                }
                target.set(status);
            }
        }
        
        /**
         * Gets the "statusDesc" element
         */
        public java.lang.String getStatusDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSDESC$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "statusDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetStatusDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSDESC$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "statusDesc" element
         */
        public void setStatusDesc(java.lang.String statusDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSDESC$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSDESC$4);
                }
                target.setStringValue(statusDesc);
            }
        }
        
        /**
         * Sets (as xml) the "statusDesc" element
         */
        public void xsetStatusDesc(org.apache.xmlbeans.XmlString statusDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSDESC$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSDESC$4);
                }
                target.set(statusDesc);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDSTATUS$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDSTATUS$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERIFIED$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERIFIED$8);
                }
                target.set(verified);
            }
        }
    }
}
