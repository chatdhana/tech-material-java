/*
 * An XML document type.
 * Localname: fmSysContactDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmSysContactDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmSysContactDetails(@) element.
 *
 * This is a complex type.
 */
public class FmSysContactDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmSysContactDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmSysContactDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMSYSCONTACTDETAILS$0 = 
        new javax.xml.namespace.QName("", "fmSysContactDetails");
    
    
    /**
     * Gets the "fmSysContactDetails" element
     */
    public com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails getFmSysContactDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails target = null;
            target = (com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails)get_store().find_element_user(FMSYSCONTACTDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmSysContactDetails" element
     */
    public void setFmSysContactDetails(com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails fmSysContactDetails)
    {
        generatedSetterHelperImpl(fmSysContactDetails, FMSYSCONTACTDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmSysContactDetails" element
     */
    public com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails addNewFmSysContactDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails target = null;
            target = (com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails)get_store().add_element_user(FMSYSCONTACTDETAILS$0);
            return target;
        }
    }
    /**
     * An XML fmSysContactDetails(@).
     *
     * This is a complex type.
     */
    public static class FmSysContactDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmSysContactDetailsDocument.FmSysContactDetails
    {
        private static final long serialVersionUID = 1L;
        
        public FmSysContactDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FMSYSCONTACT$0 = 
            new javax.xml.namespace.QName("", "fmSysContact");
        
        
        /**
         * Gets a List of "fmSysContact" elements
         */
        public java.util.List<com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact> getFmSysContactList()
        {
            final class FmSysContactList extends java.util.AbstractList<com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact>
            {
                @Override
                public com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact get(int i)
                    { return FmSysContactDetailsImpl.this.getFmSysContactArray(i); }
                
                @Override
                public com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact set(int i, com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact o)
                {
                    com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact old = FmSysContactDetailsImpl.this.getFmSysContactArray(i);
                    FmSysContactDetailsImpl.this.setFmSysContactArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact o)
                    { FmSysContactDetailsImpl.this.insertNewFmSysContact(i).set(o); }
                
                @Override
                public com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact remove(int i)
                {
                    com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact old = FmSysContactDetailsImpl.this.getFmSysContactArray(i);
                    FmSysContactDetailsImpl.this.removeFmSysContact(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return FmSysContactDetailsImpl.this.sizeOfFmSysContactArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FmSysContactList();
            }
        }
        
        /**
         * Gets array of all "fmSysContact" elements
         * @deprecated
         */
        @Deprecated
        public com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact[] getFmSysContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact> targetList = new java.util.ArrayList<com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact>();
                get_store().find_all_element_users(FMSYSCONTACT$0, targetList);
                com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact[] result = new com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fmSysContact" element
         */
        public com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact getFmSysContactArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact target = null;
                target = (com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact)get_store().find_element_user(FMSYSCONTACT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fmSysContact" element
         */
        public int sizeOfFmSysContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMSYSCONTACT$0);
            }
        }
        
        /**
         * Sets array of all "fmSysContact" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFmSysContactArray(com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact[] fmSysContactArray)
        {
            check_orphaned();
            arraySetterHelper(fmSysContactArray, FMSYSCONTACT$0);
        }
        
        /**
         * Sets ith "fmSysContact" element
         */
        public void setFmSysContactArray(int i, com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact fmSysContact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact target = null;
                target = (com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact)get_store().find_element_user(FMSYSCONTACT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fmSysContact);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fmSysContact" element
         */
        public com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact insertNewFmSysContact(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact target = null;
                target = (com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact)get_store().insert_element_user(FMSYSCONTACT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fmSysContact" element
         */
        public com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact addNewFmSysContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact target = null;
                target = (com.scb.sci.customer.fm.FmSysContactDocument.FmSysContact)get_store().add_element_user(FMSYSCONTACT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "fmSysContact" element
         */
        public void removeFmSysContact(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMSYSCONTACT$0, i);
            }
        }
    }
}
