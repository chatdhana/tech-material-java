/*
 * An XML document type.
 * Localname: armLeCrf
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.ArmLeCrfDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one armLeCrf(@) element.
 *
 * This is a complex type.
 */
public class ArmLeCrfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ArmLeCrfDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArmLeCrfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARMLECRF$0 = 
        new javax.xml.namespace.QName("", "armLeCrf");
    
    
    /**
     * Gets the "armLeCrf" element
     */
    public atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf getArmLeCrf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf target = null;
            target = (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf)get_store().find_element_user(ARMLECRF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "armLeCrf" element
     */
    public void setArmLeCrf(atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf armLeCrf)
    {
        generatedSetterHelperImpl(armLeCrf, ARMLECRF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "armLeCrf" element
     */
    public atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf addNewArmLeCrf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf target = null;
            target = (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf)get_store().add_element_user(ARMLECRF$0);
            return target;
        }
    }
    /**
     * An XML armLeCrf(@).
     *
     * This is a complex type.
     */
    public static class ArmLeCrfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf
    {
        private static final long serialVersionUID = 1L;
        
        public ArmLeCrfImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARMCRFID$0 = 
            new javax.xml.namespace.QName("", "armCrfId");
        private static final javax.xml.namespace.QName ARMCODE$2 = 
            new javax.xml.namespace.QName("", "armCode");
        private static final javax.xml.namespace.QName ARMCRFSTATUS$4 = 
            new javax.xml.namespace.QName("", "armCrfStatus");
        private static final javax.xml.namespace.QName UPDSTATUS$6 = 
            new javax.xml.namespace.QName("", "updstatus");
        private static final javax.xml.namespace.QName VERIFIED$8 = 
            new javax.xml.namespace.QName("", "verified");
        
        
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
        
        /**
         * Gets the "armCode" element
         */
        public java.lang.String getArmCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "armCode" element
         */
        public org.apache.xmlbeans.XmlString xgetArmCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCODE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "armCode" element
         */
        public void setArmCode(java.lang.String armCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMCODE$2);
                }
                target.setStringValue(armCode);
            }
        }
        
        /**
         * Sets (as xml) the "armCode" element
         */
        public void xsetArmCode(org.apache.xmlbeans.XmlString armCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMCODE$2);
                }
                target.set(armCode);
            }
        }
        
        /**
         * Gets the "armCrfStatus" element
         */
        public java.lang.String getArmCrfStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCRFSTATUS$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCRFSTATUS$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARMCRFSTATUS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARMCRFSTATUS$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARMCRFSTATUS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARMCRFSTATUS$4);
                }
                target.set(armCrfStatus);
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
