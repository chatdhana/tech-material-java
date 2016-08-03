/*
 * An XML document type.
 * Localname: fmDetails
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.FmDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one fmDetails(@) element.
 *
 * This is a complex type.
 */
public class FmDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FmDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMDETAILS$0 = 
        new javax.xml.namespace.QName("", "fmDetails");
    
    
    /**
     * Gets the "fmDetails" element
     */
    public com.scb.sci.customer.fm.FmDetailsDocument.FmDetails getFmDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmDetailsDocument.FmDetails target = null;
            target = (com.scb.sci.customer.fm.FmDetailsDocument.FmDetails)get_store().find_element_user(FMDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fmDetails" element
     */
    public void setFmDetails(com.scb.sci.customer.fm.FmDetailsDocument.FmDetails fmDetails)
    {
        generatedSetterHelperImpl(fmDetails, FMDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fmDetails" element
     */
    public com.scb.sci.customer.fm.FmDetailsDocument.FmDetails addNewFmDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.FmDetailsDocument.FmDetails target = null;
            target = (com.scb.sci.customer.fm.FmDetailsDocument.FmDetails)get_store().add_element_user(FMDETAILS$0);
            return target;
        }
    }
    /**
     * An XML fmDetails(@).
     *
     * This is a complex type.
     */
    public static class FmDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.FmDetailsDocument.FmDetails
    {
        private static final long serialVersionUID = 1L;
        
        public FmDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FMGLOBALINFO$0 = 
            new javax.xml.namespace.QName("", "fmGlobalInfo");
        private static final javax.xml.namespace.QName FMACCOUNTINFO$2 = 
            new javax.xml.namespace.QName("", "fmAccountInfo");
        
        
        /**
         * Gets the "fmGlobalInfo" element
         */
        public com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo getFmGlobalInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo target = null;
                target = (com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo)get_store().find_element_user(FMGLOBALINFO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fmGlobalInfo" element
         */
        public void setFmGlobalInfo(com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo fmGlobalInfo)
        {
            generatedSetterHelperImpl(fmGlobalInfo, FMGLOBALINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmGlobalInfo" element
         */
        public com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo addNewFmGlobalInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo target = null;
                target = (com.scb.sci.customer.fm.FmGlobalInfoDocument.FmGlobalInfo)get_store().add_element_user(FMGLOBALINFO$0);
                return target;
            }
        }
        
        /**
         * Gets the "fmAccountInfo" element
         */
        public com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo getFmAccountInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo target = null;
                target = (com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo)get_store().find_element_user(FMACCOUNTINFO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fmAccountInfo" element
         */
        public void setFmAccountInfo(com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo fmAccountInfo)
        {
            generatedSetterHelperImpl(fmAccountInfo, FMACCOUNTINFO$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fmAccountInfo" element
         */
        public com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo addNewFmAccountInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo target = null;
                target = (com.scb.sci.customer.fm.FmAccountInfoDocument.FmAccountInfo)get_store().add_element_user(FMACCOUNTINFO$2);
                return target;
            }
        }
    }
}
