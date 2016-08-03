/*
 * An XML document type.
 * Localname: fmTCIDDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmTCIDDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmTCIDDetails(@) element.
 *
 * This is a complex type.
 */
public class FmTCIDDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmTCIDDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmTCIDDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMTCIDDETAILS$0 = 
        new javax.xml.namespace.QName("", "fmTCIDDetails");
    
    
    /**
     * Gets the "fmTCIDDetails" element
     */
    public com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails getFmTCIDDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails target = null;
            target = (com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails)get_store().find_element_user(FMTCIDDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmTCIDDetails" element
     */
    public void setFmTCIDDetails(com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails fmTCIDDetails)
    {
        generatedSetterHelperImpl(fmTCIDDetails, FMTCIDDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmTCIDDetails" element
     */
    public com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails addNewFmTCIDDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails target = null;
            target = (com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails)get_store().add_element_user(FMTCIDDETAILS$0);
            return target;
        }
    }
    /**
     * An XML fmTCIDDetails(@).
     *
     * This is a complex type.
     */
    public static class FmTCIDDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmTCIDDetailsDocument.FmTCIDDetails
    {
        private static final long serialVersionUID = 1L;
        
        public FmTCIDDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FMTCID$0 = 
            new javax.xml.namespace.QName("", "fmTCID");
        
        
        /**
         * Gets a List of "fmTCID" elements
         */
        public java.util.List<com.scb.sci.customer.fm.FmTCIDDocument.FmTCID> getFmTCIDList()
        {
            final class FmTCIDList extends java.util.AbstractList<com.scb.sci.customer.fm.FmTCIDDocument.FmTCID>
            {
                @Override
                public com.scb.sci.customer.fm.FmTCIDDocument.FmTCID get(int i)
                    { return FmTCIDDetailsImpl.this.getFmTCIDArray(i); }
                
                @Override
                public com.scb.sci.customer.fm.FmTCIDDocument.FmTCID set(int i, com.scb.sci.customer.fm.FmTCIDDocument.FmTCID o)
                {
                    com.scb.sci.customer.fm.FmTCIDDocument.FmTCID old = FmTCIDDetailsImpl.this.getFmTCIDArray(i);
                    FmTCIDDetailsImpl.this.setFmTCIDArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, com.scb.sci.customer.fm.FmTCIDDocument.FmTCID o)
                    { FmTCIDDetailsImpl.this.insertNewFmTCID(i).set(o); }
                
                @Override
                public com.scb.sci.customer.fm.FmTCIDDocument.FmTCID remove(int i)
                {
                    com.scb.sci.customer.fm.FmTCIDDocument.FmTCID old = FmTCIDDetailsImpl.this.getFmTCIDArray(i);
                    FmTCIDDetailsImpl.this.removeFmTCID(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return FmTCIDDetailsImpl.this.sizeOfFmTCIDArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FmTCIDList();
            }
        }
        
        /**
         * Gets array of all "fmTCID" elements
         * @deprecated
         */
        @Deprecated
        public com.scb.sci.customer.fm.FmTCIDDocument.FmTCID[] getFmTCIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.scb.sci.customer.fm.FmTCIDDocument.FmTCID> targetList = new java.util.ArrayList<com.scb.sci.customer.fm.FmTCIDDocument.FmTCID>();
                get_store().find_all_element_users(FMTCID$0, targetList);
                com.scb.sci.customer.fm.FmTCIDDocument.FmTCID[] result = new com.scb.sci.customer.fm.FmTCIDDocument.FmTCID[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fmTCID" element
         */
        public com.scb.sci.customer.fm.FmTCIDDocument.FmTCID getFmTCIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmTCIDDocument.FmTCID target = null;
                target = (com.scb.sci.customer.fm.FmTCIDDocument.FmTCID)get_store().find_element_user(FMTCID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fmTCID" element
         */
        public int sizeOfFmTCIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMTCID$0);
            }
        }
        
        /**
         * Sets array of all "fmTCID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFmTCIDArray(com.scb.sci.customer.fm.FmTCIDDocument.FmTCID[] fmTCIDArray)
        {
            check_orphaned();
            arraySetterHelper(fmTCIDArray, FMTCID$0);
        }
        
        /**
         * Sets ith "fmTCID" element
         */
        public void setFmTCIDArray(int i, com.scb.sci.customer.fm.FmTCIDDocument.FmTCID fmTCID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmTCIDDocument.FmTCID target = null;
                target = (com.scb.sci.customer.fm.FmTCIDDocument.FmTCID)get_store().find_element_user(FMTCID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fmTCID);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fmTCID" element
         */
        public com.scb.sci.customer.fm.FmTCIDDocument.FmTCID insertNewFmTCID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmTCIDDocument.FmTCID target = null;
                target = (com.scb.sci.customer.fm.FmTCIDDocument.FmTCID)get_store().insert_element_user(FMTCID$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fmTCID" element
         */
        public com.scb.sci.customer.fm.FmTCIDDocument.FmTCID addNewFmTCID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmTCIDDocument.FmTCID target = null;
                target = (com.scb.sci.customer.fm.FmTCIDDocument.FmTCID)get_store().add_element_user(FMTCID$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "fmTCID" element
         */
        public void removeFmTCID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMTCID$0, i);
            }
        }
    }
}
