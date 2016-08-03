/*
 * An XML document type.
 * Localname: contractingRelationships
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ContractingRelationshipsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one contractingRelationships(@) element.
 *
 * This is a complex type.
 */
public class ContractingRelationshipsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ContractingRelationshipsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContractingRelationshipsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTRACTINGRELATIONSHIPS$0 = 
        new javax.xml.namespace.QName("", "contractingRelationships");
    
    
    /**
     * Gets the "contractingRelationships" element
     */
    public com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships getContractingRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships target = null;
            target = (com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships)get_store().find_element_user(CONTRACTINGRELATIONSHIPS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contractingRelationships" element
     */
    public void setContractingRelationships(com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships contractingRelationships)
    {
        generatedSetterHelperImpl(contractingRelationships, CONTRACTINGRELATIONSHIPS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "contractingRelationships" element
     */
    public com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships addNewContractingRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships target = null;
            target = (com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships)get_store().add_element_user(CONTRACTINGRELATIONSHIPS$0);
            return target;
        }
    }
    /**
     * An XML contractingRelationships(@).
     *
     * This is a complex type.
     */
    public static class ContractingRelationshipsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ContractingRelationshipsDocument.ContractingRelationships
    {
        private static final long serialVersionUID = 1L;
        
        public ContractingRelationshipsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTRACTINGRELATIONSHIP$0 = 
            new javax.xml.namespace.QName("", "contractingRelationship");
        
        
        /**
         * Gets a List of "contractingRelationship" elements
         */
        public java.util.List<com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship> getContractingRelationshipList()
        {
            final class ContractingRelationshipList extends java.util.AbstractList<com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship>
            {
                @Override
                public com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship get(int i)
                    { return ContractingRelationshipsImpl.this.getContractingRelationshipArray(i); }
                
                @Override
                public com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship set(int i, com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship o)
                {
                    com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship old = ContractingRelationshipsImpl.this.getContractingRelationshipArray(i);
                    ContractingRelationshipsImpl.this.setContractingRelationshipArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship o)
                    { ContractingRelationshipsImpl.this.insertNewContractingRelationship(i).set(o); }
                
                @Override
                public com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship remove(int i)
                {
                    com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship old = ContractingRelationshipsImpl.this.getContractingRelationshipArray(i);
                    ContractingRelationshipsImpl.this.removeContractingRelationship(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ContractingRelationshipsImpl.this.sizeOfContractingRelationshipArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ContractingRelationshipList();
            }
        }
        
        /**
         * Gets array of all "contractingRelationship" elements
         * @deprecated
         */
        @Deprecated
        public com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship[] getContractingRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship> targetList = new java.util.ArrayList<com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship>();
                get_store().find_all_element_users(CONTRACTINGRELATIONSHIP$0, targetList);
                com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship[] result = new com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "contractingRelationship" element
         */
        public com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship getContractingRelationshipArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship target = null;
                target = (com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship)get_store().find_element_user(CONTRACTINGRELATIONSHIP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "contractingRelationship" element
         */
        public int sizeOfContractingRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTRACTINGRELATIONSHIP$0);
            }
        }
        
        /**
         * Sets array of all "contractingRelationship" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setContractingRelationshipArray(com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship[] contractingRelationshipArray)
        {
            check_orphaned();
            arraySetterHelper(contractingRelationshipArray, CONTRACTINGRELATIONSHIP$0);
        }
        
        /**
         * Sets ith "contractingRelationship" element
         */
        public void setContractingRelationshipArray(int i, com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship contractingRelationship)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship target = null;
                target = (com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship)get_store().find_element_user(CONTRACTINGRELATIONSHIP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contractingRelationship);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "contractingRelationship" element
         */
        public com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship insertNewContractingRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship target = null;
                target = (com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship)get_store().insert_element_user(CONTRACTINGRELATIONSHIP$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "contractingRelationship" element
         */
        public com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship addNewContractingRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship target = null;
                target = (com.scb.sci.customer.fm.ContractingRelationshipDocument.ContractingRelationship)get_store().add_element_user(CONTRACTINGRELATIONSHIP$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "contractingRelationship" element
         */
        public void removeContractingRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTRACTINGRELATIONSHIP$0, i);
            }
        }
    }
}
