/*
 * An XML document type.
 * Localname: fmBranchDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmBranchDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmBranchDetails(@) element.
 *
 * This is a complex type.
 */
public class FmBranchDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmBranchDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmBranchDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMBRANCHDETAILS$0 = 
        new javax.xml.namespace.QName("", "fmBranchDetails");
    
    
    /**
     * Gets the "fmBranchDetails" element
     */
    public com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails getFmBranchDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails target = null;
            target = (com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails)get_store().find_element_user(FMBRANCHDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmBranchDetails" element
     */
    public void setFmBranchDetails(com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails fmBranchDetails)
    {
        generatedSetterHelperImpl(fmBranchDetails, FMBRANCHDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmBranchDetails" element
     */
    public com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails addNewFmBranchDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails target = null;
            target = (com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails)get_store().add_element_user(FMBRANCHDETAILS$0);
            return target;
        }
    }
    /**
     * An XML fmBranchDetails(@).
     *
     * This is a complex type.
     */
    public static class FmBranchDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmBranchDetailsDocument.FmBranchDetails
    {
        private static final long serialVersionUID = 1L;
        
        public FmBranchDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FMBRANCH$0 = 
            new javax.xml.namespace.QName("", "fmBranch");
        
        
        /**
         * Gets a List of "fmBranch" elements
         */
        public java.util.List<com.scb.sci.customer.fm.FmBranchDocument.FmBranch> getFmBranchList()
        {
            final class FmBranchList extends java.util.AbstractList<com.scb.sci.customer.fm.FmBranchDocument.FmBranch>
            {
                @Override
                public com.scb.sci.customer.fm.FmBranchDocument.FmBranch get(int i)
                    { return FmBranchDetailsImpl.this.getFmBranchArray(i); }
                
                @Override
                public com.scb.sci.customer.fm.FmBranchDocument.FmBranch set(int i, com.scb.sci.customer.fm.FmBranchDocument.FmBranch o)
                {
                    com.scb.sci.customer.fm.FmBranchDocument.FmBranch old = FmBranchDetailsImpl.this.getFmBranchArray(i);
                    FmBranchDetailsImpl.this.setFmBranchArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, com.scb.sci.customer.fm.FmBranchDocument.FmBranch o)
                    { FmBranchDetailsImpl.this.insertNewFmBranch(i).set(o); }
                
                @Override
                public com.scb.sci.customer.fm.FmBranchDocument.FmBranch remove(int i)
                {
                    com.scb.sci.customer.fm.FmBranchDocument.FmBranch old = FmBranchDetailsImpl.this.getFmBranchArray(i);
                    FmBranchDetailsImpl.this.removeFmBranch(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return FmBranchDetailsImpl.this.sizeOfFmBranchArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FmBranchList();
            }
        }
        
        /**
         * Gets array of all "fmBranch" elements
         * @deprecated
         */
        @Deprecated
        public com.scb.sci.customer.fm.FmBranchDocument.FmBranch[] getFmBranchArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.scb.sci.customer.fm.FmBranchDocument.FmBranch> targetList = new java.util.ArrayList<com.scb.sci.customer.fm.FmBranchDocument.FmBranch>();
                get_store().find_all_element_users(FMBRANCH$0, targetList);
                com.scb.sci.customer.fm.FmBranchDocument.FmBranch[] result = new com.scb.sci.customer.fm.FmBranchDocument.FmBranch[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fmBranch" element
         */
        public com.scb.sci.customer.fm.FmBranchDocument.FmBranch getFmBranchArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmBranchDocument.FmBranch target = null;
                target = (com.scb.sci.customer.fm.FmBranchDocument.FmBranch)get_store().find_element_user(FMBRANCH$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fmBranch" element
         */
        public int sizeOfFmBranchArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMBRANCH$0);
            }
        }
        
        /**
         * Sets array of all "fmBranch" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFmBranchArray(com.scb.sci.customer.fm.FmBranchDocument.FmBranch[] fmBranchArray)
        {
            check_orphaned();
            arraySetterHelper(fmBranchArray, FMBRANCH$0);
        }
        
        /**
         * Sets ith "fmBranch" element
         */
        public void setFmBranchArray(int i, com.scb.sci.customer.fm.FmBranchDocument.FmBranch fmBranch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmBranchDocument.FmBranch target = null;
                target = (com.scb.sci.customer.fm.FmBranchDocument.FmBranch)get_store().find_element_user(FMBRANCH$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fmBranch);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fmBranch" element
         */
        public com.scb.sci.customer.fm.FmBranchDocument.FmBranch insertNewFmBranch(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmBranchDocument.FmBranch target = null;
                target = (com.scb.sci.customer.fm.FmBranchDocument.FmBranch)get_store().insert_element_user(FMBRANCH$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fmBranch" element
         */
        public com.scb.sci.customer.fm.FmBranchDocument.FmBranch addNewFmBranch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmBranchDocument.FmBranch target = null;
                target = (com.scb.sci.customer.fm.FmBranchDocument.FmBranch)get_store().add_element_user(FMBRANCH$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "fmBranch" element
         */
        public void removeFmBranch(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMBRANCH$0, i);
            }
        }
    }
}
