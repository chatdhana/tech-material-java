/*
 * An XML document type.
 * Localname: atlasMessage
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.AtlasMessageDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one atlasMessage(@) element.
 *
 * This is a complex type.
 */
public class AtlasMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.AtlasMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public AtlasMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATLASMESSAGE$0 = 
        new javax.xml.namespace.QName("", "atlasMessage");
    
    
    /**
     * Gets the "atlasMessage" element
     */
    public atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage getAtlasMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage target = null;
            target = (atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage)get_store().find_element_user(ATLASMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "atlasMessage" element
     */
    public void setAtlasMessage(atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage atlasMessage)
    {
        generatedSetterHelperImpl(atlasMessage, ATLASMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "atlasMessage" element
     */
    public atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage addNewAtlasMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage target = null;
            target = (atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage)get_store().add_element_user(ATLASMESSAGE$0);
            return target;
        }
    }
    /**
     * An XML atlasMessage(@).
     *
     * This is a complex type.
     */
    public static class AtlasMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.AtlasMessageDocument.AtlasMessage
    {
        private static final long serialVersionUID = 1L;
        
        public AtlasMessageImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGE$0 = 
            new javax.xml.namespace.QName("", "message");
        private static final javax.xml.namespace.QName HEADER$2 = 
            new javax.xml.namespace.QName("", "header");
        private static final javax.xml.namespace.QName LEID$4 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName LEINFO$6 = 
            new javax.xml.namespace.QName("", "leInfo");
        private static final javax.xml.namespace.QName LESYSCONTACT$8 = 
            new javax.xml.namespace.QName("", "leSysContact");
        private static final javax.xml.namespace.QName LEALTSYSCONTACT$10 = 
            new javax.xml.namespace.QName("", "leAltSysContact");
        private static final javax.xml.namespace.QName LETCID$12 = 
            new javax.xml.namespace.QName("", "leTcId");
        private static final javax.xml.namespace.QName LEADDRESS$14 = 
            new javax.xml.namespace.QName("", "leAddress");
        private static final javax.xml.namespace.QName LEALTADDRESS$16 = 
            new javax.xml.namespace.QName("", "leAltAddress");
        private static final javax.xml.namespace.QName COUNTERPARTYXREF$18 = 
            new javax.xml.namespace.QName("", "counterpartyXref");
        private static final javax.xml.namespace.QName ARMLECRF$20 = 
            new javax.xml.namespace.QName("", "armLeCrf");
        private static final javax.xml.namespace.QName LEBRANCHDETAILS$22 = 
            new javax.xml.namespace.QName("", "leBranchDetails");
        
        
        /**
         * Gets the "message" element
         */
        public atlas.pubsub.xmlbeans.le.MessageDocument.Message getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.MessageDocument.Message target = null;
                target = (atlas.pubsub.xmlbeans.le.MessageDocument.Message)get_store().find_element_user(MESSAGE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "message" element
         */
        public void setMessage(atlas.pubsub.xmlbeans.le.MessageDocument.Message message)
        {
            generatedSetterHelperImpl(message, MESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "message" element
         */
        public atlas.pubsub.xmlbeans.le.MessageDocument.Message addNewMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.MessageDocument.Message target = null;
                target = (atlas.pubsub.xmlbeans.le.MessageDocument.Message)get_store().add_element_user(MESSAGE$0);
                return target;
            }
        }
        
        /**
         * Gets the "header" element
         */
        public atlas.pubsub.xmlbeans.le.HeaderDocument.Header getHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.HeaderDocument.Header target = null;
                target = (atlas.pubsub.xmlbeans.le.HeaderDocument.Header)get_store().find_element_user(HEADER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "header" element
         */
        public void setHeader(atlas.pubsub.xmlbeans.le.HeaderDocument.Header header)
        {
            generatedSetterHelperImpl(header, HEADER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "header" element
         */
        public atlas.pubsub.xmlbeans.le.HeaderDocument.Header addNewHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.HeaderDocument.Header target = null;
                target = (atlas.pubsub.xmlbeans.le.HeaderDocument.Header)get_store().add_element_user(HEADER$2);
                return target;
            }
        }
        
        /**
         * Gets the "leId" element
         */
        public java.lang.String getLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leId" element
         */
        public org.apache.xmlbeans.XmlString xgetLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leId" element
         */
        public void setLeId(java.lang.String leId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEID$4);
                }
                target.setStringValue(leId);
            }
        }
        
        /**
         * Sets (as xml) the "leId" element
         */
        public void xsetLeId(org.apache.xmlbeans.XmlString leId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEID$4);
                }
                target.set(leId);
            }
        }
        
        /**
         * Gets the "leInfo" element
         */
        public atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo getLeInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo)get_store().find_element_user(LEINFO$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "leInfo" element
         */
        public void setLeInfo(atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo leInfo)
        {
            generatedSetterHelperImpl(leInfo, LEINFO$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "leInfo" element
         */
        public atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo addNewLeInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeInfoDocument.LeInfo)get_store().add_element_user(LEINFO$6);
                return target;
            }
        }
        
        /**
         * Gets the "leSysContact" element
         */
        public atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact getLeSysContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact target = null;
                target = (atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact)get_store().find_element_user(LESYSCONTACT$8, 0);
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
            generatedSetterHelperImpl(leSysContact, LESYSCONTACT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact)get_store().add_element_user(LESYSCONTACT$8);
                return target;
            }
        }
        
        /**
         * Gets the "leAltSysContact" element
         */
        public atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact getLeAltSysContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact)get_store().find_element_user(LEALTSYSCONTACT$10, 0);
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
            generatedSetterHelperImpl(leAltSysContact, LEALTSYSCONTACT$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact)get_store().add_element_user(LEALTSYSCONTACT$10);
                return target;
            }
        }
        
        /**
         * Gets the "leTcId" element
         */
        public atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId getLeTcId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId target = null;
                target = (atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId)get_store().find_element_user(LETCID$12, 0);
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
            generatedSetterHelperImpl(leTcId, LETCID$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId)get_store().add_element_user(LETCID$12);
                return target;
            }
        }
        
        /**
         * Gets the "leAddress" element
         */
        public atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress getLeAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress)get_store().find_element_user(LEADDRESS$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "leAddress" element
         */
        public void setLeAddress(atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress leAddress)
        {
            generatedSetterHelperImpl(leAddress, LEADDRESS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "leAddress" element
         */
        public atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress addNewLeAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress)get_store().add_element_user(LEADDRESS$14);
                return target;
            }
        }
        
        /**
         * Gets the "leAltAddress" element
         */
        public atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress getLeAltAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress)get_store().find_element_user(LEALTADDRESS$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "leAltAddress" element
         */
        public void setLeAltAddress(atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress leAltAddress)
        {
            generatedSetterHelperImpl(leAltAddress, LEALTADDRESS$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "leAltAddress" element
         */
        public atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress addNewLeAltAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress)get_store().add_element_user(LEALTADDRESS$16);
                return target;
            }
        }
        
        /**
         * Gets a List of "counterpartyXref" elements
         */
        public java.util.List<atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref> getCounterpartyXrefList()
        {
            final class CounterpartyXrefList extends java.util.AbstractList<atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref>
            {
                @Override
                public atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref get(int i)
                    { return AtlasMessageImpl.this.getCounterpartyXrefArray(i); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref set(int i, atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref o)
                {
                    atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref old = AtlasMessageImpl.this.getCounterpartyXrefArray(i);
                    AtlasMessageImpl.this.setCounterpartyXrefArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref o)
                    { AtlasMessageImpl.this.insertNewCounterpartyXref(i).set(o); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref remove(int i)
                {
                    atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref old = AtlasMessageImpl.this.getCounterpartyXrefArray(i);
                    AtlasMessageImpl.this.removeCounterpartyXref(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return AtlasMessageImpl.this.sizeOfCounterpartyXrefArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CounterpartyXrefList();
            }
        }
        
        /**
         * Gets array of all "counterpartyXref" elements
         * @deprecated
         */
        @Deprecated
        public atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref[] getCounterpartyXrefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref> targetList = new java.util.ArrayList<atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref>();
                get_store().find_all_element_users(COUNTERPARTYXREF$18, targetList);
                atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref[] result = new atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "counterpartyXref" element
         */
        public atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref getCounterpartyXrefArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref target = null;
                target = (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref)get_store().find_element_user(COUNTERPARTYXREF$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "counterpartyXref" element
         */
        public int sizeOfCounterpartyXrefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COUNTERPARTYXREF$18);
            }
        }
        
        /**
         * Sets array of all "counterpartyXref" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCounterpartyXrefArray(atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref[] counterpartyXrefArray)
        {
            check_orphaned();
            arraySetterHelper(counterpartyXrefArray, COUNTERPARTYXREF$18);
        }
        
        /**
         * Sets ith "counterpartyXref" element
         */
        public void setCounterpartyXrefArray(int i, atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref counterpartyXref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref target = null;
                target = (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref)get_store().find_element_user(COUNTERPARTYXREF$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(counterpartyXref);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "counterpartyXref" element
         */
        public atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref insertNewCounterpartyXref(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref target = null;
                target = (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref)get_store().insert_element_user(COUNTERPARTYXREF$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "counterpartyXref" element
         */
        public atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref addNewCounterpartyXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref target = null;
                target = (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref)get_store().add_element_user(COUNTERPARTYXREF$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "counterpartyXref" element
         */
        public void removeCounterpartyXref(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COUNTERPARTYXREF$18, i);
            }
        }
        
        /**
         * Gets the "armLeCrf" element
         */
        public atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf getArmLeCrf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf target = null;
                target = (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf)get_store().find_element_user(ARMLECRF$20, 0);
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
            generatedSetterHelperImpl(armLeCrf, ARMLECRF$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (atlas.pubsub.xmlbeans.le.ArmLeCrfDocument.ArmLeCrf)get_store().add_element_user(ARMLECRF$20);
                return target;
            }
        }
        
        /**
         * Gets the "leBranchDetails" element
         */
        public atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails getLeBranchDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails target = null;
                target = (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails)get_store().find_element_user(LEBRANCHDETAILS$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "leBranchDetails" element
         */
        public void setLeBranchDetails(atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails leBranchDetails)
        {
            generatedSetterHelperImpl(leBranchDetails, LEBRANCHDETAILS$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "leBranchDetails" element
         */
        public atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails addNewLeBranchDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails target = null;
                target = (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails)get_store().add_element_user(LEBRANCHDETAILS$22);
                return target;
            }
        }
    }
}
