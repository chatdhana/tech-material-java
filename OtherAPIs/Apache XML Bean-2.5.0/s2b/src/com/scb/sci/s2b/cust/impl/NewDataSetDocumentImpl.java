/*
 * An XML document type.
 * Localname: NewDataSet
 * Namespace: 
 * Java type: com.scb.sci.s2b.cust.NewDataSetDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.s2b.cust.impl;
/**
 * A document containing one NewDataSet(@) element.
 *
 * This is a complex type.
 */
public class NewDataSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.s2b.cust.NewDataSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public NewDataSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEWDATASET$0 = 
        new javax.xml.namespace.QName("", "NewDataSet");
    
    
    /**
     * Gets the "NewDataSet" element
     */
    public com.scb.sci.s2b.cust.NewDataSetDocument.NewDataSet getNewDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.s2b.cust.NewDataSetDocument.NewDataSet target = null;
            target = (com.scb.sci.s2b.cust.NewDataSetDocument.NewDataSet)get_store().find_element_user(NEWDATASET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NewDataSet" element
     */
    public void setNewDataSet(com.scb.sci.s2b.cust.NewDataSetDocument.NewDataSet newDataSet)
    {
        generatedSetterHelperImpl(newDataSet, NEWDATASET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "NewDataSet" element
     */
    public com.scb.sci.s2b.cust.NewDataSetDocument.NewDataSet addNewNewDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.s2b.cust.NewDataSetDocument.NewDataSet target = null;
            target = (com.scb.sci.s2b.cust.NewDataSetDocument.NewDataSet)get_store().add_element_user(NEWDATASET$0);
            return target;
        }
    }
    /**
     * An XML NewDataSet(@).
     *
     * This is a complex type.
     */
    public static class NewDataSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.s2b.cust.NewDataSetDocument.NewDataSet
    {
        private static final long serialVersionUID = 1L;
        
        public NewDataSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TPCUSTREQUEST$0 = 
            new javax.xml.namespace.QName("", "TPCustRequest");
        
        
        /**
         * Gets array of all "TPCustRequest" elements
         */
        public com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest[] getTPCustRequestArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TPCUSTREQUEST$0, targetList);
                com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest[] result = new com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TPCustRequest" element
         */
        public com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest getTPCustRequestArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest target = null;
                target = (com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest)get_store().find_element_user(TPCUSTREQUEST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TPCustRequest" element
         */
        public int sizeOfTPCustRequestArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TPCUSTREQUEST$0);
            }
        }
        
        /**
         * Sets array of all "TPCustRequest" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTPCustRequestArray(com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest[] tpCustRequestArray)
        {
            check_orphaned();
            arraySetterHelper(tpCustRequestArray, TPCUSTREQUEST$0);
        }
        
        /**
         * Sets ith "TPCustRequest" element
         */
        public void setTPCustRequestArray(int i, com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest tpCustRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest target = null;
                target = (com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest)get_store().find_element_user(TPCUSTREQUEST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(tpCustRequest);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TPCustRequest" element
         */
        public com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest insertNewTPCustRequest(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest target = null;
                target = (com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest)get_store().insert_element_user(TPCUSTREQUEST$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TPCustRequest" element
         */
        public com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest addNewTPCustRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest target = null;
                target = (com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest)get_store().add_element_user(TPCUSTREQUEST$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "TPCustRequest" element
         */
        public void removeTPCustRequest(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TPCUSTREQUEST$0, i);
            }
        }
    }
}
