/*
 * An XML document type.
 * Localname: ISIC
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.ISICDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one ISIC(@) element.
 *
 * This is a complex type.
 */
public class ISICDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ISICDocument
{
    private static final long serialVersionUID = 1L;
    
    public ISICDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISIC$0 = 
        new javax.xml.namespace.QName("", "ISIC");
    
    
    /**
     * Gets the "ISIC" element
     */
    public com.scb.sci.customer.fm.ISICDocument.ISIC getISIC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.ISICDocument.ISIC target = null;
            target = (com.scb.sci.customer.fm.ISICDocument.ISIC)get_store().find_element_user(ISIC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ISIC" element
     */
    public void setISIC(com.scb.sci.customer.fm.ISICDocument.ISIC isic)
    {
        generatedSetterHelperImpl(isic, ISIC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ISIC" element
     */
    public com.scb.sci.customer.fm.ISICDocument.ISIC addNewISIC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.ISICDocument.ISIC target = null;
            target = (com.scb.sci.customer.fm.ISICDocument.ISIC)get_store().add_element_user(ISIC$0);
            return target;
        }
    }
    /**
     * An XML ISIC(@).
     *
     * This is a complex type.
     */
    public static class ISICImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.ISICDocument.ISIC
    {
        private static final long serialVersionUID = 1L;
        
        public ISICImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName ISICID$2 = 
            new javax.xml.namespace.QName("", "ISICId");
        private static final javax.xml.namespace.QName ISICTYPE$4 = 
            new javax.xml.namespace.QName("", "ISICType");
        private static final javax.xml.namespace.QName ISICCODE$6 = 
            new javax.xml.namespace.QName("", "ISICCode");
        private static final javax.xml.namespace.QName UN2008ISICCODE$8 = 
            new javax.xml.namespace.QName("", "UN2008IsicCode");
        private static final javax.xml.namespace.QName UN2008ISICDESCRIPTION$10 = 
            new javax.xml.namespace.QName("", "UN2008IsicDescription");
        private static final javax.xml.namespace.QName ISICEFFECTIVEDATE$12 = 
            new javax.xml.namespace.QName("", "ISICEffectiveDate");
        private static final javax.xml.namespace.QName ISICWEIGHTAGE$14 = 
            new javax.xml.namespace.QName("", "ISICWeightage");
        private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$16 = 
            new javax.xml.namespace.QName("", "updateStatusIndicator");
        private static final javax.xml.namespace.QName CHANGEINDICATOR$18 = 
            new javax.xml.namespace.QName("", "changeIndicator");
        
        
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
         * Gets the "ISICId" element
         */
        public java.lang.String getISICId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ISICId" element
         */
        public org.apache.xmlbeans.XmlString xgetISICId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ISICId" element
         */
        public void setISICId(java.lang.String isicId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISICID$2);
                }
                target.setStringValue(isicId);
            }
        }
        
        /**
         * Sets (as xml) the "ISICId" element
         */
        public void xsetISICId(org.apache.xmlbeans.XmlString isicId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISICID$2);
                }
                target.set(isicId);
            }
        }
        
        /**
         * Gets the "ISICType" element
         */
        public com.scb.sci.customer.fm.ISICTypeDocument.ISICType getISICType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ISICTypeDocument.ISICType target = null;
                target = (com.scb.sci.customer.fm.ISICTypeDocument.ISICType)get_store().find_element_user(ISICTYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ISICType" element
         */
        public void setISICType(com.scb.sci.customer.fm.ISICTypeDocument.ISICType isicType)
        {
            generatedSetterHelperImpl(isicType, ISICTYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ISICType" element
         */
        public com.scb.sci.customer.fm.ISICTypeDocument.ISICType addNewISICType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ISICTypeDocument.ISICType target = null;
                target = (com.scb.sci.customer.fm.ISICTypeDocument.ISICType)get_store().add_element_user(ISICTYPE$4);
                return target;
            }
        }
        
        /**
         * Gets the "ISICCode" element
         */
        public com.scb.sci.customer.fm.ISICCodeDocument.ISICCode getISICCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ISICCodeDocument.ISICCode target = null;
                target = (com.scb.sci.customer.fm.ISICCodeDocument.ISICCode)get_store().find_element_user(ISICCODE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ISICCode" element
         */
        public void setISICCode(com.scb.sci.customer.fm.ISICCodeDocument.ISICCode isicCode)
        {
            generatedSetterHelperImpl(isicCode, ISICCODE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ISICCode" element
         */
        public com.scb.sci.customer.fm.ISICCodeDocument.ISICCode addNewISICCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ISICCodeDocument.ISICCode target = null;
                target = (com.scb.sci.customer.fm.ISICCodeDocument.ISICCode)get_store().add_element_user(ISICCODE$6);
                return target;
            }
        }
        
        /**
         * Gets the "UN2008IsicCode" element
         */
        public java.lang.String getUN2008IsicCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UN2008ISICCODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "UN2008IsicCode" element
         */
        public org.apache.xmlbeans.XmlString xgetUN2008IsicCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UN2008ISICCODE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "UN2008IsicCode" element
         */
        public void setUN2008IsicCode(java.lang.String un2008IsicCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UN2008ISICCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UN2008ISICCODE$8);
                }
                target.setStringValue(un2008IsicCode);
            }
        }
        
        /**
         * Sets (as xml) the "UN2008IsicCode" element
         */
        public void xsetUN2008IsicCode(org.apache.xmlbeans.XmlString un2008IsicCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UN2008ISICCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UN2008ISICCODE$8);
                }
                target.set(un2008IsicCode);
            }
        }
        
        /**
         * Gets the "UN2008IsicDescription" element
         */
        public java.lang.String getUN2008IsicDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UN2008ISICDESCRIPTION$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "UN2008IsicDescription" element
         */
        public org.apache.xmlbeans.XmlString xgetUN2008IsicDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UN2008ISICDESCRIPTION$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "UN2008IsicDescription" element
         */
        public void setUN2008IsicDescription(java.lang.String un2008IsicDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UN2008ISICDESCRIPTION$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UN2008ISICDESCRIPTION$10);
                }
                target.setStringValue(un2008IsicDescription);
            }
        }
        
        /**
         * Sets (as xml) the "UN2008IsicDescription" element
         */
        public void xsetUN2008IsicDescription(org.apache.xmlbeans.XmlString un2008IsicDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UN2008ISICDESCRIPTION$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UN2008ISICDESCRIPTION$10);
                }
                target.set(un2008IsicDescription);
            }
        }
        
        /**
         * Gets the "ISICEffectiveDate" element
         */
        public java.lang.String getISICEffectiveDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICEFFECTIVEDATE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ISICEffectiveDate" element
         */
        public org.apache.xmlbeans.XmlString xgetISICEffectiveDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICEFFECTIVEDATE$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ISICEffectiveDate" element
         */
        public void setISICEffectiveDate(java.lang.String isicEffectiveDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICEFFECTIVEDATE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISICEFFECTIVEDATE$12);
                }
                target.setStringValue(isicEffectiveDate);
            }
        }
        
        /**
         * Sets (as xml) the "ISICEffectiveDate" element
         */
        public void xsetISICEffectiveDate(org.apache.xmlbeans.XmlString isicEffectiveDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICEFFECTIVEDATE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISICEFFECTIVEDATE$12);
                }
                target.set(isicEffectiveDate);
            }
        }
        
        /**
         * Gets the "ISICWeightage" element
         */
        public java.lang.String getISICWeightage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICWEIGHTAGE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ISICWeightage" element
         */
        public org.apache.xmlbeans.XmlString xgetISICWeightage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICWEIGHTAGE$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ISICWeightage" element
         */
        public void setISICWeightage(java.lang.String isicWeightage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISICWEIGHTAGE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISICWEIGHTAGE$14);
                }
                target.setStringValue(isicWeightage);
            }
        }
        
        /**
         * Sets (as xml) the "ISICWeightage" element
         */
        public void xsetISICWeightage(org.apache.xmlbeans.XmlString isicWeightage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISICWEIGHTAGE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISICWEIGHTAGE$14);
                }
                target.set(isicWeightage);
            }
        }
        
        /**
         * Gets the "updateStatusIndicator" element
         */
        public java.lang.String getUpdateStatusIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "updateStatusIndicator" element
         */
        public org.apache.xmlbeans.XmlString xgetUpdateStatusIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "updateStatusIndicator" element
         */
        public void setUpdateStatusIndicator(java.lang.String updateStatusIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$16);
                }
                target.setStringValue(updateStatusIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "updateStatusIndicator" element
         */
        public void xsetUpdateStatusIndicator(org.apache.xmlbeans.XmlString updateStatusIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$16);
                }
                target.set(updateStatusIndicator);
            }
        }
        
        /**
         * Gets the "changeIndicator" element
         */
        public java.lang.String getChangeIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "changeIndicator" element
         */
        public org.apache.xmlbeans.XmlString xgetChangeIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "changeIndicator" element
         */
        public void setChangeIndicator(java.lang.String changeIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$18);
                }
                target.setStringValue(changeIndicator);
            }
        }
        
        /**
         * Sets (as xml) the "changeIndicator" element
         */
        public void xsetChangeIndicator(org.apache.xmlbeans.XmlString changeIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$18);
                }
                target.set(changeIndicator);
            }
        }
    }
}
