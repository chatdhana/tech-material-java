/*
 * An XML document type.
 * Localname: ATLAS-DELTA-EVENT
 * Namespace: 
 * Java type: atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument
 *
 * Automatically generated - do not modify.
 */
package atlas.pubsub.xmlbeans.holiday.impl;
/**
 * A document containing one ATLAS-DELTA-EVENT(@) element.
 *
 * This is a complex type.
 */
public class ATLASDELTAEVENTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument
{
    private static final long serialVersionUID = 1L;
    
    public ATLASDELTAEVENTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATLASDELTAEVENT$0 = 
        new javax.xml.namespace.QName("", "ATLAS-DELTA-EVENT");
    
    
    /**
     * Gets the "ATLAS-DELTA-EVENT" element
     */
    public atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT getATLASDELTAEVENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT target = null;
            target = (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT)get_store().find_element_user(ATLASDELTAEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ATLAS-DELTA-EVENT" element
     */
    public void setATLASDELTAEVENT(atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT atlasdeltaevent)
    {
        generatedSetterHelperImpl(atlasdeltaevent, ATLASDELTAEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ATLAS-DELTA-EVENT" element
     */
    public atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT addNewATLASDELTAEVENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT target = null;
            target = (atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT)get_store().add_element_user(ATLASDELTAEVENT$0);
            return target;
        }
    }
    /**
     * An XML ATLAS-DELTA-EVENT(@).
     *
     * This is a complex type.
     */
    public static class ATLASDELTAEVENTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements atlas.pubsub.xmlbeans.holiday.ATLASDELTAEVENTDocument.ATLASDELTAEVENT
    {
        private static final long serialVersionUID = 1L;
        
        public ATLASDELTAEVENTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CURRENCYHOLIDAY$0 = 
            new javax.xml.namespace.QName("", "CURRENCY-HOLIDAY");
        private static final javax.xml.namespace.QName PUBLISHEDDATETIME$2 = 
            new javax.xml.namespace.QName("", "publishedDateTime");
        private static final javax.xml.namespace.QName ATLASMESSAGEID$4 = 
            new javax.xml.namespace.QName("", "atlasMessageID");
        
        
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
         * Gets the "publishedDateTime" attribute
         */
        public java.lang.String getPublishedDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHEDDATETIME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "publishedDateTime" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPublishedDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHEDDATETIME$2);
                return target;
            }
        }
        
        /**
         * True if has "publishedDateTime" attribute
         */
        public boolean isSetPublishedDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PUBLISHEDDATETIME$2) != null;
            }
        }
        
        /**
         * Sets the "publishedDateTime" attribute
         */
        public void setPublishedDateTime(java.lang.String publishedDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHEDDATETIME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLISHEDDATETIME$2);
                }
                target.setStringValue(publishedDateTime);
            }
        }
        
        /**
         * Sets (as xml) the "publishedDateTime" attribute
         */
        public void xsetPublishedDateTime(org.apache.xmlbeans.XmlString publishedDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHEDDATETIME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PUBLISHEDDATETIME$2);
                }
                target.set(publishedDateTime);
            }
        }
        
        /**
         * Unsets the "publishedDateTime" attribute
         */
        public void unsetPublishedDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PUBLISHEDDATETIME$2);
            }
        }
        
        /**
         * Gets the "atlasMessageID" attribute
         */
        public java.lang.String getAtlasMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATLASMESSAGEID$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "atlasMessageID" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAtlasMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ATLASMESSAGEID$4);
                return target;
            }
        }
        
        /**
         * True if has "atlasMessageID" attribute
         */
        public boolean isSetAtlasMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ATLASMESSAGEID$4) != null;
            }
        }
        
        /**
         * Sets the "atlasMessageID" attribute
         */
        public void setAtlasMessageID(java.lang.String atlasMessageID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATLASMESSAGEID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATLASMESSAGEID$4);
                }
                target.setStringValue(atlasMessageID);
            }
        }
        
        /**
         * Sets (as xml) the "atlasMessageID" attribute
         */
        public void xsetAtlasMessageID(org.apache.xmlbeans.XmlString atlasMessageID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ATLASMESSAGEID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ATLASMESSAGEID$4);
                }
                target.set(atlasMessageID);
            }
        }
        
        /**
         * Unsets the "atlasMessageID" attribute
         */
        public void unsetAtlasMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ATLASMESSAGEID$4);
            }
        }
    }
}
