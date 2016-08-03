/*
 * An XML document type.
 * Localname: fmAddressDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmAddressDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmAddressDetails(@) element.
 *
 * This is a complex type.
 */
public class FmAddressDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAddressDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmAddressDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMADDRESSDETAILS$0 = 
        new javax.xml.namespace.QName("", "fmAddressDetails");
    
    
    /**
     * Gets the "fmAddressDetails" element
     */
    public com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails getFmAddressDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails target = null;
            target = (com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails)get_store().find_element_user(FMADDRESSDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmAddressDetails" element
     */
    public void setFmAddressDetails(com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails fmAddressDetails)
    {
        generatedSetterHelperImpl(fmAddressDetails, FMADDRESSDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmAddressDetails" element
     */
    public com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails addNewFmAddressDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails target = null;
            target = (com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails)get_store().add_element_user(FMADDRESSDETAILS$0);
            return target;
        }
    }
    /**
     * An XML fmAddressDetails(@).
     *
     * This is a complex type.
     */
    public static class FmAddressDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAddressDetailsDocument.FmAddressDetails
    {
        private static final long serialVersionUID = 1L;
        
        public FmAddressDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FMADDRESS$0 = 
            new javax.xml.namespace.QName("", "fmAddress");
        
        
        /**
         * Gets a List of "fmAddress" elements
         */
        public java.util.List<com.scb.sci.customer.fm.FmAddressDocument.FmAddress> getFmAddressList()
        {
            final class FmAddressList extends java.util.AbstractList<com.scb.sci.customer.fm.FmAddressDocument.FmAddress>
            {
                @Override
                public com.scb.sci.customer.fm.FmAddressDocument.FmAddress get(int i)
                    { return FmAddressDetailsImpl.this.getFmAddressArray(i); }
                
                @Override
                public com.scb.sci.customer.fm.FmAddressDocument.FmAddress set(int i, com.scb.sci.customer.fm.FmAddressDocument.FmAddress o)
                {
                    com.scb.sci.customer.fm.FmAddressDocument.FmAddress old = FmAddressDetailsImpl.this.getFmAddressArray(i);
                    FmAddressDetailsImpl.this.setFmAddressArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, com.scb.sci.customer.fm.FmAddressDocument.FmAddress o)
                    { FmAddressDetailsImpl.this.insertNewFmAddress(i).set(o); }
                
                @Override
                public com.scb.sci.customer.fm.FmAddressDocument.FmAddress remove(int i)
                {
                    com.scb.sci.customer.fm.FmAddressDocument.FmAddress old = FmAddressDetailsImpl.this.getFmAddressArray(i);
                    FmAddressDetailsImpl.this.removeFmAddress(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return FmAddressDetailsImpl.this.sizeOfFmAddressArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FmAddressList();
            }
        }
        
        /**
         * Gets array of all "fmAddress" elements
         * @deprecated
         */
        @Deprecated
        public com.scb.sci.customer.fm.FmAddressDocument.FmAddress[] getFmAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.scb.sci.customer.fm.FmAddressDocument.FmAddress> targetList = new java.util.ArrayList<com.scb.sci.customer.fm.FmAddressDocument.FmAddress>();
                get_store().find_all_element_users(FMADDRESS$0, targetList);
                com.scb.sci.customer.fm.FmAddressDocument.FmAddress[] result = new com.scb.sci.customer.fm.FmAddressDocument.FmAddress[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fmAddress" element
         */
        public com.scb.sci.customer.fm.FmAddressDocument.FmAddress getFmAddressArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAddressDocument.FmAddress target = null;
                target = (com.scb.sci.customer.fm.FmAddressDocument.FmAddress)get_store().find_element_user(FMADDRESS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fmAddress" element
         */
        public int sizeOfFmAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMADDRESS$0);
            }
        }
        
        /**
         * Sets array of all "fmAddress" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFmAddressArray(com.scb.sci.customer.fm.FmAddressDocument.FmAddress[] fmAddressArray)
        {
            check_orphaned();
            arraySetterHelper(fmAddressArray, FMADDRESS$0);
        }
        
        /**
         * Sets ith "fmAddress" element
         */
        public void setFmAddressArray(int i, com.scb.sci.customer.fm.FmAddressDocument.FmAddress fmAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAddressDocument.FmAddress target = null;
                target = (com.scb.sci.customer.fm.FmAddressDocument.FmAddress)get_store().find_element_user(FMADDRESS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fmAddress);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fmAddress" element
         */
        public com.scb.sci.customer.fm.FmAddressDocument.FmAddress insertNewFmAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAddressDocument.FmAddress target = null;
                target = (com.scb.sci.customer.fm.FmAddressDocument.FmAddress)get_store().insert_element_user(FMADDRESS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fmAddress" element
         */
        public com.scb.sci.customer.fm.FmAddressDocument.FmAddress addNewFmAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAddressDocument.FmAddress target = null;
                target = (com.scb.sci.customer.fm.FmAddressDocument.FmAddress)get_store().add_element_user(FMADDRESS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "fmAddress" element
         */
        public void removeFmAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMADDRESS$0, i);
            }
        }
    }
}
