/*
 * An XML document type.
 * Localname: fmHierarchyDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmHierarchyDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmHierarchyDetails(@) element.
 *
 * This is a complex type.
 */
public class FmHierarchyDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmHierarchyDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmHierarchyDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMHIERARCHYDETAILS$0 = 
        new javax.xml.namespace.QName("", "fmHierarchyDetails");
    
    
    /**
     * Gets the "fmHierarchyDetails" element
     */
    public com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails getFmHierarchyDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails target = null;
            target = (com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails)get_store().find_element_user(FMHIERARCHYDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmHierarchyDetails" element
     */
    public void setFmHierarchyDetails(com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails fmHierarchyDetails)
    {
        generatedSetterHelperImpl(fmHierarchyDetails, FMHIERARCHYDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmHierarchyDetails" element
     */
    public com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails addNewFmHierarchyDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails target = null;
            target = (com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails)get_store().add_element_user(FMHIERARCHYDETAILS$0);
            return target;
        }
    }
    /**
     * An XML fmHierarchyDetails(@).
     *
     * This is a complex type.
     */
    public static class FmHierarchyDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmHierarchyDetailsDocument.FmHierarchyDetails
    {
        private static final long serialVersionUID = 1L;
        
        public FmHierarchyDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FMHIERARCHY$0 = 
            new javax.xml.namespace.QName("", "fmHierarchy");
        
        
        /**
         * Gets a List of "fmHierarchy" elements
         */
        public java.util.List<com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy> getFmHierarchyList()
        {
            final class FmHierarchyList extends java.util.AbstractList<com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy>
            {
                @Override
                public com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy get(int i)
                    { return FmHierarchyDetailsImpl.this.getFmHierarchyArray(i); }
                
                @Override
                public com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy set(int i, com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy o)
                {
                    com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy old = FmHierarchyDetailsImpl.this.getFmHierarchyArray(i);
                    FmHierarchyDetailsImpl.this.setFmHierarchyArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy o)
                    { FmHierarchyDetailsImpl.this.insertNewFmHierarchy(i).set(o); }
                
                @Override
                public com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy remove(int i)
                {
                    com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy old = FmHierarchyDetailsImpl.this.getFmHierarchyArray(i);
                    FmHierarchyDetailsImpl.this.removeFmHierarchy(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return FmHierarchyDetailsImpl.this.sizeOfFmHierarchyArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FmHierarchyList();
            }
        }
        
        /**
         * Gets array of all "fmHierarchy" elements
         * @deprecated
         */
        @Deprecated
        public com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy[] getFmHierarchyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy> targetList = new java.util.ArrayList<com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy>();
                get_store().find_all_element_users(FMHIERARCHY$0, targetList);
                com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy[] result = new com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fmHierarchy" element
         */
        public com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy getFmHierarchyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy target = null;
                target = (com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy)get_store().find_element_user(FMHIERARCHY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fmHierarchy" element
         */
        public int sizeOfFmHierarchyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMHIERARCHY$0);
            }
        }
        
        /**
         * Sets array of all "fmHierarchy" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFmHierarchyArray(com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy[] fmHierarchyArray)
        {
            check_orphaned();
            arraySetterHelper(fmHierarchyArray, FMHIERARCHY$0);
        }
        
        /**
         * Sets ith "fmHierarchy" element
         */
        public void setFmHierarchyArray(int i, com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy fmHierarchy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy target = null;
                target = (com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy)get_store().find_element_user(FMHIERARCHY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fmHierarchy);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fmHierarchy" element
         */
        public com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy insertNewFmHierarchy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy target = null;
                target = (com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy)get_store().insert_element_user(FMHIERARCHY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fmHierarchy" element
         */
        public com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy addNewFmHierarchy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy target = null;
                target = (com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy)get_store().add_element_user(FMHIERARCHY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "fmHierarchy" element
         */
        public void removeFmHierarchy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMHIERARCHY$0, i);
            }
        }
    }
}
