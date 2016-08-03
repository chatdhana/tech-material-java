/*
 * An XML document type.
 * Localname: ISICDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ISICDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one ISICDetails(@) element.
 *
 * This is a complex type.
 */
public class ISICDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ISICDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ISICDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISICDETAILS$0 = 
        new javax.xml.namespace.QName("", "ISICDetails");
    
    
    /**
     * Gets the "ISICDetails" element
     */
    public com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails getISICDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails target = null;
            target = (com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails)get_store().find_element_user(ISICDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ISICDetails" element
     */
    public void setISICDetails(com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails isicDetails)
    {
        generatedSetterHelperImpl(isicDetails, ISICDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ISICDetails" element
     */
    public com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails addNewISICDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails target = null;
            target = (com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails)get_store().add_element_user(ISICDETAILS$0);
            return target;
        }
    }
    /**
     * An XML ISICDetails(@).
     *
     * This is a complex type.
     */
    public static class ISICDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ISICDetailsDocument.ISICDetails
    {
        private static final long serialVersionUID = 1L;
        
        public ISICDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ISIC$0 = 
            new javax.xml.namespace.QName("", "ISIC");
        
        
        /**
         * Gets a List of "ISIC" elements
         */
        public java.util.List<com.scb.sci.customer.fm.ISICDocument.ISIC> getISICList()
        {
            final class ISICList extends java.util.AbstractList<com.scb.sci.customer.fm.ISICDocument.ISIC>
            {
                @Override
                public com.scb.sci.customer.fm.ISICDocument.ISIC get(int i)
                    { return ISICDetailsImpl.this.getISICArray(i); }
                
                @Override
                public com.scb.sci.customer.fm.ISICDocument.ISIC set(int i, com.scb.sci.customer.fm.ISICDocument.ISIC o)
                {
                    com.scb.sci.customer.fm.ISICDocument.ISIC old = ISICDetailsImpl.this.getISICArray(i);
                    ISICDetailsImpl.this.setISICArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, com.scb.sci.customer.fm.ISICDocument.ISIC o)
                    { ISICDetailsImpl.this.insertNewISIC(i).set(o); }
                
                @Override
                public com.scb.sci.customer.fm.ISICDocument.ISIC remove(int i)
                {
                    com.scb.sci.customer.fm.ISICDocument.ISIC old = ISICDetailsImpl.this.getISICArray(i);
                    ISICDetailsImpl.this.removeISIC(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ISICDetailsImpl.this.sizeOfISICArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ISICList();
            }
        }
        
        /**
         * Gets array of all "ISIC" elements
         * @deprecated
         */
        @Deprecated
        public com.scb.sci.customer.fm.ISICDocument.ISIC[] getISICArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.scb.sci.customer.fm.ISICDocument.ISIC> targetList = new java.util.ArrayList<com.scb.sci.customer.fm.ISICDocument.ISIC>();
                get_store().find_all_element_users(ISIC$0, targetList);
                com.scb.sci.customer.fm.ISICDocument.ISIC[] result = new com.scb.sci.customer.fm.ISICDocument.ISIC[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ISIC" element
         */
        public com.scb.sci.customer.fm.ISICDocument.ISIC getISICArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ISICDocument.ISIC target = null;
                target = (com.scb.sci.customer.fm.ISICDocument.ISIC)get_store().find_element_user(ISIC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ISIC" element
         */
        public int sizeOfISICArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISIC$0);
            }
        }
        
        /**
         * Sets array of all "ISIC" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setISICArray(com.scb.sci.customer.fm.ISICDocument.ISIC[] isicArray)
        {
            check_orphaned();
            arraySetterHelper(isicArray, ISIC$0);
        }
        
        /**
         * Sets ith "ISIC" element
         */
        public void setISICArray(int i, com.scb.sci.customer.fm.ISICDocument.ISIC isic)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ISICDocument.ISIC target = null;
                target = (com.scb.sci.customer.fm.ISICDocument.ISIC)get_store().find_element_user(ISIC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(isic);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ISIC" element
         */
        public com.scb.sci.customer.fm.ISICDocument.ISIC insertNewISIC(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ISICDocument.ISIC target = null;
                target = (com.scb.sci.customer.fm.ISICDocument.ISIC)get_store().insert_element_user(ISIC$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ISIC" element
         */
        public com.scb.sci.customer.fm.ISICDocument.ISIC addNewISIC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ISICDocument.ISIC target = null;
                target = (com.scb.sci.customer.fm.ISICDocument.ISIC)get_store().add_element_user(ISIC$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ISIC" element
         */
        public void removeISIC(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISIC$0, i);
            }
        }
    }
}
