/*
 * An XML document type.
 * Localname: leSysContact
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeSysContactDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leSysContact(@) element.
 *
 * This is a complex type.
 */
public class LeSysContactDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeSysContactDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeSysContactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LESYSCONTACT$0 = 
        new javax.xml.namespace.QName("", "leSysContact");
    
    
    /**
     * Gets the "leSysContact" element
     */
    public atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact getLeSysContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact target = null;
            target = (atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact)get_store().find_element_user(LESYSCONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "leSysContact" element
     */
    public void setLeSysContact(atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact leSysContact)
    {
        generatedSetterHelperImpl(leSysContact, LESYSCONTACT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "leSysContact" element
     */
    public atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact addNewLeSysContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact target = null;
            target = (atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact)get_store().add_element_user(LESYSCONTACT$0);
            return target;
        }
    }
    /**
     * An XML leSysContact(@).
     *
     * This is a complex type.
     */
    public static class LeSysContactImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact
    {
        private static final long serialVersionUID = 1L;
        
        public LeSysContactImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MEDIUMCODE$0 = 
            new javax.xml.namespace.QName("", "mediumCode");
        private static final javax.xml.namespace.QName MEDIUMCODEDESC$2 = 
            new javax.xml.namespace.QName("", "mediumCodeDesc");
        private static final javax.xml.namespace.QName MEDIUMUSAGE$4 = 
            new javax.xml.namespace.QName("", "mediumUsage");
        private static final javax.xml.namespace.QName MEDIUMUSAGEDESC$6 = 
            new javax.xml.namespace.QName("", "mediumUsageDesc");
        private static final javax.xml.namespace.QName ADDRLINE$8 = 
            new javax.xml.namespace.QName("", "addrLine");
        private static final javax.xml.namespace.QName LESYSCONID$10 = 
            new javax.xml.namespace.QName("", "leSysConId");
        private static final javax.xml.namespace.QName CONFIRMATIONTEXT$12 = 
            new javax.xml.namespace.QName("", "confirmationText");
        private static final javax.xml.namespace.QName DESCRIPTION$14 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName UPDSTATUS$16 = 
            new javax.xml.namespace.QName("", "updstatus");
        private static final javax.xml.namespace.QName VERIFIED$18 = 
            new javax.xml.namespace.QName("", "verified");
        
        
        /**
         * Gets the "mediumCode" element
         */
        public java.lang.String getMediumCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mediumCode" element
         */
        public org.apache.xmlbeans.XmlString xgetMediumCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "mediumCode" element
         */
        public void setMediumCode(java.lang.String mediumCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIUMCODE$0);
                }
                target.setStringValue(mediumCode);
            }
        }
        
        /**
         * Sets (as xml) the "mediumCode" element
         */
        public void xsetMediumCode(org.apache.xmlbeans.XmlString mediumCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIUMCODE$0);
                }
                target.set(mediumCode);
            }
        }
        
        /**
         * Gets the "mediumCodeDesc" element
         */
        public java.lang.String getMediumCodeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMCODEDESC$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mediumCodeDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetMediumCodeDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMCODEDESC$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "mediumCodeDesc" element
         */
        public void setMediumCodeDesc(java.lang.String mediumCodeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMCODEDESC$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIUMCODEDESC$2);
                }
                target.setStringValue(mediumCodeDesc);
            }
        }
        
        /**
         * Sets (as xml) the "mediumCodeDesc" element
         */
        public void xsetMediumCodeDesc(org.apache.xmlbeans.XmlString mediumCodeDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMCODEDESC$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIUMCODEDESC$2);
                }
                target.set(mediumCodeDesc);
            }
        }
        
        /**
         * Gets the "mediumUsage" element
         */
        public java.lang.String getMediumUsage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMUSAGE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mediumUsage" element
         */
        public org.apache.xmlbeans.XmlString xgetMediumUsage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMUSAGE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "mediumUsage" element
         */
        public void setMediumUsage(java.lang.String mediumUsage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMUSAGE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIUMUSAGE$4);
                }
                target.setStringValue(mediumUsage);
            }
        }
        
        /**
         * Sets (as xml) the "mediumUsage" element
         */
        public void xsetMediumUsage(org.apache.xmlbeans.XmlString mediumUsage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMUSAGE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIUMUSAGE$4);
                }
                target.set(mediumUsage);
            }
        }
        
        /**
         * Gets the "mediumUsageDesc" element
         */
        public java.lang.String getMediumUsageDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMUSAGEDESC$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mediumUsageDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetMediumUsageDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMUSAGEDESC$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "mediumUsageDesc" element
         */
        public void setMediumUsageDesc(java.lang.String mediumUsageDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUMUSAGEDESC$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIUMUSAGEDESC$6);
                }
                target.setStringValue(mediumUsageDesc);
            }
        }
        
        /**
         * Sets (as xml) the "mediumUsageDesc" element
         */
        public void xsetMediumUsageDesc(org.apache.xmlbeans.XmlString mediumUsageDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUMUSAGEDESC$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIUMUSAGEDESC$6);
                }
                target.set(mediumUsageDesc);
            }
        }
        
        /**
         * Gets the "addrLine" element
         */
        public java.lang.String getAddrLine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addrLine" element
         */
        public org.apache.xmlbeans.XmlString xgetAddrLine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "addrLine" element
         */
        public void setAddrLine(java.lang.String addrLine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRLINE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRLINE$8);
                }
                target.setStringValue(addrLine);
            }
        }
        
        /**
         * Sets (as xml) the "addrLine" element
         */
        public void xsetAddrLine(org.apache.xmlbeans.XmlString addrLine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRLINE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRLINE$8);
                }
                target.set(addrLine);
            }
        }
        
        /**
         * Gets the "leSysConId" element
         */
        public java.lang.String getLeSysConId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESYSCONID$10, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESYSCONID$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LESYSCONID$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LESYSCONID$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LESYSCONID$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LESYSCONID$10);
                }
                target.set(leSysConId);
            }
        }
        
        /**
         * Gets the "confirmationText" element
         */
        public java.lang.String getConfirmationText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONTEXT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "confirmationText" element
         */
        public org.apache.xmlbeans.XmlString xgetConfirmationText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIRMATIONTEXT$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "confirmationText" element
         */
        public void setConfirmationText(java.lang.String confirmationText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONTEXT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMATIONTEXT$12);
                }
                target.setStringValue(confirmationText);
            }
        }
        
        /**
         * Sets (as xml) the "confirmationText" element
         */
        public void xsetConfirmationText(org.apache.xmlbeans.XmlString confirmationText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIRMATIONTEXT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONFIRMATIONTEXT$12);
                }
                target.set(confirmationText);
            }
        }
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$14);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$14);
                }
                target.set(description);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$16, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDSTATUS$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDSTATUS$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$18, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$18, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERIFIED$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERIFIED$18);
                }
                target.set(verified);
            }
        }
    }
}
