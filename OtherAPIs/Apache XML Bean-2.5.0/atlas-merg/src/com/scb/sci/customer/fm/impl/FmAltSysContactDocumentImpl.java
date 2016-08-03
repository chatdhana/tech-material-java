/*
 * An XML document type.
 * Localname: fmAltSysContact
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmAltSysContactDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmAltSysContact(@) element.
 *
 * This is a complex type.
 */
public class FmAltSysContactDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAltSysContactDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmAltSysContactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMALTSYSCONTACT$0 = 
        new javax.xml.namespace.QName("", "fmAltSysContact");
    
    
    /**
     * Gets the "fmAltSysContact" element
     */
    public com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact getFmAltSysContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact target = null;
            target = (com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact)get_store().find_element_user(FMALTSYSCONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmAltSysContact" element
     */
    public void setFmAltSysContact(com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact fmAltSysContact)
    {
        generatedSetterHelperImpl(fmAltSysContact, FMALTSYSCONTACT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmAltSysContact" element
     */
    public com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact addNewFmAltSysContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact target = null;
            target = (com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact)get_store().add_element_user(FMALTSYSCONTACT$0);
            return target;
        }
    }
    /**
     * An XML fmAltSysContact(@).
     *
     * This is a complex type.
     */
    public static class FmAltSysContactImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmAltSysContactDocument.FmAltSysContact
    {
        private static final long serialVersionUID = 1L;
        
        public FmAltSysContactImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName SUBPROFILEID$2 = 
            new javax.xml.namespace.QName("", "subProfileId");
        private static final javax.xml.namespace.QName FMID$4 = 
            new javax.xml.namespace.QName("", "fmId");
        private static final javax.xml.namespace.QName FMSYSCONTID$6 = 
            new javax.xml.namespace.QName("", "fmSysContId");
        private static final javax.xml.namespace.QName FMALTSYSCONTSYSGENID$8 = 
            new javax.xml.namespace.QName("", "fmAltSysContSysGenId");
        private static final javax.xml.namespace.QName SCBFMID$10 = 
            new javax.xml.namespace.QName("", "scbFmId");
        private static final javax.xml.namespace.QName PRODUCT$12 = 
            new javax.xml.namespace.QName("", "product");
        private static final javax.xml.namespace.QName PRODUCTTYPE$14 = 
            new javax.xml.namespace.QName("", "productType");
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
         * Gets the "fmSysContId" element
         */
        public java.lang.String getFmSysContId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMSYSCONTID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmSysContId" element
         */
        public org.apache.xmlbeans.XmlString xgetFmSysContId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMSYSCONTID$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmSysContId" element
         */
        public void setFmSysContId(java.lang.String fmSysContId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMSYSCONTID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMSYSCONTID$6);
                }
                target.setStringValue(fmSysContId);
            }
        }
        
        /**
         * Sets (as xml) the "fmSysContId" element
         */
        public void xsetFmSysContId(org.apache.xmlbeans.XmlString fmSysContId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMSYSCONTID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMSYSCONTID$6);
                }
                target.set(fmSysContId);
            }
        }
        
        /**
         * Gets the "fmAltSysContSysGenId" element
         */
        public java.lang.String getFmAltSysContSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMALTSYSCONTSYSGENID$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fmAltSysContSysGenId" element
         */
        public org.apache.xmlbeans.XmlString xgetFmAltSysContSysGenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMALTSYSCONTSYSGENID$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fmAltSysContSysGenId" element
         */
        public void setFmAltSysContSysGenId(java.lang.String fmAltSysContSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FMALTSYSCONTSYSGENID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FMALTSYSCONTSYSGENID$8);
                }
                target.setStringValue(fmAltSysContSysGenId);
            }
        }
        
        /**
         * Sets (as xml) the "fmAltSysContSysGenId" element
         */
        public void xsetFmAltSysContSysGenId(org.apache.xmlbeans.XmlString fmAltSysContSysGenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FMALTSYSCONTSYSGENID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FMALTSYSCONTSYSGENID$8);
                }
                target.set(fmAltSysContSysGenId);
            }
        }
        
        /**
         * Gets the "scbFmId" element
         */
        public java.lang.String getScbFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBFMID$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "scbFmId" element
         */
        public org.apache.xmlbeans.XmlString xgetScbFmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBFMID$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "scbFmId" element
         */
        public void setScbFmId(java.lang.String scbFmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCBFMID$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCBFMID$10);
                }
                target.setStringValue(scbFmId);
            }
        }
        
        /**
         * Sets (as xml) the "scbFmId" element
         */
        public void xsetScbFmId(org.apache.xmlbeans.XmlString scbFmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCBFMID$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCBFMID$10);
                }
                target.set(scbFmId);
            }
        }
        
        /**
         * Gets the "product" element
         */
        public com.scb.sci.customer.fm.ProductDocument.Product getProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ProductDocument.Product target = null;
                target = (com.scb.sci.customer.fm.ProductDocument.Product)get_store().find_element_user(PRODUCT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "product" element
         */
        public void setProduct(com.scb.sci.customer.fm.ProductDocument.Product product)
        {
            generatedSetterHelperImpl(product, PRODUCT$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "product" element
         */
        public com.scb.sci.customer.fm.ProductDocument.Product addNewProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ProductDocument.Product target = null;
                target = (com.scb.sci.customer.fm.ProductDocument.Product)get_store().add_element_user(PRODUCT$12);
                return target;
            }
        }
        
        /**
         * Gets the "productType" element
         */
        public com.scb.sci.customer.fm.ProductTypeDocument.ProductType getProductType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ProductTypeDocument.ProductType target = null;
                target = (com.scb.sci.customer.fm.ProductTypeDocument.ProductType)get_store().find_element_user(PRODUCTTYPE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "productType" element
         */
        public void setProductType(com.scb.sci.customer.fm.ProductTypeDocument.ProductType productType)
        {
            generatedSetterHelperImpl(productType, PRODUCTTYPE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "productType" element
         */
        public com.scb.sci.customer.fm.ProductTypeDocument.ProductType addNewProductType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.ProductTypeDocument.ProductType target = null;
                target = (com.scb.sci.customer.fm.ProductTypeDocument.ProductType)get_store().add_element_user(PRODUCTTYPE$14);
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
