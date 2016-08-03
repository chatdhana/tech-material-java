/*
 * An XML document type.
 * Localname: leHierarchyDetails
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leHierarchyDetails(@) element.
 *
 * This is a complex type.
 */
public class LeHierarchyDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeHierarchyDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEHIERARCHYDETAILS$0 = 
        new javax.xml.namespace.QName("", "leHierarchyDetails");
    
    
    /**
     * Gets the "leHierarchyDetails" element
     */
    public atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails getLeHierarchyDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails target = null;
            target = (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails)get_store().find_element_user(LEHIERARCHYDETAILS$0, 0);
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
        generatedSetterHelperImpl(leHierarchyDetails, LEHIERARCHYDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails)get_store().add_element_user(LEHIERARCHYDETAILS$0);
            return target;
        }
    }
    /**
     * An XML leHierarchyDetails(@).
     *
     * This is a complex type.
     */
    public static class LeHierarchyDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeHierarchyDetailsDocument.LeHierarchyDetails
    {
        private static final long serialVersionUID = 1L;
        
        public LeHierarchyDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEHIERARCHYINFO$0 = 
            new javax.xml.namespace.QName("", "leHierarchyInfo");
        
        
        /**
         * Gets a List of "leHierarchyInfo" elements
         */
        public java.util.List<atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo> getLeHierarchyInfoList()
        {
            final class LeHierarchyInfoList extends java.util.AbstractList<atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo>
            {
                @Override
                public atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo get(int i)
                    { return LeHierarchyDetailsImpl.this.getLeHierarchyInfoArray(i); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo set(int i, atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo o)
                {
                    atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo old = LeHierarchyDetailsImpl.this.getLeHierarchyInfoArray(i);
                    LeHierarchyDetailsImpl.this.setLeHierarchyInfoArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo o)
                    { LeHierarchyDetailsImpl.this.insertNewLeHierarchyInfo(i).set(o); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo remove(int i)
                {
                    atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo old = LeHierarchyDetailsImpl.this.getLeHierarchyInfoArray(i);
                    LeHierarchyDetailsImpl.this.removeLeHierarchyInfo(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return LeHierarchyDetailsImpl.this.sizeOfLeHierarchyInfoArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LeHierarchyInfoList();
            }
        }
        
        /**
         * Gets array of all "leHierarchyInfo" elements
         * @deprecated
         */
        @Deprecated
        public atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo[] getLeHierarchyInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo> targetList = new java.util.ArrayList<atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo>();
                get_store().find_all_element_users(LEHIERARCHYINFO$0, targetList);
                atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo[] result = new atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "leHierarchyInfo" element
         */
        public atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo getLeHierarchyInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo)get_store().find_element_user(LEHIERARCHYINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "leHierarchyInfo" element
         */
        public int sizeOfLeHierarchyInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEHIERARCHYINFO$0);
            }
        }
        
        /**
         * Sets array of all "leHierarchyInfo" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLeHierarchyInfoArray(atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo[] leHierarchyInfoArray)
        {
            check_orphaned();
            arraySetterHelper(leHierarchyInfoArray, LEHIERARCHYINFO$0);
        }
        
        /**
         * Sets ith "leHierarchyInfo" element
         */
        public void setLeHierarchyInfoArray(int i, atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo leHierarchyInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo)get_store().find_element_user(LEHIERARCHYINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(leHierarchyInfo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leHierarchyInfo" element
         */
        public atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo insertNewLeHierarchyInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo)get_store().insert_element_user(LEHIERARCHYINFO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leHierarchyInfo" element
         */
        public atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo addNewLeHierarchyInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeHierarchyInfoDocument.LeHierarchyInfo)get_store().add_element_user(LEHIERARCHYINFO$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "leHierarchyInfo" element
         */
        public void removeLeHierarchyInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEHIERARCHYINFO$0, i);
            }
        }
    }
}
