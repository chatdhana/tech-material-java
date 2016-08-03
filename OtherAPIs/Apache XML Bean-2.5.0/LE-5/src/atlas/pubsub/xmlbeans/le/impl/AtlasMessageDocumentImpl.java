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
        private static final javax.xml.namespace.QName LEHIERARCHYDETAILS$24 = 
            new javax.xml.namespace.QName("", "leHierarchyDetails");
        
        
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
         * Gets a List of "leSysContact" elements
         */
        public java.util.List<atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact> getLeSysContactList()
        {
            final class LeSysContactList extends java.util.AbstractList<atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact>
            {
                @Override
                public atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact get(int i)
                    { return AtlasMessageImpl.this.getLeSysContactArray(i); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact set(int i, atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact o)
                {
                    atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact old = AtlasMessageImpl.this.getLeSysContactArray(i);
                    AtlasMessageImpl.this.setLeSysContactArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact o)
                    { AtlasMessageImpl.this.insertNewLeSysContact(i).set(o); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact remove(int i)
                {
                    atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact old = AtlasMessageImpl.this.getLeSysContactArray(i);
                    AtlasMessageImpl.this.removeLeSysContact(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return AtlasMessageImpl.this.sizeOfLeSysContactArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LeSysContactList();
            }
        }
        
        /**
         * Gets array of all "leSysContact" elements
         * @deprecated
         */
        @Deprecated
        public atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact[] getLeSysContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact> targetList = new java.util.ArrayList<atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact>();
                get_store().find_all_element_users(LESYSCONTACT$8, targetList);
                atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact[] result = new atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "leSysContact" element
         */
        public atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact getLeSysContactArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact target = null;
                target = (atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact)get_store().find_element_user(LESYSCONTACT$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "leSysContact" element
         */
        public int sizeOfLeSysContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LESYSCONTACT$8);
            }
        }
        
        /**
         * Sets array of all "leSysContact" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLeSysContactArray(atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact[] leSysContactArray)
        {
            check_orphaned();
            arraySetterHelper(leSysContactArray, LESYSCONTACT$8);
        }
        
        /**
         * Sets ith "leSysContact" element
         */
        public void setLeSysContactArray(int i, atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact leSysContact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact target = null;
                target = (atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact)get_store().find_element_user(LESYSCONTACT$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(leSysContact);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leSysContact" element
         */
        public atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact insertNewLeSysContact(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact target = null;
                target = (atlas.pubsub.xmlbeans.le.LeSysContactDocument.LeSysContact)get_store().insert_element_user(LESYSCONTACT$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leSysContact" element
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
         * Removes the ith "leSysContact" element
         */
        public void removeLeSysContact(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LESYSCONTACT$8, i);
            }
        }
        
        /**
         * Gets a List of "leAltSysContact" elements
         */
        public java.util.List<atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact> getLeAltSysContactList()
        {
            final class LeAltSysContactList extends java.util.AbstractList<atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact>
            {
                @Override
                public atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact get(int i)
                    { return AtlasMessageImpl.this.getLeAltSysContactArray(i); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact set(int i, atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact o)
                {
                    atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact old = AtlasMessageImpl.this.getLeAltSysContactArray(i);
                    AtlasMessageImpl.this.setLeAltSysContactArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact o)
                    { AtlasMessageImpl.this.insertNewLeAltSysContact(i).set(o); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact remove(int i)
                {
                    atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact old = AtlasMessageImpl.this.getLeAltSysContactArray(i);
                    AtlasMessageImpl.this.removeLeAltSysContact(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return AtlasMessageImpl.this.sizeOfLeAltSysContactArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LeAltSysContactList();
            }
        }
        
        /**
         * Gets array of all "leAltSysContact" elements
         * @deprecated
         */
        @Deprecated
        public atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact[] getLeAltSysContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact> targetList = new java.util.ArrayList<atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact>();
                get_store().find_all_element_users(LEALTSYSCONTACT$10, targetList);
                atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact[] result = new atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "leAltSysContact" element
         */
        public atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact getLeAltSysContactArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact)get_store().find_element_user(LEALTSYSCONTACT$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "leAltSysContact" element
         */
        public int sizeOfLeAltSysContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEALTSYSCONTACT$10);
            }
        }
        
        /**
         * Sets array of all "leAltSysContact" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLeAltSysContactArray(atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact[] leAltSysContactArray)
        {
            check_orphaned();
            arraySetterHelper(leAltSysContactArray, LEALTSYSCONTACT$10);
        }
        
        /**
         * Sets ith "leAltSysContact" element
         */
        public void setLeAltSysContactArray(int i, atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact leAltSysContact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact)get_store().find_element_user(LEALTSYSCONTACT$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(leAltSysContact);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leAltSysContact" element
         */
        public atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact insertNewLeAltSysContact(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAltSysContactDocument.LeAltSysContact)get_store().insert_element_user(LEALTSYSCONTACT$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leAltSysContact" element
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
         * Removes the ith "leAltSysContact" element
         */
        public void removeLeAltSysContact(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEALTSYSCONTACT$10, i);
            }
        }
        
        /**
         * Gets a List of "leTcId" elements
         */
        public java.util.List<atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId> getLeTcIdList()
        {
            final class LeTcIdList extends java.util.AbstractList<atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId>
            {
                @Override
                public atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId get(int i)
                    { return AtlasMessageImpl.this.getLeTcIdArray(i); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId set(int i, atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId o)
                {
                    atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId old = AtlasMessageImpl.this.getLeTcIdArray(i);
                    AtlasMessageImpl.this.setLeTcIdArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId o)
                    { AtlasMessageImpl.this.insertNewLeTcId(i).set(o); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId remove(int i)
                {
                    atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId old = AtlasMessageImpl.this.getLeTcIdArray(i);
                    AtlasMessageImpl.this.removeLeTcId(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return AtlasMessageImpl.this.sizeOfLeTcIdArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LeTcIdList();
            }
        }
        
        /**
         * Gets array of all "leTcId" elements
         * @deprecated
         */
        @Deprecated
        public atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId[] getLeTcIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId> targetList = new java.util.ArrayList<atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId>();
                get_store().find_all_element_users(LETCID$12, targetList);
                atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId[] result = new atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "leTcId" element
         */
        public atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId getLeTcIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId target = null;
                target = (atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId)get_store().find_element_user(LETCID$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "leTcId" element
         */
        public int sizeOfLeTcIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LETCID$12);
            }
        }
        
        /**
         * Sets array of all "leTcId" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLeTcIdArray(atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId[] leTcIdArray)
        {
            check_orphaned();
            arraySetterHelper(leTcIdArray, LETCID$12);
        }
        
        /**
         * Sets ith "leTcId" element
         */
        public void setLeTcIdArray(int i, atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId leTcId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId target = null;
                target = (atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId)get_store().find_element_user(LETCID$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(leTcId);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leTcId" element
         */
        public atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId insertNewLeTcId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId target = null;
                target = (atlas.pubsub.xmlbeans.le.LeTcIdDocument.LeTcId)get_store().insert_element_user(LETCID$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leTcId" element
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
         * Removes the ith "leTcId" element
         */
        public void removeLeTcId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LETCID$12, i);
            }
        }
        
        /**
         * Gets a List of "leAddress" elements
         */
        public java.util.List<atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress> getLeAddressList()
        {
            final class LeAddressList extends java.util.AbstractList<atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress>
            {
                @Override
                public atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress get(int i)
                    { return AtlasMessageImpl.this.getLeAddressArray(i); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress set(int i, atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress o)
                {
                    atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress old = AtlasMessageImpl.this.getLeAddressArray(i);
                    AtlasMessageImpl.this.setLeAddressArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress o)
                    { AtlasMessageImpl.this.insertNewLeAddress(i).set(o); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress remove(int i)
                {
                    atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress old = AtlasMessageImpl.this.getLeAddressArray(i);
                    AtlasMessageImpl.this.removeLeAddress(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return AtlasMessageImpl.this.sizeOfLeAddressArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LeAddressList();
            }
        }
        
        /**
         * Gets array of all "leAddress" elements
         * @deprecated
         */
        @Deprecated
        public atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress[] getLeAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress> targetList = new java.util.ArrayList<atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress>();
                get_store().find_all_element_users(LEADDRESS$14, targetList);
                atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress[] result = new atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "leAddress" element
         */
        public atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress getLeAddressArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress)get_store().find_element_user(LEADDRESS$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "leAddress" element
         */
        public int sizeOfLeAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEADDRESS$14);
            }
        }
        
        /**
         * Sets array of all "leAddress" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLeAddressArray(atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress[] leAddressArray)
        {
            check_orphaned();
            arraySetterHelper(leAddressArray, LEADDRESS$14);
        }
        
        /**
         * Sets ith "leAddress" element
         */
        public void setLeAddressArray(int i, atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress leAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress)get_store().find_element_user(LEADDRESS$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(leAddress);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leAddress" element
         */
        public atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress insertNewLeAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAddressDocument.LeAddress)get_store().insert_element_user(LEADDRESS$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leAddress" element
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
         * Removes the ith "leAddress" element
         */
        public void removeLeAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEADDRESS$14, i);
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
        
        /**
         * Gets the "leHierarchyDetails" element
         */
        public atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails getLeHierarchyDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails target = null;
                target = (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails)get_store().find_element_user(LEHIERARCHYDETAILS$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "leHierarchyDetails" element
         */
        public void setLeHierarchyDetails(atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails leHierarchyDetails)
        {
            generatedSetterHelperImpl(leHierarchyDetails, LEHIERARCHYDETAILS$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "leHierarchyDetails" element
         */
        public atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails addNewLeHierarchyDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails target = null;
                target = (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails)get_store().add_element_user(LEHIERARCHYDETAILS$24);
                return target;
            }
        }
    }
}
