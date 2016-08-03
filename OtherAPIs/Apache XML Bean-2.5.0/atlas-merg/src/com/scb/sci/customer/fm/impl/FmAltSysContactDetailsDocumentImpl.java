/*
 * An XML document type.
 * Localname: fmAltSysContactDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmAltSysContactDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmAltSysContactDetails(@) element.
 *
 * This is a complex type.
 */
public class FmAltSysContactDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAltSysContactDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmAltSysContactDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMALTSYSCONTACTDETAILS$0 = 
        new javax.xml.namespace.QName("", "fmAltSysContactDetails");
    
    
    /**
     * Gets the "fmAltSysContactDetails" element
     */
    public com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails getFmAltSysContactDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails target = null;
            target = (com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails)get_store().find_element_user(FMALTSYSCONTACTDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmAltSysContactDetails" element
     */
    public void setFmAltSysContactDetails(com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails fmAltSysContactDetails)
    {
        generatedSetterHelperImpl(fmAltSysContactDetails, FMALTSYSCONTACTDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmAltSysContactDetails" element
     */
    public com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails addNewFmAltSysContactDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails target = null;
            target = (com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails)get_store().add_element_user(FMALTSYSCONTACTDETAILS$0);
            return target;
        }
    }
    /**
     * An XML fmAltSysContactDetails(@).
     *
     * This is a complex type.
     */
    public static class FmAltSysContactDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAltSysContactDetailsDocument.FmAltSysContactDetails
    {
        private static final long serialVersionUID = 1L;
        
        public FmAltSysContactDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FMALTSYSCONTACT$0 = 
            new javax.xml.namespace.QName("", "fmAltSysContact");
        
        
        /**
         * Gets a List of "fmAltSysContact" elements
         */
        public java.util.List<com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact> getFmAltSysContactList()
        {
            final class FmAltSysContactList extends java.util.AbstractList<com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact>
            {
                @Override
                public com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact get(int i)
                    { return FmAltSysContactDetailsImpl.this.getFmAltSysContactArray(i); }
                
                @Override
                public com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact set(int i, com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact o)
                {
                    com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact old = FmAltSysContactDetailsImpl.this.getFmAltSysContactArray(i);
                    FmAltSysContactDetailsImpl.this.setFmAltSysContactArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact o)
                    { FmAltSysContactDetailsImpl.this.insertNewFmAltSysContact(i).set(o); }
                
                @Override
                public com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact remove(int i)
                {
                    com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact old = FmAltSysContactDetailsImpl.this.getFmAltSysContactArray(i);
                    FmAltSysContactDetailsImpl.this.removeFmAltSysContact(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return FmAltSysContactDetailsImpl.this.sizeOfFmAltSysContactArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FmAltSysContactList();
            }
        }
        
        /**
         * Gets array of all "fmAltSysContact" elements
         * @deprecated
         */
        @Deprecated
        public com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact[] getFmAltSysContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact> targetList = new java.util.ArrayList<com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact>();
                get_store().find_all_element_users(FMALTSYSCONTACT$0, targetList);
                com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact[] result = new com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fmAltSysContact" element
         */
        public com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact getFmAltSysContactArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact target = null;
                target = (com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact)get_store().find_element_user(FMALTSYSCONTACT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fmAltSysContact" element
         */
        public int sizeOfFmAltSysContactArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMALTSYSCONTACT$0);
            }
        }
        
        /**
         * Sets array of all "fmAltSysContact" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFmAltSysContactArray(com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact[] fmAltSysContactArray)
        {
            check_orphaned();
            arraySetterHelper(fmAltSysContactArray, FMALTSYSCONTACT$0);
        }
        
        /**
         * Sets ith "fmAltSysContact" element
         */
        public void setFmAltSysContactArray(int i, com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact fmAltSysContact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact target = null;
                target = (com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact)get_store().find_element_user(FMALTSYSCONTACT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fmAltSysContact);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fmAltSysContact" element
         */
        public com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact insertNewFmAltSysContact(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact target = null;
                target = (com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact)get_store().insert_element_user(FMALTSYSCONTACT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fmAltSysContact" element
         */
        public com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact addNewFmAltSysContact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact target = null;
                target = (com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact)get_store().add_element_user(FMALTSYSCONTACT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "fmAltSysContact" element
         */
        public void removeFmAltSysContact(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMALTSYSCONTACT$0, i);
            }
        }
    }
}
