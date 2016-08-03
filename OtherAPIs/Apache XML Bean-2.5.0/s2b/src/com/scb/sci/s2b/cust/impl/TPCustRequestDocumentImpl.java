/*
 * An XML document type.
 * Localname: TPCustRequest
 * Namespace: 
 * Java type: com.scb.sci.s2b.cust.TPCustRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.s2b.cust.impl;
/**
 * A document containing one TPCustRequest(@) element.
 *
 * This is a complex type.
 */
public class TPCustRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.s2b.cust.TPCustRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public TPCustRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TPCUSTREQUEST$0 = 
        new javax.xml.namespace.QName("", "TPCustRequest");
    
    
    /**
     * Gets the "TPCustRequest" element
     */
    public com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest getTPCustRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest target = null;
            target = (com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest)get_store().find_element_user(TPCUSTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TPCustRequest" element
     */
    public void setTPCustRequest(com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest tpCustRequest)
    {
        generatedSetterHelperImpl(tpCustRequest, TPCUSTREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TPCustRequest" element
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
     * An XML TPCustRequest(@).
     *
     * This is a complex type.
     */
    public static class TPCustRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest
    {
        private static final long serialVersionUID = 1L;
        
        public TPCustRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName LIMITIND$4 = 
            new javax.xml.namespace.QName("", "limitInd");
        private static final javax.xml.namespace.QName REQUESTEDSYSTEMDETAILS$6 = 
            new javax.xml.namespace.QName("", "requestedSystemDetails");
        
        
        /**
         * Gets the "leId" element
         */
        public java.lang.String getLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leId" element
         */
        public org.apache.xmlbeans.XmlString xgetLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "leId" element
         */
        public boolean isSetLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEID$0) != 0;
            }
        }
        
        /**
         * Sets the "leId" element
         */
        public void setLeId(java.lang.String leId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEID$0);
                }
                target.setStringValue(leId);
            }
        }
        
        /**
         * Sets (as xml) the "leId" element
         */
        public void xsetLeId(org.apache.xmlbeans.XmlString leId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEID$0);
                }
                target.set(leId);
            }
        }
        
        /**
         * Unsets the "leId" element
         */
        public void unsetLeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEID$0, 0);
            }
        }
        
        /**
         * Gets the "subProfileId" element
         */
        public java.lang.String getSubProfileId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPROFILEID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subProfileId" element
         */
        public org.apache.xmlbeans.XmlString xgetSubProfileId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPROFILEID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "subProfileId" element
         */
        public boolean isSetSubProfileId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBPROFILEID$2) != 0;
            }
        }
        
        /**
         * Sets the "subProfileId" element
         */
        public void setSubProfileId(java.lang.String subProfileId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPROFILEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBPROFILEID$2);
                }
                target.setStringValue(subProfileId);
            }
        }
        
        /**
         * Sets (as xml) the "subProfileId" element
         */
        public void xsetSubProfileId(org.apache.xmlbeans.XmlString subProfileId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPROFILEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBPROFILEID$2);
                }
                target.set(subProfileId);
            }
        }
        
        /**
         * Unsets the "subProfileId" element
         */
        public void unsetSubProfileId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBPROFILEID$2, 0);
            }
        }
        
        /**
         * Gets the "limitInd" element
         */
        public java.lang.String getLimitInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIMITIND$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "limitInd" element
         */
        public org.apache.xmlbeans.XmlString xgetLimitInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIMITIND$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "limitInd" element
         */
        public boolean isSetLimitInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LIMITIND$4) != 0;
            }
        }
        
        /**
         * Sets the "limitInd" element
         */
        public void setLimitInd(java.lang.String limitInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIMITIND$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIMITIND$4);
                }
                target.setStringValue(limitInd);
            }
        }
        
        /**
         * Sets (as xml) the "limitInd" element
         */
        public void xsetLimitInd(org.apache.xmlbeans.XmlString limitInd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIMITIND$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LIMITIND$4);
                }
                target.set(limitInd);
            }
        }
        
        /**
         * Unsets the "limitInd" element
         */
        public void unsetLimitInd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LIMITIND$4, 0);
            }
        }
        
        /**
         * Gets array of all "requestedSystemDetails" elements
         */
        public com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails[] getRequestedSystemDetailsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REQUESTEDSYSTEMDETAILS$6, targetList);
                com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails[] result = new com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "requestedSystemDetails" element
         */
        public com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails getRequestedSystemDetailsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails target = null;
                target = (com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails)get_store().find_element_user(REQUESTEDSYSTEMDETAILS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "requestedSystemDetails" element
         */
        public int sizeOfRequestedSystemDetailsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTEDSYSTEMDETAILS$6);
            }
        }
        
        /**
         * Sets array of all "requestedSystemDetails" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRequestedSystemDetailsArray(com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails[] requestedSystemDetailsArray)
        {
            check_orphaned();
            arraySetterHelper(requestedSystemDetailsArray, REQUESTEDSYSTEMDETAILS$6);
        }
        
        /**
         * Sets ith "requestedSystemDetails" element
         */
        public void setRequestedSystemDetailsArray(int i, com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails requestedSystemDetails)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails target = null;
                target = (com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails)get_store().find_element_user(REQUESTEDSYSTEMDETAILS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(requestedSystemDetails);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "requestedSystemDetails" element
         */
        public com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails insertNewRequestedSystemDetails(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails target = null;
                target = (com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails)get_store().insert_element_user(REQUESTEDSYSTEMDETAILS$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "requestedSystemDetails" element
         */
        public com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails addNewRequestedSystemDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails target = null;
                target = (com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails)get_store().add_element_user(REQUESTEDSYSTEMDETAILS$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "requestedSystemDetails" element
         */
        public void removeRequestedSystemDetails(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTEDSYSTEMDETAILS$6, i);
            }
        }
        /**
         * An XML requestedSystemDetails(@).
         *
         * This is a complex type.
         */
        public static class RequestedSystemDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.s2b.cust.TPCustRequestDocument.TPCustRequest.RequestedSystemDetails
        {
            private static final long serialVersionUID = 1L;
            
            public RequestedSystemDetailsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REQUESTTYPE$0 = 
                new javax.xml.namespace.QName("", "requestType");
            private static final javax.xml.namespace.QName REQUESTEDSYSTEMNAME$2 = 
                new javax.xml.namespace.QName("", "requestedSystemName");
            private static final javax.xml.namespace.QName REQUESTID$4 = 
                new javax.xml.namespace.QName("", "requestId");
            private static final javax.xml.namespace.QName REQUESTDATE$6 = 
                new javax.xml.namespace.QName("", "requestDate");
            
            
            /**
             * Gets the "requestType" element
             */
            public java.lang.String getRequestType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTTYPE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "requestType" element
             */
            public org.apache.xmlbeans.XmlString xgetRequestType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTTYPE$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "requestType" element
             */
            public boolean isSetRequestType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REQUESTTYPE$0) != 0;
                }
            }
            
            /**
             * Sets the "requestType" element
             */
            public void setRequestType(java.lang.String requestType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTTYPE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTTYPE$0);
                    }
                    target.setStringValue(requestType);
                }
            }
            
            /**
             * Sets (as xml) the "requestType" element
             */
            public void xsetRequestType(org.apache.xmlbeans.XmlString requestType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTTYPE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTTYPE$0);
                    }
                    target.set(requestType);
                }
            }
            
            /**
             * Unsets the "requestType" element
             */
            public void unsetRequestType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REQUESTTYPE$0, 0);
                }
            }
            
            /**
             * Gets the "requestedSystemName" element
             */
            public java.lang.String getRequestedSystemName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTEDSYSTEMNAME$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "requestedSystemName" element
             */
            public org.apache.xmlbeans.XmlString xgetRequestedSystemName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTEDSYSTEMNAME$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "requestedSystemName" element
             */
            public boolean isSetRequestedSystemName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REQUESTEDSYSTEMNAME$2) != 0;
                }
            }
            
            /**
             * Sets the "requestedSystemName" element
             */
            public void setRequestedSystemName(java.lang.String requestedSystemName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTEDSYSTEMNAME$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTEDSYSTEMNAME$2);
                    }
                    target.setStringValue(requestedSystemName);
                }
            }
            
            /**
             * Sets (as xml) the "requestedSystemName" element
             */
            public void xsetRequestedSystemName(org.apache.xmlbeans.XmlString requestedSystemName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTEDSYSTEMNAME$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTEDSYSTEMNAME$2);
                    }
                    target.set(requestedSystemName);
                }
            }
            
            /**
             * Unsets the "requestedSystemName" element
             */
            public void unsetRequestedSystemName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REQUESTEDSYSTEMNAME$2, 0);
                }
            }
            
            /**
             * Gets the "requestId" element
             */
            public java.lang.String getRequestId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "requestId" element
             */
            public org.apache.xmlbeans.XmlString xgetRequestId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "requestId" element
             */
            public boolean isSetRequestId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REQUESTID$4) != 0;
                }
            }
            
            /**
             * Sets the "requestId" element
             */
            public void setRequestId(java.lang.String requestId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$4);
                    }
                    target.setStringValue(requestId);
                }
            }
            
            /**
             * Sets (as xml) the "requestId" element
             */
            public void xsetRequestId(org.apache.xmlbeans.XmlString requestId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTID$4);
                    }
                    target.set(requestId);
                }
            }
            
            /**
             * Unsets the "requestId" element
             */
            public void unsetRequestId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REQUESTID$4, 0);
                }
            }
            
            /**
             * Gets the "requestDate" element
             */
            public java.lang.String getRequestDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTDATE$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "requestDate" element
             */
            public org.apache.xmlbeans.XmlString xgetRequestDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTDATE$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "requestDate" element
             */
            public boolean isSetRequestDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REQUESTDATE$6) != 0;
                }
            }
            
            /**
             * Sets the "requestDate" element
             */
            public void setRequestDate(java.lang.String requestDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTDATE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTDATE$6);
                    }
                    target.setStringValue(requestDate);
                }
            }
            
            /**
             * Sets (as xml) the "requestDate" element
             */
            public void xsetRequestDate(org.apache.xmlbeans.XmlString requestDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTDATE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTDATE$6);
                    }
                    target.set(requestDate);
                }
            }
            
            /**
             * Unsets the "requestDate" element
             */
            public void unsetRequestDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REQUESTDATE$6, 0);
                }
            }
        }
    }
}
