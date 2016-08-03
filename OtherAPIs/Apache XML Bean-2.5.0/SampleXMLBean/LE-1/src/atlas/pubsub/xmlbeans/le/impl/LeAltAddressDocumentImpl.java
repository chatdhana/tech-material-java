/*
 * An XML document type.
 * Localname: leAltAddress
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.LeAltAddressDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one leAltAddress(@) element.
 *
 * This is a complex type.
 */
public class LeAltAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeAltAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public LeAltAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEALTADDRESS$0 = 
        new javax.xml.namespace.QName("", "leAltAddress");
    
    
    /**
     * Gets the "leAltAddress" element
     */
    public atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress getLeAltAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress target = null;
            target = (atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress)get_store().find_element_user(LEALTADDRESS$0, 0);
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
        generatedSetterHelperImpl(leAltAddress, LEALTADDRESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress)get_store().add_element_user(LEALTADDRESS$0);
            return target;
        }
    }
    /**
     * An XML leAltAddress(@).
     *
     * This is a complex type.
     */
    public static class LeAltAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.LeAltAddressDocument.LeAltAddress
    {
        private static final long serialVersionUID = 1L;
        
        public LeAltAddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEALTADDRESSINFO$0 = 
            new javax.xml.namespace.QName("", "leAltAddressInfo");
        
        
        /**
         * Gets a List of "leAltAddressInfo" elements
         */
        public java.util.List<atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo> getLeAltAddressInfoList()
        {
            final class LeAltAddressInfoList extends java.util.AbstractList<atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo>
            {
                @Override
                public atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo get(int i)
                    { return LeAltAddressImpl.this.getLeAltAddressInfoArray(i); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo set(int i, atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo o)
                {
                    atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo old = LeAltAddressImpl.this.getLeAltAddressInfoArray(i);
                    LeAltAddressImpl.this.setLeAltAddressInfoArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo o)
                    { LeAltAddressImpl.this.insertNewLeAltAddressInfo(i).set(o); }
                
                @Override
                public atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo remove(int i)
                {
                    atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo old = LeAltAddressImpl.this.getLeAltAddressInfoArray(i);
                    LeAltAddressImpl.this.removeLeAltAddressInfo(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return LeAltAddressImpl.this.sizeOfLeAltAddressInfoArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LeAltAddressInfoList();
            }
        }
        
        /**
         * Gets array of all "leAltAddressInfo" elements
         * @deprecated
         */
        @Deprecated
        public atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo[] getLeAltAddressInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo> targetList = new java.util.ArrayList<atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo>();
                get_store().find_all_element_users(LEALTADDRESSINFO$0, targetList);
                atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo[] result = new atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "leAltAddressInfo" element
         */
        public atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo getLeAltAddressInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo)get_store().find_element_user(LEALTADDRESSINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "leAltAddressInfo" element
         */
        public int sizeOfLeAltAddressInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEALTADDRESSINFO$0);
            }
        }
        
        /**
         * Sets array of all "leAltAddressInfo" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLeAltAddressInfoArray(atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo[] leAltAddressInfoArray)
        {
            check_orphaned();
            arraySetterHelper(leAltAddressInfoArray, LEALTADDRESSINFO$0);
        }
        
        /**
         * Sets ith "leAltAddressInfo" element
         */
        public void setLeAltAddressInfoArray(int i, atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo leAltAddressInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo)get_store().find_element_user(LEALTADDRESSINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(leAltAddressInfo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "leAltAddressInfo" element
         */
        public atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo insertNewLeAltAddressInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo)get_store().insert_element_user(LEALTADDRESSINFO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "leAltAddressInfo" element
         */
        public atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo addNewLeAltAddressInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo target = null;
                target = (atlas.pubsub.xmlbeans.le.LeAltAddressInfoDocument.LeAltAddressInfo)get_store().add_element_user(LEALTADDRESSINFO$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "leAltAddressInfo" element
         */
        public void removeLeAltAddressInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEALTADDRESSINFO$0, i);
            }
        }
    }
}
