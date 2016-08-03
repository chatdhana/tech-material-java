/*
 * An XML document type.
 * Localname: leBranchDetails
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leBranchDetails(@) element.
 *
 * This is a complex type.
 */
public class LeBranchDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeBranchDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEBRANCHDETAILS$0 = 
        new javax.xml.namespace.QName("", "leBranchDetails");
    
    
    /**
     * Gets the "leBranchDetails" element
     */
    public atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails getLeBranchDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails target = null;
            target = (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails)get_store().find_element_user(LEBRANCHDETAILS$0, 0);
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
        generatedSetterHelperImpl(leBranchDetails, LEBRANCHDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails)get_store().add_element_user(LEBRANCHDETAILS$0);
            return target;
        }
    }
    /**
     * An XML leBranchDetails(@).
     *
     * This is a complex type.
     */
    public static class LeBranchDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeBranchDetailsDocument.LeBranchDetails
    {
        private static final long serialVersionUID = 1L;
        
        public LeBranchDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEBRANCHINFO$0 = 
            new javax.xml.namespace.QName("", "leBranchInfo");
        
        
        /**
         * Gets a List of "leBranchInfo" elements
         */
        public java.util.List<atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo> getLeBranchInfoList()
        {
            final class LeBranchInfoList extends java.util.AbstractList<atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo>
            {
                @Override
                public atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo get(int i)
                    { return LeBranchDetailsImpl.this.getLeBranchInfoArray(i); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo set(int i, atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo o)
                {
                    atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo old = LeBranchDetailsImpl.this.getLeBranchInfoArray(i);
                    LeBranchDetailsImpl.this.setLeBranchInfoArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo o)
                    { LeBranchDetailsImpl.this.insertNewLeBranchInfo(i).set(o); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo remove(int i)
                {
                    atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo old = LeBranchDetailsImpl.this.getLeBranchInfoArray(i);
                    LeBranchDetailsImpl.this.removeLeBranchInfo(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return LeBranchDetailsImpl.this.sizeOfLeBranchInfoArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LeBranchInfoList();
            }
        }
        
        /**
         * Gets array of all "leBranchInfo" elements
         * @deprecated
         */
        @Deprecated
        public atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo[] getLeBranchInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo> targetList = new java.util.ArrayList<atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo>();
                get_store().find_all_element_users(LEBRANCHINFO$0, targetList);
                atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo[] result = new atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "leBranchInfo" element
         */
        public atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo getLeBranchInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo)get_store().find_element_user(LEBRANCHINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "leBranchInfo" element
         */
        public int sizeOfLeBranchInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEBRANCHINFO$0);
            }
        }
        
        /**
         * Sets array of all "leBranchInfo" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLeBranchInfoArray(atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo[] leBranchInfoArray)
        {
            check_orphaned();
            arraySetterHelper(leBranchInfoArray, LEBRANCHINFO$0);
        }
        
        /**
         * Sets ith "leBranchInfo" element
         */
        public void setLeBranchInfoArray(int i, atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo leBranchInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo)get_store().find_element_user(LEBRANCHINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(leBranchInfo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leBranchInfo" element
         */
        public atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo insertNewLeBranchInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo)get_store().insert_element_user(LEBRANCHINFO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leBranchInfo" element
         */
        public atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo addNewLeBranchInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeBranchInfoDocument.LeBranchInfo)get_store().add_element_user(LEBRANCHINFO$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "leBranchInfo" element
         */
        public void removeLeBranchInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEBRANCHINFO$0, i);
            }
        }
    }
}
