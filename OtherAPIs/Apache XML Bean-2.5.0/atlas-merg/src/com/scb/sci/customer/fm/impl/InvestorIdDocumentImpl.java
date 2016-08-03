/*
 * An XML document type.
 * Localname: investorId
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.InvestorIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one investorId(@) element.
 *
 * This is a complex type.
 */
public class InvestorIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.InvestorIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public InvestorIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVESTORID$0 = 
        new javax.xml.namespace.QName("", "investorId");
    
    
    /**
     * Gets the "investorId" element
     */
    public com.scb.sci.customer.fm.InvestorIdDocument.InvestorId getInvestorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.InvestorIdDocument.InvestorId target = null;
            target = (com.scb.sci.customer.fm.InvestorIdDocument.InvestorId)get_store().find_element_user(INVESTORID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "investorId" element
     */
    public void setInvestorId(com.scb.sci.customer.fm.InvestorIdDocument.InvestorId investorId)
    {
        generatedSetterHelperImpl(investorId, INVESTORID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "investorId" element
     */
    public com.scb.sci.customer.fm.InvestorIdDocument.InvestorId addNewInvestorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.InvestorIdDocument.InvestorId target = null;
            target = (com.scb.sci.customer.fm.InvestorIdDocument.InvestorId)get_store().add_element_user(INVESTORID$0);
            return target;
        }
    }
    /**
     * An XML investorId(@).
     *
     * This is a complex type.
     */
    public static class InvestorIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.InvestorIdDocument.InvestorId
    {
        private static final long serialVersionUID = 1L;
        
        public InvestorIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MARKET$0 = 
            new javax.xml.namespace.QName("", "market");
        private static final javax.xml.namespace.QName CODE$2 = 
            new javax.xml.namespace.QName("", "code");
        
        
        /**
         * Gets a List of "market" elements
         */
        public java.util.List<com.scb.sci.customer.fm.MarketDocument.Market> getMarketList()
        {
            final class MarketList extends java.util.AbstractList<com.scb.sci.customer.fm.MarketDocument.Market>
            {
                @Override
                public com.scb.sci.customer.fm.MarketDocument.Market get(int i)
                    { return InvestorIdImpl.this.getMarketArray(i); }
                
                @Override
                public com.scb.sci.customer.fm.MarketDocument.Market set(int i, com.scb.sci.customer.fm.MarketDocument.Market o)
                {
                    com.scb.sci.customer.fm.MarketDocument.Market old = InvestorIdImpl.this.getMarketArray(i);
                    InvestorIdImpl.this.setMarketArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, com.scb.sci.customer.fm.MarketDocument.Market o)
                    { InvestorIdImpl.this.insertNewMarket(i).set(o); }
                
                @Override
                public com.scb.sci.customer.fm.MarketDocument.Market remove(int i)
                {
                    com.scb.sci.customer.fm.MarketDocument.Market old = InvestorIdImpl.this.getMarketArray(i);
                    InvestorIdImpl.this.removeMarket(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return InvestorIdImpl.this.sizeOfMarketArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new MarketList();
            }
        }
        
        /**
         * Gets array of all "market" elements
         * @deprecated
         */
        @Deprecated
        public com.scb.sci.customer.fm.MarketDocument.Market[] getMarketArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.scb.sci.customer.fm.MarketDocument.Market> targetList = new java.util.ArrayList<com.scb.sci.customer.fm.MarketDocument.Market>();
                get_store().find_all_element_users(MARKET$0, targetList);
                com.scb.sci.customer.fm.MarketDocument.Market[] result = new com.scb.sci.customer.fm.MarketDocument.Market[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "market" element
         */
        public com.scb.sci.customer.fm.MarketDocument.Market getMarketArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.MarketDocument.Market target = null;
                target = (com.scb.sci.customer.fm.MarketDocument.Market)get_store().find_element_user(MARKET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "market" element
         */
        public int sizeOfMarketArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MARKET$0);
            }
        }
        
        /**
         * Sets array of all "market" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setMarketArray(com.scb.sci.customer.fm.MarketDocument.Market[] marketArray)
        {
            check_orphaned();
            arraySetterHelper(marketArray, MARKET$0);
        }
        
        /**
         * Sets ith "market" element
         */
        public void setMarketArray(int i, com.scb.sci.customer.fm.MarketDocument.Market market)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.MarketDocument.Market target = null;
                target = (com.scb.sci.customer.fm.MarketDocument.Market)get_store().find_element_user(MARKET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(market);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "market" element
         */
        public com.scb.sci.customer.fm.MarketDocument.Market insertNewMarket(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.MarketDocument.Market target = null;
                target = (com.scb.sci.customer.fm.MarketDocument.Market)get_store().insert_element_user(MARKET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "market" element
         */
        public com.scb.sci.customer.fm.MarketDocument.Market addNewMarket()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.MarketDocument.Market target = null;
                target = (com.scb.sci.customer.fm.MarketDocument.Market)get_store().add_element_user(MARKET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "market" element
         */
        public void removeMarket(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MARKET$0, i);
            }
        }
        
        /**
         * Gets the "code" element
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "code" element
         */
        public org.apache.xmlbeans.XmlString xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "code" element
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$2);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "code" element
         */
        public void xsetCode(org.apache.xmlbeans.XmlString code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$2);
                }
                target.set(code);
            }
        }
    }
}
