/*
 * An XML document type.
 * Localname: fmAltAddressDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmAltAddressDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmAltAddressDetails(@) element.
 *
 * This is a complex type.
 */
public class FmAltAddressDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAltAddressDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmAltAddressDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMALTADDRESSDETAILS$0 = 
        new javax.xml.namespace.QName("", "fmAltAddressDetails");
    
    
    /**
     * Gets the "fmAltAddressDetails" element
     */
    public com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails getFmAltAddressDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails target = null;
            target = (com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails)get_store().find_element_user(FMALTADDRESSDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmAltAddressDetails" element
     */
    public void setFmAltAddressDetails(com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails fmAltAddressDetails)
    {
        generatedSetterHelperImpl(fmAltAddressDetails, FMALTADDRESSDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmAltAddressDetails" element
     */
    public com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails addNewFmAltAddressDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails target = null;
            target = (com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails)get_store().add_element_user(FMALTADDRESSDETAILS$0);
            return target;
        }
    }
    /**
     * An XML fmAltAddressDetails(@).
     *
     * This is a complex type.
     */
    public static class FmAltAddressDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAltAddressDetailsDocument.FmAltAddressDetails
    {
        private static final long serialVersionUID = 1L;
        
        public FmAltAddressDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FMALTADDRESS$0 = 
            new javax.xml.namespace.QName("", "fmAltAddress");
        
        
        /**
         * Gets a List of "fmAltAddress" elements
         */
        public java.util.List<com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress> getFmAltAddressList()
        {
            final class FmAltAddressList extends java.util.AbstractList<com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress>
            {
                @Override
                public com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress get(int i)
                    { return FmAltAddressDetailsImpl.this.getFmAltAddressArray(i); }
                
                @Override
                public com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress set(int i, com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress o)
                {
                    com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress old = FmAltAddressDetailsImpl.this.getFmAltAddressArray(i);
                    FmAltAddressDetailsImpl.this.setFmAltAddressArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress o)
                    { FmAltAddressDetailsImpl.this.insertNewFmAltAddress(i).set(o); }
                
                @Override
                public com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress remove(int i)
                {
                    com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress old = FmAltAddressDetailsImpl.this.getFmAltAddressArray(i);
                    FmAltAddressDetailsImpl.this.removeFmAltAddress(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return FmAltAddressDetailsImpl.this.sizeOfFmAltAddressArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FmAltAddressList();
            }
        }
        
        /**
         * Gets array of all "fmAltAddress" elements
         * @deprecated
         */
        @Deprecated
        public com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress[] getFmAltAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress> targetList = new java.util.ArrayList<com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress>();
                get_store().find_all_element_users(FMALTADDRESS$0, targetList);
                com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress[] result = new com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fmAltAddress" element
         */
        public com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress getFmAltAddressArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress target = null;
                target = (com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress)get_store().find_element_user(FMALTADDRESS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fmAltAddress" element
         */
        public int sizeOfFmAltAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FMALTADDRESS$0);
            }
        }
        
        /**
         * Sets array of all "fmAltAddress" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFmAltAddressArray(com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress[] fmAltAddressArray)
        {
            check_orphaned();
            arraySetterHelper(fmAltAddressArray, FMALTADDRESS$0);
        }
        
        /**
         * Sets ith "fmAltAddress" element
         */
        public void setFmAltAddressArray(int i, com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress fmAltAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress target = null;
                target = (com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress)get_store().find_element_user(FMALTADDRESS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fmAltAddress);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fmAltAddress" element
         */
        public com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress insertNewFmAltAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress target = null;
                target = (com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress)get_store().insert_element_user(FMALTADDRESS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fmAltAddress" element
         */
        public com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress addNewFmAltAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress target = null;
                target = (com.scb.sci.customer.fm.FmAltAddressDocument.FmAltAddress)get_store().add_element_user(FMALTADDRESS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "fmAltAddress" element
         */
        public void removeFmAltAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FMALTADDRESS$0, i);
            }
        }
    }
}
