/*
 * An XML document type.
 * Localname: investorIds
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.InvestorIdsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one investorIds(@) element.
 *
 * This is a complex type.
 */
public class InvestorIdsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.InvestorIdsDocument
{
    private static final long serialVersionUID = 1L;
    
    public InvestorIdsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVESTORIDS$0 = 
        new javax.xml.namespace.QName("", "investorIds");
    
    
    /**
     * Gets the "investorIds" element
     */
    public com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds getInvestorIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds target = null;
            target = (com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds)get_store().find_element_user(INVESTORIDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "investorIds" element
     */
    public void setInvestorIds(com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds investorIds)
    {
        generatedSetterHelperImpl(investorIds, INVESTORIDS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "investorIds" element
     */
    public com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds addNewInvestorIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds target = null;
            target = (com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds)get_store().add_element_user(INVESTORIDS$0);
            return target;
        }
    }
    /**
     * An XML investorIds(@).
     *
     * This is a complex type.
     */
    public static class InvestorIdsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.InvestorIdsDocument.InvestorIds
    {
        private static final long serialVersionUID = 1L;
        
        public InvestorIdsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INVESTORID$0 = 
            new javax.xml.namespace.QName("", "investorId");
        
        
        /**
         * Gets a List of "investorId" elements
         */
        public java.util.List<com.scb.sci.customer.fm.InvestorIdDocument.InvestorId> getInvestorIdList()
        {
            final class InvestorIdList extends java.util.AbstractList<com.scb.sci.customer.fm.InvestorIdDocument.InvestorId>
            {
                @Override
                public com.scb.sci.customer.fm.InvestorIdDocument.InvestorId get(int i)
                    { return InvestorIdsImpl.this.getInvestorIdArray(i); }
                
                @Override
                public com.scb.sci.customer.fm.InvestorIdDocument.InvestorId set(int i, com.scb.sci.customer.fm.InvestorIdDocument.InvestorId o)
                {
                    com.scb.sci.customer.fm.InvestorIdDocument.InvestorId old = InvestorIdsImpl.this.getInvestorIdArray(i);
                    InvestorIdsImpl.this.setInvestorIdArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, com.scb.sci.customer.fm.InvestorIdDocument.InvestorId o)
                    { InvestorIdsImpl.this.insertNewInvestorId(i).set(o); }
                
                @Override
                public com.scb.sci.customer.fm.InvestorIdDocument.InvestorId remove(int i)
                {
                    com.scb.sci.customer.fm.InvestorIdDocument.InvestorId old = InvestorIdsImpl.this.getInvestorIdArray(i);
                    InvestorIdsImpl.this.removeInvestorId(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return InvestorIdsImpl.this.sizeOfInvestorIdArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new InvestorIdList();
            }
        }
        
        /**
         * Gets array of all "investorId" elements
         * @deprecated
         */
        @Deprecated
        public com.scb.sci.customer.fm.InvestorIdDocument.InvestorId[] getInvestorIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.scb.sci.customer.fm.InvestorIdDocument.InvestorId> targetList = new java.util.ArrayList<com.scb.sci.customer.fm.InvestorIdDocument.InvestorId>();
                get_store().find_all_element_users(INVESTORID$0, targetList);
                com.scb.sci.customer.fm.InvestorIdDocument.InvestorId[] result = new com.scb.sci.customer.fm.InvestorIdDocument.InvestorId[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "investorId" element
         */
        public com.scb.sci.customer.fm.InvestorIdDocument.InvestorId getInvestorIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.InvestorIdDocument.InvestorId target = null;
                target = (com.scb.sci.customer.fm.InvestorIdDocument.InvestorId)get_store().find_element_user(INVESTORID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "investorId" element
         */
        public int sizeOfInvestorIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INVESTORID$0);
            }
        }
        
        /**
         * Sets array of all "investorId" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setInvestorIdArray(com.scb.sci.customer.fm.InvestorIdDocument.InvestorId[] investorIdArray)
        {
            check_orphaned();
            arraySetterHelper(investorIdArray, INVESTORID$0);
        }
        
        /**
         * Sets ith "investorId" element
         */
        public void setInvestorIdArray(int i, com.scb.sci.customer.fm.InvestorIdDocument.InvestorId investorId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.InvestorIdDocument.InvestorId target = null;
                target = (com.scb.sci.customer.fm.InvestorIdDocument.InvestorId)get_store().find_element_user(INVESTORID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(investorId);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "investorId" element
         */
        public com.scb.sci.customer.fm.InvestorIdDocument.InvestorId insertNewInvestorId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.InvestorIdDocument.InvestorId target = null;
                target = (com.scb.sci.customer.fm.InvestorIdDocument.InvestorId)get_store().insert_element_user(INVESTORID$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "investorId" element
         */
        public com.scb.sci.customer.fm.InvestorIdDocument.InvestorId addNewInvestorId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.InvestorIdDocument.InvestorId target = null;
                target = (com.scb.sci.customer.fm.InvestorIdDocument.InvestorId)get_store().add_element_user(INVESTORID$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "investorId" element
         */
        public void removeInvestorId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INVESTORID$0, i);
            }
        }
    }
}
