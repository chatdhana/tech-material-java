/*
 * An XML document type.
 * Localname: CURRENCY-HOLIDAY
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.holiday.CURRENCYHOLIDAYDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.holiday.impl;
/**
 * A document containing one CURRENCY-HOLIDAY(@) element.
 *
 * This is a complex type.
 */
public class CURRENCYHOLIDAYDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.holiday.CURRENCYHOLIDAYDocument
{
    private static final long serialVersionUID = 1L;
    
    public CURRENCYHOLIDAYDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCYHOLIDAY$0 = 
        new javax.xml.namespace.QName("", "CURRENCY-HOLIDAY");
    
    
    /**
     * Gets the "CURRENCY-HOLIDAY" element
     */
    public atlas.pubsub.xmlbeans.holiday.CURRENCYHOLIDAYDocument.CURRENCYHOLIDAY getCURRENCYHOLIDAY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.holiday.CURRENCYHOLIDAYDocument.CURRENCYHOLIDAY target = null;
            target = (atlas.pubsub.xmlbeans.holiday.CURRENCYHOLIDAYDocument.CURRENCYHOLIDAY)get_store().find_element_user(CURRENCYHOLIDAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CURRENCY-HOLIDAY" element
     */
    public void setCURRENCYHOLIDAY(atlas.pubsub.xmlbeans.holiday.CURRENCYHOLIDAYDocument.CURRENCYHOLIDAY currencyholiday)
    {
        generatedSetterHelperImpl(currencyholiday, CURRENCYHOLIDAY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CURRENCY-HOLIDAY" element
     */
    public atlas.pubsub.xmlbeans.holiday.CURRENCYHOLIDAYDocument.CURRENCYHOLIDAY addNewCURRENCYHOLIDAY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.holiday.CURRENCYHOLIDAYDocument.CURRENCYHOLIDAY target = null;
            target = (atlas.pubsub.xmlbeans.holiday.CURRENCYHOLIDAYDocument.CURRENCYHOLIDAY)get_store().add_element_user(CURRENCYHOLIDAY$0);
            return target;
        }
    }
    /**
     * An XML CURRENCY-HOLIDAY(@).
     *
     * This is a complex type.
     */
    public static class CURRENCYHOLIDAYImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.holiday.CURRENCYHOLIDAYDocument.CURRENCYHOLIDAY
    {
        private static final long serialVersionUID = 1L;
        
        public CURRENCYHOLIDAYImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CCYFIID$0 = 
            new javax.xml.namespace.QName("", "CCY-FI-ID");
        private static final javax.xml.namespace.QName HOLDATE$2 = 
            new javax.xml.namespace.QName("", "HOL-DATE");
        private static final javax.xml.namespace.QName EVENTTYPE$4 = 
            new javax.xml.namespace.QName("", "eventType");
        
        
        /**
         * Gets the "CCY-FI-ID" element
         */
        public java.lang.String getCCYFIID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CCYFIID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CCY-FI-ID" element
         */
        public org.apache.xmlbeans.XmlString xgetCCYFIID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CCYFIID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CCY-FI-ID" element
         */
        public void setCCYFIID(java.lang.String ccyfiid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CCYFIID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CCYFIID$0);
                }
                target.setStringValue(ccyfiid);
            }
        }
        
        /**
         * Sets (as xml) the "CCY-FI-ID" element
         */
        public void xsetCCYFIID(org.apache.xmlbeans.XmlString ccyfiid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CCYFIID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CCYFIID$0);
                }
                target.set(ccyfiid);
            }
        }
        
        /**
         * Gets the "HOL-DATE" element
         */
        public java.lang.String getHOLDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOLDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "HOL-DATE" element
         */
        public org.apache.xmlbeans.XmlString xgetHOLDATE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOLDATE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "HOL-DATE" element
         */
        public void setHOLDATE(java.lang.String holdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOLDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOLDATE$2);
                }
                target.setStringValue(holdate);
            }
        }
        
        /**
         * Sets (as xml) the "HOL-DATE" element
         */
        public void xsetHOLDATE(org.apache.xmlbeans.XmlString holdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOLDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOLDATE$2);
                }
                target.set(holdate);
            }
        }
        
        /**
         * Gets the "eventType" attribute
         */
        public java.lang.String getEventType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENTTYPE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "eventType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEventType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVENTTYPE$4);
                return target;
            }
        }
        
        /**
         * True if has "eventType" attribute
         */
        public boolean isSetEventType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EVENTTYPE$4) != null;
            }
        }
        
        /**
         * Sets the "eventType" attribute
         */
        public void setEventType(java.lang.String eventType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENTTYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVENTTYPE$4);
                }
                target.setStringValue(eventType);
            }
        }
        
        /**
         * Sets (as xml) the "eventType" attribute
         */
        public void xsetEventType(org.apache.xmlbeans.XmlString eventType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVENTTYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EVENTTYPE$4);
                }
                target.set(eventType);
            }
        }
        
        /**
         * Unsets the "eventType" attribute
         */
        public void unsetEventType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EVENTTYPE$4);
            }
        }
    }
}
