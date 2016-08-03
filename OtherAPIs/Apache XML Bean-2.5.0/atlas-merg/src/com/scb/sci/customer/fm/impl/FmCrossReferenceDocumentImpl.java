/*
 * An XML document type.
 * Localname: fmCrossReference
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmCrossReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmCrossReference(@) element.
 *
 * This is a complex type.
 */
public class FmCrossReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmCrossReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmCrossReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMCROSSREFERENCE$0 = 
        new javax.xml.namespace.QName("", "fmCrossReference");
    
    
    /**
     * Gets the "fmCrossReference" element
     */
    public com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference getFmCrossReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference target = null;
            target = (com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference)get_store().find_element_user(FMCROSSREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmCrossReference" element
     */
    public void setFmCrossReference(com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference fmCrossReference)
    {
        generatedSetterHelperImpl(fmCrossReference, FMCROSSREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmCrossReference" element
     */
    public com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference addNewFmCrossReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference target = null;
            target = (com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference)get_store().add_element_user(FMCROSSREFERENCE$0);
            return target;
        }
    }
    /**
     * An XML fmCrossReference(@).
     *
     * This is a complex type.
     */
    public static class FmCrossReferenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmCrossReferenceDocument.FmCrossReference
    {
        private static final long serialVersionUID = 1L;
        
        public FmCrossReferenceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName FMID$4 = 
            new javax.xml.namespace.QName("", "fmId");
        private static final javax.xml.namespace.QName FMXREFSYSGENID$6 = 
            new javax.xml.namespace.QName("", "fmXrefSysGenId");
        private static final javax.xml.namespace.QName XREFLOCATION$8 = 
            new javax.xml.namespace.QName("", "xrefLocation");
        private static final javax.xml.namespace.QName XREFSYSTEM$10 = 
            new javax.xml.namespace.QName("", "xrefSystem");
        private static final javax.xml.namespace.QName XREFEXTERNALID$12 = 
            new javax.xml.namespace.QName("", "xrefExternalId");
        private static final javax.xml.namespace.QName IMMSMNEMONIC$14 = 
            new javax.xml.namespace.QName("", "immsMnemonic");
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
         * Gets the "fmId" element
         */
        public java.lang.String getFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmId" element
         */
        public org.apache.xmlbeans.XmlString xgetFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmId" element
         */
        public void setFmId(java.lang.String fmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMID$4);
                }
                target.setStringValue(fmId);
            }
        }
        
        /**
         * Sets (as xml) the "fmId" element
         */
        public void xsetFmId(org.apache.xmlbeans.XmlString fmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMID$4);
                }
                target.set(fmId);
            }
        }
        
        /**
         * Gets the "fmXrefSysGenId" element
         */
        public java.lang.String getFmXrefSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMXREFSYSGENID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmXrefSysGenId" element
         */
        public org.apache.xmlbeans.XmlString xgetFmXrefSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMXREFSYSGENID$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmXrefSysGenId" element
         */
        public void setFmXrefSysGenId(java.lang.String fmXrefSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMXREFSYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMXREFSYSGENID$6);
                }
                target.setStringValue(fmXrefSysGenId);
            }
        }
        
        /**
         * Sets (as xml) the "fmXrefSysGenId" element
         */
        public void xsetFmXrefSysGenId(org.apache.xmlbeans.XmlString fmXrefSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMXREFSYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMXREFSYSGENID$6);
                }
                target.set(fmXrefSysGenId);
            }
        }
        
        /**
         * Gets the "xrefLocation" element
         */
        public java.lang.String getXrefLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XREFLOCATION$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "xrefLocation" element
         */
        public org.apache.xmlbeans.XmlString xgetXrefLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XREFLOCATION$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "xrefLocation" element
         */
        public void setXrefLocation(java.lang.String xrefLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XREFLOCATION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XREFLOCATION$8);
                }
                target.setStringValue(xrefLocation);
            }
        }
        
        /**
         * Sets (as xml) the "xrefLocation" element
         */
        public void xsetXrefLocation(org.apache.xmlbeans.XmlString xrefLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XREFLOCATION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XREFLOCATION$8);
                }
                target.set(xrefLocation);
            }
        }
        
        /**
         * Gets the "xrefSystem" element
         */
        public java.lang.String getXrefSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XREFSYSTEM$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "xrefSystem" element
         */
        public org.apache.xmlbeans.XmlString xgetXrefSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XREFSYSTEM$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "xrefSystem" element
         */
        public void setXrefSystem(java.lang.String xrefSystem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XREFSYSTEM$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XREFSYSTEM$10);
                }
                target.setStringValue(xrefSystem);
            }
        }
        
        /**
         * Sets (as xml) the "xrefSystem" element
         */
        public void xsetXrefSystem(org.apache.xmlbeans.XmlString xrefSystem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XREFSYSTEM$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XREFSYSTEM$10);
                }
                target.set(xrefSystem);
            }
        }
        
        /**
         * Gets the "xrefExternalId" element
         */
        public java.lang.String getXrefExternalId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XREFEXTERNALID$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "xrefExternalId" element
         */
        public org.apache.xmlbeans.XmlString xgetXrefExternalId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XREFEXTERNALID$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "xrefExternalId" element
         */
        public void setXrefExternalId(java.lang.String xrefExternalId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XREFEXTERNALID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XREFEXTERNALID$12);
                }
                target.setStringValue(xrefExternalId);
            }
        }
        
        /**
         * Sets (as xml) the "xrefExternalId" element
         */
        public void xsetXrefExternalId(org.apache.xmlbeans.XmlString xrefExternalId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XREFEXTERNALID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XREFEXTERNALID$12);
                }
                target.set(xrefExternalId);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMMSMNEMONIC$14, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMMSMNEMONIC$14, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMMSMNEMONIC$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMMSMNEMONIC$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMMSMNEMONIC$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMMSMNEMONIC$14);
                }
                target.set(immsMnemonic);
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
