/*
 * An XML document type.
 * Localname: counterpartyXref
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.le.impl;
/**
 * A document containing one counterpartyXref(@) element.
 *
 * This is a complex type.
 */
public class CounterpartyXrefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CounterpartyXrefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTERPARTYXREF$0 = 
        new javax.xml.namespace.QName("", "counterpartyXref");
    
    
    /**
     * Gets the "counterpartyXref" element
     */
    public atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref getCounterpartyXref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref target = null;
            target = (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref)get_store().find_element_user(COUNTERPARTYXREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "counterpartyXref" element
     */
    public void setCounterpartyXref(atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref counterpartyXref)
    {
        generatedSetterHelperImpl(counterpartyXref, COUNTERPARTYXREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "counterpartyXref" element
     */
    public atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref addNewCounterpartyXref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref target = null;
            target = (atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref)get_store().add_element_user(COUNTERPARTYXREF$0);
            return target;
        }
    }
    /**
     * An XML counterpartyXref(@).
     *
     * This is a complex type.
     */
    public static class CounterpartyXrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.le.CounterpartyXrefDocument.CounterpartyXref
    {
        private static final long serialVersionUID = 1L;
        
        public CounterpartyXrefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTYXREFCODE$0 = 
            new javax.xml.namespace.QName("", "partyXrefCode");
        private static final javax.xml.namespace.QName LOCATIONCODE$2 = 
            new javax.xml.namespace.QName("", "locationCode");
        private static final javax.xml.namespace.QName EXTRNLSYSTMCODE$4 = 
            new javax.xml.namespace.QName("", "extrnlSystmCode");
        private static final javax.xml.namespace.QName IMMSMNEMONIC$6 = 
            new javax.xml.namespace.QName("", "immsMnemonic");
        private static final javax.xml.namespace.QName UPCOUNT$8 = 
            new javax.xml.namespace.QName("", "upcount");
        private static final javax.xml.namespace.QName UPDSTATUS$10 = 
            new javax.xml.namespace.QName("", "updstatus");
        private static final javax.xml.namespace.QName VERIFIED$12 = 
            new javax.xml.namespace.QName("", "verified");
        
        
        /**
         * Gets the "partyXrefCode" element
         */
        public java.lang.String getPartyXrefCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTYXREFCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "partyXrefCode" element
         */
        public org.apache.xmlbeans.XmlString xgetPartyXrefCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTYXREFCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "partyXrefCode" element
         */
        public void setPartyXrefCode(java.lang.String partyXrefCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTYXREFCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTYXREFCODE$0);
                }
                target.setStringValue(partyXrefCode);
            }
        }
        
        /**
         * Sets (as xml) the "partyXrefCode" element
         */
        public void xsetPartyXrefCode(org.apache.xmlbeans.XmlString partyXrefCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTYXREFCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTYXREFCODE$0);
                }
                target.set(partyXrefCode);
            }
        }
        
        /**
         * Gets the "locationCode" element
         */
        public java.lang.String getLocationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "locationCode" element
         */
        public org.apache.xmlbeans.XmlString xgetLocationCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONCODE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "locationCode" element
         */
        public void setLocationCode(java.lang.String locationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONCODE$2);
                }
                target.setStringValue(locationCode);
            }
        }
        
        /**
         * Sets (as xml) the "locationCode" element
         */
        public void xsetLocationCode(org.apache.xmlbeans.XmlString locationCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATIONCODE$2);
                }
                target.set(locationCode);
            }
        }
        
        /**
         * Gets the "extrnlSystmCode" element
         */
        public java.lang.String getExtrnlSystmCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRNLSYSTMCODE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "extrnlSystmCode" element
         */
        public org.apache.xmlbeans.XmlString xgetExtrnlSystmCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRNLSYSTMCODE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "extrnlSystmCode" element
         */
        public void setExtrnlSystmCode(java.lang.String extrnlSystmCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRNLSYSTMCODE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRNLSYSTMCODE$4);
                }
                target.setStringValue(extrnlSystmCode);
            }
        }
        
        /**
         * Sets (as xml) the "extrnlSystmCode" element
         */
        public void xsetExtrnlSystmCode(org.apache.xmlbeans.XmlString extrnlSystmCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRNLSYSTMCODE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRNLSYSTMCODE$4);
                }
                target.set(extrnlSystmCode);
            }
        }
        
        /**
         * Gets the "immsMnemonic" element
         */
        public java.lang.String getImmsMnemonic()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMMSMNEMONIC$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "immsMnemonic" element
         */
        public org.apache.xmlbeans.XmlString xgetImmsMnemonic()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMMSMNEMONIC$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "immsMnemonic" element
         */
        public void setImmsMnemonic(java.lang.String immsMnemonic)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMMSMNEMONIC$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMMSMNEMONIC$6);
                }
                target.setStringValue(immsMnemonic);
            }
        }
        
        /**
         * Sets (as xml) the "immsMnemonic" element
         */
        public void xsetImmsMnemonic(org.apache.xmlbeans.XmlString immsMnemonic)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMMSMNEMONIC$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMMSMNEMONIC$6);
                }
                target.set(immsMnemonic);
            }
        }
        
        /**
         * Gets the "upcount" element
         */
        public java.lang.String getUpcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPCOUNT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "upcount" element
         */
        public org.apache.xmlbeans.XmlString xgetUpcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPCOUNT$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "upcount" element
         */
        public void setUpcount(java.lang.String upcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPCOUNT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPCOUNT$8);
                }
                target.setStringValue(upcount);
            }
        }
        
        /**
         * Sets (as xml) the "upcount" element
         */
        public void xsetUpcount(org.apache.xmlbeans.XmlString upcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPCOUNT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPCOUNT$8);
                }
                target.set(upcount);
            }
        }
        
        /**
         * Gets the "updstatus" element
         */
        public java.lang.String getUpdstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "updstatus" element
         */
        public org.apache.xmlbeans.XmlString xgetUpdstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "updstatus" element
         */
        public void setUpdstatus(java.lang.String updstatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDSTATUS$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDSTATUS$10);
                }
                target.setStringValue(updstatus);
            }
        }
        
        /**
         * Sets (as xml) the "updstatus" element
         */
        public void xsetUpdstatus(org.apache.xmlbeans.XmlString updstatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDSTATUS$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDSTATUS$10);
                }
                target.set(updstatus);
            }
        }
        
        /**
         * Gets the "verified" element
         */
        public java.lang.String getVerified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "verified" element
         */
        public org.apache.xmlbeans.XmlString xgetVerified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "verified" element
         */
        public void setVerified(java.lang.String verified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERIFIED$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERIFIED$12);
                }
                target.setStringValue(verified);
            }
        }
        
        /**
         * Sets (as xml) the "verified" element
         */
        public void xsetVerified(org.apache.xmlbeans.XmlString verified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERIFIED$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERIFIED$12);
                }
                target.set(verified);
            }
        }
    }
}
