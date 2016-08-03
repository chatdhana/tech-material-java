/*
 * An XML document type.
 * Localname: knowYourCustomer
 * Namespace: 
 * Java type: com.scb.sci.customer.fm.KnowYourCustomerDocument
 *
 * Automatically generated - do not modify.
 */
package com.scb.sci.customer.fm.impl;
/**
 * A document containing one knowYourCustomer(@) element.
 *
 * This is a complex type.
 */
public class KnowYourCustomerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.KnowYourCustomerDocument
{
    private static final long serialVersionUID = 1L;
    
    public KnowYourCustomerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KNOWYOURCUSTOMER$0 = 
        new javax.xml.namespace.QName("", "knowYourCustomer");
    
    
    /**
     * Gets the "knowYourCustomer" element
     */
    public com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer getKnowYourCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer target = null;
            target = (com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer)get_store().find_element_user(KNOWYOURCUSTOMER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "knowYourCustomer" element
     */
    public void setKnowYourCustomer(com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer knowYourCustomer)
    {
        generatedSetterHelperImpl(knowYourCustomer, KNOWYOURCUSTOMER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "knowYourCustomer" element
     */
    public com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer addNewKnowYourCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer target = null;
            target = (com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer)get_store().add_element_user(KNOWYOURCUSTOMER$0);
            return target;
        }
    }
    /**
     * An XML knowYourCustomer(@).
     *
     * This is a complex type.
     */
    public static class KnowYourCustomerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.scb.sci.customer.fm.KnowYourCustomerDocument.KnowYourCustomer
    {
        private static final long serialVersionUID = 1L;
        
        public KnowYourCustomerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEID$0 = 
            new javax.xml.namespace.QName("", "leId");
        private static final javax.xml.namespace.QName KYCID$2 = 
            new javax.xml.namespace.QName("", "KYCid");
        private static final javax.xml.namespace.QName DOCUMENTORIGINATINGLOCATION$4 = 
            new javax.xml.namespace.QName("", "documentOriginatingLocation");
        private static final javax.xml.namespace.QName MLRISKRATING$6 = 
            new javax.xml.namespace.QName("", "mlRiskRating");
        private static final javax.xml.namespace.QName MLLASTREVIEWDATE$8 = 
            new javax.xml.namespace.QName("", "mlLastReviewDate");
        private static final javax.xml.namespace.QName MLNEXTREVIEWDATE$10 = 
            new javax.xml.namespace.QName("", "mlNextReviewDate");
        private static final javax.xml.namespace.QName FIRSTKYCREVIEW$12 = 
            new javax.xml.namespace.QName("", "firstKYCreview");
        private static final javax.xml.namespace.QName KYCDOCUMENTSUBMITTED$14 = 
            new javax.xml.namespace.QName("", "KYCdocumentSubmitted");
        private static final javax.xml.namespace.QName GICDOCUMENTSUBMITTED$16 = 
            new javax.xml.namespace.QName("", "GICdocumentSubmitted");
        private static final javax.xml.namespace.QName EXCEPTIONALAPPROVALOBTAINED$18 = 
            new javax.xml.namespace.QName("", "exceptionalApprovalObtained");
        private static final javax.xml.namespace.QName UPDATESTATUSINDICATOR$20 = 
            new javax.xml.namespace.QName("", "updateStatusIndicator");
        private static final javax.xml.namespace.QName CHANGEINDICATOR$22 = 
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
         * Gets the "KYCid" element
         */
        public java.lang.String getKYCid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KYCID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "KYCid" element
         */
        public org.apache.xmlbeans.XmlString xgetKYCid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KYCID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "KYCid" element
         */
        public void setKYCid(java.lang.String kyCid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KYCID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KYCID$2);
                }
                target.setStringValue(kyCid);
            }
        }
        
        /**
         * Sets (as xml) the "KYCid" element
         */
        public void xsetKYCid(org.apache.xmlbeans.XmlString kyCid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KYCID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KYCID$2);
                }
                target.set(kyCid);
            }
        }
        
        /**
         * Gets the "documentOriginatingLocation" element
         */
        public com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation getDocumentOriginatingLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation target = null;
                target = (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation)get_store().find_element_user(DOCUMENTORIGINATINGLOCATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "documentOriginatingLocation" element
         */
        public void setDocumentOriginatingLocation(com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation documentOriginatingLocation)
        {
            generatedSetterHelperImpl(documentOriginatingLocation, DOCUMENTORIGINATINGLOCATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "documentOriginatingLocation" element
         */
        public com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation addNewDocumentOriginatingLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation target = null;
                target = (com.scb.sci.customer.fm.DocumentOriginatingLocationDocument.DocumentOriginatingLocation)get_store().add_element_user(DOCUMENTORIGINATINGLOCATION$4);
                return target;
            }
        }
        
        /**
         * Gets the "mlRiskRating" element
         */
        public com.scb.sci.customer.fm.MlRiskRatingDocument.MlRiskRating getMlRiskRating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.MlRiskRatingDocument.MlRiskRating target = null;
                target = (com.scb.sci.customer.fm.MlRiskRatingDocument.MlRiskRating)get_store().find_element_user(MLRISKRATING$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "mlRiskRating" element
         */
        public void setMlRiskRating(com.scb.sci.customer.fm.MlRiskRatingDocument.MlRiskRating mlRiskRating)
        {
            generatedSetterHelperImpl(mlRiskRating, MLRISKRATING$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "mlRiskRating" element
         */
        public com.scb.sci.customer.fm.MlRiskRatingDocument.MlRiskRating addNewMlRiskRating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.scb.sci.customer.fm.MlRiskRatingDocument.MlRiskRating target = null;
                target = (com.scb.sci.customer.fm.MlRiskRatingDocument.MlRiskRating)get_store().add_element_user(MLRISKRATING$6);
                return target;
            }
        }
        
        /**
         * Gets the "mlLastReviewDate" element
         */
        public java.lang.String getMlLastReviewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MLLASTREVIEWDATE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mlLastReviewDate" element
         */
        public org.apache.xmlbeans.XmlString xgetMlLastReviewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MLLASTREVIEWDATE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "mlLastReviewDate" element
         */
        public void setMlLastReviewDate(java.lang.String mlLastReviewDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MLLASTREVIEWDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MLLASTREVIEWDATE$8);
                }
                target.setStringValue(mlLastReviewDate);
            }
        }
        
        /**
         * Sets (as xml) the "mlLastReviewDate" element
         */
        public void xsetMlLastReviewDate(org.apache.xmlbeans.XmlString mlLastReviewDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MLLASTREVIEWDATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MLLASTREVIEWDATE$8);
                }
                target.set(mlLastReviewDate);
            }
        }
        
        /**
         * Gets the "mlNextReviewDate" element
         */
        public java.lang.String getMlNextReviewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MLNEXTREVIEWDATE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mlNextReviewDate" element
         */
        public org.apache.xmlbeans.XmlString xgetMlNextReviewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MLNEXTREVIEWDATE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "mlNextReviewDate" element
         */
        public void setMlNextReviewDate(java.lang.String mlNextReviewDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MLNEXTREVIEWDATE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MLNEXTREVIEWDATE$10);
                }
                target.setStringValue(mlNextReviewDate);
            }
        }
        
        /**
         * Sets (as xml) the "mlNextReviewDate" element
         */
        public void xsetMlNextReviewDate(org.apache.xmlbeans.XmlString mlNextReviewDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MLNEXTREVIEWDATE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MLNEXTREVIEWDATE$10);
                }
                target.set(mlNextReviewDate);
            }
        }
        
        /**
         * Gets the "firstKYCreview" element
         */
        public java.lang.String getFirstKYCreview()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTKYCREVIEW$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "firstKYCreview" element
         */
        public org.apache.xmlbeans.XmlString xgetFirstKYCreview()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTKYCREVIEW$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "firstKYCreview" element
         */
        public void setFirstKYCreview(java.lang.String firstKYCreview)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTKYCREVIEW$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTKYCREVIEW$12);
                }
                target.setStringValue(firstKYCreview);
            }
        }
        
        /**
         * Sets (as xml) the "firstKYCreview" element
         */
        public void xsetFirstKYCreview(org.apache.xmlbeans.XmlString firstKYCreview)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTKYCREVIEW$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRSTKYCREVIEW$12);
                }
                target.set(firstKYCreview);
            }
        }
        
        /**
         * Gets the "KYCdocumentSubmitted" element
         */
        public java.lang.String getKYCdocumentSubmitted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KYCDOCUMENTSUBMITTED$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "KYCdocumentSubmitted" element
         */
        public org.apache.xmlbeans.XmlString xgetKYCdocumentSubmitted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KYCDOCUMENTSUBMITTED$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "KYCdocumentSubmitted" element
         */
        public void setKYCdocumentSubmitted(java.lang.String kyCdocumentSubmitted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KYCDOCUMENTSUBMITTED$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KYCDOCUMENTSUBMITTED$14);
                }
                target.setStringValue(kyCdocumentSubmitted);
            }
        }
        
        /**
         * Sets (as xml) the "KYCdocumentSubmitted" element
         */
        public void xsetKYCdocumentSubmitted(org.apache.xmlbeans.XmlString kyCdocumentSubmitted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KYCDOCUMENTSUBMITTED$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KYCDOCUMENTSUBMITTED$14);
                }
                target.set(kyCdocumentSubmitted);
            }
        }
        
        /**
         * Gets the "GICdocumentSubmitted" element
         */
        public java.lang.String getGICdocumentSubmitted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GICDOCUMENTSUBMITTED$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GICdocumentSubmitted" element
         */
        public org.apache.xmlbeans.XmlString xgetGICdocumentSubmitted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GICDOCUMENTSUBMITTED$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "GICdocumentSubmitted" element
         */
        public void setGICdocumentSubmitted(java.lang.String giCdocumentSubmitted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GICDOCUMENTSUBMITTED$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GICDOCUMENTSUBMITTED$16);
                }
                target.setStringValue(giCdocumentSubmitted);
            }
        }
        
        /**
         * Sets (as xml) the "GICdocumentSubmitted" element
         */
        public void xsetGICdocumentSubmitted(org.apache.xmlbeans.XmlString giCdocumentSubmitted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GICDOCUMENTSUBMITTED$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GICDOCUMENTSUBMITTED$16);
                }
                target.set(giCdocumentSubmitted);
            }
        }
        
        /**
         * Gets the "exceptionalApprovalObtained" element
         */
        public java.lang.String getExceptionalApprovalObtained()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCEPTIONALAPPROVALOBTAINED$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "exceptionalApprovalObtained" element
         */
        public org.apache.xmlbeans.XmlString xgetExceptionalApprovalObtained()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCEPTIONALAPPROVALOBTAINED$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "exceptionalApprovalObtained" element
         */
        public void setExceptionalApprovalObtained(java.lang.String exceptionalApprovalObtained)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCEPTIONALAPPROVALOBTAINED$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCEPTIONALAPPROVALOBTAINED$18);
                }
                target.setStringValue(exceptionalApprovalObtained);
            }
        }
        
        /**
         * Sets (as xml) the "exceptionalApprovalObtained" element
         */
        public void xsetExceptionalApprovalObtained(org.apache.xmlbeans.XmlString exceptionalApprovalObtained)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCEPTIONALAPPROVALOBTAINED$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXCEPTIONALAPPROVALOBTAINED$18);
                }
                target.set(exceptionalApprovalObtained);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$20, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$20, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSINDICATOR$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSINDICATOR$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATESTATUSINDICATOR$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATESTATUSINDICATOR$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$22, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$22, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEINDICATOR$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEINDICATOR$22);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANGEINDICATOR$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANGEINDICATOR$22);
                }
                target.set(changeIndicator);
            }
        }
    }
}
