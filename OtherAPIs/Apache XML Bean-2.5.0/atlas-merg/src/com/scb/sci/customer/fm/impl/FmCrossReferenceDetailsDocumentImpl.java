/*
 * An XML document type.
 * Localname: fmCrossReferenceDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmCrossReferenceDetails(@) element.
 *
 * This is a complex type.
 */
public class FmCrossReferenceDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmCrossReferenceDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMCROSSREFERENCEDETAILS$0 = 
        new javax.xml.namespace.QName("", "fmCrossReferenceDetails");
    
    
    /**
     * Gets the "fmCrossReferenceDetails" element
     */
    public com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails getFmCrossReferenceDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails target = null;
            target = (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails)get_store().find_element_user(FMCROSSREFERENCEDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmCrossReferenceDetails" element
     */
    public void setFmCrossReferenceDetails(com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails fmCrossReferenceDetails)
    {
        generatedSetterHelperImpl(fmCrossReferenceDetails, FMCROSSREFERENCEDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmCrossReferenceDetails" element
     */
    public com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails addNewFmCrossReferenceDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails target = null;
            target = (com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails)get_store().add_element_user(FMCROSSREFERENCEDETAILS$0);
            return target;
        }
    }
    /**
     * An XML fmCrossReferenceDetails(@).
     *
     * This is a complex type.
     */
    public static class FmCrossReferenceDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmCrossReferenceDetailsDocument.FmCrossReferenceDetails
    {
        private static final long serialVersionUID = 1L;
        
        public FmCrossReferenceDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FMCROSSREFERENCE$0 = 
            new javax.xml.namespace.QName("", "fmCrossReference");
        
        
        /**
         * Gets a List of "fmCrossReference" elements
         */
        public java.util.List<com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference> getFmCrossReferenceList()
        {
            final class FmCrossReferenceList extends java.util.AbstractList<com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference>
            {
                @Override
                public com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference get(int i)
                    { return FmCrossReferenceDetailsImpl.this.getFmCrossReferenceArray(i); }
                
                @Override
                public com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference set(int i, com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference o)
                {
                    com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference old = FmCrossReferenceDetailsImpl.this.getFmCrossReferenceArray(i);
                    FmCrossReferenceDetailsImpl.this.setFmCrossReferenceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference o)
                    { FmCrossReferenceDetailsImpl.this.insertNewFmCrossReference(i).set(o); }
                
                @Override
                public com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference remove(int i)
                {
                    com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference old = FmCrossReferenceDetailsImpl.this.getFmCrossReferenceArray(i);
                    FmCrossReferenceDetailsImpl.this.removeFmCrossReference(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return FmCrossReferenceDetailsImpl.this.sizeOfFmCrossReferenceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FmCrossReferenceList();
            }
        }
        
        /**
         * Gets array of all "fmCrossReference" elements
         * @deprecated
         */
        @Deprecated
        public com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference[] getFmCrossReferenceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference> targetList = new java.util.ArrayList<com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference>();
                get_store().find_all_element_users(FMCROSSREFERENCE$0, targetList);
                com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference[] result = new com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fmCrossReference" element
         */
        public com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference getFmCrossReferenceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference target = null;
                target = (com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference)get_store().find_element_user(FMCROSSREFERENCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fmCrossReference" element
         */
        public int sizeOfFmCrossReferenceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMCROSSREFERENCE$0);
            }
        }
        
        /**
         * Sets array of all "fmCrossReference" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFmCrossReferenceArray(com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference[] fmCrossReferenceArray)
        {
            check_orphaned();
            arraySetterHelper(fmCrossReferenceArray, FMCROSSREFERENCE$0);
        }
        
        /**
         * Sets ith "fmCrossReference" element
         */
        public void setFmCrossReferenceArray(int i, com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference fmCrossReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference target = null;
                target = (com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference)get_store().find_element_user(FMCROSSREFERENCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fmCrossReference);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fmCrossReference" element
         */
        public com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference insertNewFmCrossReference(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference target = null;
                target = (com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference)get_store().insert_element_user(FMCROSSREFERENCE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fmCrossReference" element
         */
        public com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference addNewFmCrossReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference target = null;
                target = (com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference)get_store().add_element_user(FMCROSSREFERENCE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "fmCrossReference" element
         */
        public void removeFmCrossReference(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMCROSSREFERENCE$0, i);
            }
        }
    }
}
