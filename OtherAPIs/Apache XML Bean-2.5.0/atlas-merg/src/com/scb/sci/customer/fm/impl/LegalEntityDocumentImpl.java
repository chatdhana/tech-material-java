/*
 * An XML document type.
 * Localname: legalEntity
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.LegalEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one legalEntity(@) element.
 *
 * This is a complex type.
 */
public class LegalEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.LegalEntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public LegalEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEGALENTITY$0 = 
        new javax.xml.namespace.QName("", "legalEntity");
    
    
    /**
     * Gets the "legalEntity" element
     */
    public com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity getLegalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity target = null;
            target = (com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity)get_store().find_element_user(LEGALENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "legalEntity" element
     */
    public void setLegalEntity(com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity legalEntity)
    {
        generatedSetterHelperImpl(legalEntity, LEGALENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "legalEntity" element
     */
    public com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity addNewLegalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity target = null;
            target = (com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity)get_store().add_element_user(LEGALENTITY$0);
            return target;
        }
    }
    /**
     * An XML legalEntity(@).
     *
     * This is a complex type.
     */
    public static class LegalEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.LegalEntityDocument.LegalEntity
    {
        private static final long serialVersionUID = 1L;
        
        public LegalEntityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MAINPROFILEDETAILS$0 = 
            new javax.xml.namespace.QName("", "mainProfileDetails");
        private static final javax.xml.namespace.QName SUBPROFILEDETAILS$2 = 
            new javax.xml.namespace.QName("", "subProfileDetails");
        private static final javax.xml.namespace.QName FMDETAILS$4 = 
            new javax.xml.namespace.QName("", "fmDetails");
        
        
        /**
         * Gets the "mainProfileDetails" element
         */
        public com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails getMainProfileDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails target = null;
                target = (com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails)get_store().find_element_user(MAINPROFILEDETAILS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "mainProfileDetails" element
         */
        public void setMainProfileDetails(com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails mainProfileDetails)
        {
            generatedSetterHelperImpl(mainProfileDetails, MAINPROFILEDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "mainProfileDetails" element
         */
        public com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails addNewMainProfileDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails target = null;
                target = (com.scb.sci.customer.fm.MainProfileDetailsDocument.MainProfileDetails)get_store().add_element_user(MAINPROFILEDETAILS$0);
                return target;
            }
        }
        
        /**
         * Gets the "subProfileDetails" element
         */
        public com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails getSubProfileDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails target = null;
                target = (com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails)get_store().find_element_user(SUBPROFILEDETAILS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "subProfileDetails" element
         */
        public void setSubProfileDetails(com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails subProfileDetails)
        {
            generatedSetterHelperImpl(subProfileDetails, SUBPROFILEDETAILS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "subProfileDetails" element
         */
        public com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails addNewSubProfileDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails target = null;
                target = (com.scb.sci.customer.fm.SubProfileDetailsDocument.SubProfileDetails)get_store().add_element_user(SUBPROFILEDETAILS$2);
                return target;
            }
        }
        
        /**
         * Gets the "fmDetails" element
         */
        public com.scb.sci.customer.fm.FmDetailsDocument.FmDetails getFmDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.FmDetailsDocument.FmDetails target = null;
                target = (com.scb.sci.customer.fm.FmDetailsDocument.FmDetails)get_store().find_element_user(FMDETAILS$4, 0);
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
            generatedSetterHelperImpl(fmDetails, FMDETAILS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (com.scb.sci.customer.fm.FmDetailsDocument.FmDetails)get_store().add_element_user(FMDETAILS$4);
                return target;
            }
        }
    }
}
