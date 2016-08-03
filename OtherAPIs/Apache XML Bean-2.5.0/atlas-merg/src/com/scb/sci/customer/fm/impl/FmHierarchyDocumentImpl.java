/*
 * An XML document type.
 * Localname: fmHierarchy
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmHierarchyDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmHierarchy(@) element.
 *
 * This is a complex type.
 */
public class FmHierarchyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmHierarchyDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmHierarchyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMHIERARCHY$0 = 
        new javax.xml.namespace.QName("", "fmHierarchy");
    
    
    /**
     * Gets the "fmHierarchy" element
     */
    public com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy getFmHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy target = null;
            target = (com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy)get_store().find_element_user(FMHIERARCHY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmHierarchy" element
     */
    public void setFmHierarchy(com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy fmHierarchy)
    {
        generatedSetterHelperImpl(fmHierarchy, FMHIERARCHY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmHierarchy" element
     */
    public com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy addNewFmHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy target = null;
            target = (com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy)get_store().add_element_user(FMHIERARCHY$0);
            return target;
        }
    }
    /**
     * An XML fmHierarchy(@).
     *
     * This is a complex type.
     */
    public static class FmHierarchyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmHierarchyDocument.FmHierarchy
    {
        private static final long serialVersionUID = 1L;
        
        public FmHierarchyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName FMID$4 = 
            new javax.xml.namespace.QName("", "fmId");
        private static final javax.xml.namespace.QName FMHRYSYSGENID$6 = 
            new javax.xml.namespace.QName("", "fmHrySysGenId");
        private static final javax.xml.namespace.QName PARENTFMID$8 = 
            new javax.xml.namespace.QName("", "parentFmId");
        private static final javax.xml.namespace.QName HIERARCHYTYPE$10 = 
            new javax.xml.namespace.QName("", "hierarchyType");
        private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$12 = 
            new javax.xml.namespace.QName("", "updateStatusIndicator");
        private static final javax.xml.namespace.QName CHANGEINDICATOR$14 = 
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
         * Gets the "fmHrySysGenId" element
         */
        public java.lang.String getFmHrySysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMHRYSYSGENID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmHrySysGenId" element
         */
        public org.apache.xmlbeans.XmlString xgetFmHrySysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMHRYSYSGENID$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmHrySysGenId" element
         */
        public void setFmHrySysGenId(java.lang.String fmHrySysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMHRYSYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMHRYSYSGENID$6);
                }
                target.setStringValue(fmHrySysGenId);
            }
        }
        
        /**
         * Sets (as xml) the "fmHrySysGenId" element
         */
        public void xsetFmHrySysGenId(org.apache.xmlbeans.XmlString fmHrySysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMHRYSYSGENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMHRYSYSGENID$6);
                }
                target.set(fmHrySysGenId);
            }
        }
        
        /**
         * Gets the "parentFmId" element
         */
        public java.lang.String getParentFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTFMID$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parentFmId" element
         */
        public org.apache.xmlbeans.XmlString xgetParentFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTFMID$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "parentFmId" element
         */
        public void setParentFmId(java.lang.String parentFmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTFMID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTFMID$8);
                }
                target.setStringValue(parentFmId);
            }
        }
        
        /**
         * Sets (as xml) the "parentFmId" element
         */
        public void xsetParentFmId(org.apache.xmlbeans.XmlString parentFmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTFMID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTFMID$8);
                }
                target.set(parentFmId);
            }
        }
        
        /**
         * Gets the "hierarchyType" element
         */
        public com.scb.sci.customer.fm.HierarchyTypeDocument.HierarchyType getHierarchyType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.HierarchyTypeDocument.HierarchyType target = null;
                target = (com.scb.sci.customer.fm.HierarchyTypeDocument.HierarchyType)get_store().find_element_user(HIERARCHYTYPE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "hierarchyType" element
         */
        public void setHierarchyType(com.scb.sci.customer.fm.HierarchyTypeDocument.HierarchyType hierarchyType)
        {
            generatedSetterHelperImpl(hierarchyType, HIERARCHYTYPE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "hierarchyType" element
         */
        public com.scb.sci.customer.fm.HierarchyTypeDocument.HierarchyType addNewHierarchyType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.HierarchyTypeDocument.HierarchyType target = null;
                target = (com.scb.sci.customer.fm.HierarchyTypeDocument.HierarchyType)get_store().add_element_user(HIERARCHYTYPE$10);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$12, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$12, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$14, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$14, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$14);
                }
                target.set(changeIndicator);
            }
        }
    }
}
